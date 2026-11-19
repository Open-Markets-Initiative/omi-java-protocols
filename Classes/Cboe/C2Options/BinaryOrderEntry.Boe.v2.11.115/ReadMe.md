# Chicago Board Options Exchange Binary Order Entry Boe v2.11.115

Generated Java parser for Cboe Binary Order Entry Boe v2.11.115.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Cboe C2 Options](..).

## Usage

Gradle project `:cboe-c2options-binaryorderentry-boe-v2-11-115` builds package `omi.cboe.c2options.binaryorderentry.boe.v2_11_115`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.messages.application.AddFloorTradeMessage;

AddFloorTradeMessage message = new AddFloorTradeMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.dispatch.PacketStream;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.types.Message;

PacketStream stream = new PacketStream();
for (PacketStream.Record record : stream.append(bytes, 0, bytes.length)) {
    for (Message message : record.decoded().messages()) {
        System.out.println(message);
    }
}
```

A record stating a length that is not valid fails the stream, which then reads nothing more.

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `AddFloorTradeMessage` | `messages.application` |  | 136 |
| `AddFloorTradeRejectedMessage` | `messages.application` |  | 196 |
| `CancelOrderMessage` | `messages.application` |  | 21 |
| `CancelRejectedMessage` | `messages.application` |  | 91 |
| `ComplexInstrumentAcceptedMessage` | `messages.application` |  | 45 |
| `ComplexInstrumentRejectedMessage` | `messages.application` |  | 95 |
| `ComplexQuoteExecutionMessage` | `messages.application` |  | 87 |
| `ComplexQuoteUpdateMessage` | `messages.application` |  | 73 |
| `ComplexQuoteUpdateShortMessage` | `messages.application` |  | 41 |
| `CrossOrderAcknowledgmentMessage` | `messages.application` |  | 41 |
| `CrossOrderCancelledMessage` | `messages.application` |  | 33 |
| `CrossOrderRejectedMessage` | `messages.application` |  | 91 |
| `DeleteFloorTradeAcknowledgementMessage` | `messages.application` |  | 44 |
| `DeleteFloorTradeMessage` | `messages.application` |  | 66 |
| `DeleteFloorTradeRejectedMessage` | `messages.application` |  | 126 |
| `FloorTradeConfirmationMessage` | `messages.application` |  | 73 |
| `FloorTradeConfirmationRejectedMessage` | `messages.application` |  | 133 |
| `FloorTradeNotificationMessage` | `messages.application` |  | 74 |
| `LoginRequestMessage` | `messages.application` |  | 19 |
| `LoginResponseMessage` | `messages.application` |  | 68 |
| `LogoutMessage` | `messages.application` |  | 66 |
| `MassCancelAcknowledgmentMessage` | `messages.application` |  | 34 |
| `ModifyOrderMessage` | `messages.application` |  | 41 |
| `NewComplexInstrumentMessage` | `messages.application` |  | 22 |
| `NewComplexOrderMessage` | `messages.application` |  | 27 |
| `NewOrderCrossMessage` | `messages.application` |  | 37 |
| `NewOrderCrossMultilegMessage` | `messages.application` |  | 37 |
| `NewOrderMessage` | `messages.application` |  | 26 |
| `OrderAcknowledgmentMessage` | `messages.application` |  | 39 |
| `OrderCancelledMessage` | `messages.application` |  | 31 |
| `OrderExecutionMessage` | `messages.application` |  | 60 |
| `OrderModifiedMessage` | `messages.application` |  | 38 |
| `OrderRejectedMessage` | `messages.application` |  | 91 |
| `OrderRestatedMessage` | `messages.application` |  | 39 |
| `PurgeNotificationMessage` | `messages.application` |  | 47 |
| `PurgeOrdersMessage` | `messages.application` |  | 3 |
| `PurgeRejectedMessage` | `messages.application` |  | 71 |
| `QuoteCancelledMessage` | `messages.application` |  | 41 |
| `QuoteExecutionMessage` | `messages.application` |  | 78 |
| `QuoteRestatedMessage` | `messages.application` |  | 52 |
| `QuoteUpdateAcknowledgmentMessage` | `messages.application` |  | 43 |
| `QuoteUpdateMessage` | `messages.application` |  | 73 |
| `QuoteUpdateRejectedMessage` | `messages.application` |  | 42 |
| `QuoteUpdateShortMessage` | `messages.application` |  | 41 |
| `ResetRiskAcknowledgmentMessage` | `messages.application` |  | 17 |
| `ResetRiskMessage` | `messages.application` |  | 40 |
| `TradeCancelOrCorrectMessage` | `messages.application` |  | 85 |
| `UserModifyRejectedMessage` | `messages.application` |  | 91 |
| `LogoutRequestMessage` | `messages.application` |  | 0 |
| `ClientHeartbeatMessage` | `messages.application` |  | 0 |
| `ServerHeartbeatMessage` | `messages.application` |  | 0 |
| `ReplayCompleteMessage` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :cboe-c2options-binaryorderentry-boe-v2-11-115:build
```

Run the round trip alone:

```
gradle :cboe-c2options-binaryorderentry-boe-v2-11-115:roundTrip
```

