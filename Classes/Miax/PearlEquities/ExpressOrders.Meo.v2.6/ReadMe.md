# Miami International Holdings Express Orders Meo v2.6

Generated Java parser for Miax Express Orders Meo v2.6.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [MIAX Pearl Equities](..).

## Usage

Gradle project `:miax-pearlequities-expressorders-meo-v2-6` builds package `omi.miax.pearlequities.expressorders.meo.v2_6`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.miax.pearlequities.expressorders.meo.v2_6.messages.application.CancelOrderByExchangeOrderIdRequest;

CancelOrderByExchangeOrderIdRequest message = new CancelOrderByExchangeOrderIdRequest();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.miax.pearlequities.expressorders.meo.v2_6.dispatch.PacketStream;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.Message;

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
| `CancelOrderByExchangeOrderIdRequest` | `messages.application` |  | 54 |
| `CancelOrderByExchangeOrderIdResponseMessage` | `messages.application` |  | 59 |
| `CancelOrderRequest` | `messages.application` |  | 66 |
| `CancelOrderResponse` | `messages.application` |  | 79 |
| `CancelReduceSizeOrderNotification` | `messages.application` |  | 71 |
| `ExecutionNotification` | `messages.application` |  | 102 |
| `MassCancelRequest` | `messages.application` |  | 44 |
| `MassCancelResponse` | `messages.application` |  | 43 |
| `ModifyOrderNotification` | `messages.application` |  | 121 |
| `ModifyOrderRequestMessage` | `messages.application` |  | 109 |
| `ModifyOrderResponse` | `messages.application` |  | 87 |
| `NewOrderNotification` | `messages.application` |  | 137 |
| `NewOrderRequestMessage` | `messages.application` |  | 129 |
| `NewOrderResponseMessage` | `messages.application` |  | 76 |
| `OrderPriceUpdateNotification` | `messages.application` |  | 38 |
| `ReserveOrderReplenishmentNotification` | `messages.application` |  | 42 |
| `SymbolUpdate` | `messages.application` |  | 59 |
| `SystemStateNotification` | `messages.application` |  | 26 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Miax/PearlEquities.ExpressOrders.Meo.v2.6` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :miax-pearlequities-expressorders-meo-v2-6:build
```

Run the round trip alone:

```
gradle :miax-pearlequities-expressorders-meo-v2-6:roundTrip
```

