# Coinbase Orders Api Sbe v1.4

Generated Java parser for Coinbase Orders Api Sbe v1.4.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Coinbase Derivatives](..).

## Usage

Gradle project `:coinbase-coinbasederivatives-ordersapi-sbe-v1-4` builds package `omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.messages.application.CancelOrderMessage;

CancelOrderMessage message = new CancelOrderMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.dispatch.PacketStream;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.types.Message;

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
| `CancelOrderMessage` | `messages.application` |  | 20 |
| `CancelOrderRejectMessage` | `messages.application` |  | 64 |
| `EventResendCompleteMessage` | `messages.application` |  | 12 |
| `EventResendRejectMessage` | `messages.application` |  | 32 |
| `EventResendRequestMessage` | `messages.application` |  | 24 |
| `GapFillMessage` | `messages.application` |  | 8 |
| `HeartbeatMessage` | `messages.application` |  | 8 |
| `InstrumentInfoMessage` | `messages.application` |  | 48 |
| `InstrumentInfoRequestMessage` | `messages.application` |  | 8 |
| `LastExecIdMessage` | `messages.application` |  | 24 |
| `LastExecIdRequestMessage` | `messages.application` |  | 8 |
| `LoggedOutMessage` | `messages.application` |  | 64 |
| `LogonConfMessage` | `messages.application` |  | 4 |
| `LogonMessage` | `messages.application` |  | 49 |
| `LogoutMessage` | `messages.application` |  | 64 |
| `MassCancelOrderAckMessage` | `messages.application` |  | 30 |
| `MassCancelOrderMessage` | `messages.application` |  | 23 |
| `MassCancelOrderRejectMessage` | `messages.application` |  | 48 |
| `NewOrderMessage` | `messages.application` |  | 33 |
| `OrderCanceledMessage` | `messages.application` |  | 57 |
| `OrderEnteredMessage` | `messages.application` |  | 48 |
| `OrderFilledMessage` | `messages.application` |  | 81 |
| `OrderRejectMessage` | `messages.application` |  | 80 |
| `OrderReplacedMessage` | `messages.application` |  | 60 |
| `PingMessage` | `messages.application` |  | 17 |
| `PongMessage` | `messages.application` |  | 26 |
| `ReplaceOrderMessage` | `messages.application` |  | 32 |
| `ResendRequestMessage` | `messages.application` |  | 8 |
| `SetAccountMessage` | `messages.application` |  | 24 |
| `SetAckMessage` | `messages.application` |  | 8 |
| `SetTraderMessage` | `messages.application` |  | 24 |
| `SpreadOrderFilledMessage` | `messages.application` |  | 97 |
| `StreamOrderMessage` | `messages.application` |  | 41 |
| `TestRequestMessage` | `messages.application` |  | 8 |
| `UnlockTradingAckMessage` | `messages.application` |  | 20 |
| `UnlockTradingMessage` | `messages.application` |  | 9 |
| `UnlockTradingRejectMessage` | `messages.application` |  | 48 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Coinbase/CoinbaseDerivatives.OrdersApi.Sbe.v1.4` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :coinbase-coinbasederivatives-ordersapi-sbe-v1-4:build
```

Run the round trip alone:

```
gradle :coinbase-coinbasederivatives-ordersapi-sbe-v1-4:roundTrip
```

