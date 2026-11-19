package omi.cnsx.cse2.multicast.mmd.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.CurrencyField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.CusipField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.ExpiryField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.FullSecNameField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.ListingField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.ListingMarketField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.ListingTierField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.LotSizeField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.MarketMakerNameField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.MarketMakerPhoneNumberField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.PreviousClosingPriceField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.SecNameField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.SettlementTermField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.StockGroupField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.SymbolField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.TimeOffsetField;
import omi.cnsx.cse2.multicast.mmd.v1_6.types.Field;
import omi.cnsx.cse2.multicast.mmd.v1_6.types.Message;
import omi.cnsx.cse2.multicast.mmd.v1_6.types.PrintOptions;

/**
 * Represents the SymbolDirectoryMessage message from the Multicast protocol.
 *
 * <p>Static properties of a symbol. Sent for every symbol in the morning, and again during the day if a symbol changes.</p>
 */
public final class SymbolDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 195;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Symbol Directory Message";

    /**
     * Nanoseconds since last Timestamp-Seconds message.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * CUSIP code.
     */
    private final CusipField cusip = new CusipField();

    /**
     * Short security name.
     */
    private final SecNameField secName = new SecNameField();

    /**
     * Trading currency.
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Stock Group.
     */
    private final StockGroupField stockGroup = new StockGroupField();

    /**
     * YYYYMMDD. 0 represents no listing date.
     */
    private final ListingField listing = new ListingField();

    /**
     * YYYYMMDD. 0 represents no expiry date.
     */
    private final ExpiryField expiry = new ExpiryField();

    /**
     * Lot size for the Symbol. Based on Reference price, lot size will be calculated at Start of Day.
     */
    private final LotSizeField lotSize = new LotSizeField();

    /**
     * Override Settlement Term. "T" = Cash Today (T+0), "N" = Non-Net, "R" = Non-Resident, or a Special Settlement Date in YYYYMMDD format. Left blank " " if default settlement.
     */
    private final SettlementTermField settlementTerm = new SettlementTermField();

    /**
     * Listing market of the security.
     */
    private final ListingMarketField listingMarket = new ListingMarketField();

    /**
     * Adjusted previous closing price.
     */
    private final PreviousClosingPriceField previousClosingPrice = new PreviousClosingPriceField();

    /**
     * Listing tier of the security.
     */
    private final ListingTierField listingTier = new ListingTierField();

    /**
     * Market Maker name.
     */
    private final MarketMakerNameField marketMakerName = new MarketMakerNameField();

    /**
     * Market Maker phone number.
     */
    private final MarketMakerPhoneNumberField marketMakerPhoneNumber = new MarketMakerPhoneNumberField();

    /**
     * Long security name.
     */
    private final FullSecNameField fullSecName = new FullSecNameField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, symbol, cusip, secName, currency, stockGroup, listing, expiry, lotSize, settlementTerm, listingMarket, previousClosingPrice, listingTier, marketMakerName, marketMakerPhoneNumber, fullSecName);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since last Timestamp-Seconds message.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Symbol.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * CUSIP code.
     *
     * @return the Cusip field
     */
    public CusipField cusip() {
        return cusip;
    }

    /**
     * Short security name.
     *
     * @return the SecName field
     */
    public SecNameField secName() {
        return secName;
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
     * Stock Group.
     *
     * @return the StockGroup field
     */
    public StockGroupField stockGroup() {
        return stockGroup;
    }

    /**
     * YYYYMMDD. 0 represents no listing date.
     *
     * @return the Listing field
     */
    public ListingField listing() {
        return listing;
    }

    /**
     * YYYYMMDD. 0 represents no expiry date.
     *
     * @return the Expiry field
     */
    public ExpiryField expiry() {
        return expiry;
    }

    /**
     * Lot size for the Symbol. Based on Reference price, lot size will be calculated at Start of Day.
     *
     * @return the LotSize field
     */
    public LotSizeField lotSize() {
        return lotSize;
    }

    /**
     * Override Settlement Term. "T" = Cash Today (T+0), "N" = Non-Net, "R" = Non-Resident, or a Special Settlement Date in YYYYMMDD format. Left blank " " if default settlement.
     *
     * @return the SettlementTerm field
     */
    public SettlementTermField settlementTerm() {
        return settlementTerm;
    }

    /**
     * Listing market of the security.
     *
     * @return the ListingMarket field
     */
    public ListingMarketField listingMarket() {
        return listingMarket;
    }

    /**
     * Adjusted previous closing price.
     *
     * @return the PreviousClosingPrice field
     */
    public PreviousClosingPriceField previousClosingPrice() {
        return previousClosingPrice;
    }

    /**
     * Listing tier of the security.
     *
     * @return the ListingTier field
     */
    public ListingTierField listingTier() {
        return listingTier;
    }

    /**
     * Market Maker name.
     *
     * @return the MarketMakerName field
     */
    public MarketMakerNameField marketMakerName() {
        return marketMakerName;
    }

    /**
     * Market Maker phone number.
     *
     * @return the MarketMakerPhoneNumber field
     */
    public MarketMakerPhoneNumberField marketMakerPhoneNumber() {
        return marketMakerPhoneNumber;
    }

    /**
     * Long security name.
     *
     * @return the FullSecName field
     */
    public FullSecNameField fullSecName() {
        return fullSecName;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!cusip.parse(data, cursor)) {
            return false;
        }
        cursor += CusipField.BYTE_LENGTH;
        if (!secName.parse(data, cursor)) {
            return false;
        }
        cursor += SecNameField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!stockGroup.parse(data, cursor)) {
            return false;
        }
        cursor += StockGroupField.BYTE_LENGTH;
        if (!listing.parse(data, cursor)) {
            return false;
        }
        cursor += ListingField.BYTE_LENGTH;
        if (!expiry.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryField.BYTE_LENGTH;
        if (!lotSize.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeField.BYTE_LENGTH;
        if (!settlementTerm.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTermField.BYTE_LENGTH;
        if (!listingMarket.parse(data, cursor)) {
            return false;
        }
        cursor += ListingMarketField.BYTE_LENGTH;
        if (!previousClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousClosingPriceField.BYTE_LENGTH;
        if (!listingTier.parse(data, cursor)) {
            return false;
        }
        cursor += ListingTierField.BYTE_LENGTH;
        if (!marketMakerName.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMakerNameField.BYTE_LENGTH;
        if (!marketMakerPhoneNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMakerPhoneNumberField.BYTE_LENGTH;
        return fullSecName.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = cusip.encode(data, cursor);
        cursor = secName.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = stockGroup.encode(data, cursor);
        cursor = listing.encode(data, cursor);
        cursor = expiry.encode(data, cursor);
        cursor = lotSize.encode(data, cursor);
        cursor = settlementTerm.encode(data, cursor);
        cursor = listingMarket.encode(data, cursor);
        cursor = previousClosingPrice.encode(data, cursor);
        cursor = listingTier.encode(data, cursor);
        cursor = marketMakerName.encode(data, cursor);
        cursor = marketMakerPhoneNumber.encode(data, cursor);
        cursor = fullSecName.encode(data, cursor);
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "Symbol" -> Optional.of(symbol);
            case "Cusip" -> Optional.of(cusip);
            case "SecName" -> Optional.of(secName);
            case "Currency" -> Optional.of(currency);
            case "StockGroup" -> Optional.of(stockGroup);
            case "Listing" -> Optional.of(listing);
            case "Expiry" -> Optional.of(expiry);
            case "LotSize" -> Optional.of(lotSize);
            case "SettlementTerm" -> Optional.of(settlementTerm);
            case "ListingMarket" -> Optional.of(listingMarket);
            case "PreviousClosingPrice" -> Optional.of(previousClosingPrice);
            case "ListingTier" -> Optional.of(listingTier);
            case "MarketMakerName" -> Optional.of(marketMakerName);
            case "MarketMakerPhoneNumber" -> Optional.of(marketMakerPhoneNumber);
            case "FullSecName" -> Optional.of(fullSecName);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SymbolDirectoryMessage message)) {
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
        if (!(other instanceof SymbolDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
