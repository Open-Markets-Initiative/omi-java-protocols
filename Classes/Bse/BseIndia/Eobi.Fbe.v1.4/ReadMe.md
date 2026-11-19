# BSE Limited Enhanced Order Book Interface Fbe v1.4

Generated Java parser for Bse Enhanced Order Book Interface Fbe v1.4.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [BSE India](..).

## Usage

Gradle project `:bse-bseindia-eobi-fbe-v1-4` builds package `omi.bse.bseindia.eobi.fbe.v1_4`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.bse.bseindia.eobi.fbe.v1_4.messages.application.AddComplexInstrumentMessage;

AddComplexInstrumentMessage message = new AddComplexInstrumentMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.bse.bseindia.eobi.fbe.v1_4.dispatch.PacketDecoder;
import omi.bse.bseindia.eobi.fbe.v1_4.types.Message;

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
| `AddComplexInstrumentMessage` | `messages.application` |  | 104 |
| `AuctionBestBidOfferMessage` | `messages.application` |  | 32 |
| `AuctionClearingPriceMessage` | `messages.application` |  | 32 |
| `ExecutionSummaryMessage` | `messages.application` |  | 56 |
| `FullOrderExecutionMessage` | `messages.application` |  | 56 |
| `HeartbeatMessage` | `messages.application` |  | 8 |
| `InstrumentInfoMessage` | `messages.application` |  | 40 |
| `InstrumentStateChangeMessage` | `messages.application` |  | 24 |
| `InstrumentSummaryMessage` | `messages.application` |  | 408 |
| `LppRangeMessage` | `messages.application` |  | 24 |
| `OrderAddMessage` | `messages.application` |  | 48 |
| `OrderDeleteMessage` | `messages.application` |  | 56 |
| `OrderMassDeleteMessage` | `messages.application` |  | 16 |
| `OrderModifyMessage` | `messages.application` |  | 72 |
| `OrderModifySamePriorityMessage` | `messages.application` |  | 64 |
| `PartialOrderExecutionMessage` | `messages.application` |  | 56 |
| `ProductStateChangeMessage` | `messages.application` |  | 16 |
| `ProductSummaryMessage` | `messages.application` |  | 8 |
| `SnapshotOrderMessage` | `messages.application` |  | 32 |
| `TopOfBookMessage` | `messages.application` |  | 32 |
| `TradeReversalMessage` | `messages.application` |  | 416 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :bse-bseindia-eobi-fbe-v1-4:build
```

Run the round trip alone:

```
gradle :bse-bseindia-eobi-fbe-v1-4:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :bse-bseindia-eobi-fbe-v1-4:captureTest -Pcapture=/path/to/capture.pcap
```

