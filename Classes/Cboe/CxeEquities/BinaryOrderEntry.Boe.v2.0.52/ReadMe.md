# Chicago Board Options Exchange Boe v2.0.52

Generated Java parser for Cboe Boe v2.0.52.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Cboe CXE](..).

## Usage

Gradle project `:cboe-cxeequities-binaryorderentry-boe-v2-0-52` builds package `omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.messages.application.CancelOrderV2Message;

CancelOrderV2Message message = new CancelOrderV2Message();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.dispatch.PacketStream;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.types.Message;

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
| `CancelOrderV2Message` | `messages.application` |  | 21 |
| `CancelRejectedV2Message` | `messages.application` |  | 91 |
| `LoginRequestV2Message` | `messages.application` |  | 19 |
| `LoginResponseV2Message` | `messages.application` |  | 68 |
| `LogoutMessage` | `messages.application` |  | 66 |
| `MassCancelAcknowledgmentV2Message` | `messages.application` |  | 33 |
| `ModifyOrderV2Message` | `messages.application` |  | 41 |
| `NewOrderV2Message` | `messages.application` |  | 26 |
| `OrderAcknowledgmentV2Message` | `messages.application` |  | 38 |
| `OrderCancelledV2Message` | `messages.application` |  | 31 |
| `OrderExecutionV2Message` | `messages.application` |  | 60 |
| `OrderModifiedV2Message` | `messages.application` |  | 38 |
| `OrderRejectedV2Message` | `messages.application` |  | 91 |
| `OrderRestatedV2Message` | `messages.application` |  | 39 |
| `PurgeOrdersV2Message` | `messages.application` |  | 3 |
| `PurgeRejectedV2Message` | `messages.application` |  | 70 |
| `TradeCancelOrCorrectV2Message` | `messages.application` |  | 84 |
| `TradeCaptureConfirmV2Message` | `messages.application` |  | 75 |
| `TradeCaptureReportAcknowledgmentV2Message` | `messages.application` |  | 31 |
| `TradeCaptureReportDeclineV2Message` | `messages.application` |  | 136 |
| `TradeCaptureReportRejectV2Message` | `messages.application` |  | 92 |
| `TradeCaptureReportV2Message` | `messages.application` |  | 34 |
| `UserModifyRejectedV2Message` | `messages.application` |  | 91 |
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
gradle :cboe-cxeequities-binaryorderentry-boe-v2-0-52:build
```

Run the round trip alone:

```
gradle :cboe-cxeequities-binaryorderentry-boe-v2-0-52:roundTrip
```

