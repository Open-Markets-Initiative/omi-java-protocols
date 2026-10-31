# Classes

Messages are plain classes that you can decode, inspect, modify, and encode back to their bytes.

Organizations: [Iex][Iex.Directory], [Nasdaq][Nasdaq.Directory]

## Projects

Each organization directory lists its protocols. Each protocol directory is a Gradle subproject of the repository's one build, with a ReadMe giving its package, its messages, and its tasks, and these source sets:

| Source Set | Description |
| --- | --- |
| `src/main/java` | Parser library: the message, field, enum, and dispatch classes. It depends on nothing outside the JDK. |
| `src/roundTrip/java` | Program that decodes deterministic bytes into each message and requires it to encode back; the `roundTrip` task runs it as part of `check`. |
| `src/test/java` | JUnit capture tests, where the packet corpus has captures of the protocol. They skip unless `OMI_PACKETS_DIR` names a corpus checkout. |

[Iex.Directory]: Iex "Investors Exchange"
[Nasdaq.Directory]: Nasdaq "National Association of Securities Dealers Automated Quotations (Nasdaq)"
