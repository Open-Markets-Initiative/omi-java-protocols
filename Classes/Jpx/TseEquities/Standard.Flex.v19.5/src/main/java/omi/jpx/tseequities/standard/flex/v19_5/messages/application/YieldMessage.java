package omi.jpx.tseequities.standard.flex.v19_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.jpx.tseequities.standard.flex.v19_5.fields.Reserved1Field;
import omi.jpx.tseequities.standard.flex.v19_5.fields.Reserved2Field;
import omi.jpx.tseequities.standard.flex.v19_5.fields.TimeCField;
import omi.jpx.tseequities.standard.flex.v19_5.structs.DirectYield;
import omi.jpx.tseequities.standard.flex.v19_5.structs.FinalYield;
import omi.jpx.tseequities.standard.flex.v19_5.types.Field;
import omi.jpx.tseequities.standard.flex.v19_5.types.Message;
import omi.jpx.tseequities.standard.flex.v19_5.types.PrintOptions;

/**
 * Represents the YieldMessage message from the Standard protocol.
 *
 * <p>In this tag, Direct and Final Yield Information for CB is set. This tag appears as part of realtime data.</p>
 */
public final class YieldMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Yield Message";

    /**
     * This item is reserved.
     */
    private final Reserved2Field reserved2 = new Reserved2Field();

    /**
     * Indicates the time at which the current price, Special Quote price or Sequential Trade Quote price of the relevant issue, which is subject to computation of Direct and Final yield, occurred or changed.
     */
    private final TimeCField timeC = new TimeCField();

    /**
     * This item is reserved.
     */
    private final Reserved1Field reserved1 = new Reserved1Field();

    /**
     * Direct Yield
     */
    private final DirectYield directYield = new DirectYield();

    /**
     * Final Yield
     */
    private final FinalYield finalYield = new FinalYield();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(reserved2), directYield.fields(), finalYield.fields(), List.<Field>of(timeC), List.<Field>of(reserved1)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * This item is reserved.
     *
     * @return the Reserved2 field
     */
    public Reserved2Field reserved2() {
        return reserved2;
    }

    /**
     * Indicates the time at which the current price, Special Quote price or Sequential Trade Quote price of the relevant issue, which is subject to computation of Direct and Final yield, occurred or changed.
     *
     * @return the TimeC field
     */
    public TimeCField timeC() {
        return timeC;
    }

    /**
     * This item is reserved.
     *
     * @return the Reserved1 field
     */
    public Reserved1Field reserved1() {
        return reserved1;
    }

    /**
     * Direct Yield
     *
     * @return the DirectYield record
     */
    public DirectYield directYield() {
        return directYield;
    }

    /**
     * Final Yield
     *
     * @return the FinalYield record
     */
    public FinalYield finalYield() {
        return finalYield;
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
        return new int[0];
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!reserved2.parse(data, cursor)) {
            return false;
        }
        cursor += Reserved2Field.BYTE_LENGTH;
        if (!directYield.parseFrom(data, cursor, end - 16)) {
            return false;
        }
        cursor += directYield.byteLength();
        if (!finalYield.parseFrom(data, cursor, end - 7)) {
            return false;
        }
        cursor += finalYield.byteLength();
        if (!timeC.parse(data, cursor)) {
            return false;
        }
        cursor += TimeCField.BYTE_LENGTH;
        return reserved1.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = reserved2.encode(data, cursor);
        cursor = directYield.encode(data, cursor);
        cursor = finalYield.encode(data, cursor);
        cursor = timeC.encode(data, cursor);
        cursor = reserved1.encode(data, cursor);
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
        directYield.clear();
        finalYield.clear();
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
            case "Reserved2" -> Optional.of(reserved2);
            case "TimeC" -> Optional.of(timeC);
            case "Reserved1" -> Optional.of(reserved1);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof YieldMessage message)) {
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
        if (!(other instanceof YieldMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
