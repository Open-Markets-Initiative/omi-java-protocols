package omi.cboe.c2options.binaryorderentry.boe.v2_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.AccountField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.AllocQtyField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.AttributedQuoteField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.AuctionIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.BaseLiquidityIndicatorField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.CapacityField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ClOrdIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ClearingAccountField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ClearingFirmField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ClearingOptionalDataField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ClientIdAttrField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.CmtaNumberField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ComboOrderField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.CompressionField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ContraCapacityField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.CorrectedSizeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.CrossExclusionIndicatorField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.CrossIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.DisplayIndicatorField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.DisplayPriceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.DrillThruProtectionField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.EchoTextField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.EquityPartyIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ExDestinationField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ExecInstField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ExpireTimeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.FloorDestinationField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.FloorRoutingInstField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.FrequentTraderIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.GiveUpFirmIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.LastPxField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.LastSharesField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.LeavesQtyField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.MarketingFeeCodeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.MaturityDateField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.MaxFloorField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.MinQtyField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.MultiClassSprdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.NumberOfReturnBitfieldsField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.OpenCloseField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.OrdTypeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.OrderIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.OrderOriginField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.OrderQtyLongField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.OrigClOrdIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.PreventMatchField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.PriceLongField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.PriceTypeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.PutOrCallField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield10Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield11Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield12Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield13Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield14Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield15Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield16Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield17Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield1Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield2Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield3Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield4Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield5Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield6Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield7Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield8Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.ReturnBitfield9Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.RoutStrategyField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.RouteDeliveryMethodField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.RoutingFirmIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.RoutingInstField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.SecondaryOrderIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.SessionEligibilityField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.SideField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.StopPxField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.StrategyIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.StrikePriceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.SubLiquidityIndicatorField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.SymbolLongField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.TargetPartyIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.TimeInForceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.TransactTimeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.fields.WorkingPriceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.types.Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.types.Message;
import omi.cboe.c2options.binaryorderentry.boe.v2_10.types.PrintOptions;

/**
 * Represents the OrderAcknowledgmentMessage message from the BinaryOrderEntry protocol.
 *
 * <p>An order has been acknowledged</p>
 */
public final class OrderAcknowledgmentMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 38;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Acknowledgment Message";

    /**
     * The time the event occurred in the CFE matching engine.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Order identifier supplied by Cboe. This Identifier corresponds to the identifiers used in Cboe market data products
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderAcknowledgment byte 1.
     */
    private final ReturnBitfield1Field returnBitfield1 = new ReturnBitfield1Field();

    /**
     * BitSet OrderAcknowledgment byte 2.
     */
    private final ReturnBitfield2Field returnBitfield2 = new ReturnBitfield2Field();

    /**
     * BitSet OrderAcknowledgment byte 3.
     */
    private final ReturnBitfield3Field returnBitfield3 = new ReturnBitfield3Field();

    /**
     * BitSet OrderAcknowledgment byte 4.
     */
    private final ReturnBitfield4Field returnBitfield4 = new ReturnBitfield4Field();

    /**
     * BitSet OrderAcknowledgment byte 5.
     */
    private final ReturnBitfield5Field returnBitfield5 = new ReturnBitfield5Field();

    /**
     * BitSet OrderAcknowledgment byte 6.
     */
    private final ReturnBitfield6Field returnBitfield6 = new ReturnBitfield6Field();

    /**
     * BitSet OrderAcknowledgment byte 7.
     */
    private final ReturnBitfield7Field returnBitfield7 = new ReturnBitfield7Field();

    /**
     * BitSet OrderAcknowledgment byte 8.
     */
    private final ReturnBitfield8Field returnBitfield8 = new ReturnBitfield8Field();

    /**
     * BitSet OrderAcknowledgment byte 9.
     */
    private final ReturnBitfield9Field returnBitfield9 = new ReturnBitfield9Field();

    /**
     * BitSet OrderAcknowledgment byte 10.
     */
    private final ReturnBitfield10Field returnBitfield10 = new ReturnBitfield10Field();

    /**
     * BitSet OrderAcknowledgment byte 11.
     */
    private final ReturnBitfield11Field returnBitfield11 = new ReturnBitfield11Field();

    /**
     * BitSet OrderAcknowledgment byte 12.
     */
    private final ReturnBitfield12Field returnBitfield12 = new ReturnBitfield12Field();

    /**
     * BitSet OrderAcknowledgment byte 13.
     */
    private final ReturnBitfield13Field returnBitfield13 = new ReturnBitfield13Field();

    /**
     * BitSet OrderAcknowledgment byte 14.
     */
    private final ReturnBitfield14Field returnBitfield14 = new ReturnBitfield14Field();

    /**
     * BitSet OrderAcknowledgment byte 15.
     */
    private final ReturnBitfield15Field returnBitfield15 = new ReturnBitfield15Field();

    /**
     * BitSet OrderAcknowledgment byte 16.
     */
    private final ReturnBitfield16Field returnBitfield16 = new ReturnBitfield16Field();

    /**
     * BitSet OrderAcknowledgment byte 17.
     */
    private final ReturnBitfield17Field returnBitfield17 = new ReturnBitfield17Field();

    /**
     * Corresponds to Side (54) in Cboe FIX.
     */
    private final SideField side = new SideField();

    /**
     * Price Long
     */
    private final PriceLongField priceLong = new PriceLongField();

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
     * Symbol Long
     */
    private final SymbolLongField symbolLong = new SymbolLongField();

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
     * Order quantity. System limit is 999,999 shares.
     */
    private final OrderQtyLongField orderQtyLong = new OrderQtyLongField();

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
     * Corresponds to OrigClOrdID (41) in Cboe FIX. ClOrdID of the order to cancel. For mass cancel requests, must be empty (all zeroes).
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Last Shares
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Display Price
     */
    private final DisplayPriceField displayPrice = new DisplayPriceField();

    /**
     * Working Price
     */
    private final WorkingPriceField workingPrice = new WorkingPriceField();

    /**
     * Base Liquidity Indicator
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Expire Time
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

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
     * Sub Liquidity Indicator
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

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
     * Corresponds to CrossID (548) in Cboe FIX.
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
     * Drill Thru Protection
     */
    private final DrillThruProtectionField drillThruProtection = new DrillThruProtectionField();

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
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, clOrdId, orderId, numberOfReturnBitfields, returnBitfield1, returnBitfield2, returnBitfield3, returnBitfield4, returnBitfield5, returnBitfield6, returnBitfield7, returnBitfield8, returnBitfield9, returnBitfield10, returnBitfield11, returnBitfield12, returnBitfield13, returnBitfield14, returnBitfield15, returnBitfield16, returnBitfield17, side, priceLong, execInst, ordType, timeInForce, minQty, symbolLong, capacity, account, clearingFirm, clearingAccount, displayIndicator, maxFloor, orderQtyLong, preventMatch, maturityDate, strikePrice, putOrCall, openClose, correctedSize, origClOrdId, leavesQty, lastShares, lastPx, displayPrice, workingPrice, baseLiquidityIndicator, expireTime, secondaryOrderId, contraCapacity, attributedQuote, subLiquidityIndicator, echoText, stopPx, routingInst, routStrategy, routeDeliveryMethod, exDestination, marketingFeeCode, targetPartyId, auctionId, cmtaNumber, crossId, allocQty, giveUpFirmId, routingFirmId, crossExclusionIndicator, clearingOptionalData, drillThruProtection, equityPartyId, clientIdAttr, frequentTraderId, sessionEligibility, comboOrder, compression, floorDestination, floorRoutingInst, multiClassSprd, orderOrigin, priceType, strategyId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the CFE matching engine.
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Order identifier supplied by Cboe. This Identifier corresponds to the identifiers used in Cboe market data products
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
     *
     * @return the NumberOfReturnBitfields field
     */
    public NumberOfReturnBitfieldsField numberOfReturnBitfields() {
        return numberOfReturnBitfields;
    }

    /**
     * BitSet OrderAcknowledgment byte 1.
     *
     * @return the ReturnBitfield1 field
     */
    public ReturnBitfield1Field returnBitfield1() {
        return returnBitfield1;
    }

    /**
     * BitSet OrderAcknowledgment byte 2.
     *
     * @return the ReturnBitfield2 field
     */
    public ReturnBitfield2Field returnBitfield2() {
        return returnBitfield2;
    }

    /**
     * BitSet OrderAcknowledgment byte 3.
     *
     * @return the ReturnBitfield3 field
     */
    public ReturnBitfield3Field returnBitfield3() {
        return returnBitfield3;
    }

    /**
     * BitSet OrderAcknowledgment byte 4.
     *
     * @return the ReturnBitfield4 field
     */
    public ReturnBitfield4Field returnBitfield4() {
        return returnBitfield4;
    }

    /**
     * BitSet OrderAcknowledgment byte 5.
     *
     * @return the ReturnBitfield5 field
     */
    public ReturnBitfield5Field returnBitfield5() {
        return returnBitfield5;
    }

    /**
     * BitSet OrderAcknowledgment byte 6.
     *
     * @return the ReturnBitfield6 field
     */
    public ReturnBitfield6Field returnBitfield6() {
        return returnBitfield6;
    }

    /**
     * BitSet OrderAcknowledgment byte 7.
     *
     * @return the ReturnBitfield7 field
     */
    public ReturnBitfield7Field returnBitfield7() {
        return returnBitfield7;
    }

    /**
     * BitSet OrderAcknowledgment byte 8.
     *
     * @return the ReturnBitfield8 field
     */
    public ReturnBitfield8Field returnBitfield8() {
        return returnBitfield8;
    }

    /**
     * BitSet OrderAcknowledgment byte 9.
     *
     * @return the ReturnBitfield9 field
     */
    public ReturnBitfield9Field returnBitfield9() {
        return returnBitfield9;
    }

    /**
     * BitSet OrderAcknowledgment byte 10.
     *
     * @return the ReturnBitfield10 field
     */
    public ReturnBitfield10Field returnBitfield10() {
        return returnBitfield10;
    }

    /**
     * BitSet OrderAcknowledgment byte 11.
     *
     * @return the ReturnBitfield11 field
     */
    public ReturnBitfield11Field returnBitfield11() {
        return returnBitfield11;
    }

    /**
     * BitSet OrderAcknowledgment byte 12.
     *
     * @return the ReturnBitfield12 field
     */
    public ReturnBitfield12Field returnBitfield12() {
        return returnBitfield12;
    }

    /**
     * BitSet OrderAcknowledgment byte 13.
     *
     * @return the ReturnBitfield13 field
     */
    public ReturnBitfield13Field returnBitfield13() {
        return returnBitfield13;
    }

    /**
     * BitSet OrderAcknowledgment byte 14.
     *
     * @return the ReturnBitfield14 field
     */
    public ReturnBitfield14Field returnBitfield14() {
        return returnBitfield14;
    }

    /**
     * BitSet OrderAcknowledgment byte 15.
     *
     * @return the ReturnBitfield15 field
     */
    public ReturnBitfield15Field returnBitfield15() {
        return returnBitfield15;
    }

    /**
     * BitSet OrderAcknowledgment byte 16.
     *
     * @return the ReturnBitfield16 field
     */
    public ReturnBitfield16Field returnBitfield16() {
        return returnBitfield16;
    }

    /**
     * BitSet OrderAcknowledgment byte 17.
     *
     * @return the ReturnBitfield17 field
     */
    public ReturnBitfield17Field returnBitfield17() {
        return returnBitfield17;
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
     * Price Long
     *
     * @return the PriceLong field
     */
    public PriceLongField priceLong() {
        return priceLong;
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
     * Symbol Long
     *
     * @return the SymbolLong field
     */
    public SymbolLongField symbolLong() {
        return symbolLong;
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
     * Order quantity. System limit is 999,999 shares.
     *
     * @return the OrderQtyLong field
     */
    public OrderQtyLongField orderQtyLong() {
        return orderQtyLong;
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
     * Corresponds to OrigClOrdID (41) in Cboe FIX. ClOrdID of the order to cancel. For mass cancel requests, must be empty (all zeroes).
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Leaves Qty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Last Shares
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
    }

    /**
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Display Price
     *
     * @return the DisplayPrice field
     */
    public DisplayPriceField displayPrice() {
        return displayPrice;
    }

    /**
     * Working Price
     *
     * @return the WorkingPrice field
     */
    public WorkingPriceField workingPrice() {
        return workingPrice;
    }

    /**
     * Base Liquidity Indicator
     *
     * @return the BaseLiquidityIndicator field
     */
    public BaseLiquidityIndicatorField baseLiquidityIndicator() {
        return baseLiquidityIndicator;
    }

    /**
     * Expire Time
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
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
     * Sub Liquidity Indicator
     *
     * @return the SubLiquidityIndicator field
     */
    public SubLiquidityIndicatorField subLiquidityIndicator() {
        return subLiquidityIndicator;
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
     * Corresponds to CrossID (548) in Cboe FIX.
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
     * Drill Thru Protection
     *
     * @return the DrillThruProtection field
     */
    public DrillThruProtectionField drillThruProtection() {
        return drillThruProtection;
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
     * Returns whether the fields before the ReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield1 is on the wire
     */
    public boolean returnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield2 is on the wire
     */
    public boolean returnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield3 is on the wire
     */
    public boolean returnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield4 is on the wire
     */
    public boolean returnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield5 is on the wire
     */
    public boolean returnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield6 is on the wire
     */
    public boolean returnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield7 is on the wire
     */
    public boolean returnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield8 is on the wire
     */
    public boolean returnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield9 is on the wire
     */
    public boolean returnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield10 is on the wire
     */
    public boolean returnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield11 is on the wire
     */
    public boolean returnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield12 is on the wire
     */
    public boolean returnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield13 is on the wire
     */
    public boolean returnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield14 is on the wire
     */
    public boolean returnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield15 is on the wire
     */
    public boolean returnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield16 is on the wire
     */
    public boolean returnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield17 is on the wire
     */
    public boolean returnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the Side put it on the wire.
     *
     * <p>Decode reads the Side where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Side is on the wire
     */
    public boolean sidePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (returnBitfield1Present() && returnBitfield1.returnBitfield1Side());
    }

    /**
     * Returns whether the fields before the PriceLong put it on the wire.
     *
     * <p>Decode reads the PriceLong where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceLong is on the wire
     */
    public boolean priceLongPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (returnBitfield1Present() && returnBitfield1.returnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (returnBitfield1Present() && returnBitfield1.returnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (returnBitfield1Present() && returnBitfield1.returnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (returnBitfield1Present() && returnBitfield1.returnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (returnBitfield1Present() && returnBitfield1.returnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the SymbolLong put it on the wire.
     *
     * <p>Decode reads the SymbolLong where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolLong is on the wire
     */
    public boolean symbolLongPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (returnBitfield2Present() && returnBitfield2.returnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (returnBitfield2Present() && returnBitfield2.returnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (returnBitfield3Present() && returnBitfield3.returnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (returnBitfield3Present() && returnBitfield3.returnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (returnBitfield3Present() && returnBitfield3.returnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (returnBitfield3Present() && returnBitfield3.returnBitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (returnBitfield3Present() && returnBitfield3.returnBitfield3MaxFloor());
    }

    /**
     * Returns whether the fields before the OrderQtyLong put it on the wire.
     *
     * <p>Decode reads the OrderQtyLong where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQtyLong is on the wire
     */
    public boolean orderQtyLongPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (returnBitfield3Present() && returnBitfield3.returnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (returnBitfield3Present() && returnBitfield3.returnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (returnBitfield4Present() && returnBitfield4.returnBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the StrikePrice put it on the wire.
     *
     * <p>Decode reads the StrikePrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StrikePrice is on the wire
     */
    public boolean strikePricePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (returnBitfield4Present() && returnBitfield4.returnBitfield4StrikePrice());
    }

    /**
     * Returns whether the fields before the PutOrCall put it on the wire.
     *
     * <p>Decode reads the PutOrCall where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PutOrCall is on the wire
     */
    public boolean putOrCallPresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (returnBitfield4Present() && returnBitfield4.returnBitfield4PutOrCall());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (returnBitfield4Present() && returnBitfield4.returnBitfield4OpenClose());
    }

    /**
     * Returns whether the fields before the CorrectedSize put it on the wire.
     *
     * <p>Decode reads the CorrectedSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CorrectedSize is on the wire
     */
    public boolean correctedSizePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (returnBitfield4Present() && returnBitfield4.returnBitfield4CorrectedSize());
    }

    /**
     * Returns whether the fields before the OrigClOrdId put it on the wire.
     *
     * <p>Decode reads the OrigClOrdId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrigClOrdId is on the wire
     */
    public boolean origClOrdIdPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (returnBitfield5Present() && returnBitfield5.returnBitfield5OrigClOrdId());
    }

    /**
     * Returns whether the fields before the LeavesQty put it on the wire.
     *
     * <p>Decode reads the LeavesQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LeavesQty is on the wire
     */
    public boolean leavesQtyPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (returnBitfield5Present() && returnBitfield5.returnBitfield5LeavesQty());
    }

    /**
     * Returns whether the fields before the LastShares put it on the wire.
     *
     * <p>Decode reads the LastShares where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastShares is on the wire
     */
    public boolean lastSharesPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (returnBitfield5Present() && returnBitfield5.returnBitfield5LastShares());
    }

    /**
     * Returns whether the fields before the LastPx put it on the wire.
     *
     * <p>Decode reads the LastPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPx is on the wire
     */
    public boolean lastPxPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (returnBitfield5Present() && returnBitfield5.returnBitfield5LastPx());
    }

    /**
     * Returns whether the fields before the DisplayPrice put it on the wire.
     *
     * <p>Decode reads the DisplayPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayPrice is on the wire
     */
    public boolean displayPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (returnBitfield5Present() && returnBitfield5.returnBitfield5DisplayPrice());
    }

    /**
     * Returns whether the fields before the WorkingPrice put it on the wire.
     *
     * <p>Decode reads the WorkingPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WorkingPrice is on the wire
     */
    public boolean workingPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (returnBitfield5Present() && returnBitfield5.returnBitfield5WorkingPrice());
    }

    /**
     * Returns whether the fields before the BaseLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the BaseLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BaseLiquidityIndicator is on the wire
     */
    public boolean baseLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (returnBitfield5Present() && returnBitfield5.returnBitfield5BaseLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (returnBitfield5Present() && returnBitfield5.returnBitfield5ExpireTime());
    }

    /**
     * Returns whether the fields before the SecondaryOrderId put it on the wire.
     *
     * <p>Decode reads the SecondaryOrderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryOrderId is on the wire
     */
    public boolean secondaryOrderIdPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (returnBitfield6Present() && returnBitfield6.returnBitfield6SecondaryOrderId());
    }

    /**
     * Returns whether the fields before the ContraCapacity put it on the wire.
     *
     * <p>Decode reads the ContraCapacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ContraCapacity is on the wire
     */
    public boolean contraCapacityPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (returnBitfield6Present() && returnBitfield6.returnBitfield6ContraCapacity());
    }

    /**
     * Returns whether the fields before the AttributedQuote put it on the wire.
     *
     * <p>Decode reads the AttributedQuote where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AttributedQuote is on the wire
     */
    public boolean attributedQuotePresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (returnBitfield6Present() && returnBitfield6.returnBitfield6AttributedQuote());
    }

    /**
     * Returns whether the fields before the SubLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the SubLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SubLiquidityIndicator is on the wire
     */
    public boolean subLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (returnBitfield7Present() && returnBitfield7.returnBitfield7SubLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the EchoText put it on the wire.
     *
     * <p>Decode reads the EchoText where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EchoText is on the wire
     */
    public boolean echoTextPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (returnBitfield8Present() && returnBitfield8.returnBitfield8EchoText());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (returnBitfield8Present() && returnBitfield8.returnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (returnBitfield8Present() && returnBitfield8.returnBitfield8RoutingInst());
    }

    /**
     * Returns whether the fields before the RoutStrategy put it on the wire.
     *
     * <p>Decode reads the RoutStrategy where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutStrategy is on the wire
     */
    public boolean routStrategyPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (returnBitfield8Present() && returnBitfield8.returnBitfield8RoutStrategy());
    }

    /**
     * Returns whether the fields before the RouteDeliveryMethod put it on the wire.
     *
     * <p>Decode reads the RouteDeliveryMethod where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RouteDeliveryMethod is on the wire
     */
    public boolean routeDeliveryMethodPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (returnBitfield8Present() && returnBitfield8.returnBitfield8RouteDeliveryMethod());
    }

    /**
     * Returns whether the fields before the ExDestination put it on the wire.
     *
     * <p>Decode reads the ExDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExDestination is on the wire
     */
    public boolean exDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (returnBitfield8Present() && returnBitfield8.returnBitfield8ExDestination());
    }

    /**
     * Returns whether the fields before the MarketingFeeCode put it on the wire.
     *
     * <p>Decode reads the MarketingFeeCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketingFeeCode is on the wire
     */
    public boolean marketingFeeCodePresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (returnBitfield9Present() && returnBitfield9.returnBitfield9MarketingFeeCode());
    }

    /**
     * Returns whether the fields before the TargetPartyId put it on the wire.
     *
     * <p>Decode reads the TargetPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TargetPartyId is on the wire
     */
    public boolean targetPartyIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (returnBitfield9Present() && returnBitfield9.returnBitfield9TargetPartyId());
    }

    /**
     * Returns whether the fields before the AuctionId put it on the wire.
     *
     * <p>Decode reads the AuctionId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AuctionId is on the wire
     */
    public boolean auctionIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (returnBitfield9Present() && returnBitfield9.returnBitfield9AuctionId());
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (returnBitfield9Present() && returnBitfield9.returnBitfield9CmtaNumber());
    }

    /**
     * Returns whether the fields before the CrossId put it on the wire.
     *
     * <p>Decode reads the CrossId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossId is on the wire
     */
    public boolean crossIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (returnBitfield10Present() && returnBitfield10.returnBitfield10CrossId());
    }

    /**
     * Returns whether the fields before the AllocQty put it on the wire.
     *
     * <p>Decode reads the AllocQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AllocQty is on the wire
     */
    public boolean allocQtyPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (returnBitfield10Present() && returnBitfield10.returnBitfield10AllocQty());
    }

    /**
     * Returns whether the fields before the GiveUpFirmId put it on the wire.
     *
     * <p>Decode reads the GiveUpFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the GiveUpFirmId is on the wire
     */
    public boolean giveUpFirmIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (returnBitfield10Present() && returnBitfield10.returnBitfield10GiveUpFirmId());
    }

    /**
     * Returns whether the fields before the RoutingFirmId put it on the wire.
     *
     * <p>Decode reads the RoutingFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingFirmId is on the wire
     */
    public boolean routingFirmIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (returnBitfield10Present() && returnBitfield10.returnBitfield10RoutingFirmId());
    }

    /**
     * Returns whether the fields before the CrossExclusionIndicator put it on the wire.
     *
     * <p>Decode reads the CrossExclusionIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossExclusionIndicator is on the wire
     */
    public boolean crossExclusionIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (returnBitfield10Present() && returnBitfield10.returnBitfield10CrossExclusionIndicator());
    }

    /**
     * Returns whether the fields before the ClearingOptionalData put it on the wire.
     *
     * <p>Decode reads the ClearingOptionalData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingOptionalData is on the wire
     */
    public boolean clearingOptionalDataPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (returnBitfield12Present() && returnBitfield12.returnBitfield12ClearingOptionalData());
    }

    /**
     * Returns whether the fields before the DrillThruProtection put it on the wire.
     *
     * <p>Decode reads the DrillThruProtection where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DrillThruProtection is on the wire
     */
    public boolean drillThruProtectionPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (returnBitfield13Present() && returnBitfield13.returnBitfield13DrillThruProtection());
    }

    /**
     * Returns whether the fields before the EquityPartyId put it on the wire.
     *
     * <p>Decode reads the EquityPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityPartyId is on the wire
     */
    public boolean equityPartyIdPresent() {
        return (numberOfReturnBitfields.value() >= 15L) && (returnBitfield15Present() && returnBitfield15.returnBitfield15EquityPartyId());
    }

    /**
     * Returns whether the fields before the ClientIdAttr put it on the wire.
     *
     * <p>Decode reads the ClientIdAttr where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientIdAttr is on the wire
     */
    public boolean clientIdAttrPresent() {
        return (numberOfReturnBitfields.value() >= 15L) && (returnBitfield15Present() && returnBitfield15.returnBitfield15ClientIdAttr());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (returnBitfield16Present() && returnBitfield16.returnBitfield16FrequentTraderId());
    }

    /**
     * Returns whether the fields before the SessionEligibility put it on the wire.
     *
     * <p>Decode reads the SessionEligibility where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SessionEligibility is on the wire
     */
    public boolean sessionEligibilityPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (returnBitfield16Present() && returnBitfield16.returnBitfield16SessionEligibility());
    }

    /**
     * Returns whether the fields before the ComboOrder put it on the wire.
     *
     * <p>Decode reads the ComboOrder where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComboOrder is on the wire
     */
    public boolean comboOrderPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (returnBitfield16Present() && returnBitfield16.returnBitfield16ComboOrder());
    }

    /**
     * Returns whether the fields before the Compression put it on the wire.
     *
     * <p>Decode reads the Compression where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Compression is on the wire
     */
    public boolean compressionPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (returnBitfield16Present() && returnBitfield16.returnBitfield16Compression());
    }

    /**
     * Returns whether the fields before the FloorDestination put it on the wire.
     *
     * <p>Decode reads the FloorDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FloorDestination is on the wire
     */
    public boolean floorDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (returnBitfield16Present() && returnBitfield16.returnBitfield16FloorDestination());
    }

    /**
     * Returns whether the fields before the FloorRoutingInst put it on the wire.
     *
     * <p>Decode reads the FloorRoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FloorRoutingInst is on the wire
     */
    public boolean floorRoutingInstPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (returnBitfield16Present() && returnBitfield16.returnBitfield16FloorRoutingInst());
    }

    /**
     * Returns whether the fields before the MultiClassSprd put it on the wire.
     *
     * <p>Decode reads the MultiClassSprd where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MultiClassSprd is on the wire
     */
    public boolean multiClassSprdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (returnBitfield16Present() && returnBitfield16.returnBitfield16MultiClassSprd());
    }

    /**
     * Returns whether the fields before the OrderOrigin put it on the wire.
     *
     * <p>Decode reads the OrderOrigin where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigin is on the wire
     */
    public boolean orderOriginPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (returnBitfield16Present() && returnBitfield16.returnBitfield16OrderOrigin());
    }

    /**
     * Returns whether the fields before the PriceType put it on the wire.
     *
     * <p>Decode reads the PriceType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceType is on the wire
     */
    public boolean priceTypePresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (returnBitfield17Present() && returnBitfield17.returnBitfield17PriceType());
    }

    /**
     * Returns whether the fields before the StrategyId put it on the wire.
     *
     * <p>Decode reads the StrategyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StrategyId is on the wire
     */
    public boolean strategyIdPresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (returnBitfield17Present() && returnBitfield17.returnBitfield17StrategyId());
    }

    private boolean onWire(Field field) {
        return (field != returnBitfield1 || returnBitfield1Present()) && (field != returnBitfield2 || returnBitfield2Present()) && (field != returnBitfield3 || returnBitfield3Present()) && (field != returnBitfield4 || returnBitfield4Present()) && (field != returnBitfield5 || returnBitfield5Present()) && (field != returnBitfield6 || returnBitfield6Present()) && (field != returnBitfield7 || returnBitfield7Present()) && (field != returnBitfield8 || returnBitfield8Present()) && (field != returnBitfield9 || returnBitfield9Present()) && (field != returnBitfield10 || returnBitfield10Present()) && (field != returnBitfield11 || returnBitfield11Present()) && (field != returnBitfield12 || returnBitfield12Present()) && (field != returnBitfield13 || returnBitfield13Present()) && (field != returnBitfield14 || returnBitfield14Present()) && (field != returnBitfield15 || returnBitfield15Present()) && (field != returnBitfield16 || returnBitfield16Present()) && (field != returnBitfield17 || returnBitfield17Present()) && (field != side || sidePresent()) && (field != priceLong || priceLongPresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolLong || symbolLongPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != maxFloor || maxFloorPresent()) && (field != orderQtyLong || orderQtyLongPresent()) && (field != preventMatch || preventMatchPresent()) && (field != maturityDate || maturityDatePresent()) && (field != strikePrice || strikePricePresent()) && (field != putOrCall || putOrCallPresent()) && (field != openClose || openClosePresent()) && (field != correctedSize || correctedSizePresent()) && (field != origClOrdId || origClOrdIdPresent()) && (field != leavesQty || leavesQtyPresent()) && (field != lastShares || lastSharesPresent()) && (field != lastPx || lastPxPresent()) && (field != displayPrice || displayPricePresent()) && (field != workingPrice || workingPricePresent()) && (field != baseLiquidityIndicator || baseLiquidityIndicatorPresent()) && (field != expireTime || expireTimePresent()) && (field != secondaryOrderId || secondaryOrderIdPresent()) && (field != contraCapacity || contraCapacityPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != subLiquidityIndicator || subLiquidityIndicatorPresent()) && (field != echoText || echoTextPresent()) && (field != stopPx || stopPxPresent()) && (field != routingInst || routingInstPresent()) && (field != routStrategy || routStrategyPresent()) && (field != routeDeliveryMethod || routeDeliveryMethodPresent()) && (field != exDestination || exDestinationPresent()) && (field != marketingFeeCode || marketingFeeCodePresent()) && (field != targetPartyId || targetPartyIdPresent()) && (field != auctionId || auctionIdPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != crossId || crossIdPresent()) && (field != allocQty || allocQtyPresent()) && (field != giveUpFirmId || giveUpFirmIdPresent()) && (field != routingFirmId || routingFirmIdPresent()) && (field != crossExclusionIndicator || crossExclusionIndicatorPresent()) && (field != clearingOptionalData || clearingOptionalDataPresent()) && (field != drillThruProtection || drillThruProtectionPresent()) && (field != equityPartyId || equityPartyIdPresent()) && (field != clientIdAttr || clientIdAttrPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != sessionEligibility || sessionEligibilityPresent()) && (field != comboOrder || comboOrderPresent()) && (field != compression || compressionPresent()) && (field != floorDestination || floorDestinationPresent()) && (field != floorRoutingInst || floorRoutingInstPresent()) && (field != multiClassSprd || multiClassSprdPresent()) && (field != orderOrigin || orderOriginPresent()) && (field != priceType || priceTypePresent()) && (field != strategyId || strategyIdPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (returnBitfield1Present() ? ReturnBitfield1Field.BYTE_LENGTH : 0) + (returnBitfield2Present() ? ReturnBitfield2Field.BYTE_LENGTH : 0) + (returnBitfield3Present() ? ReturnBitfield3Field.BYTE_LENGTH : 0) + (returnBitfield4Present() ? ReturnBitfield4Field.BYTE_LENGTH : 0) + (returnBitfield5Present() ? ReturnBitfield5Field.BYTE_LENGTH : 0) + (returnBitfield6Present() ? ReturnBitfield6Field.BYTE_LENGTH : 0) + (returnBitfield7Present() ? ReturnBitfield7Field.BYTE_LENGTH : 0) + (returnBitfield8Present() ? ReturnBitfield8Field.BYTE_LENGTH : 0) + (returnBitfield9Present() ? ReturnBitfield9Field.BYTE_LENGTH : 0) + (returnBitfield10Present() ? ReturnBitfield10Field.BYTE_LENGTH : 0) + (returnBitfield11Present() ? ReturnBitfield11Field.BYTE_LENGTH : 0) + (returnBitfield12Present() ? ReturnBitfield12Field.BYTE_LENGTH : 0) + (returnBitfield13Present() ? ReturnBitfield13Field.BYTE_LENGTH : 0) + (returnBitfield14Present() ? ReturnBitfield14Field.BYTE_LENGTH : 0) + (returnBitfield15Present() ? ReturnBitfield15Field.BYTE_LENGTH : 0) + (returnBitfield16Present() ? ReturnBitfield16Field.BYTE_LENGTH : 0) + (returnBitfield17Present() ? ReturnBitfield17Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (priceLongPresent() ? PriceLongField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolLongPresent() ? SymbolLongField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (orderQtyLongPresent() ? OrderQtyLongField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (strikePricePresent() ? StrikePriceField.BYTE_LENGTH : 0) + (putOrCallPresent() ? PutOrCallField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (correctedSizePresent() ? CorrectedSizeField.BYTE_LENGTH : 0) + (origClOrdIdPresent() ? OrigClOrdIdField.BYTE_LENGTH : 0) + (leavesQtyPresent() ? LeavesQtyField.BYTE_LENGTH : 0) + (lastSharesPresent() ? LastSharesField.BYTE_LENGTH : 0) + (lastPxPresent() ? LastPxField.BYTE_LENGTH : 0) + (displayPricePresent() ? DisplayPriceField.BYTE_LENGTH : 0) + (workingPricePresent() ? WorkingPriceField.BYTE_LENGTH : 0) + (baseLiquidityIndicatorPresent() ? BaseLiquidityIndicatorField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (secondaryOrderIdPresent() ? SecondaryOrderIdField.BYTE_LENGTH : 0) + (contraCapacityPresent() ? ContraCapacityField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (subLiquidityIndicatorPresent() ? SubLiquidityIndicatorField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (routStrategyPresent() ? RoutStrategyField.BYTE_LENGTH : 0) + (routeDeliveryMethodPresent() ? RouteDeliveryMethodField.BYTE_LENGTH : 0) + (exDestinationPresent() ? ExDestinationField.BYTE_LENGTH : 0) + (marketingFeeCodePresent() ? MarketingFeeCodeField.BYTE_LENGTH : 0) + (targetPartyIdPresent() ? TargetPartyIdField.BYTE_LENGTH : 0) + (auctionIdPresent() ? AuctionIdField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (crossIdPresent() ? CrossIdField.BYTE_LENGTH : 0) + (allocQtyPresent() ? AllocQtyField.BYTE_LENGTH : 0) + (giveUpFirmIdPresent() ? GiveUpFirmIdField.BYTE_LENGTH : 0) + (routingFirmIdPresent() ? RoutingFirmIdField.BYTE_LENGTH : 0) + (crossExclusionIndicatorPresent() ? CrossExclusionIndicatorField.BYTE_LENGTH : 0) + (clearingOptionalDataPresent() ? ClearingOptionalDataField.BYTE_LENGTH : 0) + (drillThruProtectionPresent() ? DrillThruProtectionField.BYTE_LENGTH : 0) + (equityPartyIdPresent() ? EquityPartyIdField.BYTE_LENGTH : 0) + (clientIdAttrPresent() ? ClientIdAttrField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (sessionEligibilityPresent() ? SessionEligibilityField.BYTE_LENGTH : 0) + (comboOrderPresent() ? ComboOrderField.BYTE_LENGTH : 0) + (compressionPresent() ? CompressionField.BYTE_LENGTH : 0) + (floorDestinationPresent() ? FloorDestinationField.BYTE_LENGTH : 0) + (floorRoutingInstPresent() ? FloorRoutingInstField.BYTE_LENGTH : 0) + (multiClassSprdPresent() ? MultiClassSprdField.BYTE_LENGTH : 0) + (orderOriginPresent() ? OrderOriginField.BYTE_LENGTH : 0) + (priceTypePresent() ? PriceTypeField.BYTE_LENGTH : 0) + (strategyIdPresent() ? StrategyIdField.BYTE_LENGTH : 0);
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
        cursor += 8;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (returnBitfield1Present()) {
            cursor += 1;
        }
        if (returnBitfield2Present()) {
            cursor += 1;
        }
        if (returnBitfield3Present()) {
            cursor += 1;
        }
        if (returnBitfield4Present()) {
            cursor += 1;
        }
        if (returnBitfield5Present()) {
            cursor += 1;
        }
        if (returnBitfield6Present()) {
            cursor += 1;
        }
        if (returnBitfield7Present()) {
            cursor += 1;
        }
        if (returnBitfield8Present()) {
            cursor += 1;
        }
        if (returnBitfield9Present()) {
            cursor += 1;
        }
        if (returnBitfield10Present()) {
            cursor += 1;
        }
        if (returnBitfield11Present()) {
            cursor += 1;
        }
        if (returnBitfield12Present()) {
            cursor += 1;
        }
        if (returnBitfield13Present()) {
            cursor += 1;
        }
        if (returnBitfield14Present()) {
            cursor += 1;
        }
        if (returnBitfield15Present()) {
            cursor += 1;
        }
        if (returnBitfield16Present()) {
            cursor += 1;
        }
        if (returnBitfield17Present()) {
            cursor += 1;
        }
        if (sidePresent()) {
            cursor += 1;
        }
        if (priceLongPresent()) {
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
        if (symbolLongPresent()) {
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
        if (orderQtyLongPresent()) {
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
        if (origClOrdIdPresent()) {
            cursor += 20;
        }
        if (leavesQtyPresent()) {
            cursor += 4;
        }
        if (lastSharesPresent()) {
            cursor += 4;
        }
        if (lastPxPresent()) {
            cursor += 8;
        }
        if (displayPricePresent()) {
            cursor += 8;
        }
        if (workingPricePresent()) {
            cursor += 8;
        }
        if (baseLiquidityIndicatorPresent()) {
            cursor += 1;
        }
        if (expireTimePresent()) {
            cursor += 8;
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
        if (subLiquidityIndicatorPresent()) {
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
        if (drillThruProtectionPresent()) {
            cursor += 8;
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
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(expireTime.value());
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
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (returnBitfield1Present()) {
            if (end - cursor < ReturnBitfield1Field.BYTE_LENGTH || !returnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield2Present()) {
            if (end - cursor < ReturnBitfield2Field.BYTE_LENGTH || !returnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield3Present()) {
            if (end - cursor < ReturnBitfield3Field.BYTE_LENGTH || !returnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield4Present()) {
            if (end - cursor < ReturnBitfield4Field.BYTE_LENGTH || !returnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield5Present()) {
            if (end - cursor < ReturnBitfield5Field.BYTE_LENGTH || !returnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield6Present()) {
            if (end - cursor < ReturnBitfield6Field.BYTE_LENGTH || !returnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield7Present()) {
            if (end - cursor < ReturnBitfield7Field.BYTE_LENGTH || !returnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield8Present()) {
            if (end - cursor < ReturnBitfield8Field.BYTE_LENGTH || !returnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield9Present()) {
            if (end - cursor < ReturnBitfield9Field.BYTE_LENGTH || !returnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield10Present()) {
            if (end - cursor < ReturnBitfield10Field.BYTE_LENGTH || !returnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield11Present()) {
            if (end - cursor < ReturnBitfield11Field.BYTE_LENGTH || !returnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield12Present()) {
            if (end - cursor < ReturnBitfield12Field.BYTE_LENGTH || !returnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield13Present()) {
            if (end - cursor < ReturnBitfield13Field.BYTE_LENGTH || !returnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield14Present()) {
            if (end - cursor < ReturnBitfield14Field.BYTE_LENGTH || !returnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield15Present()) {
            if (end - cursor < ReturnBitfield15Field.BYTE_LENGTH || !returnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield16Present()) {
            if (end - cursor < ReturnBitfield16Field.BYTE_LENGTH || !returnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield17Present()) {
            if (end - cursor < ReturnBitfield17Field.BYTE_LENGTH || !returnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield17Field.BYTE_LENGTH;
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
        if (priceLongPresent()) {
            if (end - cursor < PriceLongField.BYTE_LENGTH || !priceLong.parse(data, cursor)) {
                return false;
            }
            cursor += PriceLongField.BYTE_LENGTH;
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
        if (symbolLongPresent()) {
            if (end - cursor < SymbolLongField.BYTE_LENGTH || !symbolLong.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolLongField.BYTE_LENGTH;
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
        if (orderQtyLongPresent()) {
            if (end - cursor < OrderQtyLongField.BYTE_LENGTH || !orderQtyLong.parse(data, cursor)) {
                return false;
            }
            cursor += OrderQtyLongField.BYTE_LENGTH;
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
        if (origClOrdIdPresent()) {
            if (end - cursor < OrigClOrdIdField.BYTE_LENGTH || !origClOrdId.parse(data, cursor)) {
                return false;
            }
            cursor += OrigClOrdIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (leavesQtyPresent()) {
            if (end - cursor < LeavesQtyField.BYTE_LENGTH || !leavesQty.parse(data, cursor)) {
                return false;
            }
            cursor += LeavesQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (lastSharesPresent()) {
            if (end - cursor < LastSharesField.BYTE_LENGTH || !lastShares.parse(data, cursor)) {
                return false;
            }
            cursor += LastSharesField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (lastPxPresent()) {
            if (end - cursor < LastPxField.BYTE_LENGTH || !lastPx.parse(data, cursor)) {
                return false;
            }
            cursor += LastPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (displayPricePresent()) {
            if (end - cursor < DisplayPriceField.BYTE_LENGTH || !displayPrice.parse(data, cursor)) {
                return false;
            }
            cursor += DisplayPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (workingPricePresent()) {
            if (end - cursor < WorkingPriceField.BYTE_LENGTH || !workingPrice.parse(data, cursor)) {
                return false;
            }
            cursor += WorkingPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (baseLiquidityIndicatorPresent()) {
            if (end - cursor < BaseLiquidityIndicatorField.BYTE_LENGTH || !baseLiquidityIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (expireTimePresent()) {
            if (end - cursor < ExpireTimeField.BYTE_LENGTH || !expireTime.parse(data, cursor)) {
                return false;
            }
            cursor += ExpireTimeField.BYTE_LENGTH;
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
        if (subLiquidityIndicatorPresent()) {
            if (end - cursor < SubLiquidityIndicatorField.BYTE_LENGTH || !subLiquidityIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += SubLiquidityIndicatorField.BYTE_LENGTH;
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
        if (drillThruProtectionPresent()) {
            if (end - cursor < DrillThruProtectionField.BYTE_LENGTH || !drillThruProtection.parse(data, cursor)) {
                return false;
            }
            cursor += DrillThruProtectionField.BYTE_LENGTH;
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

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (returnBitfield1Present() != returnBitfield1.hasValue()) {
            throw new IllegalStateException(returnBitfield1.hasValue() ? "returnBitfield1 holds a value the fields before it leave off the wire" : "returnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield2Present() != returnBitfield2.hasValue()) {
            throw new IllegalStateException(returnBitfield2.hasValue() ? "returnBitfield2 holds a value the fields before it leave off the wire" : "returnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield3Present() != returnBitfield3.hasValue()) {
            throw new IllegalStateException(returnBitfield3.hasValue() ? "returnBitfield3 holds a value the fields before it leave off the wire" : "returnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield4Present() != returnBitfield4.hasValue()) {
            throw new IllegalStateException(returnBitfield4.hasValue() ? "returnBitfield4 holds a value the fields before it leave off the wire" : "returnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield5Present() != returnBitfield5.hasValue()) {
            throw new IllegalStateException(returnBitfield5.hasValue() ? "returnBitfield5 holds a value the fields before it leave off the wire" : "returnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield6Present() != returnBitfield6.hasValue()) {
            throw new IllegalStateException(returnBitfield6.hasValue() ? "returnBitfield6 holds a value the fields before it leave off the wire" : "returnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield7Present() != returnBitfield7.hasValue()) {
            throw new IllegalStateException(returnBitfield7.hasValue() ? "returnBitfield7 holds a value the fields before it leave off the wire" : "returnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield8Present() != returnBitfield8.hasValue()) {
            throw new IllegalStateException(returnBitfield8.hasValue() ? "returnBitfield8 holds a value the fields before it leave off the wire" : "returnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield9Present() != returnBitfield9.hasValue()) {
            throw new IllegalStateException(returnBitfield9.hasValue() ? "returnBitfield9 holds a value the fields before it leave off the wire" : "returnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield10Present() != returnBitfield10.hasValue()) {
            throw new IllegalStateException(returnBitfield10.hasValue() ? "returnBitfield10 holds a value the fields before it leave off the wire" : "returnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield11Present() != returnBitfield11.hasValue()) {
            throw new IllegalStateException(returnBitfield11.hasValue() ? "returnBitfield11 holds a value the fields before it leave off the wire" : "returnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield12Present() != returnBitfield12.hasValue()) {
            throw new IllegalStateException(returnBitfield12.hasValue() ? "returnBitfield12 holds a value the fields before it leave off the wire" : "returnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield13Present() != returnBitfield13.hasValue()) {
            throw new IllegalStateException(returnBitfield13.hasValue() ? "returnBitfield13 holds a value the fields before it leave off the wire" : "returnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield14Present() != returnBitfield14.hasValue()) {
            throw new IllegalStateException(returnBitfield14.hasValue() ? "returnBitfield14 holds a value the fields before it leave off the wire" : "returnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield15Present() != returnBitfield15.hasValue()) {
            throw new IllegalStateException(returnBitfield15.hasValue() ? "returnBitfield15 holds a value the fields before it leave off the wire" : "returnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield16Present() != returnBitfield16.hasValue()) {
            throw new IllegalStateException(returnBitfield16.hasValue() ? "returnBitfield16 holds a value the fields before it leave off the wire" : "returnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield17Present() != returnBitfield17.hasValue()) {
            throw new IllegalStateException(returnBitfield17.hasValue() ? "returnBitfield17 holds a value the fields before it leave off the wire" : "returnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (sidePresent() != side.hasValue()) {
            throw new IllegalStateException(side.hasValue() ? "side holds a value the fields before it leave off the wire" : "side holds no value, though the fields before it put it on the wire");
        }
        if (priceLongPresent() != priceLong.hasValue()) {
            throw new IllegalStateException(priceLong.hasValue() ? "priceLong holds a value the fields before it leave off the wire" : "priceLong holds no value, though the fields before it put it on the wire");
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
        if (symbolLongPresent() != symbolLong.hasValue()) {
            throw new IllegalStateException(symbolLong.hasValue() ? "symbolLong holds a value the fields before it leave off the wire" : "symbolLong holds no value, though the fields before it put it on the wire");
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
        if (orderQtyLongPresent() != orderQtyLong.hasValue()) {
            throw new IllegalStateException(orderQtyLong.hasValue() ? "orderQtyLong holds a value the fields before it leave off the wire" : "orderQtyLong holds no value, though the fields before it put it on the wire");
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
        if (origClOrdIdPresent() != origClOrdId.hasValue()) {
            throw new IllegalStateException(origClOrdId.hasValue() ? "origClOrdId holds a value the fields before it leave off the wire" : "origClOrdId holds no value, though the fields before it put it on the wire");
        }
        if (leavesQtyPresent() != leavesQty.hasValue()) {
            throw new IllegalStateException(leavesQty.hasValue() ? "leavesQty holds a value the fields before it leave off the wire" : "leavesQty holds no value, though the fields before it put it on the wire");
        }
        if (lastSharesPresent() != lastShares.hasValue()) {
            throw new IllegalStateException(lastShares.hasValue() ? "lastShares holds a value the fields before it leave off the wire" : "lastShares holds no value, though the fields before it put it on the wire");
        }
        if (lastPxPresent() != lastPx.hasValue()) {
            throw new IllegalStateException(lastPx.hasValue() ? "lastPx holds a value the fields before it leave off the wire" : "lastPx holds no value, though the fields before it put it on the wire");
        }
        if (displayPricePresent() != displayPrice.hasValue()) {
            throw new IllegalStateException(displayPrice.hasValue() ? "displayPrice holds a value the fields before it leave off the wire" : "displayPrice holds no value, though the fields before it put it on the wire");
        }
        if (workingPricePresent() != workingPrice.hasValue()) {
            throw new IllegalStateException(workingPrice.hasValue() ? "workingPrice holds a value the fields before it leave off the wire" : "workingPrice holds no value, though the fields before it put it on the wire");
        }
        if (baseLiquidityIndicatorPresent() != baseLiquidityIndicator.hasValue()) {
            throw new IllegalStateException(baseLiquidityIndicator.hasValue() ? "baseLiquidityIndicator holds a value the fields before it leave off the wire" : "baseLiquidityIndicator holds no value, though the fields before it put it on the wire");
        }
        if (expireTimePresent() != expireTime.hasValue()) {
            throw new IllegalStateException(expireTime.hasValue() ? "expireTime holds a value the fields before it leave off the wire" : "expireTime holds no value, though the fields before it put it on the wire");
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
        if (subLiquidityIndicatorPresent() != subLiquidityIndicator.hasValue()) {
            throw new IllegalStateException(subLiquidityIndicator.hasValue() ? "subLiquidityIndicator holds a value the fields before it leave off the wire" : "subLiquidityIndicator holds no value, though the fields before it put it on the wire");
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
        if (drillThruProtectionPresent() != drillThruProtection.hasValue()) {
            throw new IllegalStateException(drillThruProtection.hasValue() ? "drillThruProtection holds a value the fields before it leave off the wire" : "drillThruProtection holds no value, though the fields before it put it on the wire");
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
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        if (buffer != null && buffer.length >= 37) {
            System.arraycopy(buffer, 36, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (returnBitfield1Present()) {
            cursor = returnBitfield1.encode(data, cursor);
        }
        if (returnBitfield2Present()) {
            cursor = returnBitfield2.encode(data, cursor);
        }
        if (returnBitfield3Present()) {
            cursor = returnBitfield3.encode(data, cursor);
        }
        if (returnBitfield4Present()) {
            cursor = returnBitfield4.encode(data, cursor);
        }
        if (returnBitfield5Present()) {
            cursor = returnBitfield5.encode(data, cursor);
        }
        if (returnBitfield6Present()) {
            cursor = returnBitfield6.encode(data, cursor);
        }
        if (returnBitfield7Present()) {
            cursor = returnBitfield7.encode(data, cursor);
        }
        if (returnBitfield8Present()) {
            cursor = returnBitfield8.encode(data, cursor);
        }
        if (returnBitfield9Present()) {
            cursor = returnBitfield9.encode(data, cursor);
        }
        if (returnBitfield10Present()) {
            cursor = returnBitfield10.encode(data, cursor);
        }
        if (returnBitfield11Present()) {
            cursor = returnBitfield11.encode(data, cursor);
        }
        if (returnBitfield12Present()) {
            cursor = returnBitfield12.encode(data, cursor);
        }
        if (returnBitfield13Present()) {
            cursor = returnBitfield13.encode(data, cursor);
        }
        if (returnBitfield14Present()) {
            cursor = returnBitfield14.encode(data, cursor);
        }
        if (returnBitfield15Present()) {
            cursor = returnBitfield15.encode(data, cursor);
        }
        if (returnBitfield16Present()) {
            cursor = returnBitfield16.encode(data, cursor);
        }
        if (returnBitfield17Present()) {
            cursor = returnBitfield17.encode(data, cursor);
        }
        if (sidePresent()) {
            cursor = side.encode(data, cursor);
        }
        if (priceLongPresent()) {
            cursor = priceLong.encode(data, cursor);
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
        if (symbolLongPresent()) {
            cursor = symbolLong.encode(data, cursor);
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
        if (orderQtyLongPresent()) {
            cursor = orderQtyLong.encode(data, cursor);
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
        if (origClOrdIdPresent()) {
            cursor = origClOrdId.encode(data, cursor);
        }
        if (leavesQtyPresent()) {
            cursor = leavesQty.encode(data, cursor);
        }
        if (lastSharesPresent()) {
            cursor = lastShares.encode(data, cursor);
        }
        if (lastPxPresent()) {
            cursor = lastPx.encode(data, cursor);
        }
        if (displayPricePresent()) {
            cursor = displayPrice.encode(data, cursor);
        }
        if (workingPricePresent()) {
            cursor = workingPrice.encode(data, cursor);
        }
        if (baseLiquidityIndicatorPresent()) {
            cursor = baseLiquidityIndicator.encode(data, cursor);
        }
        if (expireTimePresent()) {
            cursor = expireTime.encode(data, cursor);
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
        if (subLiquidityIndicatorPresent()) {
            cursor = subLiquidityIndicator.encode(data, cursor);
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
        if (drillThruProtectionPresent()) {
            cursor = drillThruProtection.encode(data, cursor);
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
            case "TransactTime" -> Optional.of(transactTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderId" -> Optional.of(orderId);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "ReturnBitfield1" -> Optional.of(returnBitfield1);
            case "ReturnBitfield2" -> Optional.of(returnBitfield2);
            case "ReturnBitfield3" -> Optional.of(returnBitfield3);
            case "ReturnBitfield4" -> Optional.of(returnBitfield4);
            case "ReturnBitfield5" -> Optional.of(returnBitfield5);
            case "ReturnBitfield6" -> Optional.of(returnBitfield6);
            case "ReturnBitfield7" -> Optional.of(returnBitfield7);
            case "ReturnBitfield8" -> Optional.of(returnBitfield8);
            case "ReturnBitfield9" -> Optional.of(returnBitfield9);
            case "ReturnBitfield10" -> Optional.of(returnBitfield10);
            case "ReturnBitfield11" -> Optional.of(returnBitfield11);
            case "ReturnBitfield12" -> Optional.of(returnBitfield12);
            case "ReturnBitfield13" -> Optional.of(returnBitfield13);
            case "ReturnBitfield14" -> Optional.of(returnBitfield14);
            case "ReturnBitfield15" -> Optional.of(returnBitfield15);
            case "ReturnBitfield16" -> Optional.of(returnBitfield16);
            case "ReturnBitfield17" -> Optional.of(returnBitfield17);
            case "Side" -> Optional.of(side);
            case "PriceLong" -> Optional.of(priceLong);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "SymbolLong" -> Optional.of(symbolLong);
            case "Capacity" -> Optional.of(capacity);
            case "Account" -> Optional.of(account);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "OrderQtyLong" -> Optional.of(orderQtyLong);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "OpenClose" -> Optional.of(openClose);
            case "CorrectedSize" -> Optional.of(correctedSize);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPx" -> Optional.of(lastPx);
            case "DisplayPrice" -> Optional.of(displayPrice);
            case "WorkingPrice" -> Optional.of(workingPrice);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "ExpireTime" -> Optional.of(expireTime);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "ContraCapacity" -> Optional.of(contraCapacity);
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
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
            case "DrillThruProtection" -> Optional.of(drillThruProtection);
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
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderAcknowledgmentMessage message)) {
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
        if (!(other instanceof OrderAcknowledgmentMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
