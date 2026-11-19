package omi.eurex.t7.eti.fbe.v14_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v14_0.fields.ImpliedMarketIndicatorField;
import omi.eurex.t7.eti.fbe.v14_0.fields.LastUpdateTimeField;
import omi.eurex.t7.eti.fbe.v14_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v14_0.fields.MultilegModelField;
import omi.eurex.t7.eti.fbe.v14_0.fields.ProductComplexField;
import omi.eurex.t7.eti.fbe.v14_0.fields.QuantityScalingFactorField;
import omi.eurex.t7.eti.fbe.v14_0.fields.RelatedSecurityIdField;
import omi.eurex.t7.eti.fbe.v14_0.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v14_0.fields.SecurityResponseIdField;
import omi.eurex.t7.eti.fbe.v14_0.structs.NrResponseHeaderMeComp;
import omi.eurex.t7.eti.fbe.v14_0.types.Field;
import omi.eurex.t7.eti.fbe.v14_0.types.Message;
import omi.eurex.t7.eti.fbe.v14_0.types.PrintOptions;

/**
 * Represents the AddScaledSimpleInstrumentResponse message from the Eti protocol.
 */
public final class AddScaledSimpleInstrumentResponse implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 98;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Scaled Simple Instrument Response";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 47, 3, 91, 7 };

    /**
     * Related Security Id
     */
    private final RelatedSecurityIdField relatedSecurityId = new RelatedSecurityIdField();

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
     * Quantity Scaling Factor
     */
    private final QuantityScalingFactorField quantityScalingFactor = new QuantityScalingFactorField();

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
     * Nr Response Header Me Comp
     */
    private final NrResponseHeaderMeComp nrResponseHeaderMeComp = new NrResponseHeaderMeComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(nrResponseHeaderMeComp.fields(), List.<Field>of(relatedSecurityId), List.<Field>of(securityId), List.<Field>of(lastUpdateTime), List.<Field>of(securityResponseId), List.<Field>of(marketSegmentId), List.<Field>of(quantityScalingFactor), List.<Field>of(multilegModel), List.<Field>of(impliedMarketIndicator), List.<Field>of(productComplex)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Related Security Id
     *
     * @return the RelatedSecurityId field
     */
    public RelatedSecurityIdField relatedSecurityId() {
        return relatedSecurityId;
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
     * Quantity Scaling Factor
     *
     * @return the QuantityScalingFactor field
     */
    public QuantityScalingFactorField quantityScalingFactor() {
        return quantityScalingFactor;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        cursor += 2; // padding
        if (!nrResponseHeaderMeComp.parseFrom(data, cursor, end - 48)) {
            return false;
        }
        cursor += nrResponseHeaderMeComp.byteLength();
        if (!relatedSecurityId.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedSecurityIdField.BYTE_LENGTH;
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
        if (!quantityScalingFactor.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityScalingFactorField.BYTE_LENGTH;
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

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = nrResponseHeaderMeComp.encode(data, cursor);
        cursor = relatedSecurityId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = lastUpdateTime.encode(data, cursor);
        cursor = securityResponseId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = quantityScalingFactor.encode(data, cursor);
        cursor = multilegModel.encode(data, cursor);
        cursor = impliedMarketIndicator.encode(data, cursor);
        cursor = productComplex.encode(data, cursor);
        if (buffer != null && buffer.length >= 98) {
            System.arraycopy(buffer, 91, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
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
        nrResponseHeaderMeComp.clear();
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
            case "RelatedSecurityId" -> Optional.of(relatedSecurityId);
            case "SecurityId" -> Optional.of(securityId);
            case "LastUpdateTime" -> Optional.of(lastUpdateTime);
            case "SecurityResponseId" -> Optional.of(securityResponseId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "QuantityScalingFactor" -> Optional.of(quantityScalingFactor);
            case "MultilegModel" -> Optional.of(multilegModel);
            case "ImpliedMarketIndicator" -> Optional.of(impliedMarketIndicator);
            case "ProductComplex" -> Optional.of(productComplex);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddScaledSimpleInstrumentResponse message)) {
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
        if (!(other instanceof AddScaledSimpleInstrumentResponse message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
