package omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.fields.ContraFirmField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.fields.ExecutedQuantityField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.fields.ExecutionPriceField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.fields.LastMarketField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.fields.LiquidityAttributesField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.fields.LiquidityFlagField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.fields.MatchNumberField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.fields.TimestampField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.fields.TradingModeField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.fields.TransactionCategoryField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.fields.TransactionTypeAlgoIndicatorField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.fields.UserRefNumField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.types.Field;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.types.Message;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.types.PrintOptions;

/**
 * Represents the ExecutedOrderMessage message from the OrderEntry protocol.
 *
 * <p>An order has been executed in whole or in part</p>
 */
public final class ExecutedOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'E';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Executed Order Message";

    /**
     * Nanoseconds past midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Sequence number, unique and strictly increasing for the day
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * Incremental quantity executed
     */
    private final ExecutedQuantityField executedQuantity = new ExecutedQuantityField();

    /**
     * The price at which the shares executed
     */
    private final ExecutionPriceField executionPrice = new ExecutionPriceField();

    /**
     * The type of trade
     */
    private final LiquidityFlagField liquidityFlag = new LiquidityFlagField();

    /**
     * Day unique match number
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * The Mpid of the counterparty
     */
    private final ContraFirmField contraFirm = new ContraFirmField();

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
     * Packed qualifier bits
     */
    private final LiquidityAttributesField liquidityAttributes = new LiquidityAttributesField();

    /**
     * The execution venue
     */
    private final LastMarketField lastMarket = new LastMarketField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, userRefNum, executedQuantity, executionPrice, liquidityFlag, matchNumber, contraFirm, tradingMode, transactionCategory, transactionTypeAlgoIndicator, liquidityAttributes, lastMarket);

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
     * Incremental quantity executed
     *
     * @return the ExecutedQuantity field
     */
    public ExecutedQuantityField executedQuantity() {
        return executedQuantity;
    }

    /**
     * The price at which the shares executed
     *
     * @return the ExecutionPrice field
     */
    public ExecutionPriceField executionPrice() {
        return executionPrice;
    }

    /**
     * The type of trade
     *
     * @return the LiquidityFlag field
     */
    public LiquidityFlagField liquidityFlag() {
        return liquidityFlag;
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
     * The Mpid of the counterparty
     *
     * @return the ContraFirm field
     */
    public ContraFirmField contraFirm() {
        return contraFirm;
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

    /**
     * Packed qualifier bits
     *
     * @return the LiquidityAttributes field
     */
    public LiquidityAttributesField liquidityAttributes() {
        return liquidityAttributes;
    }

    /**
     * The execution venue
     *
     * @return the LastMarket field
     */
    public LastMarketField lastMarket() {
        return lastMarket;
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
        if (!executedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedQuantityField.BYTE_LENGTH;
        if (!executionPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionPriceField.BYTE_LENGTH;
        if (!liquidityFlag.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityFlagField.BYTE_LENGTH;
        if (!matchNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MatchNumberField.BYTE_LENGTH;
        if (!contraFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ContraFirmField.BYTE_LENGTH;
        if (!tradingMode.parse(data, cursor)) {
            return false;
        }
        cursor += TradingModeField.BYTE_LENGTH;
        if (!transactionCategory.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionCategoryField.BYTE_LENGTH;
        if (!transactionTypeAlgoIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTypeAlgoIndicatorField.BYTE_LENGTH;
        if (!liquidityAttributes.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityAttributesField.BYTE_LENGTH;
        return lastMarket.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = userRefNum.encode(data, cursor);
        cursor = executedQuantity.encode(data, cursor);
        cursor = executionPrice.encode(data, cursor);
        cursor = liquidityFlag.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
        cursor = contraFirm.encode(data, cursor);
        cursor = tradingMode.encode(data, cursor);
        cursor = transactionCategory.encode(data, cursor);
        cursor = transactionTypeAlgoIndicator.encode(data, cursor);
        cursor = liquidityAttributes.encode(data, cursor);
        cursor = lastMarket.encode(data, cursor);
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
            case "ExecutedQuantity" -> Optional.of(executedQuantity);
            case "ExecutionPrice" -> Optional.of(executionPrice);
            case "LiquidityFlag" -> Optional.of(liquidityFlag);
            case "MatchNumber" -> Optional.of(matchNumber);
            case "ContraFirm" -> Optional.of(contraFirm);
            case "TradingMode" -> Optional.of(tradingMode);
            case "TransactionCategory" -> Optional.of(transactionCategory);
            case "TransactionTypeAlgoIndicator" -> Optional.of(transactionTypeAlgoIndicator);
            case "LiquidityAttributes" -> Optional.of(liquidityAttributes);
            case "LastMarket" -> Optional.of(lastMarket);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutedOrderMessage message)) {
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
        if (!(other instanceof ExecutedOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
