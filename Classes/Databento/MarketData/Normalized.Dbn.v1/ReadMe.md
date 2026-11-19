# Databento Normalized Dbn v1

Generated Java parser for Databento Normalized Dbn v1.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Databento Market Data](..).

## Usage

Gradle project `:databento-marketdata-normalized-dbn-v1` builds package `omi.databento.marketdata.normalized.dbn.v1`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.databento.marketdata.normalized.dbn.v1.messages.application.BboMsg;

BboMsg message = new BboMsg();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `BboMsg` | `messages.application` | `'\u00C3'` | 64 |
| `CbboMsg` | `messages.application` | `'\u00C0'` | 64 |
| `Cmbp1Msg` | `messages.application` | `'\u00B1'` | 64 |
| `ErrorMsg` | `messages.application` | `'\u0015'` | 64 |
| `ImbalanceMsg` | `messages.application` | `'\u0014'` | 96 |
| `InstrumentDefMsg` | `messages.application` | `'\u0013'` | 344 |
| `MboMsg` | `messages.application` | `'\u00A0'` | 40 |
| `Mbp1Msg` | `messages.application` | `'\u0001'` | 64 |
| `Mbp10Msg` | `messages.application` | `'\n'` | 352 |
| `OhlcvMsg` | `messages.application` | `'\u0011'` | 40 |
| `StatMsg` | `messages.application` | `'\u0018'` | 48 |
| `StatusMsg` | `messages.application` | `'\u0012'` | 24 |
| `SymbolMappingMsg` | `messages.application` | `'\u0016'` | 64 |
| `SystemMsg` | `messages.application` | `'\u0017'` | 64 |
| `TradeMsg` | `messages.application` | `'\u0000'` | 32 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :databento-marketdata-normalized-dbn-v1:build
```

Run the round trip alone:

```
gradle :databento-marketdata-normalized-dbn-v1:roundTrip
```

