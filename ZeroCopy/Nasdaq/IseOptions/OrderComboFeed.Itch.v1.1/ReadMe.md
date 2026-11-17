# National Association of Securities Dealers Automated Quotations (Nasdaq) Ise Order Combo Market Data Feed Itch v1.1

Generated Java ZeroCopy parser for Nasdaq Ise Order Combo Market Data Feed Itch v1.1.

Messages are immutable views read where their bytes lie: decoding copies nothing, and a view stays valid while its bytes are unchanged.

A protocol of [Nasdaq ISE](..).

## Usage

Gradle project `:zerocopy-nasdaq-iseoptions-ordercombofeed-itch-v1-1` builds package `omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1`. Each message is an immutable view: creating it over the message's bytes copies nothing, and each getter reads its field from there. A view is valid while those bytes are unchanged, so several may be kept at once.

Walk one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers. The decoder creates a view per message, so each stays valid while the payload's bytes are unchanged:

```java
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.dispatch.PacketDecoder;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;

PacketDecoder decoder = new PacketDecoder();
if (decoder.start(payload, 0, payload.length)) {
    for (Message message = decoder.next(); message != null; message = decoder.next()) {
        System.out.println(message);
    }
}
```

`decoder.undecoded()` counts the messages stepped over because this package decodes no message of their type, and `decoder.complete()` says whether the packet was walked to its end.

## Messages

Each view carries its wire length as `BYTE_LENGTH` and the offset of each field as `<FIELD>_OFFSET`. A message ending in a repeating group carries its least length as `MINIMUM_BYTE_LENGTH`, marked `+` below, and reads its entries through a list of entry views in `groups`.

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
gradle :zerocopy-nasdaq-iseoptions-ordercombofeed-itch-v1-1:build
```

