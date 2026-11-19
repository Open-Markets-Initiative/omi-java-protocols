package omi.bse.bseindia.eti.fbe.v1_6_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ExecIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.NoQuoteEventsField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.StpcFlagField;
import omi.bse.bseindia.eti.fbe.v1_6_14.groups.QuoteEventGrpCompEntry;
import omi.bse.bseindia.eti.fbe.v1_6_14.groups.QuoteEventGrpCompList;
import omi.bse.bseindia.eti.fbe.v1_6_14.structs.RbcHeaderMeComp;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Field;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Message;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.PrintOptions;

/**
 * Represents the QuoteExecReportBroadcast message from the Eti protocol.
 */
public final class QuoteExecReportBroadcast implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 66;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Exec Report Broadcast";

    /**
     * Exec Id
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * No Quote Events
     */
    private final NoQuoteEventsField noQuoteEvents = new NoQuoteEventsField();

    /**
     * Stpc Flag
     */
    private final StpcFlagField stpcFlag = new StpcFlagField();

    /**
     * Quote Event Grp Comp
     */
    private final QuoteEventGrpCompList quoteEventGrpComp = new QuoteEventGrpCompList();

    /**
     * Rbc Header Me Comp
     */
    private final RbcHeaderMeComp rbcHeaderMeComp = new RbcHeaderMeComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderMeComp.fields(), List.<Field>of(execId), List.<Field>of(noQuoteEvents), List.<Field>of(stpcFlag)).flatMap(List::stream).toList();

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
     * No Quote Events
     *
     * @return the NoQuoteEvents field
     */
    public NoQuoteEventsField noQuoteEvents() {
        return noQuoteEvents;
    }

    /**
     * Stpc Flag
     *
     * @return the StpcFlag field
     */
    public StpcFlagField stpcFlag() {
        return stpcFlag;
    }

    /**
     * Quote Event Grp Comp
     *
     * <p>Encode writes this list's size to the NoQuoteEvents field.</p>
     *
     * @return the QuoteEventGrpComp entries
     */
    public QuoteEventGrpCompList quoteEventGrpComp() {
        return quoteEventGrpComp;
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
        return MINIMUM_BYTE_LENGTH + quoteEventGrpComp.byteLength();
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
        for (int[] run = RbcHeaderMeComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RbcHeaderMeComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        runs.add(cursor).add(6);
        cursor += 6;
        cursor = quoteEventGrpComp.padding(runs, cursor);
        return cursor;
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
        if (!rbcHeaderMeComp.parseFrom(data, cursor, end - 16)) {
            return false;
        }
        cursor += rbcHeaderMeComp.byteLength();
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!noQuoteEvents.parse(data, cursor)) {
            return false;
        }
        cursor += NoQuoteEventsField.BYTE_LENGTH;
        if (!stpcFlag.parse(data, cursor)) {
            return false;
        }
        cursor += StpcFlagField.BYTE_LENGTH;
        cursor += 6; // padding
        if (!quoteEventGrpComp.parse(data, cursor, end, noQuoteEvents.value())) {
            return false;
        }
        cursor += quoteEventGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (quoteEventGrpComp.size() > 255) {
            throw new IllegalStateException("quoteEventGrpComp holds " + quoteEventGrpComp.size() + " entries, more than its count field can state");
        }
        noQuoteEvents.value((short) quoteEventGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderMeComp.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = noQuoteEvents.encode(data, cursor);
        cursor = stpcFlag.encode(data, cursor);
        if (buffer != null && buffer.length >= 66) {
            System.arraycopy(buffer, 60, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
        cursor = quoteEventGrpComp.encode(data, cursor);
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
        rbcHeaderMeComp.clear();
        quoteEventGrpComp.clear();
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
            if (field != noQuoteEvents && !field.isRecognized()) {
                return false;
            }
        }
        return quoteEventGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noQuoteEvents && !field.isValid()) {
                return false;
            }
        }
        if (!quoteEventGrpComp.isValid()) {
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
        if (!rbcHeaderMeComp.isDecoded()) {
            return rbcHeaderMeComp.failedAt();
        }
        if (!execId.isDecoded()) {
            return Optional.of(execId);
        }
        if (!noQuoteEvents.isDecoded()) {
            return Optional.of(noQuoteEvents);
        }
        if (!stpcFlag.isDecoded()) {
            return Optional.of(stpcFlag);
        }
        if (!quoteEventGrpComp.isDecoded()) {
            return Optional.of(quoteEventGrpComp.failedEntry().flatMap(QuoteEventGrpCompEntry::failedAt).orElse(noQuoteEvents));
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
            case "NoQuoteEvents" -> Optional.of(noQuoteEvents);
            case "StpcFlag" -> Optional.of(stpcFlag);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteExecReportBroadcast message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(quoteEventGrpComp.diffFields(message.quoteEventGrpComp));
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
            quoteEventGrpComp.toFormattedString(builder, options);
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
        quoteEventGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof QuoteExecReportBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields) && quoteEventGrpComp.equals(message.quoteEventGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, quoteEventGrpComp);
    }
}
