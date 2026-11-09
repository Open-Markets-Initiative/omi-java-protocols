package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoRiskLimitsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyDetailExecutingUnitField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyDetailStatusField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RiskLimitPlatformField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RiskLimitReportIdField;
import omi.eurex.t7.eti.fbe.v10_0.groups.RiskLimitsRptGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.RiskLimitsRptGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.NrResponseHeaderMeComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the PreTradeRiskLimitResponse message from the Eti protocol.
 */
public final class PreTradeRiskLimitResponse implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 74;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Pre Trade Risk Limit Response";

    /**
     * Risk Limit Report Id
     */
    private final RiskLimitReportIdField riskLimitReportId = new RiskLimitReportIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * No Risk Limits
     */
    private final NoRiskLimitsField noRiskLimits = new NoRiskLimitsField();

    /**
     * Party Detail Status
     */
    private final PartyDetailStatusField partyDetailStatus = new PartyDetailStatusField();

    /**
     * Risk Limit Platform
     */
    private final RiskLimitPlatformField riskLimitPlatform = new RiskLimitPlatformField();

    /**
     * Party Detail Executing Unit
     */
    private final PartyDetailExecutingUnitField partyDetailExecutingUnit = new PartyDetailExecutingUnitField();

    /**
     * Risk Limits Rpt Grp Comp
     */
    private final RiskLimitsRptGrpCompList riskLimitsRptGrpComp = new RiskLimitsRptGrpCompList();

    /**
     * Nr Response Header Me Comp
     */
    private final NrResponseHeaderMeComp nrResponseHeaderMeComp = new NrResponseHeaderMeComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(nrResponseHeaderMeComp.fields(), List.<Field>of(riskLimitReportId), List.<Field>of(marketSegmentId), List.<Field>of(noRiskLimits), List.<Field>of(partyDetailStatus), List.<Field>of(riskLimitPlatform), List.<Field>of(partyDetailExecutingUnit)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Risk Limit Report Id
     *
     * @return the RiskLimitReportId field
     */
    public RiskLimitReportIdField riskLimitReportId() {
        return riskLimitReportId;
    }

    /**
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * No Risk Limits
     *
     * @return the NoRiskLimits field
     */
    public NoRiskLimitsField noRiskLimits() {
        return noRiskLimits;
    }

    /**
     * Party Detail Status
     *
     * @return the PartyDetailStatus field
     */
    public PartyDetailStatusField partyDetailStatus() {
        return partyDetailStatus;
    }

    /**
     * Risk Limit Platform
     *
     * @return the RiskLimitPlatform field
     */
    public RiskLimitPlatformField riskLimitPlatform() {
        return riskLimitPlatform;
    }

    /**
     * Party Detail Executing Unit
     *
     * @return the PartyDetailExecutingUnit field
     */
    public PartyDetailExecutingUnitField partyDetailExecutingUnit() {
        return partyDetailExecutingUnit;
    }

    /**
     * Risk Limits Rpt Grp Comp
     *
     * <p>Encode writes this list's size to the NoRiskLimits field.</p>
     *
     * @return the RiskLimitsRptGrpComp entries
     */
    public RiskLimitsRptGrpCompList riskLimitsRptGrpComp() {
        return riskLimitsRptGrpComp;
    }

    /**
     * Nr Response Header Me Comp
     *
     * @return the NrResponseHeaderMeComp record
     */
    public NrResponseHeaderMeComp nrResponseHeaderMeComp() {
        return nrResponseHeaderMeComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + riskLimitsRptGrpComp.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = NrResponseHeaderMeComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += NrResponseHeaderMeComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 5;
        runs.add(cursor).add(4);
        cursor += 4;
        cursor = riskLimitsRptGrpComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(nrResponseHeaderMeComp.requestTime().value());
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
        cursor += 2; // padding
        if (!nrResponseHeaderMeComp.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += nrResponseHeaderMeComp.byteLength();
        if (!riskLimitReportId.parse(data, cursor)) {
            return false;
        }
        cursor += RiskLimitReportIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!noRiskLimits.parse(data, cursor)) {
            return false;
        }
        cursor += NoRiskLimitsField.BYTE_LENGTH;
        if (!partyDetailStatus.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailStatusField.BYTE_LENGTH;
        if (!riskLimitPlatform.parse(data, cursor)) {
            return false;
        }
        cursor += RiskLimitPlatformField.BYTE_LENGTH;
        if (!partyDetailExecutingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailExecutingUnitField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!riskLimitsRptGrpComp.parse(data, cursor, end, noRiskLimits.value())) {
            return false;
        }
        cursor += riskLimitsRptGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (riskLimitsRptGrpComp.size() > 255) {
            throw new IllegalStateException("riskLimitsRptGrpComp holds " + riskLimitsRptGrpComp.size() + " entries, more than its count field can state");
        }
        noRiskLimits.value((short) riskLimitsRptGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = nrResponseHeaderMeComp.encode(data, cursor);
        cursor = riskLimitReportId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = noRiskLimits.encode(data, cursor);
        cursor = partyDetailStatus.encode(data, cursor);
        cursor = riskLimitPlatform.encode(data, cursor);
        cursor = partyDetailExecutingUnit.encode(data, cursor);
        if (buffer != null && buffer.length >= 70 + 4) {
            System.arraycopy(buffer, 70, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = riskLimitsRptGrpComp.encode(data, cursor);
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
        nrResponseHeaderMeComp.clear();
        riskLimitsRptGrpComp.clear();
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
            if (field != noRiskLimits && !field.isRecognized()) {
                return false;
            }
        }
        if (!riskLimitsRptGrpComp.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noRiskLimits && !field.isValid()) {
                return false;
            }
        }
        if (!riskLimitsRptGrpComp.isValid()) {
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
        if (!nrResponseHeaderMeComp.isDecoded()) {
            return nrResponseHeaderMeComp.failedAt();
        }
        if (!riskLimitReportId.isDecoded()) {
            return Optional.of(riskLimitReportId);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!noRiskLimits.isDecoded()) {
            return Optional.of(noRiskLimits);
        }
        if (!partyDetailStatus.isDecoded()) {
            return Optional.of(partyDetailStatus);
        }
        if (!riskLimitPlatform.isDecoded()) {
            return Optional.of(riskLimitPlatform);
        }
        if (!partyDetailExecutingUnit.isDecoded()) {
            return Optional.of(partyDetailExecutingUnit);
        }
        if (!riskLimitsRptGrpComp.isDecoded()) {
            return Optional.of(riskLimitsRptGrpComp.failedEntry().flatMap(RiskLimitsRptGrpCompEntry::failedAt).orElse(noRiskLimits));
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
            case "RiskLimitReportId" -> Optional.of(riskLimitReportId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "NoRiskLimits" -> Optional.of(noRiskLimits);
            case "PartyDetailStatus" -> Optional.of(partyDetailStatus);
            case "RiskLimitPlatform" -> Optional.of(riskLimitPlatform);
            case "PartyDetailExecutingUnit" -> Optional.of(partyDetailExecutingUnit);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PreTradeRiskLimitResponse message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(riskLimitsRptGrpComp.diffFields(message.riskLimitsRptGrpComp));
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
            riskLimitsRptGrpComp.toFormattedString(builder, options);
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
        riskLimitsRptGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof PreTradeRiskLimitResponse message)) {
            return false;
        }
        return fields.equals(message.fields) && riskLimitsRptGrpComp.equals(message.riskLimitsRptGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, riskLimitsRptGrpComp);
    }
}
