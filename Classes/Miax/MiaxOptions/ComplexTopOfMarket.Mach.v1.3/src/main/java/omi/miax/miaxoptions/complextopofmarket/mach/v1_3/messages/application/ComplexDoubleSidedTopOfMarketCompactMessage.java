package omi.miax.miaxoptions.complextopofmarket.mach.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.fields.BidConditionField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.fields.BidPriceField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.fields.BidPriorityCustomerSizeField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.fields.BidSizeField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.fields.NanosecondsField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.fields.OfferConditionField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.fields.OfferPriceField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.fields.OfferPriorityCustomerSizeField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.fields.OfferSizeField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.fields.StrategyIdField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.types.Field;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.types.Message;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.types.PrintOptions;

/**
 * Represents the ComplexDoubleSidedTopOfMarketCompactMessage message from the ComplexTopOfMarket protocol.
 *
 * <p>This is the message format that will be used to disseminate both sides of the MIAX top of market for strategies (cMBBO) with low net price and small aggregate size.</p>
 */
public final class ComplexDoubleSidedTopOfMarketCompactMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'm';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 22;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Double Sided Top Of Market Compact Message";

    /**
     * Time at which this product is added/updated on MIAX system today.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * MIAX Strategy ID is assigned per trading day and is valid only for that day.
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * MIAX Best Bid net price.
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * Aggregate size at MIAX Best Bid Net Price
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Aggregate size of Priority Customer contracts at MIAX Best Bid Price for the Complex Strategy
     */
    private final BidPriorityCustomerSizeField bidPriorityCustomerSize = new BidPriorityCustomerSizeField();

    /**
     * Top of Strategy Market Quote Conditions
     */
    private final BidConditionField bidCondition = new BidConditionField();

    /**
     * MIAX Best Offer net price
     */
    private final OfferPriceField offerPrice = new OfferPriceField();

    /**
     * Aggregate size at MIAX Best Bid Net Price
     */
    private final OfferSizeField offerSize = new OfferSizeField();

    /**
     * Aggregate size of Priority Customer contracts at MIAX Best Offer Price for the Complex Strategy
     */
    private final OfferPriorityCustomerSizeField offerPriorityCustomerSize = new OfferPriorityCustomerSizeField();

    /**
     * Top of Strategy Market Quote Conditions
     */
    private final OfferConditionField offerCondition = new OfferConditionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, strategyId, bidPrice, bidSize, bidPriorityCustomerSize, bidCondition, offerPrice, offerSize, offerPriorityCustomerSize, offerCondition);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time at which this product is added/updated on MIAX system today.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * MIAX Strategy ID is assigned per trading day and is valid only for that day.
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * MIAX Best Bid net price.
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * Aggregate size at MIAX Best Bid Net Price
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Aggregate size of Priority Customer contracts at MIAX Best Bid Price for the Complex Strategy
     *
     * @return the BidPriorityCustomerSize field
     */
    public BidPriorityCustomerSizeField bidPriorityCustomerSize() {
        return bidPriorityCustomerSize;
    }

    /**
     * Top of Strategy Market Quote Conditions
     *
     * @return the BidCondition field
     */
    public BidConditionField bidCondition() {
        return bidCondition;
    }

    /**
     * MIAX Best Offer net price
     *
     * @return the OfferPrice field
     */
    public OfferPriceField offerPrice() {
        return offerPrice;
    }

    /**
     * Aggregate size at MIAX Best Bid Net Price
     *
     * @return the OfferSize field
     */
    public OfferSizeField offerSize() {
        return offerSize;
    }

    /**
     * Aggregate size of Priority Customer contracts at MIAX Best Offer Price for the Complex Strategy
     *
     * @return the OfferPriorityCustomerSize field
     */
    public OfferPriorityCustomerSizeField offerPriorityCustomerSize() {
        return offerPriorityCustomerSize;
    }

    /**
     * Top of Strategy Market Quote Conditions
     *
     * @return the OfferCondition field
     */
    public OfferConditionField offerCondition() {
        return offerCondition;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!bidPriorityCustomerSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriorityCustomerSizeField.BYTE_LENGTH;
        if (!bidCondition.parse(data, cursor)) {
            return false;
        }
        cursor += BidConditionField.BYTE_LENGTH;
        if (!offerPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OfferPriceField.BYTE_LENGTH;
        if (!offerSize.parse(data, cursor)) {
            return false;
        }
        cursor += OfferSizeField.BYTE_LENGTH;
        if (!offerPriorityCustomerSize.parse(data, cursor)) {
            return false;
        }
        cursor += OfferPriorityCustomerSizeField.BYTE_LENGTH;
        return offerCondition.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = bidPriorityCustomerSize.encode(data, cursor);
        cursor = bidCondition.encode(data, cursor);
        cursor = offerPrice.encode(data, cursor);
        cursor = offerSize.encode(data, cursor);
        cursor = offerPriorityCustomerSize.encode(data, cursor);
        cursor = offerCondition.encode(data, cursor);
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
            case "StrategyId" -> Optional.of(strategyId);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidSize" -> Optional.of(bidSize);
            case "BidPriorityCustomerSize" -> Optional.of(bidPriorityCustomerSize);
            case "BidCondition" -> Optional.of(bidCondition);
            case "OfferPrice" -> Optional.of(offerPrice);
            case "OfferSize" -> Optional.of(offerSize);
            case "OfferPriorityCustomerSize" -> Optional.of(offerPriorityCustomerSize);
            case "OfferCondition" -> Optional.of(offerCondition);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexDoubleSidedTopOfMarketCompactMessage message)) {
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
        if (!(other instanceof ComplexDoubleSidedTopOfMarketCompactMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
