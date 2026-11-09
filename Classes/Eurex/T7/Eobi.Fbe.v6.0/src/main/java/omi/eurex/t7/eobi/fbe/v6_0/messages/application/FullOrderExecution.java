package omi.eurex.t7.eobi.fbe.v6_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eobi.fbe.v6_0.fields.AlgorithmicTradeIndicatorField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.LastPxField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.LastQtyField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.OrdTypeField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.PriceField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.SecurityIdField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.SideField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.TrdMatchIdField;
import omi.eurex.t7.eobi.fbe.v6_0.fields.TrdRegTsTimePriorityField;
import omi.eurex.t7.eobi.fbe.v6_0.types.Field;
import omi.eurex.t7.eobi.fbe.v6_0.types.Message;
import omi.eurex.t7.eobi.fbe.v6_0.types.PrintOptions;

/**
 * Represents the FullOrderExecution message from the Eobi protocol.
 */
public final class FullOrderExecution implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 48;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Full Order Execution";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 3, 5 };

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Algorithmic Trade Indicator
     */
    private final AlgorithmicTradeIndicatorField algorithmicTradeIndicator = new AlgorithmicTradeIndicatorField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Trd Reg Ts Time Priority
     */
    private final TrdRegTsTimePriorityField trdRegTsTimePriority = new TrdRegTsTimePriorityField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Trd Match Id
     */
    private final TrdMatchIdField trdMatchId = new TrdMatchIdField();

    /**
     * Last Qty
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(side, ordType, algorithmicTradeIndicator, price, trdRegTsTimePriority, securityId, trdMatchId, lastQty, lastPx);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Ord Type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Algorithmic Trade Indicator
     *
     * @return the AlgorithmicTradeIndicator field
     */
    public AlgorithmicTradeIndicatorField algorithmicTradeIndicator() {
        return algorithmicTradeIndicator;
    }

    /**
     * Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Trd Reg Ts Time Priority
     *
     * @return the TrdRegTsTimePriority field
     */
    public TrdRegTsTimePriorityField trdRegTsTimePriority() {
        return trdRegTsTimePriority;
    }

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Trd Match Id
     *
     * @return the TrdMatchId field
     */
    public TrdMatchIdField trdMatchId() {
        return trdMatchId;
    }

    /**
     * Last Qty
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
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
        return Optional.ofNullable(trdRegTsTimePriority.value());
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
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!algorithmicTradeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AlgorithmicTradeIndicatorField.BYTE_LENGTH;
        cursor += 5; // padding
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!trdRegTsTimePriority.parse(data, cursor)) {
            return false;
        }
        cursor += TrdRegTsTimePriorityField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!trdMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += TrdMatchIdField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = side.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = algorithmicTradeIndicator.encode(data, cursor);
        if (buffer != null && buffer.length >= 3 + 5) {
            System.arraycopy(buffer, 3, data, cursor, 5); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 5, (byte) 0); // padding
        }
        cursor += 5;
        cursor = price.encode(data, cursor);
        cursor = trdRegTsTimePriority.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = trdMatchId.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
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
            case "Side" -> Optional.of(side);
            case "OrdType" -> Optional.of(ordType);
            case "AlgorithmicTradeIndicator" -> Optional.of(algorithmicTradeIndicator);
            case "Price" -> Optional.of(price);
            case "TrdRegTsTimePriority" -> Optional.of(trdRegTsTimePriority);
            case "SecurityId" -> Optional.of(securityId);
            case "TrdMatchId" -> Optional.of(trdMatchId);
            case "LastQty" -> Optional.of(lastQty);
            case "LastPx" -> Optional.of(lastPx);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FullOrderExecution message)) {
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
        if (!(other instanceof FullOrderExecution message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
