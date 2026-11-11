package omi.jpx.osederivatives.geniuminet.itch.v5_0_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.fields.CombinationOrderbookIdField;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.fields.LegOrderbookIdField;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.fields.LegRatioField;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.fields.LegSideField;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.fields.NanosecondsField;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.types.Field;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.types.Message;
import omi.jpx.osederivatives.geniuminet.itch.v5_0_6.types.PrintOptions;

/**
 * Represents the CombinationOrderbookLeg message from the GeniumInet protocol.
 *
 * <p>Mapping between a combination orderbook and its leg orderbooks.</p>
 */
public final class CombinationOrderbookLeg implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'M';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 17;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Combination Orderbook Leg";

    /**
     * Nanoseconds portion
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Identifier of combo orderbook
     */
    private final CombinationOrderbookIdField combinationOrderbookId = new CombinationOrderbookIdField();

    /**
     * Orderbook ID of Leg instrument
     */
    private final LegOrderbookIdField legOrderbookId = new LegOrderbookIdField();

    /**
     * Leg Side
     */
    private final LegSideField legSide = new LegSideField();

    /**
     * Leg Ratio
     */
    private final LegRatioField legRatio = new LegRatioField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, combinationOrderbookId, legOrderbookId, legSide, legRatio);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Identifier of combo orderbook
     *
     * @return the CombinationOrderbookId field
     */
    public CombinationOrderbookIdField combinationOrderbookId() {
        return combinationOrderbookId;
    }

    /**
     * Orderbook ID of Leg instrument
     *
     * @return the LegOrderbookId field
     */
    public LegOrderbookIdField legOrderbookId() {
        return legOrderbookId;
    }

    /**
     * Leg Side
     *
     * @return the LegSide field
     */
    public LegSideField legSide() {
        return legSide;
    }

    /**
     * Leg Ratio
     *
     * @return the LegRatio field
     */
    public LegRatioField legRatio() {
        return legRatio;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!combinationOrderbookId.parse(data, cursor)) {
            return false;
        }
        cursor += CombinationOrderbookIdField.BYTE_LENGTH;
        if (!legOrderbookId.parse(data, cursor)) {
            return false;
        }
        cursor += LegOrderbookIdField.BYTE_LENGTH;
        if (!legSide.parse(data, cursor)) {
            return false;
        }
        cursor += LegSideField.BYTE_LENGTH;
        return legRatio.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = combinationOrderbookId.encode(data, cursor);
        cursor = legOrderbookId.encode(data, cursor);
        cursor = legSide.encode(data, cursor);
        cursor = legRatio.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "CombinationOrderbookId" -> Optional.of(combinationOrderbookId);
            case "LegOrderbookId" -> Optional.of(legOrderbookId);
            case "LegSide" -> Optional.of(legSide);
            case "LegRatio" -> Optional.of(legRatio);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CombinationOrderbookLeg message)) {
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
        if (!(other instanceof CombinationOrderbookLeg message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
