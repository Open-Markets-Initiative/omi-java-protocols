package omi.euronext.optiq.dropcopygateway.sbe.v5_35.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ConsumeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.EmmField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.EventIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.EventTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ImbalanceQtyField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ImbalanceQtySideField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.MsgSeqNumField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.PriceOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.PriceTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ProduceTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.QuantityOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.SymbolIndexField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.Message;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.PrintOptions;

/**
 * Represents the DcPriceUpdateMessage message from the DropCopyGateway protocol.
 *
 * <p>DCPriceUpdateMessage</p>
 */
public final class DcPriceUpdateMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 67;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Dc Price Update Message";

    /**
     * msgSeqNum
     */
    private final MsgSeqNumField msgSeqNum = new MsgSeqNumField();

    /**
     * produceTime
     */
    private final ProduceTimeField produceTime = new ProduceTimeField();

    /**
     * consumeTime
     */
    private final ConsumeTimeField consumeTime = new ConsumeTimeField();

    /**
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * eventId
     */
    private final EventIdField eventId = new EventIdField();

    /**
     * eventTime
     */
    private final EventTimeField eventTime = new EventTimeField();

    /**
     * priceType
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * price
     */
    private final PriceOptionalField priceOptional = new PriceOptionalField();

    /**
     * quantity
     */
    private final QuantityOptionalField quantityOptional = new QuantityOptionalField();

    /**
     * imbalanceQty
     */
    private final ImbalanceQtyField imbalanceQty = new ImbalanceQtyField();

    /**
     * imbalanceQtySide
     */
    private final ImbalanceQtySideField imbalanceQtySide = new ImbalanceQtySideField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, produceTime, consumeTime, emm, eventId, eventTime, priceType, symbolIndex, priceOptional, quantityOptional, imbalanceQty, imbalanceQtySide);

    private byte[] buffer;

    private boolean decoded;

    /**
     * msgSeqNum
     *
     * @return the MsgSeqNum field
     */
    public MsgSeqNumField msgSeqNum() {
        return msgSeqNum;
    }

    /**
     * produceTime
     *
     * @return the ProduceTime field
     */
    public ProduceTimeField produceTime() {
        return produceTime;
    }

    /**
     * consumeTime
     *
     * @return the ConsumeTime field
     */
    public ConsumeTimeField consumeTime() {
        return consumeTime;
    }

    /**
     * eMM
     *
     * @return the Emm field
     */
    public EmmField emm() {
        return emm;
    }

    /**
     * eventId
     *
     * @return the EventId field
     */
    public EventIdField eventId() {
        return eventId;
    }

    /**
     * eventTime
     *
     * @return the EventTime field
     */
    public EventTimeField eventTime() {
        return eventTime;
    }

    /**
     * priceType
     *
     * @return the PriceType field
     */
    public PriceTypeField priceType() {
        return priceType;
    }

    /**
     * symbolIndex
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * price
     *
     * @return the PriceOptional field
     */
    public PriceOptionalField priceOptional() {
        return priceOptional;
    }

    /**
     * quantity
     *
     * @return the QuantityOptional field
     */
    public QuantityOptionalField quantityOptional() {
        return quantityOptional;
    }

    /**
     * imbalanceQty
     *
     * @return the ImbalanceQty field
     */
    public ImbalanceQtyField imbalanceQty() {
        return imbalanceQty;
    }

    /**
     * imbalanceQtySide
     *
     * @return the ImbalanceQtySide field
     */
    public ImbalanceQtySideField imbalanceQtySide() {
        return imbalanceQtySide;
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
        if (!msgSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += MsgSeqNumField.BYTE_LENGTH;
        if (!produceTime.parse(data, cursor)) {
            return false;
        }
        cursor += ProduceTimeField.BYTE_LENGTH;
        if (!consumeTime.parse(data, cursor)) {
            return false;
        }
        cursor += ConsumeTimeField.BYTE_LENGTH;
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!eventId.parse(data, cursor)) {
            return false;
        }
        cursor += EventIdField.BYTE_LENGTH;
        if (!eventTime.parse(data, cursor)) {
            return false;
        }
        cursor += EventTimeField.BYTE_LENGTH;
        if (!priceType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTypeField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!priceOptional.parse(data, cursor)) {
            return false;
        }
        cursor += PriceOptionalField.BYTE_LENGTH;
        if (!quantityOptional.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityOptionalField.BYTE_LENGTH;
        if (!imbalanceQty.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceQtyField.BYTE_LENGTH;
        return imbalanceQtySide.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = msgSeqNum.encode(data, cursor);
        cursor = produceTime.encode(data, cursor);
        cursor = consumeTime.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = eventId.encode(data, cursor);
        cursor = eventTime.encode(data, cursor);
        cursor = priceType.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = priceOptional.encode(data, cursor);
        cursor = quantityOptional.encode(data, cursor);
        cursor = imbalanceQty.encode(data, cursor);
        cursor = imbalanceQtySide.encode(data, cursor);
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
            case "MsgSeqNum" -> Optional.of(msgSeqNum);
            case "ProduceTime" -> Optional.of(produceTime);
            case "ConsumeTime" -> Optional.of(consumeTime);
            case "Emm" -> Optional.of(emm);
            case "EventId" -> Optional.of(eventId);
            case "EventTime" -> Optional.of(eventTime);
            case "PriceType" -> Optional.of(priceType);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "PriceOptional" -> Optional.of(priceOptional);
            case "QuantityOptional" -> Optional.of(quantityOptional);
            case "ImbalanceQty" -> Optional.of(imbalanceQty);
            case "ImbalanceQtySide" -> Optional.of(imbalanceQtySide);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DcPriceUpdateMessage message)) {
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
        if (!(other instanceof DcPriceUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
