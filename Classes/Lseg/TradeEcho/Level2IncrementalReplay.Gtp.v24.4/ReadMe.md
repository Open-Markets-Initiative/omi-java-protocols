# London Stock Exchange Level 2 Incremental Replay Gtp v24.4

Generated Java parser for Lseg Level 2 Incremental Replay Gtp v24.4.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [TRADEcho](..).

## Usage

Gradle project `:lseg-tradeecho-level2incrementalreplay-gtp-v24-4` builds package `omi.lseg.tradeecho.level2incrementalreplay.gtp.v24_4`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v24_4.messages.application.InstrumentDirectoryMessage;

InstrumentDirectoryMessage message = new InstrumentDirectoryMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v24_4.dispatch.PacketStream;
import omi.lseg.tradeecho.level2incrementalreplay.gtp.v24_4.types.Message;

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
| `InstrumentDirectoryMessage` | `messages.application` |  | 138 |
| `InstrumentStatusMessage` | `messages.application` |  | 27 |
| `LoginRequestMessage` | `messages.application` |  | 8 |
| `LoginResponseMessage` | `messages.application` |  | 1 |
| `OrderBookClearMessage` | `messages.application` |  | 19 |
| `OrderDeleteMessage` | `messages.application` |  | 52 |
| `ReplayAndRecoveryCompleteMessage` | `messages.application` |  | 5 |
| `ReplayRequestMessage` | `messages.application` |  | 12 |
| `ReplayResponseMessage` | `messages.application` |  | 13 |
| `SystemEventMessage` | `messages.application` |  | 11 |
| `SystematicInternaliserQuotesMessage` | `messages.application` |  | 81 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :lseg-tradeecho-level2incrementalreplay-gtp-v24-4:build
```

Run the round trip alone:

```
gradle :lseg-tradeecho-level2incrementalreplay-gtp-v24-4:roundTrip
```

