package omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.AuctionDurationField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.AuctionEventField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.AuctionIdField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.AuctionTypeField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.CmtaField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.ExecFlagField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.GiveupField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.NumberOfFlexDacLegsField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.OrderCapacityField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.OrderTypeField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.OwnerIdField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.PriceField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.ResponsePriceField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.ResponseSizeField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.ScopeField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.SideField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.SizeField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.StrategyIdField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.TimestampField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.fields.TrackingNumberField;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.groups.FlexDacLegInformationEntry;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.groups.FlexDacLegInformationList;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.types.Field;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.types.Message;
import omi.nasdaq.mrxoptions.spreadorders.itch.v2_1.types.PrintOptions;

/**
 * Represents the ComplexStrategyAuctionMessage message from the SpreadOrders protocol.
 *
 * <p>This message is used to announce strategy auctions. The start of auction is announced, followed by possible updates on the auction, and announcing the end of the auction.</p>
 */
public final class ComplexStrategyAuctionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'a';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 68;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Strategy Auction Message";

    /**
     * Internal system tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Option ID assigned daily. Valid for trading day
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * Uniquely identifies the Auction for the trading day.
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Type of Auction
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * User defined for Auction Duration. In milliseconds between 3,000 and 300,000
     */
    private final AuctionDurationField auctionDuration = new AuctionDurationField();

    /**
     * Auction Event
     */
    private final AuctionEventField auctionEvent = new AuctionEventField();

    /**
     * Indicates the type of order
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * Indicates the side of the order
     */
    private final SideField side = new SideField();

    /**
     * Price in fixed point format with 6 whole number places followed by 4 decimal digits.
     */
    private final PriceField price = new PriceField();

    /**
     * Size
     */
    private final SizeField size = new SizeField();

    /**
     * Exec Flag
     */
    private final ExecFlagField execFlag = new ExecFlagField();

    /**
     * Indicates the order capacity
     */
    private final OrderCapacityField orderCapacity = new OrderCapacityField();

    /**
     * Scope
     */
    private final ScopeField scope = new ScopeField();

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
     * Price of the aggregated auction responses in fixed point format with 6 whole number places followed by 4 decimal digits.
     */
    private final ResponsePriceField responsePrice = new ResponsePriceField();

    /**
     * Size of the aggregated auction responses at the best price (zero if not shown).
     */
    private final ResponseSizeField responseSize = new ResponseSizeField();

    /**
     * Number of Flex DAC legs in the strategy Legs
     */
    private final NumberOfFlexDacLegsField numberOfFlexDacLegs = new NumberOfFlexDacLegsField();

    /**
     * Flex DAC leg information
     */
    private final FlexDacLegInformationList flexDacLegInformation = new FlexDacLegInformationList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(trackingNumber, timestampField, strategyId, auctionId, auctionType, auctionDuration, auctionEvent, orderType, side, price, size, execFlag, orderCapacity, scope, ownerId, giveup, cmta, responsePrice, responseSize, numberOfFlexDacLegs);

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
     * Option ID assigned daily. Valid for trading day
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
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
     * Type of Auction
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * User defined for Auction Duration. In milliseconds between 3,000 and 300,000
     *
     * @return the AuctionDuration field
     */
    public AuctionDurationField auctionDuration() {
        return auctionDuration;
    }

    /**
     * Auction Event
     *
     * @return the AuctionEvent field
     */
    public AuctionEventField auctionEvent() {
        return auctionEvent;
    }

    /**
     * Indicates the type of order
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * Indicates the side of the order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Price in fixed point format with 6 whole number places followed by 4 decimal digits.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Size
     *
     * @return the Size field
     */
    public SizeField size() {
        return size;
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
     * Indicates the order capacity
     *
     * @return the OrderCapacity field
     */
    public OrderCapacityField orderCapacity() {
        return orderCapacity;
    }

    /**
     * Scope
     *
     * @return the Scope field
     */
    public ScopeField scope() {
        return scope;
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

    /**
     * Price of the aggregated auction responses in fixed point format with 6 whole number places followed by 4 decimal digits.
     *
     * @return the ResponsePrice field
     */
    public ResponsePriceField responsePrice() {
        return responsePrice;
    }

    /**
     * Size of the aggregated auction responses at the best price (zero if not shown).
     *
     * @return the ResponseSize field
     */
    public ResponseSizeField responseSize() {
        return responseSize;
    }

    /**
     * Number of Flex DAC legs in the strategy Legs
     *
     * @return the NumberOfFlexDacLegs field
     */
    public NumberOfFlexDacLegsField numberOfFlexDacLegs() {
        return numberOfFlexDacLegs;
    }

    /**
     * Flex DAC leg information
     *
     * <p>Encode writes this list's size to the NumberOfFlexDacLegs field.</p>
     *
     * @return the FlexDacLegInformation entries
     */
    public FlexDacLegInformationList flexDacLegInformation() {
        return flexDacLegInformation;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + flexDacLegInformation.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 2;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 6;
        cursor += 6;
        cursor += 6;
        cursor += 4;
        cursor += 4;
        runs.add(cursor).add(4);
        cursor += 4;
        cursor += 1;
        cursor = flexDacLegInformation.padding(runs, cursor);
        return cursor;
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
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
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
        if (!auctionDuration.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionDurationField.BYTE_LENGTH;
        if (!auctionEvent.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionEventField.BYTE_LENGTH;
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
        if (!scope.parse(data, cursor)) {
            return false;
        }
        cursor += ScopeField.BYTE_LENGTH;
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
        if (!responsePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ResponsePriceField.BYTE_LENGTH;
        if (!responseSize.parse(data, cursor)) {
            return false;
        }
        cursor += ResponseSizeField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!numberOfFlexDacLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfFlexDacLegsField.BYTE_LENGTH;
        if (!flexDacLegInformation.parse(data, cursor, end, numberOfFlexDacLegs.value())) {
            return false;
        }
        cursor += flexDacLegInformation.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (flexDacLegInformation.size() > 255) {
            throw new IllegalStateException("flexDacLegInformation holds " + flexDacLegInformation.size() + " entries, more than its count field can state");
        }
        numberOfFlexDacLegs.value((short) flexDacLegInformation.size());
        int cursor = offset;
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = auctionDuration.encode(data, cursor);
        cursor = auctionEvent.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = size.encode(data, cursor);
        cursor = execFlag.encode(data, cursor);
        cursor = orderCapacity.encode(data, cursor);
        cursor = scope.encode(data, cursor);
        cursor = ownerId.encode(data, cursor);
        cursor = giveup.encode(data, cursor);
        cursor = cmta.encode(data, cursor);
        cursor = responsePrice.encode(data, cursor);
        cursor = responseSize.encode(data, cursor);
        if (buffer != null && buffer.length >= 67) {
            System.arraycopy(buffer, 63, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = numberOfFlexDacLegs.encode(data, cursor);
        cursor = flexDacLegInformation.encode(data, cursor);
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
        flexDacLegInformation.clear();
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
            if (field != numberOfFlexDacLegs && !field.isRecognized()) {
                return false;
            }
        }
        return flexDacLegInformation.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfFlexDacLegs && !field.isValid()) {
                return false;
            }
        }
        if (!flexDacLegInformation.isValid()) {
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
        if (!trackingNumber.isDecoded()) {
            return Optional.of(trackingNumber);
        }
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!strategyId.isDecoded()) {
            return Optional.of(strategyId);
        }
        if (!auctionId.isDecoded()) {
            return Optional.of(auctionId);
        }
        if (!auctionType.isDecoded()) {
            return Optional.of(auctionType);
        }
        if (!auctionDuration.isDecoded()) {
            return Optional.of(auctionDuration);
        }
        if (!auctionEvent.isDecoded()) {
            return Optional.of(auctionEvent);
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
        if (!scope.isDecoded()) {
            return Optional.of(scope);
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
        if (!responsePrice.isDecoded()) {
            return Optional.of(responsePrice);
        }
        if (!responseSize.isDecoded()) {
            return Optional.of(responseSize);
        }
        if (!numberOfFlexDacLegs.isDecoded()) {
            return Optional.of(numberOfFlexDacLegs);
        }
        if (!flexDacLegInformation.isDecoded()) {
            return Optional.of(flexDacLegInformation.failedEntry().flatMap(FlexDacLegInformationEntry::failedAt).orElse(numberOfFlexDacLegs));
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
            case "StrategyId" -> Optional.of(strategyId);
            case "AuctionId" -> Optional.of(auctionId);
            case "AuctionType" -> Optional.of(auctionType);
            case "AuctionDuration" -> Optional.of(auctionDuration);
            case "AuctionEvent" -> Optional.of(auctionEvent);
            case "OrderType" -> Optional.of(orderType);
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "Size" -> Optional.of(size);
            case "ExecFlag" -> Optional.of(execFlag);
            case "OrderCapacity" -> Optional.of(orderCapacity);
            case "Scope" -> Optional.of(scope);
            case "OwnerId" -> Optional.of(ownerId);
            case "Giveup" -> Optional.of(giveup);
            case "Cmta" -> Optional.of(cmta);
            case "ResponsePrice" -> Optional.of(responsePrice);
            case "ResponseSize" -> Optional.of(responseSize);
            case "NumberOfFlexDacLegs" -> Optional.of(numberOfFlexDacLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexStrategyAuctionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(flexDacLegInformation.diffFields(message.flexDacLegInformation));
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
            flexDacLegInformation.toFormattedString(builder, options);
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
        flexDacLegInformation.toFormattedString(builder, nested);
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
        if (!(other instanceof ComplexStrategyAuctionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && flexDacLegInformation.equals(message.flexDacLegInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, flexDacLegInformation);
    }
}
