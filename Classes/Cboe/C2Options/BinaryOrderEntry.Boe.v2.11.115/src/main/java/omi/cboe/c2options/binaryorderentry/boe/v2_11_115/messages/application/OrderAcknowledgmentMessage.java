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
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ClearingOptionalDataField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ClientIdAttrField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CmtaNumberField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ComboOrderField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CompressionField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ContraCapacityField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CorrectedSizeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossExclusionIndicatorField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossInitiatorField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOnBehalfOfIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.DisplayIndicatorField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.DisplayPriceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.DrillThruProtectionField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.EchoTextField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.EquityPartyIdField;
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
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.NumberOfReturnBitfField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.NumberOfReturnBitfieldsField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OpenCloseField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrdTypeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield10Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield11Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield12Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield13Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield14Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield15Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield16Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield17Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield18Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield19Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield1Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield20Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield21Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield2Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield3Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield4Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield5Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield6Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield7Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield8Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderAcknowledgmentReturnBitfield9Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderOriginField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderQtyBinaryField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrigClOrdIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.PreventMatchField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.PriceBinaryPriceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.PriceTypeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.PutOrCallField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.RoutStrategyField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.RouteDeliveryMethodField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.RoutingFirmIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.RoutingInstField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.SecondaryOrderIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.SessionEligibilityField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.SideField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.StopPxField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.StopPxTypeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.StrategyIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.StrikePriceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.SubLiquidityIndicatorField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.SymbolAlphanumericField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.TargetPartyIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.TimeInForceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.TransactionTimeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.WorkingPriceBinaryPriceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.types.Message;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * Represents the OrderAcknowledgmentMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Order Acknowledgment Message.</p>
 */
public final class OrderAcknowledgmentMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Acknowledgment Message";

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
     * Number of bitfields to follow.
     */
    private final NumberOfReturnBitfField numberOfReturnBitf = new NumberOfReturnBitfField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderAcknowledgment byte 1.
     */
    private final OrderAcknowledgmentReturnBitfield1Field orderAcknowledgmentReturnBitfield1 = new OrderAcknowledgmentReturnBitfield1Field();

    /**
     * BitSet OrderAcknowledgment byte 2.
     */
    private final OrderAcknowledgmentReturnBitfield2Field orderAcknowledgmentReturnBitfield2 = new OrderAcknowledgmentReturnBitfield2Field();

    /**
     * BitSet OrderAcknowledgment byte 3.
     */
    private final OrderAcknowledgmentReturnBitfield3Field orderAcknowledgmentReturnBitfield3 = new OrderAcknowledgmentReturnBitfield3Field();

    /**
     * BitSet OrderAcknowledgment byte 4.
     */
    private final OrderAcknowledgmentReturnBitfield4Field orderAcknowledgmentReturnBitfield4 = new OrderAcknowledgmentReturnBitfield4Field();

    /**
     * BitSet OrderAcknowledgment byte 5.
     */
    private final OrderAcknowledgmentReturnBitfield5Field orderAcknowledgmentReturnBitfield5 = new OrderAcknowledgmentReturnBitfield5Field();

    /**
     * BitSet OrderAcknowledgment byte 6.
     */
    private final OrderAcknowledgmentReturnBitfield6Field orderAcknowledgmentReturnBitfield6 = new OrderAcknowledgmentReturnBitfield6Field();

    /**
     * BitSet OrderAcknowledgment byte 7.
     */
    private final OrderAcknowledgmentReturnBitfield7Field orderAcknowledgmentReturnBitfield7 = new OrderAcknowledgmentReturnBitfield7Field();

    /**
     * BitSet OrderAcknowledgment byte 8.
     */
    private final OrderAcknowledgmentReturnBitfield8Field orderAcknowledgmentReturnBitfield8 = new OrderAcknowledgmentReturnBitfield8Field();

    /**
     * BitSet OrderAcknowledgment byte 9.
     */
    private final OrderAcknowledgmentReturnBitfield9Field orderAcknowledgmentReturnBitfield9 = new OrderAcknowledgmentReturnBitfield9Field();

    /**
     * BitSet OrderAcknowledgment byte 10.
     */
    private final OrderAcknowledgmentReturnBitfield10Field orderAcknowledgmentReturnBitfield10 = new OrderAcknowledgmentReturnBitfield10Field();

    /**
     * BitSet OrderAcknowledgment byte 11.
     */
    private final OrderAcknowledgmentReturnBitfield11Field orderAcknowledgmentReturnBitfield11 = new OrderAcknowledgmentReturnBitfield11Field();

    /**
     * BitSet OrderAcknowledgment byte 12.
     */
    private final OrderAcknowledgmentReturnBitfield12Field orderAcknowledgmentReturnBitfield12 = new OrderAcknowledgmentReturnBitfield12Field();

    /**
     * BitSet OrderAcknowledgment byte 13.
     */
    private final OrderAcknowledgmentReturnBitfield13Field orderAcknowledgmentReturnBitfield13 = new OrderAcknowledgmentReturnBitfield13Field();

    /**
     * BitSet OrderAcknowledgment byte 14.
     */
    private final OrderAcknowledgmentReturnBitfield14Field orderAcknowledgmentReturnBitfield14 = new OrderAcknowledgmentReturnBitfield14Field();

    /**
     * BitSet OrderAcknowledgment byte 15.
     */
    private final OrderAcknowledgmentReturnBitfield15Field orderAcknowledgmentReturnBitfield15 = new OrderAcknowledgmentReturnBitfield15Field();

    /**
     * BitSet OrderAcknowledgment byte 16.
     */
    private final OrderAcknowledgmentReturnBitfield16Field orderAcknowledgmentReturnBitfield16 = new OrderAcknowledgmentReturnBitfield16Field();

    /**
     * BitSet OrderAcknowledgment byte 17.
     */
    private final OrderAcknowledgmentReturnBitfield17Field orderAcknowledgmentReturnBitfield17 = new OrderAcknowledgmentReturnBitfield17Field();

    /**
     * BitSet OrderAcknowledgment byte 18.
     */
    private final OrderAcknowledgmentReturnBitfield18Field orderAcknowledgmentReturnBitfield18 = new OrderAcknowledgmentReturnBitfield18Field();

    /**
     * BitSet OrderAcknowledgment byte 19.
     */
    private final OrderAcknowledgmentReturnBitfield19Field orderAcknowledgmentReturnBitfield19 = new OrderAcknowledgmentReturnBitfield19Field();

    /**
     * BitSet OrderAcknowledgment byte 20.
     */
    private final OrderAcknowledgmentReturnBitfield20Field orderAcknowledgmentReturnBitfield20 = new OrderAcknowledgmentReturnBitfield20Field();

    /**
     * BitSet OrderAcknowledgment byte 21.
     */
    private final OrderAcknowledgmentReturnBitfield21Field orderAcknowledgmentReturnBitfield21 = new OrderAcknowledgmentReturnBitfield21Field();

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
     * Cross Initiator
     */
    private final CrossInitiatorField crossInitiator = new CrossInitiatorField();

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
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderId, numberOfReturnBitf, numberOfReturnBitfields, orderAcknowledgmentReturnBitfield1, orderAcknowledgmentReturnBitfield2, orderAcknowledgmentReturnBitfield3, orderAcknowledgmentReturnBitfield4, orderAcknowledgmentReturnBitfield5, orderAcknowledgmentReturnBitfield6, orderAcknowledgmentReturnBitfield7, orderAcknowledgmentReturnBitfield8, orderAcknowledgmentReturnBitfield9, orderAcknowledgmentReturnBitfield10, orderAcknowledgmentReturnBitfield11, orderAcknowledgmentReturnBitfield12, orderAcknowledgmentReturnBitfield13, orderAcknowledgmentReturnBitfield14, orderAcknowledgmentReturnBitfield15, orderAcknowledgmentReturnBitfield16, orderAcknowledgmentReturnBitfield17, orderAcknowledgmentReturnBitfield18, orderAcknowledgmentReturnBitfield19, orderAcknowledgmentReturnBitfield20, orderAcknowledgmentReturnBitfield21, side, priceBinaryPrice, execInst, ordType, timeInForce, minQty, symbolAlphanumeric, capacity, account, clearingFirm, clearingAccount, displayIndicator, maxFloor, orderQtyBinary, preventMatch, maturityDate, strikePrice, putOrCall, openClose, correctedSize, origClOrdId, leavesQty, lastShares, lastPx, displayPrice, workingPriceBinaryPrice, baseLiquidityIndicator, expireTime, secondaryOrderId, contraCapacity, attributedQuote, subLiquidityIndicator, echoText, stopPx, routingInst, routStrategy, routeDeliveryMethod, exDestination, marketingFeeCode, targetPartyId, auctionId, cmtaNumber, crossId, allocQty, giveUpFirmId, routingFirmId, crossExclusionIndicator, clearingOptionalData, drillThruProtection, equityPartyId, clientIdAttr, frequentTraderId, sessionEligibility, comboOrder, compression, floorDestination, floorRoutingInst, multiClassSprd, orderOrigin, priceType, strategyId, crossInitiator, held, crossOnBehalfOfId, stopPxType);

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
     * Number of bitfields to follow.
     *
     * @return the NumberOfReturnBitf field
     */
    public NumberOfReturnBitfField numberOfReturnBitf() {
        return numberOfReturnBitf;
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
     * BitSet OrderAcknowledgment byte 1.
     *
     * @return the OrderAcknowledgmentReturnBitfield1 field
     */
    public OrderAcknowledgmentReturnBitfield1Field orderAcknowledgmentReturnBitfield1() {
        return orderAcknowledgmentReturnBitfield1;
    }

    /**
     * BitSet OrderAcknowledgment byte 2.
     *
     * @return the OrderAcknowledgmentReturnBitfield2 field
     */
    public OrderAcknowledgmentReturnBitfield2Field orderAcknowledgmentReturnBitfield2() {
        return orderAcknowledgmentReturnBitfield2;
    }

    /**
     * BitSet OrderAcknowledgment byte 3.
     *
     * @return the OrderAcknowledgmentReturnBitfield3 field
     */
    public OrderAcknowledgmentReturnBitfield3Field orderAcknowledgmentReturnBitfield3() {
        return orderAcknowledgmentReturnBitfield3;
    }

    /**
     * BitSet OrderAcknowledgment byte 4.
     *
     * @return the OrderAcknowledgmentReturnBitfield4 field
     */
    public OrderAcknowledgmentReturnBitfield4Field orderAcknowledgmentReturnBitfield4() {
        return orderAcknowledgmentReturnBitfield4;
    }

    /**
     * BitSet OrderAcknowledgment byte 5.
     *
     * @return the OrderAcknowledgmentReturnBitfield5 field
     */
    public OrderAcknowledgmentReturnBitfield5Field orderAcknowledgmentReturnBitfield5() {
        return orderAcknowledgmentReturnBitfield5;
    }

    /**
     * BitSet OrderAcknowledgment byte 6.
     *
     * @return the OrderAcknowledgmentReturnBitfield6 field
     */
    public OrderAcknowledgmentReturnBitfield6Field orderAcknowledgmentReturnBitfield6() {
        return orderAcknowledgmentReturnBitfield6;
    }

    /**
     * BitSet OrderAcknowledgment byte 7.
     *
     * @return the OrderAcknowledgmentReturnBitfield7 field
     */
    public OrderAcknowledgmentReturnBitfield7Field orderAcknowledgmentReturnBitfield7() {
        return orderAcknowledgmentReturnBitfield7;
    }

    /**
     * BitSet OrderAcknowledgment byte 8.
     *
     * @return the OrderAcknowledgmentReturnBitfield8 field
     */
    public OrderAcknowledgmentReturnBitfield8Field orderAcknowledgmentReturnBitfield8() {
        return orderAcknowledgmentReturnBitfield8;
    }

    /**
     * BitSet OrderAcknowledgment byte 9.
     *
     * @return the OrderAcknowledgmentReturnBitfield9 field
     */
    public OrderAcknowledgmentReturnBitfield9Field orderAcknowledgmentReturnBitfield9() {
        return orderAcknowledgmentReturnBitfield9;
    }

    /**
     * BitSet OrderAcknowledgment byte 10.
     *
     * @return the OrderAcknowledgmentReturnBitfield10 field
     */
    public OrderAcknowledgmentReturnBitfield10Field orderAcknowledgmentReturnBitfield10() {
        return orderAcknowledgmentReturnBitfield10;
    }

    /**
     * BitSet OrderAcknowledgment byte 11.
     *
     * @return the OrderAcknowledgmentReturnBitfield11 field
     */
    public OrderAcknowledgmentReturnBitfield11Field orderAcknowledgmentReturnBitfield11() {
        return orderAcknowledgmentReturnBitfield11;
    }

    /**
     * BitSet OrderAcknowledgment byte 12.
     *
     * @return the OrderAcknowledgmentReturnBitfield12 field
     */
    public OrderAcknowledgmentReturnBitfield12Field orderAcknowledgmentReturnBitfield12() {
        return orderAcknowledgmentReturnBitfield12;
    }

    /**
     * BitSet OrderAcknowledgment byte 13.
     *
     * @return the OrderAcknowledgmentReturnBitfield13 field
     */
    public OrderAcknowledgmentReturnBitfield13Field orderAcknowledgmentReturnBitfield13() {
        return orderAcknowledgmentReturnBitfield13;
    }

    /**
     * BitSet OrderAcknowledgment byte 14.
     *
     * @return the OrderAcknowledgmentReturnBitfield14 field
     */
    public OrderAcknowledgmentReturnBitfield14Field orderAcknowledgmentReturnBitfield14() {
        return orderAcknowledgmentReturnBitfield14;
    }

    /**
     * BitSet OrderAcknowledgment byte 15.
     *
     * @return the OrderAcknowledgmentReturnBitfield15 field
     */
    public OrderAcknowledgmentReturnBitfield15Field orderAcknowledgmentReturnBitfield15() {
        return orderAcknowledgmentReturnBitfield15;
    }

    /**
     * BitSet OrderAcknowledgment byte 16.
     *
     * @return the OrderAcknowledgmentReturnBitfield16 field
     */
    public OrderAcknowledgmentReturnBitfield16Field orderAcknowledgmentReturnBitfield16() {
        return orderAcknowledgmentReturnBitfield16;
    }

    /**
     * BitSet OrderAcknowledgment byte 17.
     *
     * @return the OrderAcknowledgmentReturnBitfield17 field
     */
    public OrderAcknowledgmentReturnBitfield17Field orderAcknowledgmentReturnBitfield17() {
        return orderAcknowledgmentReturnBitfield17;
    }

    /**
     * BitSet OrderAcknowledgment byte 18.
     *
     * @return the OrderAcknowledgmentReturnBitfield18 field
     */
    public OrderAcknowledgmentReturnBitfield18Field orderAcknowledgmentReturnBitfield18() {
        return orderAcknowledgmentReturnBitfield18;
    }

    /**
     * BitSet OrderAcknowledgment byte 19.
     *
     * @return the OrderAcknowledgmentReturnBitfield19 field
     */
    public OrderAcknowledgmentReturnBitfield19Field orderAcknowledgmentReturnBitfield19() {
        return orderAcknowledgmentReturnBitfield19;
    }

    /**
     * BitSet OrderAcknowledgment byte 20.
     *
     * @return the OrderAcknowledgmentReturnBitfield20 field
     */
    public OrderAcknowledgmentReturnBitfield20Field orderAcknowledgmentReturnBitfield20() {
        return orderAcknowledgmentReturnBitfield20;
    }

    /**
     * BitSet OrderAcknowledgment byte 21.
     *
     * @return the OrderAcknowledgmentReturnBitfield21 field
     */
    public OrderAcknowledgmentReturnBitfield21Field orderAcknowledgmentReturnBitfield21() {
        return orderAcknowledgmentReturnBitfield21;
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
     * Cross Initiator
     *
     * @return the CrossInitiator field
     */
    public CrossInitiatorField crossInitiator() {
        return crossInitiator;
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
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield1 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield2 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield3 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield4 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield5 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield6 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield7 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield8 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield9 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield10 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield11 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield12 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield13 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield14 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield15 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield16 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield17 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield18 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield19 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield20 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield20 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield20 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield20Present() {
        return numberOfReturnBitfields.value() >= 20L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield21 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield21 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield21 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield21Present() {
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
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentReturnBitfield1Present() && orderAcknowledgmentReturnBitfield1.orderAcknowledgmentReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the PriceBinaryPrice put it on the wire.
     *
     * <p>Decode reads the PriceBinaryPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceBinaryPrice is on the wire
     */
    public boolean priceBinaryPricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentReturnBitfield1Present() && orderAcknowledgmentReturnBitfield1.orderAcknowledgmentReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentReturnBitfield1Present() && orderAcknowledgmentReturnBitfield1.orderAcknowledgmentReturnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentReturnBitfield1Present() && orderAcknowledgmentReturnBitfield1.orderAcknowledgmentReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentReturnBitfield1Present() && orderAcknowledgmentReturnBitfield1.orderAcknowledgmentReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentReturnBitfield1Present() && orderAcknowledgmentReturnBitfield1.orderAcknowledgmentReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderAcknowledgmentReturnBitfield2Present() && orderAcknowledgmentReturnBitfield2.orderAcknowledgmentReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderAcknowledgmentReturnBitfield2Present() && orderAcknowledgmentReturnBitfield2.orderAcknowledgmentReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3MaxFloor());
    }

    /**
     * Returns whether the fields before the OrderQtyBinary put it on the wire.
     *
     * <p>Decode reads the OrderQtyBinary where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQtyBinary is on the wire
     */
    public boolean orderQtyBinaryPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderAcknowledgmentReturnBitfield4Present() && orderAcknowledgmentReturnBitfield4.orderAcknowledgmentReturnBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the StrikePrice put it on the wire.
     *
     * <p>Decode reads the StrikePrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StrikePrice is on the wire
     */
    public boolean strikePricePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderAcknowledgmentReturnBitfield4Present() && orderAcknowledgmentReturnBitfield4.orderAcknowledgmentReturnBitfield4StrikePrice());
    }

    /**
     * Returns whether the fields before the PutOrCall put it on the wire.
     *
     * <p>Decode reads the PutOrCall where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PutOrCall is on the wire
     */
    public boolean putOrCallPresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderAcknowledgmentReturnBitfield4Present() && orderAcknowledgmentReturnBitfield4.orderAcknowledgmentReturnBitfield4PutOrCall());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderAcknowledgmentReturnBitfield4Present() && orderAcknowledgmentReturnBitfield4.orderAcknowledgmentReturnBitfield4OpenClose());
    }

    /**
     * Returns whether the fields before the CorrectedSize put it on the wire.
     *
     * <p>Decode reads the CorrectedSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CorrectedSize is on the wire
     */
    public boolean correctedSizePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderAcknowledgmentReturnBitfield4Present() && orderAcknowledgmentReturnBitfield4.orderAcknowledgmentReturnBitfield4CorrectedSize());
    }

    /**
     * Returns whether the fields before the OrigClOrdId put it on the wire.
     *
     * <p>Decode reads the OrigClOrdId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrigClOrdId is on the wire
     */
    public boolean origClOrdIdPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5OrigClOrdId());
    }

    /**
     * Returns whether the fields before the LeavesQty put it on the wire.
     *
     * <p>Decode reads the LeavesQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LeavesQty is on the wire
     */
    public boolean leavesQtyPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5LeavesQty());
    }

    /**
     * Returns whether the fields before the LastShares put it on the wire.
     *
     * <p>Decode reads the LastShares where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastShares is on the wire
     */
    public boolean lastSharesPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5LastShares());
    }

    /**
     * Returns whether the fields before the LastPx put it on the wire.
     *
     * <p>Decode reads the LastPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPx is on the wire
     */
    public boolean lastPxPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5LastPx());
    }

    /**
     * Returns whether the fields before the DisplayPrice put it on the wire.
     *
     * <p>Decode reads the DisplayPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayPrice is on the wire
     */
    public boolean displayPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5DisplayPrice());
    }

    /**
     * Returns whether the fields before the WorkingPriceBinaryPrice put it on the wire.
     *
     * <p>Decode reads the WorkingPriceBinaryPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WorkingPriceBinaryPrice is on the wire
     */
    public boolean workingPriceBinaryPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5WorkingPrice());
    }

    /**
     * Returns whether the fields before the BaseLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the BaseLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BaseLiquidityIndicator is on the wire
     */
    public boolean baseLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5BaseLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5ExpireTime());
    }

    /**
     * Returns whether the fields before the SecondaryOrderId put it on the wire.
     *
     * <p>Decode reads the SecondaryOrderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryOrderId is on the wire
     */
    public boolean secondaryOrderIdPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderAcknowledgmentReturnBitfield6Present() && orderAcknowledgmentReturnBitfield6.orderAcknowledgmentReturnBitfield6SecondaryOrderId());
    }

    /**
     * Returns whether the fields before the ContraCapacity put it on the wire.
     *
     * <p>Decode reads the ContraCapacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ContraCapacity is on the wire
     */
    public boolean contraCapacityPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderAcknowledgmentReturnBitfield6Present() && orderAcknowledgmentReturnBitfield6.orderAcknowledgmentReturnBitfield6ContraCapacity());
    }

    /**
     * Returns whether the fields before the AttributedQuote put it on the wire.
     *
     * <p>Decode reads the AttributedQuote where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AttributedQuote is on the wire
     */
    public boolean attributedQuotePresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderAcknowledgmentReturnBitfield6Present() && orderAcknowledgmentReturnBitfield6.orderAcknowledgmentReturnBitfield6AttributedQuote());
    }

    /**
     * Returns whether the fields before the SubLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the SubLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SubLiquidityIndicator is on the wire
     */
    public boolean subLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (orderAcknowledgmentReturnBitfield7Present() && orderAcknowledgmentReturnBitfield7.orderAcknowledgmentReturnBitfield7SubLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the EchoText put it on the wire.
     *
     * <p>Decode reads the EchoText where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EchoText is on the wire
     */
    public boolean echoTextPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderAcknowledgmentReturnBitfield8Present() && orderAcknowledgmentReturnBitfield8.orderAcknowledgmentReturnBitfield8EchoText());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderAcknowledgmentReturnBitfield8Present() && orderAcknowledgmentReturnBitfield8.orderAcknowledgmentReturnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderAcknowledgmentReturnBitfield8Present() && orderAcknowledgmentReturnBitfield8.orderAcknowledgmentReturnBitfield8RoutingInst());
    }

    /**
     * Returns whether the fields before the RoutStrategy put it on the wire.
     *
     * <p>Decode reads the RoutStrategy where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutStrategy is on the wire
     */
    public boolean routStrategyPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderAcknowledgmentReturnBitfield8Present() && orderAcknowledgmentReturnBitfield8.orderAcknowledgmentReturnBitfield8RoutStrategy());
    }

    /**
     * Returns whether the fields before the RouteDeliveryMethod put it on the wire.
     *
     * <p>Decode reads the RouteDeliveryMethod where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RouteDeliveryMethod is on the wire
     */
    public boolean routeDeliveryMethodPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderAcknowledgmentReturnBitfield8Present() && orderAcknowledgmentReturnBitfield8.orderAcknowledgmentReturnBitfield8RouteDeliveryMethod());
    }

    /**
     * Returns whether the fields before the ExDestination put it on the wire.
     *
     * <p>Decode reads the ExDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExDestination is on the wire
     */
    public boolean exDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderAcknowledgmentReturnBitfield8Present() && orderAcknowledgmentReturnBitfield8.orderAcknowledgmentReturnBitfield8ExDestination());
    }

    /**
     * Returns whether the fields before the MarketingFeeCode put it on the wire.
     *
     * <p>Decode reads the MarketingFeeCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketingFeeCode is on the wire
     */
    public boolean marketingFeeCodePresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderAcknowledgmentReturnBitfield9Present() && orderAcknowledgmentReturnBitfield9.orderAcknowledgmentReturnBitfield9MarketingFeeCode());
    }

    /**
     * Returns whether the fields before the TargetPartyId put it on the wire.
     *
     * <p>Decode reads the TargetPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TargetPartyId is on the wire
     */
    public boolean targetPartyIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderAcknowledgmentReturnBitfield9Present() && orderAcknowledgmentReturnBitfield9.orderAcknowledgmentReturnBitfield9TargetPartyId());
    }

    /**
     * Returns whether the fields before the AuctionId put it on the wire.
     *
     * <p>Decode reads the AuctionId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AuctionId is on the wire
     */
    public boolean auctionIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderAcknowledgmentReturnBitfield9Present() && orderAcknowledgmentReturnBitfield9.orderAcknowledgmentReturnBitfield9AuctionId());
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderAcknowledgmentReturnBitfield9Present() && orderAcknowledgmentReturnBitfield9.orderAcknowledgmentReturnBitfield9CmtaNumber());
    }

    /**
     * Returns whether the fields before the CrossId put it on the wire.
     *
     * <p>Decode reads the CrossId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossId is on the wire
     */
    public boolean crossIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderAcknowledgmentReturnBitfield10Present() && orderAcknowledgmentReturnBitfield10.orderAcknowledgmentReturnBitfield10CrossId());
    }

    /**
     * Returns whether the fields before the AllocQty put it on the wire.
     *
     * <p>Decode reads the AllocQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AllocQty is on the wire
     */
    public boolean allocQtyPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderAcknowledgmentReturnBitfield10Present() && orderAcknowledgmentReturnBitfield10.orderAcknowledgmentReturnBitfield10AllocQty());
    }

    /**
     * Returns whether the fields before the GiveUpFirmId put it on the wire.
     *
     * <p>Decode reads the GiveUpFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the GiveUpFirmId is on the wire
     */
    public boolean giveUpFirmIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderAcknowledgmentReturnBitfield10Present() && orderAcknowledgmentReturnBitfield10.orderAcknowledgmentReturnBitfield10GiveUpFirmId());
    }

    /**
     * Returns whether the fields before the RoutingFirmId put it on the wire.
     *
     * <p>Decode reads the RoutingFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingFirmId is on the wire
     */
    public boolean routingFirmIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderAcknowledgmentReturnBitfield10Present() && orderAcknowledgmentReturnBitfield10.orderAcknowledgmentReturnBitfield10RoutingFirmId());
    }

    /**
     * Returns whether the fields before the CrossExclusionIndicator put it on the wire.
     *
     * <p>Decode reads the CrossExclusionIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossExclusionIndicator is on the wire
     */
    public boolean crossExclusionIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderAcknowledgmentReturnBitfield10Present() && orderAcknowledgmentReturnBitfield10.orderAcknowledgmentReturnBitfield10CrossExclusionIndicator());
    }

    /**
     * Returns whether the fields before the ClearingOptionalData put it on the wire.
     *
     * <p>Decode reads the ClearingOptionalData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingOptionalData is on the wire
     */
    public boolean clearingOptionalDataPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderAcknowledgmentReturnBitfield12Present() && orderAcknowledgmentReturnBitfield12.orderAcknowledgmentReturnBitfield12ClearingOptionalData());
    }

    /**
     * Returns whether the fields before the DrillThruProtection put it on the wire.
     *
     * <p>Decode reads the DrillThruProtection where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DrillThruProtection is on the wire
     */
    public boolean drillThruProtectionPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderAcknowledgmentReturnBitfield13Present() && orderAcknowledgmentReturnBitfield13.orderAcknowledgmentReturnBitfield13DrillThruProtection());
    }

    /**
     * Returns whether the fields before the EquityPartyId put it on the wire.
     *
     * <p>Decode reads the EquityPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityPartyId is on the wire
     */
    public boolean equityPartyIdPresent() {
        return (numberOfReturnBitfields.value() >= 15L) && (orderAcknowledgmentReturnBitfield15Present() && orderAcknowledgmentReturnBitfield15.orderAcknowledgmentReturnBitfield15EquityPartyId());
    }

    /**
     * Returns whether the fields before the ClientIdAttr put it on the wire.
     *
     * <p>Decode reads the ClientIdAttr where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientIdAttr is on the wire
     */
    public boolean clientIdAttrPresent() {
        return (numberOfReturnBitfields.value() >= 15L) && (orderAcknowledgmentReturnBitfield15Present() && orderAcknowledgmentReturnBitfield15.orderAcknowledgmentReturnBitfield15ClientIdAttr());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderAcknowledgmentReturnBitfield16Present() && orderAcknowledgmentReturnBitfield16.orderAcknowledgmentReturnBitfield16FrequentTraderId());
    }

    /**
     * Returns whether the fields before the SessionEligibility put it on the wire.
     *
     * <p>Decode reads the SessionEligibility where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SessionEligibility is on the wire
     */
    public boolean sessionEligibilityPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderAcknowledgmentReturnBitfield16Present() && orderAcknowledgmentReturnBitfield16.orderAcknowledgmentReturnBitfield16SessionEligibility());
    }

    /**
     * Returns whether the fields before the ComboOrder put it on the wire.
     *
     * <p>Decode reads the ComboOrder where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComboOrder is on the wire
     */
    public boolean comboOrderPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderAcknowledgmentReturnBitfield16Present() && orderAcknowledgmentReturnBitfield16.orderAcknowledgmentReturnBitfield16ComboOrder());
    }

    /**
     * Returns whether the fields before the Compression put it on the wire.
     *
     * <p>Decode reads the Compression where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Compression is on the wire
     */
    public boolean compressionPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderAcknowledgmentReturnBitfield16Present() && orderAcknowledgmentReturnBitfield16.orderAcknowledgmentReturnBitfield16Compression());
    }

    /**
     * Returns whether the fields before the FloorDestination put it on the wire.
     *
     * <p>Decode reads the FloorDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FloorDestination is on the wire
     */
    public boolean floorDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderAcknowledgmentReturnBitfield16Present() && orderAcknowledgmentReturnBitfield16.orderAcknowledgmentReturnBitfield16FloorDestination());
    }

    /**
     * Returns whether the fields before the FloorRoutingInst put it on the wire.
     *
     * <p>Decode reads the FloorRoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FloorRoutingInst is on the wire
     */
    public boolean floorRoutingInstPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderAcknowledgmentReturnBitfield16Present() && orderAcknowledgmentReturnBitfield16.orderAcknowledgmentReturnBitfield16FloorRoutingInst());
    }

    /**
     * Returns whether the fields before the MultiClassSprd put it on the wire.
     *
     * <p>Decode reads the MultiClassSprd where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MultiClassSprd is on the wire
     */
    public boolean multiClassSprdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderAcknowledgmentReturnBitfield16Present() && orderAcknowledgmentReturnBitfield16.orderAcknowledgmentReturnBitfield16MultiClassSprd());
    }

    /**
     * Returns whether the fields before the OrderOrigin put it on the wire.
     *
     * <p>Decode reads the OrderOrigin where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigin is on the wire
     */
    public boolean orderOriginPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderAcknowledgmentReturnBitfield16Present() && orderAcknowledgmentReturnBitfield16.orderAcknowledgmentReturnBitfield16OrderOrigin());
    }

    /**
     * Returns whether the fields before the PriceType put it on the wire.
     *
     * <p>Decode reads the PriceType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceType is on the wire
     */
    public boolean priceTypePresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderAcknowledgmentReturnBitfield17Present() && orderAcknowledgmentReturnBitfield17.orderAcknowledgmentReturnBitfield17PriceType());
    }

    /**
     * Returns whether the fields before the StrategyId put it on the wire.
     *
     * <p>Decode reads the StrategyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StrategyId is on the wire
     */
    public boolean strategyIdPresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderAcknowledgmentReturnBitfield17Present() && orderAcknowledgmentReturnBitfield17.orderAcknowledgmentReturnBitfield17StrategyId());
    }

    /**
     * Returns whether the fields before the CrossInitiator put it on the wire.
     *
     * <p>Decode reads the CrossInitiator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossInitiator is on the wire
     */
    public boolean crossInitiatorPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderAcknowledgmentReturnBitfield18Present() && orderAcknowledgmentReturnBitfield18.orderAcknowledgmentReturnBitfield18CrossInitiator());
    }

    /**
     * Returns whether the fields before the Held put it on the wire.
     *
     * <p>Decode reads the Held where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Held is on the wire
     */
    public boolean heldPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderAcknowledgmentReturnBitfield18Present() && orderAcknowledgmentReturnBitfield18.orderAcknowledgmentReturnBitfield18Held());
    }

    /**
     * Returns whether the fields before the CrossOnBehalfOfId put it on the wire.
     *
     * <p>Decode reads the CrossOnBehalfOfId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOnBehalfOfId is on the wire
     */
    public boolean crossOnBehalfOfIdPresent() {
        return (numberOfReturnBitfields.value() >= 19L) && (orderAcknowledgmentReturnBitfield19Present() && orderAcknowledgmentReturnBitfield19.orderAcknowledgmentReturnBitfield19CrossOnBehalfOfId());
    }

    /**
     * Returns whether the fields before the StopPxType put it on the wire.
     *
     * <p>Decode reads the StopPxType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPxType is on the wire
     */
    public boolean stopPxTypePresent() {
        return (numberOfReturnBitfields.value() >= 19L) && (orderAcknowledgmentReturnBitfield19Present() && orderAcknowledgmentReturnBitfield19.orderAcknowledgmentReturnBitfield19StopPxType());
    }

    private boolean onWire(Field field) {
        return (field != orderAcknowledgmentReturnBitfield1 || orderAcknowledgmentReturnBitfield1Present()) && (field != orderAcknowledgmentReturnBitfield2 || orderAcknowledgmentReturnBitfield2Present()) && (field != orderAcknowledgmentReturnBitfield3 || orderAcknowledgmentReturnBitfield3Present()) && (field != orderAcknowledgmentReturnBitfield4 || orderAcknowledgmentReturnBitfield4Present()) && (field != orderAcknowledgmentReturnBitfield5 || orderAcknowledgmentReturnBitfield5Present()) && (field != orderAcknowledgmentReturnBitfield6 || orderAcknowledgmentReturnBitfield6Present()) && (field != orderAcknowledgmentReturnBitfield7 || orderAcknowledgmentReturnBitfield7Present()) && (field != orderAcknowledgmentReturnBitfield8 || orderAcknowledgmentReturnBitfield8Present()) && (field != orderAcknowledgmentReturnBitfield9 || orderAcknowledgmentReturnBitfield9Present()) && (field != orderAcknowledgmentReturnBitfield10 || orderAcknowledgmentReturnBitfield10Present()) && (field != orderAcknowledgmentReturnBitfield11 || orderAcknowledgmentReturnBitfield11Present()) && (field != orderAcknowledgmentReturnBitfield12 || orderAcknowledgmentReturnBitfield12Present()) && (field != orderAcknowledgmentReturnBitfield13 || orderAcknowledgmentReturnBitfield13Present()) && (field != orderAcknowledgmentReturnBitfield14 || orderAcknowledgmentReturnBitfield14Present()) && (field != orderAcknowledgmentReturnBitfield15 || orderAcknowledgmentReturnBitfield15Present()) && (field != orderAcknowledgmentReturnBitfield16 || orderAcknowledgmentReturnBitfield16Present()) && (field != orderAcknowledgmentReturnBitfield17 || orderAcknowledgmentReturnBitfield17Present()) && (field != orderAcknowledgmentReturnBitfield18 || orderAcknowledgmentReturnBitfield18Present()) && (field != orderAcknowledgmentReturnBitfield19 || orderAcknowledgmentReturnBitfield19Present()) && (field != orderAcknowledgmentReturnBitfield20 || orderAcknowledgmentReturnBitfield20Present()) && (field != orderAcknowledgmentReturnBitfield21 || orderAcknowledgmentReturnBitfield21Present()) && (field != side || sidePresent()) && (field != priceBinaryPrice || priceBinaryPricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != maxFloor || maxFloorPresent()) && (field != orderQtyBinary || orderQtyBinaryPresent()) && (field != preventMatch || preventMatchPresent()) && (field != maturityDate || maturityDatePresent()) && (field != strikePrice || strikePricePresent()) && (field != putOrCall || putOrCallPresent()) && (field != openClose || openClosePresent()) && (field != correctedSize || correctedSizePresent()) && (field != origClOrdId || origClOrdIdPresent()) && (field != leavesQty || leavesQtyPresent()) && (field != lastShares || lastSharesPresent()) && (field != lastPx || lastPxPresent()) && (field != displayPrice || displayPricePresent()) && (field != workingPriceBinaryPrice || workingPriceBinaryPricePresent()) && (field != baseLiquidityIndicator || baseLiquidityIndicatorPresent()) && (field != expireTime || expireTimePresent()) && (field != secondaryOrderId || secondaryOrderIdPresent()) && (field != contraCapacity || contraCapacityPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != subLiquidityIndicator || subLiquidityIndicatorPresent()) && (field != echoText || echoTextPresent()) && (field != stopPx || stopPxPresent()) && (field != routingInst || routingInstPresent()) && (field != routStrategy || routStrategyPresent()) && (field != routeDeliveryMethod || routeDeliveryMethodPresent()) && (field != exDestination || exDestinationPresent()) && (field != marketingFeeCode || marketingFeeCodePresent()) && (field != targetPartyId || targetPartyIdPresent()) && (field != auctionId || auctionIdPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != crossId || crossIdPresent()) && (field != allocQty || allocQtyPresent()) && (field != giveUpFirmId || giveUpFirmIdPresent()) && (field != routingFirmId || routingFirmIdPresent()) && (field != crossExclusionIndicator || crossExclusionIndicatorPresent()) && (field != clearingOptionalData || clearingOptionalDataPresent()) && (field != drillThruProtection || drillThruProtectionPresent()) && (field != equityPartyId || equityPartyIdPresent()) && (field != clientIdAttr || clientIdAttrPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != sessionEligibility || sessionEligibilityPresent()) && (field != comboOrder || comboOrderPresent()) && (field != compression || compressionPresent()) && (field != floorDestination || floorDestinationPresent()) && (field != floorRoutingInst || floorRoutingInstPresent()) && (field != multiClassSprd || multiClassSprdPresent()) && (field != orderOrigin || orderOriginPresent()) && (field != priceType || priceTypePresent()) && (field != strategyId || strategyIdPresent()) && (field != crossInitiator || crossInitiatorPresent()) && (field != held || heldPresent()) && (field != crossOnBehalfOfId || crossOnBehalfOfIdPresent()) && (field != stopPxType || stopPxTypePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderAcknowledgmentReturnBitfield1Present() ? OrderAcknowledgmentReturnBitfield1Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield2Present() ? OrderAcknowledgmentReturnBitfield2Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield3Present() ? OrderAcknowledgmentReturnBitfield3Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield4Present() ? OrderAcknowledgmentReturnBitfield4Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield5Present() ? OrderAcknowledgmentReturnBitfield5Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield6Present() ? OrderAcknowledgmentReturnBitfield6Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield7Present() ? OrderAcknowledgmentReturnBitfield7Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield8Present() ? OrderAcknowledgmentReturnBitfield8Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield9Present() ? OrderAcknowledgmentReturnBitfield9Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield10Present() ? OrderAcknowledgmentReturnBitfield10Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield11Present() ? OrderAcknowledgmentReturnBitfield11Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield12Present() ? OrderAcknowledgmentReturnBitfield12Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield13Present() ? OrderAcknowledgmentReturnBitfield13Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield14Present() ? OrderAcknowledgmentReturnBitfield14Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield15Present() ? OrderAcknowledgmentReturnBitfield15Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield16Present() ? OrderAcknowledgmentReturnBitfield16Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield17Present() ? OrderAcknowledgmentReturnBitfield17Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield18Present() ? OrderAcknowledgmentReturnBitfield18Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield19Present() ? OrderAcknowledgmentReturnBitfield19Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield20Present() ? OrderAcknowledgmentReturnBitfield20Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield21Present() ? OrderAcknowledgmentReturnBitfield21Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (priceBinaryPricePresent() ? PriceBinaryPriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (orderQtyBinaryPresent() ? OrderQtyBinaryField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (strikePricePresent() ? StrikePriceField.BYTE_LENGTH : 0) + (putOrCallPresent() ? PutOrCallField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (correctedSizePresent() ? CorrectedSizeField.BYTE_LENGTH : 0) + (origClOrdIdPresent() ? OrigClOrdIdField.BYTE_LENGTH : 0) + (leavesQtyPresent() ? LeavesQtyField.BYTE_LENGTH : 0) + (lastSharesPresent() ? LastSharesField.BYTE_LENGTH : 0) + (lastPxPresent() ? LastPxField.BYTE_LENGTH : 0) + (displayPricePresent() ? DisplayPriceField.BYTE_LENGTH : 0) + (workingPriceBinaryPricePresent() ? WorkingPriceBinaryPriceField.BYTE_LENGTH : 0) + (baseLiquidityIndicatorPresent() ? BaseLiquidityIndicatorField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (secondaryOrderIdPresent() ? SecondaryOrderIdField.BYTE_LENGTH : 0) + (contraCapacityPresent() ? ContraCapacityField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (subLiquidityIndicatorPresent() ? SubLiquidityIndicatorField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (routStrategyPresent() ? RoutStrategyField.BYTE_LENGTH : 0) + (routeDeliveryMethodPresent() ? RouteDeliveryMethodField.BYTE_LENGTH : 0) + (exDestinationPresent() ? ExDestinationField.BYTE_LENGTH : 0) + (marketingFeeCodePresent() ? MarketingFeeCodeField.BYTE_LENGTH : 0) + (targetPartyIdPresent() ? TargetPartyIdField.BYTE_LENGTH : 0) + (auctionIdPresent() ? AuctionIdField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (crossIdPresent() ? CrossIdField.BYTE_LENGTH : 0) + (allocQtyPresent() ? AllocQtyField.BYTE_LENGTH : 0) + (giveUpFirmIdPresent() ? GiveUpFirmIdField.BYTE_LENGTH : 0) + (routingFirmIdPresent() ? RoutingFirmIdField.BYTE_LENGTH : 0) + (crossExclusionIndicatorPresent() ? CrossExclusionIndicatorField.BYTE_LENGTH : 0) + (clearingOptionalDataPresent() ? ClearingOptionalDataField.BYTE_LENGTH : 0) + (drillThruProtectionPresent() ? DrillThruProtectionField.BYTE_LENGTH : 0) + (equityPartyIdPresent() ? EquityPartyIdField.BYTE_LENGTH : 0) + (clientIdAttrPresent() ? ClientIdAttrField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (sessionEligibilityPresent() ? SessionEligibilityField.BYTE_LENGTH : 0) + (comboOrderPresent() ? ComboOrderField.BYTE_LENGTH : 0) + (compressionPresent() ? CompressionField.BYTE_LENGTH : 0) + (floorDestinationPresent() ? FloorDestinationField.BYTE_LENGTH : 0) + (floorRoutingInstPresent() ? FloorRoutingInstField.BYTE_LENGTH : 0) + (multiClassSprdPresent() ? MultiClassSprdField.BYTE_LENGTH : 0) + (orderOriginPresent() ? OrderOriginField.BYTE_LENGTH : 0) + (priceTypePresent() ? PriceTypeField.BYTE_LENGTH : 0) + (strategyIdPresent() ? StrategyIdField.BYTE_LENGTH : 0) + (crossInitiatorPresent() ? CrossInitiatorField.BYTE_LENGTH : 0) + (heldPresent() ? HeldField.BYTE_LENGTH : 0) + (crossOnBehalfOfIdPresent() ? CrossOnBehalfOfIdField.BYTE_LENGTH : 0) + (stopPxTypePresent() ? StopPxTypeField.BYTE_LENGTH : 0);
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
        cursor += 1;
        if (orderAcknowledgmentReturnBitfield1Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield2Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield3Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield4Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield5Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield6Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield7Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield8Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield9Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield10Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield11Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield12Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield13Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield14Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield15Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield16Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield17Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield18Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield19Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield20Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield21Present()) {
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
        if (crossInitiatorPresent()) {
            cursor += 4;
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
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitf.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfField.BYTE_LENGTH;
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (orderAcknowledgmentReturnBitfield1Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield1Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield2Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield2Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield3Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield3Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield4Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield4Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield5Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield5Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield6Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield6Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield7Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield7Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield8Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield8Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield9Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield9Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield10Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield10Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield11Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield11Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield12Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield12Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield13Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield13Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield14Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield14Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield15Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield15Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield16Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield16Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield17Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield17Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield18Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield18Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield19Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield19Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield20Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield20Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield20.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield20Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield21Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield21Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield21.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield21Field.BYTE_LENGTH;
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
        if (orderAcknowledgmentReturnBitfield1Present() != orderAcknowledgmentReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield1.hasValue() ? "orderAcknowledgmentReturnBitfield1 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield2Present() != orderAcknowledgmentReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield2.hasValue() ? "orderAcknowledgmentReturnBitfield2 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield3Present() != orderAcknowledgmentReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield3.hasValue() ? "orderAcknowledgmentReturnBitfield3 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield4Present() != orderAcknowledgmentReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield4.hasValue() ? "orderAcknowledgmentReturnBitfield4 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield5Present() != orderAcknowledgmentReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield5.hasValue() ? "orderAcknowledgmentReturnBitfield5 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield6Present() != orderAcknowledgmentReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield6.hasValue() ? "orderAcknowledgmentReturnBitfield6 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield7Present() != orderAcknowledgmentReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield7.hasValue() ? "orderAcknowledgmentReturnBitfield7 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield8Present() != orderAcknowledgmentReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield8.hasValue() ? "orderAcknowledgmentReturnBitfield8 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield9Present() != orderAcknowledgmentReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield9.hasValue() ? "orderAcknowledgmentReturnBitfield9 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield10Present() != orderAcknowledgmentReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield10.hasValue() ? "orderAcknowledgmentReturnBitfield10 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield11Present() != orderAcknowledgmentReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield11.hasValue() ? "orderAcknowledgmentReturnBitfield11 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield12Present() != orderAcknowledgmentReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield12.hasValue() ? "orderAcknowledgmentReturnBitfield12 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield13Present() != orderAcknowledgmentReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield13.hasValue() ? "orderAcknowledgmentReturnBitfield13 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield14Present() != orderAcknowledgmentReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield14.hasValue() ? "orderAcknowledgmentReturnBitfield14 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield15Present() != orderAcknowledgmentReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield15.hasValue() ? "orderAcknowledgmentReturnBitfield15 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield16Present() != orderAcknowledgmentReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield16.hasValue() ? "orderAcknowledgmentReturnBitfield16 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield17Present() != orderAcknowledgmentReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield17.hasValue() ? "orderAcknowledgmentReturnBitfield17 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield18Present() != orderAcknowledgmentReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield18.hasValue() ? "orderAcknowledgmentReturnBitfield18 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield19Present() != orderAcknowledgmentReturnBitfield19.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield19.hasValue() ? "orderAcknowledgmentReturnBitfield19 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield20Present() != orderAcknowledgmentReturnBitfield20.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield20.hasValue() ? "orderAcknowledgmentReturnBitfield20 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield20 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield21Present() != orderAcknowledgmentReturnBitfield21.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield21.hasValue() ? "orderAcknowledgmentReturnBitfield21 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield21 holds no value, though the fields before it put it on the wire");
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
        if (crossInitiatorPresent() != crossInitiator.hasValue()) {
            throw new IllegalStateException(crossInitiator.hasValue() ? "crossInitiator holds a value the fields before it leave off the wire" : "crossInitiator holds no value, though the fields before it put it on the wire");
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
        cursor = orderId.encode(data, cursor);
        if (buffer != null && buffer.length >= 37) {
            System.arraycopy(buffer, 36, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitf.encode(data, cursor);
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (orderAcknowledgmentReturnBitfield1Present()) {
            cursor = orderAcknowledgmentReturnBitfield1.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield2Present()) {
            cursor = orderAcknowledgmentReturnBitfield2.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield3Present()) {
            cursor = orderAcknowledgmentReturnBitfield3.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield4Present()) {
            cursor = orderAcknowledgmentReturnBitfield4.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield5Present()) {
            cursor = orderAcknowledgmentReturnBitfield5.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield6Present()) {
            cursor = orderAcknowledgmentReturnBitfield6.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield7Present()) {
            cursor = orderAcknowledgmentReturnBitfield7.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield8Present()) {
            cursor = orderAcknowledgmentReturnBitfield8.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield9Present()) {
            cursor = orderAcknowledgmentReturnBitfield9.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield10Present()) {
            cursor = orderAcknowledgmentReturnBitfield10.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield11Present()) {
            cursor = orderAcknowledgmentReturnBitfield11.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield12Present()) {
            cursor = orderAcknowledgmentReturnBitfield12.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield13Present()) {
            cursor = orderAcknowledgmentReturnBitfield13.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield14Present()) {
            cursor = orderAcknowledgmentReturnBitfield14.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield15Present()) {
            cursor = orderAcknowledgmentReturnBitfield15.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield16Present()) {
            cursor = orderAcknowledgmentReturnBitfield16.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield17Present()) {
            cursor = orderAcknowledgmentReturnBitfield17.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield18Present()) {
            cursor = orderAcknowledgmentReturnBitfield18.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield19Present()) {
            cursor = orderAcknowledgmentReturnBitfield19.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield20Present()) {
            cursor = orderAcknowledgmentReturnBitfield20.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield21Present()) {
            cursor = orderAcknowledgmentReturnBitfield21.encode(data, cursor);
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
        if (crossInitiatorPresent()) {
            cursor = crossInitiator.encode(data, cursor);
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
            case "OrderId" -> Optional.of(orderId);
            case "NumberOfReturnBitf" -> Optional.of(numberOfReturnBitf);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "OrderAcknowledgmentReturnBitfield1" -> Optional.of(orderAcknowledgmentReturnBitfield1);
            case "OrderAcknowledgmentReturnBitfield2" -> Optional.of(orderAcknowledgmentReturnBitfield2);
            case "OrderAcknowledgmentReturnBitfield3" -> Optional.of(orderAcknowledgmentReturnBitfield3);
            case "OrderAcknowledgmentReturnBitfield4" -> Optional.of(orderAcknowledgmentReturnBitfield4);
            case "OrderAcknowledgmentReturnBitfield5" -> Optional.of(orderAcknowledgmentReturnBitfield5);
            case "OrderAcknowledgmentReturnBitfield6" -> Optional.of(orderAcknowledgmentReturnBitfield6);
            case "OrderAcknowledgmentReturnBitfield7" -> Optional.of(orderAcknowledgmentReturnBitfield7);
            case "OrderAcknowledgmentReturnBitfield8" -> Optional.of(orderAcknowledgmentReturnBitfield8);
            case "OrderAcknowledgmentReturnBitfield9" -> Optional.of(orderAcknowledgmentReturnBitfield9);
            case "OrderAcknowledgmentReturnBitfield10" -> Optional.of(orderAcknowledgmentReturnBitfield10);
            case "OrderAcknowledgmentReturnBitfield11" -> Optional.of(orderAcknowledgmentReturnBitfield11);
            case "OrderAcknowledgmentReturnBitfield12" -> Optional.of(orderAcknowledgmentReturnBitfield12);
            case "OrderAcknowledgmentReturnBitfield13" -> Optional.of(orderAcknowledgmentReturnBitfield13);
            case "OrderAcknowledgmentReturnBitfield14" -> Optional.of(orderAcknowledgmentReturnBitfield14);
            case "OrderAcknowledgmentReturnBitfield15" -> Optional.of(orderAcknowledgmentReturnBitfield15);
            case "OrderAcknowledgmentReturnBitfield16" -> Optional.of(orderAcknowledgmentReturnBitfield16);
            case "OrderAcknowledgmentReturnBitfield17" -> Optional.of(orderAcknowledgmentReturnBitfield17);
            case "OrderAcknowledgmentReturnBitfield18" -> Optional.of(orderAcknowledgmentReturnBitfield18);
            case "OrderAcknowledgmentReturnBitfield19" -> Optional.of(orderAcknowledgmentReturnBitfield19);
            case "OrderAcknowledgmentReturnBitfield20" -> Optional.of(orderAcknowledgmentReturnBitfield20);
            case "OrderAcknowledgmentReturnBitfield21" -> Optional.of(orderAcknowledgmentReturnBitfield21);
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
            case "CrossInitiator" -> Optional.of(crossInitiator);
            case "Held" -> Optional.of(held);
            case "CrossOnBehalfOfId" -> Optional.of(crossOnBehalfOfId);
            case "StopPxType" -> Optional.of(stopPxType);
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
