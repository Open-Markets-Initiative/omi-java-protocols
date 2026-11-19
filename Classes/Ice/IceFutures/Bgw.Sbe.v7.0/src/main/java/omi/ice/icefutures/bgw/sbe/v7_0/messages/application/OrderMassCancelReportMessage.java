package omi.ice.icefutures.bgw.sbe.v7_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClOrdIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExchangeCodeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MarketTypeIDInt32NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MassCancelRejectReasonField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MassCancelRequestTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MassCancelResponseField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OriginatorUserIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SymbolInt32NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TextField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TransactTimeUtcTimestampField;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the OrderMassCancelReportMessage message from the Bgw protocol.
 *
 * <p>OrderMassCancelReportMessage</p>
 */
public final class OrderMassCancelReportMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 151;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Mass Cancel Report Message";

    /**
     * originatorUserID
     */
    private final OriginatorUserIdField originatorUserId = new OriginatorUserIdField();

    /**
     * symbol
     */
    private final SymbolInt32NullField symbolInt32Null = new SymbolInt32NullField();

    /**
     * clOrdID
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * transactTime
     */
    private final TransactTimeUtcTimestampField transactTimeUtcTimestamp = new TransactTimeUtcTimestampField();

    /**
     * marketTypeID
     */
    private final MarketTypeIDInt32NullField marketTypeIDInt32Null = new MarketTypeIDInt32NullField();

    /**
     * massCancelRequestType
     */
    private final MassCancelRequestTypeField massCancelRequestType = new MassCancelRequestTypeField();

    /**
     * massCancelResponse
     */
    private final MassCancelResponseField massCancelResponse = new MassCancelResponseField();

    /**
     * massCancelRejectReason
     */
    private final MassCancelRejectReasonField massCancelRejectReason = new MassCancelRejectReasonField();

    /**
     * exchangeCode
     */
    private final ExchangeCodeField exchangeCode = new ExchangeCodeField();

    /**
     * text
     */
    private final TextField text = new TextField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(originatorUserId, symbolInt32Null, clOrdId, transactTimeUtcTimestamp, marketTypeIDInt32Null, massCancelRequestType, massCancelResponse, massCancelRejectReason, exchangeCode, text);

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
     * symbol
     *
     * @return the SymbolInt32Null field
     */
    public SymbolInt32NullField symbolInt32Null() {
        return symbolInt32Null;
    }

    /**
     * clOrdID
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * transactTime
     *
     * @return the TransactTimeUtcTimestamp field
     */
    public TransactTimeUtcTimestampField transactTimeUtcTimestamp() {
        return transactTimeUtcTimestamp;
    }

    /**
     * marketTypeID
     *
     * @return the MarketTypeIDInt32Null field
     */
    public MarketTypeIDInt32NullField marketTypeIDInt32Null() {
        return marketTypeIDInt32Null;
    }

    /**
     * massCancelRequestType
     *
     * @return the MassCancelRequestType field
     */
    public MassCancelRequestTypeField massCancelRequestType() {
        return massCancelRequestType;
    }

    /**
     * massCancelResponse
     *
     * @return the MassCancelResponse field
     */
    public MassCancelResponseField massCancelResponse() {
        return massCancelResponse;
    }

    /**
     * massCancelRejectReason
     *
     * @return the MassCancelRejectReason field
     */
    public MassCancelRejectReasonField massCancelRejectReason() {
        return massCancelRejectReason;
    }

    /**
     * exchangeCode
     *
     * @return the ExchangeCode field
     */
    public ExchangeCodeField exchangeCode() {
        return exchangeCode;
    }

    /**
     * text
     *
     * @return the Text field
     */
    public TextField text() {
        return text;
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
        if (!symbolInt32Null.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolInt32NullField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!transactTimeUtcTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeUtcTimestampField.BYTE_LENGTH;
        if (!marketTypeIDInt32Null.parse(data, cursor)) {
            return false;
        }
        cursor += MarketTypeIDInt32NullField.BYTE_LENGTH;
        if (!massCancelRequestType.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelRequestTypeField.BYTE_LENGTH;
        if (!massCancelResponse.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelResponseField.BYTE_LENGTH;
        if (!massCancelRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelRejectReasonField.BYTE_LENGTH;
        if (!exchangeCode.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeCodeField.BYTE_LENGTH;
        return text.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = originatorUserId.encode(data, cursor);
        cursor = symbolInt32Null.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = transactTimeUtcTimestamp.encode(data, cursor);
        cursor = marketTypeIDInt32Null.encode(data, cursor);
        cursor = massCancelRequestType.encode(data, cursor);
        cursor = massCancelResponse.encode(data, cursor);
        cursor = massCancelRejectReason.encode(data, cursor);
        cursor = exchangeCode.encode(data, cursor);
        cursor = text.encode(data, cursor);
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
            case "SymbolInt32Null" -> Optional.of(symbolInt32Null);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "TransactTimeUtcTimestamp" -> Optional.of(transactTimeUtcTimestamp);
            case "MarketTypeIDInt32Null" -> Optional.of(marketTypeIDInt32Null);
            case "MassCancelRequestType" -> Optional.of(massCancelRequestType);
            case "MassCancelResponse" -> Optional.of(massCancelResponse);
            case "MassCancelRejectReason" -> Optional.of(massCancelRejectReason);
            case "ExchangeCode" -> Optional.of(exchangeCode);
            case "Text" -> Optional.of(text);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderMassCancelReportMessage message)) {
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
        if (!(other instanceof OrderMassCancelReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
