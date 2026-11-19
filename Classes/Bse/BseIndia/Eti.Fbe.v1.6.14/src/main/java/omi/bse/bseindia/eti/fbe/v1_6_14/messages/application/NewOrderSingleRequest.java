package omi.bse.bseindia.eti.fbe.v1_6_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AccountField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AccountTypeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AlgoIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ApplSeqIndicatorField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ClOrdIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ClientCodeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.CpCodeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.CustOrderHandlingInstField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ExecInstField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ExpireDateField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.FreeTextField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MarketSegmentIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MaxPricePercentageField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MaxShowField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MessageTagField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.NetworkMsgIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.OrdTypeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.OrderQtyField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PartyIdBeneficiaryField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PartyIdLocationIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PartyIdOrderOriginationFirmField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PartyIdTakeUpTradingFirmField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PositionEffectField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PriceField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PriceValidityCheckTypeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.RegulatoryIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.RegulatoryTextField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.RolloverFlagField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SenderLocationIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SideField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SimpleSecurityIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.StopPxField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.StpcFlagField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.TimeInForceField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.TradingCapacityField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.TradingSessionSubIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.structs.RequestHeaderComp;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Field;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Message;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.PrintOptions;

/**
 * Represents the NewOrderSingleRequest message from the Eti protocol.
 */
public final class NewOrderSingleRequest implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 210;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Single Request";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 2, 58, 8, 66, 4, 98, 2 };

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Max Price Percentage
     */
    private final MaxPricePercentageField maxPricePercentage = new MaxPricePercentageField();

    /**
     * Sender Location Id
     */
    private final SenderLocationIdField senderLocationId = new SenderLocationIdField();

    /**
     * Cl Ord Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

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
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Simple Security Id
     */
    private final SimpleSecurityIdField simpleSecurityId = new SimpleSecurityIdField();

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
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Stpc Flag
     */
    private final StpcFlagField stpcFlag = new StpcFlagField();

    /**
     * Rollover Flag
     */
    private final RolloverFlagField rolloverFlag = new RolloverFlagField();

    /**
     * Trading Session Sub Id
     */
    private final TradingSessionSubIdField tradingSessionSubId = new TradingSessionSubIdField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Position Effect
     */
    private final PositionEffectField positionEffect = new PositionEffectField();

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
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(price), List.<Field>of(stopPx), List.<Field>of(maxPricePercentage), List.<Field>of(senderLocationId), List.<Field>of(clOrdId), List.<Field>of(messageTag), List.<Field>of(orderQty), List.<Field>of(maxShow), List.<Field>of(expireDate), List.<Field>of(marketSegmentId), List.<Field>of(simpleSecurityId), List.<Field>of(regulatoryId), List.<Field>of(partyIdTakeUpTradingFirm), List.<Field>of(partyIdOrderOriginationFirm), List.<Field>of(partyIdBeneficiary), List.<Field>of(accountType), List.<Field>of(applSeqIndicator), List.<Field>of(side), List.<Field>of(ordType), List.<Field>of(priceValidityCheckType), List.<Field>of(timeInForce), List.<Field>of(execInst), List.<Field>of(stpcFlag), List.<Field>of(rolloverFlag), List.<Field>of(tradingSessionSubId), List.<Field>of(tradingCapacity), List.<Field>of(account), List.<Field>of(positionEffect), List.<Field>of(partyIdLocationId), List.<Field>of(custOrderHandlingInst), List.<Field>of(regulatoryText), List.<Field>of(algoId), List.<Field>of(clientCode), List.<Field>of(cpCode), List.<Field>of(freeText)).flatMap(List::stream).toList();

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
     * Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
     * Cl Ord Id
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
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
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Simple Security Id
     *
     * @return the SimpleSecurityId field
     */
    public SimpleSecurityIdField simpleSecurityId() {
        return simpleSecurityId;
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
     * Time In Force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
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
     * Stpc Flag
     *
     * @return the StpcFlag field
     */
    public StpcFlagField stpcFlag() {
        return stpcFlag;
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
     * Trading Session Sub Id
     *
     * @return the TradingSessionSubId field
     */
    public TradingSessionSubIdField tradingSessionSubId() {
        return tradingSessionSubId;
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
     * Account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Position Effect
     *
     * @return the PositionEffect field
     */
    public PositionEffectField positionEffect() {
        return positionEffect;
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
        return PADDING.clone();
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
        if (!networkMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += NetworkMsgIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 192)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!maxPricePercentage.parse(data, cursor)) {
            return false;
        }
        cursor += MaxPricePercentageField.BYTE_LENGTH;
        if (!senderLocationId.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        cursor += 12; // padding
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
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!simpleSecurityId.parse(data, cursor)) {
            return false;
        }
        cursor += SimpleSecurityIdField.BYTE_LENGTH;
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
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!stpcFlag.parse(data, cursor)) {
            return false;
        }
        cursor += StpcFlagField.BYTE_LENGTH;
        if (!rolloverFlag.parse(data, cursor)) {
            return false;
        }
        cursor += RolloverFlagField.BYTE_LENGTH;
        if (!tradingSessionSubId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionSubIdField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!positionEffect.parse(data, cursor)) {
            return false;
        }
        cursor += PositionEffectField.BYTE_LENGTH;
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
        return freeText.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = maxPricePercentage.encode(data, cursor);
        cursor = senderLocationId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        if (buffer != null && buffer.length >= 70) {
            System.arraycopy(buffer, 58, data, cursor, 12); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 12, (byte) 0); // padding
        }
        cursor += 12;
        cursor = messageTag.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = maxShow.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = simpleSecurityId.encode(data, cursor);
        cursor = regulatoryId.encode(data, cursor);
        if (buffer != null && buffer.length >= 100) {
            System.arraycopy(buffer, 98, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = partyIdTakeUpTradingFirm.encode(data, cursor);
        cursor = partyIdOrderOriginationFirm.encode(data, cursor);
        cursor = partyIdBeneficiary.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = applSeqIndicator.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = priceValidityCheckType.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = stpcFlag.encode(data, cursor);
        cursor = rolloverFlag.encode(data, cursor);
        cursor = tradingSessionSubId.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = positionEffect.encode(data, cursor);
        cursor = partyIdLocationId.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = regulatoryText.encode(data, cursor);
        cursor = algoId.encode(data, cursor);
        cursor = clientCode.encode(data, cursor);
        cursor = cpCode.encode(data, cursor);
        cursor = freeText.encode(data, cursor);
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
        requestHeaderComp.clear();
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
            case "NetworkMsgId" -> Optional.of(networkMsgId);
            case "Price" -> Optional.of(price);
            case "StopPx" -> Optional.of(stopPx);
            case "MaxPricePercentage" -> Optional.of(maxPricePercentage);
            case "SenderLocationId" -> Optional.of(senderLocationId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "MessageTag" -> Optional.of(messageTag);
            case "OrderQty" -> Optional.of(orderQty);
            case "MaxShow" -> Optional.of(maxShow);
            case "ExpireDate" -> Optional.of(expireDate);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "SimpleSecurityId" -> Optional.of(simpleSecurityId);
            case "RegulatoryId" -> Optional.of(regulatoryId);
            case "PartyIdTakeUpTradingFirm" -> Optional.of(partyIdTakeUpTradingFirm);
            case "PartyIdOrderOriginationFirm" -> Optional.of(partyIdOrderOriginationFirm);
            case "PartyIdBeneficiary" -> Optional.of(partyIdBeneficiary);
            case "AccountType" -> Optional.of(accountType);
            case "ApplSeqIndicator" -> Optional.of(applSeqIndicator);
            case "Side" -> Optional.of(side);
            case "OrdType" -> Optional.of(ordType);
            case "PriceValidityCheckType" -> Optional.of(priceValidityCheckType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "ExecInst" -> Optional.of(execInst);
            case "StpcFlag" -> Optional.of(stpcFlag);
            case "RolloverFlag" -> Optional.of(rolloverFlag);
            case "TradingSessionSubId" -> Optional.of(tradingSessionSubId);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "Account" -> Optional.of(account);
            case "PositionEffect" -> Optional.of(positionEffect);
            case "PartyIdLocationId" -> Optional.of(partyIdLocationId);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "RegulatoryText" -> Optional.of(regulatoryText);
            case "AlgoId" -> Optional.of(algoId);
            case "ClientCode" -> Optional.of(clientCode);
            case "CpCode" -> Optional.of(cpCode);
            case "FreeText" -> Optional.of(freeText);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderSingleRequest message)) {
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
        if (!(other instanceof NewOrderSingleRequest message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
