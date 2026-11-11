package omi.miax.onyxfutures.topofmarket.mach.v1_0_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.InstrumentIdField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.MbbPriceField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.MbbSizeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.MboPriceField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.MboSizeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.TimestampField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.types.Field;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.types.Message;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.types.PrintOptions;

/**
 * Represents the BestBidAndOfferMessage message from the TopOfMarket protocol.
 *
 * <p>used to publish MIAX Futures Onyx Best Bid and Offer (MBBO) of a Simple Instrument or Complex Instrument</p>
 */
public final class BestBidAndOfferMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u000F';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Best Bid And Offer Message";

    /**
     * Matching Engine time
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Unique ID assigned by MIAX Futures Onyx
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Will be provided for updates as a result of any changes to the prices or sizes of the MBBO for an Simple Instrument or a Complex Instrument
     */
    private final MbbPriceField mbbPrice = new MbbPriceField();

    /**
     * Aggregate size in contracts at the displayed offer price
     */
    private final MbbSizeField mbbSize = new MbbSizeField();

    /**
     * Will be provided for updates as a result of any changes to the prices or sizes of the MBBO for an Simple Instrument or a Complex Instrumen
     */
    private final MboPriceField mboPrice = new MboPriceField();

    /**
     * Aggregate size in contracts at the displayed offer price
     */
    private final MboSizeField mboSize = new MboSizeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrumentId, mbbPrice, mbbSize, mboPrice, mboSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Matching Engine time
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Unique ID assigned by MIAX Futures Onyx
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Will be provided for updates as a result of any changes to the prices or sizes of the MBBO for an Simple Instrument or a Complex Instrument
     *
     * @return the MbbPrice field
     */
    public MbbPriceField mbbPrice() {
        return mbbPrice;
    }

    /**
     * Aggregate size in contracts at the displayed offer price
     *
     * @return the MbbSize field
     */
    public MbbSizeField mbbSize() {
        return mbbSize;
    }

    /**
     * Will be provided for updates as a result of any changes to the prices or sizes of the MBBO for an Simple Instrument or a Complex Instrumen
     *
     * @return the MboPrice field
     */
    public MboPriceField mboPrice() {
        return mboPrice;
    }

    /**
     * Aggregate size in contracts at the displayed offer price
     *
     * @return the MboSize field
     */
    public MboSizeField mboSize() {
        return mboSize;
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
        return Optional.ofNullable(timestampField.value());
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
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!mbbPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MbbPriceField.BYTE_LENGTH;
        if (!mbbSize.parse(data, cursor)) {
            return false;
        }
        cursor += MbbSizeField.BYTE_LENGTH;
        if (!mboPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MboPriceField.BYTE_LENGTH;
        return mboSize.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = mbbPrice.encode(data, cursor);
        cursor = mbbSize.encode(data, cursor);
        cursor = mboPrice.encode(data, cursor);
        cursor = mboSize.encode(data, cursor);
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "MbbPrice" -> Optional.of(mbbPrice);
            case "MbbSize" -> Optional.of(mbbSize);
            case "MboPrice" -> Optional.of(mboPrice);
            case "MboSize" -> Optional.of(mboSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BestBidAndOfferMessage message)) {
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
        if (!(other instanceof BestBidAndOfferMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
