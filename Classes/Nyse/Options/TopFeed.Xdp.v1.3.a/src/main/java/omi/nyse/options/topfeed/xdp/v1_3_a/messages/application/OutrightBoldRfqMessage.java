package omi.nyse.options.topfeed.xdp.v1_3_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.options.topfeed.xdp.v1_3_a.fields.CapacityField;
import omi.nyse.options.topfeed.xdp.v1_3_a.fields.ContractsField;
import omi.nyse.options.topfeed.xdp.v1_3_a.fields.ParticipantField;
import omi.nyse.options.topfeed.xdp.v1_3_a.fields.PriceField;
import omi.nyse.options.topfeed.xdp.v1_3_a.fields.SeriesIndexField;
import omi.nyse.options.topfeed.xdp.v1_3_a.fields.SideField;
import omi.nyse.options.topfeed.xdp.v1_3_a.fields.SourceNsField;
import omi.nyse.options.topfeed.xdp.v1_3_a.fields.SourceTimeField;
import omi.nyse.options.topfeed.xdp.v1_3_a.fields.SymbolSeqNumField;
import omi.nyse.options.topfeed.xdp.v1_3_a.types.Field;
import omi.nyse.options.topfeed.xdp.v1_3_a.types.Message;
import omi.nyse.options.topfeed.xdp.v1_3_a.types.PrintOptions;

/**
 * Represents the OutrightBoldRfqMessage message from the TopFeed protocol.
 *
 * <p>The Outright BOLD RFQ (Request for Quote) message notifies clients of a special exposure order (a BOLD order) available for execution on a first-come first-served basis.</p>
 */
public final class OutrightBoldRfqMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 28;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Outright Bold Rfq Message";

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * The nanosecond offset from the SourceTime.
     */
    private final SourceNsField sourceNs = new SourceNsField();

    /**
     * The unique ID of the symbol in the Series Index message
     */
    private final SeriesIndexField seriesIndex = new SeriesIndexField();

    /**
     * Sequence number of messages for the outright options symbol.
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * Side of the RFQ
     */
    private final SideField side = new SideField();

    /**
     * Customer or Firm capacity specified with the order.
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * The quantity of the order
     */
    private final ContractsField contracts = new ContractsField();

    /**
     * Price of the trade. Use the Price Scale Code from the symbol index mapping message.symbol index mapping message
     */
    private final PriceField price = new PriceField();

    /**
     * OCC code for the Clearing firm specified with the order.
     */
    private final ParticipantField participant = new ParticipantField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceNs, seriesIndex, symbolSeqNum, side, capacity, contracts, price, participant);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     *
     * @return the SourceTime field
     */
    public SourceTimeField sourceTime() {
        return sourceTime;
    }

    /**
     * The nanosecond offset from the SourceTime.
     *
     * @return the SourceNs field
     */
    public SourceNsField sourceNs() {
        return sourceNs;
    }

    /**
     * The unique ID of the symbol in the Series Index message
     *
     * @return the SeriesIndex field
     */
    public SeriesIndexField seriesIndex() {
        return seriesIndex;
    }

    /**
     * Sequence number of messages for the outright options symbol.
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * Side of the RFQ
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Customer or Firm capacity specified with the order.
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * The quantity of the order
     *
     * @return the Contracts field
     */
    public ContractsField contracts() {
        return contracts;
    }

    /**
     * Price of the trade. Use the Price Scale Code from the symbol index mapping message.symbol index mapping message
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * OCC code for the Clearing firm specified with the order.
     *
     * @return the Participant field
     */
    public ParticipantField participant() {
        return participant;
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
        if (!sourceTime.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeField.BYTE_LENGTH;
        if (!sourceNs.parse(data, cursor)) {
            return false;
        }
        cursor += SourceNsField.BYTE_LENGTH;
        if (!seriesIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SeriesIndexField.BYTE_LENGTH;
        if (!symbolSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolSeqNumField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!contracts.parse(data, cursor)) {
            return false;
        }
        cursor += ContractsField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        return participant.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceTime.encode(data, cursor);
        cursor = sourceNs.encode(data, cursor);
        cursor = seriesIndex.encode(data, cursor);
        cursor = symbolSeqNum.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = contracts.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = participant.encode(data, cursor);
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
            case "SourceTime" -> Optional.of(sourceTime);
            case "SourceNs" -> Optional.of(sourceNs);
            case "SeriesIndex" -> Optional.of(seriesIndex);
            case "SymbolSeqNum" -> Optional.of(symbolSeqNum);
            case "Side" -> Optional.of(side);
            case "Capacity" -> Optional.of(capacity);
            case "Contracts" -> Optional.of(contracts);
            case "Price" -> Optional.of(price);
            case "Participant" -> Optional.of(participant);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OutrightBoldRfqMessage message)) {
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
        if (!(other instanceof OutrightBoldRfqMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
