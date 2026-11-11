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
import omi.eurex.t7.eti.fbe.v10_0.fields.NettingCoefficientField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoRiskLimitsQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyDetailExecutingUnitField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartyDetailStatusField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RiskLimitGroupField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RiskLimitPlatformField;
import omi.eurex.t7.eti.fbe.v10_0.groups.RiskLimitQtyGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.RiskLimitQtyGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the PreTradeRiskLimitsDefinitionRequest message from the Eti protocol.
 */
public final class PreTradeRiskLimitsDefinitionRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Pre Trade Risk Limits Definition Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Netting Coefficient
     */
    private final NettingCoefficientField nettingCoefficient = new NettingCoefficientField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Risk Limit Platform
     */
    private final RiskLimitPlatformField riskLimitPlatform = new RiskLimitPlatformField();

    /**
     * No Risk Limits Qty
     */
    private final NoRiskLimitsQtyField noRiskLimitsQty = new NoRiskLimitsQtyField();

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
     * Risk Limit Qty Grp Comp
     */
    private final RiskLimitQtyGrpCompList riskLimitQtyGrpComp = new RiskLimitQtyGrpCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(nettingCoefficient), List.<Field>of(marketSegmentId), List.<Field>of(riskLimitPlatform), List.<Field>of(noRiskLimitsQty), List.<Field>of(partyDetailStatus), List.<Field>of(riskLimitGroup), List.<Field>of(partyDetailExecutingUnit)).flatMap(List::stream).toList();

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
     * Netting Coefficient
     *
     * @return the NettingCoefficient field
     */
    public NettingCoefficientField nettingCoefficient() {
        return nettingCoefficient;
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
     * Risk Limit Platform
     *
     * @return the RiskLimitPlatform field
     */
    public RiskLimitPlatformField riskLimitPlatform() {
        return riskLimitPlatform;
    }

    /**
     * No Risk Limits Qty
     *
     * @return the NoRiskLimitsQty field
     */
    public NoRiskLimitsQtyField noRiskLimitsQty() {
        return noRiskLimitsQty;
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
     * Risk Limit Qty Grp Comp
     *
     * <p>Encode writes this list's size to the NoRiskLimitsQty field.</p>
     *
     * @return the RiskLimitQtyGrpComp entries
     */
    public RiskLimitQtyGrpCompList riskLimitQtyGrpComp() {
        return riskLimitQtyGrpComp;
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
        return MINIMUM_BYTE_LENGTH + riskLimitQtyGrpComp.byteLength();
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
        cursor += 8;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 3;
        cursor += 5;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor = riskLimitQtyGrpComp.padding(runs, cursor);
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
        if (!requestHeaderComp.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!nettingCoefficient.parse(data, cursor)) {
            return false;
        }
        cursor += NettingCoefficientField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!riskLimitPlatform.parse(data, cursor)) {
            return false;
        }
        cursor += RiskLimitPlatformField.BYTE_LENGTH;
        if (!noRiskLimitsQty.parse(data, cursor)) {
            return false;
        }
        cursor += NoRiskLimitsQtyField.BYTE_LENGTH;
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
        cursor += 1; // padding
        if (!riskLimitQtyGrpComp.parse(data, cursor, end, noRiskLimitsQty.value())) {
            return false;
        }
        cursor += riskLimitQtyGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (riskLimitQtyGrpComp.size() > 255) {
            throw new IllegalStateException("riskLimitQtyGrpComp holds " + riskLimitQtyGrpComp.size() + " entries, more than its count field can state");
        }
        noRiskLimitsQty.value((short) riskLimitQtyGrpComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = nettingCoefficient.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = riskLimitPlatform.encode(data, cursor);
        cursor = noRiskLimitsQty.encode(data, cursor);
        cursor = partyDetailStatus.encode(data, cursor);
        cursor = riskLimitGroup.encode(data, cursor);
        cursor = partyDetailExecutingUnit.encode(data, cursor);
        if (buffer != null && buffer.length >= 42) {
            System.arraycopy(buffer, 41, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = riskLimitQtyGrpComp.encode(data, cursor);
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
        riskLimitQtyGrpComp.clear();
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
            if (field != noRiskLimitsQty && !field.isRecognized()) {
                return false;
            }
        }
        return riskLimitQtyGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noRiskLimitsQty && !field.isValid()) {
                return false;
            }
        }
        if (!riskLimitQtyGrpComp.isValid()) {
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
        if (!nettingCoefficient.isDecoded()) {
            return Optional.of(nettingCoefficient);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!riskLimitPlatform.isDecoded()) {
            return Optional.of(riskLimitPlatform);
        }
        if (!noRiskLimitsQty.isDecoded()) {
            return Optional.of(noRiskLimitsQty);
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
        if (!riskLimitQtyGrpComp.isDecoded()) {
            return Optional.of(riskLimitQtyGrpComp.failedEntry().flatMap(RiskLimitQtyGrpCompEntry::failedAt).orElse(noRiskLimitsQty));
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
            case "NettingCoefficient" -> Optional.of(nettingCoefficient);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "RiskLimitPlatform" -> Optional.of(riskLimitPlatform);
            case "NoRiskLimitsQty" -> Optional.of(noRiskLimitsQty);
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
        changed.addAll(riskLimitQtyGrpComp.diffFields(message.riskLimitQtyGrpComp));
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
            riskLimitQtyGrpComp.toFormattedString(builder, options);
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
        riskLimitQtyGrpComp.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && riskLimitQtyGrpComp.equals(message.riskLimitQtyGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, riskLimitQtyGrpComp);
    }
}
