package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.ApplicableBusinessDayField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.ExDividendExRightFlagField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.IndustryCodeField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.IsinFlagField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.IssueNameField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.LoanMarginFlagField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.NewListingFlagField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.NewSecurityCodeField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Reserved11Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Reserved1Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Reserved2Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Reserved5Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.SecuritiesToBeDelistedUnderSupervisionClassificationField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.SecurityTypeEtcIdentificationCodeField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.SerialNoField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.ShortSellingPriceRestrictionAppliedFlagAtTheRegularDistributionField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.UnitOfTradingField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.WhenIssuedTransactionFlagField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.structs.IndexConstituentIssue;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.structs.OrderProhibitionStatusAtTheRegularDistribution;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.types.Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.types.Message;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.types.PrintOptions;

/**
 * Represents the IssueInformationMessage message from the IssueBasicInformation protocol.
 *
 * <p>In this tag, the new security code, etc., of each issue will be set. This tag appears as part of an issue basic message.</p>
 */
public final class IssueInformationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 123;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Issue Information Message";

    /**
     * This item is reserved.
     */
    private final Reserved2Field reserved2 = new Reserved2Field();

    /**
     * Indicates the applicable serial number, which will be allocated in sequence from the first to the last issues.
     */
    private final SerialNoField serialNo = new SerialNoField();

    /**
     * Indicates the business day which the issue information applies.
     */
    private final ApplicableBusinessDayField applicableBusinessDay = new ApplicableBusinessDayField();

    /**
     * This item is reserved.
     */
    private final Reserved1Field reserved1 = new Reserved1Field();

    /**
     * Indicates the issue name. (Chinese characters) The S-JIS code will be used.
     */
    private final IssueNameField issueName = new IssueNameField();

    /**
     * Indicates the security type, etc., code.
     */
    private final SecurityTypeEtcIdentificationCodeField securityTypeEtcIdentificationCode = new SecurityTypeEtcIdentificationCodeField();

    /**
     * Indicates the ISIN flag.
     */
    private final IsinFlagField isinFlag = new IsinFlagField();

    /**
     * Indicates the New security code that is defined by the Securities Identification code committee.
     */
    private final NewSecurityCodeField newSecurityCode = new NewSecurityCodeField();

    /**
     * Indicates the Industry code.
     */
    private final IndustryCodeField industryCode = new IndustryCodeField();

    /**
     * Indicates the New listing flag.
     */
    private final NewListingFlagField newListingFlag = new NewListingFlagField();

    /**
     * Indicates the When-issued transaction issue.
     */
    private final WhenIssuedTransactionFlagField whenIssuedTransactionFlag = new WhenIssuedTransactionFlagField();

    /**
     * Indicates the issue that applied the Short Selling Price Restriction at the regular distribution on the applicable business day.
     */
    private final ShortSellingPriceRestrictionAppliedFlagAtTheRegularDistributionField shortSellingPriceRestrictionAppliedFlagAtTheRegularDistribution = new ShortSellingPriceRestrictionAppliedFlagAtTheRegularDistributionField();

    /**
     * Indicates the Loan・margin flag.
     */
    private final LoanMarginFlagField loanMarginFlag = new LoanMarginFlagField();

    /**
     * Indicates the Ex-dividend / Ex-right flag.
     */
    private final ExDividendExRightFlagField exDividendExRightFlag = new ExDividendExRightFlagField();

    /**
     * Indicates the Securities to be delisted / under supervision classification.
     */
    private final SecuritiesToBeDelistedUnderSupervisionClassificationField securitiesToBeDelistedUnderSupervisionClassification = new SecuritiesToBeDelistedUnderSupervisionClassificationField();

    /**
     * This item is reserved.
     */
    private final Reserved5Field reserved5 = new Reserved5Field();

    /**
     * Indicates unit of trading.
     */
    private final UnitOfTradingField unitOfTrading = new UnitOfTradingField();

    /**
     * This item will be reserved.
     */
    private final Reserved11Field reserved11 = new Reserved11Field();

    /**
     * Index constituent issue
     */
    private final IndexConstituentIssue indexConstituentIssue = new IndexConstituentIssue();

    /**
     * Order Prohibition Status (at the regular distribution)
     */
    private final OrderProhibitionStatusAtTheRegularDistribution orderProhibitionStatusAtTheRegularDistribution = new OrderProhibitionStatusAtTheRegularDistribution();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(reserved2), List.<Field>of(serialNo), List.<Field>of(applicableBusinessDay), List.<Field>of(reserved1), List.<Field>of(issueName), List.<Field>of(securityTypeEtcIdentificationCode), List.<Field>of(isinFlag), List.<Field>of(newSecurityCode), List.<Field>of(industryCode), List.<Field>of(newListingFlag), List.<Field>of(whenIssuedTransactionFlag), List.<Field>of(shortSellingPriceRestrictionAppliedFlagAtTheRegularDistribution), List.<Field>of(loanMarginFlag), List.<Field>of(exDividendExRightFlag), List.<Field>of(securitiesToBeDelistedUnderSupervisionClassification), List.<Field>of(reserved5), List.<Field>of(unitOfTrading), indexConstituentIssue.fields(), orderProhibitionStatusAtTheRegularDistribution.fields(), List.<Field>of(reserved11)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * This item is reserved.
     *
     * @return the Reserved2 field
     */
    public Reserved2Field reserved2() {
        return reserved2;
    }

    /**
     * Indicates the applicable serial number, which will be allocated in sequence from the first to the last issues.
     *
     * @return the SerialNo field
     */
    public SerialNoField serialNo() {
        return serialNo;
    }

    /**
     * Indicates the business day which the issue information applies.
     *
     * @return the ApplicableBusinessDay field
     */
    public ApplicableBusinessDayField applicableBusinessDay() {
        return applicableBusinessDay;
    }

    /**
     * This item is reserved.
     *
     * @return the Reserved1 field
     */
    public Reserved1Field reserved1() {
        return reserved1;
    }

    /**
     * Indicates the issue name. (Chinese characters) The S-JIS code will be used.
     *
     * @return the IssueName field
     */
    public IssueNameField issueName() {
        return issueName;
    }

    /**
     * Indicates the security type, etc., code.
     *
     * @return the SecurityTypeEtcIdentificationCode field
     */
    public SecurityTypeEtcIdentificationCodeField securityTypeEtcIdentificationCode() {
        return securityTypeEtcIdentificationCode;
    }

    /**
     * Indicates the ISIN flag.
     *
     * @return the IsinFlag field
     */
    public IsinFlagField isinFlag() {
        return isinFlag;
    }

    /**
     * Indicates the New security code that is defined by the Securities Identification code committee.
     *
     * @return the NewSecurityCode field
     */
    public NewSecurityCodeField newSecurityCode() {
        return newSecurityCode;
    }

    /**
     * Indicates the Industry code.
     *
     * @return the IndustryCode field
     */
    public IndustryCodeField industryCode() {
        return industryCode;
    }

    /**
     * Indicates the New listing flag.
     *
     * @return the NewListingFlag field
     */
    public NewListingFlagField newListingFlag() {
        return newListingFlag;
    }

    /**
     * Indicates the When-issued transaction issue.
     *
     * @return the WhenIssuedTransactionFlag field
     */
    public WhenIssuedTransactionFlagField whenIssuedTransactionFlag() {
        return whenIssuedTransactionFlag;
    }

    /**
     * Indicates the issue that applied the Short Selling Price Restriction at the regular distribution on the applicable business day.
     *
     * @return the ShortSellingPriceRestrictionAppliedFlagAtTheRegularDistribution field
     */
    public ShortSellingPriceRestrictionAppliedFlagAtTheRegularDistributionField shortSellingPriceRestrictionAppliedFlagAtTheRegularDistribution() {
        return shortSellingPriceRestrictionAppliedFlagAtTheRegularDistribution;
    }

    /**
     * Indicates the Loan・margin flag.
     *
     * @return the LoanMarginFlag field
     */
    public LoanMarginFlagField loanMarginFlag() {
        return loanMarginFlag;
    }

    /**
     * Indicates the Ex-dividend / Ex-right flag.
     *
     * @return the ExDividendExRightFlag field
     */
    public ExDividendExRightFlagField exDividendExRightFlag() {
        return exDividendExRightFlag;
    }

    /**
     * Indicates the Securities to be delisted / under supervision classification.
     *
     * @return the SecuritiesToBeDelistedUnderSupervisionClassification field
     */
    public SecuritiesToBeDelistedUnderSupervisionClassificationField securitiesToBeDelistedUnderSupervisionClassification() {
        return securitiesToBeDelistedUnderSupervisionClassification;
    }

    /**
     * This item is reserved.
     *
     * @return the Reserved5 field
     */
    public Reserved5Field reserved5() {
        return reserved5;
    }

    /**
     * Indicates unit of trading.
     *
     * @return the UnitOfTrading field
     */
    public UnitOfTradingField unitOfTrading() {
        return unitOfTrading;
    }

    /**
     * This item will be reserved.
     *
     * @return the Reserved11 field
     */
    public Reserved11Field reserved11() {
        return reserved11;
    }

    /**
     * Index constituent issue
     *
     * @return the IndexConstituentIssue record
     */
    public IndexConstituentIssue indexConstituentIssue() {
        return indexConstituentIssue;
    }

    /**
     * Order Prohibition Status (at the regular distribution)
     *
     * @return the OrderProhibitionStatusAtTheRegularDistribution record
     */
    public OrderProhibitionStatusAtTheRegularDistribution orderProhibitionStatusAtTheRegularDistribution() {
        return orderProhibitionStatusAtTheRegularDistribution;
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
        if (!reserved2.parse(data, cursor)) {
            return false;
        }
        cursor += Reserved2Field.BYTE_LENGTH;
        if (!serialNo.parse(data, cursor)) {
            return false;
        }
        cursor += SerialNoField.BYTE_LENGTH;
        if (!applicableBusinessDay.parse(data, cursor)) {
            return false;
        }
        cursor += ApplicableBusinessDayField.BYTE_LENGTH;
        if (!reserved1.parse(data, cursor)) {
            return false;
        }
        cursor += Reserved1Field.BYTE_LENGTH;
        if (!issueName.parse(data, cursor)) {
            return false;
        }
        cursor += IssueNameField.BYTE_LENGTH;
        if (!securityTypeEtcIdentificationCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeEtcIdentificationCodeField.BYTE_LENGTH;
        if (!isinFlag.parse(data, cursor)) {
            return false;
        }
        cursor += IsinFlagField.BYTE_LENGTH;
        if (!newSecurityCode.parse(data, cursor)) {
            return false;
        }
        cursor += NewSecurityCodeField.BYTE_LENGTH;
        if (!industryCode.parse(data, cursor)) {
            return false;
        }
        cursor += IndustryCodeField.BYTE_LENGTH;
        if (!newListingFlag.parse(data, cursor)) {
            return false;
        }
        cursor += NewListingFlagField.BYTE_LENGTH;
        if (!whenIssuedTransactionFlag.parse(data, cursor)) {
            return false;
        }
        cursor += WhenIssuedTransactionFlagField.BYTE_LENGTH;
        if (!shortSellingPriceRestrictionAppliedFlagAtTheRegularDistribution.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSellingPriceRestrictionAppliedFlagAtTheRegularDistributionField.BYTE_LENGTH;
        if (!loanMarginFlag.parse(data, cursor)) {
            return false;
        }
        cursor += LoanMarginFlagField.BYTE_LENGTH;
        if (!exDividendExRightFlag.parse(data, cursor)) {
            return false;
        }
        cursor += ExDividendExRightFlagField.BYTE_LENGTH;
        if (!securitiesToBeDelistedUnderSupervisionClassification.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritiesToBeDelistedUnderSupervisionClassificationField.BYTE_LENGTH;
        if (!reserved5.parse(data, cursor)) {
            return false;
        }
        cursor += Reserved5Field.BYTE_LENGTH;
        if (!unitOfTrading.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfTradingField.BYTE_LENGTH;
        if (!indexConstituentIssue.parseFrom(data, cursor, end - 21)) {
            return false;
        }
        cursor += indexConstituentIssue.byteLength();
        if (!orderProhibitionStatusAtTheRegularDistribution.parseFrom(data, cursor, end - 11)) {
            return false;
        }
        cursor += orderProhibitionStatusAtTheRegularDistribution.byteLength();
        return reserved11.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = reserved2.encode(data, cursor);
        cursor = serialNo.encode(data, cursor);
        cursor = applicableBusinessDay.encode(data, cursor);
        cursor = reserved1.encode(data, cursor);
        cursor = issueName.encode(data, cursor);
        cursor = securityTypeEtcIdentificationCode.encode(data, cursor);
        cursor = isinFlag.encode(data, cursor);
        cursor = newSecurityCode.encode(data, cursor);
        cursor = industryCode.encode(data, cursor);
        cursor = newListingFlag.encode(data, cursor);
        cursor = whenIssuedTransactionFlag.encode(data, cursor);
        cursor = shortSellingPriceRestrictionAppliedFlagAtTheRegularDistribution.encode(data, cursor);
        cursor = loanMarginFlag.encode(data, cursor);
        cursor = exDividendExRightFlag.encode(data, cursor);
        cursor = securitiesToBeDelistedUnderSupervisionClassification.encode(data, cursor);
        cursor = reserved5.encode(data, cursor);
        cursor = unitOfTrading.encode(data, cursor);
        cursor = indexConstituentIssue.encode(data, cursor);
        cursor = orderProhibitionStatusAtTheRegularDistribution.encode(data, cursor);
        cursor = reserved11.encode(data, cursor);
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
        indexConstituentIssue.clear();
        orderProhibitionStatusAtTheRegularDistribution.clear();
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
            case "Reserved2" -> Optional.of(reserved2);
            case "SerialNo" -> Optional.of(serialNo);
            case "ApplicableBusinessDay" -> Optional.of(applicableBusinessDay);
            case "Reserved1" -> Optional.of(reserved1);
            case "IssueName" -> Optional.of(issueName);
            case "SecurityTypeEtcIdentificationCode" -> Optional.of(securityTypeEtcIdentificationCode);
            case "IsinFlag" -> Optional.of(isinFlag);
            case "NewSecurityCode" -> Optional.of(newSecurityCode);
            case "IndustryCode" -> Optional.of(industryCode);
            case "NewListingFlag" -> Optional.of(newListingFlag);
            case "WhenIssuedTransactionFlag" -> Optional.of(whenIssuedTransactionFlag);
            case "ShortSellingPriceRestrictionAppliedFlagAtTheRegularDistribution" -> Optional.of(shortSellingPriceRestrictionAppliedFlagAtTheRegularDistribution);
            case "LoanMarginFlag" -> Optional.of(loanMarginFlag);
            case "ExDividendExRightFlag" -> Optional.of(exDividendExRightFlag);
            case "SecuritiesToBeDelistedUnderSupervisionClassification" -> Optional.of(securitiesToBeDelistedUnderSupervisionClassification);
            case "Reserved5" -> Optional.of(reserved5);
            case "UnitOfTrading" -> Optional.of(unitOfTrading);
            case "Reserved11" -> Optional.of(reserved11);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IssueInformationMessage message)) {
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
        if (!(other instanceof IssueInformationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
