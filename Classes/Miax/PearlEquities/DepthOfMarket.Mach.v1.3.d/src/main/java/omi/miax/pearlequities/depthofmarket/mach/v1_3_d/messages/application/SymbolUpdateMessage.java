package omi.miax.pearlequities.depthofmarket.mach.v1_3_d.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.ClosingTimeField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.LotSizeField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.NanosecondsField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.OpeningTimeField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.PrimaryMarketCodeField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.SymbolIdField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.TestSecurityIndicatorField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields.TickerSymbolField;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.Field;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.Message;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.PrintOptions;

/**
 * Represents the SymbolUpdateMessage message from the DepthOfMarket protocol.
 *
 * <p>This is the message format that will be used to disseminate all security symbols traded on MIAX Pearl Equities for the current trading session. The Symbol ID sent in this message will be disseminated in Depth of Market messages.</p>
 */
public final class SymbolUpdateMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0001';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 41;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Symbol Update Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 19, 1, 21, 1 };

    /**
     * Nanosecond part of Matching Engine time.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Symbol ID mapped to a given symbol. It is assigned per trading session and is valid for that session.
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Ticker symbol for the security in NASDAQ Integrated Platform format.
     */
    private final TickerSymbolField tickerSymbol = new TickerSymbolField();

    /**
     * Y - Yes, N - No.
     */
    private final TestSecurityIndicatorField testSecurityIndicator = new TestSecurityIndicatorField();

    /**
     * Round Lot size in shares.
     */
    private final LotSizeField lotSize = new LotSizeField();

    /**
     * Expressed in HH:MM:SS format. Eg: 04:00:00.
     */
    private final OpeningTimeField openingTime = new OpeningTimeField();

    /**
     * Expressed in HH:MM:SS format. Eg: 20:00:00.
     */
    private final ClosingTimeField closingTime = new ClosingTimeField();

    /**
     * Primary listing exchange code for the security.
     */
    private final PrimaryMarketCodeField primaryMarketCode = new PrimaryMarketCodeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, symbolId, tickerSymbol, testSecurityIndicator, lotSize, openingTime, closingTime, primaryMarketCode);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond part of Matching Engine time.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Symbol ID mapped to a given symbol. It is assigned per trading session and is valid for that session.
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Ticker symbol for the security in NASDAQ Integrated Platform format.
     *
     * @return the TickerSymbol field
     */
    public TickerSymbolField tickerSymbol() {
        return tickerSymbol;
    }

    /**
     * Y - Yes, N - No.
     *
     * @return the TestSecurityIndicator field
     */
    public TestSecurityIndicatorField testSecurityIndicator() {
        return testSecurityIndicator;
    }

    /**
     * Round Lot size in shares.
     *
     * @return the LotSize field
     */
    public LotSizeField lotSize() {
        return lotSize;
    }

    /**
     * Expressed in HH:MM:SS format. Eg: 04:00:00.
     *
     * @return the OpeningTime field
     */
    public OpeningTimeField openingTime() {
        return openingTime;
    }

    /**
     * Expressed in HH:MM:SS format. Eg: 20:00:00.
     *
     * @return the ClosingTime field
     */
    public ClosingTimeField closingTime() {
        return closingTime;
    }

    /**
     * Primary listing exchange code for the security.
     *
     * @return the PrimaryMarketCode field
     */
    public PrimaryMarketCodeField primaryMarketCode() {
        return primaryMarketCode;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!tickerSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += TickerSymbolField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!testSecurityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TestSecurityIndicatorField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!lotSize.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeField.BYTE_LENGTH;
        if (!openingTime.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningTimeField.BYTE_LENGTH;
        if (!closingTime.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingTimeField.BYTE_LENGTH;
        return primaryMarketCode.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = tickerSymbol.encode(data, cursor);
        if (buffer != null && buffer.length >= 20) {
            System.arraycopy(buffer, 19, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = testSecurityIndicator.encode(data, cursor);
        if (buffer != null && buffer.length >= 22) {
            System.arraycopy(buffer, 21, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = lotSize.encode(data, cursor);
        cursor = openingTime.encode(data, cursor);
        cursor = closingTime.encode(data, cursor);
        cursor = primaryMarketCode.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this message was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the message bytes, or empty when no decode has been attempted
     */
    @Override
    public Optional<byte[]> raw() {
        if (buffer == null) {
            return Optional.empty();
        }
        return Optional.of(buffer.clone());
    }

    @Override
    public Optional<Field> failedAt() {
        if (buffer == null || decoded) {
            return Optional.empty();
        }
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "SymbolId" -> Optional.of(symbolId);
            case "TickerSymbol" -> Optional.of(tickerSymbol);
            case "TestSecurityIndicator" -> Optional.of(testSecurityIndicator);
            case "LotSize" -> Optional.of(lotSize);
            case "OpeningTime" -> Optional.of(openingTime);
            case "ClosingTime" -> Optional.of(closingTime);
            case "PrimaryMarketCode" -> Optional.of(primaryMarketCode);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SymbolUpdateMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
     *
     * @param builder the destination
     * @param options the display options
     */
    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : fields) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymbolUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
