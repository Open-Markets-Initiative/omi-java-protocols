package omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ContraTraderField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ExecIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.FloorTradeTimeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.FloorTraderAcronymField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.InFlightField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.MaturityDateField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.OrderQtyField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.PriceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.PriceTypeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.PutOrCallField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.SideField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.StrikePriceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.SymbolField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.TradeThroughAlertTypeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.TransactionTimeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.Field;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.Message;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.PrintOptions;

/**
 * Represents the FloorTradeNotificationMessage message from the BinaryOrderEntry protocol.
 *
 * <p>TPHs with Market Makers on the Cboe trading floor may optionally receive Floor Trade Notification messages</p>
 */
public final class FloorTradeNotificationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 69;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Floor Trade Notification Message";

    /**
     * Total number of messages "in-flight" from the port
     */
    private final InFlightField inFlight = new InFlightField();

    /**
     * The exchange timestamp of the transaction
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Execution ID
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Entire Cboe format symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * When sending Cboe native symbology, set PutOrCall to ASCII NUL (0x00)
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Strike Price for option
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * When sending Cboe native symbology, set MaturityDate to zero
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Order quantity
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Only present on local book trades, not present on routed trades
     */
    private final ContraTraderField contraTrader = new ContraTraderField();

    /**
     * Floor Acronym of member submitting trade
     */
    private final FloorTraderAcronymField floorTraderAcronym = new FloorTraderAcronymField();

    /**
     * Trade time reported by the trading floor
     */
    private final FloorTradeTimeField floorTradeTime = new FloorTradeTimeField();

    /**
     * Indication of a type of trade through
     */
    private final TradeThroughAlertTypeField tradeThroughAlertType = new TradeThroughAlertTypeField();

    /**
     * PriceType
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(inFlight, transactionTime, execId, symbol, putOrCall, strikePrice, maturityDate, orderQty, price, side, contraTrader, floorTraderAcronym, floorTradeTime, tradeThroughAlertType, priceType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Total number of messages "in-flight" from the port
     *
     * @return the InFlight field
     */
    public InFlightField inFlight() {
        return inFlight;
    }

    /**
     * The exchange timestamp of the transaction
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Execution ID
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * Entire Cboe format symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * When sending Cboe native symbology, set PutOrCall to ASCII NUL (0x00)
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Strike Price for option
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * When sending Cboe native symbology, set MaturityDate to zero
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
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
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Only present on local book trades, not present on routed trades
     *
     * @return the ContraTrader field
     */
    public ContraTraderField contraTrader() {
        return contraTrader;
    }

    /**
     * Floor Acronym of member submitting trade
     *
     * @return the FloorTraderAcronym field
     */
    public FloorTraderAcronymField floorTraderAcronym() {
        return floorTraderAcronym;
    }

    /**
     * Trade time reported by the trading floor
     *
     * @return the FloorTradeTime field
     */
    public FloorTradeTimeField floorTradeTime() {
        return floorTradeTime;
    }

    /**
     * Indication of a type of trade through
     *
     * @return the TradeThroughAlertType field
     */
    public TradeThroughAlertTypeField tradeThroughAlertType() {
        return tradeThroughAlertType;
    }

    /**
     * PriceType
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
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transactionTime.value());
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
        if (!inFlight.parse(data, cursor)) {
            return false;
        }
        cursor += InFlightField.BYTE_LENGTH;
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
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
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
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
        return priceType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = inFlight.encode(data, cursor);
        cursor = transactionTime.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = contraTrader.encode(data, cursor);
        cursor = floorTraderAcronym.encode(data, cursor);
        cursor = floorTradeTime.encode(data, cursor);
        cursor = tradeThroughAlertType.encode(data, cursor);
        cursor = priceType.encode(data, cursor);
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
            case "InFlight" -> Optional.of(inFlight);
            case "TransactionTime" -> Optional.of(transactionTime);
            case "ExecId" -> Optional.of(execId);
            case "Symbol" -> Optional.of(symbol);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "OrderQty" -> Optional.of(orderQty);
            case "Price" -> Optional.of(price);
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
