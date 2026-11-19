# Bolsas y Mercados Españoles BME Equities Recovery BmeGate v1.6

Generated Java parser for Bme BME Equities Recovery BmeGate v1.6.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [BME Equities](..).

## Usage

Gradle project `:bme-bmeequities-recovery-bmegate-v1-6` builds package `omi.bme.bmeequities.recovery.bmegate.v1_6`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.bme.bmeequities.recovery.bmegate.v1_6.messages.application.HeartbeatMessage;

HeartbeatMessage message = new HeartbeatMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `HeartbeatMessage` | `messages.application` |  | 4 |
| `LogonMessage` | `messages.application` |  | 53 |
| `LogonResponseMessage` | `messages.application` |  | 26 |
| `LogoutResponseMessage` | `messages.application` |  | 5 |
| `NewsMessage` | `messages.application` |  | 82 |
| `OrderBookClearMessage` | `messages.application` |  | 16 |
| `OrderCancellationMarketMemberMessage` | `messages.application` |  | 25 |
| `OrderMarketPreTransparencyInformationMessage` | `messages.application` |  | 42 |
| `QuoteCancellationMarketMemberMessage` | `messages.application` |  | 25 |
| `QuoteMarketPreTransparencyInformationMessage` | `messages.application` |  | 57 |
| `RejectMessage` | `messages.application` |  | 70 |
| `SecurityListCancellationReportMessage` | `messages.application` |  | 50 |
| `SecurityListMessage` | `messages.application` |  | 976 |
| `SecurityListUpdateReportMessage` | `messages.application` |  | 976 |
| `SecurityStatusMessage` | `messages.application` |  | 115 |
| `StatisticsMessage` | `messages.application` |  | 17 |
| `TopOfBookMessage` | `messages.application` |  | 44 |
| `TradeMarketPostTransparencyInformationFullDepthMessage` | `messages.application` |  | 105 |
| `TradeMarketPostTransparencyInformationTopOfBookMessage` | `messages.application` |  | 55 |
| `TradeTradeAmendmentOrCancellationMessage` | `messages.application` |  | 98 |
| `TradingSessionStatusMessage` | `messages.application` |  | 15 |
| `LogoutMessage` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :bme-bmeequities-recovery-bmegate-v1-6:build
```

Run the round trip alone:

```
gradle :bme-bmeequities-recovery-bmegate-v1-6:roundTrip
```

