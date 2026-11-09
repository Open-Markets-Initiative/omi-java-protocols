package omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.branches.FutureBlock;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.ContractSizeField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.ExpirationDateField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.FuturesFlagsField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.LegCountField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.LegOffsetField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.ListingStateField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.PriceIncrementField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.ReportSymbolField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.SymbolField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.TimeOffsetField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.UnitTimestampField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.VarianceBlockOffsetField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.Field;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.Message;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.PrintOptions;

/**
 * Represents the FuturesInstrumentDefinitionMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>The Unit Clear message instructs feed recipients to clear all orders for the Cboe book in the unit specified in the Sequenced Unit Header. This message will be sent at startup each day.</p>
 */
public final class FuturesInstrumentDefinitionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Futures Instrument Definition Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Six character, base 62 symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Unit timestamp expressed as number of whole seconds since the Epoch (Midnight, January 1, 1970 UTC).
     */
    private final UnitTimestampField unitTimestamp = new UnitTimestampField();

    /**
     * Symbol for product or underlying security.
     */
    private final ReportSymbolField reportSymbol = new ReportSymbolField();

    /**
     * Bit 0 – Variance (1: Variance Future, 0: Standard Future)
     */
    private final FuturesFlagsField futuresFlags = new FuturesFlagsField();

    /**
     * Expiration Date of Instrument.
     */
    private final ExpirationDateField expirationDate = new ExpirationDateField();

    /**
     * Contract size of Instrument.
     */
    private final ContractSizeField contractSize = new ContractSizeField();

    /**
     * A = Active , I = Inactive, T = Test
     */
    private final ListingStateField listingState = new ListingStateField();

    /**
     * Minimum Price Increment
     */
    private final PriceIncrementField priceIncrement = new PriceIncrementField();

    /**
     * Values greater than 0 indicate this is a spread instrument.
     */
    private final LegCountField legCount = new LegCountField();

    /**
     * Leg definitions, if any, begin at this offset from the beginning of the message. Possible values are 0 (no legs present) or 41 (spread instrument).
     */
    private final LegOffsetField legOffset = new LegOffsetField();

    /**
     * Variance Future parameter block begins at this offset from the beginning of the message. Possible values are 0 (no Variance Block) or 41 (Variance Block present).
     */
    private final VarianceBlockOffsetField varianceBlockOffset = new VarianceBlockOffsetField();

    /**
     * Branch
     */
    private final FutureBlock futureBlock = new FutureBlock();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, symbol, unitTimestamp, reportSymbol, futuresFlags, expirationDate, contractSize, listingState, priceIncrement, legCount, legOffset, varianceBlockOffset);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Six character, base 62 symbol.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Unit timestamp expressed as number of whole seconds since the Epoch (Midnight, January 1, 1970 UTC).
     *
     * @return the UnitTimestamp field
     */
    public UnitTimestampField unitTimestamp() {
        return unitTimestamp;
    }

    /**
     * Symbol for product or underlying security.
     *
     * @return the ReportSymbol field
     */
    public ReportSymbolField reportSymbol() {
        return reportSymbol;
    }

    /**
     * Bit 0 – Variance (1: Variance Future, 0: Standard Future)
     *
     * @return the FuturesFlags field
     */
    public FuturesFlagsField futuresFlags() {
        return futuresFlags;
    }

    /**
     * Expiration Date of Instrument.
     *
     * @return the ExpirationDate field
     */
    public ExpirationDateField expirationDate() {
        return expirationDate;
    }

    /**
     * Contract size of Instrument.
     *
     * @return the ContractSize field
     */
    public ContractSizeField contractSize() {
        return contractSize;
    }

    /**
     * A = Active , I = Inactive, T = Test
     *
     * @return the ListingState field
     */
    public ListingStateField listingState() {
        return listingState;
    }

    /**
     * Minimum Price Increment
     *
     * @return the PriceIncrement field
     */
    public PriceIncrementField priceIncrement() {
        return priceIncrement;
    }

    /**
     * Values greater than 0 indicate this is a spread instrument.
     *
     * @return the LegCount field
     */
    public LegCountField legCount() {
        return legCount;
    }

    /**
     * Leg definitions, if any, begin at this offset from the beginning of the message. Possible values are 0 (no legs present) or 41 (spread instrument).
     *
     * @return the LegOffset field
     */
    public LegOffsetField legOffset() {
        return legOffset;
    }

    /**
     * Variance Future parameter block begins at this offset from the beginning of the message. Possible values are 0 (no Variance Block) or 41 (Variance Block present).
     *
     * @return the VarianceBlockOffset field
     */
    public VarianceBlockOffsetField varianceBlockOffset() {
        return varianceBlockOffset;
    }

    /**
     * Branch
     *
     * @return the FutureBlock record
     */
    public FutureBlock futureBlock() {
        return futureBlock;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + futureBlock.byteLength() - FutureBlock.MINIMUM_BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 4;
        cursor += 6;
        cursor += 4;
        cursor += 6;
        cursor += 1;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += futureBlock.byteLength();
        return cursor;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!unitTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += UnitTimestampField.BYTE_LENGTH;
        if (!reportSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += ReportSymbolField.BYTE_LENGTH;
        if (!futuresFlags.parse(data, cursor)) {
            return false;
        }
        cursor += FuturesFlagsField.BYTE_LENGTH;
        if (!expirationDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationDateField.BYTE_LENGTH;
        if (!contractSize.parse(data, cursor)) {
            return false;
        }
        cursor += ContractSizeField.BYTE_LENGTH;
        if (!listingState.parse(data, cursor)) {
            return false;
        }
        cursor += ListingStateField.BYTE_LENGTH;
        if (!priceIncrement.parse(data, cursor)) {
            return false;
        }
        cursor += PriceIncrementField.BYTE_LENGTH;
        if (!legCount.parse(data, cursor)) {
            return false;
        }
        cursor += LegCountField.BYTE_LENGTH;
        if (!legOffset.parse(data, cursor)) {
            return false;
        }
        cursor += LegOffsetField.BYTE_LENGTH;
        if (!varianceBlockOffset.parse(data, cursor)) {
            return false;
        }
        cursor += VarianceBlockOffsetField.BYTE_LENGTH;
        if (!futureBlock.parseFrom(futuresFlags, legCount.value(), data, cursor, end)) {
            return false;
        }
        cursor += futureBlock.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        futureBlock.writeKey(futuresFlags);
        OptionalLong futureBlockLegCountInput = futureBlock.legCountInputWritten();
        if (futureBlockLegCountInput.isPresent()) {
            legCount.value((short) futureBlockLegCountInput.getAsLong());
        }
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = unitTimestamp.encode(data, cursor);
        cursor = reportSymbol.encode(data, cursor);
        cursor = futuresFlags.encode(data, cursor);
        cursor = expirationDate.encode(data, cursor);
        cursor = contractSize.encode(data, cursor);
        cursor = listingState.encode(data, cursor);
        cursor = priceIncrement.encode(data, cursor);
        cursor = legCount.encode(data, cursor);
        cursor = legOffset.encode(data, cursor);
        cursor = varianceBlockOffset.encode(data, cursor);
        cursor = futureBlock.encode(data, cursor);
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
        futureBlock.clear();
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
            if (field != futuresFlags && field != legCount && !field.isRecognized()) {
                return false;
            }
        }
        if (!futureBlock.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != futuresFlags && field != legCount && !field.isValid()) {
                return false;
            }
        }
        if (!futureBlock.isValid()) {
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "Symbol" -> Optional.of(symbol);
            case "UnitTimestamp" -> Optional.of(unitTimestamp);
            case "ReportSymbol" -> Optional.of(reportSymbol);
            case "FuturesFlags" -> Optional.of(futuresFlags);
            case "ExpirationDate" -> Optional.of(expirationDate);
            case "ContractSize" -> Optional.of(contractSize);
            case "ListingState" -> Optional.of(listingState);
            case "PriceIncrement" -> Optional.of(priceIncrement);
            case "LegCount" -> Optional.of(legCount);
            case "LegOffset" -> Optional.of(legOffset);
            case "VarianceBlockOffset" -> Optional.of(varianceBlockOffset);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FuturesInstrumentDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(futureBlock.diffFields(message.futureBlock));
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
            builder.append(", ");
            futureBlock.toFormattedString(builder, options);
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
        futureBlock.toFormattedString(builder, nested);
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
        if (!(other instanceof FuturesInstrumentDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && futureBlock.equals(message.futureBlock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, futureBlock);
    }
}
