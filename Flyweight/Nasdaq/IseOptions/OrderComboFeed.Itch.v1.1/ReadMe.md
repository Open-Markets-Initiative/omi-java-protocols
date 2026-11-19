# National Association of Securities Dealers Automated Quotations (Nasdaq) Ise Order Combo Market Data Feed Itch v1.1

Generated Java Flyweight parser for Nasdaq Ise Order Combo Market Data Feed Itch v1.1.

Messages are reused flyweights holding copies of their fields: decoding allocates nothing, and the bytes may be reused once it returns.

A protocol of [Nasdaq ISE](..).

## Usage

Gradle project `:flyweight-nasdaq-iseoptions-ordercombofeed-itch-v1-1` builds package `omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1`. Each message is a flyweight holding a copy of each field: decoding copies the fields out of the message's bytes and allocates nothing, so the bytes may be reused as soon as it returns.

Walk one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers. The decoder decodes into one flyweight per message type, so a message is valid until the decoder reaches the next of its type, even after the payload is reused:

```java
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.dispatch.PacketDecoder;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;

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
gradle :flyweight-nasdaq-iseoptions-ordercombofeed-itch-v1-1:build
```

