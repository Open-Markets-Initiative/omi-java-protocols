package omi.databento.marketdata.normalized.dbn.v1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.databento.marketdata.normalized.dbn.v1.fields.ChannelField;
import omi.databento.marketdata.normalized.dbn.v1.fields.PriceField;
import omi.databento.marketdata.normalized.dbn.v1.fields.QuantityField;
import omi.databento.marketdata.normalized.dbn.v1.fields.SequenceField;
import omi.databento.marketdata.normalized.dbn.v1.fields.StatFlagsField;
import omi.databento.marketdata.normalized.dbn.v1.fields.StatTypeField;
import omi.databento.marketdata.normalized.dbn.v1.fields.TsInDeltaField;
import omi.databento.marketdata.normalized.dbn.v1.fields.TsRecvField;
import omi.databento.marketdata.normalized.dbn.v1.fields.TsRefField;
import omi.databento.marketdata.normalized.dbn.v1.fields.UpdateActionField;
import omi.databento.marketdata.normalized.dbn.v1.types.Field;
import omi.databento.marketdata.normalized.dbn.v1.types.Message;
import omi.databento.marketdata.normalized.dbn.v1.types.PrintOptions;

/**
 * Represents the StatMsg message from the Normalized protocol.
 *
 * <p>A statistics message; the record of the statistics schema</p>
 */
public final class StatMsg implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0018';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 48;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Stat Msg";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 42, 6 };

    /**
     * The capture-server-received timestamp expressed as the number of nanoseconds since the UNIX epoch
     */
    private final TsRecvField tsRecv = new TsRecvField();

    /**
     * The reference timestamp of the statistic value expressed as the number of nanoseconds since the UNIX epoch
     */
    private final TsRefField tsRef = new TsRefField();

    /**
     * The price where every 1 unit corresponds to 1e-9
     */
    private final PriceField price = new PriceField();

    /**
     * The value for non-price statistics
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * The message sequence number assigned at the venue
     */
    private final SequenceField sequence = new SequenceField();

    /**
     * The matching-engine-sending timestamp expressed as the number of nanoseconds before ts_recv
     */
    private final TsInDeltaField tsInDelta = new TsInDeltaField();

    /**
     * The type of statistic value contained in the message
     */
    private final StatTypeField statType = new StatTypeField();

    /**
     * The channel ID assigned by Databento as an incrementing integer starting at zero
     */
    private final ChannelField channel = new ChannelField();

    /**
     * Indicates if the statistic is newly added or deleted
     */
    private final UpdateActionField updateAction = new UpdateActionField();

    /**
     * Additional flags associated with certain stat types
     */
    private final StatFlagsField statFlags = new StatFlagsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tsRecv, tsRef, price, quantity, sequence, tsInDelta, statType, channel, updateAction, statFlags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The capture-server-received timestamp expressed as the number of nanoseconds since the UNIX epoch
     *
     * @return the TsRecv field
     */
    public TsRecvField tsRecv() {
        return tsRecv;
    }

    /**
     * The reference timestamp of the statistic value expressed as the number of nanoseconds since the UNIX epoch
     *
     * @return the TsRef field
     */
    public TsRefField tsRef() {
        return tsRef;
    }

    /**
     * The price where every 1 unit corresponds to 1e-9
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The value for non-price statistics
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
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
     * The matching-engine-sending timestamp expressed as the number of nanoseconds before ts_recv
     *
     * @return the TsInDelta field
     */
    public TsInDeltaField tsInDelta() {
        return tsInDelta;
    }

    /**
     * The type of statistic value contained in the message
     *
     * @return the StatType field
     */
    public StatTypeField statType() {
        return statType;
    }

    /**
     * The channel ID assigned by Databento as an incrementing integer starting at zero
     *
     * @return the Channel field
     */
    public ChannelField channel() {
        return channel;
    }

    /**
     * Indicates if the statistic is newly added or deleted
     *
     * @return the UpdateAction field
     */
    public UpdateActionField updateAction() {
        return updateAction;
    }

    /**
     * Additional flags associated with certain stat types
     *
     * @return the StatFlags field
     */
    public StatFlagsField statFlags() {
        return statFlags;
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
        if (!tsRecv.parse(data, cursor)) {
            return false;
        }
        cursor += TsRecvField.BYTE_LENGTH;
        if (!tsRef.parse(data, cursor)) {
            return false;
        }
        cursor += TsRefField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!sequence.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceField.BYTE_LENGTH;
        if (!tsInDelta.parse(data, cursor)) {
            return false;
        }
        cursor += TsInDeltaField.BYTE_LENGTH;
        if (!statType.parse(data, cursor)) {
            return false;
        }
        cursor += StatTypeField.BYTE_LENGTH;
        if (!channel.parse(data, cursor)) {
            return false;
        }
        cursor += ChannelField.BYTE_LENGTH;
        if (!updateAction.parse(data, cursor)) {
            return false;
        }
        cursor += UpdateActionField.BYTE_LENGTH;
        if (!statFlags.parse(data, cursor)) {
            return false;
        }
        cursor += StatFlagsField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tsRecv.encode(data, cursor);
        cursor = tsRef.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = sequence.encode(data, cursor);
        cursor = tsInDelta.encode(data, cursor);
        cursor = statType.encode(data, cursor);
        cursor = channel.encode(data, cursor);
        cursor = updateAction.encode(data, cursor);
        cursor = statFlags.encode(data, cursor);
        if (buffer != null && buffer.length >= 48) {
            System.arraycopy(buffer, 42, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
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
            case "TsRecv" -> Optional.of(tsRecv);
            case "TsRef" -> Optional.of(tsRef);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "Sequence" -> Optional.of(sequence);
            case "TsInDelta" -> Optional.of(tsInDelta);
            case "StatType" -> Optional.of(statType);
            case "Channel" -> Optional.of(channel);
            case "UpdateAction" -> Optional.of(updateAction);
            case "StatFlags" -> Optional.of(statFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StatMsg message)) {
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
        if (!(other instanceof StatMsg message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
