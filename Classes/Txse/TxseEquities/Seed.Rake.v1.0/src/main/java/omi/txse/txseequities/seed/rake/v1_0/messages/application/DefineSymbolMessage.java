package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.txse.txseequities.seed.rake.v1_0.fields.DefineSymbolBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ListingMarketField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LotSizeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MatchingEngineIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SuffixField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SymbolField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SymbolIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the DefineSymbolMessage message from the Seed protocol.
 *
 * <p>Symbol definition containing instrument details and trading parameters. A DefineSymbol will be followed by a SymbolStatus message establishing the initial trading state for the symbol. Clients must treat a symbol as operationally HALTED while awaiting the accompanying SymbolStatus.</p>
 */
public final class DefineSymbolMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 's';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 32;

    /**
     * This message takes the rest of the bytes it is given, so where those bytes end is its own end.
     */
    public static final boolean RUNS_TO_END = true;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Define Symbol Message";

    /**
     * Transaction time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Symbol identifier.
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Security identifier root represented in CMS format.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Security identifier suffix represented in CMS format.
     */
    private final SuffixField suffix = new SuffixField();

    /**
     * The matching engine to which this symbol is assigned for the trading session.
     */
    private final MatchingEngineIdField matchingEngineId = new MatchingEngineIdField();

    /**
     * Bitfield used in DefineSymbol message.
     */
    private final DefineSymbolBitFieldsField defineSymbolBitFields = new DefineSymbolBitFieldsField();

    /**
     * The number of shares constituting one round lot.
     */
    private final LotSizeField lotSize = new LotSizeField();

    /**
     * Enum ListingMarket. Added in 0.20.draft; absent in pre-0.20 senders, so it is a length-tolerant trailing field - present only when the frame extends past lotSize.
     */
    private final ListingMarketField listingMarket = new ListingMarketField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, symbolId, symbol, suffix, matchingEngineId, defineSymbolBitFields, lotSize, listingMarket);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Transaction time.
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Symbol identifier.
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Security identifier root represented in CMS format.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Security identifier suffix represented in CMS format.
     *
     * @return the Suffix field
     */
    public SuffixField suffix() {
        return suffix;
    }

    /**
     * The matching engine to which this symbol is assigned for the trading session.
     *
     * @return the MatchingEngineId field
     */
    public MatchingEngineIdField matchingEngineId() {
        return matchingEngineId;
    }

    /**
     * Bitfield used in DefineSymbol message.
     *
     * @return the DefineSymbolBitFields field
     */
    public DefineSymbolBitFieldsField defineSymbolBitFields() {
        return defineSymbolBitFields;
    }

    /**
     * The number of shares constituting one round lot.
     *
     * @return the LotSize field
     */
    public LotSizeField lotSize() {
        return lotSize;
    }

    /**
     * Enum ListingMarket. Added in 0.20.draft; absent in pre-0.20 senders, so it is a length-tolerant trailing field - present only when the frame extends past lotSize.
     *
     * @return the ListingMarket field
     */
    public ListingMarketField listingMarket() {
        return listingMarket;
    }

    /**
     * Returns whether the fields before the ListingMarket put it on the wire.
     *
     * <p>The ListingMarket is sent while its bytes remain, which only a decode can tell, so it is on the wire when it holds a value.</p>
     *
     * @return true when the ListingMarket is on the wire
     */
    public boolean listingMarketPresent() {
        return listingMarket.hasValue();
    }

    private boolean onWire(Field field) {
        return (field != listingMarket || listingMarketPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (listingMarketPresent() ? ListingMarketField.BYTE_LENGTH : 0);
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
        cursor += 8;
        cursor += 2;
        cursor += 8;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        if (listingMarketPresent()) {
            cursor += 1;
        }
        return cursor;
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!suffix.parse(data, cursor)) {
            return false;
        }
        cursor += SuffixField.BYTE_LENGTH;
        if (!matchingEngineId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchingEngineIdField.BYTE_LENGTH;
        if (!defineSymbolBitFields.parse(data, cursor)) {
            return false;
        }
        cursor += DefineSymbolBitFieldsField.BYTE_LENGTH;
        if (!lotSize.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeField.BYTE_LENGTH;
        if (end - cursor > 0) {
            if (end - cursor < ListingMarketField.BYTE_LENGTH || !listingMarket.parse(data, cursor)) {
                return false;
            }
            cursor += ListingMarketField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = suffix.encode(data, cursor);
        cursor = matchingEngineId.encode(data, cursor);
        cursor = defineSymbolBitFields.encode(data, cursor);
        cursor = lotSize.encode(data, cursor);
        if (listingMarketPresent()) {
            cursor = listingMarket.encode(data, cursor);
        }
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
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields()) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields()) {
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
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "TransactTime" -> Optional.of(transactTime);
            case "SymbolId" -> Optional.of(symbolId);
            case "Symbol" -> Optional.of(symbol);
            case "Suffix" -> Optional.of(suffix);
            case "MatchingEngineId" -> Optional.of(matchingEngineId);
            case "DefineSymbolBitFields" -> Optional.of(defineSymbolBitFields);
            case "LotSize" -> Optional.of(lotSize);
            case "ListingMarket" -> Optional.of(listingMarket);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DefineSymbolMessage message)) {
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
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
        if (!(other instanceof DefineSymbolMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
