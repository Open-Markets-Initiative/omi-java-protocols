package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.DifferenceCentralSpreadField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.IndIndexOpeningPortfolioField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.IndexLevelCodeField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.IndexValueAskField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.IndexValueBidField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.IndexValueField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.InstrumentIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MidSpreadIndexField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.NumOfActiveInstrumentsField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.PctChangeIndexValPrevSessionField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.PresenceFlagsRealTimeIndexPresenceFlagsField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.SessionHighField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.SessionLowField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TradingValueField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the RealTimeIndex message from the StreamFullDepth protocol.
 *
 * <p>Message providing real-time index values for instruments</p>
 */
public final class RealTimeIndex implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 88;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Real Time Index";

    /**
     * ID of financial instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Level of the index
     */
    private final IndexLevelCodeField indexLevelCode = new IndexLevelCodeField();

    /**
     * Number of instruments – participants of the index, for which the quotation was set during the session
     */
    private final NumOfActiveInstrumentsField numOfActiveInstruments = new NumOfActiveInstrumentsField();

    /**
     * Indicator of the index opening portfolio W(t)
     */
    private final IndIndexOpeningPortfolioField indIndexOpeningPortfolio = new IndIndexOpeningPortfolioField();

    /**
     * The value of the last level for the index according to the definition provided in the indexLevelCode
     */
    private final IndexValueField indexValue = new IndexValueField();

    /**
     * Percentage change of the index value in relation to the value of the closing index from the previous session
     */
    private final PctChangeIndexValPrevSessionField pctChangeIndexValPrevSession = new PctChangeIndexValPrevSessionField();

    /**
     * Lowest value of the day
     */
    private final SessionLowField sessionLow = new SessionLowField();

    /**
     * Highest value of the day
     */
    private final SessionHighField sessionHigh = new SessionHighField();

    /**
     * Indicates presence of values within RealTimeIndex fields
     */
    private final PresenceFlagsRealTimeIndexPresenceFlagsField presenceFlagsRealTimeIndexPresenceFlags = new PresenceFlagsRealTimeIndexPresenceFlagsField();

    /**
     * Value of trading in the instruments from the given index
     */
    private final TradingValueField tradingValue = new TradingValueField();

    /**
     * Value of the buy index based on the best sell offers of instruments
     */
    private final IndexValueBidField indexValueBid = new IndexValueBidField();

    /**
     * Value of the sell index based on the best sell offers of instruments
     */
    private final IndexValueAskField indexValueAsk = new IndexValueAskField();

    /**
     * Mean of indexValueBid and indexValueAsk
     */
    private final MidSpreadIndexField midSpreadIndex = new MidSpreadIndexField();

    /**
     * The point difference between midSpreadIndex and indexValue
     */
    private final DifferenceCentralSpreadField differenceCentralSpread = new DifferenceCentralSpreadField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, indexLevelCode, numOfActiveInstruments, indIndexOpeningPortfolio, indexValue, pctChangeIndexValPrevSession, sessionLow, sessionHigh, presenceFlagsRealTimeIndexPresenceFlags, tradingValue, indexValueBid, indexValueAsk, midSpreadIndex, differenceCentralSpread);

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
     * Level of the index
     *
     * @return the IndexLevelCode field
     */
    public IndexLevelCodeField indexLevelCode() {
        return indexLevelCode;
    }

    /**
     * Number of instruments – participants of the index, for which the quotation was set during the session
     *
     * @return the NumOfActiveInstruments field
     */
    public NumOfActiveInstrumentsField numOfActiveInstruments() {
        return numOfActiveInstruments;
    }

    /**
     * Indicator of the index opening portfolio W(t)
     *
     * @return the IndIndexOpeningPortfolio field
     */
    public IndIndexOpeningPortfolioField indIndexOpeningPortfolio() {
        return indIndexOpeningPortfolio;
    }

    /**
     * The value of the last level for the index according to the definition provided in the indexLevelCode
     *
     * @return the IndexValue field
     */
    public IndexValueField indexValue() {
        return indexValue;
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
     * Indicates presence of values within RealTimeIndex fields
     *
     * @return the PresenceFlagsRealTimeIndexPresenceFlags field
     */
    public PresenceFlagsRealTimeIndexPresenceFlagsField presenceFlagsRealTimeIndexPresenceFlags() {
        return presenceFlagsRealTimeIndexPresenceFlags;
    }

    /**
     * Value of trading in the instruments from the given index
     *
     * @return the TradingValue field
     */
    public TradingValueField tradingValue() {
        return tradingValue;
    }

    /**
     * Value of the buy index based on the best sell offers of instruments
     *
     * @return the IndexValueBid field
     */
    public IndexValueBidField indexValueBid() {
        return indexValueBid;
    }

    /**
     * Value of the sell index based on the best sell offers of instruments
     *
     * @return the IndexValueAsk field
     */
    public IndexValueAskField indexValueAsk() {
        return indexValueAsk;
    }

    /**
     * Mean of indexValueBid and indexValueAsk
     *
     * @return the MidSpreadIndex field
     */
    public MidSpreadIndexField midSpreadIndex() {
        return midSpreadIndex;
    }

    /**
     * The point difference between midSpreadIndex and indexValue
     *
     * @return the DifferenceCentralSpread field
     */
    public DifferenceCentralSpreadField differenceCentralSpread() {
        return differenceCentralSpread;
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
        if (!indexLevelCode.parse(data, cursor)) {
            return false;
        }
        cursor += IndexLevelCodeField.BYTE_LENGTH;
        if (!numOfActiveInstruments.parse(data, cursor)) {
            return false;
        }
        cursor += NumOfActiveInstrumentsField.BYTE_LENGTH;
        if (!indIndexOpeningPortfolio.parse(data, cursor)) {
            return false;
        }
        cursor += IndIndexOpeningPortfolioField.BYTE_LENGTH;
        if (!indexValue.parse(data, cursor)) {
            return false;
        }
        cursor += IndexValueField.BYTE_LENGTH;
        if (!pctChangeIndexValPrevSession.parse(data, cursor)) {
            return false;
        }
        cursor += PctChangeIndexValPrevSessionField.BYTE_LENGTH;
        if (!sessionLow.parse(data, cursor)) {
            return false;
        }
        cursor += SessionLowField.BYTE_LENGTH;
        if (!sessionHigh.parse(data, cursor)) {
            return false;
        }
        cursor += SessionHighField.BYTE_LENGTH;
        if (!presenceFlagsRealTimeIndexPresenceFlags.parse(data, cursor)) {
            return false;
        }
        cursor += PresenceFlagsRealTimeIndexPresenceFlagsField.BYTE_LENGTH;
        if (!tradingValue.parse(data, cursor)) {
            return false;
        }
        cursor += TradingValueField.BYTE_LENGTH;
        if (!indexValueBid.parse(data, cursor)) {
            return false;
        }
        cursor += IndexValueBidField.BYTE_LENGTH;
        if (!indexValueAsk.parse(data, cursor)) {
            return false;
        }
        cursor += IndexValueAskField.BYTE_LENGTH;
        if (!midSpreadIndex.parse(data, cursor)) {
            return false;
        }
        cursor += MidSpreadIndexField.BYTE_LENGTH;
        return differenceCentralSpread.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = indexLevelCode.encode(data, cursor);
        cursor = numOfActiveInstruments.encode(data, cursor);
        cursor = indIndexOpeningPortfolio.encode(data, cursor);
        cursor = indexValue.encode(data, cursor);
        cursor = pctChangeIndexValPrevSession.encode(data, cursor);
        cursor = sessionLow.encode(data, cursor);
        cursor = sessionHigh.encode(data, cursor);
        cursor = presenceFlagsRealTimeIndexPresenceFlags.encode(data, cursor);
        cursor = tradingValue.encode(data, cursor);
        cursor = indexValueBid.encode(data, cursor);
        cursor = indexValueAsk.encode(data, cursor);
        cursor = midSpreadIndex.encode(data, cursor);
        cursor = differenceCentralSpread.encode(data, cursor);
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
            case "IndexLevelCode" -> Optional.of(indexLevelCode);
            case "NumOfActiveInstruments" -> Optional.of(numOfActiveInstruments);
            case "IndIndexOpeningPortfolio" -> Optional.of(indIndexOpeningPortfolio);
            case "IndexValue" -> Optional.of(indexValue);
            case "PctChangeIndexValPrevSession" -> Optional.of(pctChangeIndexValPrevSession);
            case "SessionLow" -> Optional.of(sessionLow);
            case "SessionHigh" -> Optional.of(sessionHigh);
            case "PresenceFlagsRealTimeIndexPresenceFlags" -> Optional.of(presenceFlagsRealTimeIndexPresenceFlags);
            case "TradingValue" -> Optional.of(tradingValue);
            case "IndexValueBid" -> Optional.of(indexValueBid);
            case "IndexValueAsk" -> Optional.of(indexValueAsk);
            case "MidSpreadIndex" -> Optional.of(midSpreadIndex);
            case "DifferenceCentralSpread" -> Optional.of(differenceCentralSpread);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RealTimeIndex message)) {
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
        if (!(other instanceof RealTimeIndex message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
