# Japannext Securities Proprietary Trading System Glimpse v1.3

Generated Java parser for Jnx Proprietary Trading System Glimpse v1.3.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Japannext Equities](..).

## Usage

Gradle project `:jnx-jnxequities-pts-glimpse-v1-3` builds package `omi.jnx.jnxequities.pts.glimpse.v1_3`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.jnx.jnxequities.pts.glimpse.v1_3.messages.session.DebugPacket;

DebugPacket message = new DebugPacket();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.jnx.jnxequities.pts.glimpse.v1_3.dispatch.ClientPacketStream;
import omi.jnx.jnxequities.pts.glimpse.v1_3.types.Message;

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
| `DebugPacket` | `messages.session` | `'+'` | 0 |
| `LoginAcceptedPacket` | `messages.session` | `'A'` | 30 |
| `LoginRejectedPacket` | `messages.session` | `'J'` | 1 |
| `LoginRequestPacket` | `messages.session` | `'L'` | 46 |
| `OrderAddedWithAttributesMessage` | `messages.application` | `'F'` | 34 |
| `OrderAddedWithoutAttributesMessage` | `messages.application` | `'A'` | 29 |
| `OrderDeletedMessage` | `messages.application` | `'D'` | 12 |
| `OrderExecutedMessage` | `messages.application` | `'E'` | 24 |
| `OrderReplacedMessage` | `messages.application` | `'U'` | 28 |
| `OrderbookDirectoryMessage` | `messages.application` | `'R'` | 44 |
| `PriceTickSizeMessage` | `messages.application` | `'L'` | 16 |
| `SecondsMessage` | `messages.application` | `'T'` | 4 |
| `SequencedDataPacket` | `messages.session` | `'S'` | 1 |
| `ShortSellingPriceRestrictionStateMessage` | `messages.application` | `'Y'` | 13 |
| `SystemEventMessage` | `messages.application` | `'S'` | 9 |
| `TradingStateMessage` | `messages.application` | `'H'` | 13 |
| `UnsequencedDataPacket` | `messages.session` | `'U'` | 1 |
| `ClientHeartbeatPacket` | `messages.session` | `'R'` | 0 |
| `LogoutRequestPacket` | `messages.session` | `'O'` | 0 |
| `ServerHeartbeatPacket` | `messages.session` | `'H'` | 0 |
| `EndOfSessionPacket` | `messages.session` | `'Z'` | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Jnx/JnxEquities.Pts.Glimpse.v1.3` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :jnx-jnxequities-pts-glimpse-v1-3:build
```

Run the round trip alone:

```
gradle :jnx-jnxequities-pts-glimpse-v1-3:roundTrip
```

