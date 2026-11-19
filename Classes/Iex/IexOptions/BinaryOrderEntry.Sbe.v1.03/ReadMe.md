# Investors Exchange Binary Order Entry Sbe v1.03

Generated Java parser for Iex Binary Order Entry Sbe v1.03.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [IEX Options](..).

## Usage

Gradle project `:iex-iexoptions-binaryorderentry-sbe-v1-03` builds package `omi.iex.iexoptions.binaryorderentry.sbe.v1_03`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application.ApplicationLayerRejectMessage;

ApplicationLayerRejectMessage message = new ApplicationLayerRejectMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.dispatch.ClientPacketStream;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Message;

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
| `ApplicationLayerRejectMessage` | `messages.application` |  | 47 |
| `BulkQuoteAckMessage` | `messages.application` |  | 32 |
| `ExecutionReportMessage` | `messages.application` |  | 154 |
| `GatewayHeartbeatMessage` | `messages.application` |  | 3 |
| `InstrumentRefDataMessage` | `messages.application` |  | 59 |
| `LoginRequestMessage` | `messages.application` |  | 48 |
| `LoginResponseMessage` | `messages.application` |  | 17 |
| `MarketMakerSymbolAppointmentMessage` | `messages.application` |  | 26 |
| `MassCancelAckMessage` | `messages.application` |  | 33 |
| `MassCancelRequestMessage` | `messages.application` |  | 27 |
| `MpidConfigurationAcknowledgementMessage` | `messages.application` |  | 76 |
| `NewBulkQuoteMessage` | `messages.application` |  | 33 |
| `NewIocQuoteAckMessage` | `messages.application` |  | 51 |
| `NewOrderSingleMessage` | `messages.application` |  | 92 |
| `OrderAckMessage` | `messages.application` |  | 139 |
| `OrderCancelAckMessage` | `messages.application` |  | 55 |
| `OrderCancelReplaceRequestMessage` | `messages.application` |  | 100 |
| `OrderCancelRequestMessage` | `messages.application` |  | 24 |
| `PurgeAckMessage` | `messages.application` |  | 33 |
| `PurgeRequestMessage` | `messages.application` |  | 28 |
| `QuoteCanceledMessage` | `messages.application` |  | 39 |
| `QuoteRestatedMessage` | `messages.application` |  | 43 |
| `RiskActionRequestMessage` | `messages.application` |  | 20 |
| `RiskControlAcknowledgmentMessage` | `messages.application` |  | 50 |
| `RiskControlAlertMessage` | `messages.application` |  | 34 |
| `RiskLimitUpdateRequestMessage` | `messages.application` |  | 36 |
| `SequencedMessageHeaderMessage` | `messages.application` |  | 20 |
| `SessionConfigurationAcknowledgementMessage` | `messages.application` |  | 35 |
| `SubsessionJoinMessage` | `messages.application` |  | 16 |
| `SubsessionJoinResponseMessage` | `messages.application` |  | 9 |
| `SubsessionLeaveMessage` | `messages.application` |  | 8 |
| `SubsessionLeaveResponseMessage` | `messages.application` |  | 9 |
| `TerminateMessage` | `messages.application` |  | 1 |
| `TradeBustCorrectMessage` | `messages.application` |  | 86 |
| `UnderlyingRefDataMessage` | `messages.application` |  | 25 |
| `UnsolicitedModifyAckMessage` | `messages.application` |  | 67 |
| `ClientHeartbeatMessage` | `messages.application` |  | 0 |
| `LogoutRequestMessage` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :iex-iexoptions-binaryorderentry-sbe-v1-03:build
```

Run the round trip alone:

```
gradle :iex-iexoptions-binaryorderentry-sbe-v1-03:roundTrip
```

