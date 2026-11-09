package omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields.ExchangeCodeField;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields.LotSizeField;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields.MarketIdField;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields.MpvField;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields.PrevClosePriceField;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields.PrevCloseVolumeField;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields.PriceResolutionField;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields.PriceScaleCodeField;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields.RoundLotField;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields.SecurityTypeField;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields.SymbolField;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields.SymbolIndexField;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields.SystemIdField;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields.UnitOfTradeField;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.types.Field;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.types.Message;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.types.PrintOptions;

/**
 * Represents the SymbolIndexMappingMessage message from the IntegratedFeed protocol.
 *
 * <p>This message is published over the real-time data channels at system startup or in the context of a refresh sequence after a Matching Engine or Pillar Publisher failover. It provides referential data for a single specified symbol.</p>
 */
public final class SymbolIndexMappingMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 40;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Symbol Index Mapping Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 15, 1, 38, 2 };

    /**
     * The ID of the symbol in the Symbol Index msg
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * Null-terminated ASCII symbol in NYSE Symbology.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * ID of the Originating Market.
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * ID of the Originating matching engine server.
     */
    private final SystemIdField systemId = new SystemIdField();

    /**
     * For listed equity markets, the market where this symbol is listed.
     */
    private final ExchangeCodeField exchangeCode = new ExchangeCodeField();

    /**
     * Specifies placement of the decimal point in price fields for this security.
     */
    private final PriceScaleCodeField priceScaleCode = new PriceScaleCodeField();

    /**
     * Type of Security used by Pillar-powered markets.
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * Round lot size in shares.
     */
    private final LotSizeField lotSize = new LotSizeField();

    /**
     * The previous day's closing price for this security.
     */
    private final PrevClosePriceField prevClosePrice = new PrevClosePriceField();

    /**
     * The previous day's closing volume for the security.
     */
    private final PrevCloseVolumeField prevCloseVolume = new PrevCloseVolumeField();

    /**
     * Minimum price increment: 0 - All Penny, 1 - Penny/Nickel, 5 - Nickel/Dime.
     */
    private final PriceResolutionField priceResolution = new PriceResolutionField();

    /**
     * Round Lots Accepted: Y - Yes, N - No.
     */
    private final RoundLotField roundLot = new RoundLotField();

    /**
     * The minimum increment for a trade price, in 100ths of a cent. Typically 1, or $0.0001, but for some Tick Pilot stocks, can be 500, or $0.05.
     */
    private final MpvField mpv = new MpvField();

    /**
     * This field specifies the security Unit of Trade in shares. Valid values are 1, 10, 50 and 100.
     */
    private final UnitOfTradeField unitOfTrade = new UnitOfTradeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbolIndex, symbol, marketId, systemId, exchangeCode, priceScaleCode, securityType, lotSize, prevClosePrice, prevCloseVolume, priceResolution, roundLot, mpv, unitOfTrade);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The ID of the symbol in the Symbol Index msg
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * Null-terminated ASCII symbol in NYSE Symbology.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * ID of the Originating Market.
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * ID of the Originating matching engine server.
     *
     * @return the SystemId field
     */
    public SystemIdField systemId() {
        return systemId;
    }

    /**
     * For listed equity markets, the market where this symbol is listed.
     *
     * @return the ExchangeCode field
     */
    public ExchangeCodeField exchangeCode() {
        return exchangeCode;
    }

    /**
     * Specifies placement of the decimal point in price fields for this security.
     *
     * @return the PriceScaleCode field
     */
    public PriceScaleCodeField priceScaleCode() {
        return priceScaleCode;
    }

    /**
     * Type of Security used by Pillar-powered markets.
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * Round lot size in shares.
     *
     * @return the LotSize field
     */
    public LotSizeField lotSize() {
        return lotSize;
    }

    /**
     * The previous day's closing price for this security.
     *
     * @return the PrevClosePrice field
     */
    public PrevClosePriceField prevClosePrice() {
        return prevClosePrice;
    }

    /**
     * The previous day's closing volume for the security.
     *
     * @return the PrevCloseVolume field
     */
    public PrevCloseVolumeField prevCloseVolume() {
        return prevCloseVolume;
    }

    /**
     * Minimum price increment: 0 - All Penny, 1 - Penny/Nickel, 5 - Nickel/Dime.
     *
     * @return the PriceResolution field
     */
    public PriceResolutionField priceResolution() {
        return priceResolution;
    }

    /**
     * Round Lots Accepted: Y - Yes, N - No.
     *
     * @return the RoundLot field
     */
    public RoundLotField roundLot() {
        return roundLot;
    }

    /**
     * The minimum increment for a trade price, in 100ths of a cent. Typically 1, or $0.0001, but for some Tick Pilot stocks, can be 500, or $0.05.
     *
     * @return the Mpv field
     */
    public MpvField mpv() {
        return mpv;
    }

    /**
     * This field specifies the security Unit of Trade in shares. Valid values are 1, 10, 50 and 100.
     *
     * @return the UnitOfTrade field
     */
    public UnitOfTradeField unitOfTrade() {
        return unitOfTrade;
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
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!systemId.parse(data, cursor)) {
            return false;
        }
        cursor += SystemIdField.BYTE_LENGTH;
        if (!exchangeCode.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeCodeField.BYTE_LENGTH;
        if (!priceScaleCode.parse(data, cursor)) {
            return false;
        }
        cursor += PriceScaleCodeField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!lotSize.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeField.BYTE_LENGTH;
        if (!prevClosePrice.parse(data, cursor)) {
            return false;
        }
        cursor += PrevClosePriceField.BYTE_LENGTH;
        if (!prevCloseVolume.parse(data, cursor)) {
            return false;
        }
        cursor += PrevCloseVolumeField.BYTE_LENGTH;
        if (!priceResolution.parse(data, cursor)) {
            return false;
        }
        cursor += PriceResolutionField.BYTE_LENGTH;
        if (!roundLot.parse(data, cursor)) {
            return false;
        }
        cursor += RoundLotField.BYTE_LENGTH;
        if (!mpv.parse(data, cursor)) {
            return false;
        }
        cursor += MpvField.BYTE_LENGTH;
        if (!unitOfTrade.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfTradeField.BYTE_LENGTH;
        cursor += 2; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = symbolIndex.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        if (buffer != null && buffer.length >= 15 + 1) {
            System.arraycopy(buffer, 15, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = marketId.encode(data, cursor);
        cursor = systemId.encode(data, cursor);
        cursor = exchangeCode.encode(data, cursor);
        cursor = priceScaleCode.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = lotSize.encode(data, cursor);
        cursor = prevClosePrice.encode(data, cursor);
        cursor = prevCloseVolume.encode(data, cursor);
        cursor = priceResolution.encode(data, cursor);
        cursor = roundLot.encode(data, cursor);
        cursor = mpv.encode(data, cursor);
        cursor = unitOfTrade.encode(data, cursor);
        if (buffer != null && buffer.length >= 38 + 2) {
            System.arraycopy(buffer, 38, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
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
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "Symbol" -> Optional.of(symbol);
            case "MarketId" -> Optional.of(marketId);
            case "SystemId" -> Optional.of(systemId);
            case "ExchangeCode" -> Optional.of(exchangeCode);
            case "PriceScaleCode" -> Optional.of(priceScaleCode);
            case "SecurityType" -> Optional.of(securityType);
            case "LotSize" -> Optional.of(lotSize);
            case "PrevClosePrice" -> Optional.of(prevClosePrice);
            case "PrevCloseVolume" -> Optional.of(prevCloseVolume);
            case "PriceResolution" -> Optional.of(priceResolution);
            case "RoundLot" -> Optional.of(roundLot);
            case "Mpv" -> Optional.of(mpv);
            case "UnitOfTrade" -> Optional.of(unitOfTrade);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SymbolIndexMappingMessage message)) {
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
        if (!(other instanceof SymbolIndexMappingMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
