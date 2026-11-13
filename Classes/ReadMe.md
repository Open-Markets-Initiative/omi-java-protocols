# Classes

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

## Usage

Each protocol is one package, such as `omi.asx.asxderivatives.ntp.itch.v1_05`, holding these sub-packages:

- `messages` — one class per message, decoded with `parseFrom` and encoded with `encode` or `toBytes`
- `fields` — the field classes that messages are built from, each reading and writing its own bytes
- `enums` — one enum per field with named values
- `types` — the `Message` and `Field` interfaces and the runtime support they share
- `dispatch` — selects the message class for a message type

A protocol framed as a packet of counted messages also has a `PacketDecoder`, which walks one packet payload into its messages:

```java
import omi.asx.asxderivatives.ntp.itch.v1_05.dispatch.PacketDecoder;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.Message;

PacketDecoder.Decoded decoded = PacketDecoder.decode(payload, 0, payload.length);
for (Message message : decoded.messages()) {
    System.out.println(message);
}
```

## Projects

Each organization directory lists its protocols. Each protocol directory is a Gradle subproject of the repository's one build, with a ReadMe giving its package, its messages, and its tasks, and these source sets:

| Source Set | Description |
| --- | --- |
| `src/main/java` | Parser library: the message, field, enum, and dispatch classes. It depends on nothing outside the JDK. |
| `src/roundTrip/java` | Program that decodes deterministic bytes into each message and requires it to encode back; the `roundTrip` task runs it as part of `check`. |
| `src/captureTest/java` | Program that walks every packet of a capture through the `PacketDecoder`, and every TCP connection through the stream of the side sending it, and requires every message to encode back; the `captureTest` task runs it on the capture `-Pcapture` names. Only a protocol with a `PacketDecoder` or a TCP stream has one. |

## Testing

Every build runs each protocol's round trip, which decodes every message from deterministic bytes at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it.

A protocol with a `PacketDecoder` or a TCP stream also has a capture test, which walks every UDP datagram of a pcap or pcap-ng capture, or of each capture in a directory, and the records of every TCP connection, and requires every message to encode back to its own bytes. The build workflow runs it on 49 protocols, each against its captures from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets). The same run, locally, from the repository root:

```
git clone --depth=1 https://github.com/Open-Markets-Initiative/omi-data-packets.git
gradle :b3-b3derivatives-binaryentrypoint-sbe-v8-0:captureTest -Pcapture=omi-data-packets/B3/B3Derivatives.BinaryEntryPoint.Sbe.v8.0 -Pstrict
```

## Organizations

> [Asx][Asx.Directory] · [B3][B3.Directory] · [BlueOceanAts][BlueOceanAts.Directory] · [Box][Box.Directory] · [Cboe][Cboe.Directory] · [Cme][Cme.Directory] · [Coinbase][Coinbase.Directory] · [Eurex][Eurex.Directory] · [Ice][Ice.Directory] · [Iex][Iex.Directory] · [Imperative][Imperative.Directory] · [Jnx][Jnx.Directory] · [Jpx][Jpx.Directory] · [Memx][Memx.Directory] · [Miax][Miax.Directory] · [Nasdaq][Nasdaq.Directory] · [Nyse][Nyse.Directory] · [OtcMarkets][OtcMarkets.Directory] · [Siac][Siac.Directory] · [Tmx][Tmx.Directory] · [Txse][Txse.Directory]

## Exchanges

> [AmexEquities][AmexEquities.Exchange] · [AmexOptions][AmexOptions.Exchange] · [ArcaEquities][ArcaEquities.Exchange] · [ArcaOptions][ArcaOptions.Exchange] · [AsxDerivatives][AsxDerivatives.Exchange] · [B3Derivatives][B3Derivatives.Exchange] · [BlueEquities][BlueEquities.Ats] · [BoxOptions][BoxOptions.Exchange] · [ByxEquities][ByxEquities.Exchange] · [BzxEquities][BzxEquities.Exchange] · [BzxOptions][BzxOptions.Exchange] · [C1Options][C1Options.Exchange] · [CfeFutures][CfeFutures.Exchange] · [CoinbaseDerivatives][CoinbaseDerivatives.Exchange] · [Deribit][Deribit.Exchange] · [EdgaEquities][EdgaEquities.Exchange] · [EdgxEquities][EdgxEquities.Exchange] · [IceFutures][IceFutures.Exchange] · [IexEquities][IexEquities.Exchange] · [IntelligentCross][IntelligentCross.Ats] · [IseOptions][IseOptions.Exchange] · [JnxEquities][JnxEquities.Exchange] · [LinkAts][LinkAts.Ats] · [MemxEquities][MemxEquities.Exchange] · [MiaxOptions][MiaxOptions.Exchange] · [Mx][Mx.Exchange] · [NationalEquities][NationalEquities.Exchange] · [NsmEquities][NsmEquities.Exchange] · [NtxEquities][NtxEquities.Exchange] · [NyseBonds][NyseBonds.Exchange] · [NyseEquities][NyseEquities.Exchange] · [OnyxFutures][OnyxFutures.Exchange] · [OseDerivatives][OseDerivatives.Exchange] · [PearlEquities][PearlEquities.Exchange] · [PsxEquities][PsxEquities.Exchange] · [TexasEquities][TexasEquities.Exchange] · [TxseEquities][TxseEquities.Exchange]

## Platforms

> [Cme Globex][Globex.Platform] · [Eurex T7][T7.Platform]

## Consolidators

> [Cqs][Cqs.Consolidator] · [Cts][Cts.Consolidator] · [Opra][Opra.Consolidator] · [TitaniumConsolidated][TitaniumConsolidated.Consolidator] · [Uqdf][Uqdf.Consolidator]

[Asx.Directory]: Asx "Australian Securities Exchange"
[B3.Directory]: B3 "Brasil, Bolsa, Balcão"
[BlueOceanAts.Directory]: BlueOceanAts "Blue Ocean Technologies"
[Box.Directory]: Box "Box Options Market"
[Cboe.Directory]: Cboe "Chicago Board Options Exchange"
[Cme.Directory]: Cme "CME Group"
[Coinbase.Directory]: Coinbase "Coinbase"
[Eurex.Directory]: Eurex "Eurex Exchange"
[Ice.Directory]: Ice "Intercontinental Exchange"
[Iex.Directory]: Iex "Investors Exchange"
[Imperative.Directory]: Imperative "Imperative Execution"
[Jnx.Directory]: Jnx "Japannext Securities"
[Jpx.Directory]: Jpx "Japan Exchange Group"
[Memx.Directory]: Memx "The Members Exchange"
[Miax.Directory]: Miax "Miami International Holdings"
[Nasdaq.Directory]: Nasdaq "National Association of Securities Dealers Automated Quotations (Nasdaq)"
[Nyse.Directory]: Nyse "New York Stock Exchange"
[OtcMarkets.Directory]: OtcMarkets "OTC Markets Group"
[Siac.Directory]: Siac "The Securities Industry Automation Corporation"
[Tmx.Directory]: Tmx "TMX Group"
[Txse.Directory]: Txse "Texas Stock Exchange"

[AsxDerivatives.Exchange]: Asx/AsxDerivatives "Asx Derivatives"
[B3Derivatives.Exchange]: B3/B3Derivatives "B3 Derivatives"
[BlueEquities.Ats]: BlueOceanAts/BlueEquities "Blue Equities"
[BoxOptions.Exchange]: Box/BoxOptions "BOX Options Exchange"
[ByxEquities.Exchange]: Cboe/ByxEquities "Cboe Byx Equities"
[BzxEquities.Exchange]: Cboe/BzxEquities "Cboe Bzx Equities"
[BzxOptions.Exchange]: Cboe/BzxOptions "Cboe Bzx Options"
[C1Options.Exchange]: Cboe/C1Options "Cboe C1 Options"
[CfeFutures.Exchange]: Cboe/CfeFutures "Cboe Futures Exchange"
[EdgaEquities.Exchange]: Cboe/EdgaEquities "Cboe Edga Equities"
[EdgxEquities.Exchange]: Cboe/EdgxEquities "Cboe Edgx Equities"
[TitaniumConsolidated.Consolidator]: Cboe/TitaniumConsolidated "Cboe Titanium Consolidated"
[Globex.Platform]: Cme/Globex "CME Globex"
[CoinbaseDerivatives.Exchange]: Coinbase/CoinbaseDerivatives "Coinbase Derivatives"
[Deribit.Exchange]: Coinbase/Deribit "Deribit"
[T7.Platform]: Eurex/T7 "T7"
[IceFutures.Exchange]: Ice/IceFutures "Intercontinental Exchange Futures"
[IexEquities.Exchange]: Iex/IexEquities "IEX Equities"
[IntelligentCross.Ats]: Imperative/IntelligentCross "Intelligent Cross"
[JnxEquities.Exchange]: Jnx/JnxEquities "Japannext Equities"
[OseDerivatives.Exchange]: Jpx/OseDerivatives "Osaka Securities Exchange"
[MemxEquities.Exchange]: Memx/MemxEquities "Memx Equities"
[MiaxOptions.Exchange]: Miax/MiaxOptions "MIAX Options"
[OnyxFutures.Exchange]: Miax/OnyxFutures "MIAX Futures Onyx"
[PearlEquities.Exchange]: Miax/PearlEquities "MIAX Pearl Equities"
[IseOptions.Exchange]: Nasdaq/IseOptions "Nasdaq ISE"
[NsmEquities.Exchange]: Nasdaq/NsmEquities "Nasdaq Stock Market"
[NtxEquities.Exchange]: Nasdaq/NtxEquities "Nasdaq Texas"
[PsxEquities.Exchange]: Nasdaq/PsxEquities "Nasdaq PSX"
[Uqdf.Consolidator]: Nasdaq/Uqdf "Nasdaq UTP Quote Data Feed"
[AmexEquities.Exchange]: Nyse/AmexEquities "Nyse Amex Equities"
[AmexOptions.Exchange]: Nyse/AmexOptions "Nyse Amex Options"
[ArcaEquities.Exchange]: Nyse/ArcaEquities "Nyse Arca Equities"
[ArcaOptions.Exchange]: Nyse/ArcaOptions "Nyse Arca Options"
[NationalEquities.Exchange]: Nyse/NationalEquities "Nyse National Equities"
[NyseBonds.Exchange]: Nyse/NyseBonds "Nyse Bonds"
[NyseEquities.Exchange]: Nyse/NyseEquities "New York Stock Exchange Equities"
[TexasEquities.Exchange]: Nyse/TexasEquities "Nyse Texas Equities"
[LinkAts.Ats]: OtcMarkets/LinkAts "OTC Link ATS"
[Cqs.Consolidator]: Siac/Cqs "Consolidated Quotation System"
[Cts.Consolidator]: Siac/Cts "Consolidated Tape System"
[Opra.Consolidator]: Siac/Opra "Options Price Reporting Authority"
[Mx.Exchange]: Tmx/Mx "Montreal Exchange"
[TxseEquities.Exchange]: Txse/TxseEquities "Txse Equities"
