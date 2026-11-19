package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.fields.BrokenTradeReasonField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.fields.MatchNumberField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.fields.TimestampField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.fields.TradingModeField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.fields.TransactionCategoryField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.fields.TransactionTypeAlgoIndicatorField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.fields.UserRefNumField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.Field;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.Message;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.PrintOptions;

/**
 * Represents the BrokenTradeMessage message from the OrderEntry protocol.
 *
 * <p>An execution has been broken and cannot be reinstated</p>
 */
public final class BrokenTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'B';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 20;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Broken Trade Message";

    /**
     * Nanoseconds past midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Sequence number, unique and strictly increasing for the day
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * Day unique match number
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * The reason the trade was broken
     */
    private final BrokenTradeReasonField brokenTradeReason = new BrokenTradeReasonField();

    /**
     * Market model typology level 2
     */
    private final TradingModeField tradingMode = new TradingModeField();

    /**
     * Market model typology level 3.1
     */
    private final TransactionCategoryField transactionCategory = new TransactionCategoryField();

    /**
     * Market model typology level 3.9
     */
    private final TransactionTypeAlgoIndicatorField transactionTypeAlgoIndicator = new TransactionTypeAlgoIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, userRefNum, matchNumber, brokenTradeReason, tradingMode, transactionCategory, transactionTypeAlgoIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds past midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Sequence number, unique and strictly increasing for the day
     *
     * @return the UserRefNum field
     */
    public UserRefNumField userRefNum() {
        return userRefNum;
    }

    /**
     * Day unique match number
     *
     * @return the MatchNumber field
     */
    public MatchNumberField matchNumber() {
        return matchNumber;
    }

    /**
     * The reason the trade was broken
     *
     * @return the BrokenTradeReason field
     */
    public BrokenTradeReasonField brokenTradeReason() {
        return brokenTradeReason;
    }

    /**
     * Market model typology level 2
     *
     * @return the TradingMode field
     */
    public TradingModeField tradingMode() {
        return tradingMode;
    }

    /**
     * Market model typology level 3.1
     *
     * @return the TransactionCategory field
     */
    public TransactionCategoryField transactionCategory() {
        return transactionCategory;
    }

    /**
     * Market model typology level 3.9
     *
     * @return the TransactionTypeAlgoIndicator field
     */
    public TransactionTypeAlgoIndicatorField transactionTypeAlgoIndicator() {
        return transactionTypeAlgoIndicator;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!userRefNum.parse(data, cursor)) {
            return false;
        }
        cursor += UserRefNumField.BYTE_LENGTH;
        if (!matchNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MatchNumberField.BYTE_LENGTH;
        if (!brokenTradeReason.parse(data, cursor)) {
            return false;
        }
        cursor += BrokenTradeReasonField.BYTE_LENGTH;
        if (!tradingMode.parse(data, cursor)) {
            return false;
        }
        cursor += TradingModeField.BYTE_LENGTH;
        if (!transactionCategory.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionCategoryField.BYTE_LENGTH;
        return transactionTypeAlgoIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = userRefNum.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
        cursor = brokenTradeReason.encode(data, cursor);
        cursor = tradingMode.encode(data, cursor);
        cursor = transactionCategory.encode(data, cursor);
        cursor = transactionTypeAlgoIndicator.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "UserRefNum" -> Optional.of(userRefNum);
            case "MatchNumber" -> Optional.of(matchNumber);
            case "BrokenTradeReason" -> Optional.of(brokenTradeReason);
            case "TradingMode" -> Optional.of(tradingMode);
            case "TransactionCategory" -> Optional.of(transactionCategory);
            case "TransactionTypeAlgoIndicator" -> Optional.of(transactionTypeAlgoIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BrokenTradeMessage message)) {
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
        if (!(other instanceof BrokenTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
