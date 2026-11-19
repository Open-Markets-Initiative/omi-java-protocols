# National Association of Securities Dealers Automated Quotations (Nasdaq) Drop AsciiDrop v2.3

Generated Java parser for Nasdaq Drop AsciiDrop v2.3.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nasdaq Stock Market](..).

## Usage

Gradle project `:nasdaq-nsmequities-drop-asciidrop-v2-3` builds package `omi.nasdaq.nsmequities.drop.asciidrop.v2_3`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nasdaq.nsmequities.drop.asciidrop.v2_3.messages.session.DebugPacket;

DebugPacket message = new DebugPacket();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.nasdaq.nsmequities.drop.asciidrop.v2_3.dispatch.ClientPacketStream;
import omi.nasdaq.nsmequities.drop.asciidrop.v2_3.types.Message;

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
| `ExistingOrderCanceledMessage` | `messages.application` | `'X'` | 121 |
| `ExistingOrderCancelledAiqMessage` | `messages.application` | `'Y'` | 121 |
| `ExistingOrderExecutedMessage` | `messages.application` | `'E'` | 121 |
| `ExistingOrderModifiedMessage` | `messages.application` | `'M'` | 121 |
| `ExistingOrderReplacedMessage` | `messages.application` | `'U'` | 121 |
| `LoginAcceptedPacket` | `messages.session` | `'A'` | 30 |
| `LoginRejectedPacket` | `messages.session` | `'J'` | 1 |
| `LoginRequestPacket` | `messages.session` | `'L'` | 46 |
| `NewOrderAcceptedMessage` | `messages.application` | `'A'` | 121 |
| `PreviousExecutionBrokenMessage` | `messages.application` | `'B'` | 121 |
| `TradeCorrectionMessage` | `messages.application` | `'C'` | 121 |
| `UnsequencedDataPacket` | `messages.session` | `'U'` | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nasdaq-nsmequities-drop-asciidrop-v2-3:build
```

Run the round trip alone:

```
gradle :nasdaq-nsmequities-drop-asciidrop-v2-3:roundTrip
```

