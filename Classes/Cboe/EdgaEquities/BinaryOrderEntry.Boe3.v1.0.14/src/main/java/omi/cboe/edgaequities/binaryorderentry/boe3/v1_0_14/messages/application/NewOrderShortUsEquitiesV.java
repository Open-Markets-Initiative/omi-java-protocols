package omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.CapacityField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ClOrdIdField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ClearingAccountField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ClearingFirmField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.DisplayIndicatorField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ExecInstField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.LocateBrokerField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.OrdTypeField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.OrderQtyField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.PriceField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.RiskGroupIdField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ShortAccountField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ShortRoutingInstField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.SideField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.SymbolField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.TimeInForceField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.types.Field;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.types.Message;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.types.PrintOptions;

/**
 * Represents the NewOrderShortUsEquitiesV message from the BinaryOrderEntry protocol.
 *
 * <p>Submission of a new order to Cboe</p>
 */
public final class NewOrderShortUsEquitiesV implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 71;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Short Us Equities V";

    /**
     * ID chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Side of the order
     */
    private final SideField side = new SideField();

    /**
     * Order quantity
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * MPID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Supplemental identifier
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * Execution instruction
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Order type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Time in force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Entire Cboe format
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Order capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * See RoutingInst, first character only
     */
    private final ShortRoutingInstField shortRoutingInst = new ShortRoutingInstField();

    /**
     * See Account
     */
    private final ShortAccountField shortAccount = new ShortAccountField();

    /**
     * Re-pricing and display options
     */
    private final DisplayIndicatorField displayIndicator = new DisplayIndicatorField();

    /**
     * Used to group orders for use in Purge Orders messages where multiple orders can be cancelled by specifying a list of RiskGroupIDs
     */
    private final RiskGroupIdField riskGroupId = new RiskGroupIdField();

    /**
     * Used for short sale orders to identify the broker that the short seller has identified as the source from which they will borrow the securities they are selling short
     */
    private final LocateBrokerField locateBroker = new LocateBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, side, orderQty, clearingFirm, clearingAccount, price, execInst, ordType, timeInForce, symbol, capacity, shortRoutingInst, shortAccount, displayIndicator, riskGroupId, locateBroker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID chosen by the client
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Side of the order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Order quantity
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * MPID that will clear the trade
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Supplemental identifier
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * Limit price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Execution instruction
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * Order type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Time in force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Entire Cboe format
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Order capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * See RoutingInst, first character only
     *
     * @return the ShortRoutingInst field
     */
    public ShortRoutingInstField shortRoutingInst() {
        return shortRoutingInst;
    }

    /**
     * See Account
     *
     * @return the ShortAccount field
     */
    public ShortAccountField shortAccount() {
        return shortAccount;
    }

    /**
     * Re-pricing and display options
     *
     * @return the DisplayIndicator field
     */
    public DisplayIndicatorField displayIndicator() {
        return displayIndicator;
    }

    /**
     * Used to group orders for use in Purge Orders messages where multiple orders can be cancelled by specifying a list of RiskGroupIDs
     *
     * @return the RiskGroupId field
     */
    public RiskGroupIdField riskGroupId() {
        return riskGroupId;
    }

    /**
     * Used for short sale orders to identify the broker that the short seller has identified as the source from which they will borrow the securities they are selling short
     *
     * @return the LocateBroker field
     */
    public LocateBrokerField locateBroker() {
        return locateBroker;
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!shortRoutingInst.parse(data, cursor)) {
            return false;
        }
        cursor += ShortRoutingInstField.BYTE_LENGTH;
        if (!shortAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ShortAccountField.BYTE_LENGTH;
        if (!displayIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayIndicatorField.BYTE_LENGTH;
        if (!riskGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += RiskGroupIdField.BYTE_LENGTH;
        return locateBroker.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = shortRoutingInst.encode(data, cursor);
        cursor = shortAccount.encode(data, cursor);
        cursor = displayIndicator.encode(data, cursor);
        cursor = riskGroupId.encode(data, cursor);
        cursor = locateBroker.encode(data, cursor);
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "Side" -> Optional.of(side);
            case "OrderQty" -> Optional.of(orderQty);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "Price" -> Optional.of(price);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "Symbol" -> Optional.of(symbol);
            case "Capacity" -> Optional.of(capacity);
            case "ShortRoutingInst" -> Optional.of(shortRoutingInst);
            case "ShortAccount" -> Optional.of(shortAccount);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "RiskGroupId" -> Optional.of(riskGroupId);
            case "LocateBroker" -> Optional.of(locateBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderShortUsEquitiesV message)) {
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
        if (!(other instanceof NewOrderShortUsEquitiesV message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
