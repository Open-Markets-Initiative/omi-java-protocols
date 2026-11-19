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
import omi.ice.icefutures.bgw.sbe.v7_0.fields.RawDataField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TradingCapacityField;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the TraderLogonRequestMessage message from the Bgw protocol.
 *
 * <p>TraderLogonRequestMessage</p>
 */
public final class TraderLogonRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 106;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trader Logon Request Message";

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
     * rawData
     */
    private final RawDataField rawData = new RawDataField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(originatorUserId, directElectronicAccess, tradingCapacity, liquidityProvision, commodityDerivIndicator, investmentDecision, executionDecision, clientIdCode, mifidId, rawData);

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
     * rawData
     *
     * @return the RawData field
     */
    public RawDataField rawData() {
        return rawData;
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
        return rawData.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = originatorUserId.encode(data, cursor);
        cursor = directElectronicAccess.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = liquidityProvision.encode(data, cursor);
        cursor = commodityDerivIndicator.encode(data, cursor);
        cursor = investmentDecision.encode(data, cursor);
        cursor = executionDecision.encode(data, cursor);
        cursor = clientIdCode.encode(data, cursor);
        cursor = mifidId.encode(data, cursor);
        cursor = rawData.encode(data, cursor);
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
            case "OriginatorUserId" -> Optional.of(originatorUserId);
            case "DirectElectronicAccess" -> Optional.of(directElectronicAccess);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "CommodityDerivIndicator" -> Optional.of(commodityDerivIndicator);
            case "InvestmentDecision" -> Optional.of(investmentDecision);
            case "ExecutionDecision" -> Optional.of(executionDecision);
            case "ClientIdCode" -> Optional.of(clientIdCode);
            case "MifidId" -> Optional.of(mifidId);
            case "RawData" -> Optional.of(rawData);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TraderLogonRequestMessage message)) {
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
        if (!(other instanceof TraderLogonRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
