package omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.ClassKeyField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.EopTypeField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.EosField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.LegalMarketField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.SecurityIdField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.Eop;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.Field;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.Message;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.PrintOptions;

/**
 * Represents the ExpectedOpeningPriceAndSizeMessage message from the MarketDataFeed protocol.
 *
 * <p>The EOP message contains expected opening price and size information for a security.</p>
 */
public final class ExpectedOpeningPriceAndSizeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u000F';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 19;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Expected Opening Price And Size Message";

    /**
     * Class key
     */
    private final ClassKeyField classKey = new ClassKeyField();

    /**
     * Product key
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * The expected opening size
     */
    private final EosField eos = new EosField();

    /**
     * Eop Type
     */
    private final EopTypeField eopType = new EopTypeField();

    /**
     * Legal Market
     */
    private final LegalMarketField legalMarket = new LegalMarketField();

    /**
     * Eop
     */
    private final Eop eop = new Eop();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(classKey), List.<Field>of(securityId), eop.fields(), List.<Field>of(eos), List.<Field>of(eopType), List.<Field>of(legalMarket)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Class key
     *
     * @return the ClassKey field
     */
    public ClassKeyField classKey() {
        return classKey;
    }

    /**
     * Product key
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * The expected opening size
     *
     * @return the Eos field
     */
    public EosField eos() {
        return eos;
    }

    /**
     * Eop Type
     *
     * @return the EopType field
     */
    public EopTypeField eopType() {
        return eopType;
    }

    /**
     * Legal Market
     *
     * @return the LegalMarket field
     */
    public LegalMarketField legalMarket() {
        return legalMarket;
    }

    /**
     * Eop
     *
     * @return the Eop record
     */
    public Eop eop() {
        return eop;
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
        if (!classKey.parse(data, cursor)) {
            return false;
        }
        cursor += ClassKeyField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!eop.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += eop.byteLength();
        if (!eos.parse(data, cursor)) {
            return false;
        }
        cursor += EosField.BYTE_LENGTH;
        if (!eopType.parse(data, cursor)) {
            return false;
        }
        cursor += EopTypeField.BYTE_LENGTH;
        return legalMarket.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = classKey.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = eop.encode(data, cursor);
        cursor = eos.encode(data, cursor);
        cursor = eopType.encode(data, cursor);
        cursor = legalMarket.encode(data, cursor);
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
        eop.clear();
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
            case "ClassKey" -> Optional.of(classKey);
            case "SecurityId" -> Optional.of(securityId);
            case "Eos" -> Optional.of(eos);
            case "EopType" -> Optional.of(eopType);
            case "LegalMarket" -> Optional.of(legalMarket);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExpectedOpeningPriceAndSizeMessage message)) {
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
        if (!(other instanceof ExpectedOpeningPriceAndSizeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
