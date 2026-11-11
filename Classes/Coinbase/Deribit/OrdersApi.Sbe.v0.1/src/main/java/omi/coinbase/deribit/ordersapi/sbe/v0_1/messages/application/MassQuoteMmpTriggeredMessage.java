package omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.DeltaLevelField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.ExecIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.FrozenUntilField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.MmpGroupIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.QuantityLevelField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.TimestampField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.TriggerField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.VegaLevelField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Field;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Message;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.PrintOptions;

/**
 * Represents the MassQuoteMmpTriggeredMessage message from the OrdersApi protocol.
 *
 * <p>MassQuoteMmpTriggeredMessage</p>
 */
public final class MassQuoteMmpTriggeredMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 57;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Quote Mmp Triggered Message";

    /**
     * timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * execId
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * mmpGroupId
     */
    private final MmpGroupIdField mmpGroupId = new MmpGroupIdField();

    /**
     * frozenUntil
     */
    private final FrozenUntilField frozenUntil = new FrozenUntilField();

    /**
     * quantityLevel
     */
    private final QuantityLevelField quantityLevel = new QuantityLevelField();

    /**
     * vegaLevel
     */
    private final VegaLevelField vegaLevel = new VegaLevelField();

    /**
     * deltaLevel
     */
    private final DeltaLevelField deltaLevel = new DeltaLevelField();

    /**
     * trigger
     */
    private final TriggerField trigger = new TriggerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, execId, mmpGroupId, frozenUntil, quantityLevel, vegaLevel, deltaLevel, trigger);

    private byte[] buffer;

    private boolean decoded;

    /**
     * timestamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * execId
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * mmpGroupId
     *
     * @return the MmpGroupId field
     */
    public MmpGroupIdField mmpGroupId() {
        return mmpGroupId;
    }

    /**
     * frozenUntil
     *
     * @return the FrozenUntil field
     */
    public FrozenUntilField frozenUntil() {
        return frozenUntil;
    }

    /**
     * quantityLevel
     *
     * @return the QuantityLevel field
     */
    public QuantityLevelField quantityLevel() {
        return quantityLevel;
    }

    /**
     * vegaLevel
     *
     * @return the VegaLevel field
     */
    public VegaLevelField vegaLevel() {
        return vegaLevel;
    }

    /**
     * deltaLevel
     *
     * @return the DeltaLevel field
     */
    public DeltaLevelField deltaLevel() {
        return deltaLevel;
    }

    /**
     * trigger
     *
     * @return the Trigger field
     */
    public TriggerField trigger() {
        return trigger;
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
        return Optional.ofNullable(timestampField.value());
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!mmpGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += MmpGroupIdField.BYTE_LENGTH;
        if (!frozenUntil.parse(data, cursor)) {
            return false;
        }
        cursor += FrozenUntilField.BYTE_LENGTH;
        if (!quantityLevel.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityLevelField.BYTE_LENGTH;
        if (!vegaLevel.parse(data, cursor)) {
            return false;
        }
        cursor += VegaLevelField.BYTE_LENGTH;
        if (!deltaLevel.parse(data, cursor)) {
            return false;
        }
        cursor += DeltaLevelField.BYTE_LENGTH;
        return trigger.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = mmpGroupId.encode(data, cursor);
        cursor = frozenUntil.encode(data, cursor);
        cursor = quantityLevel.encode(data, cursor);
        cursor = vegaLevel.encode(data, cursor);
        cursor = deltaLevel.encode(data, cursor);
        cursor = trigger.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "ExecId" -> Optional.of(execId);
            case "MmpGroupId" -> Optional.of(mmpGroupId);
            case "FrozenUntil" -> Optional.of(frozenUntil);
            case "QuantityLevel" -> Optional.of(quantityLevel);
            case "VegaLevel" -> Optional.of(vegaLevel);
            case "DeltaLevel" -> Optional.of(deltaLevel);
            case "Trigger" -> Optional.of(trigger);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassQuoteMmpTriggeredMessage message)) {
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
        if (!(other instanceof MassQuoteMmpTriggeredMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
