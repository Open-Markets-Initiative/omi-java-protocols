package omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.AccountField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.AttributedQuoteField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.AuctionIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.CapacityField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.ClOrdIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.ClearingAccountField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.ClearingFirmField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.ClearingOptionalDataField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.ClientIdAttrField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.CmtaNumberField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.ComboOrderField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.CompressionField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.CustomGroupIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.DisplayRangeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.DrillThruProtectionField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.EquityExDestinationField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.EquityLegShortSellField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.EquityPartyIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.ExecInstField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.ExpireTimeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.FloorDestinationField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.FloorRoutingInstField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.FrequentTraderIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.HeldField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.LegCntField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.MaxFloorField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.OrdTypeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.OrderOriginField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.OrderQtyField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.OrderRouterSubsidyField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.PriceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.PriceTypeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.RoutingFirmIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.RoutingInstField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.ScratchPadField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.SessionEligibilityField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.SideField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.StrategyIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.SymbolField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.TargetPartyIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.TiedHedgeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.TimeInForceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.groups.LegPositionEffectEntry;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.groups.LegPositionEffectList;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.structs.PreventMatch;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.types.Field;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.types.Message;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.types.PrintOptions;

/**
 * Represents the NewComplexOrderMessage message from the BinaryOrderEntry protocol.
 *
 * <p>A New Complex Order message contains the details required to enter an order on a complex instrument created with previously entered New Complex Instrument message request</p>
 */
public final class NewComplexOrderMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 174;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Complex Order Message";

    /**
     * ID chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Order quantity
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * EFID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Corresponds to OnBehalfOfSubID (116) and ClearingAccount (440) in
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

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
     * Entire Cboe format symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * The capacity of the order
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Routing Instruction
     */
    private final RoutingInstField routingInst = new RoutingInstField();

    /**
     * Reflected back on execution reports associated with this order
     */
    private final AccountField account = new AccountField();

    /**
     * Required for TimeInForce = 6 orders, specifies the date-time (in UTC)
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * CMTA Number of the firm that will clear the trade
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * A valid Parent ID of the Directed Market Maker
     */
    private final TargetPartyIdField targetPartyId = new TargetPartyIdField();

    /**
     * Allows for an order to be attributed to a firm's Executing Broker ID in Cboe market data feeds
     */
    private final AttributedQuoteField attributedQuote = new AttributedQuoteField();

    /**
     * Auction order identifier supplied by Cboe
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Used to optionally convey the routing firm of the order
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * Amount sender is willing to trade through the SNBBO
     */
    private final DrillThruProtectionField drillThruProtection = new DrillThruProtectionField();

    /**
     * Used to group orders for use inPurge Ordersmessages where multiple orders can be cancelled by specifying a list of CustomGroupIds
     */
    private final CustomGroupIdField customGroupId = new CustomGroupIdField();

    /**
     * MPID used to clear the equity leg being cleared via the Exchange
     */
    private final EquityPartyIdField equityPartyId = new EquityPartyIdField();

    /**
     * Clearing optional data
     */
    private final ClearingOptionalDataField clearingOptionalData = new ClearingOptionalDataField();

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
     * Portion of OrderQty to display
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Used for random replenishment of reserve orders
     */
    private final DisplayRangeField displayRange = new DisplayRangeField();

    /**
     * Declare the order as a Combo
     */
    private final ComboOrderField comboOrder = new ComboOrderField();

    /**
     * Order is a compression trade
     */
    private final CompressionField compression = new CompressionField();

    /**
     * Valid when an equity symbol is present in the complex instrument
     */
    private final EquityExDestinationField equityExDestination = new EquityExDestinationField();

    /**
     * EquityLegShortSell
     */
    private final EquityLegShortSellField equityLegShortSell = new EquityLegShortSellField();

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
     * Order router subsidy eligibility
     */
    private final OrderRouterSubsidyField orderRouterSubsidy = new OrderRouterSubsidyField();

    /**
     * PriceType
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * Used to declare when a strategy is used
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * Order is a tied hedge
     */
    private final TiedHedgeField tiedHedge = new TiedHedgeField();

    /**
     * Indicates if order should be designated as 'Held' upon order entry
     */
    private final HeldField held = new HeldField();

    /**
     * Field ignored by Cboe (any value is accepted)
     */
    private final ScratchPadField scratchPad = new ScratchPadField();

    /**
     * Number of leg repeating groups in the message
     */
    private final LegCntField legCnt = new LegCntField();

    /**
     * Indicates status of member position in the option leg of a complex order
     */
    private final LegPositionEffectList legPositionEffect = new LegPositionEffectList();

    /**
     * Prevent Match
     */
    private final PreventMatch preventMatch = new PreventMatch();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(clOrdId), List.<Field>of(side), List.<Field>of(orderQty), List.<Field>of(clearingFirm), List.<Field>of(clearingAccount), List.<Field>of(price), List.<Field>of(execInst), List.<Field>of(ordType), List.<Field>of(timeInForce), List.<Field>of(symbol), List.<Field>of(capacity), List.<Field>of(routingInst), List.<Field>of(account), preventMatch.fields(), List.<Field>of(expireTime), List.<Field>of(cmtaNumber), List.<Field>of(targetPartyId), List.<Field>of(attributedQuote), List.<Field>of(auctionId), List.<Field>of(routingFirmId), List.<Field>of(drillThruProtection), List.<Field>of(customGroupId), List.<Field>of(equityPartyId), List.<Field>of(clearingOptionalData), List.<Field>of(clientIdAttr), List.<Field>of(frequentTraderId), List.<Field>of(sessionEligibility), List.<Field>of(maxFloor), List.<Field>of(displayRange), List.<Field>of(comboOrder), List.<Field>of(compression), List.<Field>of(equityExDestination), List.<Field>of(equityLegShortSell), List.<Field>of(floorDestination), List.<Field>of(floorRoutingInst), List.<Field>of(orderOrigin), List.<Field>of(orderRouterSubsidy), List.<Field>of(priceType), List.<Field>of(strategyId), List.<Field>of(tiedHedge), List.<Field>of(held), List.<Field>of(scratchPad), List.<Field>of(legCnt)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID chosen by the client
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
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
     * Order quantity
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
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
     * Routing Instruction
     *
     * @return the RoutingInst field
     */
    public RoutingInstField routingInst() {
        return routingInst;
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
     * Required for TimeInForce = 6 orders, specifies the date-time (in UTC)
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
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
     * A valid Parent ID of the Directed Market Maker
     *
     * @return the TargetPartyId field
     */
    public TargetPartyIdField targetPartyId() {
        return targetPartyId;
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
     * Auction order identifier supplied by Cboe
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
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
     * Amount sender is willing to trade through the SNBBO
     *
     * @return the DrillThruProtection field
     */
    public DrillThruProtectionField drillThruProtection() {
        return drillThruProtection;
    }

    /**
     * Used to group orders for use inPurge Ordersmessages where multiple orders can be cancelled by specifying a list of CustomGroupIds
     *
     * @return the CustomGroupId field
     */
    public CustomGroupIdField customGroupId() {
        return customGroupId;
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
     * Clearing optional data
     *
     * @return the ClearingOptionalData field
     */
    public ClearingOptionalDataField clearingOptionalData() {
        return clearingOptionalData;
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
     * Portion of OrderQty to display
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
    }

    /**
     * Used for random replenishment of reserve orders
     *
     * @return the DisplayRange field
     */
    public DisplayRangeField displayRange() {
        return displayRange;
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
     * Valid when an equity symbol is present in the complex instrument
     *
     * @return the EquityExDestination field
     */
    public EquityExDestinationField equityExDestination() {
        return equityExDestination;
    }

    /**
     * EquityLegShortSell
     *
     * @return the EquityLegShortSell field
     */
    public EquityLegShortSellField equityLegShortSell() {
        return equityLegShortSell;
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
     * Order router subsidy eligibility
     *
     * @return the OrderRouterSubsidy field
     */
    public OrderRouterSubsidyField orderRouterSubsidy() {
        return orderRouterSubsidy;
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
     * Order is a tied hedge
     *
     * @return the TiedHedge field
     */
    public TiedHedgeField tiedHedge() {
        return tiedHedge;
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
     * Field ignored by Cboe (any value is accepted)
     *
     * @return the ScratchPad field
     */
    public ScratchPadField scratchPad() {
        return scratchPad;
    }

    /**
     * Number of leg repeating groups in the message
     *
     * @return the LegCnt field
     */
    public LegCntField legCnt() {
        return legCnt;
    }

    /**
     * Indicates status of member position in the option leg of a complex order
     *
     * <p>Encode writes this list's size to the LegCnt field.</p>
     *
     * @return the LegPositionEffect entries
     */
    public LegPositionEffectList legPositionEffect() {
        return legPositionEffect;
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
        return MINIMUM_BYTE_LENGTH + legPositionEffect.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        return new int[0];
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
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
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!routingInst.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingInstField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!preventMatch.parseFrom(data, cursor, end - 98)) {
            return false;
        }
        cursor += preventMatch.byteLength();
        if (!expireTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireTimeField.BYTE_LENGTH;
        if (!cmtaNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaNumberField.BYTE_LENGTH;
        if (!targetPartyId.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyIdField.BYTE_LENGTH;
        if (!attributedQuote.parse(data, cursor)) {
            return false;
        }
        cursor += AttributedQuoteField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!routingFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingFirmIdField.BYTE_LENGTH;
        if (!drillThruProtection.parse(data, cursor)) {
            return false;
        }
        cursor += DrillThruProtectionField.BYTE_LENGTH;
        if (!customGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdField.BYTE_LENGTH;
        if (!equityPartyId.parse(data, cursor)) {
            return false;
        }
        cursor += EquityPartyIdField.BYTE_LENGTH;
        if (!clearingOptionalData.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingOptionalDataField.BYTE_LENGTH;
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
        if (!maxFloor.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorField.BYTE_LENGTH;
        if (!displayRange.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayRangeField.BYTE_LENGTH;
        if (!comboOrder.parse(data, cursor)) {
            return false;
        }
        cursor += ComboOrderField.BYTE_LENGTH;
        if (!compression.parse(data, cursor)) {
            return false;
        }
        cursor += CompressionField.BYTE_LENGTH;
        if (!equityExDestination.parse(data, cursor)) {
            return false;
        }
        cursor += EquityExDestinationField.BYTE_LENGTH;
        if (!equityLegShortSell.parse(data, cursor)) {
            return false;
        }
        cursor += EquityLegShortSellField.BYTE_LENGTH;
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
        if (!orderRouterSubsidy.parse(data, cursor)) {
            return false;
        }
        cursor += OrderRouterSubsidyField.BYTE_LENGTH;
        if (!priceType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTypeField.BYTE_LENGTH;
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!tiedHedge.parse(data, cursor)) {
            return false;
        }
        cursor += TiedHedgeField.BYTE_LENGTH;
        if (!held.parse(data, cursor)) {
            return false;
        }
        cursor += HeldField.BYTE_LENGTH;
        if (!scratchPad.parse(data, cursor)) {
            return false;
        }
        cursor += ScratchPadField.BYTE_LENGTH;
        if (!legCnt.parse(data, cursor)) {
            return false;
        }
        cursor += LegCntField.BYTE_LENGTH;
        if (!legPositionEffect.parse(data, cursor, end, legCnt.value())) {
            return false;
        }
        cursor += legPositionEffect.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (legPositionEffect.size() > 255) {
            throw new IllegalStateException("legPositionEffect holds " + legPositionEffect.size() + " entries, more than its count field can state");
        }
        legCnt.value((short) legPositionEffect.size());
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = routingInst.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = preventMatch.encode(data, cursor);
        cursor = expireTime.encode(data, cursor);
        cursor = cmtaNumber.encode(data, cursor);
        cursor = targetPartyId.encode(data, cursor);
        cursor = attributedQuote.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = routingFirmId.encode(data, cursor);
        cursor = drillThruProtection.encode(data, cursor);
        cursor = customGroupId.encode(data, cursor);
        cursor = equityPartyId.encode(data, cursor);
        cursor = clearingOptionalData.encode(data, cursor);
        cursor = clientIdAttr.encode(data, cursor);
        cursor = frequentTraderId.encode(data, cursor);
        cursor = sessionEligibility.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = displayRange.encode(data, cursor);
        cursor = comboOrder.encode(data, cursor);
        cursor = compression.encode(data, cursor);
        cursor = equityExDestination.encode(data, cursor);
        cursor = equityLegShortSell.encode(data, cursor);
        cursor = floorDestination.encode(data, cursor);
        cursor = floorRoutingInst.encode(data, cursor);
        cursor = orderOrigin.encode(data, cursor);
        cursor = orderRouterSubsidy.encode(data, cursor);
        cursor = priceType.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = tiedHedge.encode(data, cursor);
        cursor = held.encode(data, cursor);
        cursor = scratchPad.encode(data, cursor);
        cursor = legCnt.encode(data, cursor);
        cursor = legPositionEffect.encode(data, cursor);
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
        preventMatch.clear();
        legPositionEffect.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != legCnt && !field.isRecognized()) {
                return false;
            }
        }
        return legPositionEffect.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != legCnt && !field.isValid()) {
                return false;
            }
        }
        if (!legPositionEffect.isValid()) {
            return false;
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
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!clearingFirm.isDecoded()) {
            return Optional.of(clearingFirm);
        }
        if (!clearingAccount.isDecoded()) {
            return Optional.of(clearingAccount);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!execInst.isDecoded()) {
            return Optional.of(execInst);
        }
        if (!ordType.isDecoded()) {
            return Optional.of(ordType);
        }
        if (!timeInForce.isDecoded()) {
            return Optional.of(timeInForce);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!capacity.isDecoded()) {
            return Optional.of(capacity);
        }
        if (!routingInst.isDecoded()) {
            return Optional.of(routingInst);
        }
        if (!account.isDecoded()) {
            return Optional.of(account);
        }
        if (!preventMatch.isDecoded()) {
            return preventMatch.failedAt();
        }
        if (!expireTime.isDecoded()) {
            return Optional.of(expireTime);
        }
        if (!cmtaNumber.isDecoded()) {
            return Optional.of(cmtaNumber);
        }
        if (!targetPartyId.isDecoded()) {
            return Optional.of(targetPartyId);
        }
        if (!attributedQuote.isDecoded()) {
            return Optional.of(attributedQuote);
        }
        if (!auctionId.isDecoded()) {
            return Optional.of(auctionId);
        }
        if (!routingFirmId.isDecoded()) {
            return Optional.of(routingFirmId);
        }
        if (!drillThruProtection.isDecoded()) {
            return Optional.of(drillThruProtection);
        }
        if (!customGroupId.isDecoded()) {
            return Optional.of(customGroupId);
        }
        if (!equityPartyId.isDecoded()) {
            return Optional.of(equityPartyId);
        }
        if (!clearingOptionalData.isDecoded()) {
            return Optional.of(clearingOptionalData);
        }
        if (!clientIdAttr.isDecoded()) {
            return Optional.of(clientIdAttr);
        }
        if (!frequentTraderId.isDecoded()) {
            return Optional.of(frequentTraderId);
        }
        if (!sessionEligibility.isDecoded()) {
            return Optional.of(sessionEligibility);
        }
        if (!maxFloor.isDecoded()) {
            return Optional.of(maxFloor);
        }
        if (!displayRange.isDecoded()) {
            return Optional.of(displayRange);
        }
        if (!comboOrder.isDecoded()) {
            return Optional.of(comboOrder);
        }
        if (!compression.isDecoded()) {
            return Optional.of(compression);
        }
        if (!equityExDestination.isDecoded()) {
            return Optional.of(equityExDestination);
        }
        if (!equityLegShortSell.isDecoded()) {
            return Optional.of(equityLegShortSell);
        }
        if (!floorDestination.isDecoded()) {
            return Optional.of(floorDestination);
        }
        if (!floorRoutingInst.isDecoded()) {
            return Optional.of(floorRoutingInst);
        }
        if (!orderOrigin.isDecoded()) {
            return Optional.of(orderOrigin);
        }
        if (!orderRouterSubsidy.isDecoded()) {
            return Optional.of(orderRouterSubsidy);
        }
        if (!priceType.isDecoded()) {
            return Optional.of(priceType);
        }
        if (!strategyId.isDecoded()) {
            return Optional.of(strategyId);
        }
        if (!tiedHedge.isDecoded()) {
            return Optional.of(tiedHedge);
        }
        if (!held.isDecoded()) {
            return Optional.of(held);
        }
        if (!scratchPad.isDecoded()) {
            return Optional.of(scratchPad);
        }
        if (!legCnt.isDecoded()) {
            return Optional.of(legCnt);
        }
        if (!legPositionEffect.isDecoded()) {
            return Optional.of(legPositionEffect.failedEntry().flatMap(LegPositionEffectEntry::failedAt).orElse(legCnt));
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
            case "Side" -> Optional.of(side);
            case "OrderQty" -> Optional.of(orderQty);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "Price" -> Optional.of(price);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "Symbol" -> Optional.of(symbol);
            case "Capacity" -> Optional.of(capacity);
            case "RoutingInst" -> Optional.of(routingInst);
            case "Account" -> Optional.of(account);
            case "ExpireTime" -> Optional.of(expireTime);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "TargetPartyId" -> Optional.of(targetPartyId);
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "AuctionId" -> Optional.of(auctionId);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "DrillThruProtection" -> Optional.of(drillThruProtection);
            case "CustomGroupId" -> Optional.of(customGroupId);
            case "EquityPartyId" -> Optional.of(equityPartyId);
            case "ClearingOptionalData" -> Optional.of(clearingOptionalData);
            case "ClientIdAttr" -> Optional.of(clientIdAttr);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "SessionEligibility" -> Optional.of(sessionEligibility);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "DisplayRange" -> Optional.of(displayRange);
            case "ComboOrder" -> Optional.of(comboOrder);
            case "Compression" -> Optional.of(compression);
            case "EquityExDestination" -> Optional.of(equityExDestination);
            case "EquityLegShortSell" -> Optional.of(equityLegShortSell);
            case "FloorDestination" -> Optional.of(floorDestination);
            case "FloorRoutingInst" -> Optional.of(floorRoutingInst);
            case "OrderOrigin" -> Optional.of(orderOrigin);
            case "OrderRouterSubsidy" -> Optional.of(orderRouterSubsidy);
            case "PriceType" -> Optional.of(priceType);
            case "StrategyId" -> Optional.of(strategyId);
            case "TiedHedge" -> Optional.of(tiedHedge);
            case "Held" -> Optional.of(held);
            case "ScratchPad" -> Optional.of(scratchPad);
            case "LegCnt" -> Optional.of(legCnt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewComplexOrderMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(legPositionEffect.diffFields(message.legPositionEffect));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            legPositionEffect.toFormattedString(builder, options);
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
        legPositionEffect.toFormattedString(builder, nested);
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
        if (!(other instanceof NewComplexOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && legPositionEffect.equals(message.legPositionEffect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, legPositionEffect);
    }
}
