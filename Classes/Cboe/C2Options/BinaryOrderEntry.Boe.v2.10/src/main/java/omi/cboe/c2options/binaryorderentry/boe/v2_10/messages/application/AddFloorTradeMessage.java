package omi.cboe.c2options.binaryorderentry.boe.v2_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.AccountField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ClOrdIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ClearingAccountField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ClearingOptionalDataField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.CmtaNumberField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ComboOrderField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ContraTraderField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.FloorTraderAcronymField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.MaturityDateField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.MultilegReportingTypeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.OpenCloseField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.OrderQtyLongField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.PriceLongField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.PutOrCallField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.SideField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.StrikePriceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.SymbolLongField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.TradeTimeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.TransactionTimeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.types.Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.types.Message;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.types.PrintOptions;

/**
 * Represents the AddFloorTradeMessage message from the BinaryOrderEntry protocol.
 *
 * <p>TPHs having in-person Market Makers on the Cboe trading floor can enter their version of a floor trade via the Add Floor Trade message type.</p>
 */
public final class AddFloorTradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 136;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Floor Trade Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 120, 16 };

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Symbol Long
     */
    private final SymbolLongField symbolLong = new SymbolLongField();

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
     * Corresponds to MultilegReportingType (442) in Cboe FIX.
     */
    private final MultilegReportingTypeField multilegReportingType = new MultilegReportingTypeField();

    /**
     * Combo Order
     */
    private final ComboOrderField comboOrder = new ComboOrderField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Clearing Optional Data
     */
    private final ClearingOptionalDataField clearingOptionalData = new ClearingOptionalDataField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Cmta Number
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * Floor acronym of participant submitting trade.
     */
    private final FloorTraderAcronymField floorTraderAcronym = new FloorTraderAcronymField();

    /**
     * Corresponds to Side (54) in Cboe FIX.
     */
    private final SideField side = new SideField();

    /**
     * Order quantity. System limit is 999,999 shares.
     */
    private final OrderQtyLongField orderQtyLong = new OrderQtyLongField();

    /**
     * Price Long
     */
    private final PriceLongField priceLong = new PriceLongField();

    /**
     * Report send time (for audit).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Open Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Trade time
     */
    private final TradeTimeField tradeTime = new TradeTimeField();

    /**
     * Displays the EFID (ClearingFirm) of the contra side firm on all internally matched executions.
     */
    private final ContraTraderField contraTrader = new ContraTraderField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, symbolLong, putOrCall, strikePrice, maturityDate, multilegReportingType, comboOrder, account, clearingOptionalData, clearingAccount, cmtaNumber, floorTraderAcronym, side, orderQtyLong, priceLong, transactionTime, openClose, tradeTime, contraTrader);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Symbol Long
     *
     * @return the SymbolLong field
     */
    public SymbolLongField symbolLong() {
        return symbolLong;
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
     * Corresponds to MultilegReportingType (442) in Cboe FIX.
     *
     * @return the MultilegReportingType field
     */
    public MultilegReportingTypeField multilegReportingType() {
        return multilegReportingType;
    }

    /**
     * Combo Order
     *
     * @return the ComboOrder field
     */
    public ComboOrderField comboOrder() {
        return comboOrder;
    }

    /**
     * Account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Clearing Optional Data
     *
     * @return the ClearingOptionalData field
     */
    public ClearingOptionalDataField clearingOptionalData() {
        return clearingOptionalData;
    }

    /**
     * Clearing Account
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * Cmta Number
     *
     * @return the CmtaNumber field
     */
    public CmtaNumberField cmtaNumber() {
        return cmtaNumber;
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
     * Corresponds to Side (54) in Cboe FIX.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Order quantity. System limit is 999,999 shares.
     *
     * @return the OrderQtyLong field
     */
    public OrderQtyLongField orderQtyLong() {
        return orderQtyLong;
    }

    /**
     * Price Long
     *
     * @return the PriceLong field
     */
    public PriceLongField priceLong() {
        return priceLong;
    }

    /**
     * Report send time (for audit).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Open Close
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * Trade time
     *
     * @return the TradeTime field
     */
    public TradeTimeField tradeTime() {
        return tradeTime;
    }

    /**
     * Displays the EFID (ClearingFirm) of the contra side firm on all internally matched executions.
     *
     * @return the ContraTrader field
     */
    public ContraTraderField contraTrader() {
        return contraTrader;
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!symbolLong.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolLongField.BYTE_LENGTH;
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
        if (!multilegReportingType.parse(data, cursor)) {
            return false;
        }
        cursor += MultilegReportingTypeField.BYTE_LENGTH;
        if (!comboOrder.parse(data, cursor)) {
            return false;
        }
        cursor += ComboOrderField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!clearingOptionalData.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingOptionalDataField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!cmtaNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaNumberField.BYTE_LENGTH;
        if (!floorTraderAcronym.parse(data, cursor)) {
            return false;
        }
        cursor += FloorTraderAcronymField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderQtyLong.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyLongField.BYTE_LENGTH;
        if (!priceLong.parse(data, cursor)) {
            return false;
        }
        cursor += PriceLongField.BYTE_LENGTH;
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!tradeTime.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTimeField.BYTE_LENGTH;
        if (!contraTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ContraTraderField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = symbolLong.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = multilegReportingType.encode(data, cursor);
        cursor = comboOrder.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = clearingOptionalData.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = cmtaNumber.encode(data, cursor);
        cursor = floorTraderAcronym.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderQtyLong.encode(data, cursor);
        cursor = priceLong.encode(data, cursor);
        cursor = transactionTime.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = tradeTime.encode(data, cursor);
        cursor = contraTrader.encode(data, cursor);
        if (buffer != null && buffer.length >= 136) {
            System.arraycopy(buffer, 120, data, cursor, 16); // padding
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "SymbolLong" -> Optional.of(symbolLong);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "MultilegReportingType" -> Optional.of(multilegReportingType);
            case "ComboOrder" -> Optional.of(comboOrder);
            case "Account" -> Optional.of(account);
            case "ClearingOptionalData" -> Optional.of(clearingOptionalData);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "FloorTraderAcronym" -> Optional.of(floorTraderAcronym);
            case "Side" -> Optional.of(side);
            case "OrderQtyLong" -> Optional.of(orderQtyLong);
            case "PriceLong" -> Optional.of(priceLong);
            case "TransactionTime" -> Optional.of(transactionTime);
            case "OpenClose" -> Optional.of(openClose);
            case "TradeTime" -> Optional.of(tradeTime);
            case "ContraTrader" -> Optional.of(contraTrader);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddFloorTradeMessage message)) {
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
        if (!(other instanceof AddFloorTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
