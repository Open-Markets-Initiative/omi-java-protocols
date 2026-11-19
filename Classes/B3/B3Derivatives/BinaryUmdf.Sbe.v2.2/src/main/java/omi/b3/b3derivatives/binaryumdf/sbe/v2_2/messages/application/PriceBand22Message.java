package omi.b3.b3derivatives.binaryumdf.sbe.v2_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.b3.b3derivatives.binaryumdf.sbe.v2_2.fields.HighLimitPriceField;
import omi.b3.b3derivatives.binaryumdf.sbe.v2_2.fields.LowLimitPriceField;
import omi.b3.b3derivatives.binaryumdf.sbe.v2_2.fields.MatchEventIndicatorField;
import omi.b3.b3derivatives.binaryumdf.sbe.v2_2.fields.MdEntryTimestampField;
import omi.b3.b3derivatives.binaryumdf.sbe.v2_2.fields.PriceBandMidpointPriceTypeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v2_2.fields.PriceBandTypeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v2_2.fields.PriceLimitTypeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v2_2.fields.RptSeqField;
import omi.b3.b3derivatives.binaryumdf.sbe.v2_2.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryumdf.sbe.v2_2.fields.TradingReferencePriceField;
import omi.b3.b3derivatives.binaryumdf.sbe.v2_2.types.Field;
import omi.b3.b3derivatives.binaryumdf.sbe.v2_2.types.Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v2_2.types.PrintOptions;

/**
 * Represents the PriceBand22Message message from the BinaryUmdf protocol.
 *
 * <p>PriceBand_22Message</p>
 */
public final class PriceBand22Message implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 48;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Price Band 22 Message";

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * MatchEventIndicator bit set
     */
    private final MatchEventIndicatorField matchEventIndicator = new MatchEventIndicatorField();

    /**
     * priceBandType
     */
    private final PriceBandTypeField priceBandType = new PriceBandTypeField();

    /**
     * priceLimitType
     */
    private final PriceLimitTypeField priceLimitType = new PriceLimitTypeField();

    /**
     * priceBandMidpointPriceType
     */
    private final PriceBandMidpointPriceTypeField priceBandMidpointPriceType = new PriceBandMidpointPriceTypeField();

    /**
     * lowLimitPrice
     */
    private final LowLimitPriceField lowLimitPrice = new LowLimitPriceField();

    /**
     * highLimitPrice
     */
    private final HighLimitPriceField highLimitPrice = new HighLimitPriceField();

    /**
     * tradingReferencePrice
     */
    private final TradingReferencePriceField tradingReferencePrice = new TradingReferencePriceField();

    /**
     * mDEntryTimestamp
     */
    private final MdEntryTimestampField mdEntryTimestamp = new MdEntryTimestampField();

    /**
     * rptSeq
     */
    private final RptSeqField rptSeq = new RptSeqField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, matchEventIndicator, priceBandType, priceLimitType, priceBandMidpointPriceType, lowLimitPrice, highLimitPrice, tradingReferencePrice, mdEntryTimestamp, rptSeq);

    private byte[] buffer;

    private boolean decoded;

    /**
     * securityID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * MatchEventIndicator bit set
     *
     * @return the MatchEventIndicator field
     */
    public MatchEventIndicatorField matchEventIndicator() {
        return matchEventIndicator;
    }

    /**
     * priceBandType
     *
     * @return the PriceBandType field
     */
    public PriceBandTypeField priceBandType() {
        return priceBandType;
    }

    /**
     * priceLimitType
     *
     * @return the PriceLimitType field
     */
    public PriceLimitTypeField priceLimitType() {
        return priceLimitType;
    }

    /**
     * priceBandMidpointPriceType
     *
     * @return the PriceBandMidpointPriceType field
     */
    public PriceBandMidpointPriceTypeField priceBandMidpointPriceType() {
        return priceBandMidpointPriceType;
    }

    /**
     * lowLimitPrice
     *
     * @return the LowLimitPrice field
     */
    public LowLimitPriceField lowLimitPrice() {
        return lowLimitPrice;
    }

    /**
     * highLimitPrice
     *
     * @return the HighLimitPrice field
     */
    public HighLimitPriceField highLimitPrice() {
        return highLimitPrice;
    }

    /**
     * tradingReferencePrice
     *
     * @return the TradingReferencePrice field
     */
    public TradingReferencePriceField tradingReferencePrice() {
        return tradingReferencePrice;
    }

    /**
     * mDEntryTimestamp
     *
     * @return the MdEntryTimestamp field
     */
    public MdEntryTimestampField mdEntryTimestamp() {
        return mdEntryTimestamp;
    }

    /**
     * rptSeq
     *
     * @return the RptSeq field
     */
    public RptSeqField rptSeq() {
        return rptSeq;
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
        return Optional.ofNullable(mdEntryTimestamp.value());
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!matchEventIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MatchEventIndicatorField.BYTE_LENGTH;
        if (!priceBandType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceBandTypeField.BYTE_LENGTH;
        if (!priceLimitType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceLimitTypeField.BYTE_LENGTH;
        if (!priceBandMidpointPriceType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceBandMidpointPriceTypeField.BYTE_LENGTH;
        if (!lowLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowLimitPriceField.BYTE_LENGTH;
        if (!highLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighLimitPriceField.BYTE_LENGTH;
        if (!tradingReferencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradingReferencePriceField.BYTE_LENGTH;
        if (!mdEntryTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += MdEntryTimestampField.BYTE_LENGTH;
        return rptSeq.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = matchEventIndicator.encode(data, cursor);
        cursor = priceBandType.encode(data, cursor);
        cursor = priceLimitType.encode(data, cursor);
        cursor = priceBandMidpointPriceType.encode(data, cursor);
        cursor = lowLimitPrice.encode(data, cursor);
        cursor = highLimitPrice.encode(data, cursor);
        cursor = tradingReferencePrice.encode(data, cursor);
        cursor = mdEntryTimestamp.encode(data, cursor);
        cursor = rptSeq.encode(data, cursor);
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
            case "SecurityId" -> Optional.of(securityId);
            case "MatchEventIndicator" -> Optional.of(matchEventIndicator);
            case "PriceBandType" -> Optional.of(priceBandType);
            case "PriceLimitType" -> Optional.of(priceLimitType);
            case "PriceBandMidpointPriceType" -> Optional.of(priceBandMidpointPriceType);
            case "LowLimitPrice" -> Optional.of(lowLimitPrice);
            case "HighLimitPrice" -> Optional.of(highLimitPrice);
            case "TradingReferencePrice" -> Optional.of(tradingReferencePrice);
            case "MdEntryTimestamp" -> Optional.of(mdEntryTimestamp);
            case "RptSeq" -> Optional.of(rptSeq);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PriceBand22Message message)) {
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
        if (!(other instanceof PriceBand22Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
