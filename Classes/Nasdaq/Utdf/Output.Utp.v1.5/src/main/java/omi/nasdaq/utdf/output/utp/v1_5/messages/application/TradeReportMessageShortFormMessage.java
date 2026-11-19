package omi.nasdaq.utdf.output.utp.v1_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.utdf.output.utp.v1_5.fields.ConsolidatedPriceChangeIndicatorField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.FinraTimestampField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.ParticipantPriceChangeIndicatorField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.SymbolShortField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.TradeIdField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.TradePriceShortField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.TradeThroughExemptFlagField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.TradeVolumeShortField;
import omi.nasdaq.utdf.output.utp.v1_5.structs.MessageInfo;
import omi.nasdaq.utdf.output.utp.v1_5.structs.SaleCondition;
import omi.nasdaq.utdf.output.utp.v1_5.types.Field;
import omi.nasdaq.utdf.output.utp.v1_5.types.Message;
import omi.nasdaq.utdf.output.utp.v1_5.types.PrintOptions;

/**
 * Represents the TradeReportMessageShortFormMessage message from the Output protocol.
 *
 * <p>Used to disseminate Trade Reports</p>
 */
public final class TradeReportMessageShortFormMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'A';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 58;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Report Message Short Form Message";

    /**
     * FINRA Timestamp
     */
    private final FinraTimestampField finraTimestamp = new FinraTimestampField();

    /**
     * Security Identifier
     */
    private final SymbolShortField symbolShort = new SymbolShortField();

    /**
     * Trade Id
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Trade Price Short
     */
    private final TradePriceShortField tradePriceShort = new TradePriceShortField();

    /**
     * Trade Volume Short
     */
    private final TradeVolumeShortField tradeVolumeShort = new TradeVolumeShortField();

    /**
     * Trade Through Exempt Flag
     */
    private final TradeThroughExemptFlagField tradeThroughExemptFlag = new TradeThroughExemptFlagField();

    /**
     * Consolidated Price Change Indicator
     */
    private final ConsolidatedPriceChangeIndicatorField consolidatedPriceChangeIndicator = new ConsolidatedPriceChangeIndicatorField();

    /**
     * Participant Price Change Indicator
     */
    private final ParticipantPriceChangeIndicatorField participantPriceChangeIndicator = new ParticipantPriceChangeIndicatorField();

    /**
     * Message Info
     */
    private final MessageInfo messageInfo = new MessageInfo();

    /**
     * Sale Condition
     */
    private final SaleCondition saleCondition = new SaleCondition();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(messageInfo.fields(), List.<Field>of(finraTimestamp), List.<Field>of(symbolShort), List.<Field>of(tradeId), List.<Field>of(tradePriceShort), List.<Field>of(tradeVolumeShort), saleCondition.fields(), List.<Field>of(tradeThroughExemptFlag), List.<Field>of(consolidatedPriceChangeIndicator), List.<Field>of(participantPriceChangeIndicator)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * FINRA Timestamp
     *
     * @return the FinraTimestamp field
     */
    public FinraTimestampField finraTimestamp() {
        return finraTimestamp;
    }

    /**
     * Security Identifier
     *
     * @return the SymbolShort field
     */
    public SymbolShortField symbolShort() {
        return symbolShort;
    }

    /**
     * Trade Id
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Trade Price Short
     *
     * @return the TradePriceShort field
     */
    public TradePriceShortField tradePriceShort() {
        return tradePriceShort;
    }

    /**
     * Trade Volume Short
     *
     * @return the TradeVolumeShort field
     */
    public TradeVolumeShortField tradeVolumeShort() {
        return tradeVolumeShort;
    }

    /**
     * Trade Through Exempt Flag
     *
     * @return the TradeThroughExemptFlag field
     */
    public TradeThroughExemptFlagField tradeThroughExemptFlag() {
        return tradeThroughExemptFlag;
    }

    /**
     * Consolidated Price Change Indicator
     *
     * @return the ConsolidatedPriceChangeIndicator field
     */
    public ConsolidatedPriceChangeIndicatorField consolidatedPriceChangeIndicator() {
        return consolidatedPriceChangeIndicator;
    }

    /**
     * Participant Price Change Indicator
     *
     * @return the ParticipantPriceChangeIndicator field
     */
    public ParticipantPriceChangeIndicatorField participantPriceChangeIndicator() {
        return participantPriceChangeIndicator;
    }

    /**
     * Message Info
     *
     * @return the MessageInfo record
     */
    public MessageInfo messageInfo() {
        return messageInfo;
    }

    /**
     * Sale Condition
     *
     * @return the SaleCondition record
     */
    public SaleCondition saleCondition() {
        return saleCondition;
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
        return Optional.ofNullable(messageInfo.sipTimestamp().value());
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
        if (!messageInfo.parseFrom(data, cursor, end - 32)) {
            return false;
        }
        cursor += messageInfo.byteLength();
        if (!finraTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += FinraTimestampField.BYTE_LENGTH;
        if (!symbolShort.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolShortField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!tradePriceShort.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceShortField.BYTE_LENGTH;
        if (!tradeVolumeShort.parse(data, cursor)) {
            return false;
        }
        cursor += TradeVolumeShortField.BYTE_LENGTH;
        if (!saleCondition.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += saleCondition.byteLength();
        if (!tradeThroughExemptFlag.parse(data, cursor)) {
            return false;
        }
        cursor += TradeThroughExemptFlagField.BYTE_LENGTH;
        if (!consolidatedPriceChangeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedPriceChangeIndicatorField.BYTE_LENGTH;
        return participantPriceChangeIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = messageInfo.encode(data, cursor);
        cursor = finraTimestamp.encode(data, cursor);
        cursor = symbolShort.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = tradePriceShort.encode(data, cursor);
        cursor = tradeVolumeShort.encode(data, cursor);
        cursor = saleCondition.encode(data, cursor);
        cursor = tradeThroughExemptFlag.encode(data, cursor);
        cursor = consolidatedPriceChangeIndicator.encode(data, cursor);
        cursor = participantPriceChangeIndicator.encode(data, cursor);
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
        messageInfo.clear();
        saleCondition.clear();
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
            case "FinraTimestamp" -> Optional.of(finraTimestamp);
            case "SymbolShort" -> Optional.of(symbolShort);
            case "TradeId" -> Optional.of(tradeId);
            case "TradePriceShort" -> Optional.of(tradePriceShort);
            case "TradeVolumeShort" -> Optional.of(tradeVolumeShort);
            case "TradeThroughExemptFlag" -> Optional.of(tradeThroughExemptFlag);
            case "ConsolidatedPriceChangeIndicator" -> Optional.of(consolidatedPriceChangeIndicator);
            case "ParticipantPriceChangeIndicator" -> Optional.of(participantPriceChangeIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeReportMessageShortFormMessage message)) {
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
        if (!(other instanceof TradeReportMessageShortFormMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
