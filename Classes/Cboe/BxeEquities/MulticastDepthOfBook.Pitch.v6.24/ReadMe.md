# Chicago Board Options Exchange Multicast Depth Of Book Pitch v6.24

Generated Java parser for Cboe Multicast Depth Of Book Pitch v6.24.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Cboe BXE](..).

## Usage

Gradle project `:cboe-bxeequities-multicastdepthofbook-pitch-v6-24` builds package `omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_24`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_24.messages.application.AddOrderExpandedMessage;

AddOrderExpandedMessage message = new AddOrderExpandedMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_24.dispatch.PacketDecoder;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_24.types.Message;

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
| `AddOrderExpandedMessage` | `messages.application` |  | 38 |
| `AddOrderLongMessage` | `messages.application` |  | 33 |
| `AddOrderShortMessage` | `messages.application` |  | 23 |
| `AuctionSummaryMessage` | `messages.application` |  | 25 |
| `AuctionUpdateMessage` | `messages.application` |  | 35 |
| `DeleteOrderMessage` | `messages.application` |  | 12 |
| `EndOfSessionMessage` | `messages.application` |  | 4 |
| `ModifyOrderLongMessage` | `messages.application` |  | 24 |
| `ModifyOrderShortMessage` | `messages.application` |  | 16 |
| `OrderExecutedAtPriceSizeMessage` | `messages.application` |  | 40 |
| `OrderExecutedMessage` | `messages.application` |  | 28 |
| `ReduceSizeLongMessage` | `messages.application` |  | 16 |
| `ReduceSizeShortMessage` | `messages.application` |  | 14 |
| `StatisticsMessage` | `messages.application` |  | 22 |
| `TimeMessage` | `messages.application` |  | 4 |
| `TradeExtendedMessage` | `messages.application` |  | 66 |
| `TradeLongMessage` | `messages.application` |  | 46 |
| `TradeShortMessage` | `messages.application` |  | 36 |
| `TradeUnknownSymbolMessage` | `messages.application` |  | 70 |
| `TradingStatusMessage` | `messages.application` |  | 16 |
| `TransactionBeginMessage` | `messages.application` |  | 4 |
| `TransactionEndMessage` | `messages.application` |  | 4 |
| `UnitClearMessage` | `messages.application` |  | 4 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :cboe-bxeequities-multicastdepthofbook-pitch-v6-24:build
```

Run the round trip alone:

```
gradle :cboe-bxeequities-multicastdepthofbook-pitch-v6-24:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :cboe-bxeequities-multicastdepthofbook-pitch-v6-24:captureTest -Pcapture=/path/to/capture.pcap
```

