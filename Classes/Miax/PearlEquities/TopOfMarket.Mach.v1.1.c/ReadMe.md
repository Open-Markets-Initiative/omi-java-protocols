# Miami International Holdings Top Of Market Mach v1.1.c

Generated Java parser for Miax Top Of Market Mach v1.1.c.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [MIAX Pearl Equities](..).

## Usage

Gradle project `:miax-pearlequities-topofmarket-mach-v1-1-c` builds package `omi.miax.pearlequities.topofmarket.mach.v1_1_c`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.miax.pearlequities.topofmarket.mach.v1_1_c.messages.application.CompactTopOfMarketBestBidAndOfferMessage;

CompactTopOfMarketBestBidAndOfferMessage message = new CompactTopOfMarketBestBidAndOfferMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `TcpPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.miax.pearlequities.topofmarket.mach.v1_1_c.dispatch.TcpPacketStream;
import omi.miax.pearlequities.topofmarket.mach.v1_1_c.types.Message;

TcpPacketStream stream = new TcpPacketStream();
for (TcpPacketStream.Record record : stream.append(bytes, 0, bytes.length)) {
    for (Message message : record.decoded().messages()) {
        System.out.println(message);
    }
}
```

A record stating a length that is not valid fails the stream, which then reads nothing more.

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.miax.pearlequities.topofmarket.mach.v1_1_c.dispatch.PacketDecoder;
import omi.miax.pearlequities.topofmarket.mach.v1_1_c.types.Message;

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
| `CompactTopOfMarketBestBidAndOfferMessage` | `messages.application` | `'\u0002'` | 16 |
| `EndOfRefreshNotificationMessage` | `messages.application` | `'E'` | 1 |
| `GoodbyePacket` | `messages.session` | `'G'` | 1 |
| `LastSaleMessage` | `messages.application` | `'\n'` | 30 |
| `LoginRequest` | `messages.session` | `'l'` | 27 |
| `LoginResponse` | `messages.session` | `'r'` | 1 |
| `LogoutRequest` | `messages.session` | `'X'` | 1 |
| `RefreshRequestMessage` | `messages.application` | `'R'` | 1 |
| `RefreshResponseMessage` | `messages.application` | `'r'` | 8 |
| `RetransmissionRequest` | `messages.session` | `'a'` | 16 |
| `SecurityTradingStatusNotificationMessage` | `messages.application` | `'\u0004'` | 11 |
| `SymbolUpdateMessage` | `messages.application` | `'\u0001'` | 41 |
| `SynchronizationComplete` | `messages.session` | `'c'` | 1 |
| `SystemStateMessage` | `messages.application` | `'S'` | 14 |
| `SystemTimeMessage` | `messages.application` | `'1'` | 4 |
| `TestPacket` | `messages.session` | `'T'` | 0 |
| `TradeCancelMessage` | `messages.application` | `'\u000B'` | 29 |
| `TradingSessionUpdate` | `messages.session` | `'u'` | 2 |
| `WideTopOfMarketBestBidAndOfferMessage` | `messages.application` | `'\u0003'` | 32 |
| `ServerHeartbeat` | `messages.session` | `'0'` | 0 |
| `ClientHeartbeat` | `messages.session` | `'1'` | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :miax-pearlequities-topofmarket-mach-v1-1-c:build
```

Run the round trip alone:

```
gradle :miax-pearlequities-topofmarket-mach-v1-1-c:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :miax-pearlequities-topofmarket-mach-v1-1-c:captureTest -Pcapture=/path/to/capture.pcap
```

