package omi.eurex.t7.eobi.fbe.v13_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eobi.fbe.v13_0.fields.ImbalanceQtyField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.LastPxField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.LastQtyField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.PotentialSecurityTradingEventField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityIdField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityTradingStatusField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.TransactTimeField;
import omi.eurex.t7.eobi.fbe.v13_0.types.Field;
import omi.eurex.t7.eobi.fbe.v13_0.types.Message;
import omi.eurex.t7.eobi.fbe.v13_0.types.PrintOptions;

/**
 * Represents the AuctionClearingPrice message from the Eobi protocol.
 */
public final class AuctionClearingPrice implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 48;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Clearing Price";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 42, 6 };

    /**
     * Matching-engine transaction time in nanoseconds since Unix epoch
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Unique instrument identifier
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Total executed matched quantity of this match event
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Imbalance Qty
     */
    private final ImbalanceQtyField imbalanceQty = new ImbalanceQtyField();

    /**
     * Security Trading Status
     */
    private final SecurityTradingStatusField securityTradingStatus = new SecurityTradingStatusField();

    /**
     * Potential Security Trading Event
     */
    private final PotentialSecurityTradingEventField potentialSecurityTradingEvent = new PotentialSecurityTradingEventField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, securityId, lastPx, lastQty, imbalanceQty, securityTradingStatus, potentialSecurityTradingEvent);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Matching-engine transaction time in nanoseconds since Unix epoch
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Unique instrument identifier
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Total executed matched quantity of this match event
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * Imbalance Qty
     *
     * @return the ImbalanceQty field
     */
    public ImbalanceQtyField imbalanceQty() {
        return imbalanceQty;
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
     * Potential Security Trading Event
     *
     * @return the PotentialSecurityTradingEvent field
     */
    public PotentialSecurityTradingEventField potentialSecurityTradingEvent() {
        return potentialSecurityTradingEvent;
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
        return Optional.ofNullable(transactTime.value());
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
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!imbalanceQty.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceQtyField.BYTE_LENGTH;
        if (!securityTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingStatusField.BYTE_LENGTH;
        if (!potentialSecurityTradingEvent.parse(data, cursor)) {
            return false;
        }
        cursor += PotentialSecurityTradingEventField.BYTE_LENGTH;
        cursor += 6; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = imbalanceQty.encode(data, cursor);
        cursor = securityTradingStatus.encode(data, cursor);
        cursor = potentialSecurityTradingEvent.encode(data, cursor);
        if (buffer != null && buffer.length >= 42 + 6) {
            System.arraycopy(buffer, 42, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
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
            case "TransactTime" -> Optional.of(transactTime);
            case "SecurityId" -> Optional.of(securityId);
            case "LastPx" -> Optional.of(lastPx);
            case "LastQty" -> Optional.of(lastQty);
            case "ImbalanceQty" -> Optional.of(imbalanceQty);
            case "SecurityTradingStatus" -> Optional.of(securityTradingStatus);
            case "PotentialSecurityTradingEvent" -> Optional.of(potentialSecurityTradingEvent);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AuctionClearingPrice message)) {
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
        if (!(other instanceof AuctionClearingPrice message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
