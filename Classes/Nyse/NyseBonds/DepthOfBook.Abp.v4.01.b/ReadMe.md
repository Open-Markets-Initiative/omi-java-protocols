# New York Stock Exchange DepthOfBook Abp v4.01.b

Generated Java parser for Nyse DepthOfBook Abp v4.01.b.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nyse Bonds](..).

## Usage

Gradle project `:nyse-nysebonds-depthofbook-abp-v4-01-b` builds package `omi.nyse.nysebonds.depthofbook.abp.v4_01_b`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.application.AddOrderMessage;

AddOrderMessage message = new AddOrderMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ServerPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.dispatch.ServerPacketStream;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.Message;

ServerPacketStream stream = new ServerPacketStream();
for (ServerPacketStream.Record record : stream.append(bytes, 0, bytes.length)) {
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
| `AddOrderMessage` | `messages.application` | `'N'` | 76 |
| `DeleteOrderMessage` | `messages.application` | `'K'` | 60 |
| `HeartbeatResponseMessage` | `messages.session` | `'H'` | 1 |
| `ImbalanceMessage` | `messages.application` | `'W'` | 72 |
| `LoginAcceptedMessage` | `messages.application` | `'Q'` | 6 |
| `LoginMessage` | `messages.session` | `'L'` | 34 |
| `LoginRejectedMessage` | `messages.application` | `'R'` | 2 |
| `LogoffMessage` | `messages.session` | `'O'` | 1 |
| `ModifyOrderMessage` | `messages.application` | `'C'` | 76 |
| `SystemEventMessage` | `messages.application` | `'Y'` | 52 |
| `TestRequestMessage` | `messages.session` | `'T'` | 21 |
| `TestResponseMessage` | `messages.application` | `'S'` | 20 |
| `HeartbeatMessage` | `messages.application` | `'H'` | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Nyse/NyseBonds.DepthOfBook.Abp.v4.01.b` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nyse-nysebonds-depthofbook-abp-v4-01-b:build
```

Run the round trip alone:

```
gradle :nyse-nysebonds-depthofbook-abp-v4-01-b:roundTrip
```

