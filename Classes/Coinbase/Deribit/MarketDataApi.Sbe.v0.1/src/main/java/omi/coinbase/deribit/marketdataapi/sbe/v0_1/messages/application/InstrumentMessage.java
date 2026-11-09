package omi.coinbase.deribit.marketdataapi.sbe.v0_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.BaseCurrencyField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.BaseIncrementField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.CreationTimeField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.ExpiryTimeField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.FlagsField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.InstrumentIdField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.LargeTickSize0Field;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.LargeTickSize1Field;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.LargeTickThreshold0Field;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.LargeTickThreshold1Field;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.NameField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.QuantityExponentField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.QuoteCurrencyField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.StatusField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.StrikePriceField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.SymbolField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.TickSizeField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.TypeField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.structs.LogicalExpiry;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.types.Field;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.types.Message;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.types.PrintOptions;

/**
 * Represents the InstrumentMessage message from the MarketDataApi protocol.
 *
 * <p>InstrumentMessage</p>
 */
public final class InstrumentMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 303;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * name
     */
    private final NameField nameField = new NameField();

    /**
     * baseCurrency
     */
    private final BaseCurrencyField baseCurrency = new BaseCurrencyField();

    /**
     * quoteCurrency
     */
    private final QuoteCurrencyField quoteCurrency = new QuoteCurrencyField();

    /**
     * baseIncrement
     */
    private final BaseIncrementField baseIncrement = new BaseIncrementField();

    /**
     * tickSize
     */
    private final TickSizeField tickSize = new TickSizeField();

    /**
     * strikePrice
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * largeTickSize0
     */
    private final LargeTickSize0Field largeTickSize0 = new LargeTickSize0Field();

    /**
     * largeTickThreshold0
     */
    private final LargeTickThreshold0Field largeTickThreshold0 = new LargeTickThreshold0Field();

    /**
     * largeTickSize1
     */
    private final LargeTickSize1Field largeTickSize1 = new LargeTickSize1Field();

    /**
     * largeTickThreshold1
     */
    private final LargeTickThreshold1Field largeTickThreshold1 = new LargeTickThreshold1Field();

    /**
     * creationTime
     */
    private final CreationTimeField creationTime = new CreationTimeField();

    /**
     * expiryTime
     */
    private final ExpiryTimeField expiryTime = new ExpiryTimeField();

    /**
     * InstrumentFlags bit set
     */
    private final FlagsField flags = new FlagsField();

    /**
     * type
     */
    private final TypeField typeField = new TypeField();

    /**
     * status
     */
    private final StatusField status = new StatusField();

    /**
     * quantityExponent
     */
    private final QuantityExponentField quantityExponent = new QuantityExponentField();

    /**
     * InstrumentMessage
     */
    private final LogicalExpiry logicalExpiry = new LogicalExpiry();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(instrumentId), List.<Field>of(symbol), List.<Field>of(nameField), List.<Field>of(baseCurrency), List.<Field>of(quoteCurrency), List.<Field>of(baseIncrement), List.<Field>of(tickSize), List.<Field>of(strikePrice), List.<Field>of(largeTickSize0), List.<Field>of(largeTickThreshold0), List.<Field>of(largeTickSize1), List.<Field>of(largeTickThreshold1), List.<Field>of(creationTime), List.<Field>of(expiryTime), logicalExpiry.fields(), List.<Field>of(flags), List.<Field>of(typeField), List.<Field>of(status), List.<Field>of(quantityExponent)).flatMap(List::stream).toList();

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
     * symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * name
     *
     * @return the Name field
     */
    public NameField nameField() {
        return nameField;
    }

    /**
     * baseCurrency
     *
     * @return the BaseCurrency field
     */
    public BaseCurrencyField baseCurrency() {
        return baseCurrency;
    }

    /**
     * quoteCurrency
     *
     * @return the QuoteCurrency field
     */
    public QuoteCurrencyField quoteCurrency() {
        return quoteCurrency;
    }

    /**
     * baseIncrement
     *
     * @return the BaseIncrement field
     */
    public BaseIncrementField baseIncrement() {
        return baseIncrement;
    }

    /**
     * tickSize
     *
     * @return the TickSize field
     */
    public TickSizeField tickSize() {
        return tickSize;
    }

    /**
     * strikePrice
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * largeTickSize0
     *
     * @return the LargeTickSize0 field
     */
    public LargeTickSize0Field largeTickSize0() {
        return largeTickSize0;
    }

    /**
     * largeTickThreshold0
     *
     * @return the LargeTickThreshold0 field
     */
    public LargeTickThreshold0Field largeTickThreshold0() {
        return largeTickThreshold0;
    }

    /**
     * largeTickSize1
     *
     * @return the LargeTickSize1 field
     */
    public LargeTickSize1Field largeTickSize1() {
        return largeTickSize1;
    }

    /**
     * largeTickThreshold1
     *
     * @return the LargeTickThreshold1 field
     */
    public LargeTickThreshold1Field largeTickThreshold1() {
        return largeTickThreshold1;
    }

    /**
     * creationTime
     *
     * @return the CreationTime field
     */
    public CreationTimeField creationTime() {
        return creationTime;
    }

    /**
     * expiryTime
     *
     * @return the ExpiryTime field
     */
    public ExpiryTimeField expiryTime() {
        return expiryTime;
    }

    /**
     * InstrumentFlags bit set
     *
     * @return the Flags field
     */
    public FlagsField flags() {
        return flags;
    }

    /**
     * type
     *
     * @return the Type field
     */
    public TypeField typeField() {
        return typeField;
    }

    /**
     * status
     *
     * @return the Status field
     */
    public StatusField status() {
        return status;
    }

    /**
     * quantityExponent
     *
     * @return the QuantityExponent field
     */
    public QuantityExponentField quantityExponent() {
        return quantityExponent;
    }

    /**
     * InstrumentMessage
     *
     * @return the LogicalExpiry record
     */
    public LogicalExpiry logicalExpiry() {
        return logicalExpiry;
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
        return Optional.ofNullable(creationTime.value());
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
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!nameField.parse(data, cursor)) {
            return false;
        }
        cursor += NameField.BYTE_LENGTH;
        if (!baseCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += BaseCurrencyField.BYTE_LENGTH;
        if (!quoteCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteCurrencyField.BYTE_LENGTH;
        if (!baseIncrement.parse(data, cursor)) {
            return false;
        }
        cursor += BaseIncrementField.BYTE_LENGTH;
        if (!tickSize.parse(data, cursor)) {
            return false;
        }
        cursor += TickSizeField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!largeTickSize0.parse(data, cursor)) {
            return false;
        }
        cursor += LargeTickSize0Field.BYTE_LENGTH;
        if (!largeTickThreshold0.parse(data, cursor)) {
            return false;
        }
        cursor += LargeTickThreshold0Field.BYTE_LENGTH;
        if (!largeTickSize1.parse(data, cursor)) {
            return false;
        }
        cursor += LargeTickSize1Field.BYTE_LENGTH;
        if (!largeTickThreshold1.parse(data, cursor)) {
            return false;
        }
        cursor += LargeTickThreshold1Field.BYTE_LENGTH;
        if (!creationTime.parse(data, cursor)) {
            return false;
        }
        cursor += CreationTimeField.BYTE_LENGTH;
        if (!expiryTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryTimeField.BYTE_LENGTH;
        if (!logicalExpiry.parseFrom(data, cursor, end - 7)) {
            return false;
        }
        cursor += logicalExpiry.byteLength();
        if (!flags.parse(data, cursor)) {
            return false;
        }
        cursor += FlagsField.BYTE_LENGTH;
        if (!typeField.parse(data, cursor)) {
            return false;
        }
        cursor += TypeField.BYTE_LENGTH;
        if (!status.parse(data, cursor)) {
            return false;
        }
        cursor += StatusField.BYTE_LENGTH;
        if (!quantityExponent.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityExponentField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = nameField.encode(data, cursor);
        cursor = baseCurrency.encode(data, cursor);
        cursor = quoteCurrency.encode(data, cursor);
        cursor = baseIncrement.encode(data, cursor);
        cursor = tickSize.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = largeTickSize0.encode(data, cursor);
        cursor = largeTickThreshold0.encode(data, cursor);
        cursor = largeTickSize1.encode(data, cursor);
        cursor = largeTickThreshold1.encode(data, cursor);
        cursor = creationTime.encode(data, cursor);
        cursor = expiryTime.encode(data, cursor);
        cursor = logicalExpiry.encode(data, cursor);
        cursor = flags.encode(data, cursor);
        cursor = typeField.encode(data, cursor);
        cursor = status.encode(data, cursor);
        cursor = quantityExponent.encode(data, cursor);
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
        logicalExpiry.clear();
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
            case "Symbol" -> Optional.of(symbol);
            case "Name" -> Optional.of(nameField);
            case "BaseCurrency" -> Optional.of(baseCurrency);
            case "QuoteCurrency" -> Optional.of(quoteCurrency);
            case "BaseIncrement" -> Optional.of(baseIncrement);
            case "TickSize" -> Optional.of(tickSize);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "LargeTickSize0" -> Optional.of(largeTickSize0);
            case "LargeTickThreshold0" -> Optional.of(largeTickThreshold0);
            case "LargeTickSize1" -> Optional.of(largeTickSize1);
            case "LargeTickThreshold1" -> Optional.of(largeTickThreshold1);
            case "CreationTime" -> Optional.of(creationTime);
            case "ExpiryTime" -> Optional.of(expiryTime);
            case "Flags" -> Optional.of(flags);
            case "Type" -> Optional.of(typeField);
            case "Status" -> Optional.of(status);
            case "QuantityExponent" -> Optional.of(quantityExponent);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InstrumentMessage message)) {
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
        if (!(other instanceof InstrumentMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
