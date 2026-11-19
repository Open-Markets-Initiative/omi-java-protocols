package omi.nse.nsecd.orderentry.nnf.v6_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BranchIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BrokerIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.structs.BranchLimits1;
import omi.nse.nsecd.orderentry.nnf.v6_3.structs.BranchLimits2;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Field;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Message;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.PrintOptions;

/**
 * Represents the BranchOrdValLimitUpdateInMessage message from the OrderEntry protocol.
 *
 * <p>Branch Ord Val Limit Update In, carried in the BRANCH_ORD_VAL_LIMIT_UPDATE_REQ structure</p>
 */
public final class BranchOrdValLimitUpdateInMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 96;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Branch Ord Val Limit Update In Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 5, 25, 48, 16, 80, 16 };

    /**
     * This field should contain the trading member ID
     */
    private final BrokerIdField brokerId = new BrokerIdField();

    /**
     * This field should contain the Branch ID to which the broker belongs
     */
    private final BranchIdField branchId = new BranchIdField();

    /**
     * BRANCH_LIMITS 1
     */
    private final BranchLimits1 branchLimits1 = new BranchLimits1();

    /**
     * BRANCH_LIMITS 2
     */
    private final BranchLimits2 branchLimits2 = new BranchLimits2();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(brokerId), List.<Field>of(branchId), branchLimits1.fields(), branchLimits2.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * This field should contain the trading member ID
     *
     * @return the BrokerId field
     */
    public BrokerIdField brokerId() {
        return brokerId;
    }

    /**
     * This field should contain the Branch ID to which the broker belongs
     *
     * @return the BranchId field
     */
    public BranchIdField branchId() {
        return branchId;
    }

    /**
     * BRANCH_LIMITS 1
     *
     * @return the BranchLimits1 record
     */
    public BranchLimits1 branchLimits1() {
        return branchLimits1;
    }

    /**
     * BRANCH_LIMITS 2
     *
     * @return the BranchLimits2 record
     */
    public BranchLimits2 branchLimits2() {
        return branchLimits2;
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
        if (!brokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerIdField.BYTE_LENGTH;
        cursor += 25; // padding
        if (!branchId.parse(data, cursor)) {
            return false;
        }
        cursor += BranchIdField.BYTE_LENGTH;
        if (!branchLimits1.parseFrom(data, cursor, end - 32)) {
            return false;
        }
        cursor += branchLimits1.byteLength();
        return branchLimits2.parseFrom(data, cursor, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = brokerId.encode(data, cursor);
        if (buffer != null && buffer.length >= 30) {
            System.arraycopy(buffer, 5, data, cursor, 25); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 25, (byte) 0); // padding
        }
        cursor += 25;
        cursor = branchId.encode(data, cursor);
        cursor = branchLimits1.encode(data, cursor);
        cursor = branchLimits2.encode(data, cursor);
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
        branchLimits1.clear();
        branchLimits2.clear();
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
            case "BrokerId" -> Optional.of(brokerId);
            case "BranchId" -> Optional.of(branchId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BranchOrdValLimitUpdateInMessage message)) {
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
        if (!(other instanceof BranchOrdValLimitUpdateInMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
