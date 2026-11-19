# Chicago Board Options Exchange Binary Order Entry Boe3 v1.0.12

Generated Java parser for Cboe Binary Order Entry Boe3 v1.0.12.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Cboe Japan](..).

## Usage

Gradle project `:cboe-cxjequities-binaryorderentry-boe3-v1-0-12` builds package `omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application.CancelOrderJpEquitiesV;

CancelOrderJpEquitiesV message = new CancelOrderJpEquitiesV();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `FirmPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.dispatch.FirmPacketStream;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.types.Message;

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
| `CancelOrderJpEquitiesV` | `messages.application` |  | 24 |
| `CancelRejectedJpEquitiesV` | `messages.application` |  | 93 |
| `LoginRequestMessage` | `messages.session` |  | 20 |
| `LoginResponseMessage` | `messages.session` |  | 66 |
| `LogoutResponseMessage` | `messages.session` |  | 61 |
| `ModifyOrderJpEquitiesV` | `messages.application` |  | 57 |
| `ModifyRejectedJpEquitiesV` | `messages.application` |  | 113 |
| `NewOrderJpEquitiesV` | `messages.application` |  | 87 |
| `OrderAcknowledgementJpEquitiesV` | `messages.application` |  | 104 |
| `OrderCancelledJpEquitiesV` | `messages.application` |  | 33 |
| `OrderExecutionJpEquitiesV` | `messages.application` |  | 67 |
| `OrderModifiedJpEquitiesV` | `messages.application` |  | 81 |
| `OrderRejectedJpEquitiesV` | `messages.application` |  | 93 |
| `OrderRestatedJpEquitiesV` | `messages.application` |  | 78 |
| `PurgeAcknowledgementJpEquitiesV` | `messages.application` |  | 32 |
| `PurgeOrdersJpEquitiesV` | `messages.application` |  | 49 |
| `PurgeRejectedJpEquitiesV` | `messages.application` |  | 89 |
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
gradle :cboe-cxjequities-binaryorderentry-boe3-v1-0-12:build
```

Run the round trip alone:

```
gradle :cboe-cxjequities-binaryorderentry-boe3-v1-0-12:roundTrip
```

