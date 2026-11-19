package omi.tmx.tsx.level1.qrtmd.v2_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.BuyerIdField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.BypassField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.CrossTypeField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.IsConditionalField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.IsDarkField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.IsMidOnlyField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.LastSaleField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.ListingMarketField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.MocField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.OpeningTradeField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.ProductTypeField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.SellerIdField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.SettlementTermsField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.SymbolField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.TradeDateField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.TradeIdField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.TradePriceField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.TradeTimeStampField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.TradingSystemTimeStampField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.VolumeField;
import omi.tmx.tsx.level1.qrtmd.v2_8.types.Field;
import omi.tmx.tsx.level1.qrtmd.v2_8.types.Message;
import omi.tmx.tsx.level1.qrtmd.v2_8.types.PrintOptions;

/**
 * Represents the TradeMessage message from the Level1 protocol.
 *
 * <p>A trade in an equity on the Tsx or Tsx Venture market.</p>
 */
public final class TradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 105;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Message";

    /**
     * Stock symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Volume of shares traded.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Price at which the transaction took place.
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * Identifies the buying broker.
     */
    private final BuyerIdField buyerId = new BuyerIdField();

    /**
     * Identifies the selling broker.
     */
    private final SellerIdField sellerId = new SellerIdField();

    /**
     * Time of trade.
     */
    private final TradeTimeStampField tradeTimeStamp = new TradeTimeStampField();

    /**
     * Last sale price of the symbol.
     */
    private final LastSaleField lastSale = new LastSaleField();

    /**
     * Unique identifier per stock assigned to each trade.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Identifies the type of an intentional cross.
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * Marks a Market On Close trade.
     */
    private final MocField moc = new MocField();

    /**
     * An indicator for bypass crosses, which can be printed outside of the Protected NBBO and are not subject to cross interference.
     */
    private final BypassField bypass = new BypassField();

    /**
     * An indicator as to whether the trade occurred at the opening or was the first board lot trade of the day.
     */
    private final OpeningTradeField openingTrade = new OpeningTradeField();

    /**
     * Settlement terms associated with the order.
     */
    private final SettlementTermsField settlementTerms = new SettlementTermsField();

    /**
     * The time at which the business action occurred.
     */
    private final TradingSystemTimeStampField tradingSystemTimeStamp = new TradingSystemTimeStampField();

    /**
     * The market on which a security is listed.
     */
    private final ListingMarketField listingMarket = new ListingMarketField();

    /**
     * The product type for a symbol.
     */
    private final ProductTypeField productType = new ProductTypeField();

    /**
     * Effective date of the trade, filled in only when it differs from the current date.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Indicates a dark Contra Midpoint Only Plus to Contra Midpoint Only Plus execution.
     */
    private final IsMidOnlyField isMidOnly = new IsMidOnlyField();

    /**
     * Indicates the passive side of the trade is dark.
     */
    private final IsDarkField isDark = new IsDarkField();

    /**
     * Indicates a firm-up conditional to firm-up conditional execution.
     */
    private final IsConditionalField isConditional = new IsConditionalField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbol, volume, tradePrice, buyerId, sellerId, tradeTimeStamp, lastSale, tradeId, crossType, moc, bypass, openingTrade, settlementTerms, tradingSystemTimeStamp, listingMarket, productType, tradeDate, isMidOnly, isDark, isConditional);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Stock symbol.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Volume of shares traded.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Price at which the transaction took place.
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * Identifies the buying broker.
     *
     * @return the BuyerId field
     */
    public BuyerIdField buyerId() {
        return buyerId;
    }

    /**
     * Identifies the selling broker.
     *
     * @return the SellerId field
     */
    public SellerIdField sellerId() {
        return sellerId;
    }

    /**
     * Time of trade.
     *
     * @return the TradeTimeStamp field
     */
    public TradeTimeStampField tradeTimeStamp() {
        return tradeTimeStamp;
    }

    /**
     * Last sale price of the symbol.
     *
     * @return the LastSale field
     */
    public LastSaleField lastSale() {
        return lastSale;
    }

    /**
     * Unique identifier per stock assigned to each trade.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Identifies the type of an intentional cross.
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * Marks a Market On Close trade.
     *
     * @return the Moc field
     */
    public MocField moc() {
        return moc;
    }

    /**
     * An indicator for bypass crosses, which can be printed outside of the Protected NBBO and are not subject to cross interference.
     *
     * @return the Bypass field
     */
    public BypassField bypass() {
        return bypass;
    }

    /**
     * An indicator as to whether the trade occurred at the opening or was the first board lot trade of the day.
     *
     * @return the OpeningTrade field
     */
    public OpeningTradeField openingTrade() {
        return openingTrade;
    }

    /**
     * Settlement terms associated with the order.
     *
     * @return the SettlementTerms field
     */
    public SettlementTermsField settlementTerms() {
        return settlementTerms;
    }

    /**
     * The time at which the business action occurred.
     *
     * @return the TradingSystemTimeStamp field
     */
    public TradingSystemTimeStampField tradingSystemTimeStamp() {
        return tradingSystemTimeStamp;
    }

    /**
     * The market on which a security is listed.
     *
     * @return the ListingMarket field
     */
    public ListingMarketField listingMarket() {
        return listingMarket;
    }

    /**
     * The product type for a symbol.
     *
     * @return the ProductType field
     */
    public ProductTypeField productType() {
        return productType;
    }

    /**
     * Effective date of the trade, filled in only when it differs from the current date.
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Indicates a dark Contra Midpoint Only Plus to Contra Midpoint Only Plus execution.
     *
     * @return the IsMidOnly field
     */
    public IsMidOnlyField isMidOnly() {
        return isMidOnly;
    }

    /**
     * Indicates the passive side of the trade is dark.
     *
     * @return the IsDark field
     */
    public IsDarkField isDark() {
        return isDark;
    }

    /**
     * Indicates a firm-up conditional to firm-up conditional execution.
     *
     * @return the IsConditional field
     */
    public IsConditionalField isConditional() {
        return isConditional;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
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
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!buyerId.parse(data, cursor)) {
            return false;
        }
        cursor += BuyerIdField.BYTE_LENGTH;
        if (!sellerId.parse(data, cursor)) {
            return false;
        }
        cursor += SellerIdField.BYTE_LENGTH;
        if (!tradeTimeStamp.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTimeStampField.BYTE_LENGTH;
        if (!lastSale.parse(data, cursor)) {
            return false;
        }
        cursor += LastSaleField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        if (!moc.parse(data, cursor)) {
            return false;
        }
        cursor += MocField.BYTE_LENGTH;
        if (!bypass.parse(data, cursor)) {
            return false;
        }
        cursor += BypassField.BYTE_LENGTH;
        if (!openingTrade.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningTradeField.BYTE_LENGTH;
        if (!settlementTerms.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTermsField.BYTE_LENGTH;
        if (!tradingSystemTimeStamp.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSystemTimeStampField.BYTE_LENGTH;
        if (!listingMarket.parse(data, cursor)) {
            return false;
        }
        cursor += ListingMarketField.BYTE_LENGTH;
        if (!productType.parse(data, cursor)) {
            return false;
        }
        cursor += ProductTypeField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!isMidOnly.parse(data, cursor)) {
            return false;
        }
        cursor += IsMidOnlyField.BYTE_LENGTH;
        if (!isDark.parse(data, cursor)) {
            return false;
        }
        cursor += IsDarkField.BYTE_LENGTH;
        return isConditional.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = symbol.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = buyerId.encode(data, cursor);
        cursor = sellerId.encode(data, cursor);
        cursor = tradeTimeStamp.encode(data, cursor);
        cursor = lastSale.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = moc.encode(data, cursor);
        cursor = bypass.encode(data, cursor);
        cursor = openingTrade.encode(data, cursor);
        cursor = settlementTerms.encode(data, cursor);
        cursor = tradingSystemTimeStamp.encode(data, cursor);
        cursor = listingMarket.encode(data, cursor);
        cursor = productType.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = isMidOnly.encode(data, cursor);
        cursor = isDark.encode(data, cursor);
        cursor = isConditional.encode(data, cursor);
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
            case "Symbol" -> Optional.of(symbol);
            case "Volume" -> Optional.of(volume);
            case "TradePrice" -> Optional.of(tradePrice);
            case "BuyerId" -> Optional.of(buyerId);
            case "SellerId" -> Optional.of(sellerId);
            case "TradeTimeStamp" -> Optional.of(tradeTimeStamp);
            case "LastSale" -> Optional.of(lastSale);
            case "TradeId" -> Optional.of(tradeId);
            case "CrossType" -> Optional.of(crossType);
            case "Moc" -> Optional.of(moc);
            case "Bypass" -> Optional.of(bypass);
            case "OpeningTrade" -> Optional.of(openingTrade);
            case "SettlementTerms" -> Optional.of(settlementTerms);
            case "TradingSystemTimeStamp" -> Optional.of(tradingSystemTimeStamp);
            case "ListingMarket" -> Optional.of(listingMarket);
            case "ProductType" -> Optional.of(productType);
            case "TradeDate" -> Optional.of(tradeDate);
            case "IsMidOnly" -> Optional.of(isMidOnly);
            case "IsDark" -> Optional.of(isDark);
            case "IsConditional" -> Optional.of(isConditional);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeMessage message)) {
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
        if (!(other instanceof TradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
