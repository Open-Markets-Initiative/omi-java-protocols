package omi.lseg.turquoise.level1.gtp.v24_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.turquoise.level1.gtp.v24_4.fields.AuctionTypeField;
import omi.lseg.turquoise.level1.gtp.v24_4.fields.ExecutedSizeField;
import omi.lseg.turquoise.level1.gtp.v24_4.fields.HiddenExecutionIndicatorField;
import omi.lseg.turquoise.level1.gtp.v24_4.fields.InstrumentField;
import omi.lseg.turquoise.level1.gtp.v24_4.fields.PriceField;
import omi.lseg.turquoise.level1.gtp.v24_4.fields.SourceVenueField;
import omi.lseg.turquoise.level1.gtp.v24_4.fields.TimestampField;
import omi.lseg.turquoise.level1.gtp.v24_4.fields.TradeFlagsField;
import omi.lseg.turquoise.level1.gtp.v24_4.fields.TradeIdField;
import omi.lseg.turquoise.level1.gtp.v24_4.fields.TradeQualifierField;
import omi.lseg.turquoise.level1.gtp.v24_4.fields.TradeTypeField;
import omi.lseg.turquoise.level1.gtp.v24_4.fields.TransactionTimeField;
import omi.lseg.turquoise.level1.gtp.v24_4.types.Field;
import omi.lseg.turquoise.level1.gtp.v24_4.types.Message;
import omi.lseg.turquoise.level1.gtp.v24_4.types.PrintOptions;

/**
 * Represents the TradeMessage message from the Level1 protocol.
 *
 * <p>Sent to indicate trades executed on supported markets</p>
 */
public final class TradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 63;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Message";

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
     * Execution timestamp as reported by the supported market.
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Venue from which market data is received for the instrument
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * Total executed quantity.
     */
    private final ExecutedSizeField executedSize = new ExecutedSizeField();

    /**
     * GTP Instrument identifier.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Executed price
     */
    private final PriceField price = new PriceField();

    /**
     * Unique identifier of the trade.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Type of the trade.
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * Not Applicable to Turquoise
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Trade Flags
     */
    private final TradeFlagsField tradeFlags = new TradeFlagsField();

    /**
     * For Turquoise Lit Order Book, 1[2] will be sent for execution of visible[hidden] quantities. For Turquoise Plato Order Book, it will always be set to 2 (Hidden).
     */
    private final HiddenExecutionIndicatorField hiddenExecutionIndicator = new HiddenExecutionIndicatorField();

    /**
     * Qualifier of the trade.
     */
    private final TradeQualifierField tradeQualifier = new TradeQualifierField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, transactionTime, sourceVenue, executedSize, instrument, price, tradeId, tradeType, auctionType, tradeFlags, hiddenExecutionIndicator, tradeQualifier);

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
     * Execution timestamp as reported by the supported market.
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Venue from which market data is received for the instrument
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
     * GTP Instrument identifier.
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * Executed price
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
     * Type of the trade.
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Trade Flags
     *
     * @return the TradeFlags field
     */
    public TradeFlagsField tradeFlags() {
        return tradeFlags;
    }

    /**
     * For Turquoise Lit Order Book, 1[2] will be sent for execution of visible[hidden] quantities. For Turquoise Plato Order Book, it will always be set to 2 (Hidden).
     *
     * @return the HiddenExecutionIndicator field
     */
    public HiddenExecutionIndicatorField hiddenExecutionIndicator() {
        return hiddenExecutionIndicator;
    }

    /**
     * Qualifier of the trade.
     *
     * @return the TradeQualifier field
     */
    public TradeQualifierField tradeQualifier() {
        return tradeQualifier;
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
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!tradeFlags.parse(data, cursor)) {
            return false;
        }
        cursor += TradeFlagsField.BYTE_LENGTH;
        if (!hiddenExecutionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += HiddenExecutionIndicatorField.BYTE_LENGTH;
        return tradeQualifier.parse(data, cursor);
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
        cursor = tradeType.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = tradeFlags.encode(data, cursor);
        cursor = hiddenExecutionIndicator.encode(data, cursor);
        cursor = tradeQualifier.encode(data, cursor);
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
            case "TradeType" -> Optional.of(tradeType);
            case "AuctionType" -> Optional.of(auctionType);
            case "TradeFlags" -> Optional.of(tradeFlags);
            case "HiddenExecutionIndicator" -> Optional.of(hiddenExecutionIndicator);
            case "TradeQualifier" -> Optional.of(tradeQualifier);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeMessage message)) {
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
        if (!(other instanceof TradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
