# New York Stock Exchange Xdp v2.4.b

Generated Java parser for Nyse Xdp v2.4.b.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [NYSE Consolidated](..).

## Usage

Gradle project `:nyse-nyseconsolidated-bqt-xdp-v2-4-b` builds package `omi.nyse.nyseconsolidated.bqt.xdp.v2_4_b`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_b.messages.application.BestQuotesMessage;

BestQuotesMessage message = new BestQuotesMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_b.dispatch.PacketDecoder;
import omi.nyse.nyseconsolidated.bqt.xdp.v2_4_b.types.Message;

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
| `BestQuotesMessage` | `messages.application` |  | 31 |
| `ConsolidatedFractionalStockSummaryMessage` | `messages.application` |  | 62 |
| `ConsolidatedFractionalVolumeMessage` | `messages.application` |  | 18 |
| `ConsolidatedSingleSidedQuoteMessage` | `messages.application` |  | 21 |
| `ConsolidatedTradeCancelMessage` | `messages.application` |  | 22 |
| `ConsolidatedTradeCorrectionMessage` | `messages.application` |  | 38 |
| `ConsolidatedTradeMessage` | `messages.application` |  | 34 |
| `HeartbeatResponseMessage` | `messages.application` |  | 10 |
| `MessageUnavailableMessage` | `messages.application` |  | 10 |
| `RefreshHeaderMessage` | `messages.application` |  | 4 |
| `RefreshRequestMessage` | `messages.application` |  | 16 |
| `RequestResponseMessage` | `messages.application` |  | 25 |
| `RetransmissionRequestMessage` | `messages.application` |  | 20 |
| `SecurityStatusMessage` | `messages.application` |  | 42 |
| `SequenceNumberResetMessage` | `messages.application` |  | 10 |
| `SourceTimeReferenceMessage` | `messages.application` |  | 12 |
| `SymbolClearMessage` | `messages.application` |  | 18 |
| `SymbolIndexMappingMessage` | `messages.application` |  | 40 |
| `SymbolIndexMappingRequestMessage` | `messages.application` |  | 17 |
| `TrfFractionalPriorDayTradeCancelMessage` | `messages.application` |  | 40 |
| `TrfFractionalPriorDayTradeMessage` | `messages.application` |  | 44 |
| `TrfFractionalTradeCorrectionMessage` | `messages.application` |  | 50 |
| `TrfFractionalTradeMessage` | `messages.application` |  | 46 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nyse-nyseconsolidated-bqt-xdp-v2-4-b:build
```

Run the round trip alone:

```
gradle :nyse-nyseconsolidated-bqt-xdp-v2-4-b:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :nyse-nyseconsolidated-bqt-xdp-v2-4-b:captureTest -Pcapture=/path/to/capture.pcap
```

