# National Association of Securities Dealers Automated Quotations (Nasdaq) Orders Ouch v5.0

Generated Java parser for Nasdaq Orders Ouch v5.0.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nasdaq Stock Market](..).

## Usage

Gradle project `:nasdaq-nsmequities-orders-ouch-v5-0` builds package `omi.nasdaq.nsmequities.orders.ouch.v5_0`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.AccountQueryMessage;

AccountQueryMessage message = new AccountQueryMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.nasdaq.nsmequities.orders.ouch.v5_0.dispatch.ClientPacketStream;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Message;

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
| `AccountQueryMessage` | `messages.application` | `'Q'` | 0 |
| `AccountQueryResponseMessage` | `messages.application` | `'Q'` | 12 |
| `AiqCanceledMessage` | `messages.application` | `'D'` | 31 |
| `BrokenTradeMessage` | `messages.application` | `'B'` | 35 |
| `CancelOrderMessage` | `messages.application` | `'X'` | 8 |
| `CancelPendingMessage` | `messages.application` | `'P'` | 12 |
| `CancelRejectMessage` | `messages.application` | `'I'` | 12 |
| `CanceledMessage` | `messages.application` | `'C'` | 17 |
| `DebugPacket` | `messages.session` | `'+'` | 0 |
| `DisableOrderEntryRequestMessage` | `messages.application` | `'D'` | 10 |
| `DisableOrderEntryResponseMessage` | `messages.application` | `'G'` | 18 |
| `EnableOrderEntryRequestMessage` | `messages.application` | `'E'` | 10 |
| `EnableOrderEntryResponseMessage` | `messages.application` | `'K'` | 18 |
| `EnterOrderMessage` | `messages.application` | `'O'` | 46 |
| `LoginAcceptedPacket` | `messages.session` | `'A'` | 30 |
| `LoginRejectedPacket` | `messages.session` | `'J'` | 1 |
| `LoginRequestPacket` | `messages.session` | `'L'` | 46 |
| `MassCancelRequestMessage` | `messages.application` | `'C'` | 18 |
| `MassCancelResponseMessage` | `messages.application` | `'X'` | 26 |
| `ModifyOrderMessage` | `messages.application` | `'M'` | 9 |
| `OrderAcceptedMessage` | `messages.application` | `'A'` | 63 |
| `OrderExecutedMessage` | `messages.application` | `'E'` | 35 |
| `OrderModifiedMessage` | `messages.application` | `'M'` | 17 |
| `OrderPriorityUpdateMessage` | `messages.application` | `'T'` | 29 |
| `OrderRestatedMessage` | `messages.application` | `'R'` | 15 |
| `RejectedOrderMessage` | `messages.application` | `'J'` | 28 |
| `ReplaceOrderMessage` | `messages.application` | `'U'` | 39 |
| `ReplacedMessage` | `messages.application` | `'U'` | 67 |
| `SequencedDataPacket` | `messages.session` | `'S'` | 1 |
| `SystemEventMessage` | `messages.application` | `'S'` | 9 |
| `UnsequencedDataPacket` | `messages.session` | `'U'` | 1 |
| `ClientHeartbeat` | `messages.session` | `'R'` | 0 |
| `LogoutRequest` | `messages.session` | `'O'` | 0 |
| `ServerHeartbeat` | `messages.session` | `'H'` | 0 |
| `EndOfSession` | `messages.session` | `'Z'` | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Nasdaq/NsmEquities.Orders.Ouch.v5.0` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nasdaq-nsmequities-orders-ouch-v5-0:build
```

Run the round trip alone:

```
gradle :nasdaq-nsmequities-orders-ouch-v5-0:roundTrip
```

