# OTC Markets Group OTC Retransmission Link v1.0

Generated Java parser for OtcMarkets OTC Retransmission Link v1.0.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [OTC Link Overnight OTC](..).

## Usage

Gradle project `:otcmarkets-overnight-retransmission-link-v1-0` builds package `omi.otcmarkets.overnight.retransmission.link.v1_0`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.otcmarkets.overnight.retransmission.link.v1_0.messages.application.EndOfSpinMessage;

EndOfSpinMessage message = new EndOfSpinMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.otcmarkets.overnight.retransmission.link.v1_0.dispatch.PacketStream;
import omi.otcmarkets.overnight.retransmission.link.v1_0.types.Message;

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
| `EndOfSpinMessage` | `messages.application` | `'\f'` | 17 |
| `EnhancedSpinRequestMessage` | `messages.application` | `'t'` | 4 |
| `EnhancedSpinResponseMessage` | `messages.application` | `'d'` | 9 |
| `HeartbeatMessage` | `messages.application` | `'h'` | 4 |
| `ImbalanceMessage` | `messages.application` | `'\u001C'` | 52 |
| `LoginRequestMessage` | `messages.application` | `'l'` | 32 |
| `LoginResponseMessage` | `messages.application` | `'a'` | 17 |
| `OrderAddMessage` | `messages.application` | `'\u0015'` | 52 |
| `OrderDeleteMessage` | `messages.application` | `'\u0017'` | 18 |
| `OrderExecutionMessage` | `messages.application` | `'\u0018'` | 34 |
| `OrderExecutionWithPriceMessage` | `messages.application` | `'\u0019'` | 42 |
| `OrderUpdateMessage` | `messages.application` | `'\u0016'` | 32 |
| `RetransmissionRequestMessage` | `messages.application` | `'r'` | 9 |
| `RetransmissionResponseMessage` | `messages.application` | `'b'` | 9 |
| `SecurityMessage` | `messages.application` | `'\t'` | 33 |
| `SpinRequestMessage` | `messages.application` | `'s'` | 4 |
| `SpinResponseMessage` | `messages.application` | `'c'` | 5 |
| `StartOfSpinMessage` | `messages.application` | `'\u000B'` | 13 |
| `SystemRecoveryEventMessage` | `messages.application` | `'J'` | 17 |
| `TopOfBookMessage` | `messages.application` | `'\u001B'` | 43 |
| `TradeMessage` | `messages.application` | `'\u001A'` | 47 |
| `TradingSessionMessage` | `messages.application` | `'\u0014'` | 9 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :otcmarkets-overnight-retransmission-link-v1-0:build
```

Run the round trip alone:

```
gradle :otcmarkets-overnight-retransmission-link-v1-0:roundTrip
```

