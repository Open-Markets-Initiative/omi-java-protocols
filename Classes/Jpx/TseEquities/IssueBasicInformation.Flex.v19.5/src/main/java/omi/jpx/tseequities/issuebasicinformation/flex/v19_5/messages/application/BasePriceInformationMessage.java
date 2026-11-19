package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.BasePricePriceOfTheMiddleOfTheBookField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.BasedBusinessDayField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.NumberOfTickSizeTableField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Reserved1Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Reserved2Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Reserved4Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.structs.BasePrice;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.structs.LimitPriceMaximum;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.structs.LimitPriceMinimum;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.types.Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.types.Message;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.types.PrintOptions;

/**
 * Represents the BasePriceInformationMessage message from the IssueBasicInformation protocol.
 *
 * <p>In this Tag, the below items for the next business day or the day are set. This tag appears as part of an issue basic message.</p>
 */
public final class BasePriceInformationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 66;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Base Price Information Message";

    /**
     * This item is reserved.
     */
    private final Reserved2Field reserved2 = new Reserved2Field();

    /**
     * Indicates the applicable business day.
     */
    private final BasedBusinessDayField basedBusinessDay = new BasedBusinessDayField();

    /**
     * Indicates the Base Price/Price of the Middle of the Book.
     */
    private final BasePricePriceOfTheMiddleOfTheBookField basePricePriceOfTheMiddleOfTheBook = new BasePricePriceOfTheMiddleOfTheBookField();

    /**
     * Indicates the Number of Tick Size Table.
     */
    private final NumberOfTickSizeTableField numberOfTickSizeTable = new NumberOfTickSizeTableField();

    /**
     * This item is reserved.
     */
    private final Reserved1Field reserved1 = new Reserved1Field();

    /**
     * This item is reserved.
     */
    private final Reserved4Field reserved4 = new Reserved4Field();

    /**
     * Base Price
     */
    private final BasePrice basePrice = new BasePrice();

    /**
     * Limit Price (Maximum)
     */
    private final LimitPriceMaximum limitPriceMaximum = new LimitPriceMaximum();

    /**
     * Limit Price (Minimum)
     */
    private final LimitPriceMinimum limitPriceMinimum = new LimitPriceMinimum();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(reserved2), List.<Field>of(basedBusinessDay), basePrice.fields(), limitPriceMaximum.fields(), limitPriceMinimum.fields(), List.<Field>of(basePricePriceOfTheMiddleOfTheBook), List.<Field>of(numberOfTickSizeTable), List.<Field>of(reserved1), List.<Field>of(reserved4)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * This item is reserved.
     *
     * @return the Reserved2 field
     */
    public Reserved2Field reserved2() {
        return reserved2;
    }

    /**
     * Indicates the applicable business day.
     *
     * @return the BasedBusinessDay field
     */
    public BasedBusinessDayField basedBusinessDay() {
        return basedBusinessDay;
    }

    /**
     * Indicates the Base Price/Price of the Middle of the Book.
     *
     * @return the BasePricePriceOfTheMiddleOfTheBook field
     */
    public BasePricePriceOfTheMiddleOfTheBookField basePricePriceOfTheMiddleOfTheBook() {
        return basePricePriceOfTheMiddleOfTheBook;
    }

    /**
     * Indicates the Number of Tick Size Table.
     *
     * @return the NumberOfTickSizeTable field
     */
    public NumberOfTickSizeTableField numberOfTickSizeTable() {
        return numberOfTickSizeTable;
    }

    /**
     * This item is reserved.
     *
     * @return the Reserved1 field
     */
    public Reserved1Field reserved1() {
        return reserved1;
    }

    /**
     * This item is reserved.
     *
     * @return the Reserved4 field
     */
    public Reserved4Field reserved4() {
        return reserved4;
    }

    /**
     * Base Price
     *
     * @return the BasePrice record
     */
    public BasePrice basePrice() {
        return basePrice;
    }

    /**
     * Limit Price (Maximum)
     *
     * @return the LimitPriceMaximum record
     */
    public LimitPriceMaximum limitPriceMaximum() {
        return limitPriceMaximum;
    }

    /**
     * Limit Price (Minimum)
     *
     * @return the LimitPriceMinimum record
     */
    public LimitPriceMinimum limitPriceMinimum() {
        return limitPriceMinimum;
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
        if (!reserved2.parse(data, cursor)) {
            return false;
        }
        cursor += Reserved2Field.BYTE_LENGTH;
        if (!basedBusinessDay.parse(data, cursor)) {
            return false;
        }
        cursor += BasedBusinessDayField.BYTE_LENGTH;
        if (!basePrice.parseFrom(data, cursor, end - 40)) {
            return false;
        }
        cursor += basePrice.byteLength();
        if (!limitPriceMaximum.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += limitPriceMaximum.byteLength();
        if (!limitPriceMinimum.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += limitPriceMinimum.byteLength();
        if (!basePricePriceOfTheMiddleOfTheBook.parse(data, cursor)) {
            return false;
        }
        cursor += BasePricePriceOfTheMiddleOfTheBookField.BYTE_LENGTH;
        if (!numberOfTickSizeTable.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfTickSizeTableField.BYTE_LENGTH;
        if (!reserved1.parse(data, cursor)) {
            return false;
        }
        cursor += Reserved1Field.BYTE_LENGTH;
        return reserved4.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = reserved2.encode(data, cursor);
        cursor = basedBusinessDay.encode(data, cursor);
        cursor = basePrice.encode(data, cursor);
        cursor = limitPriceMaximum.encode(data, cursor);
        cursor = limitPriceMinimum.encode(data, cursor);
        cursor = basePricePriceOfTheMiddleOfTheBook.encode(data, cursor);
        cursor = numberOfTickSizeTable.encode(data, cursor);
        cursor = reserved1.encode(data, cursor);
        cursor = reserved4.encode(data, cursor);
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
        basePrice.clear();
        limitPriceMaximum.clear();
        limitPriceMinimum.clear();
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
            case "Reserved2" -> Optional.of(reserved2);
            case "BasedBusinessDay" -> Optional.of(basedBusinessDay);
            case "BasePricePriceOfTheMiddleOfTheBook" -> Optional.of(basePricePriceOfTheMiddleOfTheBook);
            case "NumberOfTickSizeTable" -> Optional.of(numberOfTickSizeTable);
            case "Reserved1" -> Optional.of(reserved1);
            case "Reserved4" -> Optional.of(reserved4);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BasePriceInformationMessage message)) {
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
        if (!(other instanceof BasePriceInformationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
