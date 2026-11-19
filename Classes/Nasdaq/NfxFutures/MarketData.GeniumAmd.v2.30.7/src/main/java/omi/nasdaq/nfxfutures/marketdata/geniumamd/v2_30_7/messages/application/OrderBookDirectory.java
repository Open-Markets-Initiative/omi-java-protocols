package omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.BlockLotSizeField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.ExpirationDateField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.FinancialProductField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.IsinField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.LongNameField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.MarketIdField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.MinimumQuantityAndMultipleField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.NominalValueField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.NumberOfDecimalsInNominalValueField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.NumberOfDecimalsInPriceField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.NumberOfDecimalsInStrikePriceField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.NumberOfLegsField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.OddLotSizeField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.OrderBookIdField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.PutOrCallField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.RoundLotSizeField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.StrategySubtypeField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.StrikePriceField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.SymbolField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.TimestampNanosecondsField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.TradingCurrencyField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields.UnderlyingOrderBookIdField;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.types.Field;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.types.Message;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.types.PrintOptions;

/**
 * Represents the OrderBookDirectory message from the MarketData protocol.
 */
public final class OrderBookDirectory implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 135;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Book Directory";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final TimestampNanosecondsField timestampNanoseconds = new TimestampNanosecondsField();

    /**
     * Denotes the primary identifier of an order book. NOTE: Expired Order book IDs may be reused for new instruments.
     */
    private final OrderBookIdField orderBookId = new OrderBookIdField();

    /**
     * Security short name.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Human-readable long name of security.
     */
    private final LongNameField longName = new LongNameField();

    /**
     * ISIN code identifying security.
     */
    private final IsinField isin = new IsinField();

    /**
     * Values: 0 = Not applicable 1 = Option 2 = Forward 3 = Future 4 = FRA 5 = Cash 6 = Payment 7 = Exchange Rate 8 = Interest Rate Swap 9 = REPO 10 = Synthetic Box Leg/Reference 11 = Standard Combination 12 = Guarantee 13 = OTC General 14 = Equity Warrant 15 = Security Lending
     */
    private final FinancialProductField financialProduct = new FinancialProductField();

    /**
     * Trading currency.
     */
    private final TradingCurrencyField tradingCurrency = new TradingCurrencyField();

    /**
     * This value defines the number of decimals used in price for this order book. NOTE: A value of 256 means that the instrument is traded in fractions (each fraction is 1/256).
     */
    private final NumberOfDecimalsInPriceField numberOfDecimalsInPrice = new NumberOfDecimalsInPriceField();

    /**
     * This value defines the number of decimals in Nom- inal Value.
     */
    private final NumberOfDecimalsInNominalValueField numberOfDecimalsInNominalValue = new NumberOfDecimalsInNominalValueField();

    /**
     * Indicates the number of securities that represent an odd lot for the order book. NOTE: A value of 0 indicates that this lot type is undefined for the order book. The document states no data type for this field. Numeric is taken from the Nasdaq Nordic Equities TotalView Itch specification, which types Round Lot Size as Integer.
     */
    private final OddLotSizeField oddLotSize = new OddLotSizeField();

    /**
     * Indicates the quantity that represent a round lot for the issue The document states no data type for this field. Numeric is taken from the Nasdaq Nordic Equities TotalView Itch specification, which types Round Lot Size as Integer.
     */
    private final RoundLotSizeField roundLotSize = new RoundLotSizeField();

    /**
     * Indicates the number of securities that represent a block lot for the order book. NOTE: A value of 0 indicates that this lot type is undefined for the order book. The document states no data type for this field. Numeric is taken from the Nasdaq Nordic Equities TotalView Itch specification, which types Round Lot Size as Integer.
     */
    private final BlockLotSizeField blockLotSize = new BlockLotSizeField();

    /**
     * Nominal value.
     */
    private final NominalValueField nominalValue = new NominalValueField();

    /**
     * Number of legs. NOTE: Only applicable for combination instruments.
     */
    private final NumberOfLegsField numberOfLegs = new NumberOfLegsField();

    /**
     * Order book ID of underlying instrument. NOTE: Only applicable for derivative instruments except for combinations
     */
    private final UnderlyingOrderBookIdField underlyingOrderBookId = new UnderlyingOrderBookIdField();

    /**
     * NOTE: Only applicable for derivative instruments.
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Date of expiration. NOTE: Only applicable for derivative instruments. NOTE: If the effective expiration date is set in the system, it is also contained in this field.
     */
    private final ExpirationDateField expirationDate = new ExpirationDateField();

    /**
     * This value defines the number of decimals used in Strike Price for this order book. NOTE: Only applicable for derivative instruments.
     */
    private final NumberOfDecimalsInStrikePriceField numberOfDecimalsInStrikePrice = new NumberOfDecimalsInStrikePriceField();

    /**
     * Option type. Values: 1 = Call 2 = Put NOTE: A value of 0 indicates that Put or Call is un- defined for the order book.
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Market ID
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Strategy subtype. Values: 0 = Not applicable 1 = Covered Option The document states the data type as Byte, which it does not declare. Numeric is what is written here, the two being the same at one byte.
     */
    private final StrategySubtypeField strategySubtype = new StrategySubtypeField();

    /**
     * Minimum quantity and quantity multiple for Cov- ered Options calculated by the system.
     */
    private final MinimumQuantityAndMultipleField minimumQuantityAndMultiple = new MinimumQuantityAndMultipleField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampNanoseconds, orderBookId, symbol, longName, isin, financialProduct, tradingCurrency, numberOfDecimalsInPrice, numberOfDecimalsInNominalValue, oddLotSize, roundLotSize, blockLotSize, nominalValue, numberOfLegs, underlyingOrderBookId, strikePrice, expirationDate, numberOfDecimalsInStrikePrice, putOrCall, marketId, strategySubtype, minimumQuantityAndMultiple);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the TimestampNanoseconds field
     */
    public TimestampNanosecondsField timestampNanoseconds() {
        return timestampNanoseconds;
    }

    /**
     * Denotes the primary identifier of an order book. NOTE: Expired Order book IDs may be reused for new instruments.
     *
     * @return the OrderBookId field
     */
    public OrderBookIdField orderBookId() {
        return orderBookId;
    }

    /**
     * Security short name.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Human-readable long name of security.
     *
     * @return the LongName field
     */
    public LongNameField longName() {
        return longName;
    }

    /**
     * ISIN code identifying security.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * Values: 0 = Not applicable 1 = Option 2 = Forward 3 = Future 4 = FRA 5 = Cash 6 = Payment 7 = Exchange Rate 8 = Interest Rate Swap 9 = REPO 10 = Synthetic Box Leg/Reference 11 = Standard Combination 12 = Guarantee 13 = OTC General 14 = Equity Warrant 15 = Security Lending
     *
     * @return the FinancialProduct field
     */
    public FinancialProductField financialProduct() {
        return financialProduct;
    }

    /**
     * Trading currency.
     *
     * @return the TradingCurrency field
     */
    public TradingCurrencyField tradingCurrency() {
        return tradingCurrency;
    }

    /**
     * This value defines the number of decimals used in price for this order book. NOTE: A value of 256 means that the instrument is traded in fractions (each fraction is 1/256).
     *
     * @return the NumberOfDecimalsInPrice field
     */
    public NumberOfDecimalsInPriceField numberOfDecimalsInPrice() {
        return numberOfDecimalsInPrice;
    }

    /**
     * This value defines the number of decimals in Nom- inal Value.
     *
     * @return the NumberOfDecimalsInNominalValue field
     */
    public NumberOfDecimalsInNominalValueField numberOfDecimalsInNominalValue() {
        return numberOfDecimalsInNominalValue;
    }

    /**
     * Indicates the number of securities that represent an odd lot for the order book. NOTE: A value of 0 indicates that this lot type is undefined for the order book. The document states no data type for this field. Numeric is taken from the Nasdaq Nordic Equities TotalView Itch specification, which types Round Lot Size as Integer.
     *
     * @return the OddLotSize field
     */
    public OddLotSizeField oddLotSize() {
        return oddLotSize;
    }

    /**
     * Indicates the quantity that represent a round lot for the issue The document states no data type for this field. Numeric is taken from the Nasdaq Nordic Equities TotalView Itch specification, which types Round Lot Size as Integer.
     *
     * @return the RoundLotSize field
     */
    public RoundLotSizeField roundLotSize() {
        return roundLotSize;
    }

    /**
     * Indicates the number of securities that represent a block lot for the order book. NOTE: A value of 0 indicates that this lot type is undefined for the order book. The document states no data type for this field. Numeric is taken from the Nasdaq Nordic Equities TotalView Itch specification, which types Round Lot Size as Integer.
     *
     * @return the BlockLotSize field
     */
    public BlockLotSizeField blockLotSize() {
        return blockLotSize;
    }

    /**
     * Nominal value.
     *
     * @return the NominalValue field
     */
    public NominalValueField nominalValue() {
        return nominalValue;
    }

    /**
     * Number of legs. NOTE: Only applicable for combination instruments.
     *
     * @return the NumberOfLegs field
     */
    public NumberOfLegsField numberOfLegs() {
        return numberOfLegs;
    }

    /**
     * Order book ID of underlying instrument. NOTE: Only applicable for derivative instruments except for combinations
     *
     * @return the UnderlyingOrderBookId field
     */
    public UnderlyingOrderBookIdField underlyingOrderBookId() {
        return underlyingOrderBookId;
    }

    /**
     * NOTE: Only applicable for derivative instruments.
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Date of expiration. NOTE: Only applicable for derivative instruments. NOTE: If the effective expiration date is set in the system, it is also contained in this field.
     *
     * @return the ExpirationDate field
     */
    public ExpirationDateField expirationDate() {
        return expirationDate;
    }

    /**
     * This value defines the number of decimals used in Strike Price for this order book. NOTE: Only applicable for derivative instruments.
     *
     * @return the NumberOfDecimalsInStrikePrice field
     */
    public NumberOfDecimalsInStrikePriceField numberOfDecimalsInStrikePrice() {
        return numberOfDecimalsInStrikePrice;
    }

    /**
     * Option type. Values: 1 = Call 2 = Put NOTE: A value of 0 indicates that Put or Call is un- defined for the order book.
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Market ID
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * Strategy subtype. Values: 0 = Not applicable 1 = Covered Option The document states the data type as Byte, which it does not declare. Numeric is what is written here, the two being the same at one byte.
     *
     * @return the StrategySubtype field
     */
    public StrategySubtypeField strategySubtype() {
        return strategySubtype;
    }

    /**
     * Minimum quantity and quantity multiple for Cov- ered Options calculated by the system.
     *
     * @return the MinimumQuantityAndMultiple field
     */
    public MinimumQuantityAndMultipleField minimumQuantityAndMultiple() {
        return minimumQuantityAndMultiple;
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
        if (!timestampNanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampNanosecondsField.BYTE_LENGTH;
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
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
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
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!strategySubtype.parse(data, cursor)) {
            return false;
        }
        cursor += StrategySubtypeField.BYTE_LENGTH;
        return minimumQuantityAndMultiple.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampNanoseconds.encode(data, cursor);
        cursor = orderBookId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = longName.encode(data, cursor);
        cursor = isin.encode(data, cursor);
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
        cursor = marketId.encode(data, cursor);
        cursor = strategySubtype.encode(data, cursor);
        cursor = minimumQuantityAndMultiple.encode(data, cursor);
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
            case "TimestampNanoseconds" -> Optional.of(timestampNanoseconds);
            case "OrderBookId" -> Optional.of(orderBookId);
            case "Symbol" -> Optional.of(symbol);
            case "LongName" -> Optional.of(longName);
            case "Isin" -> Optional.of(isin);
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
            case "MarketId" -> Optional.of(marketId);
            case "StrategySubtype" -> Optional.of(strategySubtype);
            case "MinimumQuantityAndMultiple" -> Optional.of(minimumQuantityAndMultiple);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderBookDirectory message)) {
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
        if (!(other instanceof OrderBookDirectory message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
