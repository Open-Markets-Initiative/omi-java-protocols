package omi.tmx.tsx.level1.qrtmd.v2_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.FarIndicativeClosingPriceField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.ImbalanceReferencePriceField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.ImbalanceSideField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.ImbalanceVolumeField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.MarketOrderImbalanceSideField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.MarketOrderImbalanceVolumeField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.NearIndicativeClosingPriceField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.PairedVolumeField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.PriceVariationField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.SymbolField;
import omi.tmx.tsx.level1.qrtmd.v2_8.fields.TradingSystemTimeStampField;
import omi.tmx.tsx.level1.qrtmd.v2_8.types.Field;
import omi.tmx.tsx.level1.qrtmd.v2_8.types.Message;
import omi.tmx.tsx.level1.qrtmd.v2_8.types.PrintOptions;

/**
 * Represents the MocImbalanceNotificationMessage message from the Level1 protocol.
 *
 * <p>Volume imbalance for a Market On Close eligible symbol, sent every ten seconds from the beginning of the MOC Imbalance session.</p>
 */
public final class MocImbalanceNotificationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 102;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Moc Imbalance Notification Message";

    /**
     * Stock symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Marker to indicate which side has a Volume Imbalance for Market On Close.
     */
    private final ImbalanceSideField imbalanceSide = new ImbalanceSideField();

    /**
     * Identifies the volume of shares of the Imbalance side of Market on Close.
     */
    private final ImbalanceVolumeField imbalanceVolume = new ImbalanceVolumeField();

    /**
     * The price that decides if a given limit-priced Market on Close order can contribute to the MOC Imbalance.
     */
    private final ImbalanceReferencePriceField imbalanceReferencePrice = new ImbalanceReferencePriceField();

    /**
     * The number of MOC and LOC shares that can be matched at the reference price.
     */
    private final PairedVolumeField pairedVolume = new PairedVolumeField();

    /**
     * Indicates the share imbalance when only MOC orders are considered.
     */
    private final MarketOrderImbalanceVolumeField marketOrderImbalanceVolume = new MarketOrderImbalanceVolumeField();

    /**
     * Side of the Market Order Imbalance Volume.
     */
    private final MarketOrderImbalanceSideField marketOrderImbalanceSide = new MarketOrderImbalanceSideField();

    /**
     * The calculated closing price that will maximize the number of shares matched based on the on-close orders and visible continuous market orders.
     */
    private final NearIndicativeClosingPriceField nearIndicativeClosingPrice = new NearIndicativeClosingPriceField();

    /**
     * The calculated closing price that will maximize the number of shares matched based on closing interest only.
     */
    private final FarIndicativeClosingPriceField farIndicativeClosingPrice = new FarIndicativeClosingPriceField();

    /**
     * The absolute value of the percentage of deviation of the Near Indicative Closing Price from the Reference Price.
     */
    private final PriceVariationField priceVariation = new PriceVariationField();

    /**
     * The time at which the business action occurred.
     */
    private final TradingSystemTimeStampField tradingSystemTimeStamp = new TradingSystemTimeStampField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbol, imbalanceSide, imbalanceVolume, imbalanceReferencePrice, pairedVolume, marketOrderImbalanceVolume, marketOrderImbalanceSide, nearIndicativeClosingPrice, farIndicativeClosingPrice, priceVariation, tradingSystemTimeStamp);

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
     * Marker to indicate which side has a Volume Imbalance for Market On Close.
     *
     * @return the ImbalanceSide field
     */
    public ImbalanceSideField imbalanceSide() {
        return imbalanceSide;
    }

    /**
     * Identifies the volume of shares of the Imbalance side of Market on Close.
     *
     * @return the ImbalanceVolume field
     */
    public ImbalanceVolumeField imbalanceVolume() {
        return imbalanceVolume;
    }

    /**
     * The price that decides if a given limit-priced Market on Close order can contribute to the MOC Imbalance.
     *
     * @return the ImbalanceReferencePrice field
     */
    public ImbalanceReferencePriceField imbalanceReferencePrice() {
        return imbalanceReferencePrice;
    }

    /**
     * The number of MOC and LOC shares that can be matched at the reference price.
     *
     * @return the PairedVolume field
     */
    public PairedVolumeField pairedVolume() {
        return pairedVolume;
    }

    /**
     * Indicates the share imbalance when only MOC orders are considered.
     *
     * @return the MarketOrderImbalanceVolume field
     */
    public MarketOrderImbalanceVolumeField marketOrderImbalanceVolume() {
        return marketOrderImbalanceVolume;
    }

    /**
     * Side of the Market Order Imbalance Volume.
     *
     * @return the MarketOrderImbalanceSide field
     */
    public MarketOrderImbalanceSideField marketOrderImbalanceSide() {
        return marketOrderImbalanceSide;
    }

    /**
     * The calculated closing price that will maximize the number of shares matched based on the on-close orders and visible continuous market orders.
     *
     * @return the NearIndicativeClosingPrice field
     */
    public NearIndicativeClosingPriceField nearIndicativeClosingPrice() {
        return nearIndicativeClosingPrice;
    }

    /**
     * The calculated closing price that will maximize the number of shares matched based on closing interest only.
     *
     * @return the FarIndicativeClosingPrice field
     */
    public FarIndicativeClosingPriceField farIndicativeClosingPrice() {
        return farIndicativeClosingPrice;
    }

    /**
     * The absolute value of the percentage of deviation of the Near Indicative Closing Price from the Reference Price.
     *
     * @return the PriceVariation field
     */
    public PriceVariationField priceVariation() {
        return priceVariation;
    }

    /**
     * The time at which the business action occurred.
     *
     * @return the TradingSystemTimeStamp field
     */
    public TradingSystemTimeStampField tradingSystemTimeStamp() {
        return tradingSystemTimeStamp;
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
        if (!imbalanceSide.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceSideField.BYTE_LENGTH;
        if (!imbalanceVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceVolumeField.BYTE_LENGTH;
        if (!imbalanceReferencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceReferencePriceField.BYTE_LENGTH;
        if (!pairedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += PairedVolumeField.BYTE_LENGTH;
        if (!marketOrderImbalanceVolume.parse(data, cursor)) {
            return false;
        }
        cursor += MarketOrderImbalanceVolumeField.BYTE_LENGTH;
        if (!marketOrderImbalanceSide.parse(data, cursor)) {
            return false;
        }
        cursor += MarketOrderImbalanceSideField.BYTE_LENGTH;
        if (!nearIndicativeClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NearIndicativeClosingPriceField.BYTE_LENGTH;
        if (!farIndicativeClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += FarIndicativeClosingPriceField.BYTE_LENGTH;
        if (!priceVariation.parse(data, cursor)) {
            return false;
        }
        cursor += PriceVariationField.BYTE_LENGTH;
        return tradingSystemTimeStamp.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = symbol.encode(data, cursor);
        cursor = imbalanceSide.encode(data, cursor);
        cursor = imbalanceVolume.encode(data, cursor);
        cursor = imbalanceReferencePrice.encode(data, cursor);
        cursor = pairedVolume.encode(data, cursor);
        cursor = marketOrderImbalanceVolume.encode(data, cursor);
        cursor = marketOrderImbalanceSide.encode(data, cursor);
        cursor = nearIndicativeClosingPrice.encode(data, cursor);
        cursor = farIndicativeClosingPrice.encode(data, cursor);
        cursor = priceVariation.encode(data, cursor);
        cursor = tradingSystemTimeStamp.encode(data, cursor);
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
            case "ImbalanceSide" -> Optional.of(imbalanceSide);
            case "ImbalanceVolume" -> Optional.of(imbalanceVolume);
            case "ImbalanceReferencePrice" -> Optional.of(imbalanceReferencePrice);
            case "PairedVolume" -> Optional.of(pairedVolume);
            case "MarketOrderImbalanceVolume" -> Optional.of(marketOrderImbalanceVolume);
            case "MarketOrderImbalanceSide" -> Optional.of(marketOrderImbalanceSide);
            case "NearIndicativeClosingPrice" -> Optional.of(nearIndicativeClosingPrice);
            case "FarIndicativeClosingPrice" -> Optional.of(farIndicativeClosingPrice);
            case "PriceVariation" -> Optional.of(priceVariation);
            case "TradingSystemTimeStamp" -> Optional.of(tradingSystemTimeStamp);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MocImbalanceNotificationMessage message)) {
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
        if (!(other instanceof MocImbalanceNotificationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
