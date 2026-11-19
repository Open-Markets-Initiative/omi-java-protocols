# Financial Industry Regulatory Authority Trade Data Dissemination Service Dfi v2.1

Generated Java parser for Finra Trade Data Dissemination Service Dfi v2.1.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Finra ORF](..).

## Usage

Gradle project `:finra-finraorf-tdds-dfi-v2-1` builds package `omi.finra.finraorf.tdds.dfi.v2_1`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.finra.finraorf.tdds.dfi.v2_1.messages.application.ClosingTradeSummaryReportMessage;

ClosingTradeSummaryReportMessage message = new ClosingTradeSummaryReportMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.finra.finraorf.tdds.dfi.v2_1.dispatch.PacketDecoder;
import omi.finra.finraorf.tdds.dfi.v2_1.types.Message;

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
| `ClosingTradeSummaryReportMessage` | `messages.application` | `'2'` | 114 |
| `EndOfDayMessage` | `messages.application` | `'J'` | 33 |
| `EndOfRetransmissionRequestsMessage` | `messages.application` | `'K'` | 33 |
| `EndOfTradeReportingMessage` | `messages.application` | `'X'` | 33 |
| `EndOfTransmissionsMessage` | `messages.application` | `'Z'` | 33 |
| `GeneralAdministrativeMessage` | `messages.application` | `'A'` | 33 |
| `LineIntegrityMessage` | `messages.application` | `'T'` | 33 |
| `MarketSessionCloseMessage` | `messages.application` | `'C'` | 33 |
| `MarketSessionOpenMessage` | `messages.application` | `'O'` | 33 |
| `MarketWideCircuitBreakerEventMessage` | `messages.application` | `'M'` | 63 |
| `SequenceNumberResetMessage` | `messages.application` | `'L'` | 33 |
| `StartOfDayMessage` | `messages.application` | `'I'` | 33 |
| `TradeCancelErrorMessage` | `messages.application` | `'7'` | 162 |
| `TradeCorrectionMessage` | `messages.application` | `'8'` | 216 |
| `TradeReportLongFormMessage` | `messages.application` | `'6'` | 110 |
| `TradeReportShortFormMessage` | `messages.application` | `'5'` | 53 |
| `TradingActionMessage` | `messages.application` | `'H'` | 77 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :finra-finraorf-tdds-dfi-v2-1:build
```

Run the round trip alone:

```
gradle :finra-finraorf-tdds-dfi-v2-1:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :finra-finraorf-tdds-dfi-v2-1:captureTest -Pcapture=/path/to/capture.pcap
```

