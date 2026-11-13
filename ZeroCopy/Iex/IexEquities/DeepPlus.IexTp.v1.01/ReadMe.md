# Investors Exchange DeepPlus IexTp v1.01

Generated Java ZeroCopy parser for Iex DeepPlus IexTp v1.01.

Messages are flyweights read where their bytes lie: decoding copies nothing and allocates nothing.

A protocol of [IEX Equities](..).

## Usage

Gradle project `:zerocopy-iex-iexequities-deepplus-iextp-v1-01` builds package `omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01`. Each message is a flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there, so decoding copies nothing and allocates nothing. A flyweight is valid only while those bytes are unchanged.

Walk one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers. The decoder rewraps one flyweight per message type, so a message is valid until the decoder reaches the next of its type:

```java
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.dispatch.PacketDecoder;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.Message;

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

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :zerocopy-iex-iexequities-deepplus-iextp-v1-01:build
```

