package omi.eurex.t7.xti.fbe.v11_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v11_1.fields.MessageEventSourceField;
import omi.eurex.t7.xti.fbe.v11_1.fields.NoQuoteEntriesField;
import omi.eurex.t7.xti.fbe.v11_1.groups.SrqsQuoteEntryGrpCompEntry;
import omi.eurex.t7.xti.fbe.v11_1.groups.SrqsQuoteEntryGrpCompList;
import omi.eurex.t7.xti.fbe.v11_1.structs.RbcHeaderComp;
import omi.eurex.t7.xti.fbe.v11_1.types.Field;
import omi.eurex.t7.xti.fbe.v11_1.types.Message;
import omi.eurex.t7.xti.fbe.v11_1.types.PrintOptions;

/**
 * Represents the XetraEnLightQuoteSnapshotNotification message from the Xti protocol.
 */
public final class XetraEnLightQuoteSnapshotNotification implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Xetra En Light Quote Snapshot Notification";

    /**
     * No Quote Entries
     */
    private final NoQuoteEntriesField noQuoteEntries = new NoQuoteEntriesField();

    /**
     * Message Event Source
     */
    private final MessageEventSourceField messageEventSource = new MessageEventSourceField();

    /**
     * Srqs Quote Entry Grp Comp
     */
    private final SrqsQuoteEntryGrpCompList srqsQuoteEntryGrpComp = new SrqsQuoteEntryGrpCompList();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(noQuoteEntries), List.<Field>of(messageEventSource)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * No Quote Entries
     *
     * @return the NoQuoteEntries field
     */
    public NoQuoteEntriesField noQuoteEntries() {
        return noQuoteEntries;
    }

    /**
     * Message Event Source
     *
     * @return the MessageEventSource field
     */
    public MessageEventSourceField messageEventSource() {
        return messageEventSource;
    }

    /**
     * Srqs Quote Entry Grp Comp
     *
     * <p>Encode writes this list's size to the NoQuoteEntries field.</p>
     *
     * @return the SrqsQuoteEntryGrpComp entries
     */
    public SrqsQuoteEntryGrpCompList srqsQuoteEntryGrpComp() {
        return srqsQuoteEntryGrpComp;
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
        return MINIMUM_BYTE_LENGTH + srqsQuoteEntryGrpComp.byteLength();
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
        cursor += 1;
        cursor += 1;
        runs.add(cursor).add(6);
        cursor += 6;
        cursor = srqsQuoteEntryGrpComp.padding(runs, cursor);
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!noQuoteEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoQuoteEntriesField.BYTE_LENGTH;
        if (!messageEventSource.parse(data, cursor)) {
            return false;
        }
        cursor += MessageEventSourceField.BYTE_LENGTH;
        cursor += 6; // padding
        if (!srqsQuoteEntryGrpComp.parse(data, cursor, end, noQuoteEntries.value())) {
            return false;
        }
        cursor += srqsQuoteEntryGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (srqsQuoteEntryGrpComp.size() > 255) {
            throw new IllegalStateException("srqsQuoteEntryGrpComp holds " + srqsQuoteEntryGrpComp.size() + " entries, more than its count field can state");
        }
        noQuoteEntries.value((short) srqsQuoteEntryGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = noQuoteEntries.encode(data, cursor);
        cursor = messageEventSource.encode(data, cursor);
        if (buffer != null && buffer.length >= 42) {
            System.arraycopy(buffer, 36, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
        cursor = srqsQuoteEntryGrpComp.encode(data, cursor);
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
        srqsQuoteEntryGrpComp.clear();
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
            if (field != noQuoteEntries && !field.isRecognized()) {
                return false;
            }
        }
        return srqsQuoteEntryGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noQuoteEntries && !field.isValid()) {
                return false;
            }
        }
        if (!srqsQuoteEntryGrpComp.isValid()) {
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
        if (!rbcHeaderComp.isDecoded()) {
            return rbcHeaderComp.failedAt();
        }
        if (!noQuoteEntries.isDecoded()) {
            return Optional.of(noQuoteEntries);
        }
        if (!messageEventSource.isDecoded()) {
            return Optional.of(messageEventSource);
        }
        if (!srqsQuoteEntryGrpComp.isDecoded()) {
            return Optional.of(srqsQuoteEntryGrpComp.failedEntry().flatMap(SrqsQuoteEntryGrpCompEntry::failedAt).orElse(noQuoteEntries));
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
            case "NoQuoteEntries" -> Optional.of(noQuoteEntries);
            case "MessageEventSource" -> Optional.of(messageEventSource);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof XetraEnLightQuoteSnapshotNotification message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(srqsQuoteEntryGrpComp.diffFields(message.srqsQuoteEntryGrpComp));
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
            srqsQuoteEntryGrpComp.toFormattedString(builder, options);
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
        srqsQuoteEntryGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof XetraEnLightQuoteSnapshotNotification message)) {
            return false;
        }
        return fields.equals(message.fields) && srqsQuoteEntryGrpComp.equals(message.srqsQuoteEntryGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, srqsQuoteEntryGrpComp);
    }
}
