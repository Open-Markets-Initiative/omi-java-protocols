package omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.AuctionDurationField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.AuctionEventField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.AuctionIdField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.AuctionTypeField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.CmtaField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.ExecFlagField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.GiveupField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.ImbalanceVolumeField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.InstrumentIdField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.OrderCapacityField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.OwnerIdField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.PriceField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.QuantityField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.SideField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.TimestampField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.fields.TrackingNumberField;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.types.Field;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.types.Message;
import omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.types.PrintOptions;

/**
 * Represents the AuctionMessage message from the OrderFeed protocol.
 *
 * <p>This message is used to announce auctions, including the opening auction.</p>
 */
public final class AuctionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'J';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 73;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 57, 16 };

    /**
     * Internal system tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Integer ID of the option, as defined in the Options Directory Message.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Uniquely identifies the Auction for the trading day.
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Auction Type
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * User defined for Auction Duration. In milliseconds between 3,000 and 300,000.
     */
    private final AuctionDurationField auctionDuration = new AuctionDurationField();

    /**
     * AuctionEvent
     */
    private final AuctionEventField auctionEvent = new AuctionEventField();

    /**
     * Auction Quantity. Opening auction will present paired quantity in this field.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Price for the auction; hidden prices are set to zero.
     */
    private final PriceField price = new PriceField();

    /**
     * Imbalance volume for opening auction. Will be 0 for other auctions
     */
    private final ImbalanceVolumeField imbalanceVolume = new ImbalanceVolumeField();

    /**
     * Exec Flag
     */
    private final ExecFlagField execFlag = new ExecFlagField();

    /**
     * Order Capacity
     */
    private final OrderCapacityField orderCapacity = new OrderCapacityField();

    /**
     * Attributable Order may provide Firm ID to disseminate with order; Spaces when not set
     */
    private final OwnerIdField ownerId = new OwnerIdField();

    /**
     * Attributable Order may provide Give-up to disseminate with order; Spaces when not set
     */
    private final GiveupField giveup = new GiveupField();

    /**
     * Attributable Order may provide CMTA to disseminate with order; Spaces when not set
     */
    private final CmtaField cmta = new CmtaField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(trackingNumber, timestampField, instrumentId, auctionId, auctionType, auctionDuration, auctionEvent, quantity, side, price, imbalanceVolume, execFlag, orderCapacity, ownerId, giveup, cmta);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Internal system tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Nanoseconds since midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Integer ID of the option, as defined in the Options Directory Message.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Uniquely identifies the Auction for the trading day.
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * Auction Type
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * User defined for Auction Duration. In milliseconds between 3,000 and 300,000.
     *
     * @return the AuctionDuration field
     */
    public AuctionDurationField auctionDuration() {
        return auctionDuration;
    }

    /**
     * AuctionEvent
     *
     * @return the AuctionEvent field
     */
    public AuctionEventField auctionEvent() {
        return auctionEvent;
    }

    /**
     * Auction Quantity. Opening auction will present paired quantity in this field.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Price for the auction; hidden prices are set to zero.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Imbalance volume for opening auction. Will be 0 for other auctions
     *
     * @return the ImbalanceVolume field
     */
    public ImbalanceVolumeField imbalanceVolume() {
        return imbalanceVolume;
    }

    /**
     * Exec Flag
     *
     * @return the ExecFlag field
     */
    public ExecFlagField execFlag() {
        return execFlag;
    }

    /**
     * Order Capacity
     *
     * @return the OrderCapacity field
     */
    public OrderCapacityField orderCapacity() {
        return orderCapacity;
    }

    /**
     * Attributable Order may provide Firm ID to disseminate with order; Spaces when not set
     *
     * @return the OwnerId field
     */
    public OwnerIdField ownerId() {
        return ownerId;
    }

    /**
     * Attributable Order may provide Give-up to disseminate with order; Spaces when not set
     *
     * @return the Giveup field
     */
    public GiveupField giveup() {
        return giveup;
    }

    /**
     * Attributable Order may provide CMTA to disseminate with order; Spaces when not set
     *
     * @return the Cmta field
     */
    public CmtaField cmta() {
        return cmta;
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
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!auctionDuration.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionDurationField.BYTE_LENGTH;
        if (!auctionEvent.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionEventField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!imbalanceVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceVolumeField.BYTE_LENGTH;
        if (!execFlag.parse(data, cursor)) {
            return false;
        }
        cursor += ExecFlagField.BYTE_LENGTH;
        if (!orderCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += OrderCapacityField.BYTE_LENGTH;
        if (!ownerId.parse(data, cursor)) {
            return false;
        }
        cursor += OwnerIdField.BYTE_LENGTH;
        if (!giveup.parse(data, cursor)) {
            return false;
        }
        cursor += GiveupField.BYTE_LENGTH;
        if (!cmta.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = auctionDuration.encode(data, cursor);
        cursor = auctionEvent.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = imbalanceVolume.encode(data, cursor);
        cursor = execFlag.encode(data, cursor);
        cursor = orderCapacity.encode(data, cursor);
        cursor = ownerId.encode(data, cursor);
        cursor = giveup.encode(data, cursor);
        cursor = cmta.encode(data, cursor);
        if (buffer != null && buffer.length >= 73) {
            System.arraycopy(buffer, 57, data, cursor, 16); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 16, (byte) 0); // padding
        }
        cursor += 16;
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "AuctionId" -> Optional.of(auctionId);
            case "AuctionType" -> Optional.of(auctionType);
            case "AuctionDuration" -> Optional.of(auctionDuration);
            case "AuctionEvent" -> Optional.of(auctionEvent);
            case "Quantity" -> Optional.of(quantity);
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "ImbalanceVolume" -> Optional.of(imbalanceVolume);
            case "ExecFlag" -> Optional.of(execFlag);
            case "OrderCapacity" -> Optional.of(orderCapacity);
            case "OwnerId" -> Optional.of(ownerId);
            case "Giveup" -> Optional.of(giveup);
            case "Cmta" -> Optional.of(cmta);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AuctionMessage message)) {
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
        if (!(other instanceof AuctionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
