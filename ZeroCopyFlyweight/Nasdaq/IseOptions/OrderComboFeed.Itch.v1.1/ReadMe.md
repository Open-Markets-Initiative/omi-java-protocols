# National Association of Securities Dealers Automated Quotations (Nasdaq) Ise Order Combo Market Data Feed Itch v1.1

Generated Java ZeroCopyFlyweight parser for Nasdaq Ise Order Combo Market Data Feed Itch v1.1.

Messages are flyweights read where their bytes lie: decoding copies nothing and allocates nothing.

A protocol of [Nasdaq ISE](..).

## Usage

Gradle project `:zerocopyflyweight-nasdaq-iseoptions-ordercombofeed-itch-v1-1` builds package `omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1`. Each message is a flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there, so decoding copies nothing and allocates nothing. A flyweight is valid only while those bytes are unchanged.

Walk one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers. The decoder rewraps one flyweight per message type, so a message is valid until the decoder reaches the next of its type:

```java
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.dispatch.PacketDecoder;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;

PacketDecoder decoder = new PacketDecoder();
if (decoder.start(payload, 0, payload.length)) {
    for (Message message = decoder.next(); message != null; message = decoder.next()) {
        System.out.println(message);
    }
}
```

`decoder.undecoded()` counts the messages stepped over because this package decodes no message of their type, and `decoder.complete()` says whether the packet was walked to its end.

## Messages

Each flyweight carries its wire length as `BYTE_LENGTH` and the offset of each field as `<FIELD>_OFFSET`. A message ending in a repeating group carries its least length as `MINIMUM_BYTE_LENGTH`, marked `+` below, and reads its entries through a list of entry flyweights in `groups`.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `ComplexStrategyAuctionMessage` | `messages.application` | `'J'` | 48+ |
| `ComplexStrategyDirectoryMessage` | `messages.application` | `'R'` | 26+ |
| `ComplexStrategyOrderOnBookMessage` | `messages.application` | `'L'` | 41 |
| `StrategyOpenClosedMessage` | `messages.application` | `'O'` | 11 |
| `StrategyTradingActionMessage` | `messages.application` | `'H'` | 11 |
| `SystemEventMessage` | `messages.application` | `'S'` | 13 |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :zerocopyflyweight-nasdaq-iseoptions-ordercombofeed-itch-v1-1:build
```

