# London Stock Exchange Native Trading Gateway Ntgi v21.2

Generated Java parser for Lseg Native Trading Gateway Ntgi v21.2.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Millennium Exchange](..).

## Usage

Gradle project `:lseg-millennium-nativetradinggateway-ntgi-v21-2` builds package `omi.lseg.millennium.nativetradinggateway.ntgi.v21_2`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.messages.application.BusinessRejectMessage;

BusinessRejectMessage message = new BusinessRejectMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.dispatch.PacketStream;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Message;

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
| `BusinessRejectMessage` | `messages.application` | `'j'` | 59 |
| `ExecutionReportMessage` | `messages.application` | `'8'` | 151 |
| `LogonMessage` | `messages.application` | `'A'` | 76 |
| `LogonReplyMessage` | `messages.application` | `'B'` | 34 |
| `LogoutMessage` | `messages.application` | `'5'` | 20 |
| `NewOrderMessage` | `messages.application` | `'D'` | 121 |
| `NewQuoteMessage` | `messages.application` | `'S'` | 77 |
| `OrderCancelRejectMessage` | `messages.application` | `'9'` | 59 |
| `OrderCancelReplaceRequestMessage` | `messages.application` | `'G'` | 112 |
| `OrderCancelRequestMessage` | `messages.application` | `'F'` | 69 |
| `OrderMassCancelReportMessage` | `messages.application` | `'r'` | 52 |
| `OrderMassCancelRequestMessage` | `messages.application` | `'q'` | 42 |
| `QuoteAckMessage` | `messages.application` | `'e'` | 65 |
| `QuoteRequestMessage` | `messages.application` | `'a'` | 157 |
| `QuoteRequestRejectMessage` | `messages.application` | `'b'` | 110 |
| `QuoteResponseMessage` | `messages.application` | `'f'` | 88 |
| `QuoteStatusReportMessage` | `messages.application` | `'c'` | 143 |
| `RejectMessage` | `messages.application` | `'3'` | 55 |
| `RfqExecutionReportMessage` | `messages.application` | `'g'` | 153 |
| `RfqQuoteMessage` | `messages.application` | `'d'` | 126 |
| `SystemStatusMessage` | `messages.application` | `'n'` | 2 |
| `HeartbeatMessage` | `messages.application` | `'0'` | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :lseg-millennium-nativetradinggateway-ntgi-v21-2:build
```

Run the round trip alone:

```
gradle :lseg-millennium-nativetradinggateway-ntgi-v21-2:roundTrip
```

