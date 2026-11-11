package omi.ice.icefutures.mdf.impact.v1_1_33.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.IbaCurrencyField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.NumDecimalsPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.NumDecimalsPriceInGramField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.PriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.PriceInGramField;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.PrintOptions;

/**
 * Represents the FixingIndicativePriceMessageMessage message from the Mdf protocol.
 *
 * <p>This message supports ICE Benchmark Administration’s (IBA) electronic Gold and Silver Auction and is disseminated at the end of the final auction when the final price is published</p>
 */
public final class FixingIndicativePriceMessageMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '0';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 25;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Fixing Indicative Price Message Message";

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Currency Code
     */
    private final IbaCurrencyField ibaCurrency = new IbaCurrencyField();

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     */
    private final PriceField price = new PriceField();

    /**
     * Auctioneers price in gram for the round in specified currency
     */
    private final PriceInGramField priceInGram = new PriceInGramField();

    /**
     * Number of decimals to use for Prices
     */
    private final NumDecimalsPriceField numDecimalsPrice = new NumDecimalsPriceField();

    /**
     * Number of decimals to use for PriceInGram
     */
    private final NumDecimalsPriceInGramField numDecimalsPriceInGram = new NumDecimalsPriceInGramField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketId, ibaCurrency, price, priceInGram, numDecimalsPrice, numDecimalsPriceInGram);

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
     * Currency Code
     *
     * @return the IbaCurrency field
     */
    public IbaCurrencyField ibaCurrency() {
        return ibaCurrency;
    }

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Auctioneers price in gram for the round in specified currency
     *
     * @return the PriceInGram field
     */
    public PriceInGramField priceInGram() {
        return priceInGram;
    }

    /**
     * Number of decimals to use for Prices
     *
     * @return the NumDecimalsPrice field
     */
    public NumDecimalsPriceField numDecimalsPrice() {
        return numDecimalsPrice;
    }

    /**
     * Number of decimals to use for PriceInGram
     *
     * @return the NumDecimalsPriceInGram field
     */
    public NumDecimalsPriceInGramField numDecimalsPriceInGram() {
        return numDecimalsPriceInGram;
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
        if (!ibaCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += IbaCurrencyField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!priceInGram.parse(data, cursor)) {
            return false;
        }
        cursor += PriceInGramField.BYTE_LENGTH;
        if (!numDecimalsPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NumDecimalsPriceField.BYTE_LENGTH;
        return numDecimalsPriceInGram.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketId.encode(data, cursor);
        cursor = ibaCurrency.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = priceInGram.encode(data, cursor);
        cursor = numDecimalsPrice.encode(data, cursor);
        cursor = numDecimalsPriceInGram.encode(data, cursor);
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
            case "IbaCurrency" -> Optional.of(ibaCurrency);
            case "Price" -> Optional.of(price);
            case "PriceInGram" -> Optional.of(priceInGram);
            case "NumDecimalsPrice" -> Optional.of(numDecimalsPrice);
            case "NumDecimalsPriceInGram" -> Optional.of(numDecimalsPriceInGram);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FixingIndicativePriceMessageMessage message)) {
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
        if (!(other instanceof FixingIndicativePriceMessageMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
