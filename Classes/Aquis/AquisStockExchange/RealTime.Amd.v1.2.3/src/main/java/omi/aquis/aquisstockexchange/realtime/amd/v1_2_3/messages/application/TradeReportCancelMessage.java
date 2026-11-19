package omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.fields.BinaryMmtField;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.fields.OrigPriceField;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.fields.OrigQuantityField;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.fields.OrigSecurityIdField;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.fields.OrigTimestampField;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.fields.OrigTradeRefField;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.fields.OrigTradeTypeField;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.fields.OrigTransactTimeField;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.fields.ReceivedTimestampField;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.fields.TradeRefField;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.fields.TransactTimeField;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.types.Field;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.types.Message;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.types.PrintOptions;

/**
 * Represents the TradeReportCancelMessage message from the RealTime protocol.
 *
 * <p>Whenever a previously published trade report is cancelled, a Trade Report Cancel message is published. Members can cancel trades for up to five business days from the day on which the trade was reported.</p>
 */
public final class TradeReportCancelMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u001B';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 59;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Report Cancel Message";

    /**
     * Previous accepted trade report message (not necessarily the initial trade report message) numeric identifier of the relevant security
     */
    private final OrigSecurityIdField origSecurityId = new OrigSecurityIdField();

    /**
     * Previous accepted trade report message (not necessarily the initial trade report message) code identifying type of trade, see section 3.6.2 for values
     */
    private final OrigTradeTypeField origTradeType = new OrigTradeTypeField();

    /**
     * Previous accepted trade report message (not necessarily the initial trade report message) number of shares traded
     */
    private final OrigQuantityField origQuantity = new OrigQuantityField();

    /**
     * Previous accepted trade report message (not necessarily the initial trade report message) execution price
     */
    private final OrigPriceField origPrice = new OrigPriceField();

    /**
     * Trade reference number
     */
    private final TradeRefField tradeRef = new TradeRefField();

    /**
     * System received timestamp
     */
    private final ReceivedTimestampField receivedTimestamp = new ReceivedTimestampField();

    /**
     * 4-byte field representing the applicable MMT flags on Trade messages
     */
    private final BinaryMmtField binaryMmt = new BinaryMmtField();

    /**
     * Date and time when the transaction occurred
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Previous accepted trade report message (not necessarily the initial trade report message) reference number
     */
    private final OrigTradeRefField origTradeRef = new OrigTradeRefField();

    /**
     * Previous accepted trade report message (not necessarily the initial trade report message) timestamp of market data event
     */
    private final OrigTimestampField origTimestamp = new OrigTimestampField();

    /**
     * Date and time when the original transaction occurred
     */
    private final OrigTransactTimeField origTransactTime = new OrigTransactTimeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(origSecurityId, origTradeType, origQuantity, origPrice, tradeRef, receivedTimestamp, binaryMmt, transactTime, origTradeRef, origTimestamp, origTransactTime);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Previous accepted trade report message (not necessarily the initial trade report message) numeric identifier of the relevant security
     *
     * @return the OrigSecurityId field
     */
    public OrigSecurityIdField origSecurityId() {
        return origSecurityId;
    }

    /**
     * Previous accepted trade report message (not necessarily the initial trade report message) code identifying type of trade, see section 3.6.2 for values
     *
     * @return the OrigTradeType field
     */
    public OrigTradeTypeField origTradeType() {
        return origTradeType;
    }

    /**
     * Previous accepted trade report message (not necessarily the initial trade report message) number of shares traded
     *
     * @return the OrigQuantity field
     */
    public OrigQuantityField origQuantity() {
        return origQuantity;
    }

    /**
     * Previous accepted trade report message (not necessarily the initial trade report message) execution price
     *
     * @return the OrigPrice field
     */
    public OrigPriceField origPrice() {
        return origPrice;
    }

    /**
     * Trade reference number
     *
     * @return the TradeRef field
     */
    public TradeRefField tradeRef() {
        return tradeRef;
    }

    /**
     * System received timestamp
     *
     * @return the ReceivedTimestamp field
     */
    public ReceivedTimestampField receivedTimestamp() {
        return receivedTimestamp;
    }

    /**
     * 4-byte field representing the applicable MMT flags on Trade messages
     *
     * @return the BinaryMmt field
     */
    public BinaryMmtField binaryMmt() {
        return binaryMmt;
    }

    /**
     * Date and time when the transaction occurred
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Previous accepted trade report message (not necessarily the initial trade report message) reference number
     *
     * @return the OrigTradeRef field
     */
    public OrigTradeRefField origTradeRef() {
        return origTradeRef;
    }

    /**
     * Previous accepted trade report message (not necessarily the initial trade report message) timestamp of market data event
     *
     * @return the OrigTimestamp field
     */
    public OrigTimestampField origTimestamp() {
        return origTimestamp;
    }

    /**
     * Date and time when the original transaction occurred
     *
     * @return the OrigTransactTime field
     */
    public OrigTransactTimeField origTransactTime() {
        return origTransactTime;
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
        return Optional.ofNullable(receivedTimestamp.value());
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
        if (!origSecurityId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigSecurityIdField.BYTE_LENGTH;
        if (!origTradeType.parse(data, cursor)) {
            return false;
        }
        cursor += OrigTradeTypeField.BYTE_LENGTH;
        if (!origQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += OrigQuantityField.BYTE_LENGTH;
        if (!origPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OrigPriceField.BYTE_LENGTH;
        if (!tradeRef.parse(data, cursor)) {
            return false;
        }
        cursor += TradeRefField.BYTE_LENGTH;
        if (!receivedTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += ReceivedTimestampField.BYTE_LENGTH;
        if (!binaryMmt.parse(data, cursor)) {
            return false;
        }
        cursor += BinaryMmtField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!origTradeRef.parse(data, cursor)) {
            return false;
        }
        cursor += OrigTradeRefField.BYTE_LENGTH;
        if (!origTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += OrigTimestampField.BYTE_LENGTH;
        return origTransactTime.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = origSecurityId.encode(data, cursor);
        cursor = origTradeType.encode(data, cursor);
        cursor = origQuantity.encode(data, cursor);
        cursor = origPrice.encode(data, cursor);
        cursor = tradeRef.encode(data, cursor);
        cursor = receivedTimestamp.encode(data, cursor);
        cursor = binaryMmt.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = origTradeRef.encode(data, cursor);
        cursor = origTimestamp.encode(data, cursor);
        cursor = origTransactTime.encode(data, cursor);
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
            case "OrigSecurityId" -> Optional.of(origSecurityId);
            case "OrigTradeType" -> Optional.of(origTradeType);
            case "OrigQuantity" -> Optional.of(origQuantity);
            case "OrigPrice" -> Optional.of(origPrice);
            case "TradeRef" -> Optional.of(tradeRef);
            case "ReceivedTimestamp" -> Optional.of(receivedTimestamp);
            case "BinaryMmt" -> Optional.of(binaryMmt);
            case "TransactTime" -> Optional.of(transactTime);
            case "OrigTradeRef" -> Optional.of(origTradeRef);
            case "OrigTimestamp" -> Optional.of(origTimestamp);
            case "OrigTransactTime" -> Optional.of(origTransactTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeReportCancelMessage message)) {
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
        if (!(other instanceof TradeReportCancelMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
