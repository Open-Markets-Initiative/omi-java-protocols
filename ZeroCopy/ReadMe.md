# ZeroCopy

Messages are immutable views read where their bytes lie: decoding copies nothing, and a view stays valid while its bytes are unchanged.

## Usage

Each protocol is one package, such as `omi.zerocopy.iex.iexequities.deep.iextp.v1_06`, holding these sub-packages:

- `messages` — one immutable view per message, its getters reading each field where it lies
- `enums` — one enum per field with named values, looked up from the wire value without allocating
- `types` — the `Message` interface, the `View` base, and the codec and text view they share
- `dispatch` — creates the view for a message type, and walks a packet

A protocol framed as a packet of counted messages also has a `PacketDecoder`, which walks a packet's messages as views, each valid while the packet's bytes are unchanged:

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
| `src/main/java` | Parser library: an immutable view per message reading each field where it lies, the enums, and the decoders creating a view by message type and walking a packet. It depends on nothing outside the JDK. |

## Organizations

> [Iex][Iex.Directory] · [Nasdaq][Nasdaq.Directory]

## Exchanges

> [IexEquities][IexEquities.Exchange] · [IseOptions][IseOptions.Exchange]

[Iex.Directory]: Iex "Investors Exchange"
[Nasdaq.Directory]: Nasdaq "National Association of Securities Dealers Automated Quotations (Nasdaq)"

[IexEquities.Exchange]: Iex/IexEquities "IEX Equities"
[IseOptions.Exchange]: Nasdaq/IseOptions "Nasdaq ISE"
