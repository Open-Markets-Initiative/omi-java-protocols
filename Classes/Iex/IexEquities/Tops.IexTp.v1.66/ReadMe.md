# Investors Exchange Top Of Book IexTp v1.66

Generated Java parser for Iex Top Of Book IexTp v1.66.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [IEX Equities](..).

## Usage

Gradle project `:iex-iexequities-tops-iextp-v1-66` builds package `omi.iex.iexequities.tops.iextp.v1_66`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.iex.iexequities.tops.iextp.v1_66.messages.application.AuctionInformationMessage;

AuctionInformationMessage message = new AuctionInformationMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.iex.iexequities.tops.iextp.v1_66.dispatch.PacketDecoder;
import omi.iex.iexequities.tops.iextp.v1_66.types.Message;

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
| `AuctionInformationMessage` | `messages.application` | `'A'` | 79 |
| `OfficialPriceMessage` | `messages.application` | `'X'` | 25 |
| `OperationalHaltStatusMessage` | `messages.application` | `'O'` | 17 |
| `QuoteUpdateMessage` | `messages.application` | `'Q'` | 41 |
| `RetailLiquidityIndicatorMessage` | `messages.application` | `'I'` | 17 |
| `SecurityDirectoryMessage` | `messages.application` | `'D'` | 30 |
| `ShortSalePriceTestStatusMessage` | `messages.application` | `'P'` | 18 |
| `SystemEventMessage` | `messages.application` | `'S'` | 9 |
| `TradeBreakMessage` | `messages.application` | `'B'` | 37 |
| `TradeReportMessage` | `messages.application` | `'T'` | 37 |
| `TradingStatusMessage` | `messages.application` | `'H'` | 21 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Iex/IexEquities.Tops.IexTp.v1.66` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :iex-iexequities-tops-iextp-v1-66:build
```

Run the round trip alone:

```
gradle :iex-iexequities-tops-iextp-v1-66:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :iex-iexequities-tops-iextp-v1-66:captureTest -Pcapture=/path/to/capture.pcap
```

