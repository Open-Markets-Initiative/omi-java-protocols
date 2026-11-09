package omi.miax.pearlequities.expressorders.meo.v2_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.ActionField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.ClientOrderIdField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.MpidField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.PurgeGroupField;
import omi.miax.pearlequities.expressorders.meo.v2_6.fields.ScopeField;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.Field;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.Message;
import omi.miax.pearlequities.expressorders.meo.v2_6.types.PrintOptions;

/**
 * Represents the MassCancelRequest message from the ExpressOrders protocol.
 *
 * <p>Firms can use this message format to request the cancellation of all orders for an MPID</p>
 */
public final class MassCancelRequest implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 44;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Cancel Request";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 8, 35, 9 };

    /**
     * Four character NSCC MPID of the Firm
     */
    private final MpidField mpid = new MpidField();

    /**
     * Firm specified unique order Id
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Scope
     */
    private final ScopeField scope = new ScopeField();

    /**
     * ‘B’ – Block only The system will reject all new
     */
    private final ActionField action = new ActionField();

    /**
     * Customer specified purge group
     */
    private final PurgeGroupField purgeGroup = new PurgeGroupField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(mpid, clientOrderId, scope, action, purgeGroup);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Four character NSCC MPID of the Firm
     *
     * @return the Mpid field
     */
    public MpidField mpid() {
        return mpid;
    }

    /**
     * Firm specified unique order Id
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * Scope
     *
     * @return the Scope field
     */
    public ScopeField scope() {
        return scope;
    }

    /**
     * ‘B’ – Block only The system will reject all new
     *
     * @return the Action field
     */
    public ActionField action() {
        return action;
    }

    /**
     * Customer specified purge group
     *
     * @return the PurgeGroup field
     */
    public PurgeGroupField purgeGroup() {
        return purgeGroup;
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
        return PADDING.clone();
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
        cursor += 8; // padding
        if (!mpid.parse(data, cursor)) {
            return false;
        }
        cursor += MpidField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!scope.parse(data, cursor)) {
            return false;
        }
        cursor += ScopeField.BYTE_LENGTH;
        if (!action.parse(data, cursor)) {
            return false;
        }
        cursor += ActionField.BYTE_LENGTH;
        if (!purgeGroup.parse(data, cursor)) {
            return false;
        }
        cursor += PurgeGroupField.BYTE_LENGTH;
        cursor += 9; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 8) {
            System.arraycopy(buffer, 0, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = mpid.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = scope.encode(data, cursor);
        cursor = action.encode(data, cursor);
        cursor = purgeGroup.encode(data, cursor);
        if (buffer != null && buffer.length >= 35 + 9) {
            System.arraycopy(buffer, 35, data, cursor, 9); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 9, (byte) 0); // padding
        }
        cursor += 9;
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
            case "Mpid" -> Optional.of(mpid);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "Scope" -> Optional.of(scope);
            case "Action" -> Optional.of(action);
            case "PurgeGroup" -> Optional.of(purgeGroup);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassCancelRequest message)) {
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
        if (!(other instanceof MassCancelRequest message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
