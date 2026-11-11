package omi.nasdaq.uqdf.output.utp.v1_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.MwcbLevel1Field;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.MwcbLevel2Field;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.MwcbLevel3Field;
import omi.nasdaq.uqdf.output.utp.v1_5.structs.MessageInfo;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Field;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Message;
import omi.nasdaq.uqdf.output.utp.v1_5.types.PrintOptions;

/**
 * Represents the MarketWideCircuitBreakerDeclineLevelMessage message from the Output protocol.
 *
 * <p>A Market Wide Circuit Breaker (MWCB) Level message will inform participants and the UTP data recipients what the daily MWCB breach points are set to for the current trading day</p>
 */
public final class MarketWideCircuitBreakerDeclineLevelMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'C';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 50;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Wide Circuit Breaker Decline Level Message";

    /**
     * MWCB Level 1
     */
    private final MwcbLevel1Field mwcbLevel1 = new MwcbLevel1Field();

    /**
     * MWCB Level 2
     */
    private final MwcbLevel2Field mwcbLevel2 = new MwcbLevel2Field();

    /**
     * MWCB Level 3
     */
    private final MwcbLevel3Field mwcbLevel3 = new MwcbLevel3Field();

    /**
     * Message Info
     */
    private final MessageInfo messageInfo = new MessageInfo();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(messageInfo.fields(), List.<Field>of(mwcbLevel1), List.<Field>of(mwcbLevel2), List.<Field>of(mwcbLevel3)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * MWCB Level 1
     *
     * @return the MwcbLevel1 field
     */
    public MwcbLevel1Field mwcbLevel1() {
        return mwcbLevel1;
    }

    /**
     * MWCB Level 2
     *
     * @return the MwcbLevel2 field
     */
    public MwcbLevel2Field mwcbLevel2() {
        return mwcbLevel2;
    }

    /**
     * MWCB Level 3
     *
     * @return the MwcbLevel3 field
     */
    public MwcbLevel3Field mwcbLevel3() {
        return mwcbLevel3;
    }

    /**
     * Message Info
     *
     * @return the MessageInfo record
     */
    public MessageInfo messageInfo() {
        return messageInfo;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        return Optional.ofNullable(messageInfo.sipTimestamp().value());
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
        if (!messageInfo.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += messageInfo.byteLength();
        if (!mwcbLevel1.parse(data, cursor)) {
            return false;
        }
        cursor += MwcbLevel1Field.BYTE_LENGTH;
        if (!mwcbLevel2.parse(data, cursor)) {
            return false;
        }
        cursor += MwcbLevel2Field.BYTE_LENGTH;
        return mwcbLevel3.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = messageInfo.encode(data, cursor);
        cursor = mwcbLevel1.encode(data, cursor);
        cursor = mwcbLevel2.encode(data, cursor);
        cursor = mwcbLevel3.encode(data, cursor);
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
        messageInfo.clear();
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
            case "MwcbLevel1" -> Optional.of(mwcbLevel1);
            case "MwcbLevel2" -> Optional.of(mwcbLevel2);
            case "MwcbLevel3" -> Optional.of(mwcbLevel3);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketWideCircuitBreakerDeclineLevelMessage message)) {
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
        if (!(other instanceof MarketWideCircuitBreakerDeclineLevelMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
