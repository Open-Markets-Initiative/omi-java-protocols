# Astana International Exchange Genium Inet Itch v3.0

Generated Java parser for Aix Genium Inet Itch v3.0.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Astana International Exchange](..).

## Usage

Gradle project `:aix-aixmarket-geniuminet-itch-v3-0` builds package `omi.aix.aixmarket.geniuminet.itch.v3_0`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.aix.aixmarket.geniuminet.itch.v3_0.messages.application.AddOrderMessage;

AddOrderMessage message = new AddOrderMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.aix.aixmarket.geniuminet.itch.v3_0.dispatch.ClientPacketStream;
import omi.aix.aixmarket.geniuminet.itch.v3_0.types.Message;

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
| `AddOrderMessage` | `messages.application` | `'A'` | 44 |
| `DebugPacket` | `messages.session` | `'+'` | 0 |
| `EquilibriumPriceUpdateMessage` | `messages.application` | `'Z'` | 52 |
| `LoginAcceptedPacket` | `messages.session` | `'A'` | 30 |
| `LoginRejectedPacket` | `messages.session` | `'J'` | 1 |
| `LoginRequestPacket` | `messages.session` | `'L'` | 46 |
| `OrderBookDirectoryMessage` | `messages.application` | `'R'` | 129 |
| `OrderBookFlushMessage` | `messages.application` | `'Y'` | 8 |
| `OrderBookStateMessage` | `messages.application` | `'O'` | 28 |
| `OrderDeleteMessage` | `messages.application` | `'D'` | 17 |
| `OrderExecutedMessage` | `messages.application` | `'E'` | 51 |
| `OrderExecutedWithPriceMessage` | `messages.application` | `'C'` | 57 |
| `SecondsMessage` | `messages.application` | `'T'` | 4 |
| `SequencedDataPacket` | `messages.session` | `'S'` | 1 |
| `ShortSellStatusMessage` | `messages.application` | `'V'` | 9 |
| `SystemEventMessage` | `messages.application` | `'S'` | 5 |
| `TickSizeTableEntryMessage` | `messages.application` | `'L'` | 24 |
| `TradeMessage` | `messages.application` | `'P'` | 49 |
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
gradle :aix-aixmarket-geniuminet-itch-v3-0:build
```

Run the round trip alone:

```
gradle :aix-aixmarket-geniuminet-itch-v3-0:roundTrip
```

