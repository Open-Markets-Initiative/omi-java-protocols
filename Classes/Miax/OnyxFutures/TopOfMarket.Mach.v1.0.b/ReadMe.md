# Miami International Holdings Top Of Market Mach v1.0.b

Generated Java parser for Miax Top Of Market Mach v1.0.b.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [MIAX Futures Onyx](..).

## Usage

Gradle project `:miax-onyxfutures-topofmarket-mach-v1-0-b` builds package `omi.miax.onyxfutures.topofmarket.mach.v1_0_b`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.messages.application.BestBidAndOfferMessage;

BestBidAndOfferMessage message = new BestBidAndOfferMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.dispatch.PacketDecoder;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.types.Message;

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
| `BestBidAndOfferMessage` | `messages.application` | `'\u000F'` | 36 |
| `ComplexInstrumentDefinitionMessage` | `messages.application` | `'\u0002'` | 84 |
| `InstrumentTradingStatusNotificationMessage` | `messages.application` | `'\u0004'` | 14 |
| `LastSaleMessage` | `messages.application` | `'\u0010'` | 32 |
| `SimpleInstrumentDefinitionMessage` | `messages.application` | `'\u0001'` | 119 |
| `SystemStateMessage` | `messages.application` | `'\u0003'` | 18 |
| `TradeCancelMessage` | `messages.application` | `'\u000E'` | 35 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Miax/OnyxFutures.TopOfMarket.Mach.v1.0.b` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :miax-onyxfutures-topofmarket-mach-v1-0-b:build
```

Run the round trip alone:

```
gradle :miax-onyxfutures-topofmarket-mach-v1-0-b:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :miax-onyxfutures-topofmarket-mach-v1-0-b:captureTest -Pcapture=/path/to/capture.pcap
```

