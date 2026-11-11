package omi.siac.cts.output.cta.v2_11_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.siac.cts.output.cta.v2_11_b.fields.FractionalTotalVolumeField;
import omi.siac.cts.output.cta.v2_11_b.fields.HighPriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.InstrumentTypeField;
import omi.siac.cts.output.cta.v2_11_b.fields.LastPriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.LowPriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.MessageIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.OpenPriceField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantReferenceNumberField;
import omi.siac.cts.output.cta.v2_11_b.fields.PreviousClosePriceDateField;
import omi.siac.cts.output.cta.v2_11_b.fields.SecuritySymbolField;
import omi.siac.cts.output.cta.v2_11_b.fields.SummaryParticipantIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.TickField;
import omi.siac.cts.output.cta.v2_11_b.fields.TransactionIdField;
import omi.siac.cts.output.cta.v2_11_b.structs.Timestamp;
import omi.siac.cts.output.cta.v2_11_b.types.Field;
import omi.siac.cts.output.cta.v2_11_b.types.Message;
import omi.siac.cts.output.cta.v2_11_b.types.PrintOptions;

/**
 * Represents the FractionalParticipantEndOfDaySummaryMessage message from the Output protocol.
 *
 * <p>Provides by security, the Participant Open, High, Low, Last, Volume and Tick information for CTA eligible securities, Local Issues and Bonds. Volume is represented as a fractional value</p>
 */
public final class FractionalParticipantEndOfDaySummaryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'P';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 80;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Fractional Participant End Of Day Summary Message";

    /**
     * Identifies the Participant or Processor that initiated the message
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * The Message ID identifies the individual message within the block beginning with number one
     */
    private final MessageIdField messageId = new MessageIdField();

    /**
     * Identifies the transaction
     */
    private final TransactionIdField transactionId = new TransactionIdField();

    /**
     * Contains the Participant Reference Number
     */
    private final ParticipantReferenceNumberField participantReferenceNumber = new ParticipantReferenceNumberField();

    /**
     * Identifies the Security Symbol. Left justified, space-filled
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * Identifies the instrument type relevant to the trade
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * Identifies the Participant whose summary information is provided
     */
    private final SummaryParticipantIdField summaryParticipantId = new SummaryParticipantIdField();

    /**
     * Represents the date the security last traded. Represented in seconds since Epoch
     */
    private final PreviousClosePriceDateField previousClosePriceDate = new PreviousClosePriceDateField();

    /**
     * Represents the last price for that security either on a Consolidated or an individual Participant basis at the time it is disseminated. Has implied 6 decimal places
     */
    private final LastPriceField lastPrice = new LastPriceField();

    /**
     * Represents the highest price paid for a security during the trading day. Has implied 6 decimal places
     */
    private final HighPriceField highPrice = new HighPriceField();

    /**
     * Represents the lowest price paid for a security during the trading day. Has implied 6 decimal places
     */
    private final LowPriceField lowPrice = new LowPriceField();

    /**
     * Represents the first qualifying price paid for a security during the trading day. Has implied 6 decimal places
     */
    private final OpenPriceField openPrice = new OpenPriceField();

    /**
     * Contains Total Volume of shares traded in a security either on a Consolidated or an individual Participant basis. Has implied 6 decimal places
     */
    private final FractionalTotalVolumeField fractionalTotalVolume = new FractionalTotalVolumeField();

    /**
     * Represents for a Participant the upward, downward or unchanged price movement in a security's trades
     */
    private final TickField tick = new TickField();

    /**
     * Timestamp 1
     */
    private final Timestamp timestampField = new Timestamp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(participantId), timestampField.fields(), List.<Field>of(messageId), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbol), List.<Field>of(instrumentType), List.<Field>of(summaryParticipantId), List.<Field>of(previousClosePriceDate), List.<Field>of(lastPrice), List.<Field>of(highPrice), List.<Field>of(lowPrice), List.<Field>of(openPrice), List.<Field>of(fractionalTotalVolume), List.<Field>of(tick)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identifies the Participant or Processor that initiated the message
     *
     * @return the ParticipantId field
     */
    public ParticipantIdField participantId() {
        return participantId;
    }

    /**
     * The Message ID identifies the individual message within the block beginning with number one
     *
     * @return the MessageId field
     */
    public MessageIdField messageId() {
        return messageId;
    }

    /**
     * Identifies the transaction
     *
     * @return the TransactionId field
     */
    public TransactionIdField transactionId() {
        return transactionId;
    }

    /**
     * Contains the Participant Reference Number
     *
     * @return the ParticipantReferenceNumber field
     */
    public ParticipantReferenceNumberField participantReferenceNumber() {
        return participantReferenceNumber;
    }

    /**
     * Identifies the Security Symbol. Left justified, space-filled
     *
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
    }

    /**
     * Identifies the instrument type relevant to the trade
     *
     * @return the InstrumentType field
     */
    public InstrumentTypeField instrumentType() {
        return instrumentType;
    }

    /**
     * Identifies the Participant whose summary information is provided
     *
     * @return the SummaryParticipantId field
     */
    public SummaryParticipantIdField summaryParticipantId() {
        return summaryParticipantId;
    }

    /**
     * Represents the date the security last traded. Represented in seconds since Epoch
     *
     * @return the PreviousClosePriceDate field
     */
    public PreviousClosePriceDateField previousClosePriceDate() {
        return previousClosePriceDate;
    }

    /**
     * Represents the last price for that security either on a Consolidated or an individual Participant basis at the time it is disseminated. Has implied 6 decimal places
     *
     * @return the LastPrice field
     */
    public LastPriceField lastPrice() {
        return lastPrice;
    }

    /**
     * Represents the highest price paid for a security during the trading day. Has implied 6 decimal places
     *
     * @return the HighPrice field
     */
    public HighPriceField highPrice() {
        return highPrice;
    }

    /**
     * Represents the lowest price paid for a security during the trading day. Has implied 6 decimal places
     *
     * @return the LowPrice field
     */
    public LowPriceField lowPrice() {
        return lowPrice;
    }

    /**
     * Represents the first qualifying price paid for a security during the trading day. Has implied 6 decimal places
     *
     * @return the OpenPrice field
     */
    public OpenPriceField openPrice() {
        return openPrice;
    }

    /**
     * Contains Total Volume of shares traded in a security either on a Consolidated or an individual Participant basis. Has implied 6 decimal places
     *
     * @return the FractionalTotalVolume field
     */
    public FractionalTotalVolumeField fractionalTotalVolume() {
        return fractionalTotalVolume;
    }

    /**
     * Represents for a Participant the upward, downward or unchanged price movement in a security's trades
     *
     * @return the Tick field
     */
    public TickField tick() {
        return tick;
    }

    /**
     * Timestamp 1
     *
     * @return the Timestamp record
     */
    public Timestamp timestampField() {
        return timestampField;
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
        if (!participantId.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantIdField.BYTE_LENGTH;
        if (!timestampField.parseFrom(data, cursor, end - 71)) {
            return false;
        }
        cursor += timestampField.byteLength();
        if (!messageId.parse(data, cursor)) {
            return false;
        }
        cursor += MessageIdField.BYTE_LENGTH;
        if (!transactionId.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionIdField.BYTE_LENGTH;
        if (!participantReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantReferenceNumberField.BYTE_LENGTH;
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!summaryParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += SummaryParticipantIdField.BYTE_LENGTH;
        if (!previousClosePriceDate.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousClosePriceDateField.BYTE_LENGTH;
        if (!lastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceField.BYTE_LENGTH;
        if (!highPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceField.BYTE_LENGTH;
        if (!lowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceField.BYTE_LENGTH;
        if (!openPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OpenPriceField.BYTE_LENGTH;
        if (!fractionalTotalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += FractionalTotalVolumeField.BYTE_LENGTH;
        return tick.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = participantId.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = messageId.encode(data, cursor);
        cursor = transactionId.encode(data, cursor);
        cursor = participantReferenceNumber.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = summaryParticipantId.encode(data, cursor);
        cursor = previousClosePriceDate.encode(data, cursor);
        cursor = lastPrice.encode(data, cursor);
        cursor = highPrice.encode(data, cursor);
        cursor = lowPrice.encode(data, cursor);
        cursor = openPrice.encode(data, cursor);
        cursor = fractionalTotalVolume.encode(data, cursor);
        cursor = tick.encode(data, cursor);
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
        timestampField.clear();
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
            case "ParticipantId" -> Optional.of(participantId);
            case "MessageId" -> Optional.of(messageId);
            case "TransactionId" -> Optional.of(transactionId);
            case "ParticipantReferenceNumber" -> Optional.of(participantReferenceNumber);
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "SummaryParticipantId" -> Optional.of(summaryParticipantId);
            case "PreviousClosePriceDate" -> Optional.of(previousClosePriceDate);
            case "LastPrice" -> Optional.of(lastPrice);
            case "HighPrice" -> Optional.of(highPrice);
            case "LowPrice" -> Optional.of(lowPrice);
            case "OpenPrice" -> Optional.of(openPrice);
            case "FractionalTotalVolume" -> Optional.of(fractionalTotalVolume);
            case "Tick" -> Optional.of(tick);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FractionalParticipantEndOfDaySummaryMessage message)) {
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
        if (!(other instanceof FractionalParticipantEndOfDaySummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
