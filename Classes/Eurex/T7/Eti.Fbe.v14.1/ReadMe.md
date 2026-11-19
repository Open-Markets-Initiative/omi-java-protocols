# Eurex Exchange Enhanced Trading Interface Fbe v14.1

Generated Java parser for Eurex Enhanced Trading Interface Fbe v14.1.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [T7](..).

## Usage

Gradle project `:eurex-t7-eti-fbe-v14-1` builds package `omi.eurex.t7.eti.fbe.v14_1`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.eurex.t7.eti.fbe.v14_1.messages.application.AddComplexInstrumentRequest;

AddComplexInstrumentRequest message = new AddComplexInstrumentRequest();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.eurex.t7.eti.fbe.v14_1.dispatch.ClientPacketStream;
import omi.eurex.t7.eti.fbe.v14_1.types.Message;

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
| `AddComplexInstrumentRequest` | `messages.application` |  | 298 |
| `AddComplexInstrumentResponse` | `messages.application` |  | 122 |
| `AddFlexibleInstrumentRequest` | `messages.application` |  | 66 |
| `AddFlexibleInstrumentResponse` | `messages.application` |  | 98 |
| `AddScaledSimpleInstrumentRequest` | `messages.application` |  | 274 |
| `AddScaledSimpleInstrumentResponse` | `messages.application` |  | 98 |
| `AmendBasketTradeRequest` | `messages.application` |  | 90 |
| `ApproveBasketTradeRequest` | `messages.application` |  | 106 |
| `ApproveReverseTesTradeRequest` | `messages.application` |  | 66 |
| `ApproveTesTradeRequest` | `messages.application` |  | 250 |
| `BasketApproveBroadcast` | `messages.application` |  | 130 |
| `BasketBroadcast` | `messages.application` |  | 122 |
| `BasketDeleteBroadcast` | `messages.application` |  | 90 |
| `BasketExecutionBroadcast` | `messages.application` |  | 98 |
| `BasketResponse` | `messages.application` |  | 50 |
| `BasketRollBroadcast` | `messages.application` |  | 242 |
| `BasketRollRequest` | `messages.application` |  | 170 |
| `BroadcastErrorNotification` | `messages.application` |  | 22 |
| `ClipDeletionNotification` | `messages.application` |  | 122 |
| `ClipExecutionNotification` | `messages.application` |  | 138 |
| `ClipResponse` | `messages.application` |  | 82 |
| `CrossRequest` | `messages.application` |  | 58 |
| `CrossRequestResponse` | `messages.application` |  | 58 |
| `DeleteAllOrderBroadcast` | `messages.application` |  | 106 |
| `DeleteAllOrderNrResponse` | `messages.application` |  | 58 |
| `DeleteAllOrderQuoteEventBroadcast` | `messages.application` |  | 82 |
| `DeleteAllOrderRequest` | `messages.application` |  | 66 |
| `DeleteAllOrderResponse` | `messages.application` |  | 82 |
| `DeleteAllQuoteBroadcast` | `messages.application` |  | 98 |
| `DeleteAllQuoteRequest` | `messages.application` |  | 50 |
| `DeleteAllQuoteResponse` | `messages.application` |  | 66 |
| `DeleteBasketTradeRequest` | `messages.application` |  | 58 |
| `DeleteClipRequest` | `messages.application` |  | 74 |
| `DeleteOrderBroadcast` | `messages.application` |  | 154 |
| `DeleteOrderNrResponse` | `messages.application` |  | 114 |
| `DeleteOrderRequest` | `messages.application` |  | 122 |
| `DeleteOrderResponse` | `messages.application` |  | 130 |
| `DeleteTesTradeRequest` | `messages.application` |  | 58 |
| `EnterBasketTradeRequest` | `messages.application` |  | 82 |
| `EnterClipRequest` | `messages.application` |  | 82 |
| `EnterTesTradeRequest` | `messages.application` |  | 226 |
| `ForcedLogoutNotification` | `messages.application` |  | 12 |
| `ForcedUserLogoutNotification` | `messages.application` |  | 17 |
| `Heartbeat` | `messages.application` |  | 10 |
| `HeartbeatNotification` | `messages.application` |  | 10 |
| `InquireEnrichmentRuleIdListRequest` | `messages.application` |  | 34 |
| `InquireEnrichmentRuleIdListResponse` | `messages.application` |  | 50 |
| `InquireMarginBasedRiskLimitRequest` | `messages.application` |  | 26 |
| `InquireMarginBasedRiskLimitResponse` | `messages.application` |  | 66 |
| `InquireMmParameterRequest` | `messages.application` |  | 26 |
| `InquireMmParameterResponse` | `messages.application` |  | 66 |
| `InquirePreTradeRiskLimitsRequest` | `messages.application` |  | 34 |
| `InquireSessionListRequest` | `messages.application` |  | 18 |
| `InquireSessionListResponse` | `messages.application` |  | 34 |
| `InquireUserRequest` | `messages.application` |  | 34 |
| `InquireUserResponse` | `messages.application` |  | 50 |
| `LegalNotificationBroadcast` | `messages.application` |  | 45 |
| `LogonRequest` | `messages.application` |  | 274 |
| `LogonRequestEncrypted` | `messages.application` |  | 930 |
| `LogonResponse` | `messages.application` |  | 96 |
| `LogoutRequest` | `messages.application` |  | 18 |
| `LogoutResponse` | `messages.application` |  | 26 |
| `MassOrder` | `messages.application` |  | 202 |
| `MassOrderAck` | `messages.application` |  | 66 |
| `MassQuoteRequest` | `messages.application` |  | 66 |
| `MassQuoteResponse` | `messages.application` |  | 74 |
| `MmParameterDefinitionRequest` | `messages.application` |  | 66 |
| `MmParameterDefinitionResponse` | `messages.application` |  | 58 |
| `ModifyBasketTradeRequest` | `messages.application` |  | 90 |
| `ModifyOrderNrResponse` | `messages.application` |  | 130 |
| `ModifyOrderRequest` | `messages.application` |  | 298 |
| `ModifyOrderResponse` | `messages.application` |  | 154 |
| `ModifyOrderShortRequest` | `messages.application` |  | 138 |
| `ModifyTesTradeRequest` | `messages.application` |  | 106 |
| `NewOrderNrResponse` | `messages.application` |  | 114 |
| `NewOrderRequest` | `messages.application` |  | 274 |
| `NewOrderResponse` | `messages.application` |  | 146 |
| `NewOrderShortRequest` | `messages.application` |  | 130 |
| `NewsBroadcast` | `messages.application` |  | 300 |
| `OrderExecNotification` | `messages.application` |  | 162 |
| `OrderExecReportBroadcast` | `messages.application` |  | 354 |
| `OrderExecResponse` | `messages.application` |  | 170 |
| `PartyActionReport` | `messages.application` |  | 66 |
| `PartyEntitlementsUpdateReport` | `messages.application` |  | 82 |
| `PingRequest` | `messages.application` |  | 26 |
| `PingResponse` | `messages.application` |  | 58 |
| `PreTradeRiskLimitResponse` | `messages.application` |  | 74 |
| `PreTradeRiskLimitsDefinitionRequest` | `messages.application` |  | 42 |
| `QuoteActivationNotification` | `messages.application` |  | 82 |
| `QuoteActivationRequest` | `messages.application` |  | 50 |
| `QuoteActivationResponse` | `messages.application` |  | 66 |
| `QuoteExecutionReport` | `messages.application` |  | 74 |
| `Reject` | `messages.application` |  | 57 |
| `RetransmitMeMessageRequest` | `messages.application` |  | 58 |
| `RetransmitMeMessageResponse` | `messages.application` |  | 66 |
| `RetransmitRequest` | `messages.application` |  | 42 |
| `RetransmitResponse` | `messages.application` |  | 50 |
| `ReverseTesTradeRequest` | `messages.application` |  | 194 |
| `RfqRequest` | `messages.application` |  | 66 |
| `RfqResponse` | `messages.application` |  | 58 |
| `RiskNotificationBroadcast` | `messages.application` |  | 82 |
| `ServiceAvailabilityBroadcast` | `messages.application` |  | 50 |
| `ServiceAvailabilityMarketBroadcast` | `messages.application` |  | 26 |
| `SrqsCreateDealNotification` | `messages.application` |  | 442 |
| `SrqsDealNotification` | `messages.application` |  | 394 |
| `SrqsDealResponse` | `messages.application` |  | 90 |
| `SrqsEnterQuoteRequest` | `messages.application` |  | 370 |
| `SrqsHitQuoteRequest` | `messages.application` |  | 386 |
| `SrqsInquireSmartRespondentRequest` | `messages.application` |  | 26 |
| `SrqsInquireSmartRespondentResponse` | `messages.application` |  | 34 |
| `SrqsNegotiationNotification` | `messages.application` |  | 586 |
| `SrqsNegotiationRequesterNotification` | `messages.application` |  | 594 |
| `SrqsNegotiationStatusNotification` | `messages.application` |  | 82 |
| `SrqsOpenNegotiationNotification` | `messages.application` |  | 610 |
| `SrqsOpenNegotiationRequest` | `messages.application` |  | 530 |
| `SrqsOpenNegotiationRequesterNotification` | `messages.application` |  | 586 |
| `SrqsQuoteNotification` | `messages.application` |  | 410 |
| `SrqsQuoteResponse` | `messages.application` |  | 58 |
| `SrqsQuoteSnapshotNotification` | `messages.application` |  | 42 |
| `SrqsQuoteSnapshotRequest` | `messages.application` |  | 18 |
| `SrqsQuotingStatusRequest` | `messages.application` |  | 170 |
| `SrqsResponse` | `messages.application` |  | 26 |
| `SrqsStatusBroadcast` | `messages.application` |  | 42 |
| `SrqsUpdateDealStatusRequest` | `messages.application` |  | 202 |
| `SrqsUpdateNegotiationRequest` | `messages.application` |  | 482 |
| `StatusBroadcast` | `messages.application` |  | 42 |
| `SubscribeRequest` | `messages.application` |  | 26 |
| `SubscribeResponse` | `messages.application` |  | 34 |
| `TesApproveBroadcast` | `messages.application` |  | 410 |
| `TesBroadcast` | `messages.application` |  | 274 |
| `TesDeleteBroadcast` | `messages.application` |  | 82 |
| `TesExecutionBroadcast` | `messages.application` |  | 66 |
| `TesResponse` | `messages.application` |  | 50 |
| `TesReversalBroadcast` | `messages.application` |  | 218 |
| `TesTradeBroadcast` | `messages.application` |  | 458 |
| `TesTradingSessionStatusBroadcast` | `messages.application` |  | 42 |
| `TesUploadBroadcast` | `messages.application` |  | 250 |
| `ThrottleUpdateNotification` | `messages.application` |  | 26 |
| `TmTradingSessionStatusBroadcast` | `messages.application` |  | 42 |
| `TradeBroadcast` | `messages.application` |  | 442 |
| `TradingSessionStatusBroadcast` | `messages.application` |  | 90 |
| `UnsubscribeRequest` | `messages.application` |  | 26 |
| `UnsubscribeResponse` | `messages.application` |  | 26 |
| `UpdateRemainingRiskAllowanceBaseRequest` | `messages.application` |  | 26 |
| `UpdateRemainingRiskAllowanceBaseResponse` | `messages.application` |  | 58 |
| `UploadTesTradeRequest` | `messages.application` |  | 226 |
| `UserLoginRequest` | `messages.application` |  | 58 |
| `UserLoginRequestEncrypted` | `messages.application` |  | 706 |
| `UserLoginResponse` | `messages.application` |  | 26 |
| `UserLogoutRequest` | `messages.application` |  | 26 |
| `UserLogoutResponse` | `messages.application` |  | 26 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :eurex-t7-eti-fbe-v14-1:build
```

Run the round trip alone:

```
gradle :eurex-t7-eti-fbe-v14-1:roundTrip
```

