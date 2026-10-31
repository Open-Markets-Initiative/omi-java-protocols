# National Association of Securities Dealers Automated Quotations (Nasdaq) Orders Ouch v5.0

Generated Java parser for Nasdaq Orders Ouch v5.0.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nasdaq Stock Market](..).

## Usage

Gradle project `:nasdaq-nsmequities-orders-ouch-v5-0` builds package `omi.nasdaq.nsmequities.orders.ouch.v5_0`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.session.LoginAcceptedPacket;

LoginAcceptedPacket message = new LoginAcceptedPacket();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `LoginAcceptedPacket` | `messages.session` | `'A'` | 30 |
| `LoginRejectedPacket` | `messages.session` | `'J'` | 1 |
| `LoginRequestPacket` | `messages.session` | `'L'` | 46 |
| `SystemEventMessage` | `messages.application` | `'S'` | 9 |

## Not Generated

A message whose wire length depends on values read at parse time is left out rather than published with a fixed length that would desynchronise the caller's stream.

| Message | Reason |
| --- | --- |
| `AccountQueryMessage` | contains the runtime-sized element 'Account Query Appendage' |
| `AccountQueryResponseMessage` | contains the runtime-sized element 'Account Query Response Appendage' |
| `AiqCanceledMessage` | contains the runtime-sized element 'Aiq Canceled Appendage' |
| `BrokenTradeMessage` | contains the runtime-sized element 'Broken Trade Appendage' |
| `CancelOrderMessage` | contains the runtime-sized element 'Cancel Order Appendage' |
| `CancelPendingMessage` | contains the runtime-sized element 'Cancel Pending Appendage' |
| `CancelRejectMessage` | contains the runtime-sized element 'Cancel Reject Appendage' |
| `CanceledMessage` | contains the runtime-sized element 'Canceled Message Appendage' |
| `DebugPacket` | contains the runtime-sized element 'Debug Text' |
| `DisableOrderEntryRequestMessage` | contains the runtime-sized element 'Disable Order Entry Request Appendage' |
| `DisableOrderEntryResponseMessage` | contains the runtime-sized element 'Disable Order Entry Response Appendage' |
| `EnableOrderEntryRequestMessage` | contains the runtime-sized element 'Enable Order Entry Request Appendage' |
| `EnableOrderEntryResponseMessage` | contains the runtime-sized element 'Enable Order Entry Response Appendage' |
| `EnterOrderMessage` | contains the runtime-sized element 'Enter Order Appendage' |
| `MassCancelRequestMessage` | contains the runtime-sized element 'Mass Cancel Request Appendage' |
| `MassCancelResponseMessage` | contains the runtime-sized element 'Mass Cancel Response Appendage' |
| `ModifyOrderMessage` | contains the runtime-sized element 'Modify Order Appendage' |
| `OrderAcceptedMessage` | contains the runtime-sized element 'Order Accepted Appendage' |
| `OrderExecutedMessage` | contains the runtime-sized element 'Order Executed Appendage' |
| `OrderModifiedMessage` | contains the runtime-sized element 'Order Modified Appendage' |
| `OrderPriorityUpdateMessage` | contains the runtime-sized element 'Order Priority Update Appendage' |
| `OrderRestatedMessage` | contains the runtime-sized element 'Order Restated Appendage' |
| `RejectedOrderMessage` | contains the runtime-sized element 'Rejected Order Appendage' |
| `ReplaceOrderMessage` | contains the runtime-sized element 'Replace Order Appendage' |
| `ReplacedMessage` | contains the runtime-sized element 'Replaced Message Appendage' |
| `SequencedDataPacket` | dispatches at runtime on 'Sequenced Message' |
| `UnsequencedDataPacket` | dispatches at runtime on 'Unsequenced Message' |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nasdaq-nsmequities-orders-ouch-v5-0:build
```

Run the round trip alone:

```
gradle :nasdaq-nsmequities-orders-ouch-v5-0:roundTrip
```

