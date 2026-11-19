package omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.AskPriceLongField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.AskQuantityLongField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.BidPriceLongField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.BidQuantityLongField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.SymbolField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.TimeOffsetField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.types.Field;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.types.Message;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.types.PrintOptions;

/**
 * Represents the TwoSideUpdateLongMessage message from the OofMulticastTop protocol.
 *
 * <p>Two Side Update messages provide an updated price and size for both sides of a Symbol. One Two Side Update message may reflect one or more updates to the inside book that were processed at the same time, but will only be done so in a way that can be arbitrated between A/B feeds. Two Side Update messages come in two variants: Two Side Update (Long) message and Two Side Update (Short) message. The Two Side Update (Short) message is used whenever possible, but the Two Side Update (Long) message is used whenever the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer.</p>
 */
public final class TwoSideUpdateLongMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Two Side Update Long Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Six character, base 62.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Bid price (may be a zero or negative price for some instruments).
     */
    private final BidPriceLongField bidPriceLong = new BidPriceLongField();

    /**
     * Number of contracts on the bid side of the inside book (a zero value denotes the Bid Price is invalid).
     */
    private final BidQuantityLongField bidQuantityLong = new BidQuantityLongField();

    /**
     * Ask price (may be a zero or negative price for some instruments).
     */
    private final AskPriceLongField askPriceLong = new AskPriceLongField();

    /**
     * Number of contracts on the ask side of the inside book (a zero value denotes the Ask Price is invalid).
     */
    private final AskQuantityLongField askQuantityLong = new AskQuantityLongField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, symbol, bidPriceLong, bidQuantityLong, askPriceLong, askQuantityLong);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Six character, base 62.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Bid price (may be a zero or negative price for some instruments).
     *
     * @return the BidPriceLong field
     */
    public BidPriceLongField bidPriceLong() {
        return bidPriceLong;
    }

    /**
     * Number of contracts on the bid side of the inside book (a zero value denotes the Bid Price is invalid).
     *
     * @return the BidQuantityLong field
     */
    public BidQuantityLongField bidQuantityLong() {
        return bidQuantityLong;
    }

    /**
     * Ask price (may be a zero or negative price for some instruments).
     *
     * @return the AskPriceLong field
     */
    public AskPriceLongField askPriceLong() {
        return askPriceLong;
    }

    /**
     * Number of contracts on the ask side of the inside book (a zero value denotes the Ask Price is invalid).
     *
     * @return the AskQuantityLong field
     */
    public AskQuantityLongField askQuantityLong() {
        return askQuantityLong;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!bidPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceLongField.BYTE_LENGTH;
        if (!bidQuantityLong.parse(data, cursor)) {
            return false;
        }
        cursor += BidQuantityLongField.BYTE_LENGTH;
        if (!askPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceLongField.BYTE_LENGTH;
        return askQuantityLong.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = bidPriceLong.encode(data, cursor);
        cursor = bidQuantityLong.encode(data, cursor);
        cursor = askPriceLong.encode(data, cursor);
        cursor = askQuantityLong.encode(data, cursor);
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "Symbol" -> Optional.of(symbol);
            case "BidPriceLong" -> Optional.of(bidPriceLong);
            case "BidQuantityLong" -> Optional.of(bidQuantityLong);
            case "AskPriceLong" -> Optional.of(askPriceLong);
            case "AskQuantityLong" -> Optional.of(askQuantityLong);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TwoSideUpdateLongMessage message)) {
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
        if (!(other instanceof TwoSideUpdateLongMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
