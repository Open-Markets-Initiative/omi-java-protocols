# Intercontinental Exchange Multicast Data Feed iMpact v1.1.33

Generated Java parser for Ice Multicast Data Feed iMpact v1.1.33.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Intercontinental Exchange Futures](..).

## Usage

Gradle project `:ice-icefutures-mdf-impact-v1-1-33` builds package `omi.ice.icefutures.mdf.impact.v1_1_33`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.ice.icefutures.mdf.impact.v1_1_33.messages.application.AddOrModifyOrderMessage;

AddOrModifyOrderMessage message = new AddOrModifyOrderMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.ice.icefutures.mdf.impact.v1_1_33.dispatch.PacketDecoder;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Message;

PacketDecoder.Decoded decoded = PacketDecoder.decode(payload, 0, payload.length);
for (Message message : decoded.messages()) {
    System.out.println(message);
}
```

`decoded.complete()` says whether every counted message lay inside the packet, and `decoded.undecoded()` counts the messages of a type this package does not decode.

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `AddOrModifyOrderMessage` | `messages.application` | `'E'` | 50 |
| `AddPriceLevelMessage` | `messages.application` | `'t'` | 34 |
| `CancelledTradeMessage` | `messages.application` | `'I'` | 36 |
| `ChangePriceLevelMessage` | `messages.application` | `'s'` | 34 |
| `ClosePriceMessage` | `messages.application` | `'c'` | 20 |
| `DeleteOrderMessage` | `messages.application` | `'F'` | 24 |
| `DeletePriceLevelMessage` | `messages.application` | `'r'` | 14 |
| `EndOfDayMarketSummaryMessage` | `messages.application` | `'u'` | 80 |
| `FixingIndicativePriceMessageMessage` | `messages.application` | `'0'` | 25 |
| `FixingLockdownMessage` | `messages.application` | `'4'` | 78 |
| `FixingTransitionMessage` | `messages.application` | `'3'` | 25 |
| `IndexPricesMessage` | `messages.application` | `'z'` | 61 |
| `IntervalPriceLimitNotificationMessage` | `messages.application` | `'V'` | 34 |
| `InvestigatedTradeMessage` | `messages.application` | `'H'` | 37 |
| `MarketEventMessage` | `messages.application` | `'f'` | 13 |
| `MarketSnapshotMessage` | `messages.application` | `'C'` | 133 |
| `MarketSnapshotOrderMessage` | `messages.application` | `'D'` | 41 |
| `MarketSnapshotPriceLevelMessage` | `messages.application` | `'m'` | 26 |
| `MarketStateChangeMessage` | `messages.application` | `'K'` | 13 |
| `MarketStatisticsMessage` | `messages.application` | `'J'` | 52 |
| `MessageBundleMarker` | `messages.application` | `'T'` | 1 |
| `NewExpiryMessage` | `messages.application` | `'R'` | 503 |
| `NewFuturesStrategyDefinitionMessage` | `messages.application` | `'9'` | 510 |
| `NewOptionsMarketDefinitionMessage` | `messages.application` | `'l'` | 322 |
| `NewOptionsStrategyDefinitionMessage` | `messages.application` | `'U'` | 122 |
| `OldStyleOptionsTradeAndMarketStatsMessage` | `messages.application` | `'W'` | 83 |
| `OpenInterestMessage` | `messages.application` | `'M'` | 30 |
| `OpenPriceMessage` | `messages.application` | `'N'` | 20 |
| `OptionOpenInterestMessage` | `messages.application` | `'v'` | 26 |
| `OptionSettlementPriceMessage` | `messages.application` | `'w'` | 53 |
| `PreOpenPriceIndicatorMessage` | `messages.application` | `'g'` | 25 |
| `RfqMessage` | `messages.application` | `'k'` | 31 |
| `SettlementPriceMessage` | `messages.application` | `'O'` | 37 |
| `SpecialFieldMessage` | `messages.application` | `'b'` | 1 |
| `SpotMarketTradeMessage` | `messages.application` | `'Y'` | 50 |
| `StripInfoMessage` | `messages.application` | `'i'` | 88 |
| `SystemTextMessage` | `messages.application` | `'L'` | 1008 |
| `TradeMessage` | `messages.application` | `'G'` | 46 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :ice-icefutures-mdf-impact-v1-1-33:build
```

Run the round trip alone:

```
gradle :ice-icefutures-mdf-impact-v1-1-33:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :ice-icefutures-mdf-impact-v1-1-33:captureTest -Pcapture=/path/to/capture.pcap
```

