# National Association of Securities Dealers Automated Quotations (Nasdaq) Depth Of Market Itch v1.7

Generated Java parser for Nasdaq Depth Of Market Itch v1.7.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nasdaq PHLX](..).

## Usage

Gradle project `:nasdaq-phlxoptions-depthofmarket-itch-v1-7` builds package `omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application.AddOrderLongMessage;

AddOrderLongMessage message = new AddOrderLongMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.dispatch.ClientPacketStream;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.types.Message;

ClientPacketStream stream = new ClientPacketStream();
for (ClientPacketStream.Record record : stream.append(bytes, 0, bytes.length)) {
    for (Message message : record.decoded().messages()) {
        System.out.println(message);
    }
}
```

Each side of the connection has its own stream: `ClientPacketStream`, `ServerPacketStream`. A record stating a length that is not valid fails the stream, which then reads nothing more.

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.dispatch.PacketDecoder;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.types.Message;

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
| `AddOrderLongMessage` | `messages.application` | `'A'` | 25 |
| `AddOrderShortMessage` | `messages.application` | `'a'` | 21 |
| `AddQuoteLongMessage` | `messages.application` | `'J'` | 32 |
| `AddQuoteShortMessage` | `messages.application` | `'j'` | 24 |
| `AuctionNotificationMessage` | `messages.application` | `'I'` | 30 |
| `BaseReferenceMessage` | `messages.application` | `'L'` | 12 |
| `BlockDeleteMessage` | `messages.application` | `'Z'` | 10 |
| `BrokenTradeOrderExecutedMessage` | `messages.application` | `'B'` | 12 |
| `DebugPacket` | `messages.session` | `'+'` | 0 |
| `EndOfReplaySequenceMessage` | `messages.application` | `'M'` | 20 |
| `LoginAcceptedPacket` | `messages.session` | `'A'` | 30 |
| `LoginRejectedPacket` | `messages.session` | `'J'` | 1 |
| `LoginRequestPacket` | `messages.session` | `'L'` | 46 |
| `NonAuctionOptionsTradeMessage` | `messages.application` | `'P'` | 25 |
| `OptionDirectoryMessage` | `messages.application` | `'R'` | 39 |
| `OptionsCrossTradeMessage` | `messages.application` | `'Q'` | 25 |
| `OrderReplaceLongMessage` | `messages.application` | `'V'` | 24 |
| `OrderReplaceShortMessage` | `messages.application` | `'v'` | 20 |
| `QuoteDeleteMessage` | `messages.application` | `'Y'` | 12 |
| `QuoteReplaceLongMessage` | `messages.application` | `'K'` | 36 |
| `QuoteReplaceShortMessage` | `messages.application` | `'k'` | 28 |
| `SecondsMessage` | `messages.application` | `'T'` | 4 |
| `SecurityOpenMessage` | `messages.application` | `'O'` | 9 |
| `SequencedDataPacket` | `messages.session` | `'S'` | 1 |
| `SingleSideCancelMessage` | `messages.application` | `'X'` | 12 |
| `SingleSideDeleteMessage` | `messages.application` | `'D'` | 8 |
| `SingleSideExecutedMessage` | `messages.application` | `'E'` | 20 |
| `SingleSideExecutedWithPriceMessage` | `messages.application` | `'C'` | 25 |
| `SingleSideReplaceLongMessage` | `messages.application` | `'U'` | 20 |
| `SingleSideReplaceShortMessage` | `messages.application` | `'u'` | 16 |
| `SingleSideUpdateMessage` | `messages.application` | `'G'` | 17 |
| `SystemEventMessage` | `messages.application` | `'S'` | 5 |
| `TradingActionMessage` | `messages.application` | `'H'` | 9 |
| `UnsequencedDataPacket` | `messages.session` | `'U'` | 1 |
| `ClientHeartbeatPacket` | `messages.session` | `'R'` | 0 |
| `LogoutRequestPacket` | `messages.session` | `'O'` | 0 |
| `ServerHeartbeatPacket` | `messages.session` | `'H'` | 0 |
| `EndOfSessionPacket` | `messages.session` | `'Z'` | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nasdaq-phlxoptions-depthofmarket-itch-v1-7:build
```

Run the round trip alone:

```
gradle :nasdaq-phlxoptions-depthofmarket-itch-v1-7:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :nasdaq-phlxoptions-depthofmarket-itch-v1-7:captureTest -Pcapture=/path/to/capture.pcap
```

