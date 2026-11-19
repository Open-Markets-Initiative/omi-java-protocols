# Moscow Exchange SIMBA Spectra Orders Log Historical Replay Simba v9.12.0

Generated Java parser for Moex SIMBA Spectra Orders Log Historical Replay Simba v9.12.0.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [MOEX Derivatives Market](..).

## Usage

Gradle project `:moex-spectra-orderslogreplay-simba-v9-12-0` builds package `omi.moex.spectra.orderslogreplay.simba.v9_12_0`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.moex.spectra.orderslogreplay.simba.v9_12_0.messages.application.BestPricesMessage;

BestPricesMessage message = new BestPricesMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Read one side of a TCP connection. Append its bytes in order, as they arrive; `ClientPacketStream` holds a record split across appends until the rest arrives, and gives each whole one decoded:

```java
import omi.moex.spectra.orderslogreplay.simba.v9_12_0.dispatch.ClientPacketStream;
import omi.moex.spectra.orderslogreplay.simba.v9_12_0.types.Message;

ClientPacketStream stream = new ClientPacketStream();
for (ClientPacketStream.Record record : stream.append(bytes, 0, bytes.length)) {
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
| `BestPricesMessage` | `messages.application` |  | 3 |
| `EmptyBookMessage` | `messages.application` |  | 4 |
| `LogoutMessage` | `messages.application` |  | 256 |
| `MarketDataRequestMessage` | `messages.application` |  | 8 |
| `OrderExecutionMessage` | `messages.application` |  | 74 |
| `OrderUpdateMessage` | `messages.application` |  | 50 |
| `LogonMessage` | `messages.application` |  | 0 |
| `HeartbeatMessage` | `messages.application` |  | 0 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :moex-spectra-orderslogreplay-simba-v9-12-0:build
```

Run the round trip alone:

```
gradle :moex-spectra-orderslogreplay-simba-v9-12-0:roundTrip
```

