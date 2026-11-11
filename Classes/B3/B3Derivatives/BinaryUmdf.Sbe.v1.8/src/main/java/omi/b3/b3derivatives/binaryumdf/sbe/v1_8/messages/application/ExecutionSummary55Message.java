package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.AggressorSideField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.AggressorTimeField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.CxlQtyField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.FillQtyField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.LastPxField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.MdEntryTimestampField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.RptSeqField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TradedHiddenQtyField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Field;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.PrintOptions;

/**
 * Represents the ExecutionSummary55Message message from the BinaryUmdf protocol.
 *
 * <p>ExecutionSummary_55Message</p>
 */
public final class ExecutionSummary55Message implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 64;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Summary 55 Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 2, 11, 1 };

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * aggressorSide
     */
    private final AggressorSideField aggressorSide = new AggressorSideField();

    /**
     * lastPx
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * fillQty
     */
    private final FillQtyField fillQty = new FillQtyField();

    /**
     * tradedHiddenQty
     */
    private final TradedHiddenQtyField tradedHiddenQty = new TradedHiddenQtyField();

    /**
     * cxlQty
     */
    private final CxlQtyField cxlQty = new CxlQtyField();

    /**
     * aggressorTime
     */
    private final AggressorTimeField aggressorTime = new AggressorTimeField();

    /**
     * rptSeq
     */
    private final RptSeqField rptSeq = new RptSeqField();

    /**
     * mDEntryTimestamp
     */
    private final MdEntryTimestampField mdEntryTimestamp = new MdEntryTimestampField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, aggressorSide, lastPx, fillQty, tradedHiddenQty, cxlQty, aggressorTime, rptSeq, mdEntryTimestamp);

    private byte[] buffer;

    private boolean decoded;

    /**
     * securityID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * aggressorSide
     *
     * @return the AggressorSide field
     */
    public AggressorSideField aggressorSide() {
        return aggressorSide;
    }

    /**
     * lastPx
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * fillQty
     *
     * @return the FillQty field
     */
    public FillQtyField fillQty() {
        return fillQty;
    }

    /**
     * tradedHiddenQty
     *
     * @return the TradedHiddenQty field
     */
    public TradedHiddenQtyField tradedHiddenQty() {
        return tradedHiddenQty;
    }

    /**
     * cxlQty
     *
     * @return the CxlQty field
     */
    public CxlQtyField cxlQty() {
        return cxlQty;
    }

    /**
     * aggressorTime
     *
     * @return the AggressorTime field
     */
    public AggressorTimeField aggressorTime() {
        return aggressorTime;
    }

    /**
     * rptSeq
     *
     * @return the RptSeq field
     */
    public RptSeqField rptSeq() {
        return rptSeq;
    }

    /**
     * mDEntryTimestamp
     *
     * @return the MdEntryTimestamp field
     */
    public MdEntryTimestampField mdEntryTimestamp() {
        return mdEntryTimestamp;
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
        return PADDING.clone();
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(aggressorTime.value());
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!aggressorSide.parse(data, cursor)) {
            return false;
        }
        cursor += AggressorSideField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!fillQty.parse(data, cursor)) {
            return false;
        }
        cursor += FillQtyField.BYTE_LENGTH;
        if (!tradedHiddenQty.parse(data, cursor)) {
            return false;
        }
        cursor += TradedHiddenQtyField.BYTE_LENGTH;
        if (!cxlQty.parse(data, cursor)) {
            return false;
        }
        cursor += CxlQtyField.BYTE_LENGTH;
        if (!aggressorTime.parse(data, cursor)) {
            return false;
        }
        cursor += AggressorTimeField.BYTE_LENGTH;
        if (!rptSeq.parse(data, cursor)) {
            return false;
        }
        cursor += RptSeqField.BYTE_LENGTH;
        return mdEntryTimestamp.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = aggressorSide.encode(data, cursor);
        if (buffer != null && buffer.length >= 12) {
            System.arraycopy(buffer, 11, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = lastPx.encode(data, cursor);
        cursor = fillQty.encode(data, cursor);
        cursor = tradedHiddenQty.encode(data, cursor);
        cursor = cxlQty.encode(data, cursor);
        cursor = aggressorTime.encode(data, cursor);
        cursor = rptSeq.encode(data, cursor);
        cursor = mdEntryTimestamp.encode(data, cursor);
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
            case "SecurityId" -> Optional.of(securityId);
            case "AggressorSide" -> Optional.of(aggressorSide);
            case "LastPx" -> Optional.of(lastPx);
            case "FillQty" -> Optional.of(fillQty);
            case "TradedHiddenQty" -> Optional.of(tradedHiddenQty);
            case "CxlQty" -> Optional.of(cxlQty);
            case "AggressorTime" -> Optional.of(aggressorTime);
            case "RptSeq" -> Optional.of(rptSeq);
            case "MdEntryTimestamp" -> Optional.of(mdEntryTimestamp);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionSummary55Message message)) {
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
        if (!(other instanceof ExecutionSummary55Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
