# The Securities Industry Automation Corporation Input Obi v5.0.i

Generated Java parser for Siac Input Obi v5.0.i.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Options Price Reporting Authority](..).

## Usage

Gradle project `:siac-opra-input-obi-v5-0-i` builds package `omi.siac.opra.input.obi.v5_0_i`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.siac.opra.input.obi.v5_0_i.messages.application.AdministrativeMessage;

AdministrativeMessage message = new AdministrativeMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.siac.opra.input.obi.v5_0_i.dispatch.PacketStream;
import omi.siac.opra.input.obi.v5_0_i.types.Message;

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
| `AdministrativeMessage` | `messages.application` | `' '` | 7 |
| `BlockSequenceNumberStatusInquiryRequestMessage` | `messages.application` | `'L'` | 13 |
| `BlockSequenceNumberStatusResponseMessage` | `messages.application` | `'M'` | 13 |
| `ControlMessage` | `messages.application` |  | 5 |
| `EquityAndIndexEndOfDaySummaryMessage` | `messages.application` | `' '` | 65 |
| `EquityAndIndexLastSaleMessage` | `messages.application` |  | 36 |
| `LongEquityAndIndexQuoteMessage` | `messages.application` |  | 36 |
| `MessageCountStatusInquiryRequestMessage` | `messages.application` | `'R'` | 13 |
| `MessageCountStatusResponseMessage` | `messages.application` | `'S'` | 13 |
| `ShortEquityAndIndexQuoteMessage` | `messages.application` |  | 22 |
| `UnderlyingValueBidAndOfferMessage` | `messages.application` | `'I'` | 20 |
| `UnderlyingValueLastSaleMessage` | `messages.application` | `' '` | 20 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :siac-opra-input-obi-v5-0-i:build
```

Run the round trip alone:

```
gradle :siac-opra-input-obi-v5-0-i:roundTrip
```

