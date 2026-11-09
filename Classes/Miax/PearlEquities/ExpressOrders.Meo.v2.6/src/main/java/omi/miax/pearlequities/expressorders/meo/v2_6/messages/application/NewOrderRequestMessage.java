package omi.miax.pearlequities.expressorders.meo.v2_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.AccountField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.CapacityField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.ClearingAccountField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.ClientOrderIdField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.DisplayRangeQtyField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.LocateAccountField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.MaxFloorQtyField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.MinQtyField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.MpidField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.NewOrderInstructionsField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.OrderTypeField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.PegOffsetField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.PriceField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.PriceSlidingAndRepriceFrequencyField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.PurgeGroupField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.RoutingField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.SelfTradeProtectionField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.SelfTradeProtectionGroupField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.SizeField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.SymbolIdField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.TimeInForceField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.TradingCollarDollarValueField;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.Field;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.Message;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.PrintOptions;

/**
 * Represents the NewOrderRequestMessage message from the ExpressOrders protocol.
 *
 * <p>Firms can use this format to send a single New Order Request</p>
 */
public final class NewOrderRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 129;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Request Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 8, 110, 19 };

    /**
     * Four character NSCC MPID of the Firm
     */
    private final MpidField mpid = new MpidField();

    /**
     * Firm specified unique order Id
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Symbol ID mapped to a given symbol
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Limit price of the order
     */
    private final PriceField price = new PriceField();

    /**
     * Number of shares to buy/sell
     */
    private final SizeField size = new SizeField();

    /**
     * New Order Instructions
     */
    private final NewOrderInstructionsField newOrderInstructions = new NewOrderInstructionsField();

    /**
     * Time in Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Order Type
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * Price Sliding and Reprice Frequency
     */
    private final PriceSlidingAndRepriceFrequencyField priceSlidingAndRepriceFrequency = new PriceSlidingAndRepriceFrequencyField();

    /**
     * Self Trade Protection
     */
    private final SelfTradeProtectionField selfTradeProtection = new SelfTradeProtectionField();

    /**
     * Customer specified protection group
     */
    private final SelfTradeProtectionGroupField selfTradeProtectionGroup = new SelfTradeProtectionGroupField();

    /**
     * Routing Flags
     */
    private final RoutingField routing = new RoutingField();

    /**
     * Market Order Custom Dollar Value Trading Collar Protection
     */
    private final TradingCollarDollarValueField tradingCollarDollarValue = new TradingCollarDollarValueField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Optional customer ID provided by the Firm
     */
    private final AccountField account = new AccountField();

    /**
     * Optional supplemental order identifier
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Minimum fill quantity
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Number of shares of the order to display
     */
    private final MaxFloorQtyField maxFloorQty = new MaxFloorQtyField();

    /**
     * Used for random replenishment of Reserve orders
     */
    private final DisplayRangeQtyField displayRangeQty = new DisplayRangeQtyField();

    /**
     * Signed dollar value up to four decimal places for a pegged order
     */
    private final PegOffsetField pegOffset = new PegOffsetField();

    /**
     * Optional information provided by Firm for Sell
     */
    private final LocateAccountField locateAccount = new LocateAccountField();

    /**
     * Customer specified purge group
     */
    private final PurgeGroupField purgeGroup = new PurgeGroupField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(mpid, clientOrderId, symbolId, price, size, newOrderInstructions, timeInForce, orderType, priceSlidingAndRepriceFrequency, selfTradeProtection, selfTradeProtectionGroup, routing, tradingCollarDollarValue, capacity, account, clearingAccount, minQty, maxFloorQty, displayRangeQty, pegOffset, locateAccount, purgeGroup);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Four character NSCC MPID of the Firm
     *
     * @return the Mpid field
     */
    public MpidField mpid() {
        return mpid;
    }

    /**
     * Firm specified unique order Id
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * Symbol ID mapped to a given symbol
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
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
     * Number of shares to buy/sell
     *
     * @return the Size field
     */
    public SizeField size() {
        return size;
    }

    /**
     * New Order Instructions
     *
     * @return the NewOrderInstructions field
     */
    public NewOrderInstructionsField newOrderInstructions() {
        return newOrderInstructions;
    }

    /**
     * Time in Force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Order Type
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * Price Sliding and Reprice Frequency
     *
     * @return the PriceSlidingAndRepriceFrequency field
     */
    public PriceSlidingAndRepriceFrequencyField priceSlidingAndRepriceFrequency() {
        return priceSlidingAndRepriceFrequency;
    }

    /**
     * Self Trade Protection
     *
     * @return the SelfTradeProtection field
     */
    public SelfTradeProtectionField selfTradeProtection() {
        return selfTradeProtection;
    }

    /**
     * Customer specified protection group
     *
     * @return the SelfTradeProtectionGroup field
     */
    public SelfTradeProtectionGroupField selfTradeProtectionGroup() {
        return selfTradeProtectionGroup;
    }

    /**
     * Routing Flags
     *
     * @return the Routing field
     */
    public RoutingField routing() {
        return routing;
    }

    /**
     * Market Order Custom Dollar Value Trading Collar Protection
     *
     * @return the TradingCollarDollarValue field
     */
    public TradingCollarDollarValueField tradingCollarDollarValue() {
        return tradingCollarDollarValue;
    }

    /**
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Optional customer ID provided by the Firm
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Optional supplemental order identifier
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * Minimum fill quantity
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * Number of shares of the order to display
     *
     * @return the MaxFloorQty field
     */
    public MaxFloorQtyField maxFloorQty() {
        return maxFloorQty;
    }

    /**
     * Used for random replenishment of Reserve orders
     *
     * @return the DisplayRangeQty field
     */
    public DisplayRangeQtyField displayRangeQty() {
        return displayRangeQty;
    }

    /**
     * Signed dollar value up to four decimal places for a pegged order
     *
     * @return the PegOffset field
     */
    public PegOffsetField pegOffset() {
        return pegOffset;
    }

    /**
     * Optional information provided by Firm for Sell
     *
     * @return the LocateAccount field
     */
    public LocateAccountField locateAccount() {
        return locateAccount;
    }

    /**
     * Customer specified purge group
     *
     * @return the PurgeGroup field
     */
    public PurgeGroupField purgeGroup() {
        return purgeGroup;
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
        cursor += 8; // padding
        if (!mpid.parse(data, cursor)) {
            return false;
        }
        cursor += MpidField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!size.parse(data, cursor)) {
            return false;
        }
        cursor += SizeField.BYTE_LENGTH;
        if (!newOrderInstructions.parse(data, cursor)) {
            return false;
        }
        cursor += NewOrderInstructionsField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!priceSlidingAndRepriceFrequency.parse(data, cursor)) {
            return false;
        }
        cursor += PriceSlidingAndRepriceFrequencyField.BYTE_LENGTH;
        if (!selfTradeProtection.parse(data, cursor)) {
            return false;
        }
        cursor += SelfTradeProtectionField.BYTE_LENGTH;
        if (!selfTradeProtectionGroup.parse(data, cursor)) {
            return false;
        }
        cursor += SelfTradeProtectionGroupField.BYTE_LENGTH;
        if (!routing.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingField.BYTE_LENGTH;
        if (!tradingCollarDollarValue.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCollarDollarValueField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!maxFloorQty.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorQtyField.BYTE_LENGTH;
        if (!displayRangeQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayRangeQtyField.BYTE_LENGTH;
        if (!pegOffset.parse(data, cursor)) {
            return false;
        }
        cursor += PegOffsetField.BYTE_LENGTH;
        if (!locateAccount.parse(data, cursor)) {
            return false;
        }
        cursor += LocateAccountField.BYTE_LENGTH;
        if (!purgeGroup.parse(data, cursor)) {
            return false;
        }
        cursor += PurgeGroupField.BYTE_LENGTH;
        cursor += 19; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 8) {
            System.arraycopy(buffer, 0, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = mpid.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = size.encode(data, cursor);
        cursor = newOrderInstructions.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = priceSlidingAndRepriceFrequency.encode(data, cursor);
        cursor = selfTradeProtection.encode(data, cursor);
        cursor = selfTradeProtectionGroup.encode(data, cursor);
        cursor = routing.encode(data, cursor);
        cursor = tradingCollarDollarValue.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = maxFloorQty.encode(data, cursor);
        cursor = displayRangeQty.encode(data, cursor);
        cursor = pegOffset.encode(data, cursor);
        cursor = locateAccount.encode(data, cursor);
        cursor = purgeGroup.encode(data, cursor);
        if (buffer != null && buffer.length >= 110 + 19) {
            System.arraycopy(buffer, 110, data, cursor, 19); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 19, (byte) 0); // padding
        }
        cursor += 19;
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
            case "Mpid" -> Optional.of(mpid);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "SymbolId" -> Optional.of(symbolId);
            case "Price" -> Optional.of(price);
            case "Size" -> Optional.of(size);
            case "NewOrderInstructions" -> Optional.of(newOrderInstructions);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "OrderType" -> Optional.of(orderType);
            case "PriceSlidingAndRepriceFrequency" -> Optional.of(priceSlidingAndRepriceFrequency);
            case "SelfTradeProtection" -> Optional.of(selfTradeProtection);
            case "SelfTradeProtectionGroup" -> Optional.of(selfTradeProtectionGroup);
            case "Routing" -> Optional.of(routing);
            case "TradingCollarDollarValue" -> Optional.of(tradingCollarDollarValue);
            case "Capacity" -> Optional.of(capacity);
            case "Account" -> Optional.of(account);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "MinQty" -> Optional.of(minQty);
            case "MaxFloorQty" -> Optional.of(maxFloorQty);
            case "DisplayRangeQty" -> Optional.of(displayRangeQty);
            case "PegOffset" -> Optional.of(pegOffset);
            case "LocateAccount" -> Optional.of(locateAccount);
            case "PurgeGroup" -> Optional.of(purgeGroup);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderRequestMessage message)) {
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
        if (!(other instanceof NewOrderRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
