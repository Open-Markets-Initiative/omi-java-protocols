# Euronext Order Entry Gateway Sbe v1.3

Generated Java parser for Euronext Order Entry Gateway Sbe v1.3.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Euronext Optiq](..).

## Usage

Gradle project `:euronext-optiq-orderentrygateway-sbe-v1-3` builds package `omi.euronext.optiq.orderentrygateway.sbe.v1_3`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application.AckMessage;

AckMessage message = new AckMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.dispatch.PacketStream;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;

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
| `AckMessage` | `messages.application` |  | 125 |
| `AskForQuoteMessage` | `messages.application` |  | 18 |
| `CancelReplaceMessage` | `messages.application` |  | 89 |
| `CancelRequestMessage` | `messages.application` |  | 59 |
| `CollarBreachConfirmationMessage` | `messages.application` |  | 57 |
| `DeclarationCancelAndRefusalMessage` | `messages.application` |  | 42 |
| `DeclarationEntryAckMessage` | `messages.application` |  | 40 |
| `DeclarationEntryMessage` | `messages.application` |  | 198 |
| `DeclarationEntryRejectMessage` | `messages.application` |  | 35 |
| `DeclarationNoticeMessage` | `messages.application` |  | 201 |
| `FillMessage` | `messages.application` |  | 101 |
| `FundPriceInputAckMessage` | `messages.application` |  | 34 |
| `FundPriceInputMessage` | `messages.application` |  | 42 |
| `InstrumentSynchronizationListMessage` | `messages.application` |  | 16 |
| `KillMessage` | `messages.application` |  | 99 |
| `LiquidityProviderCommandMessage` | `messages.application` |  | 42 |
| `LogonAckMessage` | `messages.application` |  | 12 |
| `LogonMessage` | `messages.application` |  | 19 |
| `LogonRejectMessage` | `messages.application` |  | 17 |
| `LogoutMessage` | `messages.application` |  | 1 |
| `MassCancelAckMessage` | `messages.application` |  | 108 |
| `MassCancelMessage` | `messages.application` |  | 64 |
| `NewOrderMessage` | `messages.application` |  | 72 |
| `OpenOrderRequestMessage` | `messages.application` |  | 57 |
| `OwnershipRequestAckMessage` | `messages.application` |  | 42 |
| `OwnershipRequestMessage` | `messages.application` |  | 63 |
| `PriceInputMessage` | `messages.application` |  | 50 |
| `QuoteAckMessage` | `messages.application` |  | 80 |
| `QuoteRequestMessage` | `messages.application` |  | 62 |
| `QuotesMessage` | `messages.application` |  | 43 |
| `RejectMessage` | `messages.application` |  | 96 |
| `RequestForExecutionMessage` | `messages.application` |  | 17 |
| `RfqMatchingStatusMessage` | `messages.application` |  | 76 |
| `RfqNotificationMessage` | `messages.application` |  | 86 |
| `SynchronizationTimeMessage` | `messages.application` |  | 22 |
| `TechnicalRejectMessage` | `messages.application` |  | 17 |
| `TradeBustNotificationMessage` | `messages.application` |  | 69 |
| `UserNotificationMessage` | `messages.application` |  | 33 |
| `HeartbeatMessage` | `messages.application` |  | 0 |
| `TestRequestMessage` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :euronext-optiq-orderentrygateway-sbe-v1-3:build
```

Run the round trip alone:

```
gradle :euronext-optiq-orderentrygateway-sbe-v1-3:roundTrip
```

