# National Association of Securities Dealers Automated Quotations (Nasdaq) Last Sale Plus Itch v3.0

Generated Java parser for Nasdaq Last Sale Plus Itch v3.0.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nasdaq Stock Market](..).

## Usage

Gradle project `:nasdaq-nsmequities-nlsplus-itch-v3-0` builds package `omi.nasdaq.nsmequities.nlsplus.itch.v3_0`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application.AdjustedClosingPriceMessage;

AdjustedClosingPriceMessage message = new AdjustedClosingPriceMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.dispatch.PacketDecoder;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.Message;

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
| `AdjustedClosingPriceMessage` | `messages.application` | `'G'` | 13 |
| `EndOfDayTradeSummaryMessage` | `messages.application` | `'J'` | 33 |
| `IpoInformationMessage` | `messages.application` | `'I'` | 14 |
| `IpoQuotingPeriodUpdateMessage` | `messages.application` | `'K'` | 17 |
| `LongFormAdjustedClosingPriceMessage` | `messages.application` | `'g'` | 17 |
| `LongFormEndOfDayTradeSummaryMessage` | `messages.application` | `'j'` | 49 |
| `LongFormTradeCancelErrorMessage` | `messages.application` | `'x'` | 44 |
| `LongFormTradeCorrectionMessage` | `messages.application` | `'c'` | 70 |
| `LongFormTradeReportMessage` | `messages.application` | `'t'` | 44 |
| `MwcbDeclineLevelMessage` | `messages.application` | `'V'` | 24 |
| `MwcbStatusMessage` | `messages.application` | `'W'` | 1 |
| `NextSharesEndOfDayTradeSummaryMessage` | `messages.application` | `'N'` | 49 |
| `NextSharesTradeCancelErrorMessage` | `messages.application` | `'O'` | 44 |
| `NextSharesTradeCorrectionMessage` | `messages.application` | `'Z'` | 70 |
| `NextSharesTradeReportMessage` | `messages.application` | `'M'` | 44 |
| `OperationalHaltMessage` | `messages.application` | `'h'` | 10 |
| `RegShoShortSalePriceTestRestrictedIndicatorMessage` | `messages.application` | `'Y'` | 9 |
| `StockDirectoryMessage` | `messages.application` | `'R'` | 40 |
| `StockTradingActionMessage` | `messages.application` | `'H'` | 15 |
| `SystemEventMessage` | `messages.application` | `'S'` | 1 |
| `TradeCancelErrorMessage` | `messages.application` | `'X'` | 40 |
| `TradeCorrectionMessage` | `messages.application` | `'C'` | 62 |
| `TradeReportMessage` | `messages.application` | `'T'` | 40 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nasdaq-nsmequities-nlsplus-itch-v3-0:build
```

Run the round trip alone:

```
gradle :nasdaq-nsmequities-nlsplus-itch-v3-0:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :nasdaq-nsmequities-nlsplus-itch-v3-0:captureTest -Pcapture=/path/to/capture.pcap
```

