# Chicago Board Options Exchange Futures Binary Order Entry Boe3 v1.1.20

Generated Java parser for Cboe Futures Binary Order Entry Boe3 v1.1.20.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Cboe Futures Exchange](..).

## Usage

Gradle project `:cboe-cfefutures-binaryorderentry-boe3-v1-1-20` builds package `omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.CancelOrder;

CancelOrder message = new CancelOrder();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `FirmPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.dispatch.FirmPacketStream;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Message;

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
| `CancelOrder` | `messages.application` |  | 43 |
| `CancelRejected` | `messages.application` |  | 93 |
| `LoginRequestMessage` | `messages.session` |  | 20 |
| `LoginResponseMessage` | `messages.session` |  | 66 |
| `LogoutResponseMessage` | `messages.session` |  | 61 |
| `MassCancelAcknowledgement` | `messages.application` |  | 40 |
| `MassCancelOrder` | `messages.application` |  | 65 |
| `MassCancelRejected` | `messages.application` |  | 89 |
| `ModifyOrder` | `messages.application` |  | 92 |
| `ModifyRejected` | `messages.application` |  | 113 |
| `NewComplexInstrumentAcceptedOption` | `messages.application` |  | 41 |
| `NewComplexInstrumentOption` | `messages.application` |  | 25 |
| `NewComplexInstrumentRejectedOption` | `messages.application` |  | 93 |
| `NewOrder` | `messages.application` |  | 131 |
| `NewOrderOption` | `messages.application` |  | 132 |
| `OrderAcknowledgement` | `messages.application` |  | 161 |
| `OrderAcknowledgementOption` | `messages.application` |  | 164 |
| `OrderCancelled` | `messages.application` |  | 41 |
| `OrderExecution` | `messages.application` |  | 91 |
| `OrderExecutionOption` | `messages.application` |  | 103 |
| `OrderModified` | `messages.application` |  | 101 |
| `OrderRejected` | `messages.application` |  | 93 |
| `PurgeAcknowledgement` | `messages.application` |  | 40 |
| `PurgeOrders` | `messages.application` |  | 68 |
| `PurgeRejected` | `messages.application` |  | 89 |
| `QuoteCancelled` | `messages.application` |  | 40 |
| `QuoteExecution` | `messages.application` |  | 71 |
| `QuoteRestated` | `messages.application` |  | 52 |
| `QuoteUpdate` | `messages.application` |  | 69 |
| `QuoteUpdateAcknowledgement` | `messages.application` |  | 33 |
| `QuoteUpdateOption` | `messages.application` |  | 69 |
| `QuoteUpdateRejected` | `messages.application` |  | 25 |
| `ResetRisk` | `messages.application` |  | 36 |
| `ResetRiskAcknowledgement` | `messages.application` |  | 25 |
| `TasQuoteRestatement` | `messages.application` |  | 54 |
| `TasRestatement` | `messages.application` |  | 104 |
| `TradeCancelCorrect` | `messages.application` |  | 92 |
| `TradeCancelCorrectOption` | `messages.application` |  | 104 |
| `LogoutRequest` | `messages.session` |  | 0 |
| `ClientHeartbeat` | `messages.session` |  | 0 |
| `ReplayComplete` | `messages.session` |  | 0 |
| `ServerHeartbeat` | `messages.session` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Cboe/CfeFutures.BinaryOrderEntry.Boe3.v1.1.20` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :cboe-cfefutures-binaryorderentry-boe3-v1-1-20:build
```

Run the round trip alone:

```
gradle :cboe-cfefutures-binaryorderentry-boe3-v1-1-20:roundTrip
```

