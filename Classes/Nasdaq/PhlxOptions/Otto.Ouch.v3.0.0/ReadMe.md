# National Association of Securities Dealers Automated Quotations (Nasdaq) Ouch to Trade Options Ouch v3.0.0

Generated Java parser for Nasdaq Ouch to Trade Options Ouch v3.0.0.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Nasdaq PHLX](..).

## Usage

Gradle project `:nasdaq-phlxoptions-otto-ouch-v3-0-0` builds package `omi.nasdaq.phlxoptions.otto.ouch.v3_0_0`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application.AddComplexInstrumentMessage;

AddComplexInstrumentMessage message = new AddComplexInstrumentMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.dispatch.ClientPacketStream;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Message;

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
| `AddComplexInstrumentMessage` | `messages.application` | `'S'` | 36 |
| `AddComplexInstrumentResponseMessage` | `messages.application` | `'d'` | 32 |
| `AuctionNotificationMessage` | `messages.application` | `'n'` | 73 |
| `CancelOrderMessage` | `messages.application` | `'C'` | 20 |
| `ComplexInstrumentDirectoryMessage` | `messages.application` | `'s'` | 29 |
| `CrossOrderAcceptedMessage` | `messages.application` | `'x'` | 169 |
| `DebugPacket` | `messages.session` | `'+'` | 0 |
| `InstrumentTradingActionMessage` | `messages.application` | `'i'` | 15 |
| `LoginAcceptedPacket` | `messages.session` | `'A'` | 30 |
| `LoginRejectedPacket` | `messages.session` | `'J'` | 1 |
| `LoginRequestPacket` | `messages.session` | `'L'` | 46 |
| `MassCancelMessage` | `messages.application` | `'U'` | 41 |
| `MassCancelResponseMessage` | `messages.application` | `'u'` | 36 |
| `MemberKillSwitchNotificationMessage` | `messages.application` | `'k'` | 33 |
| `MemberKillSwitchRequestMessage` | `messages.application` | `'K'` | 25 |
| `ModifyTradeMessage` | `messages.application` | `'M'` | 55 |
| `ModifyTradeResponseMessage` | `messages.application` | `'m'` | 56 |
| `NewCrossOrderMessage` | `messages.application` | `'X'` | 156 |
| `NewOrderLongFormMessage` | `messages.application` | `'A'` | 108 |
| `NewOrderShortFormMessage` | `messages.application` | `'B'` | 49 |
| `OrderAcceptedLongFormMessage` | `messages.application` | `'a'` | 120 |
| `OrderAcceptedShortFormMessage` | `messages.application` | `'b'` | 65 |
| `OrderCanceledMessage` | `messages.application` | `'c'` | 41 |
| `OrderExecutedMessage` | `messages.application` | `'e'` | 72 |
| `OrderReplacedMessage` | `messages.application` | `'r'` | 100 |
| `PendingResponseMessage` | `messages.application` | `'p'` | 34 |
| `RejectMessage` | `messages.application` | `'j'` | 27 |
| `ReplaceOrderMessage` | `messages.application` | `'R'` | 61 |
| `SequencedDataPacket` | `messages.session` | `'S'` | 1 |
| `SimpleInstrumentDirectoryMessage` | `messages.application` | `'o'` | 69 |
| `SubscriptionRequestMessage` | `messages.application` | `'F'` | 36 |
| `SubscriptionResponseMessage` | `messages.application` | `'f'` | 28 |
| `SystemEventMessage` | `messages.application` | `'z'` | 11 |
| `TradeDetailsMessage` | `messages.application` | `'t'` | 107 |
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

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :nasdaq-phlxoptions-otto-ouch-v3-0-0:build
```

Run the round trip alone:

```
gradle :nasdaq-phlxoptions-otto-ouch-v3-0-0:roundTrip
```

