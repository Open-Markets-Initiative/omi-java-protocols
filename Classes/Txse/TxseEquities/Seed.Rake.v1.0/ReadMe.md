# Texas Stock Exchange Session Enabled Entry Daemon Rake v1.0

Generated Java parser for Txse Session Enabled Entry Daemon Rake v1.0.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Txse Equities](..).

## Usage

Gradle project `:txse-txseequities-seed-rake-v1-0` builds package `omi.txse.txseequities.seed.rake.v1_0`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.txse.txseequities.seed.rake.v1_0.messages.application.CancelOrderMessage;

CancelOrderMessage message = new CancelOrderMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.txse.txseequities.seed.rake.v1_0.dispatch.ClientPacketStream;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;

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
| `CancelOrderMessage` | `messages.application` | `'C'` | 8 |
| `CancelRejectedMessage` | `messages.application` | `'W'` | 17 |
| `DefineSymbolMessage` | `messages.application` | `'s'` | 32 |
| `LimitOrderAcceptedMessage` | `messages.application` | `'I'` | 46 |
| `LimitOrderMessage` | `messages.application` | `'L'` | 30 |
| `LimitOrderRejectedMessage` | `messages.application` | `'U'` | 39 |
| `MarketOrderAcceptedMessage` | `messages.application` | `'D'` | 34 |
| `MarketOrderMessage` | `messages.application` | `'A'` | 18 |
| `MarketOrderRejectedMessage` | `messages.application` | `'T'` | 27 |
| `MassCancelAcceptedMessage` | `messages.application` | `'O'` | 27 |
| `MassCancelMessage` | `messages.application` | `'V'` | 11 |
| `MassCancelRejectedMessage` | `messages.application` | `'P'` | 20 |
| `MassCancelResultMessage` | `messages.application` | `'Q'` | 28 |
| `ModifyOrderMessage` | `messages.application` | `'M'` | 17 |
| `ModifyRejectedMessage` | `messages.application` | `'N'` | 26 |
| `OrderCanceledMessage` | `messages.application` | `'X'` | 25 |
| `OrderExecutedMessage` | `messages.application` | `'E'` | 48 |
| `OrderModifiedMessage` | `messages.application` | `'Y'` | 37 |
| `OrderReplacedMessage` | `messages.application` | `'J'` | 40 |
| `OrderRestatedMessage` | `messages.application` | `'F'` | 26 |
| `ReplaceOrderMessage` | `messages.application` | `'R'` | 20 |
| `ReplaceRejectedMessage` | `messages.application` | `'K'` | 29 |
| `SelfMatchPreventedMessage` | `messages.application` | `'Z'` | 52 |
| `SymbolStatusMessage` | `messages.application` | `'y'` | 13 |
| `TradingSessionStatusMessage` | `messages.application` | `'i'` | 11 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Txse/TxseEquities.Seed.Rake.v1.0` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :txse-txseequities-seed-rake-v1-0:build
```

Run the round trip alone:

```
gradle :txse-txseequities-seed-rake-v1-0:roundTrip
```

