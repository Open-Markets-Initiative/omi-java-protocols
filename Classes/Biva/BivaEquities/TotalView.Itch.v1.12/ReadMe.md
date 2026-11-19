# Bolsa Institucional de Valores Total View Itch v1.12

Generated Java parser for Biva Total View Itch v1.12.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Biva Equities](..).

## Usage

Gradle project `:biva-bivaequities-totalview-itch-v1-12` builds package `omi.biva.bivaequities.totalview.itch.v1_12`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.biva.bivaequities.totalview.itch.v1_12.messages.application.AddOrderMessage;

AddOrderMessage message = new AddOrderMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.biva.bivaequities.totalview.itch.v1_12.dispatch.PacketDecoder;
import omi.biva.bivaequities.totalview.itch.v1_12.types.Message;

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
| `AddOrderMessage` | `messages.application` | `'A'` | 33 |
| `BrokenTradeMessage` | `messages.application` | `'B'` | 13 |
| `IndicativePriceQuantityMessage` | `messages.application` | `'I'` | 29 |
| `OrderDeleteMessage` | `messages.application` | `'D'` | 12 |
| `OrderExecutedMessage` | `messages.application` | `'E'` | 34 |
| `OrderExecutedWithPriceMessage` | `messages.application` | `'C'` | 39 |
| `OrderReplaceMessage` | `messages.application` | `'U'` | 32 |
| `OrderbookDirectoryMessage` | `messages.application` | `'R'` | 99 |
| `OrderbookReferencePriceMessage` | `messages.application` | `'X'` | 14 |
| `OrderbookTradingActionMessage` | `messages.application` | `'H'` | 10 |
| `ParticipantDirectoryMessage` | `messages.application` | `'F'` | 20 |
| `PriceTickSizeMessage` | `messages.application` | `'L'` | 16 |
| `QuantityTickSizeMessage` | `messages.application` | `'M'` | 24 |
| `SystemEventMessage` | `messages.application` | `'S'` | 17 |
| `TimeStampSecondsMessage` | `messages.application` | `'T'` | 4 |
| `TradeMessage` | `messages.application` | `'P'` | 39 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :biva-bivaequities-totalview-itch-v1-12:build
```

Run the round trip alone:

```
gradle :biva-bivaequities-totalview-itch-v1-12:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :biva-bivaequities-totalview-itch-v1-12:captureTest -Pcapture=/path/to/capture.pcap
```

