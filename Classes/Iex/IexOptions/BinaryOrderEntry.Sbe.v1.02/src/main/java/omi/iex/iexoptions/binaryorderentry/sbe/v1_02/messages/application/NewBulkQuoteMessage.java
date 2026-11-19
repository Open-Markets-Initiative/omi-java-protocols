package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.AiqField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.CancelInsteadOfSlideOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ClOrdIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ClearingAccountField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.CustomGroupIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.MarketParticipantIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.SendTimeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.TimeInForceField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.structs.NewBulkQuoteMessageQuoteUpdatesGroups;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.Message;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.PrintOptions;

/**
 * Represents the NewBulkQuoteMessage message from the BinaryOrderEntry protocol.
 *
 * <p>NewBulkQuoteMessage</p>
 */
public final class NewBulkQuoteMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 33;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Bulk Quote Message";

    /**
     * marketParticipantId
     */
    private final MarketParticipantIdField marketParticipantId = new MarketParticipantIdField();

    /**
     * customGroupId
     */
    private final CustomGroupIdField customGroupId = new CustomGroupIdField();

    /**
     * clOrdId
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * clearingAccount
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * cancelInsteadOfSlide
     */
    private final CancelInsteadOfSlideOptionalField cancelInsteadOfSlideOptional = new CancelInsteadOfSlideOptionalField();

    /**
     * sendTime
     */
    private final SendTimeField sendTime = new SendTimeField();

    /**
     * aiq
     */
    private final AiqField aiq = new AiqField();

    /**
     * timeInForce
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * quoteUpdates Block
     */
    private final NewBulkQuoteMessageQuoteUpdatesGroups newBulkQuoteMessageQuoteUpdatesGroups = new NewBulkQuoteMessageQuoteUpdatesGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketParticipantId, customGroupId, clOrdId, clearingAccount, cancelInsteadOfSlideOptional, sendTime, aiq, timeInForce);

    private byte[] buffer;

    private boolean decoded;

    /**
     * marketParticipantId
     *
     * @return the MarketParticipantId field
     */
    public MarketParticipantIdField marketParticipantId() {
        return marketParticipantId;
    }

    /**
     * customGroupId
     *
     * @return the CustomGroupId field
     */
    public CustomGroupIdField customGroupId() {
        return customGroupId;
    }

    /**
     * clOrdId
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * clearingAccount
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * cancelInsteadOfSlide
     *
     * @return the CancelInsteadOfSlideOptional field
     */
    public CancelInsteadOfSlideOptionalField cancelInsteadOfSlideOptional() {
        return cancelInsteadOfSlideOptional;
    }

    /**
     * sendTime
     *
     * @return the SendTime field
     */
    public SendTimeField sendTime() {
        return sendTime;
    }

    /**
     * aiq
     *
     * @return the Aiq field
     */
    public AiqField aiq() {
        return aiq;
    }

    /**
     * timeInForce
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * quoteUpdates Block
     *
     * @return the NewBulkQuoteMessageQuoteUpdatesGroups record
     */
    public NewBulkQuoteMessageQuoteUpdatesGroups newBulkQuoteMessageQuoteUpdatesGroups() {
        return newBulkQuoteMessageQuoteUpdatesGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + newBulkQuoteMessageQuoteUpdatesGroups.byteLength() - NewBulkQuoteMessageQuoteUpdatesGroups.MINIMUM_BYTE_LENGTH;
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
        if (!marketParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantIdField.BYTE_LENGTH;
        if (!customGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!cancelInsteadOfSlideOptional.parse(data, cursor)) {
            return false;
        }
        cursor += CancelInsteadOfSlideOptionalField.BYTE_LENGTH;
        if (!sendTime.parse(data, cursor)) {
            return false;
        }
        cursor += SendTimeField.BYTE_LENGTH;
        if (!aiq.parse(data, cursor)) {
            return false;
        }
        cursor += AiqField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!newBulkQuoteMessageQuoteUpdatesGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += newBulkQuoteMessageQuoteUpdatesGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = marketParticipantId.encode(data, cursor);
        cursor = customGroupId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = cancelInsteadOfSlideOptional.encode(data, cursor);
        cursor = sendTime.encode(data, cursor);
        cursor = aiq.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = newBulkQuoteMessageQuoteUpdatesGroups.encode(data, cursor);
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
        newBulkQuoteMessageQuoteUpdatesGroups.clear();
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        return newBulkQuoteMessageQuoteUpdatesGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!newBulkQuoteMessageQuoteUpdatesGroups.isValid()) {
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
        if (!marketParticipantId.isDecoded()) {
            return Optional.of(marketParticipantId);
        }
        if (!customGroupId.isDecoded()) {
            return Optional.of(customGroupId);
        }
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!clearingAccount.isDecoded()) {
            return Optional.of(clearingAccount);
        }
        if (!cancelInsteadOfSlideOptional.isDecoded()) {
            return Optional.of(cancelInsteadOfSlideOptional);
        }
        if (!sendTime.isDecoded()) {
            return Optional.of(sendTime);
        }
        if (!aiq.isDecoded()) {
            return Optional.of(aiq);
        }
        if (!timeInForce.isDecoded()) {
            return Optional.of(timeInForce);
        }
        if (!newBulkQuoteMessageQuoteUpdatesGroups.isDecoded()) {
            return newBulkQuoteMessageQuoteUpdatesGroups.failedAt();
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
            case "MarketParticipantId" -> Optional.of(marketParticipantId);
            case "CustomGroupId" -> Optional.of(customGroupId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "CancelInsteadOfSlideOptional" -> Optional.of(cancelInsteadOfSlideOptional);
            case "SendTime" -> Optional.of(sendTime);
            case "Aiq" -> Optional.of(aiq);
            case "TimeInForce" -> Optional.of(timeInForce);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewBulkQuoteMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(newBulkQuoteMessageQuoteUpdatesGroups.diffFields(message.newBulkQuoteMessageQuoteUpdatesGroups));
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
            newBulkQuoteMessageQuoteUpdatesGroups.toFormattedString(builder, options);
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
        newBulkQuoteMessageQuoteUpdatesGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof NewBulkQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && newBulkQuoteMessageQuoteUpdatesGroups.equals(message.newBulkQuoteMessageQuoteUpdatesGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, newBulkQuoteMessageQuoteUpdatesGroups);
    }
}
