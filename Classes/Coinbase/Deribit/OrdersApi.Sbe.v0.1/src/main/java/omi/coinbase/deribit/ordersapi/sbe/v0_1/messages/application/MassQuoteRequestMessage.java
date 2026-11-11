package omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.CorrelationIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.FlagsMassQuoteFlagsField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.MmpGroupIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.QuoteIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.SelfMatchPreventionIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.MassQuoteRequestMessageQuotesGroups;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Field;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Message;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.PrintOptions;

/**
 * Represents the MassQuoteRequestMessage message from the OrdersApi protocol.
 *
 * <p>MassQuoteRequestMessage</p>
 */
public final class MassQuoteRequestMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 37;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Quote Request Message";

    /**
     * quoteId
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * correlationId
     */
    private final CorrelationIdField correlationId = new CorrelationIdField();

    /**
     * mmpGroupId
     */
    private final MmpGroupIdField mmpGroupId = new MmpGroupIdField();

    /**
     * selfMatchPreventionId
     */
    private final SelfMatchPreventionIdField selfMatchPreventionId = new SelfMatchPreventionIdField();

    /**
     * MassQuoteFlags bit set
     */
    private final FlagsMassQuoteFlagsField flagsMassQuoteFlags = new FlagsMassQuoteFlagsField();

    /**
     * quotes Block
     */
    private final MassQuoteRequestMessageQuotesGroups massQuoteRequestMessageQuotesGroups = new MassQuoteRequestMessageQuotesGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(quoteId, correlationId, mmpGroupId, selfMatchPreventionId, flagsMassQuoteFlags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * quoteId
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * correlationId
     *
     * @return the CorrelationId field
     */
    public CorrelationIdField correlationId() {
        return correlationId;
    }

    /**
     * mmpGroupId
     *
     * @return the MmpGroupId field
     */
    public MmpGroupIdField mmpGroupId() {
        return mmpGroupId;
    }

    /**
     * selfMatchPreventionId
     *
     * @return the SelfMatchPreventionId field
     */
    public SelfMatchPreventionIdField selfMatchPreventionId() {
        return selfMatchPreventionId;
    }

    /**
     * MassQuoteFlags bit set
     *
     * @return the FlagsMassQuoteFlags field
     */
    public FlagsMassQuoteFlagsField flagsMassQuoteFlags() {
        return flagsMassQuoteFlags;
    }

    /**
     * quotes Block
     *
     * @return the MassQuoteRequestMessageQuotesGroups record
     */
    public MassQuoteRequestMessageQuotesGroups massQuoteRequestMessageQuotesGroups() {
        return massQuoteRequestMessageQuotesGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + massQuoteRequestMessageQuotesGroups.byteLength() - MassQuoteRequestMessageQuotesGroups.MINIMUM_BYTE_LENGTH;
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
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!correlationId.parse(data, cursor)) {
            return false;
        }
        cursor += CorrelationIdField.BYTE_LENGTH;
        if (!mmpGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += MmpGroupIdField.BYTE_LENGTH;
        if (!selfMatchPreventionId.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionIdField.BYTE_LENGTH;
        if (!flagsMassQuoteFlags.parse(data, cursor)) {
            return false;
        }
        cursor += FlagsMassQuoteFlagsField.BYTE_LENGTH;
        if (!massQuoteRequestMessageQuotesGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += massQuoteRequestMessageQuotesGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = quoteId.encode(data, cursor);
        cursor = correlationId.encode(data, cursor);
        cursor = mmpGroupId.encode(data, cursor);
        cursor = selfMatchPreventionId.encode(data, cursor);
        cursor = flagsMassQuoteFlags.encode(data, cursor);
        cursor = massQuoteRequestMessageQuotesGroups.encode(data, cursor);
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
        massQuoteRequestMessageQuotesGroups.clear();
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
        return massQuoteRequestMessageQuotesGroups.isRecognized();
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
        if (!massQuoteRequestMessageQuotesGroups.isValid()) {
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
        if (!quoteId.isDecoded()) {
            return Optional.of(quoteId);
        }
        if (!correlationId.isDecoded()) {
            return Optional.of(correlationId);
        }
        if (!mmpGroupId.isDecoded()) {
            return Optional.of(mmpGroupId);
        }
        if (!selfMatchPreventionId.isDecoded()) {
            return Optional.of(selfMatchPreventionId);
        }
        if (!flagsMassQuoteFlags.isDecoded()) {
            return Optional.of(flagsMassQuoteFlags);
        }
        if (!massQuoteRequestMessageQuotesGroups.isDecoded()) {
            return massQuoteRequestMessageQuotesGroups.failedAt();
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
            case "QuoteId" -> Optional.of(quoteId);
            case "CorrelationId" -> Optional.of(correlationId);
            case "MmpGroupId" -> Optional.of(mmpGroupId);
            case "SelfMatchPreventionId" -> Optional.of(selfMatchPreventionId);
            case "FlagsMassQuoteFlags" -> Optional.of(flagsMassQuoteFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassQuoteRequestMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(massQuoteRequestMessageQuotesGroups.diffFields(message.massQuoteRequestMessageQuotesGroups));
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
            massQuoteRequestMessageQuotesGroups.toFormattedString(builder, options);
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
        massQuoteRequestMessageQuotesGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof MassQuoteRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && massQuoteRequestMessageQuotesGroups.equals(message.massQuoteRequestMessageQuotesGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, massQuoteRequestMessageQuotesGroups);
    }
}
