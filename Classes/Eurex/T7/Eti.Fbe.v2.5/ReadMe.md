# Eurex Exchange Enhanced Trading Interface Fbe v2.5

Generated Java parser for Eurex Enhanced Trading Interface Fbe v2.5.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [T7](..).

## Usage

Gradle project `:eurex-t7-eti-fbe-v2-5` builds package `omi.eurex.t7.eti.fbe.v2_5`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.eurex.t7.eti.fbe.v2_5.messages.application.AddComplexInstrumentRequest;

AddComplexInstrumentRequest message = new AddComplexInstrumentRequest();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.eurex.t7.eti.fbe.v2_5.dispatch.ClientPacketStream;
import omi.eurex.t7.eti.fbe.v2_5.types.Message;

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
| `AddComplexInstrumentRequest` | `messages.application` |  | 58 |
| `AddComplexInstrumentResponse` | `messages.application` |  | 114 |
| `BroadcastErrorNotification` | `messages.application` |  | 26 |
| `CrossRequest` | `messages.application` |  | 66 |
| `CrossRequestResponse` | `messages.application` |  | 66 |
| `DeleteAllOrderBroadcast` | `messages.application` |  | 98 |
| `DeleteAllOrderNrResponse` | `messages.application` |  | 66 |
| `DeleteAllOrderQuoteEventBroadcast` | `messages.application` |  | 82 |
| `DeleteAllOrderRequest` | `messages.application` |  | 50 |
| `DeleteAllOrderResponse` | `messages.application` |  | 90 |
| `DeleteAllQuoteBroadcast` | `messages.application` |  | 98 |
| `DeleteAllQuoteRequest` | `messages.application` |  | 34 |
| `DeleteAllQuoteResponse` | `messages.application` |  | 74 |
| `DeleteOrderBroadcast` | `messages.application` |  | 122 |
| `DeleteOrderComplexRequest` | `messages.application` |  | 66 |
| `DeleteOrderNrResponse` | `messages.application` |  | 114 |
| `DeleteOrderResponse` | `messages.application` |  | 130 |
| `DeleteOrderSingleRequest` | `messages.application` |  | 66 |
| `ForcedLogoutNotification` | `messages.application` |  | 18 |
| `GatewayRequest` | `messages.application` |  | 90 |
| `GatewayResponse` | `messages.application` |  | 50 |
| `Heartbeat` | `messages.application` |  | 10 |
| `HeartbeatNotification` | `messages.application` |  | 10 |
| `InquireEnrichmentRuleIdListRequest` | `messages.application` |  | 34 |
| `InquireEnrichmentRuleIdListResponse` | `messages.application` |  | 50 |
| `InquireMmParameterRequest` | `messages.application` |  | 26 |
| `InquireMmParameterResponse` | `messages.application` |  | 74 |
| `InquireSessionListRequest` | `messages.application` |  | 18 |
| `InquireSessionListResponse` | `messages.application` |  | 34 |
| `InquireUserRequest` | `messages.application` |  | 34 |
| `InquireUserResponse` | `messages.application` |  | 50 |
| `LegalNotificationBroadcast` | `messages.application` |  | 50 |
| `LogonRequest` | `messages.application` |  | 274 |
| `LogonResponse` | `messages.application` |  | 82 |
| `LogoutRequest` | `messages.application` |  | 18 |
| `LogoutResponse` | `messages.application` |  | 26 |
| `MassQuoteRequest` | `messages.application` |  | 50 |
| `MassQuoteResponse` | `messages.application` |  | 82 |
| `MmParameterDefinitionRequest` | `messages.application` |  | 58 |
| `MmParameterDefinitionResponse` | `messages.application` |  | 66 |
| `ModifyOrderComplexRequest` | `messages.application` |  | 194 |
| `ModifyOrderNrResponse` | `messages.application` |  | 122 |
| `ModifyOrderResponse` | `messages.application` |  | 146 |
| `ModifyOrderSingleRequest` | `messages.application` |  | 202 |
| `ModifyOrderSingleShortRequest` | `messages.application` |  | 66 |
| `NewOrderComplexRequest` | `messages.application` |  | 178 |
| `NewOrderNrResponse` | `messages.application` |  | 98 |
| `NewOrderResponse` | `messages.application` |  | 130 |
| `NewOrderSingleRequest` | `messages.application` |  | 178 |
| `NewOrderSingleShortRequest` | `messages.application` |  | 58 |
| `NewsBroadcast` | `messages.application` |  | 306 |
| `OrderExecNotification` | `messages.application` |  | 130 |
| `OrderExecReportBroadcast` | `messages.application` |  | 298 |
| `OrderExecResponse` | `messages.application` |  | 162 |
| `PartyActionReport` | `messages.application` |  | 66 |
| `PartyEntitlementsUpdateReport` | `messages.application` |  | 82 |
| `QuoteActivationNotification` | `messages.application` |  | 82 |
| `QuoteActivationRequest` | `messages.application` |  | 42 |
| `QuoteActivationResponse` | `messages.application` |  | 74 |
| `QuoteExecutionReport` | `messages.application` |  | 74 |
| `Reject` | `messages.application` |  | 66 |
| `RetransmitMeMessageRequest` | `messages.application` |  | 58 |
| `RetransmitMeMessageResponse` | `messages.application` |  | 66 |
| `RetransmitRequest` | `messages.application` |  | 42 |
| `RetransmitResponse` | `messages.application` |  | 50 |
| `RfqRequest` | `messages.application` |  | 66 |
| `RfqResponse` | `messages.application` |  | 66 |
| `RiskNotificationBroadcast` | `messages.application` |  | 82 |
| `ServiceAvailabilityBroadcast` | `messages.application` |  | 42 |
| `SubscribeRequest` | `messages.application` |  | 26 |
| `SubscribeResponse` | `messages.application` |  | 34 |
| `ThrottleUpdateNotification` | `messages.application` |  | 26 |
| `TmTradingSessionStatusBroadcast` | `messages.application` |  | 42 |
| `TradeBroadcast` | `messages.application` |  | 298 |
| `TradingSessionStatusBroadcast` | `messages.application` |  | 90 |
| `UnsubscribeRequest` | `messages.application` |  | 26 |
| `UnsubscribeResponse` | `messages.application` |  | 26 |
| `UserLoginRequest` | `messages.application` |  | 58 |
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
gradle :eurex-t7-eti-fbe-v2-5:build
```

Run the round trip alone:

```
gradle :eurex-t7-eti-fbe-v2-5:roundTrip
```

