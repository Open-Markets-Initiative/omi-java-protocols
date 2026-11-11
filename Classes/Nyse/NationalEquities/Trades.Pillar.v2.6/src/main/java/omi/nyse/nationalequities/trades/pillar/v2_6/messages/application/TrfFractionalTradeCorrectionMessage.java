package omi.nyse.nationalequities.trades.pillar.v2_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nationalequities.trades.pillar.v2_6.fields.ExecDayTimeField;
import omi.nyse.nationalequities.trades.pillar.v2_6.fields.ExecDayTimeNsField;
import omi.nyse.nationalequities.trades.pillar.v2_6.fields.FractionalVolumeField;
import omi.nyse.nationalequities.trades.pillar.v2_6.fields.OriginalTradeIdField;
import omi.nyse.nationalequities.trades.pillar.v2_6.fields.PriceField;
import omi.nyse.nationalequities.trades.pillar.v2_6.fields.SourceTimeField;
import omi.nyse.nationalequities.trades.pillar.v2_6.fields.SourceTimeNsField;
import omi.nyse.nationalequities.trades.pillar.v2_6.fields.SymbolIndexField;
import omi.nyse.nationalequities.trades.pillar.v2_6.fields.SymbolSeqNumField;
import omi.nyse.nationalequities.trades.pillar.v2_6.fields.TradeCond1Field;
import omi.nyse.nationalequities.trades.pillar.v2_6.fields.TradeCond2Field;
import omi.nyse.nationalequities.trades.pillar.v2_6.fields.TradeCond3Field;
import omi.nyse.nationalequities.trades.pillar.v2_6.fields.TradeCond4Field;
import omi.nyse.nationalequities.trades.pillar.v2_6.fields.TradeIdField;
import omi.nyse.nationalequities.trades.pillar.v2_6.types.Field;
import omi.nyse.nationalequities.trades.pillar.v2_6.types.Message;
import omi.nyse.nationalequities.trades.pillar.v2_6.types.PrintOptions;

/**
 * Represents the TrfFractionalTradeCorrectionMessage message from the Trades protocol.
 *
 * <p>TRF Fractional Trade Correction Message. New message effective 1/12/26.</p>
 */
public final class TrfFractionalTradeCorrectionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 48;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trf Fractional Trade Correction Message";

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * The nanosecond offset from the Source Time
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * The ID of the symbol in the Symbol Index message
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * The symbol sequence number.
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * The original TradeID of the Trade being cancelled.
     */
    private final OriginalTradeIdField originalTradeId = new OriginalTradeIdField();

    /**
     * Unique identifier for this trade.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * The price of the Trade. Use the Price scale from the Symbol Index Mapping message.
     */
    private final PriceField price = new PriceField();

    /**
     * The volume of the trade in shares, inclusive of any fractional quantity. Implied scale is 6.
     */
    private final FractionalVolumeField fractionalVolume = new FractionalVolumeField();

    /**
     * Settlement related conditions.
     */
    private final TradeCond1Field tradeCond1 = new TradeCond1Field();

    /**
     * The reason for Trade Through Exemptions.
     */
    private final TradeCond2Field tradeCond2 = new TradeCond2Field();

    /**
     * Extended hours/sequencing related conditions.
     */
    private final TradeCond3Field tradeCond3 = new TradeCond3Field();

    /**
     * SRO Required Detail.
     */
    private final TradeCond4Field tradeCond4 = new TradeCond4Field();

    /**
     * The date and time when this Trade occurred at the participant firm, in seconds since Jan 1, 1970 00:00:00 UTC.
     */
    private final ExecDayTimeField execDayTime = new ExecDayTimeField();

    /**
     * The nanosecond offset from the ExecutionDayTime.
     */
    private final ExecDayTimeNsField execDayTimeNs = new ExecDayTimeNsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceTimeNs, symbolIndex, symbolSeqNum, originalTradeId, tradeId, price, fractionalVolume, tradeCond1, tradeCond2, tradeCond3, tradeCond4, execDayTime, execDayTimeNs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time when this msg was generated in the order book, in seconds since Jan 1, 1970 00:00:00 UTC.
     *
     * @return the SourceTime field
     */
    public SourceTimeField sourceTime() {
        return sourceTime;
    }

    /**
     * The nanosecond offset from the Source Time
     *
     * @return the SourceTimeNs field
     */
    public SourceTimeNsField sourceTimeNs() {
        return sourceTimeNs;
    }

    /**
     * The ID of the symbol in the Symbol Index message
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * The symbol sequence number.
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * The original TradeID of the Trade being cancelled.
     *
     * @return the OriginalTradeId field
     */
    public OriginalTradeIdField originalTradeId() {
        return originalTradeId;
    }

    /**
     * Unique identifier for this trade.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * The price of the Trade. Use the Price scale from the Symbol Index Mapping message.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The volume of the trade in shares, inclusive of any fractional quantity. Implied scale is 6.
     *
     * @return the FractionalVolume field
     */
    public FractionalVolumeField fractionalVolume() {
        return fractionalVolume;
    }

    /**
     * Settlement related conditions.
     *
     * @return the TradeCond1 field
     */
    public TradeCond1Field tradeCond1() {
        return tradeCond1;
    }

    /**
     * The reason for Trade Through Exemptions.
     *
     * @return the TradeCond2 field
     */
    public TradeCond2Field tradeCond2() {
        return tradeCond2;
    }

    /**
     * Extended hours/sequencing related conditions.
     *
     * @return the TradeCond3 field
     */
    public TradeCond3Field tradeCond3() {
        return tradeCond3;
    }

    /**
     * SRO Required Detail.
     *
     * @return the TradeCond4 field
     */
    public TradeCond4Field tradeCond4() {
        return tradeCond4;
    }

    /**
     * The date and time when this Trade occurred at the participant firm, in seconds since Jan 1, 1970 00:00:00 UTC.
     *
     * @return the ExecDayTime field
     */
    public ExecDayTimeField execDayTime() {
        return execDayTime;
    }

    /**
     * The nanosecond offset from the ExecutionDayTime.
     *
     * @return the ExecDayTimeNs field
     */
    public ExecDayTimeNsField execDayTimeNs() {
        return execDayTimeNs;
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
        if (!sourceTime.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeField.BYTE_LENGTH;
        if (!sourceTimeNs.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeNsField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!symbolSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolSeqNumField.BYTE_LENGTH;
        if (!originalTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!fractionalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += FractionalVolumeField.BYTE_LENGTH;
        if (!tradeCond1.parse(data, cursor)) {
            return false;
        }
        cursor += TradeCond1Field.BYTE_LENGTH;
        if (!tradeCond2.parse(data, cursor)) {
            return false;
        }
        cursor += TradeCond2Field.BYTE_LENGTH;
        if (!tradeCond3.parse(data, cursor)) {
            return false;
        }
        cursor += TradeCond3Field.BYTE_LENGTH;
        if (!tradeCond4.parse(data, cursor)) {
            return false;
        }
        cursor += TradeCond4Field.BYTE_LENGTH;
        if (!execDayTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExecDayTimeField.BYTE_LENGTH;
        return execDayTimeNs.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceTime.encode(data, cursor);
        cursor = sourceTimeNs.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = symbolSeqNum.encode(data, cursor);
        cursor = originalTradeId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = fractionalVolume.encode(data, cursor);
        cursor = tradeCond1.encode(data, cursor);
        cursor = tradeCond2.encode(data, cursor);
        cursor = tradeCond3.encode(data, cursor);
        cursor = tradeCond4.encode(data, cursor);
        cursor = execDayTime.encode(data, cursor);
        cursor = execDayTimeNs.encode(data, cursor);
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
            case "SourceTime" -> Optional.of(sourceTime);
            case "SourceTimeNs" -> Optional.of(sourceTimeNs);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "SymbolSeqNum" -> Optional.of(symbolSeqNum);
            case "OriginalTradeId" -> Optional.of(originalTradeId);
            case "TradeId" -> Optional.of(tradeId);
            case "Price" -> Optional.of(price);
            case "FractionalVolume" -> Optional.of(fractionalVolume);
            case "TradeCond1" -> Optional.of(tradeCond1);
            case "TradeCond2" -> Optional.of(tradeCond2);
            case "TradeCond3" -> Optional.of(tradeCond3);
            case "TradeCond4" -> Optional.of(tradeCond4);
            case "ExecDayTime" -> Optional.of(execDayTime);
            case "ExecDayTimeNs" -> Optional.of(execDayTimeNs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TrfFractionalTradeCorrectionMessage message)) {
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
        if (!(other instanceof TrfFractionalTradeCorrectionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
