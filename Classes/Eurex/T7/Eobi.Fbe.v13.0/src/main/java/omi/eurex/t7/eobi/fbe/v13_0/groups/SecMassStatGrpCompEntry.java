package omi.eurex.t7.eobi.fbe.v13_0.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eobi.fbe.v13_0.fields.HighPxField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.LowPxField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.MarketConditionField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityIdField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityStatusField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityTradingEventField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityTradingStatusField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SoldOutIndicatorField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.TesSecurityStatusField;
import omi.eurex.t7.eobi.fbe.v13_0.types.Field;
import omi.eurex.t7.eobi.fbe.v13_0.types.GroupEntry;
import omi.eurex.t7.eobi.fbe.v13_0.types.PrintOptions;

/**
 * One entry of the SecMassStatGrpComp repeating group.
 *
 * <p>Sec Mass Stat Grp Comp</p>
 */
public final class SecMassStatGrpCompEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 32;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "SecMassStatGrpComp";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 30, 2 };

    /**
     * Unique instrument identifier
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * High Px
     */
    private final HighPxField highPx = new HighPxField();

    /**
     * Low Px
     */
    private final LowPxField lowPx = new LowPxField();

    /**
     * Security Status
     */
    private final SecurityStatusField securityStatus = new SecurityStatusField();

    /**
     * Security Trading Status
     */
    private final SecurityTradingStatusField securityTradingStatus = new SecurityTradingStatusField();

    /**
     * Market Condition
     */
    private final MarketConditionField marketCondition = new MarketConditionField();

    /**
     * Security Trading Event
     */
    private final SecurityTradingEventField securityTradingEvent = new SecurityTradingEventField();

    /**
     * Sold Out Indicator
     */
    private final SoldOutIndicatorField soldOutIndicator = new SoldOutIndicatorField();

    /**
     * Tes Security Status
     */
    private final TesSecurityStatusField tesSecurityStatus = new TesSecurityStatusField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, highPx, lowPx, securityStatus, securityTradingStatus, marketCondition, securityTradingEvent, soldOutIndicator, tesSecurityStatus);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique instrument identifier
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * High Px
     *
     * @return the HighPx field
     */
    public HighPxField highPx() {
        return highPx;
    }

    /**
     * Low Px
     *
     * @return the LowPx field
     */
    public LowPxField lowPx() {
        return lowPx;
    }

    /**
     * Security Status
     *
     * @return the SecurityStatus field
     */
    public SecurityStatusField securityStatus() {
        return securityStatus;
    }

    /**
     * Security Trading Status
     *
     * @return the SecurityTradingStatus field
     */
    public SecurityTradingStatusField securityTradingStatus() {
        return securityTradingStatus;
    }

    /**
     * Market Condition
     *
     * @return the MarketCondition field
     */
    public MarketConditionField marketCondition() {
        return marketCondition;
    }

    /**
     * Security Trading Event
     *
     * @return the SecurityTradingEvent field
     */
    public SecurityTradingEventField securityTradingEvent() {
        return securityTradingEvent;
    }

    /**
     * Sold Out Indicator
     *
     * @return the SoldOutIndicator field
     */
    public SoldOutIndicatorField soldOutIndicator() {
        return soldOutIndicator;
    }

    /**
     * Tes Security Status
     *
     * @return the TesSecurityStatus field
     */
    public TesSecurityStatusField tesSecurityStatus() {
        return tesSecurityStatus;
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
        return PADDING.clone();
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!highPx.parse(data, cursor)) {
            return false;
        }
        cursor += HighPxField.BYTE_LENGTH;
        if (!lowPx.parse(data, cursor)) {
            return false;
        }
        cursor += LowPxField.BYTE_LENGTH;
        if (!securityStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityStatusField.BYTE_LENGTH;
        if (!securityTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingStatusField.BYTE_LENGTH;
        if (!marketCondition.parse(data, cursor)) {
            return false;
        }
        cursor += MarketConditionField.BYTE_LENGTH;
        if (!securityTradingEvent.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingEventField.BYTE_LENGTH;
        if (!soldOutIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SoldOutIndicatorField.BYTE_LENGTH;
        if (!tesSecurityStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TesSecurityStatusField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = highPx.encode(data, cursor);
        cursor = lowPx.encode(data, cursor);
        cursor = securityStatus.encode(data, cursor);
        cursor = securityTradingStatus.encode(data, cursor);
        cursor = marketCondition.encode(data, cursor);
        cursor = securityTradingEvent.encode(data, cursor);
        cursor = soldOutIndicator.encode(data, cursor);
        cursor = tesSecurityStatus.encode(data, cursor);
        if (buffer != null && buffer.length >= 32) {
            System.arraycopy(buffer, 30, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
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
            case "SecurityId" -> Optional.of(securityId);
            case "HighPx" -> Optional.of(highPx);
            case "LowPx" -> Optional.of(lowPx);
            case "SecurityStatus" -> Optional.of(securityStatus);
            case "SecurityTradingStatus" -> Optional.of(securityTradingStatus);
            case "MarketCondition" -> Optional.of(marketCondition);
            case "SecurityTradingEvent" -> Optional.of(securityTradingEvent);
            case "SoldOutIndicator" -> Optional.of(soldOutIndicator);
            case "TesSecurityStatus" -> Optional.of(tesSecurityStatus);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof SecMassStatGrpCompEntry message)) {
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
        if (!(other instanceof SecMassStatGrpCompEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
