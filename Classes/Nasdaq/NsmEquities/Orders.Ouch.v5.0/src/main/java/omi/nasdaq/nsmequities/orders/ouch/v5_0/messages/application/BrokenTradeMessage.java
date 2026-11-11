package omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.AppendageLengthField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.BrokenTradeReasonField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.ClordidField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.MatchNumberField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.TimestampField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.UserRefNumField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.BrokenTradeAppendageEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.BrokenTradeAppendageList;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Message;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;

/**
 * Represents the BrokenTradeMessage message from the Orders protocol.
 *
 * <p>A Broken Trade Message informs you that an execution has been broken. The trade is no longer good and will not clear. The reason for the break is given.</p>
 */
public final class BrokenTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'B';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 35;

    /**
     * This message takes the rest of the bytes it is given, so where those bytes end is its own end.
     */
    public static final boolean RUNS_TO_END = true;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Broken Trade Message";

    /**
     * Expressed as nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * UserRefNum must be day-unique and strictly increasing for each OUCH account.
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * Assigned by the exchange to identify the trade. Both the buy and the sell executions participating in the trade will share the same match number.
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * The reason the trade was broken.
     */
    private final BrokenTradeReasonField brokenTradeReason = new BrokenTradeReasonField();

    /**
     * Customer order identifier. ClOrdID will not be checked for day-uniqueness for each OUCH account.
     */
    private final ClordidField clordid = new ClordidField();

    /**
     * The length of the remaining Optional Appendage field.
     */
    private final AppendageLengthField appendageLength = new AppendageLengthField();

    /**
     * Broken Trade Appendage
     */
    private final BrokenTradeAppendageList brokenTradeAppendage = new BrokenTradeAppendageList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, userRefNum, matchNumber, brokenTradeReason, clordid, appendageLength);

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
     * UserRefNum must be day-unique and strictly increasing for each OUCH account.
     *
     * @return the UserRefNum field
     */
    public UserRefNumField userRefNum() {
        return userRefNum;
    }

    /**
     * Assigned by the exchange to identify the trade. Both the buy and the sell executions participating in the trade will share the same match number.
     *
     * @return the MatchNumber field
     */
    public MatchNumberField matchNumber() {
        return matchNumber;
    }

    /**
     * The reason the trade was broken.
     *
     * @return the BrokenTradeReason field
     */
    public BrokenTradeReasonField brokenTradeReason() {
        return brokenTradeReason;
    }

    /**
     * Customer order identifier. ClOrdID will not be checked for day-uniqueness for each OUCH account.
     *
     * @return the Clordid field
     */
    public ClordidField clordid() {
        return clordid;
    }

    /**
     * The length of the remaining Optional Appendage field.
     *
     * @return the AppendageLength field
     */
    public AppendageLengthField appendageLength() {
        return appendageLength;
    }

    /**
     * Broken Trade Appendage
     *
     * <p>Its entries fill the bytes the AppendageLength field states: encode writes this list's byte length to it.</p>
     *
     * @return the BrokenTradeAppendage entries
     */
    public BrokenTradeAppendageList brokenTradeAppendage() {
        return brokenTradeAppendage;
    }

    /**
     * Returns whether the fields before the AppendageLength put it on the wire.
     *
     * <p>The AppendageLength is sent while its bytes remain, which only a decode can tell, so it is on the wire when it holds a value.</p>
     *
     * @return true when the AppendageLength is on the wire
     */
    public boolean appendageLengthPresent() {
        return appendageLength.hasValue() || !brokenTradeAppendage.isEmpty();
    }

    private boolean onWire(Field field) {
        return (field != appendageLength || appendageLengthPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (appendageLengthPresent() ? AppendageLengthField.BYTE_LENGTH : 0) + brokenTradeAppendage.byteLength();
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
        if (!brokenTradeReason.parse(data, cursor)) {
            return false;
        }
        cursor += BrokenTradeReasonField.BYTE_LENGTH;
        if (!clordid.parse(data, cursor)) {
            return false;
        }
        cursor += ClordidField.BYTE_LENGTH;
        if (end - cursor > 0) {
            if (end - cursor < AppendageLengthField.BYTE_LENGTH || !appendageLength.parse(data, cursor)) {
                return false;
            }
            cursor += AppendageLengthField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        long brokenTradeAppendageBudget = appendageLengthPresent() ? appendageLength.value() : 0;
        if (brokenTradeAppendageBudget < 0 || brokenTradeAppendageBudget > (end) - cursor) {
            return false;
        }
        if (!brokenTradeAppendage.parse(data, cursor, cursor + (int) brokenTradeAppendageBudget)) {
            return false;
        }
        cursor += brokenTradeAppendage.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (!brokenTradeAppendage.isEmpty() || appendageLengthPresent()) {
            if (brokenTradeAppendage.byteLength() > 65535) {
                throw new IllegalStateException("brokenTradeAppendage holds " + brokenTradeAppendage.byteLength() + " bytes, more than its length field can state");
            }
            appendageLength.value((brokenTradeAppendage.byteLength()));
        }
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = userRefNum.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
        cursor = brokenTradeReason.encode(data, cursor);
        cursor = clordid.encode(data, cursor);
        if (appendageLengthPresent()) {
            cursor = appendageLength.encode(data, cursor);
        }
        cursor = brokenTradeAppendage.encode(data, cursor);
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
        brokenTradeAppendage.clear();
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
        for (Field field : fields()) {
            if (field != appendageLength && !field.isRecognized()) {
                return false;
            }
        }
        return brokenTradeAppendage.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != appendageLength && !field.isValid()) {
                return false;
            }
        }
        if (!brokenTradeAppendage.isValid()) {
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
        if (!brokenTradeReason.isDecoded()) {
            return Optional.of(brokenTradeReason);
        }
        if (!clordid.isDecoded()) {
            return Optional.of(clordid);
        }
        if (appendageLengthPresent() && !appendageLength.isDecoded()) {
            return Optional.of(appendageLength);
        }
        if (!brokenTradeAppendage.isDecoded()) {
            return Optional.of(brokenTradeAppendage.failedEntry().flatMap(BrokenTradeAppendageEntry::failedAt).orElse(appendageLength));
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "Timestamp" -> Optional.of(timestampField);
            case "UserRefNum" -> Optional.of(userRefNum);
            case "MatchNumber" -> Optional.of(matchNumber);
            case "BrokenTradeReason" -> Optional.of(brokenTradeReason);
            case "Clordid" -> Optional.of(clordid);
            case "AppendageLength" -> Optional.of(appendageLength);
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
        changed.addAll(brokenTradeAppendage.diffFields(message.brokenTradeAppendage));
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            brokenTradeAppendage.toFormattedString(builder, options);
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
        brokenTradeAppendage.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && brokenTradeAppendage.equals(message.brokenTradeAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, brokenTradeAppendage);
    }
}
