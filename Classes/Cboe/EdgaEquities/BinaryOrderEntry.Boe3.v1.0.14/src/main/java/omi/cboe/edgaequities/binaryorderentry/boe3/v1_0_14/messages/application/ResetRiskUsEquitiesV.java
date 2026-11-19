package omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ClearingFirmField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.RiskGroupIdField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.RiskResetField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.RiskStatusIdField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.SymbolField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.TargetMatchingUnitField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.types.Field;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.types.Message;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.types.PrintOptions;

/**
 * Represents the ResetRiskUsEquitiesV message from the BinaryOrderEntry protocol.
 *
 * <p>Reset or release Firm, Symbol, or Risk Group ID level lockout conditions resulting from risk profile trips or self-imposed lockouts issued via Purge Orders messages</p>
 */
public final class ResetRiskUsEquitiesV implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Reset Risk Us Equities V";

    /**
     * User defined identifier of a Reset Risk message
     */
    private final RiskStatusIdField riskStatusId = new RiskStatusIdField();

    /**
     * For use by customers to release MPID, symbol or RiskGroupID level lockout conditions resulting from self-imposed lockouts issued via Purge Orders messages
     */
    private final RiskResetField riskReset = new RiskResetField();

    /**
     * MPID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Entire Cboe format
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Matching unit number the Purge Orders message will be sent toward
     */
    private final TargetMatchingUnitField targetMatchingUnit = new TargetMatchingUnitField();

    /**
     * Used to group orders for use in Purge Orders messages where multiple orders can be cancelled by specifying a list of RiskGroupIDs
     */
    private final RiskGroupIdField riskGroupId = new RiskGroupIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(riskStatusId, riskReset, clearingFirm, symbol, targetMatchingUnit, riskGroupId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * User defined identifier of a Reset Risk message
     *
     * @return the RiskStatusId field
     */
    public RiskStatusIdField riskStatusId() {
        return riskStatusId;
    }

    /**
     * For use by customers to release MPID, symbol or RiskGroupID level lockout conditions resulting from self-imposed lockouts issued via Purge Orders messages
     *
     * @return the RiskReset field
     */
    public RiskResetField riskReset() {
        return riskReset;
    }

    /**
     * MPID that will clear the trade
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Entire Cboe format
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Matching unit number the Purge Orders message will be sent toward
     *
     * @return the TargetMatchingUnit field
     */
    public TargetMatchingUnitField targetMatchingUnit() {
        return targetMatchingUnit;
    }

    /**
     * Used to group orders for use in Purge Orders messages where multiple orders can be cancelled by specifying a list of RiskGroupIDs
     *
     * @return the RiskGroupId field
     */
    public RiskGroupIdField riskGroupId() {
        return riskGroupId;
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
        if (!riskStatusId.parse(data, cursor)) {
            return false;
        }
        cursor += RiskStatusIdField.BYTE_LENGTH;
        if (!riskReset.parse(data, cursor)) {
            return false;
        }
        cursor += RiskResetField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!targetMatchingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += TargetMatchingUnitField.BYTE_LENGTH;
        return riskGroupId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = riskStatusId.encode(data, cursor);
        cursor = riskReset.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = targetMatchingUnit.encode(data, cursor);
        cursor = riskGroupId.encode(data, cursor);
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
            case "RiskStatusId" -> Optional.of(riskStatusId);
            case "RiskReset" -> Optional.of(riskReset);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "Symbol" -> Optional.of(symbol);
            case "TargetMatchingUnit" -> Optional.of(targetMatchingUnit);
            case "RiskGroupId" -> Optional.of(riskGroupId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ResetRiskUsEquitiesV message)) {
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
        if (!(other instanceof ResetRiskUsEquitiesV message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
