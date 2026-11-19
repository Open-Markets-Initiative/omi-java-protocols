package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.AckStylePurgeRequestAckStyleField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.BulkActionField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.ClOrdIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.MarketParticipantIdOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.SendTimeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.UnderlyingIdOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.structs.PurgeRequestMessageCustomGroupIdsGroups;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Message;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.PrintOptions;

/**
 * Represents the PurgeRequestMessage message from the BinaryOrderEntry protocol.
 *
 * <p>PurgeRequestMessage</p>
 */
public final class PurgeRequestMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 28;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Purge Request Message";

    /**
     * underlyingId
     */
    private final UnderlyingIdOptionalField underlyingIdOptional = new UnderlyingIdOptionalField();

    /**
     * marketParticipantId
     */
    private final MarketParticipantIdOptionalField marketParticipantIdOptional = new MarketParticipantIdOptionalField();

    /**
     * clOrdId
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * sendTime
     */
    private final SendTimeField sendTime = new SendTimeField();

    /**
     * ackStyle
     */
    private final AckStylePurgeRequestAckStyleField ackStylePurgeRequestAckStyle = new AckStylePurgeRequestAckStyleField();

    /**
     * bulkAction
     */
    private final BulkActionField bulkAction = new BulkActionField();

    /**
     * customGroupIds Block
     */
    private final PurgeRequestMessageCustomGroupIdsGroups purgeRequestMessageCustomGroupIdsGroups = new PurgeRequestMessageCustomGroupIdsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(underlyingIdOptional, marketParticipantIdOptional, clOrdId, sendTime, ackStylePurgeRequestAckStyle, bulkAction);

    private byte[] buffer;

    private boolean decoded;

    /**
     * underlyingId
     *
     * @return the UnderlyingIdOptional field
     */
    public UnderlyingIdOptionalField underlyingIdOptional() {
        return underlyingIdOptional;
    }

    /**
     * marketParticipantId
     *
     * @return the MarketParticipantIdOptional field
     */
    public MarketParticipantIdOptionalField marketParticipantIdOptional() {
        return marketParticipantIdOptional;
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
     * sendTime
     *
     * @return the SendTime field
     */
    public SendTimeField sendTime() {
        return sendTime;
    }

    /**
     * ackStyle
     *
     * @return the AckStylePurgeRequestAckStyle field
     */
    public AckStylePurgeRequestAckStyleField ackStylePurgeRequestAckStyle() {
        return ackStylePurgeRequestAckStyle;
    }

    /**
     * bulkAction
     *
     * @return the BulkAction field
     */
    public BulkActionField bulkAction() {
        return bulkAction;
    }

    /**
     * customGroupIds Block
     *
     * @return the PurgeRequestMessageCustomGroupIdsGroups record
     */
    public PurgeRequestMessageCustomGroupIdsGroups purgeRequestMessageCustomGroupIdsGroups() {
        return purgeRequestMessageCustomGroupIdsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + purgeRequestMessageCustomGroupIdsGroups.byteLength() - PurgeRequestMessageCustomGroupIdsGroups.MINIMUM_BYTE_LENGTH;
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
        if (!underlyingIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingIdOptionalField.BYTE_LENGTH;
        if (!marketParticipantIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantIdOptionalField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!sendTime.parse(data, cursor)) {
            return false;
        }
        cursor += SendTimeField.BYTE_LENGTH;
        if (!ackStylePurgeRequestAckStyle.parse(data, cursor)) {
            return false;
        }
        cursor += AckStylePurgeRequestAckStyleField.BYTE_LENGTH;
        if (!bulkAction.parse(data, cursor)) {
            return false;
        }
        cursor += BulkActionField.BYTE_LENGTH;
        if (!purgeRequestMessageCustomGroupIdsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += purgeRequestMessageCustomGroupIdsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = underlyingIdOptional.encode(data, cursor);
        cursor = marketParticipantIdOptional.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = sendTime.encode(data, cursor);
        cursor = ackStylePurgeRequestAckStyle.encode(data, cursor);
        cursor = bulkAction.encode(data, cursor);
        cursor = purgeRequestMessageCustomGroupIdsGroups.encode(data, cursor);
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
        purgeRequestMessageCustomGroupIdsGroups.clear();
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
        return purgeRequestMessageCustomGroupIdsGroups.isRecognized();
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
        if (!purgeRequestMessageCustomGroupIdsGroups.isValid()) {
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
        if (!underlyingIdOptional.isDecoded()) {
            return Optional.of(underlyingIdOptional);
        }
        if (!marketParticipantIdOptional.isDecoded()) {
            return Optional.of(marketParticipantIdOptional);
        }
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!sendTime.isDecoded()) {
            return Optional.of(sendTime);
        }
        if (!ackStylePurgeRequestAckStyle.isDecoded()) {
            return Optional.of(ackStylePurgeRequestAckStyle);
        }
        if (!bulkAction.isDecoded()) {
            return Optional.of(bulkAction);
        }
        if (!purgeRequestMessageCustomGroupIdsGroups.isDecoded()) {
            return purgeRequestMessageCustomGroupIdsGroups.failedAt();
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
            case "UnderlyingIdOptional" -> Optional.of(underlyingIdOptional);
            case "MarketParticipantIdOptional" -> Optional.of(marketParticipantIdOptional);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "SendTime" -> Optional.of(sendTime);
            case "AckStylePurgeRequestAckStyle" -> Optional.of(ackStylePurgeRequestAckStyle);
            case "BulkAction" -> Optional.of(bulkAction);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PurgeRequestMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(purgeRequestMessageCustomGroupIdsGroups.diffFields(message.purgeRequestMessageCustomGroupIdsGroups));
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
            purgeRequestMessageCustomGroupIdsGroups.toFormattedString(builder, options);
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
        purgeRequestMessageCustomGroupIdsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof PurgeRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && purgeRequestMessageCustomGroupIdsGroups.equals(message.purgeRequestMessageCustomGroupIdsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, purgeRequestMessageCustomGroupIdsGroups);
    }
}
