# Giełda Papierów Wartościowych w Warszawie Warsaw Stock Exchange Full Depth Stream Wats v1.7.6.20

Generated Java parser for Gpw Warsaw Stock Exchange Full Depth Stream Wats v1.7.6.20.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Warsaw Stock Exchange](..).

## Usage

Gradle project `:gpw-wse-streamfulldepth-wats-v1-7-6-20` builds package `omi.gpw.wse.streamfulldepth.wats.v1_7_6_20`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application.AccruedInterestTableEntry;

AccruedInterestTableEntry message = new AccruedInterestTableEntry();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.dispatch.PacketDecoder;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Message;

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
| `AccruedInterestTableEntry` | `messages.application` |  | 16 |
| `AuctionSummary` | `messages.application` |  | 21 |
| `AuctionUpdate` | `messages.application` |  | 68 |
| `CalendarException` | `messages.application` |  | 9 |
| `CollarGroup` | `messages.application` |  | 20 |
| `CollarTableEntry` | `messages.application` |  | 54 |
| `ExternalUnderlying` | `messages.application` |  | 113 |
| `IndexParams` | `messages.application` |  | 145 |
| `IndexPortfolioEntry` | `messages.application` |  | 59 |
| `IndexSummary` | `messages.application` |  | 77 |
| `IndexationTableEntry` | `messages.application` |  | 16 |
| `Instrument` | `messages.application` |  | 699 |
| `InstrumentStatusChange` | `messages.application` |  | 11 |
| `InstrumentSummary` | `messages.application` |  | 95 |
| `MarketStructure` | `messages.application` |  | 63 |
| `News` | `messages.application` |  | 890 |
| `OrderAdd` | `messages.application` |  | 30 |
| `OrderBookEvent` | `messages.application` |  | 5 |
| `OrderCancel` | `messages.application` |  | 13 |
| `OrderCollars` | `messages.application` |  | 45 |
| `OrderExecute` | `messages.application` |  | 41 |
| `OrderModify` | `messages.application` |  | 30 |
| `PositionReport` | `messages.application` |  | 40 |
| `PriceLevelSnapshot` | `messages.application` |  | 317 |
| `PriceUpdate` | `messages.application` |  | 31 |
| `ProductSummary` | `messages.application` |  | 629 |
| `RealTimeIndex` | `messages.application` |  | 88 |
| `TestEvent` | `messages.application` |  | 201 |
| `TickTableEntry` | `messages.application` |  | 20 |
| `TopPriceLevelUpdate` | `messages.application` |  | 23 |
| `Trade` | `messages.application` |  | 178 |
| `TradeCollars` | `messages.application` |  | 29 |
| `TradingPhaseScheduleEntry` | `messages.application` |  | 40 |
| `TradingSessionStatus` | `messages.application` |  | 13 |
| `WeekPlan` | `messages.application` |  | 11 |
| `Heartbeat` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :gpw-wse-streamfulldepth-wats-v1-7-6-20:build
```

Run the round trip alone:

```
gradle :gpw-wse-streamfulldepth-wats-v1-7-6-20:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :gpw-wse-streamfulldepth-wats-v1-7-6-20:captureTest -Pcapture=/path/to/capture.pcap
```

