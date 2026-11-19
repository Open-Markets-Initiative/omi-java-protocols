package omi.tmx.tsx.globalfx.gfx.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.tmx.tsx.globalfx.gfx.v1_0.fields.Currency1Field;
import omi.tmx.tsx.globalfx.gfx.v1_0.fields.Currency2Field;
import omi.tmx.tsx.globalfx.gfx.v1_0.fields.NumberOfTiersField;
import omi.tmx.tsx.globalfx.gfx.v1_0.fields.SequenceNumberField;
import omi.tmx.tsx.globalfx.gfx.v1_0.fields.StreamIdField;
import omi.tmx.tsx.globalfx.gfx.v1_0.fields.TimestampField;
import omi.tmx.tsx.globalfx.gfx.v1_0.fields.ValidForSecondsField;
import omi.tmx.tsx.globalfx.gfx.v1_0.groups.SizeTierEntry;
import omi.tmx.tsx.globalfx.gfx.v1_0.groups.SizeTierList;
import omi.tmx.tsx.globalfx.gfx.v1_0.types.Field;
import omi.tmx.tsx.globalfx.gfx.v1_0.types.Message;
import omi.tmx.tsx.globalfx.gfx.v1_0.types.PrintOptions;

/**
 * Represents the ReferencePriceFxSpot message from the GlobalFx protocol.
 *
 * <p>Reports a bid and offer reference price at each pre-configured size tier for a currency pair</p>
 */
public final class ReferencePriceFxSpot implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '#';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 31;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Reference Price Fx Spot";

    /**
     * Base currency
     */
    private final Currency1Field currency1 = new Currency1Field();

    /**
     * Counter currency
     */
    private final Currency2Field currency2 = new Currency2Field();

    /**
     * Time in microseconds since Jan 1, 1970
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Stream Id, which changes when the sequence number resets
     */
    private final StreamIdField streamId = new StreamIdField();

    /**
     * Sequence Number within this Stream Id
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Time to live for the prices in this datagram, zero if periodic refresh is not enabled
     */
    private final ValidForSecondsField validForSeconds = new ValidForSecondsField();

    /**
     * Number of repeating groups following
     */
    private final NumberOfTiersField numberOfTiers = new NumberOfTiersField();

    /**
     * Bid and offer reference prices at one pre-configured size tier
     */
    private final SizeTierList sizeTier = new SizeTierList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(currency1, currency2, timestampField, streamId, sequenceNumber, validForSeconds, numberOfTiers);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Base currency
     *
     * @return the Currency1 field
     */
    public Currency1Field currency1() {
        return currency1;
    }

    /**
     * Counter currency
     *
     * @return the Currency2 field
     */
    public Currency2Field currency2() {
        return currency2;
    }

    /**
     * Time in microseconds since Jan 1, 1970
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Stream Id, which changes when the sequence number resets
     *
     * @return the StreamId field
     */
    public StreamIdField streamId() {
        return streamId;
    }

    /**
     * Sequence Number within this Stream Id
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Time to live for the prices in this datagram, zero if periodic refresh is not enabled
     *
     * @return the ValidForSeconds field
     */
    public ValidForSecondsField validForSeconds() {
        return validForSeconds;
    }

    /**
     * Number of repeating groups following
     *
     * @return the NumberOfTiers field
     */
    public NumberOfTiersField numberOfTiers() {
        return numberOfTiers;
    }

    /**
     * Bid and offer reference prices at one pre-configured size tier
     *
     * <p>Encode writes this list's size to the NumberOfTiers field.</p>
     *
     * @return the SizeTier entries
     */
    public SizeTierList sizeTier() {
        return sizeTier;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + sizeTier.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 3;
        cursor += 3;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 2;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        cursor += sizeTier.byteLength();
        return cursor;
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
        cursor += 1; // padding
        if (!currency1.parse(data, cursor)) {
            return false;
        }
        cursor += Currency1Field.BYTE_LENGTH;
        if (!currency2.parse(data, cursor)) {
            return false;
        }
        cursor += Currency2Field.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!streamId.parse(data, cursor)) {
            return false;
        }
        cursor += StreamIdField.BYTE_LENGTH;
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!validForSeconds.parse(data, cursor)) {
            return false;
        }
        cursor += ValidForSecondsField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfTiers.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfTiersField.BYTE_LENGTH;
        if (!sizeTier.parse(data, cursor, end, numberOfTiers.value())) {
            return false;
        }
        cursor += sizeTier.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (sizeTier.size() > 255) {
            throw new IllegalStateException("sizeTier holds " + sizeTier.size() + " entries, more than its count field can state");
        }
        numberOfTiers.value((short) sizeTier.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 1) {
            System.arraycopy(buffer, 0, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = currency1.encode(data, cursor);
        cursor = currency2.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = streamId.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = validForSeconds.encode(data, cursor);
        if (buffer != null && buffer.length >= 30) {
            System.arraycopy(buffer, 29, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfTiers.encode(data, cursor);
        cursor = sizeTier.encode(data, cursor);
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
        sizeTier.clear();
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
            if (field != numberOfTiers && !field.isRecognized()) {
                return false;
            }
        }
        return sizeTier.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfTiers && !field.isValid()) {
                return false;
            }
        }
        if (!sizeTier.isValid()) {
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
        if (!currency1.isDecoded()) {
            return Optional.of(currency1);
        }
        if (!currency2.isDecoded()) {
            return Optional.of(currency2);
        }
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!streamId.isDecoded()) {
            return Optional.of(streamId);
        }
        if (!sequenceNumber.isDecoded()) {
            return Optional.of(sequenceNumber);
        }
        if (!validForSeconds.isDecoded()) {
            return Optional.of(validForSeconds);
        }
        if (!numberOfTiers.isDecoded()) {
            return Optional.of(numberOfTiers);
        }
        if (!sizeTier.isDecoded()) {
            return Optional.of(sizeTier.failedEntry().flatMap(SizeTierEntry::failedAt).orElse(numberOfTiers));
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
            case "Currency1" -> Optional.of(currency1);
            case "Currency2" -> Optional.of(currency2);
            case "Timestamp" -> Optional.of(timestampField);
            case "StreamId" -> Optional.of(streamId);
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "ValidForSeconds" -> Optional.of(validForSeconds);
            case "NumberOfTiers" -> Optional.of(numberOfTiers);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ReferencePriceFxSpot message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(sizeTier.diffFields(message.sizeTier));
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
            sizeTier.toFormattedString(builder, options);
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
        sizeTier.toFormattedString(builder, nested);
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
        if (!(other instanceof ReferencePriceFxSpot message)) {
            return false;
        }
        return fields.equals(message.fields) && sizeTier.equals(message.sizeTier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, sizeTier);
    }
}
