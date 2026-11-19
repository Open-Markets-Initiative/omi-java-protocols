package omi.eurex.t7.eti.fbe.v13_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v13_0.fields.AccountField;
import omi.eurex.t7.eti.fbe.v13_0.fields.ComplianceTextField;
import omi.eurex.t7.eti.fbe.v13_0.fields.CustOrderHandlingInstField;
import omi.eurex.t7.eti.fbe.v13_0.fields.ExecutingTraderField;
import omi.eurex.t7.eti.fbe.v13_0.fields.ExecutingTraderQualifierField;
import omi.eurex.t7.eti.fbe.v13_0.fields.FreeText1Field;
import omi.eurex.t7.eti.fbe.v13_0.fields.FreeText2Field;
import omi.eurex.t7.eti.fbe.v13_0.fields.FreeText3Field;
import omi.eurex.t7.eti.fbe.v13_0.fields.MassOrderRequestIdField;
import omi.eurex.t7.eti.fbe.v13_0.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v13_0.fields.NoOrderEntriesField;
import omi.eurex.t7.eti.fbe.v13_0.fields.OrderAttributeLiquidityProvisionField;
import omi.eurex.t7.eti.fbe.v13_0.fields.OrderAttributeRiskReductionField;
import omi.eurex.t7.eti.fbe.v13_0.fields.OrderOriginationField;
import omi.eurex.t7.eti.fbe.v13_0.fields.PartyEndClientIdentificationField;
import omi.eurex.t7.eti.fbe.v13_0.fields.PartyIdBeneficiaryField;
import omi.eurex.t7.eti.fbe.v13_0.fields.PartyIdClientIdField;
import omi.eurex.t7.eti.fbe.v13_0.fields.PartyIdInvestmentDecisionMakerField;
import omi.eurex.t7.eti.fbe.v13_0.fields.PartyIdInvestmentDecisionMakerQualifierField;
import omi.eurex.t7.eti.fbe.v13_0.fields.PartyIdLocationIdField;
import omi.eurex.t7.eti.fbe.v13_0.fields.PartyIdOrderOriginationFirmField;
import omi.eurex.t7.eti.fbe.v13_0.fields.PartyIdPositionAccountField;
import omi.eurex.t7.eti.fbe.v13_0.fields.PartyIdTakeUpTradingFirmField;
import omi.eurex.t7.eti.fbe.v13_0.fields.PositionEffectField;
import omi.eurex.t7.eti.fbe.v13_0.fields.PriceValidityCheckTypeField;
import omi.eurex.t7.eti.fbe.v13_0.fields.TradingCapacityField;
import omi.eurex.t7.eti.fbe.v13_0.fields.TradingSessionSubIdField;
import omi.eurex.t7.eti.fbe.v13_0.fields.ValueCheckTypeValueField;
import omi.eurex.t7.eti.fbe.v13_0.groups.OrderEntryGrpCompEntry;
import omi.eurex.t7.eti.fbe.v13_0.groups.OrderEntryGrpCompList;
import omi.eurex.t7.eti.fbe.v13_0.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v13_0.types.Field;
import omi.eurex.t7.eti.fbe.v13_0.types.Message;
import omi.eurex.t7.eti.fbe.v13_0.types.PrintOptions;

/**
 * Represents the MassOrder message from the Eti protocol.
 */
public final class MassOrder implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 202;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Order";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Mass Order Request Id
     */
    private final MassOrderRequestIdField massOrderRequestId = new MassOrderRequestIdField();

    /**
     * Party Id Client Id
     */
    private final PartyIdClientIdField partyIdClientId = new PartyIdClientIdField();

    /**
     * Party Id Investment Decision Maker
     */
    private final PartyIdInvestmentDecisionMakerField partyIdInvestmentDecisionMaker = new PartyIdInvestmentDecisionMakerField();

    /**
     * Executing Trader
     */
    private final ExecutingTraderField executingTrader = new ExecutingTraderField();

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
     * Price Validity Check Type
     */
    private final PriceValidityCheckTypeField priceValidityCheckType = new PriceValidityCheckTypeField();

    /**
     * Value Check Type Value
     */
    private final ValueCheckTypeValueField valueCheckTypeValue = new ValueCheckTypeValueField();

    /**
     * Order Attribute Liquidity Provision
     */
    private final OrderAttributeLiquidityProvisionField orderAttributeLiquidityProvision = new OrderAttributeLiquidityProvisionField();

    /**
     * Order Attribute Risk Reduction
     */
    private final OrderAttributeRiskReductionField orderAttributeRiskReduction = new OrderAttributeRiskReductionField();

    /**
     * Trading Session Sub Id
     */
    private final TradingSessionSubIdField tradingSessionSubId = new TradingSessionSubIdField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Order Origination
     */
    private final OrderOriginationField orderOrigination = new OrderOriginationField();

    /**
     * Party Id Investment Decision Maker Qualifier
     */
    private final PartyIdInvestmentDecisionMakerQualifierField partyIdInvestmentDecisionMakerQualifier = new PartyIdInvestmentDecisionMakerQualifierField();

    /**
     * Executing Trader Qualifier
     */
    private final ExecutingTraderQualifierField executingTraderQualifier = new ExecutingTraderQualifierField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Party Id Position Account
     */
    private final PartyIdPositionAccountField partyIdPositionAccount = new PartyIdPositionAccountField();

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
     * Compliance Text
     */
    private final ComplianceTextField complianceText = new ComplianceTextField();

    /**
     * Free Text 1
     */
    private final FreeText1Field freeText1 = new FreeText1Field();

    /**
     * Free Text 2
     */
    private final FreeText2Field freeText2 = new FreeText2Field();

    /**
     * Free Text 3
     */
    private final FreeText3Field freeText3 = new FreeText3Field();

    /**
     * Party End Client Identification
     */
    private final PartyEndClientIdentificationField partyEndClientIdentification = new PartyEndClientIdentificationField();

    /**
     * No Order Entries
     */
    private final NoOrderEntriesField noOrderEntries = new NoOrderEntriesField();

    /**
     * Order Entry Grp Comp
     */
    private final OrderEntryGrpCompList orderEntryGrpComp = new OrderEntryGrpCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(massOrderRequestId), List.<Field>of(partyIdClientId), List.<Field>of(partyIdInvestmentDecisionMaker), List.<Field>of(executingTrader), List.<Field>of(partyIdTakeUpTradingFirm), List.<Field>of(partyIdOrderOriginationFirm), List.<Field>of(partyIdBeneficiary), List.<Field>of(priceValidityCheckType), List.<Field>of(valueCheckTypeValue), List.<Field>of(orderAttributeLiquidityProvision), List.<Field>of(orderAttributeRiskReduction), List.<Field>of(tradingSessionSubId), List.<Field>of(tradingCapacity), List.<Field>of(orderOrigination), List.<Field>of(partyIdInvestmentDecisionMakerQualifier), List.<Field>of(executingTraderQualifier), List.<Field>of(account), List.<Field>of(partyIdPositionAccount), List.<Field>of(positionEffect), List.<Field>of(partyIdLocationId), List.<Field>of(custOrderHandlingInst), List.<Field>of(complianceText), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText3), List.<Field>of(partyEndClientIdentification), List.<Field>of(noOrderEntries)).flatMap(List::stream).toList();

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
     * Mass Order Request Id
     *
     * @return the MassOrderRequestId field
     */
    public MassOrderRequestIdField massOrderRequestId() {
        return massOrderRequestId;
    }

    /**
     * Party Id Client Id
     *
     * @return the PartyIdClientId field
     */
    public PartyIdClientIdField partyIdClientId() {
        return partyIdClientId;
    }

    /**
     * Party Id Investment Decision Maker
     *
     * @return the PartyIdInvestmentDecisionMaker field
     */
    public PartyIdInvestmentDecisionMakerField partyIdInvestmentDecisionMaker() {
        return partyIdInvestmentDecisionMaker;
    }

    /**
     * Executing Trader
     *
     * @return the ExecutingTrader field
     */
    public ExecutingTraderField executingTrader() {
        return executingTrader;
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
     * Price Validity Check Type
     *
     * @return the PriceValidityCheckType field
     */
    public PriceValidityCheckTypeField priceValidityCheckType() {
        return priceValidityCheckType;
    }

    /**
     * Value Check Type Value
     *
     * @return the ValueCheckTypeValue field
     */
    public ValueCheckTypeValueField valueCheckTypeValue() {
        return valueCheckTypeValue;
    }

    /**
     * Order Attribute Liquidity Provision
     *
     * @return the OrderAttributeLiquidityProvision field
     */
    public OrderAttributeLiquidityProvisionField orderAttributeLiquidityProvision() {
        return orderAttributeLiquidityProvision;
    }

    /**
     * Order Attribute Risk Reduction
     *
     * @return the OrderAttributeRiskReduction field
     */
    public OrderAttributeRiskReductionField orderAttributeRiskReduction() {
        return orderAttributeRiskReduction;
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
     * Order Origination
     *
     * @return the OrderOrigination field
     */
    public OrderOriginationField orderOrigination() {
        return orderOrigination;
    }

    /**
     * Party Id Investment Decision Maker Qualifier
     *
     * @return the PartyIdInvestmentDecisionMakerQualifier field
     */
    public PartyIdInvestmentDecisionMakerQualifierField partyIdInvestmentDecisionMakerQualifier() {
        return partyIdInvestmentDecisionMakerQualifier;
    }

    /**
     * Executing Trader Qualifier
     *
     * @return the ExecutingTraderQualifier field
     */
    public ExecutingTraderQualifierField executingTraderQualifier() {
        return executingTraderQualifier;
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
     * Party Id Position Account
     *
     * @return the PartyIdPositionAccount field
     */
    public PartyIdPositionAccountField partyIdPositionAccount() {
        return partyIdPositionAccount;
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
     * Compliance Text
     *
     * @return the ComplianceText field
     */
    public ComplianceTextField complianceText() {
        return complianceText;
    }

    /**
     * Free Text 1
     *
     * @return the FreeText1 field
     */
    public FreeText1Field freeText1() {
        return freeText1;
    }

    /**
     * Free Text 2
     *
     * @return the FreeText2 field
     */
    public FreeText2Field freeText2() {
        return freeText2;
    }

    /**
     * Free Text 3
     *
     * @return the FreeText3 field
     */
    public FreeText3Field freeText3() {
        return freeText3;
    }

    /**
     * Party End Client Identification
     *
     * @return the PartyEndClientIdentification field
     */
    public PartyEndClientIdentificationField partyEndClientIdentification() {
        return partyEndClientIdentification;
    }

    /**
     * No Order Entries
     *
     * @return the NoOrderEntries field
     */
    public NoOrderEntriesField noOrderEntries() {
        return noOrderEntries;
    }

    /**
     * Order Entry Grp Comp
     *
     * <p>Encode writes this list's size to the NoOrderEntries field.</p>
     *
     * @return the OrderEntryGrpComp entries
     */
    public OrderEntryGrpCompList orderEntryGrpComp() {
        return orderEntryGrpComp;
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
        return MINIMUM_BYTE_LENGTH + orderEntryGrpComp.byteLength();
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
        cursor += 2;
        cursor += 32;
        cursor += 1;
        cursor += 2;
        cursor += 1;
        cursor += 20;
        cursor += 12;
        cursor += 12;
        cursor += 12;
        cursor += 20;
        cursor += 1;
        runs.add(cursor).add(7);
        cursor += 7;
        cursor = orderEntryGrpComp.padding(runs, cursor);
        return cursor;
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
        if (!requestHeaderComp.parseFrom(data, cursor, end - 184)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!massOrderRequestId.parse(data, cursor)) {
            return false;
        }
        cursor += MassOrderRequestIdField.BYTE_LENGTH;
        if (!partyIdClientId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdClientIdField.BYTE_LENGTH;
        if (!partyIdInvestmentDecisionMaker.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdInvestmentDecisionMakerField.BYTE_LENGTH;
        if (!executingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderField.BYTE_LENGTH;
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
        if (!priceValidityCheckType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceValidityCheckTypeField.BYTE_LENGTH;
        if (!valueCheckTypeValue.parse(data, cursor)) {
            return false;
        }
        cursor += ValueCheckTypeValueField.BYTE_LENGTH;
        if (!orderAttributeLiquidityProvision.parse(data, cursor)) {
            return false;
        }
        cursor += OrderAttributeLiquidityProvisionField.BYTE_LENGTH;
        if (!orderAttributeRiskReduction.parse(data, cursor)) {
            return false;
        }
        cursor += OrderAttributeRiskReductionField.BYTE_LENGTH;
        if (!tradingSessionSubId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionSubIdField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!orderOrigination.parse(data, cursor)) {
            return false;
        }
        cursor += OrderOriginationField.BYTE_LENGTH;
        if (!partyIdInvestmentDecisionMakerQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdInvestmentDecisionMakerQualifierField.BYTE_LENGTH;
        if (!executingTraderQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderQualifierField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!partyIdPositionAccount.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdPositionAccountField.BYTE_LENGTH;
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
        if (!complianceText.parse(data, cursor)) {
            return false;
        }
        cursor += ComplianceTextField.BYTE_LENGTH;
        if (!freeText1.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText1Field.BYTE_LENGTH;
        if (!freeText2.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText2Field.BYTE_LENGTH;
        if (!freeText3.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText3Field.BYTE_LENGTH;
        if (!partyEndClientIdentification.parse(data, cursor)) {
            return false;
        }
        cursor += PartyEndClientIdentificationField.BYTE_LENGTH;
        if (!noOrderEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoOrderEntriesField.BYTE_LENGTH;
        cursor += 7; // padding
        if (!orderEntryGrpComp.parse(data, cursor, end, noOrderEntries.value())) {
            return false;
        }
        cursor += orderEntryGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderEntryGrpComp.size() > 255) {
            throw new IllegalStateException("orderEntryGrpComp holds " + orderEntryGrpComp.size() + " entries, more than its count field can state");
        }
        noOrderEntries.value((short) orderEntryGrpComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = massOrderRequestId.encode(data, cursor);
        cursor = partyIdClientId.encode(data, cursor);
        cursor = partyIdInvestmentDecisionMaker.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = partyIdTakeUpTradingFirm.encode(data, cursor);
        cursor = partyIdOrderOriginationFirm.encode(data, cursor);
        cursor = partyIdBeneficiary.encode(data, cursor);
        cursor = priceValidityCheckType.encode(data, cursor);
        cursor = valueCheckTypeValue.encode(data, cursor);
        cursor = orderAttributeLiquidityProvision.encode(data, cursor);
        cursor = orderAttributeRiskReduction.encode(data, cursor);
        cursor = tradingSessionSubId.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = orderOrigination.encode(data, cursor);
        cursor = partyIdInvestmentDecisionMakerQualifier.encode(data, cursor);
        cursor = executingTraderQualifier.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = partyIdPositionAccount.encode(data, cursor);
        cursor = positionEffect.encode(data, cursor);
        cursor = partyIdLocationId.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = complianceText.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText3.encode(data, cursor);
        cursor = partyEndClientIdentification.encode(data, cursor);
        cursor = noOrderEntries.encode(data, cursor);
        if (buffer != null && buffer.length >= 202) {
            System.arraycopy(buffer, 195, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
        cursor = orderEntryGrpComp.encode(data, cursor);
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
        orderEntryGrpComp.clear();
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
            if (field != noOrderEntries && !field.isRecognized()) {
                return false;
            }
        }
        return orderEntryGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noOrderEntries && !field.isValid()) {
                return false;
            }
        }
        if (!orderEntryGrpComp.isValid()) {
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
        if (!massOrderRequestId.isDecoded()) {
            return Optional.of(massOrderRequestId);
        }
        if (!partyIdClientId.isDecoded()) {
            return Optional.of(partyIdClientId);
        }
        if (!partyIdInvestmentDecisionMaker.isDecoded()) {
            return Optional.of(partyIdInvestmentDecisionMaker);
        }
        if (!executingTrader.isDecoded()) {
            return Optional.of(executingTrader);
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
        if (!priceValidityCheckType.isDecoded()) {
            return Optional.of(priceValidityCheckType);
        }
        if (!valueCheckTypeValue.isDecoded()) {
            return Optional.of(valueCheckTypeValue);
        }
        if (!orderAttributeLiquidityProvision.isDecoded()) {
            return Optional.of(orderAttributeLiquidityProvision);
        }
        if (!orderAttributeRiskReduction.isDecoded()) {
            return Optional.of(orderAttributeRiskReduction);
        }
        if (!tradingSessionSubId.isDecoded()) {
            return Optional.of(tradingSessionSubId);
        }
        if (!tradingCapacity.isDecoded()) {
            return Optional.of(tradingCapacity);
        }
        if (!orderOrigination.isDecoded()) {
            return Optional.of(orderOrigination);
        }
        if (!partyIdInvestmentDecisionMakerQualifier.isDecoded()) {
            return Optional.of(partyIdInvestmentDecisionMakerQualifier);
        }
        if (!executingTraderQualifier.isDecoded()) {
            return Optional.of(executingTraderQualifier);
        }
        if (!account.isDecoded()) {
            return Optional.of(account);
        }
        if (!partyIdPositionAccount.isDecoded()) {
            return Optional.of(partyIdPositionAccount);
        }
        if (!positionEffect.isDecoded()) {
            return Optional.of(positionEffect);
        }
        if (!partyIdLocationId.isDecoded()) {
            return Optional.of(partyIdLocationId);
        }
        if (!custOrderHandlingInst.isDecoded()) {
            return Optional.of(custOrderHandlingInst);
        }
        if (!complianceText.isDecoded()) {
            return Optional.of(complianceText);
        }
        if (!freeText1.isDecoded()) {
            return Optional.of(freeText1);
        }
        if (!freeText2.isDecoded()) {
            return Optional.of(freeText2);
        }
        if (!freeText3.isDecoded()) {
            return Optional.of(freeText3);
        }
        if (!partyEndClientIdentification.isDecoded()) {
            return Optional.of(partyEndClientIdentification);
        }
        if (!noOrderEntries.isDecoded()) {
            return Optional.of(noOrderEntries);
        }
        if (!orderEntryGrpComp.isDecoded()) {
            return Optional.of(orderEntryGrpComp.failedEntry().flatMap(OrderEntryGrpCompEntry::failedAt).orElse(noOrderEntries));
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
            case "MassOrderRequestId" -> Optional.of(massOrderRequestId);
            case "PartyIdClientId" -> Optional.of(partyIdClientId);
            case "PartyIdInvestmentDecisionMaker" -> Optional.of(partyIdInvestmentDecisionMaker);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "PartyIdTakeUpTradingFirm" -> Optional.of(partyIdTakeUpTradingFirm);
            case "PartyIdOrderOriginationFirm" -> Optional.of(partyIdOrderOriginationFirm);
            case "PartyIdBeneficiary" -> Optional.of(partyIdBeneficiary);
            case "PriceValidityCheckType" -> Optional.of(priceValidityCheckType);
            case "ValueCheckTypeValue" -> Optional.of(valueCheckTypeValue);
            case "OrderAttributeLiquidityProvision" -> Optional.of(orderAttributeLiquidityProvision);
            case "OrderAttributeRiskReduction" -> Optional.of(orderAttributeRiskReduction);
            case "TradingSessionSubId" -> Optional.of(tradingSessionSubId);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "PartyIdInvestmentDecisionMakerQualifier" -> Optional.of(partyIdInvestmentDecisionMakerQualifier);
            case "ExecutingTraderQualifier" -> Optional.of(executingTraderQualifier);
            case "Account" -> Optional.of(account);
            case "PartyIdPositionAccount" -> Optional.of(partyIdPositionAccount);
            case "PositionEffect" -> Optional.of(positionEffect);
            case "PartyIdLocationId" -> Optional.of(partyIdLocationId);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "ComplianceText" -> Optional.of(complianceText);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText3" -> Optional.of(freeText3);
            case "PartyEndClientIdentification" -> Optional.of(partyEndClientIdentification);
            case "NoOrderEntries" -> Optional.of(noOrderEntries);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassOrder message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(orderEntryGrpComp.diffFields(message.orderEntryGrpComp));
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
            orderEntryGrpComp.toFormattedString(builder, options);
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
        orderEntryGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof MassOrder message)) {
            return false;
        }
        return fields.equals(message.fields) && orderEntryGrpComp.equals(message.orderEntryGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, orderEntryGrpComp);
    }
}
