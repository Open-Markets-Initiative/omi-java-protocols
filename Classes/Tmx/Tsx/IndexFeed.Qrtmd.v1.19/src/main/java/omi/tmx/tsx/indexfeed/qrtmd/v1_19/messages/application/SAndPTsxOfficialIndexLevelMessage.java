package omi.tmx.tsx.indexfeed.qrtmd.v1_19.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.AskPriceField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.BidPriceField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.HighLevelField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.IndexIdField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.LastLevelField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.LowLevelField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.MarkersField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.NetChangeField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.OpenLevelField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.PeField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.PercentTradingField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.SettlementValueField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.SpecialOpeningQuoteField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.TimeField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.ValueField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.VolumeField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.fields.YieldField;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.types.Field;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.types.Message;
import omi.tmx.tsx.indexfeed.qrtmd.v1_19.types.PrintOptions;

/**
 * Represents the SAndPTsxOfficialIndexLevelMessage message from the IndexFeed protocol.
 *
 * <p>Level of an index as of the time of the calculation.</p>
 */
public final class SAndPTsxOfficialIndexLevelMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 122;

    /**
     * This message's declared name.
     */
    public static final String NAME = "S And P Tsx Official Index Level Message";

    /**
     * Time of the index level calculation.
     */
    private final TimeField time = new TimeField();

    /**
     * Identifies the index.
     */
    private final IndexIdField indexId = new IndexIdField();

    /**
     * The level of the index as of the time of the calculation.
     */
    private final LastLevelField lastLevel = new LastLevelField();

    /**
     * Net change from previous index level close.
     */
    private final NetChangeField netChange = new NetChangeField();

    /**
     * Total number of shares traded for the index.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Total dollar of shares traded for the index.
     */
    private final ValueField value = new ValueField();

    /**
     * Level of the index at the first calculation of the day.
     */
    private final OpenLevelField openLevel = new OpenLevelField();

    /**
     * Settlement open.
     */
    private final SettlementValueField settlementValue = new SettlementValueField();

    /**
     * Adjusted index open value.
     */
    private final SpecialOpeningQuoteField specialOpeningQuote = new SpecialOpeningQuoteField();

    /**
     * Percentage of the index constituents that are open.
     */
    private final PercentTradingField percentTrading = new PercentTradingField();

    /**
     * Highest level of the index for the day.
     */
    private final HighLevelField highLevel = new HighLevelField();

    /**
     * Lowest level of the index for the day.
     */
    private final LowLevelField lowLevel = new LowLevelField();

    /**
     * Price/Earnings ratio for the index.
     */
    private final PeField pe = new PeField();

    /**
     * Dividend Yield for the index, expressed as a percentage.
     */
    private final YieldField yield = new YieldField();

    /**
     * Marks the message carrying the closing values.
     */
    private final MarkersField markers = new MarkersField();

    /**
     * Value for the Index based on the latest bid price of the stocks comprising the Index.
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * Value for the Index based on the latest ask price of the stocks comprising the Index.
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(time, indexId, lastLevel, netChange, volume, value, openLevel, settlementValue, specialOpeningQuote, percentTrading, highLevel, lowLevel, pe, yield, markers, bidPrice, askPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time of the index level calculation.
     *
     * @return the Time field
     */
    public TimeField time() {
        return time;
    }

    /**
     * Identifies the index.
     *
     * @return the IndexId field
     */
    public IndexIdField indexId() {
        return indexId;
    }

    /**
     * The level of the index as of the time of the calculation.
     *
     * @return the LastLevel field
     */
    public LastLevelField lastLevel() {
        return lastLevel;
    }

    /**
     * Net change from previous index level close.
     *
     * @return the NetChange field
     */
    public NetChangeField netChange() {
        return netChange;
    }

    /**
     * Total number of shares traded for the index.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Total dollar of shares traded for the index.
     *
     * @return the Value field
     */
    public ValueField value() {
        return value;
    }

    /**
     * Level of the index at the first calculation of the day.
     *
     * @return the OpenLevel field
     */
    public OpenLevelField openLevel() {
        return openLevel;
    }

    /**
     * Settlement open.
     *
     * @return the SettlementValue field
     */
    public SettlementValueField settlementValue() {
        return settlementValue;
    }

    /**
     * Adjusted index open value.
     *
     * @return the SpecialOpeningQuote field
     */
    public SpecialOpeningQuoteField specialOpeningQuote() {
        return specialOpeningQuote;
    }

    /**
     * Percentage of the index constituents that are open.
     *
     * @return the PercentTrading field
     */
    public PercentTradingField percentTrading() {
        return percentTrading;
    }

    /**
     * Highest level of the index for the day.
     *
     * @return the HighLevel field
     */
    public HighLevelField highLevel() {
        return highLevel;
    }

    /**
     * Lowest level of the index for the day.
     *
     * @return the LowLevel field
     */
    public LowLevelField lowLevel() {
        return lowLevel;
    }

    /**
     * Price/Earnings ratio for the index.
     *
     * @return the Pe field
     */
    public PeField pe() {
        return pe;
    }

    /**
     * Dividend Yield for the index, expressed as a percentage.
     *
     * @return the Yield field
     */
    public YieldField yield() {
        return yield;
    }

    /**
     * Marks the message carrying the closing values.
     *
     * @return the Markers field
     */
    public MarkersField markers() {
        return markers;
    }

    /**
     * Value for the Index based on the latest bid price of the stocks comprising the Index.
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * Value for the Index based on the latest ask price of the stocks comprising the Index.
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
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
        if (!time.parse(data, cursor)) {
            return false;
        }
        cursor += TimeField.BYTE_LENGTH;
        if (!indexId.parse(data, cursor)) {
            return false;
        }
        cursor += IndexIdField.BYTE_LENGTH;
        if (!lastLevel.parse(data, cursor)) {
            return false;
        }
        cursor += LastLevelField.BYTE_LENGTH;
        if (!netChange.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!value.parse(data, cursor)) {
            return false;
        }
        cursor += ValueField.BYTE_LENGTH;
        if (!openLevel.parse(data, cursor)) {
            return false;
        }
        cursor += OpenLevelField.BYTE_LENGTH;
        if (!settlementValue.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementValueField.BYTE_LENGTH;
        if (!specialOpeningQuote.parse(data, cursor)) {
            return false;
        }
        cursor += SpecialOpeningQuoteField.BYTE_LENGTH;
        if (!percentTrading.parse(data, cursor)) {
            return false;
        }
        cursor += PercentTradingField.BYTE_LENGTH;
        if (!highLevel.parse(data, cursor)) {
            return false;
        }
        cursor += HighLevelField.BYTE_LENGTH;
        if (!lowLevel.parse(data, cursor)) {
            return false;
        }
        cursor += LowLevelField.BYTE_LENGTH;
        if (!pe.parse(data, cursor)) {
            return false;
        }
        cursor += PeField.BYTE_LENGTH;
        if (!yield.parse(data, cursor)) {
            return false;
        }
        cursor += YieldField.BYTE_LENGTH;
        if (!markers.parse(data, cursor)) {
            return false;
        }
        cursor += MarkersField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        return askPrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = time.encode(data, cursor);
        cursor = indexId.encode(data, cursor);
        cursor = lastLevel.encode(data, cursor);
        cursor = netChange.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = value.encode(data, cursor);
        cursor = openLevel.encode(data, cursor);
        cursor = settlementValue.encode(data, cursor);
        cursor = specialOpeningQuote.encode(data, cursor);
        cursor = percentTrading.encode(data, cursor);
        cursor = highLevel.encode(data, cursor);
        cursor = lowLevel.encode(data, cursor);
        cursor = pe.encode(data, cursor);
        cursor = yield.encode(data, cursor);
        cursor = markers.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
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
            case "Time" -> Optional.of(time);
            case "IndexId" -> Optional.of(indexId);
            case "LastLevel" -> Optional.of(lastLevel);
            case "NetChange" -> Optional.of(netChange);
            case "Volume" -> Optional.of(volume);
            case "Value" -> Optional.of(value);
            case "OpenLevel" -> Optional.of(openLevel);
            case "SettlementValue" -> Optional.of(settlementValue);
            case "SpecialOpeningQuote" -> Optional.of(specialOpeningQuote);
            case "PercentTrading" -> Optional.of(percentTrading);
            case "HighLevel" -> Optional.of(highLevel);
            case "LowLevel" -> Optional.of(lowLevel);
            case "Pe" -> Optional.of(pe);
            case "Yield" -> Optional.of(yield);
            case "Markers" -> Optional.of(markers);
            case "BidPrice" -> Optional.of(bidPrice);
            case "AskPrice" -> Optional.of(askPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SAndPTsxOfficialIndexLevelMessage message)) {
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
        if (!(other instanceof SAndPTsxOfficialIndexLevelMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
