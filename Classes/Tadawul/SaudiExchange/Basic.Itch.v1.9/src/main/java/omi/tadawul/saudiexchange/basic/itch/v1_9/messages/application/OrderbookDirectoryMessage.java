package omi.tadawul.saudiexchange.basic.itch.v1_9.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.CurrencyField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.DelistingOrMaturityDateField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.GroupField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.InstrumentField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.IsinField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.MinimumQuantityField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.NanosecondsField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.OpenInterestField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.OrderbookField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.PriceDecimalsField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.PriceTickSizeTableIdField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.PutCallField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.QuantityTickSizeTableIdField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.QuotationBasisField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.SecCodeField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.StrikeIntervalField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.StrikePriceDecimalField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.StrikePriceField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.UnderlyingOrderbookField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.fields.YieldDecimalsField;
import omi.tadawul.saudiexchange.basic.itch.v1_9.types.Field;
import omi.tadawul.saudiexchange.basic.itch.v1_9.types.Message;
import omi.tadawul.saudiexchange.basic.itch.v1_9.types.PrintOptions;

/**
 * Represents the OrderbookDirectoryMessage message from the Basic protocol.
 *
 * <p>Reference data for an Orderbook.</p>
 */
public final class OrderbookDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 214;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Orderbook Directory Message";

    /**
     * Nanoseconds since last Time Stamp seconds message (see section 5.1).
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Used to identify if the event applies to a single orderbook within the Group. Set to 0 if the event does not apply at Orderbook level.
     */
    private final OrderbookField orderbook = new OrderbookField();

    /**
     * ISIN code.
     */
    private final IsinField isin = new IsinField();

    /**
     * Security code.
     */
    private final SecCodeField secCode = new SecCodeField();

    /**
     * Trading currency.
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * ID for symbol grouping (i.e. Board). Will be blank (i.e. padded with spaces) if the event applies at system level (i.e. it does not apply to a Group).
     */
    private final GroupField group = new GroupField();

    /**
     * Minimum Quantity.
     */
    private final MinimumQuantityField minimumQuantity = new MinimumQuantityField();

    /**
     * Indicates the Tick Size Table id. Referenced by Orderbook Directory [R] messages.
     */
    private final QuantityTickSizeTableIdField quantityTickSizeTableId = new QuantityTickSizeTableIdField();

    /**
     * Indicates the Tick Size Table id. Referenced by Orderbook Directory [R] messages.
     */
    private final PriceTickSizeTableIdField priceTickSizeTableId = new PriceTickSizeTableIdField();

    /**
     * The number of decimals for Price values in subsequent messages for this Orderbook.
     */
    private final PriceDecimalsField priceDecimals = new PriceDecimalsField();

    /**
     * YYYYMMDD.
     */
    private final DelistingOrMaturityDateField delistingOrMaturityDate = new DelistingOrMaturityDateField();

    /**
     * Quotation Basis indicator. Blank if not set.
     */
    private final QuotationBasisField quotationBasis = new QuotationBasisField();

    /**
     * The instrument type code.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Unique orderbook for underlying market identifier.
     */
    private final UnderlyingOrderbookField underlyingOrderbook = new UnderlyingOrderbookField();

    /**
     * The strike price for the Option. This field uses the StrikePriceDecimal field for decoding (Refer to section 2.1).
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * The strike price interval for the Option. A strike price interval describes the minimum price step for strike price. A value of 0.05 means a strike price of 1.05 or 1.10 is valid, not 1.01. This field uses the StrikePriceDecimal field for decoding (Refer to section 2.1).
     */
    private final StrikeIntervalField strikeInterval = new StrikeIntervalField();

    /**
     * The number of decimals for the StrikePrice and StrikeInterval fields in this message.
     */
    private final StrikePriceDecimalField strikePriceDecimal = new StrikePriceDecimalField();

    /**
     * 'P' for put, 'C' for call options. '&lt;space&gt;' for no put or call.
     */
    private final PutCallField putCall = new PutCallField();

    /**
     * The number of decimals for Yield values in subsequent messages for this Orderbook.
     */
    private final YieldDecimalsField yieldDecimals = new YieldDecimalsField();

    /**
     * The level of Open Interest for the security.
     */
    private final OpenInterestField openInterest = new OpenInterestField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, orderbook, isin, secCode, currency, group, minimumQuantity, quantityTickSizeTableId, priceTickSizeTableId, priceDecimals, delistingOrMaturityDate, quotationBasis, instrument, underlyingOrderbook, strikePrice, strikeInterval, strikePriceDecimal, putCall, yieldDecimals, openInterest);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since last Time Stamp seconds message (see section 5.1).
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Used to identify if the event applies to a single orderbook within the Group. Set to 0 if the event does not apply at Orderbook level.
     *
     * @return the Orderbook field
     */
    public OrderbookField orderbook() {
        return orderbook;
    }

    /**
     * ISIN code.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * Security code.
     *
     * @return the SecCode field
     */
    public SecCodeField secCode() {
        return secCode;
    }

    /**
     * Trading currency.
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * ID for symbol grouping (i.e. Board). Will be blank (i.e. padded with spaces) if the event applies at system level (i.e. it does not apply to a Group).
     *
     * @return the Group field
     */
    public GroupField group() {
        return group;
    }

    /**
     * Minimum Quantity.
     *
     * @return the MinimumQuantity field
     */
    public MinimumQuantityField minimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Indicates the Tick Size Table id. Referenced by Orderbook Directory [R] messages.
     *
     * @return the QuantityTickSizeTableId field
     */
    public QuantityTickSizeTableIdField quantityTickSizeTableId() {
        return quantityTickSizeTableId;
    }

    /**
     * Indicates the Tick Size Table id. Referenced by Orderbook Directory [R] messages.
     *
     * @return the PriceTickSizeTableId field
     */
    public PriceTickSizeTableIdField priceTickSizeTableId() {
        return priceTickSizeTableId;
    }

    /**
     * The number of decimals for Price values in subsequent messages for this Orderbook.
     *
     * @return the PriceDecimals field
     */
    public PriceDecimalsField priceDecimals() {
        return priceDecimals;
    }

    /**
     * YYYYMMDD.
     *
     * @return the DelistingOrMaturityDate field
     */
    public DelistingOrMaturityDateField delistingOrMaturityDate() {
        return delistingOrMaturityDate;
    }

    /**
     * Quotation Basis indicator. Blank if not set.
     *
     * @return the QuotationBasis field
     */
    public QuotationBasisField quotationBasis() {
        return quotationBasis;
    }

    /**
     * The instrument type code.
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * Unique orderbook for underlying market identifier.
     *
     * @return the UnderlyingOrderbook field
     */
    public UnderlyingOrderbookField underlyingOrderbook() {
        return underlyingOrderbook;
    }

    /**
     * The strike price for the Option. This field uses the StrikePriceDecimal field for decoding (Refer to section 2.1).
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * The strike price interval for the Option. A strike price interval describes the minimum price step for strike price. A value of 0.05 means a strike price of 1.05 or 1.10 is valid, not 1.01. This field uses the StrikePriceDecimal field for decoding (Refer to section 2.1).
     *
     * @return the StrikeInterval field
     */
    public StrikeIntervalField strikeInterval() {
        return strikeInterval;
    }

    /**
     * The number of decimals for the StrikePrice and StrikeInterval fields in this message.
     *
     * @return the StrikePriceDecimal field
     */
    public StrikePriceDecimalField strikePriceDecimal() {
        return strikePriceDecimal;
    }

    /**
     * 'P' for put, 'C' for call options. '&lt;space&gt;' for no put or call.
     *
     * @return the PutCall field
     */
    public PutCallField putCall() {
        return putCall;
    }

    /**
     * The number of decimals for Yield values in subsequent messages for this Orderbook.
     *
     * @return the YieldDecimals field
     */
    public YieldDecimalsField yieldDecimals() {
        return yieldDecimals;
    }

    /**
     * The level of Open Interest for the security.
     *
     * @return the OpenInterest field
     */
    public OpenInterestField openInterest() {
        return openInterest;
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
        if (!orderbook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderbookField.BYTE_LENGTH;
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!secCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecCodeField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!group.parse(data, cursor)) {
            return false;
        }
        cursor += GroupField.BYTE_LENGTH;
        if (!minimumQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumQuantityField.BYTE_LENGTH;
        if (!quantityTickSizeTableId.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityTickSizeTableIdField.BYTE_LENGTH;
        if (!priceTickSizeTableId.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTickSizeTableIdField.BYTE_LENGTH;
        if (!priceDecimals.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDecimalsField.BYTE_LENGTH;
        if (!delistingOrMaturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += DelistingOrMaturityDateField.BYTE_LENGTH;
        if (!quotationBasis.parse(data, cursor)) {
            return false;
        }
        cursor += QuotationBasisField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!underlyingOrderbook.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingOrderbookField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!strikeInterval.parse(data, cursor)) {
            return false;
        }
        cursor += StrikeIntervalField.BYTE_LENGTH;
        if (!strikePriceDecimal.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceDecimalField.BYTE_LENGTH;
        if (!putCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutCallField.BYTE_LENGTH;
        if (!yieldDecimals.parse(data, cursor)) {
            return false;
        }
        cursor += YieldDecimalsField.BYTE_LENGTH;
        return openInterest.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = orderbook.encode(data, cursor);
        cursor = isin.encode(data, cursor);
        cursor = secCode.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = group.encode(data, cursor);
        cursor = minimumQuantity.encode(data, cursor);
        cursor = quantityTickSizeTableId.encode(data, cursor);
        cursor = priceTickSizeTableId.encode(data, cursor);
        cursor = priceDecimals.encode(data, cursor);
        cursor = delistingOrMaturityDate.encode(data, cursor);
        cursor = quotationBasis.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = underlyingOrderbook.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = strikeInterval.encode(data, cursor);
        cursor = strikePriceDecimal.encode(data, cursor);
        cursor = putCall.encode(data, cursor);
        cursor = yieldDecimals.encode(data, cursor);
        cursor = openInterest.encode(data, cursor);
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
            case "Orderbook" -> Optional.of(orderbook);
            case "Isin" -> Optional.of(isin);
            case "SecCode" -> Optional.of(secCode);
            case "Currency" -> Optional.of(currency);
            case "Group" -> Optional.of(group);
            case "MinimumQuantity" -> Optional.of(minimumQuantity);
            case "QuantityTickSizeTableId" -> Optional.of(quantityTickSizeTableId);
            case "PriceTickSizeTableId" -> Optional.of(priceTickSizeTableId);
            case "PriceDecimals" -> Optional.of(priceDecimals);
            case "DelistingOrMaturityDate" -> Optional.of(delistingOrMaturityDate);
            case "QuotationBasis" -> Optional.of(quotationBasis);
            case "Instrument" -> Optional.of(instrument);
            case "UnderlyingOrderbook" -> Optional.of(underlyingOrderbook);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "StrikeInterval" -> Optional.of(strikeInterval);
            case "StrikePriceDecimal" -> Optional.of(strikePriceDecimal);
            case "PutCall" -> Optional.of(putCall);
            case "YieldDecimals" -> Optional.of(yieldDecimals);
            case "OpenInterest" -> Optional.of(openInterest);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderbookDirectoryMessage message)) {
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
        if (!(other instanceof OrderbookDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
