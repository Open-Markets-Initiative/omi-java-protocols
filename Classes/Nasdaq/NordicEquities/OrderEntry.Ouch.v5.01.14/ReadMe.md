# National Association of Securities Dealers Automated Quotations (Nasdaq) Nordic Ouch 5 Order Entry Ouch v5.01.14

Generated Java parser for Nasdaq Nordic Ouch 5 Order Entry Ouch v5.01.14.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nasdaq Nordic Equities](..).

## Usage

Gradle project `:nasdaq-nordicequities-orderentry-ouch-v5-01-14` builds package `omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.messages.application.AccountQueryResponseMessage;

AccountQueryResponseMessage message = new AccountQueryResponseMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.dispatch.ClientPacketStream;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.types.Message;

ClientPacketStream stream = new ClientPacketStream();
for (ClientPacketStream.Record record : stream.append(bytes, 0, bytes.length)) {
    for (Message message : record.decoded().messages()) {
        System.out.println(message);
    }
}
```

Each side of the connection has its own stream: `ClientPacketStream`, `ServerPacketStream`. A record stating a length that is not valid fails the stream, which then reads nothing more.

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `AccountQueryResponseMessage` | `messages.application` | `'Q'` | 12 |
| `BrokenTradeMessage` | `messages.application` | `'B'` | 20 |
| `CancelOrderMessage` | `messages.application` | `'X'` | 14 |
| `CancelPendingMessage` | `messages.application` | `'P'` | 13 |
| `CancelRejectedMessage` | `messages.application` | `'I'` | 14 |
| `CancelledOrderMessage` | `messages.application` | `'C'` | 17 |
| `DebugPacket` | `messages.session` | `'+'` | 0 |
| `EnterOrderMessage` | `messages.application` | `'O'` | 40 |
| `ExecutedOrderMessage` | `messages.application` | `'E'` | 34 |
| `GtcCancelledMessage` | `messages.application` | `'G'` | 22 |
| `LoginAcceptedPacket` | `messages.session` | `'A'` | 30 |
| `LoginRejectedPacket` | `messages.session` | `'J'` | 1 |
| `LoginRequestPacket` | `messages.session` | `'L'` | 46 |
| `MmiNotificationRequestMessage` | `messages.application` | `'M'` | 20 |
| `MmoRefreshRequestMessage` | `messages.application` | `'W'` | 17 |
| `OrderAcceptedMessage` | `messages.application` | `'A'` | 56 |
| `OrderReplacedMessage` | `messages.application` | `'U'` | 45 |
| `OrderRestatedMessage` | `messages.application` | `'T'` | 15 |
| `RejectedOrderMessage` | `messages.application` | `'J'` | 14 |
| `ReplaceOrderMessage` | `messages.application` | `'U'` | 24 |
| `ReplacePendingMessage` | `messages.application` | `'N'` | 17 |
| `ResponseToMmiNotificationMessage` | `messages.application` | `'R'` | 29 |
| `SequencedDataPacket` | `messages.session` | `'S'` | 1 |
| `SystemEventMessage` | `messages.application` | `'S'` | 9 |
| `UnsequencedDataPacket` | `messages.session` | `'U'` | 1 |
| `ClientHeartbeat` | `messages.session` | `'R'` | 0 |
| `LogoutRequest` | `messages.session` | `'O'` | 0 |
| `AccountQueryMessage` | `messages.application` | `'Q'` | 0 |
| `ServerHeartbeat` | `messages.session` | `'H'` | 0 |
| `EndOfSession` | `messages.session` | `'Z'` | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nasdaq-nordicequities-orderentry-ouch-v5-01-14:build
```

Run the round trip alone:

```
gradle :nasdaq-nordicequities-orderentry-ouch-v5-01-14:roundTrip
```

