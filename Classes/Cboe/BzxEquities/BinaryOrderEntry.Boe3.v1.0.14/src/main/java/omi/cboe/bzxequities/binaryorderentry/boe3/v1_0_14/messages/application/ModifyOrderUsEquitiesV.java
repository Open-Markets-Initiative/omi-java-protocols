package omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.CancelOrigOnRejectField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.ClOrdIdField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.ClearingFirmField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.LocateBrokerField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.MaxFloorField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.OrdTypeField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.OrderQtyField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.OrigClOrdIdField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.PriceField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.SideField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.StopPxField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.SymbolField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.types.Message;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.types.PrintOptions;

/**
 * Represents the ModifyOrderUsEquitiesV message from the BinaryOrderEntry protocol.
 *
 * <p>Request to modify an order</p>
 */
public final class ModifyOrderUsEquitiesV implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 83;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Modify Order Us Equities V";

    /**
     * ID chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to OrigClOrdID (41) in Cboe FIX
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * MPID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Entire Cboe format
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Order quantity
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * Order type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Side of the order
     */
    private final SideField side = new SideField();

    /**
     * Portion of OrderQty to display
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Stop price
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Indicates handling of original order on failure to modify
     */
    private final CancelOrigOnRejectField cancelOrigOnReject = new CancelOrigOnRejectField();

    /**
     * Used for short sale orders to identify the broker that the short seller has identified as the source from which they will borrow the securities they are selling short
     */
    private final LocateBrokerField locateBroker = new LocateBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, origClOrdId, clearingFirm, symbol, orderQty, price, ordType, side, maxFloor, stopPx, cancelOrigOnReject, locateBroker);

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
     * Corresponds to OrigClOrdID (41) in Cboe FIX
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
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
     * Entire Cboe format
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
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
     * Limit price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
     * Side of the order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Portion of OrderQty to display
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
    }

    /**
     * Stop price
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Indicates handling of original order on failure to modify
     *
     * @return the CancelOrigOnReject field
     */
    public CancelOrigOnRejectField cancelOrigOnReject() {
        return cancelOrigOnReject;
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
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!maxFloor.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!cancelOrigOnReject.parse(data, cursor)) {
            return false;
        }
        cursor += CancelOrigOnRejectField.BYTE_LENGTH;
        return locateBroker.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = cancelOrigOnReject.encode(data, cursor);
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
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "Symbol" -> Optional.of(symbol);
            case "OrderQty" -> Optional.of(orderQty);
            case "Price" -> Optional.of(price);
            case "OrdType" -> Optional.of(ordType);
            case "Side" -> Optional.of(side);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "StopPx" -> Optional.of(stopPx);
            case "CancelOrigOnReject" -> Optional.of(cancelOrigOnReject);
            case "LocateBroker" -> Optional.of(locateBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ModifyOrderUsEquitiesV message)) {
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
        if (!(other instanceof ModifyOrderUsEquitiesV message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
