package omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.AuctionTypeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.DeletionTypeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ExchangeIdField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ImprovementOrderSideField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ImprovementPhaseSequentialNumberField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.OrderSequenceNumberField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.structs.InstrumentDescription;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Field;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Message;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.PrintOptions;

/**
 * Represents the InitialAndImprovementOrderMessage message from the SolaMulticast protocol.
 *
 * <p>Initial and Improvement Order (Options) / Exposed Order</p>
 */
public final class InitialAndImprovementOrderMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Initial And Improvement Order Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 1 };

    /**
     * Q by default
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Deletion Type
     */
    private final DeletionTypeField deletionType = new DeletionTypeField();

    /**
     * Allocated by the Central trading engine at each valid order entry
     */
    private final OrderSequenceNumberField orderSequenceNumber = new OrderSequenceNumberField();

    /**
     * Side
     */
    private final ImprovementOrderSideField improvementOrderSide = new ImprovementOrderSideField();

    /**
     * Indicates the number of an Improvement Phase. Sequential number unique per Instrument and per trading day
     */
    private final ImprovementPhaseSequentialNumberField improvementPhaseSequentialNumber = new ImprovementPhaseSequentialNumberField();

    /**
     * Indicating the auction type
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Instrument Description
     */
    private final InstrumentDescription instrumentDescription = new InstrumentDescription();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(exchangeId), instrumentDescription.fields(), List.<Field>of(deletionType), List.<Field>of(orderSequenceNumber), List.<Field>of(improvementOrderSide), List.<Field>of(improvementPhaseSequentialNumber), List.<Field>of(auctionType)).flatMap(List::stream).toList();

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
     * Deletion Type
     *
     * @return the DeletionType field
     */
    public DeletionTypeField deletionType() {
        return deletionType;
    }

    /**
     * Allocated by the Central trading engine at each valid order entry
     *
     * @return the OrderSequenceNumber field
     */
    public OrderSequenceNumberField orderSequenceNumber() {
        return orderSequenceNumber;
    }

    /**
     * Side
     *
     * @return the ImprovementOrderSide field
     */
    public ImprovementOrderSideField improvementOrderSide() {
        return improvementOrderSide;
    }

    /**
     * Indicates the number of an Improvement Phase. Sequential number unique per Instrument and per trading day
     *
     * @return the ImprovementPhaseSequentialNumber field
     */
    public ImprovementPhaseSequentialNumberField improvementPhaseSequentialNumber() {
        return improvementPhaseSequentialNumber;
    }

    /**
     * Indicating the auction type
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Instrument Description
     *
     * @return the InstrumentDescription record
     */
    public InstrumentDescription instrumentDescription() {
        return instrumentDescription;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!instrumentDescription.parseFrom(data, cursor, end - 15)) {
            return false;
        }
        cursor += instrumentDescription.byteLength();
        if (!deletionType.parse(data, cursor)) {
            return false;
        }
        cursor += DeletionTypeField.BYTE_LENGTH;
        if (!orderSequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderSequenceNumberField.BYTE_LENGTH;
        if (!improvementOrderSide.parse(data, cursor)) {
            return false;
        }
        cursor += ImprovementOrderSideField.BYTE_LENGTH;
        if (!improvementPhaseSequentialNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ImprovementPhaseSequentialNumberField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = instrumentDescription.encode(data, cursor);
        cursor = deletionType.encode(data, cursor);
        cursor = orderSequenceNumber.encode(data, cursor);
        cursor = improvementOrderSide.encode(data, cursor);
        cursor = improvementPhaseSequentialNumber.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
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
        instrumentDescription.clear();
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
            case "DeletionType" -> Optional.of(deletionType);
            case "OrderSequenceNumber" -> Optional.of(orderSequenceNumber);
            case "ImprovementOrderSide" -> Optional.of(improvementOrderSide);
            case "ImprovementPhaseSequentialNumber" -> Optional.of(improvementPhaseSequentialNumber);
            case "AuctionType" -> Optional.of(auctionType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InitialAndImprovementOrderMessage message)) {
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
        if (!(other instanceof InitialAndImprovementOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
