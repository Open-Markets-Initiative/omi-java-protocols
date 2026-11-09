package omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.CustSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.MarketSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.NttMarketSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.NttSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.PriceField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.ProCustSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.QuoteConditionField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.SizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.StrategyIdField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.TimestampField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.types.Field;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.types.Message;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.types.PrintOptions;

/**
 * Represents the StrategyBestAskUpdate message from the TopComboQuoteFeed protocol.
 *
 * <p>The options system will continuously calculate its best offer position for active strategies on the options market during the trading day. Whenever the best ask position changes on one side but not the other side, the options system will send its best ask update via this feed for the affected security</p>
 */
public final class StrategyBestAskUpdate implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'E';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Strategy Best Ask Update";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * ISE’s Strategy ID assigned daily, valid while there are any open complex orders for the day
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * &lt;space&gt; = regular quote/autox eligible “X” = Pre-Open/Halted
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * Best bid or ask price in fixed point format with 6 whole number places followed by 4 decimal digits, the side determined by Message Type.
     */
    private final PriceField price = new PriceField();

    /**
     * Aggregated number of contracts on the bid or ask side being displayed in the options market at the current time.
     */
    private final SizeField size = new SizeField();

    /**
     * Customer Quantity on the bid or ask side.
     */
    private final CustSizeField custSize = new CustSizeField();

    /**
     * Customer professional quantity on the bid or ask side.
     */
    private final ProCustSizeField proCustSize = new ProCustSizeField();

    /**
     * Limit size that can’t be traded through
     */
    private final NttSizeField nttSize = new NttSizeField();

    /**
     * The aggregate market size.
     */
    private final MarketSizeField marketSize = new MarketSizeField();

    /**
     * The aggregated NTT Market Size.
     */
    private final NttMarketSizeField nttMarketSize = new NttMarketSizeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, strategyId, quoteCondition, price, size, custSize, proCustSize, nttSize, marketSize, nttMarketSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * ISE’s Strategy ID assigned daily, valid while there are any open complex orders for the day
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * &lt;space&gt; = regular quote/autox eligible “X” = Pre-Open/Halted
     *
     * @return the QuoteCondition field
     */
    public QuoteConditionField quoteCondition() {
        return quoteCondition;
    }

    /**
     * Best bid or ask price in fixed point format with 6 whole number places followed by 4 decimal digits, the side determined by Message Type.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Aggregated number of contracts on the bid or ask side being displayed in the options market at the current time.
     *
     * @return the Size field
     */
    public SizeField size() {
        return size;
    }

    /**
     * Customer Quantity on the bid or ask side.
     *
     * @return the CustSize field
     */
    public CustSizeField custSize() {
        return custSize;
    }

    /**
     * Customer professional quantity on the bid or ask side.
     *
     * @return the ProCustSize field
     */
    public ProCustSizeField proCustSize() {
        return proCustSize;
    }

    /**
     * Limit size that can’t be traded through
     *
     * @return the NttSize field
     */
    public NttSizeField nttSize() {
        return nttSize;
    }

    /**
     * The aggregate market size.
     *
     * @return the MarketSize field
     */
    public MarketSizeField marketSize() {
        return marketSize;
    }

    /**
     * The aggregated NTT Market Size.
     *
     * @return the NttMarketSize field
     */
    public NttMarketSizeField nttMarketSize() {
        return nttMarketSize;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!quoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteConditionField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!size.parse(data, cursor)) {
            return false;
        }
        cursor += SizeField.BYTE_LENGTH;
        if (!custSize.parse(data, cursor)) {
            return false;
        }
        cursor += CustSizeField.BYTE_LENGTH;
        if (!proCustSize.parse(data, cursor)) {
            return false;
        }
        cursor += ProCustSizeField.BYTE_LENGTH;
        if (!nttSize.parse(data, cursor)) {
            return false;
        }
        cursor += NttSizeField.BYTE_LENGTH;
        if (!marketSize.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSizeField.BYTE_LENGTH;
        if (!nttMarketSize.parse(data, cursor)) {
            return false;
        }
        cursor += NttMarketSizeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = size.encode(data, cursor);
        cursor = custSize.encode(data, cursor);
        cursor = proCustSize.encode(data, cursor);
        cursor = nttSize.encode(data, cursor);
        cursor = marketSize.encode(data, cursor);
        cursor = nttMarketSize.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "StrategyId" -> Optional.of(strategyId);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "Price" -> Optional.of(price);
            case "Size" -> Optional.of(size);
            case "CustSize" -> Optional.of(custSize);
            case "ProCustSize" -> Optional.of(proCustSize);
            case "NttSize" -> Optional.of(nttSize);
            case "MarketSize" -> Optional.of(marketSize);
            case "NttMarketSize" -> Optional.of(nttMarketSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StrategyBestAskUpdate message)) {
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
        if (!(other instanceof StrategyBestAskUpdate message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
