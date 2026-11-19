package omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BondTypeNameField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ChangeCategoryField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ContractCategoryField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ContractDateField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.DataSmallCategoryField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.DataSourceTypeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EndKeywordField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.InputDateField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IsinField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.MarketDataTypeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.OriginalSequenceNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.PreviousIsinOfReplacementField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.PriceQuotesTradingField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ProfitRateQuotesTradingField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.QuotesAmountField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.QuotesOfferTimeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ReplacementTypeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SequenceNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SettlementDateKBondField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Field;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.PrintOptions;

/**
 * Represents the KBondMessage message from the Koscom protocol.
 *
 * <p>K-BOND dissemination. Quotes and trades with profit rate or price, contract category, settlement date, and replacement order details.</p>
 */
public final class KBondMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 145;

    /**
     * This message's declared name.
     */
    public static final String NAME = "K Bond Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 133, 11 };

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     */
    private final IsinField isin = new IsinField();

    /**
     * H1:Quotes /Trading H2:Quotes /Trading Change Detail.
     */
    private final DataSmallCategoryField dataSmallCategory = new DataSmallCategoryField();

    /**
     * SPACE set to FILLER.
     */
    private final DataSourceTypeField dataSourceType = new DataSourceTypeField();

    /**
     * 1~99999999 Records Checking Purpose.
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * In case of H1 data : 00000000 Original Sequence Number ← Previous ISIN.
     */
    private final OriginalSequenceNumberField originalSequenceNumber = new OriginalSequenceNumberField();

    /**
     * 0:ordinary order, 1:replacement order.
     */
    private final ReplacementTypeField replacementType = new ReplacementTypeField();

    /**
     * Except for the second price of replacement order : 00000000.
     */
    private final PreviousIsinOfReplacementField previousIsinOfReplacement = new PreviousIsinOfReplacementField();

    /**
     * YYYYMMDD.
     */
    private final InputDateField inputDate = new InputDateField();

    /**
     * Quotes generated time(HHMMSS).
     */
    private final QuotesOfferTimeField quotesOfferTime = new QuotesOfferTimeField();

    /**
     * Traded Bond Type Name.
     */
    private final BondTypeNameField bondTypeName = new BondTypeNameField();

    /**
     * 1:Newly added, 2:Update a current announcemet, 3:Deleted.
     */
    private final ChangeCategoryField changeCategory = new ChangeCategoryField();

    /**
     * 1:Profit rate, 2:Price.
     */
    private final MarketDataTypeField marketDataType = new MarketDataTypeField();

    /**
     * 999V99999.
     */
    private final ProfitRateQuotesTradingField profitRateQuotesTrading = new ProfitRateQuotesTradingField();

    /**
     * 99999V999 Unit: KRW.
     */
    private final PriceQuotesTradingField priceQuotesTrading = new PriceQuotesTradingField();

    /**
     * 1:Bid 2:Ask 3: Trading.
     */
    private final ContractCategoryField contractCategory = new ContractCategoryField();

    /**
     * KRW(Data transmitted only for Bid(1)/Ask(2) on 'Contract category' field).
     */
    private final QuotesAmountField quotesAmount = new QuotesAmountField();

    /**
     * 1:Outstanding Negotiation, 2:T+0, 3:T+1, 4:T+2, ~ 32:T+30.
     */
    private final ContractDateField contractDate = new ContractDateField();

    /**
     * 2:T+0(On one day), 3:T+1(Next day), 4:T+2, ~ 32:T+30.
     */
    private final SettlementDateKBondField settlementDateKBond = new SettlementDateKBondField();

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     */
    private final EndKeywordField endKeyword = new EndKeywordField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(isin, dataSmallCategory, dataSourceType, sequenceNumber, originalSequenceNumber, replacementType, previousIsinOfReplacement, inputDate, quotesOfferTime, bondTypeName, changeCategory, marketDataType, profitRateQuotesTrading, priceQuotesTrading, contractCategory, quotesAmount, contractDate, settlementDateKBond, endKeyword);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * H1:Quotes /Trading H2:Quotes /Trading Change Detail.
     *
     * @return the DataSmallCategory field
     */
    public DataSmallCategoryField dataSmallCategory() {
        return dataSmallCategory;
    }

    /**
     * SPACE set to FILLER.
     *
     * @return the DataSourceType field
     */
    public DataSourceTypeField dataSourceType() {
        return dataSourceType;
    }

    /**
     * 1~99999999 Records Checking Purpose.
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * In case of H1 data : 00000000 Original Sequence Number ← Previous ISIN.
     *
     * @return the OriginalSequenceNumber field
     */
    public OriginalSequenceNumberField originalSequenceNumber() {
        return originalSequenceNumber;
    }

    /**
     * 0:ordinary order, 1:replacement order.
     *
     * @return the ReplacementType field
     */
    public ReplacementTypeField replacementType() {
        return replacementType;
    }

    /**
     * Except for the second price of replacement order : 00000000.
     *
     * @return the PreviousIsinOfReplacement field
     */
    public PreviousIsinOfReplacementField previousIsinOfReplacement() {
        return previousIsinOfReplacement;
    }

    /**
     * YYYYMMDD.
     *
     * @return the InputDate field
     */
    public InputDateField inputDate() {
        return inputDate;
    }

    /**
     * Quotes generated time(HHMMSS).
     *
     * @return the QuotesOfferTime field
     */
    public QuotesOfferTimeField quotesOfferTime() {
        return quotesOfferTime;
    }

    /**
     * Traded Bond Type Name.
     *
     * @return the BondTypeName field
     */
    public BondTypeNameField bondTypeName() {
        return bondTypeName;
    }

    /**
     * 1:Newly added, 2:Update a current announcemet, 3:Deleted.
     *
     * @return the ChangeCategory field
     */
    public ChangeCategoryField changeCategory() {
        return changeCategory;
    }

    /**
     * 1:Profit rate, 2:Price.
     *
     * @return the MarketDataType field
     */
    public MarketDataTypeField marketDataType() {
        return marketDataType;
    }

    /**
     * 999V99999.
     *
     * @return the ProfitRateQuotesTrading field
     */
    public ProfitRateQuotesTradingField profitRateQuotesTrading() {
        return profitRateQuotesTrading;
    }

    /**
     * 99999V999 Unit: KRW.
     *
     * @return the PriceQuotesTrading field
     */
    public PriceQuotesTradingField priceQuotesTrading() {
        return priceQuotesTrading;
    }

    /**
     * 1:Bid 2:Ask 3: Trading.
     *
     * @return the ContractCategory field
     */
    public ContractCategoryField contractCategory() {
        return contractCategory;
    }

    /**
     * KRW(Data transmitted only for Bid(1)/Ask(2) on 'Contract category' field).
     *
     * @return the QuotesAmount field
     */
    public QuotesAmountField quotesAmount() {
        return quotesAmount;
    }

    /**
     * 1:Outstanding Negotiation, 2:T+0, 3:T+1, 4:T+2, ~ 32:T+30.
     *
     * @return the ContractDate field
     */
    public ContractDateField contractDate() {
        return contractDate;
    }

    /**
     * 2:T+0(On one day), 3:T+1(Next day), 4:T+2, ~ 32:T+30.
     *
     * @return the SettlementDateKBond field
     */
    public SettlementDateKBondField settlementDateKBond() {
        return settlementDateKBond;
    }

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     *
     * @return the EndKeyword field
     */
    public EndKeywordField endKeyword() {
        return endKeyword;
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
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!dataSmallCategory.parse(data, cursor)) {
            return false;
        }
        cursor += DataSmallCategoryField.BYTE_LENGTH;
        if (!dataSourceType.parse(data, cursor)) {
            return false;
        }
        cursor += DataSourceTypeField.BYTE_LENGTH;
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!originalSequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalSequenceNumberField.BYTE_LENGTH;
        if (!replacementType.parse(data, cursor)) {
            return false;
        }
        cursor += ReplacementTypeField.BYTE_LENGTH;
        if (!previousIsinOfReplacement.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousIsinOfReplacementField.BYTE_LENGTH;
        if (!inputDate.parse(data, cursor)) {
            return false;
        }
        cursor += InputDateField.BYTE_LENGTH;
        if (!quotesOfferTime.parse(data, cursor)) {
            return false;
        }
        cursor += QuotesOfferTimeField.BYTE_LENGTH;
        if (!bondTypeName.parse(data, cursor)) {
            return false;
        }
        cursor += BondTypeNameField.BYTE_LENGTH;
        if (!changeCategory.parse(data, cursor)) {
            return false;
        }
        cursor += ChangeCategoryField.BYTE_LENGTH;
        if (!marketDataType.parse(data, cursor)) {
            return false;
        }
        cursor += MarketDataTypeField.BYTE_LENGTH;
        if (!profitRateQuotesTrading.parse(data, cursor)) {
            return false;
        }
        cursor += ProfitRateQuotesTradingField.BYTE_LENGTH;
        if (!priceQuotesTrading.parse(data, cursor)) {
            return false;
        }
        cursor += PriceQuotesTradingField.BYTE_LENGTH;
        if (!contractCategory.parse(data, cursor)) {
            return false;
        }
        cursor += ContractCategoryField.BYTE_LENGTH;
        if (!quotesAmount.parse(data, cursor)) {
            return false;
        }
        cursor += QuotesAmountField.BYTE_LENGTH;
        if (!contractDate.parse(data, cursor)) {
            return false;
        }
        cursor += ContractDateField.BYTE_LENGTH;
        if (!settlementDateKBond.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementDateKBondField.BYTE_LENGTH;
        cursor += 11; // padding
        return endKeyword.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = isin.encode(data, cursor);
        cursor = dataSmallCategory.encode(data, cursor);
        cursor = dataSourceType.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = originalSequenceNumber.encode(data, cursor);
        cursor = replacementType.encode(data, cursor);
        cursor = previousIsinOfReplacement.encode(data, cursor);
        cursor = inputDate.encode(data, cursor);
        cursor = quotesOfferTime.encode(data, cursor);
        cursor = bondTypeName.encode(data, cursor);
        cursor = changeCategory.encode(data, cursor);
        cursor = marketDataType.encode(data, cursor);
        cursor = profitRateQuotesTrading.encode(data, cursor);
        cursor = priceQuotesTrading.encode(data, cursor);
        cursor = contractCategory.encode(data, cursor);
        cursor = quotesAmount.encode(data, cursor);
        cursor = contractDate.encode(data, cursor);
        cursor = settlementDateKBond.encode(data, cursor);
        if (buffer != null && buffer.length >= 144) {
            System.arraycopy(buffer, 133, data, cursor, 11); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 11, (byte) 0); // padding
        }
        cursor += 11;
        cursor = endKeyword.encode(data, cursor);
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
            case "Isin" -> Optional.of(isin);
            case "DataSmallCategory" -> Optional.of(dataSmallCategory);
            case "DataSourceType" -> Optional.of(dataSourceType);
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "OriginalSequenceNumber" -> Optional.of(originalSequenceNumber);
            case "ReplacementType" -> Optional.of(replacementType);
            case "PreviousIsinOfReplacement" -> Optional.of(previousIsinOfReplacement);
            case "InputDate" -> Optional.of(inputDate);
            case "QuotesOfferTime" -> Optional.of(quotesOfferTime);
            case "BondTypeName" -> Optional.of(bondTypeName);
            case "ChangeCategory" -> Optional.of(changeCategory);
            case "MarketDataType" -> Optional.of(marketDataType);
            case "ProfitRateQuotesTrading" -> Optional.of(profitRateQuotesTrading);
            case "PriceQuotesTrading" -> Optional.of(priceQuotesTrading);
            case "ContractCategory" -> Optional.of(contractCategory);
            case "QuotesAmount" -> Optional.of(quotesAmount);
            case "ContractDate" -> Optional.of(contractDate);
            case "SettlementDateKBond" -> Optional.of(settlementDateKBond);
            case "EndKeyword" -> Optional.of(endKeyword);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof KBondMessage message)) {
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
        if (!(other instanceof KBondMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
