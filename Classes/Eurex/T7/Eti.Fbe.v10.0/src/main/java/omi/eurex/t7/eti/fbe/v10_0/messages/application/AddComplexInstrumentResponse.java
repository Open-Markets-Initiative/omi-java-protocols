package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.HighLimitPriceField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ImpliedMarketIndicatorField;
import omi.eurex.t7.eti.fbe.v10_0.fields.LastUpdateTimeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.LowLimitPriceField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MultilegModelField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoLegsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NumberOfSecuritiesField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ProductComplexField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SecurityResponseIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SecuritySubTypeField;
import omi.eurex.t7.eti.fbe.v10_0.groups.InstrmtLegGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.InstrmtLegGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.NrResponseHeaderMeComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the AddComplexInstrumentResponse message from the Eti protocol.
 */
public final class AddComplexInstrumentResponse implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 106;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Complex Instrument Response";

    /**
     * Low Limit Price
     */
    private final LowLimitPriceField lowLimitPrice = new LowLimitPriceField();

    /**
     * High Limit Price
     */
    private final HighLimitPriceField highLimitPrice = new HighLimitPriceField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Last Update Time
     */
    private final LastUpdateTimeField lastUpdateTime = new LastUpdateTimeField();

    /**
     * Security Response Id
     */
    private final SecurityResponseIdField securityResponseId = new SecurityResponseIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Number Of Securities
     */
    private final NumberOfSecuritiesField numberOfSecurities = new NumberOfSecuritiesField();

    /**
     * Security Sub Type
     */
    private final SecuritySubTypeField securitySubType = new SecuritySubTypeField();

    /**
     * Multileg Model
     */
    private final MultilegModelField multilegModel = new MultilegModelField();

    /**
     * Implied Market Indicator
     */
    private final ImpliedMarketIndicatorField impliedMarketIndicator = new ImpliedMarketIndicatorField();

    /**
     * Product Complex
     */
    private final ProductComplexField productComplex = new ProductComplexField();

    /**
     * No Legs
     */
    private final NoLegsField noLegs = new NoLegsField();

    /**
     * Instrmt Leg Grp Comp
     */
    private final InstrmtLegGrpCompList instrmtLegGrpComp = new InstrmtLegGrpCompList();

    /**
     * Nr Response Header Me Comp
     */
    private final NrResponseHeaderMeComp nrResponseHeaderMeComp = new NrResponseHeaderMeComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(nrResponseHeaderMeComp.fields(), List.<Field>of(lowLimitPrice), List.<Field>of(highLimitPrice), List.<Field>of(securityId), List.<Field>of(lastUpdateTime), List.<Field>of(securityResponseId), List.<Field>of(marketSegmentId), List.<Field>of(numberOfSecurities), List.<Field>of(securitySubType), List.<Field>of(multilegModel), List.<Field>of(impliedMarketIndicator), List.<Field>of(productComplex), List.<Field>of(noLegs)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Low Limit Price
     *
     * @return the LowLimitPrice field
     */
    public LowLimitPriceField lowLimitPrice() {
        return lowLimitPrice;
    }

    /**
     * High Limit Price
     *
     * @return the HighLimitPrice field
     */
    public HighLimitPriceField highLimitPrice() {
        return highLimitPrice;
    }

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Last Update Time
     *
     * @return the LastUpdateTime field
     */
    public LastUpdateTimeField lastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Security Response Id
     *
     * @return the SecurityResponseId field
     */
    public SecurityResponseIdField securityResponseId() {
        return securityResponseId;
    }

    /**
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Number Of Securities
     *
     * @return the NumberOfSecurities field
     */
    public NumberOfSecuritiesField numberOfSecurities() {
        return numberOfSecurities;
    }

    /**
     * Security Sub Type
     *
     * @return the SecuritySubType field
     */
    public SecuritySubTypeField securitySubType() {
        return securitySubType;
    }

    /**
     * Multileg Model
     *
     * @return the MultilegModel field
     */
    public MultilegModelField multilegModel() {
        return multilegModel;
    }

    /**
     * Implied Market Indicator
     *
     * @return the ImpliedMarketIndicator field
     */
    public ImpliedMarketIndicatorField impliedMarketIndicator() {
        return impliedMarketIndicator;
    }

    /**
     * Product Complex
     *
     * @return the ProductComplex field
     */
    public ProductComplexField productComplex() {
        return productComplex;
    }

    /**
     * No Legs
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
    }

    /**
     * Instrmt Leg Grp Comp
     *
     * <p>Encode writes this list's size to the NoLegs field.</p>
     *
     * @return the InstrmtLegGrpComp entries
     */
    public InstrmtLegGrpCompList instrmtLegGrpComp() {
        return instrmtLegGrpComp;
    }

    /**
     * Nr Response Header Me Comp
     *
     * @return the NrResponseHeaderMeComp record
     */
    public NrResponseHeaderMeComp nrResponseHeaderMeComp() {
        return nrResponseHeaderMeComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + instrmtLegGrpComp.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = NrResponseHeaderMeComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += NrResponseHeaderMeComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor = instrmtLegGrpComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(nrResponseHeaderMeComp.requestTime().value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        cursor += 2; // padding
        if (!nrResponseHeaderMeComp.parseFrom(data, cursor, end - 56)) {
            return false;
        }
        cursor += nrResponseHeaderMeComp.byteLength();
        if (!lowLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowLimitPriceField.BYTE_LENGTH;
        if (!highLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighLimitPriceField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!lastUpdateTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastUpdateTimeField.BYTE_LENGTH;
        if (!securityResponseId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityResponseIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!numberOfSecurities.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfSecuritiesField.BYTE_LENGTH;
        if (!securitySubType.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySubTypeField.BYTE_LENGTH;
        if (!multilegModel.parse(data, cursor)) {
            return false;
        }
        cursor += MultilegModelField.BYTE_LENGTH;
        if (!impliedMarketIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ImpliedMarketIndicatorField.BYTE_LENGTH;
        if (!productComplex.parse(data, cursor)) {
            return false;
        }
        cursor += ProductComplexField.BYTE_LENGTH;
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        if (!instrmtLegGrpComp.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += instrmtLegGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (instrmtLegGrpComp.size() > 255) {
            throw new IllegalStateException("instrmtLegGrpComp holds " + instrmtLegGrpComp.size() + " entries, more than its count field can state");
        }
        noLegs.value((short) instrmtLegGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = nrResponseHeaderMeComp.encode(data, cursor);
        cursor = lowLimitPrice.encode(data, cursor);
        cursor = highLimitPrice.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = lastUpdateTime.encode(data, cursor);
        cursor = securityResponseId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = numberOfSecurities.encode(data, cursor);
        cursor = securitySubType.encode(data, cursor);
        cursor = multilegModel.encode(data, cursor);
        cursor = impliedMarketIndicator.encode(data, cursor);
        cursor = productComplex.encode(data, cursor);
        cursor = noLegs.encode(data, cursor);
        cursor = instrmtLegGrpComp.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        nrResponseHeaderMeComp.clear();
        instrmtLegGrpComp.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noLegs && !field.isRecognized()) {
                return false;
            }
        }
        if (!instrmtLegGrpComp.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noLegs && !field.isValid()) {
                return false;
            }
        }
        if (!instrmtLegGrpComp.isValid()) {
            return false;
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
        if (!nrResponseHeaderMeComp.isDecoded()) {
            return nrResponseHeaderMeComp.failedAt();
        }
        if (!lowLimitPrice.isDecoded()) {
            return Optional.of(lowLimitPrice);
        }
        if (!highLimitPrice.isDecoded()) {
            return Optional.of(highLimitPrice);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!lastUpdateTime.isDecoded()) {
            return Optional.of(lastUpdateTime);
        }
        if (!securityResponseId.isDecoded()) {
            return Optional.of(securityResponseId);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!numberOfSecurities.isDecoded()) {
            return Optional.of(numberOfSecurities);
        }
        if (!securitySubType.isDecoded()) {
            return Optional.of(securitySubType);
        }
        if (!multilegModel.isDecoded()) {
            return Optional.of(multilegModel);
        }
        if (!impliedMarketIndicator.isDecoded()) {
            return Optional.of(impliedMarketIndicator);
        }
        if (!productComplex.isDecoded()) {
            return Optional.of(productComplex);
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!instrmtLegGrpComp.isDecoded()) {
            return Optional.of(instrmtLegGrpComp.failedEntry().flatMap(InstrmtLegGrpCompEntry::failedAt).orElse(noLegs));
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
            case "LowLimitPrice" -> Optional.of(lowLimitPrice);
            case "HighLimitPrice" -> Optional.of(highLimitPrice);
            case "SecurityId" -> Optional.of(securityId);
            case "LastUpdateTime" -> Optional.of(lastUpdateTime);
            case "SecurityResponseId" -> Optional.of(securityResponseId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "NumberOfSecurities" -> Optional.of(numberOfSecurities);
            case "SecuritySubType" -> Optional.of(securitySubType);
            case "MultilegModel" -> Optional.of(multilegModel);
            case "ImpliedMarketIndicator" -> Optional.of(impliedMarketIndicator);
            case "ProductComplex" -> Optional.of(productComplex);
            case "NoLegs" -> Optional.of(noLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddComplexInstrumentResponse message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(instrmtLegGrpComp.diffFields(message.instrmtLegGrpComp));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            instrmtLegGrpComp.toFormattedString(builder, options);
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
        instrmtLegGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof AddComplexInstrumentResponse message)) {
            return false;
        }
        return fields.equals(message.fields) && instrmtLegGrpComp.equals(message.instrmtLegGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, instrmtLegGrpComp);
    }
}
