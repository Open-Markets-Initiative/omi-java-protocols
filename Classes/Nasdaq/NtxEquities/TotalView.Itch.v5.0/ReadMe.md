# National Association of Securities Dealers Automated Quotations (Nasdaq) TX TotalView Itch Itch v5.0

Generated Java parser for Nasdaq TX TotalView Itch Itch v5.0.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nasdaq Texas](..).

## Usage

Gradle project `:nasdaq-ntxequities-totalview-itch-v5-0` builds package `omi.nasdaq.ntxequities.totalview.itch.v5_0`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nasdaq.ntxequities.totalview.itch.v5_0.messages.application.AddOrderMpidAttributionMessage;

AddOrderMpidAttributionMessage message = new AddOrderMpidAttributionMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.nasdaq.ntxequities.totalview.itch.v5_0.dispatch.PacketDecoder;
import omi.nasdaq.ntxequities.totalview.itch.v5_0.types.Message;

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
| `AddOrderMpidAttributionMessage` | `messages.application` | `'F'` | 39 |
| `AddOrderNoMpidAttributionMessage` | `messages.application` | `'A'` | 35 |
| `BrokenTradeMessage` | `messages.application` | `'B'` | 18 |
| `CrossTradeMessage` | `messages.application` | `'Q'` | 39 |
| `LuldAuctionCollarMessage` | `messages.application` | `'J'` | 34 |
| `MarketParticipantPositionMessage` | `messages.application` | `'L'` | 25 |
| `MwcbDeclineLevelMessage` | `messages.application` | `'V'` | 34 |
| `MwcbStatusMessage` | `messages.application` | `'W'` | 11 |
| `NetOrderImbalanceIndicatorMessage` | `messages.application` | `'I'` | 49 |
| `NonCrossTradeMessage` | `messages.application` | `'P'` | 43 |
| `OperationalHaltMessage` | `messages.application` | `'h'` | 20 |
| `OrderCancelMessage` | `messages.application` | `'X'` | 22 |
| `OrderDeleteMessage` | `messages.application` | `'D'` | 18 |
| `OrderExecutedMessage` | `messages.application` | `'E'` | 30 |
| `OrderExecutedWithPriceMessage` | `messages.application` | `'C'` | 35 |
| `OrderReplaceMessage` | `messages.application` | `'U'` | 34 |
| `RegShoShortSalePriceTestRestrictedIndicatorMessage` | `messages.application` | `'Y'` | 19 |
| `RetailInterestMessage` | `messages.application` | `'N'` | 19 |
| `StockDirectoryMessage` | `messages.application` | `'R'` | 38 |
| `StockTradingActionMessage` | `messages.application` | `'H'` | 24 |
| `SystemEventMessage` | `messages.application` | `'S'` | 11 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `test` | UDP pcap | JUnit test of 12 captures, each walking every packet, requiring every message to encode back to its own bytes and the captured message to appear. Skips unless `OMI_PACKETS_DIR` names a packet corpus checkout. |

These messages have no capture test: `StockDirectoryMessage`, `MarketParticipantPositionMessage`, `MwcbDeclineLevelMessage`, `MwcbStatusMessage`, `LuldAuctionCollarMessage`, `OperationalHaltMessage`, `CrossTradeMessage`, `BrokenTradeMessage`, `NetOrderImbalanceIndicatorMessage`. Captures are not included in this repository; please post captures of these messages if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nasdaq-ntxequities-totalview-itch-v5-0:build
```

Run the round trip alone:

```
gradle :nasdaq-ntxequities-totalview-itch-v5-0:roundTrip
```

Run the capture tests against a packet corpus checkout:

```
OMI_PACKETS_DIR=/path/to/packets gradle :nasdaq-ntxequities-totalview-itch-v5-0:test
```

