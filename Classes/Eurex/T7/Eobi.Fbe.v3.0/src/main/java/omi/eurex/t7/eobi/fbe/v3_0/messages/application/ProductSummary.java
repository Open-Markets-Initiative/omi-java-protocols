package omi.eurex.t7.eobi.fbe.v3_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eobi.fbe.v3_0.fields.FastMarketIndicatorField;
import omi.eurex.t7.eobi.fbe.v3_0.fields.LastMsgSeqNumProcessedField;
import omi.eurex.t7.eobi.fbe.v3_0.fields.TradSesStatusField;
import omi.eurex.t7.eobi.fbe.v3_0.fields.TradingSessionIdField;
import omi.eurex.t7.eobi.fbe.v3_0.fields.TradingSessionSubIdField;
import omi.eurex.t7.eobi.fbe.v3_0.types.Field;
import omi.eurex.t7.eobi.fbe.v3_0.types.Message;
import omi.eurex.t7.eobi.fbe.v3_0.types.PrintOptions;

/**
 * Represents the ProductSummary message from the Eobi protocol.
 */
public final class ProductSummary implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Product Summary";

    /**
     * Last Msg Seq Num Processed
     */
    private final LastMsgSeqNumProcessedField lastMsgSeqNumProcessed = new LastMsgSeqNumProcessedField();

    /**
     * Trading Session Id
     */
    private final TradingSessionIdField tradingSessionId = new TradingSessionIdField();

    /**
     * Trading Session Sub Id
     */
    private final TradingSessionSubIdField tradingSessionSubId = new TradingSessionSubIdField();

    /**
     * Trad Ses Status
     */
    private final TradSesStatusField tradSesStatus = new TradSesStatusField();

    /**
     * Fast Market Indicator
     */
    private final FastMarketIndicatorField fastMarketIndicator = new FastMarketIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(lastMsgSeqNumProcessed, tradingSessionId, tradingSessionSubId, tradSesStatus, fastMarketIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Last Msg Seq Num Processed
     *
     * @return the LastMsgSeqNumProcessed field
     */
    public LastMsgSeqNumProcessedField lastMsgSeqNumProcessed() {
        return lastMsgSeqNumProcessed;
    }

    /**
     * Trading Session Id
     *
     * @return the TradingSessionId field
     */
    public TradingSessionIdField tradingSessionId() {
        return tradingSessionId;
    }

    /**
     * Trading Session Sub Id
     *
     * @return the TradingSessionSubId field
     */
    public TradingSessionSubIdField tradingSessionSubId() {
        return tradingSessionSubId;
    }

    /**
     * Trad Ses Status
     *
     * @return the TradSesStatus field
     */
    public TradSesStatusField tradSesStatus() {
        return tradSesStatus;
    }

    /**
     * Fast Market Indicator
     *
     * @return the FastMarketIndicator field
     */
    public FastMarketIndicatorField fastMarketIndicator() {
        return fastMarketIndicator;
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
        if (!lastMsgSeqNumProcessed.parse(data, cursor)) {
            return false;
        }
        cursor += LastMsgSeqNumProcessedField.BYTE_LENGTH;
        if (!tradingSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionIdField.BYTE_LENGTH;
        if (!tradingSessionSubId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionSubIdField.BYTE_LENGTH;
        if (!tradSesStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradSesStatusField.BYTE_LENGTH;
        return fastMarketIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = lastMsgSeqNumProcessed.encode(data, cursor);
        cursor = tradingSessionId.encode(data, cursor);
        cursor = tradingSessionSubId.encode(data, cursor);
        cursor = tradSesStatus.encode(data, cursor);
        cursor = fastMarketIndicator.encode(data, cursor);
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
            case "LastMsgSeqNumProcessed" -> Optional.of(lastMsgSeqNumProcessed);
            case "TradingSessionId" -> Optional.of(tradingSessionId);
            case "TradingSessionSubId" -> Optional.of(tradingSessionSubId);
            case "TradSesStatus" -> Optional.of(tradSesStatus);
            case "FastMarketIndicator" -> Optional.of(fastMarketIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ProductSummary message)) {
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
        if (!(other instanceof ProductSummary message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
