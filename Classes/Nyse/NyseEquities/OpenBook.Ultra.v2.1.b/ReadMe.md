# New York Stock Exchange Open Book Ultra v2.1.b

Generated Java parser for Nyse Open Book Ultra v2.1.b.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [New York Stock Exchange Equities](..).

## Usage

Gradle project `:nyse-nyseequities-openbook-ultra-v2-1-b` builds package `omi.nyse.nyseequities.openbook.ultra.v2_1_b`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application.BookRefreshRequestMessage;

BookRefreshRequestMessage message = new BookRefreshRequestMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.dispatch.PacketDecoder;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.Message;

PacketDecoder.Decoded decoded = PacketDecoder.decode(payload, 0, payload.length);
for (Message message : decoded.messages()) {
    System.out.println(message);
}
```

`decoded.complete()` says whether every counted message lay inside the packet, and `decoded.undecoded()` counts the messages of a type this package does not decode.

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `BookRefreshRequestMessage` | `messages.application` |  | 36 |
| `DeltaUpdateMessage` | `messages.application` |  | 20 |
| `DeltaUpdateMessageBody` | `messages.application` |  | 18 |
| `DeltaUpdateMessages` | `messages.application` |  | 0 |
| `ExtendedBookRefreshRequestMessage` | `messages.application` |  | 26 |
| `FullUpdateMessage` | `messages.application` |  | 34 |
| `FullUpdateMessageBody` | `messages.application` |  | 32 |
| `FullUpdateMessages` | `messages.application` |  | 0 |
| `HeartbeatResponseMessage` | `messages.application` |  | 20 |
| `RequestResponseMessage` | `messages.application` |  | 28 |
| `RetransmissionRequestMessage` | `messages.application` |  | 28 |
| `SequenceNumberResetMessage` | `messages.application` |  | 4 |
| `SymbolIndexMappingRequestMessage` | `messages.application` |  | 24 |
| `SymbolIndexMappingResponseMessage` | `messages.application` |  | 16 |
| `UnavailableMessage` | `messages.application` |  | 8 |
| `HeartbeatMessage` | `messages.application` |  | 0 |
| `HeartbeatSubscriptionMessage` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nyse-nyseequities-openbook-ultra-v2-1-b:build
```

Run the round trip alone:

```
gradle :nyse-nyseequities-openbook-ultra-v2-1-b:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :nyse-nyseequities-openbook-ultra-v2-1-b:captureTest -Pcapture=/path/to/capture.pcap
```

