package omi.lseg.turquoise.recovery.gtp.v24_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.CrossIdField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.CrossTypeField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.ExecutedSizeField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.InstrumentField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.PriceField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.SourceVenueField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.TimestampField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.TradeFlagsField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.TradeIdField;
import omi.lseg.turquoise.recovery.gtp.v24_4.fields.TransactionTimeField;
import omi.lseg.turquoise.recovery.gtp.v24_4.types.Field;
import omi.lseg.turquoise.recovery.gtp.v24_4.types.Message;
import omi.lseg.turquoise.recovery.gtp.v24_4.types.PrintOptions;

/**
 * Represents the TradeCrossMessage message from the Recovery protocol.
 *
 * <p>Sent to indicate a cross trade execution</p>
 */
public final class TradeCrossMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 80;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Cross Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 42, 8 };

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Transaction execution timestamp as reported by the upstream system
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Mandatory field if Request Level = 1. Not considered for other Request Levels.
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * Total executed quantity.
     */
    private final ExecutedSizeField executedSize = new ExecutedSizeField();

    /**
     * GTP Instrument identifier if Request Level is 0. Blank if not.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Limit price of the order
     */
    private final PriceField price = new PriceField();

    /**
     * Unique identifier of the trade.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * The unique ID of the BTF Order.
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * The type of the BTF Order:
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * Trade Flags
     */
    private final TradeFlagsField tradeFlags = new TradeFlagsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, transactionTime, sourceVenue, executedSize, instrument, price, tradeId, crossId, crossType, tradeFlags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the message was generated.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Transaction execution timestamp as reported by the upstream system
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Mandatory field if Request Level = 1. Not considered for other Request Levels.
     *
     * @return the SourceVenue field
     */
    public SourceVenueField sourceVenue() {
        return sourceVenue;
    }

    /**
     * Total executed quantity.
     *
     * @return the ExecutedSize field
     */
    public ExecutedSizeField executedSize() {
        return executedSize;
    }

    /**
     * GTP Instrument identifier if Request Level is 0. Blank if not.
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * Limit price of the order
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Unique identifier of the trade.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * The unique ID of the BTF Order.
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
    }

    /**
     * The type of the BTF Order:
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * Trade Flags
     *
     * @return the TradeFlags field
     */
    public TradeFlagsField tradeFlags() {
        return tradeFlags;
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
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!sourceVenue.parse(data, cursor)) {
            return false;
        }
        cursor += SourceVenueField.BYTE_LENGTH;
        if (!executedSize.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedSizeField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        cursor += 8; // padding
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!crossId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIdField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        return tradeFlags.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = transactionTime.encode(data, cursor);
        cursor = sourceVenue.encode(data, cursor);
        cursor = executedSize.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = price.encode(data, cursor);
        if (buffer != null && buffer.length >= 50) {
            System.arraycopy(buffer, 42, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = tradeId.encode(data, cursor);
        cursor = crossId.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = tradeFlags.encode(data, cursor);
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
            case "TransactionTime" -> Optional.of(transactionTime);
            case "SourceVenue" -> Optional.of(sourceVenue);
            case "ExecutedSize" -> Optional.of(executedSize);
            case "Instrument" -> Optional.of(instrument);
            case "Price" -> Optional.of(price);
            case "TradeId" -> Optional.of(tradeId);
            case "CrossId" -> Optional.of(crossId);
            case "CrossType" -> Optional.of(crossType);
            case "TradeFlags" -> Optional.of(tradeFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCrossMessage message)) {
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
        if (!(other instanceof TradeCrossMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
