package omi.eurex.t7.edci.fbe.v14_0.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.edci.fbe.v14_0.fields.AffectedClOrdIdField;
import omi.eurex.t7.edci.fbe.v14_0.fields.AffectedFixClOrdIdField;
import omi.eurex.t7.edci.fbe.v14_0.fields.AffectedFixOrigClOrdIdField;
import omi.eurex.t7.edci.fbe.v14_0.fields.AffectedOrderIdField;
import omi.eurex.t7.edci.fbe.v14_0.fields.AffectedOrigClOrdIdField;
import omi.eurex.t7.edci.fbe.v14_0.fields.ExecTypeField;
import omi.eurex.t7.edci.fbe.v14_0.fields.OrdStatusField;
import omi.eurex.t7.edci.fbe.v14_0.fields.PartyIdExecutingTraderField;
import omi.eurex.t7.edci.fbe.v14_0.fields.PartyIdSessionIdField;
import omi.eurex.t7.edci.fbe.v14_0.fields.SecurityIdField;
import omi.eurex.t7.edci.fbe.v14_0.types.Field;
import omi.eurex.t7.edci.fbe.v14_0.types.GroupEntry;
import omi.eurex.t7.edci.fbe.v14_0.types.PrintOptions;

/**
 * One entry of the AffectedOrdGrpComp repeating group.
 *
 * <p>Affected Ord Grp Comp</p>
 */
public final class AffectedOrdGrpCompEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 88;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "AffectedOrdGrpComp";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 82, 6 };

    /**
     * Affected Order Id
     */
    private final AffectedOrderIdField affectedOrderId = new AffectedOrderIdField();

    /**
     * Affected Cl Ord Id
     */
    private final AffectedClOrdIdField affectedClOrdId = new AffectedClOrdIdField();

    /**
     * Affected Orig Cl Ord Id
     */
    private final AffectedOrigClOrdIdField affectedOrigClOrdId = new AffectedOrigClOrdIdField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Party Id Session Id
     */
    private final PartyIdSessionIdField partyIdSessionId = new PartyIdSessionIdField();

    /**
     * Party Id Executing Trader
     */
    private final PartyIdExecutingTraderField partyIdExecutingTrader = new PartyIdExecutingTraderField();

    /**
     * Ord Status
     */
    private final OrdStatusField ordStatus = new OrdStatusField();

    /**
     * Exec Type
     */
    private final ExecTypeField execType = new ExecTypeField();

    /**
     * Affected Fix Cl Ord Id
     */
    private final AffectedFixClOrdIdField affectedFixClOrdId = new AffectedFixClOrdIdField();

    /**
     * Affected Fix Orig Cl Ord Id
     */
    private final AffectedFixOrigClOrdIdField affectedFixOrigClOrdId = new AffectedFixOrigClOrdIdField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(affectedOrderId, affectedClOrdId, affectedOrigClOrdId, securityId, partyIdSessionId, partyIdExecutingTrader, ordStatus, execType, affectedFixClOrdId, affectedFixOrigClOrdId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Affected Order Id
     *
     * @return the AffectedOrderId field
     */
    public AffectedOrderIdField affectedOrderId() {
        return affectedOrderId;
    }

    /**
     * Affected Cl Ord Id
     *
     * @return the AffectedClOrdId field
     */
    public AffectedClOrdIdField affectedClOrdId() {
        return affectedClOrdId;
    }

    /**
     * Affected Orig Cl Ord Id
     *
     * @return the AffectedOrigClOrdId field
     */
    public AffectedOrigClOrdIdField affectedOrigClOrdId() {
        return affectedOrigClOrdId;
    }

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Party Id Session Id
     *
     * @return the PartyIdSessionId field
     */
    public PartyIdSessionIdField partyIdSessionId() {
        return partyIdSessionId;
    }

    /**
     * Party Id Executing Trader
     *
     * @return the PartyIdExecutingTrader field
     */
    public PartyIdExecutingTraderField partyIdExecutingTrader() {
        return partyIdExecutingTrader;
    }

    /**
     * Ord Status
     *
     * @return the OrdStatus field
     */
    public OrdStatusField ordStatus() {
        return ordStatus;
    }

    /**
     * Exec Type
     *
     * @return the ExecType field
     */
    public ExecTypeField execType() {
        return execType;
    }

    /**
     * Affected Fix Cl Ord Id
     *
     * @return the AffectedFixClOrdId field
     */
    public AffectedFixClOrdIdField affectedFixClOrdId() {
        return affectedFixClOrdId;
    }

    /**
     * Affected Fix Orig Cl Ord Id
     *
     * @return the AffectedFixOrigClOrdId field
     */
    public AffectedFixOrigClOrdIdField affectedFixOrigClOrdId() {
        return affectedFixOrigClOrdId;
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
        if (!affectedOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += AffectedOrderIdField.BYTE_LENGTH;
        if (!affectedClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += AffectedClOrdIdField.BYTE_LENGTH;
        if (!affectedOrigClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += AffectedOrigClOrdIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!partyIdSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdSessionIdField.BYTE_LENGTH;
        if (!partyIdExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdExecutingTraderField.BYTE_LENGTH;
        if (!ordStatus.parse(data, cursor)) {
            return false;
        }
        cursor += OrdStatusField.BYTE_LENGTH;
        if (!execType.parse(data, cursor)) {
            return false;
        }
        cursor += ExecTypeField.BYTE_LENGTH;
        if (!affectedFixClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += AffectedFixClOrdIdField.BYTE_LENGTH;
        if (!affectedFixOrigClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += AffectedFixOrigClOrdIdField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = affectedOrderId.encode(data, cursor);
        cursor = affectedClOrdId.encode(data, cursor);
        cursor = affectedOrigClOrdId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = partyIdSessionId.encode(data, cursor);
        cursor = partyIdExecutingTrader.encode(data, cursor);
        cursor = ordStatus.encode(data, cursor);
        cursor = execType.encode(data, cursor);
        cursor = affectedFixClOrdId.encode(data, cursor);
        cursor = affectedFixOrigClOrdId.encode(data, cursor);
        if (buffer != null && buffer.length >= 88) {
            System.arraycopy(buffer, 82, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
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
            case "AffectedOrderId" -> Optional.of(affectedOrderId);
            case "AffectedClOrdId" -> Optional.of(affectedClOrdId);
            case "AffectedOrigClOrdId" -> Optional.of(affectedOrigClOrdId);
            case "SecurityId" -> Optional.of(securityId);
            case "PartyIdSessionId" -> Optional.of(partyIdSessionId);
            case "PartyIdExecutingTrader" -> Optional.of(partyIdExecutingTrader);
            case "OrdStatus" -> Optional.of(ordStatus);
            case "ExecType" -> Optional.of(execType);
            case "AffectedFixClOrdId" -> Optional.of(affectedFixClOrdId);
            case "AffectedFixOrigClOrdId" -> Optional.of(affectedFixOrigClOrdId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof AffectedOrdGrpCompEntry message)) {
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
        if (!(other instanceof AffectedOrdGrpCompEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
