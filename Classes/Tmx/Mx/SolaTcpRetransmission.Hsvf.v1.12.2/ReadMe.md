# TMX Group Sola Tcp Retransmission Hsvf v1.12.2

Generated Java parser for Tmx Sola Tcp Retransmission Hsvf v1.12.2.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Montreal Exchange](..).

## Usage

Gradle project `:tmx-mx-solatcpretransmission-hsvf-v1-12-2` builds package `omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.messages.application.BeginningOfFutureOptionsSummaryMessage;

BeginningOfFutureOptionsSummaryMessage message = new BeginningOfFutureOptionsSummaryMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.dispatch.ClientPacketStream;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.Message;

ClientPacketStream stream = new ClientPacketStream();
for (ClientPacketStream.Record record : stream.append(bytes, 0, bytes.length)) {
    for (Message message : record.decoded().messages()) {
        System.out.println(message);
    }
}
```

Each side of the connection has its own stream: `ClientPacketStream`, `ServerPacketStream`. A record stating a length that is not valid fails the stream, which then reads nothing more.

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `BeginningOfFutureOptionsSummaryMessage` | `messages.application` |  | 13 |
| `BeginningOfFuturesSummaryMessage` | `messages.application` |  | 13 |
| `BeginningOfOptionsSummaryMessage` | `messages.application` |  | 13 |
| `BeginningOfStrategySummaryMessage` | `messages.application` |  | 13 |
| `BulletinsMessage` | `messages.application` |  | 94 |
| `CircuitAssuranceMessage` | `messages.application` |  | 18 |
| `EndOfSalesMessage` | `messages.application` |  | 19 |
| `EndOfTransmissionMessage` | `messages.application` |  | 19 |
| `ErrorMessage` | `messages.application` |  | 84 |
| `FutureOptionsInstrumentKeysMessage` | `messages.application` |  | 145 |
| `FutureOptionsMarketDepthMessage` | `messages.application` |  | 35 |
| `FutureOptionsQuoteMessage` | `messages.application` |  | 61 |
| `FutureOptionsRequestForQuoteRfqMessage` | `messages.application` |  | 42 |
| `FutureOptionsSummaryMessage` | `messages.application` |  | 141 |
| `FutureOptionsTradeCancellationMessage` | `messages.application` |  | 75 |
| `FutureOptionsTradeMessage` | `messages.application` |  | 84 |
| `FuturesInstrumentKeysMessage` | `messages.application` |  | 147 |
| `FuturesMarketDepthMessage` | `messages.application` |  | 26 |
| `FuturesQuoteMessage` | `messages.application` |  | 51 |
| `FuturesRequestForQuoteRfqMessage` | `messages.application` |  | 33 |
| `FuturesSummaryMessage` | `messages.application` |  | 137 |
| `FuturesTradeCancellationMessage` | `messages.application` |  | 64 |
| `FuturesTradeCorrectionMessage` | `messages.application` |  | 73 |
| `FuturesTradeMessage` | `messages.application` |  | 73 |
| `GroupStatusMessage` | `messages.application` |  | 20 |
| `GroupStatusStrategiesMessage` | `messages.application` |  | 16 |
| `InstrumentScheduleNoticeFutureMessage` | `messages.application` |  | 31 |
| `InstrumentScheduleNoticeFuturesOptionMessage` | `messages.application` |  | 40 |
| `InstrumentScheduleNoticeOptionMessage` | `messages.application` |  | 40 |
| `InstrumentScheduleNoticeStrategyMessage` | `messages.application` |  | 50 |
| `LoginMessage` | `messages.application` |  | 40 |
| `OptionInstrumentKeysMessage` | `messages.application` |  | 145 |
| `OptionMarketDepthMessage` | `messages.application` |  | 35 |
| `OptionQuoteMessage` | `messages.application` |  | 61 |
| `OptionRequestForQuoteRfqMessage` | `messages.application` |  | 42 |
| `OptionSummaryMessage` | `messages.application` |  | 141 |
| `OptionTradeCancellationMessage` | `messages.application` |  | 74 |
| `OptionTradeMessage` | `messages.application` |  | 83 |
| `RetransmissionRequestMessage` | `messages.application` |  | 20 |
| `StrategyInstrumentKeysMessage` | `messages.application` |  | 127 |
| `StrategyMarketDepthMessage` | `messages.application` |  | 45 |
| `StrategyQuoteMessage` | `messages.application` |  | 72 |
| `StrategyRequestForQuoteRfqMessage` | `messages.application` |  | 52 |
| `StrategySummaryMessage` | `messages.application` |  | 125 |
| `StrategyTradeCancellationMessage` | `messages.application` |  | 84 |
| `StrategyTradeMessage` | `messages.application` |  | 93 |
| `TickTableMessage` | `messages.application` |  | 67 |
| `UnderlyingInstrumentKeysMessage` | `messages.application` |  | 49 |
| `LogoutMessage` | `messages.application` |  | 0 |
| `LoginAcknowledgementMessage` | `messages.application` |  | 0 |
| `LogoutAcknowledgementMessage` | `messages.application` |  | 0 |
| `RetransmissionBeginMessage` | `messages.application` |  | 0 |
| `RetransmissionEndMessage` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :tmx-mx-solatcpretransmission-hsvf-v1-12-2:build
```

Run the round trip alone:

```
gradle :tmx-mx-solatcpretransmission-hsvf-v1-12-2:roundTrip
```

