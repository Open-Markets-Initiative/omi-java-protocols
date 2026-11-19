package omi.databento.marketdata.normalized.dbn.v3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.databento.marketdata.normalized.dbn.v3.fields.ActionField;
import omi.databento.marketdata.normalized.dbn.v3.fields.DepthField;
import omi.databento.marketdata.normalized.dbn.v3.fields.FlagsField;
import omi.databento.marketdata.normalized.dbn.v3.fields.PriceField;
import omi.databento.marketdata.normalized.dbn.v3.fields.SequenceField;
import omi.databento.marketdata.normalized.dbn.v3.fields.SideField;
import omi.databento.marketdata.normalized.dbn.v3.fields.SizeField;
import omi.databento.marketdata.normalized.dbn.v3.fields.TsInDeltaField;
import omi.databento.marketdata.normalized.dbn.v3.fields.TsRecvField;
import omi.databento.marketdata.normalized.dbn.v3.types.Field;
import omi.databento.marketdata.normalized.dbn.v3.types.Message;
import omi.databento.marketdata.normalized.dbn.v3.types.PrintOptions;

/**
 * Represents the TradeMsg message from the Normalized protocol.
 *
 * <p>Market by price implementation with a book depth of 0; equivalent to MBP-0, the record of the trades schema</p>
 */
public final class TradeMsg implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0000';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 32;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Msg";

    /**
     * The price where every 1 unit corresponds to 1e-9
     */
    private final PriceField price = new PriceField();

    /**
     * The order quantity
     */
    private final SizeField size = new SizeField();

    /**
     * The event action
     */
    private final ActionField action = new ActionField();

    /**
     * The side that initiates the event
     */
    private final SideField side = new SideField();

    /**
     * A bit field indicating event end, message characteristics, and data quality; declared least significant bit first
     */
    private final FlagsField flags = new FlagsField();

    /**
     * The book level where the update event occurred
     */
    private final DepthField depth = new DepthField();

    /**
     * The capture-server-received timestamp expressed as the number of nanoseconds since the UNIX epoch
     */
    private final TsRecvField tsRecv = new TsRecvField();

    /**
     * The matching-engine-sending timestamp expressed as the number of nanoseconds before ts_recv
     */
    private final TsInDeltaField tsInDelta = new TsInDeltaField();

    /**
     * The message sequence number assigned at the venue
     */
    private final SequenceField sequence = new SequenceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(price, size, action, side, flags, depth, tsRecv, tsInDelta, sequence);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The price where every 1 unit corresponds to 1e-9
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The order quantity
     *
     * @return the Size field
     */
    public SizeField size() {
        return size;
    }

    /**
     * The event action
     *
     * @return the Action field
     */
    public ActionField action() {
        return action;
    }

    /**
     * The side that initiates the event
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * A bit field indicating event end, message characteristics, and data quality; declared least significant bit first
     *
     * @return the Flags field
     */
    public FlagsField flags() {
        return flags;
    }

    /**
     * The book level where the update event occurred
     *
     * @return the Depth field
     */
    public DepthField depth() {
        return depth;
    }

    /**
     * The capture-server-received timestamp expressed as the number of nanoseconds since the UNIX epoch
     *
     * @return the TsRecv field
     */
    public TsRecvField tsRecv() {
        return tsRecv;
    }

    /**
     * The matching-engine-sending timestamp expressed as the number of nanoseconds before ts_recv
     *
     * @return the TsInDelta field
     */
    public TsInDeltaField tsInDelta() {
        return tsInDelta;
    }

    /**
     * The message sequence number assigned at the venue
     *
     * @return the Sequence field
     */
    public SequenceField sequence() {
        return sequence;
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
        return Optional.ofNullable(tsRecv.value());
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
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!size.parse(data, cursor)) {
            return false;
        }
        cursor += SizeField.BYTE_LENGTH;
        if (!action.parse(data, cursor)) {
            return false;
        }
        cursor += ActionField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!flags.parse(data, cursor)) {
            return false;
        }
        cursor += FlagsField.BYTE_LENGTH;
        if (!depth.parse(data, cursor)) {
            return false;
        }
        cursor += DepthField.BYTE_LENGTH;
        if (!tsRecv.parse(data, cursor)) {
            return false;
        }
        cursor += TsRecvField.BYTE_LENGTH;
        if (!tsInDelta.parse(data, cursor)) {
            return false;
        }
        cursor += TsInDeltaField.BYTE_LENGTH;
        return sequence.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = price.encode(data, cursor);
        cursor = size.encode(data, cursor);
        cursor = action.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = flags.encode(data, cursor);
        cursor = depth.encode(data, cursor);
        cursor = tsRecv.encode(data, cursor);
        cursor = tsInDelta.encode(data, cursor);
        cursor = sequence.encode(data, cursor);
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
            case "Price" -> Optional.of(price);
            case "Size" -> Optional.of(size);
            case "Action" -> Optional.of(action);
            case "Side" -> Optional.of(side);
            case "Flags" -> Optional.of(flags);
            case "Depth" -> Optional.of(depth);
            case "TsRecv" -> Optional.of(tsRecv);
            case "TsInDelta" -> Optional.of(tsInDelta);
            case "Sequence" -> Optional.of(sequence);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeMsg message)) {
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
        if (!(other instanceof TradeMsg message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
