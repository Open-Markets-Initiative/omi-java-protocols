# Investors Exchange Top Of Book IexTp v1.64

Generated Java ZeroCopy parser for Iex Top Of Book IexTp v1.64.

Messages are immutable views read where their bytes lie: decoding copies nothing, and a view stays valid while its bytes are unchanged.

A protocol of [IEX Equities](..).

## Usage

Gradle project `:zerocopy-iex-iexequities-tops-iextp-v1-64` builds package `omi.zerocopy.iex.iexequities.tops.iextp.v1_64`. Each message is an immutable view: creating it over the message's bytes copies nothing, and each getter reads its field from there. A view is valid while those bytes are unchanged, so several may be kept at once.

Walk one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers. The decoder creates a view per message, so each stays valid while the payload's bytes are unchanged:

```java
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.dispatch.PacketDecoder;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.Message;

PacketDecoder decoder = new PacketDecoder();
if (decoder.start(payload, 0, payload.length)) {
    for (Message message = decoder.next(); message != null; message = decoder.next()) {
        System.out.println(message);
    }
}
```

`decoder.undecoded()` counts the messages stepped over because this package decodes no message of their type, and `decoder.complete()` says whether the packet was walked to its end.

## Messages

Each view carries its wire length as `BYTE_LENGTH` and the offset of each field as `<FIELD>_OFFSET`.

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
gradle :zerocopy-iex-iexequities-tops-iextp-v1-64:build
```

