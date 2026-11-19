package omi.omi.sbe.example.sbe.v2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.omi.sbe.example.sbe.v2.fields.AskPriceField;
import omi.omi.sbe.example.sbe.v2.fields.BidPriceField;
import omi.omi.sbe.example.sbe.v2.fields.HighPriceField;
import omi.omi.sbe.example.sbe.v2.fields.InstrumentIdField;
import omi.omi.sbe.example.sbe.v2.fields.LastPriceField;
import omi.omi.sbe.example.sbe.v2.fields.LowPriceField;
import omi.omi.sbe.example.sbe.v2.fields.NetChangeField;
import omi.omi.sbe.example.sbe.v2.fields.OpenInterestVolumeField;
import omi.omi.sbe.example.sbe.v2.fields.OpenPriceField;
import omi.omi.sbe.example.sbe.v2.fields.ParticipantReferenceNumberField;
import omi.omi.sbe.example.sbe.v2.fields.TimestampField;
import omi.omi.sbe.example.sbe.v2.fields.TransactionIdField;
import omi.omi.sbe.example.sbe.v2.fields.UnderlyingPriceField;
import omi.omi.sbe.example.sbe.v2.fields.VolumeField;
import omi.omi.sbe.example.sbe.v2.structs.OptionKey;
import omi.omi.sbe.example.sbe.v2.types.Field;
import omi.omi.sbe.example.sbe.v2.types.Message;
import omi.omi.sbe.example.sbe.v2.types.PrintOptions;

/**
 * Represents the OpraEndOfDaySummaryMessage message from the Example protocol.
 *
 * <p>OpraEndOfDaySummaryMessage</p>
 */
public final class OpraEndOfDaySummaryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 134;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Opra End Of Day Summary Message";

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * volume
     */
    private final VolumeField volume = new VolumeField();

    /**
     * openInterestVolume
     */
    private final OpenInterestVolumeField openInterestVolume = new OpenInterestVolumeField();

    /**
     * openPrice
     */
    private final OpenPriceField openPrice = new OpenPriceField();

    /**
     * highPrice
     */
    private final HighPriceField highPrice = new HighPriceField();

    /**
     * lowPrice
     */
    private final LowPriceField lowPrice = new LowPriceField();

    /**
     * lastPrice
     */
    private final LastPriceField lastPrice = new LastPriceField();

    /**
     * netChange
     */
    private final NetChangeField netChange = new NetChangeField();

    /**
     * underlyingPrice
     */
    private final UnderlyingPriceField underlyingPrice = new UnderlyingPriceField();

    /**
     * bidPrice
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * askPrice
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * transactionId
     */
    private final TransactionIdField transactionId = new TransactionIdField();

    /**
     * participantReferenceNumber
     */
    private final ParticipantReferenceNumberField participantReferenceNumber = new ParticipantReferenceNumberField();

    /**
     * OpraNbboQuoteMessage
     */
    private final OptionKey optionKey = new OptionKey();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(instrumentId), optionKey.fields(), List.<Field>of(timestampField), List.<Field>of(volume), List.<Field>of(openInterestVolume), List.<Field>of(openPrice), List.<Field>of(highPrice), List.<Field>of(lowPrice), List.<Field>of(lastPrice), List.<Field>of(netChange), List.<Field>of(underlyingPrice), List.<Field>of(bidPrice), List.<Field>of(askPrice), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * instrumentId
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * timestamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * volume
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * openInterestVolume
     *
     * @return the OpenInterestVolume field
     */
    public OpenInterestVolumeField openInterestVolume() {
        return openInterestVolume;
    }

    /**
     * openPrice
     *
     * @return the OpenPrice field
     */
    public OpenPriceField openPrice() {
        return openPrice;
    }

    /**
     * highPrice
     *
     * @return the HighPrice field
     */
    public HighPriceField highPrice() {
        return highPrice;
    }

    /**
     * lowPrice
     *
     * @return the LowPrice field
     */
    public LowPriceField lowPrice() {
        return lowPrice;
    }

    /**
     * lastPrice
     *
     * @return the LastPrice field
     */
    public LastPriceField lastPrice() {
        return lastPrice;
    }

    /**
     * netChange
     *
     * @return the NetChange field
     */
    public NetChangeField netChange() {
        return netChange;
    }

    /**
     * underlyingPrice
     *
     * @return the UnderlyingPrice field
     */
    public UnderlyingPriceField underlyingPrice() {
        return underlyingPrice;
    }

    /**
     * bidPrice
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * askPrice
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * transactionId
     *
     * @return the TransactionId field
     */
    public TransactionIdField transactionId() {
        return transactionId;
    }

    /**
     * participantReferenceNumber
     *
     * @return the ParticipantReferenceNumber field
     */
    public ParticipantReferenceNumberField participantReferenceNumber() {
        return participantReferenceNumber;
    }

    /**
     * OpraNbboQuoteMessage
     *
     * @return the OptionKey record
     */
    public OptionKey optionKey() {
        return optionKey;
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
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!optionKey.parseFrom(data, cursor, end - 88)) {
            return false;
        }
        cursor += optionKey.byteLength();
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!openInterestVolume.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestVolumeField.BYTE_LENGTH;
        if (!openPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OpenPriceField.BYTE_LENGTH;
        if (!highPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceField.BYTE_LENGTH;
        if (!lowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceField.BYTE_LENGTH;
        if (!lastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceField.BYTE_LENGTH;
        if (!netChange.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeField.BYTE_LENGTH;
        if (!underlyingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingPriceField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        if (!transactionId.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionIdField.BYTE_LENGTH;
        return participantReferenceNumber.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = optionKey.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = openInterestVolume.encode(data, cursor);
        cursor = openPrice.encode(data, cursor);
        cursor = highPrice.encode(data, cursor);
        cursor = lowPrice.encode(data, cursor);
        cursor = lastPrice.encode(data, cursor);
        cursor = netChange.encode(data, cursor);
        cursor = underlyingPrice.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = transactionId.encode(data, cursor);
        cursor = participantReferenceNumber.encode(data, cursor);
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
        optionKey.clear();
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "Timestamp" -> Optional.of(timestampField);
            case "Volume" -> Optional.of(volume);
            case "OpenInterestVolume" -> Optional.of(openInterestVolume);
            case "OpenPrice" -> Optional.of(openPrice);
            case "HighPrice" -> Optional.of(highPrice);
            case "LowPrice" -> Optional.of(lowPrice);
            case "LastPrice" -> Optional.of(lastPrice);
            case "NetChange" -> Optional.of(netChange);
            case "UnderlyingPrice" -> Optional.of(underlyingPrice);
            case "BidPrice" -> Optional.of(bidPrice);
            case "AskPrice" -> Optional.of(askPrice);
            case "TransactionId" -> Optional.of(transactionId);
            case "ParticipantReferenceNumber" -> Optional.of(participantReferenceNumber);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OpraEndOfDaySummaryMessage message)) {
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
        if (!(other instanceof OpraEndOfDaySummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
