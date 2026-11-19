package omi.eurex.t7.xti.fbe.v8_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v8_0.fields.ExecIdField;
import omi.eurex.t7.xti.fbe.v8_0.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v8_0.fields.QuoteEventExecIdField;
import omi.eurex.t7.xti.fbe.v8_0.fields.QuoteEventMatchIdField;
import omi.eurex.t7.xti.fbe.v8_0.fields.QuoteEventPxField;
import omi.eurex.t7.xti.fbe.v8_0.fields.QuoteEventQtyField;
import omi.eurex.t7.xti.fbe.v8_0.fields.QuoteEventSideField;
import omi.eurex.t7.xti.fbe.v8_0.fields.QuoteEventTypeField;
import omi.eurex.t7.xti.fbe.v8_0.fields.QuoteMsgIdField;
import omi.eurex.t7.xti.fbe.v8_0.fields.ReservedSizeField;
import omi.eurex.t7.xti.fbe.v8_0.fields.SecurityIdField;
import omi.eurex.t7.xti.fbe.v8_0.structs.RbcHeaderMeComp;
import omi.eurex.t7.xti.fbe.v8_0.types.Field;
import omi.eurex.t7.xti.fbe.v8_0.types.Message;
import omi.eurex.t7.xti.fbe.v8_0.types.PrintOptions;

/**
 * Represents the BestQuoteExecutionReport message from the Xti protocol.
 */
public final class BestQuoteExecutionReport implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 122;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Best Quote Execution Report";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 51, 7, 120, 2 };

    /**
     * Exec Id
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Quote Msg Id
     */
    private final QuoteMsgIdField quoteMsgId = new QuoteMsgIdField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Quote Event Px
     */
    private final QuoteEventPxField quoteEventPx = new QuoteEventPxField();

    /**
     * Quote Event Qty
     */
    private final QuoteEventQtyField quoteEventQty = new QuoteEventQtyField();

    /**
     * Reserved Size
     */
    private final ReservedSizeField reservedSize = new ReservedSizeField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Quote Event Match Id
     */
    private final QuoteEventMatchIdField quoteEventMatchId = new QuoteEventMatchIdField();

    /**
     * Quote Event Exec Id
     */
    private final QuoteEventExecIdField quoteEventExecId = new QuoteEventExecIdField();

    /**
     * Quote Event Type
     */
    private final QuoteEventTypeField quoteEventType = new QuoteEventTypeField();

    /**
     * Quote Event Side
     */
    private final QuoteEventSideField quoteEventSide = new QuoteEventSideField();

    /**
     * Rbc Header Me Comp
     */
    private final RbcHeaderMeComp rbcHeaderMeComp = new RbcHeaderMeComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderMeComp.fields(), List.<Field>of(execId), List.<Field>of(quoteMsgId), List.<Field>of(securityId), List.<Field>of(quoteEventPx), List.<Field>of(quoteEventQty), List.<Field>of(reservedSize), List.<Field>of(marketSegmentId), List.<Field>of(quoteEventMatchId), List.<Field>of(quoteEventExecId), List.<Field>of(quoteEventType), List.<Field>of(quoteEventSide)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exec Id
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * Quote Msg Id
     *
     * @return the QuoteMsgId field
     */
    public QuoteMsgIdField quoteMsgId() {
        return quoteMsgId;
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
     * Quote Event Px
     *
     * @return the QuoteEventPx field
     */
    public QuoteEventPxField quoteEventPx() {
        return quoteEventPx;
    }

    /**
     * Quote Event Qty
     *
     * @return the QuoteEventQty field
     */
    public QuoteEventQtyField quoteEventQty() {
        return quoteEventQty;
    }

    /**
     * Reserved Size
     *
     * @return the ReservedSize field
     */
    public ReservedSizeField reservedSize() {
        return reservedSize;
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
     * Quote Event Match Id
     *
     * @return the QuoteEventMatchId field
     */
    public QuoteEventMatchIdField quoteEventMatchId() {
        return quoteEventMatchId;
    }

    /**
     * Quote Event Exec Id
     *
     * @return the QuoteEventExecId field
     */
    public QuoteEventExecIdField quoteEventExecId() {
        return quoteEventExecId;
    }

    /**
     * Quote Event Type
     *
     * @return the QuoteEventType field
     */
    public QuoteEventTypeField quoteEventType() {
        return quoteEventType;
    }

    /**
     * Quote Event Side
     *
     * @return the QuoteEventSide field
     */
    public QuoteEventSideField quoteEventSide() {
        return quoteEventSide;
    }

    /**
     * Rbc Header Me Comp
     *
     * @return the RbcHeaderMeComp record
     */
    public RbcHeaderMeComp rbcHeaderMeComp() {
        return rbcHeaderMeComp;
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
        return Optional.ofNullable(rbcHeaderMeComp.trdRegTsTimeOut().value());
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
        cursor += 2; // padding
        if (!rbcHeaderMeComp.parseFrom(data, cursor, end - 64)) {
            return false;
        }
        cursor += rbcHeaderMeComp.byteLength();
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!quoteMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteMsgIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!quoteEventPx.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEventPxField.BYTE_LENGTH;
        if (!quoteEventQty.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEventQtyField.BYTE_LENGTH;
        if (!reservedSize.parse(data, cursor)) {
            return false;
        }
        cursor += ReservedSizeField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!quoteEventMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEventMatchIdField.BYTE_LENGTH;
        if (!quoteEventExecId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEventExecIdField.BYTE_LENGTH;
        if (!quoteEventType.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEventTypeField.BYTE_LENGTH;
        if (!quoteEventSide.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEventSideField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderMeComp.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = quoteMsgId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = quoteEventPx.encode(data, cursor);
        cursor = quoteEventQty.encode(data, cursor);
        cursor = reservedSize.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = quoteEventMatchId.encode(data, cursor);
        cursor = quoteEventExecId.encode(data, cursor);
        cursor = quoteEventType.encode(data, cursor);
        cursor = quoteEventSide.encode(data, cursor);
        if (buffer != null && buffer.length >= 122) {
            System.arraycopy(buffer, 120, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
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
        rbcHeaderMeComp.clear();
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
            case "ExecId" -> Optional.of(execId);
            case "QuoteMsgId" -> Optional.of(quoteMsgId);
            case "SecurityId" -> Optional.of(securityId);
            case "QuoteEventPx" -> Optional.of(quoteEventPx);
            case "QuoteEventQty" -> Optional.of(quoteEventQty);
            case "ReservedSize" -> Optional.of(reservedSize);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "QuoteEventMatchId" -> Optional.of(quoteEventMatchId);
            case "QuoteEventExecId" -> Optional.of(quoteEventExecId);
            case "QuoteEventType" -> Optional.of(quoteEventType);
            case "QuoteEventSide" -> Optional.of(quoteEventSide);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BestQuoteExecutionReport message)) {
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
        if (!(other instanceof BestQuoteExecutionReport message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
