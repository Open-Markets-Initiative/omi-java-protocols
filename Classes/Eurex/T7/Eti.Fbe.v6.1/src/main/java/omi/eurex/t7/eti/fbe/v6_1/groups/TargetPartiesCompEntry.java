package omi.eurex.t7.eti.fbe.v6_1.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eti.fbe.v6_1.fields.LastPxDisclosureInstructionField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LastQtyDisclosureInstructionField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LeavesQtyDisclosureInstructionField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PriceDisclosureInstructionField;
import omi.eurex.t7.eti.fbe.v6_1.fields.QuoteInstructionField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SideDisclosureInstructionField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TargetPartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TargetPartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.GroupEntry;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * One entry of the TargetPartiesComp repeating group.
 *
 * <p>Target Parties Comp</p>
 */
public final class TargetPartiesCompEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 24;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "TargetPartiesComp";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 17, 7 };

    /**
     * Side Disclosure Instruction
     */
    private final SideDisclosureInstructionField sideDisclosureInstruction = new SideDisclosureInstructionField();

    /**
     * Price Disclosure Instruction
     */
    private final PriceDisclosureInstructionField priceDisclosureInstruction = new PriceDisclosureInstructionField();

    /**
     * Leaves Qty Disclosure Instruction
     */
    private final LeavesQtyDisclosureInstructionField leavesQtyDisclosureInstruction = new LeavesQtyDisclosureInstructionField();

    /**
     * Last Px Disclosure Instruction
     */
    private final LastPxDisclosureInstructionField lastPxDisclosureInstruction = new LastPxDisclosureInstructionField();

    /**
     * Last Qty Disclosure Instruction
     */
    private final LastQtyDisclosureInstructionField lastQtyDisclosureInstruction = new LastQtyDisclosureInstructionField();

    /**
     * Quote Instruction
     */
    private final QuoteInstructionField quoteInstruction = new QuoteInstructionField();

    /**
     * Target Party Executing Firm
     */
    private final TargetPartyExecutingFirmField targetPartyExecutingFirm = new TargetPartyExecutingFirmField();

    /**
     * Target Party Executing Trader
     */
    private final TargetPartyExecutingTraderField targetPartyExecutingTrader = new TargetPartyExecutingTraderField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(sideDisclosureInstruction, priceDisclosureInstruction, leavesQtyDisclosureInstruction, lastPxDisclosureInstruction, lastQtyDisclosureInstruction, quoteInstruction, targetPartyExecutingFirm, targetPartyExecutingTrader);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Side Disclosure Instruction
     *
     * @return the SideDisclosureInstruction field
     */
    public SideDisclosureInstructionField sideDisclosureInstruction() {
        return sideDisclosureInstruction;
    }

    /**
     * Price Disclosure Instruction
     *
     * @return the PriceDisclosureInstruction field
     */
    public PriceDisclosureInstructionField priceDisclosureInstruction() {
        return priceDisclosureInstruction;
    }

    /**
     * Leaves Qty Disclosure Instruction
     *
     * @return the LeavesQtyDisclosureInstruction field
     */
    public LeavesQtyDisclosureInstructionField leavesQtyDisclosureInstruction() {
        return leavesQtyDisclosureInstruction;
    }

    /**
     * Last Px Disclosure Instruction
     *
     * @return the LastPxDisclosureInstruction field
     */
    public LastPxDisclosureInstructionField lastPxDisclosureInstruction() {
        return lastPxDisclosureInstruction;
    }

    /**
     * Last Qty Disclosure Instruction
     *
     * @return the LastQtyDisclosureInstruction field
     */
    public LastQtyDisclosureInstructionField lastQtyDisclosureInstruction() {
        return lastQtyDisclosureInstruction;
    }

    /**
     * Quote Instruction
     *
     * @return the QuoteInstruction field
     */
    public QuoteInstructionField quoteInstruction() {
        return quoteInstruction;
    }

    /**
     * Target Party Executing Firm
     *
     * @return the TargetPartyExecutingFirm field
     */
    public TargetPartyExecutingFirmField targetPartyExecutingFirm() {
        return targetPartyExecutingFirm;
    }

    /**
     * Target Party Executing Trader
     *
     * @return the TargetPartyExecutingTrader field
     */
    public TargetPartyExecutingTraderField targetPartyExecutingTrader() {
        return targetPartyExecutingTrader;
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
        if (!sideDisclosureInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += SideDisclosureInstructionField.BYTE_LENGTH;
        if (!priceDisclosureInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDisclosureInstructionField.BYTE_LENGTH;
        if (!leavesQtyDisclosureInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyDisclosureInstructionField.BYTE_LENGTH;
        if (!lastPxDisclosureInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxDisclosureInstructionField.BYTE_LENGTH;
        if (!lastQtyDisclosureInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyDisclosureInstructionField.BYTE_LENGTH;
        if (!quoteInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteInstructionField.BYTE_LENGTH;
        if (!targetPartyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyExecutingFirmField.BYTE_LENGTH;
        if (!targetPartyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyExecutingTraderField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sideDisclosureInstruction.encode(data, cursor);
        cursor = priceDisclosureInstruction.encode(data, cursor);
        cursor = leavesQtyDisclosureInstruction.encode(data, cursor);
        cursor = lastPxDisclosureInstruction.encode(data, cursor);
        cursor = lastQtyDisclosureInstruction.encode(data, cursor);
        cursor = quoteInstruction.encode(data, cursor);
        cursor = targetPartyExecutingFirm.encode(data, cursor);
        cursor = targetPartyExecutingTrader.encode(data, cursor);
        if (buffer != null && buffer.length >= 24) {
            System.arraycopy(buffer, 17, data, cursor, 7); // padding
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
            case "SideDisclosureInstruction" -> Optional.of(sideDisclosureInstruction);
            case "PriceDisclosureInstruction" -> Optional.of(priceDisclosureInstruction);
            case "LeavesQtyDisclosureInstruction" -> Optional.of(leavesQtyDisclosureInstruction);
            case "LastPxDisclosureInstruction" -> Optional.of(lastPxDisclosureInstruction);
            case "LastQtyDisclosureInstruction" -> Optional.of(lastQtyDisclosureInstruction);
            case "QuoteInstruction" -> Optional.of(quoteInstruction);
            case "TargetPartyExecutingFirm" -> Optional.of(targetPartyExecutingFirm);
            case "TargetPartyExecutingTrader" -> Optional.of(targetPartyExecutingTrader);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof TargetPartiesCompEntry message)) {
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
        if (!(other instanceof TargetPartiesCompEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
