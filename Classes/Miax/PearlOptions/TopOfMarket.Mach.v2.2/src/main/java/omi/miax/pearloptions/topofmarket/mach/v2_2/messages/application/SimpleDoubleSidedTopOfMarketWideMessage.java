package omi.miax.pearloptions.topofmarket.mach.v2_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.pearloptions.topofmarket.mach.v2_2.fields.BidConditionField;
import omi.miax.pearloptions.topofmarket.mach.v2_2.fields.BidPriceField2;
import omi.miax.pearloptions.topofmarket.mach.v2_2.fields.BidPriorityCustomerSizeField2;
import omi.miax.pearloptions.topofmarket.mach.v2_2.fields.BidSizeField2;
import omi.miax.pearloptions.topofmarket.mach.v2_2.fields.NanosecondsField;
import omi.miax.pearloptions.topofmarket.mach.v2_2.fields.OfferConditionField;
import omi.miax.pearloptions.topofmarket.mach.v2_2.fields.OfferPriceField2;
import omi.miax.pearloptions.topofmarket.mach.v2_2.fields.OfferPriorityCustomerSizeField2;
import omi.miax.pearloptions.topofmarket.mach.v2_2.fields.OfferSizeField2;
import omi.miax.pearloptions.topofmarket.mach.v2_2.fields.ProductIdField;
import omi.miax.pearloptions.topofmarket.mach.v2_2.types.Field;
import omi.miax.pearloptions.topofmarket.mach.v2_2.types.Message;
import omi.miax.pearloptions.topofmarket.mach.v2_2.types.PrintOptions;

/**
 * Represents the SimpleDoubleSidedTopOfMarketWideMessage message from the TopOfMarket protocol.
 *
 * <p>This is the message format that will be used to disseminate the “seconds” part of the timestamp that is applicable to all messages that are sent in the current second.This is the message format that will be used, in the refresh service only, to disseminate both sides of the MIAX Top of Market for options with high premiums or large aggregate MIAX Best Bid or Offer (MBBO) sizes.</p>
 */
public final class SimpleDoubleSidedTopOfMarketWideMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'D';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Simple Double Sided Top Of Market Wide Message";

    /**
     * Time at which this product is added/updated on MIAX system today.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * MIAX Product ID mapped to a given option. It is assigned per trading session and is valid for that session.
     */
    private final ProductIdField productId = new ProductIdField();

    /**
     * MIAX best bid price at the time stated in Timestamp and side specified in Message Type
     */
    private final BidPriceField2 bidPrice = new BidPriceField2();

    /**
     * Aggregate size at MIAX best bid Price at the time stated in Timestamp and side specified in Message Type
     */
    private final BidSizeField2 bidSize = new BidSizeField2();

    /**
     * Aggregate size of Priority Customer contracts at the MIAX Best Bid Price
     */
    private final BidPriorityCustomerSizeField2 bidPriorityCustomerSize = new BidPriorityCustomerSizeField2();

    /**
     * Bid Condition Value
     */
    private final BidConditionField bidCondition = new BidConditionField();

    /**
     * MIAX best offer price at the time stated in Timestamp and side specified in Message Type
     */
    private final OfferPriceField2 offerPrice = new OfferPriceField2();

    /**
     * Aggregate size at MIAX best offer Price at the time stated in Timestamp and side specified in Message Type
     */
    private final OfferSizeField2 offerSize = new OfferSizeField2();

    /**
     * Aggregate size of Priority Customer contracts at the MIAX Best Offer Price
     */
    private final OfferPriorityCustomerSizeField2 offerPriorityCustomerSize = new OfferPriorityCustomerSizeField2();

    /**
     * Offer Condition value
     */
    private final OfferConditionField offerCondition = new OfferConditionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, productId, bidPrice, bidSize, bidPriorityCustomerSize, bidCondition, offerPrice, offerSize, offerPriorityCustomerSize, offerCondition);

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
     * MIAX Product ID mapped to a given option. It is assigned per trading session and is valid for that session.
     *
     * @return the ProductId field
     */
    public ProductIdField productId() {
        return productId;
    }

    /**
     * MIAX best bid price at the time stated in Timestamp and side specified in Message Type
     *
     * @return the BidPrice field
     */
    public BidPriceField2 bidPrice() {
        return bidPrice;
    }

    /**
     * Aggregate size at MIAX best bid Price at the time stated in Timestamp and side specified in Message Type
     *
     * @return the BidSize field
     */
    public BidSizeField2 bidSize() {
        return bidSize;
    }

    /**
     * Aggregate size of Priority Customer contracts at the MIAX Best Bid Price
     *
     * @return the BidPriorityCustomerSize field
     */
    public BidPriorityCustomerSizeField2 bidPriorityCustomerSize() {
        return bidPriorityCustomerSize;
    }

    /**
     * Bid Condition Value
     *
     * @return the BidCondition field
     */
    public BidConditionField bidCondition() {
        return bidCondition;
    }

    /**
     * MIAX best offer price at the time stated in Timestamp and side specified in Message Type
     *
     * @return the OfferPrice field
     */
    public OfferPriceField2 offerPrice() {
        return offerPrice;
    }

    /**
     * Aggregate size at MIAX best offer Price at the time stated in Timestamp and side specified in Message Type
     *
     * @return the OfferSize field
     */
    public OfferSizeField2 offerSize() {
        return offerSize;
    }

    /**
     * Aggregate size of Priority Customer contracts at the MIAX Best Offer Price
     *
     * @return the OfferPriorityCustomerSize field
     */
    public OfferPriorityCustomerSizeField2 offerPriorityCustomerSize() {
        return offerPriorityCustomerSize;
    }

    /**
     * Offer Condition value
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
        if (!productId.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField2.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField2.BYTE_LENGTH;
        if (!bidPriorityCustomerSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriorityCustomerSizeField2.BYTE_LENGTH;
        if (!bidCondition.parse(data, cursor)) {
            return false;
        }
        cursor += BidConditionField.BYTE_LENGTH;
        if (!offerPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OfferPriceField2.BYTE_LENGTH;
        if (!offerSize.parse(data, cursor)) {
            return false;
        }
        cursor += OfferSizeField2.BYTE_LENGTH;
        if (!offerPriorityCustomerSize.parse(data, cursor)) {
            return false;
        }
        cursor += OfferPriorityCustomerSizeField2.BYTE_LENGTH;
        return offerCondition.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = productId.encode(data, cursor);
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
            case "ProductId" -> Optional.of(productId);
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
        if (!(other instanceof SimpleDoubleSidedTopOfMarketWideMessage message)) {
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
        if (!(other instanceof SimpleDoubleSidedTopOfMarketWideMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
