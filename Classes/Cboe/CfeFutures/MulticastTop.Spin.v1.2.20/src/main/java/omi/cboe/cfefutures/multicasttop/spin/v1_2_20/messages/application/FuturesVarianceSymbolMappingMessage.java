package omi.cboe.cfefutures.multicasttop.spin.v1_2_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_20.fields.AccruedDayVarianceField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_20.fields.FeedSymbolField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_20.fields.FuturesSymbolField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_20.fields.NumElapsedReturnsField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_20.fields.NumFinalReturnsField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_20.fields.TimeOffsetField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_20.fields.UnitTimestampField;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_20.types.Field;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_20.types.Message;
import omi.cboe.cfefutures.multicasttop.spin.v1_2_20.types.PrintOptions;

/**
 * Represents the FuturesVarianceSymbolMappingMessage message from the MulticastTop protocol.
 *
 * <p>The Futures Variance Symbol Mapping message is used to disseminate symbol reference data for S&amp;P 500 Variance Futures (VA Futures) symbols.</p>
 */
public final class FuturesVarianceSymbolMappingMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 38;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Futures Variance Symbol Mapping Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Unit timestamp expressed as number of whole seconds since the Epoch (Midnight, January 1, 1970 UTC).
     */
    private final UnitTimestampField unitTimestamp = new UnitTimestampField();

    /**
     * Six character, base 62 symbol.
     */
    private final FeedSymbolField feedSymbol = new FeedSymbolField();

    /**
     * Twelve character textual definition of the symbol where the first six characters contain the product symbol, left justified, and padded on the right with spaces, and the right most six characters are the expiration date in YYMMDD format.
     */
    private final FuturesSymbolField futuresSymbol = new FuturesSymbolField();

    /**
     * Accrued day variance as of the start of the trading day (signed 64-bit decimal with twelve implied decimal places).
     */
    private final AccruedDayVarianceField accruedDayVariance = new AccruedDayVarianceField();

    /**
     * Number of S&amp;P 500 Index returns used in the Final Settlement Value calculation.
     */
    private final NumFinalReturnsField numFinalReturns = new NumFinalReturnsField();

    /**
     * Number of elapsed S&amp;P 500 Index returns including the current day.
     */
    private final NumElapsedReturnsField numElapsedReturns = new NumElapsedReturnsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, unitTimestamp, feedSymbol, futuresSymbol, accruedDayVariance, numFinalReturns, numElapsedReturns);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Unit timestamp expressed as number of whole seconds since the Epoch (Midnight, January 1, 1970 UTC).
     *
     * @return the UnitTimestamp field
     */
    public UnitTimestampField unitTimestamp() {
        return unitTimestamp;
    }

    /**
     * Six character, base 62 symbol.
     *
     * @return the FeedSymbol field
     */
    public FeedSymbolField feedSymbol() {
        return feedSymbol;
    }

    /**
     * Twelve character textual definition of the symbol where the first six characters contain the product symbol, left justified, and padded on the right with spaces, and the right most six characters are the expiration date in YYMMDD format.
     *
     * @return the FuturesSymbol field
     */
    public FuturesSymbolField futuresSymbol() {
        return futuresSymbol;
    }

    /**
     * Accrued day variance as of the start of the trading day (signed 64-bit decimal with twelve implied decimal places).
     *
     * @return the AccruedDayVariance field
     */
    public AccruedDayVarianceField accruedDayVariance() {
        return accruedDayVariance;
    }

    /**
     * Number of S&amp;P 500 Index returns used in the Final Settlement Value calculation.
     *
     * @return the NumFinalReturns field
     */
    public NumFinalReturnsField numFinalReturns() {
        return numFinalReturns;
    }

    /**
     * Number of elapsed S&amp;P 500 Index returns including the current day.
     *
     * @return the NumElapsedReturns field
     */
    public NumElapsedReturnsField numElapsedReturns() {
        return numElapsedReturns;
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
        return new int[0];
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!unitTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += UnitTimestampField.BYTE_LENGTH;
        if (!feedSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += FeedSymbolField.BYTE_LENGTH;
        if (!futuresSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += FuturesSymbolField.BYTE_LENGTH;
        if (!accruedDayVariance.parse(data, cursor)) {
            return false;
        }
        cursor += AccruedDayVarianceField.BYTE_LENGTH;
        if (!numFinalReturns.parse(data, cursor)) {
            return false;
        }
        cursor += NumFinalReturnsField.BYTE_LENGTH;
        return numElapsedReturns.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = unitTimestamp.encode(data, cursor);
        cursor = feedSymbol.encode(data, cursor);
        cursor = futuresSymbol.encode(data, cursor);
        cursor = accruedDayVariance.encode(data, cursor);
        cursor = numFinalReturns.encode(data, cursor);
        cursor = numElapsedReturns.encode(data, cursor);
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "UnitTimestamp" -> Optional.of(unitTimestamp);
            case "FeedSymbol" -> Optional.of(feedSymbol);
            case "FuturesSymbol" -> Optional.of(futuresSymbol);
            case "AccruedDayVariance" -> Optional.of(accruedDayVariance);
            case "NumFinalReturns" -> Optional.of(numFinalReturns);
            case "NumElapsedReturns" -> Optional.of(numElapsedReturns);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FuturesVarianceSymbolMappingMessage message)) {
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
        if (!(other instanceof FuturesVarianceSymbolMappingMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
