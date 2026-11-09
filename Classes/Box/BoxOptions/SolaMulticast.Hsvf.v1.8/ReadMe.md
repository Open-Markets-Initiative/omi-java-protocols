# Box Options Market Sola Multicast Hsvf v1.8

Generated Java parser for Box Sola Multicast Hsvf v1.8.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [BOX Options Exchange](..).

## Usage

Gradle project `:box-boxoptions-solamulticast-hsvf-v1-8` builds package `omi.box.boxoptions.solamulticast.hsvf.v1_8`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.BeginningOfComplexOrderSummaryMessage;

BeginningOfComplexOrderSummaryMessage message = new BeginningOfComplexOrderSummaryMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.box.boxoptions.solamulticast.hsvf.v1_8.dispatch.PacketDecoder;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Message;

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
| `BeginningOfComplexOrderSummaryMessage` | `messages.application` |  | 1 |
| `BeginningOfOptionsSummaryMessage` | `messages.application` |  | 1 |
| `BulletinsMessage` | `messages.application` |  | 82 |
| `CircuitAssuranceMessage` | `messages.application` |  | 6 |
| `ComplexOrderImprovementProcessBeginningMessageMessage` | `messages.application` |  | 83 |
| `ComplexOrderInitialAndImprovementOrderMessage` | `messages.application` |  | 46 |
| `ComplexOrderInstrumentKeysMessage` | `messages.application` |  | 112 |
| `ComplexOrderInstrumentTradeMessage` | `messages.application` |  | 68 |
| `ComplexOrderMarketDepthMessage` | `messages.application` |  | 33 |
| `ComplexOrderMarketSheetInitialAndImprovementOrderMessage` | `messages.application` |  | 80 |
| `ComplexOrderQuoteMessage` | `messages.application` |  | 68 |
| `ComplexOrderSummaryMessage` | `messages.application` |  | 105 |
| `ComplexOrderTradeCancellationMessage` | `messages.application` |  | 60 |
| `EndOfSalesMessage` | `messages.application` |  | 7 |
| `EndOfTransmissionMessage` | `messages.application` |  | 7 |
| `GroupOpeningTimeMessage` | `messages.application` |  | 14 |
| `GroupStatusMessage` | `messages.application` |  | 8 |
| `InitialAndImprovementOrderMessage` | `messages.application` |  | 36 |
| `MarketSheetInitialAndImprovementOrderMessage` | `messages.application` |  | 69 |
| `OptionImprovementProcessBeginningMessage` | `messages.application` |  | 73 |
| `OptionInstrumentKeysMessage` | `messages.application` |  | 108 |
| `OptionMarketDepthMessage` | `messages.application` |  | 23 |
| `OptionQuoteMessage` | `messages.application` |  | 57 |
| `OptionRequestForQuoteMessage` | `messages.application` |  | 29 |
| `OptionSummaryMessage` | `messages.application` |  | 116 |
| `OptionTradeCancellationMessage` | `messages.application` |  | 57 |
| `OptionTradeMessage` | `messages.application` |  | 65 |
| `StrategiesGroupStatusMessage` | `messages.application` |  | 4 |
| `SystemTimestampMessage` | `messages.application` |  | 9 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Box/BoxOptions.SolaMulticast.Hsvf.v1.8` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :box-boxoptions-solamulticast-hsvf-v1-8:build
```

Run the round trip alone:

```
gradle :box-boxoptions-solamulticast-hsvf-v1-8:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :box-boxoptions-solamulticast-hsvf-v1-8:captureTest -Pcapture=/path/to/capture.pcap
```

