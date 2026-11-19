# Japan Exchange Group Standard Flex v19.5

Generated Java parser for Jpx Standard Flex v19.5.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Fukuoka Stock Exchange Equities](..).

## Usage

Gradle project `:jpx-fseequities-standard-flex-v19-5` builds package `omi.jpx.fseequities.standard.flex.v19_5`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.jpx.fseequities.standard.flex.v19_5.messages.application.ControlMessage;

ControlMessage message = new ControlMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.jpx.fseequities.standard.flex.v19_5.dispatch.PacketDecoder;
import omi.jpx.fseequities.standard.flex.v19_5.types.Message;

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
| `ControlMessage` | `messages.application` |  | 10 |
| `MarketOrderMessage` | `messages.application` |  | 60 |
| `OpenHighLowAndCurrentPriceMessage` | `messages.application` |  | 105 |
| `OverUnderMessage` | `messages.application` |  | 60 |
| `ParityMessage` | `messages.application` |  | 25 |
| `Quote1Message` | `messages.application` |  | 94 |
| `Quote10Message` | `messages.application` |  | 94 |
| `Quote2Message` | `messages.application` |  | 94 |
| `Quote3Message` | `messages.application` |  | 94 |
| `Quote4Message` | `messages.application` |  | 94 |
| `Quote5Message` | `messages.application` |  | 94 |
| `Quote6Message` | `messages.application` |  | 94 |
| `Quote7Message` | `messages.application` |  | 94 |
| `Quote8Message` | `messages.application` |  | 94 |
| `Quote9Message` | `messages.application` |  | 94 |
| `StatusInformationMessage` | `messages.application` |  | 24 |
| `TradingVolumeMessage` | `messages.application` |  | 25 |
| `TurnoverMessage` | `messages.application` |  | 25 |
| `UpdateNoMessage` | `messages.application` |  | 8 |
| `VwapMessage` | `messages.application` |  | 50 |
| `YieldMessage` | `messages.application` |  | 27 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :jpx-fseequities-standard-flex-v19-5:build
```

Run the round trip alone:

```
gradle :jpx-fseequities-standard-flex-v19-5:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :jpx-fseequities-standard-flex-v19-5:captureTest -Pcapture=/path/to/capture.pcap
```

