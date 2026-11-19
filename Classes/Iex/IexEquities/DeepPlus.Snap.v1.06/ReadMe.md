# Investors Exchange DeepPlus Snap v1.06

Generated Java parser for Iex DeepPlus Snap v1.06.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [IEX Equities](..).

## Usage

Gradle project `:iex-iexequities-deepplus-snap-v1-06` builds package `omi.iex.iexequities.deepplus.snap.v1_06`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.iex.iexequities.deepplus.snap.v1_06.messages.application.AddOrderMessage;

AddOrderMessage message = new AddOrderMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.iex.iexequities.deepplus.snap.v1_06.dispatch.PacketStream;
import omi.iex.iexequities.deepplus.snap.v1_06.types.Message;

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
| `AddOrderMessage` | `messages.application` | `'a'` | 37 |
| `ClearBookMessage` | `messages.application` | `'C'` | 17 |
| `ErrorResponseMessage` | `messages.application` | `'e'` | 1 |
| `OperationalHaltStatusMessage` | `messages.application` | `'O'` | 17 |
| `OrderDeleteMessage` | `messages.application` | `'R'` | 25 |
| `OrderExecutedMessage` | `messages.application` | `'L'` | 45 |
| `OrderModifyMessage` | `messages.application` | `'M'` | 37 |
| `RetailLiquidityIndicatorMessage` | `messages.application` | `'I'` | 17 |
| `SecurityDirectoryMessage` | `messages.application` | `'D'` | 30 |
| `SecurityEventMessage` | `messages.application` | `'E'` | 17 |
| `ShortSalePriceTestStatusMessage` | `messages.application` | `'P'` | 18 |
| `SnapshotDataMessage` | `messages.application` | `'d'` | 45 |
| `SnapshotEndMessage` | `messages.application` | `'x'` | 8 |
| `SnapshotRequestMessage` | `messages.application` | `'r'` | 56 |
| `SnapshotStartMessage` | `messages.application` | `'s'` | 8 |
| `SystemEventMessage` | `messages.application` | `'S'` | 9 |
| `TradeBreakMessage` | `messages.application` | `'B'` | 37 |
| `TradeMessage` | `messages.application` | `'T'` | 37 |
| `TradingStatusMessage` | `messages.application` | `'H'` | 21 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :iex-iexequities-deepplus-snap-v1-06:build
```

Run the round trip alone:

```
gradle :iex-iexequities-deepplus-snap-v1-06:roundTrip
```

