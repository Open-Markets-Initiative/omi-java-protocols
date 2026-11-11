package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.AcknowledgementStyleField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ClearingFirmFilterField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.GtcOrderFilterField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.InstructionDetailsField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.InstrumentTypeFilterField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.LockoutInstructionField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.GroupEntry;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.PrintOptions;

/**
 * The MassCancelInst record a message holds.
 *
 * <p>Mass Cancel Inst</p>
 */
public final class MassCancelInst implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 16;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "MassCancelInst";

    /**
     * Clearing firm filter
     */
    private final ClearingFirmFilterField clearingFirmFilter = new ClearingFirmFilterField();

    /**
     * Acknowledgement Style
     */
    private final AcknowledgementStyleField acknowledgementStyle = new AcknowledgementStyleField();

    /**
     * Lockout Instruction
     */
    private final LockoutInstructionField lockoutInstruction = new LockoutInstructionField();

    /**
     * Instrument type filter
     */
    private final InstrumentTypeFilterField instrumentTypeFilter = new InstrumentTypeFilterField();

    /**
     * Gtc Order Filter
     */
    private final GtcOrderFilterField gtcOrderFilter = new GtcOrderFilterField();

    /**
     * Gtc Order Filter
     */
    private final InstructionDetailsField instructionDetails = new InstructionDetailsField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(clearingFirmFilter, acknowledgementStyle, lockoutInstruction, instrumentTypeFilter, gtcOrderFilter, instructionDetails);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Clearing firm filter
     *
     * @return the ClearingFirmFilter field
     */
    public ClearingFirmFilterField clearingFirmFilter() {
        return clearingFirmFilter;
    }

    /**
     * Acknowledgement Style
     *
     * @return the AcknowledgementStyle field
     */
    public AcknowledgementStyleField acknowledgementStyle() {
        return acknowledgementStyle;
    }

    /**
     * Lockout Instruction
     *
     * @return the LockoutInstruction field
     */
    public LockoutInstructionField lockoutInstruction() {
        return lockoutInstruction;
    }

    /**
     * Instrument type filter
     *
     * @return the InstrumentTypeFilter field
     */
    public InstrumentTypeFilterField instrumentTypeFilter() {
        return instrumentTypeFilter;
    }

    /**
     * Gtc Order Filter
     *
     * @return the GtcOrderFilter field
     */
    public GtcOrderFilterField gtcOrderFilter() {
        return gtcOrderFilter;
    }

    /**
     * Gtc Order Filter
     *
     * @return the InstructionDetails field
     */
    public InstructionDetailsField instructionDetails() {
        return instructionDetails;
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
        return new int[0];
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
        if (!clearingFirmFilter.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmFilterField.BYTE_LENGTH;
        if (!acknowledgementStyle.parse(data, cursor)) {
            return false;
        }
        cursor += AcknowledgementStyleField.BYTE_LENGTH;
        if (!lockoutInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += LockoutInstructionField.BYTE_LENGTH;
        if (!instrumentTypeFilter.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeFilterField.BYTE_LENGTH;
        if (!gtcOrderFilter.parse(data, cursor)) {
            return false;
        }
        cursor += GtcOrderFilterField.BYTE_LENGTH;
        return instructionDetails.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clearingFirmFilter.encode(data, cursor);
        cursor = acknowledgementStyle.encode(data, cursor);
        cursor = lockoutInstruction.encode(data, cursor);
        cursor = instrumentTypeFilter.encode(data, cursor);
        cursor = gtcOrderFilter.encode(data, cursor);
        cursor = instructionDetails.encode(data, cursor);
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
            case "ClearingFirmFilter" -> Optional.of(clearingFirmFilter);
            case "AcknowledgementStyle" -> Optional.of(acknowledgementStyle);
            case "LockoutInstruction" -> Optional.of(lockoutInstruction);
            case "InstrumentTypeFilter" -> Optional.of(instrumentTypeFilter);
            case "GtcOrderFilter" -> Optional.of(gtcOrderFilter);
            case "InstructionDetails" -> Optional.of(instructionDetails);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof MassCancelInst message)) {
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
        if (!(other instanceof MassCancelInst message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
