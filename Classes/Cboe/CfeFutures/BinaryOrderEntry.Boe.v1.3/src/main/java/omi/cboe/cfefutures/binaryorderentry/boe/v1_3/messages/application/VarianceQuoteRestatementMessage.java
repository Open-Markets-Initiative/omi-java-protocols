package omi.cboe.cfefutures.binaryorderentry.boe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ClearingPriceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ClearingSizeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ClearingSymbolField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ExecIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.QuoteUpdateIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.SymbolShortField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.TransactionTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.types.PrintOptions;

/**
 * Represents the VarianceQuoteRestatementMessage message from the BinaryOrderEntry protocol.
 *
 * <p>A Variance Quote Restatement is sent post-settlement time for each VA and VAO execution during the associated business day is used to communicate updated Price, Size and Symbol associated with the cleared execution.</p>
 */
public final class VarianceQuoteRestatementMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 74;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Variance Quote Restatement Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 58, 16 };

    /**
     * The time the event occurred in the CFE matching engine.
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     */
    private final QuoteUpdateIdField quoteUpdateId = new QuoteUpdateIdField();

    /**
     * Execution ID. Unique across all matching units on a given day. Note: ExecIDs will be represented on ODROP and FIXDROP ports as nine character, base 36 ASCII. Leading zeros should be added if the converted base 36 value is shorter than nine characters.
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Cboe native identifier
     */
    private final SymbolShortField symbolShort = new SymbolShortField();

    /**
     * Clearing Symbol
     */
    private final ClearingSymbolField clearingSymbol = new ClearingSymbolField();

    /**
     * Clearing Price
     */
    private final ClearingPriceField clearingPrice = new ClearingPriceField();

    /**
     * Clearing Size
     */
    private final ClearingSizeField clearingSize = new ClearingSizeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, quoteUpdateId, execId, symbolShort, clearingSymbol, clearingPrice, clearingSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the CFE matching engine.
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     *
     * @return the QuoteUpdateId field
     */
    public QuoteUpdateIdField quoteUpdateId() {
        return quoteUpdateId;
    }

    /**
     * Execution ID. Unique across all matching units on a given day. Note: ExecIDs will be represented on ODROP and FIXDROP ports as nine character, base 36 ASCII. Leading zeros should be added if the converted base 36 value is shorter than nine characters.
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * Cboe native identifier
     *
     * @return the SymbolShort field
     */
    public SymbolShortField symbolShort() {
        return symbolShort;
    }

    /**
     * Clearing Symbol
     *
     * @return the ClearingSymbol field
     */
    public ClearingSymbolField clearingSymbol() {
        return clearingSymbol;
    }

    /**
     * Clearing Price
     *
     * @return the ClearingPrice field
     */
    public ClearingPriceField clearingPrice() {
        return clearingPrice;
    }

    /**
     * Clearing Size
     *
     * @return the ClearingSize field
     */
    public ClearingSizeField clearingSize() {
        return clearingSize;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
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
        return Optional.ofNullable(transactionTime.value());
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
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!quoteUpdateId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteUpdateIdField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!symbolShort.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolShortField.BYTE_LENGTH;
        if (!clearingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingSymbolField.BYTE_LENGTH;
        if (!clearingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingPriceField.BYTE_LENGTH;
        if (!clearingSize.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingSizeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = quoteUpdateId.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = symbolShort.encode(data, cursor);
        cursor = clearingSymbol.encode(data, cursor);
        cursor = clearingPrice.encode(data, cursor);
        cursor = clearingSize.encode(data, cursor);
        if (buffer != null && buffer.length >= 74) {
            System.arraycopy(buffer, 58, data, cursor, 16); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 16, (byte) 0); // padding
        }
        cursor += 16;
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
            case "TransactionTime" -> Optional.of(transactionTime);
            case "QuoteUpdateId" -> Optional.of(quoteUpdateId);
            case "ExecId" -> Optional.of(execId);
            case "SymbolShort" -> Optional.of(symbolShort);
            case "ClearingSymbol" -> Optional.of(clearingSymbol);
            case "ClearingPrice" -> Optional.of(clearingPrice);
            case "ClearingSize" -> Optional.of(clearingSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof VarianceQuoteRestatementMessage message)) {
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
        if (!(other instanceof VarianceQuoteRestatementMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
