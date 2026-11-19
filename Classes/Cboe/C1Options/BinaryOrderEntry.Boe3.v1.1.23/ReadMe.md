# Chicago Board Options Exchange Binary Order Entry Boe3 v1.1.23

Generated Java parser for Cboe Binary Order Entry Boe3 v1.1.23.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Cboe C1 Options](..).

## Usage

Gradle project `:cboe-c1options-binaryorderentry-boe3-v1-1-23` builds package `omi.cboe.c1options.binaryorderentry.boe3.v1_1_23`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.AddFloorTradeMessage;

AddFloorTradeMessage message = new AddFloorTradeMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `FirmPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.dispatch.FirmPacketStream;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.Message;

FirmPacketStream stream = new FirmPacketStream();
for (FirmPacketStream.Record record : stream.append(bytes, 0, bytes.length)) {
    for (Message message : record.decoded().messages()) {
        System.out.println(message);
    }
}
```

Each side of the connection has its own stream: `FirmPacketStream`, `ExchangePacketStream`. A record stating a length that is not valid fails the stream, which then reads nothing more.

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `AddFloorTradeMessage` | `messages.application` |  | 123 |
| `AddFloorTradeRejectedMessage` | `messages.application` |  | 91 |
| `CancelOrderMessage` | `messages.application` |  | 30 |
| `CancelRejectedMessage` | `messages.application` |  | 99 |
| `CarriedRestatementMessage` | `messages.application` |  | 240 |
| `ComplexQuoteExecutionMessage` | `messages.application` |  | 93 |
| `ComplexQuoteUpdateMessage` | `messages.application` |  | 60 |
| `ComplexQuoteUpdateShortMessage` | `messages.application` |  | 40 |
| `CrossOrderAcknowledgmentMessage` | `messages.application` |  | 71 |
| `CrossOrderCancelledMessage` | `messages.application` |  | 36 |
| `CrossOrderRejectedMessage` | `messages.application` |  | 95 |
| `DeleteFloorTradeAcknowledgementMessage` | `messages.application` |  | 38 |
| `DeleteFloorTradeMessage` | `messages.application` |  | 52 |
| `DeleteFloorTradeRejectedMessage` | `messages.application` |  | 99 |
| `DoneForDayMessage` | `messages.application` |  | 46 |
| `FloorOrderRepresentedMessage` | `messages.application` |  | 50 |
| `FloorTradeConfirmationMessage` | `messages.application` |  | 60 |
| `FloorTradeConfirmationRejectedMessage` | `messages.application` |  | 99 |
| `FloorTradeNotificationMessage` | `messages.application` |  | 69 |
| `LoginRequestMessage` | `messages.session` |  | 20 |
| `LoginResponseMessage` | `messages.session` |  | 66 |
| `LogoutResponseMessage` | `messages.session` |  | 61 |
| `MassCancelAcknowledgmentMessage` | `messages.application` |  | 42 |
| `MassCancelOrderMessage` | `messages.application` |  | 52 |
| `MassCancelRejectedMessage` | `messages.application` |  | 91 |
| `ModifyOrderMessage` | `messages.application` |  | 117 |
| `ModifyRejectedMessage` | `messages.application` |  | 119 |
| `NewComplexInstrumentAcceptedMessage` | `messages.application` |  | 43 |
| `NewComplexInstrumentMessage` | `messages.application` |  | 27 |
| `NewComplexInstrumentRejectedMessage` | `messages.application` |  | 95 |
| `NewComplexOrderMessage` | `messages.application` |  | 183 |
| `NewComplexOrderShortMessage` | `messages.application` |  | 121 |
| `NewComplexOrderV2Message` | `messages.application` |  | 192 |
| `NewOrderCrossMessage` | `messages.application` |  | 116 |
| `NewOrderCrossMultilegMessage` | `messages.application` |  | 121 |
| `NewOrderMessage` | `messages.application` |  | 193 |
| `NewOrderShortMessage` | `messages.application` |  | 117 |
| `OrderAcknowledgementMessage` | `messages.application` |  | 93 |
| `OrderCancelledMessage` | `messages.application` |  | 56 |
| `OrderExecutionMessage` | `messages.application` |  | 116 |
| `OrderModifiedMessage` | `messages.application` |  | 136 |
| `OrderRejectedMessage` | `messages.application` |  | 99 |
| `OrderRestatedMessage` | `messages.application` |  | 108 |
| `PurgeAcknowledgementMessage` | `messages.application` |  | 43 |
| `PurgeNotificationMessage` | `messages.application` |  | 46 |
| `PurgeOrdersV2Message` | `messages.application` |  | 54 |
| `PurgeRejectedMessage` | `messages.application` |  | 91 |
| `QuoteCancelledMessage` | `messages.application` |  | 43 |
| `QuoteExecutionMessage` | `messages.application` |  | 84 |
| `QuoteRestatedMessage` | `messages.application` |  | 54 |
| `QuoteUpdateAcknowledgementMessage` | `messages.application` |  | 35 |
| `QuoteUpdateMessage` | `messages.application` |  | 60 |
| `QuoteUpdateRejectedMessage` | `messages.application` |  | 27 |
| `QuoteUpdateShortMessage` | `messages.application` |  | 40 |
| `ResetRiskAcknowledgementMessage` | `messages.application` |  | 27 |
| `ResetRiskMessage` | `messages.application` |  | 39 |
| `TradeCancelCorrectMessage` | `messages.application` |  | 122 |
| `LogoutRequest` | `messages.session` |  | 0 |
| `ClientHeartbeat` | `messages.session` |  | 0 |
| `ReplayComplete` | `messages.session` |  | 0 |
| `ServerHeartbeat` | `messages.session` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :cboe-c1options-binaryorderentry-boe3-v1-1-23:build
```

Run the round trip alone:

```
gradle :cboe-c1options-binaryorderentry-boe3-v1-1-23:roundTrip
```

