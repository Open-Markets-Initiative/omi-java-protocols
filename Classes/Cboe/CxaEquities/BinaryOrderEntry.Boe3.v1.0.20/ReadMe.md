# Chicago Board Options Exchange Binary Order Entry Boe3 v1.0.20

Generated Java parser for Cboe Binary Order Entry Boe3 v1.0.20.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Cboe Australia](..).

## Usage

Gradle project `:cboe-cxaequities-binaryorderentry-boe3-v1-0-20` builds package `omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application.CancelOrderAuEquitiesV;

CancelOrderAuEquitiesV message = new CancelOrderAuEquitiesV();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `FirmPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.dispatch.FirmPacketStream;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.types.Message;

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
| `CancelOrderAuEquitiesV` | `messages.application` |  | 22 |
| `CancelRejectedAuEquitiesV` | `messages.application` |  | 91 |
| `CarriedRestatementAuEquitiesV` | `messages.application` |  | 182 |
| `DoneForDayAuEquitiesV` | `messages.application` |  | 34 |
| `ExecutionRestatementAuEquitiesV` | `messages.application` |  | 73 |
| `LoginRequestMessage` | `messages.session` |  | 20 |
| `LoginResponseMessage` | `messages.session` |  | 66 |
| `LogoutResponseMessage` | `messages.session` |  | 61 |
| `ModifyOrderAuEquitiesV1` | `messages.application` |  | 76 |
| `ModifyOrderAuEquitiesV2` | `messages.application` |  | 80 |
| `ModifyRejectedAuEquitiesV` | `messages.application` |  | 111 |
| `NewOrderAuEquitiesV1` | `messages.application` |  | 160 |
| `NewOrderAuEquitiesV2` | `messages.application` |  | 166 |
| `OrderAcknowledgementAuEquitiesV` | `messages.application` |  | 192 |
| `OrderCancelledAuEquitiesV` | `messages.application` |  | 31 |
| `OrderExecutionAuEquitiesV` | `messages.application` |  | 104 |
| `OrderModifiedAuEquitiesV1` | `messages.application` |  | 105 |
| `OrderModifiedAuEquitiesV2` | `messages.application` |  | 109 |
| `OrderRejectedAuEquitiesV` | `messages.application` |  | 91 |
| `OrderRestatedAuEquitiesV` | `messages.application` |  | 76 |
| `PurgeAcknowledgementAuEquitiesV` | `messages.application` |  | 32 |
| `PurgeOrdersAuEquitiesV` | `messages.application` |  | 46 |
| `PurgeRejectedAuEquitiesV` | `messages.application` |  | 89 |
| `TradeCancelCorrectAuEquitiesV` | `messages.application` |  | 88 |
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
gradle :cboe-cxaequities-binaryorderentry-boe3-v1-0-20:build
```

Run the round trip alone:

```
gradle :cboe-cxaequities-binaryorderentry-boe3-v1-0-20:roundTrip
```

