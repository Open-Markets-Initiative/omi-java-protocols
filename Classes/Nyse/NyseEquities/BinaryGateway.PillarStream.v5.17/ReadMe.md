# New York Stock Exchange Binary Gateway PillarStream v5.17

Generated Java parser for Nyse Binary Gateway PillarStream v5.17.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [New York Stock Exchange Equities](..).

## Usage

Gradle project `:nyse-nyseequities-binarygateway-pillarstream-v5-17` builds package `omi.nyse.nyseequities.binarygateway.pillarstream.v5_17`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application.ApplicationLayerRejectMessage;

ApplicationLayerRejectMessage message = new ApplicationLayerRejectMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPillarMessageStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.dispatch.ClientPillarMessageStream;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Message;

ClientPillarMessageStream stream = new ClientPillarMessageStream();
for (ClientPillarMessageStream.Record record : stream.append(bytes, 0, bytes.length)) {
    for (Message message : record.decoded().messages()) {
        System.out.println(message);
    }
}
```

Each side of the connection has its own stream: `ClientPillarMessageStream`, `ServerPillarMessageStream`. A record stating a length that is not valid fails the stream, which then reads nothing more.

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `ApplicationLayerRejectMessage` | `messages.application` |  | 39 |
| `AuctionPriceDataMessage` | `messages.application` |  | 42 |
| `AuctionRequestMessage` | `messages.application` |  | 21 |
| `BulkCancelRequestMessage` | `messages.application` |  | 27 |
| `ClientSeqMsg` | `messages.session` |  | 36 |
| `Close` | `messages.session` |  | 12 |
| `CloseResponse` | `messages.session` |  | 13 |
| `DmmSymbolReferenceDataMessage` | `messages.application` |  | 125 |
| `EquitiesSymbolReferenceDataMessage` | `messages.application` |  | 52 |
| `ExecutionReportMessage` | `messages.application` |  | 80 |
| `GtBeginMessage` | `messages.application` |  | 8 |
| `GtEndMessage` | `messages.application` |  | 8 |
| `Heartbeat` | `messages.session` |  | 4 |
| `LoginMessage` | `messages.session` |  | 76 |
| `LoginResponse` | `messages.session` |  | 21 |
| `ManualActionRequestMessage` | `messages.application` |  | 91 |
| `ManualActionResponseMessage` | `messages.application` |  | 65 |
| `MinimumPriceVariantClassReferenceDataMessage` | `messages.application` |  | 46 |
| `MinimumPriceVariantLevelReferenceDataMessage` | `messages.application` |  | 8 |
| `MmidConfigurationMessage` | `messages.application` |  | 138 |
| `MpidConfigurationMessage` | `messages.application` |  | 79 |
| `NewOrderSingleAndCancelReplaceRequestMessage` | `messages.application` |  | 61 |
| `Open` | `messages.session` |  | 30 |
| `OpenResponse` | `messages.session` |  | 14 |
| `OrderAndCancelReplaceAcknowledgementMessage` | `messages.application` |  | 98 |
| `OrderCancelRequestMessage` | `messages.application` |  | 24 |
| `OrderModifyCancelRequestAcknowledgmentAndUroutMessage` | `messages.application` |  | 70 |
| `OrderModifyRequestMessage` | `messages.application` |  | 30 |
| `OrderPriorityUpdateAcknowledgmentMessage` | `messages.application` |  | 58 |
| `RiskActionRequestMessage` | `messages.application` |  | 246 |
| `RiskControlAcknowledgementMessage` | `messages.application` |  | 310 |
| `RiskControlAlertMessage` | `messages.application` |  | 301 |
| `RiskLimitUpdateRequestMessage` | `messages.application` |  | 268 |
| `ServerSeqMsg` | `messages.session` |  | 36 |
| `SessionConfigurationAcknowledgementMessage` | `messages.application` |  | 94 |
| `SessionConfigurationRequestMessage` | `messages.application` |  | 70 |
| `StreamAvail` | `messages.session` |  | 21 |
| `SymbolSubscriptionAcknowledgementMessage` | `messages.application` |  | 29 |
| `SymbolSubscriptionRequestMessage` | `messages.application` |  | 20 |
| `TradeBustCorrectMessage` | `messages.application` |  | 78 |
| `SequencedFillerMessage` | `messages.application` |  | 0 |
| `TgBeginMessage` | `messages.application` |  | 0 |
| `TgEndMessage` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Nyse/NyseEquities.BinaryGateway.PillarStream.v5.17` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nyse-nyseequities-binarygateway-pillarstream-v5-17:build
```

Run the round trip alone:

```
gradle :nyse-nyseequities-binarygateway-pillarstream-v5-17:roundTrip
```

