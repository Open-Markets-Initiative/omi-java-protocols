package omi.ice.icefutures.bgw.sbe.v7_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.AllocHandlInstField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.AllocationAccountField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClOrdIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClearingAccountString14NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClearingFirmInt32NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClientIdCodeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CommodityDerivIndicatorField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CumQtyField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CustOrderHandlingInstField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CustomerAccountRefIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.DirectElectronicAccessField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExecInstField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExecutionDecisionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExpireDateField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.GiveUpClearingFirmField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.InvestmentDecisionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LeavesQtyField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LiquidityProvisionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ManualOrderIndicatorField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MaxShowField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MemoField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MifidIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OnBehalfOfCompIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OnBehalfOfLocationIDString41NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OnBehalfOfSubIDString41NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OrdTypeOrderTypeEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OrderStateField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OrderStatusField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OriginatorUserIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.PositionEffectField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.PriceDecimal9NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SelfMatchPreventionIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SelfMatchPreventionInstructionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SideSideEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.StopPxField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SymbolIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TimeInForceTimeInForceEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TimePriorityField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TradingCapacityField;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.ExecIDOrderExecId;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.OrigOrderId;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the ExecutionReportSnapshotMessage message from the Bgw protocol.
 *
 * <p>ExecutionReport_SnapshotMessage</p>
 */
public final class ExecutionReportSnapshotMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 380;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Report Snapshot Message";

    /**
     * originatorUserID
     */
    private final OriginatorUserIdField originatorUserId = new OriginatorUserIdField();

    /**
     * clOrdID
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * symbol
     */
    private final SymbolIntField symbolInt = new SymbolIntField();

    /**
     * ordType
     */
    private final OrdTypeOrderTypeEnumField ordTypeOrderTypeEnum = new OrdTypeOrderTypeEnumField();

    /**
     * side
     */
    private final SideSideEnumField sideSideEnum = new SideSideEnumField();

    /**
     * maxShow
     */
    private final MaxShowField maxShow = new MaxShowField();

    /**
     * leavesQty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * cumQty
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * price
     */
    private final PriceDecimal9NullField priceDecimal9Null = new PriceDecimal9NullField();

    /**
     * stopPx
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * expireDate
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * timePriority
     */
    private final TimePriorityField timePriority = new TimePriorityField();

    /**
     * timeInForce
     */
    private final TimeInForceTimeInForceEnumField timeInForceTimeInForceEnum = new TimeInForceTimeInForceEnumField();

    /**
     * orderStatus
     */
    private final OrderStatusField orderStatus = new OrderStatusField();

    /**
     * orderState
     */
    private final OrderStateField orderState = new OrderStateField();

    /**
     * giveUpClearingFirm
     */
    private final GiveUpClearingFirmField giveUpClearingFirm = new GiveUpClearingFirmField();

    /**
     * clearingFirm
     */
    private final ClearingFirmInt32NullField clearingFirmInt32Null = new ClearingFirmInt32NullField();

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
     * selfMatchPreventionID
     */
    private final SelfMatchPreventionIdField selfMatchPreventionId = new SelfMatchPreventionIdField();

    /**
     * selfMatchPreventionInstruction
     */
    private final SelfMatchPreventionInstructionField selfMatchPreventionInstruction = new SelfMatchPreventionInstructionField();

    /**
     * manualOrderIndicator
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * execInst
     */
    private final ExecInstField execInst = new ExecInstField();

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
     * clearingAccount
     */
    private final ClearingAccountString14NullField clearingAccountString14Null = new ClearingAccountString14NullField();

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
    private final OnBehalfOfSubIDString41NullField onBehalfOfSubIDString41Null = new OnBehalfOfSubIDString41NullField();

    /**
     * onBehalfOfLocationID
     */
    private final OnBehalfOfLocationIDString41NullField onBehalfOfLocationIDString41Null = new OnBehalfOfLocationIDString41NullField();

    /**
     * ExecutionReport_NewMessage
     */
    private final ExecIDOrderExecId execIDOrderExecId = new ExecIDOrderExecId();

    /**
     * ExecutionReport_NewMessage
     */
    private final OrigOrderId origOrderId = new OrigOrderId();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(originatorUserId), execIDOrderExecId.fields(), List.<Field>of(clOrdId), List.<Field>of(symbolInt), List.<Field>of(ordTypeOrderTypeEnum), List.<Field>of(sideSideEnum), origOrderId.fields(), List.<Field>of(maxShow), List.<Field>of(leavesQty), List.<Field>of(cumQty), List.<Field>of(priceDecimal9Null), List.<Field>of(stopPx), List.<Field>of(expireDate), List.<Field>of(timePriority), List.<Field>of(timeInForceTimeInForceEnum), List.<Field>of(orderStatus), List.<Field>of(orderState), List.<Field>of(giveUpClearingFirm), List.<Field>of(clearingFirmInt32Null), List.<Field>of(directElectronicAccess), List.<Field>of(tradingCapacity), List.<Field>of(liquidityProvision), List.<Field>of(commodityDerivIndicator), List.<Field>of(investmentDecision), List.<Field>of(executionDecision), List.<Field>of(clientIdCode), List.<Field>of(mifidId), List.<Field>of(selfMatchPreventionId), List.<Field>of(selfMatchPreventionInstruction), List.<Field>of(manualOrderIndicator), List.<Field>of(execInst), List.<Field>of(custOrderHandlingInst), List.<Field>of(positionEffect), List.<Field>of(allocHandlInst), List.<Field>of(clearingAccountString14Null), List.<Field>of(customerAccountRefId), List.<Field>of(memo), List.<Field>of(allocationAccount), List.<Field>of(onBehalfOfCompId), List.<Field>of(onBehalfOfSubIDString41Null), List.<Field>of(onBehalfOfLocationIDString41Null)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * originatorUserID
     *
     * @return the OriginatorUserId field
     */
    public OriginatorUserIdField originatorUserId() {
        return originatorUserId;
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
     * symbol
     *
     * @return the SymbolInt field
     */
    public SymbolIntField symbolInt() {
        return symbolInt;
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
     * side
     *
     * @return the SideSideEnum field
     */
    public SideSideEnumField sideSideEnum() {
        return sideSideEnum;
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
     * leavesQty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * cumQty
     *
     * @return the CumQty field
     */
    public CumQtyField cumQty() {
        return cumQty;
    }

    /**
     * price
     *
     * @return the PriceDecimal9Null field
     */
    public PriceDecimal9NullField priceDecimal9Null() {
        return priceDecimal9Null;
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
     * expireDate
     *
     * @return the ExpireDate field
     */
    public ExpireDateField expireDate() {
        return expireDate;
    }

    /**
     * timePriority
     *
     * @return the TimePriority field
     */
    public TimePriorityField timePriority() {
        return timePriority;
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
     * orderStatus
     *
     * @return the OrderStatus field
     */
    public OrderStatusField orderStatus() {
        return orderStatus;
    }

    /**
     * orderState
     *
     * @return the OrderState field
     */
    public OrderStateField orderState() {
        return orderState;
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
     * @return the ClearingFirmInt32Null field
     */
    public ClearingFirmInt32NullField clearingFirmInt32Null() {
        return clearingFirmInt32Null;
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
     * selfMatchPreventionID
     *
     * @return the SelfMatchPreventionId field
     */
    public SelfMatchPreventionIdField selfMatchPreventionId() {
        return selfMatchPreventionId;
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
     * manualOrderIndicator
     *
     * @return the ManualOrderIndicator field
     */
    public ManualOrderIndicatorField manualOrderIndicator() {
        return manualOrderIndicator;
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
     * clearingAccount
     *
     * @return the ClearingAccountString14Null field
     */
    public ClearingAccountString14NullField clearingAccountString14Null() {
        return clearingAccountString14Null;
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
     * @return the OnBehalfOfSubIDString41Null field
     */
    public OnBehalfOfSubIDString41NullField onBehalfOfSubIDString41Null() {
        return onBehalfOfSubIDString41Null;
    }

    /**
     * onBehalfOfLocationID
     *
     * @return the OnBehalfOfLocationIDString41Null field
     */
    public OnBehalfOfLocationIDString41NullField onBehalfOfLocationIDString41Null() {
        return onBehalfOfLocationIDString41Null;
    }

    /**
     * ExecutionReport_NewMessage
     *
     * @return the ExecIDOrderExecId record
     */
    public ExecIDOrderExecId execIDOrderExecId() {
        return execIDOrderExecId;
    }

    /**
     * ExecutionReport_NewMessage
     *
     * @return the OrigOrderId record
     */
    public OrigOrderId origOrderId() {
        return origOrderId;
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
        if (!originatorUserId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginatorUserIdField.BYTE_LENGTH;
        if (!execIDOrderExecId.parseFrom(data, cursor, end - 340)) {
            return false;
        }
        cursor += execIDOrderExecId.byteLength();
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!symbolInt.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIntField.BYTE_LENGTH;
        if (!ordTypeOrderTypeEnum.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeOrderTypeEnumField.BYTE_LENGTH;
        if (!sideSideEnum.parse(data, cursor)) {
            return false;
        }
        cursor += SideSideEnumField.BYTE_LENGTH;
        if (!origOrderId.parseFrom(data, cursor, end - 310)) {
            return false;
        }
        cursor += origOrderId.byteLength();
        if (!maxShow.parse(data, cursor)) {
            return false;
        }
        cursor += MaxShowField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!cumQty.parse(data, cursor)) {
            return false;
        }
        cursor += CumQtyField.BYTE_LENGTH;
        if (!priceDecimal9Null.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDecimal9NullField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!expireDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateField.BYTE_LENGTH;
        if (!timePriority.parse(data, cursor)) {
            return false;
        }
        cursor += TimePriorityField.BYTE_LENGTH;
        if (!timeInForceTimeInForceEnum.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceTimeInForceEnumField.BYTE_LENGTH;
        if (!orderStatus.parse(data, cursor)) {
            return false;
        }
        cursor += OrderStatusField.BYTE_LENGTH;
        if (!orderState.parse(data, cursor)) {
            return false;
        }
        cursor += OrderStateField.BYTE_LENGTH;
        if (!giveUpClearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += GiveUpClearingFirmField.BYTE_LENGTH;
        if (!clearingFirmInt32Null.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmInt32NullField.BYTE_LENGTH;
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
        if (!selfMatchPreventionId.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionIdField.BYTE_LENGTH;
        if (!selfMatchPreventionInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionInstructionField.BYTE_LENGTH;
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
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
        if (!clearingAccountString14Null.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountString14NullField.BYTE_LENGTH;
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
        if (!onBehalfOfSubIDString41Null.parse(data, cursor)) {
            return false;
        }
        cursor += OnBehalfOfSubIDString41NullField.BYTE_LENGTH;
        return onBehalfOfLocationIDString41Null.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = originatorUserId.encode(data, cursor);
        cursor = execIDOrderExecId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = symbolInt.encode(data, cursor);
        cursor = ordTypeOrderTypeEnum.encode(data, cursor);
        cursor = sideSideEnum.encode(data, cursor);
        cursor = origOrderId.encode(data, cursor);
        cursor = maxShow.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = priceDecimal9Null.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = timePriority.encode(data, cursor);
        cursor = timeInForceTimeInForceEnum.encode(data, cursor);
        cursor = orderStatus.encode(data, cursor);
        cursor = orderState.encode(data, cursor);
        cursor = giveUpClearingFirm.encode(data, cursor);
        cursor = clearingFirmInt32Null.encode(data, cursor);
        cursor = directElectronicAccess.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = liquidityProvision.encode(data, cursor);
        cursor = commodityDerivIndicator.encode(data, cursor);
        cursor = investmentDecision.encode(data, cursor);
        cursor = executionDecision.encode(data, cursor);
        cursor = clientIdCode.encode(data, cursor);
        cursor = mifidId.encode(data, cursor);
        cursor = selfMatchPreventionId.encode(data, cursor);
        cursor = selfMatchPreventionInstruction.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = positionEffect.encode(data, cursor);
        cursor = allocHandlInst.encode(data, cursor);
        cursor = clearingAccountString14Null.encode(data, cursor);
        cursor = customerAccountRefId.encode(data, cursor);
        cursor = memo.encode(data, cursor);
        cursor = allocationAccount.encode(data, cursor);
        cursor = onBehalfOfCompId.encode(data, cursor);
        cursor = onBehalfOfSubIDString41Null.encode(data, cursor);
        cursor = onBehalfOfLocationIDString41Null.encode(data, cursor);
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
        execIDOrderExecId.clear();
        origOrderId.clear();
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
            case "OriginatorUserId" -> Optional.of(originatorUserId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "SymbolInt" -> Optional.of(symbolInt);
            case "OrdTypeOrderTypeEnum" -> Optional.of(ordTypeOrderTypeEnum);
            case "SideSideEnum" -> Optional.of(sideSideEnum);
            case "MaxShow" -> Optional.of(maxShow);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "CumQty" -> Optional.of(cumQty);
            case "PriceDecimal9Null" -> Optional.of(priceDecimal9Null);
            case "StopPx" -> Optional.of(stopPx);
            case "ExpireDate" -> Optional.of(expireDate);
            case "TimePriority" -> Optional.of(timePriority);
            case "TimeInForceTimeInForceEnum" -> Optional.of(timeInForceTimeInForceEnum);
            case "OrderStatus" -> Optional.of(orderStatus);
            case "OrderState" -> Optional.of(orderState);
            case "GiveUpClearingFirm" -> Optional.of(giveUpClearingFirm);
            case "ClearingFirmInt32Null" -> Optional.of(clearingFirmInt32Null);
            case "DirectElectronicAccess" -> Optional.of(directElectronicAccess);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "CommodityDerivIndicator" -> Optional.of(commodityDerivIndicator);
            case "InvestmentDecision" -> Optional.of(investmentDecision);
            case "ExecutionDecision" -> Optional.of(executionDecision);
            case "ClientIdCode" -> Optional.of(clientIdCode);
            case "MifidId" -> Optional.of(mifidId);
            case "SelfMatchPreventionId" -> Optional.of(selfMatchPreventionId);
            case "SelfMatchPreventionInstruction" -> Optional.of(selfMatchPreventionInstruction);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "ExecInst" -> Optional.of(execInst);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "PositionEffect" -> Optional.of(positionEffect);
            case "AllocHandlInst" -> Optional.of(allocHandlInst);
            case "ClearingAccountString14Null" -> Optional.of(clearingAccountString14Null);
            case "CustomerAccountRefId" -> Optional.of(customerAccountRefId);
            case "Memo" -> Optional.of(memo);
            case "AllocationAccount" -> Optional.of(allocationAccount);
            case "OnBehalfOfCompId" -> Optional.of(onBehalfOfCompId);
            case "OnBehalfOfSubIDString41Null" -> Optional.of(onBehalfOfSubIDString41Null);
            case "OnBehalfOfLocationIDString41Null" -> Optional.of(onBehalfOfLocationIDString41Null);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionReportSnapshotMessage message)) {
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
        if (!(other instanceof ExecutionReportSnapshotMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
