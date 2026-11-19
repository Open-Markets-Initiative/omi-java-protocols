# National Association of Securities Dealers Automated Quotations (Nasdaq) Output Utp v3.0.c

Generated Java parser for Nasdaq Output Utp v3.0.c.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nasdaq UTP Trade Data Feed](..).

## Usage

Gradle project `:nasdaq-utdf-output-utp-v3-0-c` builds package `omi.nasdaq.utdf.output.utp.v3_0_c`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nasdaq.utdf.output.utp.v3_0_c.messages.application.AuctionCollarMessage;

AuctionCollarMessage message = new AuctionCollarMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.nasdaq.utdf.output.utp.v3_0_c.dispatch.PacketDecoder;
import omi.nasdaq.utdf.output.utp.v3_0_c.types.Message;

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
| `AuctionCollarMessage` | `messages.application` | `'E'` | 66 |
| `ClosingTradeSummaryReportMessage` | `messages.application` | `'U'` | 73 |
| `CrossSroTradingActionMessage` | `messages.application` | `'H'` | 56 |
| `EndOfConsolidatedLastSaleEligibilityMessage` | `messages.application` | `'S'` | 26 |
| `EndOfDayMessage` | `messages.application` | `'J'` | 26 |
| `EndOfTradeReportingMessage` | `messages.application` | `'X'` | 26 |
| `EndOfTransmissionsMessage` | `messages.application` | `'Z'` | 26 |
| `FractionalAsOfTradeMessage` | `messages.application` | `'Q'` | 85 |
| `FractionalTradeCancelErrorMessage` | `messages.application` | `'O'` | 143 |
| `FractionalTradeCorrectionMessage` | `messages.application` | `'P'` | 173 |
| `FractionalTradeReportMessageLongFormMessage` | `messages.application` | `'N'` | 78 |
| `FractionalTradeReportMessageShortFormMessage` | `messages.application` | `'M'` | 64 |
| `GeneralAdministrativeMessage` | `messages.application` | `'A'` | 28 |
| `IssueSymbolDirectoryMessage` | `messages.application` | `'B'` | 87 |
| `LimitUpLimitDownPriceBandMessage` | `messages.application` | `'P'` | 62 |
| `MarketCenterTradingActionMessage` | `messages.application` | `'K'` | 47 |
| `MarketSessionCloseMessage` | `messages.application` | `'C'` | 26 |
| `MarketSessionOpenMessage` | `messages.application` | `'O'` | 26 |
| `MarketWideCircuitBreakerDeclineLevelMessage` | `messages.application` | `'C'` | 50 |
| `MarketWideCircuitBreakerStatusMessage` | `messages.application` | `'D'` | 27 |
| `PriorDayAsOfTradeMessage` | `messages.application` | `'H'` | 81 |
| `RegShoShortSalePriceTestRestrictedIndicatorMessage` | `messages.application` | `'V'` | 38 |
| `StartOfDayMessage` | `messages.application` | `'I'` | 26 |
| `TotalConsolidatedAndMarketCenterVolumeMessage` | `messages.application` | `'V'` | 36 |
| `TradeCancelErrorMessage` | `messages.application` | `'Z'` | 139 |
| `TradeCorrectionMessage` | `messages.application` | `'Y'` | 165 |
| `TradeReportMessageLongFormMessage` | `messages.application` | `'W'` | 74 |
| `TradeReportMessageShortFormMessage` | `messages.application` | `'A'` | 58 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nasdaq-utdf-output-utp-v3-0-c:build
```

Run the round trip alone:

```
gradle :nasdaq-utdf-output-utp-v3-0-c:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :nasdaq-utdf-output-utp-v3-0-c:captureTest -Pcapture=/path/to/capture.pcap
```

