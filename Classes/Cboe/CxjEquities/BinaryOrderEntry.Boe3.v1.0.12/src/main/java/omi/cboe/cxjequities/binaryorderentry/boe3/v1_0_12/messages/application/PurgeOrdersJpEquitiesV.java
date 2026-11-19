package omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.MassCancelIdField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.MassCancelInstField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.RiskGroupIdCntField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.SymbolField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.TradingFirmField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.groups.RiskGroupIdEntry;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.groups.RiskGroupIdList;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.types.Field;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.types.Message;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.types.PrintOptions;

/**
 * Represents the PurgeOrdersJpEquitiesV message from the BinaryOrderEntry protocol.
 *
 * <p>Request to cancel a group of orders across all of the participant's sessions</p>
 */
public final class PurgeOrdersJpEquitiesV implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 49;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Purge Orders Jp Equities V";

    /**
     * The four-character identifier of the trading firm
     */
    private final TradingFirmField tradingFirm = new TradingFirmField();

    /**
     * At least one character must be provided (Firm Filter)
     */
    private final MassCancelInstField massCancelInst = new MassCancelInstField();

    /**
     * User-defined identifier of the mass cancel or purge request
     */
    private final MassCancelIdField massCancelId = new MassCancelIdField();

    /**
     * Instrument symbol (QUICK symbology)
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Number of repeating RiskGroupID included in this message. Value 0 to 10
     */
    private final RiskGroupIdCntField riskGroupIdCnt = new RiskGroupIdCntField();

    /**
     * Used to group orders for use in order purges where multiple orders can be cancelled by specifying a list of RiskGroupIDs
     */
    private final RiskGroupIdList riskGroupId = new RiskGroupIdList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradingFirm, massCancelInst, massCancelId, symbol, riskGroupIdCnt);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The four-character identifier of the trading firm
     *
     * @return the TradingFirm field
     */
    public TradingFirmField tradingFirm() {
        return tradingFirm;
    }

    /**
     * At least one character must be provided (Firm Filter)
     *
     * @return the MassCancelInst field
     */
    public MassCancelInstField massCancelInst() {
        return massCancelInst;
    }

    /**
     * User-defined identifier of the mass cancel or purge request
     *
     * @return the MassCancelId field
     */
    public MassCancelIdField massCancelId() {
        return massCancelId;
    }

    /**
     * Instrument symbol (QUICK symbology)
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Number of repeating RiskGroupID included in this message. Value 0 to 10
     *
     * @return the RiskGroupIdCnt field
     */
    public RiskGroupIdCntField riskGroupIdCnt() {
        return riskGroupIdCnt;
    }

    /**
     * Used to group orders for use in order purges where multiple orders can be cancelled by specifying a list of RiskGroupIDs
     *
     * <p>Encode writes this list's size to the RiskGroupIdCnt field.</p>
     *
     * @return the RiskGroupId entries
     */
    public RiskGroupIdList riskGroupId() {
        return riskGroupId;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + riskGroupId.byteLength();
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
        if (!tradingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += TradingFirmField.BYTE_LENGTH;
        if (!massCancelInst.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelInstField.BYTE_LENGTH;
        if (!massCancelId.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelIdField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!riskGroupIdCnt.parse(data, cursor)) {
            return false;
        }
        cursor += RiskGroupIdCntField.BYTE_LENGTH;
        if (!riskGroupId.parse(data, cursor, end, riskGroupIdCnt.value())) {
            return false;
        }
        cursor += riskGroupId.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (riskGroupId.size() > 255) {
            throw new IllegalStateException("riskGroupId holds " + riskGroupId.size() + " entries, more than its count field can state");
        }
        riskGroupIdCnt.value((short) riskGroupId.size());
        int cursor = offset;
        cursor = tradingFirm.encode(data, cursor);
        cursor = massCancelInst.encode(data, cursor);
        cursor = massCancelId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = riskGroupIdCnt.encode(data, cursor);
        cursor = riskGroupId.encode(data, cursor);
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
        riskGroupId.clear();
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
            if (field != riskGroupIdCnt && !field.isRecognized()) {
                return false;
            }
        }
        return riskGroupId.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != riskGroupIdCnt && !field.isValid()) {
                return false;
            }
        }
        if (!riskGroupId.isValid()) {
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
        if (!tradingFirm.isDecoded()) {
            return Optional.of(tradingFirm);
        }
        if (!massCancelInst.isDecoded()) {
            return Optional.of(massCancelInst);
        }
        if (!massCancelId.isDecoded()) {
            return Optional.of(massCancelId);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!riskGroupIdCnt.isDecoded()) {
            return Optional.of(riskGroupIdCnt);
        }
        if (!riskGroupId.isDecoded()) {
            return Optional.of(riskGroupId.failedEntry().flatMap(RiskGroupIdEntry::failedAt).orElse(riskGroupIdCnt));
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
            case "TradingFirm" -> Optional.of(tradingFirm);
            case "MassCancelInst" -> Optional.of(massCancelInst);
            case "MassCancelId" -> Optional.of(massCancelId);
            case "Symbol" -> Optional.of(symbol);
            case "RiskGroupIdCnt" -> Optional.of(riskGroupIdCnt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PurgeOrdersJpEquitiesV message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(riskGroupId.diffFields(message.riskGroupId));
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
            riskGroupId.toFormattedString(builder, options);
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
        riskGroupId.toFormattedString(builder, nested);
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
        if (!(other instanceof PurgeOrdersJpEquitiesV message)) {
            return false;
        }
        return fields.equals(message.fields) && riskGroupId.equals(message.riskGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, riskGroupId);
    }
}
