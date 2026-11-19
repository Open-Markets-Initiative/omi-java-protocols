# National Association of Securities Dealers Automated Quotations (Nasdaq) CHIXMMD Multicast Market Data AsciiItch v1.1.3.5

Generated Java parser for Nasdaq CHIXMMD Multicast Market Data AsciiItch v1.1.3.5.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nasdaq Canada](..).

## Usage

Gradle project `:nasdaq-nasdaqcanada-chixmmd-asciiitch-v1-1-3-5` builds package `omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.messages.session.Heartbeat;

Heartbeat message = new Heartbeat();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.dispatch.PacketDecoder;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.types.Message;

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
| `AddOrderMessage` | `messages.application` | `'A'` | 39 |
| `BrokenTradeMessage` | `messages.application` | `'B'` | 9 |
| `Heartbeat` | `messages.session` |  | 10 |
| `LongFormAddOrderMessage` | `messages.application` | `'a'` | 52 |
| `LongFormOrderCancelMessage` | `messages.application` | `'x'` | 19 |
| `LongFormOrderExecutionMessage` | `messages.application` | `'e'` | 44 |
| `LongFormTradeMessage` | `messages.application` | `'p'` | 76 |
| `OrderCancelMessage` | `messages.application` | `'X'` | 15 |
| `OrderExecutionMessage` | `messages.application` | `'E'` | 40 |
| `StockStatusMessage` | `messages.application` | `'H'` | 21 |
| `SystemEventMessage` | `messages.application` | `'S'` | 1 |
| `TradeMessage` | `messages.application` | `'P'` | 63 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nasdaq-nasdaqcanada-chixmmd-asciiitch-v1-1-3-5:build
```

Run the round trip alone:

```
gradle :nasdaq-nasdaqcanada-chixmmd-asciiitch-v1-1-3-5:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :nasdaq-nasdaqcanada-chixmmd-asciiitch-v1-1-3-5:captureTest -Pcapture=/path/to/capture.pcap
```

