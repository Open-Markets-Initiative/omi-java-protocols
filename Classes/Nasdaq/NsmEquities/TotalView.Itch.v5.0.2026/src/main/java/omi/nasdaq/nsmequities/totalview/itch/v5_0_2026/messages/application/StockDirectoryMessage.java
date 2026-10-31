package omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.AuthenticityField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.EtpFlagField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.EtpLeverageFactorField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.FinancialStatusIndicatorField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.InverseIndicatorField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.IpoFlagField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.IssueClassificationField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.IssueSubTypeField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.LuldReferencePriceTierField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.MarketCategoryField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.RoundLotSizeField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.RoundLotsOnlyField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.ShortSaleThresholdIndicatorField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.StockField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.StockLocateField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.TimestampField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.TrackingNumberField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.types.Field;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.types.Message;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.types.PrintOptions;

/**
 * Represents the StockDirectoryMessage message from the TotalView protocol.
 *
 * <p>Market data redistributors should process this message to populate the Financial Status Indicator (required display field) and the Market Category (recommended display field) for NASDAQ-listed issues.</p>
 */
public final class StockDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 38;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Stock Directory Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Locate Code uniquely assigned to the security symbol for the day
     */
    private final StockLocateField stockLocate = new StockLocateField();

    /**
     * Nasdaq internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Denotes the security symbol for the issue in the NASDAQ execution system.
     */
    private final StockField stock = new StockField();

    /**
     * Indicates listing market or listing market tier for the issue
     */
    private final MarketCategoryField marketCategory = new MarketCategoryField();

    /**
     * Indicates when a firm is not in compliance with NASDAQ continued listing requirements
     */
    private final FinancialStatusIndicatorField financialStatusIndicator = new FinancialStatusIndicatorField();

    /**
     * Denotes the number of shares that represent a round lot for the issue
     */
    private final RoundLotSizeField roundLotSize = new RoundLotSizeField();

    /**
     * Indicates if Nasdaq system limits order entry for issue
     */
    private final RoundLotsOnlyField roundLotsOnly = new RoundLotsOnlyField();

    /**
     * Identifies the security class for the issue as assigned by NASDAQ
     */
    private final IssueClassificationField issueClassification = new IssueClassificationField();

    /**
     * Identifies the security sub-type for the issue as assigned by NASDAQ
     */
    private final IssueSubTypeField issueSubType = new IssueSubTypeField();

    /**
     * Denotes if an issue or quoting participant record is set-up in NASDAQ systems in a live/production, test, or demo state
     */
    private final AuthenticityField authenticity = new AuthenticityField();

    /**
     * Indicates if a security is subject to mandatory close-out of short sales under SEC Rule 203(b)(3).
     */
    private final ShortSaleThresholdIndicatorField shortSaleThresholdIndicator = new ShortSaleThresholdIndicatorField();

    /**
     * Indicates if the NASDAQ security is set up for IPO release
     */
    private final IpoFlagField ipoFlag = new IpoFlagField();

    /**
     * Indicates which Limit Up / Limit Down price band calculation parameter is to be used for the instrument
     */
    private final LuldReferencePriceTierField luldReferencePriceTier = new LuldReferencePriceTierField();

    /**
     * Indicates whether the security is an exchange traded product
     */
    private final EtpFlagField etpFlag = new EtpFlagField();

    /**
     * Tracks the integral relationship of the ETP to the underlying index
     */
    private final EtpLeverageFactorField etpLeverageFactor = new EtpLeverageFactorField();

    /**
     * Indicates the directional relationship between the ETP and underlying index. Example: An ETP Leverage Factor of 3 and an Inverse value of 'Y' indicates the ETP will decrease by a value of 3.
     */
    private final InverseIndicatorField inverseIndicator = new InverseIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(stockLocate, trackingNumber, timestampField, stock, marketCategory, financialStatusIndicator, roundLotSize, roundLotsOnly, issueClassification, issueSubType, authenticity, shortSaleThresholdIndicator, ipoFlag, luldReferencePriceTier, etpFlag, etpLeverageFactor, inverseIndicator);

    private byte[] buffer;

    private int bufferOffset;

    private boolean decoded;

    /**
     * Locate Code uniquely assigned to the security symbol for the day
     *
     * @return the StockLocate field
     */
    public StockLocateField stockLocate() {
        return stockLocate;
    }

    /**
     * Nasdaq internal tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Denotes the security symbol for the issue in the NASDAQ execution system.
     *
     * @return the Stock field
     */
    public StockField stock() {
        return stock;
    }

    /**
     * Indicates listing market or listing market tier for the issue
     *
     * @return the MarketCategory field
     */
    public MarketCategoryField marketCategory() {
        return marketCategory;
    }

    /**
     * Indicates when a firm is not in compliance with NASDAQ continued listing requirements
     *
     * @return the FinancialStatusIndicator field
     */
    public FinancialStatusIndicatorField financialStatusIndicator() {
        return financialStatusIndicator;
    }

    /**
     * Denotes the number of shares that represent a round lot for the issue
     *
     * @return the RoundLotSize field
     */
    public RoundLotSizeField roundLotSize() {
        return roundLotSize;
    }

    /**
     * Indicates if Nasdaq system limits order entry for issue
     *
     * @return the RoundLotsOnly field
     */
    public RoundLotsOnlyField roundLotsOnly() {
        return roundLotsOnly;
    }

    /**
     * Identifies the security class for the issue as assigned by NASDAQ
     *
     * @return the IssueClassification field
     */
    public IssueClassificationField issueClassification() {
        return issueClassification;
    }

    /**
     * Identifies the security sub-type for the issue as assigned by NASDAQ
     *
     * @return the IssueSubType field
     */
    public IssueSubTypeField issueSubType() {
        return issueSubType;
    }

    /**
     * Denotes if an issue or quoting participant record is set-up in NASDAQ systems in a live/production, test, or demo state
     *
     * @return the Authenticity field
     */
    public AuthenticityField authenticity() {
        return authenticity;
    }

    /**
     * Indicates if a security is subject to mandatory close-out of short sales under SEC Rule 203(b)(3).
     *
     * @return the ShortSaleThresholdIndicator field
     */
    public ShortSaleThresholdIndicatorField shortSaleThresholdIndicator() {
        return shortSaleThresholdIndicator;
    }

    /**
     * Indicates if the NASDAQ security is set up for IPO release
     *
     * @return the IpoFlag field
     */
    public IpoFlagField ipoFlag() {
        return ipoFlag;
    }

    /**
     * Indicates which Limit Up / Limit Down price band calculation parameter is to be used for the instrument
     *
     * @return the LuldReferencePriceTier field
     */
    public LuldReferencePriceTierField luldReferencePriceTier() {
        return luldReferencePriceTier;
    }

    /**
     * Indicates whether the security is an exchange traded product
     *
     * @return the EtpFlag field
     */
    public EtpFlagField etpFlag() {
        return etpFlag;
    }

    /**
     * Tracks the integral relationship of the ETP to the underlying index
     *
     * @return the EtpLeverageFactor field
     */
    public EtpLeverageFactorField etpLeverageFactor() {
        return etpLeverageFactor;
    }

    /**
     * Indicates the directional relationship between the ETP and underlying index. Example: An ETP Leverage Factor of 3 and an Inverse value of 'Y' indicates the ETP will decrease by a value of 3.
     *
     * @return the InverseIndicator field
     */
    public InverseIndicatorField inverseIndicator() {
        return inverseIndicator;
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
     * <p>Padding carries no value: decode advances over it and encode writes it as zero. Use this to check that a received message's padding is zero where the specification requires it, or to render a byte map of the layout.</p>
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
        clear();
        this.buffer = data;
        this.bufferOffset = offset;

        if (offset < 0 || offset + BYTE_LENGTH > data.length) {
            return false;
        }

        int cursor = offset;
        if (!stockLocate.parse(data, cursor)) {
            return false;
        }
        cursor += StockLocateField.BYTE_LENGTH;
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!stock.parse(data, cursor)) {
            return false;
        }
        cursor += StockField.BYTE_LENGTH;
        if (!marketCategory.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCategoryField.BYTE_LENGTH;
        if (!financialStatusIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialStatusIndicatorField.BYTE_LENGTH;
        if (!roundLotSize.parse(data, cursor)) {
            return false;
        }
        cursor += RoundLotSizeField.BYTE_LENGTH;
        if (!roundLotsOnly.parse(data, cursor)) {
            return false;
        }
        cursor += RoundLotsOnlyField.BYTE_LENGTH;
        if (!issueClassification.parse(data, cursor)) {
            return false;
        }
        cursor += IssueClassificationField.BYTE_LENGTH;
        if (!issueSubType.parse(data, cursor)) {
            return false;
        }
        cursor += IssueSubTypeField.BYTE_LENGTH;
        if (!authenticity.parse(data, cursor)) {
            return false;
        }
        cursor += AuthenticityField.BYTE_LENGTH;
        if (!shortSaleThresholdIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSaleThresholdIndicatorField.BYTE_LENGTH;
        if (!ipoFlag.parse(data, cursor)) {
            return false;
        }
        cursor += IpoFlagField.BYTE_LENGTH;
        if (!luldReferencePriceTier.parse(data, cursor)) {
            return false;
        }
        cursor += LuldReferencePriceTierField.BYTE_LENGTH;
        if (!etpFlag.parse(data, cursor)) {
            return false;
        }
        cursor += EtpFlagField.BYTE_LENGTH;
        if (!etpLeverageFactor.parse(data, cursor)) {
            return false;
        }
        cursor += EtpLeverageFactorField.BYTE_LENGTH;
        if (!inverseIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += InverseIndicatorField.BYTE_LENGTH;

        this.decoded = true;
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = stockLocate.encode(data, cursor);
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = stock.encode(data, cursor);
        cursor = marketCategory.encode(data, cursor);
        cursor = financialStatusIndicator.encode(data, cursor);
        cursor = roundLotSize.encode(data, cursor);
        cursor = roundLotsOnly.encode(data, cursor);
        cursor = issueClassification.encode(data, cursor);
        cursor = issueSubType.encode(data, cursor);
        cursor = authenticity.encode(data, cursor);
        cursor = shortSaleThresholdIndicator.encode(data, cursor);
        cursor = ipoFlag.encode(data, cursor);
        cursor = luldReferencePriceTier.encode(data, cursor);
        cursor = etpFlag.encode(data, cursor);
        cursor = etpLeverageFactor.encode(data, cursor);
        cursor = inverseIndicator.encode(data, cursor);
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
        this.bufferOffset = 0;
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
        int end = Math.min(buffer.length, bufferOffset + BYTE_LENGTH);
        int start = Math.min(Math.max(bufferOffset, 0), end);
        return Optional.of(Arrays.copyOfRange(buffer, start, end));
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
            case "StockLocate" -> Optional.of(stockLocate);
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "Stock" -> Optional.of(stock);
            case "MarketCategory" -> Optional.of(marketCategory);
            case "FinancialStatusIndicator" -> Optional.of(financialStatusIndicator);
            case "RoundLotSize" -> Optional.of(roundLotSize);
            case "RoundLotsOnly" -> Optional.of(roundLotsOnly);
            case "IssueClassification" -> Optional.of(issueClassification);
            case "IssueSubType" -> Optional.of(issueSubType);
            case "Authenticity" -> Optional.of(authenticity);
            case "ShortSaleThresholdIndicator" -> Optional.of(shortSaleThresholdIndicator);
            case "IpoFlag" -> Optional.of(ipoFlag);
            case "LuldReferencePriceTier" -> Optional.of(luldReferencePriceTier);
            case "EtpFlag" -> Optional.of(etpFlag);
            case "EtpLeverageFactor" -> Optional.of(etpLeverageFactor);
            case "InverseIndicator" -> Optional.of(inverseIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StockDirectoryMessage message)) {
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
        if (!(other instanceof StockDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
