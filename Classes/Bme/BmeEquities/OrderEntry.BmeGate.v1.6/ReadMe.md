# Bolsas y Mercados Españoles BME Equities Order Entry BmeGate v1.6

Generated Java parser for Bme BME Equities Order Entry BmeGate v1.6.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [BME Equities](..).

## Usage

Gradle project `:bme-bmeequities-orderentry-bmegate-v1-6` builds package `omi.bme.bmeequities.orderentry.bmegate.v1_6`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.bme.bmeequities.orderentry.bmegate.v1_6.messages.application.BusinessMessageRejectMessage;

BusinessMessageRejectMessage message = new BusinessMessageRejectMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `BusinessMessageRejectMessage` | `messages.application` |  | 83 |
| `ExecutionPrivateInformation1LegBuyOrderEntryMessage` | `messages.application` |  | 100 |
| `ExecutionPrivateInformation1LegSellOrderEntryMessage` | `messages.application` |  | 100 |
| `ExecutionPrivateInformation2LegsMessage` | `messages.application` |  | 145 |
| `HeartbeatMessage` | `messages.application` |  | 4 |
| `LogonMessage` | `messages.application` |  | 53 |
| `LogonResponseMessage` | `messages.application` |  | 26 |
| `LogoutResponseMessage` | `messages.application` |  | 5 |
| `MassOrderquoteCancellationCompletionMessage` | `messages.application` |  | 18 |
| `MassOrderquoteCancellationMessage` | `messages.application` |  | 38 |
| `MassOrderquoteCancellationRejectMessage` | `messages.application` |  | 14 |
| `NetworkStatusMessage` | `messages.application` |  | 5 |
| `NewQuoteMessage` | `messages.application` |  | 34 |
| `NewsMessage` | `messages.application` |  | 82 |
| `OrderAndQuoteClientDataMessage` | `messages.application` |  | 97 |
| `OrderAndQuoteClientDataParametersAckNackMessage` | `messages.application` |  | 102 |
| `OrderCancelRejectMessage` | `messages.application` |  | 23 |
| `OrderCancellationMarketMemberMessage` | `messages.application` |  | 25 |
| `OrderCancellationRequestMessage` | `messages.application` |  | 12 |
| `QuoteCancellationMarketMemberMessage` | `messages.application` |  | 25 |
| `QuoteCancellationRequestMessage` | `messages.application` |  | 10 |
| `QuoteModificationRequestMessage` | `messages.application` |  | 26 |
| `QuoteStatusMessage` | `messages.application` |  | 92 |
| `RejectMessage` | `messages.application` |  | 70 |
| `SecurityListCancellationReportMessage` | `messages.application` |  | 50 |
| `SecurityListMessage` | `messages.application` |  | 976 |
| `SecurityListUpdateReportMessage` | `messages.application` |  | 976 |
| `SecurityStatusMessage` | `messages.application` |  | 115 |
| `SimpleNewOrderMessage` | `messages.application` |  | 29 |
| `SimpleNewOrderWithClientDataMessage` | `messages.application` |  | 118 |
| `SimpleOrderModificationMessage` | `messages.application` |  | 27 |
| `SimpleOrderModificationWithClientDataMessage` | `messages.application` |  | 116 |
| `SimpleOrderStatusMessage` | `messages.application` |  | 62 |
| `StatisticsMessage` | `messages.application` |  | 17 |
| `TradeTradeAmendmentOrCancellation1LegBuyPrivateInformationMessage` | `messages.application` |  | 317 |
| `TradeTradeAmendmentOrCancellation1LegSellPrivateInformationMessage` | `messages.application` |  | 317 |
| `TradeTradeAmendmentOrCancellation2LegsPrivateInformationMessage` | `messages.application` |  | 536 |
| `TradingSessionStatusMessage` | `messages.application` |  | 15 |
| `LogoutMessage` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :bme-bmeequities-orderentry-bmegate-v1-6:build
```

Run the round trip alone:

```
gradle :bme-bmeequities-orderentry-bmegate-v1-6:roundTrip
```

