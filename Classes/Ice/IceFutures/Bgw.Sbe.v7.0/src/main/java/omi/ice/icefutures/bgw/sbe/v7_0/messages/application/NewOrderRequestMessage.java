package omi.ice.icefutures.bgw.sbe.v7_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.AllocHandlInstField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.AllocationAccountField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClOrdIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClearingAccountStringField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClearingFirmIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClientIdCodeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CommodityDerivIndicatorField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CustOrderHandlingInstField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CustomerAccountRefIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.DirectElectronicAccessField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExecInstField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExecutionDecisionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExpireDateField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.GiveUpClearingFirmField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.InvestmentDecisionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LiquidityProvisionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ManualOrderIndicatorField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MaxShowField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MemoField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MifidIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OnBehalfOfCompIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OnBehalfOfLocationIDStringField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OnBehalfOfSubIDStringField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OrdTypeOrderTypeEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OrderQtyDecimalField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OriginatorUserIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.PositionEffectField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.PriceDecimal9NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.PriceTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SelfMatchPreventionIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SelfMatchPreventionInstructionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SideSideEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.StopPxField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SymbolIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TimeInForceTimeInForceEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TradingCapacityField;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the NewOrderRequestMessage message from the Bgw protocol.
 *
 * <p>NewOrderRequestMessage</p>
 */
public final class NewOrderRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 327;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Request Message";

    /**
     * price
     */
    private final PriceDecimal9NullField priceDecimal9Null = new PriceDecimal9NullField();

    /**
     * orderQty
     */
    private final OrderQtyDecimalField orderQtyDecimal = new OrderQtyDecimalField();

    /**
     * symbol
     */
    private final SymbolIntField symbolInt = new SymbolIntField();

    /**
     * timeInForce
     */
    private final TimeInForceTimeInForceEnumField timeInForceTimeInForceEnum = new TimeInForceTimeInForceEnumField();

    /**
     * side
     */
    private final SideSideEnumField sideSideEnum = new SideSideEnumField();

    /**
     * originatorUserID
     */
    private final OriginatorUserIdField originatorUserId = new OriginatorUserIdField();

    /**
     * ordType
     */
    private final OrdTypeOrderTypeEnumField ordTypeOrderTypeEnum = new OrdTypeOrderTypeEnumField();

    /**
     * manualOrderIndicator
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * clOrdID
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * maxShow
     */
    private final MaxShowField maxShow = new MaxShowField();

    /**
     * stopPx
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * giveUpClearingFirm
     */
    private final GiveUpClearingFirmField giveUpClearingFirm = new GiveUpClearingFirmField();

    /**
     * clearingFirm
     */
    private final ClearingFirmIntField clearingFirmInt = new ClearingFirmIntField();

    /**
     * selfMatchPreventionID
     */
    private final SelfMatchPreventionIdField selfMatchPreventionId = new SelfMatchPreventionIdField();

    /**
     * expireDate
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * selfMatchPreventionInstruction
     */
    private final SelfMatchPreventionInstructionField selfMatchPreventionInstruction = new SelfMatchPreventionInstructionField();

    /**
     * execInst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * directElectronicAccess
     */
    private final DirectElectronicAccessField directElectronicAccess = new DirectElectronicAccessField();

    /**
     * tradingCapacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * liquidityProvision
     */
    private final LiquidityProvisionField liquidityProvision = new LiquidityProvisionField();

    /**
     * commodityDerivIndicator
     */
    private final CommodityDerivIndicatorField commodityDerivIndicator = new CommodityDerivIndicatorField();

    /**
     * investmentDecision
     */
    private final InvestmentDecisionField investmentDecision = new InvestmentDecisionField();

    /**
     * executionDecision
     */
    private final ExecutionDecisionField executionDecision = new ExecutionDecisionField();

    /**
     * clientIDCode
     */
    private final ClientIdCodeField clientIdCode = new ClientIdCodeField();

    /**
     * mifidID
     */
    private final MifidIdField mifidId = new MifidIdField();

    /**
     * custOrderHandlingInst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * positionEffect
     */
    private final PositionEffectField positionEffect = new PositionEffectField();

    /**
     * allocHandlInst
     */
    private final AllocHandlInstField allocHandlInst = new AllocHandlInstField();

    /**
     * priceType
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * clearingAccount
     */
    private final ClearingAccountStringField clearingAccountString = new ClearingAccountStringField();

    /**
     * customerAccountRefID
     */
    private final CustomerAccountRefIdField customerAccountRefId = new CustomerAccountRefIdField();

    /**
     * memo
     */
    private final MemoField memo = new MemoField();

    /**
     * allocationAccount
     */
    private final AllocationAccountField allocationAccount = new AllocationAccountField();

    /**
     * onBehalfOfCompId
     */
    private final OnBehalfOfCompIdField onBehalfOfCompId = new OnBehalfOfCompIdField();

    /**
     * onBehalfOfSubID
     */
    private final OnBehalfOfSubIDStringField onBehalfOfSubIDString = new OnBehalfOfSubIDStringField();

    /**
     * onBehalfOfLocationID
     */
    private final OnBehalfOfLocationIDStringField onBehalfOfLocationIDString = new OnBehalfOfLocationIDStringField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(priceDecimal9Null, orderQtyDecimal, symbolInt, timeInForceTimeInForceEnum, sideSideEnum, originatorUserId, ordTypeOrderTypeEnum, manualOrderIndicator, clOrdId, maxShow, stopPx, giveUpClearingFirm, clearingFirmInt, selfMatchPreventionId, expireDate, selfMatchPreventionInstruction, execInst, directElectronicAccess, tradingCapacity, liquidityProvision, commodityDerivIndicator, investmentDecision, executionDecision, clientIdCode, mifidId, custOrderHandlingInst, positionEffect, allocHandlInst, priceType, clearingAccountString, customerAccountRefId, memo, allocationAccount, onBehalfOfCompId, onBehalfOfSubIDString, onBehalfOfLocationIDString);

    private byte[] buffer;

    private boolean decoded;

    /**
     * price
     *
     * @return the PriceDecimal9Null field
     */
    public PriceDecimal9NullField priceDecimal9Null() {
        return priceDecimal9Null;
    }

    /**
     * orderQty
     *
     * @return the OrderQtyDecimal field
     */
    public OrderQtyDecimalField orderQtyDecimal() {
        return orderQtyDecimal;
    }

    /**
     * symbol
     *
     * @return the SymbolInt field
     */
    public SymbolIntField symbolInt() {
        return symbolInt;
    }

    /**
     * timeInForce
     *
     * @return the TimeInForceTimeInForceEnum field
     */
    public TimeInForceTimeInForceEnumField timeInForceTimeInForceEnum() {
        return timeInForceTimeInForceEnum;
    }

    /**
     * side
     *
     * @return the SideSideEnum field
     */
    public SideSideEnumField sideSideEnum() {
        return sideSideEnum;
    }

    /**
     * originatorUserID
     *
     * @return the OriginatorUserId field
     */
    public OriginatorUserIdField originatorUserId() {
        return originatorUserId;
    }

    /**
     * ordType
     *
     * @return the OrdTypeOrderTypeEnum field
     */
    public OrdTypeOrderTypeEnumField ordTypeOrderTypeEnum() {
        return ordTypeOrderTypeEnum;
    }

    /**
     * manualOrderIndicator
     *
     * @return the ManualOrderIndicator field
     */
    public ManualOrderIndicatorField manualOrderIndicator() {
        return manualOrderIndicator;
    }

    /**
     * clOrdID
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * maxShow
     *
     * @return the MaxShow field
     */
    public MaxShowField maxShow() {
        return maxShow;
    }

    /**
     * stopPx
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * giveUpClearingFirm
     *
     * @return the GiveUpClearingFirm field
     */
    public GiveUpClearingFirmField giveUpClearingFirm() {
        return giveUpClearingFirm;
    }

    /**
     * clearingFirm
     *
     * @return the ClearingFirmInt field
     */
    public ClearingFirmIntField clearingFirmInt() {
        return clearingFirmInt;
    }

    /**
     * selfMatchPreventionID
     *
     * @return the SelfMatchPreventionId field
     */
    public SelfMatchPreventionIdField selfMatchPreventionId() {
        return selfMatchPreventionId;
    }

    /**
     * expireDate
     *
     * @return the ExpireDate field
     */
    public ExpireDateField expireDate() {
        return expireDate;
    }

    /**
     * selfMatchPreventionInstruction
     *
     * @return the SelfMatchPreventionInstruction field
     */
    public SelfMatchPreventionInstructionField selfMatchPreventionInstruction() {
        return selfMatchPreventionInstruction;
    }

    /**
     * execInst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * directElectronicAccess
     *
     * @return the DirectElectronicAccess field
     */
    public DirectElectronicAccessField directElectronicAccess() {
        return directElectronicAccess;
    }

    /**
     * tradingCapacity
     *
     * @return the TradingCapacity field
     */
    public TradingCapacityField tradingCapacity() {
        return tradingCapacity;
    }

    /**
     * liquidityProvision
     *
     * @return the LiquidityProvision field
     */
    public LiquidityProvisionField liquidityProvision() {
        return liquidityProvision;
    }

    /**
     * commodityDerivIndicator
     *
     * @return the CommodityDerivIndicator field
     */
    public CommodityDerivIndicatorField commodityDerivIndicator() {
        return commodityDerivIndicator;
    }

    /**
     * investmentDecision
     *
     * @return the InvestmentDecision field
     */
    public InvestmentDecisionField investmentDecision() {
        return investmentDecision;
    }

    /**
     * executionDecision
     *
     * @return the ExecutionDecision field
     */
    public ExecutionDecisionField executionDecision() {
        return executionDecision;
    }

    /**
     * clientIDCode
     *
     * @return the ClientIdCode field
     */
    public ClientIdCodeField clientIdCode() {
        return clientIdCode;
    }

    /**
     * mifidID
     *
     * @return the MifidId field
     */
    public MifidIdField mifidId() {
        return mifidId;
    }

    /**
     * custOrderHandlingInst
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
    }

    /**
     * positionEffect
     *
     * @return the PositionEffect field
     */
    public PositionEffectField positionEffect() {
        return positionEffect;
    }

    /**
     * allocHandlInst
     *
     * @return the AllocHandlInst field
     */
    public AllocHandlInstField allocHandlInst() {
        return allocHandlInst;
    }

    /**
     * priceType
     *
     * @return the PriceType field
     */
    public PriceTypeField priceType() {
        return priceType;
    }

    /**
     * clearingAccount
     *
     * @return the ClearingAccountString field
     */
    public ClearingAccountStringField clearingAccountString() {
        return clearingAccountString;
    }

    /**
     * customerAccountRefID
     *
     * @return the CustomerAccountRefId field
     */
    public CustomerAccountRefIdField customerAccountRefId() {
        return customerAccountRefId;
    }

    /**
     * memo
     *
     * @return the Memo field
     */
    public MemoField memo() {
        return memo;
    }

    /**
     * allocationAccount
     *
     * @return the AllocationAccount field
     */
    public AllocationAccountField allocationAccount() {
        return allocationAccount;
    }

    /**
     * onBehalfOfCompId
     *
     * @return the OnBehalfOfCompId field
     */
    public OnBehalfOfCompIdField onBehalfOfCompId() {
        return onBehalfOfCompId;
    }

    /**
     * onBehalfOfSubID
     *
     * @return the OnBehalfOfSubIDString field
     */
    public OnBehalfOfSubIDStringField onBehalfOfSubIDString() {
        return onBehalfOfSubIDString;
    }

    /**
     * onBehalfOfLocationID
     *
     * @return the OnBehalfOfLocationIDString field
     */
    public OnBehalfOfLocationIDStringField onBehalfOfLocationIDString() {
        return onBehalfOfLocationIDString;
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
        if (!priceDecimal9Null.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDecimal9NullField.BYTE_LENGTH;
        if (!orderQtyDecimal.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyDecimalField.BYTE_LENGTH;
        if (!symbolInt.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIntField.BYTE_LENGTH;
        if (!timeInForceTimeInForceEnum.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceTimeInForceEnumField.BYTE_LENGTH;
        if (!sideSideEnum.parse(data, cursor)) {
            return false;
        }
        cursor += SideSideEnumField.BYTE_LENGTH;
        if (!originatorUserId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginatorUserIdField.BYTE_LENGTH;
        if (!ordTypeOrderTypeEnum.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeOrderTypeEnumField.BYTE_LENGTH;
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!maxShow.parse(data, cursor)) {
            return false;
        }
        cursor += MaxShowField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!giveUpClearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += GiveUpClearingFirmField.BYTE_LENGTH;
        if (!clearingFirmInt.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmIntField.BYTE_LENGTH;
        if (!selfMatchPreventionId.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionIdField.BYTE_LENGTH;
        if (!expireDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateField.BYTE_LENGTH;
        if (!selfMatchPreventionInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionInstructionField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!directElectronicAccess.parse(data, cursor)) {
            return false;
        }
        cursor += DirectElectronicAccessField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!liquidityProvision.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityProvisionField.BYTE_LENGTH;
        if (!commodityDerivIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CommodityDerivIndicatorField.BYTE_LENGTH;
        if (!investmentDecision.parse(data, cursor)) {
            return false;
        }
        cursor += InvestmentDecisionField.BYTE_LENGTH;
        if (!executionDecision.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionDecisionField.BYTE_LENGTH;
        if (!clientIdCode.parse(data, cursor)) {
            return false;
        }
        cursor += ClientIdCodeField.BYTE_LENGTH;
        if (!mifidId.parse(data, cursor)) {
            return false;
        }
        cursor += MifidIdField.BYTE_LENGTH;
        if (!custOrderHandlingInst.parse(data, cursor)) {
            return false;
        }
        cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        if (!positionEffect.parse(data, cursor)) {
            return false;
        }
        cursor += PositionEffectField.BYTE_LENGTH;
        if (!allocHandlInst.parse(data, cursor)) {
            return false;
        }
        cursor += AllocHandlInstField.BYTE_LENGTH;
        if (!priceType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTypeField.BYTE_LENGTH;
        if (!clearingAccountString.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountStringField.BYTE_LENGTH;
        if (!customerAccountRefId.parse(data, cursor)) {
            return false;
        }
        cursor += CustomerAccountRefIdField.BYTE_LENGTH;
        if (!memo.parse(data, cursor)) {
            return false;
        }
        cursor += MemoField.BYTE_LENGTH;
        if (!allocationAccount.parse(data, cursor)) {
            return false;
        }
        cursor += AllocationAccountField.BYTE_LENGTH;
        if (!onBehalfOfCompId.parse(data, cursor)) {
            return false;
        }
        cursor += OnBehalfOfCompIdField.BYTE_LENGTH;
        if (!onBehalfOfSubIDString.parse(data, cursor)) {
            return false;
        }
        cursor += OnBehalfOfSubIDStringField.BYTE_LENGTH;
        return onBehalfOfLocationIDString.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = priceDecimal9Null.encode(data, cursor);
        cursor = orderQtyDecimal.encode(data, cursor);
        cursor = symbolInt.encode(data, cursor);
        cursor = timeInForceTimeInForceEnum.encode(data, cursor);
        cursor = sideSideEnum.encode(data, cursor);
        cursor = originatorUserId.encode(data, cursor);
        cursor = ordTypeOrderTypeEnum.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = maxShow.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = giveUpClearingFirm.encode(data, cursor);
        cursor = clearingFirmInt.encode(data, cursor);
        cursor = selfMatchPreventionId.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = selfMatchPreventionInstruction.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = directElectronicAccess.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = liquidityProvision.encode(data, cursor);
        cursor = commodityDerivIndicator.encode(data, cursor);
        cursor = investmentDecision.encode(data, cursor);
        cursor = executionDecision.encode(data, cursor);
        cursor = clientIdCode.encode(data, cursor);
        cursor = mifidId.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = positionEffect.encode(data, cursor);
        cursor = allocHandlInst.encode(data, cursor);
        cursor = priceType.encode(data, cursor);
        cursor = clearingAccountString.encode(data, cursor);
        cursor = customerAccountRefId.encode(data, cursor);
        cursor = memo.encode(data, cursor);
        cursor = allocationAccount.encode(data, cursor);
        cursor = onBehalfOfCompId.encode(data, cursor);
        cursor = onBehalfOfSubIDString.encode(data, cursor);
        cursor = onBehalfOfLocationIDString.encode(data, cursor);
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
            case "PriceDecimal9Null" -> Optional.of(priceDecimal9Null);
            case "OrderQtyDecimal" -> Optional.of(orderQtyDecimal);
            case "SymbolInt" -> Optional.of(symbolInt);
            case "TimeInForceTimeInForceEnum" -> Optional.of(timeInForceTimeInForceEnum);
            case "SideSideEnum" -> Optional.of(sideSideEnum);
            case "OriginatorUserId" -> Optional.of(originatorUserId);
            case "OrdTypeOrderTypeEnum" -> Optional.of(ordTypeOrderTypeEnum);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "MaxShow" -> Optional.of(maxShow);
            case "StopPx" -> Optional.of(stopPx);
            case "GiveUpClearingFirm" -> Optional.of(giveUpClearingFirm);
            case "ClearingFirmInt" -> Optional.of(clearingFirmInt);
            case "SelfMatchPreventionId" -> Optional.of(selfMatchPreventionId);
            case "ExpireDate" -> Optional.of(expireDate);
            case "SelfMatchPreventionInstruction" -> Optional.of(selfMatchPreventionInstruction);
            case "ExecInst" -> Optional.of(execInst);
            case "DirectElectronicAccess" -> Optional.of(directElectronicAccess);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "CommodityDerivIndicator" -> Optional.of(commodityDerivIndicator);
            case "InvestmentDecision" -> Optional.of(investmentDecision);
            case "ExecutionDecision" -> Optional.of(executionDecision);
            case "ClientIdCode" -> Optional.of(clientIdCode);
            case "MifidId" -> Optional.of(mifidId);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "PositionEffect" -> Optional.of(positionEffect);
            case "AllocHandlInst" -> Optional.of(allocHandlInst);
            case "PriceType" -> Optional.of(priceType);
            case "ClearingAccountString" -> Optional.of(clearingAccountString);
            case "CustomerAccountRefId" -> Optional.of(customerAccountRefId);
            case "Memo" -> Optional.of(memo);
            case "AllocationAccount" -> Optional.of(allocationAccount);
            case "OnBehalfOfCompId" -> Optional.of(onBehalfOfCompId);
            case "OnBehalfOfSubIDString" -> Optional.of(onBehalfOfSubIDString);
            case "OnBehalfOfLocationIDString" -> Optional.of(onBehalfOfLocationIDString);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderRequestMessage message)) {
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
        if (!(other instanceof NewOrderRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
