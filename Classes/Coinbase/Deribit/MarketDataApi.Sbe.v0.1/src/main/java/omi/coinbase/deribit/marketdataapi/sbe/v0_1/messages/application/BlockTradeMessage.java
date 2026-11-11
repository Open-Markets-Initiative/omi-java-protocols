package omi.coinbase.deribit.marketdataapi.sbe.v0_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.BlockRfqIdField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.BlockTradeIdField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.FillPriceField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.FillQtyMantissaField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.ImpliedVolatilityField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.IndexPriceField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.InstrumentIdField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.MarkPriceField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.MatchIdField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.NumberOfLegsField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.fields.TakerFlagsField;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.types.Field;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.types.Message;
import omi.coinbase.deribit.marketdataapi.sbe.v0_1.types.PrintOptions;

/**
 * Represents the BlockTradeMessage message from the MarketDataApi protocol.
 *
 * <p>BlockTradeMessage</p>
 */
public final class BlockTradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 78;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Block Trade Message";

    /**
     * matchId
     */
    private final MatchIdField matchId = new MatchIdField();

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * blockTradeId
     */
    private final BlockTradeIdField blockTradeId = new BlockTradeIdField();

    /**
     * blockRfqId
     */
    private final BlockRfqIdField blockRfqId = new BlockRfqIdField();

    /**
     * fillQtyMantissa
     */
    private final FillQtyMantissaField fillQtyMantissa = new FillQtyMantissaField();

    /**
     * fillPrice
     */
    private final FillPriceField fillPrice = new FillPriceField();

    /**
     * markPrice
     */
    private final MarkPriceField markPrice = new MarkPriceField();

    /**
     * indexPrice
     */
    private final IndexPriceField indexPrice = new IndexPriceField();

    /**
     * impliedVolatility
     */
    private final ImpliedVolatilityField impliedVolatility = new ImpliedVolatilityField();

    /**
     * TradeFlags bit set
     */
    private final TakerFlagsField takerFlags = new TakerFlagsField();

    /**
     * numberOfLegs
     */
    private final NumberOfLegsField numberOfLegs = new NumberOfLegsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(matchId, instrumentId, blockTradeId, blockRfqId, fillQtyMantissa, fillPrice, markPrice, indexPrice, impliedVolatility, takerFlags, numberOfLegs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * matchId
     *
     * @return the MatchId field
     */
    public MatchIdField matchId() {
        return matchId;
    }

    /**
     * instrumentId
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * blockTradeId
     *
     * @return the BlockTradeId field
     */
    public BlockTradeIdField blockTradeId() {
        return blockTradeId;
    }

    /**
     * blockRfqId
     *
     * @return the BlockRfqId field
     */
    public BlockRfqIdField blockRfqId() {
        return blockRfqId;
    }

    /**
     * fillQtyMantissa
     *
     * @return the FillQtyMantissa field
     */
    public FillQtyMantissaField fillQtyMantissa() {
        return fillQtyMantissa;
    }

    /**
     * fillPrice
     *
     * @return the FillPrice field
     */
    public FillPriceField fillPrice() {
        return fillPrice;
    }

    /**
     * markPrice
     *
     * @return the MarkPrice field
     */
    public MarkPriceField markPrice() {
        return markPrice;
    }

    /**
     * indexPrice
     *
     * @return the IndexPrice field
     */
    public IndexPriceField indexPrice() {
        return indexPrice;
    }

    /**
     * impliedVolatility
     *
     * @return the ImpliedVolatility field
     */
    public ImpliedVolatilityField impliedVolatility() {
        return impliedVolatility;
    }

    /**
     * TradeFlags bit set
     *
     * @return the TakerFlags field
     */
    public TakerFlagsField takerFlags() {
        return takerFlags;
    }

    /**
     * numberOfLegs
     *
     * @return the NumberOfLegs field
     */
    public NumberOfLegsField numberOfLegs() {
        return numberOfLegs;
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
        if (!matchId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchIdField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!blockTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += BlockTradeIdField.BYTE_LENGTH;
        if (!blockRfqId.parse(data, cursor)) {
            return false;
        }
        cursor += BlockRfqIdField.BYTE_LENGTH;
        if (!fillQtyMantissa.parse(data, cursor)) {
            return false;
        }
        cursor += FillQtyMantissaField.BYTE_LENGTH;
        if (!fillPrice.parse(data, cursor)) {
            return false;
        }
        cursor += FillPriceField.BYTE_LENGTH;
        if (!markPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MarkPriceField.BYTE_LENGTH;
        if (!indexPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IndexPriceField.BYTE_LENGTH;
        if (!impliedVolatility.parse(data, cursor)) {
            return false;
        }
        cursor += ImpliedVolatilityField.BYTE_LENGTH;
        if (!takerFlags.parse(data, cursor)) {
            return false;
        }
        cursor += TakerFlagsField.BYTE_LENGTH;
        return numberOfLegs.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = matchId.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = blockTradeId.encode(data, cursor);
        cursor = blockRfqId.encode(data, cursor);
        cursor = fillQtyMantissa.encode(data, cursor);
        cursor = fillPrice.encode(data, cursor);
        cursor = markPrice.encode(data, cursor);
        cursor = indexPrice.encode(data, cursor);
        cursor = impliedVolatility.encode(data, cursor);
        cursor = takerFlags.encode(data, cursor);
        cursor = numberOfLegs.encode(data, cursor);
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
            case "MatchId" -> Optional.of(matchId);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "BlockTradeId" -> Optional.of(blockTradeId);
            case "BlockRfqId" -> Optional.of(blockRfqId);
            case "FillQtyMantissa" -> Optional.of(fillQtyMantissa);
            case "FillPrice" -> Optional.of(fillPrice);
            case "MarkPrice" -> Optional.of(markPrice);
            case "IndexPrice" -> Optional.of(indexPrice);
            case "ImpliedVolatility" -> Optional.of(impliedVolatility);
            case "TakerFlags" -> Optional.of(takerFlags);
            case "NumberOfLegs" -> Optional.of(numberOfLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BlockTradeMessage message)) {
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
        if (!(other instanceof BlockTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
