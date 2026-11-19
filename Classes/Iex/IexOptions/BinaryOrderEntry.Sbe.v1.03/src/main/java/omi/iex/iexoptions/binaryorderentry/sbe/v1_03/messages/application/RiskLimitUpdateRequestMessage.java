package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.ClOrdIdField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.CountLimitField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.CustCapacityWeightField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.IocAttributionField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.MarketParticipantIdOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.PercentageLimitField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.RiskControlOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.RiskControlStatusField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.TimeLimitField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.fields.UnderlyingIdOptionalField;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.Message;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_03.types.PrintOptions;

/**
 * Represents the RiskLimitUpdateRequestMessage message from the BinaryOrderEntry protocol.
 *
 * <p>RiskLimitUpdateRequestMessage</p>
 */
public final class RiskLimitUpdateRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Risk Limit Update Request Message";

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
     * riskControl
     */
    private final RiskControlOptionalField riskControlOptional = new RiskControlOptionalField();

    /**
     * riskControlStatus
     */
    private final RiskControlStatusField riskControlStatus = new RiskControlStatusField();

    /**
     * timeLimit
     */
    private final TimeLimitField timeLimit = new TimeLimitField();

    /**
     * percentageLimit
     */
    private final PercentageLimitField percentageLimit = new PercentageLimitField();

    /**
     * countLimit
     */
    private final CountLimitField countLimit = new CountLimitField();

    /**
     * iocAttribution
     */
    private final IocAttributionField iocAttribution = new IocAttributionField();

    /**
     * custCapacityWeight
     */
    private final CustCapacityWeightField custCapacityWeight = new CustCapacityWeightField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(underlyingIdOptional, marketParticipantIdOptional, clOrdId, riskControlOptional, riskControlStatus, timeLimit, percentageLimit, countLimit, iocAttribution, custCapacityWeight);

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
     * riskControl
     *
     * @return the RiskControlOptional field
     */
    public RiskControlOptionalField riskControlOptional() {
        return riskControlOptional;
    }

    /**
     * riskControlStatus
     *
     * @return the RiskControlStatus field
     */
    public RiskControlStatusField riskControlStatus() {
        return riskControlStatus;
    }

    /**
     * timeLimit
     *
     * @return the TimeLimit field
     */
    public TimeLimitField timeLimit() {
        return timeLimit;
    }

    /**
     * percentageLimit
     *
     * @return the PercentageLimit field
     */
    public PercentageLimitField percentageLimit() {
        return percentageLimit;
    }

    /**
     * countLimit
     *
     * @return the CountLimit field
     */
    public CountLimitField countLimit() {
        return countLimit;
    }

    /**
     * iocAttribution
     *
     * @return the IocAttribution field
     */
    public IocAttributionField iocAttribution() {
        return iocAttribution;
    }

    /**
     * custCapacityWeight
     *
     * @return the CustCapacityWeight field
     */
    public CustCapacityWeightField custCapacityWeight() {
        return custCapacityWeight;
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
        if (!riskControlOptional.parse(data, cursor)) {
            return false;
        }
        cursor += RiskControlOptionalField.BYTE_LENGTH;
        if (!riskControlStatus.parse(data, cursor)) {
            return false;
        }
        cursor += RiskControlStatusField.BYTE_LENGTH;
        if (!timeLimit.parse(data, cursor)) {
            return false;
        }
        cursor += TimeLimitField.BYTE_LENGTH;
        if (!percentageLimit.parse(data, cursor)) {
            return false;
        }
        cursor += PercentageLimitField.BYTE_LENGTH;
        if (!countLimit.parse(data, cursor)) {
            return false;
        }
        cursor += CountLimitField.BYTE_LENGTH;
        if (!iocAttribution.parse(data, cursor)) {
            return false;
        }
        cursor += IocAttributionField.BYTE_LENGTH;
        return custCapacityWeight.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = underlyingIdOptional.encode(data, cursor);
        cursor = marketParticipantIdOptional.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = riskControlOptional.encode(data, cursor);
        cursor = riskControlStatus.encode(data, cursor);
        cursor = timeLimit.encode(data, cursor);
        cursor = percentageLimit.encode(data, cursor);
        cursor = countLimit.encode(data, cursor);
        cursor = iocAttribution.encode(data, cursor);
        cursor = custCapacityWeight.encode(data, cursor);
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
            case "UnderlyingIdOptional" -> Optional.of(underlyingIdOptional);
            case "MarketParticipantIdOptional" -> Optional.of(marketParticipantIdOptional);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "RiskControlOptional" -> Optional.of(riskControlOptional);
            case "RiskControlStatus" -> Optional.of(riskControlStatus);
            case "TimeLimit" -> Optional.of(timeLimit);
            case "PercentageLimit" -> Optional.of(percentageLimit);
            case "CountLimit" -> Optional.of(countLimit);
            case "IocAttribution" -> Optional.of(iocAttribution);
            case "CustCapacityWeight" -> Optional.of(custCapacityWeight);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RiskLimitUpdateRequestMessage message)) {
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
        if (!(other instanceof RiskLimitUpdateRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
