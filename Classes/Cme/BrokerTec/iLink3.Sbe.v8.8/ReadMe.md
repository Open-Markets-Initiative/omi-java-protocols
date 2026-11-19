# CME Group iLink 3 Sbe v8.8

Generated Java parser for Cme iLink 3 Sbe v8.8.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [BrokerTec](..).

## Usage

Gradle project `:cme-brokertec-ilink3-sbe-v8-8` builds package `omi.cme.brokertec.ilink3.sbe.v8_8`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.cme.brokertec.ilink3.sbe.v8_8.messages.application.BusinessReject;

BusinessReject message = new BusinessReject();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.cme.brokertec.ilink3.sbe.v8_8.dispatch.ClientPacketStream;
import omi.cme.brokertec.ilink3.sbe.v8_8.types.Message;

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
| `BusinessReject` | `messages.application` |  | 330 |
| `Establish` | `messages.application` |  | 134 |
| `EstablishmentAck` | `messages.application` |  | 38 |
| `EstablishmentReject` | `messages.application` |  | 72 |
| `ExecutionAck` | `messages.application` |  | 101 |
| `ExecutionReportCancel` | `messages.application` |  | 247 |
| `ExecutionReportElimination` | `messages.application` |  | 219 |
| `ExecutionReportModify` | `messages.application` |  | 226 |
| `ExecutionReportNew` | `messages.application` |  | 226 |
| `ExecutionReportReject` | `messages.application` |  | 483 |
| `ExecutionReportStatus` | `messages.application` |  | 513 |
| `ExecutionReportTradeAddendumOutright` | `messages.application` |  | 228 |
| `ExecutionReportTradeAddendumSpread` | `messages.application` |  | 196 |
| `ExecutionReportTradeAddendumSpreadLeg` | `messages.application` |  | 202 |
| `ExecutionReportTradeOutright` | `messages.application` |  | 299 |
| `ExecutionReportTradeSpread` | `messages.application` |  | 239 |
| `ExecutionReportTradeSpreadLeg` | `messages.application` |  | 225 |
| `MassQuote` | `messages.application` |  | 126 |
| `MassQuoteAck` | `messages.application` |  | 354 |
| `Negotiate` | `messages.application` |  | 78 |
| `NegotiationReject` | `messages.application` |  | 68 |
| `NegotiationResponse` | `messages.application` |  | 34 |
| `NewOrderCross` | `messages.application` |  | 77 |
| `NewOrderSingle` | `messages.application` |  | 132 |
| `NotApplied` | `messages.application` |  | 17 |
| `OrderCancelReject` | `messages.application` |  | 409 |
| `OrderCancelReplaceReject` | `messages.application` |  | 409 |
| `OrderCancelReplaceRequest` | `messages.application` |  | 133 |
| `OrderCancelRequest` | `messages.application` |  | 96 |
| `OrderMassActionReport` | `messages.application` |  | 133 |
| `OrderMassActionRequest` | `messages.application` |  | 79 |
| `OrderMassStatusRequest` | `messages.application` |  | 68 |
| `OrderStatusRequest` | `messages.application` |  | 62 |
| `PartyDetailsDefinitionRequest` | `messages.application` |  | 153 |
| `PartyDetailsDefinitionRequestAck` | `messages.application` |  | 165 |
| `PartyDetailsListReport` | `messages.application` |  | 99 |
| `PartyDetailsListRequest` | `messages.application` |  | 26 |
| `QuoteCancel` | `messages.application` |  | 67 |
| `QuoteCancelAck` | `messages.application` |  | 374 |
| `RequestForQuote` | `messages.application` |  | 58 |
| `RequestForQuoteAck` | `messages.application` |  | 358 |
| `Retransmission` | `messages.application` |  | 31 |
| `RetransmitReject` | `messages.application` |  | 75 |
| `RetransmitRequest` | `messages.application` |  | 30 |
| `SecurityDefinitionRequest` | `messages.application` |  | 78 |
| `SecurityDefinitionResponse` | `messages.application` |  | 436 |
| `Sequence` | `messages.application` |  | 14 |
| `Terminate` | `messages.application` |  | 67 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :cme-brokertec-ilink3-sbe-v8-8:build
```

Run the round trip alone:

```
gradle :cme-brokertec-ilink3-sbe-v8-8:roundTrip
```

