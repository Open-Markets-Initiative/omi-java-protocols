package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.AppendageLengthField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.CancelReasonField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.DecrementSharesField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.LiquidityFlagField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.PriceField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.QuantityPreventedFromTradingField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.TimestampField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.UserRefNumField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.groups.StpCanceledAppendageEntry;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.groups.StpCanceledAppendageList;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.Field;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.Message;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.PrintOptions;

/**
 * Represents the StpCanceledMessage message from the OrderEntry protocol.
 *
 * <p>STP Canceled Message</p>
 */
public final class StpCanceledMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'D';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 35;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Stp Canceled Message";

    /**
     * Expressed as nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * As described above in Data Types. UserRefNum must be day-unique and strictly increasing for each OUCH account
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * Total quantity of the order cancelled due to STP
     */
    private final DecrementSharesField decrementShares = new DecrementSharesField();

    /**
     * Reasons the order was reduced or canceled. See Appendix C for the available reasons (printed as Reason)
     */
    private final CancelReasonField cancelReason = new CancelReasonField();

    /**
     * Shares that would have executed if the trade would have occurred. Depending on the STP type and the sizes of orders in question, the value for this field could differ from that in the Decrement Shares field.
     */
    private final QuantityPreventedFromTradingField quantityPreventedFromTrading = new QuantityPreventedFromTradingField();

    /**
     * Maximum 999,999. A price of 0 will be treated as a market order. Implied 8 decimal places
     */
    private final PriceField price = new PriceField();

    /**
     * Liquidity flag the order received. See Appendix E
     */
    private final LiquidityFlagField liquidityFlag = new LiquidityFlagField();

    /**
     * The length of the remaining Optional Appendage Field. Required. If no optional appendage, length=0
     */
    private final AppendageLengthField appendageLength = new AppendageLengthField();

    /**
     * STP Canceled Appendage
     */
    private final StpCanceledAppendageList stpCanceledAppendage = new StpCanceledAppendageList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, userRefNum, decrementShares, cancelReason, quantityPreventedFromTrading, price, liquidityFlag, appendageLength);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Expressed as nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * As described above in Data Types. UserRefNum must be day-unique and strictly increasing for each OUCH account
     *
     * @return the UserRefNum field
     */
    public UserRefNumField userRefNum() {
        return userRefNum;
    }

    /**
     * Total quantity of the order cancelled due to STP
     *
     * @return the DecrementShares field
     */
    public DecrementSharesField decrementShares() {
        return decrementShares;
    }

    /**
     * Reasons the order was reduced or canceled. See Appendix C for the available reasons (printed as Reason)
     *
     * @return the CancelReason field
     */
    public CancelReasonField cancelReason() {
        return cancelReason;
    }

    /**
     * Shares that would have executed if the trade would have occurred. Depending on the STP type and the sizes of orders in question, the value for this field could differ from that in the Decrement Shares field.
     *
     * @return the QuantityPreventedFromTrading field
     */
    public QuantityPreventedFromTradingField quantityPreventedFromTrading() {
        return quantityPreventedFromTrading;
    }

    /**
     * Maximum 999,999. A price of 0 will be treated as a market order. Implied 8 decimal places
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Liquidity flag the order received. See Appendix E
     *
     * @return the LiquidityFlag field
     */
    public LiquidityFlagField liquidityFlag() {
        return liquidityFlag;
    }

    /**
     * The length of the remaining Optional Appendage Field. Required. If no optional appendage, length=0
     *
     * @return the AppendageLength field
     */
    public AppendageLengthField appendageLength() {
        return appendageLength;
    }

    /**
     * STP Canceled Appendage
     *
     * <p>Its entries fill the bytes the AppendageLength field states: encode writes this list's byte length to it.</p>
     *
     * @return the StpCanceledAppendage entries
     */
    public StpCanceledAppendageList stpCanceledAppendage() {
        return stpCanceledAppendage;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + stpCanceledAppendage.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
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
        if (!decrementShares.parse(data, cursor)) {
            return false;
        }
        cursor += DecrementSharesField.BYTE_LENGTH;
        if (!cancelReason.parse(data, cursor)) {
            return false;
        }
        cursor += CancelReasonField.BYTE_LENGTH;
        if (!quantityPreventedFromTrading.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityPreventedFromTradingField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!liquidityFlag.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityFlagField.BYTE_LENGTH;
        if (!appendageLength.parse(data, cursor)) {
            return false;
        }
        cursor += AppendageLengthField.BYTE_LENGTH;
        long stpCanceledAppendageBudget = appendageLength.value();
        if (stpCanceledAppendageBudget < 0 || stpCanceledAppendageBudget > (end) - cursor) {
            return false;
        }
        if (!stpCanceledAppendage.parse(data, cursor, cursor + (int) stpCanceledAppendageBudget)) {
            return false;
        }
        cursor += stpCanceledAppendage.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (stpCanceledAppendage.byteLength() > 65535) {
            throw new IllegalStateException("stpCanceledAppendage holds " + stpCanceledAppendage.byteLength() + " bytes, more than its length field can state");
        }
        appendageLength.value((stpCanceledAppendage.byteLength()));
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = userRefNum.encode(data, cursor);
        cursor = decrementShares.encode(data, cursor);
        cursor = cancelReason.encode(data, cursor);
        cursor = quantityPreventedFromTrading.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = liquidityFlag.encode(data, cursor);
        cursor = appendageLength.encode(data, cursor);
        cursor = stpCanceledAppendage.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        stpCanceledAppendage.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != appendageLength && !field.isRecognized()) {
                return false;
            }
        }
        return stpCanceledAppendage.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != appendageLength && !field.isValid()) {
                return false;
            }
        }
        if (!stpCanceledAppendage.isValid()) {
            return false;
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
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!userRefNum.isDecoded()) {
            return Optional.of(userRefNum);
        }
        if (!decrementShares.isDecoded()) {
            return Optional.of(decrementShares);
        }
        if (!cancelReason.isDecoded()) {
            return Optional.of(cancelReason);
        }
        if (!quantityPreventedFromTrading.isDecoded()) {
            return Optional.of(quantityPreventedFromTrading);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!liquidityFlag.isDecoded()) {
            return Optional.of(liquidityFlag);
        }
        if (!appendageLength.isDecoded()) {
            return Optional.of(appendageLength);
        }
        if (!stpCanceledAppendage.isDecoded()) {
            return Optional.of(stpCanceledAppendage.failedEntry().flatMap(StpCanceledAppendageEntry::failedAt).orElse(appendageLength));
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
            case "DecrementShares" -> Optional.of(decrementShares);
            case "CancelReason" -> Optional.of(cancelReason);
            case "QuantityPreventedFromTrading" -> Optional.of(quantityPreventedFromTrading);
            case "Price" -> Optional.of(price);
            case "LiquidityFlag" -> Optional.of(liquidityFlag);
            case "AppendageLength" -> Optional.of(appendageLength);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StpCanceledMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(stpCanceledAppendage.diffFields(message.stpCanceledAppendage));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            stpCanceledAppendage.toFormattedString(builder, options);
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
        stpCanceledAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof StpCanceledMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && stpCanceledAppendage.equals(message.stpCanceledAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, stpCanceledAppendage);
    }
}
