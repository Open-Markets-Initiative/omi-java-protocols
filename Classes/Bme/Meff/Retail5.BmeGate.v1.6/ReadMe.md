# Bolsas y Mercados Españoles MEFF Retail Top Of Book Five Levels BmeGate v1.6

Generated Java parser for Bme MEFF Retail Top Of Book Five Levels BmeGate v1.6.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [MEFF](..).

## Usage

Gradle project `:bme-meff-retail5-bmegate-v1-6` builds package `omi.bme.meff.retail5.bmegate.v1_6`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.bme.meff.retail5.bmegate.v1_6.messages.application.FamilyStatusMessage;

FamilyStatusMessage message = new FamilyStatusMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.bme.meff.retail5.bmegate.v1_6.dispatch.PacketDecoder;
import omi.bme.meff.retail5.bmegate.v1_6.types.Message;

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
| `FamilyStatusMessage` | `messages.application` |  | 21 |
| `HeartbeatMessage` | `messages.application` |  | 4 |
| `IndicationOfInterestMessage` | `messages.application` |  | 36 |
| `LogonResponseMessage` | `messages.application` |  | 26 |
| `LogoutResponseMessage` | `messages.application` |  | 5 |
| `NetworkStatusMessage` | `messages.application` |  | 5 |
| `NewsMessage` | `messages.application` |  | 82 |
| `RfqMarketPreTransparencyInformationMessage` | `messages.application` |  | 189 |
| `SecurityListCancellationReportMessage` | `messages.application` |  | 50 |
| `SecurityListMessage` | `messages.application` |  | 713 |
| `SecurityListUpdateReportMessage` | `messages.application` |  | 713 |
| `SecurityStatusMessage` | `messages.application` |  | 34 |
| `StatisticsMessage` | `messages.application` |  | 17 |
| `TopOfBookRetail5LevelsMessage` | `messages.application` |  | 156 |
| `TopOfBookRetailMessage` | `messages.application` |  | 44 |
| `TradeMarketPostTransparencyInformationTopOfBookMessage` | `messages.application` |  | 54 |
| `TradeTradeAmendmentOrCancellationMessage` | `messages.application` |  | 89 |
| `TradingSessionStatusMessage` | `messages.application` |  | 15 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :bme-meff-retail5-bmegate-v1-6:build
```

Run the round trip alone:

```
gradle :bme-meff-retail5-bmegate-v1-6:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :bme-meff-retail5-bmegate-v1-6:captureTest -Pcapture=/path/to/capture.pcap
```

