package omi.coinbase.deribit.marketdataapi.sbe.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.fields.ExpiryTimeField;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.fields.FlagsField;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.fields.IndexIdField;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.fields.InstrumentIdField;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.fields.MinOrderQuantityField;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.fields.NameField;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.fields.PriceAssetField;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.fields.QuantityAssetField;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.fields.QuantityExponentField;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.fields.StatusField;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.fields.StrikePriceField;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.fields.TickSizeField;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.fields.TypeField;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.fields.UnderlyingField;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.structs.InstrumentDefinitionMessageLargeTickSizesGroups;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.structs.InstrumentDefinitionMessageLegsGroups;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.types.Field;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.types.Message;
import omi.coinbase.deribit.marketdataapi.sbe.v1_0.types.PrintOptions;

/**
 * Represents the InstrumentDefinitionMessage message from the MarketDataApi protocol.
 *
 * <p>InstrumentDefinitionMessage</p>
 */
public final class InstrumentDefinitionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 268;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Definition Message";

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * name
     */
    private final NameField nameField = new NameField();

    /**
     * indexId
     */
    private final IndexIdField indexId = new IndexIdField();

    /**
     * underlying
     */
    private final UnderlyingField underlying = new UnderlyingField();

    /**
     * quantityAsset
     */
    private final QuantityAssetField quantityAsset = new QuantityAssetField();

    /**
     * priceAsset
     */
    private final PriceAssetField priceAsset = new PriceAssetField();

    /**
     * expiryTime
     */
    private final ExpiryTimeField expiryTime = new ExpiryTimeField();

    /**
     * strikePrice
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * minOrderQuantity
     */
    private final MinOrderQuantityField minOrderQuantity = new MinOrderQuantityField();

    /**
     * tickSize
     */
    private final TickSizeField tickSize = new TickSizeField();

    /**
     * quantityExponent
     */
    private final QuantityExponentField quantityExponent = new QuantityExponentField();

    /**
     * type
     */
    private final TypeField typeField = new TypeField();

    /**
     * InstrumentFlags bit set
     */
    private final FlagsField flags = new FlagsField();

    /**
     * status
     */
    private final StatusField status = new StatusField();

    /**
     * largeTickSizes Block
     */
    private final InstrumentDefinitionMessageLargeTickSizesGroups instrumentDefinitionMessageLargeTickSizesGroups = new InstrumentDefinitionMessageLargeTickSizesGroups();

    /**
     * legs Block
     */
    private final InstrumentDefinitionMessageLegsGroups instrumentDefinitionMessageLegsGroups = new InstrumentDefinitionMessageLegsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, nameField, indexId, underlying, quantityAsset, priceAsset, expiryTime, strikePrice, minOrderQuantity, tickSize, quantityExponent, typeField, flags, status);

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
     * name
     *
     * @return the Name field
     */
    public NameField nameField() {
        return nameField;
    }

    /**
     * indexId
     *
     * @return the IndexId field
     */
    public IndexIdField indexId() {
        return indexId;
    }

    /**
     * underlying
     *
     * @return the Underlying field
     */
    public UnderlyingField underlying() {
        return underlying;
    }

    /**
     * quantityAsset
     *
     * @return the QuantityAsset field
     */
    public QuantityAssetField quantityAsset() {
        return quantityAsset;
    }

    /**
     * priceAsset
     *
     * @return the PriceAsset field
     */
    public PriceAssetField priceAsset() {
        return priceAsset;
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
     * strikePrice
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * minOrderQuantity
     *
     * @return the MinOrderQuantity field
     */
    public MinOrderQuantityField minOrderQuantity() {
        return minOrderQuantity;
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
     * quantityExponent
     *
     * @return the QuantityExponent field
     */
    public QuantityExponentField quantityExponent() {
        return quantityExponent;
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
     * InstrumentFlags bit set
     *
     * @return the Flags field
     */
    public FlagsField flags() {
        return flags;
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
     * largeTickSizes Block
     *
     * @return the InstrumentDefinitionMessageLargeTickSizesGroups record
     */
    public InstrumentDefinitionMessageLargeTickSizesGroups instrumentDefinitionMessageLargeTickSizesGroups() {
        return instrumentDefinitionMessageLargeTickSizesGroups;
    }

    /**
     * legs Block
     *
     * @return the InstrumentDefinitionMessageLegsGroups record
     */
    public InstrumentDefinitionMessageLegsGroups instrumentDefinitionMessageLegsGroups() {
        return instrumentDefinitionMessageLegsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + instrumentDefinitionMessageLargeTickSizesGroups.byteLength() - InstrumentDefinitionMessageLargeTickSizesGroups.MINIMUM_BYTE_LENGTH + instrumentDefinitionMessageLegsGroups.byteLength() - InstrumentDefinitionMessageLegsGroups.MINIMUM_BYTE_LENGTH;
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
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!nameField.parse(data, cursor)) {
            return false;
        }
        cursor += NameField.BYTE_LENGTH;
        if (!indexId.parse(data, cursor)) {
            return false;
        }
        cursor += IndexIdField.BYTE_LENGTH;
        if (!underlying.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingField.BYTE_LENGTH;
        if (!quantityAsset.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityAssetField.BYTE_LENGTH;
        if (!priceAsset.parse(data, cursor)) {
            return false;
        }
        cursor += PriceAssetField.BYTE_LENGTH;
        if (!expiryTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryTimeField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!minOrderQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += MinOrderQuantityField.BYTE_LENGTH;
        if (!tickSize.parse(data, cursor)) {
            return false;
        }
        cursor += TickSizeField.BYTE_LENGTH;
        if (!quantityExponent.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityExponentField.BYTE_LENGTH;
        if (!typeField.parse(data, cursor)) {
            return false;
        }
        cursor += TypeField.BYTE_LENGTH;
        if (!flags.parse(data, cursor)) {
            return false;
        }
        cursor += FlagsField.BYTE_LENGTH;
        if (!status.parse(data, cursor)) {
            return false;
        }
        cursor += StatusField.BYTE_LENGTH;
        if (!instrumentDefinitionMessageLargeTickSizesGroups.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += instrumentDefinitionMessageLargeTickSizesGroups.byteLength();
        if (end - cursor < 4) {
            return false;
        }
        if (!instrumentDefinitionMessageLegsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += instrumentDefinitionMessageLegsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = nameField.encode(data, cursor);
        cursor = indexId.encode(data, cursor);
        cursor = underlying.encode(data, cursor);
        cursor = quantityAsset.encode(data, cursor);
        cursor = priceAsset.encode(data, cursor);
        cursor = expiryTime.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = minOrderQuantity.encode(data, cursor);
        cursor = tickSize.encode(data, cursor);
        cursor = quantityExponent.encode(data, cursor);
        cursor = typeField.encode(data, cursor);
        cursor = flags.encode(data, cursor);
        cursor = status.encode(data, cursor);
        cursor = instrumentDefinitionMessageLargeTickSizesGroups.encode(data, cursor);
        cursor = instrumentDefinitionMessageLegsGroups.encode(data, cursor);
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
        instrumentDefinitionMessageLargeTickSizesGroups.clear();
        instrumentDefinitionMessageLegsGroups.clear();
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        if (!instrumentDefinitionMessageLargeTickSizesGroups.isRecognized()) {
            return false;
        }
        return instrumentDefinitionMessageLegsGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!instrumentDefinitionMessageLargeTickSizesGroups.isValid()) {
            return false;
        }
        if (!instrumentDefinitionMessageLegsGroups.isValid()) {
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
        if (!instrumentId.isDecoded()) {
            return Optional.of(instrumentId);
        }
        if (!nameField.isDecoded()) {
            return Optional.of(nameField);
        }
        if (!indexId.isDecoded()) {
            return Optional.of(indexId);
        }
        if (!underlying.isDecoded()) {
            return Optional.of(underlying);
        }
        if (!quantityAsset.isDecoded()) {
            return Optional.of(quantityAsset);
        }
        if (!priceAsset.isDecoded()) {
            return Optional.of(priceAsset);
        }
        if (!expiryTime.isDecoded()) {
            return Optional.of(expiryTime);
        }
        if (!strikePrice.isDecoded()) {
            return Optional.of(strikePrice);
        }
        if (!minOrderQuantity.isDecoded()) {
            return Optional.of(minOrderQuantity);
        }
        if (!tickSize.isDecoded()) {
            return Optional.of(tickSize);
        }
        if (!quantityExponent.isDecoded()) {
            return Optional.of(quantityExponent);
        }
        if (!typeField.isDecoded()) {
            return Optional.of(typeField);
        }
        if (!flags.isDecoded()) {
            return Optional.of(flags);
        }
        if (!status.isDecoded()) {
            return Optional.of(status);
        }
        if (!instrumentDefinitionMessageLargeTickSizesGroups.isDecoded()) {
            return instrumentDefinitionMessageLargeTickSizesGroups.failedAt();
        }
        if (!instrumentDefinitionMessageLegsGroups.isDecoded()) {
            return instrumentDefinitionMessageLegsGroups.failedAt();
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
            case "Name" -> Optional.of(nameField);
            case "IndexId" -> Optional.of(indexId);
            case "Underlying" -> Optional.of(underlying);
            case "QuantityAsset" -> Optional.of(quantityAsset);
            case "PriceAsset" -> Optional.of(priceAsset);
            case "ExpiryTime" -> Optional.of(expiryTime);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "MinOrderQuantity" -> Optional.of(minOrderQuantity);
            case "TickSize" -> Optional.of(tickSize);
            case "QuantityExponent" -> Optional.of(quantityExponent);
            case "Type" -> Optional.of(typeField);
            case "Flags" -> Optional.of(flags);
            case "Status" -> Optional.of(status);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InstrumentDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(instrumentDefinitionMessageLargeTickSizesGroups.diffFields(message.instrumentDefinitionMessageLargeTickSizesGroups));
        changed.addAll(instrumentDefinitionMessageLegsGroups.diffFields(message.instrumentDefinitionMessageLegsGroups));
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
            instrumentDefinitionMessageLargeTickSizesGroups.toFormattedString(builder, options);
            builder.append(", ");
            instrumentDefinitionMessageLegsGroups.toFormattedString(builder, options);
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
        instrumentDefinitionMessageLargeTickSizesGroups.toFormattedString(builder, nested);
        instrumentDefinitionMessageLegsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof InstrumentDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && instrumentDefinitionMessageLargeTickSizesGroups.equals(message.instrumentDefinitionMessageLargeTickSizesGroups) && instrumentDefinitionMessageLegsGroups.equals(message.instrumentDefinitionMessageLegsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, instrumentDefinitionMessageLargeTickSizesGroups, instrumentDefinitionMessageLegsGroups);
    }
}
