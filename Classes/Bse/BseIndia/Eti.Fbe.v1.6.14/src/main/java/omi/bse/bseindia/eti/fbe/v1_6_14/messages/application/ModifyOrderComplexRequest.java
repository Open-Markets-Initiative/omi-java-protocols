package omi.bse.bseindia.eti.fbe.v1_6_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AccountTypeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ActivityTimeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AlgoIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ApplSeqIndicatorField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ClOrdIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ClientCodeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.CpCodeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.CustOrderHandlingInstField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.DeltaQtyFlagField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ExecInstField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ExpireDateField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.FreeTextField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MarketSegmentIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MaxPricePercentageField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MaxShowField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MessageTagField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.NetworkMsgIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.NoLegsField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.OrdTypeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.OrderIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.OrderQtyField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.OrigClOrdIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PartyIdBeneficiaryField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PartyIdLocationIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PartyIdOrderOriginationFirmField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PartyIdTakeUpTradingFirmField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PriceField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PriceValidityCheckTypeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ProductComplexField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.RegulatoryIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.RegulatoryTextField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.RolloverFlagField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SecurityIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SenderLocationIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SideField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.TargetPartyIdSessionIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.TimeInForceField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.TradingCapacityField;
import omi.bse.bseindia.eti.fbe.v1_6_14.groups.LegOrdGrpCompEntry;
import omi.bse.bseindia.eti.fbe.v1_6_14.groups.LegOrdGrpCompList;
import omi.bse.bseindia.eti.fbe.v1_6_14.structs.RequestHeaderComp;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Field;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Message;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.PrintOptions;

/**
 * Represents the ModifyOrderComplexRequest message from the Eti protocol.
 */
public final class ModifyOrderComplexRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 234;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Modify Order Complex Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Order Id
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Cl Ord Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Orig Cl Ord Id
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Max Price Percentage
     */
    private final MaxPricePercentageField maxPricePercentage = new MaxPricePercentageField();

    /**
     * Sender Location Id
     */
    private final SenderLocationIdField senderLocationId = new SenderLocationIdField();

    /**
     * Activity Time
     */
    private final ActivityTimeField activityTime = new ActivityTimeField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Message Tag
     */
    private final MessageTagField messageTag = new MessageTagField();

    /**
     * Order Qty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Max Show
     */
    private final MaxShowField maxShow = new MaxShowField();

    /**
     * Expire Date
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * Target Party Id Session Id
     */
    private final TargetPartyIdSessionIdField targetPartyIdSessionId = new TargetPartyIdSessionIdField();

    /**
     * Regulatory Id
     */
    private final RegulatoryIdField regulatoryId = new RegulatoryIdField();

    /**
     * Party Id Take Up Trading Firm
     */
    private final PartyIdTakeUpTradingFirmField partyIdTakeUpTradingFirm = new PartyIdTakeUpTradingFirmField();

    /**
     * Party Id Order Origination Firm
     */
    private final PartyIdOrderOriginationFirmField partyIdOrderOriginationFirm = new PartyIdOrderOriginationFirmField();

    /**
     * Party Id Beneficiary
     */
    private final PartyIdBeneficiaryField partyIdBeneficiary = new PartyIdBeneficiaryField();

    /**
     * Account Type
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * Appl Seq Indicator
     */
    private final ApplSeqIndicatorField applSeqIndicator = new ApplSeqIndicatorField();

    /**
     * Product Complex
     */
    private final ProductComplexField productComplex = new ProductComplexField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Price Validity Check Type
     */
    private final PriceValidityCheckTypeField priceValidityCheckType = new PriceValidityCheckTypeField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Rollover Flag
     */
    private final RolloverFlagField rolloverFlag = new RolloverFlagField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Delta Qty Flag
     */
    private final DeltaQtyFlagField deltaQtyFlag = new DeltaQtyFlagField();

    /**
     * Party Id Location Id
     */
    private final PartyIdLocationIdField partyIdLocationId = new PartyIdLocationIdField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * Regulatory Text
     */
    private final RegulatoryTextField regulatoryText = new RegulatoryTextField();

    /**
     * Algo Id
     */
    private final AlgoIdField algoId = new AlgoIdField();

    /**
     * Client Code
     */
    private final ClientCodeField clientCode = new ClientCodeField();

    /**
     * Cp Code
     */
    private final CpCodeField cpCode = new CpCodeField();

    /**
     * Free Text
     */
    private final FreeTextField freeText = new FreeTextField();

    /**
     * No Legs
     */
    private final NoLegsField noLegs = new NoLegsField();

    /**
     * Leg Ord Grp Comp
     */
    private final LegOrdGrpCompList legOrdGrpComp = new LegOrdGrpCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(orderId), List.<Field>of(clOrdId), List.<Field>of(origClOrdId), List.<Field>of(securityId), List.<Field>of(price), List.<Field>of(maxPricePercentage), List.<Field>of(senderLocationId), List.<Field>of(activityTime), List.<Field>of(marketSegmentId), List.<Field>of(messageTag), List.<Field>of(orderQty), List.<Field>of(maxShow), List.<Field>of(expireDate), List.<Field>of(targetPartyIdSessionId), List.<Field>of(regulatoryId), List.<Field>of(partyIdTakeUpTradingFirm), List.<Field>of(partyIdOrderOriginationFirm), List.<Field>of(partyIdBeneficiary), List.<Field>of(accountType), List.<Field>of(applSeqIndicator), List.<Field>of(productComplex), List.<Field>of(side), List.<Field>of(ordType), List.<Field>of(priceValidityCheckType), List.<Field>of(execInst), List.<Field>of(timeInForce), List.<Field>of(rolloverFlag), List.<Field>of(tradingCapacity), List.<Field>of(deltaQtyFlag), List.<Field>of(partyIdLocationId), List.<Field>of(custOrderHandlingInst), List.<Field>of(regulatoryText), List.<Field>of(algoId), List.<Field>of(clientCode), List.<Field>of(cpCode), List.<Field>of(freeText), List.<Field>of(noLegs)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Network Msg Id
     *
     * @return the NetworkMsgId field
     */
    public NetworkMsgIdField networkMsgId() {
        return networkMsgId;
    }

    /**
     * Order Id
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Cl Ord Id
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Orig Cl Ord Id
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
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
     * Max Price Percentage
     *
     * @return the MaxPricePercentage field
     */
    public MaxPricePercentageField maxPricePercentage() {
        return maxPricePercentage;
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
     * Activity Time
     *
     * @return the ActivityTime field
     */
    public ActivityTimeField activityTime() {
        return activityTime;
    }

    /**
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Message Tag
     *
     * @return the MessageTag field
     */
    public MessageTagField messageTag() {
        return messageTag;
    }

    /**
     * Order Qty
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Max Show
     *
     * @return the MaxShow field
     */
    public MaxShowField maxShow() {
        return maxShow;
    }

    /**
     * Expire Date
     *
     * @return the ExpireDate field
     */
    public ExpireDateField expireDate() {
        return expireDate;
    }

    /**
     * Target Party Id Session Id
     *
     * @return the TargetPartyIdSessionId field
     */
    public TargetPartyIdSessionIdField targetPartyIdSessionId() {
        return targetPartyIdSessionId;
    }

    /**
     * Regulatory Id
     *
     * @return the RegulatoryId field
     */
    public RegulatoryIdField regulatoryId() {
        return regulatoryId;
    }

    /**
     * Party Id Take Up Trading Firm
     *
     * @return the PartyIdTakeUpTradingFirm field
     */
    public PartyIdTakeUpTradingFirmField partyIdTakeUpTradingFirm() {
        return partyIdTakeUpTradingFirm;
    }

    /**
     * Party Id Order Origination Firm
     *
     * @return the PartyIdOrderOriginationFirm field
     */
    public PartyIdOrderOriginationFirmField partyIdOrderOriginationFirm() {
        return partyIdOrderOriginationFirm;
    }

    /**
     * Party Id Beneficiary
     *
     * @return the PartyIdBeneficiary field
     */
    public PartyIdBeneficiaryField partyIdBeneficiary() {
        return partyIdBeneficiary;
    }

    /**
     * Account Type
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
    }

    /**
     * Appl Seq Indicator
     *
     * @return the ApplSeqIndicator field
     */
    public ApplSeqIndicatorField applSeqIndicator() {
        return applSeqIndicator;
    }

    /**
     * Product Complex
     *
     * @return the ProductComplex field
     */
    public ProductComplexField productComplex() {
        return productComplex;
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
     * Ord Type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Price Validity Check Type
     *
     * @return the PriceValidityCheckType field
     */
    public PriceValidityCheckTypeField priceValidityCheckType() {
        return priceValidityCheckType;
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
     * Time In Force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Rollover Flag
     *
     * @return the RolloverFlag field
     */
    public RolloverFlagField rolloverFlag() {
        return rolloverFlag;
    }

    /**
     * Trading Capacity
     *
     * @return the TradingCapacity field
     */
    public TradingCapacityField tradingCapacity() {
        return tradingCapacity;
    }

    /**
     * Delta Qty Flag
     *
     * @return the DeltaQtyFlag field
     */
    public DeltaQtyFlagField deltaQtyFlag() {
        return deltaQtyFlag;
    }

    /**
     * Party Id Location Id
     *
     * @return the PartyIdLocationId field
     */
    public PartyIdLocationIdField partyIdLocationId() {
        return partyIdLocationId;
    }

    /**
     * Cust Order Handling Inst
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
    }

    /**
     * Regulatory Text
     *
     * @return the RegulatoryText field
     */
    public RegulatoryTextField regulatoryText() {
        return regulatoryText;
    }

    /**
     * Algo Id
     *
     * @return the AlgoId field
     */
    public AlgoIdField algoId() {
        return algoId;
    }

    /**
     * Client Code
     *
     * @return the ClientCode field
     */
    public ClientCodeField clientCode() {
        return clientCode;
    }

    /**
     * Cp Code
     *
     * @return the CpCode field
     */
    public CpCodeField cpCode() {
        return cpCode;
    }

    /**
     * Free Text
     *
     * @return the FreeText field
     */
    public FreeTextField freeText() {
        return freeText;
    }

    /**
     * No Legs
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
    }

    /**
     * Leg Ord Grp Comp
     *
     * <p>Encode writes this list's size to the NoLegs field.</p>
     *
     * @return the LegOrdGrpComp entries
     */
    public LegOrdGrpCompList legOrdGrpComp() {
        return legOrdGrpComp;
    }

    /**
     * Request Header Comp
     *
     * @return the RequestHeaderComp record
     */
    public RequestHeaderComp requestHeaderComp() {
        return requestHeaderComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + legOrdGrpComp.byteLength();
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
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = RequestHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RequestHeaderComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        runs.add(cursor).add(8);
        cursor += 8;
        runs.add(cursor).add(4);
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        runs.add(cursor).add(2);
        cursor += 2;
        cursor += 5;
        cursor += 7;
        cursor += 9;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 2;
        cursor += 1;
        cursor += 20;
        cursor += 16;
        cursor += 12;
        cursor += 12;
        cursor += 12;
        cursor += 1;
        runs.add(cursor).add(2);
        cursor += 2;
        cursor = legOrdGrpComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(activityTime.value());
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
        if (!networkMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += NetworkMsgIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 216)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!maxPricePercentage.parse(data, cursor)) {
            return false;
        }
        cursor += MaxPricePercentageField.BYTE_LENGTH;
        if (!senderLocationId.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationIdField.BYTE_LENGTH;
        if (!activityTime.parse(data, cursor)) {
            return false;
        }
        cursor += ActivityTimeField.BYTE_LENGTH;
        cursor += 12; // padding
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!messageTag.parse(data, cursor)) {
            return false;
        }
        cursor += MessageTagField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!maxShow.parse(data, cursor)) {
            return false;
        }
        cursor += MaxShowField.BYTE_LENGTH;
        if (!expireDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateField.BYTE_LENGTH;
        if (!targetPartyIdSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyIdSessionIdField.BYTE_LENGTH;
        if (!regulatoryId.parse(data, cursor)) {
            return false;
        }
        cursor += RegulatoryIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!partyIdTakeUpTradingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdTakeUpTradingFirmField.BYTE_LENGTH;
        if (!partyIdOrderOriginationFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdOrderOriginationFirmField.BYTE_LENGTH;
        if (!partyIdBeneficiary.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdBeneficiaryField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!applSeqIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ApplSeqIndicatorField.BYTE_LENGTH;
        if (!productComplex.parse(data, cursor)) {
            return false;
        }
        cursor += ProductComplexField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!priceValidityCheckType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceValidityCheckTypeField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!rolloverFlag.parse(data, cursor)) {
            return false;
        }
        cursor += RolloverFlagField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!deltaQtyFlag.parse(data, cursor)) {
            return false;
        }
        cursor += DeltaQtyFlagField.BYTE_LENGTH;
        if (!partyIdLocationId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdLocationIdField.BYTE_LENGTH;
        if (!custOrderHandlingInst.parse(data, cursor)) {
            return false;
        }
        cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        if (!regulatoryText.parse(data, cursor)) {
            return false;
        }
        cursor += RegulatoryTextField.BYTE_LENGTH;
        if (!algoId.parse(data, cursor)) {
            return false;
        }
        cursor += AlgoIdField.BYTE_LENGTH;
        if (!clientCode.parse(data, cursor)) {
            return false;
        }
        cursor += ClientCodeField.BYTE_LENGTH;
        if (!cpCode.parse(data, cursor)) {
            return false;
        }
        cursor += CpCodeField.BYTE_LENGTH;
        if (!freeText.parse(data, cursor)) {
            return false;
        }
        cursor += FreeTextField.BYTE_LENGTH;
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!legOrdGrpComp.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += legOrdGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (legOrdGrpComp.size() > 255) {
            throw new IllegalStateException("legOrdGrpComp holds " + legOrdGrpComp.size() + " entries, more than its count field can state");
        }
        noLegs.value((short) legOrdGrpComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = maxPricePercentage.encode(data, cursor);
        cursor = senderLocationId.encode(data, cursor);
        cursor = activityTime.encode(data, cursor);
        if (buffer != null && buffer.length >= 94) {
            System.arraycopy(buffer, 82, data, cursor, 12); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 12, (byte) 0); // padding
        }
        cursor += 12;
        cursor = marketSegmentId.encode(data, cursor);
        cursor = messageTag.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = maxShow.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = targetPartyIdSessionId.encode(data, cursor);
        cursor = regulatoryId.encode(data, cursor);
        if (buffer != null && buffer.length >= 124) {
            System.arraycopy(buffer, 122, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = partyIdTakeUpTradingFirm.encode(data, cursor);
        cursor = partyIdOrderOriginationFirm.encode(data, cursor);
        cursor = partyIdBeneficiary.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = applSeqIndicator.encode(data, cursor);
        cursor = productComplex.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = priceValidityCheckType.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = rolloverFlag.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = deltaQtyFlag.encode(data, cursor);
        cursor = partyIdLocationId.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = regulatoryText.encode(data, cursor);
        cursor = algoId.encode(data, cursor);
        cursor = clientCode.encode(data, cursor);
        cursor = cpCode.encode(data, cursor);
        cursor = freeText.encode(data, cursor);
        cursor = noLegs.encode(data, cursor);
        if (buffer != null && buffer.length >= 234) {
            System.arraycopy(buffer, 232, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = legOrdGrpComp.encode(data, cursor);
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
        requestHeaderComp.clear();
        legOrdGrpComp.clear();
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
            if (field != noLegs && !field.isRecognized()) {
                return false;
            }
        }
        return legOrdGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noLegs && !field.isValid()) {
                return false;
            }
        }
        if (!legOrdGrpComp.isValid()) {
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
        if (!networkMsgId.isDecoded()) {
            return Optional.of(networkMsgId);
        }
        if (!requestHeaderComp.isDecoded()) {
            return requestHeaderComp.failedAt();
        }
        if (!orderId.isDecoded()) {
            return Optional.of(orderId);
        }
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!origClOrdId.isDecoded()) {
            return Optional.of(origClOrdId);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!maxPricePercentage.isDecoded()) {
            return Optional.of(maxPricePercentage);
        }
        if (!senderLocationId.isDecoded()) {
            return Optional.of(senderLocationId);
        }
        if (!activityTime.isDecoded()) {
            return Optional.of(activityTime);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!messageTag.isDecoded()) {
            return Optional.of(messageTag);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!maxShow.isDecoded()) {
            return Optional.of(maxShow);
        }
        if (!expireDate.isDecoded()) {
            return Optional.of(expireDate);
        }
        if (!targetPartyIdSessionId.isDecoded()) {
            return Optional.of(targetPartyIdSessionId);
        }
        if (!regulatoryId.isDecoded()) {
            return Optional.of(regulatoryId);
        }
        if (!partyIdTakeUpTradingFirm.isDecoded()) {
            return Optional.of(partyIdTakeUpTradingFirm);
        }
        if (!partyIdOrderOriginationFirm.isDecoded()) {
            return Optional.of(partyIdOrderOriginationFirm);
        }
        if (!partyIdBeneficiary.isDecoded()) {
            return Optional.of(partyIdBeneficiary);
        }
        if (!accountType.isDecoded()) {
            return Optional.of(accountType);
        }
        if (!applSeqIndicator.isDecoded()) {
            return Optional.of(applSeqIndicator);
        }
        if (!productComplex.isDecoded()) {
            return Optional.of(productComplex);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!ordType.isDecoded()) {
            return Optional.of(ordType);
        }
        if (!priceValidityCheckType.isDecoded()) {
            return Optional.of(priceValidityCheckType);
        }
        if (!execInst.isDecoded()) {
            return Optional.of(execInst);
        }
        if (!timeInForce.isDecoded()) {
            return Optional.of(timeInForce);
        }
        if (!rolloverFlag.isDecoded()) {
            return Optional.of(rolloverFlag);
        }
        if (!tradingCapacity.isDecoded()) {
            return Optional.of(tradingCapacity);
        }
        if (!deltaQtyFlag.isDecoded()) {
            return Optional.of(deltaQtyFlag);
        }
        if (!partyIdLocationId.isDecoded()) {
            return Optional.of(partyIdLocationId);
        }
        if (!custOrderHandlingInst.isDecoded()) {
            return Optional.of(custOrderHandlingInst);
        }
        if (!regulatoryText.isDecoded()) {
            return Optional.of(regulatoryText);
        }
        if (!algoId.isDecoded()) {
            return Optional.of(algoId);
        }
        if (!clientCode.isDecoded()) {
            return Optional.of(clientCode);
        }
        if (!cpCode.isDecoded()) {
            return Optional.of(cpCode);
        }
        if (!freeText.isDecoded()) {
            return Optional.of(freeText);
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!legOrdGrpComp.isDecoded()) {
            return Optional.of(legOrdGrpComp.failedEntry().flatMap(LegOrdGrpCompEntry::failedAt).orElse(noLegs));
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
            case "NetworkMsgId" -> Optional.of(networkMsgId);
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "SecurityId" -> Optional.of(securityId);
            case "Price" -> Optional.of(price);
            case "MaxPricePercentage" -> Optional.of(maxPricePercentage);
            case "SenderLocationId" -> Optional.of(senderLocationId);
            case "ActivityTime" -> Optional.of(activityTime);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "MessageTag" -> Optional.of(messageTag);
            case "OrderQty" -> Optional.of(orderQty);
            case "MaxShow" -> Optional.of(maxShow);
            case "ExpireDate" -> Optional.of(expireDate);
            case "TargetPartyIdSessionId" -> Optional.of(targetPartyIdSessionId);
            case "RegulatoryId" -> Optional.of(regulatoryId);
            case "PartyIdTakeUpTradingFirm" -> Optional.of(partyIdTakeUpTradingFirm);
            case "PartyIdOrderOriginationFirm" -> Optional.of(partyIdOrderOriginationFirm);
            case "PartyIdBeneficiary" -> Optional.of(partyIdBeneficiary);
            case "AccountType" -> Optional.of(accountType);
            case "ApplSeqIndicator" -> Optional.of(applSeqIndicator);
            case "ProductComplex" -> Optional.of(productComplex);
            case "Side" -> Optional.of(side);
            case "OrdType" -> Optional.of(ordType);
            case "PriceValidityCheckType" -> Optional.of(priceValidityCheckType);
            case "ExecInst" -> Optional.of(execInst);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "RolloverFlag" -> Optional.of(rolloverFlag);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "DeltaQtyFlag" -> Optional.of(deltaQtyFlag);
            case "PartyIdLocationId" -> Optional.of(partyIdLocationId);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "RegulatoryText" -> Optional.of(regulatoryText);
            case "AlgoId" -> Optional.of(algoId);
            case "ClientCode" -> Optional.of(clientCode);
            case "CpCode" -> Optional.of(cpCode);
            case "FreeText" -> Optional.of(freeText);
            case "NoLegs" -> Optional.of(noLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ModifyOrderComplexRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(legOrdGrpComp.diffFields(message.legOrdGrpComp));
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
            legOrdGrpComp.toFormattedString(builder, options);
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
        legOrdGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof ModifyOrderComplexRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && legOrdGrpComp.equals(message.legOrdGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, legOrdGrpComp);
    }
}
