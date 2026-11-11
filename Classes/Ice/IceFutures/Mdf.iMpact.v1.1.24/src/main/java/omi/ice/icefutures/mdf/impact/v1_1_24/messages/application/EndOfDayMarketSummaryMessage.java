package omi.ice.icefutures.mdf.impact.v1_1_24.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.BlockVolumeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.EfpVolumeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.EfsVolumeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.HighField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.LowField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MessageDateTimeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OpenInterestField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OpeningPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.SettlementPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.SettlementPriceWithDealPricePrecisionField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.VolumeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.VwapField;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.PrintOptions;

/**
 * Represents the EndOfDayMarketSummaryMessage message from the Mdf protocol.
 *
 * <p>End of Day Market Summary Message</p>
 */
public final class EndOfDayMarketSummaryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'u';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 80;

    /**
     * This message's declared name.
     */
    public static final String NAME = "End Of Day Market Summary Message";

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Electronic trade volume only, excluding block and other volumes.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Block Volume
     */
    private final BlockVolumeField blockVolume = new BlockVolumeField();

    /**
     * Efs Volume
     */
    private final EfsVolumeField efsVolume = new EfsVolumeField();

    /**
     * Efp Volume
     */
    private final EfpVolumeField efpVolume = new EfpVolumeField();

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     */
    private final OpeningPriceField openingPrice = new OpeningPriceField();

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     */
    private final HighField high = new HighField();

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     */
    private final LowField low = new LowField();

    /**
     * Weighted Average Price. DealPriceDenominator for the market should be applied to get the real price.
     */
    private final VwapField vwap = new VwapField();

    /**
     * DealPriceDenominator for the market should be applied to get this price.
     */
    private final SettlementPriceWithDealPricePrecisionField settlementPriceWithDealPricePrecision = new SettlementPriceWithDealPricePrecisionField();

    /**
     * Open Interest
     */
    private final OpenInterestField openInterest = new OpenInterestField();

    /**
     * Date time the trade was investigated
     */
    private final MessageDateTimeField messageDateTime = new MessageDateTimeField();

    /**
     * SettlePriceDenominator for the market should be applied to get the real settlement price.
     */
    private final SettlementPriceField settlementPrice = new SettlementPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketId, volume, blockVolume, efsVolume, efpVolume, openingPrice, high, low, vwap, settlementPriceWithDealPricePrecision, openInterest, messageDateTime, settlementPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Market Id
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * Electronic trade volume only, excluding block and other volumes.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Block Volume
     *
     * @return the BlockVolume field
     */
    public BlockVolumeField blockVolume() {
        return blockVolume;
    }

    /**
     * Efs Volume
     *
     * @return the EfsVolume field
     */
    public EfsVolumeField efsVolume() {
        return efsVolume;
    }

    /**
     * Efp Volume
     *
     * @return the EfpVolume field
     */
    public EfpVolumeField efpVolume() {
        return efpVolume;
    }

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     *
     * @return the OpeningPrice field
     */
    public OpeningPriceField openingPrice() {
        return openingPrice;
    }

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     *
     * @return the High field
     */
    public HighField high() {
        return high;
    }

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     *
     * @return the Low field
     */
    public LowField low() {
        return low;
    }

    /**
     * Weighted Average Price. DealPriceDenominator for the market should be applied to get the real price.
     *
     * @return the Vwap field
     */
    public VwapField vwap() {
        return vwap;
    }

    /**
     * DealPriceDenominator for the market should be applied to get this price.
     *
     * @return the SettlementPriceWithDealPricePrecision field
     */
    public SettlementPriceWithDealPricePrecisionField settlementPriceWithDealPricePrecision() {
        return settlementPriceWithDealPricePrecision;
    }

    /**
     * Open Interest
     *
     * @return the OpenInterest field
     */
    public OpenInterestField openInterest() {
        return openInterest;
    }

    /**
     * Date time the trade was investigated
     *
     * @return the MessageDateTime field
     */
    public MessageDateTimeField messageDateTime() {
        return messageDateTime;
    }

    /**
     * SettlePriceDenominator for the market should be applied to get the real settlement price.
     *
     * @return the SettlementPrice field
     */
    public SettlementPriceField settlementPrice() {
        return settlementPrice;
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
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!blockVolume.parse(data, cursor)) {
            return false;
        }
        cursor += BlockVolumeField.BYTE_LENGTH;
        if (!efsVolume.parse(data, cursor)) {
            return false;
        }
        cursor += EfsVolumeField.BYTE_LENGTH;
        if (!efpVolume.parse(data, cursor)) {
            return false;
        }
        cursor += EfpVolumeField.BYTE_LENGTH;
        if (!openingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningPriceField.BYTE_LENGTH;
        if (!high.parse(data, cursor)) {
            return false;
        }
        cursor += HighField.BYTE_LENGTH;
        if (!low.parse(data, cursor)) {
            return false;
        }
        cursor += LowField.BYTE_LENGTH;
        if (!vwap.parse(data, cursor)) {
            return false;
        }
        cursor += VwapField.BYTE_LENGTH;
        if (!settlementPriceWithDealPricePrecision.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPriceWithDealPricePrecisionField.BYTE_LENGTH;
        if (!openInterest.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestField.BYTE_LENGTH;
        if (!messageDateTime.parse(data, cursor)) {
            return false;
        }
        cursor += MessageDateTimeField.BYTE_LENGTH;
        return settlementPrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketId.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = blockVolume.encode(data, cursor);
        cursor = efsVolume.encode(data, cursor);
        cursor = efpVolume.encode(data, cursor);
        cursor = openingPrice.encode(data, cursor);
        cursor = high.encode(data, cursor);
        cursor = low.encode(data, cursor);
        cursor = vwap.encode(data, cursor);
        cursor = settlementPriceWithDealPricePrecision.encode(data, cursor);
        cursor = openInterest.encode(data, cursor);
        cursor = messageDateTime.encode(data, cursor);
        cursor = settlementPrice.encode(data, cursor);
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
            case "MarketId" -> Optional.of(marketId);
            case "Volume" -> Optional.of(volume);
            case "BlockVolume" -> Optional.of(blockVolume);
            case "EfsVolume" -> Optional.of(efsVolume);
            case "EfpVolume" -> Optional.of(efpVolume);
            case "OpeningPrice" -> Optional.of(openingPrice);
            case "High" -> Optional.of(high);
            case "Low" -> Optional.of(low);
            case "Vwap" -> Optional.of(vwap);
            case "SettlementPriceWithDealPricePrecision" -> Optional.of(settlementPriceWithDealPricePrecision);
            case "OpenInterest" -> Optional.of(openInterest);
            case "MessageDateTime" -> Optional.of(messageDateTime);
            case "SettlementPrice" -> Optional.of(settlementPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EndOfDayMarketSummaryMessage message)) {
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
        if (!(other instanceof EndOfDayMarketSummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
