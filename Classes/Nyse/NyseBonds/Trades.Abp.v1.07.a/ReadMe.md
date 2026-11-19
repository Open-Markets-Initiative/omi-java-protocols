# New York Stock Exchange Trades Abp v1.07.a

Generated Java parser for Nyse Trades Abp v1.07.a.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nyse Bonds](..).

## Usage

Gradle project `:nyse-nysebonds-trades-abp-v1-07-a` builds package `omi.nyse.nysebonds.trades.abp.v1_07_a`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nyse.nysebonds.trades.abp.v1_07_a.messages.session.HeartbeatResponseMessage;

HeartbeatResponseMessage message = new HeartbeatResponseMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ServerPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.nyse.nysebonds.trades.abp.v1_07_a.dispatch.ServerPacketStream;
import omi.nyse.nysebonds.trades.abp.v1_07_a.types.Message;

ServerPacketStream stream = new ServerPacketStream();
for (ServerPacketStream.Record record : stream.append(bytes, 0, bytes.length)) {
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
| `HeartbeatResponseMessage` | `messages.session` | `'H'` | 1 |
| `LastSaleMessage` | `messages.application` | `'X'` | 64 |
| `LoginAcceptedMessage` | `messages.application` | `'Q'` | 6 |
| `LoginMessage` | `messages.session` | `'L'` | 40 |
| `LoginRejectedMessage` | `messages.application` | `'R'` | 2 |
| `LogoffMessage` | `messages.session` | `'O'` | 1 |
| `NyseBondClosingPriceMessage` | `messages.application` | `'Z'` | 64 |
| `TestRequestMessage` | `messages.session` | `'T'` | 21 |
| `TestResponseMessage` | `messages.application` | `'S'` | 20 |
| `TradeBustOrCorrectionMessage` | `messages.application` | `'U'` | 64 |
| `HeartbeatMessage` | `messages.application` | `'H'` | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nyse-nysebonds-trades-abp-v1-07-a:build
```

Run the round trip alone:

```
gradle :nyse-nysebonds-trades-abp-v1-07-a:roundTrip
```

