package omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BasketTradeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BrokerIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BuyAccountField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BuyBrokerLeiField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BuyCustomerLeiField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BuyJitneyField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BuyLeiAlgorithmIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BuyLeiCustomerAccountField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BuyLeiOrderOriginField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BuyLeiRoutingArrangemeantIndicatorField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BuyUmirAccountTypeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BuyUmirRegulationIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BypassField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.CrossClOrdIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.CrossSideField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.CrossTypeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.FutSettlDateField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.NcibField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.NonResidentField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.OrderQtyField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.PriceField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ProgramTradeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SellAccountField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SellBrokerLeiField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SellCustomerLeiField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SellJitneyField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SellLeiAlgorithmIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SellLeiCustomerAccountField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SellLeiOrderOriginField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SellLeiRoutingArrangementIndicatorField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SellUmirAccountTypeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SellUmirRegulationIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SettlementTypeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ShortMarkingExemptField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SymbolField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.UmirUserIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.Field;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.Message;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.PrintOptions;

/**
 * Represents the NewOrderCrossCaEquitiesV1 message from the OrderEntry protocol.
 *
 * <p>New Order Cross message for pre-arranged two-sided trades</p>
 */
public final class NewOrderCrossCaEquitiesV1 implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 342;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Cross Ca Equities V 1";

    /**
     * Identifies the broker
     */
    private final BrokerIdField brokerId = new BrokerIdField();

    /**
     * Client order identifier for a New Order Cross
     */
    private final CrossClOrdIdField crossClOrdId = new CrossClOrdIdField();

    /**
     * Identifies the type of cross being printed
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * Limit Price
     */
    private final PriceField price = new PriceField();

    /**
     * Number of shares for order
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Symbol (upper case)
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Indicates the settlement period
     */
    private final SettlementTypeField settlementType = new SettlementTypeField();

    /**
     * Specific date of trade settlement
     */
    private final FutSettlDateField futSettlDate = new FutSettlDateField();

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
     * Side for a New Order Cross
     */
    private final CrossSideField crossSide = new CrossSideField();

    /**
     * Used by regulators to identify directional neutral accounts
     */
    private final ShortMarkingExemptField shortMarkingExempt = new ShortMarkingExemptField();

    /**
     * UMIRAccountType for Buy side
     */
    private final BuyUmirAccountTypeField buyUmirAccountType = new BuyUmirAccountTypeField();

    /**
     * Account for Buy side of New Order Cross
     */
    private final BuyAccountField buyAccount = new BuyAccountField();

    /**
     * UMIRRegulationID for Buy side
     */
    private final BuyUmirRegulationIdField buyUmirRegulationId = new BuyUmirRegulationIdField();

    /**
     * Jitney for Buy side
     */
    private final BuyJitneyField buyJitney = new BuyJitneyField();

    /**
     * LEICustomerAccount for Buy side
     */
    private final BuyLeiCustomerAccountField buyLeiCustomerAccount = new BuyLeiCustomerAccountField();

    /**
     * LEIAlgorithmID for Buy side
     */
    private final BuyLeiAlgorithmIdField buyLeiAlgorithmId = new BuyLeiAlgorithmIdField();

    /**
     * CustomerLEI for Buy side
     */
    private final BuyCustomerLeiField buyCustomerLei = new BuyCustomerLeiField();

    /**
     * BrokerLEI for Buy side
     */
    private final BuyBrokerLeiField buyBrokerLei = new BuyBrokerLeiField();

    /**
     * LEIOrderOrigin for Buy side
     */
    private final BuyLeiOrderOriginField buyLeiOrderOrigin = new BuyLeiOrderOriginField();

    /**
     * LEIRoutingArrangementIndicator for Buy side (V1 typo)
     */
    private final BuyLeiRoutingArrangemeantIndicatorField buyLeiRoutingArrangemeantIndicator = new BuyLeiRoutingArrangemeantIndicatorField();

    /**
     * UMIRAccountType for Sell side
     */
    private final SellUmirAccountTypeField sellUmirAccountType = new SellUmirAccountTypeField();

    /**
     * Account for Sell side of New Order Cross
     */
    private final SellAccountField sellAccount = new SellAccountField();

    /**
     * UMIRRegulationID for Sell side
     */
    private final SellUmirRegulationIdField sellUmirRegulationId = new SellUmirRegulationIdField();

    /**
     * Jitney for Sell side
     */
    private final SellJitneyField sellJitney = new SellJitneyField();

    /**
     * LEICustomerAccount for Sell side
     */
    private final SellLeiCustomerAccountField sellLeiCustomerAccount = new SellLeiCustomerAccountField();

    /**
     * LEIAlgorithmID for Sell side
     */
    private final SellLeiAlgorithmIdField sellLeiAlgorithmId = new SellLeiAlgorithmIdField();

    /**
     * CustomerLEI for Sell side
     */
    private final SellCustomerLeiField sellCustomerLei = new SellCustomerLeiField();

    /**
     * BrokerLEI for Sell side
     */
    private final SellBrokerLeiField sellBrokerLei = new SellBrokerLeiField();

    /**
     * LEIOrderOrigin for Sell side
     */
    private final SellLeiOrderOriginField sellLeiOrderOrigin = new SellLeiOrderOriginField();

    /**
     * LEIRoutingArrangementIndicator for Sell side
     */
    private final SellLeiRoutingArrangementIndicatorField sellLeiRoutingArrangementIndicator = new SellLeiRoutingArrangementIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(brokerId, crossClOrdId, crossType, price, orderQty, symbol, settlementType, futSettlDate, umirUserId, basketTrade, programTrade, nonResident, bypass, ncib, crossSide, shortMarkingExempt, buyUmirAccountType, buyAccount, buyUmirRegulationId, buyJitney, buyLeiCustomerAccount, buyLeiAlgorithmId, buyCustomerLei, buyBrokerLei, buyLeiOrderOrigin, buyLeiRoutingArrangemeantIndicator, sellUmirAccountType, sellAccount, sellUmirRegulationId, sellJitney, sellLeiCustomerAccount, sellLeiAlgorithmId, sellCustomerLei, sellBrokerLei, sellLeiOrderOrigin, sellLeiRoutingArrangementIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identifies the broker
     *
     * @return the BrokerId field
     */
    public BrokerIdField brokerId() {
        return brokerId;
    }

    /**
     * Client order identifier for a New Order Cross
     *
     * @return the CrossClOrdId field
     */
    public CrossClOrdIdField crossClOrdId() {
        return crossClOrdId;
    }

    /**
     * Identifies the type of cross being printed
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
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
     * Number of shares for order
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
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
     * Side for a New Order Cross
     *
     * @return the CrossSide field
     */
    public CrossSideField crossSide() {
        return crossSide;
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
     * UMIRAccountType for Buy side
     *
     * @return the BuyUmirAccountType field
     */
    public BuyUmirAccountTypeField buyUmirAccountType() {
        return buyUmirAccountType;
    }

    /**
     * Account for Buy side of New Order Cross
     *
     * @return the BuyAccount field
     */
    public BuyAccountField buyAccount() {
        return buyAccount;
    }

    /**
     * UMIRRegulationID for Buy side
     *
     * @return the BuyUmirRegulationId field
     */
    public BuyUmirRegulationIdField buyUmirRegulationId() {
        return buyUmirRegulationId;
    }

    /**
     * Jitney for Buy side
     *
     * @return the BuyJitney field
     */
    public BuyJitneyField buyJitney() {
        return buyJitney;
    }

    /**
     * LEICustomerAccount for Buy side
     *
     * @return the BuyLeiCustomerAccount field
     */
    public BuyLeiCustomerAccountField buyLeiCustomerAccount() {
        return buyLeiCustomerAccount;
    }

    /**
     * LEIAlgorithmID for Buy side
     *
     * @return the BuyLeiAlgorithmId field
     */
    public BuyLeiAlgorithmIdField buyLeiAlgorithmId() {
        return buyLeiAlgorithmId;
    }

    /**
     * CustomerLEI for Buy side
     *
     * @return the BuyCustomerLei field
     */
    public BuyCustomerLeiField buyCustomerLei() {
        return buyCustomerLei;
    }

    /**
     * BrokerLEI for Buy side
     *
     * @return the BuyBrokerLei field
     */
    public BuyBrokerLeiField buyBrokerLei() {
        return buyBrokerLei;
    }

    /**
     * LEIOrderOrigin for Buy side
     *
     * @return the BuyLeiOrderOrigin field
     */
    public BuyLeiOrderOriginField buyLeiOrderOrigin() {
        return buyLeiOrderOrigin;
    }

    /**
     * LEIRoutingArrangementIndicator for Buy side (V1 typo)
     *
     * @return the BuyLeiRoutingArrangemeantIndicator field
     */
    public BuyLeiRoutingArrangemeantIndicatorField buyLeiRoutingArrangemeantIndicator() {
        return buyLeiRoutingArrangemeantIndicator;
    }

    /**
     * UMIRAccountType for Sell side
     *
     * @return the SellUmirAccountType field
     */
    public SellUmirAccountTypeField sellUmirAccountType() {
        return sellUmirAccountType;
    }

    /**
     * Account for Sell side of New Order Cross
     *
     * @return the SellAccount field
     */
    public SellAccountField sellAccount() {
        return sellAccount;
    }

    /**
     * UMIRRegulationID for Sell side
     *
     * @return the SellUmirRegulationId field
     */
    public SellUmirRegulationIdField sellUmirRegulationId() {
        return sellUmirRegulationId;
    }

    /**
     * Jitney for Sell side
     *
     * @return the SellJitney field
     */
    public SellJitneyField sellJitney() {
        return sellJitney;
    }

    /**
     * LEICustomerAccount for Sell side
     *
     * @return the SellLeiCustomerAccount field
     */
    public SellLeiCustomerAccountField sellLeiCustomerAccount() {
        return sellLeiCustomerAccount;
    }

    /**
     * LEIAlgorithmID for Sell side
     *
     * @return the SellLeiAlgorithmId field
     */
    public SellLeiAlgorithmIdField sellLeiAlgorithmId() {
        return sellLeiAlgorithmId;
    }

    /**
     * CustomerLEI for Sell side
     *
     * @return the SellCustomerLei field
     */
    public SellCustomerLeiField sellCustomerLei() {
        return sellCustomerLei;
    }

    /**
     * BrokerLEI for Sell side
     *
     * @return the SellBrokerLei field
     */
    public SellBrokerLeiField sellBrokerLei() {
        return sellBrokerLei;
    }

    /**
     * LEIOrderOrigin for Sell side
     *
     * @return the SellLeiOrderOrigin field
     */
    public SellLeiOrderOriginField sellLeiOrderOrigin() {
        return sellLeiOrderOrigin;
    }

    /**
     * LEIRoutingArrangementIndicator for Sell side
     *
     * @return the SellLeiRoutingArrangementIndicator field
     */
    public SellLeiRoutingArrangementIndicatorField sellLeiRoutingArrangementIndicator() {
        return sellLeiRoutingArrangementIndicator;
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
        if (!brokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerIdField.BYTE_LENGTH;
        if (!crossClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossClOrdIdField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!settlementType.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTypeField.BYTE_LENGTH;
        if (!futSettlDate.parse(data, cursor)) {
            return false;
        }
        cursor += FutSettlDateField.BYTE_LENGTH;
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
        if (!crossSide.parse(data, cursor)) {
            return false;
        }
        cursor += CrossSideField.BYTE_LENGTH;
        if (!shortMarkingExempt.parse(data, cursor)) {
            return false;
        }
        cursor += ShortMarkingExemptField.BYTE_LENGTH;
        if (!buyUmirAccountType.parse(data, cursor)) {
            return false;
        }
        cursor += BuyUmirAccountTypeField.BYTE_LENGTH;
        if (!buyAccount.parse(data, cursor)) {
            return false;
        }
        cursor += BuyAccountField.BYTE_LENGTH;
        if (!buyUmirRegulationId.parse(data, cursor)) {
            return false;
        }
        cursor += BuyUmirRegulationIdField.BYTE_LENGTH;
        if (!buyJitney.parse(data, cursor)) {
            return false;
        }
        cursor += BuyJitneyField.BYTE_LENGTH;
        if (!buyLeiCustomerAccount.parse(data, cursor)) {
            return false;
        }
        cursor += BuyLeiCustomerAccountField.BYTE_LENGTH;
        if (!buyLeiAlgorithmId.parse(data, cursor)) {
            return false;
        }
        cursor += BuyLeiAlgorithmIdField.BYTE_LENGTH;
        if (!buyCustomerLei.parse(data, cursor)) {
            return false;
        }
        cursor += BuyCustomerLeiField.BYTE_LENGTH;
        if (!buyBrokerLei.parse(data, cursor)) {
            return false;
        }
        cursor += BuyBrokerLeiField.BYTE_LENGTH;
        if (!buyLeiOrderOrigin.parse(data, cursor)) {
            return false;
        }
        cursor += BuyLeiOrderOriginField.BYTE_LENGTH;
        if (!buyLeiRoutingArrangemeantIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BuyLeiRoutingArrangemeantIndicatorField.BYTE_LENGTH;
        if (!sellUmirAccountType.parse(data, cursor)) {
            return false;
        }
        cursor += SellUmirAccountTypeField.BYTE_LENGTH;
        if (!sellAccount.parse(data, cursor)) {
            return false;
        }
        cursor += SellAccountField.BYTE_LENGTH;
        if (!sellUmirRegulationId.parse(data, cursor)) {
            return false;
        }
        cursor += SellUmirRegulationIdField.BYTE_LENGTH;
        if (!sellJitney.parse(data, cursor)) {
            return false;
        }
        cursor += SellJitneyField.BYTE_LENGTH;
        if (!sellLeiCustomerAccount.parse(data, cursor)) {
            return false;
        }
        cursor += SellLeiCustomerAccountField.BYTE_LENGTH;
        if (!sellLeiAlgorithmId.parse(data, cursor)) {
            return false;
        }
        cursor += SellLeiAlgorithmIdField.BYTE_LENGTH;
        if (!sellCustomerLei.parse(data, cursor)) {
            return false;
        }
        cursor += SellCustomerLeiField.BYTE_LENGTH;
        if (!sellBrokerLei.parse(data, cursor)) {
            return false;
        }
        cursor += SellBrokerLeiField.BYTE_LENGTH;
        if (!sellLeiOrderOrigin.parse(data, cursor)) {
            return false;
        }
        cursor += SellLeiOrderOriginField.BYTE_LENGTH;
        return sellLeiRoutingArrangementIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = brokerId.encode(data, cursor);
        cursor = crossClOrdId.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = settlementType.encode(data, cursor);
        cursor = futSettlDate.encode(data, cursor);
        cursor = umirUserId.encode(data, cursor);
        cursor = basketTrade.encode(data, cursor);
        cursor = programTrade.encode(data, cursor);
        cursor = nonResident.encode(data, cursor);
        cursor = bypass.encode(data, cursor);
        cursor = ncib.encode(data, cursor);
        cursor = crossSide.encode(data, cursor);
        cursor = shortMarkingExempt.encode(data, cursor);
        cursor = buyUmirAccountType.encode(data, cursor);
        cursor = buyAccount.encode(data, cursor);
        cursor = buyUmirRegulationId.encode(data, cursor);
        cursor = buyJitney.encode(data, cursor);
        cursor = buyLeiCustomerAccount.encode(data, cursor);
        cursor = buyLeiAlgorithmId.encode(data, cursor);
        cursor = buyCustomerLei.encode(data, cursor);
        cursor = buyBrokerLei.encode(data, cursor);
        cursor = buyLeiOrderOrigin.encode(data, cursor);
        cursor = buyLeiRoutingArrangemeantIndicator.encode(data, cursor);
        cursor = sellUmirAccountType.encode(data, cursor);
        cursor = sellAccount.encode(data, cursor);
        cursor = sellUmirRegulationId.encode(data, cursor);
        cursor = sellJitney.encode(data, cursor);
        cursor = sellLeiCustomerAccount.encode(data, cursor);
        cursor = sellLeiAlgorithmId.encode(data, cursor);
        cursor = sellCustomerLei.encode(data, cursor);
        cursor = sellBrokerLei.encode(data, cursor);
        cursor = sellLeiOrderOrigin.encode(data, cursor);
        cursor = sellLeiRoutingArrangementIndicator.encode(data, cursor);
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
            case "BrokerId" -> Optional.of(brokerId);
            case "CrossClOrdId" -> Optional.of(crossClOrdId);
            case "CrossType" -> Optional.of(crossType);
            case "Price" -> Optional.of(price);
            case "OrderQty" -> Optional.of(orderQty);
            case "Symbol" -> Optional.of(symbol);
            case "SettlementType" -> Optional.of(settlementType);
            case "FutSettlDate" -> Optional.of(futSettlDate);
            case "UmirUserId" -> Optional.of(umirUserId);
            case "BasketTrade" -> Optional.of(basketTrade);
            case "ProgramTrade" -> Optional.of(programTrade);
            case "NonResident" -> Optional.of(nonResident);
            case "Bypass" -> Optional.of(bypass);
            case "Ncib" -> Optional.of(ncib);
            case "CrossSide" -> Optional.of(crossSide);
            case "ShortMarkingExempt" -> Optional.of(shortMarkingExempt);
            case "BuyUmirAccountType" -> Optional.of(buyUmirAccountType);
            case "BuyAccount" -> Optional.of(buyAccount);
            case "BuyUmirRegulationId" -> Optional.of(buyUmirRegulationId);
            case "BuyJitney" -> Optional.of(buyJitney);
            case "BuyLeiCustomerAccount" -> Optional.of(buyLeiCustomerAccount);
            case "BuyLeiAlgorithmId" -> Optional.of(buyLeiAlgorithmId);
            case "BuyCustomerLei" -> Optional.of(buyCustomerLei);
            case "BuyBrokerLei" -> Optional.of(buyBrokerLei);
            case "BuyLeiOrderOrigin" -> Optional.of(buyLeiOrderOrigin);
            case "BuyLeiRoutingArrangemeantIndicator" -> Optional.of(buyLeiRoutingArrangemeantIndicator);
            case "SellUmirAccountType" -> Optional.of(sellUmirAccountType);
            case "SellAccount" -> Optional.of(sellAccount);
            case "SellUmirRegulationId" -> Optional.of(sellUmirRegulationId);
            case "SellJitney" -> Optional.of(sellJitney);
            case "SellLeiCustomerAccount" -> Optional.of(sellLeiCustomerAccount);
            case "SellLeiAlgorithmId" -> Optional.of(sellLeiAlgorithmId);
            case "SellCustomerLei" -> Optional.of(sellCustomerLei);
            case "SellBrokerLei" -> Optional.of(sellBrokerLei);
            case "SellLeiOrderOrigin" -> Optional.of(sellLeiOrderOrigin);
            case "SellLeiRoutingArrangementIndicator" -> Optional.of(sellLeiRoutingArrangementIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderCrossCaEquitiesV1 message)) {
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
        if (!(other instanceof NewOrderCrossCaEquitiesV1 message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
