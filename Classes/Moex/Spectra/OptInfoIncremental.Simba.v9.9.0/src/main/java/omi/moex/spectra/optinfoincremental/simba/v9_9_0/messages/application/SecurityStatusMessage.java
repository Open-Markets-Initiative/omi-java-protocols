package omi.moex.spectra.optinfoincremental.simba.v9_9_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.HighLimitPxField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.HighLimitPxWeekendField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.InitialMarginOnBuyField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.InitialMarginOnSellField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.InitialMarginSynteticField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.LowLimitPxField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.LowLimitPxWeekendField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.SecurityIdField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.SecurityTradingStatusField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.SymbolField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.types.Field;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.types.Message;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.types.PrintOptions;

/**
 * Represents the SecurityStatusMessage message from the OptInfoIncremental protocol.
 *
 * <p>SecurityStatusMessage</p>
 */
public final class SecurityStatusMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 86;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Status Message";

    /**
     * SecurityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * SecurityTradingStatus
     */
    private final SecurityTradingStatusField securityTradingStatus = new SecurityTradingStatusField();

    /**
     * HighLimitPx
     */
    private final HighLimitPxField highLimitPx = new HighLimitPxField();

    /**
     * LowLimitPx
     */
    private final LowLimitPxField lowLimitPx = new LowLimitPxField();

    /**
     * InitialMarginOnBuy
     */
    private final InitialMarginOnBuyField initialMarginOnBuy = new InitialMarginOnBuyField();

    /**
     * InitialMarginOnSell
     */
    private final InitialMarginOnSellField initialMarginOnSell = new InitialMarginOnSellField();

    /**
     * InitialMarginSyntetic
     */
    private final InitialMarginSynteticField initialMarginSyntetic = new InitialMarginSynteticField();

    /**
     * HighLimitPxWeekend
     */
    private final HighLimitPxWeekendField highLimitPxWeekend = new HighLimitPxWeekendField();

    /**
     * LowLimitPxWeekend
     */
    private final LowLimitPxWeekendField lowLimitPxWeekend = new LowLimitPxWeekendField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, symbol, securityTradingStatus, highLimitPx, lowLimitPx, initialMarginOnBuy, initialMarginOnSell, initialMarginSyntetic, highLimitPxWeekend, lowLimitPxWeekend);

    private byte[] buffer;

    private boolean decoded;

    /**
     * SecurityID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * SecurityTradingStatus
     *
     * @return the SecurityTradingStatus field
     */
    public SecurityTradingStatusField securityTradingStatus() {
        return securityTradingStatus;
    }

    /**
     * HighLimitPx
     *
     * @return the HighLimitPx field
     */
    public HighLimitPxField highLimitPx() {
        return highLimitPx;
    }

    /**
     * LowLimitPx
     *
     * @return the LowLimitPx field
     */
    public LowLimitPxField lowLimitPx() {
        return lowLimitPx;
    }

    /**
     * InitialMarginOnBuy
     *
     * @return the InitialMarginOnBuy field
     */
    public InitialMarginOnBuyField initialMarginOnBuy() {
        return initialMarginOnBuy;
    }

    /**
     * InitialMarginOnSell
     *
     * @return the InitialMarginOnSell field
     */
    public InitialMarginOnSellField initialMarginOnSell() {
        return initialMarginOnSell;
    }

    /**
     * InitialMarginSyntetic
     *
     * @return the InitialMarginSyntetic field
     */
    public InitialMarginSynteticField initialMarginSyntetic() {
        return initialMarginSyntetic;
    }

    /**
     * HighLimitPxWeekend
     *
     * @return the HighLimitPxWeekend field
     */
    public HighLimitPxWeekendField highLimitPxWeekend() {
        return highLimitPxWeekend;
    }

    /**
     * LowLimitPxWeekend
     *
     * @return the LowLimitPxWeekend field
     */
    public LowLimitPxWeekendField lowLimitPxWeekend() {
        return lowLimitPxWeekend;
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!securityTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingStatusField.BYTE_LENGTH;
        if (!highLimitPx.parse(data, cursor)) {
            return false;
        }
        cursor += HighLimitPxField.BYTE_LENGTH;
        if (!lowLimitPx.parse(data, cursor)) {
            return false;
        }
        cursor += LowLimitPxField.BYTE_LENGTH;
        if (!initialMarginOnBuy.parse(data, cursor)) {
            return false;
        }
        cursor += InitialMarginOnBuyField.BYTE_LENGTH;
        if (!initialMarginOnSell.parse(data, cursor)) {
            return false;
        }
        cursor += InitialMarginOnSellField.BYTE_LENGTH;
        if (!initialMarginSyntetic.parse(data, cursor)) {
            return false;
        }
        cursor += InitialMarginSynteticField.BYTE_LENGTH;
        if (!highLimitPxWeekend.parse(data, cursor)) {
            return false;
        }
        cursor += HighLimitPxWeekendField.BYTE_LENGTH;
        return lowLimitPxWeekend.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = securityTradingStatus.encode(data, cursor);
        cursor = highLimitPx.encode(data, cursor);
        cursor = lowLimitPx.encode(data, cursor);
        cursor = initialMarginOnBuy.encode(data, cursor);
        cursor = initialMarginOnSell.encode(data, cursor);
        cursor = initialMarginSyntetic.encode(data, cursor);
        cursor = highLimitPxWeekend.encode(data, cursor);
        cursor = lowLimitPxWeekend.encode(data, cursor);
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
            case "SecurityId" -> Optional.of(securityId);
            case "Symbol" -> Optional.of(symbol);
            case "SecurityTradingStatus" -> Optional.of(securityTradingStatus);
            case "HighLimitPx" -> Optional.of(highLimitPx);
            case "LowLimitPx" -> Optional.of(lowLimitPx);
            case "InitialMarginOnBuy" -> Optional.of(initialMarginOnBuy);
            case "InitialMarginOnSell" -> Optional.of(initialMarginOnSell);
            case "InitialMarginSyntetic" -> Optional.of(initialMarginSyntetic);
            case "HighLimitPxWeekend" -> Optional.of(highLimitPxWeekend);
            case "LowLimitPxWeekend" -> Optional.of(lowLimitPxWeekend);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityStatusMessage message)) {
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
        if (!(other instanceof SecurityStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
