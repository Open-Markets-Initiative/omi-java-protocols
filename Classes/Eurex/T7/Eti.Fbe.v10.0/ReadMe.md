# Eurex Exchange Enhanced Trading Interface Fbe v10.0

Generated Java parser for Eurex Enhanced Trading Interface Fbe v10.0.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [T7](..).

## Usage

Gradle project `:eurex-t7-eti-fbe-v10-0` builds package `omi.eurex.t7.eti.fbe.v10_0`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.eurex.t7.eti.fbe.v10_0.messages.application.AddComplexInstrumentRequest;

AddComplexInstrumentRequest message = new AddComplexInstrumentRequest();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.eurex.t7.eti.fbe.v10_0.dispatch.ClientPacketStream;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;

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
| `AddComplexInstrumentRequest` | `messages.application` |  | 50 |
| `AddComplexInstrumentResponse` | `messages.application` |  | 106 |
| `AddFlexibleInstrumentRequest` | `messages.application` |  | 66 |
| `AddFlexibleInstrumentResponse` | `messages.application` |  | 98 |
| `AmendBasketTradeRequest` | `messages.application` |  | 90 |
| `ApproveBasketTradeRequest` | `messages.application` |  | 106 |
| `ApproveReverseTesTradeRequest` | `messages.application` |  | 66 |
| `ApproveTesTradeRequest` | `messages.application` |  | 234 |
| `BasketApproveBroadcast` | `messages.application` |  | 122 |
| `BasketBroadcast` | `messages.application` |  | 122 |
| `BasketDeleteBroadcast` | `messages.application` |  | 90 |
| `BasketExecutionBroadcast` | `messages.application` |  | 90 |
| `BasketResponse` | `messages.application` |  | 50 |
| `BroadcastErrorNotification` | `messages.application` |  | 26 |
| `ClipDeletionNotification` | `messages.application` |  | 106 |
| `ClipExecutionNotification` | `messages.application` |  | 122 |
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
| `DeleteClipRequest` | `messages.application` |  | 66 |
| `DeleteOrderBroadcast` | `messages.application` |  | 154 |
| `DeleteOrderComplexRequest` | `messages.application` |  | 122 |
| `DeleteOrderNrResponse` | `messages.application` |  | 114 |
| `DeleteOrderResponse` | `messages.application` |  | 130 |
| `DeleteOrderSingleRequest` | `messages.application` |  | 114 |
| `DeleteTesTradeRequest` | `messages.application` |  | 66 |
| `EnterBasketTradeRequest` | `messages.application` |  | 82 |
| `EnterClipRequest` | `messages.application` |  | 74 |
| `EnterTesTradeRequest` | `messages.application` |  | 234 |
| `ForcedLogoutNotification` | `messages.application` |  | 18 |
| `ForcedUserLogoutNotification` | `messages.application` |  | 18 |
| `Heartbeat` | `messages.application` |  | 10 |
| `HeartbeatNotification` | `messages.application` |  | 10 |
| `InquireEnrichmentRuleIdListRequest` | `messages.application` |  | 34 |
| `InquireEnrichmentRuleIdListResponse` | `messages.application` |  | 50 |
| `InquireMmParameterRequest` | `messages.application` |  | 26 |
| `InquireMmParameterResponse` | `messages.application` |  | 66 |
| `InquirePreTradeRiskLimitsRequest` | `messages.application` |  | 34 |
| `InquireSessionListRequest` | `messages.application` |  | 18 |
| `InquireSessionListResponse` | `messages.application` |  | 34 |
| `InquireUserRequest` | `messages.application` |  | 34 |
| `InquireUserResponse` | `messages.application` |  | 50 |
| `LegalNotificationBroadcast` | `messages.application` |  | 50 |
| `LogonRequest` | `messages.application` |  | 274 |
| `LogonResponse` | `messages.application` |  | 90 |
| `LogoutRequest` | `messages.application` |  | 18 |
| `LogoutResponse` | `messages.application` |  | 26 |
| `MassQuoteRequest` | `messages.application` |  | 66 |
| `MassQuoteResponse` | `messages.application` |  | 74 |
| `MmParameterDefinitionRequest` | `messages.application` |  | 66 |
| `MmParameterDefinitionResponse` | `messages.application` |  | 58 |
| `ModifyBasketTradeRequest` | `messages.application` |  | 90 |
| `ModifyOrderComplexRequest` | `messages.application` |  | 258 |
| `ModifyOrderComplexShortRequest` | `messages.application` |  | 130 |
| `ModifyOrderNrResponse` | `messages.application` |  | 130 |
| `ModifyOrderResponse` | `messages.application` |  | 154 |
| `ModifyOrderSingleRequest` | `messages.application` |  | 266 |
| `ModifyOrderSingleShortRequest` | `messages.application` |  | 122 |
| `ModifyTesTradeRequest` | `messages.application` |  | 106 |
| `NewOrderComplexRequest` | `messages.application` |  | 234 |
| `NewOrderComplexShortRequest` | `messages.application` |  | 122 |
| `NewOrderNrResponse` | `messages.application` |  | 114 |
| `NewOrderResponse` | `messages.application` |  | 146 |
| `NewOrderSingleRequest` | `messages.application` |  | 242 |
| `NewOrderSingleShortRequest` | `messages.application` |  | 114 |
| `NewsBroadcast` | `messages.application` |  | 306 |
| `OrderExecNotification` | `messages.application` |  | 162 |
| `OrderExecReportBroadcast` | `messages.application` |  | 346 |
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
| `Reject` | `messages.application` |  | 58 |
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
| `SrqsHitQuoteRequest` | `messages.application` |  | 362 |
| `SrqsInquireSmartRespondentRequest` | `messages.application` |  | 26 |
| `SrqsInquireSmartRespondentResponse` | `messages.application` |  | 34 |
| `SrqsNegotiationNotification` | `messages.application` |  | 450 |
| `SrqsNegotiationRequesterNotification` | `messages.application` |  | 458 |
| `SrqsNegotiationStatusNotification` | `messages.application` |  | 82 |
| `SrqsOpenNegotiationNotification` | `messages.application` |  | 482 |
| `SrqsOpenNegotiationRequest` | `messages.application` |  | 394 |
| `SrqsOpenNegotiationRequesterNotification` | `messages.application` |  | 458 |
| `SrqsQuoteNotification` | `messages.application` |  | 410 |
| `SrqsQuoteResponse` | `messages.application` |  | 58 |
| `SrqsQuotingStatusRequest` | `messages.application` |  | 170 |
| `SrqsStatusBroadcast` | `messages.application` |  | 42 |
| `SrqsUpdateDealStatusRequest` | `messages.application` |  | 202 |
| `SrqsUpdateNegotiationRequest` | `messages.application` |  | 354 |
| `SubscribeRequest` | `messages.application` |  | 26 |
| `SubscribeResponse` | `messages.application` |  | 34 |
| `TesApproveBroadcast` | `messages.application` |  | 418 |
| `TesBroadcast` | `messages.application` |  | 282 |
| `TesCompressionRunStatusBroadcast` | `messages.application` |  | 50 |
| `TesCompressionRunStatusRequest` | `messages.application` |  | 34 |
| `TesCompressionRunStatusResponse` | `messages.application` |  | 42 |
| `TesDeleteBroadcast` | `messages.application` |  | 90 |
| `TesExecutionBroadcast` | `messages.application` |  | 74 |
| `TesResponse` | `messages.application` |  | 50 |
| `TesReversalBroadcast` | `messages.application` |  | 218 |
| `TesTradeBroadcast` | `messages.application` |  | 426 |
| `TesTradingSessionStatusBroadcast` | `messages.application` |  | 42 |
| `TesUploadBroadcast` | `messages.application` |  | 258 |
| `ThrottleUpdateNotification` | `messages.application` |  | 26 |
| `TmTradingSessionStatusBroadcast` | `messages.application` |  | 42 |
| `TradeBroadcast` | `messages.application` |  | 410 |
| `TradingSessionStatusBroadcast` | `messages.application` |  | 90 |
| `UnsubscribeRequest` | `messages.application` |  | 26 |
| `UnsubscribeResponse` | `messages.application` |  | 26 |
| `UploadTesTradeRequest` | `messages.application` |  | 234 |
| `UserLoginRequest` | `messages.application` |  | 58 |
| `UserLoginResponse` | `messages.application` |  | 26 |
| `UserLogoutRequest` | `messages.application` |  | 26 |
| `UserLogoutResponse` | `messages.application` |  | 26 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Eurex/T7.Eti.Fbe.v10.0` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :eurex-t7-eti-fbe-v10-0:build
```

Run the round trip alone:

```
gradle :eurex-t7-eti-fbe-v10-0:roundTrip
```

