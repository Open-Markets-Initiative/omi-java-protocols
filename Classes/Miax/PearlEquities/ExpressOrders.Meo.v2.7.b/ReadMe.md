# Miami International Holdings Express Orders Meo v2.7.b

Generated Java parser for Miax Express Orders Meo v2.7.b.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [MIAX Pearl Equities](..).

## Usage

Gradle project `:miax-pearlequities-expressorders-meo-v2-7-b` builds package `omi.miax.pearlequities.expressorders.meo.v2_7_b`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.miax.pearlequities.expressorders.meo.v2_7_b.messages.application.AggressiveSidePurgeRequestMessage;

AggressiveSidePurgeRequestMessage message = new AggressiveSidePurgeRequestMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.miax.pearlequities.expressorders.meo.v2_7_b.dispatch.PacketStream;
import omi.miax.pearlequities.expressorders.meo.v2_7_b.types.Message;

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
| `AggressiveSidePurgeRequestMessage` | `messages.application` |  | 55 |
| `AggressiveSidePurgeResponseMessage` | `messages.application` |  | 49 |
| `CancelOrderByExchangeOrderIdRequestMessage` | `messages.application` |  | 54 |
| `CancelOrderByExchangeOrderIdResponseMessage` | `messages.application` |  | 59 |
| `CancelOrderRequestMessage` | `messages.application` |  | 66 |
| `CancelOrderResponseMessage` | `messages.application` |  | 79 |
| `CancelReduceSizeOrderNotificationMessage` | `messages.application` |  | 71 |
| `ExecutionNotificationMessage` | `messages.application` |  | 103 |
| `GoodbyePacket` | `messages.session` | `'G'` | 1 |
| `LoginRequest` | `messages.session` | `'l'` | 27 |
| `LoginResponse` | `messages.session` | `'r'` | 1 |
| `LogoutRequest` | `messages.session` | `'X'` | 1 |
| `MassCancelRequestMessage` | `messages.application` |  | 44 |
| `MassCancelResponseMessage` | `messages.application` |  | 43 |
| `ModifyOrderNotificationMessage` | `messages.application` |  | 121 |
| `ModifyOrderRequestMessage` | `messages.application` |  | 109 |
| `ModifyOrderResponseMessage` | `messages.application` |  | 87 |
| `NewOrderNotificationMessage` | `messages.application` |  | 137 |
| `NewOrderRequestMessage` | `messages.application` |  | 129 |
| `NewOrderResponseMessage` | `messages.application` |  | 76 |
| `OrderPriceUpdateNotificationMessage` | `messages.application` |  | 58 |
| `ReserveOrderReplenishmentNotificationMessage` | `messages.application` |  | 42 |
| `RetransmissionRequest` | `messages.session` | `'a'` | 16 |
| `SymbolUpdateMessage` | `messages.application` |  | 59 |
| `SynchronizationComplete` | `messages.session` | `'c'` | 1 |
| `SystemStateNotificationMessage` | `messages.application` |  | 26 |
| `TestPacket` | `messages.session` | `'T'` | 0 |
| `TradingSessionUpdate` | `messages.session` | `'u'` | 2 |
| `ServerHeartbeat` | `messages.session` | `'0'` | 0 |
| `ClientHeartbeat` | `messages.session` | `'1'` | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :miax-pearlequities-expressorders-meo-v2-7-b:build
```

Run the round trip alone:

```
gradle :miax-pearlequities-expressorders-meo-v2-7-b:roundTrip
```

