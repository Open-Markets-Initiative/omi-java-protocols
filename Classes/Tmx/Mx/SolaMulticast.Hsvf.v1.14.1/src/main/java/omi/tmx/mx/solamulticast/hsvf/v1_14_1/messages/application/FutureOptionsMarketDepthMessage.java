package omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.InstrumentStatusMarkerField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.NumberOfLevelsField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.groups.FutureOptionsMarketDepthLevelEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.groups.FutureOptionsMarketDepthLevelList;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.FutureOptionSymbol;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * Represents the FutureOptionsMarketDepthMessage message from the SolaMulticast protocol.
 *
 * <p>Future Options Market Depth message</p>
 */
public final class FutureOptionsMarketDepthMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 23;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Future Options Market Depth Message";

    /**
     * Exchange on which the trade occurred
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Indicates instrument status
     */
    private final InstrumentStatusMarkerField instrumentStatusMarker = new InstrumentStatusMarkerField();

    /**
     * Number of level for the trading instrument. 1 to 5
     */
    private final NumberOfLevelsField numberOfLevels = new NumberOfLevelsField();

    /**
     * Option Market Depth
     */
    private final FutureOptionsMarketDepthLevelList futureOptionsMarketDepthLevel = new FutureOptionsMarketDepthLevelList();

    /**
     * Option on future symbology
     */
    private final FutureOptionSymbol futureOptionSymbol = new FutureOptionSymbol();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, instrumentStatusMarker, numberOfLevels);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange on which the trade occurred
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Indicates instrument status
     *
     * @return the InstrumentStatusMarker field
     */
    public InstrumentStatusMarkerField instrumentStatusMarker() {
        return instrumentStatusMarker;
    }

    /**
     * Number of level for the trading instrument. 1 to 5
     *
     * @return the NumberOfLevels field
     */
    public NumberOfLevelsField numberOfLevels() {
        return numberOfLevels;
    }

    /**
     * Option Market Depth
     *
     * <p>Encode writes this list's size to the NumberOfLevels field.</p>
     *
     * @return the FutureOptionsMarketDepthLevel entries
     */
    public FutureOptionsMarketDepthLevelList futureOptionsMarketDepthLevel() {
        return futureOptionsMarketDepthLevel;
    }

    /**
     * Option on future symbology
     *
     * @return the FutureOptionSymbol record
     */
    public FutureOptionSymbol futureOptionSymbol() {
        return futureOptionSymbol;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + futureOptionsMarketDepthLevel.byteLength();
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!futureOptionSymbol.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += futureOptionSymbol.byteLength();
        if (!instrumentStatusMarker.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentStatusMarkerField.BYTE_LENGTH;
        if (!numberOfLevels.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLevelsField.BYTE_LENGTH;
        if (numberOfLevels.value() == null) {
            return false;
        }
        if (!futureOptionsMarketDepthLevel.parse(data, cursor, end, numberOfLevels.value())) {
            return false;
        }
        cursor += futureOptionsMarketDepthLevel.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (futureOptionsMarketDepthLevel.size() > 9) {
            throw new IllegalStateException("futureOptionsMarketDepthLevel holds " + futureOptionsMarketDepthLevel.size() + " entries, more than its count field can state");
        }
        numberOfLevels.value((long) futureOptionsMarketDepthLevel.size());
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = futureOptionSymbol.encode(data, cursor);
        cursor = instrumentStatusMarker.encode(data, cursor);
        cursor = numberOfLevels.encode(data, cursor);
        cursor = futureOptionsMarketDepthLevel.encode(data, cursor);
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
        futureOptionSymbol.clear();
        futureOptionsMarketDepthLevel.clear();
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
            if (field != numberOfLevels && !field.isRecognized()) {
                return false;
            }
        }
        if (!futureOptionSymbol.isRecognized()) {
            return false;
        }
        return futureOptionsMarketDepthLevel.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfLevels && !field.isValid()) {
                return false;
            }
        }
        if (!futureOptionSymbol.isValid()) {
            return false;
        }
        if (!futureOptionsMarketDepthLevel.isValid()) {
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
        if (!exchangeId.isDecoded()) {
            return Optional.of(exchangeId);
        }
        if (!futureOptionSymbol.isDecoded()) {
            return futureOptionSymbol.failedAt();
        }
        if (!instrumentStatusMarker.isDecoded()) {
            return Optional.of(instrumentStatusMarker);
        }
        if (!numberOfLevels.isDecoded()) {
            return Optional.of(numberOfLevels);
        }
        if (!futureOptionsMarketDepthLevel.isDecoded()) {
            return Optional.of(futureOptionsMarketDepthLevel.failedEntry().flatMap(FutureOptionsMarketDepthLevelEntry::failedAt).orElse(numberOfLevels));
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "InstrumentStatusMarker" -> Optional.of(instrumentStatusMarker);
            case "NumberOfLevels" -> Optional.of(numberOfLevels);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FutureOptionsMarketDepthMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(futureOptionSymbol.diffFields(message.futureOptionSymbol));
        changed.addAll(futureOptionsMarketDepthLevel.diffFields(message.futureOptionsMarketDepthLevel));
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
            futureOptionSymbol.toFormattedString(builder, options);
            builder.append(", ");
            futureOptionsMarketDepthLevel.toFormattedString(builder, options);
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
        futureOptionSymbol.toFormattedString(builder, nested);
        futureOptionsMarketDepthLevel.toFormattedString(builder, nested);
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
        if (!(other instanceof FutureOptionsMarketDepthMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && futureOptionSymbol.equals(message.futureOptionSymbol) && futureOptionsMarketDepthLevel.equals(message.futureOptionsMarketDepthLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, futureOptionSymbol, futureOptionsMarketDepthLevel);
    }
}
