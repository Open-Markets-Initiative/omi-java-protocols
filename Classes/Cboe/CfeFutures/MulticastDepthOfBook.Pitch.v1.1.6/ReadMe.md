# Chicago Board Options Exchange Futures Multicast Depth Of Book Pitch v1.1.6

Generated Java parser for Cboe Futures Multicast Depth Of Book Pitch v1.1.6.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Cboe Futures Exchange](..).

## Usage

Gradle project `:cboe-cfefutures-multicastdepthofbook-pitch-v1-1-6` builds package `omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application.AddOrderLongMessage;

AddOrderLongMessage message = new AddOrderLongMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.dispatch.PacketDecoder;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.Message;

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
| `AddOrderLongMessage` | `messages.application` |  | 31 |
| `AddOrderShortMessage` | `messages.application` |  | 23 |
| `DeleteOrderMessage` | `messages.application` |  | 12 |
| `EndOfDaySummaryMessage` | `messages.application` |  | 63 |
| `EndOfSessionMessage` | `messages.application` |  | 4 |
| `FuturesInstrumentDefinitionMessage` | `messages.application` |  | 39 |
| `ModifyOrderLongMessage` | `messages.application` |  | 24 |
| `ModifyOrderShortMessage` | `messages.application` |  | 16 |
| `OrderExecutedMessage` | `messages.application` |  | 25 |
| `ReduceSizeLongMessage` | `messages.application` |  | 16 |
| `ReduceSizeShortMessage` | `messages.application` |  | 14 |
| `SettlementMessage` | `messages.application` |  | 23 |
| `TimeMessage` | `messages.application` |  | 8 |
| `TimeReferenceMessage` | `messages.application` |  | 16 |
| `TradeBreakMessage` | `messages.application` |  | 12 |
| `TradeLongMessage` | `messages.application` |  | 40 |
| `TradeShortMessage` | `messages.application` |  | 32 |
| `TradingStatusMessage` | `messages.application` |  | 16 |
| `TransactionBegin` | `messages.application` |  | 4 |
| `TransactionEnd` | `messages.application` |  | 4 |
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
gradle :cboe-cfefutures-multicastdepthofbook-pitch-v1-1-6:build
```

Run the round trip alone:

```
gradle :cboe-cfefutures-multicastdepthofbook-pitch-v1-1-6:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :cboe-cfefutures-multicastdepthofbook-pitch-v1-1-6:captureTest -Pcapture=/path/to/capture.pcap
```

