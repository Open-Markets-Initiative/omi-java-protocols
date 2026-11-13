# Investors Exchange Depth Of Book IexTp v1.08

Generated Java ZeroCopy parser for Iex Depth Of Book IexTp v1.08.

Messages are flyweights read where their bytes lie: decoding copies nothing and allocates nothing.

A protocol of [IEX Equities](..).

## Usage

Gradle project `:zerocopy-iex-iexequities-deep-iextp-v1-08` builds package `omi.zerocopy.iex.iexequities.deep.iextp.v1_08`. Each message is a flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there, so decoding copies nothing and allocates nothing. A flyweight is valid only while those bytes are unchanged.

Walk one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers. The decoder rewraps one flyweight per message type, so a message is valid until the decoder reaches the next of its type:

```java
import omi.zerocopy.iex.iexequities.deep.iextp.v1_08.dispatch.PacketDecoder;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_08.types.Message;

PacketDecoder decoder = new PacketDecoder();
if (decoder.start(payload, 0, payload.length)) {
    for (Message message = decoder.next(); message != null; message = decoder.next()) {
        System.out.println(message);
    }
}
```

`decoder.undecoded()` counts the messages stepped over because this package decodes no message of their type, and `decoder.complete()` says whether the packet was walked to its end.

## Messages

Each flyweight carries its wire length as `BYTE_LENGTH` and the offset of each field as `<FIELD>_OFFSET`.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `AuctionInformationMessage` | `messages.application` | `'A'` | 79 |
| `OfficialPriceMessage` | `messages.application` | `'X'` | 25 |
| `OperationalHaltStatusMessage` | `messages.application` | `'O'` | 17 |
| `PriceLevelBuyUpdateMessage` | `messages.application` | `'8'` | 29 |
| `PriceLevelSellUpdateMessage` | `messages.application` | `'5'` | 29 |
| `RetailLiquidityIndicatorMessage` | `messages.application` | `'I'` | 17 |
| `SecurityDirectoryMessage` | `messages.application` | `'D'` | 30 |
| `SecurityEventMessage` | `messages.application` | `'E'` | 17 |
| `ShortSalePriceTestStatusMessage` | `messages.application` | `'P'` | 18 |
| `SystemEventMessage` | `messages.application` | `'S'` | 9 |
| `TradeBreakMessage` | `messages.application` | `'B'` | 37 |
| `TradeReportMessage` | `messages.application` | `'T'` | 37 |
| `TradingStatusMessage` | `messages.application` | `'H'` | 21 |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :zerocopy-iex-iexequities-deep-iextp-v1-08:build
```

