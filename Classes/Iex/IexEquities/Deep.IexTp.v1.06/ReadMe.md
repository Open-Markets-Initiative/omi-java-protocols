# Investors Exchange Depth Of Book IexTp v1.06

Generated Java parser for Iex Depth Of Book IexTp v1.06.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [IEX Equities](..).

## Usage

Gradle project `:iex-iexequities-deep-iextp-v1-06` builds package `omi.iex.iexequities.deep.iextp.v1_06`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.iex.iexequities.deep.iextp.v1_06.messages.application.AuctionInformationMessage;

AuctionInformationMessage message = new AuctionInformationMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.iex.iexequities.deep.iextp.v1_06.dispatch.PacketDecoder;
import omi.iex.iexequities.deep.iextp.v1_06.types.Message;

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
| `AuctionInformationMessage` | `messages.application` | `'A'` | 79 |
| `OfficialPriceMessage` | `messages.application` | `'X'` | 25 |
| `OperationalHaltStatusMessage` | `messages.application` | `'O'` | 17 |
| `PriceLevelBuyUpdateMessage` | `messages.application` | `'8'` | 29 |
| `PriceLevelSellUpdateMessage` | `messages.application` | `'5'` | 29 |
| `SecurityDirectoryMessage` | `messages.application` | `'D'` | 30 |
| `SecurityEventMessage` | `messages.application` | `'E'` | 17 |
| `ShortSalePriceTestStatusMessage` | `messages.application` | `'P'` | 18 |
| `SystemEventMessage` | `messages.application` | `'S'` | 9 |
| `TradeBreakMessage` | `messages.application` | `'B'` | 37 |
| `TradeReportMessage` | `messages.application` | `'T'` | 37 |
| `TradingStatusMessage` | `messages.application` | `'H'` | 21 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `test` | UDP pcap | JUnit test of 9 captures, each walking every packet, requiring every message to encode back to its own bytes and the captured message to appear. Skips unless `OMI_PACKETS_DIR` names a packet corpus checkout. |

These messages have no capture test: `SecurityDirectoryMessage`, `OperationalHaltStatusMessage`, `TradeBreakMessage`. Captures are not included in this repository; please post captures of these messages if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :iex-iexequities-deep-iextp-v1-06:build
```

Run the round trip alone:

```
gradle :iex-iexequities-deep-iextp-v1-06:roundTrip
```

Run the capture tests against a packet corpus checkout:

```
OMI_PACKETS_DIR=/path/to/packets gradle :iex-iexequities-deep-iextp-v1-06:test
```

