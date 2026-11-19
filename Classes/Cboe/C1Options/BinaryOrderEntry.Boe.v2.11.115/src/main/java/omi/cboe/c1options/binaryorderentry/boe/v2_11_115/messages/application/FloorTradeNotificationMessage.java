package omi.cboe.c1options.binaryorderentry.boe.v2_11_115.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ContraTraderField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ExecIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.FloorTradeTimeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.FloorTraderAcronymField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.MaturityDateField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderQtyBinaryField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PriceBinaryPriceField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PriceTypeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PutOrCallField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.SideField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.StrikePriceField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.SymbolAlphanumericField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.TradeThroughAlertTypeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.Message;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * Represents the FloorTradeNotificationMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Floor Trade Notification Message.</p>
 */
public final class FloorTradeNotificationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 74;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Floor Trade Notification Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 59, 15 };

    /**
     * Corresponds to ExecID (17) in Cboe FIX. Execution ID. Unique across all matching units on a given day. Note: ExecIDs will be represented on ODROP and FIXDROP ports as nine character, base 36 ASCII. Leading zeros should be added if the converted base 36 value is shorter than nine characters. Table 2. Example Conversion Decimal Base 36 28294005440239 A1234B567 76335905726621 R248BC23H 728557228187 09AP05V2Z
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField symbolAlphanumeric = new SymbolAlphanumericField();

    /**
     * Put Or Call
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Strike Price
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Maturity Date
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 contracts.
     */
    private final OrderQtyBinaryField orderQtyBinary = new OrderQtyBinaryField();

    /**
     * Price Binary Price
     */
    private final PriceBinaryPriceField priceBinaryPrice = new PriceBinaryPriceField();

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     */
    private final SideField side = new SideField();

    /**
     * Displays the EFID (ClearingFirm) of the contra side firm on all internally matched executions.
     */
    private final ContraTraderField contraTrader = new ContraTraderField();

    /**
     * Floor acronym of participant submitting trade.
     */
    private final FloorTraderAcronymField floorTraderAcronym = new FloorTraderAcronymField();

    /**
     * Trade time
     */
    private final FloorTradeTimeField floorTradeTime = new FloorTradeTimeField();

    /**
     * Trade Through Alert Type
     */
    private final TradeThroughAlertTypeField tradeThroughAlertType = new TradeThroughAlertTypeField();

    /**
     * Price Type
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(execId, symbolAlphanumeric, putOrCall, strikePrice, maturityDate, orderQtyBinary, priceBinaryPrice, side, contraTrader, floorTraderAcronym, floorTradeTime, tradeThroughAlertType, priceType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to ExecID (17) in Cboe FIX. Execution ID. Unique across all matching units on a given day. Note: ExecIDs will be represented on ODROP and FIXDROP ports as nine character, base 36 ASCII. Leading zeros should be added if the converted base 36 value is shorter than nine characters. Table 2. Example Conversion Decimal Base 36 28294005440239 A1234B567 76335905726621 R248BC23H 728557228187 09AP05V2Z
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * Symbol Alphanumeric
     *
     * @return the SymbolAlphanumeric field
     */
    public SymbolAlphanumericField symbolAlphanumeric() {
        return symbolAlphanumeric;
    }

    /**
     * Put Or Call
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Strike Price
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Maturity Date
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 contracts.
     *
     * @return the OrderQtyBinary field
     */
    public OrderQtyBinaryField orderQtyBinary() {
        return orderQtyBinary;
    }

    /**
     * Price Binary Price
     *
     * @return the PriceBinaryPrice field
     */
    public PriceBinaryPriceField priceBinaryPrice() {
        return priceBinaryPrice;
    }

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Displays the EFID (ClearingFirm) of the contra side firm on all internally matched executions.
     *
     * @return the ContraTrader field
     */
    public ContraTraderField contraTrader() {
        return contraTrader;
    }

    /**
     * Floor acronym of participant submitting trade.
     *
     * @return the FloorTraderAcronym field
     */
    public FloorTraderAcronymField floorTraderAcronym() {
        return floorTraderAcronym;
    }

    /**
     * Trade time
     *
     * @return the FloorTradeTime field
     */
    public FloorTradeTimeField floorTradeTime() {
        return floorTradeTime;
    }

    /**
     * Trade Through Alert Type
     *
     * @return the TradeThroughAlertType field
     */
    public TradeThroughAlertTypeField tradeThroughAlertType() {
        return tradeThroughAlertType;
    }

    /**
     * Price Type
     *
     * @return the PriceType field
     */
    public PriceTypeField priceType() {
        return priceType;
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
        return Optional.ofNullable(floorTradeTime.value());
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
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!symbolAlphanumeric.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolAlphanumericField.BYTE_LENGTH;
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!orderQtyBinary.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyBinaryField.BYTE_LENGTH;
        if (!priceBinaryPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PriceBinaryPriceField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!contraTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ContraTraderField.BYTE_LENGTH;
        if (!floorTraderAcronym.parse(data, cursor)) {
            return false;
        }
        cursor += FloorTraderAcronymField.BYTE_LENGTH;
        if (!floorTradeTime.parse(data, cursor)) {
            return false;
        }
        cursor += FloorTradeTimeField.BYTE_LENGTH;
        if (!tradeThroughAlertType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeThroughAlertTypeField.BYTE_LENGTH;
        if (!priceType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTypeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = execId.encode(data, cursor);
        cursor = symbolAlphanumeric.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = orderQtyBinary.encode(data, cursor);
        cursor = priceBinaryPrice.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = contraTrader.encode(data, cursor);
        cursor = floorTraderAcronym.encode(data, cursor);
        cursor = floorTradeTime.encode(data, cursor);
        cursor = tradeThroughAlertType.encode(data, cursor);
        cursor = priceType.encode(data, cursor);
        if (buffer != null && buffer.length >= 74) {
            System.arraycopy(buffer, 59, data, cursor, 15); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 15, (byte) 0); // padding
        }
        cursor += 15;
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
            case "ExecId" -> Optional.of(execId);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "OrderQtyBinary" -> Optional.of(orderQtyBinary);
            case "PriceBinaryPrice" -> Optional.of(priceBinaryPrice);
            case "Side" -> Optional.of(side);
            case "ContraTrader" -> Optional.of(contraTrader);
            case "FloorTraderAcronym" -> Optional.of(floorTraderAcronym);
            case "FloorTradeTime" -> Optional.of(floorTradeTime);
            case "TradeThroughAlertType" -> Optional.of(tradeThroughAlertType);
            case "PriceType" -> Optional.of(priceType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FloorTradeNotificationMessage message)) {
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
        if (!(other instanceof FloorTradeNotificationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
