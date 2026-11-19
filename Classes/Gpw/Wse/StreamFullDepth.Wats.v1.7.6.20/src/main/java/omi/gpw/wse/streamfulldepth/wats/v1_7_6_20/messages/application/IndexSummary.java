package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.ClosingCapitalisationPortfolioField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.ClosingIndexValueField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.IndIndexOpeningPortfolioField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.InstrumentIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.OpeningIndexValueField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.PctChangeIndexValPrevSessionField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.PctChangeIndexValPrevYearField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.PresenceFlagsIndexSummaryPresenceFlagsField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.SessionAvgField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.SessionHighField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.SessionLowField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the IndexSummary message from the StreamFullDepth protocol.
 *
 * <p>The index summary message provides a summary of the data calculated in a stock index for a given day</p>
 */
public final class IndexSummary implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 77;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Index Summary";

    /**
     * ID of financial instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Opening index value
     */
    private final OpeningIndexValueField openingIndexValue = new OpeningIndexValueField();

    /**
     * Lowest value of the day
     */
    private final SessionLowField sessionLow = new SessionLowField();

    /**
     * Highest value of the day
     */
    private final SessionHighField sessionHigh = new SessionHighField();

    /**
     * Closing index value
     */
    private final ClosingIndexValueField closingIndexValue = new ClosingIndexValueField();

    /**
     * Indicates presence of values within IndexSummary fields
     */
    private final PresenceFlagsIndexSummaryPresenceFlagsField presenceFlagsIndexSummaryPresenceFlags = new PresenceFlagsIndexSummaryPresenceFlagsField();

    /**
     * Average value of the day
     */
    private final SessionAvgField sessionAvg = new SessionAvgField();

    /**
     * Percentage change of the index value in relation to the value of the closing index from the previous session
     */
    private final PctChangeIndexValPrevSessionField pctChangeIndexValPrevSession = new PctChangeIndexValPrevSessionField();

    /**
     * Percentage change of the index value in relation to its value at the end of the previous year
     */
    private final PctChangeIndexValPrevYearField pctChangeIndexValPrevYear = new PctChangeIndexValPrevYearField();

    /**
     * Capitalisation of the portfolio for the closing index expressed in the currency of the index, on basis of which the closing index is calculated
     */
    private final ClosingCapitalisationPortfolioField closingCapitalisationPortfolio = new ClosingCapitalisationPortfolioField();

    /**
     * Indicator of the index opening portfolio W(t)
     */
    private final IndIndexOpeningPortfolioField indIndexOpeningPortfolio = new IndIndexOpeningPortfolioField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, openingIndexValue, sessionLow, sessionHigh, closingIndexValue, presenceFlagsIndexSummaryPresenceFlags, sessionAvg, pctChangeIndexValPrevSession, pctChangeIndexValPrevYear, closingCapitalisationPortfolio, indIndexOpeningPortfolio);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID of financial instrument
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Opening index value
     *
     * @return the OpeningIndexValue field
     */
    public OpeningIndexValueField openingIndexValue() {
        return openingIndexValue;
    }

    /**
     * Lowest value of the day
     *
     * @return the SessionLow field
     */
    public SessionLowField sessionLow() {
        return sessionLow;
    }

    /**
     * Highest value of the day
     *
     * @return the SessionHigh field
     */
    public SessionHighField sessionHigh() {
        return sessionHigh;
    }

    /**
     * Closing index value
     *
     * @return the ClosingIndexValue field
     */
    public ClosingIndexValueField closingIndexValue() {
        return closingIndexValue;
    }

    /**
     * Indicates presence of values within IndexSummary fields
     *
     * @return the PresenceFlagsIndexSummaryPresenceFlags field
     */
    public PresenceFlagsIndexSummaryPresenceFlagsField presenceFlagsIndexSummaryPresenceFlags() {
        return presenceFlagsIndexSummaryPresenceFlags;
    }

    /**
     * Average value of the day
     *
     * @return the SessionAvg field
     */
    public SessionAvgField sessionAvg() {
        return sessionAvg;
    }

    /**
     * Percentage change of the index value in relation to the value of the closing index from the previous session
     *
     * @return the PctChangeIndexValPrevSession field
     */
    public PctChangeIndexValPrevSessionField pctChangeIndexValPrevSession() {
        return pctChangeIndexValPrevSession;
    }

    /**
     * Percentage change of the index value in relation to its value at the end of the previous year
     *
     * @return the PctChangeIndexValPrevYear field
     */
    public PctChangeIndexValPrevYearField pctChangeIndexValPrevYear() {
        return pctChangeIndexValPrevYear;
    }

    /**
     * Capitalisation of the portfolio for the closing index expressed in the currency of the index, on basis of which the closing index is calculated
     *
     * @return the ClosingCapitalisationPortfolio field
     */
    public ClosingCapitalisationPortfolioField closingCapitalisationPortfolio() {
        return closingCapitalisationPortfolio;
    }

    /**
     * Indicator of the index opening portfolio W(t)
     *
     * @return the IndIndexOpeningPortfolio field
     */
    public IndIndexOpeningPortfolioField indIndexOpeningPortfolio() {
        return indIndexOpeningPortfolio;
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
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!openingIndexValue.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningIndexValueField.BYTE_LENGTH;
        if (!sessionLow.parse(data, cursor)) {
            return false;
        }
        cursor += SessionLowField.BYTE_LENGTH;
        if (!sessionHigh.parse(data, cursor)) {
            return false;
        }
        cursor += SessionHighField.BYTE_LENGTH;
        if (!closingIndexValue.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingIndexValueField.BYTE_LENGTH;
        if (!presenceFlagsIndexSummaryPresenceFlags.parse(data, cursor)) {
            return false;
        }
        cursor += PresenceFlagsIndexSummaryPresenceFlagsField.BYTE_LENGTH;
        if (!sessionAvg.parse(data, cursor)) {
            return false;
        }
        cursor += SessionAvgField.BYTE_LENGTH;
        if (!pctChangeIndexValPrevSession.parse(data, cursor)) {
            return false;
        }
        cursor += PctChangeIndexValPrevSessionField.BYTE_LENGTH;
        if (!pctChangeIndexValPrevYear.parse(data, cursor)) {
            return false;
        }
        cursor += PctChangeIndexValPrevYearField.BYTE_LENGTH;
        if (!closingCapitalisationPortfolio.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingCapitalisationPortfolioField.BYTE_LENGTH;
        return indIndexOpeningPortfolio.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = openingIndexValue.encode(data, cursor);
        cursor = sessionLow.encode(data, cursor);
        cursor = sessionHigh.encode(data, cursor);
        cursor = closingIndexValue.encode(data, cursor);
        cursor = presenceFlagsIndexSummaryPresenceFlags.encode(data, cursor);
        cursor = sessionAvg.encode(data, cursor);
        cursor = pctChangeIndexValPrevSession.encode(data, cursor);
        cursor = pctChangeIndexValPrevYear.encode(data, cursor);
        cursor = closingCapitalisationPortfolio.encode(data, cursor);
        cursor = indIndexOpeningPortfolio.encode(data, cursor);
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "OpeningIndexValue" -> Optional.of(openingIndexValue);
            case "SessionLow" -> Optional.of(sessionLow);
            case "SessionHigh" -> Optional.of(sessionHigh);
            case "ClosingIndexValue" -> Optional.of(closingIndexValue);
            case "PresenceFlagsIndexSummaryPresenceFlags" -> Optional.of(presenceFlagsIndexSummaryPresenceFlags);
            case "SessionAvg" -> Optional.of(sessionAvg);
            case "PctChangeIndexValPrevSession" -> Optional.of(pctChangeIndexValPrevSession);
            case "PctChangeIndexValPrevYear" -> Optional.of(pctChangeIndexValPrevYear);
            case "ClosingCapitalisationPortfolio" -> Optional.of(closingCapitalisationPortfolio);
            case "IndIndexOpeningPortfolio" -> Optional.of(indIndexOpeningPortfolio);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IndexSummary message)) {
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
        if (!(other instanceof IndexSummary message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
