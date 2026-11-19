# National Stock Exchange of India Ltd Order Entry Nnf v3.5

Generated Java parser for Nse Order Entry Nnf v3.5.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [NSE Commodity Derivatives](..).

## Usage

Gradle project `:nse-nsecom-orderentry-nnf-v3-5` builds package `omi.nse.nsecom.orderentry.nnf.v3_5`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.BatchOrderCancelMessage;

BatchOrderCancelMessage message = new BatchOrderCancelMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.nse.nsecom.orderentry.nnf.v3_5.dispatch.ClientPacketStream;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.Message;

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
| `BatchOrderCancelMessage` | `messages.application` |  | 276 |
| `BcastAssetMstrChgMessage` | `messages.application` |  | 392 |
| `BoardLotInMessage` | `messages.application` |  | 276 |
| `BoardLotOutMessage` | `messages.application` |  | 276 |
| `BoxSignOffMessage` | `messages.application` |  | 2 |
| `BoxSignOnRequestInMessage` | `messages.application` |  | 20 |
| `BoxSignOnRequestOutMessage` | `messages.application` |  | 12 |
| `BranchOrdValLimitUpdateInMessage` | `messages.application` |  | 96 |
| `BranchOrdValLimitUpdateOuMessage` | `messages.application` |  | 96 |
| `CancelNegOrderMessage` | `messages.application` |  | 276 |
| `ColUserStatusChangeInMessage` | `messages.application` |  | 12 |
| `ColUserStatusChangeOutMessage` | `messages.application` |  | 6 |
| `DealerLimitUpdateOutMessage` | `messages.application` |  | 26 |
| `DownloadRequestMessage` | `messages.application` |  | 8 |
| `ErrorResponseOutMessage` | `messages.application` |  | 142 |
| `FreezeToControlMessage` | `messages.application` |  | 276 |
| `GrRequestMessage` | `messages.application` |  | 8 |
| `GrResponseMessage` | `messages.application` |  | 84 |
| `NegOrderToBlMessage` | `messages.application` |  | 276 |
| `NormalOrdLimitUpdateInMessage` | `messages.application` |  | 26 |
| `OnStopNotificationMessage` | `messages.application` |  | 256 |
| `OpenOrderReportMessage` | `messages.application` |  | 68 |
| `OrderCancelConfirmationMessage` | `messages.application` |  | 276 |
| `OrderCancelInMessage` | `messages.application` |  | 276 |
| `OrderCancelOutMessage` | `messages.application` |  | 276 |
| `OrderCancelRejectMessage` | `messages.application` |  | 276 |
| `OrderConfirmationMessage` | `messages.application` |  | 276 |
| `OrderErrorMessage` | `messages.application` |  | 276 |
| `OrderModConfirmationMessage` | `messages.application` |  | 276 |
| `OrderModInMessage` | `messages.application` |  | 276 |
| `OrderModOutMessage` | `messages.application` |  | 276 |
| `OrderModRejectMessage` | `messages.application` |  | 276 |
| `PartialSystemInformationMessage` | `messages.application` |  | 66 |
| `PriceModInMessage` | `messages.application` |  | 66 |
| `ResetUserPasswordInMessage` | `messages.application` |  | 18 |
| `ResetUserPasswordOutMessage` | `messages.application` |  | 18 |
| `SecureBoxRegistrationRequestInMessage` | `messages.application` |  | 2 |
| `SignOffTraderInMessage` | `messages.application` |  | 238 |
| `SignOffTraderOutMessage` | `messages.application` |  | 238 |
| `SignOnRequestInMessage` | `messages.application` |  | 238 |
| `SignOnRequestOutMessage` | `messages.application` |  | 238 |
| `SpBoardLotInMessage` | `messages.application` |  | 440 |
| `SpBoardLotOutMessage` | `messages.application` |  | 440 |
| `SpOrderCancelInMessage` | `messages.application` |  | 440 |
| `SpOrderCancelOutMessage` | `messages.application` |  | 440 |
| `SpOrderConfirmationMessage` | `messages.application` |  | 440 |
| `SpOrderCxlConfirmationMessage` | `messages.application` |  | 440 |
| `SpOrderCxlRejOutMessage` | `messages.application` |  | 440 |
| `SpOrderModConOutMessage` | `messages.application` |  | 440 |
| `SpOrderModInMessage` | `messages.application` |  | 440 |
| `SpOrderModOutMessage` | `messages.application` |  | 440 |
| `SpOrderModRejOutMessage` | `messages.application` |  | 440 |
| `SpdOrdLimitUpdateOutMessage` | `messages.application` |  | 26 |
| `SpreadOrdLimitUpdateInMessage` | `messages.application` |  | 26 |
| `SpreadOrderLogReportMessage` | `messages.application` |  | 68 |
| `SpreadTradeReportMessage` | `messages.application` |  | 68 |
| `SystemInformationInMessage` | `messages.application` |  | 4 |
| `SystemInformationOutMessage` | `messages.application` |  | 66 |
| `ThrlBoardLotInMessage` | `messages.application` |  | 440 |
| `ThrlBoardLotOutMessage` | `messages.application` |  | 440 |
| `ThrlOrderConfirmationMessage` | `messages.application` |  | 440 |
| `ThrlOrderCxlConfirmationMessage` | `messages.application` |  | 440 |
| `ThrlOrderErrorMessage` | `messages.application` |  | 440 |
| `TradeCancelConfirmMessage` | `messages.application` |  | 256 |
| `TradeCancelInMessage` | `messages.application` |  | 194 |
| `TradeCancelOutMessage` | `messages.application` |  | 194 |
| `TradeCancelRejectMessage` | `messages.application` |  | 256 |
| `TradeConfirmationMessage` | `messages.application` |  | 256 |
| `TradeErrorMessage` | `messages.application` |  | 194 |
| `TradeModInMessage` | `messages.application` |  | 194 |
| `TradeModifyConfirmMessage` | `messages.application` |  | 256 |
| `TradeModifyRejectMessage` | `messages.application` |  | 256 |
| `TwolBoardLotInMessage` | `messages.application` |  | 440 |
| `TwolBoardLotOutMessage` | `messages.application` |  | 440 |
| `TwolOrderConfirmationMessage` | `messages.application` |  | 440 |
| `TwolOrderCxlConfirmationMessage` | `messages.application` |  | 440 |
| `TwolOrderErrorMessage` | `messages.application` |  | 440 |
| `UpdateLocaldbHeaderMessage` | `messages.application` |  | 2 |
| `UpdateLocaldbInMessage` | `messages.application` |  | 42 |
| `UpdateLocaldbTrailerMessage` | `messages.application` |  | 2 |
| `UserAddrUnlockApproveOutMessage` | `messages.application` |  | 40 |
| `UserAddrUnlockConfirmOutMessage` | `messages.application` |  | 40 |
| `UserAddrUnlockInMessage` | `messages.application` |  | 74 |
| `UserAddrUnlockRejectOutMessage` | `messages.application` |  | 40 |
| `UserOrdValLimitUpdateInMessage` | `messages.application` |  | 168 |
| `UserOrderLimitUpdateOutMessage` | `messages.application` |  | 166 |
| `HeaderRecordMessage` | `messages.session` |  | 0 |
| `MessageRecordMessage` | `messages.session` |  | 0 |
| `TrailerRecordMessage` | `messages.session` |  | 0 |
| `SecureBoxRegistrationResponseOutMessage` | `messages.session` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nse-nsecom-orderentry-nnf-v3-5:build
```

Run the round trip alone:

```
gradle :nse-nsecom-orderentry-nnf-v3-5:roundTrip
```

