package omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.fields.AltPrice2Field;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.fields.AltPriceField;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.fields.DisplayQty2Field;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.fields.DisplayQtyField;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.fields.Price2Field;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.fields.PriceField;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.fields.Priority2Field;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.fields.PriorityField;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.fields.SecondaryOrderId2Field;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.fields.SecondaryOrderIdField;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.fields.TransactionDateAndTimeField;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.types.Field;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.types.Message;
import omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the QuoteMarketPreTransparencyInformationMessage message from the FullDepth protocol.
 *
 * <p>Used by the Server to communicate information about active quotes. In a session, a Quote is univoquely identified by its two orders: SecurityCode and SecondaryOrderID (buy order) and SecondaryOrderID2 (sell order)</p>
 */
public final class QuoteMarketPreTransparencyInformationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 72;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Market Pre Transparency Information Message";

    /**
     * Message sequence number
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Instrument (or Book) code
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     */
    private final TransactionDateAndTimeField transactionDateAndTime = new TransactionDateAndTimeField();

    /**
     * System Order Number
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * System Order Number
     */
    private final SecondaryOrderId2Field secondaryOrderId2 = new SecondaryOrderId2Field();

    /**
     * Priority
     */
    private final PriorityField priority = new PriorityField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * Visible pending volume
     */
    private final DisplayQtyField displayQty = new DisplayQtyField();

    /**
     * Yield or percent of par
     */
    private final AltPriceField altPrice = new AltPriceField();

    /**
     * Priority
     */
    private final Priority2Field priority2 = new Priority2Field();

    /**
     * Limit price
     */
    private final Price2Field price2 = new Price2Field();

    /**
     * Visible pending volume
     */
    private final DisplayQty2Field displayQty2 = new DisplayQty2Field();

    /**
     * Yield or percent of par
     */
    private final AltPrice2Field altPrice2 = new AltPrice2Field();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, securityCode, transactionDateAndTime, secondaryOrderId, secondaryOrderId2, priority, price, displayQty, altPrice, priority2, price2, displayQty2, altPrice2);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message sequence number
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Instrument (or Book) code
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     *
     * @return the TransactionDateAndTime field
     */
    public TransactionDateAndTimeField transactionDateAndTime() {
        return transactionDateAndTime;
    }

    /**
     * System Order Number
     *
     * @return the SecondaryOrderId field
     */
    public SecondaryOrderIdField secondaryOrderId() {
        return secondaryOrderId;
    }

    /**
     * System Order Number
     *
     * @return the SecondaryOrderId2 field
     */
    public SecondaryOrderId2Field secondaryOrderId2() {
        return secondaryOrderId2;
    }

    /**
     * Priority
     *
     * @return the Priority field
     */
    public PriorityField priority() {
        return priority;
    }

    /**
     * Limit price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Visible pending volume
     *
     * @return the DisplayQty field
     */
    public DisplayQtyField displayQty() {
        return displayQty;
    }

    /**
     * Yield or percent of par
     *
     * @return the AltPrice field
     */
    public AltPriceField altPrice() {
        return altPrice;
    }

    /**
     * Priority
     *
     * @return the Priority2 field
     */
    public Priority2Field priority2() {
        return priority2;
    }

    /**
     * Limit price
     *
     * @return the Price2 field
     */
    public Price2Field price2() {
        return price2;
    }

    /**
     * Visible pending volume
     *
     * @return the DisplayQty2 field
     */
    public DisplayQty2Field displayQty2() {
        return displayQty2;
    }

    /**
     * Yield or percent of par
     *
     * @return the AltPrice2 field
     */
    public AltPrice2Field altPrice2() {
        return altPrice2;
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
        return Optional.ofNullable(transactionDateAndTime.value());
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
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!transactionDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionDateAndTimeField.BYTE_LENGTH;
        if (!secondaryOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryOrderIdField.BYTE_LENGTH;
        if (!secondaryOrderId2.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryOrderId2Field.BYTE_LENGTH;
        if (!priority.parse(data, cursor)) {
            return false;
        }
        cursor += PriorityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!displayQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayQtyField.BYTE_LENGTH;
        if (!altPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AltPriceField.BYTE_LENGTH;
        if (!priority2.parse(data, cursor)) {
            return false;
        }
        cursor += Priority2Field.BYTE_LENGTH;
        if (!price2.parse(data, cursor)) {
            return false;
        }
        cursor += Price2Field.BYTE_LENGTH;
        if (!displayQty2.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayQty2Field.BYTE_LENGTH;
        return altPrice2.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sequenceNumber.encode(data, cursor);
        cursor = securityCode.encode(data, cursor);
        cursor = transactionDateAndTime.encode(data, cursor);
        cursor = secondaryOrderId.encode(data, cursor);
        cursor = secondaryOrderId2.encode(data, cursor);
        cursor = priority.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = displayQty.encode(data, cursor);
        cursor = altPrice.encode(data, cursor);
        cursor = priority2.encode(data, cursor);
        cursor = price2.encode(data, cursor);
        cursor = displayQty2.encode(data, cursor);
        cursor = altPrice2.encode(data, cursor);
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
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "SecurityCode" -> Optional.of(securityCode);
            case "TransactionDateAndTime" -> Optional.of(transactionDateAndTime);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "SecondaryOrderId2" -> Optional.of(secondaryOrderId2);
            case "Priority" -> Optional.of(priority);
            case "Price" -> Optional.of(price);
            case "DisplayQty" -> Optional.of(displayQty);
            case "AltPrice" -> Optional.of(altPrice);
            case "Priority2" -> Optional.of(priority2);
            case "Price2" -> Optional.of(price2);
            case "DisplayQty2" -> Optional.of(displayQty2);
            case "AltPrice2" -> Optional.of(altPrice2);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteMarketPreTransparencyInformationMessage message)) {
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
        if (!(other instanceof QuoteMarketPreTransparencyInformationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
