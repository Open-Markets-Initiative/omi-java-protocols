package omi.nasdaq.nordicequities.totalview.itch.v3_04_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.AodMicField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.CurrencyField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.FinancialProductField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.IsinField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.MarketSegmentIdField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.MicField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.MultiplierForCalculatingQuantityInMeasurementUnitField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.NordicMidMicField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.NotationOfQtyField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.NoteCodesBitField1Field;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.NoteCodesBitField2Field;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.NoteCodesBitField3Field;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.NoteCodesBitField4Field;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.NoteCodesBitField5Field;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.NoteCodesBitField6Field;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.NoteCodesBitField7Field;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.NoteCodesBitField8Field;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.NotionalAmountField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.OrderBookField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.PriceNotationField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.PureStreamMicField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.RoundLotSizeField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.SymbolField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.TimestampField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.TrackingNumberField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields.TradingCurrencyField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.types.Field;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.types.Message;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.types.PrintOptions;

/**
 * Represents the OrderBookDirectoryMessage message from the TotalView protocol.
 *
 * <p>Disseminated for all active order books at the start of each trading day</p>
 */
public final class OrderBookDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 100;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Book Directory Message";

    /**
     * Nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Nasdaq Nordic internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Order book id
     */
    private final OrderBookField orderBook = new OrderBookField();

    /**
     * Human readable name of the security
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Isin code identifying security
     */
    private final IsinField isin = new IsinField();

    /**
     * Type of financial product
     */
    private final FinancialProductField financialProduct = new FinancialProductField();

    /**
     * Trading currency
     */
    private final TradingCurrencyField tradingCurrency = new TradingCurrencyField();

    /**
     * Venue Mic if a lit order book applies
     */
    private final MicField mic = new MicField();

    /**
     * Market segment this order book belongs to
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Note codes, logical Or is used to identify multiple note codes
     */
    private final NoteCodesBitField1Field noteCodesBitField1 = new NoteCodesBitField1Field();

    /**
     * Note codes, logical Or is used to identify multiple note codes
     */
    private final NoteCodesBitField2Field noteCodesBitField2 = new NoteCodesBitField2Field();

    /**
     * Note codes, logical Or is used to identify multiple note codes
     */
    private final NoteCodesBitField3Field noteCodesBitField3 = new NoteCodesBitField3Field();

    /**
     * Note codes, logical Or is used to identify multiple note codes
     */
    private final NoteCodesBitField4Field noteCodesBitField4 = new NoteCodesBitField4Field();

    /**
     * Note codes, logical Or is used to identify multiple note codes
     */
    private final NoteCodesBitField5Field noteCodesBitField5 = new NoteCodesBitField5Field();

    /**
     * Note codes, logical Or is used to identify multiple note codes
     */
    private final NoteCodesBitField6Field noteCodesBitField6 = new NoteCodesBitField6Field();

    /**
     * Note codes, logical Or is used to identify multiple note codes
     */
    private final NoteCodesBitField7Field noteCodesBitField7 = new NoteCodesBitField7Field();

    /**
     * Note codes, logical Or is used to identify multiple note codes
     */
    private final NoteCodesBitField8Field noteCodesBitField8 = new NoteCodesBitField8Field();

    /**
     * Number of shares representing a round lot
     */
    private final RoundLotSizeField roundLotSize = new RoundLotSizeField();

    /**
     * Venue Mic if a Nordic At Mid order book applies
     */
    private final NordicMidMicField nordicMidMic = new NordicMidMicField();

    /**
     * Venue Mic if an auction on demand order book applies
     */
    private final AodMicField aodMic = new AodMicField();

    /**
     * Measurement units the quantity is expressed in
     */
    private final NotationOfQtyField notationOfQty = new NotationOfQtyField();

    /**
     * Notional amount if specified
     */
    private final NotionalAmountField notionalAmount = new NotionalAmountField();

    /**
     * Currency of the notional amount
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Populated with M if price is monetary value
     */
    private final PriceNotationField priceNotation = new PriceNotationField();

    /**
     * Multiplier to calculate quantity in measurement units
     */
    private final MultiplierForCalculatingQuantityInMeasurementUnitField multiplierForCalculatingQuantityInMeasurementUnit = new MultiplierForCalculatingQuantityInMeasurementUnitField();

    /**
     * Venue Mic if a PureStream order book applies
     */
    private final PureStreamMicField pureStreamMic = new PureStreamMicField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, trackingNumber, orderBook, symbol, isin, financialProduct, tradingCurrency, mic, marketSegmentId, noteCodesBitField1, noteCodesBitField2, noteCodesBitField3, noteCodesBitField4, noteCodesBitField5, noteCodesBitField6, noteCodesBitField7, noteCodesBitField8, roundLotSize, nordicMidMic, aodMic, notationOfQty, notionalAmount, currency, priceNotation, multiplierForCalculatingQuantityInMeasurementUnit, pureStreamMic);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Nasdaq Nordic internal tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Order book id
     *
     * @return the OrderBook field
     */
    public OrderBookField orderBook() {
        return orderBook;
    }

    /**
     * Human readable name of the security
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Isin code identifying security
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * Type of financial product
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
     * Venue Mic if a lit order book applies
     *
     * @return the Mic field
     */
    public MicField mic() {
        return mic;
    }

    /**
     * Market segment this order book belongs to
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Note codes, logical Or is used to identify multiple note codes
     *
     * @return the NoteCodesBitField1 field
     */
    public NoteCodesBitField1Field noteCodesBitField1() {
        return noteCodesBitField1;
    }

    /**
     * Note codes, logical Or is used to identify multiple note codes
     *
     * @return the NoteCodesBitField2 field
     */
    public NoteCodesBitField2Field noteCodesBitField2() {
        return noteCodesBitField2;
    }

    /**
     * Note codes, logical Or is used to identify multiple note codes
     *
     * @return the NoteCodesBitField3 field
     */
    public NoteCodesBitField3Field noteCodesBitField3() {
        return noteCodesBitField3;
    }

    /**
     * Note codes, logical Or is used to identify multiple note codes
     *
     * @return the NoteCodesBitField4 field
     */
    public NoteCodesBitField4Field noteCodesBitField4() {
        return noteCodesBitField4;
    }

    /**
     * Note codes, logical Or is used to identify multiple note codes
     *
     * @return the NoteCodesBitField5 field
     */
    public NoteCodesBitField5Field noteCodesBitField5() {
        return noteCodesBitField5;
    }

    /**
     * Note codes, logical Or is used to identify multiple note codes
     *
     * @return the NoteCodesBitField6 field
     */
    public NoteCodesBitField6Field noteCodesBitField6() {
        return noteCodesBitField6;
    }

    /**
     * Note codes, logical Or is used to identify multiple note codes
     *
     * @return the NoteCodesBitField7 field
     */
    public NoteCodesBitField7Field noteCodesBitField7() {
        return noteCodesBitField7;
    }

    /**
     * Note codes, logical Or is used to identify multiple note codes
     *
     * @return the NoteCodesBitField8 field
     */
    public NoteCodesBitField8Field noteCodesBitField8() {
        return noteCodesBitField8;
    }

    /**
     * Number of shares representing a round lot
     *
     * @return the RoundLotSize field
     */
    public RoundLotSizeField roundLotSize() {
        return roundLotSize;
    }

    /**
     * Venue Mic if a Nordic At Mid order book applies
     *
     * @return the NordicMidMic field
     */
    public NordicMidMicField nordicMidMic() {
        return nordicMidMic;
    }

    /**
     * Venue Mic if an auction on demand order book applies
     *
     * @return the AodMic field
     */
    public AodMicField aodMic() {
        return aodMic;
    }

    /**
     * Measurement units the quantity is expressed in
     *
     * @return the NotationOfQty field
     */
    public NotationOfQtyField notationOfQty() {
        return notationOfQty;
    }

    /**
     * Notional amount if specified
     *
     * @return the NotionalAmount field
     */
    public NotionalAmountField notionalAmount() {
        return notionalAmount;
    }

    /**
     * Currency of the notional amount
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Populated with M if price is monetary value
     *
     * @return the PriceNotation field
     */
    public PriceNotationField priceNotation() {
        return priceNotation;
    }

    /**
     * Multiplier to calculate quantity in measurement units
     *
     * @return the MultiplierForCalculatingQuantityInMeasurementUnit field
     */
    public MultiplierForCalculatingQuantityInMeasurementUnitField multiplierForCalculatingQuantityInMeasurementUnit() {
        return multiplierForCalculatingQuantityInMeasurementUnit;
    }

    /**
     * Venue Mic if a PureStream order book applies
     *
     * @return the PureStreamMic field
     */
    public PureStreamMicField pureStreamMic() {
        return pureStreamMic;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!orderBook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
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
        if (!mic.parse(data, cursor)) {
            return false;
        }
        cursor += MicField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!noteCodesBitField1.parse(data, cursor)) {
            return false;
        }
        cursor += NoteCodesBitField1Field.BYTE_LENGTH;
        if (!noteCodesBitField2.parse(data, cursor)) {
            return false;
        }
        cursor += NoteCodesBitField2Field.BYTE_LENGTH;
        if (!noteCodesBitField3.parse(data, cursor)) {
            return false;
        }
        cursor += NoteCodesBitField3Field.BYTE_LENGTH;
        if (!noteCodesBitField4.parse(data, cursor)) {
            return false;
        }
        cursor += NoteCodesBitField4Field.BYTE_LENGTH;
        if (!noteCodesBitField5.parse(data, cursor)) {
            return false;
        }
        cursor += NoteCodesBitField5Field.BYTE_LENGTH;
        if (!noteCodesBitField6.parse(data, cursor)) {
            return false;
        }
        cursor += NoteCodesBitField6Field.BYTE_LENGTH;
        if (!noteCodesBitField7.parse(data, cursor)) {
            return false;
        }
        cursor += NoteCodesBitField7Field.BYTE_LENGTH;
        if (!noteCodesBitField8.parse(data, cursor)) {
            return false;
        }
        cursor += NoteCodesBitField8Field.BYTE_LENGTH;
        if (!roundLotSize.parse(data, cursor)) {
            return false;
        }
        cursor += RoundLotSizeField.BYTE_LENGTH;
        if (!nordicMidMic.parse(data, cursor)) {
            return false;
        }
        cursor += NordicMidMicField.BYTE_LENGTH;
        if (!aodMic.parse(data, cursor)) {
            return false;
        }
        cursor += AodMicField.BYTE_LENGTH;
        if (!notationOfQty.parse(data, cursor)) {
            return false;
        }
        cursor += NotationOfQtyField.BYTE_LENGTH;
        if (!notionalAmount.parse(data, cursor)) {
            return false;
        }
        cursor += NotionalAmountField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!priceNotation.parse(data, cursor)) {
            return false;
        }
        cursor += PriceNotationField.BYTE_LENGTH;
        if (!multiplierForCalculatingQuantityInMeasurementUnit.parse(data, cursor)) {
            return false;
        }
        cursor += MultiplierForCalculatingQuantityInMeasurementUnitField.BYTE_LENGTH;
        return pureStreamMic.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = trackingNumber.encode(data, cursor);
        cursor = orderBook.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = isin.encode(data, cursor);
        cursor = financialProduct.encode(data, cursor);
        cursor = tradingCurrency.encode(data, cursor);
        cursor = mic.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = noteCodesBitField1.encode(data, cursor);
        cursor = noteCodesBitField2.encode(data, cursor);
        cursor = noteCodesBitField3.encode(data, cursor);
        cursor = noteCodesBitField4.encode(data, cursor);
        cursor = noteCodesBitField5.encode(data, cursor);
        cursor = noteCodesBitField6.encode(data, cursor);
        cursor = noteCodesBitField7.encode(data, cursor);
        cursor = noteCodesBitField8.encode(data, cursor);
        cursor = roundLotSize.encode(data, cursor);
        cursor = nordicMidMic.encode(data, cursor);
        cursor = aodMic.encode(data, cursor);
        cursor = notationOfQty.encode(data, cursor);
        cursor = notionalAmount.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = priceNotation.encode(data, cursor);
        cursor = multiplierForCalculatingQuantityInMeasurementUnit.encode(data, cursor);
        cursor = pureStreamMic.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "OrderBook" -> Optional.of(orderBook);
            case "Symbol" -> Optional.of(symbol);
            case "Isin" -> Optional.of(isin);
            case "FinancialProduct" -> Optional.of(financialProduct);
            case "TradingCurrency" -> Optional.of(tradingCurrency);
            case "Mic" -> Optional.of(mic);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "NoteCodesBitField1" -> Optional.of(noteCodesBitField1);
            case "NoteCodesBitField2" -> Optional.of(noteCodesBitField2);
            case "NoteCodesBitField3" -> Optional.of(noteCodesBitField3);
            case "NoteCodesBitField4" -> Optional.of(noteCodesBitField4);
            case "NoteCodesBitField5" -> Optional.of(noteCodesBitField5);
            case "NoteCodesBitField6" -> Optional.of(noteCodesBitField6);
            case "NoteCodesBitField7" -> Optional.of(noteCodesBitField7);
            case "NoteCodesBitField8" -> Optional.of(noteCodesBitField8);
            case "RoundLotSize" -> Optional.of(roundLotSize);
            case "NordicMidMic" -> Optional.of(nordicMidMic);
            case "AodMic" -> Optional.of(aodMic);
            case "NotationOfQty" -> Optional.of(notationOfQty);
            case "NotionalAmount" -> Optional.of(notionalAmount);
            case "Currency" -> Optional.of(currency);
            case "PriceNotation" -> Optional.of(priceNotation);
            case "MultiplierForCalculatingQuantityInMeasurementUnit" -> Optional.of(multiplierForCalculatingQuantityInMeasurementUnit);
            case "PureStreamMic" -> Optional.of(pureStreamMic);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderBookDirectoryMessage message)) {
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
        if (!(other instanceof OrderBookDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
