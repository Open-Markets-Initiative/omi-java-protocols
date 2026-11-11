package omi.eurex.t7.eti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v6_1.fields.MassActionReportIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NoNotAffectedSecuritiesField;
import omi.eurex.t7.eti.fbe.v6_1.groups.NotAffectedSecuritiesGrpCompEntry;
import omi.eurex.t7.eti.fbe.v6_1.groups.NotAffectedSecuritiesGrpCompList;
import omi.eurex.t7.eti.fbe.v6_1.structs.NrResponseHeaderMeComp;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the QuoteActivationResponse message from the Eti protocol.
 */
public final class QuoteActivationResponse implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 74;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Activation Response";

    /**
     * Mass Action Report Id
     */
    private final MassActionReportIdField massActionReportId = new MassActionReportIdField();

    /**
     * No Not Affected Securities
     */
    private final NoNotAffectedSecuritiesField noNotAffectedSecurities = new NoNotAffectedSecuritiesField();

    /**
     * Not Affected Securities Grp Comp
     */
    private final NotAffectedSecuritiesGrpCompList notAffectedSecuritiesGrpComp = new NotAffectedSecuritiesGrpCompList();

    /**
     * Nr Response Header Me Comp
     */
    private final NrResponseHeaderMeComp nrResponseHeaderMeComp = new NrResponseHeaderMeComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(nrResponseHeaderMeComp.fields(), List.<Field>of(massActionReportId), List.<Field>of(noNotAffectedSecurities)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Mass Action Report Id
     *
     * @return the MassActionReportId field
     */
    public MassActionReportIdField massActionReportId() {
        return massActionReportId;
    }

    /**
     * No Not Affected Securities
     *
     * @return the NoNotAffectedSecurities field
     */
    public NoNotAffectedSecuritiesField noNotAffectedSecurities() {
        return noNotAffectedSecurities;
    }

    /**
     * Not Affected Securities Grp Comp
     *
     * <p>Encode writes this list's size to the NoNotAffectedSecurities field.</p>
     *
     * @return the NotAffectedSecuritiesGrpComp entries
     */
    public NotAffectedSecuritiesGrpCompList notAffectedSecuritiesGrpComp() {
        return notAffectedSecuritiesGrpComp;
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
        return MINIMUM_BYTE_LENGTH + notAffectedSecuritiesGrpComp.byteLength();
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
        cursor += 2;
        runs.add(cursor).add(6);
        cursor += 6;
        cursor += notAffectedSecuritiesGrpComp.byteLength();
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
        if (!nrResponseHeaderMeComp.parseFrom(data, cursor, end - 16)) {
            return false;
        }
        cursor += nrResponseHeaderMeComp.byteLength();
        if (!massActionReportId.parse(data, cursor)) {
            return false;
        }
        cursor += MassActionReportIdField.BYTE_LENGTH;
        if (!noNotAffectedSecurities.parse(data, cursor)) {
            return false;
        }
        cursor += NoNotAffectedSecuritiesField.BYTE_LENGTH;
        cursor += 6; // padding
        if (!notAffectedSecuritiesGrpComp.parse(data, cursor, end, noNotAffectedSecurities.value())) {
            return false;
        }
        cursor += notAffectedSecuritiesGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (notAffectedSecuritiesGrpComp.size() > 65535) {
            throw new IllegalStateException("notAffectedSecuritiesGrpComp holds " + notAffectedSecuritiesGrpComp.size() + " entries, more than its count field can state");
        }
        noNotAffectedSecurities.value(notAffectedSecuritiesGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = nrResponseHeaderMeComp.encode(data, cursor);
        cursor = massActionReportId.encode(data, cursor);
        cursor = noNotAffectedSecurities.encode(data, cursor);
        if (buffer != null && buffer.length >= 74) {
            System.arraycopy(buffer, 68, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
        cursor = notAffectedSecuritiesGrpComp.encode(data, cursor);
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
        notAffectedSecuritiesGrpComp.clear();
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
            if (field != noNotAffectedSecurities && !field.isRecognized()) {
                return false;
            }
        }
        return notAffectedSecuritiesGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noNotAffectedSecurities && !field.isValid()) {
                return false;
            }
        }
        if (!notAffectedSecuritiesGrpComp.isValid()) {
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
        if (!massActionReportId.isDecoded()) {
            return Optional.of(massActionReportId);
        }
        if (!noNotAffectedSecurities.isDecoded()) {
            return Optional.of(noNotAffectedSecurities);
        }
        if (!notAffectedSecuritiesGrpComp.isDecoded()) {
            return Optional.of(notAffectedSecuritiesGrpComp.failedEntry().flatMap(NotAffectedSecuritiesGrpCompEntry::failedAt).orElse(noNotAffectedSecurities));
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
            case "MassActionReportId" -> Optional.of(massActionReportId);
            case "NoNotAffectedSecurities" -> Optional.of(noNotAffectedSecurities);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteActivationResponse message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(notAffectedSecuritiesGrpComp.diffFields(message.notAffectedSecuritiesGrpComp));
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
            notAffectedSecuritiesGrpComp.toFormattedString(builder, options);
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
        notAffectedSecuritiesGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof QuoteActivationResponse message)) {
            return false;
        }
        return fields.equals(message.fields) && notAffectedSecuritiesGrpComp.equals(message.notAffectedSecuritiesGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, notAffectedSecuritiesGrpComp);
    }
}
