# Australian Securities Exchange New Trading Platform Itch v1.05

Generated Java parser for Asx New Trading Platform Itch v1.05.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Asx Derivatives](..).

## Usage

Gradle project `:asx-asxderivatives-ntp-itch-v1-05` builds package `omi.asx.asxderivatives.ntp.itch.v1_05`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.asx.asxderivatives.ntp.itch.v1_05.messages.application.AddOrderMessage;

AddOrderMessage message = new AddOrderMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.asx.asxderivatives.ntp.itch.v1_05.dispatch.PacketDecoder;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.Message;

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
| `AddOrderMessage` | `messages.application` | `'A'` | 39 |
| `AnomalousOrderThresholdPublishMessage` | `messages.application` | `'W'` | 58 |
| `AuctionOrderExecutedMessage` | `messages.application` | `'C'` | 52 |
| `BundlesSymbolDirectory` | `messages.application` | `'m'` | 459 |
| `CombinationOrderExecutedMessage` | `messages.application` | `'e'` | 65 |
| `CombinationSymbolDirectoryMessage` | `messages.application` | `'M'` | 221 |
| `CombinationTradeExecutedMessage` | `messages.application` | `'p'` | 79 |
| `EndOfBusinessTradeDateMessage` | `messages.application` | `'S'` | 7 |
| `EquilibriumPriceMessage` | `messages.application` | `'Z'` | 42 |
| `FutureSymbolDirectoryMessage` | `messages.application` | `'f'` | 179 |
| `ImpliedOrderAddedMessage` | `messages.application` | `'j'` | 39 |
| `ImpliedOrderDeletedMessage` | `messages.application` | `'k'` | 19 |
| `ImpliedOrderReplacedMessage` | `messages.application` | `'l'` | 39 |
| `MarketSettlementMessage` | `messages.application` | `'Y'` | 54 |
| `OpenHighLowLastTradeAdjustmentMessage` | `messages.application` | `'t'` | 54 |
| `OptionsSymbolDirectoryMessage` | `messages.application` | `'h'` | 219 |
| `OrderBookStateMessage` | `messages.application` | `'O'` | 11 |
| `OrderDeletedMessage` | `messages.application` | `'D'` | 19 |
| `OrderExecutedMessage` | `messages.application` | `'E'` | 55 |
| `OrderVolumeCancelledMessage` | `messages.application` | `'X'` | 23 |
| `RequestForQuoteMessage` | `messages.application` | `'q'` | 15 |
| `SecondsMessage` | `messages.application` | `'T'` | 4 |
| `TextMessage` | `messages.application` | `'x'` | 112 |
| `TradeCancellationMessage` | `messages.application` | `'B'` | 18 |
| `TradeExecutedMessage` | `messages.application` | `'P'` | 45 |
| `VolumeAndOpenInterestMessage` | `messages.application` | `'V'` | 28 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :asx-asxderivatives-ntp-itch-v1-05:build
```

Run the round trip alone:

```
gradle :asx-asxderivatives-ntp-itch-v1-05:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :asx-asxderivatives-ntp-itch-v1-05:captureTest -Pcapture=/path/to/capture.pcap
```

