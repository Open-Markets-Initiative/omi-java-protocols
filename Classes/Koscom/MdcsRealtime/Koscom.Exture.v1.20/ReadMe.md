# Koscom Co., Ltd. MDCS Realtime Koscom Exture v1.20

Generated Java parser for Koscom MDCS Realtime Koscom Exture v1.20.

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

A protocol of [MDCS Realtime Market Data](..).

## Usage

Gradle project `:koscom-mdcsrealtime-koscom-exture-v1-20` builds package `omi.koscom.mdcsrealtime.koscom.exture.v1_20`. Each protocol version has its own package, so a program can use two versions together.

Decode one message. The offset is where the message starts, after any packet or message header:

```java
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.DomesticEtfEstimatedInavMessage;

DomesticEtfEstimatedInavMessage message = new DomesticEtfEstimatedInavMessage();
if (message.parseFrom(data, offset)) {
    System.out.println(message);
    byte[] bytes = message.toBytes();
}
```

Decode one packet. The payload is the UDP datagram body, without the Ethernet, IP, and UDP headers:

```java
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.dispatch.PacketDecoder;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;

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
| `DomesticEtfEstimatedInavMessage` | `messages.application` |  | 45 |
| `DomesticEtfInavMessage` | `messages.application` |  | 65 |
| `ElwInvestmentIndicatorSensitivityMessage` | `messages.application` |  | 105 |
| `EtfRiskAppraisementMessage` | `messages.application` |  | 195 |
| `EtfTrackingErrorMessage` | `messages.application` |  | 55 |
| `EtnDisparateRatioMessage` | `messages.application` |  | 95 |
| `EtnIivMessage` | `messages.application` |  | 65 |
| `EtpOperatorInformationMessage` | `messages.application` |  | 125 |
| `EtpPdfMessage` | `messages.application` |  | 155 |
| `EtpTransferAgentBatchMessage` | `messages.application` |  | 245 |
| `GlobalEtfInavMessage` | `messages.application` |  | 65 |
| `GlobalEtfTrackingErrorMessage` | `messages.application` |  | 55 |
| `KBondMessage` | `messages.application` |  | 145 |
| `KOtcIssueClosingMessage` | `messages.application` |  | 35 |
| `KOtcMarketActionMessage` | `messages.application` |  | 95 |
| `KOtcMarketOperationMessage` | `messages.application` |  | 25 |
| `KOtcOrderFilledMessage` | `messages.application` |  | 245 |
| `KOtcQuoteMessage` | `messages.application` |  | 195 |
| `KabiBondIndexMessage` | `messages.application` |  | 109 |
| `KebiBondIndexMessage` | `messages.application` |  | 109 |
| `KisBondIndexMessage` | `messages.application` |  | 109 |
| `KisIndexMessage` | `messages.application` |  | 72 |
| `LoanTransactionAvailableQuantityMessage` | `messages.application` |  | 45 |
| `MkfBondIndexMessage` | `messages.application` |  | 109 |
| `MkfIndexJpyMessage` | `messages.application` |  | 72 |
| `MkfIndexMessage` | `messages.application` |  | 72 |
| `NicepniBondIndexMessage` | `messages.application` |  | 109 |
| `OtcBondTradedInfoMessage` | `messages.application` |  | 105 |
| `OtcBondTradesPerInstitutionMessage` | `messages.application` |  | 105 |
| `OtcBondTypesPerInvestorMessage` | `messages.application` |  | 135 |
| `SyntheticEtfConstituentsMessage` | `messages.application` |  | 195 |
| `WisefnIndexMessage` | `messages.application` |  | 72 |

## Verification

| Task | Reads | Description |
| --- | --- | --- |
| `roundTrip` |  | Program that decodes deterministic bytes into each message at a non-zero offset and requires it to encode back to the same bytes, decode again to an equal message, clear, and refuse a buffer too short to hold it. Runs as part of `check`. |
| `captureTest` | pcap or pcap-ng | Program that walks every UDP datagram of a capture through the `PacketDecoder`, and the records of every TCP connection through the stream of the side sending them, and requires every message to encode back to its own bytes. Not part of `check`, since it needs a capture: `-Pcapture` names it, and `-Pstrict` makes a datagram or record the decoder cannot walk, or a message of a type it does not decode, an error. A TCP connection missing bytes, or ending in bytes that make no whole record, is always an error. |

No public capture of this protocol is configured, so the build workflow does not run its capture test. Please post captures to [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets) if you can.

## Build

Requires JDK 17 and Gradle. Run from the repository root, since every protocol is a subproject of one build:

```
gradle :koscom-mdcsrealtime-koscom-exture-v1-20:build
```

Run the round trip alone:

```
gradle :koscom-mdcsrealtime-koscom-exture-v1-20:roundTrip
```

Run the capture test on a capture or a directory of captures, its path relative to the directory gradle runs in:

```
gradle :koscom-mdcsrealtime-koscom-exture-v1-20:captureTest -Pcapture=/path/to/capture.pcap
```

