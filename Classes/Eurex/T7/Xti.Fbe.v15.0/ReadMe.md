# Eurex Exchange Cash Enhanced Trading Interface Fbe v15.0

Generated Java parser for Eurex Cash Enhanced Trading Interface Fbe v15.0.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [T7](..).

## Usage

Gradle project `:eurex-t7-xti-fbe-v15-0` builds package `omi.eurex.t7.xti.fbe.v15_0`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.eurex.t7.xti.fbe.v15_0.messages.application.ApproveTesTradeRequest;

ApproveTesTradeRequest message = new ApproveTesTradeRequest();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.eurex.t7.xti.fbe.v15_0.dispatch.ClientPacketStream;
import omi.eurex.t7.xti.fbe.v15_0.types.Message;

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
| `ApproveTesTradeRequest` | `messages.application` |  | 154 |
| `BroadcastErrorNotification` | `messages.application` |  | 22 |
| `CrossRequest` | `messages.application` |  | 42 |
| `CrossRequestResponse` | `messages.application` |  | 58 |
| `DeleteAllOrderBroadcast` | `messages.application` |  | 114 |
| `DeleteAllOrderNrResponse` | `messages.application` |  | 58 |
| `DeleteAllOrderQuoteEventBroadcast` | `messages.application` |  | 82 |
| `DeleteAllOrderRequest` | `messages.application` |  | 66 |
| `DeleteAllOrderResponse` | `messages.application` |  | 82 |
| `DeleteAllQuoteBroadcast` | `messages.application` |  | 98 |
| `DeleteAllQuoteRequest` | `messages.application` |  | 50 |
| `DeleteAllQuoteResponse` | `messages.application` |  | 66 |
| `DeleteOrderBroadcast` | `messages.application` |  | 178 |
| `DeleteOrderNrResponse` | `messages.application` |  | 122 |
| `DeleteOrderResponse` | `messages.application` |  | 138 |
| `DeleteOrderSingleRequest` | `messages.application` |  | 114 |
| `DeleteTesTradeRequest` | `messages.application` |  | 58 |
| `EnterTesTradeRequest` | `messages.application` |  | 106 |
| `ExtendedDeletionReport` | `messages.application` |  | 338 |
| `ForcedLogoutNotification` | `messages.application` |  | 12 |
| `ForcedUserLogoutNotification` | `messages.application` |  | 17 |
| `Heartbeat` | `messages.application` |  | 10 |
| `HeartbeatNotification` | `messages.application` |  | 10 |
| `InquireEnrichmentRuleIdListRequest` | `messages.application` |  | 34 |
| `InquireEnrichmentRuleIdListResponse` | `messages.application` |  | 50 |
| `InquireOverallRiskLimitsRequest` | `messages.application` |  | 26 |
| `InquirePreTradeRiskLimitsRequest` | `messages.application` |  | 34 |
| `InquireSessionListRequest` | `messages.application` |  | 18 |
| `InquireSessionListResponse` | `messages.application` |  | 34 |
| `InquireUserRequest` | `messages.application` |  | 34 |
| `InquireUserResponse` | `messages.application` |  | 50 |
| `IssuerNotification` | `messages.application` |  | 122 |
| `IssuerSecurityStateChangeRequest` | `messages.application` |  | 42 |
| `IssuerSecurityStateChangeResponse` | `messages.application` |  | 58 |
| `LegalNotificationBroadcast` | `messages.application` |  | 45 |
| `LogonRequest` | `messages.application` |  | 90 |
| `LogonRequestEncrypted` | `messages.application` |  | 746 |
| `LogonResponse` | `messages.application` |  | 96 |
| `LogoutRequest` | `messages.application` |  | 18 |
| `LogoutResponse` | `messages.application` |  | 26 |
| `MassQuoteRequest` | `messages.application` |  | 66 |
| `MassQuoteResponse` | `messages.application` |  | 74 |
| `ModifyOrderNrResponse` | `messages.application` |  | 146 |
| `ModifyOrderRequest` | `messages.application` |  | 266 |
| `ModifyOrderResponse` | `messages.application` |  | 170 |
| `ModifyOrderShortRequest` | `messages.application` |  | 122 |
| `ModifyTesTradeRequest` | `messages.application` |  | 98 |
| `NewOrderNrResponse` | `messages.application` |  | 114 |
| `NewOrderRequest` | `messages.application` |  | 258 |
| `NewOrderResponse` | `messages.application` |  | 146 |
| `NewOrderShortRequest` | `messages.application` |  | 114 |
| `NewsBroadcast` | `messages.application` |  | 300 |
| `OrderExecNotification` | `messages.application` |  | 170 |
| `OrderExecReportBroadcast` | `messages.application` |  | 362 |
| `OrderExecResponse` | `messages.application` |  | 178 |
| `OtcResponse` | `messages.application` |  | 50 |
| `OtcUploadBroadcast` | `messages.application` |  | 202 |
| `OtcUploadRequest` | `messages.application` |  | 154 |
| `OverallRiskLimitsDefinitionRequest` | `messages.application` |  | 42 |
| `OverallRiskLimitsDefinitionResponse` | `messages.application` |  | 34 |
| `OverallRiskLimitsReport` | `messages.application` |  | 66 |
| `PartyActionReport` | `messages.application` |  | 74 |
| `PartyEntitlementsUpdateReport` | `messages.application` |  | 82 |
| `PingRequest` | `messages.application` |  | 26 |
| `PingResponse` | `messages.application` |  | 58 |
| `PreTradeRiskLimitResponse` | `messages.application` |  | 74 |
| `PreTradeRiskLimitsDefinitionRequest` | `messages.application` |  | 34 |
| `QuoteActivationNotification` | `messages.application` |  | 82 |
| `QuoteActivationRequest` | `messages.application` |  | 50 |
| `QuoteActivationResponse` | `messages.application` |  | 66 |
| `QuoteExecutionReport` | `messages.application` |  | 74 |
| `Reject` | `messages.application` |  | 57 |
| `RetransmitMeMessageRequest` | `messages.application` |  | 58 |
| `RetransmitMeMessageResponse` | `messages.application` |  | 66 |
| `RetransmitRequest` | `messages.application` |  | 42 |
| `RetransmitResponse` | `messages.application` |  | 50 |
| `ReverseTesTradeRequest` | `messages.application` |  | 34 |
| `RfqBroadcast` | `messages.application` |  | 98 |
| `RfqRejectNotification` | `messages.application` |  | 98 |
| `RfqRejectRequest` | `messages.application` |  | 50 |
| `RfqReplyNotification` | `messages.application` |  | 130 |
| `RfqReplyRequest` | `messages.application` |  | 82 |
| `RfqReplyResponse` | `messages.application` |  | 58 |
| `RfqRequest` | `messages.application` |  | 50 |
| `RfqResponse` | `messages.application` |  | 58 |
| `RfqSpecialistIssuerBroadcast` | `messages.application` |  | 106 |
| `RiskNotificationBroadcast` | `messages.application` |  | 82 |
| `ServiceAvailabilityBroadcast` | `messages.application` |  | 50 |
| `ServiceAvailabilityMarketBroadcast` | `messages.application` |  | 34 |
| `SingleQuoteRequest` | `messages.application` |  | 154 |
| `SpecialistDeleteAllOrderBroadcast` | `messages.application` |  | 82 |
| `SpecialistInstrumentEventNotification` | `messages.application` |  | 82 |
| `SpecialistOrderBookNotification` | `messages.application` |  | 258 |
| `SpecialistSecurityStateChangeRequest` | `messages.application` |  | 34 |
| `SpecialistSecurityStateChangeResponse` | `messages.application` |  | 58 |
| `StatusBroadcast` | `messages.application` |  | 42 |
| `SubscribeRequest` | `messages.application` |  | 26 |
| `SubscribeResponse` | `messages.application` |  | 34 |
| `TesApproveBroadcast` | `messages.application` |  | 212 |
| `TesBroadcast` | `messages.application` |  | 154 |
| `TesDeleteBroadcast` | `messages.application` |  | 82 |
| `TesExecutionBroadcast` | `messages.application` |  | 66 |
| `TesResponse` | `messages.application` |  | 50 |
| `TesReversalBroadcast` | `messages.application` |  | 58 |
| `TesTradeBroadcast` | `messages.application` |  | 474 |
| `TesTradingSessionStatusBroadcast` | `messages.application` |  | 42 |
| `ThrottleUpdateNotification` | `messages.application` |  | 26 |
| `TmTradingSessionStatusBroadcast` | `messages.application` |  | 42 |
| `TradeBroadcast` | `messages.application` |  | 498 |
| `TradingActionRequest` | `messages.application` |  | 34 |
| `TradingActionResponse` | `messages.application` |  | 34 |
| `TradingSessionStatusBroadcast` | `messages.application` |  | 90 |
| `TrailingStopUpdateNotification` | `messages.application` |  | 154 |
| `UnsubscribeRequest` | `messages.application` |  | 26 |
| `UnsubscribeResponse` | `messages.application` |  | 26 |
| `UserLoginRequest` | `messages.application` |  | 58 |
| `UserLoginRequestEncrypted` | `messages.application` |  | 706 |
| `UserLoginResponse` | `messages.application` |  | 26 |
| `UserLogoutRequest` | `messages.application` |  | 26 |
| `UserLogoutResponse` | `messages.application` |  | 26 |
| `XetraEnLightCreateDealNotification` | `messages.application` |  | 234 |
| `XetraEnLightDealResponse` | `messages.application` |  | 98 |
| `XetraEnLightDealStatusNotification` | `messages.application` |  | 58 |
| `XetraEnLightDeleteAllQuoteNotification` | `messages.application` |  | 42 |
| `XetraEnLightDeleteAllQuoteRequest` | `messages.application` |  | 26 |
| `XetraEnLightEnterQuoteRequest` | `messages.application` |  | 154 |
| `XetraEnLightHitQuoteRequest` | `messages.application` |  | 154 |
| `XetraEnLightNegotiationNotification` | `messages.application` |  | 266 |
| `XetraEnLightNegotiationRequesterNotification` | `messages.application` |  | 522 |
| `XetraEnLightNegotiationStatusNotification` | `messages.application` |  | 74 |
| `XetraEnLightOpenNegotiationNotification` | `messages.application` |  | 290 |
| `XetraEnLightOpenNegotiationRequest` | `messages.application` |  | 330 |
| `XetraEnLightOpenNegotiationRequesterNotification` | `messages.application` |  | 394 |
| `XetraEnLightQuoteNotification` | `messages.application` |  | 186 |
| `XetraEnLightQuoteRequesterNotification` | `messages.application` |  | 74 |
| `XetraEnLightQuoteResponse` | `messages.application` |  | 58 |
| `XetraEnLightQuoteSnapshotNotification` | `messages.application` |  | 42 |
| `XetraEnLightQuoteSnapshotRequest` | `messages.application` |  | 18 |
| `XetraEnLightQuotingStatusRequest` | `messages.application` |  | 42 |
| `XetraEnLightResponse` | `messages.application` |  | 26 |
| `XetraEnLightStatusBroadcast` | `messages.application` |  | 42 |
| `XetraEnLightUpdateNegotiationRequest` | `messages.application` |  | 298 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :eurex-t7-xti-fbe-v15-0:build
```

Run the round trip alone:

```
gradle :eurex-t7-xti-fbe-v15-0:roundTrip
```

