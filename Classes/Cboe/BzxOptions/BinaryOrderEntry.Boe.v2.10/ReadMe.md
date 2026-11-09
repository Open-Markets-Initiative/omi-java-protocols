# Chicago Board Options Exchange Binary Order Entry Boe v2.10

Generated Java parser for Cboe Binary Order Entry Boe v2.10.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Cboe Bzx Options](..).

## Usage

Gradle project `:cboe-bzxoptions-binaryorderentry-boe-v2-10` builds package `omi.cboe.bzxoptions.binaryorderentry.boe.v2_10`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application.CancelOrderMessage;

CancelOrderMessage message = new CancelOrderMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.dispatch.PacketStream;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.Message;

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
| `CancelOrderMessage` | `messages.application` |  | 21 |
| `CancelRejectedMessage` | `messages.application` |  | 91 |
| `LoginRequestMessage` | `messages.application` |  | 19 |
| `LoginResponseMessage` | `messages.application` |  | 68 |
| `LogoutMessage` | `messages.application` |  | 66 |
| `MassCancelAcknowledgmentMessage` | `messages.application` |  | 33 |
| `ModifyOrderMessage` | `messages.application` |  | 41 |
| `NewOrderMessage` | `messages.application` |  | 26 |
| `OrderAcknowledgmentMessage` | `messages.application` |  | 38 |
| `OrderCancelledMessage` | `messages.application` |  | 31 |
| `OrderExecutionMessage` | `messages.application` |  | 60 |
| `OrderModifiedMessage` | `messages.application` |  | 38 |
| `OrderRejectedMessage` | `messages.application` |  | 91 |
| `OrderRestatedMessage` | `messages.application` |  | 39 |
| `PurgeOrderMessage` | `messages.application` |  | 2 |
| `PurgeRejectedMessage` | `messages.application` |  | 71 |
| `QuoteCancelledMessage` | `messages.application` |  | 40 |
| `QuoteExecutionMessage` | `messages.application` |  | 78 |
| `QuoteRestatedMessage` | `messages.application` |  | 52 |
| `QuoteUpdateAcknowledgmentMessage` | `messages.application` |  | 43 |
| `QuoteUpdateMessage` | `messages.application` |  | 73 |
| `QuoteUpdateRejectedMessage` | `messages.application` |  | 42 |
| `ResetRiskAcknowledgmentMessage` | `messages.application` |  | 17 |
| `RiskResetMessage` | `messages.application` |  | 40 |
| `ShortQuoteUpdateMessage` | `messages.application` |  | 41 |
| `TradeCancelOrCorrectMessage` | `messages.application` |  | 84 |
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

The build workflow runs the capture test, strict, on the captures in `Cboe/BzxOptions.BinaryOrderEntry.Boe.v2.10` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :cboe-bzxoptions-binaryorderentry-boe-v2-10:build
```

Run the round trip alone:

```
gradle :cboe-bzxoptions-binaryorderentry-boe-v2-10:roundTrip
```

