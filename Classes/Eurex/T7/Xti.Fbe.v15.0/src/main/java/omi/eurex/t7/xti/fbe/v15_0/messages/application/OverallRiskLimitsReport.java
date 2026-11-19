package omi.eurex.t7.xti.fbe.v15_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v15_0.fields.AggregatedGrossAmountField;
import omi.eurex.t7.xti.fbe.v15_0.fields.AggregatedNetAmountField;
import omi.eurex.t7.xti.fbe.v15_0.fields.NoRiskLimitTypesField;
import omi.eurex.t7.xti.fbe.v15_0.fields.PartyIdSponsoredAccessUnitField;
import omi.eurex.t7.xti.fbe.v15_0.fields.RiskLimitReportIdField;
import omi.eurex.t7.xti.fbe.v15_0.fields.ThrottleTimeIntervalField;
import omi.eurex.t7.xti.fbe.v15_0.groups.RiskLimitTypesGrpCompEntry;
import omi.eurex.t7.xti.fbe.v15_0.groups.RiskLimitTypesGrpCompList;
import omi.eurex.t7.xti.fbe.v15_0.structs.ResponseHeaderComp;
import omi.eurex.t7.xti.fbe.v15_0.types.Field;
import omi.eurex.t7.xti.fbe.v15_0.types.Message;
import omi.eurex.t7.xti.fbe.v15_0.types.PrintOptions;

/**
 * Represents the OverallRiskLimitsReport message from the Xti protocol.
 */
public final class OverallRiskLimitsReport implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 66;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Overall Risk Limits Report";

    /**
     * Risk Limit Report Id
     */
    private final RiskLimitReportIdField riskLimitReportId = new RiskLimitReportIdField();

    /**
     * Throttle Time Interval
     */
    private final ThrottleTimeIntervalField throttleTimeInterval = new ThrottleTimeIntervalField();

    /**
     * Aggregated Gross Amount
     */
    private final AggregatedGrossAmountField aggregatedGrossAmount = new AggregatedGrossAmountField();

    /**
     * Aggregated Net Amount
     */
    private final AggregatedNetAmountField aggregatedNetAmount = new AggregatedNetAmountField();

    /**
     * Party Id Sponsored Access Unit
     */
    private final PartyIdSponsoredAccessUnitField partyIdSponsoredAccessUnit = new PartyIdSponsoredAccessUnitField();

    /**
     * No Risk Limit Types
     */
    private final NoRiskLimitTypesField noRiskLimitTypes = new NoRiskLimitTypesField();

    /**
     * Risk Limit Types Grp Comp
     */
    private final RiskLimitTypesGrpCompList riskLimitTypesGrpComp = new RiskLimitTypesGrpCompList();

    /**
     * Response Header Comp
     */
    private final ResponseHeaderComp responseHeaderComp = new ResponseHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(responseHeaderComp.fields(), List.<Field>of(riskLimitReportId), List.<Field>of(throttleTimeInterval), List.<Field>of(aggregatedGrossAmount), List.<Field>of(aggregatedNetAmount), List.<Field>of(partyIdSponsoredAccessUnit), List.<Field>of(noRiskLimitTypes)).flatMap(List::stream).toList();

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
     * Throttle Time Interval
     *
     * @return the ThrottleTimeInterval field
     */
    public ThrottleTimeIntervalField throttleTimeInterval() {
        return throttleTimeInterval;
    }

    /**
     * Aggregated Gross Amount
     *
     * @return the AggregatedGrossAmount field
     */
    public AggregatedGrossAmountField aggregatedGrossAmount() {
        return aggregatedGrossAmount;
    }

    /**
     * Aggregated Net Amount
     *
     * @return the AggregatedNetAmount field
     */
    public AggregatedNetAmountField aggregatedNetAmount() {
        return aggregatedNetAmount;
    }

    /**
     * Party Id Sponsored Access Unit
     *
     * @return the PartyIdSponsoredAccessUnit field
     */
    public PartyIdSponsoredAccessUnitField partyIdSponsoredAccessUnit() {
        return partyIdSponsoredAccessUnit;
    }

    /**
     * No Risk Limit Types
     *
     * @return the NoRiskLimitTypes field
     */
    public NoRiskLimitTypesField noRiskLimitTypes() {
        return noRiskLimitTypes;
    }

    /**
     * Risk Limit Types Grp Comp
     *
     * <p>Encode writes this list's size to the NoRiskLimitTypes field.</p>
     *
     * @return the RiskLimitTypesGrpComp entries
     */
    public RiskLimitTypesGrpCompList riskLimitTypesGrpComp() {
        return riskLimitTypesGrpComp;
    }

    /**
     * Response Header Comp
     *
     * @return the ResponseHeaderComp record
     */
    public ResponseHeaderComp responseHeaderComp() {
        return responseHeaderComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + riskLimitTypesGrpComp.byteLength();
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
        for (int[] run = ResponseHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += ResponseHeaderComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 1;
        runs.add(cursor).add(3);
        cursor += 3;
        cursor = riskLimitTypesGrpComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(responseHeaderComp.requestTime().value());
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
        if (!responseHeaderComp.parseFrom(data, cursor, end - 40)) {
            return false;
        }
        cursor += responseHeaderComp.byteLength();
        if (!riskLimitReportId.parse(data, cursor)) {
            return false;
        }
        cursor += RiskLimitReportIdField.BYTE_LENGTH;
        if (!throttleTimeInterval.parse(data, cursor)) {
            return false;
        }
        cursor += ThrottleTimeIntervalField.BYTE_LENGTH;
        if (!aggregatedGrossAmount.parse(data, cursor)) {
            return false;
        }
        cursor += AggregatedGrossAmountField.BYTE_LENGTH;
        if (!aggregatedNetAmount.parse(data, cursor)) {
            return false;
        }
        cursor += AggregatedNetAmountField.BYTE_LENGTH;
        if (!partyIdSponsoredAccessUnit.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdSponsoredAccessUnitField.BYTE_LENGTH;
        if (!noRiskLimitTypes.parse(data, cursor)) {
            return false;
        }
        cursor += NoRiskLimitTypesField.BYTE_LENGTH;
        cursor += 3; // padding
        if (!riskLimitTypesGrpComp.parse(data, cursor, end, noRiskLimitTypes.value())) {
            return false;
        }
        cursor += riskLimitTypesGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (riskLimitTypesGrpComp.size() > 255) {
            throw new IllegalStateException("riskLimitTypesGrpComp holds " + riskLimitTypesGrpComp.size() + " entries, more than its count field can state");
        }
        noRiskLimitTypes.value((short) riskLimitTypesGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = responseHeaderComp.encode(data, cursor);
        cursor = riskLimitReportId.encode(data, cursor);
        cursor = throttleTimeInterval.encode(data, cursor);
        cursor = aggregatedGrossAmount.encode(data, cursor);
        cursor = aggregatedNetAmount.encode(data, cursor);
        cursor = partyIdSponsoredAccessUnit.encode(data, cursor);
        cursor = noRiskLimitTypes.encode(data, cursor);
        if (buffer != null && buffer.length >= 66) {
            System.arraycopy(buffer, 63, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        cursor = riskLimitTypesGrpComp.encode(data, cursor);
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
        responseHeaderComp.clear();
        riskLimitTypesGrpComp.clear();
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
            if (field != noRiskLimitTypes && !field.isRecognized()) {
                return false;
            }
        }
        return riskLimitTypesGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noRiskLimitTypes && !field.isValid()) {
                return false;
            }
        }
        if (!riskLimitTypesGrpComp.isValid()) {
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
        if (!responseHeaderComp.isDecoded()) {
            return responseHeaderComp.failedAt();
        }
        if (!riskLimitReportId.isDecoded()) {
            return Optional.of(riskLimitReportId);
        }
        if (!throttleTimeInterval.isDecoded()) {
            return Optional.of(throttleTimeInterval);
        }
        if (!aggregatedGrossAmount.isDecoded()) {
            return Optional.of(aggregatedGrossAmount);
        }
        if (!aggregatedNetAmount.isDecoded()) {
            return Optional.of(aggregatedNetAmount);
        }
        if (!partyIdSponsoredAccessUnit.isDecoded()) {
            return Optional.of(partyIdSponsoredAccessUnit);
        }
        if (!noRiskLimitTypes.isDecoded()) {
            return Optional.of(noRiskLimitTypes);
        }
        if (!riskLimitTypesGrpComp.isDecoded()) {
            return Optional.of(riskLimitTypesGrpComp.failedEntry().flatMap(RiskLimitTypesGrpCompEntry::failedAt).orElse(noRiskLimitTypes));
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
            case "ThrottleTimeInterval" -> Optional.of(throttleTimeInterval);
            case "AggregatedGrossAmount" -> Optional.of(aggregatedGrossAmount);
            case "AggregatedNetAmount" -> Optional.of(aggregatedNetAmount);
            case "PartyIdSponsoredAccessUnit" -> Optional.of(partyIdSponsoredAccessUnit);
            case "NoRiskLimitTypes" -> Optional.of(noRiskLimitTypes);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OverallRiskLimitsReport message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(riskLimitTypesGrpComp.diffFields(message.riskLimitTypesGrpComp));
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
            riskLimitTypesGrpComp.toFormattedString(builder, options);
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
        riskLimitTypesGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof OverallRiskLimitsReport message)) {
            return false;
        }
        return fields.equals(message.fields) && riskLimitTypesGrpComp.equals(message.riskLimitTypesGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, riskLimitTypesGrpComp);
    }
}
