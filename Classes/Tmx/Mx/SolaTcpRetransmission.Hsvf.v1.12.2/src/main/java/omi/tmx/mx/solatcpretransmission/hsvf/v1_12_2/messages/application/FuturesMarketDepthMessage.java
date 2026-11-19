package omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.ExchangeIdField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.InstrumentStatusMarkerField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.NumberOfLevelField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.groups.FuturesMarketDepthLevelEntry;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.groups.FuturesMarketDepthLevelList;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.structs.FutureProduct;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.structs.LongMessageHeader;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.Message;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.PrintOptions;

/**
 * Represents the FuturesMarketDepthMessage message from the SolaTcpRetransmission protocol.
 *
 * <p>Futures Market Depth message</p>
 */
public final class FuturesMarketDepthMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Futures Market Depth Message";

    /**
     * Exchange Id
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Instrument Status Marker
     */
    private final InstrumentStatusMarkerField instrumentStatusMarker = new InstrumentStatusMarkerField();

    /**
     * Number Of Level
     */
    private final NumberOfLevelField numberOfLevel = new NumberOfLevelField();

    /**
     * One level of market depth. The guide prints Ask Price as N for futures alone, where every other depth message prints X; read as N it could not hold the indicator codes its own description refers to, so it is marked y, an Omi type.
     */
    private final FuturesMarketDepthLevelList futuresMarketDepthLevel = new FuturesMarketDepthLevelList();

    /**
     * The guide states these fields once, as Table 3: Long Message Header, for every message the eight Table 2 frames do not. Sequence Number and Message Type are read by the packet, so they are not repeated here.
     */
    private final LongMessageHeader longMessageHeader = new LongMessageHeader();

    /**
     * The guide states the future product once and every futures message carries it.
     */
    private final FutureProduct futureProduct = new FutureProduct();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(longMessageHeader.fields(), List.<Field>of(exchangeId), futureProduct.fields(), List.<Field>of(instrumentStatusMarker), List.<Field>of(numberOfLevel)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange Id
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Instrument Status Marker
     *
     * @return the InstrumentStatusMarker field
     */
    public InstrumentStatusMarkerField instrumentStatusMarker() {
        return instrumentStatusMarker;
    }

    /**
     * Number Of Level
     *
     * @return the NumberOfLevel field
     */
    public NumberOfLevelField numberOfLevel() {
        return numberOfLevel;
    }

    /**
     * One level of market depth. The guide prints Ask Price as N for futures alone, where every other depth message prints X; read as N it could not hold the indicator codes its own description refers to, so it is marked y, an Omi type.
     *
     * <p>Encode writes this list's size to the NumberOfLevel field.</p>
     *
     * @return the FuturesMarketDepthLevel entries
     */
    public FuturesMarketDepthLevelList futuresMarketDepthLevel() {
        return futuresMarketDepthLevel;
    }

    /**
     * The guide states these fields once, as Table 3: Long Message Header, for every message the eight Table 2 frames do not. Sequence Number and Message Type are read by the packet, so they are not repeated here.
     *
     * @return the LongMessageHeader record
     */
    public LongMessageHeader longMessageHeader() {
        return longMessageHeader;
    }

    /**
     * The guide states the future product once and every futures message carries it.
     *
     * @return the FutureProduct record
     */
    public FutureProduct futureProduct() {
        return futureProduct;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + futuresMarketDepthLevel.byteLength();
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
        if (!longMessageHeader.parseFrom(data, cursor, end - 14)) {
            return false;
        }
        cursor += longMessageHeader.byteLength();
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!futureProduct.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += futureProduct.byteLength();
        if (!instrumentStatusMarker.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentStatusMarkerField.BYTE_LENGTH;
        if (!numberOfLevel.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLevelField.BYTE_LENGTH;
        if (numberOfLevel.value() == null) {
            return false;
        }
        if (!futuresMarketDepthLevel.parse(data, cursor, end, numberOfLevel.value())) {
            return false;
        }
        cursor += futuresMarketDepthLevel.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (futuresMarketDepthLevel.size() > 9) {
            throw new IllegalStateException("futuresMarketDepthLevel holds " + futuresMarketDepthLevel.size() + " entries, more than its count field can state");
        }
        numberOfLevel.value((long) futuresMarketDepthLevel.size());
        int cursor = offset;
        cursor = longMessageHeader.encode(data, cursor);
        cursor = exchangeId.encode(data, cursor);
        cursor = futureProduct.encode(data, cursor);
        cursor = instrumentStatusMarker.encode(data, cursor);
        cursor = numberOfLevel.encode(data, cursor);
        cursor = futuresMarketDepthLevel.encode(data, cursor);
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
        longMessageHeader.clear();
        futureProduct.clear();
        futuresMarketDepthLevel.clear();
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
            if (field != numberOfLevel && !field.isRecognized()) {
                return false;
            }
        }
        return futuresMarketDepthLevel.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfLevel && !field.isValid()) {
                return false;
            }
        }
        if (!futuresMarketDepthLevel.isValid()) {
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
        if (!longMessageHeader.isDecoded()) {
            return longMessageHeader.failedAt();
        }
        if (!exchangeId.isDecoded()) {
            return Optional.of(exchangeId);
        }
        if (!futureProduct.isDecoded()) {
            return futureProduct.failedAt();
        }
        if (!instrumentStatusMarker.isDecoded()) {
            return Optional.of(instrumentStatusMarker);
        }
        if (!numberOfLevel.isDecoded()) {
            return Optional.of(numberOfLevel);
        }
        if (!futuresMarketDepthLevel.isDecoded()) {
            return Optional.of(futuresMarketDepthLevel.failedEntry().flatMap(FuturesMarketDepthLevelEntry::failedAt).orElse(numberOfLevel));
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
            case "InstrumentStatusMarker" -> Optional.of(instrumentStatusMarker);
            case "NumberOfLevel" -> Optional.of(numberOfLevel);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FuturesMarketDepthMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(futuresMarketDepthLevel.diffFields(message.futuresMarketDepthLevel));
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
            futuresMarketDepthLevel.toFormattedString(builder, options);
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
        futuresMarketDepthLevel.toFormattedString(builder, nested);
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
        if (!(other instanceof FuturesMarketDepthMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && futuresMarketDepthLevel.equals(message.futuresMarketDepthLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, futuresMarketDepthLevel);
    }
}
