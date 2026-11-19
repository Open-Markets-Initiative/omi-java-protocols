# Euronext Drop Copy Gateway Sbe v6.64

Generated Java parser for Euronext Drop Copy Gateway Sbe v6.64.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Euronext Optiq](..).

## Usage

Gradle project `:euronext-optiq-dropcopygateway-sbe-v6-64` builds package `omi.euronext.optiq.dropcopygateway.sbe.v6_64`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.messages.application.DcClearBookMessage;

DcClearBookMessage message = new DcClearBookMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.dispatch.PacketStream;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.types.Message;

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
| `DcClearBookMessage` | `messages.application` |  | 38 |
| `DcDeclarationNewMessage` | `messages.application` |  | 221 |
| `DcMarketStatusChangeMessage` | `messages.application` |  | 79 |
| `DcPriceUpdateMessage` | `messages.application` |  | 67 |
| `DcQuoteMessage` | `messages.application` |  | 83 |
| `DcQuoteRequestMessage` | `messages.application` |  | 143 |
| `DcShortDeclarationCancelMessage` | `messages.application` |  | 107 |
| `DcShortDeclarationFillMessage` | `messages.application` |  | 228 |
| `DcShortDeclarationRejectMessage` | `messages.application` |  | 102 |
| `DcShortOrderRejectMessage` | `messages.application` |  | 117 |
| `DcShortTradeCancellationMessage` | `messages.application` |  | 77 |
| `DcShortTradeDeclarationCancellationMessage` | `messages.application` |  | 61 |
| `DcShortTradeDeclarationMessage` | `messages.application` |  | 61 |
| `DcStaticCollarsMessage` | `messages.application` |  | 27 |
| `DcTradeBustDeclarationMessage` | `messages.application` |  | 208 |
| `DcTradeMessage` | `messages.application` |  | 82 |
| `DcafqrfeMessage` | `messages.application` |  | 59 |
| `LongOrderMessage` | `messages.application` |  | 300 |
| `TradeBustNotificationMessage` | `messages.application` |  | 241 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :euronext-optiq-dropcopygateway-sbe-v6-64:build
```

Run the round trip alone:

```
gradle :euronext-optiq-dropcopygateway-sbe-v6-64:roundTrip
```

