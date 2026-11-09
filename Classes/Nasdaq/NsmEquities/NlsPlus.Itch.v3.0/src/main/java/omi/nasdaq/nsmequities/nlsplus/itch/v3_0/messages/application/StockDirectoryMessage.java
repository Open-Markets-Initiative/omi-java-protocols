package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.AuthenticityField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.BloombergIdField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.EtpFlagField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.EtpLeverageFactorField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.FinancialStatusIndicatorField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.InverseIndicatorField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.IpoFlagField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.IssueClassificationField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.IssueSubTypeField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.LuldReferencePriceTierField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.MarketCategoryField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.RoundLotSizeField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.RoundLotsOnlyField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.ShortSaleThresholdIndicatorField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.StockField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.Field;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.Message;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.PrintOptions;

/**
 * Represents the StockDirectoryMessage message from the NlsPlus protocol.
 *
 * <p>Identifies the securities eligible for the trading session, disseminated at the start of each day.</p>
 */
public final class StockDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 40;

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
     * Denotes the security symbol for the issue in the Nasdaq execution system
     */
    private final StockField stock = new StockField();

    /**
     * Indicates the listing market or listing market tier for the issue
     */
    private final MarketCategoryField marketCategory = new MarketCategoryField();

    /**
     * For Nasdaq listed issues, denotes when an issue is flagged as deficient, delinquent, bankrupt or in a compliance period
     */
    private final FinancialStatusIndicatorField financialStatusIndicator = new FinancialStatusIndicatorField();

    /**
     * Denotes the number of shares that represent a round lot for the issue
     */
    private final RoundLotSizeField roundLotSize = new RoundLotSizeField();

    /**
     * Indicates if Nasdaq system limits order entry for the issue
     */
    private final RoundLotsOnlyField roundLotsOnly = new RoundLotsOnlyField();

    /**
     * Identifies the security class for the issue as assigned by Nasdaq
     */
    private final IssueClassificationField issueClassification = new IssueClassificationField();

    /**
     * Identifies the security sub type for the issue as assigned by Nasdaq
     */
    private final IssueSubTypeField issueSubType = new IssueSubTypeField();

    /**
     * Denotes if an issue or quoting participant record is set up in Nasdaq systems in a live, test or demo state
     */
    private final AuthenticityField authenticity = new AuthenticityField();

    /**
     * Indicates if a security is subject to mandatory close-out of short sales under Sec Rule 203(b)(3)
     */
    private final ShortSaleThresholdIndicatorField shortSaleThresholdIndicator = new ShortSaleThresholdIndicatorField();

    /**
     * Indicates if the Nasdaq security is set up for Ipo release
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
     * Tracks the integral relationship of the Etp to the underlying index
     */
    private final EtpLeverageFactorField etpLeverageFactor = new EtpLeverageFactorField();

    /**
     * Indicates the directional relationship between the Etp and the underlying index
     */
    private final InverseIndicatorField inverseIndicator = new InverseIndicatorField();

    /**
     * Bloomberg global identifier for the issue
     */
    private final BloombergIdField bloombergId = new BloombergIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(stock, marketCategory, financialStatusIndicator, roundLotSize, roundLotsOnly, issueClassification, issueSubType, authenticity, shortSaleThresholdIndicator, ipoFlag, luldReferencePriceTier, etpFlag, etpLeverageFactor, inverseIndicator, bloombergId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Denotes the security symbol for the issue in the Nasdaq execution system
     *
     * @return the Stock field
     */
    public StockField stock() {
        return stock;
    }

    /**
     * Indicates the listing market or listing market tier for the issue
     *
     * @return the MarketCategory field
     */
    public MarketCategoryField marketCategory() {
        return marketCategory;
    }

    /**
     * For Nasdaq listed issues, denotes when an issue is flagged as deficient, delinquent, bankrupt or in a compliance period
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
     * Indicates if Nasdaq system limits order entry for the issue
     *
     * @return the RoundLotsOnly field
     */
    public RoundLotsOnlyField roundLotsOnly() {
        return roundLotsOnly;
    }

    /**
     * Identifies the security class for the issue as assigned by Nasdaq
     *
     * @return the IssueClassification field
     */
    public IssueClassificationField issueClassification() {
        return issueClassification;
    }

    /**
     * Identifies the security sub type for the issue as assigned by Nasdaq
     *
     * @return the IssueSubType field
     */
    public IssueSubTypeField issueSubType() {
        return issueSubType;
    }

    /**
     * Denotes if an issue or quoting participant record is set up in Nasdaq systems in a live, test or demo state
     *
     * @return the Authenticity field
     */
    public AuthenticityField authenticity() {
        return authenticity;
    }

    /**
     * Indicates if a security is subject to mandatory close-out of short sales under Sec Rule 203(b)(3)
     *
     * @return the ShortSaleThresholdIndicator field
     */
    public ShortSaleThresholdIndicatorField shortSaleThresholdIndicator() {
        return shortSaleThresholdIndicator;
    }

    /**
     * Indicates if the Nasdaq security is set up for Ipo release
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
     * Tracks the integral relationship of the Etp to the underlying index
     *
     * @return the EtpLeverageFactor field
     */
    public EtpLeverageFactorField etpLeverageFactor() {
        return etpLeverageFactor;
    }

    /**
     * Indicates the directional relationship between the Etp and the underlying index
     *
     * @return the InverseIndicator field
     */
    public InverseIndicatorField inverseIndicator() {
        return inverseIndicator;
    }

    /**
     * Bloomberg global identifier for the issue
     *
     * @return the BloombergId field
     */
    public BloombergIdField bloombergId() {
        return bloombergId;
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
        if (!bloombergId.parse(data, cursor)) {
            return false;
        }
        cursor += BloombergIdField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
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
        cursor = bloombergId.encode(data, cursor);
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
            case "BloombergId" -> Optional.of(bloombergId);
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
