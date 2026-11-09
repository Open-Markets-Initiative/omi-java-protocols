# Brasil, Bolsa, Balcão Binary Unified Market Data Feed Sbe v1.8

Generated Java parser for B3 Binary Unified Market Data Feed Sbe v1.8.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [B3 Derivatives](..).

## Usage

Gradle project `:b3-b3derivatives-binaryumdf-sbe-v1-8` builds package `omi.b3.b3derivatives.binaryumdf.sbe.v1_8`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.AuctionImbalance19Message;

AuctionImbalance19Message message = new AuctionImbalance19Message();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.dispatch.PacketDecoder;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Message;

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
| `AuctionImbalance19Message` | `messages.application` |  | 32 |
| `ChannelReset11Message` | `messages.application` |  | 12 |
| `ClosingPrice17Message` | `messages.application` |  | 36 |
| `DeleteOrderMbO51Message` | `messages.application` |  | 44 |
| `DeprecatedSecurityDefinitionMessage` | `messages.application` |  | 240 |
| `EmptyBookMessage` | `messages.application` |  | 20 |
| `ExecutionStatistics56Message` | `messages.application` |  | 52 |
| `ExecutionSummary55Message` | `messages.application` |  | 64 |
| `ForwardTrade54Message` | `messages.application` |  | 68 |
| `HighPrice24Message` | `messages.application` |  | 32 |
| `LastTradePrice27Message` | `messages.application` |  | 68 |
| `LowPrice25Message` | `messages.application` |  | 32 |
| `MassDeleteOrdersMbO52Message` | `messages.application` |  | 28 |
| `News5Message` | `messages.application` |  | 42 |
| `OpenInterest29Message` | `messages.application` |  | 32 |
| `OpeningPrice15Message` | `messages.application` |  | 44 |
| `OrderMbO50Message` | `messages.application` |  | 64 |
| `PriceBand20Message` | `messages.application` |  | 48 |
| `PriceBand22Message` | `messages.application` |  | 48 |
| `QuantityBand21Message` | `messages.application` |  | 40 |
| `SecurityDefinitionMessage` | `messages.application` |  | 240 |
| `SecurityGroupPhase10Message` | `messages.application` |  | 32 |
| `SecurityStatus3Message` | `messages.application` |  | 36 |
| `SequenceMessage` | `messages.application` |  | 4 |
| `SettlementPrice28Message` | `messages.application` |  | 36 |
| `SnapshotFullRefreshHeader30Message` | `messages.application` |  | 32 |
| `SnapshotFullRefreshOrdersMbO71Message` | `messages.application` |  | 11 |
| `TheoreticalOpeningPrice16Message` | `messages.application` |  | 40 |
| `Trade53Message` | `messages.application` |  | 56 |
| `TradeBust57Message` | `messages.application` |  | 48 |
| `SequenceResetMessage` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :b3-b3derivatives-binaryumdf-sbe-v1-8:build
```

Run the round trip alone:

```
gradle :b3-b3derivatives-binaryumdf-sbe-v1-8:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :b3-b3derivatives-binaryumdf-sbe-v1-8:captureTest -Pcapture=/path/to/capture.pcap
```

