package omi.nasdaq.ntxequities.totalview.itch.v5_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.ntxequities.totalview.itch.v5_0.fields.MarketMakerModeField;
import omi.nasdaq.ntxequities.totalview.itch.v5_0.fields.MarketParticipantStateField;
import omi.nasdaq.ntxequities.totalview.itch.v5_0.fields.MpidField;
import omi.nasdaq.ntxequities.totalview.itch.v5_0.fields.PrimaryMarketMakerField;
import omi.nasdaq.ntxequities.totalview.itch.v5_0.fields.StockField;
import omi.nasdaq.ntxequities.totalview.itch.v5_0.fields.StockLocateField;
import omi.nasdaq.ntxequities.totalview.itch.v5_0.fields.TimestampField;
import omi.nasdaq.ntxequities.totalview.itch.v5_0.fields.TrackingNumberField;
import omi.nasdaq.ntxequities.totalview.itch.v5_0.types.Field;
import omi.nasdaq.ntxequities.totalview.itch.v5_0.types.Message;
import omi.nasdaq.ntxequities.totalview.itch.v5_0.types.PrintOptions;

/**
 * Represents the MarketParticipantPositionMessage message from the TotalView protocol.
 *
 * <p>At the start of each trading day, Nasdaq Texas disseminates a spin of market participant position messages.</p>
 */
public final class MarketParticipantPositionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'L';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 25;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Participant Position Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Always 0
     */
    private final StockLocateField stockLocate = new StockLocateField();

    /**
     * Nasdaq Texas internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Denotes the market participant identifier for which the position message is being generated
     */
    private final MpidField mpid = new MpidField();

    /**
     * Denotes the security symbol for the issue in the Nasdaq Texas execution system.
     */
    private final StockField stock = new StockField();

    /**
     * Indicates if the market participant firm qualifies as a Primary Market Maker in accordance with Nasdaq marketplace rules
     */
    private final PrimaryMarketMakerField primaryMarketMaker = new PrimaryMarketMakerField();

    /**
     * Indicates the quoting participant's registration status in relation to SEC Rules 101 and 104 of Regulation M
     */
    private final MarketMakerModeField marketMakerMode = new MarketMakerModeField();

    /**
     * Indicates the market participant's current registration status in the issue
     */
    private final MarketParticipantStateField marketParticipantState = new MarketParticipantStateField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(stockLocate, trackingNumber, timestampField, mpid, stock, primaryMarketMaker, marketMakerMode, marketParticipantState);

    private byte[] buffer;

    private int bufferOffset;

    private boolean decoded;

    /**
     * Always 0
     *
     * @return the StockLocate field
     */
    public StockLocateField stockLocate() {
        return stockLocate;
    }

    /**
     * Nasdaq Texas internal tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Denotes the market participant identifier for which the position message is being generated
     *
     * @return the Mpid field
     */
    public MpidField mpid() {
        return mpid;
    }

    /**
     * Denotes the security symbol for the issue in the Nasdaq Texas execution system.
     *
     * @return the Stock field
     */
    public StockField stock() {
        return stock;
    }

    /**
     * Indicates if the market participant firm qualifies as a Primary Market Maker in accordance with Nasdaq marketplace rules
     *
     * @return the PrimaryMarketMaker field
     */
    public PrimaryMarketMakerField primaryMarketMaker() {
        return primaryMarketMaker;
    }

    /**
     * Indicates the quoting participant's registration status in relation to SEC Rules 101 and 104 of Regulation M
     *
     * @return the MarketMakerMode field
     */
    public MarketMakerModeField marketMakerMode() {
        return marketMakerMode;
    }

    /**
     * Indicates the market participant's current registration status in the issue
     *
     * @return the MarketParticipantState field
     */
    public MarketParticipantStateField marketParticipantState() {
        return marketParticipantState;
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
     * <p>Padding carries no value: decode advances over it and encode writes it as zero. Use this to check that a received message's padding is zero where the specification requires it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        clear();
        this.buffer = data;
        this.bufferOffset = offset;

        if (offset < 0 || offset + BYTE_LENGTH > data.length) {
            return false;
        }

        int cursor = offset;
        if (!stockLocate.parse(data, cursor)) {
            return false;
        }
        cursor += StockLocateField.BYTE_LENGTH;
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!mpid.parse(data, cursor)) {
            return false;
        }
        cursor += MpidField.BYTE_LENGTH;
        if (!stock.parse(data, cursor)) {
            return false;
        }
        cursor += StockField.BYTE_LENGTH;
        if (!primaryMarketMaker.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryMarketMakerField.BYTE_LENGTH;
        if (!marketMakerMode.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMakerModeField.BYTE_LENGTH;
        if (!marketParticipantState.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantStateField.BYTE_LENGTH;

        this.decoded = true;
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = stockLocate.encode(data, cursor);
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = mpid.encode(data, cursor);
        cursor = stock.encode(data, cursor);
        cursor = primaryMarketMaker.encode(data, cursor);
        cursor = marketMakerMode.encode(data, cursor);
        cursor = marketParticipantState.encode(data, cursor);
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
        this.bufferOffset = 0;
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
        int end = Math.min(buffer.length, bufferOffset + BYTE_LENGTH);
        int start = Math.min(Math.max(bufferOffset, 0), end);
        return Optional.of(Arrays.copyOfRange(buffer, start, end));
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
            case "StockLocate" -> Optional.of(stockLocate);
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "Mpid" -> Optional.of(mpid);
            case "Stock" -> Optional.of(stock);
            case "PrimaryMarketMaker" -> Optional.of(primaryMarketMaker);
            case "MarketMakerMode" -> Optional.of(marketMakerMode);
            case "MarketParticipantState" -> Optional.of(marketParticipantState);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketParticipantPositionMessage message)) {
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
        if (!(other instanceof MarketParticipantPositionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
