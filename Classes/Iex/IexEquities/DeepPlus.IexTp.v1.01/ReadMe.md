# Investors Exchange DeepPlus IexTp v1.01

Generated Java parser for Iex DeepPlus IexTp v1.01.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [IEX Equities](..).

## Usage

Gradle project `:iex-iexequities-deepplus-iextp-v1-01` builds package `omi.iex.iexequities.deepplus.iextp.v1_01`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.iex.iexequities.deepplus.iextp.v1_01.messages.application.AddOrderMessage;

AddOrderMessage message = new AddOrderMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.iex.iexequities.deepplus.iextp.v1_01.dispatch.PacketDecoder;
import omi.iex.iexequities.deepplus.iextp.v1_01.types.Message;

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
| `AddOrderMessage` | `messages.application` | `'a'` | 37 |
| `ClearBookMessage` | `messages.application` | `'C'` | 17 |
| `OperationalHaltStatusMessage` | `messages.application` | `'O'` | 17 |
| `OrderDeleteMessage` | `messages.application` | `'R'` | 25 |
| `OrderExecutedMessage` | `messages.application` | `'L'` | 45 |
| `OrderModifyMessage` | `messages.application` | `'M'` | 37 |
| `RetailLiquidityIndicatorMessage` | `messages.application` | `'I'` | 17 |
| `SecurityDirectoryMessage` | `messages.application` | `'D'` | 30 |
| `SecurityEventMessage` | `messages.application` | `'E'` | 17 |
| `ShortSalePriceTestStatusMessage` | `messages.application` | `'P'` | 18 |
| `SystemEventMessage` | `messages.application` | `'S'` | 9 |
| `TradeBreakMessage` | `messages.application` | `'B'` | 37 |
| `TradeMessage` | `messages.application` | `'T'` | 37 |
| `TradingStatusMessage` | `messages.application` | `'H'` | 21 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `test` | UDP pcap | JUnit test of 13 captures, each walking every packet, requiring every message to encode back to its own bytes and the captured message to appear. Skips unless `OMI_PACKETS_DIR` names a packet corpus checkout. |

These messages have no capture test: `ClearBookMessage`. Captures are not included in this repository; please post captures of these messages if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :iex-iexequities-deepplus-iextp-v1-01:build
```

Run the round trip alone:

```
gradle :iex-iexequities-deepplus-iextp-v1-01:roundTrip
```

Run the capture tests against a packet corpus checkout:

```
OMI_PACKETS_DIR=/path/to/packets gradle :iex-iexequities-deepplus-iextp-v1-01:test
```

