package omi.databento.marketdata.normalized.dbn.v3.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.databento.marketdata.normalized.dbn.v3.fields.AskCtField;
import omi.databento.marketdata.normalized.dbn.v3.fields.AskPxField;
import omi.databento.marketdata.normalized.dbn.v3.fields.AskSzField;
import omi.databento.marketdata.normalized.dbn.v3.fields.BidCtField;
import omi.databento.marketdata.normalized.dbn.v3.fields.BidPxField;
import omi.databento.marketdata.normalized.dbn.v3.fields.BidSzField;
import omi.databento.marketdata.normalized.dbn.v3.types.Field;
import omi.databento.marketdata.normalized.dbn.v3.types.GroupEntry;
import omi.databento.marketdata.normalized.dbn.v3.types.PrintOptions;

/**
 * One entry of the BidAskPair repeating group.
 *
 * <p>A level</p>
 */
public final class BidAskPairEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 32;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "BidAskPair";

    /**
     * The bid price
     */
    private final BidPxField bidPx = new BidPxField();

    /**
     * The ask price
     */
    private final AskPxField askPx = new AskPxField();

    /**
     * The bid size
     */
    private final BidSzField bidSz = new BidSzField();

    /**
     * The ask size
     */
    private final AskSzField askSz = new AskSzField();

    /**
     * The number of bid orders
     */
    private final BidCtField bidCt = new BidCtField();

    /**
     * The number of ask orders
     */
    private final AskCtField askCt = new AskCtField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(bidPx, askPx, bidSz, askSz, bidCt, askCt);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The bid price
     *
     * @return the BidPx field
     */
    public BidPxField bidPx() {
        return bidPx;
    }

    /**
     * The ask price
     *
     * @return the AskPx field
     */
    public AskPxField askPx() {
        return askPx;
    }

    /**
     * The bid size
     *
     * @return the BidSz field
     */
    public BidSzField bidSz() {
        return bidSz;
    }

    /**
     * The ask size
     *
     * @return the AskSz field
     */
    public AskSzField askSz() {
        return askSz;
    }

    /**
     * The number of bid orders
     *
     * @return the BidCt field
     */
    public BidCtField bidCt() {
        return bidCt;
    }

    /**
     * The number of ask orders
     *
     * @return the AskCt field
     */
    public AskCtField askCt() {
        return askCt;
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
        if (!bidPx.parse(data, cursor)) {
            return false;
        }
        cursor += BidPxField.BYTE_LENGTH;
        if (!askPx.parse(data, cursor)) {
            return false;
        }
        cursor += AskPxField.BYTE_LENGTH;
        if (!bidSz.parse(data, cursor)) {
            return false;
        }
        cursor += BidSzField.BYTE_LENGTH;
        if (!askSz.parse(data, cursor)) {
            return false;
        }
        cursor += AskSzField.BYTE_LENGTH;
        if (!bidCt.parse(data, cursor)) {
            return false;
        }
        cursor += BidCtField.BYTE_LENGTH;
        return askCt.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = bidPx.encode(data, cursor);
        cursor = askPx.encode(data, cursor);
        cursor = bidSz.encode(data, cursor);
        cursor = askSz.encode(data, cursor);
        cursor = bidCt.encode(data, cursor);
        cursor = askCt.encode(data, cursor);
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
            case "BidPx" -> Optional.of(bidPx);
            case "AskPx" -> Optional.of(askPx);
            case "BidSz" -> Optional.of(bidSz);
            case "AskSz" -> Optional.of(askSz);
            case "BidCt" -> Optional.of(bidCt);
            case "AskCt" -> Optional.of(askCt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof BidAskPairEntry message)) {
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
        if (!(other instanceof BidAskPairEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
