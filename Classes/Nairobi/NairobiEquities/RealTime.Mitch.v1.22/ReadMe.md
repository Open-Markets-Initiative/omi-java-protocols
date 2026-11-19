# Nairobi Securities Exchange Nairobi Equities Real Time Mitch v1.22

Generated Java parser for Nairobi Nairobi Equities Real Time Mitch v1.22.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nairobi Securities Exchange Equities](..).

## Usage

Gradle project `:nairobi-nairobiequities-realtime-mitch-v1-22` builds package `omi.nairobi.nairobiequities.realtime.mitch.v1_22`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application.AddAttributedOrderMessage;

AddAttributedOrderMessage message = new AddAttributedOrderMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.dispatch.PacketDecoder;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.types.Message;

PacketDecoder.Decoded decoded = PacketDecoder.decode(payload, 0, payload.length);
for (Message message : decoded.messages()) {
    System.out.println(message);
}
```

`decoded.complete()` says whether every counted message lay inside the packet, and `decoded.undecoded()` counts the messages of a type this package does not decode.

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `AddAttributedOrderMessage` | `messages.application` |  | 41 |
| `AddOrderMessage` | `messages.application` |  | 41 |
| `AonInfoMessage` | `messages.application` |  | 34 |
| `AuctionInfoMessage` | `messages.application` |  | 30 |
| `AuctionTradeMessage` | `messages.application` |  | 57 |
| `ConsolidatedStatisticsMessage` | `messages.application` |  | 57 |
| `DeletePricePointMessage` | `messages.application` |  | 20 |
| `ExtendedStatisticsMessage` | `messages.application` |  | 93 |
| `IndexMessage` | `messages.application` |  | 25 |
| `NewsMessage` | `messages.application` |  | 1063 |
| `OffBookTradeMessage` | `messages.application` |  | 76 |
| `OrderBookClearMessage` | `messages.application` |  | 18 |
| `OrderDeletedMessage` | `messages.application` |  | 12 |
| `OrderExecutedMessage` | `messages.application` |  | 60 |
| `OrderExecutedWithPriceSizeMessage` | `messages.application` |  | 69 |
| `OrderModifiedMessage` | `messages.application` |  | 27 |
| `RecoveryTradeMessage` | `messages.application` |  | 92 |
| `StatisticsMessage` | `messages.application` |  | 23 |
| `SymbolDirectoryMessage` | `messages.application` |  | 87 |
| `SymbolStatusMessage` | `messages.application` |  | 32 |
| `SystemEventMessage` | `messages.application` |  | 5 |
| `TimeMessage` | `messages.application` |  | 4 |
| `TopOfBookMessage` | `messages.application` |  | 33 |
| `TradeBreakMessage` | `messages.application` |  | 13 |
| `TradeCorrectionMessage` | `messages.application` |  | 45 |
| `TradeMessage` | `messages.application` |  | 69 |
| `UpdatePricePointMessage` | `messages.application` |  | 34 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nairobi-nairobiequities-realtime-mitch-v1-22:build
```

Run the round trip alone:

```
gradle :nairobi-nairobiequities-realtime-mitch-v1-22:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :nairobi-nairobiequities-realtime-mitch-v1-22:captureTest -Pcapture=/path/to/capture.pcap
```

