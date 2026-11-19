package omi.hkex.sse.chinaconnect.omd.v1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.hkex.sse.chinaconnect.omd.v1_4.fields.CurrencyCodeField;
import omi.hkex.sse.chinaconnect.omd.v1_4.fields.InstrumentTypeField;
import omi.hkex.sse.chinaconnect.omd.v1_4.fields.IsinCodeField;
import omi.hkex.sse.chinaconnect.omd.v1_4.fields.ListingDateField;
import omi.hkex.sse.chinaconnect.omd.v1_4.fields.LotSizeField;
import omi.hkex.sse.chinaconnect.omd.v1_4.fields.MarketCodeField;
import omi.hkex.sse.chinaconnect.omd.v1_4.fields.PreviousClosingPriceField;
import omi.hkex.sse.chinaconnect.omd.v1_4.fields.SecurityCodeField;
import omi.hkex.sse.chinaconnect.omd.v1_4.fields.SecurityNameGbField;
import omi.hkex.sse.chinaconnect.omd.v1_4.fields.SecurityShortNameField;
import omi.hkex.sse.chinaconnect.omd.v1_4.fields.ShortsellFlagField;
import omi.hkex.sse.chinaconnect.omd.v1_4.types.Field;
import omi.hkex.sse.chinaconnect.omd.v1_4.types.Message;
import omi.hkex.sse.chinaconnect.omd.v1_4.types.PrintOptions;

/**
 * Represents the SecurityDefinitionMessage message from the ChinaConnect protocol.
 *
 * <p>The Security Definition message contains all the reference data for a security. Security Definition messages for different markets (SSE and SZSE) are sent via different channels.</p>
 */
public final class SecurityDefinitionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 216;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Definition Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 24, 2, 69, 60, 197, 1, 199, 6, 209, 7 };

    /**
     * Uniquely identifies a security available for trading. 6 digit security codes with possible values 1 to 999999.
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Market code.
     */
    private final MarketCodeField marketCode = new MarketCodeField();

    /**
     * ISIN code of the security.
     */
    private final IsinCodeField isinCode = new IsinCodeField();

    /**
     * Instrument type of the security.
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * Security short name.
     */
    private final SecurityShortNameField securityShortName = new SecurityShortNameField();

    /**
     * Base currency code of the market.
     */
    private final CurrencyCodeField currencyCode = new CurrencyCodeField();

    /**
     * Security name in Simplified Chinese using Unicode UTF-16LE encoding.
     */
    private final SecurityNameGbField securityNameGb = new SecurityNameGbField();

    /**
     * Board lot size for the security.
     */
    private final LotSizeField lotSize = new LotSizeField();

    /**
     * Previous closing price of the security. 3 implied decimal places. May be 0 on first day of listing.
     */
    private final PreviousClosingPriceField previousClosingPrice = new PreviousClosingPriceField();

    /**
     * Indicator for short-sell authorization.
     */
    private final ShortsellFlagField shortsellFlag = new ShortsellFlagField();

    /**
     * Date of security listing. YYYYMMDD. Value is 19000101 for unknown listing date.
     */
    private final ListingDateField listingDate = new ListingDateField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityCode, marketCode, isinCode, instrumentType, securityShortName, currencyCode, securityNameGb, lotSize, previousClosingPrice, shortsellFlag, listingDate);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Uniquely identifies a security available for trading. 6 digit security codes with possible values 1 to 999999.
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Market code.
     *
     * @return the MarketCode field
     */
    public MarketCodeField marketCode() {
        return marketCode;
    }

    /**
     * ISIN code of the security.
     *
     * @return the IsinCode field
     */
    public IsinCodeField isinCode() {
        return isinCode;
    }

    /**
     * Instrument type of the security.
     *
     * @return the InstrumentType field
     */
    public InstrumentTypeField instrumentType() {
        return instrumentType;
    }

    /**
     * Security short name.
     *
     * @return the SecurityShortName field
     */
    public SecurityShortNameField securityShortName() {
        return securityShortName;
    }

    /**
     * Base currency code of the market.
     *
     * @return the CurrencyCode field
     */
    public CurrencyCodeField currencyCode() {
        return currencyCode;
    }

    /**
     * Security name in Simplified Chinese using Unicode UTF-16LE encoding.
     *
     * @return the SecurityNameGb field
     */
    public SecurityNameGbField securityNameGb() {
        return securityNameGb;
    }

    /**
     * Board lot size for the security.
     *
     * @return the LotSize field
     */
    public LotSizeField lotSize() {
        return lotSize;
    }

    /**
     * Previous closing price of the security. 3 implied decimal places. May be 0 on first day of listing.
     *
     * @return the PreviousClosingPrice field
     */
    public PreviousClosingPriceField previousClosingPrice() {
        return previousClosingPrice;
    }

    /**
     * Indicator for short-sell authorization.
     *
     * @return the ShortsellFlag field
     */
    public ShortsellFlagField shortsellFlag() {
        return shortsellFlag;
    }

    /**
     * Date of security listing. YYYYMMDD. Value is 19000101 for unknown listing date.
     *
     * @return the ListingDate field
     */
    public ListingDateField listingDate() {
        return listingDate;
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
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!marketCode.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCodeField.BYTE_LENGTH;
        if (!isinCode.parse(data, cursor)) {
            return false;
        }
        cursor += IsinCodeField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!securityShortName.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityShortNameField.BYTE_LENGTH;
        if (!currencyCode.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyCodeField.BYTE_LENGTH;
        cursor += 60; // padding
        if (!securityNameGb.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityNameGbField.BYTE_LENGTH;
        if (!lotSize.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeField.BYTE_LENGTH;
        if (!previousClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousClosingPriceField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!shortsellFlag.parse(data, cursor)) {
            return false;
        }
        cursor += ShortsellFlagField.BYTE_LENGTH;
        cursor += 6; // padding
        if (!listingDate.parse(data, cursor)) {
            return false;
        }
        cursor += ListingDateField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityCode.encode(data, cursor);
        cursor = marketCode.encode(data, cursor);
        cursor = isinCode.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        if (buffer != null && buffer.length >= 26) {
            System.arraycopy(buffer, 24, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = securityShortName.encode(data, cursor);
        cursor = currencyCode.encode(data, cursor);
        if (buffer != null && buffer.length >= 129) {
            System.arraycopy(buffer, 69, data, cursor, 60); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 60, (byte) 0); // padding
        }
        cursor += 60;
        cursor = securityNameGb.encode(data, cursor);
        cursor = lotSize.encode(data, cursor);
        cursor = previousClosingPrice.encode(data, cursor);
        if (buffer != null && buffer.length >= 198) {
            System.arraycopy(buffer, 197, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = shortsellFlag.encode(data, cursor);
        if (buffer != null && buffer.length >= 205) {
            System.arraycopy(buffer, 199, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
        cursor = listingDate.encode(data, cursor);
        if (buffer != null && buffer.length >= 216) {
            System.arraycopy(buffer, 209, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
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
            case "SecurityCode" -> Optional.of(securityCode);
            case "MarketCode" -> Optional.of(marketCode);
            case "IsinCode" -> Optional.of(isinCode);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "SecurityShortName" -> Optional.of(securityShortName);
            case "CurrencyCode" -> Optional.of(currencyCode);
            case "SecurityNameGb" -> Optional.of(securityNameGb);
            case "LotSize" -> Optional.of(lotSize);
            case "PreviousClosingPrice" -> Optional.of(previousClosingPrice);
            case "ShortsellFlag" -> Optional.of(shortsellFlag);
            case "ListingDate" -> Optional.of(listingDate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityDefinitionMessage message)) {
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
        if (!(other instanceof SecurityDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
