package omi.gpw.wse.streambbo.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.CurrencyField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.IdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.IndexIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.InstrumentIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.InstrumentPacketField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.MicField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.PresenceFlagsIndexPortfolioEntryPresenceFlagsField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.SuspendedField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.structs.PublicProductIdentification;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the IndexPortfolioEntry message from the StreamBbo protocol.
 *
 * <p>The message contains information about a product providing the index portfolio</p>
 */
public final class IndexPortfolioEntry implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 59;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Index Portfolio Entry";

    /**
     * ID of the market structure
     */
    private final IdField id = new IdField();

    /**
     * ID of index
     */
    private final IndexIdField indexId = new IndexIdField();

    /**
     * Indicates presence of values within IndexPortfolioEntry fields
     */
    private final PresenceFlagsIndexPortfolioEntryPresenceFlagsField presenceFlagsIndexPortfolioEntryPresenceFlags = new PresenceFlagsIndexPortfolioEntryPresenceFlagsField();

    /**
     * ID of financial instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Market structure's Market Identifier Code (MIC) as specified in ISO 10383
     */
    private final MicField mic = new MicField();

    /**
     * Trading currency (e.g
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Instrument packet in index portfolio / of information product
     */
    private final InstrumentPacketField instrumentPacket = new InstrumentPacketField();

    /**
     * Is instrument suspended
     */
    private final SuspendedField suspended = new SuspendedField();

    /**
     * PublicProductIdentification
     */
    private final PublicProductIdentification publicProductIdentification = new PublicProductIdentification();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(id), List.<Field>of(indexId), List.<Field>of(presenceFlagsIndexPortfolioEntryPresenceFlags), List.<Field>of(instrumentId), publicProductIdentification.fields(), List.<Field>of(mic), List.<Field>of(currency), List.<Field>of(instrumentPacket), List.<Field>of(suspended)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID of the market structure
     *
     * @return the Id field
     */
    public IdField id() {
        return id;
    }

    /**
     * ID of index
     *
     * @return the IndexId field
     */
    public IndexIdField indexId() {
        return indexId;
    }

    /**
     * Indicates presence of values within IndexPortfolioEntry fields
     *
     * @return the PresenceFlagsIndexPortfolioEntryPresenceFlags field
     */
    public PresenceFlagsIndexPortfolioEntryPresenceFlagsField presenceFlagsIndexPortfolioEntryPresenceFlags() {
        return presenceFlagsIndexPortfolioEntryPresenceFlags;
    }

    /**
     * ID of financial instrument
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Market structure's Market Identifier Code (MIC) as specified in ISO 10383
     *
     * @return the Mic field
     */
    public MicField mic() {
        return mic;
    }

    /**
     * Trading currency (e.g
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Instrument packet in index portfolio / of information product
     *
     * @return the InstrumentPacket field
     */
    public InstrumentPacketField instrumentPacket() {
        return instrumentPacket;
    }

    /**
     * Is instrument suspended
     *
     * @return the Suspended field
     */
    public SuspendedField suspended() {
        return suspended;
    }

    /**
     * PublicProductIdentification
     *
     * @return the PublicProductIdentification record
     */
    public PublicProductIdentification publicProductIdentification() {
        return publicProductIdentification;
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
        if (!id.parse(data, cursor)) {
            return false;
        }
        cursor += IdField.BYTE_LENGTH;
        if (!indexId.parse(data, cursor)) {
            return false;
        }
        cursor += IndexIdField.BYTE_LENGTH;
        if (!presenceFlagsIndexPortfolioEntryPresenceFlags.parse(data, cursor)) {
            return false;
        }
        cursor += PresenceFlagsIndexPortfolioEntryPresenceFlagsField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!publicProductIdentification.parseFrom(data, cursor, end - 15)) {
            return false;
        }
        cursor += publicProductIdentification.byteLength();
        if (!mic.parse(data, cursor)) {
            return false;
        }
        cursor += MicField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!instrumentPacket.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentPacketField.BYTE_LENGTH;
        return suspended.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = id.encode(data, cursor);
        cursor = indexId.encode(data, cursor);
        cursor = presenceFlagsIndexPortfolioEntryPresenceFlags.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = publicProductIdentification.encode(data, cursor);
        cursor = mic.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = instrumentPacket.encode(data, cursor);
        cursor = suspended.encode(data, cursor);
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
        publicProductIdentification.clear();
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
            case "Id" -> Optional.of(id);
            case "IndexId" -> Optional.of(indexId);
            case "PresenceFlagsIndexPortfolioEntryPresenceFlags" -> Optional.of(presenceFlagsIndexPortfolioEntryPresenceFlags);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "Mic" -> Optional.of(mic);
            case "Currency" -> Optional.of(currency);
            case "InstrumentPacket" -> Optional.of(instrumentPacket);
            case "Suspended" -> Optional.of(suspended);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IndexPortfolioEntry message)) {
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
        if (!(other instanceof IndexPortfolioEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
