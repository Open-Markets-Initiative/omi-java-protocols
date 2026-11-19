# New York Stock Exchange Top Feed Xdp v1.3.a

Generated Java parser for Nyse Top Feed Xdp v1.3.a.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nyse Amex Options](..).

## Usage

Gradle project `:nyse-amexoptions-topfeed-xdp-v1-3-a` builds package `omi.nyse.amexoptions.topfeed.xdp.v1_3_a`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.messages.application.OutrightBoldRfqMessage;

OutrightBoldRfqMessage message = new OutrightBoldRfqMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.dispatch.PacketDecoder;
import omi.nyse.amexoptions.topfeed.xdp.v1_3_a.types.Message;

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
| `OutrightBoldRfqMessage` | `messages.application` |  | 28 |
| `OutrightCrossingRfqMessage` | `messages.application` |  | 24 |
| `OutrightImbalanceMessage` | `messages.application` |  | 32 |
| `OutrightQuoteMessage` | `messages.application` |  | 36 |
| `OutrightSeriesStatusMessage` | `messages.application` |  | 20 |
| `OutrightSummaryMessage` | `messages.application` |  | 36 |
| `OutrightTradeCancelMessage` | `messages.application` |  | 20 |
| `OutrightTradeCorrectionMessage` | `messages.application` |  | 36 |
| `OutrightTradeMessage` | `messages.application` |  | 32 |
| `RefreshOutrightImbalanceMessage` | `messages.application` |  | 32 |
| `RefreshOutrightQuoteMessage` | `messages.application` |  | 36 |
| `RefreshOutrightTradeMessage` | `messages.application` |  | 32 |
| `SequenceNumberResetMessage` | `messages.application` |  | 10 |
| `SeriesIndexMappingMessage` | `messages.application` |  | 56 |
| `StreamIdMessage` | `messages.application` |  | 4 |
| `UnderlyingIndexMappingMessage` | `messages.application` |  | 24 |
| `UnderlyingStatusMessage` | `messages.application` |  | 20 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Nyse/AmexOptions.TopFeed.Xdp.v1.3.a` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nyse-amexoptions-topfeed-xdp-v1-3-a:build
```

Run the round trip alone:

```
gradle :nyse-amexoptions-topfeed-xdp-v1-3-a:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :nyse-amexoptions-topfeed-xdp-v1-3-a:captureTest -Pcapture=/path/to/capture.pcap
```

