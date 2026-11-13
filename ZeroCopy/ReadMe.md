# ZeroCopy

Messages are flyweights read where their bytes lie: decoding copies nothing and allocates nothing.

## Usage

Each protocol is one package, such as `omi.zerocopy.iex.iexequities.deep.iextp.v1_06`, holding these sub-packages:

- `messages` — one flyweight per message, its getters reading each field where it lies
- `enums` — one enum per field with named values, looked up from the wire value without allocating
- `types` — the `Message` interface, the `Flyweight` base, and the codec and text view they share
- `dispatch` — selects the flyweight for a message type, and walks a packet

A protocol framed as a packet of counted messages also has a `PacketDecoder`, which walks a packet's messages as flyweights, each valid until the decoder reaches the next message of its type:

```java
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.dispatch.PacketDecoder;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.Message;

PacketDecoder decoder = new PacketDecoder();
if (decoder.start(payload, 0, payload.length)) {
    for (Message message = decoder.next(); message != null; message = decoder.next()) {
        System.out.println(message);
    }
}
```

## Projects

Each organization directory lists its protocols. Each protocol directory is a Gradle subproject of the repository's one build, with a ReadMe giving its package, its messages, and how to build it, and these source sets:

| Source Set | Description |
| --- | --- |
| `src/main/java` | Parser library: a flyweight per message reading each field where it lies, the enums, and the decoders selecting a flyweight by message type and walking a packet. It depends on nothing outside the JDK. |

## Organizations

> [Iex][Iex.Directory]

## Exchanges

> [IexEquities][IexEquities.Exchange]

[Iex.Directory]: Iex "Investors Exchange"

[IexEquities.Exchange]: Iex/IexEquities "IEX Equities"
