package omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.AuctionTypeField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.CapacityField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.ClOrdIdField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.ClearingAccountField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.CmtaField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.CrossIdField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.CustAcctField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.EventSourceField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.FirmIdField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.InstrumentIdField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.LegIdField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.LegInstrumentIdField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.LiquidityIndField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.MatchIdField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.OccAccountField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.OpenCloseField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.OrdExecTypeField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.OrderIdField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.PriceField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.ProductIdField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.QuantityField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.RefMatchIdField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.SideField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.StockLegMpidField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.StockLegShortSaleField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.StockVenueField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.TimestampField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.fields.TransTypeField;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.types.Field;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.types.Message;
import omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.types.PrintOptions;

/**
 * Represents the TradeDetailsMessage message from the Otto protocol.
 *
 * <p>A Trade Details message contains additional details, specifically clearing information. This message is sent out with a nominal delay after Order Executed message. Trade Busts and Adjustments are made against individual MatchIds; Modify Trade results are reported with TransType B for the original trade and C for the new trades.</p>
 */
public final class TradeDetailsMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 't';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 107;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Details Message";

    /**
     * Nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Firm ID (e.g. ABCD, 123A)
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * Product (Underlying) ID, as specified by Option Directory notifications. Must be populated if Scope=P and UnderlyingSymbol not populated.
     */
    private final ProductIdField productId = new ProductIdField();

    /**
     * Type of the execution being reported: A=Execution of an order for a simple instrument (option), B=Execution of an order for a complex instrument, C=Execution of an option leg of a complex order, D=Execution of a stock leg of a complex order
     */
    private final OrdExecTypeField ordExecType = new OrdExecTypeField();

    /**
     * Instrument ID, as specified by Option Directory notifications
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Leg Instrument ID. Only populated for OrdExecType=C. Zero otherwise.
     */
    private final LegInstrumentIdField legInstrumentId = new LegInstrumentIdField();

    /**
     * 0-based LegId within complex instrument identified by the InstrumentId field. Only meaningful for OrdExecType C or D.
     */
    private final LegIdField legId = new LegIdField();

    /**
     * A=New Trade, B=Trade Busted, C=Modified Trade
     */
    private final TransTypeField transType = new TransTypeField();

    /**
     * A=Matching Engine, M=Manual Trade Entry, U=Trade Modification (user), C=Trade Modification (contra-side user), E=Trade Modification (exchange), B=Trade Bust (exchange)
     */
    private final EventSourceField eventSource = new EventSourceField();

    /**
     * See Auction Type Field
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Day-unique Order identifier assigned by exchange
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * See Client Order Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * CrossId of the trade being modified
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * MatchId of the trade to be modified
     */
    private final MatchIdField matchId = new MatchIdField();

    /**
     * For TransType=C indicates MatchId of the original trade. 0 (zero) for TransType=A, B
     */
    private final RefMatchIdField refMatchId = new RefMatchIdField();

    /**
     * B=Buy, S=Sell
     */
    private final SideField side = new SideField();

    /**
     * N=Not Applicable, H=Sell Short, E=Sell Short Exempt. If this is a multi-leg order for a stock combo where stock leg is on the Sell side StockLegShortSale may be set to H or E. In all other cases value N should be used.
     */
    private final StockLegShortSaleField stockLegShortSale = new StockLegShortSaleField();

    /**
     * Limit price. Should be set to 0 if Order Type = M.
     */
    private final PriceField price = new PriceField();

    /**
     * Number of contracts
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * See Liquidity (Maker/Taker) Field Codes
     */
    private final LiquidityIndField liquidityInd = new LiquidityIndField();

    /**
     * CMTA
     */
    private final CmtaField cmta = new CmtaField();

    /**
     * Sub-account/MM Identifier at the registered exchange; all four characters will be provided to OCC
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * OCC # to use for clearing (give up)
     */
    private final OccAccountField occAccount = new OccAccountField();

    /**
     * Account on the customer system (pass-through)
     */
    private final CustAcctField custAcct = new CustAcctField();

    /**
     * See Stock Execution Venues
     */
    private final StockVenueField stockVenue = new StockVenueField();

    /**
     * Give-up for the stock leg
     */
    private final StockLegMpidField stockLegMpid = new StockLegMpidField();

    /**
     * See Order Capacity Field
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * O=Open, C=Closed, space=Carry Forward
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, firmId, productId, ordExecType, instrumentId, legInstrumentId, legId, transType, eventSource, auctionType, orderId, clOrdId, crossId, matchId, refMatchId, side, stockLegShortSale, price, quantity, liquidityInd, cmta, clearingAccount, occAccount, custAcct, stockVenue, stockLegMpid, capacity, openClose);

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
     * Firm ID (e.g. ABCD, 123A)
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * Product (Underlying) ID, as specified by Option Directory notifications. Must be populated if Scope=P and UnderlyingSymbol not populated.
     *
     * @return the ProductId field
     */
    public ProductIdField productId() {
        return productId;
    }

    /**
     * Type of the execution being reported: A=Execution of an order for a simple instrument (option), B=Execution of an order for a complex instrument, C=Execution of an option leg of a complex order, D=Execution of a stock leg of a complex order
     *
     * @return the OrdExecType field
     */
    public OrdExecTypeField ordExecType() {
        return ordExecType;
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
     * Leg Instrument ID. Only populated for OrdExecType=C. Zero otherwise.
     *
     * @return the LegInstrumentId field
     */
    public LegInstrumentIdField legInstrumentId() {
        return legInstrumentId;
    }

    /**
     * 0-based LegId within complex instrument identified by the InstrumentId field. Only meaningful for OrdExecType C or D.
     *
     * @return the LegId field
     */
    public LegIdField legId() {
        return legId;
    }

    /**
     * A=New Trade, B=Trade Busted, C=Modified Trade
     *
     * @return the TransType field
     */
    public TransTypeField transType() {
        return transType;
    }

    /**
     * A=Matching Engine, M=Manual Trade Entry, U=Trade Modification (user), C=Trade Modification (contra-side user), E=Trade Modification (exchange), B=Trade Bust (exchange)
     *
     * @return the EventSource field
     */
    public EventSourceField eventSource() {
        return eventSource;
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
     * Day-unique Order identifier assigned by exchange
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * See Client Order Id
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * CrossId of the trade being modified
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
    }

    /**
     * MatchId of the trade to be modified
     *
     * @return the MatchId field
     */
    public MatchIdField matchId() {
        return matchId;
    }

    /**
     * For TransType=C indicates MatchId of the original trade. 0 (zero) for TransType=A, B
     *
     * @return the RefMatchId field
     */
    public RefMatchIdField refMatchId() {
        return refMatchId;
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
     * N=Not Applicable, H=Sell Short, E=Sell Short Exempt. If this is a multi-leg order for a stock combo where stock leg is on the Sell side StockLegShortSale may be set to H or E. In all other cases value N should be used.
     *
     * @return the StockLegShortSale field
     */
    public StockLegShortSaleField stockLegShortSale() {
        return stockLegShortSale;
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
     * See Liquidity (Maker/Taker) Field Codes
     *
     * @return the LiquidityInd field
     */
    public LiquidityIndField liquidityInd() {
        return liquidityInd;
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
     * Sub-account/MM Identifier at the registered exchange; all four characters will be provided to OCC
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
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
     * Account on the customer system (pass-through)
     *
     * @return the CustAcct field
     */
    public CustAcctField custAcct() {
        return custAcct;
    }

    /**
     * See Stock Execution Venues
     *
     * @return the StockVenue field
     */
    public StockVenueField stockVenue() {
        return stockVenue;
    }

    /**
     * Give-up for the stock leg
     *
     * @return the StockLegMpid field
     */
    public StockLegMpidField stockLegMpid() {
        return stockLegMpid;
    }

    /**
     * See Order Capacity Field
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * O=Open, C=Closed, space=Carry Forward
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
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
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!productId.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdField.BYTE_LENGTH;
        if (!ordExecType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdExecTypeField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!legInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += LegInstrumentIdField.BYTE_LENGTH;
        if (!legId.parse(data, cursor)) {
            return false;
        }
        cursor += LegIdField.BYTE_LENGTH;
        if (!transType.parse(data, cursor)) {
            return false;
        }
        cursor += TransTypeField.BYTE_LENGTH;
        if (!eventSource.parse(data, cursor)) {
            return false;
        }
        cursor += EventSourceField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!crossId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIdField.BYTE_LENGTH;
        if (!matchId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchIdField.BYTE_LENGTH;
        if (!refMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += RefMatchIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!stockLegShortSale.parse(data, cursor)) {
            return false;
        }
        cursor += StockLegShortSaleField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!liquidityInd.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityIndField.BYTE_LENGTH;
        if (!cmta.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!occAccount.parse(data, cursor)) {
            return false;
        }
        cursor += OccAccountField.BYTE_LENGTH;
        if (!custAcct.parse(data, cursor)) {
            return false;
        }
        cursor += CustAcctField.BYTE_LENGTH;
        if (!stockVenue.parse(data, cursor)) {
            return false;
        }
        cursor += StockVenueField.BYTE_LENGTH;
        if (!stockLegMpid.parse(data, cursor)) {
            return false;
        }
        cursor += StockLegMpidField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        return openClose.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = productId.encode(data, cursor);
        cursor = ordExecType.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = legInstrumentId.encode(data, cursor);
        cursor = legId.encode(data, cursor);
        cursor = transType.encode(data, cursor);
        cursor = eventSource.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = crossId.encode(data, cursor);
        cursor = matchId.encode(data, cursor);
        cursor = refMatchId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = stockLegShortSale.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = liquidityInd.encode(data, cursor);
        cursor = cmta.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = occAccount.encode(data, cursor);
        cursor = custAcct.encode(data, cursor);
        cursor = stockVenue.encode(data, cursor);
        cursor = stockLegMpid.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
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
            case "FirmId" -> Optional.of(firmId);
            case "ProductId" -> Optional.of(productId);
            case "OrdExecType" -> Optional.of(ordExecType);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "LegInstrumentId" -> Optional.of(legInstrumentId);
            case "LegId" -> Optional.of(legId);
            case "TransType" -> Optional.of(transType);
            case "EventSource" -> Optional.of(eventSource);
            case "AuctionType" -> Optional.of(auctionType);
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "CrossId" -> Optional.of(crossId);
            case "MatchId" -> Optional.of(matchId);
            case "RefMatchId" -> Optional.of(refMatchId);
            case "Side" -> Optional.of(side);
            case "StockLegShortSale" -> Optional.of(stockLegShortSale);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "LiquidityInd" -> Optional.of(liquidityInd);
            case "Cmta" -> Optional.of(cmta);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "OccAccount" -> Optional.of(occAccount);
            case "CustAcct" -> Optional.of(custAcct);
            case "StockVenue" -> Optional.of(stockVenue);
            case "StockLegMpid" -> Optional.of(stockLegMpid);
            case "Capacity" -> Optional.of(capacity);
            case "OpenClose" -> Optional.of(openClose);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeDetailsMessage message)) {
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
        if (!(other instanceof TradeDetailsMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
