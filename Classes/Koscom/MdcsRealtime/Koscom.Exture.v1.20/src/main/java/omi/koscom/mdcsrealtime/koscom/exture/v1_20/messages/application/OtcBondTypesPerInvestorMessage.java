package omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.AskTradingValueInvestorField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.AskTradingVolumeInvestorField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.AskYieldInvestorField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BidTradingValueInvestorField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BidTradingVolumeInvestorField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BidYieldInvestorField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EndKeywordField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.InvestorCategoryField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IsinField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SequenceNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TradingDateField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Field;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.PrintOptions;

/**
 * Represents the OtcBondTypesPerInvestorMessage message from the Koscom protocol.
 *
 * <p>OTC Bond trade aggregates per investor category. Bid/ask yields and trading volumes/values per ISIN and investor category.</p>
 */
public final class OtcBondTypesPerInvestorMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 135;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Otc Bond Types Per Investor Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 132, 2 };

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     */
    private final IsinField isin = new IsinField();

    /**
     * 1~99999999 Records Checking Purpose.
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * YYYYMMDD.
     */
    private final TradingDateField tradingDate = new TradingDateField();

    /**
     * Refer to Code Table.
     */
    private final InvestorCategoryField investorCategory = new InvestorCategoryField();

    /**
     * 99999V99999.
     */
    private final AskYieldInvestorField askYieldInvestor = new AskYieldInvestorField();

    /**
     * 99999V99999.
     */
    private final BidYieldInvestorField bidYieldInvestor = new BidYieldInvestorField();

    /**
     * Ask Trading Volume.
     */
    private final AskTradingVolumeInvestorField askTradingVolumeInvestor = new AskTradingVolumeInvestorField();

    /**
     * Bid Trading Volume.
     */
    private final BidTradingVolumeInvestorField bidTradingVolumeInvestor = new BidTradingVolumeInvestorField();

    /**
     * Ask Trading Value.
     */
    private final AskTradingValueInvestorField askTradingValueInvestor = new AskTradingValueInvestorField();

    /**
     * Bid Trading Value.
     */
    private final BidTradingValueInvestorField bidTradingValueInvestor = new BidTradingValueInvestorField();

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     */
    private final EndKeywordField endKeyword = new EndKeywordField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(isin, sequenceNumber, tradingDate, investorCategory, askYieldInvestor, bidYieldInvestor, askTradingVolumeInvestor, bidTradingVolumeInvestor, askTradingValueInvestor, bidTradingValueInvestor, endKeyword);

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
     * 1~99999999 Records Checking Purpose.
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * YYYYMMDD.
     *
     * @return the TradingDate field
     */
    public TradingDateField tradingDate() {
        return tradingDate;
    }

    /**
     * Refer to Code Table.
     *
     * @return the InvestorCategory field
     */
    public InvestorCategoryField investorCategory() {
        return investorCategory;
    }

    /**
     * 99999V99999.
     *
     * @return the AskYieldInvestor field
     */
    public AskYieldInvestorField askYieldInvestor() {
        return askYieldInvestor;
    }

    /**
     * 99999V99999.
     *
     * @return the BidYieldInvestor field
     */
    public BidYieldInvestorField bidYieldInvestor() {
        return bidYieldInvestor;
    }

    /**
     * Ask Trading Volume.
     *
     * @return the AskTradingVolumeInvestor field
     */
    public AskTradingVolumeInvestorField askTradingVolumeInvestor() {
        return askTradingVolumeInvestor;
    }

    /**
     * Bid Trading Volume.
     *
     * @return the BidTradingVolumeInvestor field
     */
    public BidTradingVolumeInvestorField bidTradingVolumeInvestor() {
        return bidTradingVolumeInvestor;
    }

    /**
     * Ask Trading Value.
     *
     * @return the AskTradingValueInvestor field
     */
    public AskTradingValueInvestorField askTradingValueInvestor() {
        return askTradingValueInvestor;
    }

    /**
     * Bid Trading Value.
     *
     * @return the BidTradingValueInvestor field
     */
    public BidTradingValueInvestorField bidTradingValueInvestor() {
        return bidTradingValueInvestor;
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
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!tradingDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradingDateField.BYTE_LENGTH;
        if (!investorCategory.parse(data, cursor)) {
            return false;
        }
        cursor += InvestorCategoryField.BYTE_LENGTH;
        if (!askYieldInvestor.parse(data, cursor)) {
            return false;
        }
        cursor += AskYieldInvestorField.BYTE_LENGTH;
        if (!bidYieldInvestor.parse(data, cursor)) {
            return false;
        }
        cursor += BidYieldInvestorField.BYTE_LENGTH;
        if (!askTradingVolumeInvestor.parse(data, cursor)) {
            return false;
        }
        cursor += AskTradingVolumeInvestorField.BYTE_LENGTH;
        if (!bidTradingVolumeInvestor.parse(data, cursor)) {
            return false;
        }
        cursor += BidTradingVolumeInvestorField.BYTE_LENGTH;
        if (!askTradingValueInvestor.parse(data, cursor)) {
            return false;
        }
        cursor += AskTradingValueInvestorField.BYTE_LENGTH;
        if (!bidTradingValueInvestor.parse(data, cursor)) {
            return false;
        }
        cursor += BidTradingValueInvestorField.BYTE_LENGTH;
        cursor += 2; // padding
        return endKeyword.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = isin.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = tradingDate.encode(data, cursor);
        cursor = investorCategory.encode(data, cursor);
        cursor = askYieldInvestor.encode(data, cursor);
        cursor = bidYieldInvestor.encode(data, cursor);
        cursor = askTradingVolumeInvestor.encode(data, cursor);
        cursor = bidTradingVolumeInvestor.encode(data, cursor);
        cursor = askTradingValueInvestor.encode(data, cursor);
        cursor = bidTradingValueInvestor.encode(data, cursor);
        if (buffer != null && buffer.length >= 134) {
            System.arraycopy(buffer, 132, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
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
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "TradingDate" -> Optional.of(tradingDate);
            case "InvestorCategory" -> Optional.of(investorCategory);
            case "AskYieldInvestor" -> Optional.of(askYieldInvestor);
            case "BidYieldInvestor" -> Optional.of(bidYieldInvestor);
            case "AskTradingVolumeInvestor" -> Optional.of(askTradingVolumeInvestor);
            case "BidTradingVolumeInvestor" -> Optional.of(bidTradingVolumeInvestor);
            case "AskTradingValueInvestor" -> Optional.of(askTradingValueInvestor);
            case "BidTradingValueInvestor" -> Optional.of(bidTradingValueInvestor);
            case "EndKeyword" -> Optional.of(endKeyword);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OtcBondTypesPerInvestorMessage message)) {
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
        if (!(other instanceof OtcBondTypesPerInvestorMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
