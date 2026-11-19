# CME Group Us Treasuries Sbe v10.1

Generated Java parser for Cme Us Treasuries Sbe v10.1.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [BrokerTec](..).

## Usage

Gradle project `:cme-brokertec-ustreasury-sbe-v10-1` builds package `omi.cme.brokertec.ustreasury.sbe.v10_1`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.cme.brokertec.ustreasury.sbe.v10_1.messages.application.MdIncrementalRefreshBtec;

MdIncrementalRefreshBtec message = new MdIncrementalRefreshBtec();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `TcpPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.cme.brokertec.ustreasury.sbe.v10_1.dispatch.TcpPacketStream;
import omi.cme.brokertec.ustreasury.sbe.v10_1.types.Message;

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
import omi.cme.brokertec.ustreasury.sbe.v10_1.dispatch.PacketDecoder;
import omi.cme.brokertec.ustreasury.sbe.v10_1.types.Message;

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
| `MdIncrementalRefreshBtec` | `messages.application` |  | 13 |
| `AdminHeartbeat` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :cme-brokertec-ustreasury-sbe-v10-1:build
```

Run the round trip alone:

```
gradle :cme-brokertec-ustreasury-sbe-v10-1:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :cme-brokertec-ustreasury-sbe-v10-1:captureTest -Pcapture=/path/to/capture.pcap
```

