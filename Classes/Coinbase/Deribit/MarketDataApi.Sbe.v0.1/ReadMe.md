# Coinbase Market Data Api Sbe v0.1

Generated Java parser for Coinbase Market Data Api Sbe v0.1.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Deribit](..).

## Usage

Gradle project `:coinbase-deribit-marketdataapi-sbe-v0-1` builds package `omi.coinbase.deribit.marketdataapi.sbe.v0_1`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.messages.application.AskDeleteMessage;

AskDeleteMessage message = new AskDeleteMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.dispatch.PacketDecoder;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.types.Message;

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
| `AskDeleteMessage` | `messages.application` |  | 16 |
| `AskPutMessage` | `messages.application` |  | 32 |
| `AskQtyReducedMessage` | `messages.application` |  | 24 |
| `BidDeleteMessage` | `messages.application` |  | 16 |
| `BidPutMessage` | `messages.application` |  | 32 |
| `BidQtyReducedMessage` | `messages.application` |  | 24 |
| `BlockTradeMessage` | `messages.application` |  | 78 |
| `EndOfCycleMessage` | `messages.application` |  | 4 |
| `InstrumentInfoMessage` | `messages.application` |  | 40 |
| `InstrumentMessage` | `messages.application` |  | 303 |
| `InstrumentRefMessage` | `messages.application` |  | 48 |
| `RetransmitRejectMessage` | `messages.application` |  | 49 |
| `RetransmitRequestMessage` | `messages.application` |  | 9 |
| `SnapshotHeaderMessage` | `messages.application` |  | 24 |
| `SnapshotTrailerMessage` | `messages.application` |  | 24 |
| `TradeMessage` | `messages.application` |  | 44 |
| `TradeSummaryMessage` | `messages.application` |  | 60 |
| `TradingStatusUpdateMessage` | `messages.application` |  | 9 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :coinbase-deribit-marketdataapi-sbe-v0-1:build
```

Run the round trip alone:

```
gradle :coinbase-deribit-marketdataapi-sbe-v0-1:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :coinbase-deribit-marketdataapi-sbe-v0-1:captureTest -Pcapture=/path/to/capture.pcap
```

