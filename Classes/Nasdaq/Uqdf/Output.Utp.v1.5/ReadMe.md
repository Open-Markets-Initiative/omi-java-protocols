# National Association of Securities Dealers Automated Quotations (Nasdaq) Output Utp v1.5

Generated Java parser for Nasdaq Output Utp v1.5.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nasdaq UTP Quote Data Feed](..).

## Usage

Gradle project `:nasdaq-uqdf-output-utp-v1-5` builds package `omi.nasdaq.uqdf.output.utp.v1_5`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.AuctionCollarMessage;

AuctionCollarMessage message = new AuctionCollarMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.nasdaq.uqdf.output.utp.v1_5.dispatch.PacketDecoder;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Message;

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
| `CrossSroTradingActionMessage` | `messages.application` | `'H'` | 56 |
| `EndOfDayMessage` | `messages.application` | `'J'` | 26 |
| `EndOfTransmissionsMessage` | `messages.application` | `'Z'` | 26 |
| `FinraAdfMarketParticipantQuotationMessage` | `messages.application` | `'M'` | 74 |
| `GeneralAdministrativeMessage` | `messages.application` | `'A'` | 28 |
| `IssueSymbolDirectoryMessage` | `messages.application` | `'B'` | 87 |
| `LimitUpLimitDownPriceBandMessage` | `messages.application` | `'P'` | 62 |
| `MarketCenterTradingActionMessage` | `messages.application` | `'K'` | 47 |
| `MarketSessionCloseMessage` | `messages.application` | `'C'` | 26 |
| `MarketSessionOpenMessage` | `messages.application` | `'O'` | 26 |
| `MarketWideCircuitBreakerDeclineLevelMessage` | `messages.application` | `'C'` | 50 |
| `MarketWideCircuitBreakerStatusMessage` | `messages.application` | `'D'` | 27 |
| `QuoteLongFormMessage` | `messages.application` | `'F'` | 76 |
| `QuoteShortFormMessage` | `messages.application` | `'E'` | 45 |
| `QuoteWipeOutMessage` | `messages.application` | `'P'` | 26 |
| `RegulationShoShortSalePriceTestRestrictedIndicatorMessage` | `messages.application` | `'V'` | 32 |
| `SessionCloseRecapMessage` | `messages.application` | `'R'` | 74 |
| `StartOfDayMessage` | `messages.application` | `'I'` | 26 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Nasdaq/Uqdf.Output.Utp.v1.5` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nasdaq-uqdf-output-utp-v1-5:build
```

Run the round trip alone:

```
gradle :nasdaq-uqdf-output-utp-v1-5:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :nasdaq-uqdf-output-utp-v1-5:captureTest -Pcapture=/path/to/capture.pcap
```

