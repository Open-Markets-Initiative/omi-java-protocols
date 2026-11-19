package omi.nasdaq.nsmequities.level2.itch.v2_0_2026.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.level2.itch.v2_0_2026.fields.MarketSideField;
import omi.nasdaq.nsmequities.level2.itch.v2_0_2026.fields.MpidField;
import omi.nasdaq.nsmequities.level2.itch.v2_0_2026.fields.ParticipantSharesField;
import omi.nasdaq.nsmequities.level2.itch.v2_0_2026.fields.PriceField;
import omi.nasdaq.nsmequities.level2.itch.v2_0_2026.fields.StockField;
import omi.nasdaq.nsmequities.level2.itch.v2_0_2026.fields.TimestampField;
import omi.nasdaq.nsmequities.level2.itch.v2_0_2026.fields.TrackingNumberField;
import omi.nasdaq.nsmequities.level2.itch.v2_0_2026.types.Field;
import omi.nasdaq.nsmequities.level2.itch.v2_0_2026.types.Message;
import omi.nasdaq.nsmequities.level2.itch.v2_0_2026.types.PrintOptions;

/**
 * Represents the MarketParticipantBidAskUpdateMessage message from the Level2 protocol.
 *
 * <p>Provides top-of-file bid/ask updates for each registered Nasdaq market participant</p>
 */
public final class MarketParticipantBidAskUpdateMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'U';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 29;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Participant Bid Ask Update Message";

    /**
     * Nasdaq internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Time at which the Operational Halt message was generated
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Denotes the side of the market associated with the price level update
     */
    private final MarketSideField marketSide = new MarketSideField();

    /**
     * Reflects the current number of shares displayed by this participant at this price level
     */
    private final ParticipantSharesField participantShares = new ParticipantSharesField();

    /**
     * Denotes the security symbol for the issue in the Nasdaq execution system
     */
    private final StockField stock = new StockField();

    /**
     * Reflects the price associated with the update
     */
    private final PriceField price = new PriceField();

    /**
     * Denotes the market participant identifier for which the position message is being generated
     */
    private final MpidField mpid = new MpidField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(trackingNumber, timestampField, marketSide, participantShares, stock, price, mpid);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nasdaq internal tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Time at which the Operational Halt message was generated
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Denotes the side of the market associated with the price level update
     *
     * @return the MarketSide field
     */
    public MarketSideField marketSide() {
        return marketSide;
    }

    /**
     * Reflects the current number of shares displayed by this participant at this price level
     *
     * @return the ParticipantShares field
     */
    public ParticipantSharesField participantShares() {
        return participantShares;
    }

    /**
     * Denotes the security symbol for the issue in the Nasdaq execution system
     *
     * @return the Stock field
     */
    public StockField stock() {
        return stock;
    }

    /**
     * Reflects the price associated with the update
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Denotes the market participant identifier for which the position message is being generated
     *
     * @return the Mpid field
     */
    public MpidField mpid() {
        return mpid;
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
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!marketSide.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSideField.BYTE_LENGTH;
        if (!participantShares.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantSharesField.BYTE_LENGTH;
        if (!stock.parse(data, cursor)) {
            return false;
        }
        cursor += StockField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        return mpid.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = marketSide.encode(data, cursor);
        cursor = participantShares.encode(data, cursor);
        cursor = stock.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = mpid.encode(data, cursor);
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
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "MarketSide" -> Optional.of(marketSide);
            case "ParticipantShares" -> Optional.of(participantShares);
            case "Stock" -> Optional.of(stock);
            case "Price" -> Optional.of(price);
            case "Mpid" -> Optional.of(mpid);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketParticipantBidAskUpdateMessage message)) {
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
        if (!(other instanceof MarketParticipantBidAskUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
