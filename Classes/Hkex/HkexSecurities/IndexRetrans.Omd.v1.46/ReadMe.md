# Hong Kong Exchanges and Clearing Orion Market Data Cash Index Retransmission Omd v1.46

Generated Java parser for Hkex Orion Market Data Cash Index Retransmission Omd v1.46.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [Hkex Securities Market](..).

## Usage

Gradle project `:hkex-hkexsecurities-indexretrans-omd-v1-46` builds package `omi.hkex.hkexsecurities.indexretrans.omd.v1_46`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.hkex.hkexsecurities.indexretrans.omd.v1_46.messages.application.DisasterRecoverySignalMessage;

DisasterRecoverySignalMessage message = new DisasterRecoverySignalMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `PacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.hkex.hkexsecurities.indexretrans.omd.v1_46.dispatch.PacketStream;
import omi.hkex.hkexsecurities.indexretrans.omd.v1_46.types.Message;

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
| `DisasterRecoverySignalMessage` | `messages.application` |  | 4 |
| `IndexDataMessage` | `messages.application` |  | 108 |
| `IndexDefinitionMessage` | `messages.application` |  | 16 |
| `LogonMessage` | `messages.application` |  | 12 |
| `LogonResponseMessage` | `messages.application` |  | 4 |
| `RefreshCompleteMessage` | `messages.application` |  | 4 |
| `RetransmissionRequestMessage` | `messages.application` |  | 12 |
| `RetransmissionResponseMessage` | `messages.application` |  | 12 |
| `SequenceResetMessage` | `messages.application` |  | 4 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :hkex-hkexsecurities-indexretrans-omd-v1-46:build
```

Run the round trip alone:

```
gradle :hkex-hkexsecurities-indexretrans-omd-v1-46:roundTrip
```

