package omi.lme.lmeselect.level1snapshot.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.ContractCodeField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.EndTimeField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.FillerStringField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.StartTimeField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.TimeOfEventField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.TradingStateConditionField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.TradingStateField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.fields.TradingVenueField;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.level1snapshot.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the MarketStateContractMessage message from the Level1Snapshot protocol.
 *
 * <p>Indicates the trading state of instruments at the contract level, for example Copper Futures or Aluminium Options. The ContractCode field is common across the Market State - Contract, Outright Definition and Strategy Definition messages and links the contract state to individual tradable instruments.</p>
 */
public final class MarketStateContractMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market State Contract Message";

    /**
     * Trading venue.
     */
    private final TradingVenueField tradingVenue = new TradingVenueField();

    /**
     * Time of event.
     */
    private final TimeOfEventField timeOfEvent = new TimeOfEventField();

    /**
     * A string that combines the contract symbol, contract type and currency.
     */
    private final ContractCodeField contractCode = new ContractCodeField();

    /**
     * Trading State.
     */
    private final TradingStateField tradingState = new TradingStateField();

    /**
     * Trading State Start Time. Zero, meaning not applicable, for Technical Halt.
     */
    private final StartTimeField startTime = new StartTimeField();

    /**
     * Trading State End Time. Zero, meaning not applicable, for Technical Halt.
     */
    private final EndTimeField endTime = new EndTimeField();

    /**
     * Current trading state condition.
     */
    private final TradingStateConditionField tradingStateCondition = new TradingStateConditionField();

    /**
     * Filler.
     */
    private final FillerStringField fillerString = new FillerStringField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradingVenue, timeOfEvent, contractCode, tradingState, startTime, endTime, tradingStateCondition, fillerString);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Trading venue.
     *
     * @return the TradingVenue field
     */
    public TradingVenueField tradingVenue() {
        return tradingVenue;
    }

    /**
     * Time of event.
     *
     * @return the TimeOfEvent field
     */
    public TimeOfEventField timeOfEvent() {
        return timeOfEvent;
    }

    /**
     * A string that combines the contract symbol, contract type and currency.
     *
     * @return the ContractCode field
     */
    public ContractCodeField contractCode() {
        return contractCode;
    }

    /**
     * Trading State.
     *
     * @return the TradingState field
     */
    public TradingStateField tradingState() {
        return tradingState;
    }

    /**
     * Trading State Start Time. Zero, meaning not applicable, for Technical Halt.
     *
     * @return the StartTime field
     */
    public StartTimeField startTime() {
        return startTime;
    }

    /**
     * Trading State End Time. Zero, meaning not applicable, for Technical Halt.
     *
     * @return the EndTime field
     */
    public EndTimeField endTime() {
        return endTime;
    }

    /**
     * Current trading state condition.
     *
     * @return the TradingStateCondition field
     */
    public TradingStateConditionField tradingStateCondition() {
        return tradingStateCondition;
    }

    /**
     * Filler.
     *
     * @return the FillerString field
     */
    public FillerStringField fillerString() {
        return fillerString;
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
        return Optional.ofNullable(timeOfEvent.value());
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
        if (!tradingVenue.parse(data, cursor)) {
            return false;
        }
        cursor += TradingVenueField.BYTE_LENGTH;
        if (!timeOfEvent.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOfEventField.BYTE_LENGTH;
        if (!contractCode.parse(data, cursor)) {
            return false;
        }
        cursor += ContractCodeField.BYTE_LENGTH;
        if (!tradingState.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStateField.BYTE_LENGTH;
        if (!startTime.parse(data, cursor)) {
            return false;
        }
        cursor += StartTimeField.BYTE_LENGTH;
        if (!endTime.parse(data, cursor)) {
            return false;
        }
        cursor += EndTimeField.BYTE_LENGTH;
        if (!tradingStateCondition.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStateConditionField.BYTE_LENGTH;
        return fillerString.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tradingVenue.encode(data, cursor);
        cursor = timeOfEvent.encode(data, cursor);
        cursor = contractCode.encode(data, cursor);
        cursor = tradingState.encode(data, cursor);
        cursor = startTime.encode(data, cursor);
        cursor = endTime.encode(data, cursor);
        cursor = tradingStateCondition.encode(data, cursor);
        cursor = fillerString.encode(data, cursor);
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
            case "TradingVenue" -> Optional.of(tradingVenue);
            case "TimeOfEvent" -> Optional.of(timeOfEvent);
            case "ContractCode" -> Optional.of(contractCode);
            case "TradingState" -> Optional.of(tradingState);
            case "StartTime" -> Optional.of(startTime);
            case "EndTime" -> Optional.of(endTime);
            case "TradingStateCondition" -> Optional.of(tradingStateCondition);
            case "FillerString" -> Optional.of(fillerString);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketStateContractMessage message)) {
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
        if (!(other instanceof MarketStateContractMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
