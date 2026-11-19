package omi.omi.sbe.example.sbe.v2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.omi.sbe.example.sbe.v2.fields.AskPriceField;
import omi.omi.sbe.example.sbe.v2.fields.AskSizeField;
import omi.omi.sbe.example.sbe.v2.fields.BidPriceField;
import omi.omi.sbe.example.sbe.v2.fields.BidSizeField;
import omi.omi.sbe.example.sbe.v2.fields.CaptureTimestampField;
import omi.omi.sbe.example.sbe.v2.fields.ExchangeIdField;
import omi.omi.sbe.example.sbe.v2.fields.InstrumentIdField;
import omi.omi.sbe.example.sbe.v2.fields.SourceTimestampField;
import omi.omi.sbe.example.sbe.v2.fields.SymbolField;
import omi.omi.sbe.example.sbe.v2.types.Field;
import omi.omi.sbe.example.sbe.v2.types.Message;
import omi.omi.sbe.example.sbe.v2.types.PrintOptions;

/**
 * Represents the EquityNbboQuoteMessage message from the Example protocol.
 *
 * <p>EquityNbboQuoteMessage</p>
 */
public final class EquityNbboQuoteMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 64;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Equity Nbbo Quote Message";

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * exchangeId
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * captureTimestamp
     */
    private final CaptureTimestampField captureTimestamp = new CaptureTimestampField();

    /**
     * sourceTimestamp
     */
    private final SourceTimestampField sourceTimestamp = new SourceTimestampField();

    /**
     * bidPrice
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * bidSize
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * askPrice
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * askSize
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, exchangeId, symbol, captureTimestamp, sourceTimestamp, bidPrice, bidSize, askPrice, askSize);

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
     * exchangeId
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * captureTimestamp
     *
     * @return the CaptureTimestamp field
     */
    public CaptureTimestampField captureTimestamp() {
        return captureTimestamp;
    }

    /**
     * sourceTimestamp
     *
     * @return the SourceTimestamp field
     */
    public SourceTimestampField sourceTimestamp() {
        return sourceTimestamp;
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
     * bidSize
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
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
     * askSize
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!captureTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += CaptureTimestampField.BYTE_LENGTH;
        if (!sourceTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimestampField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        return askSize.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = exchangeId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = captureTimestamp.encode(data, cursor);
        cursor = sourceTimestamp.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "ExchangeId" -> Optional.of(exchangeId);
            case "Symbol" -> Optional.of(symbol);
            case "CaptureTimestamp" -> Optional.of(captureTimestamp);
            case "SourceTimestamp" -> Optional.of(sourceTimestamp);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidSize" -> Optional.of(bidSize);
            case "AskPrice" -> Optional.of(askPrice);
            case "AskSize" -> Optional.of(askSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EquityNbboQuoteMessage message)) {
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
        if (!(other instanceof EquityNbboQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
