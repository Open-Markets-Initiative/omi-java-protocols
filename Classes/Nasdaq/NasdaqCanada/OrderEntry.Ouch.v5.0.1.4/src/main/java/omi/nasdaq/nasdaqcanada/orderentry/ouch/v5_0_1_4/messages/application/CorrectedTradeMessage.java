package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.AppendageLengthField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.MatchNumberField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.PriceField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.QuantityField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.TimestampField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.UserRefNumField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.groups.CorrectedTradeAppendageEntry;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.groups.CorrectedTradeAppendageList;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.Field;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.Message;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.PrintOptions;

/**
 * Represents the CorrectedTradeMessage message from the OrderEntry protocol.
 *
 * <p>A Corrected Trade Message informs you that an execution has been corrected. The corrected trade details are provided in the message. You will always get an Executed Order Message prior to getting a Corrected Trade Message for a given execution. If no Optional Appendage fields are present, the Appendage Length will be set to 0.</p>
 */
public final class CorrectedTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'B';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Corrected Trade Message";

    /**
     * Expressed as nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * As described above in Data Types. UserRefNum must be day-unique and strictly increasing for each OUCH account
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * Assigned by the exchange to identify the trade. Both the buy and sell executions participating in the trade will have the same match number
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * The incremental number of shares just executed
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Maximum 999,999. A price of 0 will be treated as a market order. Implied 8 decimal places
     */
    private final PriceField price = new PriceField();

    /**
     * The length of the remaining Optional Appendage Field. Required. If no optional appendage, length=0
     */
    private final AppendageLengthField appendageLength = new AppendageLengthField();

    /**
     * Corrected Trade Appendage
     */
    private final CorrectedTradeAppendageList correctedTradeAppendage = new CorrectedTradeAppendageList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, userRefNum, matchNumber, quantity, price, appendageLength);

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
     * Assigned by the exchange to identify the trade. Both the buy and sell executions participating in the trade will have the same match number
     *
     * @return the MatchNumber field
     */
    public MatchNumberField matchNumber() {
        return matchNumber;
    }

    /**
     * The incremental number of shares just executed
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
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
     * The length of the remaining Optional Appendage Field. Required. If no optional appendage, length=0
     *
     * @return the AppendageLength field
     */
    public AppendageLengthField appendageLength() {
        return appendageLength;
    }

    /**
     * Corrected Trade Appendage
     *
     * <p>Its entries fill the bytes the AppendageLength field states: encode writes this list's byte length to it.</p>
     *
     * @return the CorrectedTradeAppendage entries
     */
    public CorrectedTradeAppendageList correctedTradeAppendage() {
        return correctedTradeAppendage;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + correctedTradeAppendage.byteLength();
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
        if (!matchNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MatchNumberField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!appendageLength.parse(data, cursor)) {
            return false;
        }
        cursor += AppendageLengthField.BYTE_LENGTH;
        long correctedTradeAppendageBudget = appendageLength.value();
        if (correctedTradeAppendageBudget < 0 || correctedTradeAppendageBudget > (end) - cursor) {
            return false;
        }
        if (!correctedTradeAppendage.parse(data, cursor, cursor + (int) correctedTradeAppendageBudget)) {
            return false;
        }
        cursor += correctedTradeAppendage.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (correctedTradeAppendage.byteLength() > 65535) {
            throw new IllegalStateException("correctedTradeAppendage holds " + correctedTradeAppendage.byteLength() + " bytes, more than its length field can state");
        }
        appendageLength.value((correctedTradeAppendage.byteLength()));
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = userRefNum.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = appendageLength.encode(data, cursor);
        cursor = correctedTradeAppendage.encode(data, cursor);
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
        correctedTradeAppendage.clear();
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
        return correctedTradeAppendage.isRecognized();
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
        if (!correctedTradeAppendage.isValid()) {
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
        if (!matchNumber.isDecoded()) {
            return Optional.of(matchNumber);
        }
        if (!quantity.isDecoded()) {
            return Optional.of(quantity);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!appendageLength.isDecoded()) {
            return Optional.of(appendageLength);
        }
        if (!correctedTradeAppendage.isDecoded()) {
            return Optional.of(correctedTradeAppendage.failedEntry().flatMap(CorrectedTradeAppendageEntry::failedAt).orElse(appendageLength));
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
            case "Quantity" -> Optional.of(quantity);
            case "Price" -> Optional.of(price);
            case "AppendageLength" -> Optional.of(appendageLength);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CorrectedTradeMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(correctedTradeAppendage.diffFields(message.correctedTradeAppendage));
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
            correctedTradeAppendage.toFormattedString(builder, options);
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
        correctedTradeAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof CorrectedTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && correctedTradeAppendage.equals(message.correctedTradeAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, correctedTradeAppendage);
    }
}
