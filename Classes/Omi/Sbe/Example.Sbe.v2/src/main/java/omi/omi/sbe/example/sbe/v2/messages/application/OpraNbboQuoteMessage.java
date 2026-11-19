package omi.omi.sbe.example.sbe.v2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.omi.sbe.example.sbe.v2.fields.AskPrice2Field;
import omi.omi.sbe.example.sbe.v2.fields.AskPriceField;
import omi.omi.sbe.example.sbe.v2.fields.AskSize2Field;
import omi.omi.sbe.example.sbe.v2.fields.AskSizeField;
import omi.omi.sbe.example.sbe.v2.fields.BidPrice2Field;
import omi.omi.sbe.example.sbe.v2.fields.BidPriceField;
import omi.omi.sbe.example.sbe.v2.fields.BidSize2Field;
import omi.omi.sbe.example.sbe.v2.fields.BidSizeField;
import omi.omi.sbe.example.sbe.v2.fields.InstrumentIdField;
import omi.omi.sbe.example.sbe.v2.fields.TimestampField;
import omi.omi.sbe.example.sbe.v2.fields.UnderlyingAskField;
import omi.omi.sbe.example.sbe.v2.fields.UnderlyingBidField;
import omi.omi.sbe.example.sbe.v2.fields.UnderlyingLastPriceField;
import omi.omi.sbe.example.sbe.v2.fields.UnderlyingLastTimestampField;
import omi.omi.sbe.example.sbe.v2.structs.OptionKey;
import omi.omi.sbe.example.sbe.v2.types.Field;
import omi.omi.sbe.example.sbe.v2.types.Message;
import omi.omi.sbe.example.sbe.v2.types.PrintOptions;

/**
 * Represents the OpraNbboQuoteMessage message from the Example protocol.
 *
 * <p>OpraNbboQuoteMessage</p>
 */
public final class OpraNbboQuoteMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 134;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Opra Nbbo Quote Message";

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * bidPrice
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * askPrice
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * bidSize
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * askSize
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * bidPrice2
     */
    private final BidPrice2Field bidPrice2 = new BidPrice2Field();

    /**
     * askPrice2
     */
    private final AskPrice2Field askPrice2 = new AskPrice2Field();

    /**
     * bidSize2
     */
    private final BidSize2Field bidSize2 = new BidSize2Field();

    /**
     * askSize2
     */
    private final AskSize2Field askSize2 = new AskSize2Field();

    /**
     * underlyingBid
     */
    private final UnderlyingBidField underlyingBid = new UnderlyingBidField();

    /**
     * underlyingAsk
     */
    private final UnderlyingAskField underlyingAsk = new UnderlyingAskField();

    /**
     * underlyingLastPrice
     */
    private final UnderlyingLastPriceField underlyingLastPrice = new UnderlyingLastPriceField();

    /**
     * underlyingLastTimestamp
     */
    private final UnderlyingLastTimestampField underlyingLastTimestamp = new UnderlyingLastTimestampField();

    /**
     * OpraNbboQuoteMessage
     */
    private final OptionKey optionKey = new OptionKey();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(instrumentId), optionKey.fields(), List.<Field>of(timestampField), List.<Field>of(bidPrice), List.<Field>of(askPrice), List.<Field>of(bidSize), List.<Field>of(askSize), List.<Field>of(bidPrice2), List.<Field>of(askPrice2), List.<Field>of(bidSize2), List.<Field>of(askSize2), List.<Field>of(underlyingBid), List.<Field>of(underlyingAsk), List.<Field>of(underlyingLastPrice), List.<Field>of(underlyingLastTimestamp)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * instrumentId
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * timestamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * bidPrice
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * askPrice
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * bidSize
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * askSize
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * bidPrice2
     *
     * @return the BidPrice2 field
     */
    public BidPrice2Field bidPrice2() {
        return bidPrice2;
    }

    /**
     * askPrice2
     *
     * @return the AskPrice2 field
     */
    public AskPrice2Field askPrice2() {
        return askPrice2;
    }

    /**
     * bidSize2
     *
     * @return the BidSize2 field
     */
    public BidSize2Field bidSize2() {
        return bidSize2;
    }

    /**
     * askSize2
     *
     * @return the AskSize2 field
     */
    public AskSize2Field askSize2() {
        return askSize2;
    }

    /**
     * underlyingBid
     *
     * @return the UnderlyingBid field
     */
    public UnderlyingBidField underlyingBid() {
        return underlyingBid;
    }

    /**
     * underlyingAsk
     *
     * @return the UnderlyingAsk field
     */
    public UnderlyingAskField underlyingAsk() {
        return underlyingAsk;
    }

    /**
     * underlyingLastPrice
     *
     * @return the UnderlyingLastPrice field
     */
    public UnderlyingLastPriceField underlyingLastPrice() {
        return underlyingLastPrice;
    }

    /**
     * underlyingLastTimestamp
     *
     * @return the UnderlyingLastTimestamp field
     */
    public UnderlyingLastTimestampField underlyingLastTimestamp() {
        return underlyingLastTimestamp;
    }

    /**
     * OpraNbboQuoteMessage
     *
     * @return the OptionKey record
     */
    public OptionKey optionKey() {
        return optionKey;
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
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!optionKey.parseFrom(data, cursor, end - 88)) {
            return false;
        }
        cursor += optionKey.byteLength();
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        if (!bidPrice2.parse(data, cursor)) {
            return false;
        }
        cursor += BidPrice2Field.BYTE_LENGTH;
        if (!askPrice2.parse(data, cursor)) {
            return false;
        }
        cursor += AskPrice2Field.BYTE_LENGTH;
        if (!bidSize2.parse(data, cursor)) {
            return false;
        }
        cursor += BidSize2Field.BYTE_LENGTH;
        if (!askSize2.parse(data, cursor)) {
            return false;
        }
        cursor += AskSize2Field.BYTE_LENGTH;
        if (!underlyingBid.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingBidField.BYTE_LENGTH;
        if (!underlyingAsk.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingAskField.BYTE_LENGTH;
        if (!underlyingLastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingLastPriceField.BYTE_LENGTH;
        return underlyingLastTimestamp.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = optionKey.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = bidPrice2.encode(data, cursor);
        cursor = askPrice2.encode(data, cursor);
        cursor = bidSize2.encode(data, cursor);
        cursor = askSize2.encode(data, cursor);
        cursor = underlyingBid.encode(data, cursor);
        cursor = underlyingAsk.encode(data, cursor);
        cursor = underlyingLastPrice.encode(data, cursor);
        cursor = underlyingLastTimestamp.encode(data, cursor);
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
        optionKey.clear();
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "Timestamp" -> Optional.of(timestampField);
            case "BidPrice" -> Optional.of(bidPrice);
            case "AskPrice" -> Optional.of(askPrice);
            case "BidSize" -> Optional.of(bidSize);
            case "AskSize" -> Optional.of(askSize);
            case "BidPrice2" -> Optional.of(bidPrice2);
            case "AskPrice2" -> Optional.of(askPrice2);
            case "BidSize2" -> Optional.of(bidSize2);
            case "AskSize2" -> Optional.of(askSize2);
            case "UnderlyingBid" -> Optional.of(underlyingBid);
            case "UnderlyingAsk" -> Optional.of(underlyingAsk);
            case "UnderlyingLastPrice" -> Optional.of(underlyingLastPrice);
            case "UnderlyingLastTimestamp" -> Optional.of(underlyingLastTimestamp);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OpraNbboQuoteMessage message)) {
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
        if (!(other instanceof OpraNbboQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
