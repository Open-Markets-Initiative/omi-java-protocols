# BSE Limited Enhanced Trading Interface Fbe v1.6.14

Generated Java parser for Bse Enhanced Trading Interface Fbe v1.6.14.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [BSE India](..).

## Usage

Gradle project `:bse-bseindia-eti-fbe-v1-6-14` builds package `omi.bse.bseindia.eti.fbe.v1_6_14`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.bse.bseindia.eti.fbe.v1_6_14.messages.application.BroadcastErrorNotification;

BroadcastErrorNotification message = new BroadcastErrorNotification();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.bse.bseindia.eti.fbe.v1_6_14.dispatch.ClientPacketStream;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Message;

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
| `BroadcastErrorNotification` | `messages.application` |  | 26 |
| `DebtInquiryRequest` | `messages.application` |  | 50 |
| `DebtInquiryResponse` | `messages.application` |  | 114 |
| `DeleteAllOrderBroadcast` | `messages.application` |  | 122 |
| `DeleteAllOrderNrResponse` | `messages.application` |  | 66 |
| `DeleteAllOrderQuoteEventBroadcast` | `messages.application` |  | 74 |
| `DeleteAllOrderRequest` | `messages.application` |  | 58 |
| `DeleteAllOrderResponse` | `messages.application` |  | 90 |
| `DeleteAllQuoteBroadcast` | `messages.application` |  | 122 |
| `DeleteAllQuoteRequest` | `messages.application` |  | 50 |
| `DeleteAllQuoteResponse` | `messages.application` |  | 74 |
| `DeleteOrderBroadcast` | `messages.application` |  | 122 |
| `DeleteOrderComplexRequest` | `messages.application` |  | 90 |
| `DeleteOrderNrResponse` | `messages.application` |  | 114 |
| `DeleteOrderResponse` | `messages.application` |  | 130 |
| `DeleteOrderSingleRequest` | `messages.application` |  | 90 |
| `ForcedLogoutNotification` | `messages.application` |  | 18 |
| `GatewayRequest` | `messages.application` |  | 90 |
| `GatewayResponse` | `messages.application` |  | 98 |
| `GwOrderAcknowledgement` | `messages.application` |  | 50 |
| `Heartbeat` | `messages.application` |  | 10 |
| `HeartbeatNotification` | `messages.application` |  | 10 |
| `InquireSessionListRequest` | `messages.application` |  | 18 |
| `InquireSessionListResponse` | `messages.application` |  | 34 |
| `LogonRequest` | `messages.application` |  | 274 |
| `LogonResponse` | `messages.application` |  | 98 |
| `LogoutRequest` | `messages.application` |  | 18 |
| `LogoutResponse` | `messages.application` |  | 26 |
| `MassQuoteRequest` | `messages.application` |  | 90 |
| `MassQuoteResponse` | `messages.application` |  | 82 |
| `ModifyOrderComplexRequest` | `messages.application` |  | 234 |
| `ModifyOrderNrResponse` | `messages.application` |  | 162 |
| `ModifyOrderResponse` | `messages.application` |  | 186 |
| `ModifyOrderSingleRequest` | `messages.application` |  | 242 |
| `ModifyOrderSingleShortRequest` | `messages.application` |  | 130 |
| `MultiLegExecReportBroadcast` | `messages.application` |  | 122 |
| `MultiLegExecResponse` | `messages.application` |  | 114 |
| `MultiLegOrderReject` | `messages.application` |  | 74 |
| `MultiLegOrderRequest` | `messages.application` |  | 82 |
| `NewOrderComplexRequest` | `messages.application` |  | 210 |
| `NewOrderNrResponse` | `messages.application` |  | 146 |
| `NewOrderResponse` | `messages.application` |  | 178 |
| `NewOrderSingleRequest` | `messages.application` |  | 210 |
| `NewOrderSingleShortRequest` | `messages.application` |  | 106 |
| `NewsBroadcast` | `messages.application` |  | 306 |
| `OrderExecNotification` | `messages.application` |  | 210 |
| `OrderExecReportBroadcast` | `messages.application` |  | 346 |
| `OrderExecResponse` | `messages.application` |  | 194 |
| `QuoteExecReportBroadcast` | `messages.application` |  | 66 |
| `QuoteExecutionReport` | `messages.application` |  | 66 |
| `Reject` | `messages.application` |  | 66 |
| `RetransmitMeMessageRequest` | `messages.application` |  | 58 |
| `RetransmitMeMessageResponse` | `messages.application` |  | 66 |
| `RetransmitRequest` | `messages.application` |  | 42 |
| `RetransmitResponse` | `messages.application` |  | 50 |
| `RiskCollateralAlertAdminBroadcast` | `messages.application` |  | 106 |
| `RiskCollateralAlertBroadcast` | `messages.application` |  | 82 |
| `RiskNotificationBroadcast` | `messages.application` |  | 106 |
| `ServiceAvailabilityBroadcast` | `messages.application` |  | 42 |
| `SessionPasswordChangeRequest` | `messages.application` |  | 90 |
| `SessionPasswordChangeResponse` | `messages.application` |  | 26 |
| `SessionRegistrationRequest` | `messages.application` |  | 34 |
| `SessionRegistrationResponse` | `messages.application` |  | 34 |
| `SubscribeRequest` | `messages.application` |  | 26 |
| `SubscribeResponse` | `messages.application` |  | 34 |
| `ThrottleUpdateNotification` | `messages.application` |  | 26 |
| `TmTradingSessionStatusBroadcast` | `messages.application` |  | 42 |
| `TradeBroadcast` | `messages.application` |  | 346 |
| `TradeEnhancementBroadcast` | `messages.application` |  | 122 |
| `TradingSessionStatusBroadcast` | `messages.application` |  | 82 |
| `UnsubscribeRequest` | `messages.application` |  | 26 |
| `UnsubscribeResponse` | `messages.application` |  | 26 |
| `UserLoginRequest` | `messages.application` |  | 58 |
| `UserLoginResponse` | `messages.application` |  | 42 |
| `UserLogoutRequest` | `messages.application` |  | 26 |
| `UserLogoutResponse` | `messages.application` |  | 26 |
| `UserPasswordChangeRequest` | `messages.application` |  | 90 |
| `UserPasswordChangeResponse` | `messages.application` |  | 26 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :bse-bseindia-eti-fbe-v1-6-14:build
```

Run the round trip alone:

```
gradle :bse-bseindia-eti-fbe-v1-6-14:roundTrip
```

