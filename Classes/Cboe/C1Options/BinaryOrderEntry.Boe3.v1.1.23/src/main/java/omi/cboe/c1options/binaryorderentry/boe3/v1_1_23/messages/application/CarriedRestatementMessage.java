package omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.AccountField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.AttributedQuoteField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.AuctionIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.CapacityField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ClOrdIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ClearingAccountField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ClearingFirmField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ClearingOptionalDataField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ClientIdAttrField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.CmtaNumberField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ComboOrderField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.CompressionField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.CumQtyField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.DisplayIndicatorField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.DisplayPriceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.DrillThruProtectionField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.EquityPartyIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ExDestinationField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ExecInstField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ExpireTimeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.FloorDestinationField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.FloorRoutingInstField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.FrequentTraderIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.HeldField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.InFlightField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.LeavesQtyField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.MaturityDateField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.MaxFloorField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.MinQtyField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.OpenCloseField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.OrdTypeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.OrderIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.OrderOriginField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.OrderQtyField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.PriceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.PriceTypeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.PutOrCallField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.RoutStrategyField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.RouteDeliveryMethodField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.RoutingFirmIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.RoutingInstField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.SessionEligibilityField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.SideField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.StopPxField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.StrategyIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.StrikePriceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.SymbolField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.TargetPartyIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.TimeInForceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.TransactionTimeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.WorkingPriceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.structs.PreventMatch;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.Field;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.Message;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.PrintOptions;

/**
 * Represents the CarriedRestatementMessage message from the BinaryOrderEntry protocol.
 *
 * <p>The Carried Restatement message is used to indicate the restoration of a multi-day GTC or GTD order at the start of a new business day</p>
 */
public final class CarriedRestatementMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 240;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Carried Restatement Message";

    /**
     * Total number of messages "in-flight" from the port
     */
    private final InFlightField inFlight = new InFlightField();

    /**
     * The exchange timestamp of the transaction
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * ID chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Order identifier supplied by Cboe
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * ExecInst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * OrdType
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * TimeInForce
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Minimum fill quantity for IOC orders which only interact with liquidity
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Entire Cboe format symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * The capacity of the order
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Reflected back on execution reports associated with this order
     */
    private final AccountField account = new AccountField();

    /**
     * EFID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Corresponds to OnBehalfOfSubID (116) and ClearingAccount (440) in
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * DisplayIndicator
     */
    private final DisplayIndicatorField displayIndicator = new DisplayIndicatorField();

    /**
     * Portion of OrderQty to display
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Order quantity
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * When sending Cboe native symbology, set MaturityDate to zero
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Strike Price for option
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * When sending Cboe native symbology, set PutOrCall to ASCII NUL (0x00)
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Indicates status of member position in the option
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Quantity still open for further execution
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Only present when order is fully or partially booked
     */
    private final DisplayPriceField displayPrice = new DisplayPriceField();

    /**
     * If price had to be adjusted to a less aggressive value for some reason, the adjusted price will be reported here, otherwise equals price
     */
    private final WorkingPriceField workingPrice = new WorkingPriceField();

    /**
     * Required for TimeInForce = 6 orders, specifies the date-time (in UTC)
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Allows for an order to be attributed to a firm's Executing Broker ID in Cboe market data feeds
     */
    private final AttributedQuoteField attributedQuote = new AttributedQuoteField();

    /**
     * Stop price
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Routing Instruction
     */
    private final RoutingInstField routingInst = new RoutingInstField();

    /**
     * Routing Strategy
     */
    private final RoutStrategyField routStrategy = new RoutStrategyField();

    /**
     * RouteDeliveryMethod
     */
    private final RouteDeliveryMethodField routeDeliveryMethod = new RouteDeliveryMethodField();

    /**
     * Used to specify the designated away venue
     */
    private final ExDestinationField exDestination = new ExDestinationField();

    /**
     * A valid Parent ID of the Directed Market Maker
     */
    private final TargetPartyIdField targetPartyId = new TargetPartyIdField();

    /**
     * Auction order identifier supplied by Cboe
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * CMTA Number of the firm that will clear the trade
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * Used to optionally convey the routing firm of the order
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * Clearing optional data
     */
    private final ClearingOptionalDataField clearingOptionalData = new ClearingOptionalDataField();

    /**
     * The total quantity traded by the order
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * Amount sender is willing to trade through the SNBBO
     */
    private final DrillThruProtectionField drillThruProtection = new DrillThruProtectionField();

    /**
     * MPID used to clear the equity leg being cleared via the Exchange
     */
    private final EquityPartyIdField equityPartyId = new EquityPartyIdField();

    /**
     * User defined identifier for quote attribution
     */
    private final ClientIdAttrField clientIdAttr = new ClientIdAttrField();

    /**
     * Identifies the frequent trader program in which the order is participating
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

    /**
     * Session Eligibility
     */
    private final SessionEligibilityField sessionEligibility = new SessionEligibilityField();

    /**
     * Declare the order as a Combo
     */
    private final ComboOrderField comboOrder = new ComboOrderField();

    /**
     * Order is a compression trade
     */
    private final CompressionField compression = new CompressionField();

    /**
     * Specifies a default PAR workstation (ex
     */
    private final FloorDestinationField floorDestination = new FloorDestinationField();

    /**
     * FloorRoutingInst
     */
    private final FloorRoutingInstField floorRoutingInst = new FloorRoutingInstField();

    /**
     * Floor acronym of Market Maker on whose behalf this order is being
     */
    private final OrderOriginField orderOrigin = new OrderOriginField();

    /**
     * PriceType
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * Used to declare when a strategy is used
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * Indicates if order should be designated as 'Held' upon order entry
     */
    private final HeldField held = new HeldField();

    /**
     * Prevent Match
     */
    private final PreventMatch preventMatch = new PreventMatch();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(inFlight), List.<Field>of(transactionTime), List.<Field>of(clOrdId), List.<Field>of(orderId), List.<Field>of(side), List.<Field>of(price), List.<Field>of(execInst), List.<Field>of(ordType), List.<Field>of(timeInForce), List.<Field>of(minQty), List.<Field>of(symbol), List.<Field>of(capacity), List.<Field>of(account), List.<Field>of(clearingFirm), List.<Field>of(clearingAccount), List.<Field>of(displayIndicator), List.<Field>of(maxFloor), List.<Field>of(orderQty), preventMatch.fields(), List.<Field>of(maturityDate), List.<Field>of(strikePrice), List.<Field>of(putOrCall), List.<Field>of(openClose), List.<Field>of(leavesQty), List.<Field>of(displayPrice), List.<Field>of(workingPrice), List.<Field>of(expireTime), List.<Field>of(attributedQuote), List.<Field>of(stopPx), List.<Field>of(routingInst), List.<Field>of(routStrategy), List.<Field>of(routeDeliveryMethod), List.<Field>of(exDestination), List.<Field>of(targetPartyId), List.<Field>of(auctionId), List.<Field>of(cmtaNumber), List.<Field>of(routingFirmId), List.<Field>of(clearingOptionalData), List.<Field>of(cumQty), List.<Field>of(drillThruProtection), List.<Field>of(equityPartyId), List.<Field>of(clientIdAttr), List.<Field>of(frequentTraderId), List.<Field>of(sessionEligibility), List.<Field>of(comboOrder), List.<Field>of(compression), List.<Field>of(floorDestination), List.<Field>of(floorRoutingInst), List.<Field>of(orderOrigin), List.<Field>of(priceType), List.<Field>of(strategyId), List.<Field>of(held)).flatMap(List::stream).toList();

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
     * ID chosen by the client
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Order identifier supplied by Cboe
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
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
     * Limit price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * ExecInst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * OrdType
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * TimeInForce
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Minimum fill quantity for IOC orders which only interact with liquidity
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
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
     * The capacity of the order
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Reflected back on execution reports associated with this order
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * EFID that will clear the trade
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Corresponds to OnBehalfOfSubID (116) and ClearingAccount (440) in
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * DisplayIndicator
     *
     * @return the DisplayIndicator field
     */
    public DisplayIndicatorField displayIndicator() {
        return displayIndicator;
    }

    /**
     * Portion of OrderQty to display
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
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
     * When sending Cboe native symbology, set MaturityDate to zero
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
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
     * When sending Cboe native symbology, set PutOrCall to ASCII NUL (0x00)
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Indicates status of member position in the option
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * Quantity still open for further execution
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Only present when order is fully or partially booked
     *
     * @return the DisplayPrice field
     */
    public DisplayPriceField displayPrice() {
        return displayPrice;
    }

    /**
     * If price had to be adjusted to a less aggressive value for some reason, the adjusted price will be reported here, otherwise equals price
     *
     * @return the WorkingPrice field
     */
    public WorkingPriceField workingPrice() {
        return workingPrice;
    }

    /**
     * Required for TimeInForce = 6 orders, specifies the date-time (in UTC)
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
    }

    /**
     * Allows for an order to be attributed to a firm's Executing Broker ID in Cboe market data feeds
     *
     * @return the AttributedQuote field
     */
    public AttributedQuoteField attributedQuote() {
        return attributedQuote;
    }

    /**
     * Stop price
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Routing Instruction
     *
     * @return the RoutingInst field
     */
    public RoutingInstField routingInst() {
        return routingInst;
    }

    /**
     * Routing Strategy
     *
     * @return the RoutStrategy field
     */
    public RoutStrategyField routStrategy() {
        return routStrategy;
    }

    /**
     * RouteDeliveryMethod
     *
     * @return the RouteDeliveryMethod field
     */
    public RouteDeliveryMethodField routeDeliveryMethod() {
        return routeDeliveryMethod;
    }

    /**
     * Used to specify the designated away venue
     *
     * @return the ExDestination field
     */
    public ExDestinationField exDestination() {
        return exDestination;
    }

    /**
     * A valid Parent ID of the Directed Market Maker
     *
     * @return the TargetPartyId field
     */
    public TargetPartyIdField targetPartyId() {
        return targetPartyId;
    }

    /**
     * Auction order identifier supplied by Cboe
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * CMTA Number of the firm that will clear the trade
     *
     * @return the CmtaNumber field
     */
    public CmtaNumberField cmtaNumber() {
        return cmtaNumber;
    }

    /**
     * Used to optionally convey the routing firm of the order
     *
     * @return the RoutingFirmId field
     */
    public RoutingFirmIdField routingFirmId() {
        return routingFirmId;
    }

    /**
     * Clearing optional data
     *
     * @return the ClearingOptionalData field
     */
    public ClearingOptionalDataField clearingOptionalData() {
        return clearingOptionalData;
    }

    /**
     * The total quantity traded by the order
     *
     * @return the CumQty field
     */
    public CumQtyField cumQty() {
        return cumQty;
    }

    /**
     * Amount sender is willing to trade through the SNBBO
     *
     * @return the DrillThruProtection field
     */
    public DrillThruProtectionField drillThruProtection() {
        return drillThruProtection;
    }

    /**
     * MPID used to clear the equity leg being cleared via the Exchange
     *
     * @return the EquityPartyId field
     */
    public EquityPartyIdField equityPartyId() {
        return equityPartyId;
    }

    /**
     * User defined identifier for quote attribution
     *
     * @return the ClientIdAttr field
     */
    public ClientIdAttrField clientIdAttr() {
        return clientIdAttr;
    }

    /**
     * Identifies the frequent trader program in which the order is participating
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
     * Declare the order as a Combo
     *
     * @return the ComboOrder field
     */
    public ComboOrderField comboOrder() {
        return comboOrder;
    }

    /**
     * Order is a compression trade
     *
     * @return the Compression field
     */
    public CompressionField compression() {
        return compression;
    }

    /**
     * Specifies a default PAR workstation (ex
     *
     * @return the FloorDestination field
     */
    public FloorDestinationField floorDestination() {
        return floorDestination;
    }

    /**
     * FloorRoutingInst
     *
     * @return the FloorRoutingInst field
     */
    public FloorRoutingInstField floorRoutingInst() {
        return floorRoutingInst;
    }

    /**
     * Floor acronym of Market Maker on whose behalf this order is being
     *
     * @return the OrderOrigin field
     */
    public OrderOriginField orderOrigin() {
        return orderOrigin;
    }

    /**
     * PriceType
     *
     * @return the PriceType field
     */
    public PriceTypeField priceType() {
        return priceType;
    }

    /**
     * Used to declare when a strategy is used
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * Indicates if order should be designated as 'Held' upon order entry
     *
     * @return the Held field
     */
    public HeldField held() {
        return held;
    }

    /**
     * Prevent Match
     *
     * @return the PreventMatch record
     */
    public PreventMatch preventMatch() {
        return preventMatch;
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!displayIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayIndicatorField.BYTE_LENGTH;
        if (!maxFloor.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!preventMatch.parseFrom(data, cursor, end - 141)) {
            return false;
        }
        cursor += preventMatch.byteLength();
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!displayPrice.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayPriceField.BYTE_LENGTH;
        if (!workingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += WorkingPriceField.BYTE_LENGTH;
        if (!expireTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireTimeField.BYTE_LENGTH;
        if (!attributedQuote.parse(data, cursor)) {
            return false;
        }
        cursor += AttributedQuoteField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!routingInst.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingInstField.BYTE_LENGTH;
        if (!routStrategy.parse(data, cursor)) {
            return false;
        }
        cursor += RoutStrategyField.BYTE_LENGTH;
        if (!routeDeliveryMethod.parse(data, cursor)) {
            return false;
        }
        cursor += RouteDeliveryMethodField.BYTE_LENGTH;
        if (!exDestination.parse(data, cursor)) {
            return false;
        }
        cursor += ExDestinationField.BYTE_LENGTH;
        if (!targetPartyId.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyIdField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!cmtaNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaNumberField.BYTE_LENGTH;
        if (!routingFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingFirmIdField.BYTE_LENGTH;
        if (!clearingOptionalData.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingOptionalDataField.BYTE_LENGTH;
        if (!cumQty.parse(data, cursor)) {
            return false;
        }
        cursor += CumQtyField.BYTE_LENGTH;
        if (!drillThruProtection.parse(data, cursor)) {
            return false;
        }
        cursor += DrillThruProtectionField.BYTE_LENGTH;
        if (!equityPartyId.parse(data, cursor)) {
            return false;
        }
        cursor += EquityPartyIdField.BYTE_LENGTH;
        if (!clientIdAttr.parse(data, cursor)) {
            return false;
        }
        cursor += ClientIdAttrField.BYTE_LENGTH;
        if (!frequentTraderId.parse(data, cursor)) {
            return false;
        }
        cursor += FrequentTraderIdField.BYTE_LENGTH;
        if (!sessionEligibility.parse(data, cursor)) {
            return false;
        }
        cursor += SessionEligibilityField.BYTE_LENGTH;
        if (!comboOrder.parse(data, cursor)) {
            return false;
        }
        cursor += ComboOrderField.BYTE_LENGTH;
        if (!compression.parse(data, cursor)) {
            return false;
        }
        cursor += CompressionField.BYTE_LENGTH;
        if (!floorDestination.parse(data, cursor)) {
            return false;
        }
        cursor += FloorDestinationField.BYTE_LENGTH;
        if (!floorRoutingInst.parse(data, cursor)) {
            return false;
        }
        cursor += FloorRoutingInstField.BYTE_LENGTH;
        if (!orderOrigin.parse(data, cursor)) {
            return false;
        }
        cursor += OrderOriginField.BYTE_LENGTH;
        if (!priceType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTypeField.BYTE_LENGTH;
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        return held.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = inFlight.encode(data, cursor);
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = displayIndicator.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = preventMatch.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = displayPrice.encode(data, cursor);
        cursor = workingPrice.encode(data, cursor);
        cursor = expireTime.encode(data, cursor);
        cursor = attributedQuote.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = routingInst.encode(data, cursor);
        cursor = routStrategy.encode(data, cursor);
        cursor = routeDeliveryMethod.encode(data, cursor);
        cursor = exDestination.encode(data, cursor);
        cursor = targetPartyId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = cmtaNumber.encode(data, cursor);
        cursor = routingFirmId.encode(data, cursor);
        cursor = clearingOptionalData.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = drillThruProtection.encode(data, cursor);
        cursor = equityPartyId.encode(data, cursor);
        cursor = clientIdAttr.encode(data, cursor);
        cursor = frequentTraderId.encode(data, cursor);
        cursor = sessionEligibility.encode(data, cursor);
        cursor = comboOrder.encode(data, cursor);
        cursor = compression.encode(data, cursor);
        cursor = floorDestination.encode(data, cursor);
        cursor = floorRoutingInst.encode(data, cursor);
        cursor = orderOrigin.encode(data, cursor);
        cursor = priceType.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = held.encode(data, cursor);
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
        preventMatch.clear();
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderId" -> Optional.of(orderId);
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "Symbol" -> Optional.of(symbol);
            case "Capacity" -> Optional.of(capacity);
            case "Account" -> Optional.of(account);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "OrderQty" -> Optional.of(orderQty);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "OpenClose" -> Optional.of(openClose);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "DisplayPrice" -> Optional.of(displayPrice);
            case "WorkingPrice" -> Optional.of(workingPrice);
            case "ExpireTime" -> Optional.of(expireTime);
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "StopPx" -> Optional.of(stopPx);
            case "RoutingInst" -> Optional.of(routingInst);
            case "RoutStrategy" -> Optional.of(routStrategy);
            case "RouteDeliveryMethod" -> Optional.of(routeDeliveryMethod);
            case "ExDestination" -> Optional.of(exDestination);
            case "TargetPartyId" -> Optional.of(targetPartyId);
            case "AuctionId" -> Optional.of(auctionId);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "ClearingOptionalData" -> Optional.of(clearingOptionalData);
            case "CumQty" -> Optional.of(cumQty);
            case "DrillThruProtection" -> Optional.of(drillThruProtection);
            case "EquityPartyId" -> Optional.of(equityPartyId);
            case "ClientIdAttr" -> Optional.of(clientIdAttr);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "SessionEligibility" -> Optional.of(sessionEligibility);
            case "ComboOrder" -> Optional.of(comboOrder);
            case "Compression" -> Optional.of(compression);
            case "FloorDestination" -> Optional.of(floorDestination);
            case "FloorRoutingInst" -> Optional.of(floorRoutingInst);
            case "OrderOrigin" -> Optional.of(orderOrigin);
            case "PriceType" -> Optional.of(priceType);
            case "StrategyId" -> Optional.of(strategyId);
            case "Held" -> Optional.of(held);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CarriedRestatementMessage message)) {
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
        if (!(other instanceof CarriedRestatementMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
