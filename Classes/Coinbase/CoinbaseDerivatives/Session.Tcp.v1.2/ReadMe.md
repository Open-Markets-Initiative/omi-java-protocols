# Coinbase Tcp v1.2

Generated Java parser for Coinbase Tcp v1.2.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Coinbase Derivatives](..).

## Usage

Gradle project `:coinbase-coinbasederivatives-session-tcp-v1-2` builds package `omi.coinbase.coinbasederivatives.session.tcp.v1_2`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.coinbase.coinbasederivatives.session.tcp.v1_2.messages.application.GapFillMessage;

GapFillMessage message = new GapFillMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.coinbase.coinbasederivatives.session.tcp.v1_2.dispatch.PacketStream;
import omi.coinbase.coinbasederivatives.session.tcp.v1_2.types.Message;

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
| `GapFillMessage` | `messages.application` |  | 8 |
| `HeartbeatMessage` | `messages.application` |  | 8 |
| `LoggedOutMessage` | `messages.application` |  | 64 |
| `LogonConfMessage` | `messages.application` |  | 4 |
| `LogonMessage` | `messages.application` |  | 49 |
| `LogoutMessage` | `messages.application` |  | 64 |
| `RejectMessage` | `messages.application` |  | 72 |
| `ResendRequestMessage` | `messages.application` |  | 8 |
| `TestRequestMessage` | `messages.application` |  | 8 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :coinbase-coinbasederivatives-session-tcp-v1-2:build
```

Run the round trip alone:

```
gradle :coinbase-coinbasederivatives-session-tcp-v1-2:roundTrip
```

