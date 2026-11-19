package omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.AuctionIdField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.AuctionSideField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.AuctionTypeField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.DebitOrCreditField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.PriceField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.StrategyIdField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.VolumeField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.structs.Timestamp;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.types.Field;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.types.Message;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.types.PrintOptions;

/**
 * Represents the ComplexAuctionNotificationMessage message from the Orders protocol.
 *
 * <p>When a Complex Order Live Auction (COLA) or PIXL/Solicitation auction starts for a strategy of an underlying, a COLA/PIXL/Solicitation notification message containing the auction information will be sent.</p>
 */
public final class ComplexAuctionNotificationMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'C';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Auction Notification Message";

    /**
     * PHLX Strategy ID assigned daily, valid while there are any open complex orders for the day
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * Uniquely identifies the Auction for the trading day. Presently the Auction ID will be zero for non-PIXL auctions.
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Type of Auction:
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Price at which auction is started. For PIXL auctions, price is zero. The price at which an exposed order is available for execution.
     */
    private final PriceField price = new PriceField();

    /**
     * Indicates the side of the auction:
     */
    private final AuctionSideField auctionSide = new AuctionSideField();

    /**
     * Price Debit or Credit value
     */
    private final DebitOrCreditField debitOrCredit = new DebitOrCreditField();

    /**
     * Total volume available in COLA/PIXL/Solicitation. This field will be 0 under certain conditions for COLA when the strategy is opening.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Time the message was sent: seconds after midnight and the nanosecond portion, U.S. Eastern Time
     */
    private final Timestamp timestampField = new Timestamp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(timestampField.fields(), List.<Field>of(strategyId), List.<Field>of(auctionId), List.<Field>of(auctionType), List.<Field>of(price), List.<Field>of(auctionSide), List.<Field>of(debitOrCredit), List.<Field>of(volume)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * PHLX Strategy ID assigned daily, valid while there are any open complex orders for the day
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * Uniquely identifies the Auction for the trading day. Presently the Auction ID will be zero for non-PIXL auctions.
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * Type of Auction:
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Price at which auction is started. For PIXL auctions, price is zero. The price at which an exposed order is available for execution.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Indicates the side of the auction:
     *
     * @return the AuctionSide field
     */
    public AuctionSideField auctionSide() {
        return auctionSide;
    }

    /**
     * Price Debit or Credit value
     *
     * @return the DebitOrCredit field
     */
    public DebitOrCreditField debitOrCredit() {
        return debitOrCredit;
    }

    /**
     * Total volume available in COLA/PIXL/Solicitation. This field will be 0 under certain conditions for COLA when the strategy is opening.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Time the message was sent: seconds after midnight and the nanosecond portion, U.S. Eastern Time
     *
     * @return the Timestamp record
     */
    public Timestamp timestampField() {
        return timestampField;
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
        if (!timestampField.parseFrom(data, cursor, end - 19)) {
            return false;
        }
        cursor += timestampField.byteLength();
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!auctionSide.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionSideField.BYTE_LENGTH;
        if (!debitOrCredit.parse(data, cursor)) {
            return false;
        }
        cursor += DebitOrCreditField.BYTE_LENGTH;
        return volume.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = auctionSide.encode(data, cursor);
        cursor = debitOrCredit.encode(data, cursor);
        cursor = volume.encode(data, cursor);
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
        timestampField.clear();
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
            case "StrategyId" -> Optional.of(strategyId);
            case "AuctionId" -> Optional.of(auctionId);
            case "AuctionType" -> Optional.of(auctionType);
            case "Price" -> Optional.of(price);
            case "AuctionSide" -> Optional.of(auctionSide);
            case "DebitOrCredit" -> Optional.of(debitOrCredit);
            case "Volume" -> Optional.of(volume);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexAuctionNotificationMessage message)) {
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
        if (!(other instanceof ComplexAuctionNotificationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
