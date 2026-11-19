package omi.nasdaq.psxequities.bbo.itch.v2_1_2018.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.fields.NasdaqBestBidNavPremiumDiscountAmountField;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.fields.NasdaqBestBidProxyPriceField;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.fields.NasdaqBestBidSizeField;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.fields.NasdaqBestOfferNavPremiumDiscountAmountField;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.fields.NasdaqBestOfferProxyPriceField;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.fields.NasdaqBestOfferSizeField;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.fields.NextSharesSymbolField;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.fields.SecurityClassField;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.fields.TimestampField;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.fields.TrackingNumberField;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.types.Field;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.types.Message;
import omi.nasdaq.psxequities.bbo.itch.v2_1_2018.types.PrintOptions;

/**
 * Represents the NextSharesQuotationMessage message from the Bbo protocol.
 *
 * <p>This version of the Quotation message format will be used for Exchange Traded Managed Funds (NextShares). For this asset class, Nasdaq will support both Proxy Price and Net Asset Value (NAV) premium/discount amount for the best bid and offer.</p>
 */
public final class NextSharesQuotationMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'A';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 41;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Next Shares Quotation Message";

    /**
     * NASDAQ internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Denotes the NextShares symbol in the Nasdaq execution system.
     */
    private final NextSharesSymbolField nextSharesSymbol = new NextSharesSymbolField();

    /**
     * Indicates the primary listing market for the issue.
     */
    private final SecurityClassField securityClass = new SecurityClassField();

    /**
     * Denotes the Nasdaq best bid price for NextShares in proxy price format.
     */
    private final NasdaqBestBidProxyPriceField nasdaqBestBidProxyPrice = new NasdaqBestBidProxyPriceField();

    /**
     * Denotes the aggregated number of shares available for display within the Nasdaq market center system at the Nasdaq best bid price.
     */
    private final NasdaqBestBidSizeField nasdaqBestBidSize = new NasdaqBestBidSizeField();

    /**
     * Denotes premium or discount amount to the NAV reflected in the Nasdaq best bid. Please note: This is a signed (+/-) field.
     */
    private final NasdaqBestBidNavPremiumDiscountAmountField nasdaqBestBidNavPremiumDiscountAmount = new NasdaqBestBidNavPremiumDiscountAmountField();

    /**
     * Denotes the Nasdaq best offer for the NextShares in proxy price format.
     */
    private final NasdaqBestOfferProxyPriceField nasdaqBestOfferProxyPrice = new NasdaqBestOfferProxyPriceField();

    /**
     * Denotes the aggregated number of shares available for display within the Nasdaq market center system at the Nasdaq best offer price.
     */
    private final NasdaqBestOfferSizeField nasdaqBestOfferSize = new NasdaqBestOfferSizeField();

    /**
     * Denotes the premium or discount amount to the NAV reflected in the Nasdaq best offer. Please note: this is a signed (+/-) field.
     */
    private final NasdaqBestOfferNavPremiumDiscountAmountField nasdaqBestOfferNavPremiumDiscountAmount = new NasdaqBestOfferNavPremiumDiscountAmountField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(trackingNumber, timestampField, nextSharesSymbol, securityClass, nasdaqBestBidProxyPrice, nasdaqBestBidSize, nasdaqBestBidNavPremiumDiscountAmount, nasdaqBestOfferProxyPrice, nasdaqBestOfferSize, nasdaqBestOfferNavPremiumDiscountAmount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * NASDAQ internal tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Nanoseconds since midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Denotes the NextShares symbol in the Nasdaq execution system.
     *
     * @return the NextSharesSymbol field
     */
    public NextSharesSymbolField nextSharesSymbol() {
        return nextSharesSymbol;
    }

    /**
     * Indicates the primary listing market for the issue.
     *
     * @return the SecurityClass field
     */
    public SecurityClassField securityClass() {
        return securityClass;
    }

    /**
     * Denotes the Nasdaq best bid price for NextShares in proxy price format.
     *
     * @return the NasdaqBestBidProxyPrice field
     */
    public NasdaqBestBidProxyPriceField nasdaqBestBidProxyPrice() {
        return nasdaqBestBidProxyPrice;
    }

    /**
     * Denotes the aggregated number of shares available for display within the Nasdaq market center system at the Nasdaq best bid price.
     *
     * @return the NasdaqBestBidSize field
     */
    public NasdaqBestBidSizeField nasdaqBestBidSize() {
        return nasdaqBestBidSize;
    }

    /**
     * Denotes premium or discount amount to the NAV reflected in the Nasdaq best bid. Please note: This is a signed (+/-) field.
     *
     * @return the NasdaqBestBidNavPremiumDiscountAmount field
     */
    public NasdaqBestBidNavPremiumDiscountAmountField nasdaqBestBidNavPremiumDiscountAmount() {
        return nasdaqBestBidNavPremiumDiscountAmount;
    }

    /**
     * Denotes the Nasdaq best offer for the NextShares in proxy price format.
     *
     * @return the NasdaqBestOfferProxyPrice field
     */
    public NasdaqBestOfferProxyPriceField nasdaqBestOfferProxyPrice() {
        return nasdaqBestOfferProxyPrice;
    }

    /**
     * Denotes the aggregated number of shares available for display within the Nasdaq market center system at the Nasdaq best offer price.
     *
     * @return the NasdaqBestOfferSize field
     */
    public NasdaqBestOfferSizeField nasdaqBestOfferSize() {
        return nasdaqBestOfferSize;
    }

    /**
     * Denotes the premium or discount amount to the NAV reflected in the Nasdaq best offer. Please note: this is a signed (+/-) field.
     *
     * @return the NasdaqBestOfferNavPremiumDiscountAmount field
     */
    public NasdaqBestOfferNavPremiumDiscountAmountField nasdaqBestOfferNavPremiumDiscountAmount() {
        return nasdaqBestOfferNavPremiumDiscountAmount;
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
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!nextSharesSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += NextSharesSymbolField.BYTE_LENGTH;
        if (!securityClass.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityClassField.BYTE_LENGTH;
        if (!nasdaqBestBidProxyPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NasdaqBestBidProxyPriceField.BYTE_LENGTH;
        if (!nasdaqBestBidSize.parse(data, cursor)) {
            return false;
        }
        cursor += NasdaqBestBidSizeField.BYTE_LENGTH;
        if (!nasdaqBestBidNavPremiumDiscountAmount.parse(data, cursor)) {
            return false;
        }
        cursor += NasdaqBestBidNavPremiumDiscountAmountField.BYTE_LENGTH;
        if (!nasdaqBestOfferProxyPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NasdaqBestOfferProxyPriceField.BYTE_LENGTH;
        if (!nasdaqBestOfferSize.parse(data, cursor)) {
            return false;
        }
        cursor += NasdaqBestOfferSizeField.BYTE_LENGTH;
        return nasdaqBestOfferNavPremiumDiscountAmount.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = nextSharesSymbol.encode(data, cursor);
        cursor = securityClass.encode(data, cursor);
        cursor = nasdaqBestBidProxyPrice.encode(data, cursor);
        cursor = nasdaqBestBidSize.encode(data, cursor);
        cursor = nasdaqBestBidNavPremiumDiscountAmount.encode(data, cursor);
        cursor = nasdaqBestOfferProxyPrice.encode(data, cursor);
        cursor = nasdaqBestOfferSize.encode(data, cursor);
        cursor = nasdaqBestOfferNavPremiumDiscountAmount.encode(data, cursor);
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
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "NextSharesSymbol" -> Optional.of(nextSharesSymbol);
            case "SecurityClass" -> Optional.of(securityClass);
            case "NasdaqBestBidProxyPrice" -> Optional.of(nasdaqBestBidProxyPrice);
            case "NasdaqBestBidSize" -> Optional.of(nasdaqBestBidSize);
            case "NasdaqBestBidNavPremiumDiscountAmount" -> Optional.of(nasdaqBestBidNavPremiumDiscountAmount);
            case "NasdaqBestOfferProxyPrice" -> Optional.of(nasdaqBestOfferProxyPrice);
            case "NasdaqBestOfferSize" -> Optional.of(nasdaqBestOfferSize);
            case "NasdaqBestOfferNavPremiumDiscountAmount" -> Optional.of(nasdaqBestOfferNavPremiumDiscountAmount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NextSharesQuotationMessage message)) {
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
        if (!(other instanceof NextSharesQuotationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
