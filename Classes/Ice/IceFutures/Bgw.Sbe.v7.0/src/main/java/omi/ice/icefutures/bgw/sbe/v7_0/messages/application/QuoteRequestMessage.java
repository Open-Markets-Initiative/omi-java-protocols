package omi.ice.icefutures.bgw.sbe.v7_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClearingAccountString14NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClearingFirmInt32NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OnBehalfOfCompIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OnBehalfOfLocationIDStringField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OnBehalfOfSubIDStringField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OrderQtyDecimal9NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OriginatorUserIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.RfqReqIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SideSideEnumNullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SymbolIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the QuoteRequestMessage message from the Bgw protocol.
 *
 * <p>QuoteRequestMessage</p>
 */
public final class QuoteRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 182;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Request Message";

    /**
     * originatorUserID
     */
    private final OriginatorUserIdField originatorUserId = new OriginatorUserIdField();

    /**
     * side
     */
    private final SideSideEnumNullField sideSideEnumNull = new SideSideEnumNullField();

    /**
     * orderQty
     */
    private final OrderQtyDecimal9NullField orderQtyDecimal9Null = new OrderQtyDecimal9NullField();

    /**
     * rfqReqID
     */
    private final RfqReqIdField rfqReqId = new RfqReqIdField();

    /**
     * symbol
     */
    private final SymbolIntField symbolInt = new SymbolIntField();

    /**
     * clearingFirm
     */
    private final ClearingFirmInt32NullField clearingFirmInt32Null = new ClearingFirmInt32NullField();

    /**
     * clearingAccount
     */
    private final ClearingAccountString14NullField clearingAccountString14Null = new ClearingAccountString14NullField();

    /**
     * onBehalfOfCompId
     */
    private final OnBehalfOfCompIdField onBehalfOfCompId = new OnBehalfOfCompIdField();

    /**
     * onBehalfOfSubID
     */
    private final OnBehalfOfSubIDStringField onBehalfOfSubIDString = new OnBehalfOfSubIDStringField();

    /**
     * onBehalfOfLocationID
     */
    private final OnBehalfOfLocationIDStringField onBehalfOfLocationIDString = new OnBehalfOfLocationIDStringField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(originatorUserId, sideSideEnumNull, orderQtyDecimal9Null, rfqReqId, symbolInt, clearingFirmInt32Null, clearingAccountString14Null, onBehalfOfCompId, onBehalfOfSubIDString, onBehalfOfLocationIDString);

    private byte[] buffer;

    private boolean decoded;

    /**
     * originatorUserID
     *
     * @return the OriginatorUserId field
     */
    public OriginatorUserIdField originatorUserId() {
        return originatorUserId;
    }

    /**
     * side
     *
     * @return the SideSideEnumNull field
     */
    public SideSideEnumNullField sideSideEnumNull() {
        return sideSideEnumNull;
    }

    /**
     * orderQty
     *
     * @return the OrderQtyDecimal9Null field
     */
    public OrderQtyDecimal9NullField orderQtyDecimal9Null() {
        return orderQtyDecimal9Null;
    }

    /**
     * rfqReqID
     *
     * @return the RfqReqId field
     */
    public RfqReqIdField rfqReqId() {
        return rfqReqId;
    }

    /**
     * symbol
     *
     * @return the SymbolInt field
     */
    public SymbolIntField symbolInt() {
        return symbolInt;
    }

    /**
     * clearingFirm
     *
     * @return the ClearingFirmInt32Null field
     */
    public ClearingFirmInt32NullField clearingFirmInt32Null() {
        return clearingFirmInt32Null;
    }

    /**
     * clearingAccount
     *
     * @return the ClearingAccountString14Null field
     */
    public ClearingAccountString14NullField clearingAccountString14Null() {
        return clearingAccountString14Null;
    }

    /**
     * onBehalfOfCompId
     *
     * @return the OnBehalfOfCompId field
     */
    public OnBehalfOfCompIdField onBehalfOfCompId() {
        return onBehalfOfCompId;
    }

    /**
     * onBehalfOfSubID
     *
     * @return the OnBehalfOfSubIDString field
     */
    public OnBehalfOfSubIDStringField onBehalfOfSubIDString() {
        return onBehalfOfSubIDString;
    }

    /**
     * onBehalfOfLocationID
     *
     * @return the OnBehalfOfLocationIDString field
     */
    public OnBehalfOfLocationIDStringField onBehalfOfLocationIDString() {
        return onBehalfOfLocationIDString;
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
        if (!originatorUserId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginatorUserIdField.BYTE_LENGTH;
        if (!sideSideEnumNull.parse(data, cursor)) {
            return false;
        }
        cursor += SideSideEnumNullField.BYTE_LENGTH;
        if (!orderQtyDecimal9Null.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyDecimal9NullField.BYTE_LENGTH;
        if (!rfqReqId.parse(data, cursor)) {
            return false;
        }
        cursor += RfqReqIdField.BYTE_LENGTH;
        if (!symbolInt.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIntField.BYTE_LENGTH;
        if (!clearingFirmInt32Null.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmInt32NullField.BYTE_LENGTH;
        if (!clearingAccountString14Null.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountString14NullField.BYTE_LENGTH;
        if (!onBehalfOfCompId.parse(data, cursor)) {
            return false;
        }
        cursor += OnBehalfOfCompIdField.BYTE_LENGTH;
        if (!onBehalfOfSubIDString.parse(data, cursor)) {
            return false;
        }
        cursor += OnBehalfOfSubIDStringField.BYTE_LENGTH;
        return onBehalfOfLocationIDString.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = originatorUserId.encode(data, cursor);
        cursor = sideSideEnumNull.encode(data, cursor);
        cursor = orderQtyDecimal9Null.encode(data, cursor);
        cursor = rfqReqId.encode(data, cursor);
        cursor = symbolInt.encode(data, cursor);
        cursor = clearingFirmInt32Null.encode(data, cursor);
        cursor = clearingAccountString14Null.encode(data, cursor);
        cursor = onBehalfOfCompId.encode(data, cursor);
        cursor = onBehalfOfSubIDString.encode(data, cursor);
        cursor = onBehalfOfLocationIDString.encode(data, cursor);
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
            case "OriginatorUserId" -> Optional.of(originatorUserId);
            case "SideSideEnumNull" -> Optional.of(sideSideEnumNull);
            case "OrderQtyDecimal9Null" -> Optional.of(orderQtyDecimal9Null);
            case "RfqReqId" -> Optional.of(rfqReqId);
            case "SymbolInt" -> Optional.of(symbolInt);
            case "ClearingFirmInt32Null" -> Optional.of(clearingFirmInt32Null);
            case "ClearingAccountString14Null" -> Optional.of(clearingAccountString14Null);
            case "OnBehalfOfCompId" -> Optional.of(onBehalfOfCompId);
            case "OnBehalfOfSubIDString" -> Optional.of(onBehalfOfSubIDString);
            case "OnBehalfOfLocationIDString" -> Optional.of(onBehalfOfLocationIDString);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteRequestMessage message)) {
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
        if (!(other instanceof QuoteRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
