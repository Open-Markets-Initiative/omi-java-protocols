package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.NetPresentValueFractionIndicatorField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.RawNetPresentValueAField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.GroupEntry;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.PrintOptions;

/**
 * The NetPresentValueANegativeTenThousandPair record a message holds.
 *
 * <p>Net Present Value A Negative Ten Thousand Pair</p>
 */
public final class NetPresentValueANegativeTenThousandPair implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 12;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "NetPresentValueANegativeTenThousandPair";

    /**
     * Net present value of all cash flows in the future (Floating cash flow - Fixed cash flow)
     */
    private final RawNetPresentValueAField rawNetPresentValueA = new RawNetPresentValueAField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final NetPresentValueFractionIndicatorField netPresentValueFractionIndicator = new NetPresentValueFractionIndicatorField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(rawNetPresentValueA, netPresentValueFractionIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Net present value of all cash flows in the future (Floating cash flow - Fixed cash flow)
     *
     * @return the RawNetPresentValueA field
     */
    public RawNetPresentValueAField rawNetPresentValueA() {
        return rawNetPresentValueA;
    }

    /**
     * Defines number of decimal places or fraction positions
     *
     * @return the NetPresentValueFractionIndicator field
     */
    public NetPresentValueFractionIndicatorField netPresentValueFractionIndicator() {
        return netPresentValueFractionIndicator;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!rawNetPresentValueA.parse(data, cursor)) {
            return false;
        }
        cursor += RawNetPresentValueAField.BYTE_LENGTH;
        return netPresentValueFractionIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = rawNetPresentValueA.encode(data, cursor);
        cursor = netPresentValueFractionIndicator.encode(data, cursor);
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
            case "RawNetPresentValueA" -> Optional.of(rawNetPresentValueA);
            case "NetPresentValueFractionIndicator" -> Optional.of(netPresentValueFractionIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof NetPresentValueANegativeTenThousandPair message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof NetPresentValueANegativeTenThousandPair message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
