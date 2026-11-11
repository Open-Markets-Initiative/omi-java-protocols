package omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.GroupInstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.InstrumentExternalCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.InstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.MarketFlowIndicatorField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * Represents the UnderlyingInstrumentKeysMessage message from the SolaMulticast protocol.
 *
 * <p>The 'Underlying Instrument Keys' message will be the first messages sent during the day. There is no 'Underlying Summary' message attached to the 'Instrument Keys' messages</p>
 */
public final class UnderlyingInstrumentKeysMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Underlying Instrument Keys Message";

    /**
     * Exchange on which the trade occurred
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * group of the instrument
     */
    private final GroupInstrumentField groupInstrument = new GroupInstrumentField();

    /**
     * Instrument
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * External identifier used by traders when entering an order
     */
    private final InstrumentExternalCodeField instrumentExternalCode = new InstrumentExternalCodeField();

    /**
     * Defines the type of instruments
     */
    private final MarketFlowIndicatorField marketFlowIndicator = new MarketFlowIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, groupInstrument, instrument, instrumentExternalCode, marketFlowIndicator);

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
     * group of the instrument
     *
     * @return the GroupInstrument field
     */
    public GroupInstrumentField groupInstrument() {
        return groupInstrument;
    }

    /**
     * Instrument
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * External identifier used by traders when entering an order
     *
     * @return the InstrumentExternalCode field
     */
    public InstrumentExternalCodeField instrumentExternalCode() {
        return instrumentExternalCode;
    }

    /**
     * Defines the type of instruments
     *
     * @return the MarketFlowIndicator field
     */
    public MarketFlowIndicatorField marketFlowIndicator() {
        return marketFlowIndicator;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!groupInstrument.parse(data, cursor)) {
            return false;
        }
        cursor += GroupInstrumentField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!instrumentExternalCode.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentExternalCodeField.BYTE_LENGTH;
        return marketFlowIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = groupInstrument.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = instrumentExternalCode.encode(data, cursor);
        cursor = marketFlowIndicator.encode(data, cursor);
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "GroupInstrument" -> Optional.of(groupInstrument);
            case "Instrument" -> Optional.of(instrument);
            case "InstrumentExternalCode" -> Optional.of(instrumentExternalCode);
            case "MarketFlowIndicator" -> Optional.of(marketFlowIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof UnderlyingInstrumentKeysMessage message)) {
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
        if (!(other instanceof UnderlyingInstrumentKeysMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
