# Japan Exchange Group Genium Inet Ouch v5.0

Generated Java parser for Jpx Genium Inet Ouch v5.0.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Osaka Securities Exchange](..).

## Usage

Gradle project `:jpx-osederivatives-geniuminet-ouch-v5-0` builds package `omi.jpx.osederivatives.geniuminet.ouch.v5_0`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application.CancelByOrderId;

CancelByOrderId message = new CancelByOrderId();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.dispatch.ClientPacketStream;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.types.Message;

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
| `CancelByOrderId` | `messages.application` | `'Y'` | 13 |
| `CancelOrder` | `messages.application` | `'X'` | 14 |
| `DebugPacket` | `messages.session` | `'+'` | 0 |
| `EnterMmOrder` | `messages.application` | `'P'` | 79 |
| `EnterOrder` | `messages.application` | `'O'` | 96 |
| `LoginAcceptedPacket` | `messages.session` | `'A'` | 30 |
| `LoginRejectedPacket` | `messages.session` | `'J'` | 1 |
| `LoginRequestPacket` | `messages.session` | `'L'` | 46 |
| `MassCancel` | `messages.application` | `'M'` | 35 |
| `MassCancelAccepted` | `messages.application` | `'M'` | 26 |
| `OrderAccepted` | `messages.application` | `'A'` | 113 |
| `OrderCanceled` | `messages.application` | `'C'` | 36 |
| `OrderExecuted` | `messages.application` | `'E'` | 51 |
| `OrderRejected` | `messages.application` | `'J'` | 26 |
| `OrderReplaced` | `messages.application` | `'U'` | 127 |
| `ReplaceOrder` | `messages.application` | `'U'` | 104 |
| `SequencedDataPacket` | `messages.session` | `'S'` | 1 |
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
gradle :jpx-osederivatives-geniuminet-ouch-v5-0:build
```

Run the round trip alone:

```
gradle :jpx-osederivatives-geniuminet-ouch-v5-0:roundTrip
```

