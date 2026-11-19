package omi.sgx.titandt.depthofbook.glimpse.v1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.FinancialProductField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.Leg1RatioField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.Leg1SideField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.Leg1SymbolField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.Leg2RatioField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.Leg2SideField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.Leg2SymbolField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.Leg3RatioField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.Leg3SideField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.Leg3SymbolField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.Leg4RatioField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.Leg4SideField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.Leg4SymbolField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.LongNameField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.NanosecondsField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.NominalValueField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.NumberOfDecimalsInNominalValueField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.NumberOfDecimalsInPriceField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.OrderBookIdField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.SymbolField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.fields.TradingCurrencyField;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.types.Field;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.types.Message;
import omi.sgx.titandt.depthofbook.glimpse.v1_4.types.PrintOptions;

/**
 * Represents the CombinationOrderBookDirectoryMessage message from the DepthOfBook protocol.
 *
 * <p>Specialized directory message used when Combination Order Books are traded</p>
 */
public final class CombinationOrderBookDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'M';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 260;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Combination Order Book Directory Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 72, 12, 92, 4, 96, 4, 100, 4 };

    /**
     * Nanoseconds portion of the timestamp
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Primary identifier of an Order Book
     */
    private final OrderBookIdField orderBookId = new OrderBookIdField();

    /**
     * Instrument short name
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Human readable long name of Instrument series
     */
    private final LongNameField longName = new LongNameField();

    /**
     * Financial product of the Order Book
     */
    private final FinancialProductField financialProduct = new FinancialProductField();

    /**
     * Trading Currency
     */
    private final TradingCurrencyField tradingCurrency = new TradingCurrencyField();

    /**
     * Number of decimals used in price for this Order Book
     */
    private final NumberOfDecimalsInPriceField numberOfDecimalsInPrice = new NumberOfDecimalsInPriceField();

    /**
     * Number of decimals in Nominal Value
     */
    private final NumberOfDecimalsInNominalValueField numberOfDecimalsInNominalValue = new NumberOfDecimalsInNominalValueField();

    /**
     * Nominal Value
     */
    private final NominalValueField nominalValue = new NominalValueField();

    /**
     * Leg Symbol
     */
    private final Leg1SymbolField leg1Symbol = new Leg1SymbolField();

    /**
     * Leg side
     */
    private final Leg1SideField leg1Side = new Leg1SideField();

    /**
     * Leg ratio
     */
    private final Leg1RatioField leg1Ratio = new Leg1RatioField();

    /**
     * Leg Symbol
     */
    private final Leg2SymbolField leg2Symbol = new Leg2SymbolField();

    /**
     * Leg side
     */
    private final Leg2SideField leg2Side = new Leg2SideField();

    /**
     * Leg ratio
     */
    private final Leg2RatioField leg2Ratio = new Leg2RatioField();

    /**
     * Leg Symbol
     */
    private final Leg3SymbolField leg3Symbol = new Leg3SymbolField();

    /**
     * Leg side
     */
    private final Leg3SideField leg3Side = new Leg3SideField();

    /**
     * Leg ratio
     */
    private final Leg3RatioField leg3Ratio = new Leg3RatioField();

    /**
     * Leg Symbol
     */
    private final Leg4SymbolField leg4Symbol = new Leg4SymbolField();

    /**
     * Leg side
     */
    private final Leg4SideField leg4Side = new Leg4SideField();

    /**
     * Leg ratio
     */
    private final Leg4RatioField leg4Ratio = new Leg4RatioField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, orderBookId, symbol, longName, financialProduct, tradingCurrency, numberOfDecimalsInPrice, numberOfDecimalsInNominalValue, nominalValue, leg1Symbol, leg1Side, leg1Ratio, leg2Symbol, leg2Side, leg2Ratio, leg3Symbol, leg3Side, leg3Ratio, leg4Symbol, leg4Side, leg4Ratio);

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
     * Primary identifier of an Order Book
     *
     * @return the OrderBookId field
     */
    public OrderBookIdField orderBookId() {
        return orderBookId;
    }

    /**
     * Instrument short name
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Human readable long name of Instrument series
     *
     * @return the LongName field
     */
    public LongNameField longName() {
        return longName;
    }

    /**
     * Financial product of the Order Book
     *
     * @return the FinancialProduct field
     */
    public FinancialProductField financialProduct() {
        return financialProduct;
    }

    /**
     * Trading Currency
     *
     * @return the TradingCurrency field
     */
    public TradingCurrencyField tradingCurrency() {
        return tradingCurrency;
    }

    /**
     * Number of decimals used in price for this Order Book
     *
     * @return the NumberOfDecimalsInPrice field
     */
    public NumberOfDecimalsInPriceField numberOfDecimalsInPrice() {
        return numberOfDecimalsInPrice;
    }

    /**
     * Number of decimals in Nominal Value
     *
     * @return the NumberOfDecimalsInNominalValue field
     */
    public NumberOfDecimalsInNominalValueField numberOfDecimalsInNominalValue() {
        return numberOfDecimalsInNominalValue;
    }

    /**
     * Nominal Value
     *
     * @return the NominalValue field
     */
    public NominalValueField nominalValue() {
        return nominalValue;
    }

    /**
     * Leg Symbol
     *
     * @return the Leg1Symbol field
     */
    public Leg1SymbolField leg1Symbol() {
        return leg1Symbol;
    }

    /**
     * Leg side
     *
     * @return the Leg1Side field
     */
    public Leg1SideField leg1Side() {
        return leg1Side;
    }

    /**
     * Leg ratio
     *
     * @return the Leg1Ratio field
     */
    public Leg1RatioField leg1Ratio() {
        return leg1Ratio;
    }

    /**
     * Leg Symbol
     *
     * @return the Leg2Symbol field
     */
    public Leg2SymbolField leg2Symbol() {
        return leg2Symbol;
    }

    /**
     * Leg side
     *
     * @return the Leg2Side field
     */
    public Leg2SideField leg2Side() {
        return leg2Side;
    }

    /**
     * Leg ratio
     *
     * @return the Leg2Ratio field
     */
    public Leg2RatioField leg2Ratio() {
        return leg2Ratio;
    }

    /**
     * Leg Symbol
     *
     * @return the Leg3Symbol field
     */
    public Leg3SymbolField leg3Symbol() {
        return leg3Symbol;
    }

    /**
     * Leg side
     *
     * @return the Leg3Side field
     */
    public Leg3SideField leg3Side() {
        return leg3Side;
    }

    /**
     * Leg ratio
     *
     * @return the Leg3Ratio field
     */
    public Leg3RatioField leg3Ratio() {
        return leg3Ratio;
    }

    /**
     * Leg Symbol
     *
     * @return the Leg4Symbol field
     */
    public Leg4SymbolField leg4Symbol() {
        return leg4Symbol;
    }

    /**
     * Leg side
     *
     * @return the Leg4Side field
     */
    public Leg4SideField leg4Side() {
        return leg4Side;
    }

    /**
     * Leg ratio
     *
     * @return the Leg4Ratio field
     */
    public Leg4RatioField leg4Ratio() {
        return leg4Ratio;
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
        cursor += 12; // padding
        if (!nominalValue.parse(data, cursor)) {
            return false;
        }
        cursor += NominalValueField.BYTE_LENGTH;
        if (!leg1Symbol.parse(data, cursor)) {
            return false;
        }
        cursor += Leg1SymbolField.BYTE_LENGTH;
        if (!leg1Side.parse(data, cursor)) {
            return false;
        }
        cursor += Leg1SideField.BYTE_LENGTH;
        if (!leg1Ratio.parse(data, cursor)) {
            return false;
        }
        cursor += Leg1RatioField.BYTE_LENGTH;
        if (!leg2Symbol.parse(data, cursor)) {
            return false;
        }
        cursor += Leg2SymbolField.BYTE_LENGTH;
        if (!leg2Side.parse(data, cursor)) {
            return false;
        }
        cursor += Leg2SideField.BYTE_LENGTH;
        if (!leg2Ratio.parse(data, cursor)) {
            return false;
        }
        cursor += Leg2RatioField.BYTE_LENGTH;
        if (!leg3Symbol.parse(data, cursor)) {
            return false;
        }
        cursor += Leg3SymbolField.BYTE_LENGTH;
        if (!leg3Side.parse(data, cursor)) {
            return false;
        }
        cursor += Leg3SideField.BYTE_LENGTH;
        if (!leg3Ratio.parse(data, cursor)) {
            return false;
        }
        cursor += Leg3RatioField.BYTE_LENGTH;
        if (!leg4Symbol.parse(data, cursor)) {
            return false;
        }
        cursor += Leg4SymbolField.BYTE_LENGTH;
        if (!leg4Side.parse(data, cursor)) {
            return false;
        }
        cursor += Leg4SideField.BYTE_LENGTH;
        return leg4Ratio.parse(data, cursor);
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
        if (buffer != null && buffer.length >= 104) {
            System.arraycopy(buffer, 92, data, cursor, 12); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 12, (byte) 0); // padding
        }
        cursor += 12;
        cursor = nominalValue.encode(data, cursor);
        cursor = leg1Symbol.encode(data, cursor);
        cursor = leg1Side.encode(data, cursor);
        cursor = leg1Ratio.encode(data, cursor);
        cursor = leg2Symbol.encode(data, cursor);
        cursor = leg2Side.encode(data, cursor);
        cursor = leg2Ratio.encode(data, cursor);
        cursor = leg3Symbol.encode(data, cursor);
        cursor = leg3Side.encode(data, cursor);
        cursor = leg3Ratio.encode(data, cursor);
        cursor = leg4Symbol.encode(data, cursor);
        cursor = leg4Side.encode(data, cursor);
        cursor = leg4Ratio.encode(data, cursor);
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
            case "NominalValue" -> Optional.of(nominalValue);
            case "Leg1Symbol" -> Optional.of(leg1Symbol);
            case "Leg1Side" -> Optional.of(leg1Side);
            case "Leg1Ratio" -> Optional.of(leg1Ratio);
            case "Leg2Symbol" -> Optional.of(leg2Symbol);
            case "Leg2Side" -> Optional.of(leg2Side);
            case "Leg2Ratio" -> Optional.of(leg2Ratio);
            case "Leg3Symbol" -> Optional.of(leg3Symbol);
            case "Leg3Side" -> Optional.of(leg3Side);
            case "Leg3Ratio" -> Optional.of(leg3Ratio);
            case "Leg4Symbol" -> Optional.of(leg4Symbol);
            case "Leg4Side" -> Optional.of(leg4Side);
            case "Leg4Ratio" -> Optional.of(leg4Ratio);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CombinationOrderBookDirectoryMessage message)) {
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
        if (!(other instanceof CombinationOrderBookDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
