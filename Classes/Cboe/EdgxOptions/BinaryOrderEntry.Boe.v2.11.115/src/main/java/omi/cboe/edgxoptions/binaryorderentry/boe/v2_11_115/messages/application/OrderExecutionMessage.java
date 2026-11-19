package omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.AccountField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.AllocQtyField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.AttributedQuoteField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.AuctionIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.AvgPxField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.BaseLiquidityIndicatorField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CapacityField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ClOrdIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ClearingAccountField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ClearingFirmField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ClearingOptionalDataField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ClientIdAttrField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CmtaNumberField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ComboOrderField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CompressionField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ContraBrokerField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ContraCapacityField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ContraTraderField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CorrectedSizeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CrossExclusionIndicatorField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CrossIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CrossInitiatorField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CrossOnBehalfOfIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CrossPrioritizationField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CrossTypeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CumQtyField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.DayAvgPxField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.DayCumQtyField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.DayOrderQtyField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.DisplayIndicatorField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.EchoTextField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.EquityPartyIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ExDestinationField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ExecIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ExecInstField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ExecLegCfiCodeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.FeeCodeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.FloorDestinationField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.FloorRoutingInstField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.FloorTradeTimeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.FrequentTraderIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.GiveUpFirmIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.HeldField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.LastPxField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.LastSharesField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.LeavesQtyField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.MarketingFeeCodeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.MaturityDateField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.MaxFloorField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.MinQtyField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.MultiClassSprdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.MultilegReportingTypeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.NumberOfReturnBitfieldsField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OpenCloseField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrdTypeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield10Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield11Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield12Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield13Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield14Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield15Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield16Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield17Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield18Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield19Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield1Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield20Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield21Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield2Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield3Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield4Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield5Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield6Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield7Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield8Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderExecutionReturnBitfield9Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderOriginField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderQtyBinaryField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.PreventMatchField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.PriceBinaryPriceField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.PriceTypeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.PutOrCallField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.RoutStrategyField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.RouteDeliveryMethodField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.RoutingFirmIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.RoutingInstField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.SecondaryExecIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.SenderLocationIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.SideField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.StopPxField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.StopPxTypeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.StrategyIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.StrikePriceField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.SubLiquidityIndicatorField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.SymbolAlphanumericField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.TargetPartyIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.TimeInForceField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.TradeDateField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.TradeThroughAlertTypeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.TransactionTimeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.types.Message;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * Represents the OrderExecutionMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Order Execution Message.</p>
 */
public final class OrderExecutionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 60;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Execution Message";

    /**
     * Report send time (for audit).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol (@) and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived, persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to ExecID (17) in Cboe FIX. Execution ID. Unique across all matching units on a given day. Note: ExecIDs will be represented on ODROP and FIXDROP ports as nine character, base 36 ASCII. Leading zeros should be added if the converted base 36 value is shorter than nine characters. Table 2. Example Conversion Decimal Base 36 28294005440239 A1234B567 76335905726621 R248BC23H 728557228187 09AP05V2Z
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Last Shares
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Base Liquidity Indicator
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Sub Liquidity Indicator
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

    /**
     * Corresponds to ContraBroker (375) in Cboe FIX. Simple Instrument Fills Internally matched simple executions will identify the clearing number of the contra on the execution. This includes leg fill reports (MultilegReportingType=2) that are sent as a result of a complex trade. Executions matched on the C1 trading floor will contain a value of ‘FBKR’ for ContraBroker for the first reporter of a Broker to Broker floor trade otherwise, this will identify the OCC clearing number of the contra (C1 only). Complex Package Fills ContraBroker will be sent and populated on electronic, complex package fills (MultilegReportingType=3) when the contra side is also a complex order. When legging in to the simple books ContraBroker will be blank. ContraBroker will be blank on complex package fills (MultilegReportingType=3) executed on the Cboe Options trading floor (C1 only). Routed Fills All externally matched (routed, BaseLiquidityIndicator = X) executions will identify the away exchange with the following possible values. AMEX = Routed to NYSE American ARCA = Routed to NYSE Arca BATS = Routed to Cboe BZX Options BOX = Routed to BOX CBOE = Routed to Cboe Options CTWO = Routed to C2 Options EDGX = Routed to Cboe EDGX Options EMLD = Routed to MIAX Emerald GMNI = Routed to Nasdaq GEMX IEX = Routed to IEX Options ISE = Routed to Nasdaq ISE MEMX = Routed to MEMX MERC = Routed to Nasdaq MRX MIAX = Routed to MIAX Options Exchange MXTO = Routed to MX2 Options NOMX = Routed to Nasdaq NOBX = Routed to Nasdaq Texas PERL = Routed to MIAX PEARL PHLX = Routed to Nasdaq PHLX SPHR = Routed to MIAX Sapphire
     */
    private final ContraBrokerField contraBroker = new ContraBrokerField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderExecution byte 1.
     */
    private final OrderExecutionReturnBitfield1Field orderExecutionReturnBitfield1 = new OrderExecutionReturnBitfield1Field();

    /**
     * BitSet OrderExecution byte 2.
     */
    private final OrderExecutionReturnBitfield2Field orderExecutionReturnBitfield2 = new OrderExecutionReturnBitfield2Field();

    /**
     * BitSet OrderExecution byte 3.
     */
    private final OrderExecutionReturnBitfield3Field orderExecutionReturnBitfield3 = new OrderExecutionReturnBitfield3Field();

    /**
     * BitSet OrderExecution byte 4.
     */
    private final OrderExecutionReturnBitfield4Field orderExecutionReturnBitfield4 = new OrderExecutionReturnBitfield4Field();

    /**
     * BitSet OrderExecution byte 5.
     */
    private final OrderExecutionReturnBitfield5Field orderExecutionReturnBitfield5 = new OrderExecutionReturnBitfield5Field();

    /**
     * BitSet OrderExecution byte 6.
     */
    private final OrderExecutionReturnBitfield6Field orderExecutionReturnBitfield6 = new OrderExecutionReturnBitfield6Field();

    /**
     * BitSet OrderExecution byte 7.
     */
    private final OrderExecutionReturnBitfield7Field orderExecutionReturnBitfield7 = new OrderExecutionReturnBitfield7Field();

    /**
     * BitSet OrderExecution byte 8.
     */
    private final OrderExecutionReturnBitfield8Field orderExecutionReturnBitfield8 = new OrderExecutionReturnBitfield8Field();

    /**
     * BitSet OrderExecution byte 9.
     */
    private final OrderExecutionReturnBitfield9Field orderExecutionReturnBitfield9 = new OrderExecutionReturnBitfield9Field();

    /**
     * BitSet OrderExecution byte 10.
     */
    private final OrderExecutionReturnBitfield10Field orderExecutionReturnBitfield10 = new OrderExecutionReturnBitfield10Field();

    /**
     * BitSet OrderExecution byte 11.
     */
    private final OrderExecutionReturnBitfield11Field orderExecutionReturnBitfield11 = new OrderExecutionReturnBitfield11Field();

    /**
     * BitSet OrderExecution byte 12.
     */
    private final OrderExecutionReturnBitfield12Field orderExecutionReturnBitfield12 = new OrderExecutionReturnBitfield12Field();

    /**
     * BitSet OrderExecution byte 13.
     */
    private final OrderExecutionReturnBitfield13Field orderExecutionReturnBitfield13 = new OrderExecutionReturnBitfield13Field();

    /**
     * BitSet OrderExecution byte 14.
     */
    private final OrderExecutionReturnBitfield14Field orderExecutionReturnBitfield14 = new OrderExecutionReturnBitfield14Field();

    /**
     * BitSet OrderExecution byte 15.
     */
    private final OrderExecutionReturnBitfield15Field orderExecutionReturnBitfield15 = new OrderExecutionReturnBitfield15Field();

    /**
     * BitSet OrderExecution byte 16.
     */
    private final OrderExecutionReturnBitfield16Field orderExecutionReturnBitfield16 = new OrderExecutionReturnBitfield16Field();

    /**
     * BitSet OrderExecution byte 17.
     */
    private final OrderExecutionReturnBitfield17Field orderExecutionReturnBitfield17 = new OrderExecutionReturnBitfield17Field();

    /**
     * BitSet OrderExecution byte 18.
     */
    private final OrderExecutionReturnBitfield18Field orderExecutionReturnBitfield18 = new OrderExecutionReturnBitfield18Field();

    /**
     * BitSet OrderExecution byte 19.
     */
    private final OrderExecutionReturnBitfield19Field orderExecutionReturnBitfield19 = new OrderExecutionReturnBitfield19Field();

    /**
     * BitSet OrderExecution byte 20.
     */
    private final OrderExecutionReturnBitfield20Field orderExecutionReturnBitfield20 = new OrderExecutionReturnBitfield20Field();

    /**
     * BitSet OrderExecution byte 21.
     */
    private final OrderExecutionReturnBitfield21Field orderExecutionReturnBitfield21 = new OrderExecutionReturnBitfield21Field();

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
     * Displays the EFID (ClearingFirm) of the contra side firm on all internally matched executions.
     */
    private final ContraTraderField contraTrader = new ContraTraderField();

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
     * Contra Capacity
     */
    private final ContraCapacityField contraCapacity = new ContraCapacityField();

    /**
     * Attributed Quote
     */
    private final AttributedQuoteField attributedQuote = new AttributedQuoteField();

    /**
     * Fee Code
     */
    private final FeeCodeField feeCode = new FeeCodeField();

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
     * Corresponds to CrossType (549) in Cboe FIX. Type of auction order being submitted. This indicates the type of auction that will be initiated upon order entry. 1 = Automated Improvement Mechanism (AIM) 2 = Qualified Contingent Cross (QCC) 3 = Solicitation Cross (SAM) 4 = Position Compression Cross (PCC) (C1 Only)
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * Corresponds to CrossPrioritization (550) in Cboe FIX. Indicates which side of the cross order will be prioritized for execution. This identifies the Agency side. 1 = Buy 2 = Sell
     */
    private final CrossPrioritizationField crossPrioritization = new CrossPrioritizationField();

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
     * Trade Date
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Clearing Optional Data
     */
    private final ClearingOptionalDataField clearingOptionalData = new ClearingOptionalDataField();

    /**
     * Cum Qty
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * Day Order Qty
     */
    private final DayOrderQtyField dayOrderQty = new DayOrderQtyField();

    /**
     * Day Cum Qty
     */
    private final DayCumQtyField dayCumQty = new DayCumQtyField();

    /**
     * Avg Px
     */
    private final AvgPxField avgPx = new AvgPxField();

    /**
     * Day Avg Px
     */
    private final DayAvgPxField dayAvgPx = new DayAvgPxField();

    /**
     * Corresponds to MultilegReportingType (442) in Cboe FIX. Indicates the type of Order Execution message. 1=Single-leg instrument 2=Individual leg of multi-leg instrument
     */
    private final MultilegReportingTypeField multilegReportingType = new MultilegReportingTypeField();

    /**
     * Secondary Exec Id
     */
    private final SecondaryExecIdField secondaryExecId = new SecondaryExecIdField();

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
     * Trade Through Alert Type
     */
    private final TradeThroughAlertTypeField tradeThroughAlertType = new TradeThroughAlertTypeField();

    /**
     * Sender Location Id
     */
    private final SenderLocationIdField senderLocationId = new SenderLocationIdField();

    /**
     * Exec Leg Cfi Code
     */
    private final ExecLegCfiCodeField execLegCfiCode = new ExecLegCfiCodeField();

    /**
     * Cross Initiator
     */
    private final CrossInitiatorField crossInitiator = new CrossInitiatorField();

    /**
     * Held
     */
    private final HeldField held = new HeldField();

    /**
     * Trade time
     */
    private final FloorTradeTimeField floorTradeTime = new FloorTradeTimeField();

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
    private final List<Field> fields = List.of(transactionTime, clOrdId, execId, lastShares, lastPx, leavesQty, baseLiquidityIndicator, subLiquidityIndicator, contraBroker, numberOfReturnBitfields, orderExecutionReturnBitfield1, orderExecutionReturnBitfield2, orderExecutionReturnBitfield3, orderExecutionReturnBitfield4, orderExecutionReturnBitfield5, orderExecutionReturnBitfield6, orderExecutionReturnBitfield7, orderExecutionReturnBitfield8, orderExecutionReturnBitfield9, orderExecutionReturnBitfield10, orderExecutionReturnBitfield11, orderExecutionReturnBitfield12, orderExecutionReturnBitfield13, orderExecutionReturnBitfield14, orderExecutionReturnBitfield15, orderExecutionReturnBitfield16, orderExecutionReturnBitfield17, orderExecutionReturnBitfield18, orderExecutionReturnBitfield19, orderExecutionReturnBitfield20, orderExecutionReturnBitfield21, side, priceBinaryPrice, execInst, ordType, timeInForce, minQty, symbolAlphanumeric, capacity, contraTrader, account, clearingFirm, clearingAccount, displayIndicator, maxFloor, orderQtyBinary, preventMatch, maturityDate, strikePrice, putOrCall, openClose, correctedSize, contraCapacity, attributedQuote, feeCode, echoText, stopPx, routingInst, routStrategy, routeDeliveryMethod, exDestination, marketingFeeCode, targetPartyId, auctionId, cmtaNumber, crossType, crossPrioritization, crossId, allocQty, giveUpFirmId, routingFirmId, crossExclusionIndicator, tradeDate, clearingOptionalData, cumQty, dayOrderQty, dayCumQty, avgPx, dayAvgPx, multilegReportingType, secondaryExecId, equityPartyId, clientIdAttr, frequentTraderId, comboOrder, compression, floorDestination, floorRoutingInst, multiClassSprd, orderOrigin, priceType, strategyId, tradeThroughAlertType, senderLocationId, execLegCfiCode, crossInitiator, held, floorTradeTime, crossOnBehalfOfId, stopPxType);

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
     * Corresponds to ExecID (17) in Cboe FIX. Execution ID. Unique across all matching units on a given day. Note: ExecIDs will be represented on ODROP and FIXDROP ports as nine character, base 36 ASCII. Leading zeros should be added if the converted base 36 value is shorter than nine characters. Table 2. Example Conversion Decimal Base 36 28294005440239 A1234B567 76335905726621 R248BC23H 728557228187 09AP05V2Z
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
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
     * Leaves Qty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
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
     * Sub Liquidity Indicator
     *
     * @return the SubLiquidityIndicator field
     */
    public SubLiquidityIndicatorField subLiquidityIndicator() {
        return subLiquidityIndicator;
    }

    /**
     * Corresponds to ContraBroker (375) in Cboe FIX. Simple Instrument Fills Internally matched simple executions will identify the clearing number of the contra on the execution. This includes leg fill reports (MultilegReportingType=2) that are sent as a result of a complex trade. Executions matched on the C1 trading floor will contain a value of ‘FBKR’ for ContraBroker for the first reporter of a Broker to Broker floor trade otherwise, this will identify the OCC clearing number of the contra (C1 only). Complex Package Fills ContraBroker will be sent and populated on electronic, complex package fills (MultilegReportingType=3) when the contra side is also a complex order. When legging in to the simple books ContraBroker will be blank. ContraBroker will be blank on complex package fills (MultilegReportingType=3) executed on the Cboe Options trading floor (C1 only). Routed Fills All externally matched (routed, BaseLiquidityIndicator = X) executions will identify the away exchange with the following possible values. AMEX = Routed to NYSE American ARCA = Routed to NYSE Arca BATS = Routed to Cboe BZX Options BOX = Routed to BOX CBOE = Routed to Cboe Options CTWO = Routed to C2 Options EDGX = Routed to Cboe EDGX Options EMLD = Routed to MIAX Emerald GMNI = Routed to Nasdaq GEMX IEX = Routed to IEX Options ISE = Routed to Nasdaq ISE MEMX = Routed to MEMX MERC = Routed to Nasdaq MRX MIAX = Routed to MIAX Options Exchange MXTO = Routed to MX2 Options NOMX = Routed to Nasdaq NOBX = Routed to Nasdaq Texas PERL = Routed to MIAX PEARL PHLX = Routed to Nasdaq PHLX SPHR = Routed to MIAX Sapphire
     *
     * @return the ContraBroker field
     */
    public ContraBrokerField contraBroker() {
        return contraBroker;
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
     * BitSet OrderExecution byte 1.
     *
     * @return the OrderExecutionReturnBitfield1 field
     */
    public OrderExecutionReturnBitfield1Field orderExecutionReturnBitfield1() {
        return orderExecutionReturnBitfield1;
    }

    /**
     * BitSet OrderExecution byte 2.
     *
     * @return the OrderExecutionReturnBitfield2 field
     */
    public OrderExecutionReturnBitfield2Field orderExecutionReturnBitfield2() {
        return orderExecutionReturnBitfield2;
    }

    /**
     * BitSet OrderExecution byte 3.
     *
     * @return the OrderExecutionReturnBitfield3 field
     */
    public OrderExecutionReturnBitfield3Field orderExecutionReturnBitfield3() {
        return orderExecutionReturnBitfield3;
    }

    /**
     * BitSet OrderExecution byte 4.
     *
     * @return the OrderExecutionReturnBitfield4 field
     */
    public OrderExecutionReturnBitfield4Field orderExecutionReturnBitfield4() {
        return orderExecutionReturnBitfield4;
    }

    /**
     * BitSet OrderExecution byte 5.
     *
     * @return the OrderExecutionReturnBitfield5 field
     */
    public OrderExecutionReturnBitfield5Field orderExecutionReturnBitfield5() {
        return orderExecutionReturnBitfield5;
    }

    /**
     * BitSet OrderExecution byte 6.
     *
     * @return the OrderExecutionReturnBitfield6 field
     */
    public OrderExecutionReturnBitfield6Field orderExecutionReturnBitfield6() {
        return orderExecutionReturnBitfield6;
    }

    /**
     * BitSet OrderExecution byte 7.
     *
     * @return the OrderExecutionReturnBitfield7 field
     */
    public OrderExecutionReturnBitfield7Field orderExecutionReturnBitfield7() {
        return orderExecutionReturnBitfield7;
    }

    /**
     * BitSet OrderExecution byte 8.
     *
     * @return the OrderExecutionReturnBitfield8 field
     */
    public OrderExecutionReturnBitfield8Field orderExecutionReturnBitfield8() {
        return orderExecutionReturnBitfield8;
    }

    /**
     * BitSet OrderExecution byte 9.
     *
     * @return the OrderExecutionReturnBitfield9 field
     */
    public OrderExecutionReturnBitfield9Field orderExecutionReturnBitfield9() {
        return orderExecutionReturnBitfield9;
    }

    /**
     * BitSet OrderExecution byte 10.
     *
     * @return the OrderExecutionReturnBitfield10 field
     */
    public OrderExecutionReturnBitfield10Field orderExecutionReturnBitfield10() {
        return orderExecutionReturnBitfield10;
    }

    /**
     * BitSet OrderExecution byte 11.
     *
     * @return the OrderExecutionReturnBitfield11 field
     */
    public OrderExecutionReturnBitfield11Field orderExecutionReturnBitfield11() {
        return orderExecutionReturnBitfield11;
    }

    /**
     * BitSet OrderExecution byte 12.
     *
     * @return the OrderExecutionReturnBitfield12 field
     */
    public OrderExecutionReturnBitfield12Field orderExecutionReturnBitfield12() {
        return orderExecutionReturnBitfield12;
    }

    /**
     * BitSet OrderExecution byte 13.
     *
     * @return the OrderExecutionReturnBitfield13 field
     */
    public OrderExecutionReturnBitfield13Field orderExecutionReturnBitfield13() {
        return orderExecutionReturnBitfield13;
    }

    /**
     * BitSet OrderExecution byte 14.
     *
     * @return the OrderExecutionReturnBitfield14 field
     */
    public OrderExecutionReturnBitfield14Field orderExecutionReturnBitfield14() {
        return orderExecutionReturnBitfield14;
    }

    /**
     * BitSet OrderExecution byte 15.
     *
     * @return the OrderExecutionReturnBitfield15 field
     */
    public OrderExecutionReturnBitfield15Field orderExecutionReturnBitfield15() {
        return orderExecutionReturnBitfield15;
    }

    /**
     * BitSet OrderExecution byte 16.
     *
     * @return the OrderExecutionReturnBitfield16 field
     */
    public OrderExecutionReturnBitfield16Field orderExecutionReturnBitfield16() {
        return orderExecutionReturnBitfield16;
    }

    /**
     * BitSet OrderExecution byte 17.
     *
     * @return the OrderExecutionReturnBitfield17 field
     */
    public OrderExecutionReturnBitfield17Field orderExecutionReturnBitfield17() {
        return orderExecutionReturnBitfield17;
    }

    /**
     * BitSet OrderExecution byte 18.
     *
     * @return the OrderExecutionReturnBitfield18 field
     */
    public OrderExecutionReturnBitfield18Field orderExecutionReturnBitfield18() {
        return orderExecutionReturnBitfield18;
    }

    /**
     * BitSet OrderExecution byte 19.
     *
     * @return the OrderExecutionReturnBitfield19 field
     */
    public OrderExecutionReturnBitfield19Field orderExecutionReturnBitfield19() {
        return orderExecutionReturnBitfield19;
    }

    /**
     * BitSet OrderExecution byte 20.
     *
     * @return the OrderExecutionReturnBitfield20 field
     */
    public OrderExecutionReturnBitfield20Field orderExecutionReturnBitfield20() {
        return orderExecutionReturnBitfield20;
    }

    /**
     * BitSet OrderExecution byte 21.
     *
     * @return the OrderExecutionReturnBitfield21 field
     */
    public OrderExecutionReturnBitfield21Field orderExecutionReturnBitfield21() {
        return orderExecutionReturnBitfield21;
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
     * Displays the EFID (ClearingFirm) of the contra side firm on all internally matched executions.
     *
     * @return the ContraTrader field
     */
    public ContraTraderField contraTrader() {
        return contraTrader;
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
     * Fee Code
     *
     * @return the FeeCode field
     */
    public FeeCodeField feeCode() {
        return feeCode;
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
     * Corresponds to CrossType (549) in Cboe FIX. Type of auction order being submitted. This indicates the type of auction that will be initiated upon order entry. 1 = Automated Improvement Mechanism (AIM) 2 = Qualified Contingent Cross (QCC) 3 = Solicitation Cross (SAM) 4 = Position Compression Cross (PCC) (C1 Only)
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * Corresponds to CrossPrioritization (550) in Cboe FIX. Indicates which side of the cross order will be prioritized for execution. This identifies the Agency side. 1 = Buy 2 = Sell
     *
     * @return the CrossPrioritization field
     */
    public CrossPrioritizationField crossPrioritization() {
        return crossPrioritization;
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
     * Trade Date
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
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
     * Cum Qty
     *
     * @return the CumQty field
     */
    public CumQtyField cumQty() {
        return cumQty;
    }

    /**
     * Day Order Qty
     *
     * @return the DayOrderQty field
     */
    public DayOrderQtyField dayOrderQty() {
        return dayOrderQty;
    }

    /**
     * Day Cum Qty
     *
     * @return the DayCumQty field
     */
    public DayCumQtyField dayCumQty() {
        return dayCumQty;
    }

    /**
     * Avg Px
     *
     * @return the AvgPx field
     */
    public AvgPxField avgPx() {
        return avgPx;
    }

    /**
     * Day Avg Px
     *
     * @return the DayAvgPx field
     */
    public DayAvgPxField dayAvgPx() {
        return dayAvgPx;
    }

    /**
     * Corresponds to MultilegReportingType (442) in Cboe FIX. Indicates the type of Order Execution message. 1=Single-leg instrument 2=Individual leg of multi-leg instrument
     *
     * @return the MultilegReportingType field
     */
    public MultilegReportingTypeField multilegReportingType() {
        return multilegReportingType;
    }

    /**
     * Secondary Exec Id
     *
     * @return the SecondaryExecId field
     */
    public SecondaryExecIdField secondaryExecId() {
        return secondaryExecId;
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
     * Trade Through Alert Type
     *
     * @return the TradeThroughAlertType field
     */
    public TradeThroughAlertTypeField tradeThroughAlertType() {
        return tradeThroughAlertType;
    }

    /**
     * Sender Location Id
     *
     * @return the SenderLocationId field
     */
    public SenderLocationIdField senderLocationId() {
        return senderLocationId;
    }

    /**
     * Exec Leg Cfi Code
     *
     * @return the ExecLegCfiCode field
     */
    public ExecLegCfiCodeField execLegCfiCode() {
        return execLegCfiCode;
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
     * Trade time
     *
     * @return the FloorTradeTime field
     */
    public FloorTradeTimeField floorTradeTime() {
        return floorTradeTime;
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
     * Returns whether the fields before the OrderExecutionReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield1 is on the wire
     */
    public boolean orderExecutionReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield2 is on the wire
     */
    public boolean orderExecutionReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield3 is on the wire
     */
    public boolean orderExecutionReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield4 is on the wire
     */
    public boolean orderExecutionReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield5 is on the wire
     */
    public boolean orderExecutionReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield6 is on the wire
     */
    public boolean orderExecutionReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield7 is on the wire
     */
    public boolean orderExecutionReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield8 is on the wire
     */
    public boolean orderExecutionReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield9 is on the wire
     */
    public boolean orderExecutionReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield10 is on the wire
     */
    public boolean orderExecutionReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield11 is on the wire
     */
    public boolean orderExecutionReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield12 is on the wire
     */
    public boolean orderExecutionReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield13 is on the wire
     */
    public boolean orderExecutionReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield14 is on the wire
     */
    public boolean orderExecutionReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield15 is on the wire
     */
    public boolean orderExecutionReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield16 is on the wire
     */
    public boolean orderExecutionReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield17 is on the wire
     */
    public boolean orderExecutionReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield18 is on the wire
     */
    public boolean orderExecutionReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield19 is on the wire
     */
    public boolean orderExecutionReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield20 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield20 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield20 is on the wire
     */
    public boolean orderExecutionReturnBitfield20Present() {
        return numberOfReturnBitfields.value() >= 20L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield21 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield21 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield21 is on the wire
     */
    public boolean orderExecutionReturnBitfield21Present() {
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
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionReturnBitfield1Present() && orderExecutionReturnBitfield1.orderExecutionReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the PriceBinaryPrice put it on the wire.
     *
     * <p>Decode reads the PriceBinaryPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceBinaryPrice is on the wire
     */
    public boolean priceBinaryPricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionReturnBitfield1Present() && orderExecutionReturnBitfield1.orderExecutionReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionReturnBitfield1Present() && orderExecutionReturnBitfield1.orderExecutionReturnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionReturnBitfield1Present() && orderExecutionReturnBitfield1.orderExecutionReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionReturnBitfield1Present() && orderExecutionReturnBitfield1.orderExecutionReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionReturnBitfield1Present() && orderExecutionReturnBitfield1.orderExecutionReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderExecutionReturnBitfield2Present() && orderExecutionReturnBitfield2.orderExecutionReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderExecutionReturnBitfield2Present() && orderExecutionReturnBitfield2.orderExecutionReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the ContraTrader put it on the wire.
     *
     * <p>Decode reads the ContraTrader where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ContraTrader is on the wire
     */
    public boolean contraTraderPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderExecutionReturnBitfield2Present() && orderExecutionReturnBitfield2.orderExecutionReturnBitfield2ContraTrader());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3MaxFloor());
    }

    /**
     * Returns whether the fields before the OrderQtyBinary put it on the wire.
     *
     * <p>Decode reads the OrderQtyBinary where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQtyBinary is on the wire
     */
    public boolean orderQtyBinaryPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderExecutionReturnBitfield4Present() && orderExecutionReturnBitfield4.orderExecutionReturnBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the StrikePrice put it on the wire.
     *
     * <p>Decode reads the StrikePrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StrikePrice is on the wire
     */
    public boolean strikePricePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderExecutionReturnBitfield4Present() && orderExecutionReturnBitfield4.orderExecutionReturnBitfield4StrikePrice());
    }

    /**
     * Returns whether the fields before the PutOrCall put it on the wire.
     *
     * <p>Decode reads the PutOrCall where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PutOrCall is on the wire
     */
    public boolean putOrCallPresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderExecutionReturnBitfield4Present() && orderExecutionReturnBitfield4.orderExecutionReturnBitfield4PutOrCall());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderExecutionReturnBitfield4Present() && orderExecutionReturnBitfield4.orderExecutionReturnBitfield4OpenClose());
    }

    /**
     * Returns whether the fields before the CorrectedSize put it on the wire.
     *
     * <p>Decode reads the CorrectedSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CorrectedSize is on the wire
     */
    public boolean correctedSizePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderExecutionReturnBitfield4Present() && orderExecutionReturnBitfield4.orderExecutionReturnBitfield4CorrectedSize());
    }

    /**
     * Returns whether the fields before the ContraCapacity put it on the wire.
     *
     * <p>Decode reads the ContraCapacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ContraCapacity is on the wire
     */
    public boolean contraCapacityPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderExecutionReturnBitfield6Present() && orderExecutionReturnBitfield6.orderExecutionReturnBitfield6ContraCapacity());
    }

    /**
     * Returns whether the fields before the AttributedQuote put it on the wire.
     *
     * <p>Decode reads the AttributedQuote where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AttributedQuote is on the wire
     */
    public boolean attributedQuotePresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderExecutionReturnBitfield6Present() && orderExecutionReturnBitfield6.orderExecutionReturnBitfield6AttributedQuote());
    }

    /**
     * Returns whether the fields before the FeeCode put it on the wire.
     *
     * <p>Decode reads the FeeCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FeeCode is on the wire
     */
    public boolean feeCodePresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionReturnBitfield8Present() && orderExecutionReturnBitfield8.orderExecutionReturnBitfield8FeeCode());
    }

    /**
     * Returns whether the fields before the EchoText put it on the wire.
     *
     * <p>Decode reads the EchoText where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EchoText is on the wire
     */
    public boolean echoTextPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionReturnBitfield8Present() && orderExecutionReturnBitfield8.orderExecutionReturnBitfield8EchoText());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionReturnBitfield8Present() && orderExecutionReturnBitfield8.orderExecutionReturnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionReturnBitfield8Present() && orderExecutionReturnBitfield8.orderExecutionReturnBitfield8RoutingInst());
    }

    /**
     * Returns whether the fields before the RoutStrategy put it on the wire.
     *
     * <p>Decode reads the RoutStrategy where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutStrategy is on the wire
     */
    public boolean routStrategyPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionReturnBitfield8Present() && orderExecutionReturnBitfield8.orderExecutionReturnBitfield8RoutStrategy());
    }

    /**
     * Returns whether the fields before the RouteDeliveryMethod put it on the wire.
     *
     * <p>Decode reads the RouteDeliveryMethod where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RouteDeliveryMethod is on the wire
     */
    public boolean routeDeliveryMethodPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionReturnBitfield8Present() && orderExecutionReturnBitfield8.orderExecutionReturnBitfield8RouteDeliveryMethod());
    }

    /**
     * Returns whether the fields before the ExDestination put it on the wire.
     *
     * <p>Decode reads the ExDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExDestination is on the wire
     */
    public boolean exDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionReturnBitfield8Present() && orderExecutionReturnBitfield8.orderExecutionReturnBitfield8ExDestination());
    }

    /**
     * Returns whether the fields before the MarketingFeeCode put it on the wire.
     *
     * <p>Decode reads the MarketingFeeCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketingFeeCode is on the wire
     */
    public boolean marketingFeeCodePresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderExecutionReturnBitfield9Present() && orderExecutionReturnBitfield9.orderExecutionReturnBitfield9MarketingFeeCode());
    }

    /**
     * Returns whether the fields before the TargetPartyId put it on the wire.
     *
     * <p>Decode reads the TargetPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TargetPartyId is on the wire
     */
    public boolean targetPartyIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderExecutionReturnBitfield9Present() && orderExecutionReturnBitfield9.orderExecutionReturnBitfield9TargetPartyId());
    }

    /**
     * Returns whether the fields before the AuctionId put it on the wire.
     *
     * <p>Decode reads the AuctionId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AuctionId is on the wire
     */
    public boolean auctionIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderExecutionReturnBitfield9Present() && orderExecutionReturnBitfield9.orderExecutionReturnBitfield9AuctionId());
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderExecutionReturnBitfield9Present() && orderExecutionReturnBitfield9.orderExecutionReturnBitfield9CmtaNumber());
    }

    /**
     * Returns whether the fields before the CrossType put it on the wire.
     *
     * <p>Decode reads the CrossType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossType is on the wire
     */
    public boolean crossTypePresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderExecutionReturnBitfield9Present() && orderExecutionReturnBitfield9.orderExecutionReturnBitfield9CrossType());
    }

    /**
     * Returns whether the fields before the CrossPrioritization put it on the wire.
     *
     * <p>Decode reads the CrossPrioritization where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossPrioritization is on the wire
     */
    public boolean crossPrioritizationPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderExecutionReturnBitfield9Present() && orderExecutionReturnBitfield9.orderExecutionReturnBitfield9CrossPrioritization());
    }

    /**
     * Returns whether the fields before the CrossId put it on the wire.
     *
     * <p>Decode reads the CrossId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossId is on the wire
     */
    public boolean crossIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderExecutionReturnBitfield10Present() && orderExecutionReturnBitfield10.orderExecutionReturnBitfield10CrossId());
    }

    /**
     * Returns whether the fields before the AllocQty put it on the wire.
     *
     * <p>Decode reads the AllocQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AllocQty is on the wire
     */
    public boolean allocQtyPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderExecutionReturnBitfield10Present() && orderExecutionReturnBitfield10.orderExecutionReturnBitfield10AllocQty());
    }

    /**
     * Returns whether the fields before the GiveUpFirmId put it on the wire.
     *
     * <p>Decode reads the GiveUpFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the GiveUpFirmId is on the wire
     */
    public boolean giveUpFirmIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderExecutionReturnBitfield10Present() && orderExecutionReturnBitfield10.orderExecutionReturnBitfield10GiveUpFirmId());
    }

    /**
     * Returns whether the fields before the RoutingFirmId put it on the wire.
     *
     * <p>Decode reads the RoutingFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingFirmId is on the wire
     */
    public boolean routingFirmIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderExecutionReturnBitfield10Present() && orderExecutionReturnBitfield10.orderExecutionReturnBitfield10RoutingFirmId());
    }

    /**
     * Returns whether the fields before the CrossExclusionIndicator put it on the wire.
     *
     * <p>Decode reads the CrossExclusionIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossExclusionIndicator is on the wire
     */
    public boolean crossExclusionIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderExecutionReturnBitfield10Present() && orderExecutionReturnBitfield10.orderExecutionReturnBitfield10CrossExclusionIndicator());
    }

    /**
     * Returns whether the fields before the TradeDate put it on the wire.
     *
     * <p>Decode reads the TradeDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeDate is on the wire
     */
    public boolean tradeDatePresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderExecutionReturnBitfield12Present() && orderExecutionReturnBitfield12.orderExecutionReturnBitfield12TradeDate());
    }

    /**
     * Returns whether the fields before the ClearingOptionalData put it on the wire.
     *
     * <p>Decode reads the ClearingOptionalData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingOptionalData is on the wire
     */
    public boolean clearingOptionalDataPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderExecutionReturnBitfield12Present() && orderExecutionReturnBitfield12.orderExecutionReturnBitfield12ClearingOptionalData());
    }

    /**
     * Returns whether the fields before the CumQty put it on the wire.
     *
     * <p>Decode reads the CumQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CumQty is on the wire
     */
    public boolean cumQtyPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderExecutionReturnBitfield13Present() && orderExecutionReturnBitfield13.orderExecutionReturnBitfield13CumQty());
    }

    /**
     * Returns whether the fields before the DayOrderQty put it on the wire.
     *
     * <p>Decode reads the DayOrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DayOrderQty is on the wire
     */
    public boolean dayOrderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderExecutionReturnBitfield13Present() && orderExecutionReturnBitfield13.orderExecutionReturnBitfield13DayOrderQty());
    }

    /**
     * Returns whether the fields before the DayCumQty put it on the wire.
     *
     * <p>Decode reads the DayCumQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DayCumQty is on the wire
     */
    public boolean dayCumQtyPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderExecutionReturnBitfield13Present() && orderExecutionReturnBitfield13.orderExecutionReturnBitfield13DayCumQty());
    }

    /**
     * Returns whether the fields before the AvgPx put it on the wire.
     *
     * <p>Decode reads the AvgPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AvgPx is on the wire
     */
    public boolean avgPxPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderExecutionReturnBitfield13Present() && orderExecutionReturnBitfield13.orderExecutionReturnBitfield13AvgPx());
    }

    /**
     * Returns whether the fields before the DayAvgPx put it on the wire.
     *
     * <p>Decode reads the DayAvgPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DayAvgPx is on the wire
     */
    public boolean dayAvgPxPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderExecutionReturnBitfield13Present() && orderExecutionReturnBitfield13.orderExecutionReturnBitfield13DayAvgPx());
    }

    /**
     * Returns whether the fields before the MultilegReportingType put it on the wire.
     *
     * <p>Decode reads the MultilegReportingType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MultilegReportingType is on the wire
     */
    public boolean multilegReportingTypePresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderExecutionReturnBitfield13Present() && orderExecutionReturnBitfield13.orderExecutionReturnBitfield13MultilegReportingType());
    }

    /**
     * Returns whether the fields before the SecondaryExecId put it on the wire.
     *
     * <p>Decode reads the SecondaryExecId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryExecId is on the wire
     */
    public boolean secondaryExecIdPresent() {
        return (numberOfReturnBitfields.value() >= 14L) && (orderExecutionReturnBitfield14Present() && orderExecutionReturnBitfield14.orderExecutionReturnBitfield14SecondaryExecId());
    }

    /**
     * Returns whether the fields before the EquityPartyId put it on the wire.
     *
     * <p>Decode reads the EquityPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityPartyId is on the wire
     */
    public boolean equityPartyIdPresent() {
        return (numberOfReturnBitfields.value() >= 15L) && (orderExecutionReturnBitfield15Present() && orderExecutionReturnBitfield15.orderExecutionReturnBitfield15EquityPartyId());
    }

    /**
     * Returns whether the fields before the ClientIdAttr put it on the wire.
     *
     * <p>Decode reads the ClientIdAttr where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientIdAttr is on the wire
     */
    public boolean clientIdAttrPresent() {
        return (numberOfReturnBitfields.value() >= 15L) && (orderExecutionReturnBitfield15Present() && orderExecutionReturnBitfield15.orderExecutionReturnBitfield15ClientIdAttr());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderExecutionReturnBitfield16Present() && orderExecutionReturnBitfield16.orderExecutionReturnBitfield16FrequentTraderId());
    }

    /**
     * Returns whether the fields before the ComboOrder put it on the wire.
     *
     * <p>Decode reads the ComboOrder where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComboOrder is on the wire
     */
    public boolean comboOrderPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderExecutionReturnBitfield16Present() && orderExecutionReturnBitfield16.orderExecutionReturnBitfield16ComboOrder());
    }

    /**
     * Returns whether the fields before the Compression put it on the wire.
     *
     * <p>Decode reads the Compression where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Compression is on the wire
     */
    public boolean compressionPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderExecutionReturnBitfield16Present() && orderExecutionReturnBitfield16.orderExecutionReturnBitfield16Compression());
    }

    /**
     * Returns whether the fields before the FloorDestination put it on the wire.
     *
     * <p>Decode reads the FloorDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FloorDestination is on the wire
     */
    public boolean floorDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderExecutionReturnBitfield16Present() && orderExecutionReturnBitfield16.orderExecutionReturnBitfield16FloorDestination());
    }

    /**
     * Returns whether the fields before the FloorRoutingInst put it on the wire.
     *
     * <p>Decode reads the FloorRoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FloorRoutingInst is on the wire
     */
    public boolean floorRoutingInstPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderExecutionReturnBitfield16Present() && orderExecutionReturnBitfield16.orderExecutionReturnBitfield16FloorRoutingInst());
    }

    /**
     * Returns whether the fields before the MultiClassSprd put it on the wire.
     *
     * <p>Decode reads the MultiClassSprd where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MultiClassSprd is on the wire
     */
    public boolean multiClassSprdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderExecutionReturnBitfield16Present() && orderExecutionReturnBitfield16.orderExecutionReturnBitfield16MultiClassSprd());
    }

    /**
     * Returns whether the fields before the OrderOrigin put it on the wire.
     *
     * <p>Decode reads the OrderOrigin where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigin is on the wire
     */
    public boolean orderOriginPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderExecutionReturnBitfield16Present() && orderExecutionReturnBitfield16.orderExecutionReturnBitfield16OrderOrigin());
    }

    /**
     * Returns whether the fields before the PriceType put it on the wire.
     *
     * <p>Decode reads the PriceType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceType is on the wire
     */
    public boolean priceTypePresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderExecutionReturnBitfield17Present() && orderExecutionReturnBitfield17.orderExecutionReturnBitfield17PriceType());
    }

    /**
     * Returns whether the fields before the StrategyId put it on the wire.
     *
     * <p>Decode reads the StrategyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StrategyId is on the wire
     */
    public boolean strategyIdPresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderExecutionReturnBitfield17Present() && orderExecutionReturnBitfield17.orderExecutionReturnBitfield17StrategyId());
    }

    /**
     * Returns whether the fields before the TradeThroughAlertType put it on the wire.
     *
     * <p>Decode reads the TradeThroughAlertType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeThroughAlertType is on the wire
     */
    public boolean tradeThroughAlertTypePresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderExecutionReturnBitfield17Present() && orderExecutionReturnBitfield17.orderExecutionReturnBitfield17TradeThroughAlertType());
    }

    /**
     * Returns whether the fields before the SenderLocationId put it on the wire.
     *
     * <p>Decode reads the SenderLocationId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SenderLocationId is on the wire
     */
    public boolean senderLocationIdPresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderExecutionReturnBitfield17Present() && orderExecutionReturnBitfield17.orderExecutionReturnBitfield17SenderLocationId());
    }

    /**
     * Returns whether the fields before the ExecLegCfiCode put it on the wire.
     *
     * <p>Decode reads the ExecLegCfiCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecLegCfiCode is on the wire
     */
    public boolean execLegCfiCodePresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderExecutionReturnBitfield17Present() && orderExecutionReturnBitfield17.orderExecutionReturnBitfield17ExecLegCfiCode());
    }

    /**
     * Returns whether the fields before the CrossInitiator put it on the wire.
     *
     * <p>Decode reads the CrossInitiator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossInitiator is on the wire
     */
    public boolean crossInitiatorPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderExecutionReturnBitfield18Present() && orderExecutionReturnBitfield18.orderExecutionReturnBitfield18CrossInitiator());
    }

    /**
     * Returns whether the fields before the Held put it on the wire.
     *
     * <p>Decode reads the Held where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Held is on the wire
     */
    public boolean heldPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderExecutionReturnBitfield18Present() && orderExecutionReturnBitfield18.orderExecutionReturnBitfield18Held());
    }

    /**
     * Returns whether the fields before the FloorTradeTime put it on the wire.
     *
     * <p>Decode reads the FloorTradeTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FloorTradeTime is on the wire
     */
    public boolean floorTradeTimePresent() {
        return (numberOfReturnBitfields.value() >= 19L) && (orderExecutionReturnBitfield19Present() && orderExecutionReturnBitfield19.orderExecutionReturnBitfield19FloorTradeTime());
    }

    /**
     * Returns whether the fields before the CrossOnBehalfOfId put it on the wire.
     *
     * <p>Decode reads the CrossOnBehalfOfId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOnBehalfOfId is on the wire
     */
    public boolean crossOnBehalfOfIdPresent() {
        return (numberOfReturnBitfields.value() >= 19L) && (orderExecutionReturnBitfield19Present() && orderExecutionReturnBitfield19.orderExecutionReturnBitfield19CrossOnBehalfOfId());
    }

    /**
     * Returns whether the fields before the StopPxType put it on the wire.
     *
     * <p>Decode reads the StopPxType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPxType is on the wire
     */
    public boolean stopPxTypePresent() {
        return (numberOfReturnBitfields.value() >= 19L) && (orderExecutionReturnBitfield19Present() && orderExecutionReturnBitfield19.orderExecutionReturnBitfield19StopPxType());
    }

    private boolean onWire(Field field) {
        return (field != orderExecutionReturnBitfield1 || orderExecutionReturnBitfield1Present()) && (field != orderExecutionReturnBitfield2 || orderExecutionReturnBitfield2Present()) && (field != orderExecutionReturnBitfield3 || orderExecutionReturnBitfield3Present()) && (field != orderExecutionReturnBitfield4 || orderExecutionReturnBitfield4Present()) && (field != orderExecutionReturnBitfield5 || orderExecutionReturnBitfield5Present()) && (field != orderExecutionReturnBitfield6 || orderExecutionReturnBitfield6Present()) && (field != orderExecutionReturnBitfield7 || orderExecutionReturnBitfield7Present()) && (field != orderExecutionReturnBitfield8 || orderExecutionReturnBitfield8Present()) && (field != orderExecutionReturnBitfield9 || orderExecutionReturnBitfield9Present()) && (field != orderExecutionReturnBitfield10 || orderExecutionReturnBitfield10Present()) && (field != orderExecutionReturnBitfield11 || orderExecutionReturnBitfield11Present()) && (field != orderExecutionReturnBitfield12 || orderExecutionReturnBitfield12Present()) && (field != orderExecutionReturnBitfield13 || orderExecutionReturnBitfield13Present()) && (field != orderExecutionReturnBitfield14 || orderExecutionReturnBitfield14Present()) && (field != orderExecutionReturnBitfield15 || orderExecutionReturnBitfield15Present()) && (field != orderExecutionReturnBitfield16 || orderExecutionReturnBitfield16Present()) && (field != orderExecutionReturnBitfield17 || orderExecutionReturnBitfield17Present()) && (field != orderExecutionReturnBitfield18 || orderExecutionReturnBitfield18Present()) && (field != orderExecutionReturnBitfield19 || orderExecutionReturnBitfield19Present()) && (field != orderExecutionReturnBitfield20 || orderExecutionReturnBitfield20Present()) && (field != orderExecutionReturnBitfield21 || orderExecutionReturnBitfield21Present()) && (field != side || sidePresent()) && (field != priceBinaryPrice || priceBinaryPricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != capacity || capacityPresent()) && (field != contraTrader || contraTraderPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != maxFloor || maxFloorPresent()) && (field != orderQtyBinary || orderQtyBinaryPresent()) && (field != preventMatch || preventMatchPresent()) && (field != maturityDate || maturityDatePresent()) && (field != strikePrice || strikePricePresent()) && (field != putOrCall || putOrCallPresent()) && (field != openClose || openClosePresent()) && (field != correctedSize || correctedSizePresent()) && (field != contraCapacity || contraCapacityPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != feeCode || feeCodePresent()) && (field != echoText || echoTextPresent()) && (field != stopPx || stopPxPresent()) && (field != routingInst || routingInstPresent()) && (field != routStrategy || routStrategyPresent()) && (field != routeDeliveryMethod || routeDeliveryMethodPresent()) && (field != exDestination || exDestinationPresent()) && (field != marketingFeeCode || marketingFeeCodePresent()) && (field != targetPartyId || targetPartyIdPresent()) && (field != auctionId || auctionIdPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != crossType || crossTypePresent()) && (field != crossPrioritization || crossPrioritizationPresent()) && (field != crossId || crossIdPresent()) && (field != allocQty || allocQtyPresent()) && (field != giveUpFirmId || giveUpFirmIdPresent()) && (field != routingFirmId || routingFirmIdPresent()) && (field != crossExclusionIndicator || crossExclusionIndicatorPresent()) && (field != tradeDate || tradeDatePresent()) && (field != clearingOptionalData || clearingOptionalDataPresent()) && (field != cumQty || cumQtyPresent()) && (field != dayOrderQty || dayOrderQtyPresent()) && (field != dayCumQty || dayCumQtyPresent()) && (field != avgPx || avgPxPresent()) && (field != dayAvgPx || dayAvgPxPresent()) && (field != multilegReportingType || multilegReportingTypePresent()) && (field != secondaryExecId || secondaryExecIdPresent()) && (field != equityPartyId || equityPartyIdPresent()) && (field != clientIdAttr || clientIdAttrPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != comboOrder || comboOrderPresent()) && (field != compression || compressionPresent()) && (field != floorDestination || floorDestinationPresent()) && (field != floorRoutingInst || floorRoutingInstPresent()) && (field != multiClassSprd || multiClassSprdPresent()) && (field != orderOrigin || orderOriginPresent()) && (field != priceType || priceTypePresent()) && (field != strategyId || strategyIdPresent()) && (field != tradeThroughAlertType || tradeThroughAlertTypePresent()) && (field != senderLocationId || senderLocationIdPresent()) && (field != execLegCfiCode || execLegCfiCodePresent()) && (field != crossInitiator || crossInitiatorPresent()) && (field != held || heldPresent()) && (field != floorTradeTime || floorTradeTimePresent()) && (field != crossOnBehalfOfId || crossOnBehalfOfIdPresent()) && (field != stopPxType || stopPxTypePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderExecutionReturnBitfield1Present() ? OrderExecutionReturnBitfield1Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield2Present() ? OrderExecutionReturnBitfield2Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield3Present() ? OrderExecutionReturnBitfield3Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield4Present() ? OrderExecutionReturnBitfield4Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield5Present() ? OrderExecutionReturnBitfield5Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield6Present() ? OrderExecutionReturnBitfield6Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield7Present() ? OrderExecutionReturnBitfield7Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield8Present() ? OrderExecutionReturnBitfield8Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield9Present() ? OrderExecutionReturnBitfield9Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield10Present() ? OrderExecutionReturnBitfield10Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield11Present() ? OrderExecutionReturnBitfield11Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield12Present() ? OrderExecutionReturnBitfield12Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield13Present() ? OrderExecutionReturnBitfield13Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield14Present() ? OrderExecutionReturnBitfield14Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield15Present() ? OrderExecutionReturnBitfield15Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield16Present() ? OrderExecutionReturnBitfield16Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield17Present() ? OrderExecutionReturnBitfield17Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield18Present() ? OrderExecutionReturnBitfield18Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield19Present() ? OrderExecutionReturnBitfield19Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield20Present() ? OrderExecutionReturnBitfield20Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield21Present() ? OrderExecutionReturnBitfield21Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (priceBinaryPricePresent() ? PriceBinaryPriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (contraTraderPresent() ? ContraTraderField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (orderQtyBinaryPresent() ? OrderQtyBinaryField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (strikePricePresent() ? StrikePriceField.BYTE_LENGTH : 0) + (putOrCallPresent() ? PutOrCallField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (correctedSizePresent() ? CorrectedSizeField.BYTE_LENGTH : 0) + (contraCapacityPresent() ? ContraCapacityField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (feeCodePresent() ? FeeCodeField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (routStrategyPresent() ? RoutStrategyField.BYTE_LENGTH : 0) + (routeDeliveryMethodPresent() ? RouteDeliveryMethodField.BYTE_LENGTH : 0) + (exDestinationPresent() ? ExDestinationField.BYTE_LENGTH : 0) + (marketingFeeCodePresent() ? MarketingFeeCodeField.BYTE_LENGTH : 0) + (targetPartyIdPresent() ? TargetPartyIdField.BYTE_LENGTH : 0) + (auctionIdPresent() ? AuctionIdField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (crossTypePresent() ? CrossTypeField.BYTE_LENGTH : 0) + (crossPrioritizationPresent() ? CrossPrioritizationField.BYTE_LENGTH : 0) + (crossIdPresent() ? CrossIdField.BYTE_LENGTH : 0) + (allocQtyPresent() ? AllocQtyField.BYTE_LENGTH : 0) + (giveUpFirmIdPresent() ? GiveUpFirmIdField.BYTE_LENGTH : 0) + (routingFirmIdPresent() ? RoutingFirmIdField.BYTE_LENGTH : 0) + (crossExclusionIndicatorPresent() ? CrossExclusionIndicatorField.BYTE_LENGTH : 0) + (tradeDatePresent() ? TradeDateField.BYTE_LENGTH : 0) + (clearingOptionalDataPresent() ? ClearingOptionalDataField.BYTE_LENGTH : 0) + (cumQtyPresent() ? CumQtyField.BYTE_LENGTH : 0) + (dayOrderQtyPresent() ? DayOrderQtyField.BYTE_LENGTH : 0) + (dayCumQtyPresent() ? DayCumQtyField.BYTE_LENGTH : 0) + (avgPxPresent() ? AvgPxField.BYTE_LENGTH : 0) + (dayAvgPxPresent() ? DayAvgPxField.BYTE_LENGTH : 0) + (multilegReportingTypePresent() ? MultilegReportingTypeField.BYTE_LENGTH : 0) + (secondaryExecIdPresent() ? SecondaryExecIdField.BYTE_LENGTH : 0) + (equityPartyIdPresent() ? EquityPartyIdField.BYTE_LENGTH : 0) + (clientIdAttrPresent() ? ClientIdAttrField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (comboOrderPresent() ? ComboOrderField.BYTE_LENGTH : 0) + (compressionPresent() ? CompressionField.BYTE_LENGTH : 0) + (floorDestinationPresent() ? FloorDestinationField.BYTE_LENGTH : 0) + (floorRoutingInstPresent() ? FloorRoutingInstField.BYTE_LENGTH : 0) + (multiClassSprdPresent() ? MultiClassSprdField.BYTE_LENGTH : 0) + (orderOriginPresent() ? OrderOriginField.BYTE_LENGTH : 0) + (priceTypePresent() ? PriceTypeField.BYTE_LENGTH : 0) + (strategyIdPresent() ? StrategyIdField.BYTE_LENGTH : 0) + (tradeThroughAlertTypePresent() ? TradeThroughAlertTypeField.BYTE_LENGTH : 0) + (senderLocationIdPresent() ? SenderLocationIdField.BYTE_LENGTH : 0) + (execLegCfiCodePresent() ? ExecLegCfiCodeField.BYTE_LENGTH : 0) + (crossInitiatorPresent() ? CrossInitiatorField.BYTE_LENGTH : 0) + (heldPresent() ? HeldField.BYTE_LENGTH : 0) + (floorTradeTimePresent() ? FloorTradeTimeField.BYTE_LENGTH : 0) + (crossOnBehalfOfIdPresent() ? CrossOnBehalfOfIdField.BYTE_LENGTH : 0) + (stopPxTypePresent() ? StopPxTypeField.BYTE_LENGTH : 0);
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
        cursor += 4;
        cursor += 8;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (orderExecutionReturnBitfield1Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield2Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield3Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield4Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield5Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield6Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield7Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield8Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield9Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield10Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield11Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield12Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield13Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield14Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield15Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield16Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield17Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield18Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield19Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield20Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield21Present()) {
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
        if (contraTraderPresent()) {
            cursor += 4;
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
        if (contraCapacityPresent()) {
            cursor += 1;
        }
        if (attributedQuotePresent()) {
            cursor += 1;
        }
        if (feeCodePresent()) {
            cursor += 2;
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
        if (crossTypePresent()) {
            cursor += 1;
        }
        if (crossPrioritizationPresent()) {
            cursor += 1;
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
        if (tradeDatePresent()) {
            cursor += 4;
        }
        if (clearingOptionalDataPresent()) {
            cursor += 16;
        }
        if (cumQtyPresent()) {
            cursor += 4;
        }
        if (dayOrderQtyPresent()) {
            cursor += 4;
        }
        if (dayCumQtyPresent()) {
            cursor += 4;
        }
        if (avgPxPresent()) {
            cursor += 8;
        }
        if (dayAvgPxPresent()) {
            cursor += 8;
        }
        if (multilegReportingTypePresent()) {
            cursor += 1;
        }
        if (secondaryExecIdPresent()) {
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
        if (tradeThroughAlertTypePresent()) {
            cursor += 1;
        }
        if (senderLocationIdPresent()) {
            cursor += 1;
        }
        if (execLegCfiCodePresent()) {
            cursor += 6;
        }
        if (crossInitiatorPresent()) {
            cursor += 4;
        }
        if (heldPresent()) {
            cursor += 1;
        }
        if (floorTradeTimePresent()) {
            cursor += 8;
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
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!baseLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        if (!subLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SubLiquidityIndicatorField.BYTE_LENGTH;
        if (!contraBroker.parse(data, cursor)) {
            return false;
        }
        cursor += ContraBrokerField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (orderExecutionReturnBitfield1Present()) {
            if (end - cursor < OrderExecutionReturnBitfield1Field.BYTE_LENGTH || !orderExecutionReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield2Present()) {
            if (end - cursor < OrderExecutionReturnBitfield2Field.BYTE_LENGTH || !orderExecutionReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield3Present()) {
            if (end - cursor < OrderExecutionReturnBitfield3Field.BYTE_LENGTH || !orderExecutionReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield4Present()) {
            if (end - cursor < OrderExecutionReturnBitfield4Field.BYTE_LENGTH || !orderExecutionReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield5Present()) {
            if (end - cursor < OrderExecutionReturnBitfield5Field.BYTE_LENGTH || !orderExecutionReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield6Present()) {
            if (end - cursor < OrderExecutionReturnBitfield6Field.BYTE_LENGTH || !orderExecutionReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield7Present()) {
            if (end - cursor < OrderExecutionReturnBitfield7Field.BYTE_LENGTH || !orderExecutionReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield8Present()) {
            if (end - cursor < OrderExecutionReturnBitfield8Field.BYTE_LENGTH || !orderExecutionReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield9Present()) {
            if (end - cursor < OrderExecutionReturnBitfield9Field.BYTE_LENGTH || !orderExecutionReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield10Present()) {
            if (end - cursor < OrderExecutionReturnBitfield10Field.BYTE_LENGTH || !orderExecutionReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield11Present()) {
            if (end - cursor < OrderExecutionReturnBitfield11Field.BYTE_LENGTH || !orderExecutionReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield12Present()) {
            if (end - cursor < OrderExecutionReturnBitfield12Field.BYTE_LENGTH || !orderExecutionReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield13Present()) {
            if (end - cursor < OrderExecutionReturnBitfield13Field.BYTE_LENGTH || !orderExecutionReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield14Present()) {
            if (end - cursor < OrderExecutionReturnBitfield14Field.BYTE_LENGTH || !orderExecutionReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield15Present()) {
            if (end - cursor < OrderExecutionReturnBitfield15Field.BYTE_LENGTH || !orderExecutionReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield16Present()) {
            if (end - cursor < OrderExecutionReturnBitfield16Field.BYTE_LENGTH || !orderExecutionReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield17Present()) {
            if (end - cursor < OrderExecutionReturnBitfield17Field.BYTE_LENGTH || !orderExecutionReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield18Present()) {
            if (end - cursor < OrderExecutionReturnBitfield18Field.BYTE_LENGTH || !orderExecutionReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield19Present()) {
            if (end - cursor < OrderExecutionReturnBitfield19Field.BYTE_LENGTH || !orderExecutionReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield20Present()) {
            if (end - cursor < OrderExecutionReturnBitfield20Field.BYTE_LENGTH || !orderExecutionReturnBitfield20.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield20Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield21Present()) {
            if (end - cursor < OrderExecutionReturnBitfield21Field.BYTE_LENGTH || !orderExecutionReturnBitfield21.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield21Field.BYTE_LENGTH;
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
        if (contraTraderPresent()) {
            if (end - cursor < ContraTraderField.BYTE_LENGTH || !contraTrader.parse(data, cursor)) {
                return false;
            }
            cursor += ContraTraderField.BYTE_LENGTH;
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
        if (feeCodePresent()) {
            if (end - cursor < FeeCodeField.BYTE_LENGTH || !feeCode.parse(data, cursor)) {
                return false;
            }
            cursor += FeeCodeField.BYTE_LENGTH;
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
        if (crossTypePresent()) {
            if (end - cursor < CrossTypeField.BYTE_LENGTH || !crossType.parse(data, cursor)) {
                return false;
            }
            cursor += CrossTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossPrioritizationPresent()) {
            if (end - cursor < CrossPrioritizationField.BYTE_LENGTH || !crossPrioritization.parse(data, cursor)) {
                return false;
            }
            cursor += CrossPrioritizationField.BYTE_LENGTH;
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
        if (tradeDatePresent()) {
            if (end - cursor < TradeDateField.BYTE_LENGTH || !tradeDate.parse(data, cursor)) {
                return false;
            }
            cursor += TradeDateField.BYTE_LENGTH;
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
        if (cumQtyPresent()) {
            if (end - cursor < CumQtyField.BYTE_LENGTH || !cumQty.parse(data, cursor)) {
                return false;
            }
            cursor += CumQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (dayOrderQtyPresent()) {
            if (end - cursor < DayOrderQtyField.BYTE_LENGTH || !dayOrderQty.parse(data, cursor)) {
                return false;
            }
            cursor += DayOrderQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (dayCumQtyPresent()) {
            if (end - cursor < DayCumQtyField.BYTE_LENGTH || !dayCumQty.parse(data, cursor)) {
                return false;
            }
            cursor += DayCumQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (avgPxPresent()) {
            if (end - cursor < AvgPxField.BYTE_LENGTH || !avgPx.parse(data, cursor)) {
                return false;
            }
            cursor += AvgPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (dayAvgPxPresent()) {
            if (end - cursor < DayAvgPxField.BYTE_LENGTH || !dayAvgPx.parse(data, cursor)) {
                return false;
            }
            cursor += DayAvgPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (multilegReportingTypePresent()) {
            if (end - cursor < MultilegReportingTypeField.BYTE_LENGTH || !multilegReportingType.parse(data, cursor)) {
                return false;
            }
            cursor += MultilegReportingTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (secondaryExecIdPresent()) {
            if (end - cursor < SecondaryExecIdField.BYTE_LENGTH || !secondaryExecId.parse(data, cursor)) {
                return false;
            }
            cursor += SecondaryExecIdField.BYTE_LENGTH;
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
        if (tradeThroughAlertTypePresent()) {
            if (end - cursor < TradeThroughAlertTypeField.BYTE_LENGTH || !tradeThroughAlertType.parse(data, cursor)) {
                return false;
            }
            cursor += TradeThroughAlertTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (senderLocationIdPresent()) {
            if (end - cursor < SenderLocationIdField.BYTE_LENGTH || !senderLocationId.parse(data, cursor)) {
                return false;
            }
            cursor += SenderLocationIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (execLegCfiCodePresent()) {
            if (end - cursor < ExecLegCfiCodeField.BYTE_LENGTH || !execLegCfiCode.parse(data, cursor)) {
                return false;
            }
            cursor += ExecLegCfiCodeField.BYTE_LENGTH;
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
        if (floorTradeTimePresent()) {
            if (end - cursor < FloorTradeTimeField.BYTE_LENGTH || !floorTradeTime.parse(data, cursor)) {
                return false;
            }
            cursor += FloorTradeTimeField.BYTE_LENGTH;
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
        if (orderExecutionReturnBitfield1Present() != orderExecutionReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield1.hasValue() ? "orderExecutionReturnBitfield1 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield2Present() != orderExecutionReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield2.hasValue() ? "orderExecutionReturnBitfield2 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield3Present() != orderExecutionReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield3.hasValue() ? "orderExecutionReturnBitfield3 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield4Present() != orderExecutionReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield4.hasValue() ? "orderExecutionReturnBitfield4 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield5Present() != orderExecutionReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield5.hasValue() ? "orderExecutionReturnBitfield5 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield6Present() != orderExecutionReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield6.hasValue() ? "orderExecutionReturnBitfield6 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield7Present() != orderExecutionReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield7.hasValue() ? "orderExecutionReturnBitfield7 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield8Present() != orderExecutionReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield8.hasValue() ? "orderExecutionReturnBitfield8 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield9Present() != orderExecutionReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield9.hasValue() ? "orderExecutionReturnBitfield9 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield10Present() != orderExecutionReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield10.hasValue() ? "orderExecutionReturnBitfield10 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield11Present() != orderExecutionReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield11.hasValue() ? "orderExecutionReturnBitfield11 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield12Present() != orderExecutionReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield12.hasValue() ? "orderExecutionReturnBitfield12 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield13Present() != orderExecutionReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield13.hasValue() ? "orderExecutionReturnBitfield13 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield14Present() != orderExecutionReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield14.hasValue() ? "orderExecutionReturnBitfield14 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield15Present() != orderExecutionReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield15.hasValue() ? "orderExecutionReturnBitfield15 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield16Present() != orderExecutionReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield16.hasValue() ? "orderExecutionReturnBitfield16 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield17Present() != orderExecutionReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield17.hasValue() ? "orderExecutionReturnBitfield17 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield18Present() != orderExecutionReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield18.hasValue() ? "orderExecutionReturnBitfield18 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield19Present() != orderExecutionReturnBitfield19.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield19.hasValue() ? "orderExecutionReturnBitfield19 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield20Present() != orderExecutionReturnBitfield20.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield20.hasValue() ? "orderExecutionReturnBitfield20 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield20 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield21Present() != orderExecutionReturnBitfield21.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield21.hasValue() ? "orderExecutionReturnBitfield21 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield21 holds no value, though the fields before it put it on the wire");
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
        if (contraTraderPresent() != contraTrader.hasValue()) {
            throw new IllegalStateException(contraTrader.hasValue() ? "contraTrader holds a value the fields before it leave off the wire" : "contraTrader holds no value, though the fields before it put it on the wire");
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
        if (contraCapacityPresent() != contraCapacity.hasValue()) {
            throw new IllegalStateException(contraCapacity.hasValue() ? "contraCapacity holds a value the fields before it leave off the wire" : "contraCapacity holds no value, though the fields before it put it on the wire");
        }
        if (attributedQuotePresent() != attributedQuote.hasValue()) {
            throw new IllegalStateException(attributedQuote.hasValue() ? "attributedQuote holds a value the fields before it leave off the wire" : "attributedQuote holds no value, though the fields before it put it on the wire");
        }
        if (feeCodePresent() != feeCode.hasValue()) {
            throw new IllegalStateException(feeCode.hasValue() ? "feeCode holds a value the fields before it leave off the wire" : "feeCode holds no value, though the fields before it put it on the wire");
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
        if (crossTypePresent() != crossType.hasValue()) {
            throw new IllegalStateException(crossType.hasValue() ? "crossType holds a value the fields before it leave off the wire" : "crossType holds no value, though the fields before it put it on the wire");
        }
        if (crossPrioritizationPresent() != crossPrioritization.hasValue()) {
            throw new IllegalStateException(crossPrioritization.hasValue() ? "crossPrioritization holds a value the fields before it leave off the wire" : "crossPrioritization holds no value, though the fields before it put it on the wire");
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
        if (tradeDatePresent() != tradeDate.hasValue()) {
            throw new IllegalStateException(tradeDate.hasValue() ? "tradeDate holds a value the fields before it leave off the wire" : "tradeDate holds no value, though the fields before it put it on the wire");
        }
        if (clearingOptionalDataPresent() != clearingOptionalData.hasValue()) {
            throw new IllegalStateException(clearingOptionalData.hasValue() ? "clearingOptionalData holds a value the fields before it leave off the wire" : "clearingOptionalData holds no value, though the fields before it put it on the wire");
        }
        if (cumQtyPresent() != cumQty.hasValue()) {
            throw new IllegalStateException(cumQty.hasValue() ? "cumQty holds a value the fields before it leave off the wire" : "cumQty holds no value, though the fields before it put it on the wire");
        }
        if (dayOrderQtyPresent() != dayOrderQty.hasValue()) {
            throw new IllegalStateException(dayOrderQty.hasValue() ? "dayOrderQty holds a value the fields before it leave off the wire" : "dayOrderQty holds no value, though the fields before it put it on the wire");
        }
        if (dayCumQtyPresent() != dayCumQty.hasValue()) {
            throw new IllegalStateException(dayCumQty.hasValue() ? "dayCumQty holds a value the fields before it leave off the wire" : "dayCumQty holds no value, though the fields before it put it on the wire");
        }
        if (avgPxPresent() != avgPx.hasValue()) {
            throw new IllegalStateException(avgPx.hasValue() ? "avgPx holds a value the fields before it leave off the wire" : "avgPx holds no value, though the fields before it put it on the wire");
        }
        if (dayAvgPxPresent() != dayAvgPx.hasValue()) {
            throw new IllegalStateException(dayAvgPx.hasValue() ? "dayAvgPx holds a value the fields before it leave off the wire" : "dayAvgPx holds no value, though the fields before it put it on the wire");
        }
        if (multilegReportingTypePresent() != multilegReportingType.hasValue()) {
            throw new IllegalStateException(multilegReportingType.hasValue() ? "multilegReportingType holds a value the fields before it leave off the wire" : "multilegReportingType holds no value, though the fields before it put it on the wire");
        }
        if (secondaryExecIdPresent() != secondaryExecId.hasValue()) {
            throw new IllegalStateException(secondaryExecId.hasValue() ? "secondaryExecId holds a value the fields before it leave off the wire" : "secondaryExecId holds no value, though the fields before it put it on the wire");
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
        if (tradeThroughAlertTypePresent() != tradeThroughAlertType.hasValue()) {
            throw new IllegalStateException(tradeThroughAlertType.hasValue() ? "tradeThroughAlertType holds a value the fields before it leave off the wire" : "tradeThroughAlertType holds no value, though the fields before it put it on the wire");
        }
        if (senderLocationIdPresent() != senderLocationId.hasValue()) {
            throw new IllegalStateException(senderLocationId.hasValue() ? "senderLocationId holds a value the fields before it leave off the wire" : "senderLocationId holds no value, though the fields before it put it on the wire");
        }
        if (execLegCfiCodePresent() != execLegCfiCode.hasValue()) {
            throw new IllegalStateException(execLegCfiCode.hasValue() ? "execLegCfiCode holds a value the fields before it leave off the wire" : "execLegCfiCode holds no value, though the fields before it put it on the wire");
        }
        if (crossInitiatorPresent() != crossInitiator.hasValue()) {
            throw new IllegalStateException(crossInitiator.hasValue() ? "crossInitiator holds a value the fields before it leave off the wire" : "crossInitiator holds no value, though the fields before it put it on the wire");
        }
        if (heldPresent() != held.hasValue()) {
            throw new IllegalStateException(held.hasValue() ? "held holds a value the fields before it leave off the wire" : "held holds no value, though the fields before it put it on the wire");
        }
        if (floorTradeTimePresent() != floorTradeTime.hasValue()) {
            throw new IllegalStateException(floorTradeTime.hasValue() ? "floorTradeTime holds a value the fields before it leave off the wire" : "floorTradeTime holds no value, though the fields before it put it on the wire");
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
        cursor = execId.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = subLiquidityIndicator.encode(data, cursor);
        cursor = contraBroker.encode(data, cursor);
        if (buffer != null && buffer.length >= 59) {
            System.arraycopy(buffer, 58, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (orderExecutionReturnBitfield1Present()) {
            cursor = orderExecutionReturnBitfield1.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield2Present()) {
            cursor = orderExecutionReturnBitfield2.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield3Present()) {
            cursor = orderExecutionReturnBitfield3.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield4Present()) {
            cursor = orderExecutionReturnBitfield4.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield5Present()) {
            cursor = orderExecutionReturnBitfield5.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield6Present()) {
            cursor = orderExecutionReturnBitfield6.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield7Present()) {
            cursor = orderExecutionReturnBitfield7.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield8Present()) {
            cursor = orderExecutionReturnBitfield8.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield9Present()) {
            cursor = orderExecutionReturnBitfield9.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield10Present()) {
            cursor = orderExecutionReturnBitfield10.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield11Present()) {
            cursor = orderExecutionReturnBitfield11.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield12Present()) {
            cursor = orderExecutionReturnBitfield12.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield13Present()) {
            cursor = orderExecutionReturnBitfield13.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield14Present()) {
            cursor = orderExecutionReturnBitfield14.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield15Present()) {
            cursor = orderExecutionReturnBitfield15.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield16Present()) {
            cursor = orderExecutionReturnBitfield16.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield17Present()) {
            cursor = orderExecutionReturnBitfield17.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield18Present()) {
            cursor = orderExecutionReturnBitfield18.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield19Present()) {
            cursor = orderExecutionReturnBitfield19.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield20Present()) {
            cursor = orderExecutionReturnBitfield20.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield21Present()) {
            cursor = orderExecutionReturnBitfield21.encode(data, cursor);
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
        if (contraTraderPresent()) {
            cursor = contraTrader.encode(data, cursor);
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
        if (contraCapacityPresent()) {
            cursor = contraCapacity.encode(data, cursor);
        }
        if (attributedQuotePresent()) {
            cursor = attributedQuote.encode(data, cursor);
        }
        if (feeCodePresent()) {
            cursor = feeCode.encode(data, cursor);
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
        if (crossTypePresent()) {
            cursor = crossType.encode(data, cursor);
        }
        if (crossPrioritizationPresent()) {
            cursor = crossPrioritization.encode(data, cursor);
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
        if (tradeDatePresent()) {
            cursor = tradeDate.encode(data, cursor);
        }
        if (clearingOptionalDataPresent()) {
            cursor = clearingOptionalData.encode(data, cursor);
        }
        if (cumQtyPresent()) {
            cursor = cumQty.encode(data, cursor);
        }
        if (dayOrderQtyPresent()) {
            cursor = dayOrderQty.encode(data, cursor);
        }
        if (dayCumQtyPresent()) {
            cursor = dayCumQty.encode(data, cursor);
        }
        if (avgPxPresent()) {
            cursor = avgPx.encode(data, cursor);
        }
        if (dayAvgPxPresent()) {
            cursor = dayAvgPx.encode(data, cursor);
        }
        if (multilegReportingTypePresent()) {
            cursor = multilegReportingType.encode(data, cursor);
        }
        if (secondaryExecIdPresent()) {
            cursor = secondaryExecId.encode(data, cursor);
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
        if (tradeThroughAlertTypePresent()) {
            cursor = tradeThroughAlertType.encode(data, cursor);
        }
        if (senderLocationIdPresent()) {
            cursor = senderLocationId.encode(data, cursor);
        }
        if (execLegCfiCodePresent()) {
            cursor = execLegCfiCode.encode(data, cursor);
        }
        if (crossInitiatorPresent()) {
            cursor = crossInitiator.encode(data, cursor);
        }
        if (heldPresent()) {
            cursor = held.encode(data, cursor);
        }
        if (floorTradeTimePresent()) {
            cursor = floorTradeTime.encode(data, cursor);
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
            case "ExecId" -> Optional.of(execId);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPx" -> Optional.of(lastPx);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
            case "ContraBroker" -> Optional.of(contraBroker);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "OrderExecutionReturnBitfield1" -> Optional.of(orderExecutionReturnBitfield1);
            case "OrderExecutionReturnBitfield2" -> Optional.of(orderExecutionReturnBitfield2);
            case "OrderExecutionReturnBitfield3" -> Optional.of(orderExecutionReturnBitfield3);
            case "OrderExecutionReturnBitfield4" -> Optional.of(orderExecutionReturnBitfield4);
            case "OrderExecutionReturnBitfield5" -> Optional.of(orderExecutionReturnBitfield5);
            case "OrderExecutionReturnBitfield6" -> Optional.of(orderExecutionReturnBitfield6);
            case "OrderExecutionReturnBitfield7" -> Optional.of(orderExecutionReturnBitfield7);
            case "OrderExecutionReturnBitfield8" -> Optional.of(orderExecutionReturnBitfield8);
            case "OrderExecutionReturnBitfield9" -> Optional.of(orderExecutionReturnBitfield9);
            case "OrderExecutionReturnBitfield10" -> Optional.of(orderExecutionReturnBitfield10);
            case "OrderExecutionReturnBitfield11" -> Optional.of(orderExecutionReturnBitfield11);
            case "OrderExecutionReturnBitfield12" -> Optional.of(orderExecutionReturnBitfield12);
            case "OrderExecutionReturnBitfield13" -> Optional.of(orderExecutionReturnBitfield13);
            case "OrderExecutionReturnBitfield14" -> Optional.of(orderExecutionReturnBitfield14);
            case "OrderExecutionReturnBitfield15" -> Optional.of(orderExecutionReturnBitfield15);
            case "OrderExecutionReturnBitfield16" -> Optional.of(orderExecutionReturnBitfield16);
            case "OrderExecutionReturnBitfield17" -> Optional.of(orderExecutionReturnBitfield17);
            case "OrderExecutionReturnBitfield18" -> Optional.of(orderExecutionReturnBitfield18);
            case "OrderExecutionReturnBitfield19" -> Optional.of(orderExecutionReturnBitfield19);
            case "OrderExecutionReturnBitfield20" -> Optional.of(orderExecutionReturnBitfield20);
            case "OrderExecutionReturnBitfield21" -> Optional.of(orderExecutionReturnBitfield21);
            case "Side" -> Optional.of(side);
            case "PriceBinaryPrice" -> Optional.of(priceBinaryPrice);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "Capacity" -> Optional.of(capacity);
            case "ContraTrader" -> Optional.of(contraTrader);
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
            case "ContraCapacity" -> Optional.of(contraCapacity);
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "FeeCode" -> Optional.of(feeCode);
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
            case "CrossType" -> Optional.of(crossType);
            case "CrossPrioritization" -> Optional.of(crossPrioritization);
            case "CrossId" -> Optional.of(crossId);
            case "AllocQty" -> Optional.of(allocQty);
            case "GiveUpFirmId" -> Optional.of(giveUpFirmId);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "CrossExclusionIndicator" -> Optional.of(crossExclusionIndicator);
            case "TradeDate" -> Optional.of(tradeDate);
            case "ClearingOptionalData" -> Optional.of(clearingOptionalData);
            case "CumQty" -> Optional.of(cumQty);
            case "DayOrderQty" -> Optional.of(dayOrderQty);
            case "DayCumQty" -> Optional.of(dayCumQty);
            case "AvgPx" -> Optional.of(avgPx);
            case "DayAvgPx" -> Optional.of(dayAvgPx);
            case "MultilegReportingType" -> Optional.of(multilegReportingType);
            case "SecondaryExecId" -> Optional.of(secondaryExecId);
            case "EquityPartyId" -> Optional.of(equityPartyId);
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
            case "TradeThroughAlertType" -> Optional.of(tradeThroughAlertType);
            case "SenderLocationId" -> Optional.of(senderLocationId);
            case "ExecLegCfiCode" -> Optional.of(execLegCfiCode);
            case "CrossInitiator" -> Optional.of(crossInitiator);
            case "Held" -> Optional.of(held);
            case "FloorTradeTime" -> Optional.of(floorTradeTime);
            case "CrossOnBehalfOfId" -> Optional.of(crossOnBehalfOfId);
            case "StopPxType" -> Optional.of(stopPxType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderExecutionMessage message)) {
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
        if (!(other instanceof OrderExecutionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
