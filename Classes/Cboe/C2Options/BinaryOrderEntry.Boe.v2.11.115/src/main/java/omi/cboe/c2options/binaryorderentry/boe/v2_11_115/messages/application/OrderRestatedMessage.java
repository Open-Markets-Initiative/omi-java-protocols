package omi.cboe.c2options.binaryorderentry.boe.v2_11_115.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.AccountField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.AllocQtyField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.AttributedQuoteField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.AuctionIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.BaseLiquidityIndicatorField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CapacityField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ClOrdIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ClearingAccountField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ClearingFirmField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ClientIdAttrField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CmtaNumberField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ComboOrderField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CompressionField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ContraCapacityField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CorrectedSizeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossExclusionIndicatorField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.DisplayIndicatorField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.DisplayPriceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.EchoTextField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ExDestinationField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ExecInstField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ExpireTimeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.FloorDestinationField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.FloorRoutingInstField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.FrequentTraderIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.GiveUpFirmIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.HeldField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.LastPxField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.LastSharesField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.LeavesQtyField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.MarketingFeeCodeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.MaturityDateField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.MaxFloorField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.MinQtyField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.MultiClassSprdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.NumberOfReturnBitfieldsField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OpenCloseField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrdTypeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderOriginField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderQtyBinaryField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield10Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield11Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield12Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield13Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield14Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield15Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield16Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield17Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield18Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield19Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield1Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield2Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield3Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield4Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield5Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield6Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield7Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield8Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderRestatedReturnBitfield9Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrigClOrdIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.PreventMatchField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.PriceBinaryPriceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.PriceTypeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.PutOrCallField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.RestatementReasonField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.RoutStrategyField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.RouteDeliveryMethodField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.RoutingFirmIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.RoutingInstField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.SecondaryOrderIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.SideField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.StopPxField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.StopPxTypeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.StrategyIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.StrikePriceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.SymbolAlphanumericField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.TargetPartyIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.TimeInForceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.TransactionTimeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.WorkingPriceBinaryPriceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.types.Message;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * Represents the OrderRestatedMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Order Restated Message.</p>
 */
public final class OrderRestatedMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Restated Message";

    /**
     * Report send time (for audit).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol (@) and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived, persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to OrderID (37) in Cboe FIX. Order identifier supplied by Cboe. This identifier corresponds to the identifiers used in Cboe market data products.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * The reason for this Order Restated message. E=Reduction of OrdQty due to Equity Leg Reject (C1 only) F=Represented on Floor(C1 only) L=Reload P=Price Sliding Reprice Q=Liquidity Updated R=Reroute S=Ship and Post (SWP) W=Wash f=Unsolicited Floor Action(C1 only) Cboe reserves the right to add new values as necessary without prior notice.
     */
    private final RestatementReasonField restatementReason = new RestatementReasonField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderRestated byte 1.
     */
    private final OrderRestatedReturnBitfield1Field orderRestatedReturnBitfield1 = new OrderRestatedReturnBitfield1Field();

    /**
     * BitSet OrderRestated byte 2.
     */
    private final OrderRestatedReturnBitfield2Field orderRestatedReturnBitfield2 = new OrderRestatedReturnBitfield2Field();

    /**
     * BitSet OrderRestated byte 3.
     */
    private final OrderRestatedReturnBitfield3Field orderRestatedReturnBitfield3 = new OrderRestatedReturnBitfield3Field();

    /**
     * BitSet OrderRestated byte 4.
     */
    private final OrderRestatedReturnBitfield4Field orderRestatedReturnBitfield4 = new OrderRestatedReturnBitfield4Field();

    /**
     * BitSet OrderRestated byte 5.
     */
    private final OrderRestatedReturnBitfield5Field orderRestatedReturnBitfield5 = new OrderRestatedReturnBitfield5Field();

    /**
     * BitSet OrderRestated byte 6.
     */
    private final OrderRestatedReturnBitfield6Field orderRestatedReturnBitfield6 = new OrderRestatedReturnBitfield6Field();

    /**
     * BitSet OrderRestated byte 7.
     */
    private final OrderRestatedReturnBitfield7Field orderRestatedReturnBitfield7 = new OrderRestatedReturnBitfield7Field();

    /**
     * BitSet OrderRestated byte 8.
     */
    private final OrderRestatedReturnBitfield8Field orderRestatedReturnBitfield8 = new OrderRestatedReturnBitfield8Field();

    /**
     * BitSet OrderRestated byte 9.
     */
    private final OrderRestatedReturnBitfield9Field orderRestatedReturnBitfield9 = new OrderRestatedReturnBitfield9Field();

    /**
     * BitSet OrderRestated byte 10.
     */
    private final OrderRestatedReturnBitfield10Field orderRestatedReturnBitfield10 = new OrderRestatedReturnBitfield10Field();

    /**
     * BitSet OrderRestated byte 11.
     */
    private final OrderRestatedReturnBitfield11Field orderRestatedReturnBitfield11 = new OrderRestatedReturnBitfield11Field();

    /**
     * BitSet OrderRestated byte 12.
     */
    private final OrderRestatedReturnBitfield12Field orderRestatedReturnBitfield12 = new OrderRestatedReturnBitfield12Field();

    /**
     * BitSet OrderRestated byte 13.
     */
    private final OrderRestatedReturnBitfield13Field orderRestatedReturnBitfield13 = new OrderRestatedReturnBitfield13Field();

    /**
     * BitSet OrderRestated byte 14.
     */
    private final OrderRestatedReturnBitfield14Field orderRestatedReturnBitfield14 = new OrderRestatedReturnBitfield14Field();

    /**
     * BitSet OrderRestated byte 15.
     */
    private final OrderRestatedReturnBitfield15Field orderRestatedReturnBitfield15 = new OrderRestatedReturnBitfield15Field();

    /**
     * BitSet OrderRestated byte 16.
     */
    private final OrderRestatedReturnBitfield16Field orderRestatedReturnBitfield16 = new OrderRestatedReturnBitfield16Field();

    /**
     * BitSet OrderRestated byte 17.
     */
    private final OrderRestatedReturnBitfield17Field orderRestatedReturnBitfield17 = new OrderRestatedReturnBitfield17Field();

    /**
     * BitSet OrderRestated byte 18.
     */
    private final OrderRestatedReturnBitfield18Field orderRestatedReturnBitfield18 = new OrderRestatedReturnBitfield18Field();

    /**
     * BitSet OrderRestated byte 19.
     */
    private final OrderRestatedReturnBitfield19Field orderRestatedReturnBitfield19 = new OrderRestatedReturnBitfield19Field();

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
     * Working Price Binary Price
     */
    private final WorkingPriceBinaryPriceField workingPriceBinaryPrice = new WorkingPriceBinaryPriceField();

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
     * Client Id Attr
     */
    private final ClientIdAttrField clientIdAttr = new ClientIdAttrField();

    /**
     * Frequent Trader Id
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

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
     * Held
     */
    private final HeldField held = new HeldField();

    /**
     * Stop Px Type
     */
    private final StopPxTypeField stopPxType = new StopPxTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderId, restatementReason, numberOfReturnBitfields, orderRestatedReturnBitfield1, orderRestatedReturnBitfield2, orderRestatedReturnBitfield3, orderRestatedReturnBitfield4, orderRestatedReturnBitfield5, orderRestatedReturnBitfield6, orderRestatedReturnBitfield7, orderRestatedReturnBitfield8, orderRestatedReturnBitfield9, orderRestatedReturnBitfield10, orderRestatedReturnBitfield11, orderRestatedReturnBitfield12, orderRestatedReturnBitfield13, orderRestatedReturnBitfield14, orderRestatedReturnBitfield15, orderRestatedReturnBitfield16, orderRestatedReturnBitfield17, orderRestatedReturnBitfield18, orderRestatedReturnBitfield19, side, priceBinaryPrice, execInst, ordType, timeInForce, minQty, symbolAlphanumeric, capacity, account, clearingFirm, clearingAccount, displayIndicator, maxFloor, orderQtyBinary, preventMatch, maturityDate, strikePrice, putOrCall, openClose, correctedSize, origClOrdId, leavesQty, lastShares, lastPx, displayPrice, workingPriceBinaryPrice, baseLiquidityIndicator, expireTime, secondaryOrderId, contraCapacity, attributedQuote, echoText, stopPx, routingInst, routStrategy, routeDeliveryMethod, exDestination, marketingFeeCode, targetPartyId, auctionId, cmtaNumber, crossId, allocQty, giveUpFirmId, routingFirmId, crossExclusionIndicator, clientIdAttr, frequentTraderId, comboOrder, compression, floorDestination, floorRoutingInst, multiClassSprd, orderOrigin, priceType, strategyId, held, stopPxType);

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
     * Corresponds to OrderID (37) in Cboe FIX. Order identifier supplied by Cboe. This identifier corresponds to the identifiers used in Cboe market data products.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * The reason for this Order Restated message. E=Reduction of OrdQty due to Equity Leg Reject (C1 only) F=Represented on Floor(C1 only) L=Reload P=Price Sliding Reprice Q=Liquidity Updated R=Reroute S=Ship and Post (SWP) W=Wash f=Unsolicited Floor Action(C1 only) Cboe reserves the right to add new values as necessary without prior notice.
     *
     * @return the RestatementReason field
     */
    public RestatementReasonField restatementReason() {
        return restatementReason;
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
     * BitSet OrderRestated byte 1.
     *
     * @return the OrderRestatedReturnBitfield1 field
     */
    public OrderRestatedReturnBitfield1Field orderRestatedReturnBitfield1() {
        return orderRestatedReturnBitfield1;
    }

    /**
     * BitSet OrderRestated byte 2.
     *
     * @return the OrderRestatedReturnBitfield2 field
     */
    public OrderRestatedReturnBitfield2Field orderRestatedReturnBitfield2() {
        return orderRestatedReturnBitfield2;
    }

    /**
     * BitSet OrderRestated byte 3.
     *
     * @return the OrderRestatedReturnBitfield3 field
     */
    public OrderRestatedReturnBitfield3Field orderRestatedReturnBitfield3() {
        return orderRestatedReturnBitfield3;
    }

    /**
     * BitSet OrderRestated byte 4.
     *
     * @return the OrderRestatedReturnBitfield4 field
     */
    public OrderRestatedReturnBitfield4Field orderRestatedReturnBitfield4() {
        return orderRestatedReturnBitfield4;
    }

    /**
     * BitSet OrderRestated byte 5.
     *
     * @return the OrderRestatedReturnBitfield5 field
     */
    public OrderRestatedReturnBitfield5Field orderRestatedReturnBitfield5() {
        return orderRestatedReturnBitfield5;
    }

    /**
     * BitSet OrderRestated byte 6.
     *
     * @return the OrderRestatedReturnBitfield6 field
     */
    public OrderRestatedReturnBitfield6Field orderRestatedReturnBitfield6() {
        return orderRestatedReturnBitfield6;
    }

    /**
     * BitSet OrderRestated byte 7.
     *
     * @return the OrderRestatedReturnBitfield7 field
     */
    public OrderRestatedReturnBitfield7Field orderRestatedReturnBitfield7() {
        return orderRestatedReturnBitfield7;
    }

    /**
     * BitSet OrderRestated byte 8.
     *
     * @return the OrderRestatedReturnBitfield8 field
     */
    public OrderRestatedReturnBitfield8Field orderRestatedReturnBitfield8() {
        return orderRestatedReturnBitfield8;
    }

    /**
     * BitSet OrderRestated byte 9.
     *
     * @return the OrderRestatedReturnBitfield9 field
     */
    public OrderRestatedReturnBitfield9Field orderRestatedReturnBitfield9() {
        return orderRestatedReturnBitfield9;
    }

    /**
     * BitSet OrderRestated byte 10.
     *
     * @return the OrderRestatedReturnBitfield10 field
     */
    public OrderRestatedReturnBitfield10Field orderRestatedReturnBitfield10() {
        return orderRestatedReturnBitfield10;
    }

    /**
     * BitSet OrderRestated byte 11.
     *
     * @return the OrderRestatedReturnBitfield11 field
     */
    public OrderRestatedReturnBitfield11Field orderRestatedReturnBitfield11() {
        return orderRestatedReturnBitfield11;
    }

    /**
     * BitSet OrderRestated byte 12.
     *
     * @return the OrderRestatedReturnBitfield12 field
     */
    public OrderRestatedReturnBitfield12Field orderRestatedReturnBitfield12() {
        return orderRestatedReturnBitfield12;
    }

    /**
     * BitSet OrderRestated byte 13.
     *
     * @return the OrderRestatedReturnBitfield13 field
     */
    public OrderRestatedReturnBitfield13Field orderRestatedReturnBitfield13() {
        return orderRestatedReturnBitfield13;
    }

    /**
     * BitSet OrderRestated byte 14.
     *
     * @return the OrderRestatedReturnBitfield14 field
     */
    public OrderRestatedReturnBitfield14Field orderRestatedReturnBitfield14() {
        return orderRestatedReturnBitfield14;
    }

    /**
     * BitSet OrderRestated byte 15.
     *
     * @return the OrderRestatedReturnBitfield15 field
     */
    public OrderRestatedReturnBitfield15Field orderRestatedReturnBitfield15() {
        return orderRestatedReturnBitfield15;
    }

    /**
     * BitSet OrderRestated byte 16.
     *
     * @return the OrderRestatedReturnBitfield16 field
     */
    public OrderRestatedReturnBitfield16Field orderRestatedReturnBitfield16() {
        return orderRestatedReturnBitfield16;
    }

    /**
     * BitSet OrderRestated byte 17.
     *
     * @return the OrderRestatedReturnBitfield17 field
     */
    public OrderRestatedReturnBitfield17Field orderRestatedReturnBitfield17() {
        return orderRestatedReturnBitfield17;
    }

    /**
     * BitSet OrderRestated byte 18.
     *
     * @return the OrderRestatedReturnBitfield18 field
     */
    public OrderRestatedReturnBitfield18Field orderRestatedReturnBitfield18() {
        return orderRestatedReturnBitfield18;
    }

    /**
     * BitSet OrderRestated byte 19.
     *
     * @return the OrderRestatedReturnBitfield19 field
     */
    public OrderRestatedReturnBitfield19Field orderRestatedReturnBitfield19() {
        return orderRestatedReturnBitfield19;
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
     * Working Price Binary Price
     *
     * @return the WorkingPriceBinaryPrice field
     */
    public WorkingPriceBinaryPriceField workingPriceBinaryPrice() {
        return workingPriceBinaryPrice;
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
     * Held
     *
     * @return the Held field
     */
    public HeldField held() {
        return held;
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
     * Returns whether the fields before the OrderRestatedReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield1 is on the wire
     */
    public boolean orderRestatedReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield2 is on the wire
     */
    public boolean orderRestatedReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield3 is on the wire
     */
    public boolean orderRestatedReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield4 is on the wire
     */
    public boolean orderRestatedReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield5 is on the wire
     */
    public boolean orderRestatedReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield6 is on the wire
     */
    public boolean orderRestatedReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield7 is on the wire
     */
    public boolean orderRestatedReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield8 is on the wire
     */
    public boolean orderRestatedReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield9 is on the wire
     */
    public boolean orderRestatedReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield10 is on the wire
     */
    public boolean orderRestatedReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield11 is on the wire
     */
    public boolean orderRestatedReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield12 is on the wire
     */
    public boolean orderRestatedReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield13 is on the wire
     */
    public boolean orderRestatedReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield14 is on the wire
     */
    public boolean orderRestatedReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield15 is on the wire
     */
    public boolean orderRestatedReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield16 is on the wire
     */
    public boolean orderRestatedReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield17 is on the wire
     */
    public boolean orderRestatedReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield18 is on the wire
     */
    public boolean orderRestatedReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield19 is on the wire
     */
    public boolean orderRestatedReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the Side put it on the wire.
     *
     * <p>Decode reads the Side where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Side is on the wire
     */
    public boolean sidePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRestatedReturnBitfield1Present() && orderRestatedReturnBitfield1.orderRestatedReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the PriceBinaryPrice put it on the wire.
     *
     * <p>Decode reads the PriceBinaryPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceBinaryPrice is on the wire
     */
    public boolean priceBinaryPricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRestatedReturnBitfield1Present() && orderRestatedReturnBitfield1.orderRestatedReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRestatedReturnBitfield1Present() && orderRestatedReturnBitfield1.orderRestatedReturnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRestatedReturnBitfield1Present() && orderRestatedReturnBitfield1.orderRestatedReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRestatedReturnBitfield1Present() && orderRestatedReturnBitfield1.orderRestatedReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRestatedReturnBitfield1Present() && orderRestatedReturnBitfield1.orderRestatedReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRestatedReturnBitfield2Present() && orderRestatedReturnBitfield2.orderRestatedReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRestatedReturnBitfield2Present() && orderRestatedReturnBitfield2.orderRestatedReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3MaxFloor());
    }

    /**
     * Returns whether the fields before the OrderQtyBinary put it on the wire.
     *
     * <p>Decode reads the OrderQtyBinary where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQtyBinary is on the wire
     */
    public boolean orderQtyBinaryPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderRestatedReturnBitfield4Present() && orderRestatedReturnBitfield4.orderRestatedReturnBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the StrikePrice put it on the wire.
     *
     * <p>Decode reads the StrikePrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StrikePrice is on the wire
     */
    public boolean strikePricePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderRestatedReturnBitfield4Present() && orderRestatedReturnBitfield4.orderRestatedReturnBitfield4StrikePrice());
    }

    /**
     * Returns whether the fields before the PutOrCall put it on the wire.
     *
     * <p>Decode reads the PutOrCall where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PutOrCall is on the wire
     */
    public boolean putOrCallPresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderRestatedReturnBitfield4Present() && orderRestatedReturnBitfield4.orderRestatedReturnBitfield4PutOrCall());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderRestatedReturnBitfield4Present() && orderRestatedReturnBitfield4.orderRestatedReturnBitfield4OpenClose());
    }

    /**
     * Returns whether the fields before the CorrectedSize put it on the wire.
     *
     * <p>Decode reads the CorrectedSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CorrectedSize is on the wire
     */
    public boolean correctedSizePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderRestatedReturnBitfield4Present() && orderRestatedReturnBitfield4.orderRestatedReturnBitfield4CorrectedSize());
    }

    /**
     * Returns whether the fields before the OrigClOrdId put it on the wire.
     *
     * <p>Decode reads the OrigClOrdId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrigClOrdId is on the wire
     */
    public boolean origClOrdIdPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5OrigClOrdId());
    }

    /**
     * Returns whether the fields before the LeavesQty put it on the wire.
     *
     * <p>Decode reads the LeavesQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LeavesQty is on the wire
     */
    public boolean leavesQtyPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5LeavesQty());
    }

    /**
     * Returns whether the fields before the LastShares put it on the wire.
     *
     * <p>Decode reads the LastShares where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastShares is on the wire
     */
    public boolean lastSharesPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5LastShares());
    }

    /**
     * Returns whether the fields before the LastPx put it on the wire.
     *
     * <p>Decode reads the LastPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPx is on the wire
     */
    public boolean lastPxPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5LastPx());
    }

    /**
     * Returns whether the fields before the DisplayPrice put it on the wire.
     *
     * <p>Decode reads the DisplayPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayPrice is on the wire
     */
    public boolean displayPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5DisplayPrice());
    }

    /**
     * Returns whether the fields before the WorkingPriceBinaryPrice put it on the wire.
     *
     * <p>Decode reads the WorkingPriceBinaryPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WorkingPriceBinaryPrice is on the wire
     */
    public boolean workingPriceBinaryPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5WorkingPrice());
    }

    /**
     * Returns whether the fields before the BaseLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the BaseLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BaseLiquidityIndicator is on the wire
     */
    public boolean baseLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5BaseLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5ExpireTime());
    }

    /**
     * Returns whether the fields before the SecondaryOrderId put it on the wire.
     *
     * <p>Decode reads the SecondaryOrderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryOrderId is on the wire
     */
    public boolean secondaryOrderIdPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderRestatedReturnBitfield6Present() && orderRestatedReturnBitfield6.orderRestatedReturnBitfield6SecondaryOrderId());
    }

    /**
     * Returns whether the fields before the ContraCapacity put it on the wire.
     *
     * <p>Decode reads the ContraCapacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ContraCapacity is on the wire
     */
    public boolean contraCapacityPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderRestatedReturnBitfield6Present() && orderRestatedReturnBitfield6.orderRestatedReturnBitfield6ContraCapacity());
    }

    /**
     * Returns whether the fields before the AttributedQuote put it on the wire.
     *
     * <p>Decode reads the AttributedQuote where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AttributedQuote is on the wire
     */
    public boolean attributedQuotePresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderRestatedReturnBitfield6Present() && orderRestatedReturnBitfield6.orderRestatedReturnBitfield6AttributedQuote());
    }

    /**
     * Returns whether the fields before the EchoText put it on the wire.
     *
     * <p>Decode reads the EchoText where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EchoText is on the wire
     */
    public boolean echoTextPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRestatedReturnBitfield8Present() && orderRestatedReturnBitfield8.orderRestatedReturnBitfield8EchoText());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRestatedReturnBitfield8Present() && orderRestatedReturnBitfield8.orderRestatedReturnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRestatedReturnBitfield8Present() && orderRestatedReturnBitfield8.orderRestatedReturnBitfield8RoutingInst());
    }

    /**
     * Returns whether the fields before the RoutStrategy put it on the wire.
     *
     * <p>Decode reads the RoutStrategy where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutStrategy is on the wire
     */
    public boolean routStrategyPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRestatedReturnBitfield8Present() && orderRestatedReturnBitfield8.orderRestatedReturnBitfield8RoutStrategy());
    }

    /**
     * Returns whether the fields before the RouteDeliveryMethod put it on the wire.
     *
     * <p>Decode reads the RouteDeliveryMethod where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RouteDeliveryMethod is on the wire
     */
    public boolean routeDeliveryMethodPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRestatedReturnBitfield8Present() && orderRestatedReturnBitfield8.orderRestatedReturnBitfield8RouteDeliveryMethod());
    }

    /**
     * Returns whether the fields before the ExDestination put it on the wire.
     *
     * <p>Decode reads the ExDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExDestination is on the wire
     */
    public boolean exDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRestatedReturnBitfield8Present() && orderRestatedReturnBitfield8.orderRestatedReturnBitfield8ExDestination());
    }

    /**
     * Returns whether the fields before the MarketingFeeCode put it on the wire.
     *
     * <p>Decode reads the MarketingFeeCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketingFeeCode is on the wire
     */
    public boolean marketingFeeCodePresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderRestatedReturnBitfield9Present() && orderRestatedReturnBitfield9.orderRestatedReturnBitfield9MarketingFeeCode());
    }

    /**
     * Returns whether the fields before the TargetPartyId put it on the wire.
     *
     * <p>Decode reads the TargetPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TargetPartyId is on the wire
     */
    public boolean targetPartyIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderRestatedReturnBitfield9Present() && orderRestatedReturnBitfield9.orderRestatedReturnBitfield9TargetPartyId());
    }

    /**
     * Returns whether the fields before the AuctionId put it on the wire.
     *
     * <p>Decode reads the AuctionId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AuctionId is on the wire
     */
    public boolean auctionIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderRestatedReturnBitfield9Present() && orderRestatedReturnBitfield9.orderRestatedReturnBitfield9AuctionId());
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderRestatedReturnBitfield9Present() && orderRestatedReturnBitfield9.orderRestatedReturnBitfield9CmtaNumber());
    }

    /**
     * Returns whether the fields before the CrossId put it on the wire.
     *
     * <p>Decode reads the CrossId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossId is on the wire
     */
    public boolean crossIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderRestatedReturnBitfield10Present() && orderRestatedReturnBitfield10.orderRestatedReturnBitfield10CrossId());
    }

    /**
     * Returns whether the fields before the AllocQty put it on the wire.
     *
     * <p>Decode reads the AllocQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AllocQty is on the wire
     */
    public boolean allocQtyPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderRestatedReturnBitfield10Present() && orderRestatedReturnBitfield10.orderRestatedReturnBitfield10AllocQty());
    }

    /**
     * Returns whether the fields before the GiveUpFirmId put it on the wire.
     *
     * <p>Decode reads the GiveUpFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the GiveUpFirmId is on the wire
     */
    public boolean giveUpFirmIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderRestatedReturnBitfield10Present() && orderRestatedReturnBitfield10.orderRestatedReturnBitfield10GiveUpFirmId());
    }

    /**
     * Returns whether the fields before the RoutingFirmId put it on the wire.
     *
     * <p>Decode reads the RoutingFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingFirmId is on the wire
     */
    public boolean routingFirmIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderRestatedReturnBitfield10Present() && orderRestatedReturnBitfield10.orderRestatedReturnBitfield10RoutingFirmId());
    }

    /**
     * Returns whether the fields before the CrossExclusionIndicator put it on the wire.
     *
     * <p>Decode reads the CrossExclusionIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossExclusionIndicator is on the wire
     */
    public boolean crossExclusionIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderRestatedReturnBitfield10Present() && orderRestatedReturnBitfield10.orderRestatedReturnBitfield10CrossExclusionIndicator());
    }

    /**
     * Returns whether the fields before the ClientIdAttr put it on the wire.
     *
     * <p>Decode reads the ClientIdAttr where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientIdAttr is on the wire
     */
    public boolean clientIdAttrPresent() {
        return (numberOfReturnBitfields.value() >= 15L) && (orderRestatedReturnBitfield15Present() && orderRestatedReturnBitfield15.orderRestatedReturnBitfield15ClientIdAttr());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRestatedReturnBitfield16Present() && orderRestatedReturnBitfield16.orderRestatedReturnBitfield16FrequentTraderId());
    }

    /**
     * Returns whether the fields before the ComboOrder put it on the wire.
     *
     * <p>Decode reads the ComboOrder where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComboOrder is on the wire
     */
    public boolean comboOrderPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRestatedReturnBitfield16Present() && orderRestatedReturnBitfield16.orderRestatedReturnBitfield16ComboOrder());
    }

    /**
     * Returns whether the fields before the Compression put it on the wire.
     *
     * <p>Decode reads the Compression where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Compression is on the wire
     */
    public boolean compressionPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRestatedReturnBitfield16Present() && orderRestatedReturnBitfield16.orderRestatedReturnBitfield16Compression());
    }

    /**
     * Returns whether the fields before the FloorDestination put it on the wire.
     *
     * <p>Decode reads the FloorDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FloorDestination is on the wire
     */
    public boolean floorDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRestatedReturnBitfield16Present() && orderRestatedReturnBitfield16.orderRestatedReturnBitfield16FloorDestination());
    }

    /**
     * Returns whether the fields before the FloorRoutingInst put it on the wire.
     *
     * <p>Decode reads the FloorRoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FloorRoutingInst is on the wire
     */
    public boolean floorRoutingInstPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRestatedReturnBitfield16Present() && orderRestatedReturnBitfield16.orderRestatedReturnBitfield16FloorRoutingInst());
    }

    /**
     * Returns whether the fields before the MultiClassSprd put it on the wire.
     *
     * <p>Decode reads the MultiClassSprd where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MultiClassSprd is on the wire
     */
    public boolean multiClassSprdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRestatedReturnBitfield16Present() && orderRestatedReturnBitfield16.orderRestatedReturnBitfield16MultiClassSprd());
    }

    /**
     * Returns whether the fields before the OrderOrigin put it on the wire.
     *
     * <p>Decode reads the OrderOrigin where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigin is on the wire
     */
    public boolean orderOriginPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRestatedReturnBitfield16Present() && orderRestatedReturnBitfield16.orderRestatedReturnBitfield16OrderOrigin());
    }

    /**
     * Returns whether the fields before the PriceType put it on the wire.
     *
     * <p>Decode reads the PriceType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceType is on the wire
     */
    public boolean priceTypePresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderRestatedReturnBitfield17Present() && orderRestatedReturnBitfield17.orderRestatedReturnBitfield17PriceType());
    }

    /**
     * Returns whether the fields before the StrategyId put it on the wire.
     *
     * <p>Decode reads the StrategyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StrategyId is on the wire
     */
    public boolean strategyIdPresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderRestatedReturnBitfield17Present() && orderRestatedReturnBitfield17.orderRestatedReturnBitfield17StrategyId());
    }

    /**
     * Returns whether the fields before the Held put it on the wire.
     *
     * <p>Decode reads the Held where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Held is on the wire
     */
    public boolean heldPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderRestatedReturnBitfield18Present() && orderRestatedReturnBitfield18.orderRestatedReturnBitfield18Held());
    }

    /**
     * Returns whether the fields before the StopPxType put it on the wire.
     *
     * <p>Decode reads the StopPxType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPxType is on the wire
     */
    public boolean stopPxTypePresent() {
        return (numberOfReturnBitfields.value() >= 19L) && (orderRestatedReturnBitfield19Present() && orderRestatedReturnBitfield19.orderRestatedReturnBitfield19StopPxType());
    }

    private boolean onWire(Field field) {
        return (field != orderRestatedReturnBitfield1 || orderRestatedReturnBitfield1Present()) && (field != orderRestatedReturnBitfield2 || orderRestatedReturnBitfield2Present()) && (field != orderRestatedReturnBitfield3 || orderRestatedReturnBitfield3Present()) && (field != orderRestatedReturnBitfield4 || orderRestatedReturnBitfield4Present()) && (field != orderRestatedReturnBitfield5 || orderRestatedReturnBitfield5Present()) && (field != orderRestatedReturnBitfield6 || orderRestatedReturnBitfield6Present()) && (field != orderRestatedReturnBitfield7 || orderRestatedReturnBitfield7Present()) && (field != orderRestatedReturnBitfield8 || orderRestatedReturnBitfield8Present()) && (field != orderRestatedReturnBitfield9 || orderRestatedReturnBitfield9Present()) && (field != orderRestatedReturnBitfield10 || orderRestatedReturnBitfield10Present()) && (field != orderRestatedReturnBitfield11 || orderRestatedReturnBitfield11Present()) && (field != orderRestatedReturnBitfield12 || orderRestatedReturnBitfield12Present()) && (field != orderRestatedReturnBitfield13 || orderRestatedReturnBitfield13Present()) && (field != orderRestatedReturnBitfield14 || orderRestatedReturnBitfield14Present()) && (field != orderRestatedReturnBitfield15 || orderRestatedReturnBitfield15Present()) && (field != orderRestatedReturnBitfield16 || orderRestatedReturnBitfield16Present()) && (field != orderRestatedReturnBitfield17 || orderRestatedReturnBitfield17Present()) && (field != orderRestatedReturnBitfield18 || orderRestatedReturnBitfield18Present()) && (field != orderRestatedReturnBitfield19 || orderRestatedReturnBitfield19Present()) && (field != side || sidePresent()) && (field != priceBinaryPrice || priceBinaryPricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != maxFloor || maxFloorPresent()) && (field != orderQtyBinary || orderQtyBinaryPresent()) && (field != preventMatch || preventMatchPresent()) && (field != maturityDate || maturityDatePresent()) && (field != strikePrice || strikePricePresent()) && (field != putOrCall || putOrCallPresent()) && (field != openClose || openClosePresent()) && (field != correctedSize || correctedSizePresent()) && (field != origClOrdId || origClOrdIdPresent()) && (field != leavesQty || leavesQtyPresent()) && (field != lastShares || lastSharesPresent()) && (field != lastPx || lastPxPresent()) && (field != displayPrice || displayPricePresent()) && (field != workingPriceBinaryPrice || workingPriceBinaryPricePresent()) && (field != baseLiquidityIndicator || baseLiquidityIndicatorPresent()) && (field != expireTime || expireTimePresent()) && (field != secondaryOrderId || secondaryOrderIdPresent()) && (field != contraCapacity || contraCapacityPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != echoText || echoTextPresent()) && (field != stopPx || stopPxPresent()) && (field != routingInst || routingInstPresent()) && (field != routStrategy || routStrategyPresent()) && (field != routeDeliveryMethod || routeDeliveryMethodPresent()) && (field != exDestination || exDestinationPresent()) && (field != marketingFeeCode || marketingFeeCodePresent()) && (field != targetPartyId || targetPartyIdPresent()) && (field != auctionId || auctionIdPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != crossId || crossIdPresent()) && (field != allocQty || allocQtyPresent()) && (field != giveUpFirmId || giveUpFirmIdPresent()) && (field != routingFirmId || routingFirmIdPresent()) && (field != crossExclusionIndicator || crossExclusionIndicatorPresent()) && (field != clientIdAttr || clientIdAttrPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != comboOrder || comboOrderPresent()) && (field != compression || compressionPresent()) && (field != floorDestination || floorDestinationPresent()) && (field != floorRoutingInst || floorRoutingInstPresent()) && (field != multiClassSprd || multiClassSprdPresent()) && (field != orderOrigin || orderOriginPresent()) && (field != priceType || priceTypePresent()) && (field != strategyId || strategyIdPresent()) && (field != held || heldPresent()) && (field != stopPxType || stopPxTypePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderRestatedReturnBitfield1Present() ? OrderRestatedReturnBitfield1Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield2Present() ? OrderRestatedReturnBitfield2Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield3Present() ? OrderRestatedReturnBitfield3Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield4Present() ? OrderRestatedReturnBitfield4Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield5Present() ? OrderRestatedReturnBitfield5Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield6Present() ? OrderRestatedReturnBitfield6Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield7Present() ? OrderRestatedReturnBitfield7Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield8Present() ? OrderRestatedReturnBitfield8Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield9Present() ? OrderRestatedReturnBitfield9Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield10Present() ? OrderRestatedReturnBitfield10Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield11Present() ? OrderRestatedReturnBitfield11Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield12Present() ? OrderRestatedReturnBitfield12Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield13Present() ? OrderRestatedReturnBitfield13Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield14Present() ? OrderRestatedReturnBitfield14Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield15Present() ? OrderRestatedReturnBitfield15Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield16Present() ? OrderRestatedReturnBitfield16Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield17Present() ? OrderRestatedReturnBitfield17Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield18Present() ? OrderRestatedReturnBitfield18Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield19Present() ? OrderRestatedReturnBitfield19Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (priceBinaryPricePresent() ? PriceBinaryPriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (orderQtyBinaryPresent() ? OrderQtyBinaryField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (strikePricePresent() ? StrikePriceField.BYTE_LENGTH : 0) + (putOrCallPresent() ? PutOrCallField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (correctedSizePresent() ? CorrectedSizeField.BYTE_LENGTH : 0) + (origClOrdIdPresent() ? OrigClOrdIdField.BYTE_LENGTH : 0) + (leavesQtyPresent() ? LeavesQtyField.BYTE_LENGTH : 0) + (lastSharesPresent() ? LastSharesField.BYTE_LENGTH : 0) + (lastPxPresent() ? LastPxField.BYTE_LENGTH : 0) + (displayPricePresent() ? DisplayPriceField.BYTE_LENGTH : 0) + (workingPriceBinaryPricePresent() ? WorkingPriceBinaryPriceField.BYTE_LENGTH : 0) + (baseLiquidityIndicatorPresent() ? BaseLiquidityIndicatorField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (secondaryOrderIdPresent() ? SecondaryOrderIdField.BYTE_LENGTH : 0) + (contraCapacityPresent() ? ContraCapacityField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (routStrategyPresent() ? RoutStrategyField.BYTE_LENGTH : 0) + (routeDeliveryMethodPresent() ? RouteDeliveryMethodField.BYTE_LENGTH : 0) + (exDestinationPresent() ? ExDestinationField.BYTE_LENGTH : 0) + (marketingFeeCodePresent() ? MarketingFeeCodeField.BYTE_LENGTH : 0) + (targetPartyIdPresent() ? TargetPartyIdField.BYTE_LENGTH : 0) + (auctionIdPresent() ? AuctionIdField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (crossIdPresent() ? CrossIdField.BYTE_LENGTH : 0) + (allocQtyPresent() ? AllocQtyField.BYTE_LENGTH : 0) + (giveUpFirmIdPresent() ? GiveUpFirmIdField.BYTE_LENGTH : 0) + (routingFirmIdPresent() ? RoutingFirmIdField.BYTE_LENGTH : 0) + (crossExclusionIndicatorPresent() ? CrossExclusionIndicatorField.BYTE_LENGTH : 0) + (clientIdAttrPresent() ? ClientIdAttrField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (comboOrderPresent() ? ComboOrderField.BYTE_LENGTH : 0) + (compressionPresent() ? CompressionField.BYTE_LENGTH : 0) + (floorDestinationPresent() ? FloorDestinationField.BYTE_LENGTH : 0) + (floorRoutingInstPresent() ? FloorRoutingInstField.BYTE_LENGTH : 0) + (multiClassSprdPresent() ? MultiClassSprdField.BYTE_LENGTH : 0) + (orderOriginPresent() ? OrderOriginField.BYTE_LENGTH : 0) + (priceTypePresent() ? PriceTypeField.BYTE_LENGTH : 0) + (strategyIdPresent() ? StrategyIdField.BYTE_LENGTH : 0) + (heldPresent() ? HeldField.BYTE_LENGTH : 0) + (stopPxTypePresent() ? StopPxTypeField.BYTE_LENGTH : 0);
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
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (orderRestatedReturnBitfield1Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield2Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield3Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield4Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield5Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield6Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield7Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield8Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield9Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield10Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield11Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield12Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield13Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield14Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield15Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield16Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield17Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield18Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield19Present()) {
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
        if (workingPriceBinaryPricePresent()) {
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
        if (clientIdAttrPresent()) {
            cursor += 4;
        }
        if (frequentTraderIdPresent()) {
            cursor += 6;
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
        if (heldPresent()) {
            cursor += 1;
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
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!restatementReason.parse(data, cursor)) {
            return false;
        }
        cursor += RestatementReasonField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (orderRestatedReturnBitfield1Present()) {
            if (end - cursor < OrderRestatedReturnBitfield1Field.BYTE_LENGTH || !orderRestatedReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield2Present()) {
            if (end - cursor < OrderRestatedReturnBitfield2Field.BYTE_LENGTH || !orderRestatedReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield3Present()) {
            if (end - cursor < OrderRestatedReturnBitfield3Field.BYTE_LENGTH || !orderRestatedReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield4Present()) {
            if (end - cursor < OrderRestatedReturnBitfield4Field.BYTE_LENGTH || !orderRestatedReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield5Present()) {
            if (end - cursor < OrderRestatedReturnBitfield5Field.BYTE_LENGTH || !orderRestatedReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield6Present()) {
            if (end - cursor < OrderRestatedReturnBitfield6Field.BYTE_LENGTH || !orderRestatedReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield7Present()) {
            if (end - cursor < OrderRestatedReturnBitfield7Field.BYTE_LENGTH || !orderRestatedReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield8Present()) {
            if (end - cursor < OrderRestatedReturnBitfield8Field.BYTE_LENGTH || !orderRestatedReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield9Present()) {
            if (end - cursor < OrderRestatedReturnBitfield9Field.BYTE_LENGTH || !orderRestatedReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield10Present()) {
            if (end - cursor < OrderRestatedReturnBitfield10Field.BYTE_LENGTH || !orderRestatedReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield11Present()) {
            if (end - cursor < OrderRestatedReturnBitfield11Field.BYTE_LENGTH || !orderRestatedReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield12Present()) {
            if (end - cursor < OrderRestatedReturnBitfield12Field.BYTE_LENGTH || !orderRestatedReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield13Present()) {
            if (end - cursor < OrderRestatedReturnBitfield13Field.BYTE_LENGTH || !orderRestatedReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield14Present()) {
            if (end - cursor < OrderRestatedReturnBitfield14Field.BYTE_LENGTH || !orderRestatedReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield15Present()) {
            if (end - cursor < OrderRestatedReturnBitfield15Field.BYTE_LENGTH || !orderRestatedReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield16Present()) {
            if (end - cursor < OrderRestatedReturnBitfield16Field.BYTE_LENGTH || !orderRestatedReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield17Present()) {
            if (end - cursor < OrderRestatedReturnBitfield17Field.BYTE_LENGTH || !orderRestatedReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield18Present()) {
            if (end - cursor < OrderRestatedReturnBitfield18Field.BYTE_LENGTH || !orderRestatedReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield19Present()) {
            if (end - cursor < OrderRestatedReturnBitfield19Field.BYTE_LENGTH || !orderRestatedReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield19Field.BYTE_LENGTH;
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
        if (workingPriceBinaryPricePresent()) {
            if (end - cursor < WorkingPriceBinaryPriceField.BYTE_LENGTH || !workingPriceBinaryPrice.parse(data, cursor)) {
                return false;
            }
            cursor += WorkingPriceBinaryPriceField.BYTE_LENGTH;
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
        if (heldPresent()) {
            if (end - cursor < HeldField.BYTE_LENGTH || !held.parse(data, cursor)) {
                return false;
            }
            cursor += HeldField.BYTE_LENGTH;
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
        if (orderRestatedReturnBitfield1Present() != orderRestatedReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield1.hasValue() ? "orderRestatedReturnBitfield1 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield2Present() != orderRestatedReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield2.hasValue() ? "orderRestatedReturnBitfield2 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield3Present() != orderRestatedReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield3.hasValue() ? "orderRestatedReturnBitfield3 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield4Present() != orderRestatedReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield4.hasValue() ? "orderRestatedReturnBitfield4 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield5Present() != orderRestatedReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield5.hasValue() ? "orderRestatedReturnBitfield5 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield6Present() != orderRestatedReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield6.hasValue() ? "orderRestatedReturnBitfield6 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield7Present() != orderRestatedReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield7.hasValue() ? "orderRestatedReturnBitfield7 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield8Present() != orderRestatedReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield8.hasValue() ? "orderRestatedReturnBitfield8 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield9Present() != orderRestatedReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield9.hasValue() ? "orderRestatedReturnBitfield9 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield10Present() != orderRestatedReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield10.hasValue() ? "orderRestatedReturnBitfield10 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield11Present() != orderRestatedReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield11.hasValue() ? "orderRestatedReturnBitfield11 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield12Present() != orderRestatedReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield12.hasValue() ? "orderRestatedReturnBitfield12 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield13Present() != orderRestatedReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield13.hasValue() ? "orderRestatedReturnBitfield13 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield14Present() != orderRestatedReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield14.hasValue() ? "orderRestatedReturnBitfield14 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield15Present() != orderRestatedReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield15.hasValue() ? "orderRestatedReturnBitfield15 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield16Present() != orderRestatedReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield16.hasValue() ? "orderRestatedReturnBitfield16 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield17Present() != orderRestatedReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield17.hasValue() ? "orderRestatedReturnBitfield17 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield18Present() != orderRestatedReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield18.hasValue() ? "orderRestatedReturnBitfield18 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield19Present() != orderRestatedReturnBitfield19.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield19.hasValue() ? "orderRestatedReturnBitfield19 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield19 holds no value, though the fields before it put it on the wire");
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
        if (workingPriceBinaryPricePresent() != workingPriceBinaryPrice.hasValue()) {
            throw new IllegalStateException(workingPriceBinaryPrice.hasValue() ? "workingPriceBinaryPrice holds a value the fields before it leave off the wire" : "workingPriceBinaryPrice holds no value, though the fields before it put it on the wire");
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
        if (clientIdAttrPresent() != clientIdAttr.hasValue()) {
            throw new IllegalStateException(clientIdAttr.hasValue() ? "clientIdAttr holds a value the fields before it leave off the wire" : "clientIdAttr holds no value, though the fields before it put it on the wire");
        }
        if (frequentTraderIdPresent() != frequentTraderId.hasValue()) {
            throw new IllegalStateException(frequentTraderId.hasValue() ? "frequentTraderId holds a value the fields before it leave off the wire" : "frequentTraderId holds no value, though the fields before it put it on the wire");
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
        if (heldPresent() != held.hasValue()) {
            throw new IllegalStateException(held.hasValue() ? "held holds a value the fields before it leave off the wire" : "held holds no value, though the fields before it put it on the wire");
        }
        if (stopPxTypePresent() != stopPxType.hasValue()) {
            throw new IllegalStateException(stopPxType.hasValue() ? "stopPxType holds a value the fields before it leave off the wire" : "stopPxType holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = restatementReason.encode(data, cursor);
        if (buffer != null && buffer.length >= 38) {
            System.arraycopy(buffer, 37, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (orderRestatedReturnBitfield1Present()) {
            cursor = orderRestatedReturnBitfield1.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield2Present()) {
            cursor = orderRestatedReturnBitfield2.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield3Present()) {
            cursor = orderRestatedReturnBitfield3.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield4Present()) {
            cursor = orderRestatedReturnBitfield4.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield5Present()) {
            cursor = orderRestatedReturnBitfield5.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield6Present()) {
            cursor = orderRestatedReturnBitfield6.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield7Present()) {
            cursor = orderRestatedReturnBitfield7.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield8Present()) {
            cursor = orderRestatedReturnBitfield8.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield9Present()) {
            cursor = orderRestatedReturnBitfield9.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield10Present()) {
            cursor = orderRestatedReturnBitfield10.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield11Present()) {
            cursor = orderRestatedReturnBitfield11.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield12Present()) {
            cursor = orderRestatedReturnBitfield12.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield13Present()) {
            cursor = orderRestatedReturnBitfield13.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield14Present()) {
            cursor = orderRestatedReturnBitfield14.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield15Present()) {
            cursor = orderRestatedReturnBitfield15.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield16Present()) {
            cursor = orderRestatedReturnBitfield16.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield17Present()) {
            cursor = orderRestatedReturnBitfield17.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield18Present()) {
            cursor = orderRestatedReturnBitfield18.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield19Present()) {
            cursor = orderRestatedReturnBitfield19.encode(data, cursor);
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
        if (workingPriceBinaryPricePresent()) {
            cursor = workingPriceBinaryPrice.encode(data, cursor);
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
        if (clientIdAttrPresent()) {
            cursor = clientIdAttr.encode(data, cursor);
        }
        if (frequentTraderIdPresent()) {
            cursor = frequentTraderId.encode(data, cursor);
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
        if (heldPresent()) {
            cursor = held.encode(data, cursor);
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
            case "OrderId" -> Optional.of(orderId);
            case "RestatementReason" -> Optional.of(restatementReason);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "OrderRestatedReturnBitfield1" -> Optional.of(orderRestatedReturnBitfield1);
            case "OrderRestatedReturnBitfield2" -> Optional.of(orderRestatedReturnBitfield2);
            case "OrderRestatedReturnBitfield3" -> Optional.of(orderRestatedReturnBitfield3);
            case "OrderRestatedReturnBitfield4" -> Optional.of(orderRestatedReturnBitfield4);
            case "OrderRestatedReturnBitfield5" -> Optional.of(orderRestatedReturnBitfield5);
            case "OrderRestatedReturnBitfield6" -> Optional.of(orderRestatedReturnBitfield6);
            case "OrderRestatedReturnBitfield7" -> Optional.of(orderRestatedReturnBitfield7);
            case "OrderRestatedReturnBitfield8" -> Optional.of(orderRestatedReturnBitfield8);
            case "OrderRestatedReturnBitfield9" -> Optional.of(orderRestatedReturnBitfield9);
            case "OrderRestatedReturnBitfield10" -> Optional.of(orderRestatedReturnBitfield10);
            case "OrderRestatedReturnBitfield11" -> Optional.of(orderRestatedReturnBitfield11);
            case "OrderRestatedReturnBitfield12" -> Optional.of(orderRestatedReturnBitfield12);
            case "OrderRestatedReturnBitfield13" -> Optional.of(orderRestatedReturnBitfield13);
            case "OrderRestatedReturnBitfield14" -> Optional.of(orderRestatedReturnBitfield14);
            case "OrderRestatedReturnBitfield15" -> Optional.of(orderRestatedReturnBitfield15);
            case "OrderRestatedReturnBitfield16" -> Optional.of(orderRestatedReturnBitfield16);
            case "OrderRestatedReturnBitfield17" -> Optional.of(orderRestatedReturnBitfield17);
            case "OrderRestatedReturnBitfield18" -> Optional.of(orderRestatedReturnBitfield18);
            case "OrderRestatedReturnBitfield19" -> Optional.of(orderRestatedReturnBitfield19);
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
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPx" -> Optional.of(lastPx);
            case "DisplayPrice" -> Optional.of(displayPrice);
            case "WorkingPriceBinaryPrice" -> Optional.of(workingPriceBinaryPrice);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "ExpireTime" -> Optional.of(expireTime);
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
            case "ClientIdAttr" -> Optional.of(clientIdAttr);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "ComboOrder" -> Optional.of(comboOrder);
            case "Compression" -> Optional.of(compression);
            case "FloorDestination" -> Optional.of(floorDestination);
            case "FloorRoutingInst" -> Optional.of(floorRoutingInst);
            case "MultiClassSprd" -> Optional.of(multiClassSprd);
            case "OrderOrigin" -> Optional.of(orderOrigin);
            case "PriceType" -> Optional.of(priceType);
            case "StrategyId" -> Optional.of(strategyId);
            case "Held" -> Optional.of(held);
            case "StopPxType" -> Optional.of(stopPxType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderRestatedMessage message)) {
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
        if (!(other instanceof OrderRestatedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
