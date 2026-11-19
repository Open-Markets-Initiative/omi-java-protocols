# Long-Term Stock Exchange Member Order Information Record Top Of Book Sbe v1.3

Generated Java parser for Ltse Member Order Information Record Top Of Book Sbe v1.3.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Ltse Equities](..).

## Usage

Gradle project `:ltse-ltseequities-memoirtopofbook-sbe-v1-3` builds package `omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.messages.application.BestBidMessage;

BestBidMessage message = new BestBidMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.dispatch.PacketDecoder;
import omi.ltse.ltseequities.memoirtopofbook.sbe.v1_3.types.Message;

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
| `BestBidMessage` | `messages.application` | `'\u000B'` | 22 |
| `BestBidOfferMessage` | `messages.application` | `'\n'` | 34 |
| `BestBidShortMessage` | `messages.application` | `'\r'` | 14 |
| `BestOfferMessage` | `messages.application` | `'\f'` | 22 |
| `BestOfferShortMessage` | `messages.application` | `'\u000E'` | 14 |
| `ClearBookMessage` | `messages.application` | `'\u000F'` | 10 |
| `InstrumentDirectoryMessage` | `messages.application` | `'\u0001'` | 35 |
| `RegShoRestrictionMessage` | `messages.application` | `'\u0002'` | 11 |
| `SecurityTradingStatusMessage` | `messages.application` | `'\u0003'` | 12 |
| `SnapshotCompleteMessage` | `messages.application` | `'\u0004'` | 16 |
| `TradingSessionStatusMessage` | `messages.application` | `'\u0005'` | 9 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :ltse-ltseequities-memoirtopofbook-sbe-v1-3:build
```

Run the round trip alone:

```
gradle :ltse-ltseequities-memoirtopofbook-sbe-v1-3:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :ltse-ltseequities-memoirtopofbook-sbe-v1-3:captureTest -Pcapture=/path/to/capture.pcap
```

