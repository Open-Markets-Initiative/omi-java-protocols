package omi.databento.marketdata.normalized.dbn.v2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.databento.marketdata.normalized.dbn.v2.fields.FlagsField;
import omi.databento.marketdata.normalized.dbn.v2.fields.PriceField;
import omi.databento.marketdata.normalized.dbn.v2.fields.SequenceField;
import omi.databento.marketdata.normalized.dbn.v2.fields.SideField;
import omi.databento.marketdata.normalized.dbn.v2.fields.SizeField;
import omi.databento.marketdata.normalized.dbn.v2.fields.TsRecvField;
import omi.databento.marketdata.normalized.dbn.v2.structs.BidAskPair;
import omi.databento.marketdata.normalized.dbn.v2.types.Field;
import omi.databento.marketdata.normalized.dbn.v2.types.Message;
import omi.databento.marketdata.normalized.dbn.v2.types.PrintOptions;

/**
 * Represents the BboMsg message from the Normalized protocol.
 *
 * <p>Subsampled market by price with a known book depth of 1; the record of the bbo-1s and bbo-1m schemas</p>
 */
public final class BboMsg implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u00C3';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 64;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Bbo Msg";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 12, 1, 15, 1, 24, 4 };

    /**
     * The price where every 1 unit corresponds to 1e-9
     */
    private final PriceField price = new PriceField();

    /**
     * The order quantity
     */
    private final SizeField size = new SizeField();

    /**
     * The side that initiates the event
     */
    private final SideField side = new SideField();

    /**
     * A bit field indicating event end, message characteristics, and data quality; declared least significant bit first
     */
    private final FlagsField flags = new FlagsField();

    /**
     * The capture-server-received timestamp expressed as the number of nanoseconds since the UNIX epoch
     */
    private final TsRecvField tsRecv = new TsRecvField();

    /**
     * The message sequence number assigned at the venue
     */
    private final SequenceField sequence = new SequenceField();

    /**
     * A level
     */
    private final BidAskPair bidAskPair = new BidAskPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(price), List.<Field>of(size), List.<Field>of(side), List.<Field>of(flags), List.<Field>of(tsRecv), List.<Field>of(sequence), bidAskPair.fields()).flatMap(List::stream).toList();

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
     * The capture-server-received timestamp expressed as the number of nanoseconds since the UNIX epoch
     *
     * @return the TsRecv field
     */
    public TsRecvField tsRecv() {
        return tsRecv;
    }

    /**
     * The message sequence number assigned at the venue
     *
     * @return the Sequence field
     */
    public SequenceField sequence() {
        return sequence;
    }

    /**
     * A level
     *
     * @return the BidAskPair record
     */
    public BidAskPair bidAskPair() {
        return bidAskPair;
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
        return PADDING.clone();
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
        cursor += 1; // padding
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!flags.parse(data, cursor)) {
            return false;
        }
        cursor += FlagsField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!tsRecv.parse(data, cursor)) {
            return false;
        }
        cursor += TsRecvField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!sequence.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceField.BYTE_LENGTH;
        return bidAskPair.parseFrom(data, cursor, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = price.encode(data, cursor);
        cursor = size.encode(data, cursor);
        if (buffer != null && buffer.length >= 13) {
            System.arraycopy(buffer, 12, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = side.encode(data, cursor);
        cursor = flags.encode(data, cursor);
        if (buffer != null && buffer.length >= 16) {
            System.arraycopy(buffer, 15, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = tsRecv.encode(data, cursor);
        if (buffer != null && buffer.length >= 28) {
            System.arraycopy(buffer, 24, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = sequence.encode(data, cursor);
        cursor = bidAskPair.encode(data, cursor);
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
        bidAskPair.clear();
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
            case "Side" -> Optional.of(side);
            case "Flags" -> Optional.of(flags);
            case "TsRecv" -> Optional.of(tsRecv);
            case "Sequence" -> Optional.of(sequence);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BboMsg message)) {
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
        if (!(other instanceof BboMsg message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
