package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.AccountField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.AttributedQuoteField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.CapacityField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ClOrdIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ClearingAccountField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ClearingFirmField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.DiscretionAmountField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.DisplayIndicatorField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.EchoTextField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ExDestinationField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ExecInstField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ExtExecInstField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MaxFloorField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MinQtyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.NumberOfReturnBitfieldsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrdTypeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderQtyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectReasonField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield10Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield11Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield12Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield13Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield14Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield15Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield16Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield17Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield18Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield19Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield1Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield20Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield21Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield22Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield2Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield3Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield4Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield5Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield6Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield7Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield8Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRejectedReturnBitfield9Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PegDifferenceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PreventMatchField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PriceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.RoutStrategyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.RouteDeliveryMethodField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.RoutingInstField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SecondaryOrderIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SideField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.StopPxField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SymbolField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SymbolSfxField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TextField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TimeInForceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TransactionTimeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Message;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

/**
 * Represents the OrderRejectedMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Order Rejected Message.</p>
 */
public final class OrderRejectedMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 91;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Rejected Message";

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Reason for an order rejection. See Reason Codes for a list of possible reasons.
     */
    private final OrderRejectReasonField orderRejectReason = new OrderRejectReasonField();

    /**
     * Human readable text with more information about the reject reason.
     */
    private final TextField text = new TextField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderRejected byte 1.
     */
    private final OrderRejectedReturnBitfield1Field orderRejectedReturnBitfield1 = new OrderRejectedReturnBitfield1Field();

    /**
     * BitSet OrderRejected byte 2.
     */
    private final OrderRejectedReturnBitfield2Field orderRejectedReturnBitfield2 = new OrderRejectedReturnBitfield2Field();

    /**
     * BitSet OrderRejected byte 3.
     */
    private final OrderRejectedReturnBitfield3Field orderRejectedReturnBitfield3 = new OrderRejectedReturnBitfield3Field();

    /**
     * BitSet OrderRejected byte 4.
     */
    private final OrderRejectedReturnBitfield4Field orderRejectedReturnBitfield4 = new OrderRejectedReturnBitfield4Field();

    /**
     * BitSet OrderRejected byte 5.
     */
    private final OrderRejectedReturnBitfield5Field orderRejectedReturnBitfield5 = new OrderRejectedReturnBitfield5Field();

    /**
     * BitSet OrderRejected byte 6.
     */
    private final OrderRejectedReturnBitfield6Field orderRejectedReturnBitfield6 = new OrderRejectedReturnBitfield6Field();

    /**
     * BitSet OrderRejected byte 7.
     */
    private final OrderRejectedReturnBitfield7Field orderRejectedReturnBitfield7 = new OrderRejectedReturnBitfield7Field();

    /**
     * BitSet OrderRejected byte 8.
     */
    private final OrderRejectedReturnBitfield8Field orderRejectedReturnBitfield8 = new OrderRejectedReturnBitfield8Field();

    /**
     * BitSet OrderRejected byte 9.
     */
    private final OrderRejectedReturnBitfield9Field orderRejectedReturnBitfield9 = new OrderRejectedReturnBitfield9Field();

    /**
     * BitSet OrderRejected byte 10.
     */
    private final OrderRejectedReturnBitfield10Field orderRejectedReturnBitfield10 = new OrderRejectedReturnBitfield10Field();

    /**
     * BitSet OrderRejected byte 11.
     */
    private final OrderRejectedReturnBitfield11Field orderRejectedReturnBitfield11 = new OrderRejectedReturnBitfield11Field();

    /**
     * BitSet OrderRejected byte 12.
     */
    private final OrderRejectedReturnBitfield12Field orderRejectedReturnBitfield12 = new OrderRejectedReturnBitfield12Field();

    /**
     * BitSet OrderRejected byte 13.
     */
    private final OrderRejectedReturnBitfield13Field orderRejectedReturnBitfield13 = new OrderRejectedReturnBitfield13Field();

    /**
     * BitSet OrderRejected byte 14.
     */
    private final OrderRejectedReturnBitfield14Field orderRejectedReturnBitfield14 = new OrderRejectedReturnBitfield14Field();

    /**
     * BitSet OrderRejected byte 15.
     */
    private final OrderRejectedReturnBitfield15Field orderRejectedReturnBitfield15 = new OrderRejectedReturnBitfield15Field();

    /**
     * BitSet OrderRejected byte 16.
     */
    private final OrderRejectedReturnBitfield16Field orderRejectedReturnBitfield16 = new OrderRejectedReturnBitfield16Field();

    /**
     * BitSet OrderRejected byte 17.
     */
    private final OrderRejectedReturnBitfield17Field orderRejectedReturnBitfield17 = new OrderRejectedReturnBitfield17Field();

    /**
     * BitSet OrderRejected byte 18.
     */
    private final OrderRejectedReturnBitfield18Field orderRejectedReturnBitfield18 = new OrderRejectedReturnBitfield18Field();

    /**
     * BitSet OrderRejected byte 19.
     */
    private final OrderRejectedReturnBitfield19Field orderRejectedReturnBitfield19 = new OrderRejectedReturnBitfield19Field();

    /**
     * BitSet OrderRejected byte 20.
     */
    private final OrderRejectedReturnBitfield20Field orderRejectedReturnBitfield20 = new OrderRejectedReturnBitfield20Field();

    /**
     * BitSet OrderRejected byte 21.
     */
    private final OrderRejectedReturnBitfield21Field orderRejectedReturnBitfield21 = new OrderRejectedReturnBitfield21Field();

    /**
     * BitSet OrderRejected byte 22.
     */
    private final OrderRejectedReturnBitfield22Field orderRejectedReturnBitfield22 = new OrderRejectedReturnBitfield22Field();

    /**
     * Corresponds to Side (54) in Cboe FIX. 1=Buy 2=Sell 5=Sell Short (client affirms ability to borrow) 6=Sell Short Exempt
     */
    private final SideField side = new SideField();

    /**
     * Peg Difference
     */
    private final PegDifferenceField pegDifference = new PegDifferenceField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Min Qty
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Symbol Sfx
     */
    private final SymbolSfxField symbolSfx = new SymbolSfxField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Display Indicator
     */
    private final DisplayIndicatorField displayIndicator = new DisplayIndicatorField();

    /**
     * Max Floor
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Discretion Amount
     */
    private final DiscretionAmountField discretionAmount = new DiscretionAmountField();

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 shares.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Prevent Match
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Secondary Order Id
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * Attributed Quote
     */
    private final AttributedQuoteField attributedQuote = new AttributedQuoteField();

    /**
     * Ext Exec Inst
     */
    private final ExtExecInstField extExecInst = new ExtExecInstField();

    /**
     * Echo Text
     */
    private final EchoTextField echoText = new EchoTextField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Routing Inst
     */
    private final RoutingInstField routingInst = new RoutingInstField();

    /**
     * Rout Strategy
     */
    private final RoutStrategyField routStrategy = new RoutStrategyField();

    /**
     * Route Delivery Method
     */
    private final RouteDeliveryMethodField routeDeliveryMethod = new RouteDeliveryMethodField();

    /**
     * Ex Destination
     */
    private final ExDestinationField exDestination = new ExDestinationField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderRejectReason, text, numberOfReturnBitfields, orderRejectedReturnBitfield1, orderRejectedReturnBitfield2, orderRejectedReturnBitfield3, orderRejectedReturnBitfield4, orderRejectedReturnBitfield5, orderRejectedReturnBitfield6, orderRejectedReturnBitfield7, orderRejectedReturnBitfield8, orderRejectedReturnBitfield9, orderRejectedReturnBitfield10, orderRejectedReturnBitfield11, orderRejectedReturnBitfield12, orderRejectedReturnBitfield13, orderRejectedReturnBitfield14, orderRejectedReturnBitfield15, orderRejectedReturnBitfield16, orderRejectedReturnBitfield17, orderRejectedReturnBitfield18, orderRejectedReturnBitfield19, orderRejectedReturnBitfield20, orderRejectedReturnBitfield21, orderRejectedReturnBitfield22, side, pegDifference, price, execInst, ordType, timeInForce, minQty, symbol, symbolSfx, capacity, account, clearingFirm, clearingAccount, displayIndicator, maxFloor, discretionAmount, orderQty, preventMatch, secondaryOrderId, attributedQuote, extExecInst, echoText, stopPx, routingInst, routStrategy, routeDeliveryMethod, exDestination);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Reason for an order rejection. See Reason Codes for a list of possible reasons.
     *
     * @return the OrderRejectReason field
     */
    public OrderRejectReasonField orderRejectReason() {
        return orderRejectReason;
    }

    /**
     * Human readable text with more information about the reject reason.
     *
     * @return the Text field
     */
    public TextField text() {
        return text;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfReturnBitfields field
     */
    public NumberOfReturnBitfieldsField numberOfReturnBitfields() {
        return numberOfReturnBitfields;
    }

    /**
     * BitSet OrderRejected byte 1.
     *
     * @return the OrderRejectedReturnBitfield1 field
     */
    public OrderRejectedReturnBitfield1Field orderRejectedReturnBitfield1() {
        return orderRejectedReturnBitfield1;
    }

    /**
     * BitSet OrderRejected byte 2.
     *
     * @return the OrderRejectedReturnBitfield2 field
     */
    public OrderRejectedReturnBitfield2Field orderRejectedReturnBitfield2() {
        return orderRejectedReturnBitfield2;
    }

    /**
     * BitSet OrderRejected byte 3.
     *
     * @return the OrderRejectedReturnBitfield3 field
     */
    public OrderRejectedReturnBitfield3Field orderRejectedReturnBitfield3() {
        return orderRejectedReturnBitfield3;
    }

    /**
     * BitSet OrderRejected byte 4.
     *
     * @return the OrderRejectedReturnBitfield4 field
     */
    public OrderRejectedReturnBitfield4Field orderRejectedReturnBitfield4() {
        return orderRejectedReturnBitfield4;
    }

    /**
     * BitSet OrderRejected byte 5.
     *
     * @return the OrderRejectedReturnBitfield5 field
     */
    public OrderRejectedReturnBitfield5Field orderRejectedReturnBitfield5() {
        return orderRejectedReturnBitfield5;
    }

    /**
     * BitSet OrderRejected byte 6.
     *
     * @return the OrderRejectedReturnBitfield6 field
     */
    public OrderRejectedReturnBitfield6Field orderRejectedReturnBitfield6() {
        return orderRejectedReturnBitfield6;
    }

    /**
     * BitSet OrderRejected byte 7.
     *
     * @return the OrderRejectedReturnBitfield7 field
     */
    public OrderRejectedReturnBitfield7Field orderRejectedReturnBitfield7() {
        return orderRejectedReturnBitfield7;
    }

    /**
     * BitSet OrderRejected byte 8.
     *
     * @return the OrderRejectedReturnBitfield8 field
     */
    public OrderRejectedReturnBitfield8Field orderRejectedReturnBitfield8() {
        return orderRejectedReturnBitfield8;
    }

    /**
     * BitSet OrderRejected byte 9.
     *
     * @return the OrderRejectedReturnBitfield9 field
     */
    public OrderRejectedReturnBitfield9Field orderRejectedReturnBitfield9() {
        return orderRejectedReturnBitfield9;
    }

    /**
     * BitSet OrderRejected byte 10.
     *
     * @return the OrderRejectedReturnBitfield10 field
     */
    public OrderRejectedReturnBitfield10Field orderRejectedReturnBitfield10() {
        return orderRejectedReturnBitfield10;
    }

    /**
     * BitSet OrderRejected byte 11.
     *
     * @return the OrderRejectedReturnBitfield11 field
     */
    public OrderRejectedReturnBitfield11Field orderRejectedReturnBitfield11() {
        return orderRejectedReturnBitfield11;
    }

    /**
     * BitSet OrderRejected byte 12.
     *
     * @return the OrderRejectedReturnBitfield12 field
     */
    public OrderRejectedReturnBitfield12Field orderRejectedReturnBitfield12() {
        return orderRejectedReturnBitfield12;
    }

    /**
     * BitSet OrderRejected byte 13.
     *
     * @return the OrderRejectedReturnBitfield13 field
     */
    public OrderRejectedReturnBitfield13Field orderRejectedReturnBitfield13() {
        return orderRejectedReturnBitfield13;
    }

    /**
     * BitSet OrderRejected byte 14.
     *
     * @return the OrderRejectedReturnBitfield14 field
     */
    public OrderRejectedReturnBitfield14Field orderRejectedReturnBitfield14() {
        return orderRejectedReturnBitfield14;
    }

    /**
     * BitSet OrderRejected byte 15.
     *
     * @return the OrderRejectedReturnBitfield15 field
     */
    public OrderRejectedReturnBitfield15Field orderRejectedReturnBitfield15() {
        return orderRejectedReturnBitfield15;
    }

    /**
     * BitSet OrderRejected byte 16.
     *
     * @return the OrderRejectedReturnBitfield16 field
     */
    public OrderRejectedReturnBitfield16Field orderRejectedReturnBitfield16() {
        return orderRejectedReturnBitfield16;
    }

    /**
     * BitSet OrderRejected byte 17.
     *
     * @return the OrderRejectedReturnBitfield17 field
     */
    public OrderRejectedReturnBitfield17Field orderRejectedReturnBitfield17() {
        return orderRejectedReturnBitfield17;
    }

    /**
     * BitSet OrderRejected byte 18.
     *
     * @return the OrderRejectedReturnBitfield18 field
     */
    public OrderRejectedReturnBitfield18Field orderRejectedReturnBitfield18() {
        return orderRejectedReturnBitfield18;
    }

    /**
     * BitSet OrderRejected byte 19.
     *
     * @return the OrderRejectedReturnBitfield19 field
     */
    public OrderRejectedReturnBitfield19Field orderRejectedReturnBitfield19() {
        return orderRejectedReturnBitfield19;
    }

    /**
     * BitSet OrderRejected byte 20.
     *
     * @return the OrderRejectedReturnBitfield20 field
     */
    public OrderRejectedReturnBitfield20Field orderRejectedReturnBitfield20() {
        return orderRejectedReturnBitfield20;
    }

    /**
     * BitSet OrderRejected byte 21.
     *
     * @return the OrderRejectedReturnBitfield21 field
     */
    public OrderRejectedReturnBitfield21Field orderRejectedReturnBitfield21() {
        return orderRejectedReturnBitfield21;
    }

    /**
     * BitSet OrderRejected byte 22.
     *
     * @return the OrderRejectedReturnBitfield22 field
     */
    public OrderRejectedReturnBitfield22Field orderRejectedReturnBitfield22() {
        return orderRejectedReturnBitfield22;
    }

    /**
     * Corresponds to Side (54) in Cboe FIX. 1=Buy 2=Sell 5=Sell Short (client affirms ability to borrow) 6=Sell Short Exempt
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Peg Difference
     *
     * @return the PegDifference field
     */
    public PegDifferenceField pegDifference() {
        return pegDifference;
    }

    /**
     * Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Exec Inst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * Ord Type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Time In Force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Min Qty
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Symbol Sfx
     *
     * @return the SymbolSfx field
     */
    public SymbolSfxField symbolSfx() {
        return symbolSfx;
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
     * Account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
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
     * Display Indicator
     *
     * @return the DisplayIndicator field
     */
    public DisplayIndicatorField displayIndicator() {
        return displayIndicator;
    }

    /**
     * Max Floor
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
    }

    /**
     * Discretion Amount
     *
     * @return the DiscretionAmount field
     */
    public DiscretionAmountField discretionAmount() {
        return discretionAmount;
    }

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 shares.
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Prevent Match
     *
     * @return the PreventMatch field
     */
    public PreventMatchField preventMatch() {
        return preventMatch;
    }

    /**
     * Secondary Order Id
     *
     * @return the SecondaryOrderId field
     */
    public SecondaryOrderIdField secondaryOrderId() {
        return secondaryOrderId;
    }

    /**
     * Attributed Quote
     *
     * @return the AttributedQuote field
     */
    public AttributedQuoteField attributedQuote() {
        return attributedQuote;
    }

    /**
     * Ext Exec Inst
     *
     * @return the ExtExecInst field
     */
    public ExtExecInstField extExecInst() {
        return extExecInst;
    }

    /**
     * Echo Text
     *
     * @return the EchoText field
     */
    public EchoTextField echoText() {
        return echoText;
    }

    /**
     * Stop Px
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Routing Inst
     *
     * @return the RoutingInst field
     */
    public RoutingInstField routingInst() {
        return routingInst;
    }

    /**
     * Rout Strategy
     *
     * @return the RoutStrategy field
     */
    public RoutStrategyField routStrategy() {
        return routStrategy;
    }

    /**
     * Route Delivery Method
     *
     * @return the RouteDeliveryMethod field
     */
    public RouteDeliveryMethodField routeDeliveryMethod() {
        return routeDeliveryMethod;
    }

    /**
     * Ex Destination
     *
     * @return the ExDestination field
     */
    public ExDestinationField exDestination() {
        return exDestination;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield1 is on the wire
     */
    public boolean orderRejectedReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield2 is on the wire
     */
    public boolean orderRejectedReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield3 is on the wire
     */
    public boolean orderRejectedReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield4 is on the wire
     */
    public boolean orderRejectedReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield5 is on the wire
     */
    public boolean orderRejectedReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield6 is on the wire
     */
    public boolean orderRejectedReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield7 is on the wire
     */
    public boolean orderRejectedReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield8 is on the wire
     */
    public boolean orderRejectedReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield9 is on the wire
     */
    public boolean orderRejectedReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield10 is on the wire
     */
    public boolean orderRejectedReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield11 is on the wire
     */
    public boolean orderRejectedReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield12 is on the wire
     */
    public boolean orderRejectedReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield13 is on the wire
     */
    public boolean orderRejectedReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield14 is on the wire
     */
    public boolean orderRejectedReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield15 is on the wire
     */
    public boolean orderRejectedReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield16 is on the wire
     */
    public boolean orderRejectedReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield17 is on the wire
     */
    public boolean orderRejectedReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield18 is on the wire
     */
    public boolean orderRejectedReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield19 is on the wire
     */
    public boolean orderRejectedReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield20 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield20 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield20 is on the wire
     */
    public boolean orderRejectedReturnBitfield20Present() {
        return numberOfReturnBitfields.value() >= 20L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield21 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield21 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield21 is on the wire
     */
    public boolean orderRejectedReturnBitfield21Present() {
        return numberOfReturnBitfields.value() >= 21L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield22 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield22 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield22 is on the wire
     */
    public boolean orderRejectedReturnBitfield22Present() {
        return numberOfReturnBitfields.value() >= 22L;
    }

    /**
     * Returns whether the fields before the Side put it on the wire.
     *
     * <p>Decode reads the Side where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Side is on the wire
     */
    public boolean sidePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedReturnBitfield1Present() && orderRejectedReturnBitfield1.orderRejectedReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the PegDifference put it on the wire.
     *
     * <p>Decode reads the PegDifference where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PegDifference is on the wire
     */
    public boolean pegDifferencePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedReturnBitfield1Present() && orderRejectedReturnBitfield1.orderRejectedReturnBitfield1PegDifference());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedReturnBitfield1Present() && orderRejectedReturnBitfield1.orderRejectedReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedReturnBitfield1Present() && orderRejectedReturnBitfield1.orderRejectedReturnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedReturnBitfield1Present() && orderRejectedReturnBitfield1.orderRejectedReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedReturnBitfield1Present() && orderRejectedReturnBitfield1.orderRejectedReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedReturnBitfield1Present() && orderRejectedReturnBitfield1.orderRejectedReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRejectedReturnBitfield2Present() && orderRejectedReturnBitfield2.orderRejectedReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the SymbolSfx put it on the wire.
     *
     * <p>Decode reads the SymbolSfx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolSfx is on the wire
     */
    public boolean symbolSfxPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRejectedReturnBitfield2Present() && orderRejectedReturnBitfield2.orderRejectedReturnBitfield2SymbolSfx());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRejectedReturnBitfield2Present() && orderRejectedReturnBitfield2.orderRejectedReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedReturnBitfield3Present() && orderRejectedReturnBitfield3.orderRejectedReturnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedReturnBitfield3Present() && orderRejectedReturnBitfield3.orderRejectedReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedReturnBitfield3Present() && orderRejectedReturnBitfield3.orderRejectedReturnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedReturnBitfield3Present() && orderRejectedReturnBitfield3.orderRejectedReturnBitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedReturnBitfield3Present() && orderRejectedReturnBitfield3.orderRejectedReturnBitfield3MaxFloor());
    }

    /**
     * Returns whether the fields before the DiscretionAmount put it on the wire.
     *
     * <p>Decode reads the DiscretionAmount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DiscretionAmount is on the wire
     */
    public boolean discretionAmountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedReturnBitfield3Present() && orderRejectedReturnBitfield3.orderRejectedReturnBitfield3DiscretionAmount());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedReturnBitfield3Present() && orderRejectedReturnBitfield3.orderRejectedReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedReturnBitfield3Present() && orderRejectedReturnBitfield3.orderRejectedReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the SecondaryOrderId put it on the wire.
     *
     * <p>Decode reads the SecondaryOrderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryOrderId is on the wire
     */
    public boolean secondaryOrderIdPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderRejectedReturnBitfield6Present() && orderRejectedReturnBitfield6.orderRejectedReturnBitfield6SecondaryOrderId());
    }

    /**
     * Returns whether the fields before the AttributedQuote put it on the wire.
     *
     * <p>Decode reads the AttributedQuote where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AttributedQuote is on the wire
     */
    public boolean attributedQuotePresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderRejectedReturnBitfield6Present() && orderRejectedReturnBitfield6.orderRejectedReturnBitfield6AttributedQuote());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderRejectedReturnBitfield6Present() && orderRejectedReturnBitfield6.orderRejectedReturnBitfield6ExtExecInst());
    }

    /**
     * Returns whether the fields before the EchoText put it on the wire.
     *
     * <p>Decode reads the EchoText where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EchoText is on the wire
     */
    public boolean echoTextPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRejectedReturnBitfield8Present() && orderRejectedReturnBitfield8.orderRejectedReturnBitfield8EchoText());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRejectedReturnBitfield8Present() && orderRejectedReturnBitfield8.orderRejectedReturnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRejectedReturnBitfield8Present() && orderRejectedReturnBitfield8.orderRejectedReturnBitfield8RoutingInst());
    }

    /**
     * Returns whether the fields before the RoutStrategy put it on the wire.
     *
     * <p>Decode reads the RoutStrategy where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutStrategy is on the wire
     */
    public boolean routStrategyPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRejectedReturnBitfield8Present() && orderRejectedReturnBitfield8.orderRejectedReturnBitfield8RoutStrategy());
    }

    /**
     * Returns whether the fields before the RouteDeliveryMethod put it on the wire.
     *
     * <p>Decode reads the RouteDeliveryMethod where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RouteDeliveryMethod is on the wire
     */
    public boolean routeDeliveryMethodPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRejectedReturnBitfield8Present() && orderRejectedReturnBitfield8.orderRejectedReturnBitfield8RouteDeliveryMethod());
    }

    /**
     * Returns whether the fields before the ExDestination put it on the wire.
     *
     * <p>Decode reads the ExDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExDestination is on the wire
     */
    public boolean exDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRejectedReturnBitfield8Present() && orderRejectedReturnBitfield8.orderRejectedReturnBitfield8ExDestination());
    }

    private boolean onWire(Field field) {
        return (field != orderRejectedReturnBitfield1 || orderRejectedReturnBitfield1Present()) && (field != orderRejectedReturnBitfield2 || orderRejectedReturnBitfield2Present()) && (field != orderRejectedReturnBitfield3 || orderRejectedReturnBitfield3Present()) && (field != orderRejectedReturnBitfield4 || orderRejectedReturnBitfield4Present()) && (field != orderRejectedReturnBitfield5 || orderRejectedReturnBitfield5Present()) && (field != orderRejectedReturnBitfield6 || orderRejectedReturnBitfield6Present()) && (field != orderRejectedReturnBitfield7 || orderRejectedReturnBitfield7Present()) && (field != orderRejectedReturnBitfield8 || orderRejectedReturnBitfield8Present()) && (field != orderRejectedReturnBitfield9 || orderRejectedReturnBitfield9Present()) && (field != orderRejectedReturnBitfield10 || orderRejectedReturnBitfield10Present()) && (field != orderRejectedReturnBitfield11 || orderRejectedReturnBitfield11Present()) && (field != orderRejectedReturnBitfield12 || orderRejectedReturnBitfield12Present()) && (field != orderRejectedReturnBitfield13 || orderRejectedReturnBitfield13Present()) && (field != orderRejectedReturnBitfield14 || orderRejectedReturnBitfield14Present()) && (field != orderRejectedReturnBitfield15 || orderRejectedReturnBitfield15Present()) && (field != orderRejectedReturnBitfield16 || orderRejectedReturnBitfield16Present()) && (field != orderRejectedReturnBitfield17 || orderRejectedReturnBitfield17Present()) && (field != orderRejectedReturnBitfield18 || orderRejectedReturnBitfield18Present()) && (field != orderRejectedReturnBitfield19 || orderRejectedReturnBitfield19Present()) && (field != orderRejectedReturnBitfield20 || orderRejectedReturnBitfield20Present()) && (field != orderRejectedReturnBitfield21 || orderRejectedReturnBitfield21Present()) && (field != orderRejectedReturnBitfield22 || orderRejectedReturnBitfield22Present()) && (field != side || sidePresent()) && (field != pegDifference || pegDifferencePresent()) && (field != price || pricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbol || symbolPresent()) && (field != symbolSfx || symbolSfxPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != maxFloor || maxFloorPresent()) && (field != discretionAmount || discretionAmountPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != secondaryOrderId || secondaryOrderIdPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != extExecInst || extExecInstPresent()) && (field != echoText || echoTextPresent()) && (field != stopPx || stopPxPresent()) && (field != routingInst || routingInstPresent()) && (field != routStrategy || routStrategyPresent()) && (field != routeDeliveryMethod || routeDeliveryMethodPresent()) && (field != exDestination || exDestinationPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderRejectedReturnBitfield1Present() ? OrderRejectedReturnBitfield1Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield2Present() ? OrderRejectedReturnBitfield2Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield3Present() ? OrderRejectedReturnBitfield3Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield4Present() ? OrderRejectedReturnBitfield4Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield5Present() ? OrderRejectedReturnBitfield5Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield6Present() ? OrderRejectedReturnBitfield6Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield7Present() ? OrderRejectedReturnBitfield7Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield8Present() ? OrderRejectedReturnBitfield8Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield9Present() ? OrderRejectedReturnBitfield9Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield10Present() ? OrderRejectedReturnBitfield10Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield11Present() ? OrderRejectedReturnBitfield11Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield12Present() ? OrderRejectedReturnBitfield12Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield13Present() ? OrderRejectedReturnBitfield13Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield14Present() ? OrderRejectedReturnBitfield14Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield15Present() ? OrderRejectedReturnBitfield15Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield16Present() ? OrderRejectedReturnBitfield16Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield17Present() ? OrderRejectedReturnBitfield17Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield18Present() ? OrderRejectedReturnBitfield18Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield19Present() ? OrderRejectedReturnBitfield19Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield20Present() ? OrderRejectedReturnBitfield20Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield21Present() ? OrderRejectedReturnBitfield21Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield22Present() ? OrderRejectedReturnBitfield22Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pegDifferencePresent() ? PegDifferenceField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (symbolSfxPresent() ? SymbolSfxField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (discretionAmountPresent() ? DiscretionAmountField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (secondaryOrderIdPresent() ? SecondaryOrderIdField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (routStrategyPresent() ? RoutStrategyField.BYTE_LENGTH : 0) + (routeDeliveryMethodPresent() ? RouteDeliveryMethodField.BYTE_LENGTH : 0) + (exDestinationPresent() ? ExDestinationField.BYTE_LENGTH : 0);
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
        cursor += 20;
        cursor += 1;
        cursor += 60;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (orderRejectedReturnBitfield1Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield2Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield3Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield4Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield5Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield6Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield7Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield8Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield9Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield10Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield11Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield12Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield13Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield14Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield15Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield16Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield17Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield18Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield19Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield20Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield21Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield22Present()) {
            cursor += 1;
        }
        if (sidePresent()) {
            cursor += 1;
        }
        if (pegDifferencePresent()) {
            cursor += 8;
        }
        if (pricePresent()) {
            cursor += 8;
        }
        if (execInstPresent()) {
            cursor += 1;
        }
        if (ordTypePresent()) {
            cursor += 1;
        }
        if (timeInForcePresent()) {
            cursor += 1;
        }
        if (minQtyPresent()) {
            cursor += 4;
        }
        if (symbolPresent()) {
            cursor += 8;
        }
        if (symbolSfxPresent()) {
            cursor += 8;
        }
        if (capacityPresent()) {
            cursor += 1;
        }
        if (accountPresent()) {
            cursor += 16;
        }
        if (clearingFirmPresent()) {
            cursor += 4;
        }
        if (clearingAccountPresent()) {
            cursor += 4;
        }
        if (displayIndicatorPresent()) {
            cursor += 1;
        }
        if (maxFloorPresent()) {
            cursor += 4;
        }
        if (discretionAmountPresent()) {
            cursor += 2;
        }
        if (orderQtyPresent()) {
            cursor += 4;
        }
        if (preventMatchPresent()) {
            cursor += 3;
        }
        if (secondaryOrderIdPresent()) {
            cursor += 8;
        }
        if (attributedQuotePresent()) {
            cursor += 1;
        }
        if (extExecInstPresent()) {
            cursor += 1;
        }
        if (echoTextPresent()) {
            cursor += 64;
        }
        if (stopPxPresent()) {
            cursor += 8;
        }
        if (routingInstPresent()) {
            cursor += 4;
        }
        if (routStrategyPresent()) {
            cursor += 6;
        }
        if (routeDeliveryMethodPresent()) {
            cursor += 3;
        }
        if (exDestinationPresent()) {
            cursor += 1;
        }
        return cursor;
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!orderRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += OrderRejectReasonField.BYTE_LENGTH;
        if (!text.parse(data, cursor)) {
            return false;
        }
        cursor += TextField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (orderRejectedReturnBitfield1Present()) {
            if (end - cursor < OrderRejectedReturnBitfield1Field.BYTE_LENGTH || !orderRejectedReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield2Present()) {
            if (end - cursor < OrderRejectedReturnBitfield2Field.BYTE_LENGTH || !orderRejectedReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield3Present()) {
            if (end - cursor < OrderRejectedReturnBitfield3Field.BYTE_LENGTH || !orderRejectedReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield4Present()) {
            if (end - cursor < OrderRejectedReturnBitfield4Field.BYTE_LENGTH || !orderRejectedReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield5Present()) {
            if (end - cursor < OrderRejectedReturnBitfield5Field.BYTE_LENGTH || !orderRejectedReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield6Present()) {
            if (end - cursor < OrderRejectedReturnBitfield6Field.BYTE_LENGTH || !orderRejectedReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield7Present()) {
            if (end - cursor < OrderRejectedReturnBitfield7Field.BYTE_LENGTH || !orderRejectedReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield8Present()) {
            if (end - cursor < OrderRejectedReturnBitfield8Field.BYTE_LENGTH || !orderRejectedReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield9Present()) {
            if (end - cursor < OrderRejectedReturnBitfield9Field.BYTE_LENGTH || !orderRejectedReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield10Present()) {
            if (end - cursor < OrderRejectedReturnBitfield10Field.BYTE_LENGTH || !orderRejectedReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield11Present()) {
            if (end - cursor < OrderRejectedReturnBitfield11Field.BYTE_LENGTH || !orderRejectedReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield12Present()) {
            if (end - cursor < OrderRejectedReturnBitfield12Field.BYTE_LENGTH || !orderRejectedReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield13Present()) {
            if (end - cursor < OrderRejectedReturnBitfield13Field.BYTE_LENGTH || !orderRejectedReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield14Present()) {
            if (end - cursor < OrderRejectedReturnBitfield14Field.BYTE_LENGTH || !orderRejectedReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield15Present()) {
            if (end - cursor < OrderRejectedReturnBitfield15Field.BYTE_LENGTH || !orderRejectedReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield16Present()) {
            if (end - cursor < OrderRejectedReturnBitfield16Field.BYTE_LENGTH || !orderRejectedReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield17Present()) {
            if (end - cursor < OrderRejectedReturnBitfield17Field.BYTE_LENGTH || !orderRejectedReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield18Present()) {
            if (end - cursor < OrderRejectedReturnBitfield18Field.BYTE_LENGTH || !orderRejectedReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield19Present()) {
            if (end - cursor < OrderRejectedReturnBitfield19Field.BYTE_LENGTH || !orderRejectedReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield20Present()) {
            if (end - cursor < OrderRejectedReturnBitfield20Field.BYTE_LENGTH || !orderRejectedReturnBitfield20.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield20Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield21Present()) {
            if (end - cursor < OrderRejectedReturnBitfield21Field.BYTE_LENGTH || !orderRejectedReturnBitfield21.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield21Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield22Present()) {
            if (end - cursor < OrderRejectedReturnBitfield22Field.BYTE_LENGTH || !orderRejectedReturnBitfield22.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield22Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (sidePresent()) {
            if (end - cursor < SideField.BYTE_LENGTH || !side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (pegDifferencePresent()) {
            if (end - cursor < PegDifferenceField.BYTE_LENGTH || !pegDifference.parse(data, cursor)) {
                return false;
            }
            cursor += PegDifferenceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (pricePresent()) {
            if (end - cursor < PriceField.BYTE_LENGTH || !price.parse(data, cursor)) {
                return false;
            }
            cursor += PriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (execInstPresent()) {
            if (end - cursor < ExecInstField.BYTE_LENGTH || !execInst.parse(data, cursor)) {
                return false;
            }
            cursor += ExecInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (ordTypePresent()) {
            if (end - cursor < OrdTypeField.BYTE_LENGTH || !ordType.parse(data, cursor)) {
                return false;
            }
            cursor += OrdTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (timeInForcePresent()) {
            if (end - cursor < TimeInForceField.BYTE_LENGTH || !timeInForce.parse(data, cursor)) {
                return false;
            }
            cursor += TimeInForceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (minQtyPresent()) {
            if (end - cursor < MinQtyField.BYTE_LENGTH || !minQty.parse(data, cursor)) {
                return false;
            }
            cursor += MinQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolPresent()) {
            if (end - cursor < SymbolField.BYTE_LENGTH || !symbol.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolSfxPresent()) {
            if (end - cursor < SymbolSfxField.BYTE_LENGTH || !symbolSfx.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolSfxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (capacityPresent()) {
            if (end - cursor < CapacityField.BYTE_LENGTH || !capacity.parse(data, cursor)) {
                return false;
            }
            cursor += CapacityField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (accountPresent()) {
            if (end - cursor < AccountField.BYTE_LENGTH || !account.parse(data, cursor)) {
                return false;
            }
            cursor += AccountField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingFirmPresent()) {
            if (end - cursor < ClearingFirmField.BYTE_LENGTH || !clearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingAccountPresent()) {
            if (end - cursor < ClearingAccountField.BYTE_LENGTH || !clearingAccount.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingAccountField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (displayIndicatorPresent()) {
            if (end - cursor < DisplayIndicatorField.BYTE_LENGTH || !displayIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += DisplayIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (maxFloorPresent()) {
            if (end - cursor < MaxFloorField.BYTE_LENGTH || !maxFloor.parse(data, cursor)) {
                return false;
            }
            cursor += MaxFloorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (discretionAmountPresent()) {
            if (end - cursor < DiscretionAmountField.BYTE_LENGTH || !discretionAmount.parse(data, cursor)) {
                return false;
            }
            cursor += DiscretionAmountField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderQtyPresent()) {
            if (end - cursor < OrderQtyField.BYTE_LENGTH || !orderQty.parse(data, cursor)) {
                return false;
            }
            cursor += OrderQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (preventMatchPresent()) {
            if (end - cursor < PreventMatchField.BYTE_LENGTH || !preventMatch.parse(data, cursor)) {
                return false;
            }
            cursor += PreventMatchField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (secondaryOrderIdPresent()) {
            if (end - cursor < SecondaryOrderIdField.BYTE_LENGTH || !secondaryOrderId.parse(data, cursor)) {
                return false;
            }
            cursor += SecondaryOrderIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (attributedQuotePresent()) {
            if (end - cursor < AttributedQuoteField.BYTE_LENGTH || !attributedQuote.parse(data, cursor)) {
                return false;
            }
            cursor += AttributedQuoteField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (extExecInstPresent()) {
            if (end - cursor < ExtExecInstField.BYTE_LENGTH || !extExecInst.parse(data, cursor)) {
                return false;
            }
            cursor += ExtExecInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (echoTextPresent()) {
            if (end - cursor < EchoTextField.BYTE_LENGTH || !echoText.parse(data, cursor)) {
                return false;
            }
            cursor += EchoTextField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (stopPxPresent()) {
            if (end - cursor < StopPxField.BYTE_LENGTH || !stopPx.parse(data, cursor)) {
                return false;
            }
            cursor += StopPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (routingInstPresent()) {
            if (end - cursor < RoutingInstField.BYTE_LENGTH || !routingInst.parse(data, cursor)) {
                return false;
            }
            cursor += RoutingInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (routStrategyPresent()) {
            if (end - cursor < RoutStrategyField.BYTE_LENGTH || !routStrategy.parse(data, cursor)) {
                return false;
            }
            cursor += RoutStrategyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (routeDeliveryMethodPresent()) {
            if (end - cursor < RouteDeliveryMethodField.BYTE_LENGTH || !routeDeliveryMethod.parse(data, cursor)) {
                return false;
            }
            cursor += RouteDeliveryMethodField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (exDestinationPresent()) {
            if (end - cursor < ExDestinationField.BYTE_LENGTH || !exDestination.parse(data, cursor)) {
                return false;
            }
            cursor += ExDestinationField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderRejectedReturnBitfield1Present() != orderRejectedReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield1.hasValue() ? "orderRejectedReturnBitfield1 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield2Present() != orderRejectedReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield2.hasValue() ? "orderRejectedReturnBitfield2 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield3Present() != orderRejectedReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield3.hasValue() ? "orderRejectedReturnBitfield3 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield4Present() != orderRejectedReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield4.hasValue() ? "orderRejectedReturnBitfield4 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield5Present() != orderRejectedReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield5.hasValue() ? "orderRejectedReturnBitfield5 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield6Present() != orderRejectedReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield6.hasValue() ? "orderRejectedReturnBitfield6 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield7Present() != orderRejectedReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield7.hasValue() ? "orderRejectedReturnBitfield7 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield8Present() != orderRejectedReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield8.hasValue() ? "orderRejectedReturnBitfield8 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield9Present() != orderRejectedReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield9.hasValue() ? "orderRejectedReturnBitfield9 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield10Present() != orderRejectedReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield10.hasValue() ? "orderRejectedReturnBitfield10 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield11Present() != orderRejectedReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield11.hasValue() ? "orderRejectedReturnBitfield11 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield12Present() != orderRejectedReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield12.hasValue() ? "orderRejectedReturnBitfield12 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield13Present() != orderRejectedReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield13.hasValue() ? "orderRejectedReturnBitfield13 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield14Present() != orderRejectedReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield14.hasValue() ? "orderRejectedReturnBitfield14 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield15Present() != orderRejectedReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield15.hasValue() ? "orderRejectedReturnBitfield15 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield16Present() != orderRejectedReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield16.hasValue() ? "orderRejectedReturnBitfield16 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield17Present() != orderRejectedReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield17.hasValue() ? "orderRejectedReturnBitfield17 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield18Present() != orderRejectedReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield18.hasValue() ? "orderRejectedReturnBitfield18 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield19Present() != orderRejectedReturnBitfield19.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield19.hasValue() ? "orderRejectedReturnBitfield19 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield20Present() != orderRejectedReturnBitfield20.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield20.hasValue() ? "orderRejectedReturnBitfield20 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield20 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield21Present() != orderRejectedReturnBitfield21.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield21.hasValue() ? "orderRejectedReturnBitfield21 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield21 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield22Present() != orderRejectedReturnBitfield22.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield22.hasValue() ? "orderRejectedReturnBitfield22 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield22 holds no value, though the fields before it put it on the wire");
        }
        if (sidePresent() != side.hasValue()) {
            throw new IllegalStateException(side.hasValue() ? "side holds a value the fields before it leave off the wire" : "side holds no value, though the fields before it put it on the wire");
        }
        if (pegDifferencePresent() != pegDifference.hasValue()) {
            throw new IllegalStateException(pegDifference.hasValue() ? "pegDifference holds a value the fields before it leave off the wire" : "pegDifference holds no value, though the fields before it put it on the wire");
        }
        if (pricePresent() != price.hasValue()) {
            throw new IllegalStateException(price.hasValue() ? "price holds a value the fields before it leave off the wire" : "price holds no value, though the fields before it put it on the wire");
        }
        if (execInstPresent() != execInst.hasValue()) {
            throw new IllegalStateException(execInst.hasValue() ? "execInst holds a value the fields before it leave off the wire" : "execInst holds no value, though the fields before it put it on the wire");
        }
        if (ordTypePresent() != ordType.hasValue()) {
            throw new IllegalStateException(ordType.hasValue() ? "ordType holds a value the fields before it leave off the wire" : "ordType holds no value, though the fields before it put it on the wire");
        }
        if (timeInForcePresent() != timeInForce.hasValue()) {
            throw new IllegalStateException(timeInForce.hasValue() ? "timeInForce holds a value the fields before it leave off the wire" : "timeInForce holds no value, though the fields before it put it on the wire");
        }
        if (minQtyPresent() != minQty.hasValue()) {
            throw new IllegalStateException(minQty.hasValue() ? "minQty holds a value the fields before it leave off the wire" : "minQty holds no value, though the fields before it put it on the wire");
        }
        if (symbolPresent() != symbol.hasValue()) {
            throw new IllegalStateException(symbol.hasValue() ? "symbol holds a value the fields before it leave off the wire" : "symbol holds no value, though the fields before it put it on the wire");
        }
        if (symbolSfxPresent() != symbolSfx.hasValue()) {
            throw new IllegalStateException(symbolSfx.hasValue() ? "symbolSfx holds a value the fields before it leave off the wire" : "symbolSfx holds no value, though the fields before it put it on the wire");
        }
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (accountPresent() != account.hasValue()) {
            throw new IllegalStateException(account.hasValue() ? "account holds a value the fields before it leave off the wire" : "account holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (clearingAccountPresent() != clearingAccount.hasValue()) {
            throw new IllegalStateException(clearingAccount.hasValue() ? "clearingAccount holds a value the fields before it leave off the wire" : "clearingAccount holds no value, though the fields before it put it on the wire");
        }
        if (displayIndicatorPresent() != displayIndicator.hasValue()) {
            throw new IllegalStateException(displayIndicator.hasValue() ? "displayIndicator holds a value the fields before it leave off the wire" : "displayIndicator holds no value, though the fields before it put it on the wire");
        }
        if (maxFloorPresent() != maxFloor.hasValue()) {
            throw new IllegalStateException(maxFloor.hasValue() ? "maxFloor holds a value the fields before it leave off the wire" : "maxFloor holds no value, though the fields before it put it on the wire");
        }
        if (discretionAmountPresent() != discretionAmount.hasValue()) {
            throw new IllegalStateException(discretionAmount.hasValue() ? "discretionAmount holds a value the fields before it leave off the wire" : "discretionAmount holds no value, though the fields before it put it on the wire");
        }
        if (orderQtyPresent() != orderQty.hasValue()) {
            throw new IllegalStateException(orderQty.hasValue() ? "orderQty holds a value the fields before it leave off the wire" : "orderQty holds no value, though the fields before it put it on the wire");
        }
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
        }
        if (secondaryOrderIdPresent() != secondaryOrderId.hasValue()) {
            throw new IllegalStateException(secondaryOrderId.hasValue() ? "secondaryOrderId holds a value the fields before it leave off the wire" : "secondaryOrderId holds no value, though the fields before it put it on the wire");
        }
        if (attributedQuotePresent() != attributedQuote.hasValue()) {
            throw new IllegalStateException(attributedQuote.hasValue() ? "attributedQuote holds a value the fields before it leave off the wire" : "attributedQuote holds no value, though the fields before it put it on the wire");
        }
        if (extExecInstPresent() != extExecInst.hasValue()) {
            throw new IllegalStateException(extExecInst.hasValue() ? "extExecInst holds a value the fields before it leave off the wire" : "extExecInst holds no value, though the fields before it put it on the wire");
        }
        if (echoTextPresent() != echoText.hasValue()) {
            throw new IllegalStateException(echoText.hasValue() ? "echoText holds a value the fields before it leave off the wire" : "echoText holds no value, though the fields before it put it on the wire");
        }
        if (stopPxPresent() != stopPx.hasValue()) {
            throw new IllegalStateException(stopPx.hasValue() ? "stopPx holds a value the fields before it leave off the wire" : "stopPx holds no value, though the fields before it put it on the wire");
        }
        if (routingInstPresent() != routingInst.hasValue()) {
            throw new IllegalStateException(routingInst.hasValue() ? "routingInst holds a value the fields before it leave off the wire" : "routingInst holds no value, though the fields before it put it on the wire");
        }
        if (routStrategyPresent() != routStrategy.hasValue()) {
            throw new IllegalStateException(routStrategy.hasValue() ? "routStrategy holds a value the fields before it leave off the wire" : "routStrategy holds no value, though the fields before it put it on the wire");
        }
        if (routeDeliveryMethodPresent() != routeDeliveryMethod.hasValue()) {
            throw new IllegalStateException(routeDeliveryMethod.hasValue() ? "routeDeliveryMethod holds a value the fields before it leave off the wire" : "routeDeliveryMethod holds no value, though the fields before it put it on the wire");
        }
        if (exDestinationPresent() != exDestination.hasValue()) {
            throw new IllegalStateException(exDestination.hasValue() ? "exDestination holds a value the fields before it leave off the wire" : "exDestination holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderRejectReason.encode(data, cursor);
        cursor = text.encode(data, cursor);
        if (buffer != null && buffer.length >= 90) {
            System.arraycopy(buffer, 89, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (orderRejectedReturnBitfield1Present()) {
            cursor = orderRejectedReturnBitfield1.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield2Present()) {
            cursor = orderRejectedReturnBitfield2.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield3Present()) {
            cursor = orderRejectedReturnBitfield3.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield4Present()) {
            cursor = orderRejectedReturnBitfield4.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield5Present()) {
            cursor = orderRejectedReturnBitfield5.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield6Present()) {
            cursor = orderRejectedReturnBitfield6.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield7Present()) {
            cursor = orderRejectedReturnBitfield7.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield8Present()) {
            cursor = orderRejectedReturnBitfield8.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield9Present()) {
            cursor = orderRejectedReturnBitfield9.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield10Present()) {
            cursor = orderRejectedReturnBitfield10.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield11Present()) {
            cursor = orderRejectedReturnBitfield11.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield12Present()) {
            cursor = orderRejectedReturnBitfield12.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield13Present()) {
            cursor = orderRejectedReturnBitfield13.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield14Present()) {
            cursor = orderRejectedReturnBitfield14.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield15Present()) {
            cursor = orderRejectedReturnBitfield15.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield16Present()) {
            cursor = orderRejectedReturnBitfield16.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield17Present()) {
            cursor = orderRejectedReturnBitfield17.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield18Present()) {
            cursor = orderRejectedReturnBitfield18.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield19Present()) {
            cursor = orderRejectedReturnBitfield19.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield20Present()) {
            cursor = orderRejectedReturnBitfield20.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield21Present()) {
            cursor = orderRejectedReturnBitfield21.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield22Present()) {
            cursor = orderRejectedReturnBitfield22.encode(data, cursor);
        }
        if (sidePresent()) {
            cursor = side.encode(data, cursor);
        }
        if (pegDifferencePresent()) {
            cursor = pegDifference.encode(data, cursor);
        }
        if (pricePresent()) {
            cursor = price.encode(data, cursor);
        }
        if (execInstPresent()) {
            cursor = execInst.encode(data, cursor);
        }
        if (ordTypePresent()) {
            cursor = ordType.encode(data, cursor);
        }
        if (timeInForcePresent()) {
            cursor = timeInForce.encode(data, cursor);
        }
        if (minQtyPresent()) {
            cursor = minQty.encode(data, cursor);
        }
        if (symbolPresent()) {
            cursor = symbol.encode(data, cursor);
        }
        if (symbolSfxPresent()) {
            cursor = symbolSfx.encode(data, cursor);
        }
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        if (accountPresent()) {
            cursor = account.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (clearingAccountPresent()) {
            cursor = clearingAccount.encode(data, cursor);
        }
        if (displayIndicatorPresent()) {
            cursor = displayIndicator.encode(data, cursor);
        }
        if (maxFloorPresent()) {
            cursor = maxFloor.encode(data, cursor);
        }
        if (discretionAmountPresent()) {
            cursor = discretionAmount.encode(data, cursor);
        }
        if (orderQtyPresent()) {
            cursor = orderQty.encode(data, cursor);
        }
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
        }
        if (secondaryOrderIdPresent()) {
            cursor = secondaryOrderId.encode(data, cursor);
        }
        if (attributedQuotePresent()) {
            cursor = attributedQuote.encode(data, cursor);
        }
        if (extExecInstPresent()) {
            cursor = extExecInst.encode(data, cursor);
        }
        if (echoTextPresent()) {
            cursor = echoText.encode(data, cursor);
        }
        if (stopPxPresent()) {
            cursor = stopPx.encode(data, cursor);
        }
        if (routingInstPresent()) {
            cursor = routingInst.encode(data, cursor);
        }
        if (routStrategyPresent()) {
            cursor = routStrategy.encode(data, cursor);
        }
        if (routeDeliveryMethodPresent()) {
            cursor = routeDeliveryMethod.encode(data, cursor);
        }
        if (exDestinationPresent()) {
            cursor = exDestination.encode(data, cursor);
        }
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
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields()) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields()) {
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
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "TransactionTime" -> Optional.of(transactionTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderRejectReason" -> Optional.of(orderRejectReason);
            case "Text" -> Optional.of(text);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "OrderRejectedReturnBitfield1" -> Optional.of(orderRejectedReturnBitfield1);
            case "OrderRejectedReturnBitfield2" -> Optional.of(orderRejectedReturnBitfield2);
            case "OrderRejectedReturnBitfield3" -> Optional.of(orderRejectedReturnBitfield3);
            case "OrderRejectedReturnBitfield4" -> Optional.of(orderRejectedReturnBitfield4);
            case "OrderRejectedReturnBitfield5" -> Optional.of(orderRejectedReturnBitfield5);
            case "OrderRejectedReturnBitfield6" -> Optional.of(orderRejectedReturnBitfield6);
            case "OrderRejectedReturnBitfield7" -> Optional.of(orderRejectedReturnBitfield7);
            case "OrderRejectedReturnBitfield8" -> Optional.of(orderRejectedReturnBitfield8);
            case "OrderRejectedReturnBitfield9" -> Optional.of(orderRejectedReturnBitfield9);
            case "OrderRejectedReturnBitfield10" -> Optional.of(orderRejectedReturnBitfield10);
            case "OrderRejectedReturnBitfield11" -> Optional.of(orderRejectedReturnBitfield11);
            case "OrderRejectedReturnBitfield12" -> Optional.of(orderRejectedReturnBitfield12);
            case "OrderRejectedReturnBitfield13" -> Optional.of(orderRejectedReturnBitfield13);
            case "OrderRejectedReturnBitfield14" -> Optional.of(orderRejectedReturnBitfield14);
            case "OrderRejectedReturnBitfield15" -> Optional.of(orderRejectedReturnBitfield15);
            case "OrderRejectedReturnBitfield16" -> Optional.of(orderRejectedReturnBitfield16);
            case "OrderRejectedReturnBitfield17" -> Optional.of(orderRejectedReturnBitfield17);
            case "OrderRejectedReturnBitfield18" -> Optional.of(orderRejectedReturnBitfield18);
            case "OrderRejectedReturnBitfield19" -> Optional.of(orderRejectedReturnBitfield19);
            case "OrderRejectedReturnBitfield20" -> Optional.of(orderRejectedReturnBitfield20);
            case "OrderRejectedReturnBitfield21" -> Optional.of(orderRejectedReturnBitfield21);
            case "OrderRejectedReturnBitfield22" -> Optional.of(orderRejectedReturnBitfield22);
            case "Side" -> Optional.of(side);
            case "PegDifference" -> Optional.of(pegDifference);
            case "Price" -> Optional.of(price);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "Symbol" -> Optional.of(symbol);
            case "SymbolSfx" -> Optional.of(symbolSfx);
            case "Capacity" -> Optional.of(capacity);
            case "Account" -> Optional.of(account);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "DiscretionAmount" -> Optional.of(discretionAmount);
            case "OrderQty" -> Optional.of(orderQty);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "ExtExecInst" -> Optional.of(extExecInst);
            case "EchoText" -> Optional.of(echoText);
            case "StopPx" -> Optional.of(stopPx);
            case "RoutingInst" -> Optional.of(routingInst);
            case "RoutStrategy" -> Optional.of(routStrategy);
            case "RouteDeliveryMethod" -> Optional.of(routeDeliveryMethod);
            case "ExDestination" -> Optional.of(exDestination);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderRejectedMessage message)) {
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
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
        if (!(other instanceof OrderRejectedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
