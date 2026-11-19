# Saudi Exchange TotalView Itch Itch v1.9

Generated Java parser for Tadawul TotalView Itch Itch v1.9.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Saudi Exchange](..).

## Usage

Gradle project `:tadawul-saudiexchange-totalview-itch-v1-9` builds package `omi.tadawul.saudiexchange.totalview.itch.v1_9`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.tadawul.saudiexchange.totalview.itch.v1_9.messages.application.AddOrderMessage;

AddOrderMessage message = new AddOrderMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.tadawul.saudiexchange.totalview.itch.v1_9.dispatch.ClientPacketStream;
import omi.tadawul.saudiexchange.totalview.itch.v1_9.types.Message;

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
| `AddOrderMessage` | `messages.application` | `'A'` | 33 |
| `DebugPacket` | `messages.session` | `'+'` | 0 |
| `IndexMemberDirectoryMessage` | `messages.application` | `'Y'` | 16 |
| `IndexValueMessage` | `messages.application` | `'Z'` | 16 |
| `IndicativePriceQuantityMessage` | `messages.application` | `'I'` | 29 |
| `LoginAcceptedPacket` | `messages.session` | `'A'` | 30 |
| `LoginRejectedPacket` | `messages.session` | `'J'` | 1 |
| `LoginRequestPacket` | `messages.session` | `'L'` | 46 |
| `OrderDeleteMessage` | `messages.application` | `'D'` | 12 |
| `OrderExecutedMessage` | `messages.application` | `'E'` | 29 |
| `OrderExecutedWithPriceMessage` | `messages.application` | `'C'` | 38 |
| `OrderReplaceMessage` | `messages.application` | `'U'` | 36 |
| `OrderbookDirectoryMessage` | `messages.application` | `'R'` | 214 |
| `OrderbookPriceMessage` | `messages.application` | `'X'` | 14 |
| `OrderbookTradingActionMessage` | `messages.application` | `'H'` | 10 |
| `PriceTickSizeMessage` | `messages.application` | `'L'` | 16 |
| `QuantityTickSizeMessage` | `messages.application` | `'M'` | 24 |
| `SequencedDataPacket` | `messages.session` | `'S'` | 1 |
| `SystemEventMessage` | `messages.application` | `'S'` | 29 |
| `TimestampSecondsMessage` | `messages.application` | `'T'` | 4 |
| `TradeMessage` | `messages.application` | `'P'` | 34 |
| `UnsequencedDataPacket` | `messages.session` | `'U'` | 1 |
| `ClientHeartbeat` | `messages.session` | `'R'` | 0 |
| `LogoutRequest` | `messages.session` | `'O'` | 0 |
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
gradle :tadawul-saudiexchange-totalview-itch-v1-9:build
```

Run the round trip alone:

```
gradle :tadawul-saudiexchange-totalview-itch-v1-9:roundTrip
```

