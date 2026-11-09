# National Association of Securities Dealers Automated Quotations (Nasdaq) TotalView Itch Itch v5.0.2017

Generated Java parser for Nasdaq TotalView Itch Itch v5.0.2017.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nasdaq Stock Market](..).

## Usage

Gradle project `:nasdaq-nsmequities-totalview-itch-v5-0-2017` builds package `omi.nasdaq.nsmequities.totalview.itch.v5_0_2017`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.messages.application.AddOrderNoMpidAttributionMessage;

AddOrderNoMpidAttributionMessage message = new AddOrderNoMpidAttributionMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.dispatch.ClientPacketStream;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.types.Message;

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
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.dispatch.PacketDecoder;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.types.Message;

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
| `AddOrderNoMpidAttributionMessage` | `messages.application` | `'A'` | 35 |
| `AddOrderWithMpidAttributionMessage` | `messages.application` | `'F'` | 39 |
| `BrokenTradeMessage` | `messages.application` | `'B'` | 18 |
| `CrossTradeMessage` | `messages.application` | `'Q'` | 39 |
| `DebugPacket` | `messages.session` | `'+'` | 0 |
| `IpoQuotingPeriodUpdate` | `messages.application` | `'K'` | 27 |
| `LoginAcceptedPacket` | `messages.session` | `'A'` | 30 |
| `LoginRejectedPacket` | `messages.session` | `'J'` | 1 |
| `LoginRequestPacket` | `messages.session` | `'L'` | 46 |
| `LuldAuctionCollarMessage` | `messages.application` | `'J'` | 34 |
| `MarketParticipantPositionMessage` | `messages.application` | `'L'` | 25 |
| `MwcbDeclineLevelMessage` | `messages.application` | `'V'` | 34 |
| `MwcbStatusLevelMessage` | `messages.application` | `'W'` | 11 |
| `NetOrderImbalanceIndicatorMessage` | `messages.application` | `'I'` | 49 |
| `NonCrossTradeMessage` | `messages.application` | `'P'` | 43 |
| `OrderCancelMessage` | `messages.application` | `'X'` | 22 |
| `OrderDeleteMessage` | `messages.application` | `'D'` | 18 |
| `OrderExecutedMessage` | `messages.application` | `'E'` | 30 |
| `OrderExecutedWithPriceMessage` | `messages.application` | `'C'` | 35 |
| `OrderReplaceMessage` | `messages.application` | `'U'` | 34 |
| `RegShoShortSalePriceTestRestrictedIndicatorMessage` | `messages.application` | `'Y'` | 19 |
| `RetailInterestMessage` | `messages.application` | `'N'` | 19 |
| `SequencedDataPacket` | `messages.session` | `'S'` | 1 |
| `StockDirectoryMessage` | `messages.application` | `'R'` | 38 |
| `StockTradingActionMessage` | `messages.application` | `'H'` | 24 |
| `SystemEventMessage` | `messages.application` | `'S'` | 11 |
| `UnsequencedDataPacket` | `messages.session` | `'U'` | 1 |
| `ClientHeartbeat` | `messages.session` | `'R'` | 0 |
| `LogoutRequest` | `messages.session` | `'O'` | 0 |
| `ServerHeartbeat` | `messages.session` | `'H'` | 0 |
| `EndOfSession` | `messages.session` | `'Z'` | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nasdaq-nsmequities-totalview-itch-v5-0-2017:build
```

Run the round trip alone:

```
gradle :nasdaq-nsmequities-totalview-itch-v5-0-2017:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :nasdaq-nsmequities-totalview-itch-v5-0-2017:captureTest -Pcapture=/path/to/capture.pcap
```

