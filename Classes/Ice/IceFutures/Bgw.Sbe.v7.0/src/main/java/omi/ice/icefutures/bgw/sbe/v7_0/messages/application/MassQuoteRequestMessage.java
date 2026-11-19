package omi.ice.icefutures.bgw.sbe.v7_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClientIdCodeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CommodityDerivIndicatorField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.DirectElectronicAccessField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExecutionDecisionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.InvestmentDecisionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LiquidityProvisionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MifidIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OriginatorUserIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.QuoteIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.RiskProtectionResetField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SelfMatchPreventionIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SelfMatchPreventionInstructionField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TradingCapacityField;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.MassQuoteRequestMessageNoQuoteSetsGroups;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the MassQuoteRequestMessage message from the Bgw protocol.
 *
 * <p>MassQuoteRequestMessage</p>
 */
public final class MassQuoteRequestMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 78;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Quote Request Message";

    /**
     * quoteID
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * riskProtectionReset
     */
    private final RiskProtectionResetField riskProtectionReset = new RiskProtectionResetField();

    /**
     * selfMatchPreventionID
     */
    private final SelfMatchPreventionIdField selfMatchPreventionId = new SelfMatchPreventionIdField();

    /**
     * selfMatchPreventionInstruction
     */
    private final SelfMatchPreventionInstructionField selfMatchPreventionInstruction = new SelfMatchPreventionInstructionField();

    /**
     * originatorUserID
     */
    private final OriginatorUserIdField originatorUserId = new OriginatorUserIdField();

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
     * noQuoteSets Block
     */
    private final MassQuoteRequestMessageNoQuoteSetsGroups massQuoteRequestMessageNoQuoteSetsGroups = new MassQuoteRequestMessageNoQuoteSetsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(quoteId, riskProtectionReset, selfMatchPreventionId, selfMatchPreventionInstruction, originatorUserId, directElectronicAccess, tradingCapacity, liquidityProvision, commodityDerivIndicator, investmentDecision, executionDecision, clientIdCode, mifidId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * quoteID
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * riskProtectionReset
     *
     * @return the RiskProtectionReset field
     */
    public RiskProtectionResetField riskProtectionReset() {
        return riskProtectionReset;
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
     * originatorUserID
     *
     * @return the OriginatorUserId field
     */
    public OriginatorUserIdField originatorUserId() {
        return originatorUserId;
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
     * noQuoteSets Block
     *
     * @return the MassQuoteRequestMessageNoQuoteSetsGroups record
     */
    public MassQuoteRequestMessageNoQuoteSetsGroups massQuoteRequestMessageNoQuoteSetsGroups() {
        return massQuoteRequestMessageNoQuoteSetsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + massQuoteRequestMessageNoQuoteSetsGroups.byteLength() - MassQuoteRequestMessageNoQuoteSetsGroups.MINIMUM_BYTE_LENGTH;
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
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!riskProtectionReset.parse(data, cursor)) {
            return false;
        }
        cursor += RiskProtectionResetField.BYTE_LENGTH;
        if (!selfMatchPreventionId.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionIdField.BYTE_LENGTH;
        if (!selfMatchPreventionInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionInstructionField.BYTE_LENGTH;
        if (!originatorUserId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginatorUserIdField.BYTE_LENGTH;
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
        if (!massQuoteRequestMessageNoQuoteSetsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += massQuoteRequestMessageNoQuoteSetsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = quoteId.encode(data, cursor);
        cursor = riskProtectionReset.encode(data, cursor);
        cursor = selfMatchPreventionId.encode(data, cursor);
        cursor = selfMatchPreventionInstruction.encode(data, cursor);
        cursor = originatorUserId.encode(data, cursor);
        cursor = directElectronicAccess.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = liquidityProvision.encode(data, cursor);
        cursor = commodityDerivIndicator.encode(data, cursor);
        cursor = investmentDecision.encode(data, cursor);
        cursor = executionDecision.encode(data, cursor);
        cursor = clientIdCode.encode(data, cursor);
        cursor = mifidId.encode(data, cursor);
        cursor = massQuoteRequestMessageNoQuoteSetsGroups.encode(data, cursor);
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
        massQuoteRequestMessageNoQuoteSetsGroups.clear();
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        return massQuoteRequestMessageNoQuoteSetsGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!massQuoteRequestMessageNoQuoteSetsGroups.isValid()) {
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
        if (!quoteId.isDecoded()) {
            return Optional.of(quoteId);
        }
        if (!riskProtectionReset.isDecoded()) {
            return Optional.of(riskProtectionReset);
        }
        if (!selfMatchPreventionId.isDecoded()) {
            return Optional.of(selfMatchPreventionId);
        }
        if (!selfMatchPreventionInstruction.isDecoded()) {
            return Optional.of(selfMatchPreventionInstruction);
        }
        if (!originatorUserId.isDecoded()) {
            return Optional.of(originatorUserId);
        }
        if (!directElectronicAccess.isDecoded()) {
            return Optional.of(directElectronicAccess);
        }
        if (!tradingCapacity.isDecoded()) {
            return Optional.of(tradingCapacity);
        }
        if (!liquidityProvision.isDecoded()) {
            return Optional.of(liquidityProvision);
        }
        if (!commodityDerivIndicator.isDecoded()) {
            return Optional.of(commodityDerivIndicator);
        }
        if (!investmentDecision.isDecoded()) {
            return Optional.of(investmentDecision);
        }
        if (!executionDecision.isDecoded()) {
            return Optional.of(executionDecision);
        }
        if (!clientIdCode.isDecoded()) {
            return Optional.of(clientIdCode);
        }
        if (!mifidId.isDecoded()) {
            return Optional.of(mifidId);
        }
        if (!massQuoteRequestMessageNoQuoteSetsGroups.isDecoded()) {
            return massQuoteRequestMessageNoQuoteSetsGroups.failedAt();
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
            case "QuoteId" -> Optional.of(quoteId);
            case "RiskProtectionReset" -> Optional.of(riskProtectionReset);
            case "SelfMatchPreventionId" -> Optional.of(selfMatchPreventionId);
            case "SelfMatchPreventionInstruction" -> Optional.of(selfMatchPreventionInstruction);
            case "OriginatorUserId" -> Optional.of(originatorUserId);
            case "DirectElectronicAccess" -> Optional.of(directElectronicAccess);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "CommodityDerivIndicator" -> Optional.of(commodityDerivIndicator);
            case "InvestmentDecision" -> Optional.of(investmentDecision);
            case "ExecutionDecision" -> Optional.of(executionDecision);
            case "ClientIdCode" -> Optional.of(clientIdCode);
            case "MifidId" -> Optional.of(mifidId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassQuoteRequestMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(massQuoteRequestMessageNoQuoteSetsGroups.diffFields(message.massQuoteRequestMessageNoQuoteSetsGroups));
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
            massQuoteRequestMessageNoQuoteSetsGroups.toFormattedString(builder, options);
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
        massQuoteRequestMessageNoQuoteSetsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof MassQuoteRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && massQuoteRequestMessageNoQuoteSetsGroups.equals(message.massQuoteRequestMessageNoQuoteSetsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, massQuoteRequestMessageNoQuoteSetsGroups);
    }
}
