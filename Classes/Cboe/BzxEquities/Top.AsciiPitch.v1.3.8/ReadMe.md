# Chicago Board Options Exchange Top AsciiPitch v1.3.8

Generated Java parser for Cboe Top AsciiPitch v1.3.8.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Cboe Bzx Equities](..).

## Usage

Gradle project `:cboe-bzxequities-top-asciipitch-v1-3-8` builds package `omi.cboe.bzxequities.top.asciipitch.v1_3_8`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.cboe.bzxequities.top.asciipitch.v1_3_8.messages.application.ExpandedAskUpdateMessage;

ExpandedAskUpdateMessage message = new ExpandedAskUpdateMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.cboe.bzxequities.top.asciipitch.v1_3_8.dispatch.PacketStream;
import omi.cboe.bzxequities.top.asciipitch.v1_3_8.types.Message;

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
| `ExpandedAskUpdateMessage` | `messages.application` | `'e'` | 24 |
| `ExpandedBidUpdateMessage` | `messages.application` | `'E'` | 24 |
| `ExpandedSpinMessage` | `messages.application` | `'s'` | 85 |
| `ExpandedTradeMessage` | `messages.application` | `'f'` | 33 |
| `ExpandedTwoSidedUpdateMessage` | `messages.application` | `'F'` | 40 |
| `ExtendedAskUpdateMessage` | `messages.application` | `'n'` | 28 |
| `ExtendedBidUpdateMessage` | `messages.application` | `'N'` | 28 |
| `ExtendedSpinMessage` | `messages.application` | `'S'` | 97 |
| `ExtendedTradeMessage` | `messages.application` | `'r'` | 37 |
| `ExtendedTwoSidedUpdateMessage` | `messages.application` | `'d'` | 48 |
| `LogonMessage` | `messages.application` | `'L'` | 17 |
| `LogonRejectedMessage` | `messages.application` | `'J'` | 1 |
| `LongAskUpdateMessage` | `messages.application` | `'A'` | 22 |
| `LongBidUpdateMessage` | `messages.application` | `'B'` | 22 |
| `LongTradeMessage` | `messages.application` | `'V'` | 31 |
| `LongTwoSidedUpdateMessage` | `messages.application` | `'U'` | 38 |
| `MillisecondsMessage` | `messages.application` | `'M'` | 3 |
| `SecondsMessage` | `messages.application` | `'T'` | 5 |
| `ShortAskUpdateMessage` | `messages.application` | `'a'` | 14 |
| `ShortBidUpdateMessage` | `messages.application` | `'b'` | 14 |
| `ShortTradeMessage` | `messages.application` | `'v'` | 21 |
| `ShortTwoSidedUpdateMessage` | `messages.application` | `'u'` | 24 |
| `TradingStatusMessage` | `messages.application` | `'t'` | 12 |
| `LogonAcceptedMessage` | `messages.application` | `'C'` | 0 |
| `SpinDoneMessage` | `messages.application` | `'D'` | 0 |
| `ServerHeartbeatMessage` | `messages.application` | `'H'` | 0 |
| `ClientHeartbeatMessage` | `messages.application` | `'R'` | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :cboe-bzxequities-top-asciipitch-v1-3-8:build
```

Run the round trip alone:

```
gradle :cboe-bzxequities-top-asciipitch-v1-3-8:roundTrip
```

