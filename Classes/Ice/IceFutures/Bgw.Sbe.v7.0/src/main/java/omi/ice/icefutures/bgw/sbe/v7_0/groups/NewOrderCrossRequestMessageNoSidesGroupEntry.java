package omi.ice.icefutures.bgw.sbe.v7_0.groups;

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
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExecutionDecisionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.GiveUpClearingFirmField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.InvestmentDecisionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LiquidityProvisionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ManualOrderIndicatorField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MemoField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MifidIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OnBehalfOfCompIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OnBehalfOfLocationIDStringField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OnBehalfOfSubIDStringField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.PositionEffectField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SelfMatchPreventionIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SelfMatchPreventionInstructionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SideSideEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TradingCapacityField;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.GroupEntry;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * One entry of the NewOrderCrossRequestMessageNoSidesGroup repeating group.
 *
 * <p>noSides</p>
 */
public final class NewOrderCrossRequestMessageNoSidesGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 265;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 265;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "NewOrderCrossRequestMessageNoSidesGroup";

    /**
     * side
     */
    private final SideSideEnumField sideSideEnum = new SideSideEnumField();

    /**
     * clOrdID
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * giveUpClearingFirm
     */
    private final GiveUpClearingFirmField giveUpClearingFirm = new GiveUpClearingFirmField();

    /**
     * clearingFirm
     */
    private final ClearingFirmIntField clearingFirmInt = new ClearingFirmIntField();

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
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(sideSideEnum, clOrdId, giveUpClearingFirm, clearingFirmInt, directElectronicAccess, tradingCapacity, liquidityProvision, commodityDerivIndicator, investmentDecision, executionDecision, clientIdCode, mifidId, selfMatchPreventionId, selfMatchPreventionInstruction, manualOrderIndicator, custOrderHandlingInst, positionEffect, allocHandlInst, clearingAccountString, customerAccountRefId, memo, allocationAccount, onBehalfOfCompId, onBehalfOfSubIDString, onBehalfOfLocationIDString);

    private byte[] buffer;

    private boolean decoded;

    /**
     * side
     *
     * @return the SideSideEnum field
     */
    public SideSideEnumField sideSideEnum() {
        return sideSideEnum;
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

    private int wireBlock = ROOT_BYTE_LENGTH;

    private byte[] blockTrailer = new byte[0];

    /**
     * Sets the width the wire gives this entry's fixed part, as the list holding it states.
     *
     * @param wireBlock the width in bytes
     */
    public void wireBlock(int wireBlock) {
        this.wireBlock = wireBlock;
    }

    /**
     * Returns the bytes of this entry's known fields that lie wholly inside its block.
     *
     * @return the width in bytes; a field past it is absent
     */
    public int knownBytes() {
        if (wireBlock >= 265) {
            return 265;
        }
        if (wireBlock >= 224) {
            return 224;
        }
        if (wireBlock >= 183) {
            return 183;
        }
        if (wireBlock >= 142) {
            return 142;
        }
        if (wireBlock >= 122) {
            return 122;
        }
        if (wireBlock >= 92) {
            return 92;
        }
        if (wireBlock >= 80) {
            return 80;
        }
        if (wireBlock >= 66) {
            return 66;
        }
        if (wireBlock >= 65) {
            return 65;
        }
        if (wireBlock >= 64) {
            return 64;
        }
        if (wireBlock >= 63) {
            return 63;
        }
        if (wireBlock >= 62) {
            return 62;
        }
        if (wireBlock >= 61) {
            return 61;
        }
        if (wireBlock >= 53) {
            return 53;
        }
        if (wireBlock >= 45) {
            return 45;
        }
        if (wireBlock >= 37) {
            return 37;
        }
        if (wireBlock >= 29) {
            return 29;
        }
        if (wireBlock >= 21) {
            return 21;
        }
        if (wireBlock >= 20) {
            return 20;
        }
        if (wireBlock >= 19) {
            return 19;
        }
        if (wireBlock >= 18) {
            return 18;
        }
        if (wireBlock >= 17) {
            return 17;
        }
        if (wireBlock >= 13) {
            return 13;
        }
        if (wireBlock >= 9) {
            return 9;
        }
        if (wireBlock >= 1) {
            return 1;
        }
        return 0;
    }

    /**
     * Returns what this entry's block held past the fields this class knows.
     *
     * @return a copy of those bytes, empty when the block held no more
     */
    public byte[] blockTrailer() {
        return blockTrailer.clone();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH - ROOT_BYTE_LENGTH + wireBlock;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        return parseBlock(data, offset, end, ROOT_BYTE_LENGTH);
    }

    /**
     * Decodes this entry given the width the wire states for its fixed part.
     *
     * @param data   the buffer to decode from
     * @param offset the index of this entry's first byte
     * @param end    the index just past the last byte this entry may read
     * @param block  the width of the fixed part
     * @return true when every field inside the block, and what follows it, decoded
     */
    public boolean parseBlock(byte[] data, int offset, int end, int block) {
        clear();
        this.wireBlock = block;
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH - ROOT_BYTE_LENGTH + wireBlock) {
            return false;
        }

        int cursor = offset;
        int known = knownBytes();
        if (known >= 1) {
            if (!sideSideEnum.parse(data, cursor)) {
                return false;
            }
            cursor += SideSideEnumField.BYTE_LENGTH;
        }
        if (known >= 9) {
            if (!clOrdId.parse(data, cursor)) {
                return false;
            }
            cursor += ClOrdIdField.BYTE_LENGTH;
        }
        if (known >= 13) {
            if (!giveUpClearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += GiveUpClearingFirmField.BYTE_LENGTH;
        }
        if (known >= 17) {
            if (!clearingFirmInt.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmIntField.BYTE_LENGTH;
        }
        if (known >= 18) {
            if (!directElectronicAccess.parse(data, cursor)) {
                return false;
            }
            cursor += DirectElectronicAccessField.BYTE_LENGTH;
        }
        if (known >= 19) {
            if (!tradingCapacity.parse(data, cursor)) {
                return false;
            }
            cursor += TradingCapacityField.BYTE_LENGTH;
        }
        if (known >= 20) {
            if (!liquidityProvision.parse(data, cursor)) {
                return false;
            }
            cursor += LiquidityProvisionField.BYTE_LENGTH;
        }
        if (known >= 21) {
            if (!commodityDerivIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += CommodityDerivIndicatorField.BYTE_LENGTH;
        }
        if (known >= 29) {
            if (!investmentDecision.parse(data, cursor)) {
                return false;
            }
            cursor += InvestmentDecisionField.BYTE_LENGTH;
        }
        if (known >= 37) {
            if (!executionDecision.parse(data, cursor)) {
                return false;
            }
            cursor += ExecutionDecisionField.BYTE_LENGTH;
        }
        if (known >= 45) {
            if (!clientIdCode.parse(data, cursor)) {
                return false;
            }
            cursor += ClientIdCodeField.BYTE_LENGTH;
        }
        if (known >= 53) {
            if (!mifidId.parse(data, cursor)) {
                return false;
            }
            cursor += MifidIdField.BYTE_LENGTH;
        }
        if (known >= 61) {
            if (!selfMatchPreventionId.parse(data, cursor)) {
                return false;
            }
            cursor += SelfMatchPreventionIdField.BYTE_LENGTH;
        }
        if (known >= 62) {
            if (!selfMatchPreventionInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += SelfMatchPreventionInstructionField.BYTE_LENGTH;
        }
        if (known >= 63) {
            if (!manualOrderIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        }
        if (known >= 64) {
            if (!custOrderHandlingInst.parse(data, cursor)) {
                return false;
            }
            cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        }
        if (known >= 65) {
            if (!positionEffect.parse(data, cursor)) {
                return false;
            }
            cursor += PositionEffectField.BYTE_LENGTH;
        }
        if (known >= 66) {
            if (!allocHandlInst.parse(data, cursor)) {
                return false;
            }
            cursor += AllocHandlInstField.BYTE_LENGTH;
        }
        if (known >= 80) {
            if (!clearingAccountString.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingAccountStringField.BYTE_LENGTH;
        }
        if (known >= 92) {
            if (!customerAccountRefId.parse(data, cursor)) {
                return false;
            }
            cursor += CustomerAccountRefIdField.BYTE_LENGTH;
        }
        if (known >= 122) {
            if (!memo.parse(data, cursor)) {
                return false;
            }
            cursor += MemoField.BYTE_LENGTH;
        }
        if (known >= 142) {
            if (!allocationAccount.parse(data, cursor)) {
                return false;
            }
            cursor += AllocationAccountField.BYTE_LENGTH;
        }
        if (known >= 183) {
            if (!onBehalfOfCompId.parse(data, cursor)) {
                return false;
            }
            cursor += OnBehalfOfCompIdField.BYTE_LENGTH;
        }
        if (known >= 224) {
            if (!onBehalfOfSubIDString.parse(data, cursor)) {
                return false;
            }
            cursor += OnBehalfOfSubIDStringField.BYTE_LENGTH;
        }
        if (known >= 265) {
            if (!onBehalfOfLocationIDString.parse(data, cursor)) {
                return false;
            }
            cursor += OnBehalfOfLocationIDStringField.BYTE_LENGTH;
        }
        if (wireBlock > known) {
            this.blockTrailer = Arrays.copyOfRange(data, offset + known, offset + wireBlock);
        }
        cursor = offset + wireBlock;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        int known = knownBytes();
        if (known >= 1) {
            cursor = sideSideEnum.encode(data, cursor);
        }
        if (known >= 9) {
            cursor = clOrdId.encode(data, cursor);
        }
        if (known >= 13) {
            cursor = giveUpClearingFirm.encode(data, cursor);
        }
        if (known >= 17) {
            cursor = clearingFirmInt.encode(data, cursor);
        }
        if (known >= 18) {
            cursor = directElectronicAccess.encode(data, cursor);
        }
        if (known >= 19) {
            cursor = tradingCapacity.encode(data, cursor);
        }
        if (known >= 20) {
            cursor = liquidityProvision.encode(data, cursor);
        }
        if (known >= 21) {
            cursor = commodityDerivIndicator.encode(data, cursor);
        }
        if (known >= 29) {
            cursor = investmentDecision.encode(data, cursor);
        }
        if (known >= 37) {
            cursor = executionDecision.encode(data, cursor);
        }
        if (known >= 45) {
            cursor = clientIdCode.encode(data, cursor);
        }
        if (known >= 53) {
            cursor = mifidId.encode(data, cursor);
        }
        if (known >= 61) {
            cursor = selfMatchPreventionId.encode(data, cursor);
        }
        if (known >= 62) {
            cursor = selfMatchPreventionInstruction.encode(data, cursor);
        }
        if (known >= 63) {
            cursor = manualOrderIndicator.encode(data, cursor);
        }
        if (known >= 64) {
            cursor = custOrderHandlingInst.encode(data, cursor);
        }
        if (known >= 65) {
            cursor = positionEffect.encode(data, cursor);
        }
        if (known >= 66) {
            cursor = allocHandlInst.encode(data, cursor);
        }
        if (known >= 80) {
            cursor = clearingAccountString.encode(data, cursor);
        }
        if (known >= 92) {
            cursor = customerAccountRefId.encode(data, cursor);
        }
        if (known >= 122) {
            cursor = memo.encode(data, cursor);
        }
        if (known >= 142) {
            cursor = allocationAccount.encode(data, cursor);
        }
        if (known >= 183) {
            cursor = onBehalfOfCompId.encode(data, cursor);
        }
        if (known >= 224) {
            cursor = onBehalfOfSubIDString.encode(data, cursor);
        }
        if (known >= 265) {
            cursor = onBehalfOfLocationIDString.encode(data, cursor);
        }
        int kept = Math.min(blockTrailer.length, wireBlock - known);
        System.arraycopy(blockTrailer, 0, data, offset + known, kept);
        Arrays.fill(data, offset + known + kept, offset + wireBlock, (byte) 0);
        cursor = offset + wireBlock;
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
        this.blockTrailer = new byte[0];
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
            if ((!decoded || field.hasValue()) && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if ((!decoded || field.hasValue()) && !field.isValid()) {
                return false;
            }
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
            case "SideSideEnum" -> Optional.of(sideSideEnum);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "GiveUpClearingFirm" -> Optional.of(giveUpClearingFirm);
            case "ClearingFirmInt" -> Optional.of(clearingFirmInt);
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
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "PositionEffect" -> Optional.of(positionEffect);
            case "AllocHandlInst" -> Optional.of(allocHandlInst);
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
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof NewOrderCrossRequestMessageNoSidesGroupEntry message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof NewOrderCrossRequestMessageNoSidesGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
