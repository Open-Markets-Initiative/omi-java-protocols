package omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.CrossTypeField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.CurrentReferencePriceField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.FarPriceField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.ImbalanceDirectionField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.ImbalanceSharesField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.NearPriceField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.PairedSharesField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.PriceVariationIndicatorField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.StockAlphanumericField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.types.Field;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.types.Message;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.types.PrintOptions;

/**
 * Represents the NetOrderImbalanceIndicatorMessage message from the TotalView protocol.
 *
 * <p>NOII data is disseminated at 5-second intervals in the minutes leading up to the NASDAQ Opening Cross, NASDAQ Closing Cross, and NASDAQ IPO/Halt Cross.</p>
 */
public final class NetOrderImbalanceIndicatorMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'I';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 57;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Net Order Imbalance Indicator Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * The total number of shares that are eligible to be matched at the Current Reference Price.
     */
    private final PairedSharesField pairedShares = new PairedSharesField();

    /**
     * The number of shares not paired at the Current Reference Price.
     */
    private final ImbalanceSharesField imbalanceShares = new ImbalanceSharesField();

    /**
     * The market side of the order imbalance.
     */
    private final ImbalanceDirectionField imbalanceDirection = new ImbalanceDirectionField();

    /**
     * Stock symbol right padded with spaces.
     */
    private final StockAlphanumericField stockAlphanumeric = new StockAlphanumericField();

    /**
     * A hypothetical auction-clearing price for cross orders only.
     */
    private final FarPriceField farPrice = new FarPriceField();

    /**
     * A hypothetical auction-clearing price for cross orders as well as continuous orders.
     */
    private final NearPriceField nearPrice = new NearPriceField();

    /**
     * The price at which the NOII shares are being calculated.
     */
    private final CurrentReferencePriceField currentReferencePrice = new CurrentReferencePriceField();

    /**
     * The NASDAQ cross session for which the message is being generated.
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * This field indicates the absolute value of the percentage of deviation of the Near Indicative Clearing Price to the nearest Current Reference Price.
     */
    private final PriceVariationIndicatorField priceVariationIndicator = new PriceVariationIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(pairedShares, imbalanceShares, imbalanceDirection, stockAlphanumeric, farPrice, nearPrice, currentReferencePrice, crossType, priceVariationIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The total number of shares that are eligible to be matched at the Current Reference Price.
     *
     * @return the PairedShares field
     */
    public PairedSharesField pairedShares() {
        return pairedShares;
    }

    /**
     * The number of shares not paired at the Current Reference Price.
     *
     * @return the ImbalanceShares field
     */
    public ImbalanceSharesField imbalanceShares() {
        return imbalanceShares;
    }

    /**
     * The market side of the order imbalance.
     *
     * @return the ImbalanceDirection field
     */
    public ImbalanceDirectionField imbalanceDirection() {
        return imbalanceDirection;
    }

    /**
     * Stock symbol right padded with spaces.
     *
     * @return the StockAlphanumeric field
     */
    public StockAlphanumericField stockAlphanumeric() {
        return stockAlphanumeric;
    }

    /**
     * A hypothetical auction-clearing price for cross orders only.
     *
     * @return the FarPrice field
     */
    public FarPriceField farPrice() {
        return farPrice;
    }

    /**
     * A hypothetical auction-clearing price for cross orders as well as continuous orders.
     *
     * @return the NearPrice field
     */
    public NearPriceField nearPrice() {
        return nearPrice;
    }

    /**
     * The price at which the NOII shares are being calculated.
     *
     * @return the CurrentReferencePrice field
     */
    public CurrentReferencePriceField currentReferencePrice() {
        return currentReferencePrice;
    }

    /**
     * The NASDAQ cross session for which the message is being generated.
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * This field indicates the absolute value of the percentage of deviation of the Near Indicative Clearing Price to the nearest Current Reference Price.
     *
     * @return the PriceVariationIndicator field
     */
    public PriceVariationIndicatorField priceVariationIndicator() {
        return priceVariationIndicator;
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
        if (!pairedShares.parse(data, cursor)) {
            return false;
        }
        cursor += PairedSharesField.BYTE_LENGTH;
        if (!imbalanceShares.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceSharesField.BYTE_LENGTH;
        if (!imbalanceDirection.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceDirectionField.BYTE_LENGTH;
        if (!stockAlphanumeric.parse(data, cursor)) {
            return false;
        }
        cursor += StockAlphanumericField.BYTE_LENGTH;
        if (!farPrice.parse(data, cursor)) {
            return false;
        }
        cursor += FarPriceField.BYTE_LENGTH;
        if (!nearPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NearPriceField.BYTE_LENGTH;
        if (!currentReferencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += CurrentReferencePriceField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        if (!priceVariationIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += PriceVariationIndicatorField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = pairedShares.encode(data, cursor);
        cursor = imbalanceShares.encode(data, cursor);
        cursor = imbalanceDirection.encode(data, cursor);
        cursor = stockAlphanumeric.encode(data, cursor);
        cursor = farPrice.encode(data, cursor);
        cursor = nearPrice.encode(data, cursor);
        cursor = currentReferencePrice.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = priceVariationIndicator.encode(data, cursor);
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
            case "PairedShares" -> Optional.of(pairedShares);
            case "ImbalanceShares" -> Optional.of(imbalanceShares);
            case "ImbalanceDirection" -> Optional.of(imbalanceDirection);
            case "StockAlphanumeric" -> Optional.of(stockAlphanumeric);
            case "FarPrice" -> Optional.of(farPrice);
            case "NearPrice" -> Optional.of(nearPrice);
            case "CurrentReferencePrice" -> Optional.of(currentReferencePrice);
            case "CrossType" -> Optional.of(crossType);
            case "PriceVariationIndicator" -> Optional.of(priceVariationIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NetOrderImbalanceIndicatorMessage message)) {
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
        if (!(other instanceof NetOrderImbalanceIndicatorMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
