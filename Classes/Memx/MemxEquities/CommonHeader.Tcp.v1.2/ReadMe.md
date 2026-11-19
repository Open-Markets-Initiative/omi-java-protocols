# The Members Exchange Common Header Tcp v1.2

Generated Java parser for Memx Common Header Tcp v1.2.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Memx Equities](..).

## Usage

Gradle project `:memx-memxequities-commonheader-tcp-v1-2` builds package `omi.memx.memxequities.commonheader.tcp.v1_2`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.memx.memxequities.commonheader.tcp.v1_2.messages.session.LoginAcceptedMessage;

LoginAcceptedMessage message = new LoginAcceptedMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.memx.memxequities.commonheader.tcp.v1_2.dispatch.ClientPacketStream;
import omi.memx.memxequities.commonheader.tcp.v1_2.types.Message;

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
| `LoginAcceptedMessage` | `messages.session` | `'\u0001'` | 1 |
| `LoginRejectedMessage` | `messages.session` | `'\u0002'` | 1 |
| `LoginRequestMessage` | `messages.session` | `'d'` | 2 |
| `ReplayAllRequestMessage` | `messages.session` | `'f'` | 8 |
| `ReplayBeginMessage` | `messages.session` | `'\u0005'` | 12 |
| `ReplayCompleteMessage` | `messages.session` | `'\u0007'` | 8 |
| `ReplayRejectedMessage` | `messages.session` | `'\u0006'` | 1 |
| `ReplayRequestMessage` | `messages.session` | `'e'` | 20 |
| `SequencedMessage` | `messages.session` | `'\u000B'` | 0 |
| `StartOfSessionMessage` | `messages.session` | `'\u0003'` | 8 |
| `StreamBeginMessage` | `messages.session` | `'\b'` | 16 |
| `StreamCompleteMessage` | `messages.session` | `'\n'` | 8 |
| `StreamRejectedMessage` | `messages.session` | `'\t'` | 1 |
| `StreamRequestMessage` | `messages.session` | `'g'` | 16 |
| `UnsequencedMessage` | `messages.session` | `'h'` | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :memx-memxequities-commonheader-tcp-v1-2:build
```

Run the round trip alone:

```
gradle :memx-memxequities-commonheader-tcp-v1-2:roundTrip
```

