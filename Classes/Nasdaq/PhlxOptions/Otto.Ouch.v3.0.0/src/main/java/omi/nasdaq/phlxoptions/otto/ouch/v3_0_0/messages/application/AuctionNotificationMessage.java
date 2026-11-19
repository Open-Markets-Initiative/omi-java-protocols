package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AuctionDurationField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AuctionEventField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AuctionIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AuctionTypeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.BestResponsePriceField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.BestResponseSizeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.CmtaField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ExecFlagField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.FirmIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.InstrumentIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.InstrumentTypeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.NumberOfFlexDacLegsField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.OccAccountField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.OrderCapacityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.OrderTypeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PriceField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.QuantityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.SideField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.TimestampField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.groups.FlexDacLegsEntry;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.groups.FlexDacLegsList;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Field;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Message;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.PrintOptions;

/**
 * Represents the AuctionNotificationMessage message from the Otto protocol.
 *
 * <p>Auction Notification message announces that a new Auction has started in the market for Nasdaq PHLX, ISE, GEMX and MRX. Auction orders include Block, Complex Exposure, Simple Exposed order, Facilitation, Solicitation, and PIM.</p>
 */
public final class AuctionNotificationMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'n';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 73;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Notification Message";

    /**
     * Nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * A=All, O=Simple Instrument, C=Standard Combination, S=Stock Combination
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * Instrument ID, as specified by Option Directory notifications
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Identifies the Auction being responded. 0 if this order is not an auction response.
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * L=Limit, M=Market
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * B=Buy, S=Sell
     */
    private final SideField side = new SideField();

    /**
     * Limit price. Should be set to 0 if Order Type = M.
     */
    private final PriceField price = new PriceField();

    /**
     * Number of contracts
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * 0=None, 1=AON
     */
    private final ExecFlagField execFlag = new ExecFlagField();

    /**
     * See Order Capacity Field
     */
    private final OrderCapacityField orderCapacity = new OrderCapacityField();

    /**
     * Firm ID (e.g. ABCD, 123A)
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * OCC # to use for clearing (give up)
     */
    private final OccAccountField occAccount = new OccAccountField();

    /**
     * CMTA
     */
    private final CmtaField cmta = new CmtaField();

    /**
     * S=Start, U=Auction Update, E=End of Auction
     */
    private final AuctionEventField auctionEvent = new AuctionEventField();

    /**
     * See Auction Type Field
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * User defined field for Auction Duration. In milliseconds between 3,000 and 300,000. Only required for Flex auctions. Must be 0 for Non-Flex Auctions.
     */
    private final AuctionDurationField auctionDuration = new AuctionDurationField();

    /**
     * Best response price; 0 if not disclosed. BestResponsePrice of 0 is valid for Exposure auctions if BestResponseSize is not 0
     */
    private final BestResponsePriceField bestResponsePrice = new BestResponsePriceField();

    /**
     * Aggregated quantity at Best response price; 0 if not disclosed
     */
    private final BestResponseSizeField bestResponseSize = new BestResponseSizeField();

    /**
     * To be used in future to support Delta-Adjusted at Close functionality on Flex.
     */
    private final NumberOfFlexDacLegsField numberOfFlexDacLegs = new NumberOfFlexDacLegsField();

    /**
     * Leg Definitions (1-10) of Auction Notification, to be used in future to support Delta-Adjusted at Close functionality on Flex
     */
    private final FlexDacLegsList flexDacLegs = new FlexDacLegsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrumentType, instrumentId, auctionId, orderType, side, price, quantity, execFlag, orderCapacity, firmId, occAccount, cmta, auctionEvent, auctionType, auctionDuration, bestResponsePrice, bestResponseSize, numberOfFlexDacLegs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * A=All, O=Simple Instrument, C=Standard Combination, S=Stock Combination
     *
     * @return the InstrumentType field
     */
    public InstrumentTypeField instrumentType() {
        return instrumentType;
    }

    /**
     * Instrument ID, as specified by Option Directory notifications
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Identifies the Auction being responded. 0 if this order is not an auction response.
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * L=Limit, M=Market
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * B=Buy, S=Sell
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Limit price. Should be set to 0 if Order Type = M.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Number of contracts
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * 0=None, 1=AON
     *
     * @return the ExecFlag field
     */
    public ExecFlagField execFlag() {
        return execFlag;
    }

    /**
     * See Order Capacity Field
     *
     * @return the OrderCapacity field
     */
    public OrderCapacityField orderCapacity() {
        return orderCapacity;
    }

    /**
     * Firm ID (e.g. ABCD, 123A)
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * OCC # to use for clearing (give up)
     *
     * @return the OccAccount field
     */
    public OccAccountField occAccount() {
        return occAccount;
    }

    /**
     * CMTA
     *
     * @return the Cmta field
     */
    public CmtaField cmta() {
        return cmta;
    }

    /**
     * S=Start, U=Auction Update, E=End of Auction
     *
     * @return the AuctionEvent field
     */
    public AuctionEventField auctionEvent() {
        return auctionEvent;
    }

    /**
     * See Auction Type Field
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * User defined field for Auction Duration. In milliseconds between 3,000 and 300,000. Only required for Flex auctions. Must be 0 for Non-Flex Auctions.
     *
     * @return the AuctionDuration field
     */
    public AuctionDurationField auctionDuration() {
        return auctionDuration;
    }

    /**
     * Best response price; 0 if not disclosed. BestResponsePrice of 0 is valid for Exposure auctions if BestResponseSize is not 0
     *
     * @return the BestResponsePrice field
     */
    public BestResponsePriceField bestResponsePrice() {
        return bestResponsePrice;
    }

    /**
     * Aggregated quantity at Best response price; 0 if not disclosed
     *
     * @return the BestResponseSize field
     */
    public BestResponseSizeField bestResponseSize() {
        return bestResponseSize;
    }

    /**
     * To be used in future to support Delta-Adjusted at Close functionality on Flex.
     *
     * @return the NumberOfFlexDacLegs field
     */
    public NumberOfFlexDacLegsField numberOfFlexDacLegs() {
        return numberOfFlexDacLegs;
    }

    /**
     * Leg Definitions (1-10) of Auction Notification, to be used in future to support Delta-Adjusted at Close functionality on Flex
     *
     * <p>Encode writes this list's size to the NumberOfFlexDacLegs field.</p>
     *
     * @return the FlexDacLegs entries
     */
    public FlexDacLegsList flexDacLegs() {
        return flexDacLegs;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + flexDacLegs.byteLength();
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
        cursor += 8;
        cursor += 1;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        cursor += 8;
        cursor += 4;
        runs.add(cursor).add(9);
        cursor += 9;
        cursor += 1;
        cursor = flexDacLegs.padding(runs, cursor);
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
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
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!execFlag.parse(data, cursor)) {
            return false;
        }
        cursor += ExecFlagField.BYTE_LENGTH;
        if (!orderCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += OrderCapacityField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!occAccount.parse(data, cursor)) {
            return false;
        }
        cursor += OccAccountField.BYTE_LENGTH;
        if (!cmta.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaField.BYTE_LENGTH;
        if (!auctionEvent.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionEventField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!auctionDuration.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionDurationField.BYTE_LENGTH;
        if (!bestResponsePrice.parse(data, cursor)) {
            return false;
        }
        cursor += BestResponsePriceField.BYTE_LENGTH;
        if (!bestResponseSize.parse(data, cursor)) {
            return false;
        }
        cursor += BestResponseSizeField.BYTE_LENGTH;
        cursor += 9; // padding
        if (!numberOfFlexDacLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfFlexDacLegsField.BYTE_LENGTH;
        if (!flexDacLegs.parse(data, cursor, end, numberOfFlexDacLegs.value())) {
            return false;
        }
        cursor += flexDacLegs.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (flexDacLegs.size() > 255) {
            throw new IllegalStateException("flexDacLegs holds " + flexDacLegs.size() + " entries, more than its count field can state");
        }
        numberOfFlexDacLegs.value((short) flexDacLegs.size());
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = execFlag.encode(data, cursor);
        cursor = orderCapacity.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = occAccount.encode(data, cursor);
        cursor = cmta.encode(data, cursor);
        cursor = auctionEvent.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = auctionDuration.encode(data, cursor);
        cursor = bestResponsePrice.encode(data, cursor);
        cursor = bestResponseSize.encode(data, cursor);
        if (buffer != null && buffer.length >= 72) {
            System.arraycopy(buffer, 63, data, cursor, 9); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 9, (byte) 0); // padding
        }
        cursor += 9;
        cursor = numberOfFlexDacLegs.encode(data, cursor);
        cursor = flexDacLegs.encode(data, cursor);
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
        flexDacLegs.clear();
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
        return flexDacLegs.isRecognized();
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
        if (!flexDacLegs.isValid()) {
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
        if (!instrumentType.isDecoded()) {
            return Optional.of(instrumentType);
        }
        if (!instrumentId.isDecoded()) {
            return Optional.of(instrumentId);
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
        if (!quantity.isDecoded()) {
            return Optional.of(quantity);
        }
        if (!execFlag.isDecoded()) {
            return Optional.of(execFlag);
        }
        if (!orderCapacity.isDecoded()) {
            return Optional.of(orderCapacity);
        }
        if (!firmId.isDecoded()) {
            return Optional.of(firmId);
        }
        if (!occAccount.isDecoded()) {
            return Optional.of(occAccount);
        }
        if (!cmta.isDecoded()) {
            return Optional.of(cmta);
        }
        if (!auctionEvent.isDecoded()) {
            return Optional.of(auctionEvent);
        }
        if (!auctionType.isDecoded()) {
            return Optional.of(auctionType);
        }
        if (!auctionDuration.isDecoded()) {
            return Optional.of(auctionDuration);
        }
        if (!bestResponsePrice.isDecoded()) {
            return Optional.of(bestResponsePrice);
        }
        if (!bestResponseSize.isDecoded()) {
            return Optional.of(bestResponseSize);
        }
        if (!numberOfFlexDacLegs.isDecoded()) {
            return Optional.of(numberOfFlexDacLegs);
        }
        if (!flexDacLegs.isDecoded()) {
            return Optional.of(flexDacLegs.failedEntry().flatMap(FlexDacLegsEntry::failedAt).orElse(numberOfFlexDacLegs));
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
            case "InstrumentType" -> Optional.of(instrumentType);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "AuctionId" -> Optional.of(auctionId);
            case "OrderType" -> Optional.of(orderType);
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "ExecFlag" -> Optional.of(execFlag);
            case "OrderCapacity" -> Optional.of(orderCapacity);
            case "FirmId" -> Optional.of(firmId);
            case "OccAccount" -> Optional.of(occAccount);
            case "Cmta" -> Optional.of(cmta);
            case "AuctionEvent" -> Optional.of(auctionEvent);
            case "AuctionType" -> Optional.of(auctionType);
            case "AuctionDuration" -> Optional.of(auctionDuration);
            case "BestResponsePrice" -> Optional.of(bestResponsePrice);
            case "BestResponseSize" -> Optional.of(bestResponseSize);
            case "NumberOfFlexDacLegs" -> Optional.of(numberOfFlexDacLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AuctionNotificationMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(flexDacLegs.diffFields(message.flexDacLegs));
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
            flexDacLegs.toFormattedString(builder, options);
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
        flexDacLegs.toFormattedString(builder, nested);
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
        if (!(other instanceof AuctionNotificationMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && flexDacLegs.equals(message.flexDacLegs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, flexDacLegs);
    }
}
