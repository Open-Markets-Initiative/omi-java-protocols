package omi.cme.globex.derived.sbe.v12_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.derived.sbe.v12_0.fields.FinancialInstrumentFullNameField;
import omi.cme.globex.derived.sbe.v12_0.fields.InstrumentGuidField;
import omi.cme.globex.derived.sbe.v12_0.fields.MatchEventIndicatorField;
import omi.cme.globex.derived.sbe.v12_0.fields.SecurityIdField;
import omi.cme.globex.derived.sbe.v12_0.fields.SymbolField;
import omi.cme.globex.derived.sbe.v12_0.fields.TransactTimeField;
import omi.cme.globex.derived.sbe.v12_0.structs.SnapshotRefreshSpectrumGroups;
import omi.cme.globex.derived.sbe.v12_0.types.Field;
import omi.cme.globex.derived.sbe.v12_0.types.Message;
import omi.cme.globex.derived.sbe.v12_0.types.PrintOptions;

/**
 * Represents the MdSnapshotRefreshSpectrum message from the Derived protocol.
 *
 * <p>MDSnapshotRefreshSpectrum</p>
 */
public final class MdSnapshotRefreshSpectrum implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 79;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Md Snapshot Refresh Spectrum";

    /**
     * Publication event time, sent in number of nanoseconds since Unix epoch
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * EventIndicator bit set
     */
    private final MatchEventIndicatorField matchEventIndicator = new MatchEventIndicatorField();

    /**
     * Financial instrument long name
     */
    private final FinancialInstrumentFullNameField financialInstrumentFullName = new FinancialInstrumentFullNameField();

    /**
     * Unique instrument symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * External unique instrument ID
     */
    private final InstrumentGuidField instrumentGuid = new InstrumentGuidField();

    /**
     * SecurityID as referenced in MDP3 and Ilink3 protocols
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * NoMDEntries Block
     */
    private final SnapshotRefreshSpectrumGroups snapshotRefreshSpectrumGroups = new SnapshotRefreshSpectrumGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, matchEventIndicator, financialInstrumentFullName, symbol, instrumentGuid, securityId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Publication event time, sent in number of nanoseconds since Unix epoch
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * EventIndicator bit set
     *
     * @return the MatchEventIndicator field
     */
    public MatchEventIndicatorField matchEventIndicator() {
        return matchEventIndicator;
    }

    /**
     * Financial instrument long name
     *
     * @return the FinancialInstrumentFullName field
     */
    public FinancialInstrumentFullNameField financialInstrumentFullName() {
        return financialInstrumentFullName;
    }

    /**
     * Unique instrument symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * External unique instrument ID
     *
     * @return the InstrumentGuid field
     */
    public InstrumentGuidField instrumentGuid() {
        return instrumentGuid;
    }

    /**
     * SecurityID as referenced in MDP3 and Ilink3 protocols
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * NoMDEntries Block
     *
     * @return the SnapshotRefreshSpectrumGroups record
     */
    public SnapshotRefreshSpectrumGroups snapshotRefreshSpectrumGroups() {
        return snapshotRefreshSpectrumGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + snapshotRefreshSpectrumGroups.byteLength() - SnapshotRefreshSpectrumGroups.MINIMUM_BYTE_LENGTH;
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
        return Optional.ofNullable(transactTime.value());
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
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!matchEventIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MatchEventIndicatorField.BYTE_LENGTH;
        if (!financialInstrumentFullName.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialInstrumentFullNameField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!instrumentGuid.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentGuidField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!snapshotRefreshSpectrumGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += snapshotRefreshSpectrumGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = matchEventIndicator.encode(data, cursor);
        cursor = financialInstrumentFullName.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = instrumentGuid.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = snapshotRefreshSpectrumGroups.encode(data, cursor);
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
        snapshotRefreshSpectrumGroups.clear();
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
        return snapshotRefreshSpectrumGroups.isRecognized();
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
        if (!snapshotRefreshSpectrumGroups.isValid()) {
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
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!matchEventIndicator.isDecoded()) {
            return Optional.of(matchEventIndicator);
        }
        if (!financialInstrumentFullName.isDecoded()) {
            return Optional.of(financialInstrumentFullName);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!instrumentGuid.isDecoded()) {
            return Optional.of(instrumentGuid);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!snapshotRefreshSpectrumGroups.isDecoded()) {
            return snapshotRefreshSpectrumGroups.failedAt();
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
            case "TransactTime" -> Optional.of(transactTime);
            case "MatchEventIndicator" -> Optional.of(matchEventIndicator);
            case "FinancialInstrumentFullName" -> Optional.of(financialInstrumentFullName);
            case "Symbol" -> Optional.of(symbol);
            case "InstrumentGuid" -> Optional.of(instrumentGuid);
            case "SecurityId" -> Optional.of(securityId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MdSnapshotRefreshSpectrum message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(snapshotRefreshSpectrumGroups.diffFields(message.snapshotRefreshSpectrumGroups));
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
            snapshotRefreshSpectrumGroups.toFormattedString(builder, options);
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
        snapshotRefreshSpectrumGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof MdSnapshotRefreshSpectrum message)) {
            return false;
        }
        return fields.equals(message.fields) && snapshotRefreshSpectrumGroups.equals(message.snapshotRefreshSpectrumGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, snapshotRefreshSpectrumGroups);
    }
}
