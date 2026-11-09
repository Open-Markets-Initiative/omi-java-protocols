# Brasil, Bolsa, Balcão Binary Entry Point Sbe v8.1

Generated Java parser for B3 Binary Entry Point Sbe v8.1.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [B3 Derivatives](..).

## Usage

Gradle project `:b3-b3derivatives-binaryentrypoint-sbe-v8-1` builds package `omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application.AllocationInstructionMessage;

AllocationInstructionMessage message = new AllocationInstructionMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.dispatch.PacketStream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Message;

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
| `AllocationInstructionMessage` | `messages.application` |  | 88 |
| `AllocationReportMessage` | `messages.application` |  | 84 |
| `BusinessMessageRejectMessage` | `messages.application` |  | 38 |
| `EstablishAckMessage` | `messages.application` |  | 36 |
| `EstablishMessage` | `messages.application` |  | 43 |
| `EstablishRejectMessage` | `messages.application` |  | 26 |
| `ExecutionReportCancelMessage` | `messages.application` |  | 186 |
| `ExecutionReportForwardMessage` | `messages.application` |  | 157 |
| `ExecutionReportModifyMessage` | `messages.application` |  | 188 |
| `ExecutionReportNewMessage` | `messages.application` |  | 174 |
| `ExecutionReportRejectMessage` | `messages.application` |  | 165 |
| `ExecutionReportTradeMessage` | `messages.application` |  | 166 |
| `NegotiateMessage` | `messages.application` |  | 32 |
| `NegotiateRejectMessage` | `messages.application` |  | 36 |
| `NegotiateResponseMessage` | `messages.application` |  | 24 |
| `NewOrderCrossMessage` | `messages.application` |  | 89 |
| `NewOrderSingleMessage` | `messages.application` |  | 133 |
| `NotAppliedMessage` | `messages.application` |  | 8 |
| `OrderCancelReplaceRequestMessage` | `messages.application` |  | 150 |
| `OrderCancelRequestMessage` | `messages.application` |  | 78 |
| `OrderMassActionReportMessage` | `messages.application` |  | 73 |
| `OrderMassActionRequestMessage` | `messages.application` |  | 54 |
| `PositionMaintenanceCancelRequestMessage` | `messages.application` |  | 65 |
| `PositionMaintenanceReportMessage` | `messages.application` |  | 101 |
| `PositionMaintenanceRequestMessage` | `messages.application` |  | 75 |
| `QuoteCancelMessage` | `messages.application` |  | 70 |
| `QuoteMessage` | `messages.application` |  | 107 |
| `QuoteRequestMessage` | `messages.application` |  | 113 |
| `QuoteRequestRejectMessage` | `messages.application` |  | 117 |
| `QuoteStatusReportMessage` | `messages.application` |  | 122 |
| `RetransmissionMessage` | `messages.application` |  | 20 |
| `RetransmitRejectMessage` | `messages.application` |  | 13 |
| `RetransmitRequestMessage` | `messages.application` |  | 20 |
| `SecurityDefinitionRequestMessage` | `messages.application` |  | 44 |
| `SecurityDefinitionResponseMessage` | `messages.application` |  | 83 |
| `SequenceMessage` | `messages.application` |  | 4 |
| `SimpleModifyOrderMessage` | `messages.application` |  | 101 |
| `SimpleNewOrderMessage` | `messages.application` |  | 85 |
| `TerminateMessage` | `messages.application` |  | 13 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `B3/B3Derivatives.BinaryEntryPoint.Sbe.v8.1` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :b3-b3derivatives-binaryentrypoint-sbe-v8-1:build
```

Run the round trip alone:

```
gradle :b3-b3derivatives-binaryentrypoint-sbe-v8-1:roundTrip
```

