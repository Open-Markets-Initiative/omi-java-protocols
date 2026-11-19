package omi.omi.sbe.example.sbe.v2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.omi.sbe.example.sbe.v2.fields.InstrumentIdField;
import omi.omi.sbe.example.sbe.v2.fields.MessageIndicatorField;
import omi.omi.sbe.example.sbe.v2.fields.ParticipantReferenceNumberField;
import omi.omi.sbe.example.sbe.v2.fields.TimestampField;
import omi.omi.sbe.example.sbe.v2.fields.TradeIdentifierField;
import omi.omi.sbe.example.sbe.v2.fields.TradePriceField;
import omi.omi.sbe.example.sbe.v2.fields.TradeSizeField;
import omi.omi.sbe.example.sbe.v2.fields.TransactionIdField;
import omi.omi.sbe.example.sbe.v2.fields.UnderlyingAskField;
import omi.omi.sbe.example.sbe.v2.fields.UnderlyingBidField;
import omi.omi.sbe.example.sbe.v2.fields.UnderlyingLastPriceField;
import omi.omi.sbe.example.sbe.v2.fields.UnderlyingLastTimestampField;
import omi.omi.sbe.example.sbe.v2.structs.OptionKey;
import omi.omi.sbe.example.sbe.v2.types.Field;
import omi.omi.sbe.example.sbe.v2.types.Message;
import omi.omi.sbe.example.sbe.v2.types.PrintOptions;

/**
 * Represents the OpraLastSaleMessage message from the Example protocol.
 *
 * <p>OpraLastSaleMessage</p>
 */
public final class OpraLastSaleMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 111;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Opra Last Sale Message";

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * tradePrice
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * tradeSize
     */
    private final TradeSizeField tradeSize = new TradeSizeField();

    /**
     * tradeIdentifier
     */
    private final TradeIdentifierField tradeIdentifier = new TradeIdentifierField();

    /**
     * messageIndicator
     */
    private final MessageIndicatorField messageIndicator = new MessageIndicatorField();

    /**
     * transactionId
     */
    private final TransactionIdField transactionId = new TransactionIdField();

    /**
     * participantReferenceNumber
     */
    private final ParticipantReferenceNumberField participantReferenceNumber = new ParticipantReferenceNumberField();

    /**
     * underlyingBid
     */
    private final UnderlyingBidField underlyingBid = new UnderlyingBidField();

    /**
     * underlyingAsk
     */
    private final UnderlyingAskField underlyingAsk = new UnderlyingAskField();

    /**
     * underlyingLastPrice
     */
    private final UnderlyingLastPriceField underlyingLastPrice = new UnderlyingLastPriceField();

    /**
     * underlyingLastTimestamp
     */
    private final UnderlyingLastTimestampField underlyingLastTimestamp = new UnderlyingLastTimestampField();

    /**
     * OpraNbboQuoteMessage
     */
    private final OptionKey optionKey = new OptionKey();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(instrumentId), optionKey.fields(), List.<Field>of(timestampField), List.<Field>of(tradePrice), List.<Field>of(tradeSize), List.<Field>of(tradeIdentifier), List.<Field>of(messageIndicator), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(underlyingBid), List.<Field>of(underlyingAsk), List.<Field>of(underlyingLastPrice), List.<Field>of(underlyingLastTimestamp)).flatMap(List::stream).toList();

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
     * tradePrice
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * tradeSize
     *
     * @return the TradeSize field
     */
    public TradeSizeField tradeSize() {
        return tradeSize;
    }

    /**
     * tradeIdentifier
     *
     * @return the TradeIdentifier field
     */
    public TradeIdentifierField tradeIdentifier() {
        return tradeIdentifier;
    }

    /**
     * messageIndicator
     *
     * @return the MessageIndicator field
     */
    public MessageIndicatorField messageIndicator() {
        return messageIndicator;
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
     * underlyingBid
     *
     * @return the UnderlyingBid field
     */
    public UnderlyingBidField underlyingBid() {
        return underlyingBid;
    }

    /**
     * underlyingAsk
     *
     * @return the UnderlyingAsk field
     */
    public UnderlyingAskField underlyingAsk() {
        return underlyingAsk;
    }

    /**
     * underlyingLastPrice
     *
     * @return the UnderlyingLastPrice field
     */
    public UnderlyingLastPriceField underlyingLastPrice() {
        return underlyingLastPrice;
    }

    /**
     * underlyingLastTimestamp
     *
     * @return the UnderlyingLastTimestamp field
     */
    public UnderlyingLastTimestampField underlyingLastTimestamp() {
        return underlyingLastTimestamp;
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
        if (!optionKey.parseFrom(data, cursor, end - 65)) {
            return false;
        }
        cursor += optionKey.byteLength();
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!tradeSize.parse(data, cursor)) {
            return false;
        }
        cursor += TradeSizeField.BYTE_LENGTH;
        if (!tradeIdentifier.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdentifierField.BYTE_LENGTH;
        if (!messageIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MessageIndicatorField.BYTE_LENGTH;
        if (!transactionId.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionIdField.BYTE_LENGTH;
        if (!participantReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantReferenceNumberField.BYTE_LENGTH;
        if (!underlyingBid.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingBidField.BYTE_LENGTH;
        if (!underlyingAsk.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingAskField.BYTE_LENGTH;
        if (!underlyingLastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingLastPriceField.BYTE_LENGTH;
        return underlyingLastTimestamp.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = optionKey.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = tradeSize.encode(data, cursor);
        cursor = tradeIdentifier.encode(data, cursor);
        cursor = messageIndicator.encode(data, cursor);
        cursor = transactionId.encode(data, cursor);
        cursor = participantReferenceNumber.encode(data, cursor);
        cursor = underlyingBid.encode(data, cursor);
        cursor = underlyingAsk.encode(data, cursor);
        cursor = underlyingLastPrice.encode(data, cursor);
        cursor = underlyingLastTimestamp.encode(data, cursor);
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
            case "TradePrice" -> Optional.of(tradePrice);
            case "TradeSize" -> Optional.of(tradeSize);
            case "TradeIdentifier" -> Optional.of(tradeIdentifier);
            case "MessageIndicator" -> Optional.of(messageIndicator);
            case "TransactionId" -> Optional.of(transactionId);
            case "ParticipantReferenceNumber" -> Optional.of(participantReferenceNumber);
            case "UnderlyingBid" -> Optional.of(underlyingBid);
            case "UnderlyingAsk" -> Optional.of(underlyingAsk);
            case "UnderlyingLastPrice" -> Optional.of(underlyingLastPrice);
            case "UnderlyingLastTimestamp" -> Optional.of(underlyingLastTimestamp);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OpraLastSaleMessage message)) {
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
        if (!(other instanceof OpraLastSaleMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
