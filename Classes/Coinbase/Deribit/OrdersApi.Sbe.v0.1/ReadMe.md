# Coinbase Orders Api Sbe v0.1

Generated Java parser for Coinbase Orders Api Sbe v0.1.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Deribit](..).

## Usage

Gradle project `:coinbase-deribit-ordersapi-sbe-v0-1` builds package `omi.coinbase.deribit.ordersapi.sbe.v0_1`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.AmendOrderRejectMessage;

AmendOrderRejectMessage message = new AmendOrderRejectMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.coinbase.deribit.ordersapi.sbe.v0_1.dispatch.PacketStream;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Message;

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
| `AmendOrderRejectMessage` | `messages.application` |  | 50 |
| `AmendOrderRequestMessage` | `messages.application` |  | 52 |
| `AmendOrderResponseMessage` | `messages.application` |  | 101 |
| `CancelOrderRejectMessage` | `messages.application` |  | 50 |
| `CancelOrderRequestMessage` | `messages.application` |  | 24 |
| `CancelOrderResponseMessage` | `messages.application` |  | 56 |
| `GapFillMessage` | `messages.application` |  | 8 |
| `HeartbeatMessage` | `messages.application` |  | 8 |
| `LoggedOutMessage` | `messages.application` |  | 1 |
| `LogonConfMessage` | `messages.application` |  | 4 |
| `LogonMessage` | `messages.application` |  | 65 |
| `LogoutMessage` | `messages.application` |  | 1 |
| `MassCancelRejectMessage` | `messages.application` |  | 26 |
| `MassCancelRequestMessage` | `messages.application` |  | 26 |
| `MassCancelResponseMessage` | `messages.application` |  | 36 |
| `MassQuoteCancelRequestMessage` | `messages.application` |  | 17 |
| `MassQuoteMmpTriggeredMessage` | `messages.application` |  | 57 |
| `MassQuoteMmpUnfrozenMessage` | `messages.application` |  | 32 |
| `MassQuoteOrdersPlacedMessage` | `messages.application` |  | 36 |
| `MassQuoteRejectMessage` | `messages.application` |  | 42 |
| `MassQuoteRequestMessage` | `messages.application` |  | 37 |
| `MassQuoteResponseMessage` | `messages.application` |  | 64 |
| `NewOrderRejectMessage` | `messages.application` |  | 50 |
| `NewOrderRequestMessage` | `messages.application` |  | 63 |
| `NewOrderResponseMessage` | `messages.application` |  | 102 |
| `OrderFilledMessage` | `messages.application` |  | 24 |
| `OrderPlacedMessage` | `messages.application` |  | 85 |
| `OrdersCanceledMessage` | `messages.application` |  | 21 |
| `OrdersMmpTriggeredMessage` | `messages.application` |  | 57 |
| `OrdersMmpUnfrozenMessage` | `messages.application` |  | 32 |
| `RejectMessage` | `messages.application` |  | 10 |
| `ResendRequestMessage` | `messages.application` |  | 16 |
| `TestRequestMessage` | `messages.application` |  | 8 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Coinbase/Deribit.OrdersApi.Sbe.v0.1` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :coinbase-deribit-ordersapi-sbe-v0-1:build
```

Run the round trip alone:

```
gradle :coinbase-deribit-ordersapi-sbe-v0-1:roundTrip
```

