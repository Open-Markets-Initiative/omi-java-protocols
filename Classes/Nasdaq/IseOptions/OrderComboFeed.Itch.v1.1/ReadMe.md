# National Association of Securities Dealers Automated Quotations (Nasdaq) Ise Order Combo Market Data Feed Itch v1.1

Generated Java parser for Nasdaq Ise Order Combo Market Data Feed Itch v1.1.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nasdaq ISE](..).

## Usage

Gradle project `:nasdaq-iseoptions-ordercombofeed-itch-v1-1` builds package `omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application.ComplexStrategyOrderOnBookMessage;

ComplexStrategyOrderOnBookMessage message = new ComplexStrategyOrderOnBookMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.dispatch.PacketDecoder;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;

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
| `ComplexStrategyOrderOnBookMessage` | `messages.application` | `'L'` | 41 |
| `StrategyOpenClosedMessage` | `messages.application` | `'O'` | 11 |
| `StrategyTradingActionMessage` | `messages.application` | `'H'` | 11 |
| `SystemEventMessage` | `messages.application` | `'S'` | 13 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `test` | UDP pcap | JUnit test of 3 captures, each walking every packet, requiring every message to encode back to its own bytes and the captured message to appear. Skips unless `OMI_PACKETS_DIR` names a packet corpus checkout. |

These messages have no capture test: `SystemEventMessage`. Captures are not included in this repository; please post captures of these messages if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nasdaq-iseoptions-ordercombofeed-itch-v1-1:build
```

Run the round trip alone:

```
gradle :nasdaq-iseoptions-ordercombofeed-itch-v1-1:roundTrip
```

Run the capture tests against a packet corpus checkout:

```
OMI_PACKETS_DIR=/path/to/packets gradle :nasdaq-iseoptions-ordercombofeed-itch-v1-1:test
```

