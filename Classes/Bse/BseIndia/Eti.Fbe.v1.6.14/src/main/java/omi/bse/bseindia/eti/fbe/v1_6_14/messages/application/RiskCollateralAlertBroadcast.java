package omi.bse.bseindia.eti.fbe.v1_6_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.BusinessUnitSymbolField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ClientCodeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.DurationField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.IncrementDecrementStatusField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MarketIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MarketSegmentIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MemberTypeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.OrigTimeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.PercentageUtilizedField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.RrmStateField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SegmentIndicatorField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.VarTextLenField;
import omi.bse.bseindia.eti.fbe.v1_6_14.structs.RbcHeaderComp;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Field;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Message;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.PrintOptions;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.SizedField;

/**
 * Represents the RiskCollateralAlertBroadcast message from the Eti protocol.
 */
public final class RiskCollateralAlertBroadcast implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 82;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Risk Collateral Alert Broadcast";

    /**
     * Orig Time
     */
    private final OrigTimeField origTime = new OrigTimeField();

    /**
     * Percentage Utilized
     */
    private final PercentageUtilizedField percentageUtilized = new PercentageUtilizedField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Var Text Len
     */
    private final VarTextLenField varTextLen = new VarTextLenField();

    /**
     * Rrm State
     */
    private final RrmStateField rrmState = new RrmStateField();

    /**
     * Member Type
     */
    private final MemberTypeField memberType = new MemberTypeField();

    /**
     * Increment Decrement Status
     */
    private final IncrementDecrementStatusField incrementDecrementStatus = new IncrementDecrementStatusField();

    /**
     * Segment Indicator
     */
    private final SegmentIndicatorField segmentIndicator = new SegmentIndicatorField();

    /**
     * Duration
     */
    private final DurationField duration = new DurationField();

    /**
     * Client Code
     */
    private final ClientCodeField clientCode = new ClientCodeField();

    /**
     * Business Unit Symbol
     */
    private final BusinessUnitSymbolField businessUnitSymbol = new BusinessUnitSymbolField();

    /**
     * Var Text
     */
    private final SizedField varText = new SizedField("VarText", true);

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(origTime), List.<Field>of(percentageUtilized), List.<Field>of(marketSegmentId), List.<Field>of(marketId), List.<Field>of(varTextLen), List.<Field>of(rrmState), List.<Field>of(memberType), List.<Field>of(incrementDecrementStatus), List.<Field>of(segmentIndicator), List.<Field>of(duration), List.<Field>of(clientCode), List.<Field>of(businessUnitSymbol), List.<Field>of(varText)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Orig Time
     *
     * @return the OrigTime field
     */
    public OrigTimeField origTime() {
        return origTime;
    }

    /**
     * Percentage Utilized
     *
     * @return the PercentageUtilized field
     */
    public PercentageUtilizedField percentageUtilized() {
        return percentageUtilized;
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
     * Market Id
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * Var Text Len
     *
     * @return the VarTextLen field
     */
    public VarTextLenField varTextLen() {
        return varTextLen;
    }

    /**
     * Rrm State
     *
     * @return the RrmState field
     */
    public RrmStateField rrmState() {
        return rrmState;
    }

    /**
     * Member Type
     *
     * @return the MemberType field
     */
    public MemberTypeField memberType() {
        return memberType;
    }

    /**
     * Increment Decrement Status
     *
     * @return the IncrementDecrementStatus field
     */
    public IncrementDecrementStatusField incrementDecrementStatus() {
        return incrementDecrementStatus;
    }

    /**
     * Segment Indicator
     *
     * @return the SegmentIndicator field
     */
    public SegmentIndicatorField segmentIndicator() {
        return segmentIndicator;
    }

    /**
     * Duration
     *
     * @return the Duration field
     */
    public DurationField duration() {
        return duration;
    }

    /**
     * Client Code
     *
     * @return the ClientCode field
     */
    public ClientCodeField clientCode() {
        return clientCode;
    }

    /**
     * Business Unit Symbol
     *
     * @return the BusinessUnitSymbol field
     */
    public BusinessUnitSymbolField businessUnitSymbol() {
        return businessUnitSymbol;
    }

    /**
     * Var Text
     *
     * @return the VarText field
     */
    public SizedField varText() {
        return varText;
    }

    /**
     * Rbc Header Comp
     *
     * @return the RbcHeaderComp record
     */
    public RbcHeaderComp rbcHeaderComp() {
        return rbcHeaderComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + varText.byteLength();
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
        for (int[] run = RbcHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RbcHeaderComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 12;
        cursor += 8;
        runs.add(cursor).add(3);
        cursor += 3;
        cursor += varText.byteLength();
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(rbcHeaderComp.sendingTime().value());
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 48)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!origTime.parse(data, cursor)) {
            return false;
        }
        cursor += OrigTimeField.BYTE_LENGTH;
        if (!percentageUtilized.parse(data, cursor)) {
            return false;
        }
        cursor += PercentageUtilizedField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!varTextLen.parse(data, cursor)) {
            return false;
        }
        cursor += VarTextLenField.BYTE_LENGTH;
        if (!rrmState.parse(data, cursor)) {
            return false;
        }
        cursor += RrmStateField.BYTE_LENGTH;
        if (!memberType.parse(data, cursor)) {
            return false;
        }
        cursor += MemberTypeField.BYTE_LENGTH;
        if (!incrementDecrementStatus.parse(data, cursor)) {
            return false;
        }
        cursor += IncrementDecrementStatusField.BYTE_LENGTH;
        if (!segmentIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SegmentIndicatorField.BYTE_LENGTH;
        if (!duration.parse(data, cursor)) {
            return false;
        }
        cursor += DurationField.BYTE_LENGTH;
        if (!clientCode.parse(data, cursor)) {
            return false;
        }
        cursor += ClientCodeField.BYTE_LENGTH;
        if (!businessUnitSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += BusinessUnitSymbolField.BYTE_LENGTH;
        cursor += 3; // padding
        if (!varText.parse(data, cursor, varTextLen.value(), end)) {
            return false;
        }
        cursor += varText.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (varText.byteLength() > 65535) {
            throw new IllegalStateException("varText holds " + varText.byteLength() + " bytes, more than its length field can state");
        }
        varTextLen.value((varText.byteLength()));
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = origTime.encode(data, cursor);
        cursor = percentageUtilized.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = marketId.encode(data, cursor);
        cursor = varTextLen.encode(data, cursor);
        cursor = rrmState.encode(data, cursor);
        cursor = memberType.encode(data, cursor);
        cursor = incrementDecrementStatus.encode(data, cursor);
        cursor = segmentIndicator.encode(data, cursor);
        cursor = duration.encode(data, cursor);
        cursor = clientCode.encode(data, cursor);
        cursor = businessUnitSymbol.encode(data, cursor);
        if (buffer != null && buffer.length >= 82) {
            System.arraycopy(buffer, 79, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        cursor = varText.encode(data, cursor);
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
        rbcHeaderComp.clear();
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
            if (field != varTextLen && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != varTextLen && !field.isValid()) {
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
            case "OrigTime" -> Optional.of(origTime);
            case "PercentageUtilized" -> Optional.of(percentageUtilized);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "MarketId" -> Optional.of(marketId);
            case "VarTextLen" -> Optional.of(varTextLen);
            case "RrmState" -> Optional.of(rrmState);
            case "MemberType" -> Optional.of(memberType);
            case "IncrementDecrementStatus" -> Optional.of(incrementDecrementStatus);
            case "SegmentIndicator" -> Optional.of(segmentIndicator);
            case "Duration" -> Optional.of(duration);
            case "ClientCode" -> Optional.of(clientCode);
            case "BusinessUnitSymbol" -> Optional.of(businessUnitSymbol);
            case "VarText" -> Optional.of(varText);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RiskCollateralAlertBroadcast message)) {
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
        if (!(other instanceof RiskCollateralAlertBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
