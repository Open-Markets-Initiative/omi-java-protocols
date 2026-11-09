# The Securities Industry Automation Corporation Cta v2.10.a

Generated Java parser for Siac Cta v2.10.a.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Consolidated Quotation System](..).

## Usage

Gradle project `:siac-cqs-output-cta-v2-10-a` builds package `omi.siac.cqs.output.cta.v2_10_a`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.siac.cqs.output.cta.v2_10_a.messages.application.AuctionStatusMessage;

AuctionStatusMessage message = new AuctionStatusMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.siac.cqs.output.cta.v2_10_a.dispatch.PacketDecoder;
import omi.siac.cqs.output.cta.v2_10_a.types.Message;

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
| `AuctionStatusMessage` | `messages.application` | `'A'` | 124 |
| `DisasterRecoveryDataCenterActivationMessage` | `messages.application` | `'P'` | 22 |
| `EndOfDayMessage` | `messages.application` | `'Z'` | 22 |
| `FinraCloseMessage` | `messages.application` | `'C'` | 22 |
| `FinraOpenMessage` | `messages.application` | `'O'` | 22 |
| `LineIntegrityMessage` | `messages.application` | `'T'` | 22 |
| `LongQuoteMessage` | `messages.application` | `'L'` | 83 |
| `MarketWideCircuitBreakerDeclineLevelStatusMessage` | `messages.application` | `'K'` | 47 |
| `MarketWideCircuitBreakerStatusMessage` | `messages.application` | `'L'` | 24 |
| `ResetBlockSequenceNumberMessage` | `messages.application` | `'L'` | 22 |
| `ShortQuoteMessage` | `messages.application` | `'Q'` | 43 |
| `SpecialLongQuoteMessage` | `messages.application` | `'S'` | 116 |
| `StartOfDayMessage` | `messages.application` | `'A'` | 22 |
| `SymbolReferenceDataMessage` | `messages.application` | `'S'` | 205 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Siac/Cqs.Output.Cta.v2.10.a` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :siac-cqs-output-cta-v2-10-a:build
```

Run the round trip alone:

```
gradle :siac-cqs-output-cta-v2-10-a:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :siac-cqs-output-cta-v2-10-a:captureTest -Pcapture=/path/to/capture.pcap
```

