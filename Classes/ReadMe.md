# Classes

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

Organizations: [Asx][Asx.Directory], [B3][B3.Directory], [BlueOceanAts][BlueOceanAts.Directory], [Box][Box.Directory], [Cboe][Cboe.Directory], [Cme][Cme.Directory], [Coinbase][Coinbase.Directory], [Eurex][Eurex.Directory], [Ice][Ice.Directory], [Iex][Iex.Directory], [Imperative][Imperative.Directory], [Jnx][Jnx.Directory], [Jpx][Jpx.Directory], [Memx][Memx.Directory], [Miax][Miax.Directory], [Nasdaq][Nasdaq.Directory], [Nyse][Nyse.Directory], [OtcMarkets][OtcMarkets.Directory], [Siac][Siac.Directory], [Tmx][Tmx.Directory], [Txse][Txse.Directory]

## Projects

Each organization directory lists its protocols. Each protocol directory is a Gradle subproject of the repository's one build, with a ReadMe giving its package, its messages, and its tasks, and these source sets:

| Source Set | Description |
| --- | --- |
| `src/main/java` | Parser library: the message, field, enum, and dispatch classes. It depends on nothing outside the JDK. |
| `src/roundTrip/java` | Program that decodes deterministic bytes into each message and requires it to encode back; the `roundTrip` task runs it as part of `check`. |
| `src/captureTest/java` | Program that walks every packet of a capture through the `PacketDecoder`, and every TCP connection through the stream of the side sending it, and requires every message to encode back; the `captureTest` task runs it on the capture `-Pcapture` names. Only a protocol with a `PacketDecoder` or a TCP stream has one. |

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
