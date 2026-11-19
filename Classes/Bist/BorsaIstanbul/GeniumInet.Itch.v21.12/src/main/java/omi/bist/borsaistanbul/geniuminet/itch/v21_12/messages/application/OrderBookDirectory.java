package omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.BlockLotSizeField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.DecimalsInNominalValueField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.DecimalsInPriceField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.DecimalsInStrikePriceField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.ExpirationDateField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.FinancialProductField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.IsinField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.LongNameField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.NanosecondsField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.NominalValueField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.NumberOfLegsField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.OddLotSizeField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.OrderBookIdField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.PutOrCallField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.RankingTypeField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.RoundLotSizeField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.StrikePriceField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.SymbolField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.TradingCurrencyField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.UnderlyingOrderBookIdField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.types.Field;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.types.Message;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.types.PrintOptions;

/**
 * Represents the OrderBookDirectory message from the GeniumInet protocol.
 *
 * <p>At the start of each trading day, Order book directory messages are disseminated for all active securities, including halted securities. Intra-day transmissions may occur when new order books are added or updates to existing order books occur.</p>
 */
public final class OrderBookDirectory implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 129;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Book Directory";

    /**
     * Nanoseconds portion of the timestamp
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Denotes the primary identifier of an order book. Expired Order book IDs may be reused for new instruments.
     */
    private final OrderBookIdField orderBookId = new OrderBookIdField();

    /**
     * Security short name
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Human-readable long name of security
     */
    private final LongNameField longName = new LongNameField();

    /**
     * ISIN code identifying security
     */
    private final IsinField isin = new IsinField();

    /**
     * Financial product type of the order book
     */
    private final FinancialProductField financialProduct = new FinancialProductField();

    /**
     * Trading currency
     */
    private final TradingCurrencyField tradingCurrency = new TradingCurrencyField();

    /**
     * Number of decimals used in price for this order book. A value of 256 means that the instrument is traded in fractions (each fraction is 1/256)
     */
    private final DecimalsInPriceField decimalsInPrice = new DecimalsInPriceField();

    /**
     * Number of decimals in Nominal Value
     */
    private final DecimalsInNominalValueField decimalsInNominalValue = new DecimalsInNominalValueField();

    /**
     * Indicates the number of securities that represents an odd lot for the order book. A value of 0 indicates that this lot type is undefined for the order book
     */
    private final OddLotSizeField oddLotSize = new OddLotSizeField();

    /**
     * Indicates the quantity that represents a round lot for the issue
     */
    private final RoundLotSizeField roundLotSize = new RoundLotSizeField();

    /**
     * Indicates the number of securities that represents a block lot for the order book. A value of 0 indicates that this lot type is undefined for the order book
     */
    private final BlockLotSizeField blockLotSize = new BlockLotSizeField();

    /**
     * Nominal value
     */
    private final NominalValueField nominalValue = new NominalValueField();

    /**
     * Number of legs. Only applicable for combination instruments
     */
    private final NumberOfLegsField numberOfLegs = new NumberOfLegsField();

    /**
     * Order book ID of underlying instrument. Only applicable for derivative instruments except for combinations
     */
    private final UnderlyingOrderBookIdField underlyingOrderBookId = new UnderlyingOrderBookIdField();

    /**
     * Only applicable for derivative instruments
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Date of order expiration. Only applicable for derivative instruments. Valid format is YYYYMMDD
     */
    private final ExpirationDateField expirationDate = new ExpirationDateField();

    /**
     * Number of decimals used in Strike Price for this order book. Only applicable for derivative instruments
     */
    private final DecimalsInStrikePriceField decimalsInStrikePrice = new DecimalsInStrikePriceField();

    /**
     * Option type. A value of 0 indicates that Put or Call is undefined for the order book
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Specifies what ranking type should be used. 1 = Price Time
     */
    private final RankingTypeField rankingType = new RankingTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, orderBookId, symbol, longName, isin, financialProduct, tradingCurrency, decimalsInPrice, decimalsInNominalValue, oddLotSize, roundLotSize, blockLotSize, nominalValue, numberOfLegs, underlyingOrderBookId, strikePrice, expirationDate, decimalsInStrikePrice, putOrCall, rankingType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Denotes the primary identifier of an order book. Expired Order book IDs may be reused for new instruments.
     *
     * @return the OrderBookId field
     */
    public OrderBookIdField orderBookId() {
        return orderBookId;
    }

    /**
     * Security short name
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Human-readable long name of security
     *
     * @return the LongName field
     */
    public LongNameField longName() {
        return longName;
    }

    /**
     * ISIN code identifying security
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * Financial product type of the order book
     *
     * @return the FinancialProduct field
     */
    public FinancialProductField financialProduct() {
        return financialProduct;
    }

    /**
     * Trading currency
     *
     * @return the TradingCurrency field
     */
    public TradingCurrencyField tradingCurrency() {
        return tradingCurrency;
    }

    /**
     * Number of decimals used in price for this order book. A value of 256 means that the instrument is traded in fractions (each fraction is 1/256)
     *
     * @return the DecimalsInPrice field
     */
    public DecimalsInPriceField decimalsInPrice() {
        return decimalsInPrice;
    }

    /**
     * Number of decimals in Nominal Value
     *
     * @return the DecimalsInNominalValue field
     */
    public DecimalsInNominalValueField decimalsInNominalValue() {
        return decimalsInNominalValue;
    }

    /**
     * Indicates the number of securities that represents an odd lot for the order book. A value of 0 indicates that this lot type is undefined for the order book
     *
     * @return the OddLotSize field
     */
    public OddLotSizeField oddLotSize() {
        return oddLotSize;
    }

    /**
     * Indicates the quantity that represents a round lot for the issue
     *
     * @return the RoundLotSize field
     */
    public RoundLotSizeField roundLotSize() {
        return roundLotSize;
    }

    /**
     * Indicates the number of securities that represents a block lot for the order book. A value of 0 indicates that this lot type is undefined for the order book
     *
     * @return the BlockLotSize field
     */
    public BlockLotSizeField blockLotSize() {
        return blockLotSize;
    }

    /**
     * Nominal value
     *
     * @return the NominalValue field
     */
    public NominalValueField nominalValue() {
        return nominalValue;
    }

    /**
     * Number of legs. Only applicable for combination instruments
     *
     * @return the NumberOfLegs field
     */
    public NumberOfLegsField numberOfLegs() {
        return numberOfLegs;
    }

    /**
     * Order book ID of underlying instrument. Only applicable for derivative instruments except for combinations
     *
     * @return the UnderlyingOrderBookId field
     */
    public UnderlyingOrderBookIdField underlyingOrderBookId() {
        return underlyingOrderBookId;
    }

    /**
     * Only applicable for derivative instruments
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Date of order expiration. Only applicable for derivative instruments. Valid format is YYYYMMDD
     *
     * @return the ExpirationDate field
     */
    public ExpirationDateField expirationDate() {
        return expirationDate;
    }

    /**
     * Number of decimals used in Strike Price for this order book. Only applicable for derivative instruments
     *
     * @return the DecimalsInStrikePrice field
     */
    public DecimalsInStrikePriceField decimalsInStrikePrice() {
        return decimalsInStrikePrice;
    }

    /**
     * Option type. A value of 0 indicates that Put or Call is undefined for the order book
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Specifies what ranking type should be used. 1 = Price Time
     *
     * @return the RankingType field
     */
    public RankingTypeField rankingType() {
        return rankingType;
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
        if (!decimalsInPrice.parse(data, cursor)) {
            return false;
        }
        cursor += DecimalsInPriceField.BYTE_LENGTH;
        if (!decimalsInNominalValue.parse(data, cursor)) {
            return false;
        }
        cursor += DecimalsInNominalValueField.BYTE_LENGTH;
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
        if (!decimalsInStrikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += DecimalsInStrikePriceField.BYTE_LENGTH;
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        return rankingType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = orderBookId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = longName.encode(data, cursor);
        cursor = isin.encode(data, cursor);
        cursor = financialProduct.encode(data, cursor);
        cursor = tradingCurrency.encode(data, cursor);
        cursor = decimalsInPrice.encode(data, cursor);
        cursor = decimalsInNominalValue.encode(data, cursor);
        cursor = oddLotSize.encode(data, cursor);
        cursor = roundLotSize.encode(data, cursor);
        cursor = blockLotSize.encode(data, cursor);
        cursor = nominalValue.encode(data, cursor);
        cursor = numberOfLegs.encode(data, cursor);
        cursor = underlyingOrderBookId.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = expirationDate.encode(data, cursor);
        cursor = decimalsInStrikePrice.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = rankingType.encode(data, cursor);
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
            case "Isin" -> Optional.of(isin);
            case "FinancialProduct" -> Optional.of(financialProduct);
            case "TradingCurrency" -> Optional.of(tradingCurrency);
            case "DecimalsInPrice" -> Optional.of(decimalsInPrice);
            case "DecimalsInNominalValue" -> Optional.of(decimalsInNominalValue);
            case "OddLotSize" -> Optional.of(oddLotSize);
            case "RoundLotSize" -> Optional.of(roundLotSize);
            case "BlockLotSize" -> Optional.of(blockLotSize);
            case "NominalValue" -> Optional.of(nominalValue);
            case "NumberOfLegs" -> Optional.of(numberOfLegs);
            case "UnderlyingOrderBookId" -> Optional.of(underlyingOrderBookId);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "ExpirationDate" -> Optional.of(expirationDate);
            case "DecimalsInStrikePrice" -> Optional.of(decimalsInStrikePrice);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "RankingType" -> Optional.of(rankingType);
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
