# Intercontinental Exchange Binary Order Gateway Sbe v7.0

Generated Java parser for Ice Binary Order Gateway Sbe v7.0.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Intercontinental Exchange Futures](..).

## Usage

Gradle project `:ice-icefutures-bgw-sbe-v7-0` builds package `omi.ice.icefutures.bgw.sbe.v7_0`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.ice.icefutures.bgw.sbe.v7_0.messages.application.CancelReplaceRequestMessage;

CancelReplaceRequestMessage message = new CancelReplaceRequestMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.ice.icefutures.bgw.sbe.v7_0.dispatch.PacketStream;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;

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
| `CancelReplaceRequestMessage` | `messages.application` |  | 333 |
| `CancelRequestMessage` | `messages.application` |  | 41 |
| `ErrorMessage` | `messages.application` |  | 129 |
| `ExecutionReportCancelMessage` | `messages.application` |  | 199 |
| `ExecutionReportModifyMessage` | `messages.application` |  | 153 |
| `ExecutionReportNewMessage` | `messages.application` |  | 133 |
| `ExecutionReportRejectMessage` | `messages.application` |  | 215 |
| `ExecutionReportSnapshotMessage` | `messages.application` |  | 380 |
| `ExecutionReportTradeMessage` | `messages.application` |  | 227 |
| `IpReportMessage` | `messages.application` |  | 108 |
| `IpRequestMessage` | `messages.application` |  | 8 |
| `LogonReportMessage` | `messages.application` |  | 127 |
| `LogonRequestMessage` | `messages.application` |  | 236 |
| `LogoutReportMessage` | `messages.application` |  | 124 |
| `LogoutRequestMessage` | `messages.application` |  | 20 |
| `MassQuoteReportMessage` | `messages.application` |  | 156 |
| `MassQuoteRequestMessage` | `messages.application` |  | 78 |
| `NewOrderCrossReportMessage` | `messages.application` |  | 145 |
| `NewOrderCrossRequestMessage` | `messages.application` |  | 183 |
| `NewOrderRequestMessage` | `messages.application` |  | 327 |
| `NewsMessage` | `messages.application` |  | 26 |
| `OrderMassCancelReportMessage` | `messages.application` |  | 151 |
| `OrderMassCancelRequestMessage` | `messages.application` |  | 89 |
| `QuoteCancelRequestMessage` | `messages.application` |  | 33 |
| `QuoteReportMessage` | `messages.application` |  | 60 |
| `QuoteRequestMessage` | `messages.application` |  | 182 |
| `ResendReportMessage` | `messages.application` |  | 113 |
| `ResendRequestMessage` | `messages.application` |  | 8 |
| `SecurityDefinitionRejectMessage` | `messages.application` |  | 115 |
| `SecurityDefinitionReportMessage` | `messages.application` |  | 269 |
| `SecurityDefinitionReportProductMessage` | `messages.application` |  | 55 |
| `SecurityDefinitionReportStrategyMessage` | `messages.application` |  | 182 |
| `SecurityDefinitionRequestCreateFlexMessage` | `messages.application` |  | 28 |
| `SecurityDefinitionRequestCreateStrategyMessage` | `messages.application` |  | 24 |
| `SecurityDefinitionRequestMessage` | `messages.application` |  | 9 |
| `SequenceResetMessage` | `messages.application` |  | 5 |
| `SimpleOpenFramingHeaderMessage` | `messages.application` |  | 4 |
| `TraderLogonReportMessage` | `messages.application` |  | 128 |
| `TraderLogonRequestMessage` | `messages.application` |  | 106 |
| `TraderLogoutReportMessage` | `messages.application` |  | 124 |
| `TraderLogoutRequestMessage` | `messages.application` |  | 20 |
| `HeartBeatMessage` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :ice-icefutures-bgw-sbe-v7-0:build
```

Run the round trip alone:

```
gradle :ice-icefutures-bgw-sbe-v7-0:roundTrip
```

