# National Association of Securities Dealers Automated Quotations (Nasdaq) TotalView Itch Itch v5.0.2026

Generated Java parser for Nasdaq TotalView Itch Itch v5.0.2026.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nasdaq Stock Market](..).

## Usage

Gradle project `:nasdaq-nsmequities-totalview-itch-v5-0-2026` builds package `omi.nasdaq.nsmequities.totalview.itch.v5_0_2026`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application.AddOrderNoMpidAttributionMessage;

AddOrderNoMpidAttributionMessage message = new AddOrderNoMpidAttributionMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `AddOrderNoMpidAttributionMessage` | `messages.application` | `'A'` | 35 |
| `AddOrderWithMpidAttributionMessage` | `messages.application` | `'F'` | 39 |
| `BrokenTradeMessage` | `messages.application` | `'B'` | 18 |
| `CrossTradeMessage` | `messages.application` | `'Q'` | 39 |
| `DirectListingWithCapitalRaisePriceDiscoveryMessage` | `messages.application` | `'O'` | 47 |
| `IpoQuotingPeriodUpdate` | `messages.application` | `'K'` | 27 |
| `LoginAcceptedPacket` | `messages.session` | `'A'` | 30 |
| `LoginRejectedPacket` | `messages.session` | `'J'` | 1 |
| `LoginRequestPacket` | `messages.session` | `'L'` | 46 |
| `LuldAuctionCollarMessage` | `messages.application` | `'J'` | 34 |
| `MarketParticipantPositionMessage` | `messages.application` | `'L'` | 25 |
| `MwcbDeclineLevelMessage` | `messages.application` | `'V'` | 34 |
| `MwcbStatusLevelMessage` | `messages.application` | `'W'` | 11 |
| `NetOrderImbalanceIndicatorMessage` | `messages.application` | `'I'` | 49 |
| `NonCrossTradeMessage` | `messages.application` | `'P'` | 43 |
| `OperationalHaltMessage` | `messages.application` | `'h'` | 20 |
| `OrderCancelMessage` | `messages.application` | `'X'` | 22 |
| `OrderDeleteMessage` | `messages.application` | `'D'` | 18 |
| `OrderExecutedMessage` | `messages.application` | `'E'` | 30 |
| `OrderExecutedWithPriceMessage` | `messages.application` | `'C'` | 35 |
| `OrderReplaceMessage` | `messages.application` | `'U'` | 34 |
| `RegShoShortSalePriceTestRestrictedIndicatorMessage` | `messages.application` | `'Y'` | 19 |
| `RetailPriceImprovementIndicatorMessage` | `messages.application` | `'N'` | 19 |
| `StockDirectoryMessage` | `messages.application` | `'R'` | 38 |
| `StockTradingActionMessage` | `messages.application` | `'H'` | 24 |
| `SystemEventMessage` | `messages.application` | `'S'` | 11 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nasdaq-nsmequities-totalview-itch-v5-0-2026:build
```

Run the round trip alone:

```
gradle :nasdaq-nsmequities-totalview-itch-v5-0-2026:roundTrip
```

