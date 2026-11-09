package omi.eurex.t7.eti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v6_1.fields.LastEntityProcessedField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NoPartyDetailsField;
import omi.eurex.t7.eti.fbe.v6_1.groups.PartyDetailsGrpCompEntry;
import omi.eurex.t7.eti.fbe.v6_1.groups.PartyDetailsGrpCompList;
import omi.eurex.t7.eti.fbe.v6_1.structs.ResponseHeaderComp;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the InquireUserResponse message from the Eti protocol.
 */
public final class InquireUserResponse implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 50;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Inquire User Response";

    /**
     * Last Entity Processed
     */
    private final LastEntityProcessedField lastEntityProcessed = new LastEntityProcessedField();

    /**
     * No Party Details
     */
    private final NoPartyDetailsField noPartyDetails = new NoPartyDetailsField();

    /**
     * Party Details Grp Comp
     */
    private final PartyDetailsGrpCompList partyDetailsGrpComp = new PartyDetailsGrpCompList();

    /**
     * Response Header Comp
     */
    private final ResponseHeaderComp responseHeaderComp = new ResponseHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(responseHeaderComp.fields(), List.<Field>of(lastEntityProcessed), List.<Field>of(noPartyDetails)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Last Entity Processed
     *
     * @return the LastEntityProcessed field
     */
    public LastEntityProcessedField lastEntityProcessed() {
        return lastEntityProcessed;
    }

    /**
     * No Party Details
     *
     * @return the NoPartyDetails field
     */
    public NoPartyDetailsField noPartyDetails() {
        return noPartyDetails;
    }

    /**
     * Party Details Grp Comp
     *
     * <p>Encode writes this list's size to the NoPartyDetails field.</p>
     *
     * @return the PartyDetailsGrpComp entries
     */
    public PartyDetailsGrpCompList partyDetailsGrpComp() {
        return partyDetailsGrpComp;
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
        return MINIMUM_BYTE_LENGTH + partyDetailsGrpComp.byteLength();
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
        cursor += 16;
        cursor += 2;
        runs.add(cursor).add(6);
        cursor += 6;
        cursor = partyDetailsGrpComp.padding(runs, cursor);
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
        if (!responseHeaderComp.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += responseHeaderComp.byteLength();
        if (!lastEntityProcessed.parse(data, cursor)) {
            return false;
        }
        cursor += LastEntityProcessedField.BYTE_LENGTH;
        if (!noPartyDetails.parse(data, cursor)) {
            return false;
        }
        cursor += NoPartyDetailsField.BYTE_LENGTH;
        cursor += 6; // padding
        if (!partyDetailsGrpComp.parse(data, cursor, end, noPartyDetails.value())) {
            return false;
        }
        cursor += partyDetailsGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (partyDetailsGrpComp.size() > 65535) {
            throw new IllegalStateException("partyDetailsGrpComp holds " + partyDetailsGrpComp.size() + " entries, more than its count field can state");
        }
        noPartyDetails.value(partyDetailsGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = responseHeaderComp.encode(data, cursor);
        cursor = lastEntityProcessed.encode(data, cursor);
        cursor = noPartyDetails.encode(data, cursor);
        if (buffer != null && buffer.length >= 44 + 6) {
            System.arraycopy(buffer, 44, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
        cursor = partyDetailsGrpComp.encode(data, cursor);
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
        partyDetailsGrpComp.clear();
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
            if (field != noPartyDetails && !field.isRecognized()) {
                return false;
            }
        }
        if (!partyDetailsGrpComp.isRecognized()) {
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
            if (field != noPartyDetails && !field.isValid()) {
                return false;
            }
        }
        if (!partyDetailsGrpComp.isValid()) {
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
        if (!lastEntityProcessed.isDecoded()) {
            return Optional.of(lastEntityProcessed);
        }
        if (!noPartyDetails.isDecoded()) {
            return Optional.of(noPartyDetails);
        }
        if (!partyDetailsGrpComp.isDecoded()) {
            return Optional.of(partyDetailsGrpComp.failedEntry().flatMap(PartyDetailsGrpCompEntry::failedAt).orElse(noPartyDetails));
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
            case "LastEntityProcessed" -> Optional.of(lastEntityProcessed);
            case "NoPartyDetails" -> Optional.of(noPartyDetails);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InquireUserResponse message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(partyDetailsGrpComp.diffFields(message.partyDetailsGrpComp));
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
            partyDetailsGrpComp.toFormattedString(builder, options);
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
        partyDetailsGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof InquireUserResponse message)) {
            return false;
        }
        return fields.equals(message.fields) && partyDetailsGrpComp.equals(message.partyDetailsGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, partyDetailsGrpComp);
    }
}
