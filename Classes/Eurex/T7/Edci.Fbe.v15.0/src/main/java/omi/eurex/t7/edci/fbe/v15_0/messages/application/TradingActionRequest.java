package omi.eurex.t7.edci.fbe.v15_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.edci.fbe.v15_0.fields.OrderDeletionInstructionField;
import omi.eurex.t7.edci.fbe.v15_0.fields.PartyActionTypeField;
import omi.eurex.t7.edci.fbe.v15_0.fields.PartyIdExecutingUnitField;
import omi.eurex.t7.edci.fbe.v15_0.fields.RiskLimitPlatformField;
import omi.eurex.t7.edci.fbe.v15_0.fields.TargetPartyIdExecutingUnitField;
import omi.eurex.t7.edci.fbe.v15_0.structs.RequestHeaderComp;
import omi.eurex.t7.edci.fbe.v15_0.types.Field;
import omi.eurex.t7.edci.fbe.v15_0.types.Message;
import omi.eurex.t7.edci.fbe.v15_0.types.PrintOptions;

/**
 * Represents the TradingActionRequest message from the Edci protocol.
 */
public final class TradingActionRequest implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trading Action Request";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 13, 1, 22, 4 };

    /**
     * Risk Limit Platform
     */
    private final RiskLimitPlatformField riskLimitPlatform = new RiskLimitPlatformField();

    /**
     * Order Deletion Instruction
     */
    private final OrderDeletionInstructionField orderDeletionInstruction = new OrderDeletionInstructionField();

    /**
     * Party Action Type
     */
    private final PartyActionTypeField partyActionType = new PartyActionTypeField();

    /**
     * Party Id Executing Unit
     */
    private final PartyIdExecutingUnitField partyIdExecutingUnit = new PartyIdExecutingUnitField();

    /**
     * Target Party Id Executing Unit
     */
    private final TargetPartyIdExecutingUnitField targetPartyIdExecutingUnit = new TargetPartyIdExecutingUnitField();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(requestHeaderComp.fields(), List.<Field>of(riskLimitPlatform), List.<Field>of(orderDeletionInstruction), List.<Field>of(partyActionType), List.<Field>of(partyIdExecutingUnit), List.<Field>of(targetPartyIdExecutingUnit)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Risk Limit Platform
     *
     * @return the RiskLimitPlatform field
     */
    public RiskLimitPlatformField riskLimitPlatform() {
        return riskLimitPlatform;
    }

    /**
     * Order Deletion Instruction
     *
     * @return the OrderDeletionInstruction field
     */
    public OrderDeletionInstructionField orderDeletionInstruction() {
        return orderDeletionInstruction;
    }

    /**
     * Party Action Type
     *
     * @return the PartyActionType field
     */
    public PartyActionTypeField partyActionType() {
        return partyActionType;
    }

    /**
     * Party Id Executing Unit
     *
     * @return the PartyIdExecutingUnit field
     */
    public PartyIdExecutingUnitField partyIdExecutingUnit() {
        return partyIdExecutingUnit;
    }

    /**
     * Target Party Id Executing Unit
     *
     * @return the TargetPartyIdExecutingUnit field
     */
    public TargetPartyIdExecutingUnitField targetPartyIdExecutingUnit() {
        return targetPartyIdExecutingUnit;
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
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 16)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!riskLimitPlatform.parse(data, cursor)) {
            return false;
        }
        cursor += RiskLimitPlatformField.BYTE_LENGTH;
        if (!orderDeletionInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += OrderDeletionInstructionField.BYTE_LENGTH;
        if (!partyActionType.parse(data, cursor)) {
            return false;
        }
        cursor += PartyActionTypeField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!partyIdExecutingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdExecutingUnitField.BYTE_LENGTH;
        if (!targetPartyIdExecutingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyIdExecutingUnitField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = riskLimitPlatform.encode(data, cursor);
        cursor = orderDeletionInstruction.encode(data, cursor);
        cursor = partyActionType.encode(data, cursor);
        if (buffer != null && buffer.length >= 14) {
            System.arraycopy(buffer, 13, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = partyIdExecutingUnit.encode(data, cursor);
        cursor = targetPartyIdExecutingUnit.encode(data, cursor);
        if (buffer != null && buffer.length >= 26) {
            System.arraycopy(buffer, 22, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
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
            case "RiskLimitPlatform" -> Optional.of(riskLimitPlatform);
            case "OrderDeletionInstruction" -> Optional.of(orderDeletionInstruction);
            case "PartyActionType" -> Optional.of(partyActionType);
            case "PartyIdExecutingUnit" -> Optional.of(partyIdExecutingUnit);
            case "TargetPartyIdExecutingUnit" -> Optional.of(targetPartyIdExecutingUnit);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradingActionRequest message)) {
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
        if (!(other instanceof TradingActionRequest message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
