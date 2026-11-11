package omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.CurrentRefreshPktField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.TotalRefreshPktsField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.structs.FullRefreshHeader;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.types.Field;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.types.Message;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.types.PrintOptions;

/**
 * Represents the RefreshHeaderMessage message from the IntegratedFeed protocol.
 *
 * <p>The first message in each packet of refresh messages published over the Refresh multicast channels is of this type.</p>
 */
public final class RefreshHeaderMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 4;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Refresh Header Message";

    /**
     * The current refresh packet in the update
     */
    private final CurrentRefreshPktField currentRefreshPkt = new CurrentRefreshPktField();

    /**
     * The total number of refresh packets you should expect in the update
     */
    private final TotalRefreshPktsField totalRefreshPkts = new TotalRefreshPktsField();

    /**
     * Sequence number fields that only the full Refresh Header carries.
     */
    private final FullRefreshHeader fullRefreshHeader = new FullRefreshHeader();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(currentRefreshPkt, totalRefreshPkts);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The current refresh packet in the update
     *
     * @return the CurrentRefreshPkt field
     */
    public CurrentRefreshPktField currentRefreshPkt() {
        return currentRefreshPkt;
    }

    /**
     * The total number of refresh packets you should expect in the update
     *
     * @return the TotalRefreshPkts field
     */
    public TotalRefreshPktsField totalRefreshPkts() {
        return totalRefreshPkts;
    }

    /**
     * Sequence number fields that only the full Refresh Header carries.
     *
     * @return the FullRefreshHeader record
     */
    public FullRefreshHeader fullRefreshHeader() {
        return fullRefreshHeader;
    }

    /**
     * Returns whether the fields before the FullRefreshHeader put it on the wire.
     *
     * <p>Decode reads the FullRefreshHeader where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FullRefreshHeader is on the wire
     */
    public boolean fullRefreshHeaderPresent() {
        return currentRefreshPkt.value() == 1L;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (fullRefreshHeaderPresent() ? fullRefreshHeader.byteLength() : 0);
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!currentRefreshPkt.parse(data, cursor)) {
            return false;
        }
        cursor += CurrentRefreshPktField.BYTE_LENGTH;
        if (!totalRefreshPkts.parse(data, cursor)) {
            return false;
        }
        cursor += TotalRefreshPktsField.BYTE_LENGTH;
        if (fullRefreshHeaderPresent()) {
            if (!fullRefreshHeader.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += fullRefreshHeader.byteLength();
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = currentRefreshPkt.encode(data, cursor);
        cursor = totalRefreshPkts.encode(data, cursor);
        if (fullRefreshHeaderPresent()) {
            cursor = fullRefreshHeader.encode(data, cursor);
        }
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
        fullRefreshHeader.clear();
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
        return !fullRefreshHeaderPresent() || fullRefreshHeader.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (fullRefreshHeaderPresent() && !fullRefreshHeader.isValid()) {
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
            case "CurrentRefreshPkt" -> Optional.of(currentRefreshPkt);
            case "TotalRefreshPkts" -> Optional.of(totalRefreshPkts);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RefreshHeaderMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(fullRefreshHeader.diffFields(message.fullRefreshHeader));
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
            if (fullRefreshHeaderPresent()) {
                builder.append(", ");
                fullRefreshHeader.toFormattedString(builder, options);
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
        if (fullRefreshHeaderPresent()) {
            fullRefreshHeader.toFormattedString(builder, nested);
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
        if (!(other instanceof RefreshHeaderMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && fullRefreshHeader.equals(message.fullRefreshHeader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, fullRefreshHeader);
    }
}
