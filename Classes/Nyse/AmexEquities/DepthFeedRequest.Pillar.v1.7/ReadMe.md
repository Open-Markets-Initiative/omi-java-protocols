# New York Stock Exchange Depth Feed Request Pillar v1.7

Generated Java parser for Nyse Depth Feed Request Pillar v1.7.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nyse Amex Equities](..).

## Usage

Gradle project `:nyse-amexequities-depthfeedrequest-pillar-v1-7` builds package `omi.nyse.amexequities.depthfeedrequest.pillar.v1_7`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nyse.amexequities.depthfeedrequest.pillar.v1_7.messages.application.HeartbeatResponseMessage;

HeartbeatResponseMessage message = new HeartbeatResponseMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.nyse.amexequities.depthfeedrequest.pillar.v1_7.dispatch.ClientPacketStream;
import omi.nyse.amexequities.depthfeedrequest.pillar.v1_7.types.Message;

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
| `HeartbeatResponseMessage` | `messages.application` |  | 10 |
| `RefreshRequestMessage` | `messages.application` |  | 16 |
| `RequestResponseMessage` | `messages.application` |  | 25 |
| `RetransmissionRequestMessage` | `messages.application` |  | 20 |
| `SymbolIndexMappingRequestMessage` | `messages.application` |  | 17 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nyse-amexequities-depthfeedrequest-pillar-v1-7:build
```

Run the round trip alone:

```
gradle :nyse-amexequities-depthfeedrequest-pillar-v1-7:roundTrip
```

