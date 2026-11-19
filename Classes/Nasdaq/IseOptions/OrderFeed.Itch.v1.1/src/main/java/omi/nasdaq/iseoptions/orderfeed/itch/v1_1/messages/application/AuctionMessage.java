package omi.nasdaq.iseoptions.orderfeed.itch.v1_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.AuctionEventField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.AuctionIdField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.CmtaField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.ExecFlagField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.GiveupField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.NumberOfResponsesField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.OptionIdField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.OrderCapacityField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.OrderTypeField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.OwnerIdField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.PriceField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.SideField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.SizeField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.TimestampField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.groups.AuctionResponseEntry;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.groups.AuctionResponseList;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.types.Field;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.types.Message;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.types.PrintOptions;

/**
 * Represents the AuctionMessage message from the OrderFeed protocol.
 *
 * <p>This message is used to announce auctions. The start of auction is announced, followed by possible updates on the auction, and announcing the end of the auction.</p>
 */
public final class AuctionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'A';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 46;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Message";

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Option ID for this option, assigned daily, valid for trading day.
     */
    private final OptionIdField optionId = new OptionIdField();

    /**
     * Integer which uniquely identifies the auction.
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * ‘M’ = Market ‘L’ = Limit
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * Side value
     */
    private final SideField side = new SideField();

    /**
     * Price of the order in fixed point format with 6 whole number places followed by 4 decimal digits. For market orders, the price is zero. Hidden prices are set to zero.
     */
    private final PriceField price = new PriceField();

    /**
     * Size of the order (zero if hidden)
     */
    private final SizeField size = new SizeField();

    /**
     * Exec Flag value
     */
    private final ExecFlagField execFlag = new ExecFlagField();

    /**
     * Order capacity value
     */
    private final OrderCapacityField orderCapacity = new OrderCapacityField();

    /**
     * Spaces when not set
     */
    private final OwnerIdField ownerId = new OwnerIdField();

    /**
     * Spaces when not set
     */
    private final GiveupField giveup = new GiveupField();

    /**
     * Spaces when not set
     */
    private final CmtaField cmta = new CmtaField();

    /**
     * ‘S’ = Start ‘U’ = Auction Update ‘E’ = End of Auction
     */
    private final AuctionEventField auctionEvent = new AuctionEventField();

    /**
     * Number of auction Responses. Next two fields repeat that number of times. Allowable values for this field are 0 or 1.
     */
    private final NumberOfResponsesField numberOfResponses = new NumberOfResponsesField();

    /**
     * Auction Response Information
     */
    private final AuctionResponseList auctionResponse = new AuctionResponseList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, optionId, auctionId, orderType, side, price, size, execFlag, orderCapacity, ownerId, giveup, cmta, auctionEvent, numberOfResponses);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Option ID for this option, assigned daily, valid for trading day.
     *
     * @return the OptionId field
     */
    public OptionIdField optionId() {
        return optionId;
    }

    /**
     * Integer which uniquely identifies the auction.
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * ‘M’ = Market ‘L’ = Limit
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * Side value
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Price of the order in fixed point format with 6 whole number places followed by 4 decimal digits. For market orders, the price is zero. Hidden prices are set to zero.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Size of the order (zero if hidden)
     *
     * @return the Size field
     */
    public SizeField size() {
        return size;
    }

    /**
     * Exec Flag value
     *
     * @return the ExecFlag field
     */
    public ExecFlagField execFlag() {
        return execFlag;
    }

    /**
     * Order capacity value
     *
     * @return the OrderCapacity field
     */
    public OrderCapacityField orderCapacity() {
        return orderCapacity;
    }

    /**
     * Spaces when not set
     *
     * @return the OwnerId field
     */
    public OwnerIdField ownerId() {
        return ownerId;
    }

    /**
     * Spaces when not set
     *
     * @return the Giveup field
     */
    public GiveupField giveup() {
        return giveup;
    }

    /**
     * Spaces when not set
     *
     * @return the Cmta field
     */
    public CmtaField cmta() {
        return cmta;
    }

    /**
     * ‘S’ = Start ‘U’ = Auction Update ‘E’ = End of Auction
     *
     * @return the AuctionEvent field
     */
    public AuctionEventField auctionEvent() {
        return auctionEvent;
    }

    /**
     * Number of auction Responses. Next two fields repeat that number of times. Allowable values for this field are 0 or 1.
     *
     * @return the NumberOfResponses field
     */
    public NumberOfResponsesField numberOfResponses() {
        return numberOfResponses;
    }

    /**
     * Auction Response Information
     *
     * <p>Encode writes this list's size to the NumberOfResponses field.</p>
     *
     * @return the AuctionResponse entries
     */
    public AuctionResponseList auctionResponse() {
        return auctionResponse;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + auctionResponse.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!optionId.parse(data, cursor)) {
            return false;
        }
        cursor += OptionIdField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!size.parse(data, cursor)) {
            return false;
        }
        cursor += SizeField.BYTE_LENGTH;
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
        if (!auctionEvent.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionEventField.BYTE_LENGTH;
        if (!numberOfResponses.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfResponsesField.BYTE_LENGTH;
        if (!auctionResponse.parse(data, cursor, end, numberOfResponses.value())) {
            return false;
        }
        cursor += auctionResponse.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (auctionResponse.size() > 255) {
            throw new IllegalStateException("auctionResponse holds " + auctionResponse.size() + " entries, more than its count field can state");
        }
        numberOfResponses.value((short) auctionResponse.size());
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = optionId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = size.encode(data, cursor);
        cursor = execFlag.encode(data, cursor);
        cursor = orderCapacity.encode(data, cursor);
        cursor = ownerId.encode(data, cursor);
        cursor = giveup.encode(data, cursor);
        cursor = cmta.encode(data, cursor);
        cursor = auctionEvent.encode(data, cursor);
        cursor = numberOfResponses.encode(data, cursor);
        cursor = auctionResponse.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        auctionResponse.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfResponses && !field.isRecognized()) {
                return false;
            }
        }
        return auctionResponse.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfResponses && !field.isValid()) {
                return false;
            }
        }
        if (!auctionResponse.isValid()) {
            return false;
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
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!optionId.isDecoded()) {
            return Optional.of(optionId);
        }
        if (!auctionId.isDecoded()) {
            return Optional.of(auctionId);
        }
        if (!orderType.isDecoded()) {
            return Optional.of(orderType);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!size.isDecoded()) {
            return Optional.of(size);
        }
        if (!execFlag.isDecoded()) {
            return Optional.of(execFlag);
        }
        if (!orderCapacity.isDecoded()) {
            return Optional.of(orderCapacity);
        }
        if (!ownerId.isDecoded()) {
            return Optional.of(ownerId);
        }
        if (!giveup.isDecoded()) {
            return Optional.of(giveup);
        }
        if (!cmta.isDecoded()) {
            return Optional.of(cmta);
        }
        if (!auctionEvent.isDecoded()) {
            return Optional.of(auctionEvent);
        }
        if (!numberOfResponses.isDecoded()) {
            return Optional.of(numberOfResponses);
        }
        if (!auctionResponse.isDecoded()) {
            return Optional.of(auctionResponse.failedEntry().flatMap(AuctionResponseEntry::failedAt).orElse(numberOfResponses));
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
            case "OptionId" -> Optional.of(optionId);
            case "AuctionId" -> Optional.of(auctionId);
            case "OrderType" -> Optional.of(orderType);
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "Size" -> Optional.of(size);
            case "ExecFlag" -> Optional.of(execFlag);
            case "OrderCapacity" -> Optional.of(orderCapacity);
            case "OwnerId" -> Optional.of(ownerId);
            case "Giveup" -> Optional.of(giveup);
            case "Cmta" -> Optional.of(cmta);
            case "AuctionEvent" -> Optional.of(auctionEvent);
            case "NumberOfResponses" -> Optional.of(numberOfResponses);
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
        changed.addAll(auctionResponse.diffFields(message.auctionResponse));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            auctionResponse.toFormattedString(builder, options);
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
        auctionResponse.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && auctionResponse.equals(message.auctionResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, auctionResponse);
    }
}
