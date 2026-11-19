package omi.nyse.texasequities.depthfeedrefresh.pillar.v1_7.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.texasequities.depthfeedrefresh.pillar.v1_7.fields.ParticipantsField;
import omi.nyse.texasequities.depthfeedrefresh.pillar.v1_7.fields.PriceField;
import omi.nyse.texasequities.depthfeedrefresh.pillar.v1_7.fields.SideField;
import omi.nyse.texasequities.depthfeedrefresh.pillar.v1_7.groups.ParticipantEntry;
import omi.nyse.texasequities.depthfeedrefresh.pillar.v1_7.groups.ParticipantList;
import omi.nyse.texasequities.depthfeedrefresh.pillar.v1_7.types.Field;
import omi.nyse.texasequities.depthfeedrefresh.pillar.v1_7.types.GroupEntry;
import omi.nyse.texasequities.depthfeedrefresh.pillar.v1_7.types.PrintOptions;

/**
 * One entry of the PricePoint repeating group.
 *
 * <p>Price point group repeating UpdateCount times</p>
 */
public final class PricePointEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 6;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "PricePoint";

    /**
     * The order price. Use with the Price Scale from the symbol-mapping index.
     */
    private final PriceField price = new PriceField();

    /**
     * The side of the book (Buy/Sell).
     */
    private final SideField side = new SideField();

    /**
     * Indicates the number of times the following fields will be repeated for a given price/side grouping: Market ID, Number of Orders, Volume
     */
    private final ParticipantsField participants = new ParticipantsField();

    /**
     * Exchange-specific information at a price point, repeating Participants times
     */
    private final ParticipantList participant = new ParticipantList();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(price, side, participants);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The order price. Use with the Price Scale from the symbol-mapping index.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The side of the book (Buy/Sell).
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Indicates the number of times the following fields will be repeated for a given price/side grouping: Market ID, Number of Orders, Volume
     *
     * @return the Participants field
     */
    public ParticipantsField participants() {
        return participants;
    }

    /**
     * Exchange-specific information at a price point, repeating Participants times
     *
     * <p>Encode writes this list's size to the Participants field.</p>
     *
     * @return the Participant entries
     */
    public ParticipantList participant() {
        return participant;
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + participant.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        return new int[0];
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
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!participants.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantsField.BYTE_LENGTH;
        if (!participant.parse(data, cursor, end, participants.value())) {
            return false;
        }
        cursor += participant.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (participant.size() > 255) {
            throw new IllegalStateException("participant holds " + participant.size() + " entries, more than its count field can state");
        }
        participants.value((short) participant.size());
        int cursor = offset;
        cursor = price.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = participants.encode(data, cursor);
        cursor = participant.encode(data, cursor);
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
        participant.clear();
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
            if (field != participants && !field.isRecognized()) {
                return false;
            }
        }
        return participant.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != participants && !field.isValid()) {
                return false;
            }
        }
        if (!participant.isValid()) {
            return false;
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!participants.isDecoded()) {
            return Optional.of(participants);
        }
        if (!participant.isDecoded()) {
            return Optional.of(participant.failedEntry().flatMap(ParticipantEntry::failedAt).orElse(participants));
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
            case "Price" -> Optional.of(price);
            case "Side" -> Optional.of(side);
            case "Participants" -> Optional.of(participants);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof PricePointEntry message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(participant.diffFields(message.participant));
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            participant.toFormattedString(builder, options);
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
        participant.toFormattedString(builder, nested);
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
        if (!(other instanceof PricePointEntry message)) {
            return false;
        }
        return fields.equals(message.fields) && participant.equals(message.participant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, participant);
    }
}
