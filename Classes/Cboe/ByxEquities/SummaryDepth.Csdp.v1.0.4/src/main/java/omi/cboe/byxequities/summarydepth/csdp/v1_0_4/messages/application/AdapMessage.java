package omi.cboe.byxequities.summarydepth.csdp.v1_0_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.fields.AdapBlocksField;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.fields.AdapFlagsField;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.fields.LastUpdateTimestampField;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.fields.ReservedField;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.fields.SymbolField;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.groups.AdapBlockEntry;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.groups.AdapBlockList;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.types.Field;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.types.Message;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.types.PrintOptions;

/**
 * Represents the AdapMessage message from the SummaryDepth protocol.
 *
 * <p>Each ADAP message delivers one or more updates for a Symbol's ADAP book.</p>
 */
public final class AdapMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 19;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Adap Message";

    /**
     * Timestamp of the last matching engine message that updated the quote information for this symbol in the Cboe Summary Depth server's cache.
     */
    private final LastUpdateTimestampField lastUpdateTimestamp = new LastUpdateTimestampField();

    /**
     * Symbol right padded with spaces.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Adap Flags
     */
    private final AdapFlagsField adapFlags = new AdapFlagsField();

    /**
     * Reserved
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * Number of ADAP Blocks to follow
     */
    private final AdapBlocksField adapBlocks = new AdapBlocksField();

    /**
     * Adap Block
     */
    private final AdapBlockList adapBlock = new AdapBlockList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(lastUpdateTimestamp, symbol, adapFlags, reserved, adapBlocks);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Timestamp of the last matching engine message that updated the quote information for this symbol in the Cboe Summary Depth server's cache.
     *
     * @return the LastUpdateTimestamp field
     */
    public LastUpdateTimestampField lastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    /**
     * Symbol right padded with spaces.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Adap Flags
     *
     * @return the AdapFlags field
     */
    public AdapFlagsField adapFlags() {
        return adapFlags;
    }

    /**
     * Reserved
     *
     * @return the Reserved field
     */
    public ReservedField reserved() {
        return reserved;
    }

    /**
     * Number of ADAP Blocks to follow
     *
     * @return the AdapBlocks field
     */
    public AdapBlocksField adapBlocks() {
        return adapBlocks;
    }

    /**
     * Adap Block
     *
     * <p>Encode writes this list's size to the AdapBlocks field.</p>
     *
     * @return the AdapBlock entries
     */
    public AdapBlockList adapBlock() {
        return adapBlock;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + adapBlock.byteLength();
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
        if (!lastUpdateTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += LastUpdateTimestampField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!adapFlags.parse(data, cursor)) {
            return false;
        }
        cursor += AdapFlagsField.BYTE_LENGTH;
        if (!reserved.parse(data, cursor)) {
            return false;
        }
        cursor += ReservedField.BYTE_LENGTH;
        if (!adapBlocks.parse(data, cursor)) {
            return false;
        }
        cursor += AdapBlocksField.BYTE_LENGTH;
        if (!adapBlock.parse(data, cursor, end, adapBlocks.value())) {
            return false;
        }
        cursor += adapBlock.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (adapBlock.size() > 255) {
            throw new IllegalStateException("adapBlock holds " + adapBlock.size() + " entries, more than its count field can state");
        }
        adapBlocks.value((short) adapBlock.size());
        int cursor = offset;
        cursor = lastUpdateTimestamp.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = adapFlags.encode(data, cursor);
        cursor = reserved.encode(data, cursor);
        cursor = adapBlocks.encode(data, cursor);
        cursor = adapBlock.encode(data, cursor);
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
        adapBlock.clear();
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
            if (field != adapBlocks && !field.isRecognized()) {
                return false;
            }
        }
        return adapBlock.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != adapBlocks && !field.isValid()) {
                return false;
            }
        }
        if (!adapBlock.isValid()) {
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
        if (!lastUpdateTimestamp.isDecoded()) {
            return Optional.of(lastUpdateTimestamp);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!adapFlags.isDecoded()) {
            return Optional.of(adapFlags);
        }
        if (!reserved.isDecoded()) {
            return Optional.of(reserved);
        }
        if (!adapBlocks.isDecoded()) {
            return Optional.of(adapBlocks);
        }
        if (!adapBlock.isDecoded()) {
            return Optional.of(adapBlock.failedEntry().flatMap(AdapBlockEntry::failedAt).orElse(adapBlocks));
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
            case "LastUpdateTimestamp" -> Optional.of(lastUpdateTimestamp);
            case "Symbol" -> Optional.of(symbol);
            case "AdapFlags" -> Optional.of(adapFlags);
            case "Reserved" -> Optional.of(reserved);
            case "AdapBlocks" -> Optional.of(adapBlocks);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AdapMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(adapBlock.diffFields(message.adapBlock));
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
            adapBlock.toFormattedString(builder, options);
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
        adapBlock.toFormattedString(builder, nested);
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
        if (!(other instanceof AdapMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && adapBlock.equals(message.adapBlock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, adapBlock);
    }
}
