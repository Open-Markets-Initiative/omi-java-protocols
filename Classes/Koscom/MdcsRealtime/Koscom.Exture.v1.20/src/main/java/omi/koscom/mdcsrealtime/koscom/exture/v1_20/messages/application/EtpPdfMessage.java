package omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.AppraisedValueField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.CompositionIssueCodeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.CompositionIssueMarketTypeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.CompositionIssueNameField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.CompositionIssueNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.CuUnitSharenumberOfContractkrwCashusdCashconvertedAmountkrwField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.DataSeqNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.DateField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EndKeywordField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IsinField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.OfficeConsignmentCompanysRegistrationNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ParValueAmountCashAmountConvertedAmountKrwField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ProfitDistributionBasisDateField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Field;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.PrintOptions;

/**
 * Represents the EtpPdfMessage message from the Koscom protocol.
 *
 * <p>ETP Portfolio Deposit File. One record per composition issue: unit share, market type, issue name, par value, appraised value, profit distribution basis date.</p>
 */
public final class EtpPdfMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 155;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Etp Pdf Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 150, 4 };

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     */
    private final IsinField isin = new IsinField();

    /**
     * Transmission seq. number.
     */
    private final DataSeqNumberField dataSeqNumber = new DataSeqNumberField();

    /**
     * YYYMMDD:Last business day.
     */
    private final DateField date = new DateField();

    /**
     * 049: Korea Fund Partners ← Mirae Asset Fund Services 905: Shinhan Fund Partners ← Shinhanaitas 906: WOORI FUND SERVICES 2023.04.10 new 907: HANA FUND SERVICES 2024.09.09 new 909: KB FUND PARTNERS 2024.
     */
    private final OfficeConsignmentCompanysRegistrationNumberField officeConsignmentCompanysRegistrationNumber = new OfficeConsignmentCompanysRegistrationNumberField();

    /**
     * Unit: issue (including cash).
     */
    private final CompositionIssueNumberField compositionIssueNumber = new CompositionIssueNumberField();

    /**
     * KRD010010001:KRW CASH listed futures: isin code, in case of non-listed, separated definition: futures in case of non-listed, separate definition CP added : KRZ + 9 digits FXFWD0000USD : FX Forward(USD.
     */
    private final CompositionIssueCodeField compositionIssueCode = new CompositionIssueCodeField();

    /**
     * ※1cu unit share/number of contract/krw cash/usd cash/warehouse warrant unit is defined by the composion issue code(7th field) - stock→unit:share (if the first field is "-"(minus signal), it means shor.
     */
    private final CuUnitSharenumberOfContractkrwCashusdCashconvertedAmountkrwField cuUnitSharenumberOfContractkrwCashusdCashconvertedAmountkrw = new CuUnitSharenumberOfContractkrwCashusdCashconvertedAmountkrwField();

    /**
     * 0: KOSPI(Including cash,KSP200T00001,FKSP200T0001) 1:KOSDAQ 2: Others 3:Bond 4: Futures 2010.04.09 5: spot.
     */
    private final CompositionIssueMarketTypeField compositionIssueMarketType = new CompositionIssueMarketTypeField();

    /**
     * In case of foreign issue is issue name. For others, '0' or SPACE.
     */
    private final CompositionIssueNameField compositionIssueName = new CompositionIssueNameField();

    /**
     * in case of par value, composition issue code is bond, futures, swap,FX Forward cash amount set:in case cu unit set redemption, possible cash setting is displayed based o etf code, current stock index .
     */
    private final ParValueAmountCashAmountConvertedAmountKrwField parValueAmountCashAmountConvertedAmountKrw = new ParValueAmountCashAmountConvertedAmountKrwField();

    /**
     * only for bond etf. date when profit distribution occurs for the following etf. same value about the special date's duplicate etf code default : space or "0", yyyymmdd.
     */
    private final ProfitDistributionBasisDateField profitDistributionBasisDate = new ProfitDistributionBasisDateField();

    /**
     * Appraised Value.
     */
    private final AppraisedValueField appraisedValue = new AppraisedValueField();

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     */
    private final EndKeywordField endKeyword = new EndKeywordField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(isin, dataSeqNumber, date, officeConsignmentCompanysRegistrationNumber, compositionIssueNumber, compositionIssueCode, cuUnitSharenumberOfContractkrwCashusdCashconvertedAmountkrw, compositionIssueMarketType, compositionIssueName, parValueAmountCashAmountConvertedAmountKrw, profitDistributionBasisDate, appraisedValue, endKeyword);

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
     * Transmission seq. number.
     *
     * @return the DataSeqNumber field
     */
    public DataSeqNumberField dataSeqNumber() {
        return dataSeqNumber;
    }

    /**
     * YYYMMDD:Last business day.
     *
     * @return the Date field
     */
    public DateField date() {
        return date;
    }

    /**
     * 049: Korea Fund Partners ← Mirae Asset Fund Services 905: Shinhan Fund Partners ← Shinhanaitas 906: WOORI FUND SERVICES 2023.04.10 new 907: HANA FUND SERVICES 2024.09.09 new 909: KB FUND PARTNERS 2024.
     *
     * @return the OfficeConsignmentCompanysRegistrationNumber field
     */
    public OfficeConsignmentCompanysRegistrationNumberField officeConsignmentCompanysRegistrationNumber() {
        return officeConsignmentCompanysRegistrationNumber;
    }

    /**
     * Unit: issue (including cash).
     *
     * @return the CompositionIssueNumber field
     */
    public CompositionIssueNumberField compositionIssueNumber() {
        return compositionIssueNumber;
    }

    /**
     * KRD010010001:KRW CASH listed futures: isin code, in case of non-listed, separated definition: futures in case of non-listed, separate definition CP added : KRZ + 9 digits FXFWD0000USD : FX Forward(USD.
     *
     * @return the CompositionIssueCode field
     */
    public CompositionIssueCodeField compositionIssueCode() {
        return compositionIssueCode;
    }

    /**
     * ※1cu unit share/number of contract/krw cash/usd cash/warehouse warrant unit is defined by the composion issue code(7th field) - stock→unit:share (if the first field is "-"(minus signal), it means shor.
     *
     * @return the CuUnitSharenumberOfContractkrwCashusdCashconvertedAmountkrw field
     */
    public CuUnitSharenumberOfContractkrwCashusdCashconvertedAmountkrwField cuUnitSharenumberOfContractkrwCashusdCashconvertedAmountkrw() {
        return cuUnitSharenumberOfContractkrwCashusdCashconvertedAmountkrw;
    }

    /**
     * 0: KOSPI(Including cash,KSP200T00001,FKSP200T0001) 1:KOSDAQ 2: Others 3:Bond 4: Futures 2010.04.09 5: spot.
     *
     * @return the CompositionIssueMarketType field
     */
    public CompositionIssueMarketTypeField compositionIssueMarketType() {
        return compositionIssueMarketType;
    }

    /**
     * In case of foreign issue is issue name. For others, '0' or SPACE.
     *
     * @return the CompositionIssueName field
     */
    public CompositionIssueNameField compositionIssueName() {
        return compositionIssueName;
    }

    /**
     * in case of par value, composition issue code is bond, futures, swap,FX Forward cash amount set:in case cu unit set redemption, possible cash setting is displayed based o etf code, current stock index .
     *
     * @return the ParValueAmountCashAmountConvertedAmountKrw field
     */
    public ParValueAmountCashAmountConvertedAmountKrwField parValueAmountCashAmountConvertedAmountKrw() {
        return parValueAmountCashAmountConvertedAmountKrw;
    }

    /**
     * only for bond etf. date when profit distribution occurs for the following etf. same value about the special date's duplicate etf code default : space or "0", yyyymmdd.
     *
     * @return the ProfitDistributionBasisDate field
     */
    public ProfitDistributionBasisDateField profitDistributionBasisDate() {
        return profitDistributionBasisDate;
    }

    /**
     * Appraised Value.
     *
     * @return the AppraisedValue field
     */
    public AppraisedValueField appraisedValue() {
        return appraisedValue;
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
        if (!dataSeqNumber.parse(data, cursor)) {
            return false;
        }
        cursor += DataSeqNumberField.BYTE_LENGTH;
        if (!date.parse(data, cursor)) {
            return false;
        }
        cursor += DateField.BYTE_LENGTH;
        if (!officeConsignmentCompanysRegistrationNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OfficeConsignmentCompanysRegistrationNumberField.BYTE_LENGTH;
        if (!compositionIssueNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CompositionIssueNumberField.BYTE_LENGTH;
        if (!compositionIssueCode.parse(data, cursor)) {
            return false;
        }
        cursor += CompositionIssueCodeField.BYTE_LENGTH;
        if (!cuUnitSharenumberOfContractkrwCashusdCashconvertedAmountkrw.parse(data, cursor)) {
            return false;
        }
        cursor += CuUnitSharenumberOfContractkrwCashusdCashconvertedAmountkrwField.BYTE_LENGTH;
        if (!compositionIssueMarketType.parse(data, cursor)) {
            return false;
        }
        cursor += CompositionIssueMarketTypeField.BYTE_LENGTH;
        if (!compositionIssueName.parse(data, cursor)) {
            return false;
        }
        cursor += CompositionIssueNameField.BYTE_LENGTH;
        if (!parValueAmountCashAmountConvertedAmountKrw.parse(data, cursor)) {
            return false;
        }
        cursor += ParValueAmountCashAmountConvertedAmountKrwField.BYTE_LENGTH;
        if (!profitDistributionBasisDate.parse(data, cursor)) {
            return false;
        }
        cursor += ProfitDistributionBasisDateField.BYTE_LENGTH;
        if (!appraisedValue.parse(data, cursor)) {
            return false;
        }
        cursor += AppraisedValueField.BYTE_LENGTH;
        cursor += 4; // padding
        return endKeyword.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = isin.encode(data, cursor);
        cursor = dataSeqNumber.encode(data, cursor);
        cursor = date.encode(data, cursor);
        cursor = officeConsignmentCompanysRegistrationNumber.encode(data, cursor);
        cursor = compositionIssueNumber.encode(data, cursor);
        cursor = compositionIssueCode.encode(data, cursor);
        cursor = cuUnitSharenumberOfContractkrwCashusdCashconvertedAmountkrw.encode(data, cursor);
        cursor = compositionIssueMarketType.encode(data, cursor);
        cursor = compositionIssueName.encode(data, cursor);
        cursor = parValueAmountCashAmountConvertedAmountKrw.encode(data, cursor);
        cursor = profitDistributionBasisDate.encode(data, cursor);
        cursor = appraisedValue.encode(data, cursor);
        if (buffer != null && buffer.length >= 154) {
            System.arraycopy(buffer, 150, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
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
            case "DataSeqNumber" -> Optional.of(dataSeqNumber);
            case "Date" -> Optional.of(date);
            case "OfficeConsignmentCompanysRegistrationNumber" -> Optional.of(officeConsignmentCompanysRegistrationNumber);
            case "CompositionIssueNumber" -> Optional.of(compositionIssueNumber);
            case "CompositionIssueCode" -> Optional.of(compositionIssueCode);
            case "CuUnitSharenumberOfContractkrwCashusdCashconvertedAmountkrw" -> Optional.of(cuUnitSharenumberOfContractkrwCashusdCashconvertedAmountkrw);
            case "CompositionIssueMarketType" -> Optional.of(compositionIssueMarketType);
            case "CompositionIssueName" -> Optional.of(compositionIssueName);
            case "ParValueAmountCashAmountConvertedAmountKrw" -> Optional.of(parValueAmountCashAmountConvertedAmountKrw);
            case "ProfitDistributionBasisDate" -> Optional.of(profitDistributionBasisDate);
            case "AppraisedValue" -> Optional.of(appraisedValue);
            case "EndKeyword" -> Optional.of(endKeyword);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EtpPdfMessage message)) {
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
        if (!(other instanceof EtpPdfMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
