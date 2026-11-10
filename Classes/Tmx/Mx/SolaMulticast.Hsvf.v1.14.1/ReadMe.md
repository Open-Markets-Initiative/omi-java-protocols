# TMX Group Sola Multicast Hsvf v1.14.1

Generated Java parser for Tmx Sola Multicast Hsvf v1.14.1.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Montreal Exchange](..).

## Usage

Gradle project `:tmx-mx-solamulticast-hsvf-v1-14-1` builds package `omi.tmx.mx.solamulticast.hsvf.v1_14_1`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.BeginningOfFutureOptionsSummaryMessage;

BeginningOfFutureOptionsSummaryMessage message = new BeginningOfFutureOptionsSummaryMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.dispatch.PacketDecoder;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Message;

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
| `BeginningOfFutureOptionsSummaryMessage` | `messages.application` |  | 1 |
| `BeginningOfFuturesSummaryMessage` | `messages.application` |  | 1 |
| `BeginningOfOptionsSummaryMessage` | `messages.application` |  | 1 |
| `BeginningOfStrategySummaryMessage` | `messages.application` |  | 1 |
| `BulletinsMessage` | `messages.application` |  | 82 |
| `CircuitAssuranceMessage` | `messages.application` |  | 6 |
| `EndOfSalesMessage` | `messages.application` |  | 7 |
| `EndOfTransmissionMessage` | `messages.application` |  | 7 |
| `FutureDeliverablesMessage` | `messages.application` |  | 14 |
| `FutureOptionsInstrumentKeysMessage` | `messages.application` |  | 147 |
| `FutureOptionsMarketDepthMessage` | `messages.application` |  | 23 |
| `FutureOptionsQuoteMessage` | `messages.application` |  | 48 |
| `FutureOptionsRequestForQuoteMessage` | `messages.application` |  | 30 |
| `FutureOptionsSummaryMessage` | `messages.application` |  | 127 |
| `FutureOptionsTradeCancellationMessage` | `messages.application` |  | 52 |
| `FutureOptionsTradeMessage` | `messages.application` |  | 61 |
| `FutureRequestForQuoteMessage` | `messages.application` |  | 21 |
| `FutureTradeCancellationMessage` | `messages.application` |  | 43 |
| `FuturesInstrumentKeysMessage` | `messages.application` |  | 149 |
| `FuturesMarketDepthMessage` | `messages.application` |  | 14 |
| `FuturesQuoteMessage` | `messages.application` |  | 39 |
| `FuturesSummaryMessage` | `messages.application` |  | 125 |
| `FuturesTradeCorrectionMessage` | `messages.application` |  | 46 |
| `FuturesTradeMessage` | `messages.application` |  | 52 |
| `GroupStatusMessage` | `messages.application` |  | 8 |
| `GroupStatusStrategiesMessage` | `messages.application` |  | 4 |
| `InstrumentScheduleNoticeFutureMessage` | `messages.application` |  | 19 |
| `InstrumentScheduleNoticeFuturesOptionMessage` | `messages.application` |  | 28 |
| `InstrumentScheduleNoticeOptionMessage` | `messages.application` |  | 27 |
| `InstrumentScheduleNoticeStrategyMessage` | `messages.application` |  | 38 |
| `OptionAuctionBeginningMessage` | `messages.application` |  | 83 |
| `OptionAuctionEndingMessage` | `messages.application` |  | 26 |
| `OptionInitialAndImprovementOrderMessage` | `messages.application` |  | 60 |
| `OptionInstrumentKeysMessage` | `messages.application` |  | 146 |
| `OptionMarketDepthMessage` | `messages.application` |  | 22 |
| `OptionQuoteMessage` | `messages.application` |  | 47 |
| `OptionRequestForQuoteMessage` | `messages.application` |  | 29 |
| `OptionSummaryMessage` | `messages.application` |  | 128 |
| `OptionTradeCancellationMessage` | `messages.application` |  | 51 |
| `OptionTradeMessage` | `messages.application` |  | 60 |
| `StartOfDayMessage` | `messages.application` |  | 9 |
| `StrategyAuctionBeginningMessage` | `messages.application` |  | 94 |
| `StrategyAuctionEndingMessage` | `messages.application` |  | 37 |
| `StrategyInitialAndImprovementOrderMessage` | `messages.application` |  | 71 |
| `StrategyInstrumentKeysMessage` | `messages.application` |  | 132 |
| `StrategyMarketDepthMessage` | `messages.application` |  | 33 |
| `StrategyQuoteMessage` | `messages.application` |  | 60 |
| `StrategyRequestForQuoteMessage` | `messages.application` |  | 40 |
| `StrategySummaryMessage` | `messages.application` |  | 113 |
| `StrategyTradeCancellationMessage` | `messages.application` |  | 62 |
| `StrategyTradeMessage` | `messages.application` |  | 72 |
| `TickTableMessage` | `messages.application` |  | 55 |
| `UnderlyingInstrumentKeysMessage` | `messages.application` |  | 39 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Tmx/Mx.SolaMulticast.Hsvf.v1.14.1` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :tmx-mx-solamulticast-hsvf-v1-14-1:build
```

Run the round trip alone:

```
gradle :tmx-mx-solamulticast-hsvf-v1-14-1:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :tmx-mx-solamulticast-hsvf-v1-14-1:captureTest -Pcapture=/path/to/capture.pcap
```

