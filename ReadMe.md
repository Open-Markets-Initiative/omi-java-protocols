# Omi Java Protocols

Omi Java Protocols provide source generated Java parsing of common binary exchange protocols. Every protocol targets Java 17 and depends on nothing outside the JDK.

## Parsers

Each top-level directory holds one kind of parser, with a directory for each organization, division, and protocol version. A parser's ReadMe shows how to use it and lists its organizations and exchanges; a protocol's ReadMe lists its messages.

| Parser | Description | Protocols | Generated Lines |
| --- | --- | ---: | ---: |
| [Classes](Classes) | Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes. | 114 | 3,477,265 |
| [ZeroCopy](ZeroCopy) | Messages are flyweights read where their bytes lie: decoding copies nothing and allocates nothing. | 7 | 21,883 |

## Usage

The repository is one Gradle build, with a subproject for each parser of each protocol version. Build and verify every one:

```
gradle build
```

A single one builds by its project name: its identifier in lower case with each dot replaced by a hyphen, after its parser's prefix, if any:

```
gradle :iex-iexequities-deep-iextp-v1-06:build
gradle :zerocopy-iex-iexequities-deep-iextp-v1-06:build
```

## Development

Updates are greatly appreciated; however, this entire repository is source generated...including the words you are reading right now. If you wish to suggest parser updates, the recommended process is to create an issue with changes and explanation.  Time permitting, we will update the models and regenerate.

## Testing

[![Build](https://github.com/Open-Markets-Initiative/omi-java-protocols/actions/workflows/build.yml/badge.svg)](https://github.com/Open-Markets-Initiative/omi-java-protocols/actions/workflows/build.yml)

Every build runs each Classes protocol's round trip, and capture tests on 49 protocols against [omi-data-packets](https://github.com/Open-Markets-Initiative/omi-data-packets); see [Classes](Classes/ReadMe.md#testing).

Please report any parsing errors as an [issue](https://github.com/Open-Markets-Initiative/omi-java-protocols/issues "Omi Java Protocols Issues").  Include a small note on the protocol and version, and a minimal capture demonstrating the problem. Also consider including a link or pdf specification documenting the correct behavior.

Production packet captures are required for protocol verification.  If your organization has the rights to packet captures, and you wish to make the world a better place, please post captures to this project.

## Open Markets Initiative

[![Omi](https://github.com/Open-Markets-Initiative/Open-Markets-Initiative/raw/main/About/Images/Logo.png)](https://github.com/Open-Markets-Initiative/Directory)

The Open Markets Initiative (Omi) is a group of technologists dedicated to enhancing the stability of electronic financial markets using modern development methods.

Other generated code can be found at [Omi Repositories](https://github.com/Open-Markets-Initiative/Directory/tree/main/Repositories "Open Markets Initiative Repositories"); for Omi rules and regulations, see [Omi Directory](https://github.com/Open-Markets-Initiative/Directory "Open Markets Initiative Directory").

## Disclaimer

Any similarities between existing people, places and/or protocols is purely incidental.

Enjoy.
