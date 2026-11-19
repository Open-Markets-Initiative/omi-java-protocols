# Classes

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

## Usage

Each protocol is one package, such as `omi._24x._24xequities.memoirdepthfeed.sbe.v1_3`, holding these sub-packages:

- `messages` — one class per message, decoded with `parseFrom` and encoded with `encode` or `toBytes`
- `fields` — the field classes that messages are built from, each reading and writing its own bytes
- `enums` — one enum per field with named values
- `types` — the `Message` and `Field` interfaces and the runtime support they share
- `dispatch` — selects the message class for a message type

A protocol framed as a packet of counted messages also has a `PacketDecoder`, which walks one packet payload into its messages:

```java
import omi._24x._24xequities.memoirdepthfeed.sbe.v1_3.dispatch.PacketDecoder;
import omi._24x._24xequities.memoirdepthfeed.sbe.v1_3.types.Message;

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

A protocol with a `PacketDecoder` or a TCP stream also has a capture test, which walks every UDP datagram of a pcap or pcap-ng capture, or of each capture in a directory, and the records of every TCP connection, and requires every message to encode back to its own bytes. The build workflow runs it on 126 protocols, each against its captures from [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets). The same run, locally, from the repository root:

```
git clone --depth=1 https://github.com/Open-Markets-Initiative/omi-data-packets.git
gradle :asx-asxderivatives-ntp-itch-v1-05:captureTest -Pcapture=omi-data-packets/Asx/AsxDerivatives.Ntp.Itch.v1.05 -Pstrict
```

## Organizations

> [24X][24X.Directory] · [A2X][A2X.Directory] · [Aix][Aix.Directory] · [Aquis][Aquis.Directory] · [AsiaNext][AsiaNext.Directory] · [Asx][Asx.Directory] · [B3][B3.Directory] · [Bist][Bist.Directory] · [Biva][Biva.Directory] · [BlueOceanAts][BlueOceanAts.Directory] · [Bme][Bme.Directory] · [Box][Box.Directory] · [BruceAts][BruceAts.Directory] · [Bse][Bse.Directory] · [Cboe][Cboe.Directory] · [CixAts][CixAts.Directory] · [Cme][Cme.Directory] · [Cnsx][Cnsx.Directory] · [Coinbase][Coinbase.Directory] · [Currenex][Currenex.Directory] · [Databento][Databento.Directory] · [Eurex][Eurex.Directory] · [Euronext][Euronext.Directory] · [Finra][Finra.Directory] · [Gpw][Gpw.Directory] · [Hkex][Hkex.Directory] · [Ice][Ice.Directory] · [Iex][Iex.Directory] · [Imperative][Imperative.Directory] · [Jnx][Jnx.Directory] · [Jpx][Jpx.Directory] · [Jse][Jse.Directory] · [Koscom][Koscom.Directory] · [Lme][Lme.Directory] · [Lseg][Lseg.Directory] · [Ltse][Ltse.Directory] · [Memx][Memx.Directory] · [Miax][Miax.Directory] · [Moex][Moex.Directory] · [Nairobi][Nairobi.Directory] · [Nasdaq][Nasdaq.Directory] · [Nse][Nse.Directory] · [NsxAustralia][NsxAustralia.Directory] · [Nyse][Nyse.Directory] · [Odx][Odx.Directory] · [Omi][Omi.Directory] · [OtcMarkets][OtcMarkets.Directory] · [Pse][Pse.Directory] · [Sgx][Sgx.Directory] · [Siac][Siac.Directory] · [SmallX][SmallX.Directory] · [Tadawul][Tadawul.Directory] · [Tmx][Tmx.Directory] · [Tradelogiq][Tradelogiq.Directory] · [Txse][Txse.Directory]

## Exchanges

> [24XEquities][24XEquities.Exchange] · [A2XEquities][A2XEquities.Exchange] · [AixMarket][AixMarket.Exchange] · [AmexEquities][AmexEquities.Exchange] · [AmexOptions][AmexOptions.Exchange] · [AquisEquities][AquisEquities.Exchange] · [AquisStockExchange][AquisStockExchange.Exchange] · [ArcaEquities][ArcaEquities.Exchange] · [ArcaOptions][ArcaOptions.Exchange] · [AsiaNextDerivatives][AsiaNextDerivatives.Exchange] · [AsxDerivatives][AsxDerivatives.Exchange] · [B3Derivatives][B3Derivatives.Exchange] · [BivaEquities][BivaEquities.Exchange] · [BlueEquities][BlueEquities.Ats] · [BmeEquities][BmeEquities.Exchange] · [BmeFixedIncome][BmeFixedIncome.Exchange] · [BorsaIstanbul][BorsaIstanbul.Exchange] · [BoxOptions][BoxOptions.Exchange] · [BrokerTec][BrokerTec.Exchange] · [BruceEquities][BruceEquities.Ats] · [BseIndia][BseIndia.Exchange] · [BxEquities][BxEquities.Exchange] · [BxeEquities][BxeEquities.Exchange] · [ByxEquities][ByxEquities.Exchange] · [BzxEquities][BzxEquities.Exchange] · [BzxOptions][BzxOptions.Exchange] · [C1Options][C1Options.Exchange] · [C2Options][C2Options.Exchange] · [CboeEquities][CboeEquities.Exchange] · [CboeEurope][CboeEurope.Exchange] · [CedxDerivatives][CedxDerivatives.Exchange] · [CfeFutures][CfeFutures.Exchange] · [CoinbaseDerivatives][CoinbaseDerivatives.Exchange] · [Cse2][Cse2.Exchange] · [CurrenexForex][CurrenexForex.Exchange] · [CxaEquities][CxaEquities.Exchange] · [CxeEquities][CxeEquities.Exchange] · [CxjEquities][CxjEquities.Exchange] · [Deribit][Deribit.Exchange] · [DxeEquities][DxeEquities.Exchange] · [Ebs][Ebs.Exchange] · [EdgaEquities][EdgaEquities.Exchange] · [EdgxEquities][EdgxEquities.Exchange] · [EdgxOptions][EdgxOptions.Exchange] · [FinraOrf][FinraOrf.Exchange] · [FseEquities][FseEquities.Exchange] · [GemxOptions][GemxOptions.Exchange] · [HkexSecurities][HkexSecurities.Exchange] · [IceFutures][IceFutures.Exchange] · [IexEquities][IexEquities.Exchange] · [IexOptions][IexOptions.Exchange] · [IntelligentCross][IntelligentCross.Ats] · [IseOptions][IseOptions.Exchange] · [JnxBonds][JnxBonds.Exchange] · [JnxEquities][JnxEquities.Exchange] · [LinkAts][LinkAts.Ats] · [LinkNqb][LinkNqb.Ats] · [LmeSelect][LmeSelect.Exchange] · [Lse][Lse.Exchange] · [LtseEquities][LtseEquities.Exchange] · [LynxAts][LynxAts.Ats] · [MatchNow][MatchNow.Exchange] · [Meff][Meff.Exchange] · [MemxEquities][MemxEquities.Exchange] · [MemxOptions][MemxOptions.Exchange] · [MiaxOptions][MiaxOptions.Exchange] · [MoonAts][MoonAts.Ats] · [MrxOptions][MrxOptions.Exchange] · [Mx][Mx.Exchange] · [NairobiEquities][NairobiEquities.Exchange] · [NasdaqCanada][NasdaqCanada.Exchange] · [NationalEquities][NationalEquities.Exchange] · [NeoEquities][NeoEquities.Exchange] · [NfxFutures][NfxFutures.Exchange] · [NomOptions][NomOptions.Exchange] · [NordicDerivatives][NordicDerivatives.Exchange] · [NordicEquities][NordicEquities.Exchange] · [NseCd][NseCd.Exchange] · [NseCm][NseCm.Exchange] · [NseCom][NseCom.Exchange] · [NseEquities][NseEquities.Exchange] · [NseFo][NseFo.Exchange] · [NsmEquities][NsmEquities.Exchange] · [NtxEquities][NtxEquities.Exchange] · [NtxOptions][NtxOptions.Exchange] · [NyseBonds][NyseBonds.Exchange] · [NyseEquities][NyseEquities.Exchange] · [OdxEquities][OdxEquities.Exchange] · [OdxSecurityToken][OdxSecurityToken.Exchange] · [OmegaAts][OmegaAts.Ats] · [OnyxFutures][OnyxFutures.Exchange] · [OseDerivatives][OseDerivatives.Exchange] · [Overnight][Overnight.Ats] · [PearlEquities][PearlEquities.Exchange] · [PearlOptions][PearlOptions.Exchange] · [PhlxOptions][PhlxOptions.Exchange] · [PseEquities][PseEquities.Exchange] · [PsxEquities][PsxEquities.Exchange] · [SaudiExchange][SaudiExchange.Exchange] · [SmallFutures][SmallFutures.Exchange] · [Spectra][Spectra.Exchange] · [Sse][Sse.Exchange] · [SseEquities][SseEquities.Exchange] · [Szse][Szse.Exchange] · [TexasEquities][TexasEquities.Exchange] · [TradeEcho][TradeEcho.Exchange] · [TseEquities][TseEquities.Exchange] · [Tsx][Tsx.Exchange] · [TsxAlpha][TsxAlpha.Exchange] · [Turquoise][Turquoise.Exchange] · [TxseEquities][TxseEquities.Exchange] · [Wse][Wse.Exchange]

## Platforms

> [CixAts CixAspen][CixAspen.Platform] · [Cme Globex][Globex.Platform] · [Jse Itac][Itac.Platform] · [Lseg Millennium][Millennium.Platform] · [NsxAustralia Nets][Nets.Platform] · [Euronext Optiq][Optiq.Platform] · [Eurex T7][T7.Platform] · [Sgx TitanDt][TitanDt.Platform]

## Consolidators

> [Cqs][Cqs.Consolidator] · [Cts][Cts.Consolidator] · [MdcsRealtime][MdcsRealtime.Consolidator] · [NyseConsolidated][NyseConsolidated.Consolidator] · [Opra][Opra.Consolidator] · [TitaniumConsolidated][TitaniumConsolidated.Consolidator] · [Uqdf][Uqdf.Consolidator] · [Utdf][Utdf.Consolidator]

## Redistributors

> [MarketData][MarketData.Redistributor]

[24X.Directory]: 24X "24 National Exchange"
[A2X.Directory]: A2X "A2X Markets"
[Aix.Directory]: Aix "Astana International Exchange"
[Aquis.Directory]: Aquis "Aquis Exchange"
[AsiaNext.Directory]: AsiaNext "AsiaNext"
[Asx.Directory]: Asx "Australian Securities Exchange"
[B3.Directory]: B3 "Brasil, Bolsa, Balcão"
[Bist.Directory]: Bist "Borsa İstanbul A.Ş."
[Biva.Directory]: Biva "Bolsa Institucional de Valores"
[BlueOceanAts.Directory]: BlueOceanAts "Blue Ocean Technologies"
[Bme.Directory]: Bme "Bolsas y Mercados Españoles"
[Box.Directory]: Box "Box Options Market"
[BruceAts.Directory]: BruceAts "Bruce ATS"
[Bse.Directory]: Bse "BSE Limited"
[Cboe.Directory]: Cboe "Chicago Board Options Exchange"
[CixAts.Directory]: CixAts "CIX Trading Inc."
[Cme.Directory]: Cme "CME Group"
[Cnsx.Directory]: Cnsx "Canadian Securities Exchange"
[Coinbase.Directory]: Coinbase "Coinbase"
[Currenex.Directory]: Currenex "Currenex"
[Databento.Directory]: Databento "Databento"
[Eurex.Directory]: Eurex "Eurex Exchange"
[Euronext.Directory]: Euronext "Euronext"
[Finra.Directory]: Finra "Financial Industry Regulatory Authority"
[Gpw.Directory]: Gpw "Giełda Papierów Wartościowych w Warszawie"
[Hkex.Directory]: Hkex "Hong Kong Exchanges and Clearing"
[Ice.Directory]: Ice "Intercontinental Exchange"
[Iex.Directory]: Iex "Investors Exchange"
[Imperative.Directory]: Imperative "Imperative Execution"
[Jnx.Directory]: Jnx "Japannext Securities"
[Jpx.Directory]: Jpx "Japan Exchange Group"
[Jse.Directory]: Jse "JSE Limited"
[Koscom.Directory]: Koscom "Koscom Co., Ltd."
[Lme.Directory]: Lme "The London Metal Exchange"
[Lseg.Directory]: Lseg "London Stock Exchange"
[Ltse.Directory]: Ltse "Long-Term Stock Exchange"
[Memx.Directory]: Memx "The Members Exchange"
[Miax.Directory]: Miax "Miami International Holdings"
[Moex.Directory]: Moex "Moscow Exchange"
[Nairobi.Directory]: Nairobi "Nairobi Securities Exchange"
[Nasdaq.Directory]: Nasdaq "National Association of Securities Dealers Automated Quotations (Nasdaq)"
[Nse.Directory]: Nse "National Stock Exchange of India Ltd"
[NsxAustralia.Directory]: NsxAustralia "Nation Stock Exchange of Australia"
[Nyse.Directory]: Nyse "New York Stock Exchange"
[Odx.Directory]: Odx "Osaka Digital Exchange"
[Omi.Directory]: Omi "Open Markets Initiative"
[OtcMarkets.Directory]: OtcMarkets "OTC Markets Group"
[Pse.Directory]: Pse "Philippine Stock Exchange"
[Sgx.Directory]: Sgx "Singapore Exchange"
[Siac.Directory]: Siac "The Securities Industry Automation Corporation"
[SmallX.Directory]: SmallX "The Small Exchange"
[Tadawul.Directory]: Tadawul "Saudi Exchange"
[Tmx.Directory]: Tmx "TMX Group"
[Tradelogiq.Directory]: Tradelogiq "Tradelogiq Markets Inc."
[Txse.Directory]: Txse "Texas Stock Exchange"

[24XEquities.Exchange]: 24X/24XEquities "24X Equities"
[A2XEquities.Exchange]: A2X/A2XEquities "A2X Equities"
[AixMarket.Exchange]: Aix/AixMarket "Astana International Exchange"
[AquisEquities.Exchange]: Aquis/AquisEquities "Aquis Equities"
[AquisStockExchange.Exchange]: Aquis/AquisStockExchange "Aquis Stock Exchange"
[AsiaNextDerivatives.Exchange]: AsiaNext/AsiaNextDerivatives "AsiaNext Derivatives"
[AsxDerivatives.Exchange]: Asx/AsxDerivatives "Asx Derivatives"
[B3Derivatives.Exchange]: B3/B3Derivatives "B3 Derivatives"
[BorsaIstanbul.Exchange]: Bist/BorsaIstanbul "Borsa Istanbul"
[BivaEquities.Exchange]: Biva/BivaEquities "Biva Equities"
[BlueEquities.Ats]: BlueOceanAts/BlueEquities "Blue Equities"
[BmeEquities.Exchange]: Bme/BmeEquities "BME Equities"
[BmeFixedIncome.Exchange]: Bme/BmeFixedIncome "BME Fixed Income"
[Meff.Exchange]: Bme/Meff "MEFF"
[BoxOptions.Exchange]: Box/BoxOptions "BOX Options Exchange"
[BruceEquities.Ats]: BruceAts/BruceEquities "Bruce ATS Equities"
[BseIndia.Exchange]: Bse/BseIndia "BSE India"
[BxeEquities.Exchange]: Cboe/BxeEquities "Cboe BXE"
[ByxEquities.Exchange]: Cboe/ByxEquities "Cboe Byx Equities"
[BzxEquities.Exchange]: Cboe/BzxEquities "Cboe Bzx Equities"
[BzxOptions.Exchange]: Cboe/BzxOptions "Cboe Bzx Options"
[C1Options.Exchange]: Cboe/C1Options "Cboe C1 Options"
[C2Options.Exchange]: Cboe/C2Options "Cboe C2 Options"
[CboeEquities.Exchange]: Cboe/CboeEquities "Cboe Equities"
[CboeEurope.Exchange]: Cboe/CboeEurope "Cboe Europe"
[CedxDerivatives.Exchange]: Cboe/CedxDerivatives "Cboe Europe Derivatives"
[CfeFutures.Exchange]: Cboe/CfeFutures "Cboe Futures Exchange"
[CxaEquities.Exchange]: Cboe/CxaEquities "Cboe Australia"
[CxeEquities.Exchange]: Cboe/CxeEquities "Cboe CXE"
[CxjEquities.Exchange]: Cboe/CxjEquities "Cboe Japan"
[DxeEquities.Exchange]: Cboe/DxeEquities "Cboe DXE"
[EdgaEquities.Exchange]: Cboe/EdgaEquities "Cboe Edga Equities"
[EdgxEquities.Exchange]: Cboe/EdgxEquities "Cboe Edgx Equities"
[EdgxOptions.Exchange]: Cboe/EdgxOptions "Cboe Edgx Options"
[MatchNow.Exchange]: Cboe/MatchNow "Cboe Canada MATCHNow"
[NeoEquities.Exchange]: Cboe/NeoEquities "Cboe Canada NEO"
[TitaniumConsolidated.Consolidator]: Cboe/TitaniumConsolidated "Cboe Titanium Consolidated"
[CixAspen.Platform]: CixAts/CixAspen "CIX Aspen"
[BrokerTec.Exchange]: Cme/BrokerTec "BrokerTec"
[Ebs.Exchange]: Cme/Ebs "EBS Market"
[Globex.Platform]: Cme/Globex "CME Globex"
[Cse2.Exchange]: Cnsx/Cse2 "CSE2"
[CoinbaseDerivatives.Exchange]: Coinbase/CoinbaseDerivatives "Coinbase Derivatives"
[Deribit.Exchange]: Coinbase/Deribit "Deribit"
[CurrenexForex.Exchange]: Currenex/CurrenexForex "Currenex Forex"
[MarketData.Redistributor]: Databento/MarketData "Databento Market Data"
[T7.Platform]: Eurex/T7 "T7"
[Optiq.Platform]: Euronext/Optiq "Euronext Optiq"
[FinraOrf.Exchange]: Finra/FinraOrf "Finra ORF"
[Wse.Exchange]: Gpw/Wse "Warsaw Stock Exchange"
[HkexSecurities.Exchange]: Hkex/HkexSecurities "Hkex Securities Market"
[Sse.Exchange]: Hkex/Sse "Shanghai Stock Exchange"
[Szse.Exchange]: Hkex/Szse "Shenzhen Stock Exchange"
[IceFutures.Exchange]: Ice/IceFutures "Intercontinental Exchange Futures"
[IexEquities.Exchange]: Iex/IexEquities "IEX Equities"
[IexOptions.Exchange]: Iex/IexOptions "IEX Options"
[IntelligentCross.Ats]: Imperative/IntelligentCross "Intelligent Cross"
[JnxBonds.Exchange]: Jnx/JnxBonds "Japannext Bonds"
[JnxEquities.Exchange]: Jnx/JnxEquities "Japannext Equities"
[FseEquities.Exchange]: Jpx/FseEquities "Fukuoka Stock Exchange Equities"
[NseEquities.Exchange]: Jpx/NseEquities "Nagoya Stock Exchange Equities"
[OseDerivatives.Exchange]: Jpx/OseDerivatives "Osaka Securities Exchange"
[SseEquities.Exchange]: Jpx/SseEquities "Sapporo Securities Exchange Equities"
[TseEquities.Exchange]: Jpx/TseEquities "Tokyo Stock Exchange Equities"
[Itac.Platform]: Jse/Itac "Integrated Trading and Clearing"
[MdcsRealtime.Consolidator]: Koscom/MdcsRealtime "MDCS Realtime Market Data"
[LmeSelect.Exchange]: Lme/LmeSelect "LMEselect"
[Lse.Exchange]: Lseg/Lse "London Stock Exchange"
[Millennium.Platform]: Lseg/Millennium "Millennium Exchange"
[TradeEcho.Exchange]: Lseg/TradeEcho "TRADEcho"
[Turquoise.Exchange]: Lseg/Turquoise "Turquoise"
[LtseEquities.Exchange]: Ltse/LtseEquities "Ltse Equities"
[MemxEquities.Exchange]: Memx/MemxEquities "Memx Equities"
[MemxOptions.Exchange]: Memx/MemxOptions "Memx Options"
[MiaxOptions.Exchange]: Miax/MiaxOptions "MIAX Options"
[OnyxFutures.Exchange]: Miax/OnyxFutures "MIAX Futures Onyx"
[PearlEquities.Exchange]: Miax/PearlEquities "MIAX Pearl Equities"
[PearlOptions.Exchange]: Miax/PearlOptions "MIAX Pearl Options"
[Spectra.Exchange]: Moex/Spectra "MOEX Derivatives Market"
[NairobiEquities.Exchange]: Nairobi/NairobiEquities "Nairobi Securities Exchange Equities"
[BxEquities.Exchange]: Nasdaq/BxEquities "Nasdaq BX"
[GemxOptions.Exchange]: Nasdaq/GemxOptions "Nasdaq GEMX"
[IseOptions.Exchange]: Nasdaq/IseOptions "Nasdaq ISE"
[MrxOptions.Exchange]: Nasdaq/MrxOptions "Nasdaq MRX"
[NasdaqCanada.Exchange]: Nasdaq/NasdaqCanada "Nasdaq Canada"
[NfxFutures.Exchange]: Nasdaq/NfxFutures "Nasdaq Futures"
[NomOptions.Exchange]: Nasdaq/NomOptions "Nasdaq Options Market"
[NordicDerivatives.Exchange]: Nasdaq/NordicDerivatives "Nasdaq Nordic Derivatives"
[NordicEquities.Exchange]: Nasdaq/NordicEquities "Nasdaq Nordic Equities"
[NsmEquities.Exchange]: Nasdaq/NsmEquities "Nasdaq Stock Market"
[NtxEquities.Exchange]: Nasdaq/NtxEquities "Nasdaq Texas"
[NtxOptions.Exchange]: Nasdaq/NtxOptions "Nasdaq Texas Options"
[PhlxOptions.Exchange]: Nasdaq/PhlxOptions "Nasdaq PHLX"
[PsxEquities.Exchange]: Nasdaq/PsxEquities "Nasdaq PSX"
[Uqdf.Consolidator]: Nasdaq/Uqdf "Nasdaq UTP Quote Data Feed"
[Utdf.Consolidator]: Nasdaq/Utdf "Nasdaq UTP Trade Data Feed"
[NseCd.Exchange]: Nse/NseCd "NSE Currency Derivatives"
[NseCm.Exchange]: Nse/NseCm "NSE Capital Market"
[NseCom.Exchange]: Nse/NseCom "NSE Commodity Derivatives"
[NseFo.Exchange]: Nse/NseFo "NSE Futures & Options"
[Nets.Platform]: NsxAustralia/Nets "NETS Trading System"
[AmexEquities.Exchange]: Nyse/AmexEquities "Nyse Amex Equities"
[AmexOptions.Exchange]: Nyse/AmexOptions "Nyse Amex Options"
[ArcaEquities.Exchange]: Nyse/ArcaEquities "Nyse Arca Equities"
[ArcaOptions.Exchange]: Nyse/ArcaOptions "Nyse Arca Options"
[NationalEquities.Exchange]: Nyse/NationalEquities "Nyse National Equities"
[NyseBonds.Exchange]: Nyse/NyseBonds "Nyse Bonds"
[NyseConsolidated.Consolidator]: Nyse/NyseConsolidated "NYSE Consolidated"
[NyseEquities.Exchange]: Nyse/NyseEquities "New York Stock Exchange Equities"
[TexasEquities.Exchange]: Nyse/TexasEquities "Nyse Texas Equities"
[OdxEquities.Exchange]: Odx/OdxEquities "Odx Equities"
[OdxSecurityToken.Exchange]: Odx/OdxSecurityToken "Odx Security Token"
[LinkAts.Ats]: OtcMarkets/LinkAts "OTC Link ATS"
[LinkNqb.Ats]: OtcMarkets/LinkNqb "OTC Link NQB"
[MoonAts.Ats]: OtcMarkets/MoonAts "MOON ATS"
[Overnight.Ats]: OtcMarkets/Overnight "OTC Link Overnight OTC"
[PseEquities.Exchange]: Pse/PseEquities "Philippine Stock Exchange Equities"
[TitanDt.Platform]: Sgx/TitanDt "SGX Titan"
[Cqs.Consolidator]: Siac/Cqs "Consolidated Quotation System"
[Cts.Consolidator]: Siac/Cts "Consolidated Tape System"
[Opra.Consolidator]: Siac/Opra "Options Price Reporting Authority"
[SmallFutures.Exchange]: SmallX/SmallFutures "Small Exchange"
[SaudiExchange.Exchange]: Tadawul/SaudiExchange "Saudi Exchange"
[Mx.Exchange]: Tmx/Mx "Montreal Exchange"
[Tsx.Exchange]: Tmx/Tsx "Toronto Stock Exchange"
[TsxAlpha.Exchange]: Tmx/TsxAlpha "TSX Alpha Exchange"
[LynxAts.Ats]: Tradelogiq/LynxAts "Lynx ATS"
[OmegaAts.Ats]: Tradelogiq/OmegaAts "Omega ATS"
[TxseEquities.Exchange]: Txse/TxseEquities "Txse Equities"
