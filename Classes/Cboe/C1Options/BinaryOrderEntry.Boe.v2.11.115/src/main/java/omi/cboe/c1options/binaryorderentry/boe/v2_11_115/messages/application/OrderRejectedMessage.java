package omi.cboe.c1options.binaryorderentry.boe.v2_11_115.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.AccountField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.AllocQtyField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.AttributedQuoteField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.AuctionIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CapacityField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ClOrdIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ClearingAccountField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ClearingFirmField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ClearingOptionalDataField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ClientIdAttrField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CmtaNumberField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ComboOrderField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CompressionField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ContraCapacityField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CorrectedSizeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CrossExclusionIndicatorField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CrossIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CrossInitiatorField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CrossOnBehalfOfIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.DisplayIndicatorField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.EchoTextField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.EquityPartyIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ExDestinationField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ExecInstField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.FloorDestinationField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.FloorRoutingInstField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.FrequentTraderIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.GiveUpFirmIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.HeldField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.MarketingFeeCodeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.MaturityDateField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.MaxFloorField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.MinQtyField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.MultiClassSprdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NumberOfReturnBitfieldsField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OpenCloseField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrdTypeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderOriginField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderQtyBinaryField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectReasonField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield10Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield11Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield12Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield13Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield14Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield15Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield16Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield17Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield18Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield19Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield1Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield20Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield21Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield2Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield3Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield4Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield5Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield6Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield7Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield8Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderRejectedReturnBitfield9Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PreventMatchField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PriceBinaryPriceField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PriceTypeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PutOrCallField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.RoutStrategyField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.RouteDeliveryMethodField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.RoutingFirmIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.RoutingInstField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.SecondaryOrderIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.SessionEligibilityField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.SideField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.StopPxField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.StopPxTypeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.StrategyIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.StrikePriceField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.SubreasonField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.SymbolAlphanumericField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.TargetPartyIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.TextField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.TimeInForceField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.TransactionTimeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.Message;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.PrintOptions;

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
     * Report send time (for audit).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol (@) and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived, persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Reason for an order rejection. See Order Reason Codes for a list of possible reasons.
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
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     */
    private final SideField side = new SideField();

    /**
     * Price Binary Price
     */
    private final PriceBinaryPriceField priceBinaryPrice = new PriceBinaryPriceField();

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
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField symbolAlphanumeric = new SymbolAlphanumericField();

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
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 contracts.
     */
    private final OrderQtyBinaryField orderQtyBinary = new OrderQtyBinaryField();

    /**
     * Prevent Match
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Maturity Date
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Strike Price
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Put Or Call
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Open Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Corrected Size
     */
    private final CorrectedSizeField correctedSize = new CorrectedSizeField();

    /**
     * Secondary Order Id
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * Contra Capacity
     */
    private final ContraCapacityField contraCapacity = new ContraCapacityField();

    /**
     * Attributed Quote
     */
    private final AttributedQuoteField attributedQuote = new AttributedQuoteField();

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
     * Marketing Fee Code
     */
    private final MarketingFeeCodeField marketingFeeCode = new MarketingFeeCodeField();

    /**
     * Target Party Id
     */
    private final TargetPartyIdField targetPartyId = new TargetPartyIdField();

    /**
     * Auction Id
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Cmta Number
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33- 126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes.
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Alloc Qty
     */
    private final AllocQtyField allocQty = new AllocQtyField();

    /**
     * Give Up Firm Id
     */
    private final GiveUpFirmIdField giveUpFirmId = new GiveUpFirmIdField();

    /**
     * Routing Firm Id
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * Cross Exclusion Indicator
     */
    private final CrossExclusionIndicatorField crossExclusionIndicator = new CrossExclusionIndicatorField();

    /**
     * Clearing Optional Data
     */
    private final ClearingOptionalDataField clearingOptionalData = new ClearingOptionalDataField();

    /**
     * Equity Party Id
     */
    private final EquityPartyIdField equityPartyId = new EquityPartyIdField();

    /**
     * Client Id Attr
     */
    private final ClientIdAttrField clientIdAttr = new ClientIdAttrField();

    /**
     * Frequent Trader Id
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

    /**
     * Session Eligibility
     */
    private final SessionEligibilityField sessionEligibility = new SessionEligibilityField();

    /**
     * Combo Order
     */
    private final ComboOrderField comboOrder = new ComboOrderField();

    /**
     * Compression
     */
    private final CompressionField compression = new CompressionField();

    /**
     * Floor Destination
     */
    private final FloorDestinationField floorDestination = new FloorDestinationField();

    /**
     * Floor Routing Inst
     */
    private final FloorRoutingInstField floorRoutingInst = new FloorRoutingInstField();

    /**
     * Multi Class Sprd
     */
    private final MultiClassSprdField multiClassSprd = new MultiClassSprdField();

    /**
     * Order Origin
     */
    private final OrderOriginField orderOrigin = new OrderOriginField();

    /**
     * Price Type
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * Strategy Id
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * Cross Initiator
     */
    private final CrossInitiatorField crossInitiator = new CrossInitiatorField();

    /**
     * Subreason
     */
    private final SubreasonField subreason = new SubreasonField();

    /**
     * Held
     */
    private final HeldField held = new HeldField();

    /**
     * Cross On Behalf Of Id
     */
    private final CrossOnBehalfOfIdField crossOnBehalfOfId = new CrossOnBehalfOfIdField();

    /**
     * Stop Px Type
     */
    private final StopPxTypeField stopPxType = new StopPxTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderRejectReason, text, numberOfReturnBitfields, orderRejectedReturnBitfield1, orderRejectedReturnBitfield2, orderRejectedReturnBitfield3, orderRejectedReturnBitfield4, orderRejectedReturnBitfield5, orderRejectedReturnBitfield6, orderRejectedReturnBitfield7, orderRejectedReturnBitfield8, orderRejectedReturnBitfield9, orderRejectedReturnBitfield10, orderRejectedReturnBitfield11, orderRejectedReturnBitfield12, orderRejectedReturnBitfield13, orderRejectedReturnBitfield14, orderRejectedReturnBitfield15, orderRejectedReturnBitfield16, orderRejectedReturnBitfield17, orderRejectedReturnBitfield18, orderRejectedReturnBitfield19, orderRejectedReturnBitfield20, orderRejectedReturnBitfield21, side, priceBinaryPrice, execInst, ordType, timeInForce, minQty, symbolAlphanumeric, capacity, account, clearingFirm, clearingAccount, displayIndicator, maxFloor, orderQtyBinary, preventMatch, maturityDate, strikePrice, putOrCall, openClose, correctedSize, secondaryOrderId, contraCapacity, attributedQuote, echoText, stopPx, routingInst, routStrategy, routeDeliveryMethod, exDestination, marketingFeeCode, targetPartyId, auctionId, cmtaNumber, crossId, allocQty, giveUpFirmId, routingFirmId, crossExclusionIndicator, clearingOptionalData, equityPartyId, clientIdAttr, frequentTraderId, sessionEligibility, comboOrder, compression, floorDestination, floorRoutingInst, multiClassSprd, orderOrigin, priceType, strategyId, crossInitiator, subreason, held, crossOnBehalfOfId, stopPxType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Report send time (for audit).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol (@) and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived, persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Reason for an order rejection. See Order Reason Codes for a list of possible reasons.
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
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
     * Symbol Alphanumeric
     *
     * @return the SymbolAlphanumeric field
     */
    public SymbolAlphanumericField symbolAlphanumeric() {
        return symbolAlphanumeric;
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
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 contracts.
     *
     * @return the OrderQtyBinary field
     */
    public OrderQtyBinaryField orderQtyBinary() {
        return orderQtyBinary;
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
     * Maturity Date
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
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
     * Put Or Call
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
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
     * Corrected Size
     *
     * @return the CorrectedSize field
     */
    public CorrectedSizeField correctedSize() {
        return correctedSize;
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
     * Contra Capacity
     *
     * @return the ContraCapacity field
     */
    public ContraCapacityField contraCapacity() {
        return contraCapacity;
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
     * Marketing Fee Code
     *
     * @return the MarketingFeeCode field
     */
    public MarketingFeeCodeField marketingFeeCode() {
        return marketingFeeCode;
    }

    /**
     * Target Party Id
     *
     * @return the TargetPartyId field
     */
    public TargetPartyIdField targetPartyId() {
        return targetPartyId;
    }

    /**
     * Auction Id
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
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
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33- 126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes.
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
    }

    /**
     * Alloc Qty
     *
     * @return the AllocQty field
     */
    public AllocQtyField allocQty() {
        return allocQty;
    }

    /**
     * Give Up Firm Id
     *
     * @return the GiveUpFirmId field
     */
    public GiveUpFirmIdField giveUpFirmId() {
        return giveUpFirmId;
    }

    /**
     * Routing Firm Id
     *
     * @return the RoutingFirmId field
     */
    public RoutingFirmIdField routingFirmId() {
        return routingFirmId;
    }

    /**
     * Cross Exclusion Indicator
     *
     * @return the CrossExclusionIndicator field
     */
    public CrossExclusionIndicatorField crossExclusionIndicator() {
        return crossExclusionIndicator;
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
     * Equity Party Id
     *
     * @return the EquityPartyId field
     */
    public EquityPartyIdField equityPartyId() {
        return equityPartyId;
    }

    /**
     * Client Id Attr
     *
     * @return the ClientIdAttr field
     */
    public ClientIdAttrField clientIdAttr() {
        return clientIdAttr;
    }

    /**
     * Frequent Trader Id
     *
     * @return the FrequentTraderId field
     */
    public FrequentTraderIdField frequentTraderId() {
        return frequentTraderId;
    }

    /**
     * Session Eligibility
     *
     * @return the SessionEligibility field
     */
    public SessionEligibilityField sessionEligibility() {
        return sessionEligibility;
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
     * Compression
     *
     * @return the Compression field
     */
    public CompressionField compression() {
        return compression;
    }

    /**
     * Floor Destination
     *
     * @return the FloorDestination field
     */
    public FloorDestinationField floorDestination() {
        return floorDestination;
    }

    /**
     * Floor Routing Inst
     *
     * @return the FloorRoutingInst field
     */
    public FloorRoutingInstField floorRoutingInst() {
        return floorRoutingInst;
    }

    /**
     * Multi Class Sprd
     *
     * @return the MultiClassSprd field
     */
    public MultiClassSprdField multiClassSprd() {
        return multiClassSprd;
    }

    /**
     * Order Origin
     *
     * @return the OrderOrigin field
     */
    public OrderOriginField orderOrigin() {
        return orderOrigin;
    }

    /**
     * Price Type
     *
     * @return the PriceType field
     */
    public PriceTypeField priceType() {
        return priceType;
    }

    /**
     * Strategy Id
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * Cross Initiator
     *
     * @return the CrossInitiator field
     */
    public CrossInitiatorField crossInitiator() {
        return crossInitiator;
    }

    /**
     * Subreason
     *
     * @return the Subreason field
     */
    public SubreasonField subreason() {
        return subreason;
    }

    /**
     * Held
     *
     * @return the Held field
     */
    public HeldField held() {
        return held;
    }

    /**
     * Cross On Behalf Of Id
     *
     * @return the CrossOnBehalfOfId field
     */
    public CrossOnBehalfOfIdField crossOnBehalfOfId() {
        return crossOnBehalfOfId;
    }

    /**
     * Stop Px Type
     *
     * @return the StopPxType field
     */
    public StopPxTypeField stopPxType() {
        return stopPxType;
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
     * Returns whether the fields before the PriceBinaryPrice put it on the wire.
     *
     * <p>Decode reads the PriceBinaryPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceBinaryPrice is on the wire
     */
    public boolean priceBinaryPricePresent() {
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
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRejectedReturnBitfield2Present() && orderRejectedReturnBitfield2.orderRejectedReturnBitfield2Symbol());
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
     * Returns whether the fields before the OrderQtyBinary put it on the wire.
     *
     * <p>Decode reads the OrderQtyBinary where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQtyBinary is on the wire
     */
    public boolean orderQtyBinaryPresent() {
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
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderRejectedReturnBitfield4Present() && orderRejectedReturnBitfield4.orderRejectedReturnBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the StrikePrice put it on the wire.
     *
     * <p>Decode reads the StrikePrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StrikePrice is on the wire
     */
    public boolean strikePricePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderRejectedReturnBitfield4Present() && orderRejectedReturnBitfield4.orderRejectedReturnBitfield4StrikePrice());
    }

    /**
     * Returns whether the fields before the PutOrCall put it on the wire.
     *
     * <p>Decode reads the PutOrCall where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PutOrCall is on the wire
     */
    public boolean putOrCallPresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderRejectedReturnBitfield4Present() && orderRejectedReturnBitfield4.orderRejectedReturnBitfield4PutOrCall());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderRejectedReturnBitfield4Present() && orderRejectedReturnBitfield4.orderRejectedReturnBitfield4OpenClose());
    }

    /**
     * Returns whether the fields before the CorrectedSize put it on the wire.
     *
     * <p>Decode reads the CorrectedSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CorrectedSize is on the wire
     */
    public boolean correctedSizePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderRejectedReturnBitfield4Present() && orderRejectedReturnBitfield4.orderRejectedReturnBitfield4CorrectedSize());
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
     * Returns whether the fields before the ContraCapacity put it on the wire.
     *
     * <p>Decode reads the ContraCapacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ContraCapacity is on the wire
     */
    public boolean contraCapacityPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderRejectedReturnBitfield6Present() && orderRejectedReturnBitfield6.orderRejectedReturnBitfield6ContraCapacity());
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

    /**
     * Returns whether the fields before the MarketingFeeCode put it on the wire.
     *
     * <p>Decode reads the MarketingFeeCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketingFeeCode is on the wire
     */
    public boolean marketingFeeCodePresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderRejectedReturnBitfield9Present() && orderRejectedReturnBitfield9.orderRejectedReturnBitfield9MarketingFeeCode());
    }

    /**
     * Returns whether the fields before the TargetPartyId put it on the wire.
     *
     * <p>Decode reads the TargetPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TargetPartyId is on the wire
     */
    public boolean targetPartyIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderRejectedReturnBitfield9Present() && orderRejectedReturnBitfield9.orderRejectedReturnBitfield9TargetPartyId());
    }

    /**
     * Returns whether the fields before the AuctionId put it on the wire.
     *
     * <p>Decode reads the AuctionId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AuctionId is on the wire
     */
    public boolean auctionIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderRejectedReturnBitfield9Present() && orderRejectedReturnBitfield9.orderRejectedReturnBitfield9AuctionId());
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderRejectedReturnBitfield9Present() && orderRejectedReturnBitfield9.orderRejectedReturnBitfield9CmtaNumber());
    }

    /**
     * Returns whether the fields before the CrossId put it on the wire.
     *
     * <p>Decode reads the CrossId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossId is on the wire
     */
    public boolean crossIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderRejectedReturnBitfield10Present() && orderRejectedReturnBitfield10.orderRejectedReturnBitfield10CrossId());
    }

    /**
     * Returns whether the fields before the AllocQty put it on the wire.
     *
     * <p>Decode reads the AllocQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AllocQty is on the wire
     */
    public boolean allocQtyPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderRejectedReturnBitfield10Present() && orderRejectedReturnBitfield10.orderRejectedReturnBitfield10AllocQty());
    }

    /**
     * Returns whether the fields before the GiveUpFirmId put it on the wire.
     *
     * <p>Decode reads the GiveUpFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the GiveUpFirmId is on the wire
     */
    public boolean giveUpFirmIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderRejectedReturnBitfield10Present() && orderRejectedReturnBitfield10.orderRejectedReturnBitfield10GiveUpFirmId());
    }

    /**
     * Returns whether the fields before the RoutingFirmId put it on the wire.
     *
     * <p>Decode reads the RoutingFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingFirmId is on the wire
     */
    public boolean routingFirmIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderRejectedReturnBitfield10Present() && orderRejectedReturnBitfield10.orderRejectedReturnBitfield10RoutingFirmId());
    }

    /**
     * Returns whether the fields before the CrossExclusionIndicator put it on the wire.
     *
     * <p>Decode reads the CrossExclusionIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossExclusionIndicator is on the wire
     */
    public boolean crossExclusionIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderRejectedReturnBitfield10Present() && orderRejectedReturnBitfield10.orderRejectedReturnBitfield10CrossExclusionIndicator());
    }

    /**
     * Returns whether the fields before the ClearingOptionalData put it on the wire.
     *
     * <p>Decode reads the ClearingOptionalData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingOptionalData is on the wire
     */
    public boolean clearingOptionalDataPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderRejectedReturnBitfield12Present() && orderRejectedReturnBitfield12.orderRejectedReturnBitfield12ClearingOptionalData());
    }

    /**
     * Returns whether the fields before the EquityPartyId put it on the wire.
     *
     * <p>Decode reads the EquityPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityPartyId is on the wire
     */
    public boolean equityPartyIdPresent() {
        return (numberOfReturnBitfields.value() >= 15L) && (orderRejectedReturnBitfield15Present() && orderRejectedReturnBitfield15.orderRejectedReturnBitfield15EquityPartyId());
    }

    /**
     * Returns whether the fields before the ClientIdAttr put it on the wire.
     *
     * <p>Decode reads the ClientIdAttr where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientIdAttr is on the wire
     */
    public boolean clientIdAttrPresent() {
        return (numberOfReturnBitfields.value() >= 15L) && (orderRejectedReturnBitfield15Present() && orderRejectedReturnBitfield15.orderRejectedReturnBitfield15ClientIdAttr());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRejectedReturnBitfield16Present() && orderRejectedReturnBitfield16.orderRejectedReturnBitfield16FrequentTraderId());
    }

    /**
     * Returns whether the fields before the SessionEligibility put it on the wire.
     *
     * <p>Decode reads the SessionEligibility where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SessionEligibility is on the wire
     */
    public boolean sessionEligibilityPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRejectedReturnBitfield16Present() && orderRejectedReturnBitfield16.orderRejectedReturnBitfield16SessionEligibility());
    }

    /**
     * Returns whether the fields before the ComboOrder put it on the wire.
     *
     * <p>Decode reads the ComboOrder where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComboOrder is on the wire
     */
    public boolean comboOrderPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRejectedReturnBitfield16Present() && orderRejectedReturnBitfield16.orderRejectedReturnBitfield16ComboOrder());
    }

    /**
     * Returns whether the fields before the Compression put it on the wire.
     *
     * <p>Decode reads the Compression where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Compression is on the wire
     */
    public boolean compressionPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRejectedReturnBitfield16Present() && orderRejectedReturnBitfield16.orderRejectedReturnBitfield16Compression());
    }

    /**
     * Returns whether the fields before the FloorDestination put it on the wire.
     *
     * <p>Decode reads the FloorDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FloorDestination is on the wire
     */
    public boolean floorDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRejectedReturnBitfield16Present() && orderRejectedReturnBitfield16.orderRejectedReturnBitfield16FloorDestination());
    }

    /**
     * Returns whether the fields before the FloorRoutingInst put it on the wire.
     *
     * <p>Decode reads the FloorRoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FloorRoutingInst is on the wire
     */
    public boolean floorRoutingInstPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRejectedReturnBitfield16Present() && orderRejectedReturnBitfield16.orderRejectedReturnBitfield16FloorRoutingInst());
    }

    /**
     * Returns whether the fields before the MultiClassSprd put it on the wire.
     *
     * <p>Decode reads the MultiClassSprd where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MultiClassSprd is on the wire
     */
    public boolean multiClassSprdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRejectedReturnBitfield16Present() && orderRejectedReturnBitfield16.orderRejectedReturnBitfield16MultiClassSprd());
    }

    /**
     * Returns whether the fields before the OrderOrigin put it on the wire.
     *
     * <p>Decode reads the OrderOrigin where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigin is on the wire
     */
    public boolean orderOriginPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRejectedReturnBitfield16Present() && orderRejectedReturnBitfield16.orderRejectedReturnBitfield16OrderOrigin());
    }

    /**
     * Returns whether the fields before the PriceType put it on the wire.
     *
     * <p>Decode reads the PriceType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceType is on the wire
     */
    public boolean priceTypePresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderRejectedReturnBitfield17Present() && orderRejectedReturnBitfield17.orderRejectedReturnBitfield17PriceType());
    }

    /**
     * Returns whether the fields before the StrategyId put it on the wire.
     *
     * <p>Decode reads the StrategyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StrategyId is on the wire
     */
    public boolean strategyIdPresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderRejectedReturnBitfield17Present() && orderRejectedReturnBitfield17.orderRejectedReturnBitfield17StrategyId());
    }

    /**
     * Returns whether the fields before the CrossInitiator put it on the wire.
     *
     * <p>Decode reads the CrossInitiator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossInitiator is on the wire
     */
    public boolean crossInitiatorPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderRejectedReturnBitfield18Present() && orderRejectedReturnBitfield18.orderRejectedReturnBitfield18CrossInitiator());
    }

    /**
     * Returns whether the fields before the Subreason put it on the wire.
     *
     * <p>Decode reads the Subreason where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Subreason is on the wire
     */
    public boolean subreasonPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderRejectedReturnBitfield18Present() && orderRejectedReturnBitfield18.orderRejectedReturnBitfield18Subreason());
    }

    /**
     * Returns whether the fields before the Held put it on the wire.
     *
     * <p>Decode reads the Held where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Held is on the wire
     */
    public boolean heldPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderRejectedReturnBitfield18Present() && orderRejectedReturnBitfield18.orderRejectedReturnBitfield18Held());
    }

    /**
     * Returns whether the fields before the CrossOnBehalfOfId put it on the wire.
     *
     * <p>Decode reads the CrossOnBehalfOfId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOnBehalfOfId is on the wire
     */
    public boolean crossOnBehalfOfIdPresent() {
        return (numberOfReturnBitfields.value() >= 19L) && (orderRejectedReturnBitfield19Present() && orderRejectedReturnBitfield19.orderRejectedReturnBitfield19CrossOnBehalfOfId());
    }

    /**
     * Returns whether the fields before the StopPxType put it on the wire.
     *
     * <p>Decode reads the StopPxType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPxType is on the wire
     */
    public boolean stopPxTypePresent() {
        return (numberOfReturnBitfields.value() >= 19L) && (orderRejectedReturnBitfield19Present() && orderRejectedReturnBitfield19.orderRejectedReturnBitfield19StopPxType());
    }

    private boolean onWire(Field field) {
        return (field != orderRejectedReturnBitfield1 || orderRejectedReturnBitfield1Present()) && (field != orderRejectedReturnBitfield2 || orderRejectedReturnBitfield2Present()) && (field != orderRejectedReturnBitfield3 || orderRejectedReturnBitfield3Present()) && (field != orderRejectedReturnBitfield4 || orderRejectedReturnBitfield4Present()) && (field != orderRejectedReturnBitfield5 || orderRejectedReturnBitfield5Present()) && (field != orderRejectedReturnBitfield6 || orderRejectedReturnBitfield6Present()) && (field != orderRejectedReturnBitfield7 || orderRejectedReturnBitfield7Present()) && (field != orderRejectedReturnBitfield8 || orderRejectedReturnBitfield8Present()) && (field != orderRejectedReturnBitfield9 || orderRejectedReturnBitfield9Present()) && (field != orderRejectedReturnBitfield10 || orderRejectedReturnBitfield10Present()) && (field != orderRejectedReturnBitfield11 || orderRejectedReturnBitfield11Present()) && (field != orderRejectedReturnBitfield12 || orderRejectedReturnBitfield12Present()) && (field != orderRejectedReturnBitfield13 || orderRejectedReturnBitfield13Present()) && (field != orderRejectedReturnBitfield14 || orderRejectedReturnBitfield14Present()) && (field != orderRejectedReturnBitfield15 || orderRejectedReturnBitfield15Present()) && (field != orderRejectedReturnBitfield16 || orderRejectedReturnBitfield16Present()) && (field != orderRejectedReturnBitfield17 || orderRejectedReturnBitfield17Present()) && (field != orderRejectedReturnBitfield18 || orderRejectedReturnBitfield18Present()) && (field != orderRejectedReturnBitfield19 || orderRejectedReturnBitfield19Present()) && (field != orderRejectedReturnBitfield20 || orderRejectedReturnBitfield20Present()) && (field != orderRejectedReturnBitfield21 || orderRejectedReturnBitfield21Present()) && (field != side || sidePresent()) && (field != priceBinaryPrice || priceBinaryPricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != maxFloor || maxFloorPresent()) && (field != orderQtyBinary || orderQtyBinaryPresent()) && (field != preventMatch || preventMatchPresent()) && (field != maturityDate || maturityDatePresent()) && (field != strikePrice || strikePricePresent()) && (field != putOrCall || putOrCallPresent()) && (field != openClose || openClosePresent()) && (field != correctedSize || correctedSizePresent()) && (field != secondaryOrderId || secondaryOrderIdPresent()) && (field != contraCapacity || contraCapacityPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != echoText || echoTextPresent()) && (field != stopPx || stopPxPresent()) && (field != routingInst || routingInstPresent()) && (field != routStrategy || routStrategyPresent()) && (field != routeDeliveryMethod || routeDeliveryMethodPresent()) && (field != exDestination || exDestinationPresent()) && (field != marketingFeeCode || marketingFeeCodePresent()) && (field != targetPartyId || targetPartyIdPresent()) && (field != auctionId || auctionIdPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != crossId || crossIdPresent()) && (field != allocQty || allocQtyPresent()) && (field != giveUpFirmId || giveUpFirmIdPresent()) && (field != routingFirmId || routingFirmIdPresent()) && (field != crossExclusionIndicator || crossExclusionIndicatorPresent()) && (field != clearingOptionalData || clearingOptionalDataPresent()) && (field != equityPartyId || equityPartyIdPresent()) && (field != clientIdAttr || clientIdAttrPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != sessionEligibility || sessionEligibilityPresent()) && (field != comboOrder || comboOrderPresent()) && (field != compression || compressionPresent()) && (field != floorDestination || floorDestinationPresent()) && (field != floorRoutingInst || floorRoutingInstPresent()) && (field != multiClassSprd || multiClassSprdPresent()) && (field != orderOrigin || orderOriginPresent()) && (field != priceType || priceTypePresent()) && (field != strategyId || strategyIdPresent()) && (field != crossInitiator || crossInitiatorPresent()) && (field != subreason || subreasonPresent()) && (field != held || heldPresent()) && (field != crossOnBehalfOfId || crossOnBehalfOfIdPresent()) && (field != stopPxType || stopPxTypePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderRejectedReturnBitfield1Present() ? OrderRejectedReturnBitfield1Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield2Present() ? OrderRejectedReturnBitfield2Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield3Present() ? OrderRejectedReturnBitfield3Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield4Present() ? OrderRejectedReturnBitfield4Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield5Present() ? OrderRejectedReturnBitfield5Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield6Present() ? OrderRejectedReturnBitfield6Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield7Present() ? OrderRejectedReturnBitfield7Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield8Present() ? OrderRejectedReturnBitfield8Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield9Present() ? OrderRejectedReturnBitfield9Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield10Present() ? OrderRejectedReturnBitfield10Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield11Present() ? OrderRejectedReturnBitfield11Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield12Present() ? OrderRejectedReturnBitfield12Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield13Present() ? OrderRejectedReturnBitfield13Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield14Present() ? OrderRejectedReturnBitfield14Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield15Present() ? OrderRejectedReturnBitfield15Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield16Present() ? OrderRejectedReturnBitfield16Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield17Present() ? OrderRejectedReturnBitfield17Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield18Present() ? OrderRejectedReturnBitfield18Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield19Present() ? OrderRejectedReturnBitfield19Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield20Present() ? OrderRejectedReturnBitfield20Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield21Present() ? OrderRejectedReturnBitfield21Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (priceBinaryPricePresent() ? PriceBinaryPriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (orderQtyBinaryPresent() ? OrderQtyBinaryField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (strikePricePresent() ? StrikePriceField.BYTE_LENGTH : 0) + (putOrCallPresent() ? PutOrCallField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (correctedSizePresent() ? CorrectedSizeField.BYTE_LENGTH : 0) + (secondaryOrderIdPresent() ? SecondaryOrderIdField.BYTE_LENGTH : 0) + (contraCapacityPresent() ? ContraCapacityField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (routStrategyPresent() ? RoutStrategyField.BYTE_LENGTH : 0) + (routeDeliveryMethodPresent() ? RouteDeliveryMethodField.BYTE_LENGTH : 0) + (exDestinationPresent() ? ExDestinationField.BYTE_LENGTH : 0) + (marketingFeeCodePresent() ? MarketingFeeCodeField.BYTE_LENGTH : 0) + (targetPartyIdPresent() ? TargetPartyIdField.BYTE_LENGTH : 0) + (auctionIdPresent() ? AuctionIdField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (crossIdPresent() ? CrossIdField.BYTE_LENGTH : 0) + (allocQtyPresent() ? AllocQtyField.BYTE_LENGTH : 0) + (giveUpFirmIdPresent() ? GiveUpFirmIdField.BYTE_LENGTH : 0) + (routingFirmIdPresent() ? RoutingFirmIdField.BYTE_LENGTH : 0) + (crossExclusionIndicatorPresent() ? CrossExclusionIndicatorField.BYTE_LENGTH : 0) + (clearingOptionalDataPresent() ? ClearingOptionalDataField.BYTE_LENGTH : 0) + (equityPartyIdPresent() ? EquityPartyIdField.BYTE_LENGTH : 0) + (clientIdAttrPresent() ? ClientIdAttrField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (sessionEligibilityPresent() ? SessionEligibilityField.BYTE_LENGTH : 0) + (comboOrderPresent() ? ComboOrderField.BYTE_LENGTH : 0) + (compressionPresent() ? CompressionField.BYTE_LENGTH : 0) + (floorDestinationPresent() ? FloorDestinationField.BYTE_LENGTH : 0) + (floorRoutingInstPresent() ? FloorRoutingInstField.BYTE_LENGTH : 0) + (multiClassSprdPresent() ? MultiClassSprdField.BYTE_LENGTH : 0) + (orderOriginPresent() ? OrderOriginField.BYTE_LENGTH : 0) + (priceTypePresent() ? PriceTypeField.BYTE_LENGTH : 0) + (strategyIdPresent() ? StrategyIdField.BYTE_LENGTH : 0) + (crossInitiatorPresent() ? CrossInitiatorField.BYTE_LENGTH : 0) + (subreasonPresent() ? SubreasonField.BYTE_LENGTH : 0) + (heldPresent() ? HeldField.BYTE_LENGTH : 0) + (crossOnBehalfOfIdPresent() ? CrossOnBehalfOfIdField.BYTE_LENGTH : 0) + (stopPxTypePresent() ? StopPxTypeField.BYTE_LENGTH : 0);
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
        if (sidePresent()) {
            cursor += 1;
        }
        if (priceBinaryPricePresent()) {
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
        if (symbolAlphanumericPresent()) {
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
        if (orderQtyBinaryPresent()) {
            cursor += 4;
        }
        if (preventMatchPresent()) {
            cursor += 3;
        }
        if (maturityDatePresent()) {
            cursor += 4;
        }
        if (strikePricePresent()) {
            cursor += 8;
        }
        if (putOrCallPresent()) {
            cursor += 1;
        }
        if (openClosePresent()) {
            cursor += 1;
        }
        if (correctedSizePresent()) {
            cursor += 4;
        }
        if (secondaryOrderIdPresent()) {
            cursor += 8;
        }
        if (contraCapacityPresent()) {
            cursor += 1;
        }
        if (attributedQuotePresent()) {
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
        if (marketingFeeCodePresent()) {
            cursor += 2;
        }
        if (targetPartyIdPresent()) {
            cursor += 4;
        }
        if (auctionIdPresent()) {
            cursor += 8;
        }
        if (cmtaNumberPresent()) {
            cursor += 4;
        }
        if (crossIdPresent()) {
            cursor += 20;
        }
        if (allocQtyPresent()) {
            cursor += 4;
        }
        if (giveUpFirmIdPresent()) {
            cursor += 4;
        }
        if (routingFirmIdPresent()) {
            cursor += 4;
        }
        if (crossExclusionIndicatorPresent()) {
            cursor += 1;
        }
        if (clearingOptionalDataPresent()) {
            cursor += 16;
        }
        if (equityPartyIdPresent()) {
            cursor += 4;
        }
        if (clientIdAttrPresent()) {
            cursor += 4;
        }
        if (frequentTraderIdPresent()) {
            cursor += 6;
        }
        if (sessionEligibilityPresent()) {
            cursor += 1;
        }
        if (comboOrderPresent()) {
            cursor += 1;
        }
        if (compressionPresent()) {
            cursor += 1;
        }
        if (floorDestinationPresent()) {
            cursor += 4;
        }
        if (floorRoutingInstPresent()) {
            cursor += 1;
        }
        if (multiClassSprdPresent()) {
            cursor += 1;
        }
        if (orderOriginPresent()) {
            cursor += 3;
        }
        if (priceTypePresent()) {
            cursor += 1;
        }
        if (strategyIdPresent()) {
            cursor += 1;
        }
        if (crossInitiatorPresent()) {
            cursor += 4;
        }
        if (subreasonPresent()) {
            cursor += 1;
        }
        if (heldPresent()) {
            cursor += 1;
        }
        if (crossOnBehalfOfIdPresent()) {
            cursor += 4;
        }
        if (stopPxTypePresent()) {
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
        if (sidePresent()) {
            if (end - cursor < SideField.BYTE_LENGTH || !side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (priceBinaryPricePresent()) {
            if (end - cursor < PriceBinaryPriceField.BYTE_LENGTH || !priceBinaryPrice.parse(data, cursor)) {
                return false;
            }
            cursor += PriceBinaryPriceField.BYTE_LENGTH;
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
        if (symbolAlphanumericPresent()) {
            if (end - cursor < SymbolAlphanumericField.BYTE_LENGTH || !symbolAlphanumeric.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolAlphanumericField.BYTE_LENGTH;
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
        if (orderQtyBinaryPresent()) {
            if (end - cursor < OrderQtyBinaryField.BYTE_LENGTH || !orderQtyBinary.parse(data, cursor)) {
                return false;
            }
            cursor += OrderQtyBinaryField.BYTE_LENGTH;
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
        if (maturityDatePresent()) {
            if (end - cursor < MaturityDateField.BYTE_LENGTH || !maturityDate.parse(data, cursor)) {
                return false;
            }
            cursor += MaturityDateField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (strikePricePresent()) {
            if (end - cursor < StrikePriceField.BYTE_LENGTH || !strikePrice.parse(data, cursor)) {
                return false;
            }
            cursor += StrikePriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (putOrCallPresent()) {
            if (end - cursor < PutOrCallField.BYTE_LENGTH || !putOrCall.parse(data, cursor)) {
                return false;
            }
            cursor += PutOrCallField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (openClosePresent()) {
            if (end - cursor < OpenCloseField.BYTE_LENGTH || !openClose.parse(data, cursor)) {
                return false;
            }
            cursor += OpenCloseField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (correctedSizePresent()) {
            if (end - cursor < CorrectedSizeField.BYTE_LENGTH || !correctedSize.parse(data, cursor)) {
                return false;
            }
            cursor += CorrectedSizeField.BYTE_LENGTH;
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
        if (contraCapacityPresent()) {
            if (end - cursor < ContraCapacityField.BYTE_LENGTH || !contraCapacity.parse(data, cursor)) {
                return false;
            }
            cursor += ContraCapacityField.BYTE_LENGTH;
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
        if (end - cursor < 0) {
            return false;
        }
        if (marketingFeeCodePresent()) {
            if (end - cursor < MarketingFeeCodeField.BYTE_LENGTH || !marketingFeeCode.parse(data, cursor)) {
                return false;
            }
            cursor += MarketingFeeCodeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (targetPartyIdPresent()) {
            if (end - cursor < TargetPartyIdField.BYTE_LENGTH || !targetPartyId.parse(data, cursor)) {
                return false;
            }
            cursor += TargetPartyIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (auctionIdPresent()) {
            if (end - cursor < AuctionIdField.BYTE_LENGTH || !auctionId.parse(data, cursor)) {
                return false;
            }
            cursor += AuctionIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cmtaNumberPresent()) {
            if (end - cursor < CmtaNumberField.BYTE_LENGTH || !cmtaNumber.parse(data, cursor)) {
                return false;
            }
            cursor += CmtaNumberField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossIdPresent()) {
            if (end - cursor < CrossIdField.BYTE_LENGTH || !crossId.parse(data, cursor)) {
                return false;
            }
            cursor += CrossIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (allocQtyPresent()) {
            if (end - cursor < AllocQtyField.BYTE_LENGTH || !allocQty.parse(data, cursor)) {
                return false;
            }
            cursor += AllocQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (giveUpFirmIdPresent()) {
            if (end - cursor < GiveUpFirmIdField.BYTE_LENGTH || !giveUpFirmId.parse(data, cursor)) {
                return false;
            }
            cursor += GiveUpFirmIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (routingFirmIdPresent()) {
            if (end - cursor < RoutingFirmIdField.BYTE_LENGTH || !routingFirmId.parse(data, cursor)) {
                return false;
            }
            cursor += RoutingFirmIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossExclusionIndicatorPresent()) {
            if (end - cursor < CrossExclusionIndicatorField.BYTE_LENGTH || !crossExclusionIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += CrossExclusionIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingOptionalDataPresent()) {
            if (end - cursor < ClearingOptionalDataField.BYTE_LENGTH || !clearingOptionalData.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingOptionalDataField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (equityPartyIdPresent()) {
            if (end - cursor < EquityPartyIdField.BYTE_LENGTH || !equityPartyId.parse(data, cursor)) {
                return false;
            }
            cursor += EquityPartyIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clientIdAttrPresent()) {
            if (end - cursor < ClientIdAttrField.BYTE_LENGTH || !clientIdAttr.parse(data, cursor)) {
                return false;
            }
            cursor += ClientIdAttrField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (frequentTraderIdPresent()) {
            if (end - cursor < FrequentTraderIdField.BYTE_LENGTH || !frequentTraderId.parse(data, cursor)) {
                return false;
            }
            cursor += FrequentTraderIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (sessionEligibilityPresent()) {
            if (end - cursor < SessionEligibilityField.BYTE_LENGTH || !sessionEligibility.parse(data, cursor)) {
                return false;
            }
            cursor += SessionEligibilityField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (comboOrderPresent()) {
            if (end - cursor < ComboOrderField.BYTE_LENGTH || !comboOrder.parse(data, cursor)) {
                return false;
            }
            cursor += ComboOrderField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (compressionPresent()) {
            if (end - cursor < CompressionField.BYTE_LENGTH || !compression.parse(data, cursor)) {
                return false;
            }
            cursor += CompressionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (floorDestinationPresent()) {
            if (end - cursor < FloorDestinationField.BYTE_LENGTH || !floorDestination.parse(data, cursor)) {
                return false;
            }
            cursor += FloorDestinationField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (floorRoutingInstPresent()) {
            if (end - cursor < FloorRoutingInstField.BYTE_LENGTH || !floorRoutingInst.parse(data, cursor)) {
                return false;
            }
            cursor += FloorRoutingInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (multiClassSprdPresent()) {
            if (end - cursor < MultiClassSprdField.BYTE_LENGTH || !multiClassSprd.parse(data, cursor)) {
                return false;
            }
            cursor += MultiClassSprdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderOriginPresent()) {
            if (end - cursor < OrderOriginField.BYTE_LENGTH || !orderOrigin.parse(data, cursor)) {
                return false;
            }
            cursor += OrderOriginField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (priceTypePresent()) {
            if (end - cursor < PriceTypeField.BYTE_LENGTH || !priceType.parse(data, cursor)) {
                return false;
            }
            cursor += PriceTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (strategyIdPresent()) {
            if (end - cursor < StrategyIdField.BYTE_LENGTH || !strategyId.parse(data, cursor)) {
                return false;
            }
            cursor += StrategyIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossInitiatorPresent()) {
            if (end - cursor < CrossInitiatorField.BYTE_LENGTH || !crossInitiator.parse(data, cursor)) {
                return false;
            }
            cursor += CrossInitiatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (subreasonPresent()) {
            if (end - cursor < SubreasonField.BYTE_LENGTH || !subreason.parse(data, cursor)) {
                return false;
            }
            cursor += SubreasonField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (heldPresent()) {
            if (end - cursor < HeldField.BYTE_LENGTH || !held.parse(data, cursor)) {
                return false;
            }
            cursor += HeldField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOnBehalfOfIdPresent()) {
            if (end - cursor < CrossOnBehalfOfIdField.BYTE_LENGTH || !crossOnBehalfOfId.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOnBehalfOfIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (stopPxTypePresent()) {
            if (end - cursor < StopPxTypeField.BYTE_LENGTH || !stopPxType.parse(data, cursor)) {
                return false;
            }
            cursor += StopPxTypeField.BYTE_LENGTH;
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
        if (sidePresent() != side.hasValue()) {
            throw new IllegalStateException(side.hasValue() ? "side holds a value the fields before it leave off the wire" : "side holds no value, though the fields before it put it on the wire");
        }
        if (priceBinaryPricePresent() != priceBinaryPrice.hasValue()) {
            throw new IllegalStateException(priceBinaryPrice.hasValue() ? "priceBinaryPrice holds a value the fields before it leave off the wire" : "priceBinaryPrice holds no value, though the fields before it put it on the wire");
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
        if (symbolAlphanumericPresent() != symbolAlphanumeric.hasValue()) {
            throw new IllegalStateException(symbolAlphanumeric.hasValue() ? "symbolAlphanumeric holds a value the fields before it leave off the wire" : "symbolAlphanumeric holds no value, though the fields before it put it on the wire");
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
        if (orderQtyBinaryPresent() != orderQtyBinary.hasValue()) {
            throw new IllegalStateException(orderQtyBinary.hasValue() ? "orderQtyBinary holds a value the fields before it leave off the wire" : "orderQtyBinary holds no value, though the fields before it put it on the wire");
        }
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
        }
        if (maturityDatePresent() != maturityDate.hasValue()) {
            throw new IllegalStateException(maturityDate.hasValue() ? "maturityDate holds a value the fields before it leave off the wire" : "maturityDate holds no value, though the fields before it put it on the wire");
        }
        if (strikePricePresent() != strikePrice.hasValue()) {
            throw new IllegalStateException(strikePrice.hasValue() ? "strikePrice holds a value the fields before it leave off the wire" : "strikePrice holds no value, though the fields before it put it on the wire");
        }
        if (putOrCallPresent() != putOrCall.hasValue()) {
            throw new IllegalStateException(putOrCall.hasValue() ? "putOrCall holds a value the fields before it leave off the wire" : "putOrCall holds no value, though the fields before it put it on the wire");
        }
        if (openClosePresent() != openClose.hasValue()) {
            throw new IllegalStateException(openClose.hasValue() ? "openClose holds a value the fields before it leave off the wire" : "openClose holds no value, though the fields before it put it on the wire");
        }
        if (correctedSizePresent() != correctedSize.hasValue()) {
            throw new IllegalStateException(correctedSize.hasValue() ? "correctedSize holds a value the fields before it leave off the wire" : "correctedSize holds no value, though the fields before it put it on the wire");
        }
        if (secondaryOrderIdPresent() != secondaryOrderId.hasValue()) {
            throw new IllegalStateException(secondaryOrderId.hasValue() ? "secondaryOrderId holds a value the fields before it leave off the wire" : "secondaryOrderId holds no value, though the fields before it put it on the wire");
        }
        if (contraCapacityPresent() != contraCapacity.hasValue()) {
            throw new IllegalStateException(contraCapacity.hasValue() ? "contraCapacity holds a value the fields before it leave off the wire" : "contraCapacity holds no value, though the fields before it put it on the wire");
        }
        if (attributedQuotePresent() != attributedQuote.hasValue()) {
            throw new IllegalStateException(attributedQuote.hasValue() ? "attributedQuote holds a value the fields before it leave off the wire" : "attributedQuote holds no value, though the fields before it put it on the wire");
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
        if (marketingFeeCodePresent() != marketingFeeCode.hasValue()) {
            throw new IllegalStateException(marketingFeeCode.hasValue() ? "marketingFeeCode holds a value the fields before it leave off the wire" : "marketingFeeCode holds no value, though the fields before it put it on the wire");
        }
        if (targetPartyIdPresent() != targetPartyId.hasValue()) {
            throw new IllegalStateException(targetPartyId.hasValue() ? "targetPartyId holds a value the fields before it leave off the wire" : "targetPartyId holds no value, though the fields before it put it on the wire");
        }
        if (auctionIdPresent() != auctionId.hasValue()) {
            throw new IllegalStateException(auctionId.hasValue() ? "auctionId holds a value the fields before it leave off the wire" : "auctionId holds no value, though the fields before it put it on the wire");
        }
        if (cmtaNumberPresent() != cmtaNumber.hasValue()) {
            throw new IllegalStateException(cmtaNumber.hasValue() ? "cmtaNumber holds a value the fields before it leave off the wire" : "cmtaNumber holds no value, though the fields before it put it on the wire");
        }
        if (crossIdPresent() != crossId.hasValue()) {
            throw new IllegalStateException(crossId.hasValue() ? "crossId holds a value the fields before it leave off the wire" : "crossId holds no value, though the fields before it put it on the wire");
        }
        if (allocQtyPresent() != allocQty.hasValue()) {
            throw new IllegalStateException(allocQty.hasValue() ? "allocQty holds a value the fields before it leave off the wire" : "allocQty holds no value, though the fields before it put it on the wire");
        }
        if (giveUpFirmIdPresent() != giveUpFirmId.hasValue()) {
            throw new IllegalStateException(giveUpFirmId.hasValue() ? "giveUpFirmId holds a value the fields before it leave off the wire" : "giveUpFirmId holds no value, though the fields before it put it on the wire");
        }
        if (routingFirmIdPresent() != routingFirmId.hasValue()) {
            throw new IllegalStateException(routingFirmId.hasValue() ? "routingFirmId holds a value the fields before it leave off the wire" : "routingFirmId holds no value, though the fields before it put it on the wire");
        }
        if (crossExclusionIndicatorPresent() != crossExclusionIndicator.hasValue()) {
            throw new IllegalStateException(crossExclusionIndicator.hasValue() ? "crossExclusionIndicator holds a value the fields before it leave off the wire" : "crossExclusionIndicator holds no value, though the fields before it put it on the wire");
        }
        if (clearingOptionalDataPresent() != clearingOptionalData.hasValue()) {
            throw new IllegalStateException(clearingOptionalData.hasValue() ? "clearingOptionalData holds a value the fields before it leave off the wire" : "clearingOptionalData holds no value, though the fields before it put it on the wire");
        }
        if (equityPartyIdPresent() != equityPartyId.hasValue()) {
            throw new IllegalStateException(equityPartyId.hasValue() ? "equityPartyId holds a value the fields before it leave off the wire" : "equityPartyId holds no value, though the fields before it put it on the wire");
        }
        if (clientIdAttrPresent() != clientIdAttr.hasValue()) {
            throw new IllegalStateException(clientIdAttr.hasValue() ? "clientIdAttr holds a value the fields before it leave off the wire" : "clientIdAttr holds no value, though the fields before it put it on the wire");
        }
        if (frequentTraderIdPresent() != frequentTraderId.hasValue()) {
            throw new IllegalStateException(frequentTraderId.hasValue() ? "frequentTraderId holds a value the fields before it leave off the wire" : "frequentTraderId holds no value, though the fields before it put it on the wire");
        }
        if (sessionEligibilityPresent() != sessionEligibility.hasValue()) {
            throw new IllegalStateException(sessionEligibility.hasValue() ? "sessionEligibility holds a value the fields before it leave off the wire" : "sessionEligibility holds no value, though the fields before it put it on the wire");
        }
        if (comboOrderPresent() != comboOrder.hasValue()) {
            throw new IllegalStateException(comboOrder.hasValue() ? "comboOrder holds a value the fields before it leave off the wire" : "comboOrder holds no value, though the fields before it put it on the wire");
        }
        if (compressionPresent() != compression.hasValue()) {
            throw new IllegalStateException(compression.hasValue() ? "compression holds a value the fields before it leave off the wire" : "compression holds no value, though the fields before it put it on the wire");
        }
        if (floorDestinationPresent() != floorDestination.hasValue()) {
            throw new IllegalStateException(floorDestination.hasValue() ? "floorDestination holds a value the fields before it leave off the wire" : "floorDestination holds no value, though the fields before it put it on the wire");
        }
        if (floorRoutingInstPresent() != floorRoutingInst.hasValue()) {
            throw new IllegalStateException(floorRoutingInst.hasValue() ? "floorRoutingInst holds a value the fields before it leave off the wire" : "floorRoutingInst holds no value, though the fields before it put it on the wire");
        }
        if (multiClassSprdPresent() != multiClassSprd.hasValue()) {
            throw new IllegalStateException(multiClassSprd.hasValue() ? "multiClassSprd holds a value the fields before it leave off the wire" : "multiClassSprd holds no value, though the fields before it put it on the wire");
        }
        if (orderOriginPresent() != orderOrigin.hasValue()) {
            throw new IllegalStateException(orderOrigin.hasValue() ? "orderOrigin holds a value the fields before it leave off the wire" : "orderOrigin holds no value, though the fields before it put it on the wire");
        }
        if (priceTypePresent() != priceType.hasValue()) {
            throw new IllegalStateException(priceType.hasValue() ? "priceType holds a value the fields before it leave off the wire" : "priceType holds no value, though the fields before it put it on the wire");
        }
        if (strategyIdPresent() != strategyId.hasValue()) {
            throw new IllegalStateException(strategyId.hasValue() ? "strategyId holds a value the fields before it leave off the wire" : "strategyId holds no value, though the fields before it put it on the wire");
        }
        if (crossInitiatorPresent() != crossInitiator.hasValue()) {
            throw new IllegalStateException(crossInitiator.hasValue() ? "crossInitiator holds a value the fields before it leave off the wire" : "crossInitiator holds no value, though the fields before it put it on the wire");
        }
        if (subreasonPresent() != subreason.hasValue()) {
            throw new IllegalStateException(subreason.hasValue() ? "subreason holds a value the fields before it leave off the wire" : "subreason holds no value, though the fields before it put it on the wire");
        }
        if (heldPresent() != held.hasValue()) {
            throw new IllegalStateException(held.hasValue() ? "held holds a value the fields before it leave off the wire" : "held holds no value, though the fields before it put it on the wire");
        }
        if (crossOnBehalfOfIdPresent() != crossOnBehalfOfId.hasValue()) {
            throw new IllegalStateException(crossOnBehalfOfId.hasValue() ? "crossOnBehalfOfId holds a value the fields before it leave off the wire" : "crossOnBehalfOfId holds no value, though the fields before it put it on the wire");
        }
        if (stopPxTypePresent() != stopPxType.hasValue()) {
            throw new IllegalStateException(stopPxType.hasValue() ? "stopPxType holds a value the fields before it leave off the wire" : "stopPxType holds no value, though the fields before it put it on the wire");
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
        if (sidePresent()) {
            cursor = side.encode(data, cursor);
        }
        if (priceBinaryPricePresent()) {
            cursor = priceBinaryPrice.encode(data, cursor);
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
        if (symbolAlphanumericPresent()) {
            cursor = symbolAlphanumeric.encode(data, cursor);
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
        if (orderQtyBinaryPresent()) {
            cursor = orderQtyBinary.encode(data, cursor);
        }
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
        }
        if (maturityDatePresent()) {
            cursor = maturityDate.encode(data, cursor);
        }
        if (strikePricePresent()) {
            cursor = strikePrice.encode(data, cursor);
        }
        if (putOrCallPresent()) {
            cursor = putOrCall.encode(data, cursor);
        }
        if (openClosePresent()) {
            cursor = openClose.encode(data, cursor);
        }
        if (correctedSizePresent()) {
            cursor = correctedSize.encode(data, cursor);
        }
        if (secondaryOrderIdPresent()) {
            cursor = secondaryOrderId.encode(data, cursor);
        }
        if (contraCapacityPresent()) {
            cursor = contraCapacity.encode(data, cursor);
        }
        if (attributedQuotePresent()) {
            cursor = attributedQuote.encode(data, cursor);
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
        if (marketingFeeCodePresent()) {
            cursor = marketingFeeCode.encode(data, cursor);
        }
        if (targetPartyIdPresent()) {
            cursor = targetPartyId.encode(data, cursor);
        }
        if (auctionIdPresent()) {
            cursor = auctionId.encode(data, cursor);
        }
        if (cmtaNumberPresent()) {
            cursor = cmtaNumber.encode(data, cursor);
        }
        if (crossIdPresent()) {
            cursor = crossId.encode(data, cursor);
        }
        if (allocQtyPresent()) {
            cursor = allocQty.encode(data, cursor);
        }
        if (giveUpFirmIdPresent()) {
            cursor = giveUpFirmId.encode(data, cursor);
        }
        if (routingFirmIdPresent()) {
            cursor = routingFirmId.encode(data, cursor);
        }
        if (crossExclusionIndicatorPresent()) {
            cursor = crossExclusionIndicator.encode(data, cursor);
        }
        if (clearingOptionalDataPresent()) {
            cursor = clearingOptionalData.encode(data, cursor);
        }
        if (equityPartyIdPresent()) {
            cursor = equityPartyId.encode(data, cursor);
        }
        if (clientIdAttrPresent()) {
            cursor = clientIdAttr.encode(data, cursor);
        }
        if (frequentTraderIdPresent()) {
            cursor = frequentTraderId.encode(data, cursor);
        }
        if (sessionEligibilityPresent()) {
            cursor = sessionEligibility.encode(data, cursor);
        }
        if (comboOrderPresent()) {
            cursor = comboOrder.encode(data, cursor);
        }
        if (compressionPresent()) {
            cursor = compression.encode(data, cursor);
        }
        if (floorDestinationPresent()) {
            cursor = floorDestination.encode(data, cursor);
        }
        if (floorRoutingInstPresent()) {
            cursor = floorRoutingInst.encode(data, cursor);
        }
        if (multiClassSprdPresent()) {
            cursor = multiClassSprd.encode(data, cursor);
        }
        if (orderOriginPresent()) {
            cursor = orderOrigin.encode(data, cursor);
        }
        if (priceTypePresent()) {
            cursor = priceType.encode(data, cursor);
        }
        if (strategyIdPresent()) {
            cursor = strategyId.encode(data, cursor);
        }
        if (crossInitiatorPresent()) {
            cursor = crossInitiator.encode(data, cursor);
        }
        if (subreasonPresent()) {
            cursor = subreason.encode(data, cursor);
        }
        if (heldPresent()) {
            cursor = held.encode(data, cursor);
        }
        if (crossOnBehalfOfIdPresent()) {
            cursor = crossOnBehalfOfId.encode(data, cursor);
        }
        if (stopPxTypePresent()) {
            cursor = stopPxType.encode(data, cursor);
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
            case "Side" -> Optional.of(side);
            case "PriceBinaryPrice" -> Optional.of(priceBinaryPrice);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "Capacity" -> Optional.of(capacity);
            case "Account" -> Optional.of(account);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "OrderQtyBinary" -> Optional.of(orderQtyBinary);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "OpenClose" -> Optional.of(openClose);
            case "CorrectedSize" -> Optional.of(correctedSize);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "ContraCapacity" -> Optional.of(contraCapacity);
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "EchoText" -> Optional.of(echoText);
            case "StopPx" -> Optional.of(stopPx);
            case "RoutingInst" -> Optional.of(routingInst);
            case "RoutStrategy" -> Optional.of(routStrategy);
            case "RouteDeliveryMethod" -> Optional.of(routeDeliveryMethod);
            case "ExDestination" -> Optional.of(exDestination);
            case "MarketingFeeCode" -> Optional.of(marketingFeeCode);
            case "TargetPartyId" -> Optional.of(targetPartyId);
            case "AuctionId" -> Optional.of(auctionId);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "CrossId" -> Optional.of(crossId);
            case "AllocQty" -> Optional.of(allocQty);
            case "GiveUpFirmId" -> Optional.of(giveUpFirmId);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "CrossExclusionIndicator" -> Optional.of(crossExclusionIndicator);
            case "ClearingOptionalData" -> Optional.of(clearingOptionalData);
            case "EquityPartyId" -> Optional.of(equityPartyId);
            case "ClientIdAttr" -> Optional.of(clientIdAttr);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "SessionEligibility" -> Optional.of(sessionEligibility);
            case "ComboOrder" -> Optional.of(comboOrder);
            case "Compression" -> Optional.of(compression);
            case "FloorDestination" -> Optional.of(floorDestination);
            case "FloorRoutingInst" -> Optional.of(floorRoutingInst);
            case "MultiClassSprd" -> Optional.of(multiClassSprd);
            case "OrderOrigin" -> Optional.of(orderOrigin);
            case "PriceType" -> Optional.of(priceType);
            case "StrategyId" -> Optional.of(strategyId);
            case "CrossInitiator" -> Optional.of(crossInitiator);
            case "Subreason" -> Optional.of(subreason);
            case "Held" -> Optional.of(held);
            case "CrossOnBehalfOfId" -> Optional.of(crossOnBehalfOfId);
            case "StopPxType" -> Optional.of(stopPxType);
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
