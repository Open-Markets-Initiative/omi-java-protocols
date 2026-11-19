# Chicago Board Options Exchange Complex Spin v2.1.61

Generated Java parser for Cboe Complex Spin v2.1.61.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Cboe Edgx Options](..).

## Usage

Gradle project `:cboe-edgxoptions-complex-spin-v2-1-61` builds package `omi.cboe.edgxoptions.complex.spin.v2_1_61`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.cboe.edgxoptions.complex.spin.v2_1_61.messages.application.AddOrderLongMessage;

AddOrderLongMessage message = new AddOrderLongMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.cboe.edgxoptions.complex.spin.v2_1_61.dispatch.PacketStream;
import omi.cboe.edgxoptions.complex.spin.v2_1_61.types.Message;

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
| `AddOrderLongMessage` | `messages.application` |  | 32 |
| `AddOrderShortMessage` | `messages.application` |  | 24 |
| `ComplexInstrumentDefinitionExpandedMessage` | `messages.application` |  | 23 |
| `InstrumentDefinitionRequestMessage` | `messages.application` |  | 4 |
| `InstrumentDefinitionResponseMessage` | `messages.application` |  | 9 |
| `LoginMessage` | `messages.application` |  | 20 |
| `LoginResponseMessage` | `messages.application` |  | 1 |
| `SpinFinishedMessage` | `messages.application` |  | 4 |
| `SpinImageAvailableMessage` | `messages.application` |  | 4 |
| `SpinRequestMessage` | `messages.application` |  | 4 |
| `SpinResponseMessage` | `messages.application` |  | 9 |
| `SymbolMappingMessage` | `messages.application` |  | 36 |
| `TimeMessage` | `messages.application` |  | 4 |
| `TradingStatusMessage` | `messages.application` |  | 16 |
| `InstrumentDefinitionFinishedMessage` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :cboe-edgxoptions-complex-spin-v2-1-61:build
```

Run the round trip alone:

```
gradle :cboe-edgxoptions-complex-spin-v2-1-61:roundTrip
```

