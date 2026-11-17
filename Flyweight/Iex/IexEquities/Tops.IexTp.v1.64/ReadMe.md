# Investors Exchange Top Of Book IexTp v1.64

Generated Java Flyweight parser for Iex Top Of Book IexTp v1.64.

Messages are reused flyweights holding copies of their fields: decoding allocates nothing, and the bytes may be reused once it returns.

A protocol of [IEX Equities](..).

## Usage

Gradle project `:flyweight-iex-iexequities-tops-iextp-v1-64` builds package `omi.flyweight.iex.iexequities.tops.iextp.v1_64`. Each message is a flyweight holding a copy of each field: decoding copies the fields out of the message's bytes and allocates nothing, so the bytes may be reused as soon as it returns.

Walk one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers. The decoder decodes into one flyweight per message type, so a message is valid until the decoder reaches the next of its type, even after the payload is reused:

```java
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.dispatch.PacketDecoder;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.types.Message;

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
| `QuoteUpdateMessage` | `messages.application` | `'Q'` | 41 |
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
gradle :flyweight-iex-iexequities-tops-iextp-v1-64:build
```

