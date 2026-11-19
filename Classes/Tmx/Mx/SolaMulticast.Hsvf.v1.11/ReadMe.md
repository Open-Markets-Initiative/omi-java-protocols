# TMX Group Sola Multicast Hsvf v1.11

Generated Java parser for Tmx Sola Multicast Hsvf v1.11.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Montreal Exchange](..).

## Usage

Gradle project `:tmx-mx-solamulticast-hsvf-v1-11` builds package `omi.tmx.mx.solamulticast.hsvf.v1_11`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.BeginningOfFutureOptionsSummaryMessage;

BeginningOfFutureOptionsSummaryMessage message = new BeginningOfFutureOptionsSummaryMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.tmx.mx.solamulticast.hsvf.v1_11.dispatch.PacketDecoder;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Message;

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
| `FutureOptionsInstrumentKeysMessage` | `messages.application` |  | 114 |
| `FutureOptionsMarketDepthMessage` | `messages.application` |  | 23 |
| `FutureOptionsQuoteMessage` | `messages.application` |  | 47 |
| `FutureOptionsRfqMessage` | `messages.application` |  | 30 |
| `FutureOptionsSummaryMessage` | `messages.application` |  | 119 |
| `FutureOptionsTradeCancellationMessage` | `messages.application` |  | 69 |
| `FutureOptionsTradeCorrectionMessage` | `messages.application` |  | 77 |
| `FutureOptionsTradeMessage` | `messages.application` |  | 77 |
| `FuturesInstrumentKeysMessage` | `messages.application` |  | 123 |
| `FuturesMarketDepthMessage` | `messages.application` |  | 14 |
| `FuturesQuoteMessage` | `messages.application` |  | 37 |
| `FuturesRfqMessage` | `messages.application` |  | 21 |
| `FuturesSummaryMessage` | `messages.application` |  | 109 |
| `FuturesTradeCancellationMessage` | `messages.application` |  | 51 |
| `FuturesTradeCorrectionMessage` | `messages.application` |  | 59 |
| `FuturesTradeMessage` | `messages.application` |  | 59 |
| `GroupStatusMessage` | `messages.application` |  | 8 |
| `GroupStatusStrategiesMessage` | `messages.application` |  | 4 |
| `InstrumentScheduleNoticeFutureMessage` | `messages.application` |  | 19 |
| `InstrumentScheduleNoticeFuturesOptionMessage` | `messages.application` |  | 28 |
| `InstrumentScheduleNoticeOptionMessage` | `messages.application` |  | 28 |
| `InstrumentScheduleNoticeStrategyMessage` | `messages.application` |  | 38 |
| `InstrumentScheduleNoticeSwapFutureMessage` | `messages.application` |  | 27 |
| `OptionInstrumentKeysMessage` | `messages.application` |  | 127 |
| `OptionMarketDepthMessage` | `messages.application` |  | 23 |
| `OptionQuoteMessage` | `messages.application` |  | 47 |
| `OptionRfqMessage` | `messages.application` |  | 30 |
| `OptionSummaryMessage` | `messages.application` |  | 124 |
| `OptionTradeCancellationMessage` | `messages.application` |  | 68 |
| `OptionTradeCorrectionMessage` | `messages.application` |  | 76 |
| `OptionTradeMessage` | `messages.application` |  | 76 |
| `StrategyInstrumentKeysMessage` | `messages.application` |  | 108 |
| `StrategyMarketDepthMessage` | `messages.application` |  | 33 |
| `StrategyQuoteMessage` | `messages.application` |  | 58 |
| `StrategyRfqMessage` | `messages.application` |  | 40 |
| `StrategySummaryMessage` | `messages.application` |  | 108 |
| `StrategyTradeCancellationMessage` | `messages.application` |  | 71 |
| `StrategyTradeCorrectionMessage` | `messages.application` |  | 79 |
| `StrategyTradeMessage` | `messages.application` |  | 79 |
| `SwapFutureBeginningOfSummaryMessage` | `messages.application` |  | 1 |
| `SwapFutureInstrumentKeysMessage` | `messages.application` |  | 172 |
| `SwapFutureMarketDepthMessage` | `messages.application` |  | 22 |
| `SwapFutureQuoteMessage` | `messages.application` |  | 45 |
| `SwapFutureRfqMessage` | `messages.application` |  | 29 |
| `SwapFutureSummaryMessage` | `messages.application` |  | 153 |
| `SwapFutureTradeCancellationMessage` | `messages.application` |  | 53 |
| `SwapFutureTradeCorrectionMessage` | `messages.application` |  | 61 |
| `SwapFutureTradeMessage` | `messages.application` |  | 61 |
| `TickTableMessage` | `messages.application` |  | 55 |
| `TimebeatMessage` | `messages.application` |  | 9 |
| `UnderlyingInstrumentKeysMessage` | `messages.application` |  | 37 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :tmx-mx-solamulticast-hsvf-v1-11:build
```

Run the round trip alone:

```
gradle :tmx-mx-solamulticast-hsvf-v1-11:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :tmx-mx-solamulticast-hsvf-v1-11:captureTest -Pcapture=/path/to/capture.pcap
```

