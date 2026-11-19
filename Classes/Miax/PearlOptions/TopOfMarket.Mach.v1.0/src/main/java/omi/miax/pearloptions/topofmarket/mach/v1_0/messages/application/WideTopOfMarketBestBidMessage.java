package omi.miax.pearloptions.topofmarket.mach.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.pearloptions.topofmarket.mach.v1_0.fields.NanosecondsField;
import omi.miax.pearloptions.topofmarket.mach.v1_0.fields.PbboConditionField;
import omi.miax.pearloptions.topofmarket.mach.v1_0.fields.ProductIdField;
import omi.miax.pearloptions.topofmarket.mach.v1_0.fields.WidePbboPriceField;
import omi.miax.pearloptions.topofmarket.mach.v1_0.fields.WidePbboPriorityCustomerSizeField;
import omi.miax.pearloptions.topofmarket.mach.v1_0.fields.WidePbboSizeField;
import omi.miax.pearloptions.topofmarket.mach.v1_0.types.Field;
import omi.miax.pearloptions.topofmarket.mach.v1_0.types.Message;
import omi.miax.pearloptions.topofmarket.mach.v1_0.types.PrintOptions;

/**
 * Represents the WideTopOfMarketBestBidMessage message from the TopOfMarket protocol.
 *
 * <p>This is the message format that will be used, in the refresh service and during trading hours, to disseminate both sides of the PEARL Top of Market for options with low premiums and small aggregate PEARL Best Bid or Offer (PBBO) size.</p>
 */
public final class WideTopOfMarketBestBidMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'W';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 21;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Wide Top Of Market Best Bid Message";

    /**
     * Time at which this product is added/updated on PEARL system today.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * PEARL Product ID mapped to a given option. It is assigned per trading session and is valid for that session.
     */
    private final ProductIdField productId = new ProductIdField();

    /**
     * PEARL Best price at the time stated in Timestamp and side specified in Message Type
     */
    private final WidePbboPriceField widePbboPrice = new WidePbboPriceField();

    /**
     * Aggregate size at PEARL Best Price at the time stated in Timestamp and side specified in Message Type
     */
    private final WidePbboSizeField widePbboSize = new WidePbboSizeField();

    /**
     * Aggregate size of Priority Customer contracts at the PEARL Best Price
     */
    private final WidePbboPriorityCustomerSizeField widePbboPriorityCustomerSize = new WidePbboPriorityCustomerSizeField();

    /**
     * Valid Values:
     */
    private final PbboConditionField pbboCondition = new PbboConditionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, productId, widePbboPrice, widePbboSize, widePbboPriorityCustomerSize, pbboCondition);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time at which this product is added/updated on PEARL system today.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * PEARL Product ID mapped to a given option. It is assigned per trading session and is valid for that session.
     *
     * @return the ProductId field
     */
    public ProductIdField productId() {
        return productId;
    }

    /**
     * PEARL Best price at the time stated in Timestamp and side specified in Message Type
     *
     * @return the WidePbboPrice field
     */
    public WidePbboPriceField widePbboPrice() {
        return widePbboPrice;
    }

    /**
     * Aggregate size at PEARL Best Price at the time stated in Timestamp and side specified in Message Type
     *
     * @return the WidePbboSize field
     */
    public WidePbboSizeField widePbboSize() {
        return widePbboSize;
    }

    /**
     * Aggregate size of Priority Customer contracts at the PEARL Best Price
     *
     * @return the WidePbboPriorityCustomerSize field
     */
    public WidePbboPriorityCustomerSizeField widePbboPriorityCustomerSize() {
        return widePbboPriorityCustomerSize;
    }

    /**
     * Valid Values:
     *
     * @return the PbboCondition field
     */
    public PbboConditionField pbboCondition() {
        return pbboCondition;
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
        if (!widePbboPrice.parse(data, cursor)) {
            return false;
        }
        cursor += WidePbboPriceField.BYTE_LENGTH;
        if (!widePbboSize.parse(data, cursor)) {
            return false;
        }
        cursor += WidePbboSizeField.BYTE_LENGTH;
        if (!widePbboPriorityCustomerSize.parse(data, cursor)) {
            return false;
        }
        cursor += WidePbboPriorityCustomerSizeField.BYTE_LENGTH;
        return pbboCondition.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = productId.encode(data, cursor);
        cursor = widePbboPrice.encode(data, cursor);
        cursor = widePbboSize.encode(data, cursor);
        cursor = widePbboPriorityCustomerSize.encode(data, cursor);
        cursor = pbboCondition.encode(data, cursor);
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
            case "WidePbboPrice" -> Optional.of(widePbboPrice);
            case "WidePbboSize" -> Optional.of(widePbboSize);
            case "WidePbboPriorityCustomerSize" -> Optional.of(widePbboPriorityCustomerSize);
            case "PbboCondition" -> Optional.of(pbboCondition);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof WideTopOfMarketBestBidMessage message)) {
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
        if (!(other instanceof WideTopOfMarketBestBidMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
