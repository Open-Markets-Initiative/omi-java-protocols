package omi.nasdaq.ntxequities.orders.ouch.v4_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.BboWeightIndicatorField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.BuySellIndicatorField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.CapacityField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.CrossTypeField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.DisplayField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.FirmField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.IntermarketSweepEligibilityField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.MinimumQuantityField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.OrderReferenceNumberField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.OrderStateField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.PreviousOrderTokenField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.PriceField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.ReplacementOrderTokenField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.SharesField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.StockField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.TimeInForceField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.TimestampField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.types.Field;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.types.Message;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.types.PrintOptions;

/**
 * Represents the ReplacedMessage message from the Orders protocol.
 */
public final class ReplacedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'U';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 79;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Replaced Message";

    /**
     * Timestamp – reflected as the number of nanoseconds past midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * The Replacement Order Token field as entered
     */
    private final ReplacementOrderTokenField replacementOrderToken = new ReplacementOrderTokenField();

    /**
     * Buy/Sell Indicator
     */
    private final BuySellIndicatorField buySellIndicator = new BuySellIndicatorField();

    /**
     * Total number of shares. Must be greater than zero and less than 1,000,000
     */
    private final SharesField shares = new SharesField();

    /**
     * Stock Symbol
     */
    private final StockField stock = new StockField();

    /**
     * The price of the order. Please refer to the section in Data Types for more clarification.
     */
    private final PriceField price = new PriceField();

    /**
     * The number of seconds that this order should live before being automatically canceled. Special values for Time in Force are listed in Data Types above.
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * This field should contain all caps. Firm Identifier for the order entry firm. One logical OUCH Account can potentially enter orders for multiple firms in a Service Bureau configuration. If this field is blank-filled, the default firm for the OUCH Account will be used.
     */
    private final FirmField firm = new FirmField();

    /**
     * Display
     */
    private final DisplayField display = new DisplayField();

    /**
     * The day-unique Order Reference Number assigned by NASDAQ OMX BX to this order
     */
    private final OrderReferenceNumberField orderReferenceNumber = new OrderReferenceNumberField();

    /**
     * Values other than “A”, “P”, or “R” will be converted to “O” = Other
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Intermarket Sweep Eligibility
     */
    private final IntermarketSweepEligibilityField intermarketSweepEligibility = new IntermarketSweepEligibilityField();

    /**
     * Specifies the minimum acceptable quantity to execute
     */
    private final MinimumQuantityField minimumQuantity = new MinimumQuantityField();

    /**
     * Cross Type
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * Order State
     */
    private final OrderStateField orderState = new OrderStateField();

    /**
     * The Order Token of the order that was replaced
     */
    private final PreviousOrderTokenField previousOrderToken = new PreviousOrderTokenField();

    /**
     * BBO Weight indicator
     */
    private final BboWeightIndicatorField bboWeightIndicator = new BboWeightIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, replacementOrderToken, buySellIndicator, shares, stock, price, timeInForce, firm, display, orderReferenceNumber, capacity, intermarketSweepEligibility, minimumQuantity, crossType, orderState, previousOrderToken, bboWeightIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Timestamp – reflected as the number of nanoseconds past midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * The Replacement Order Token field as entered
     *
     * @return the ReplacementOrderToken field
     */
    public ReplacementOrderTokenField replacementOrderToken() {
        return replacementOrderToken;
    }

    /**
     * Buy/Sell Indicator
     *
     * @return the BuySellIndicator field
     */
    public BuySellIndicatorField buySellIndicator() {
        return buySellIndicator;
    }

    /**
     * Total number of shares. Must be greater than zero and less than 1,000,000
     *
     * @return the Shares field
     */
    public SharesField shares() {
        return shares;
    }

    /**
     * Stock Symbol
     *
     * @return the Stock field
     */
    public StockField stock() {
        return stock;
    }

    /**
     * The price of the order. Please refer to the section in Data Types for more clarification.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The number of seconds that this order should live before being automatically canceled. Special values for Time in Force are listed in Data Types above.
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * This field should contain all caps. Firm Identifier for the order entry firm. One logical OUCH Account can potentially enter orders for multiple firms in a Service Bureau configuration. If this field is blank-filled, the default firm for the OUCH Account will be used.
     *
     * @return the Firm field
     */
    public FirmField firm() {
        return firm;
    }

    /**
     * Display
     *
     * @return the Display field
     */
    public DisplayField display() {
        return display;
    }

    /**
     * The day-unique Order Reference Number assigned by NASDAQ OMX BX to this order
     *
     * @return the OrderReferenceNumber field
     */
    public OrderReferenceNumberField orderReferenceNumber() {
        return orderReferenceNumber;
    }

    /**
     * Values other than “A”, “P”, or “R” will be converted to “O” = Other
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Intermarket Sweep Eligibility
     *
     * @return the IntermarketSweepEligibility field
     */
    public IntermarketSweepEligibilityField intermarketSweepEligibility() {
        return intermarketSweepEligibility;
    }

    /**
     * Specifies the minimum acceptable quantity to execute
     *
     * @return the MinimumQuantity field
     */
    public MinimumQuantityField minimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Cross Type
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * Order State
     *
     * @return the OrderState field
     */
    public OrderStateField orderState() {
        return orderState;
    }

    /**
     * The Order Token of the order that was replaced
     *
     * @return the PreviousOrderToken field
     */
    public PreviousOrderTokenField previousOrderToken() {
        return previousOrderToken;
    }

    /**
     * BBO Weight indicator
     *
     * @return the BboWeightIndicator field
     */
    public BboWeightIndicatorField bboWeightIndicator() {
        return bboWeightIndicator;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!replacementOrderToken.parse(data, cursor)) {
            return false;
        }
        cursor += ReplacementOrderTokenField.BYTE_LENGTH;
        if (!buySellIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellIndicatorField.BYTE_LENGTH;
        if (!shares.parse(data, cursor)) {
            return false;
        }
        cursor += SharesField.BYTE_LENGTH;
        if (!stock.parse(data, cursor)) {
            return false;
        }
        cursor += StockField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!firm.parse(data, cursor)) {
            return false;
        }
        cursor += FirmField.BYTE_LENGTH;
        if (!display.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayField.BYTE_LENGTH;
        if (!orderReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderReferenceNumberField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!intermarketSweepEligibility.parse(data, cursor)) {
            return false;
        }
        cursor += IntermarketSweepEligibilityField.BYTE_LENGTH;
        if (!minimumQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumQuantityField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        if (!orderState.parse(data, cursor)) {
            return false;
        }
        cursor += OrderStateField.BYTE_LENGTH;
        if (!previousOrderToken.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousOrderTokenField.BYTE_LENGTH;
        return bboWeightIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = replacementOrderToken.encode(data, cursor);
        cursor = buySellIndicator.encode(data, cursor);
        cursor = shares.encode(data, cursor);
        cursor = stock.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = firm.encode(data, cursor);
        cursor = display.encode(data, cursor);
        cursor = orderReferenceNumber.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = intermarketSweepEligibility.encode(data, cursor);
        cursor = minimumQuantity.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = orderState.encode(data, cursor);
        cursor = previousOrderToken.encode(data, cursor);
        cursor = bboWeightIndicator.encode(data, cursor);
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
            case "ReplacementOrderToken" -> Optional.of(replacementOrderToken);
            case "BuySellIndicator" -> Optional.of(buySellIndicator);
            case "Shares" -> Optional.of(shares);
            case "Stock" -> Optional.of(stock);
            case "Price" -> Optional.of(price);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "Firm" -> Optional.of(firm);
            case "Display" -> Optional.of(display);
            case "OrderReferenceNumber" -> Optional.of(orderReferenceNumber);
            case "Capacity" -> Optional.of(capacity);
            case "IntermarketSweepEligibility" -> Optional.of(intermarketSweepEligibility);
            case "MinimumQuantity" -> Optional.of(minimumQuantity);
            case "CrossType" -> Optional.of(crossType);
            case "OrderState" -> Optional.of(orderState);
            case "PreviousOrderToken" -> Optional.of(previousOrderToken);
            case "BboWeightIndicator" -> Optional.of(bboWeightIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ReplacedMessage message)) {
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
        if (!(other instanceof ReplacedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
