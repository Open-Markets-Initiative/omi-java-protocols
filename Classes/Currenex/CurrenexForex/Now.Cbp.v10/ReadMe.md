# Currenex Now Forex Market Data Cbp v10

Generated Java parser for Currenex Now Forex Market Data Cbp v10.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Currenex Forex](..).

## Usage

Gradle project `:currenex-currenexforex-now-cbp-v10` builds package `omi.currenex.currenexforex.now.cbp.v10`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.currenex.currenexforex.now.cbp.v10.messages.application.DepthOfBookMessage;

DepthOfBookMessage message = new DepthOfBookMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.currenex.currenexforex.now.cbp.v10.dispatch.PacketDecoder;
import omi.currenex.currenexforex.now.cbp.v10.types.Message;

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
| `DepthOfBookMessage` | `messages.application` | `'d'` | 482 |
| `HeartBeatMessage` | `messages.application` | `'C'` | 4 |
| `InstrumentInfo` | `messages.application` | `'D'` | 35 |
| `InstrumentInfoAckMessage` | `messages.application` | `'E'` | 6 |
| `LogonMessage` | `messages.application` | `'A'` | 44 |
| `LogoutMessage` | `messages.application` | `'B'` | 27 |
| `MassSubscriptionReplyMessage` | `messages.application` | `'Z'` | 55 |
| `MassSubscriptionRequestMessage` | `messages.application` | `'Y'` | 8 |
| `MidActivityIndicatorMessage` | `messages.application` | `'x'` | 3 |
| `PaidGivenMessage` | `messages.application` | `'k'` | 16 |
| `RejectMessage` | `messages.application` | `'K'` | 55 |
| `SubscriptionReplyMessage` | `messages.application` | `'G'` | 57 |
| `SubscriptionRequestMessage` | `messages.application` | `'X'` | 10 |
| `WamrWithConfidenceFactorMessage` | `messages.application` | `'r'` | 38 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :currenex-currenexforex-now-cbp-v10:build
```

Run the round trip alone:

```
gradle :currenex-currenexforex-now-cbp-v10:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :currenex-currenexforex-now-cbp-v10:captureTest -Pcapture=/path/to/capture.pcap
```

