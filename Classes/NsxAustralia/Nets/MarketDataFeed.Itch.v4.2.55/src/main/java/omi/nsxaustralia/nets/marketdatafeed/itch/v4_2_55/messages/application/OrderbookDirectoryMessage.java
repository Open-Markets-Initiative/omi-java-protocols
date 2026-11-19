package omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.AssetTypeField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.BoardField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.CurrencyField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.ExpiryField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.IsinField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.ListingField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.MinimumQuantityField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.OrderbookField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.PriceDecimalsField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.PriceTickSizeTableIdField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.ProductField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.QuantityDecimalsField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.QuantityTickSizeTableIdField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.ReferenceAlphaField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.RemarksField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.SecurityCodeField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.SecurityNameField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.SettleDateField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.fields.TimestampField;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.types.Field;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.types.Message;
import omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.types.PrintOptions;

/**
 * Represents the OrderbookDirectoryMessage message from the MarketDataFeed protocol.
 *
 * <p>Orderbook Directory Messages are transmitted during the reference data spin. Static data messages are sent at the beginning of the feed and contain exchange reference information.</p>
 */
public final class OrderbookDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 320;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Orderbook Directory Message";

    /**
     * Nanoseconds since last ITCH Timestamp "T" message.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Identifies the Orderbook for which this event applies. Set to 0 if not at Orderbook level.
     */
    private final OrderbookField orderbook = new OrderbookField();

    /**
     * ISIN Code. Left blank if not applicable.
     */
    private final IsinField isin = new IsinField();

    /**
     * Unique text identifier for the security.
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Descriptive name for the security.
     */
    private final SecurityNameField securityName = new SecurityNameField();

    /**
     * Trading currency.
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Identifies the Board this orderbook trades on.
     */
    private final BoardField board = new BoardField();

    /**
     * Identifies the Product for which this event applies. Left blank if not at Product level.
     */
    private final ProductField product = new ProductField();

    /**
     * Minimum order quantity. Maximum value indicates non-tradeable.
     */
    private final MinimumQuantityField minimumQuantity = new MinimumQuantityField();

    /**
     * Cross-reference to Quantity Tick Size [M] messages.
     */
    private final QuantityTickSizeTableIdField quantityTickSizeTableId = new QuantityTickSizeTableIdField();

    /**
     * Decimals for quantity field decoding. Quantity = Integer / 10^QuantityDecimals.
     */
    private final QuantityDecimalsField quantityDecimals = new QuantityDecimalsField();

    /**
     * Cross-reference to Price Tick Size [L] messages.
     */
    private final PriceTickSizeTableIdField priceTickSizeTableId = new PriceTickSizeTableIdField();

    /**
     * Decimals for price field decoding. Price = Integer / 10^PriceDecimals.
     */
    private final PriceDecimalsField priceDecimals = new PriceDecimalsField();

    /**
     * Listing date/time in YYYYMMDDHHMMSS format. Zero indicates none.
     */
    private final ListingField listing = new ListingField();

    /**
     * Expiry/delist date/time in YYYYMMDDHHMMSS format. Zero indicates none.
     */
    private final ExpiryField expiry = new ExpiryField();

    /**
     * Asset type code. Blank if not applicable.
     */
    private final AssetTypeField assetType = new AssetTypeField();

    /**
     * Settlement date in YYYYMMDD format.
     */
    private final SettleDateField settleDate = new SettleDateField();

    /**
     * Reserved for future use.
     */
    private final ReferenceAlphaField referenceAlpha = new ReferenceAlphaField();

    /**
     * Security board remarks for conditional markets.
     */
    private final RemarksField remarks = new RemarksField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, orderbook, isin, securityCode, securityName, currency, board, product, minimumQuantity, quantityTickSizeTableId, quantityDecimals, priceTickSizeTableId, priceDecimals, listing, expiry, assetType, settleDate, referenceAlpha, remarks);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since last ITCH Timestamp "T" message.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Identifies the Orderbook for which this event applies. Set to 0 if not at Orderbook level.
     *
     * @return the Orderbook field
     */
    public OrderbookField orderbook() {
        return orderbook;
    }

    /**
     * ISIN Code. Left blank if not applicable.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * Unique text identifier for the security.
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Descriptive name for the security.
     *
     * @return the SecurityName field
     */
    public SecurityNameField securityName() {
        return securityName;
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
     * Identifies the Board this orderbook trades on.
     *
     * @return the Board field
     */
    public BoardField board() {
        return board;
    }

    /**
     * Identifies the Product for which this event applies. Left blank if not at Product level.
     *
     * @return the Product field
     */
    public ProductField product() {
        return product;
    }

    /**
     * Minimum order quantity. Maximum value indicates non-tradeable.
     *
     * @return the MinimumQuantity field
     */
    public MinimumQuantityField minimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Cross-reference to Quantity Tick Size [M] messages.
     *
     * @return the QuantityTickSizeTableId field
     */
    public QuantityTickSizeTableIdField quantityTickSizeTableId() {
        return quantityTickSizeTableId;
    }

    /**
     * Decimals for quantity field decoding. Quantity = Integer / 10^QuantityDecimals.
     *
     * @return the QuantityDecimals field
     */
    public QuantityDecimalsField quantityDecimals() {
        return quantityDecimals;
    }

    /**
     * Cross-reference to Price Tick Size [L] messages.
     *
     * @return the PriceTickSizeTableId field
     */
    public PriceTickSizeTableIdField priceTickSizeTableId() {
        return priceTickSizeTableId;
    }

    /**
     * Decimals for price field decoding. Price = Integer / 10^PriceDecimals.
     *
     * @return the PriceDecimals field
     */
    public PriceDecimalsField priceDecimals() {
        return priceDecimals;
    }

    /**
     * Listing date/time in YYYYMMDDHHMMSS format. Zero indicates none.
     *
     * @return the Listing field
     */
    public ListingField listing() {
        return listing;
    }

    /**
     * Expiry/delist date/time in YYYYMMDDHHMMSS format. Zero indicates none.
     *
     * @return the Expiry field
     */
    public ExpiryField expiry() {
        return expiry;
    }

    /**
     * Asset type code. Blank if not applicable.
     *
     * @return the AssetType field
     */
    public AssetTypeField assetType() {
        return assetType;
    }

    /**
     * Settlement date in YYYYMMDD format.
     *
     * @return the SettleDate field
     */
    public SettleDateField settleDate() {
        return settleDate;
    }

    /**
     * Reserved for future use.
     *
     * @return the ReferenceAlpha field
     */
    public ReferenceAlphaField referenceAlpha() {
        return referenceAlpha;
    }

    /**
     * Security board remarks for conditional markets.
     *
     * @return the Remarks field
     */
    public RemarksField remarks() {
        return remarks;
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
        if (!orderbook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderbookField.BYTE_LENGTH;
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!securityName.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityNameField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!board.parse(data, cursor)) {
            return false;
        }
        cursor += BoardField.BYTE_LENGTH;
        if (!product.parse(data, cursor)) {
            return false;
        }
        cursor += ProductField.BYTE_LENGTH;
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
        if (!listing.parse(data, cursor)) {
            return false;
        }
        cursor += ListingField.BYTE_LENGTH;
        if (!expiry.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryField.BYTE_LENGTH;
        if (!assetType.parse(data, cursor)) {
            return false;
        }
        cursor += AssetTypeField.BYTE_LENGTH;
        if (!settleDate.parse(data, cursor)) {
            return false;
        }
        cursor += SettleDateField.BYTE_LENGTH;
        if (!referenceAlpha.parse(data, cursor)) {
            return false;
        }
        cursor += ReferenceAlphaField.BYTE_LENGTH;
        return remarks.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = orderbook.encode(data, cursor);
        cursor = isin.encode(data, cursor);
        cursor = securityCode.encode(data, cursor);
        cursor = securityName.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = board.encode(data, cursor);
        cursor = product.encode(data, cursor);
        cursor = minimumQuantity.encode(data, cursor);
        cursor = quantityTickSizeTableId.encode(data, cursor);
        cursor = quantityDecimals.encode(data, cursor);
        cursor = priceTickSizeTableId.encode(data, cursor);
        cursor = priceDecimals.encode(data, cursor);
        cursor = listing.encode(data, cursor);
        cursor = expiry.encode(data, cursor);
        cursor = assetType.encode(data, cursor);
        cursor = settleDate.encode(data, cursor);
        cursor = referenceAlpha.encode(data, cursor);
        cursor = remarks.encode(data, cursor);
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
            case "Orderbook" -> Optional.of(orderbook);
            case "Isin" -> Optional.of(isin);
            case "SecurityCode" -> Optional.of(securityCode);
            case "SecurityName" -> Optional.of(securityName);
            case "Currency" -> Optional.of(currency);
            case "Board" -> Optional.of(board);
            case "Product" -> Optional.of(product);
            case "MinimumQuantity" -> Optional.of(minimumQuantity);
            case "QuantityTickSizeTableId" -> Optional.of(quantityTickSizeTableId);
            case "QuantityDecimals" -> Optional.of(quantityDecimals);
            case "PriceTickSizeTableId" -> Optional.of(priceTickSizeTableId);
            case "PriceDecimals" -> Optional.of(priceDecimals);
            case "Listing" -> Optional.of(listing);
            case "Expiry" -> Optional.of(expiry);
            case "AssetType" -> Optional.of(assetType);
            case "SettleDate" -> Optional.of(settleDate);
            case "ReferenceAlpha" -> Optional.of(referenceAlpha);
            case "Remarks" -> Optional.of(remarks);
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
