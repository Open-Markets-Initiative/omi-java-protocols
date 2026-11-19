# CME Group Market Data Platform 3 Sbe v1.5

Generated Java parser for Cme Market Data Platform 3 Sbe v1.5.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [CME Globex](..).

## Usage

Gradle project `:cme-globex-mdp3-sbe-v1-5` builds package `omi.cme.globex.mdp3.sbe.v1_5`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.cme.globex.mdp3.sbe.v1_5.messages.application.AdminLogin;

AdminLogin message = new AdminLogin();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientTcpPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.cme.globex.mdp3.sbe.v1_5.dispatch.ClientTcpPacketStream;
import omi.cme.globex.mdp3.sbe.v1_5.types.Message;

ClientTcpPacketStream stream = new ClientTcpPacketStream();
for (ClientTcpPacketStream.Record record : stream.append(bytes, 0, bytes.length)) {
    for (Message message : record.decoded().messages()) {
        System.out.println(message);
    }
}
```

Each side of the connection has its own stream: `ClientTcpPacketStream`, `ServerTcpPacketStream`. A record stating a length that is not valid fails the stream, which then reads nothing more.

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.cme.globex.mdp3.sbe.v1_5.dispatch.PacketDecoder;
import omi.cme.globex.mdp3.sbe.v1_5.types.Message;

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
| `AdminLogin` | `messages.application` |  | 1 |
| `AdminLogout` | `messages.application` |  | 100 |
| `ChannelReset` | `messages.application` |  | 12 |
| `MarketDataRequest` | `messages.application` |  | 11 |
| `MdIncrementalRefreshBook` | `messages.application` |  | 14 |
| `MdIncrementalRefreshDailyStatistics` | `messages.application` |  | 14 |
| `MdIncrementalRefreshLimitsBanding` | `messages.application` |  | 14 |
| `MdIncrementalRefreshSessionStatistics` | `messages.application` |  | 14 |
| `MdIncrementalRefreshTrade` | `messages.application` |  | 14 |
| `MdIncrementalRefreshTradeSummary` | `messages.application` |  | 22 |
| `MdIncrementalRefreshVolume` | `messages.application` |  | 14 |
| `MdInstrumentDefinitionFuture` | `messages.application` |  | 226 |
| `MdInstrumentDefinitionOption` | `messages.application` |  | 226 |
| `MdInstrumentDefinitionSpread` | `messages.application` |  | 208 |
| `Negotiate` | `messages.application` |  | 78 |
| `NegotiationReject` | `messages.application` |  | 70 |
| `NegotiationResponse` | `messages.application` |  | 22 |
| `QuoteRequest` | `messages.application` |  | 38 |
| `RequestAck` | `messages.application` |  | 12 |
| `RequestReject` | `messages.application` |  | 105 |
| `SecurityListRequest` | `messages.application` |  | 11 |
| `SecurityStatus` | `messages.application` |  | 30 |
| `SecurityStatusRequest` | `messages.application` |  | 11 |
| `SnapshotFullRefresh` | `messages.application` |  | 62 |
| `Terminate` | `messages.application` |  | 70 |
| `AdminHeartbeat` | `messages.application` |  | 0 |
| `SubscriberHeartbeat` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

The build workflow runs the capture test, strict, on the captures in `Cme/Globex.Mdp3.Sbe.v1.5` from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets).

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :cme-globex-mdp3-sbe-v1-5:build
```

Run the round trip alone:

```
gradle :cme-globex-mdp3-sbe-v1-5:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :cme-globex-mdp3-sbe-v1-5:captureTest -Pcapture=/path/to/capture.pcap
```

