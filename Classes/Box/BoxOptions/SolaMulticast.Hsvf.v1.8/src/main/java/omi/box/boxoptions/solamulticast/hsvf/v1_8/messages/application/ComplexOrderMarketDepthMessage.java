package omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ComplexOrderInstrumentSymbolField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ExchangeIdField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.InstrumentStatusMarkerField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.NumberOfLevelsField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.groups.ComplexMarketDepthLevelEntry;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.groups.ComplexMarketDepthLevelList;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Field;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Message;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.PrintOptions;

/**
 * Represents the ComplexOrderMarketDepthMessage message from the SolaMulticast protocol.
 *
 * <p>Complex Order Market Depth</p>
 */
public final class ComplexOrderMarketDepthMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 33;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Order Market Depth Message";

    /**
     * Q by default
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Complex Order Instrument symbol. The individual legs are defined in message type JS.
     */
    private final ComplexOrderInstrumentSymbolField complexOrderInstrumentSymbol = new ComplexOrderInstrumentSymbolField();

    /**
     * Indicates instrument status
     */
    private final InstrumentStatusMarkerField instrumentStatusMarker = new InstrumentStatusMarkerField();

    /**
     * Number of level for the trading instrument
     */
    private final NumberOfLevelsField numberOfLevels = new NumberOfLevelsField();

    /**
     * Complex Market Depth Level
     */
    private final ComplexMarketDepthLevelList complexMarketDepthLevel = new ComplexMarketDepthLevelList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, complexOrderInstrumentSymbol, instrumentStatusMarker, numberOfLevels);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Q by default
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Complex Order Instrument symbol. The individual legs are defined in message type JS.
     *
     * @return the ComplexOrderInstrumentSymbol field
     */
    public ComplexOrderInstrumentSymbolField complexOrderInstrumentSymbol() {
        return complexOrderInstrumentSymbol;
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
     * Number of level for the trading instrument
     *
     * @return the NumberOfLevels field
     */
    public NumberOfLevelsField numberOfLevels() {
        return numberOfLevels;
    }

    /**
     * Complex Market Depth Level
     *
     * <p>Encode writes this list's size to the NumberOfLevels field.</p>
     *
     * @return the ComplexMarketDepthLevel entries
     */
    public ComplexMarketDepthLevelList complexMarketDepthLevel() {
        return complexMarketDepthLevel;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + complexMarketDepthLevel.byteLength();
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
        if (!complexOrderInstrumentSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexOrderInstrumentSymbolField.BYTE_LENGTH;
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
        if (!complexMarketDepthLevel.parse(data, cursor, end, numberOfLevels.value())) {
            return false;
        }
        cursor += complexMarketDepthLevel.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (complexMarketDepthLevel.size() > 9) {
            throw new IllegalStateException("complexMarketDepthLevel holds " + complexMarketDepthLevel.size() + " entries, more than its count field can state");
        }
        numberOfLevels.value((long) complexMarketDepthLevel.size());
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = complexOrderInstrumentSymbol.encode(data, cursor);
        cursor = instrumentStatusMarker.encode(data, cursor);
        cursor = numberOfLevels.encode(data, cursor);
        cursor = complexMarketDepthLevel.encode(data, cursor);
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
        complexMarketDepthLevel.clear();
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
        return complexMarketDepthLevel.isRecognized();
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
        if (!complexMarketDepthLevel.isValid()) {
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
        if (!complexOrderInstrumentSymbol.isDecoded()) {
            return Optional.of(complexOrderInstrumentSymbol);
        }
        if (!instrumentStatusMarker.isDecoded()) {
            return Optional.of(instrumentStatusMarker);
        }
        if (!numberOfLevels.isDecoded()) {
            return Optional.of(numberOfLevels);
        }
        if (!complexMarketDepthLevel.isDecoded()) {
            return Optional.of(complexMarketDepthLevel.failedEntry().flatMap(ComplexMarketDepthLevelEntry::failedAt).orElse(numberOfLevels));
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
            case "ComplexOrderInstrumentSymbol" -> Optional.of(complexOrderInstrumentSymbol);
            case "InstrumentStatusMarker" -> Optional.of(instrumentStatusMarker);
            case "NumberOfLevels" -> Optional.of(numberOfLevels);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexOrderMarketDepthMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(complexMarketDepthLevel.diffFields(message.complexMarketDepthLevel));
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
            complexMarketDepthLevel.toFormattedString(builder, options);
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
        complexMarketDepthLevel.toFormattedString(builder, nested);
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
        if (!(other instanceof ComplexOrderMarketDepthMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && complexMarketDepthLevel.equals(message.complexMarketDepthLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, complexMarketDepthLevel);
    }
}
