package omi.moex.spectra.optinfoincremental.simba.v9_12_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.fields.ClrSessBeginField;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.fields.ExchangeTradingSessionIdInt32NullOptionalField;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.fields.MarketSegmentIdField;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.fields.SettlSessBeginField;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.fields.TradSesCloseTimeField;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.fields.TradSesEventField;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.fields.TradSesOpenTimeField;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.fields.TradSesStatusField;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.fields.TradePeriodIdField;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.fields.TradingSessionIdField;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.types.Field;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.types.Message;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.types.PrintOptions;

/**
 * Represents the TradingSessionStatusMessage message from the OptInfoIncremental protocol.
 *
 * <p>TradingSessionStatusMessage</p>
 */
public final class TradingSessionStatusMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 48;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trading Session Status Message";

    /**
     * TradSesOpenTime
     */
    private final TradSesOpenTimeField tradSesOpenTime = new TradSesOpenTimeField();

    /**
     * TradSesCloseTime
     */
    private final TradSesCloseTimeField tradSesCloseTime = new TradSesCloseTimeField();

    /**
     * TradingSessionID
     */
    private final TradingSessionIdField tradingSessionId = new TradingSessionIdField();

    /**
     * ExchangeTradingSessionID
     */
    private final ExchangeTradingSessionIdInt32NullOptionalField exchangeTradingSessionIdInt32NullOptional = new ExchangeTradingSessionIdInt32NullOptionalField();

    /**
     * TradSesStatus
     */
    private final TradSesStatusField tradSesStatus = new TradSesStatusField();

    /**
     * MarketSegmentID
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * TradSesEvent
     */
    private final TradSesEventField tradSesEvent = new TradSesEventField();

    /**
     * TradePeriodID
     */
    private final TradePeriodIdField tradePeriodId = new TradePeriodIdField();

    /**
     * SettlSessBegin
     */
    private final SettlSessBeginField settlSessBegin = new SettlSessBeginField();

    /**
     * ClrSessBegin
     */
    private final ClrSessBeginField clrSessBegin = new ClrSessBeginField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradSesOpenTime, tradSesCloseTime, tradingSessionId, exchangeTradingSessionIdInt32NullOptional, tradSesStatus, marketSegmentId, tradSesEvent, tradePeriodId, settlSessBegin, clrSessBegin);

    private byte[] buffer;

    private boolean decoded;

    /**
     * TradSesOpenTime
     *
     * @return the TradSesOpenTime field
     */
    public TradSesOpenTimeField tradSesOpenTime() {
        return tradSesOpenTime;
    }

    /**
     * TradSesCloseTime
     *
     * @return the TradSesCloseTime field
     */
    public TradSesCloseTimeField tradSesCloseTime() {
        return tradSesCloseTime;
    }

    /**
     * TradingSessionID
     *
     * @return the TradingSessionId field
     */
    public TradingSessionIdField tradingSessionId() {
        return tradingSessionId;
    }

    /**
     * ExchangeTradingSessionID
     *
     * @return the ExchangeTradingSessionIdInt32NullOptional field
     */
    public ExchangeTradingSessionIdInt32NullOptionalField exchangeTradingSessionIdInt32NullOptional() {
        return exchangeTradingSessionIdInt32NullOptional;
    }

    /**
     * TradSesStatus
     *
     * @return the TradSesStatus field
     */
    public TradSesStatusField tradSesStatus() {
        return tradSesStatus;
    }

    /**
     * MarketSegmentID
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * TradSesEvent
     *
     * @return the TradSesEvent field
     */
    public TradSesEventField tradSesEvent() {
        return tradSesEvent;
    }

    /**
     * TradePeriodID
     *
     * @return the TradePeriodId field
     */
    public TradePeriodIdField tradePeriodId() {
        return tradePeriodId;
    }

    /**
     * SettlSessBegin
     *
     * @return the SettlSessBegin field
     */
    public SettlSessBeginField settlSessBegin() {
        return settlSessBegin;
    }

    /**
     * ClrSessBegin
     *
     * @return the ClrSessBegin field
     */
    public ClrSessBeginField clrSessBegin() {
        return clrSessBegin;
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
        if (!tradSesOpenTime.parse(data, cursor)) {
            return false;
        }
        cursor += TradSesOpenTimeField.BYTE_LENGTH;
        if (!tradSesCloseTime.parse(data, cursor)) {
            return false;
        }
        cursor += TradSesCloseTimeField.BYTE_LENGTH;
        if (!tradingSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionIdField.BYTE_LENGTH;
        if (!exchangeTradingSessionIdInt32NullOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeTradingSessionIdInt32NullOptionalField.BYTE_LENGTH;
        if (!tradSesStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradSesStatusField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!tradSesEvent.parse(data, cursor)) {
            return false;
        }
        cursor += TradSesEventField.BYTE_LENGTH;
        if (!tradePeriodId.parse(data, cursor)) {
            return false;
        }
        cursor += TradePeriodIdField.BYTE_LENGTH;
        if (!settlSessBegin.parse(data, cursor)) {
            return false;
        }
        cursor += SettlSessBeginField.BYTE_LENGTH;
        return clrSessBegin.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tradSesOpenTime.encode(data, cursor);
        cursor = tradSesCloseTime.encode(data, cursor);
        cursor = tradingSessionId.encode(data, cursor);
        cursor = exchangeTradingSessionIdInt32NullOptional.encode(data, cursor);
        cursor = tradSesStatus.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = tradSesEvent.encode(data, cursor);
        cursor = tradePeriodId.encode(data, cursor);
        cursor = settlSessBegin.encode(data, cursor);
        cursor = clrSessBegin.encode(data, cursor);
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
            case "TradSesOpenTime" -> Optional.of(tradSesOpenTime);
            case "TradSesCloseTime" -> Optional.of(tradSesCloseTime);
            case "TradingSessionId" -> Optional.of(tradingSessionId);
            case "ExchangeTradingSessionIdInt32NullOptional" -> Optional.of(exchangeTradingSessionIdInt32NullOptional);
            case "TradSesStatus" -> Optional.of(tradSesStatus);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "TradSesEvent" -> Optional.of(tradSesEvent);
            case "TradePeriodId" -> Optional.of(tradePeriodId);
            case "SettlSessBegin" -> Optional.of(settlSessBegin);
            case "ClrSessBegin" -> Optional.of(clrSessBegin);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradingSessionStatusMessage message)) {
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
        if (!(other instanceof TradingSessionStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
