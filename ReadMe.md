# Omi Java Protocols

Omi Java Protocols provide source generated Java parsing of common binary exchange protocols. Every protocol targets Java 17 and depends on nothing outside the JDK. Each top-level directory holds one kind of parser, with a directory for each organization, division, and protocol version:

- [Classes](Classes) — Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

## Usage

The repository is one Gradle build, with a subproject for each protocol version. Build and verify every protocol:

```
gradle build
```

A single protocol builds by its project name, which is its identifier in lower case with each dot replaced by a hyphen:

```
gradle :asx-asxderivatives-ntp-itch-v1-05:build
```

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

## Development

Updates are greatly appreciated; however, this entire repository is source generated...including the words you are reading right now. If you wish to suggest parser updates, the recommended process is to create an issue with changes and explanation.  Time permitting, we will update the models and regenerate.

| Protocol Count | Generated Lines |
| --- | --- |
| 113 | 3437110 |

## Testing

[![Build](https://github.com/Open-Markets-Initiative/omi-java-protocols/actions/workflows/build.yml/badge.svg)](https://github.com/Open-Markets-Initiative/omi-java-protocols/actions/workflows/build.yml)

Every build runs each protocol's round trip, which decodes every message from deterministic bytes at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it.

A protocol with a `PacketDecoder` or a TCP stream also has a capture test, which walks every UDP datagram of a pcap or pcap-ng capture, or of each capture in a directory, and the records of every TCP connection, and requires every message to encode back to its own bytes. The build workflow runs it on 48 protocols, each against its captures from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets). The same run, locally:

```
git clone --depth=1 https://github.com/Open-Markets-Initiative/omi-data-packets.git
gradle :b3-b3derivatives-binaryentrypoint-sbe-v8-0:captureTest -Pcapture=omi-data-packets/B3/B3Derivatives.BinaryEntryPoint.Sbe.v8.0 -Pstrict
```

Please report any parsing errors as an [issue](https://github.com/Open-Markets-Initiative/omi-java-protocols/issues "Omi Java Protocols Issues").  Include a small note on the protocol and version, and a minimal capture demonstrating the problem. Also consider including a link or pdf specification documenting the correct behavior.

## Open Markets Initiative

The Open Markets Initiative (Omi) is a group of technologists dedicated to enhancing the stability of electronic financial markets using modern development methods.

Other generated code can be found at [Omi Repositories](https://github.com/Open-Markets-Initiative/Directory/tree/main/Repositories "Open Markets Initiative Repositories"); for Omi rules and regulations, see [Omi Directory](https://github.com/Open-Markets-Initiative/Directory "Open Markets Initiative Directory").
## Organizations

> [Asx][Asx.Directory] · [B3][B3.Directory] · [BlueOceanAts][BlueOceanAts.Directory] · [Box][Box.Directory] · [Cboe][Cboe.Directory] · [Cme][Cme.Directory] · [Coinbase][Coinbase.Directory] · [Eurex][Eurex.Directory] · [Ice][Ice.Directory] · [Iex][Iex.Directory] · [Imperative][Imperative.Directory] · [Jnx][Jnx.Directory] · [Jpx][Jpx.Directory] · [Memx][Memx.Directory] · [Miax][Miax.Directory] · [Nasdaq][Nasdaq.Directory] · [Nyse][Nyse.Directory] · [OtcMarkets][OtcMarkets.Directory] · [Siac][Siac.Directory] · [Tmx][Tmx.Directory] · [Txse][Txse.Directory]

## Exchanges

> [AmexEquities][AmexEquities.Exchange] · [AmexOptions][AmexOptions.Exchange] · [ArcaEquities][ArcaEquities.Exchange] · [ArcaOptions][ArcaOptions.Exchange] · [AsxDerivatives][AsxDerivatives.Exchange] · [B3Derivatives][B3Derivatives.Exchange] · [BlueEquities][BlueEquities.Ats] · [BoxOptions][BoxOptions.Exchange] · [ByxEquities][ByxEquities.Exchange] · [BzxEquities][BzxEquities.Exchange] · [BzxOptions][BzxOptions.Exchange] · [C1Options][C1Options.Exchange] · [CfeFutures][CfeFutures.Exchange] · [CoinbaseDerivatives][CoinbaseDerivatives.Exchange] · [Deribit][Deribit.Exchange] · [EdgaEquities][EdgaEquities.Exchange] · [EdgxEquities][EdgxEquities.Exchange] · [IceFutures][IceFutures.Exchange] · [IexEquities][IexEquities.Exchange] · [IntelligentCross][IntelligentCross.Ats] · [IseOptions][IseOptions.Exchange] · [JnxEquities][JnxEquities.Exchange] · [LinkAts][LinkAts.Ats] · [MemxEquities][MemxEquities.Exchange] · [MiaxOptions][MiaxOptions.Exchange] · [Mx][Mx.Exchange] · [NationalEquities][NationalEquities.Exchange] · [NsmEquities][NsmEquities.Exchange] · [NtxEquities][NtxEquities.Exchange] · [NyseBonds][NyseBonds.Exchange] · [NyseEquities][NyseEquities.Exchange] · [OnyxFutures][OnyxFutures.Exchange] · [OseDerivatives][OseDerivatives.Exchange] · [PearlEquities][PearlEquities.Exchange] · [PsxEquities][PsxEquities.Exchange] · [TexasEquities][TexasEquities.Exchange] · [TxseEquities][TxseEquities.Exchange]

## Platforms

> [Cme Globex][Globex.Platform] · [Eurex T7][T7.Platform]

## Consolidators

> [Cqs][Cqs.Consolidator] · [Cts][Cts.Consolidator] · [Opra][Opra.Consolidator] · [TitaniumConsolidated][TitaniumConsolidated.Consolidator] · [Uqdf][Uqdf.Consolidator]

## Related Definitions

The Open Markets Initiative provides protocol definitions in several formats:

- [Kaitai Struct Definitions][Kaitai.Definitions.Repository] — Cross language binary parsers with the kaitai struct compiler
- [DFDL Definitions][Dfdl.Definitions.Repository] — Declarative DFDL schemas for cross language parsing
- [P4 Definitions][P4.Definitions.Repository] — P4 programs for software and hardware data planes
- [Spicy Definitions][Spicy.Definitions.Repository] — Declarative Spicy grammars for the spicy toolchain and the zeek network security monitor
- [Lean Definitions][Lean.Definitions.Repository] — Lean 4 definitions with machine checked encode and decode proofs
- [Rocq Definitions][Rocq.Definitions.Repository] — Rocq Prover definitions whose encode and decode proofs the prover checks
- [TLA+ Definitions][Tla.Definitions.Repository] — TLA+ modules whose encode and decode are model checked with TLC
- [Promela Definitions][Promela.Definitions.Repository] — Promela models whose encode and decode are checked by the spin model checker
- [FIX Dictionaries][Fix.Dictionaries.Repository] — QuickFIX format xml data dictionaries, one per FIX version
- [Xml Specifications][Xml.Specifications.Repository] — Formatted exchange specification xmls
## Disclaimer

Any similarities between existing people, places and/or protocols is purely incidental.

Enjoy.

[Omi Repositories]: https://github.com/Open-Markets-Initiative/Directory/tree/main/Repositories "Open Markets Initiative Repositories"
[Omi Rules and Regulations]: https://github.com/Open-Markets-Initiative/Directory/tree/main/License "Open Markets Initiative Rules and Regulations"

[Omi.Glossary.Testing]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Glossary/Testing.md "Protocol Testing Status"
[Omi.Glossary.Testing.Verified]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Glossary/Testing.md "Testing Status: Protocol has been tested on live data"
[Omi.Glossary.Testing.Incomplete]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Glossary/Testing.md "Testing Status: Protocol has been tested on live data but contains known issues"
[Omi.Glossary.Testing.Beta]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Glossary/Testing.md "Testing Status: Protocol has not been tested and structure is speculative"
[Omi.Glossary.Testing.Untested]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Glossary/Testing.md "Testing Status: Protocol has not been tested on live data"
[Omi.Glossary.Testing.Unavailable]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Glossary/Testing.md "Testing Status: Protocol does not state a testing status"
[Omi.Encoding.Definitions]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Protocols/ReadMe.md "Encoding Directory"

[Omi.Encoding.Itch]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Itch.md "Itch Encoding"
[Omi.Encoding.Sbe]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Sbe.md "Sbe Encoding"
[Omi.Encoding.Hsvf]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Hsvf.md "Hsvf Encoding"
[Omi.Encoding.Pitch]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Pitch.md "Pitch Encoding"
[Omi.Encoding.Boe]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Boe.md "Boe Encoding"
[Omi.Encoding.Spin]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Spin.md "Spin Encoding"
[Omi.Encoding.Csm]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Csm.md "Csm Encoding"
[Omi.Encoding.Boe3]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Boe3.md "Boe3 Encoding"
[Omi.Encoding.Cgif]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Cgif.md "Cgif Encoding"
[Omi.Encoding.Fbe]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Fbe.md "Fbe Encoding"
[Omi.Encoding.iMpact]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/iMpact.md "iMpact Encoding"
[Omi.Encoding.IexTp]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/IexTp.md "IexTp Encoding"
[Omi.Encoding.Aspen]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Aspen.md "Aspen Encoding"
[Omi.Encoding.Glimpse]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Glimpse.md "Glimpse Encoding"
[Omi.Encoding.Ouch]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Ouch.md "Ouch Encoding"
[Omi.Encoding.Mach]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Mach.md "Mach Encoding"
[Omi.Encoding.Meo]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Meo.md "Meo Encoding"
[Omi.Encoding.AsciiItch]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/AsciiItch.md "AsciiItch Encoding"
[Omi.Encoding.Utp]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Utp.md "Utp Encoding"
[Omi.Encoding.Pillar]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Pillar.md "Pillar Encoding"
[Omi.Encoding.Xdp]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Xdp.md "Xdp Encoding"
[Omi.Encoding.Abp]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Abp.md "Abp Encoding"
[Omi.Encoding.PillarStream]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/PillarStream.md "PillarStream Encoding"
[Omi.Encoding.Ultra]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Ultra.md "Ultra Encoding"
[Omi.Encoding.Link]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Link.md "Link Encoding"
[Omi.Encoding.Cta]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Cta.md "Cta Encoding"
[Omi.Encoding.Obi]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Obi.md "Obi Encoding"
[Omi.Encoding.Rake]: https://github.com/Open-Markets-Initiative/Directory/blob/main/Protocols/Rake.md "Rake Encoding"

[Asx.AsxDerivatives.Ntp]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Asx/Protocols/AsxDerivatives/Ntp.md "New Trading Platform"
[B3.B3Derivatives.BinaryEntryPoint]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/B3/Protocols/B3Derivatives/BinaryEntryPoint.md "Binary Entry Point"
[B3.B3Derivatives.BinaryUmdf]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/B3/Protocols/B3Derivatives/BinaryUmdf.md "Binary Unified Market Data Feed"
[BlueOceanAts.BlueEquities.MemoirDepthFeed]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/BlueOceanAts/Protocols/BlueEquities/MemoirDepthFeed.md "Member Order Information Record Depth Feed"
[BlueOceanAts.BlueEquities.MemoirLastSale]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/BlueOceanAts/Protocols/BlueEquities/MemoirLastSale.md "Member Order Information Record Last Sale"
[Box.BoxOptions.SolaMulticast]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Box/Protocols/BoxOptions/SolaMulticast.md "Sola Multicast"
[Cboe.ByxEquities.MulticastDepthOfBook]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/ByxEquities/MulticastDepthOfBook.md "Multicast Depth Of Book"
[Cboe.BzxEquities.BinaryOrderEntry]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/BzxEquities/BinaryOrderEntry.md "Binary Order Entry"
[Cboe.BzxEquities.MulticastDepthOfBook]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/BzxEquities/MulticastDepthOfBook.md "Multicast Depth Of Book"
[Cboe.BzxOptions.BinaryOrderEntry]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/BzxOptions/BinaryOrderEntry.md "Binary Order Entry"
[Cboe.C1Options.Complex]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/C1Options/Complex.md "Complex"
[Cboe.C1Options.MarketDataFeed]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/C1Options/MarketDataFeed.md "Market Data Feed"
[Cboe.C1Options.MarketLevel2]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/C1Options/MarketLevel2.md "Market Level 2 Feed"
[Cboe.C1Options.MulticastDepthOfBook]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/C1Options/MulticastDepthOfBook.md "Multicast Depth Of Book"
[Cboe.C1Options.OpeningAuction]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/C1Options/OpeningAuction.md "Opening Auction Feed"
[Cboe.CfeFutures.BinaryOrderEntry]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/CfeFutures/BinaryOrderEntry.md "Futures Binary Order Entry"
[Cboe.CfeFutures.MulticastDepthOfBook]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/CfeFutures/MulticastDepthOfBook.md "Futures Multicast Depth Of Book"
[Cboe.EdgaEquities.MulticastDepthOfBook]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/EdgaEquities/MulticastDepthOfBook.md "Multicast Depth Of Book"
[Cboe.EdgxEquities.MulticastDepthOfBook]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/EdgxEquities/MulticastDepthOfBook.md "Multicast Depth Of Book"
[Cboe.GapRequestProxy]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/GapRequestProxy.md ""
[Cboe.TitaniumConsolidated.Indices]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cboe/Protocols/TitaniumConsolidated/Indices.md "Global Indices Feed"
[Cme.Globex.Mdp3]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cme/Protocols/Globex/Mdp3.md "Market Data Platform 3"
[Cme.Globex.iLink3]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Cme/Protocols/Globex/iLink3.md "iLink 3"
[Coinbase.CoinbaseDerivatives.MarketDataApi]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Coinbase/Protocols/CoinbaseDerivatives/MarketDataApi.md "Market Data Api"
[Coinbase.CoinbaseDerivatives.OrdersApi]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Coinbase/Protocols/CoinbaseDerivatives/OrdersApi.md "Orders Api"
[Coinbase.Deribit.MarketDataApi]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Coinbase/Protocols/Deribit/MarketDataApi.md "Market Data Api"
[Coinbase.Deribit.OrdersApi]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Coinbase/Protocols/Deribit/OrdersApi.md "Orders Api"
[Eurex.T7.Eobi]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Eurex/Protocols/T7/Eobi.md "Enhanced Order Book Interface"
[Eurex.T7.Eti]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Eurex/Protocols/T7/Eti.md "Enhanced Trading Interface"
[Ice.IceFutures.Mdf]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Ice/Protocols/IceFutures/Mdf.md "Multicast Data Feed"
[Iex.IexEquities.Deep]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Iex/Protocols/IexEquities/Deep.md "Depth Of Book"
[Iex.IexEquities.DeepPlus]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Iex/Protocols/IexEquities/DeepPlus.md "DeepPlus"
[Iex.IexEquities.Tops]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Iex/Protocols/IexEquities/Tops.md "Top Of Book"
[Imperative.IntelligentCross.DepthOfBook]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Imperative/Protocols/IntelligentCross/DepthOfBook.md "Depth Of Book"
[Jnx.JnxEquities.Pts]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Jnx/Protocols/JnxEquities/Pts.md "Proprietary Trading System"
[Jpx.OseDerivatives.GeniumInet]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Jpx/Protocols/OseDerivatives/GeniumInet.md "Genium Inet"
[Memx.MemxEquities.MemoirDepthFeed]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Memx/Protocols/MemxEquities/MemoirDepthFeed.md "Memoir Depth Feed"
[Miax.MiaxOptions.ComplexTopOfMarket]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Miax/Protocols/MiaxOptions/ComplexTopOfMarket.md "Complex Top Of Market"
[Miax.OnyxFutures.TopOfMarket]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Miax/Protocols/OnyxFutures/TopOfMarket.md "Top Of Market"
[Miax.PearlEquities.DepthOfMarket]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Miax/Protocols/PearlEquities/DepthOfMarket.md "Depth Of Market"
[Miax.PearlEquities.ExpressOrders]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Miax/Protocols/PearlEquities/ExpressOrders.md "Express Orders"
[Nasdaq.IseOptions.OrderComboFeed]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nasdaq/Protocols/IseOptions/OrderComboFeed.md "Ise Order Combo Market Data Feed"
[Nasdaq.IseOptions.TopComboQuoteFeed]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nasdaq/Protocols/IseOptions/TopComboQuoteFeed.md "Ise Top Combo Quote Feed"
[Nasdaq.NsmEquities.NlsPlus]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nasdaq/Protocols/NsmEquities/NlsPlus.md "Last Sale Plus"
[Nasdaq.NsmEquities.Orders]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nasdaq/Protocols/NsmEquities/Orders.md "Orders"
[Nasdaq.NsmEquities.Qbbo]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nasdaq/Protocols/NsmEquities/Qbbo.md "Best Bid And Offer"
[Nasdaq.NsmEquities.TotalView]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nasdaq/Protocols/NsmEquities/TotalView.md "TotalView Itch"
[Nasdaq.NtxEquities.TotalView]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nasdaq/Protocols/NtxEquities/TotalView.md "TX TotalView Itch"
[Nasdaq.PsxEquities.TotalView]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nasdaq/Protocols/PsxEquities/TotalView.md "TotalView Itch"
[Nasdaq.Uqdf.Output]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nasdaq/Protocols/Uqdf/Output.md "Output"
[Nyse.AmexEquities.IntegratedFeed]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/AmexEquities/IntegratedFeed.md "Integrated Feed"
[Nyse.AmexEquities.IntegratedFeedRefresh]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/AmexEquities/IntegratedFeedRefresh.md "Integrated Feed Refresh"
[Nyse.AmexOptions.ComplexFeed]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/AmexOptions/ComplexFeed.md "Complex Feed"
[Nyse.AmexOptions.DeepFeed]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/AmexOptions/DeepFeed.md "Deep Feed"
[Nyse.ArcaEquities.Bbo]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/ArcaEquities/Bbo.md "Best Bid And Offer"
[Nyse.ArcaEquities.IntegratedFeed]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/ArcaEquities/IntegratedFeed.md "Integrated Feed"
[Nyse.ArcaEquities.IntegratedFeedRefresh]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/ArcaEquities/IntegratedFeedRefresh.md "Integrated Feed Refresh"
[Nyse.ArcaOptions.TopFeed]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/ArcaOptions/TopFeed.md "Top Feed"
[Nyse.NationalEquities.Bbo]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/NationalEquities/Bbo.md "Best Bid And Offer"
[Nyse.NationalEquities.Trades]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/NationalEquities/Trades.md "Trades"
[Nyse.NyseBonds.DepthOfBook]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/NyseBonds/DepthOfBook.md "DepthOfBook"
[Nyse.NyseEquities.Bbo]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/NyseEquities/Bbo.md "Best Bid And Offer"
[Nyse.NyseEquities.BinaryGateway]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/NyseEquities/BinaryGateway.md "Binary Gateway"
[Nyse.NyseEquities.ImbalancesFeed]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/NyseEquities/ImbalancesFeed.md "Imbalances Feed"
[Nyse.NyseEquities.IntegratedFeed]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/NyseEquities/IntegratedFeed.md "Integrated Feed"
[Nyse.NyseEquities.IntegratedFeedRefresh]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/NyseEquities/IntegratedFeedRefresh.md "Integrated Feed Refresh"
[Nyse.NyseEquities.IntegratedFeedRetransmission]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/NyseEquities/IntegratedFeedRetransmission.md "Integrated Feed Retransmission"
[Nyse.NyseEquities.OpenBook]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/NyseEquities/OpenBook.md "Open Book"
[Nyse.TexasEquities.IntegratedFeed]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/TexasEquities/IntegratedFeed.md "Integrated Feed"
[Nyse.TexasEquities.IntegratedFeedRefresh]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Nyse/Protocols/TexasEquities/IntegratedFeedRefresh.md "Integrated Feed Refresh"
[OtcMarkets.LinkAts.Multicast]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/OtcMarkets/Protocols/LinkAts/Multicast.md "OTC Markets Multicast"
[Siac.Cqs.Output]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Siac/Protocols/Cqs/Output.md "Output"
[Siac.Cts.Output]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Siac/Protocols/Cts/Output.md "Output"
[Siac.Opra.Output]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Siac/Protocols/Opra/Output.md "Output"
[Tmx.Mx.SolaMulticast]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Tmx/Protocols/Mx/SolaMulticast.md "Sola Multicast"
[Txse.TxseEquities.Seed]: https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/blob/main/Organizations/Txse/Protocols/TxseEquities/Seed.md "Session Enabled Entry Daemon"

[Asx.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Asx "Australian Securities Exchange"
[B3.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/B3 "Brasil, Bolsa, Balcão"
[BlueOceanAts.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/BlueOceanAts "Blue Ocean Technologies"
[Box.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Box "Box Options Market"
[Cboe.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Cboe "Chicago Board Options Exchange"
[Cme.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Cme "CME Group"
[Coinbase.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Coinbase "Coinbase"
[Eurex.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Eurex "Eurex Exchange"
[Ice.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Ice "Intercontinental Exchange"
[Iex.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Iex "Investors Exchange"
[Imperative.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Imperative "Imperative Execution"
[Jnx.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Jnx "Japannext Securities"
[Jpx.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Jpx "Japan Exchange Group"
[Memx.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Memx "The Members Exchange"
[Miax.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Miax "Miami International Holdings"
[Nasdaq.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nasdaq "National Association of Securities Dealers Automated Quotations (Nasdaq)"
[Nyse.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nyse "New York Stock Exchange"
[OtcMarkets.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/OtcMarkets "OTC Markets Group"
[Siac.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Siac "The Securities Industry Automation Corporation"
[Tmx.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Tmx "TMX Group"
[Txse.Directory]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Txse "Texas Stock Exchange"

[AsxDerivatives.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Asx/AsxDerivatives "Asx Derivatives"
[B3Derivatives.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/B3/B3Derivatives "B3 Derivatives"
[BlueEquities.Ats]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/BlueOceanAts/BlueEquities "Blue Equities"
[BoxOptions.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Box/BoxOptions "BOX Options Exchange"
[ByxEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Cboe/ByxEquities "Cboe Byx Equities"
[BzxEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Cboe/BzxEquities "Cboe Bzx Equities"
[BzxOptions.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Cboe/BzxOptions "Cboe Bzx Options"
[C1Options.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Cboe/C1Options "Cboe C1 Options"
[CfeFutures.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Cboe/CfeFutures "Cboe Futures Exchange"
[EdgaEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Cboe/EdgaEquities "Cboe Edga Equities"
[EdgxEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Cboe/EdgxEquities "Cboe Edgx Equities"
[TitaniumConsolidated.Consolidator]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Cboe/TitaniumConsolidated "Cboe Titanium Consolidated"
[Globex.Platform]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Cme/Globex "CME Globex"
[CoinbaseDerivatives.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Coinbase/CoinbaseDerivatives "Coinbase Derivatives"
[Deribit.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Coinbase/Deribit "Deribit"
[T7.Platform]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Eurex/T7 "T7"
[IceFutures.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Ice/IceFutures "Intercontinental Exchange Futures"
[IexEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Iex/IexEquities "IEX Equities"
[IntelligentCross.Ats]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Imperative/IntelligentCross "Intelligent Cross"
[JnxEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Jnx/JnxEquities "Japannext Equities"
[OseDerivatives.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Jpx/OseDerivatives "Osaka Securities Exchange"
[MemxEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Memx/MemxEquities "Memx Equities"
[MiaxOptions.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Miax/MiaxOptions "MIAX Options"
[OnyxFutures.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Miax/OnyxFutures "MIAX Futures Onyx"
[PearlEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Miax/PearlEquities "MIAX Pearl Equities"
[IseOptions.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nasdaq/IseOptions "Nasdaq ISE"
[NsmEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nasdaq/NsmEquities "Nasdaq Stock Market"
[NtxEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nasdaq/NtxEquities "Nasdaq Texas"
[PsxEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nasdaq/PsxEquities "Nasdaq PSX"
[Uqdf.Consolidator]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nasdaq/Uqdf "Nasdaq UTP Quote Data Feed"
[AmexEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nyse/AmexEquities "Nyse Amex Equities"
[AmexOptions.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nyse/AmexOptions "Nyse Amex Options"
[ArcaEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nyse/ArcaEquities "Nyse Arca Equities"
[ArcaOptions.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nyse/ArcaOptions "Nyse Arca Options"
[NationalEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nyse/NationalEquities "Nyse National Equities"
[NyseBonds.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nyse/NyseBonds "Nyse Bonds"
[NyseEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nyse/NyseEquities "New York Stock Exchange Equities"
[TexasEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Nyse/TexasEquities "Nyse Texas Equities"
[LinkAts.Ats]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/OtcMarkets/LinkAts "OTC Link ATS"
[Cqs.Consolidator]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Siac/Cqs "Consolidated Quotation System"
[Cts.Consolidator]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Siac/Cts "Consolidated Tape System"
[Opra.Consolidator]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Siac/Opra "Options Price Reporting Authority"
[Mx.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Tmx/Mx "Montreal Exchange"
[TxseEquities.Exchange]: https://github.com/Open-Markets-Initiative/omi-java-protocols/tree/main/Classes/Txse/TxseEquities "Txse Equities"

[Kaitai.Definitions.Repository]: https://github.com/Open-Markets-Initiative/omi-kaitai-struct-definitions "Omi Kaitai Struct Definitions"
[Dfdl.Definitions.Repository]: https://github.com/Open-Markets-Initiative/omi-dfdl-definitions "Omi DFDL Definitions"
[P4.Definitions.Repository]: https://github.com/Open-Markets-Initiative/omi-p4-definitions "Omi P4 Definitions"
[Spicy.Definitions.Repository]: https://github.com/Open-Markets-Initiative/omi-spicy-definitions "Omi Spicy Definitions"
[Lean.Definitions.Repository]: https://github.com/Open-Markets-Initiative/omi-lean4-definitions "Omi Lean Definitions"
[Rocq.Definitions.Repository]: https://github.com/Open-Markets-Initiative/omi-rocq-definitions "Omi Rocq Definitions"
[Tla.Definitions.Repository]: https://github.com/Open-Markets-Initiative/omi-tlaplus-definitions "Omi TLA+ Definitions"
[Promela.Definitions.Repository]: https://github.com/Open-Markets-Initiative/omi-promela-definitions "Omi Promela Definitions"
[Fix.Dictionaries.Repository]: https://github.com/Open-Markets-Initiative/omi-fix-dictionaries "Omi FIX Dictionaries"
[Xml.Specifications.Repository]: https://github.com/Open-Markets-Initiative/omi-xml-specifications "Omi Xml Specifications"
