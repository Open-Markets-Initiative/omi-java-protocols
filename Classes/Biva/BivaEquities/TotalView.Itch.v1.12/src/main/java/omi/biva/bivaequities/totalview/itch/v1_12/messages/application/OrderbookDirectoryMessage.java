package omi.biva.bivaequities.totalview.itch.v1_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.CurrencyField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.DelistingOrMaturityDateField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.DelistingTimeField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.GroupField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.InstrumentField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.IsinField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.ListingExchangeField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.ListingTypeField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.MinimumQuantityField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.NanosecondsField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.OrderbookField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.PriceDecimalsField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.PriceTickSizeTableIdField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.QuantityDecimalsField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.QuantityTickSizeTableIdField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.QuotationBasisField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.SecCodeField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.TurnoverRatioField;
import omi.biva.bivaequities.totalview.itch.v1_12.types.Field;
import omi.biva.bivaequities.totalview.itch.v1_12.types.Message;
import omi.biva.bivaequities.totalview.itch.v1_12.types.PrintOptions;

/**
 * Represents the OrderbookDirectoryMessage message from the TotalView protocol.
 *
 * <p>Orderbook directory</p>
 */
public final class OrderbookDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 99;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Orderbook Directory Message";

    /**
     * Nanoseconds since last Time Stamp seconds message
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Used to identify if the event applies to a single orderbook within the Group
     */
    private final OrderbookField orderbook = new OrderbookField();

    /**
     * Isin code
     */
    private final IsinField isin = new IsinField();

    /**
     * Security code
     */
    private final SecCodeField secCode = new SecCodeField();

    /**
     * Trading currency
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Id for symbol grouping Board level only
     */
    private final GroupField group = new GroupField();

    /**
     * Minimum quantity
     */
    private final MinimumQuantityField minimumQuantity = new MinimumQuantityField();

    /**
     * Quantity tick size table cross reference
     */
    private final QuantityTickSizeTableIdField quantityTickSizeTableId = new QuantityTickSizeTableIdField();

    /**
     * Quantity decimals
     */
    private final QuantityDecimalsField quantityDecimals = new QuantityDecimalsField();

    /**
     * Price tick size table cross reference
     */
    private final PriceTickSizeTableIdField priceTickSizeTableId = new PriceTickSizeTableIdField();

    /**
     * Price decimals
     */
    private final PriceDecimalsField priceDecimals = new PriceDecimalsField();

    /**
     * Yyyymmdd, 0 represents no delisting date
     */
    private final DelistingOrMaturityDateField delistingOrMaturityDate = new DelistingOrMaturityDateField();

    /**
     * Hhmmss, ignore if delisting date is 0
     */
    private final DelistingTimeField delistingTime = new DelistingTimeField();

    /**
     * High, Medium or Low, blank if Opel-W
     */
    private final TurnoverRatioField turnoverRatio = new TurnoverRatioField();

    /**
     * Quotation basis indicator, blank if not set
     */
    private final QuotationBasisField quotationBasis = new QuotationBasisField();

    /**
     * The instrument name
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Regular or Sub-Rm securities
     */
    private final ListingTypeField listingType = new ListingTypeField();

    /**
     * Identifies the security listing exchange
     */
    private final ListingExchangeField listingExchange = new ListingExchangeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, orderbook, isin, secCode, currency, group, minimumQuantity, quantityTickSizeTableId, quantityDecimals, priceTickSizeTableId, priceDecimals, delistingOrMaturityDate, delistingTime, turnoverRatio, quotationBasis, instrument, listingType, listingExchange);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since last Time Stamp seconds message
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Used to identify if the event applies to a single orderbook within the Group
     *
     * @return the Orderbook field
     */
    public OrderbookField orderbook() {
        return orderbook;
    }

    /**
     * Isin code
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * Security code
     *
     * @return the SecCode field
     */
    public SecCodeField secCode() {
        return secCode;
    }

    /**
     * Trading currency
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Id for symbol grouping Board level only
     *
     * @return the Group field
     */
    public GroupField group() {
        return group;
    }

    /**
     * Minimum quantity
     *
     * @return the MinimumQuantity field
     */
    public MinimumQuantityField minimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Quantity tick size table cross reference
     *
     * @return the QuantityTickSizeTableId field
     */
    public QuantityTickSizeTableIdField quantityTickSizeTableId() {
        return quantityTickSizeTableId;
    }

    /**
     * Quantity decimals
     *
     * @return the QuantityDecimals field
     */
    public QuantityDecimalsField quantityDecimals() {
        return quantityDecimals;
    }

    /**
     * Price tick size table cross reference
     *
     * @return the PriceTickSizeTableId field
     */
    public PriceTickSizeTableIdField priceTickSizeTableId() {
        return priceTickSizeTableId;
    }

    /**
     * Price decimals
     *
     * @return the PriceDecimals field
     */
    public PriceDecimalsField priceDecimals() {
        return priceDecimals;
    }

    /**
     * Yyyymmdd, 0 represents no delisting date
     *
     * @return the DelistingOrMaturityDate field
     */
    public DelistingOrMaturityDateField delistingOrMaturityDate() {
        return delistingOrMaturityDate;
    }

    /**
     * Hhmmss, ignore if delisting date is 0
     *
     * @return the DelistingTime field
     */
    public DelistingTimeField delistingTime() {
        return delistingTime;
    }

    /**
     * High, Medium or Low, blank if Opel-W
     *
     * @return the TurnoverRatio field
     */
    public TurnoverRatioField turnoverRatio() {
        return turnoverRatio;
    }

    /**
     * Quotation basis indicator, blank if not set
     *
     * @return the QuotationBasis field
     */
    public QuotationBasisField quotationBasis() {
        return quotationBasis;
    }

    /**
     * The instrument name
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * Regular or Sub-Rm securities
     *
     * @return the ListingType field
     */
    public ListingTypeField listingType() {
        return listingType;
    }

    /**
     * Identifies the security listing exchange
     *
     * @return the ListingExchange field
     */
    public ListingExchangeField listingExchange() {
        return listingExchange;
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
        if (!quantityDecimals.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityDecimalsField.BYTE_LENGTH;
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
        if (!delistingTime.parse(data, cursor)) {
            return false;
        }
        cursor += DelistingTimeField.BYTE_LENGTH;
        if (!turnoverRatio.parse(data, cursor)) {
            return false;
        }
        cursor += TurnoverRatioField.BYTE_LENGTH;
        if (!quotationBasis.parse(data, cursor)) {
            return false;
        }
        cursor += QuotationBasisField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!listingType.parse(data, cursor)) {
            return false;
        }
        cursor += ListingTypeField.BYTE_LENGTH;
        return listingExchange.parse(data, cursor);
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
        cursor = quantityDecimals.encode(data, cursor);
        cursor = priceTickSizeTableId.encode(data, cursor);
        cursor = priceDecimals.encode(data, cursor);
        cursor = delistingOrMaturityDate.encode(data, cursor);
        cursor = delistingTime.encode(data, cursor);
        cursor = turnoverRatio.encode(data, cursor);
        cursor = quotationBasis.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = listingType.encode(data, cursor);
        cursor = listingExchange.encode(data, cursor);
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
            case "QuantityDecimals" -> Optional.of(quantityDecimals);
            case "PriceTickSizeTableId" -> Optional.of(priceTickSizeTableId);
            case "PriceDecimals" -> Optional.of(priceDecimals);
            case "DelistingOrMaturityDate" -> Optional.of(delistingOrMaturityDate);
            case "DelistingTime" -> Optional.of(delistingTime);
            case "TurnoverRatio" -> Optional.of(turnoverRatio);
            case "QuotationBasis" -> Optional.of(quotationBasis);
            case "Instrument" -> Optional.of(instrument);
            case "ListingType" -> Optional.of(listingType);
            case "ListingExchange" -> Optional.of(listingExchange);
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
