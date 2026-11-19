package omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.AskTradingValueInstitutionField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.AskTradingVolumeInstitutionField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.AskYieldInstitutionField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BidTradingValueInstitutionField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BidTradingVolumeInstitutionField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BidYieldInstitutionField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BondTypeCodeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.DataProcessCategoryField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.DateField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EndKeywordField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.InstitutionCodeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Field;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.PrintOptions;

/**
 * Represents the OtcBondTradesPerInstitutionMessage message from the Koscom protocol.
 *
 * <p>OTC Bond trade aggregates per institution. Reports bid and ask yields and trading volumes/values per institution code and bond type.</p>
 */
public final class OtcBondTradesPerInstitutionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 105;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Otc Bond Trades Per Institution Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 93, 11 };

    /**
     * I:Normal D:Delete E:End.
     */
    private final DataProcessCategoryField dataProcessCategory = new DataProcessCategoryField();

    /**
     * YYYMMDD:Last business day.
     */
    private final DateField date = new DateField();

    /**
     * Refer to Code Table.
     */
    private final InstitutionCodeField institutionCode = new InstitutionCodeField();

    /**
     * 1:KTB 2:MB 3:Special Bond 4:MSB 5:Financial Bond 6:Corporate Bond.
     */
    private final BondTypeCodeField bondTypeCode = new BondTypeCodeField();

    /**
     * 9999V9999.
     */
    private final AskYieldInstitutionField askYieldInstitution = new AskYieldInstitutionField();

    /**
     * Unit:Thousand KRW.
     */
    private final AskTradingVolumeInstitutionField askTradingVolumeInstitution = new AskTradingVolumeInstitutionField();

    /**
     * Unit:Thousand KRW.
     */
    private final AskTradingValueInstitutionField askTradingValueInstitution = new AskTradingValueInstitutionField();

    /**
     * 9999V9999.
     */
    private final BidYieldInstitutionField bidYieldInstitution = new BidYieldInstitutionField();

    /**
     * Unit:Thousand KRW.
     */
    private final BidTradingVolumeInstitutionField bidTradingVolumeInstitution = new BidTradingVolumeInstitutionField();

    /**
     * Unit:Thousand KRW.
     */
    private final BidTradingValueInstitutionField bidTradingValueInstitution = new BidTradingValueInstitutionField();

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     */
    private final EndKeywordField endKeyword = new EndKeywordField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(dataProcessCategory, date, institutionCode, bondTypeCode, askYieldInstitution, askTradingVolumeInstitution, askTradingValueInstitution, bidYieldInstitution, bidTradingVolumeInstitution, bidTradingValueInstitution, endKeyword);

    private byte[] buffer;

    private boolean decoded;

    /**
     * I:Normal D:Delete E:End.
     *
     * @return the DataProcessCategory field
     */
    public DataProcessCategoryField dataProcessCategory() {
        return dataProcessCategory;
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
     * Refer to Code Table.
     *
     * @return the InstitutionCode field
     */
    public InstitutionCodeField institutionCode() {
        return institutionCode;
    }

    /**
     * 1:KTB 2:MB 3:Special Bond 4:MSB 5:Financial Bond 6:Corporate Bond.
     *
     * @return the BondTypeCode field
     */
    public BondTypeCodeField bondTypeCode() {
        return bondTypeCode;
    }

    /**
     * 9999V9999.
     *
     * @return the AskYieldInstitution field
     */
    public AskYieldInstitutionField askYieldInstitution() {
        return askYieldInstitution;
    }

    /**
     * Unit:Thousand KRW.
     *
     * @return the AskTradingVolumeInstitution field
     */
    public AskTradingVolumeInstitutionField askTradingVolumeInstitution() {
        return askTradingVolumeInstitution;
    }

    /**
     * Unit:Thousand KRW.
     *
     * @return the AskTradingValueInstitution field
     */
    public AskTradingValueInstitutionField askTradingValueInstitution() {
        return askTradingValueInstitution;
    }

    /**
     * 9999V9999.
     *
     * @return the BidYieldInstitution field
     */
    public BidYieldInstitutionField bidYieldInstitution() {
        return bidYieldInstitution;
    }

    /**
     * Unit:Thousand KRW.
     *
     * @return the BidTradingVolumeInstitution field
     */
    public BidTradingVolumeInstitutionField bidTradingVolumeInstitution() {
        return bidTradingVolumeInstitution;
    }

    /**
     * Unit:Thousand KRW.
     *
     * @return the BidTradingValueInstitution field
     */
    public BidTradingValueInstitutionField bidTradingValueInstitution() {
        return bidTradingValueInstitution;
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
        if (!dataProcessCategory.parse(data, cursor)) {
            return false;
        }
        cursor += DataProcessCategoryField.BYTE_LENGTH;
        if (!date.parse(data, cursor)) {
            return false;
        }
        cursor += DateField.BYTE_LENGTH;
        if (!institutionCode.parse(data, cursor)) {
            return false;
        }
        cursor += InstitutionCodeField.BYTE_LENGTH;
        if (!bondTypeCode.parse(data, cursor)) {
            return false;
        }
        cursor += BondTypeCodeField.BYTE_LENGTH;
        if (!askYieldInstitution.parse(data, cursor)) {
            return false;
        }
        cursor += AskYieldInstitutionField.BYTE_LENGTH;
        if (!askTradingVolumeInstitution.parse(data, cursor)) {
            return false;
        }
        cursor += AskTradingVolumeInstitutionField.BYTE_LENGTH;
        if (!askTradingValueInstitution.parse(data, cursor)) {
            return false;
        }
        cursor += AskTradingValueInstitutionField.BYTE_LENGTH;
        if (!bidYieldInstitution.parse(data, cursor)) {
            return false;
        }
        cursor += BidYieldInstitutionField.BYTE_LENGTH;
        if (!bidTradingVolumeInstitution.parse(data, cursor)) {
            return false;
        }
        cursor += BidTradingVolumeInstitutionField.BYTE_LENGTH;
        if (!bidTradingValueInstitution.parse(data, cursor)) {
            return false;
        }
        cursor += BidTradingValueInstitutionField.BYTE_LENGTH;
        cursor += 11; // padding
        return endKeyword.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = dataProcessCategory.encode(data, cursor);
        cursor = date.encode(data, cursor);
        cursor = institutionCode.encode(data, cursor);
        cursor = bondTypeCode.encode(data, cursor);
        cursor = askYieldInstitution.encode(data, cursor);
        cursor = askTradingVolumeInstitution.encode(data, cursor);
        cursor = askTradingValueInstitution.encode(data, cursor);
        cursor = bidYieldInstitution.encode(data, cursor);
        cursor = bidTradingVolumeInstitution.encode(data, cursor);
        cursor = bidTradingValueInstitution.encode(data, cursor);
        if (buffer != null && buffer.length >= 104) {
            System.arraycopy(buffer, 93, data, cursor, 11); // padding
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
            case "DataProcessCategory" -> Optional.of(dataProcessCategory);
            case "Date" -> Optional.of(date);
            case "InstitutionCode" -> Optional.of(institutionCode);
            case "BondTypeCode" -> Optional.of(bondTypeCode);
            case "AskYieldInstitution" -> Optional.of(askYieldInstitution);
            case "AskTradingVolumeInstitution" -> Optional.of(askTradingVolumeInstitution);
            case "AskTradingValueInstitution" -> Optional.of(askTradingValueInstitution);
            case "BidYieldInstitution" -> Optional.of(bidYieldInstitution);
            case "BidTradingVolumeInstitution" -> Optional.of(bidTradingVolumeInstitution);
            case "BidTradingValueInstitution" -> Optional.of(bidTradingValueInstitution);
            case "EndKeyword" -> Optional.of(endKeyword);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OtcBondTradesPerInstitutionMessage message)) {
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
        if (!(other instanceof OtcBondTradesPerInstitutionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
