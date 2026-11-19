package omi.jpx.osederivatives.geniuminet.glimpse.v2_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.BlockLotSizeField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.ExpirationDateField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.FinancialProductField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.LongNameField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.NanosecondsField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.NominalValueField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.NumberOfDecimalsInNominalValueField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.NumberOfDecimalsInPriceField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.NumberOfDecimalsInStrikePriceField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.NumberOfLegsField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.OddLotSizeField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.OrderBookIdField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.PutOrCallField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.RoundLotSizeField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.StrikePriceField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.SymbolField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.TradingCurrencyField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.fields.UnderlyingOrderBookIdField;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.types.Field;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.types.Message;
import omi.jpx.osederivatives.geniuminet.glimpse.v2_2.types.PrintOptions;

/**
 * Represents the SeriesInformationBasicMessage message from the GeniumInet protocol.
 *
 * <p>Provides detailed data about the series that can be traded on a given business day.</p>
 */
public final class SeriesInformationBasicMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 128;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Series Information Basic Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 72, 12 };

    /**
     * A timestamp is set in nanoseconds
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * A series ID is set
     */
    private final OrderBookIdField orderBookId = new OrderBookIdField();

    /**
     * A series name is set
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * A 9-digit code is set
     */
    private final LongNameField longName = new LongNameField();

    /**
     * A product type is set
     */
    private final FinancialProductField financialProduct = new FinancialProductField();

    /**
     * A trading currency is set, fixed at JPY
     */
    private final TradingCurrencyField tradingCurrency = new TradingCurrencyField();

    /**
     * The decimal value for a trading instrument is set
     */
    private final NumberOfDecimalsInPriceField numberOfDecimalsInPrice = new NumberOfDecimalsInPriceField();

    /**
     * Fixed at 0
     */
    private final NumberOfDecimalsInNominalValueField numberOfDecimalsInNominalValue = new NumberOfDecimalsInNominalValueField();

    /**
     * Fixed at 0
     */
    private final OddLotSizeField oddLotSize = new OddLotSizeField();

    /**
     * Fixed at 1
     */
    private final RoundLotSizeField roundLotSize = new RoundLotSizeField();

    /**
     * Fixed at 0
     */
    private final BlockLotSizeField blockLotSize = new BlockLotSizeField();

    /**
     * Fixed at 0
     */
    private final NominalValueField nominalValue = new NominalValueField();

    /**
     * 0 is set for Normal Series; number of legs is set for combination series
     */
    private final NumberOfLegsField numberOfLegs = new NumberOfLegsField();

    /**
     * The underlying code is set; 0 is set for combination series
     */
    private final UnderlyingOrderBookIdField underlyingOrderBookId = new UnderlyingOrderBookIdField();

    /**
     * Strike Price is set; if the case is futures, 0 is set
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Expiration date is set
     */
    private final ExpirationDateField expirationDate = new ExpirationDateField();

    /**
     * Number of decimals in strike price is set
     */
    private final NumberOfDecimalsInStrikePriceField numberOfDecimalsInStrikePrice = new NumberOfDecimalsInStrikePriceField();

    /**
     * Distinction of Put or Call is set; if the case is futures or combination series, 0 is set
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, orderBookId, symbol, longName, financialProduct, tradingCurrency, numberOfDecimalsInPrice, numberOfDecimalsInNominalValue, oddLotSize, roundLotSize, blockLotSize, nominalValue, numberOfLegs, underlyingOrderBookId, strikePrice, expirationDate, numberOfDecimalsInStrikePrice, putOrCall);

    private byte[] buffer;

    private boolean decoded;

    /**
     * A timestamp is set in nanoseconds
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * A series ID is set
     *
     * @return the OrderBookId field
     */
    public OrderBookIdField orderBookId() {
        return orderBookId;
    }

    /**
     * A series name is set
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * A 9-digit code is set
     *
     * @return the LongName field
     */
    public LongNameField longName() {
        return longName;
    }

    /**
     * A product type is set
     *
     * @return the FinancialProduct field
     */
    public FinancialProductField financialProduct() {
        return financialProduct;
    }

    /**
     * A trading currency is set, fixed at JPY
     *
     * @return the TradingCurrency field
     */
    public TradingCurrencyField tradingCurrency() {
        return tradingCurrency;
    }

    /**
     * The decimal value for a trading instrument is set
     *
     * @return the NumberOfDecimalsInPrice field
     */
    public NumberOfDecimalsInPriceField numberOfDecimalsInPrice() {
        return numberOfDecimalsInPrice;
    }

    /**
     * Fixed at 0
     *
     * @return the NumberOfDecimalsInNominalValue field
     */
    public NumberOfDecimalsInNominalValueField numberOfDecimalsInNominalValue() {
        return numberOfDecimalsInNominalValue;
    }

    /**
     * Fixed at 0
     *
     * @return the OddLotSize field
     */
    public OddLotSizeField oddLotSize() {
        return oddLotSize;
    }

    /**
     * Fixed at 1
     *
     * @return the RoundLotSize field
     */
    public RoundLotSizeField roundLotSize() {
        return roundLotSize;
    }

    /**
     * Fixed at 0
     *
     * @return the BlockLotSize field
     */
    public BlockLotSizeField blockLotSize() {
        return blockLotSize;
    }

    /**
     * Fixed at 0
     *
     * @return the NominalValue field
     */
    public NominalValueField nominalValue() {
        return nominalValue;
    }

    /**
     * 0 is set for Normal Series; number of legs is set for combination series
     *
     * @return the NumberOfLegs field
     */
    public NumberOfLegsField numberOfLegs() {
        return numberOfLegs;
    }

    /**
     * The underlying code is set; 0 is set for combination series
     *
     * @return the UnderlyingOrderBookId field
     */
    public UnderlyingOrderBookIdField underlyingOrderBookId() {
        return underlyingOrderBookId;
    }

    /**
     * Strike Price is set; if the case is futures, 0 is set
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Expiration date is set
     *
     * @return the ExpirationDate field
     */
    public ExpirationDateField expirationDate() {
        return expirationDate;
    }

    /**
     * Number of decimals in strike price is set
     *
     * @return the NumberOfDecimalsInStrikePrice field
     */
    public NumberOfDecimalsInStrikePriceField numberOfDecimalsInStrikePrice() {
        return numberOfDecimalsInStrikePrice;
    }

    /**
     * Distinction of Put or Call is set; if the case is futures or combination series, 0 is set
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!orderBookId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookIdField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!longName.parse(data, cursor)) {
            return false;
        }
        cursor += LongNameField.BYTE_LENGTH;
        cursor += 12; // padding
        if (!financialProduct.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialProductField.BYTE_LENGTH;
        if (!tradingCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCurrencyField.BYTE_LENGTH;
        if (!numberOfDecimalsInPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfDecimalsInPriceField.BYTE_LENGTH;
        if (!numberOfDecimalsInNominalValue.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfDecimalsInNominalValueField.BYTE_LENGTH;
        if (!oddLotSize.parse(data, cursor)) {
            return false;
        }
        cursor += OddLotSizeField.BYTE_LENGTH;
        if (!roundLotSize.parse(data, cursor)) {
            return false;
        }
        cursor += RoundLotSizeField.BYTE_LENGTH;
        if (!blockLotSize.parse(data, cursor)) {
            return false;
        }
        cursor += BlockLotSizeField.BYTE_LENGTH;
        if (!nominalValue.parse(data, cursor)) {
            return false;
        }
        cursor += NominalValueField.BYTE_LENGTH;
        if (!numberOfLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLegsField.BYTE_LENGTH;
        if (!underlyingOrderBookId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingOrderBookIdField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!expirationDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationDateField.BYTE_LENGTH;
        if (!numberOfDecimalsInStrikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfDecimalsInStrikePriceField.BYTE_LENGTH;
        return putOrCall.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = orderBookId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = longName.encode(data, cursor);
        if (buffer != null && buffer.length >= 84) {
            System.arraycopy(buffer, 72, data, cursor, 12); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 12, (byte) 0); // padding
        }
        cursor += 12;
        cursor = financialProduct.encode(data, cursor);
        cursor = tradingCurrency.encode(data, cursor);
        cursor = numberOfDecimalsInPrice.encode(data, cursor);
        cursor = numberOfDecimalsInNominalValue.encode(data, cursor);
        cursor = oddLotSize.encode(data, cursor);
        cursor = roundLotSize.encode(data, cursor);
        cursor = blockLotSize.encode(data, cursor);
        cursor = nominalValue.encode(data, cursor);
        cursor = numberOfLegs.encode(data, cursor);
        cursor = underlyingOrderBookId.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = expirationDate.encode(data, cursor);
        cursor = numberOfDecimalsInStrikePrice.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "OrderBookId" -> Optional.of(orderBookId);
            case "Symbol" -> Optional.of(symbol);
            case "LongName" -> Optional.of(longName);
            case "FinancialProduct" -> Optional.of(financialProduct);
            case "TradingCurrency" -> Optional.of(tradingCurrency);
            case "NumberOfDecimalsInPrice" -> Optional.of(numberOfDecimalsInPrice);
            case "NumberOfDecimalsInNominalValue" -> Optional.of(numberOfDecimalsInNominalValue);
            case "OddLotSize" -> Optional.of(oddLotSize);
            case "RoundLotSize" -> Optional.of(roundLotSize);
            case "BlockLotSize" -> Optional.of(blockLotSize);
            case "NominalValue" -> Optional.of(nominalValue);
            case "NumberOfLegs" -> Optional.of(numberOfLegs);
            case "UnderlyingOrderBookId" -> Optional.of(underlyingOrderBookId);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "ExpirationDate" -> Optional.of(expirationDate);
            case "NumberOfDecimalsInStrikePrice" -> Optional.of(numberOfDecimalsInStrikePrice);
            case "PutOrCall" -> Optional.of(putOrCall);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SeriesInformationBasicMessage message)) {
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
        if (!(other instanceof SeriesInformationBasicMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
