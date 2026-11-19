package omi.eurex.t7.edci.fbe.v15_0.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.edci.fbe.v15_0.fields.ClOrdIdField;
import omi.eurex.t7.edci.fbe.v15_0.fields.CrossMatchInstructionField;
import omi.eurex.t7.edci.fbe.v15_0.fields.CustOrderHandlingInstField;
import omi.eurex.t7.edci.fbe.v15_0.fields.ExecutingTraderField;
import omi.eurex.t7.edci.fbe.v15_0.fields.ExecutingTraderQualifierField;
import omi.eurex.t7.edci.fbe.v15_0.fields.InputSourceField;
import omi.eurex.t7.edci.fbe.v15_0.fields.MatchInstCrossIdField;
import omi.eurex.t7.edci.fbe.v15_0.fields.MaximumPriceField;
import omi.eurex.t7.edci.fbe.v15_0.fields.OrderIdField;
import omi.eurex.t7.edci.fbe.v15_0.fields.OrderOriginationField;
import omi.eurex.t7.edci.fbe.v15_0.fields.PartyEndClientIdentificationField;
import omi.eurex.t7.edci.fbe.v15_0.fields.PartyIdClientIdField;
import omi.eurex.t7.edci.fbe.v15_0.fields.PartyIdInvestmentDecisionMakerField;
import omi.eurex.t7.edci.fbe.v15_0.fields.PartyIdInvestmentDecisionMakerQualifierField;
import omi.eurex.t7.edci.fbe.v15_0.fields.SelfMatchPreventionInstructionField;
import omi.eurex.t7.edci.fbe.v15_0.fields.SideField;
import omi.eurex.t7.edci.fbe.v15_0.fields.TradingCapacityField;
import omi.eurex.t7.edci.fbe.v15_0.types.Field;
import omi.eurex.t7.edci.fbe.v15_0.types.GroupEntry;
import omi.eurex.t7.edci.fbe.v15_0.types.PrintOptions;

/**
 * One entry of the CrossRequestSideGrpComp repeating group.
 *
 * <p>Cross Request Side Grp Comp</p>
 */
public final class CrossRequestSideGrpCompEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 88;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "CrossRequestSideGrpComp";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 81, 7 };

    /**
     * Cl Ord Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Order Id
     */
    private final OrderIdField orderId = new OrderIdField();

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
     * Maximum Price
     */
    private final MaximumPriceField maximumPrice = new MaximumPriceField();

    /**
     * Match Inst Cross Id
     */
    private final MatchInstCrossIdField matchInstCrossId = new MatchInstCrossIdField();

    /**
     * Input Source
     */
    private final InputSourceField inputSource = new InputSourceField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Self Match Prevention Instruction
     */
    private final SelfMatchPreventionInstructionField selfMatchPreventionInstruction = new SelfMatchPreventionInstructionField();

    /**
     * Cross Match Instruction
     */
    private final CrossMatchInstructionField crossMatchInstruction = new CrossMatchInstructionField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Party Id Investment Decision Maker Qualifier
     */
    private final PartyIdInvestmentDecisionMakerQualifierField partyIdInvestmentDecisionMakerQualifier = new PartyIdInvestmentDecisionMakerQualifierField();

    /**
     * Executing Trader Qualifier
     */
    private final ExecutingTraderQualifierField executingTraderQualifier = new ExecutingTraderQualifierField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * Party End Client Identification
     */
    private final PartyEndClientIdentificationField partyEndClientIdentification = new PartyEndClientIdentificationField();

    /**
     * Order Origination
     */
    private final OrderOriginationField orderOrigination = new OrderOriginationField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, orderId, partyIdClientId, partyIdInvestmentDecisionMaker, executingTrader, maximumPrice, matchInstCrossId, inputSource, side, selfMatchPreventionInstruction, crossMatchInstruction, tradingCapacity, partyIdInvestmentDecisionMakerQualifier, executingTraderQualifier, custOrderHandlingInst, partyEndClientIdentification, orderOrigination);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Cl Ord Id
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
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
     * Maximum Price
     *
     * @return the MaximumPrice field
     */
    public MaximumPriceField maximumPrice() {
        return maximumPrice;
    }

    /**
     * Match Inst Cross Id
     *
     * @return the MatchInstCrossId field
     */
    public MatchInstCrossIdField matchInstCrossId() {
        return matchInstCrossId;
    }

    /**
     * Input Source
     *
     * @return the InputSource field
     */
    public InputSourceField inputSource() {
        return inputSource;
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
     * Self Match Prevention Instruction
     *
     * @return the SelfMatchPreventionInstruction field
     */
    public SelfMatchPreventionInstructionField selfMatchPreventionInstruction() {
        return selfMatchPreventionInstruction;
    }

    /**
     * Cross Match Instruction
     *
     * @return the CrossMatchInstruction field
     */
    public CrossMatchInstructionField crossMatchInstruction() {
        return crossMatchInstruction;
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
     * Cust Order Handling Inst
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
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
     * Order Origination
     *
     * @return the OrderOrigination field
     */
    public OrderOriginationField orderOrigination() {
        return orderOrigination;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
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
        if (!maximumPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MaximumPriceField.BYTE_LENGTH;
        if (!matchInstCrossId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchInstCrossIdField.BYTE_LENGTH;
        if (!inputSource.parse(data, cursor)) {
            return false;
        }
        cursor += InputSourceField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!selfMatchPreventionInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionInstructionField.BYTE_LENGTH;
        if (!crossMatchInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += CrossMatchInstructionField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!partyIdInvestmentDecisionMakerQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdInvestmentDecisionMakerQualifierField.BYTE_LENGTH;
        if (!executingTraderQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderQualifierField.BYTE_LENGTH;
        if (!custOrderHandlingInst.parse(data, cursor)) {
            return false;
        }
        cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        if (!partyEndClientIdentification.parse(data, cursor)) {
            return false;
        }
        cursor += PartyEndClientIdentificationField.BYTE_LENGTH;
        if (!orderOrigination.parse(data, cursor)) {
            return false;
        }
        cursor += OrderOriginationField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = partyIdClientId.encode(data, cursor);
        cursor = partyIdInvestmentDecisionMaker.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = maximumPrice.encode(data, cursor);
        cursor = matchInstCrossId.encode(data, cursor);
        cursor = inputSource.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = selfMatchPreventionInstruction.encode(data, cursor);
        cursor = crossMatchInstruction.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = partyIdInvestmentDecisionMakerQualifier.encode(data, cursor);
        cursor = executingTraderQualifier.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = partyEndClientIdentification.encode(data, cursor);
        cursor = orderOrigination.encode(data, cursor);
        if (buffer != null && buffer.length >= 88) {
            System.arraycopy(buffer, 81, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderId" -> Optional.of(orderId);
            case "PartyIdClientId" -> Optional.of(partyIdClientId);
            case "PartyIdInvestmentDecisionMaker" -> Optional.of(partyIdInvestmentDecisionMaker);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "MaximumPrice" -> Optional.of(maximumPrice);
            case "MatchInstCrossId" -> Optional.of(matchInstCrossId);
            case "InputSource" -> Optional.of(inputSource);
            case "Side" -> Optional.of(side);
            case "SelfMatchPreventionInstruction" -> Optional.of(selfMatchPreventionInstruction);
            case "CrossMatchInstruction" -> Optional.of(crossMatchInstruction);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "PartyIdInvestmentDecisionMakerQualifier" -> Optional.of(partyIdInvestmentDecisionMakerQualifier);
            case "ExecutingTraderQualifier" -> Optional.of(executingTraderQualifier);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "PartyEndClientIdentification" -> Optional.of(partyEndClientIdentification);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof CrossRequestSideGrpCompEntry message)) {
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
        if (!(other instanceof CrossRequestSideGrpCompEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
