package omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.AccountField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.AnonymousField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BasketTradeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BrokerIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BrokerLeiField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BypassField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ClOrdIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.CustomerLeiField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.DisplayIndicatorField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ExDestinationField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ExecInstField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ExpireDateField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ExpireTimeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.FutSettlDateField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.HandlingInstField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.JitneyField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.LeiAlgorithmIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.LeiCustomerAccountField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.LeiOrderOriginField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.LeiRoutingArrangementIndicatorField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.MatchingStateParticipationField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.MaxFloorField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.NcibField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.NoTradeFeatField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.NoTradeKeyField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.NonResidentField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.OrdTypeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.OrderQtyField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.PegDifferenceField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.PriceField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ProgramTradeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.RoutingInstField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SettlementTypeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ShortMarkingExemptField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SideField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.StopPxField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SymbolField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.TimeInForceField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.TrueMinQtyField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.UmirAccountTypeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.UmirRegulationIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.UmirUserIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.Field;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.Message;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.PrintOptions;

/**
 * Represents the NewOrderCaEquitiesV2 message from the OrderEntry protocol.
 *
 * <p>New order V2 message for Cboe Canada Equities, adds PegDifference</p>
 */
public final class NewOrderCaEquitiesV2 implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 261;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Ca Equities V 2";

    /**
     * Reflected back on Execution Reports associated with this order
     */
    private final AccountField account = new AccountField();

    /**
     * Client order identifier
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Identifies the broker
     */
    private final BrokerIdField brokerId = new BrokerIdField();

    /**
     * Execution Instruction for the order
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Handling instruction for the order
     */
    private final HandlingInstField handlingInst = new HandlingInstField();

    /**
     * Number of shares for order
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Order type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Limit Price
     */
    private final PriceField price = new PriceField();

    /**
     * The trigger price for Stop and Stop Limit orders
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Side of the order
     */
    private final SideField side = new SideField();

    /**
     * Symbol (upper case)
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Time in force for the order
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Indicates the settlement period
     */
    private final SettlementTypeField settlementType = new SettlementTypeField();

    /**
     * Specific date of trade settlement
     */
    private final FutSettlDateField futSettlDate = new FutSettlDateField();

    /**
     * Destination book of the order
     */
    private final ExDestinationField exDestination = new ExDestinationField();

    /**
     * Portion of OrderQty to display, used for iceberg orders
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Specifies the UTC Date/Time timestamp that the order expires
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Specifies the date on which a GTD order will expire
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * Identify the type of customer sending the order
     */
    private final LeiOrderOriginField leiOrderOrigin = new LeiOrderOriginField();

    /**
     * Routing arrangement is in place
     */
    private final LeiRoutingArrangementIndicatorField leiRoutingArrangementIndicator = new LeiRoutingArrangementIndicatorField();

    /**
     * The capacity for the order
     */
    private final UmirAccountTypeField umirAccountType = new UmirAccountTypeField();

    /**
     * Identifies the trader responsible for the order, also known as Trader ID
     */
    private final UmirUserIdField umirUserId = new UmirUserIdField();

    /**
     * Identification for order as part of a basket trade
     */
    private final BasketTradeField basketTrade = new BasketTradeField();

    /**
     * Identify this order as part of a program trade
     */
    private final ProgramTradeField programTrade = new ProgramTradeField();

    /**
     * Broker on whose behalf this order is being submitted if different than the executing broker
     */
    private final JitneyField jitney = new JitneyField();

    /**
     * Anonymize this order when trade reporting (Y or N)
     */
    private final AnonymousField anonymous = new AnonymousField();

    /**
     * Reported to feeds, does not affect order handling
     */
    private final UmirRegulationIdField umirRegulationId = new UmirRegulationIdField();

    /**
     * Identifies an order as Non-Resident
     */
    private final NonResidentField nonResident = new NonResidentField();

    /**
     * Identifies an order as eligible to match against the displayed volume only
     */
    private final BypassField bypass = new BypassField();

    /**
     * Identifies Normal Course Issuer Bid orders
     */
    private final NcibField ncib = new NcibField();

    /**
     * Defines how to prevent a self-trade
     */
    private final NoTradeFeatField noTradeFeat = new NoTradeFeatField();

    /**
     * Identifier for self-trade prevention
     */
    private final NoTradeKeyField noTradeKey = new NoTradeKeyField();

    /**
     * Used by regulators to identify directional neutral accounts
     */
    private final ShortMarkingExemptField shortMarkingExempt = new ShortMarkingExemptField();

    /**
     * Account number for clients not eligible to obtain an LEI
     */
    private final LeiCustomerAccountField leiCustomerAccount = new LeiCustomerAccountField();

    /**
     * Unique identifier for the end-client orders automatically generated on a predetermined basis
     */
    private final LeiAlgorithmIdField leiAlgorithmId = new LeiAlgorithmIdField();

    /**
     * LEI for clients eligible to obtain an LEI
     */
    private final CustomerLeiField customerLei = new CustomerLeiField();

    /**
     * Non-PO IIROC Dealer Member (Correspondent Broker)
     */
    private final BrokerLeiField brokerLei = new BrokerLeiField();

    /**
     * Routing instruction for the order
     */
    private final RoutingInstField routingInst = new RoutingInstField();

    /**
     * Display visibility indicator
     */
    private final DisplayIndicatorField displayIndicator = new DisplayIndicatorField();

    /**
     * Indicates which order flow type a Passive Dark order elects to interact with
     */
    private final MatchingStateParticipationField matchingStateParticipation = new MatchingStateParticipationField();

    /**
     * All fills must be at least of size TrueMinQty
     */
    private final TrueMinQtyField trueMinQty = new TrueMinQtyField();

    /**
     * Optional tag for use with Primary Peg orders
     */
    private final PegDifferenceField pegDifference = new PegDifferenceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(account, clOrdId, brokerId, execInst, handlingInst, orderQty, ordType, price, stopPx, side, symbol, timeInForce, settlementType, futSettlDate, exDestination, maxFloor, expireTime, expireDate, leiOrderOrigin, leiRoutingArrangementIndicator, umirAccountType, umirUserId, basketTrade, programTrade, jitney, anonymous, umirRegulationId, nonResident, bypass, ncib, noTradeFeat, noTradeKey, shortMarkingExempt, leiCustomerAccount, leiAlgorithmId, customerLei, brokerLei, routingInst, displayIndicator, matchingStateParticipation, trueMinQty, pegDifference);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Reflected back on Execution Reports associated with this order
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Client order identifier
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Identifies the broker
     *
     * @return the BrokerId field
     */
    public BrokerIdField brokerId() {
        return brokerId;
    }

    /**
     * Execution Instruction for the order
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * Handling instruction for the order
     *
     * @return the HandlingInst field
     */
    public HandlingInstField handlingInst() {
        return handlingInst;
    }

    /**
     * Number of shares for order
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Order type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Limit Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The trigger price for Stop and Stop Limit orders
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Side of the order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Symbol (upper case)
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Time in force for the order
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Indicates the settlement period
     *
     * @return the SettlementType field
     */
    public SettlementTypeField settlementType() {
        return settlementType;
    }

    /**
     * Specific date of trade settlement
     *
     * @return the FutSettlDate field
     */
    public FutSettlDateField futSettlDate() {
        return futSettlDate;
    }

    /**
     * Destination book of the order
     *
     * @return the ExDestination field
     */
    public ExDestinationField exDestination() {
        return exDestination;
    }

    /**
     * Portion of OrderQty to display, used for iceberg orders
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
    }

    /**
     * Specifies the UTC Date/Time timestamp that the order expires
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
    }

    /**
     * Specifies the date on which a GTD order will expire
     *
     * @return the ExpireDate field
     */
    public ExpireDateField expireDate() {
        return expireDate;
    }

    /**
     * Identify the type of customer sending the order
     *
     * @return the LeiOrderOrigin field
     */
    public LeiOrderOriginField leiOrderOrigin() {
        return leiOrderOrigin;
    }

    /**
     * Routing arrangement is in place
     *
     * @return the LeiRoutingArrangementIndicator field
     */
    public LeiRoutingArrangementIndicatorField leiRoutingArrangementIndicator() {
        return leiRoutingArrangementIndicator;
    }

    /**
     * The capacity for the order
     *
     * @return the UmirAccountType field
     */
    public UmirAccountTypeField umirAccountType() {
        return umirAccountType;
    }

    /**
     * Identifies the trader responsible for the order, also known as Trader ID
     *
     * @return the UmirUserId field
     */
    public UmirUserIdField umirUserId() {
        return umirUserId;
    }

    /**
     * Identification for order as part of a basket trade
     *
     * @return the BasketTrade field
     */
    public BasketTradeField basketTrade() {
        return basketTrade;
    }

    /**
     * Identify this order as part of a program trade
     *
     * @return the ProgramTrade field
     */
    public ProgramTradeField programTrade() {
        return programTrade;
    }

    /**
     * Broker on whose behalf this order is being submitted if different than the executing broker
     *
     * @return the Jitney field
     */
    public JitneyField jitney() {
        return jitney;
    }

    /**
     * Anonymize this order when trade reporting (Y or N)
     *
     * @return the Anonymous field
     */
    public AnonymousField anonymous() {
        return anonymous;
    }

    /**
     * Reported to feeds, does not affect order handling
     *
     * @return the UmirRegulationId field
     */
    public UmirRegulationIdField umirRegulationId() {
        return umirRegulationId;
    }

    /**
     * Identifies an order as Non-Resident
     *
     * @return the NonResident field
     */
    public NonResidentField nonResident() {
        return nonResident;
    }

    /**
     * Identifies an order as eligible to match against the displayed volume only
     *
     * @return the Bypass field
     */
    public BypassField bypass() {
        return bypass;
    }

    /**
     * Identifies Normal Course Issuer Bid orders
     *
     * @return the Ncib field
     */
    public NcibField ncib() {
        return ncib;
    }

    /**
     * Defines how to prevent a self-trade
     *
     * @return the NoTradeFeat field
     */
    public NoTradeFeatField noTradeFeat() {
        return noTradeFeat;
    }

    /**
     * Identifier for self-trade prevention
     *
     * @return the NoTradeKey field
     */
    public NoTradeKeyField noTradeKey() {
        return noTradeKey;
    }

    /**
     * Used by regulators to identify directional neutral accounts
     *
     * @return the ShortMarkingExempt field
     */
    public ShortMarkingExemptField shortMarkingExempt() {
        return shortMarkingExempt;
    }

    /**
     * Account number for clients not eligible to obtain an LEI
     *
     * @return the LeiCustomerAccount field
     */
    public LeiCustomerAccountField leiCustomerAccount() {
        return leiCustomerAccount;
    }

    /**
     * Unique identifier for the end-client orders automatically generated on a predetermined basis
     *
     * @return the LeiAlgorithmId field
     */
    public LeiAlgorithmIdField leiAlgorithmId() {
        return leiAlgorithmId;
    }

    /**
     * LEI for clients eligible to obtain an LEI
     *
     * @return the CustomerLei field
     */
    public CustomerLeiField customerLei() {
        return customerLei;
    }

    /**
     * Non-PO IIROC Dealer Member (Correspondent Broker)
     *
     * @return the BrokerLei field
     */
    public BrokerLeiField brokerLei() {
        return brokerLei;
    }

    /**
     * Routing instruction for the order
     *
     * @return the RoutingInst field
     */
    public RoutingInstField routingInst() {
        return routingInst;
    }

    /**
     * Display visibility indicator
     *
     * @return the DisplayIndicator field
     */
    public DisplayIndicatorField displayIndicator() {
        return displayIndicator;
    }

    /**
     * Indicates which order flow type a Passive Dark order elects to interact with
     *
     * @return the MatchingStateParticipation field
     */
    public MatchingStateParticipationField matchingStateParticipation() {
        return matchingStateParticipation;
    }

    /**
     * All fills must be at least of size TrueMinQty
     *
     * @return the TrueMinQty field
     */
    public TrueMinQtyField trueMinQty() {
        return trueMinQty;
    }

    /**
     * Optional tag for use with Primary Peg orders
     *
     * @return the PegDifference field
     */
    public PegDifferenceField pegDifference() {
        return pegDifference;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!brokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerIdField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!handlingInst.parse(data, cursor)) {
            return false;
        }
        cursor += HandlingInstField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!settlementType.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTypeField.BYTE_LENGTH;
        if (!futSettlDate.parse(data, cursor)) {
            return false;
        }
        cursor += FutSettlDateField.BYTE_LENGTH;
        if (!exDestination.parse(data, cursor)) {
            return false;
        }
        cursor += ExDestinationField.BYTE_LENGTH;
        if (!maxFloor.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorField.BYTE_LENGTH;
        if (!expireTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireTimeField.BYTE_LENGTH;
        if (!expireDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateField.BYTE_LENGTH;
        if (!leiOrderOrigin.parse(data, cursor)) {
            return false;
        }
        cursor += LeiOrderOriginField.BYTE_LENGTH;
        if (!leiRoutingArrangementIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LeiRoutingArrangementIndicatorField.BYTE_LENGTH;
        if (!umirAccountType.parse(data, cursor)) {
            return false;
        }
        cursor += UmirAccountTypeField.BYTE_LENGTH;
        if (!umirUserId.parse(data, cursor)) {
            return false;
        }
        cursor += UmirUserIdField.BYTE_LENGTH;
        if (!basketTrade.parse(data, cursor)) {
            return false;
        }
        cursor += BasketTradeField.BYTE_LENGTH;
        if (!programTrade.parse(data, cursor)) {
            return false;
        }
        cursor += ProgramTradeField.BYTE_LENGTH;
        if (!jitney.parse(data, cursor)) {
            return false;
        }
        cursor += JitneyField.BYTE_LENGTH;
        if (!anonymous.parse(data, cursor)) {
            return false;
        }
        cursor += AnonymousField.BYTE_LENGTH;
        if (!umirRegulationId.parse(data, cursor)) {
            return false;
        }
        cursor += UmirRegulationIdField.BYTE_LENGTH;
        if (!nonResident.parse(data, cursor)) {
            return false;
        }
        cursor += NonResidentField.BYTE_LENGTH;
        if (!bypass.parse(data, cursor)) {
            return false;
        }
        cursor += BypassField.BYTE_LENGTH;
        if (!ncib.parse(data, cursor)) {
            return false;
        }
        cursor += NcibField.BYTE_LENGTH;
        if (!noTradeFeat.parse(data, cursor)) {
            return false;
        }
        cursor += NoTradeFeatField.BYTE_LENGTH;
        if (!noTradeKey.parse(data, cursor)) {
            return false;
        }
        cursor += NoTradeKeyField.BYTE_LENGTH;
        if (!shortMarkingExempt.parse(data, cursor)) {
            return false;
        }
        cursor += ShortMarkingExemptField.BYTE_LENGTH;
        if (!leiCustomerAccount.parse(data, cursor)) {
            return false;
        }
        cursor += LeiCustomerAccountField.BYTE_LENGTH;
        if (!leiAlgorithmId.parse(data, cursor)) {
            return false;
        }
        cursor += LeiAlgorithmIdField.BYTE_LENGTH;
        if (!customerLei.parse(data, cursor)) {
            return false;
        }
        cursor += CustomerLeiField.BYTE_LENGTH;
        if (!brokerLei.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerLeiField.BYTE_LENGTH;
        if (!routingInst.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingInstField.BYTE_LENGTH;
        if (!displayIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayIndicatorField.BYTE_LENGTH;
        if (!matchingStateParticipation.parse(data, cursor)) {
            return false;
        }
        cursor += MatchingStateParticipationField.BYTE_LENGTH;
        if (!trueMinQty.parse(data, cursor)) {
            return false;
        }
        cursor += TrueMinQtyField.BYTE_LENGTH;
        return pegDifference.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = account.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = brokerId.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = handlingInst.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = settlementType.encode(data, cursor);
        cursor = futSettlDate.encode(data, cursor);
        cursor = exDestination.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = expireTime.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = leiOrderOrigin.encode(data, cursor);
        cursor = leiRoutingArrangementIndicator.encode(data, cursor);
        cursor = umirAccountType.encode(data, cursor);
        cursor = umirUserId.encode(data, cursor);
        cursor = basketTrade.encode(data, cursor);
        cursor = programTrade.encode(data, cursor);
        cursor = jitney.encode(data, cursor);
        cursor = anonymous.encode(data, cursor);
        cursor = umirRegulationId.encode(data, cursor);
        cursor = nonResident.encode(data, cursor);
        cursor = bypass.encode(data, cursor);
        cursor = ncib.encode(data, cursor);
        cursor = noTradeFeat.encode(data, cursor);
        cursor = noTradeKey.encode(data, cursor);
        cursor = shortMarkingExempt.encode(data, cursor);
        cursor = leiCustomerAccount.encode(data, cursor);
        cursor = leiAlgorithmId.encode(data, cursor);
        cursor = customerLei.encode(data, cursor);
        cursor = brokerLei.encode(data, cursor);
        cursor = routingInst.encode(data, cursor);
        cursor = displayIndicator.encode(data, cursor);
        cursor = matchingStateParticipation.encode(data, cursor);
        cursor = trueMinQty.encode(data, cursor);
        cursor = pegDifference.encode(data, cursor);
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
            case "Account" -> Optional.of(account);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "BrokerId" -> Optional.of(brokerId);
            case "ExecInst" -> Optional.of(execInst);
            case "HandlingInst" -> Optional.of(handlingInst);
            case "OrderQty" -> Optional.of(orderQty);
            case "OrdType" -> Optional.of(ordType);
            case "Price" -> Optional.of(price);
            case "StopPx" -> Optional.of(stopPx);
            case "Side" -> Optional.of(side);
            case "Symbol" -> Optional.of(symbol);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "SettlementType" -> Optional.of(settlementType);
            case "FutSettlDate" -> Optional.of(futSettlDate);
            case "ExDestination" -> Optional.of(exDestination);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "ExpireTime" -> Optional.of(expireTime);
            case "ExpireDate" -> Optional.of(expireDate);
            case "LeiOrderOrigin" -> Optional.of(leiOrderOrigin);
            case "LeiRoutingArrangementIndicator" -> Optional.of(leiRoutingArrangementIndicator);
            case "UmirAccountType" -> Optional.of(umirAccountType);
            case "UmirUserId" -> Optional.of(umirUserId);
            case "BasketTrade" -> Optional.of(basketTrade);
            case "ProgramTrade" -> Optional.of(programTrade);
            case "Jitney" -> Optional.of(jitney);
            case "Anonymous" -> Optional.of(anonymous);
            case "UmirRegulationId" -> Optional.of(umirRegulationId);
            case "NonResident" -> Optional.of(nonResident);
            case "Bypass" -> Optional.of(bypass);
            case "Ncib" -> Optional.of(ncib);
            case "NoTradeFeat" -> Optional.of(noTradeFeat);
            case "NoTradeKey" -> Optional.of(noTradeKey);
            case "ShortMarkingExempt" -> Optional.of(shortMarkingExempt);
            case "LeiCustomerAccount" -> Optional.of(leiCustomerAccount);
            case "LeiAlgorithmId" -> Optional.of(leiAlgorithmId);
            case "CustomerLei" -> Optional.of(customerLei);
            case "BrokerLei" -> Optional.of(brokerLei);
            case "RoutingInst" -> Optional.of(routingInst);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "MatchingStateParticipation" -> Optional.of(matchingStateParticipation);
            case "TrueMinQty" -> Optional.of(trueMinQty);
            case "PegDifference" -> Optional.of(pegDifference);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderCaEquitiesV2 message)) {
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
        if (!(other instanceof NewOrderCaEquitiesV2 message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
