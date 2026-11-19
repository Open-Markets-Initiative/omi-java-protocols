# Japan Exchange Group Market By Order Flex v1.1

Generated Java parser for Jpx Market By Order Flex v1.1.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Tokyo Stock Exchange Equities](..).

## Usage

Gradle project `:jpx-tseequities-marketbyorder-flex-v1-1` builds package `omi.jpx.tseequities.marketbyorder.flex.v1_1`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.jpx.tseequities.marketbyorder.flex.v1_1.messages.application.AddOrderMessage;

AddOrderMessage message = new AddOrderMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `TcpPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.jpx.tseequities.marketbyorder.flex.v1_1.dispatch.TcpPacketStream;
import omi.jpx.tseequities.marketbyorder.flex.v1_1.types.Message;

TcpPacketStream stream = new TcpPacketStream();
for (TcpPacketStream.Record record : stream.append(bytes, 0, bytes.length)) {
    for (Message message : record.decoded().messages()) {
        System.out.println(message);
    }
}
```

A record stating a length that is not valid fails the stream, which then reads nothing more.

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.jpx.tseequities.marketbyorder.flex.v1_1.dispatch.PacketDecoder;
import omi.jpx.tseequities.marketbyorder.flex.v1_1.types.Message;

PacketDecoder.Decoded decoded = PacketDecoder.decode(payload, 0, payload.length);
for (Message message : decoded.messages()) {
    System.out.println(message);
}
```

`decoded.complete()` says whether every counted message lay inside the packet, and `decoded.undecoded()` counts the messages of a type this package does not decode.

## Messages

Each message class carries its wire length as `BYTE_LENGTH`, and its type as `MESSAGE_TYPE` where the protocol selects messages by a type code.

| Message | Package | Type | Bytes |
| --- | --- | --- | ---: |
| `AddOrderMessage` | `messages.application` | `'A'` | 25 |
| `CommunicationControlMessage` | `messages.application` | `'L'` | 2 |
| `EndOfMessageMessage` | `messages.application` | `'G'` | 6 |
| `ExecutionSummaryMessage` | `messages.application` | `'K'` | 45 |
| `LoginRequestRetransmissionMessage` | `messages.application` | `'R'` | 15 |
| `LoginRequestSnapshotMessage` | `messages.application` | `'L'` | 15 |
| `LoginResultAcceptedMessage` | `messages.application` | `'A'` | 2 |
| `LoginResultRejectedMessage` | `messages.application` | `'J'` | 2 |
| `MessageResponseMessage` | `messages.application` | `'S'` | 0 |
| `OrderDeleteMessage` | `messages.application` | `'D'` | 10 |
| `OrderExecutedMessage` | `messages.application` | `'E'` | 19 |
| `OrderExecutedWithPriceMessage` | `messages.application` | `'C'` | 28 |
| `ResetMessage` | `messages.application` | `'R'` | 1 |
| `SecondsTimestampMessage` | `messages.application` | `'T'` | 4 |
| `TradingStatusMessage` | `messages.application` | `'O'` | 17 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :jpx-tseequities-marketbyorder-flex-v1-1:build
```

Run the round trip alone:

```
gradle :jpx-tseequities-marketbyorder-flex-v1-1:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :jpx-tseequities-marketbyorder-flex-v1-1:captureTest -Pcapture=/path/to/capture.pcap
```

