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
gradle :iex-iexequities-deep-iextp-v1-06:build
```

Each protocol is one package, such as `omi.iex.iexequities.deep.iextp.v1_06`, holding these sub-packages:

- `messages` — one class per message, decoded with `parseFrom` and encoded with `encode` or `toBytes`
- `fields` — the field classes that messages are built from, each reading and writing its own bytes
- `enums` — one enum per field with named values
- `types` — the `Message` and `Field` interfaces and the runtime support they share
- `dispatch` — selects the message class for a message type

A protocol framed as a packet of counted messages also has a `PacketDecoder`, which walks one packet payload into its messages:

```java
import omi.iex.iexequities.deep.iextp.v1_06.dispatch.PacketDecoder;
import omi.iex.iexequities.deep.iextp.v1_06.types.Message;

PacketDecoder.Decoded decoded = PacketDecoder.decode(payload, 0, payload.length);
for (Message message : decoded.messages()) {
    System.out.println(message);
}
```

## Development

Updates are greatly appreciated; however, this entire repository is source generated...including the words you are reading right now. If you wish to suggest parser updates, the recommended process is to create an issue with changes and explanation.  Time permitting, we will update the models and regenerate.

| Parser | Protocol Count | Generated Lines |
| --- | --- | --- |
| Classes | 15 | 190,096 |

## Testing

[![Build](https://github.com/Open-Markets-Initiative/omi-java-protocols/actions/workflows/build.yml/badge.svg)](https://github.com/Open-Markets-Initiative/omi-java-protocols/actions/workflows/build.yml)

Every build runs each protocol's round trip, which decodes every message from deterministic bytes at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it.

A protocol with captures in the Omi packet corpus also has a JUnit test for each, which walks every packet of the capture, requires every message to encode back to its own bytes, and requires the captured message to appear. Captures are not included in this repository, so these tests skip unless `OMI_PACKETS_DIR` names a corpus checkout:

```
OMI_PACKETS_DIR=/path/to/packets gradle build
```

Please report any parsing errors as an [issue](https://github.com/Open-Markets-Initiative/omi-java-protocols/issues "Omi Java Protocols Issues").  Include a small note on the protocol and version, and a minimal capture demonstrating the problem. Also consider including a link or pdf specification documenting the correct behavior.

Production packet captures are required for protocol verification.  If your organization has the rights to packet captures, and you wish to make the world a better place, please post captures to this project.

## Protocols

### [Iex](Classes/Iex)

| Protocol | Package | Messages | Fields | Enums |
| --- | --- | --- | --- | --- |
| [IexEquities/Deep.IexTp.v1.06](Classes/Iex/IexEquities/Deep.IexTp.v1.06) | `omi.iex.iexequities.deep.iextp.v1_06` | 12 | 32 | 12 |
| [IexEquities/Deep.IexTp.v1.08](Classes/Iex/IexEquities/Deep.IexTp.v1.08) | `omi.iex.iexequities.deep.iextp.v1_08` | 13 | 33 | 13 |
| [IexEquities/DeepPlus.IexTp.v1.01](Classes/Iex/IexEquities/DeepPlus.IexTp.v1.01) | `omi.iex.iexequities.deepplus.iextp.v1_01` | 14 | 23 | 10 |
| [IexEquities/DeepPlus.IexTp.v1.05](Classes/Iex/IexEquities/DeepPlus.IexTp.v1.05) | `omi.iex.iexequities.deepplus.iextp.v1_05` | 14 | 23 | 10 |
| [IexEquities/Tops.IexTp.v1.56](Classes/Iex/IexEquities/Tops.IexTp.v1.56) | `omi.iex.iexequities.tops.iextp.v1_56` | 3 | 12 | 1 |
| [IexEquities/Tops.IexTp.v1.64](Classes/Iex/IexEquities/Tops.IexTp.v1.64) | `omi.iex.iexequities.tops.iextp.v1_64` | 11 | 36 | 11 |
| [IexEquities/Tops.IexTp.v1.66](Classes/Iex/IexEquities/Tops.IexTp.v1.66) | `omi.iex.iexequities.tops.iextp.v1_66` | 11 | 36 | 11 |

### [Nasdaq](Classes/Nasdaq)

| Protocol | Package | Messages | Fields | Enums |
| --- | --- | --- | --- | --- |
| [IseOptions/OrderComboFeed.Itch.v1.1](Classes/Nasdaq/IseOptions/OrderComboFeed.Itch.v1.1) | `omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1` | 4 | 20 | 14 |
| [IseOptions/TopComboQuoteFeed.Itch.v1.0](Classes/Nasdaq/IseOptions/TopComboQuoteFeed.Itch.v1.0) | `omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0` | 7 | 38 | 8 |
| [NsmEquities/Orders.Ouch.v5.0](Classes/Nasdaq/NsmEquities/Orders.Ouch.v5.0) | `omi.nasdaq.nsmequities.orders.ouch.v5_0` | 4 | 9 | 51 |
| [NsmEquities/Qbbo.Itch.v2.1](Classes/Nasdaq/NsmEquities/Qbbo.Itch.v2.1) | `omi.nasdaq.nsmequities.qbbo.itch.v2_1` | 10 | 36 | 20 |
| [NsmEquities/TotalView.Itch.v5.0.2023](Classes/Nasdaq/NsmEquities/TotalView.Itch.v5.0.2023) | `omi.nasdaq.nsmequities.totalview.itch.v5_0_2023` | 26 | 77 | 31 |
| [NsmEquities/TotalView.Itch.v5.0.2026](Classes/Nasdaq/NsmEquities/TotalView.Itch.v5.0.2026) | `omi.nasdaq.nsmequities.totalview.itch.v5_0_2026` | 26 | 77 | 32 |
| [NtxEquities/TotalView.Itch.v5.0](Classes/Nasdaq/NtxEquities/TotalView.Itch.v5.0) | `omi.nasdaq.ntxequities.totalview.itch.v5_0` | 21 | 60 | 26 |
| [PsxEquities/TotalView.Itch.v5.0](Classes/Nasdaq/PsxEquities/TotalView.Itch.v5.0) | `omi.nasdaq.psxequities.totalview.itch.v5_0` | 20 | 59 | 24 |

## Organizations

> [Iex][Iex.Directory] · [Nasdaq][Nasdaq.Directory]

## Exchanges

> [IexEquities][IexEquities.Exchange] · [IseOptions][IseOptions.Exchange] · [NsmEquities][NsmEquities.Exchange] · [NtxEquities][NtxEquities.Exchange] · [PsxEquities][PsxEquities.Exchange]

## Disclaimer

Any similarities between existing people, places and/or protocols is purely incidental.

Enjoy.

[Iex.Directory]: Classes/Iex "Investors Exchange"
[Nasdaq.Directory]: Classes/Nasdaq "National Association of Securities Dealers Automated Quotations (Nasdaq)"

[IexEquities.Exchange]: Classes/Iex/IexEquities "IEX Equities"
[IseOptions.Exchange]: Classes/Nasdaq/IseOptions "Nasdaq ISE"
[NsmEquities.Exchange]: Classes/Nasdaq/NsmEquities "Nasdaq Stock Market"
[NtxEquities.Exchange]: Classes/Nasdaq/NtxEquities "Nasdaq Texas"
[PsxEquities.Exchange]: Classes/Nasdaq/PsxEquities "Nasdaq PSX"
