package omi.gpw.wse.streambbo.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.CollarTypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.InstrumentIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.LowerAskField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.LowerBidField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.PriceField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.UpperAskField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.UpperBidField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the OrderCollars message from the StreamBbo protocol.
 *
 * <p>New order price collars</p>
 */
public final class OrderCollars implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 45;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Collars";

    /**
     * ID of financial instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Collars type
     */
    private final CollarTypeField collarType = new CollarTypeField();

    /**
     * Auction price (final auction price)
     */
    private final PriceField price = new PriceField();

    /**
     * Value of the lower bid Price collar
     */
    private final LowerBidField lowerBid = new LowerBidField();

    /**
     * Value of the upper bid Price collar
     */
    private final UpperBidField upperBid = new UpperBidField();

    /**
     * Value of the lower ask Price collar
     */
    private final LowerAskField lowerAsk = new LowerAskField();

    /**
     * Value of the upper ask Price collar
     */
    private final UpperAskField upperAsk = new UpperAskField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, collarType, price, lowerBid, upperBid, lowerAsk, upperAsk);

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
     * Collars type
     *
     * @return the CollarType field
     */
    public CollarTypeField collarType() {
        return collarType;
    }

    /**
     * Auction price (final auction price)
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Value of the lower bid Price collar
     *
     * @return the LowerBid field
     */
    public LowerBidField lowerBid() {
        return lowerBid;
    }

    /**
     * Value of the upper bid Price collar
     *
     * @return the UpperBid field
     */
    public UpperBidField upperBid() {
        return upperBid;
    }

    /**
     * Value of the lower ask Price collar
     *
     * @return the LowerAsk field
     */
    public LowerAskField lowerAsk() {
        return lowerAsk;
    }

    /**
     * Value of the upper ask Price collar
     *
     * @return the UpperAsk field
     */
    public UpperAskField upperAsk() {
        return upperAsk;
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
        if (!collarType.parse(data, cursor)) {
            return false;
        }
        cursor += CollarTypeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!lowerBid.parse(data, cursor)) {
            return false;
        }
        cursor += LowerBidField.BYTE_LENGTH;
        if (!upperBid.parse(data, cursor)) {
            return false;
        }
        cursor += UpperBidField.BYTE_LENGTH;
        if (!lowerAsk.parse(data, cursor)) {
            return false;
        }
        cursor += LowerAskField.BYTE_LENGTH;
        return upperAsk.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = collarType.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = lowerBid.encode(data, cursor);
        cursor = upperBid.encode(data, cursor);
        cursor = lowerAsk.encode(data, cursor);
        cursor = upperAsk.encode(data, cursor);
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
            case "CollarType" -> Optional.of(collarType);
            case "Price" -> Optional.of(price);
            case "LowerBid" -> Optional.of(lowerBid);
            case "UpperBid" -> Optional.of(upperBid);
            case "LowerAsk" -> Optional.of(lowerAsk);
            case "UpperAsk" -> Optional.of(upperAsk);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderCollars message)) {
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
        if (!(other instanceof OrderCollars message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
