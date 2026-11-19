package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.AccountStringField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ClOrdIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.InstrumentIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.MarketParticipantIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ReasonCodeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.RejectTypeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.ThrottleIndicatorField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.TransactTimeField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.fields.UnderlyingIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.Message;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.PrintOptions;

/**
 * Represents the ApplicationLayerRejectMessage message from the BinaryOrderEntry protocol.
 *
 * <p>ApplicationLayerRejectMessage</p>
 */
public final class ApplicationLayerRejectMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 47;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Application Layer Reject Message";

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * underlyingId
     */
    private final UnderlyingIdField underlyingId = new UnderlyingIdField();

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * marketParticipantId
     */
    private final MarketParticipantIdField marketParticipantId = new MarketParticipantIdField();

    /**
     * clOrdId
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * account
     */
    private final AccountStringField accountString = new AccountStringField();

    /**
     * reasonCode
     */
    private final ReasonCodeField reasonCode = new ReasonCodeField();

    /**
     * rejectType
     */
    private final RejectTypeField rejectType = new RejectTypeField();

    /**
     * throttleIndicator
     */
    private final ThrottleIndicatorField throttleIndicator = new ThrottleIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, underlyingId, instrumentId, marketParticipantId, clOrdId, accountString, reasonCode, rejectType, throttleIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * transactTime
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * underlyingId
     *
     * @return the UnderlyingId field
     */
    public UnderlyingIdField underlyingId() {
        return underlyingId;
    }

    /**
     * instrumentId
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * marketParticipantId
     *
     * @return the MarketParticipantId field
     */
    public MarketParticipantIdField marketParticipantId() {
        return marketParticipantId;
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
     * account
     *
     * @return the AccountString field
     */
    public AccountStringField accountString() {
        return accountString;
    }

    /**
     * reasonCode
     *
     * @return the ReasonCode field
     */
    public ReasonCodeField reasonCode() {
        return reasonCode;
    }

    /**
     * rejectType
     *
     * @return the RejectType field
     */
    public RejectTypeField rejectType() {
        return rejectType;
    }

    /**
     * throttleIndicator
     *
     * @return the ThrottleIndicator field
     */
    public ThrottleIndicatorField throttleIndicator() {
        return throttleIndicator;
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
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!underlyingId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingIdField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!marketParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketParticipantIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!accountString.parse(data, cursor)) {
            return false;
        }
        cursor += AccountStringField.BYTE_LENGTH;
        if (!reasonCode.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonCodeField.BYTE_LENGTH;
        if (!rejectType.parse(data, cursor)) {
            return false;
        }
        cursor += RejectTypeField.BYTE_LENGTH;
        return throttleIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = underlyingId.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = marketParticipantId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = accountString.encode(data, cursor);
        cursor = reasonCode.encode(data, cursor);
        cursor = rejectType.encode(data, cursor);
        cursor = throttleIndicator.encode(data, cursor);
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
            case "TransactTime" -> Optional.of(transactTime);
            case "UnderlyingId" -> Optional.of(underlyingId);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "MarketParticipantId" -> Optional.of(marketParticipantId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "AccountString" -> Optional.of(accountString);
            case "ReasonCode" -> Optional.of(reasonCode);
            case "RejectType" -> Optional.of(rejectType);
            case "ThrottleIndicator" -> Optional.of(throttleIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ApplicationLayerRejectMessage message)) {
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
        if (!(other instanceof ApplicationLayerRejectMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
