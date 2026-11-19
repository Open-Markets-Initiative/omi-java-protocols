package omi.eurex.t7.xti.fbe.v14_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v14_1.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v14_1.fields.NetworkMsgIdField;
import omi.eurex.t7.xti.fbe.v14_1.fields.NoRiskLimitAmountField;
import omi.eurex.t7.xti.fbe.v14_1.fields.PartyDetailExecutingUnitField;
import omi.eurex.t7.xti.fbe.v14_1.fields.PartyDetailStatusField;
import omi.eurex.t7.xti.fbe.v14_1.fields.RiskLimitGroupField;
import omi.eurex.t7.xti.fbe.v14_1.groups.RiskLimitAmountGrpCompEntry;
import omi.eurex.t7.xti.fbe.v14_1.groups.RiskLimitAmountGrpCompList;
import omi.eurex.t7.xti.fbe.v14_1.structs.RequestHeaderComp;
import omi.eurex.t7.xti.fbe.v14_1.types.Field;
import omi.eurex.t7.xti.fbe.v14_1.types.Message;
import omi.eurex.t7.xti.fbe.v14_1.types.PrintOptions;

/**
 * Represents the PreTradeRiskLimitsDefinitionRequest message from the Xti protocol.
 */
public final class PreTradeRiskLimitsDefinitionRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Pre Trade Risk Limits Definition Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * No Risk Limit Amount
     */
    private final NoRiskLimitAmountField noRiskLimitAmount = new NoRiskLimitAmountField();

    /**
     * Party Detail Status
     */
    private final PartyDetailStatusField partyDetailStatus = new PartyDetailStatusField();

    /**
     * Risk Limit Group
     */
    private final RiskLimitGroupField riskLimitGroup = new RiskLimitGroupField();

    /**
     * Party Detail Executing Unit
     */
    private final PartyDetailExecutingUnitField partyDetailExecutingUnit = new PartyDetailExecutingUnitField();

    /**
     * Risk Limit Amount Grp Comp
     */
    private final RiskLimitAmountGrpCompList riskLimitAmountGrpComp = new RiskLimitAmountGrpCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(marketSegmentId), List.<Field>of(noRiskLimitAmount), List.<Field>of(partyDetailStatus), List.<Field>of(riskLimitGroup), List.<Field>of(partyDetailExecutingUnit)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Network Msg Id
     *
     * @return the NetworkMsgId field
     */
    public NetworkMsgIdField networkMsgId() {
        return networkMsgId;
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
     * No Risk Limit Amount
     *
     * @return the NoRiskLimitAmount field
     */
    public NoRiskLimitAmountField noRiskLimitAmount() {
        return noRiskLimitAmount;
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
     * Risk Limit Group
     *
     * @return the RiskLimitGroup field
     */
    public RiskLimitGroupField riskLimitGroup() {
        return riskLimitGroup;
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
     * Risk Limit Amount Grp Comp
     *
     * <p>Encode writes this list's size to the NoRiskLimitAmount field.</p>
     *
     * @return the RiskLimitAmountGrpComp entries
     */
    public RiskLimitAmountGrpCompList riskLimitAmountGrpComp() {
        return riskLimitAmountGrpComp;
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
        return MINIMUM_BYTE_LENGTH + riskLimitAmountGrpComp.byteLength();
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
        cursor += 8;
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = RequestHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RequestHeaderComp.BYTE_LENGTH;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 3;
        cursor += 5;
        runs.add(cursor).add(2);
        cursor += 2;
        cursor = riskLimitAmountGrpComp.padding(runs, cursor);
        return cursor;
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
        if (!networkMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += NetworkMsgIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 16)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!noRiskLimitAmount.parse(data, cursor)) {
            return false;
        }
        cursor += NoRiskLimitAmountField.BYTE_LENGTH;
        if (!partyDetailStatus.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailStatusField.BYTE_LENGTH;
        if (!riskLimitGroup.parse(data, cursor)) {
            return false;
        }
        cursor += RiskLimitGroupField.BYTE_LENGTH;
        if (!partyDetailExecutingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailExecutingUnitField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!riskLimitAmountGrpComp.parse(data, cursor, end, noRiskLimitAmount.value())) {
            return false;
        }
        cursor += riskLimitAmountGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (riskLimitAmountGrpComp.size() > 255) {
            throw new IllegalStateException("riskLimitAmountGrpComp holds " + riskLimitAmountGrpComp.size() + " entries, more than its count field can state");
        }
        noRiskLimitAmount.value((short) riskLimitAmountGrpComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = noRiskLimitAmount.encode(data, cursor);
        cursor = partyDetailStatus.encode(data, cursor);
        cursor = riskLimitGroup.encode(data, cursor);
        cursor = partyDetailExecutingUnit.encode(data, cursor);
        if (buffer != null && buffer.length >= 34) {
            System.arraycopy(buffer, 32, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = riskLimitAmountGrpComp.encode(data, cursor);
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
        requestHeaderComp.clear();
        riskLimitAmountGrpComp.clear();
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
            if (field != noRiskLimitAmount && !field.isRecognized()) {
                return false;
            }
        }
        return riskLimitAmountGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noRiskLimitAmount && !field.isValid()) {
                return false;
            }
        }
        if (!riskLimitAmountGrpComp.isValid()) {
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
        if (!networkMsgId.isDecoded()) {
            return Optional.of(networkMsgId);
        }
        if (!requestHeaderComp.isDecoded()) {
            return requestHeaderComp.failedAt();
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!noRiskLimitAmount.isDecoded()) {
            return Optional.of(noRiskLimitAmount);
        }
        if (!partyDetailStatus.isDecoded()) {
            return Optional.of(partyDetailStatus);
        }
        if (!riskLimitGroup.isDecoded()) {
            return Optional.of(riskLimitGroup);
        }
        if (!partyDetailExecutingUnit.isDecoded()) {
            return Optional.of(partyDetailExecutingUnit);
        }
        if (!riskLimitAmountGrpComp.isDecoded()) {
            return Optional.of(riskLimitAmountGrpComp.failedEntry().flatMap(RiskLimitAmountGrpCompEntry::failedAt).orElse(noRiskLimitAmount));
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
            case "NetworkMsgId" -> Optional.of(networkMsgId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "NoRiskLimitAmount" -> Optional.of(noRiskLimitAmount);
            case "PartyDetailStatus" -> Optional.of(partyDetailStatus);
            case "RiskLimitGroup" -> Optional.of(riskLimitGroup);
            case "PartyDetailExecutingUnit" -> Optional.of(partyDetailExecutingUnit);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PreTradeRiskLimitsDefinitionRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(riskLimitAmountGrpComp.diffFields(message.riskLimitAmountGrpComp));
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
            riskLimitAmountGrpComp.toFormattedString(builder, options);
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
        riskLimitAmountGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof PreTradeRiskLimitsDefinitionRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && riskLimitAmountGrpComp.equals(message.riskLimitAmountGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, riskLimitAmountGrpComp);
    }
}
