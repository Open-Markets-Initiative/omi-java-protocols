# The Securities Industry Automation Corporation Output Cta v2.9

Generated Java parser for Siac Output Cta v2.9.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Consolidated Tape System](..).

## Usage

Gradle project `:siac-cts-output-cta-v2-9` builds package `omi.siac.cts.output.cta.v2_9`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.siac.cts.output.cta.v2_9.messages.application.ApproximateAdjustedVolumeMarketCenterMessage;

ApproximateAdjustedVolumeMarketCenterMessage message = new ApproximateAdjustedVolumeMarketCenterMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.siac.cts.output.cta.v2_9.dispatch.PacketDecoder;
import omi.siac.cts.output.cta.v2_9.types.Message;

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
| `ApproximateAdjustedVolumeMarketCenterMessage` | `messages.application` | `'N'` | 23 |
| `ApproximateTradesAndTotalDollarValueMessage` | `messages.application` | `'O'` | 34 |
| `AuctionStatusMessage` | `messages.application` | `'A'` | 124 |
| `BidAndOfferIndexMessage` | `messages.application` | `'Q'` | 49 |
| `ConsolidatedEndOfDaySummaryMessage` | `messages.application` | `'C'` | 75 |
| `ConsolidatedStartOfDaySummaryMessage` | `messages.application` | `'A'` | 51 |
| `CrossingSessionSummaryMessage` | `messages.application` | `'P'` | 46 |
| `DisasterRecoveryDataCenterActivationMessage` | `messages.application` | `'P'` | 22 |
| `EndOfDayMessage` | `messages.application` | `'Z'` | 22 |
| `EndOfEndOfDayMessage` | `messages.application` | `'B'` | 22 |
| `EndOfStartOfDayMessage` | `messages.application` | `'D'` | 22 |
| `IndexMessage` | `messages.application` | `'I'` | 41 |
| `LineIntegrityMessage` | `messages.application` | `'T'` | 22 |
| `LongTradeMessage` | `messages.application` | `'L'` | 68 |
| `MarketWideCircuitBreakerDeclineLevelStatusMessage` | `messages.application` | `'K'` | 47 |
| `MarketWideCircuitBreakerStatusMessage` | `messages.application` | `'L'` | 24 |
| `ParticipantEndOfDaySummaryMessage` | `messages.application` | `'D'` | 80 |
| `ParticipantStartOfDaySummaryMessage` | `messages.application` | `'B'` | 47 |
| `PriorDayTradeCancelErrorMessage` | `messages.application` | `'X'` | 64 |
| `PriorDayTradeCorrectionMessage` | `messages.application` | `'C'` | 91 |
| `PriorDayTradeMessage` | `messages.application` | `'T'` | 63 |
| `ResetBlockSequenceNumberMessage` | `messages.application` | `'L'` | 22 |
| `ShortTradeMessage` | `messages.application` | `'T'` | 36 |
| `StartOfDayMessage` | `messages.application` | `'A'` | 22 |
| `StartOfEndOfDayMessage` | `messages.application` | `'A'` | 22 |
| `StartOfStartOfDayMessage` | `messages.application` | `'C'` | 22 |
| `TradeCancelErrorMessage` | `messages.application` | `'X'` | 149 |
| `TradeCorrectionMessage` | `messages.application` | `'C'` | 184 |
| `TradingStatusMessage` | `messages.application` | `'S'` | 72 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Siac/Cts.Output.Cta.v2.9` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :siac-cts-output-cta-v2-9:build
```

Run the round trip alone:

```
gradle :siac-cts-output-cta-v2-9:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :siac-cts-output-cta-v2-9:captureTest -Pcapture=/path/to/capture.pcap
```

