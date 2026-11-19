# Box Options Market Sola Unicast Hsvf v4.5.1

Generated Java parser for Box Sola Unicast Hsvf v4.5.1.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [BOX Options Exchange](..).

## Usage

Gradle project `:box-boxoptions-solaunicast-hsvf-v4-5-1` builds package `omi.box.boxoptions.solaunicast.hsvf.v4_5_1`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.box.boxoptions.solaunicast.hsvf.v4_5_1.messages.application.BeginningOfComplexOrderSummaryMessage;

BeginningOfComplexOrderSummaryMessage message = new BeginningOfComplexOrderSummaryMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.box.boxoptions.solaunicast.hsvf.v4_5_1.dispatch.PacketStream;
import omi.box.boxoptions.solaunicast.hsvf.v4_5_1.types.Message;

PacketStream stream = new PacketStream();
for (PacketStream.Record record : stream.append(bytes, 0, bytes.length)) {
    for (Message message : record.decoded().messages()) {
        System.out.println(message);
    }
}
```

A record stating a length that is not valid fails the stream, which then reads nothing more.

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `BeginningOfComplexOrderSummaryMessage` | `messages.application` |  | 1 |
| `BeginningOfOptionsSummaryMessage` | `messages.application` |  | 1 |
| `BulletinsMessage` | `messages.application` |  | 82 |
| `CircuitAssuranceMessage` | `messages.application` |  | 6 |
| `ComplexOrderGroupStatusMessage` | `messages.application` |  | 4 |
| `ComplexOrderImprovementProcessBeginningMessageMessage` | `messages.application` |  | 83 |
| `ComplexOrderInitialAndImprovementOrderMessage` | `messages.application` |  | 46 |
| `ComplexOrderInstrumentKeysMessage` | `messages.application` |  | 112 |
| `ComplexOrderInstrumentTradeMessage` | `messages.application` |  | 68 |
| `ComplexOrderMarketDepthMessage` | `messages.application` |  | 33 |
| `ComplexOrderMarketSheetInitialAndImprovementOrderMessage` | `messages.application` |  | 80 |
| `ComplexOrderQuoteMessage` | `messages.application` |  | 68 |
| `ComplexOrderSummaryMessage` | `messages.application` |  | 105 |
| `ComplexOrderTradeCancellationMessage` | `messages.application` |  | 60 |
| `ConnectionMessage` | `messages.application` |  | 21 |
| `EndOfSalesMessage` | `messages.application` |  | 7 |
| `EndOfTransmissionMessage` | `messages.application` |  | 7 |
| `GapSequenceMessage` | `messages.application` |  | 9 |
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
| `SystemTimestampMessage` | `messages.application` |  | 9 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :box-boxoptions-solaunicast-hsvf-v4-5-1:build
```

Run the round trip alone:

```
gradle :box-boxoptions-solaunicast-hsvf-v4-5-1:roundTrip
```

