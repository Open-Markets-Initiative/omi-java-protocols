package omi.cboe.edgxequities.top.asciipitch.v1_3_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.fields.AskPriceLongField;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.fields.AskQuantityLongField;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.fields.BidPriceLongField;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.fields.BidQuantityLongField;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.fields.CumulativeVolumeLongField;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.fields.HaltStatusField;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.fields.LastTradeDayIndicatorField;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.fields.LastTradePriceShortField;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.fields.LastTradeSizeField;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.fields.LastTradeTimeField;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.fields.RegShoActionField;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.fields.ReservedField;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.fields.SymbolExtendedField;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.fields.TimestampField;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.types.Field;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.types.Message;
import omi.cboe.edgxequities.top.asciipitch.v1_3_10.types.PrintOptions;

/**
 * Represents the ExpandedSpinMessage message from the Top protocol.
 *
 * <p>Expanded Spin Message</p>
 */
public final class ExpandedSpinMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 's';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 85;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Expanded Spin Message";

    /**
     * Time of top of book update; milliseconds since midnight, Eastern time
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Symbol
     */
    private final SymbolExtendedField symbolExtended = new SymbolExtendedField();

    /**
     * Bid price; 0 if no bids
     */
    private final BidPriceLongField bidPriceLong = new BidPriceLongField();

    /**
     * Bid quantity; 0 if no bids
     */
    private final BidQuantityLongField bidQuantityLong = new BidQuantityLongField();

    /**
     * Ask price; 0 if no offers
     */
    private final AskPriceLongField askPriceLong = new AskPriceLongField();

    /**
     * Ask quantity; 0 if no offers
     */
    private final AskQuantityLongField askQuantityLong = new AskQuantityLongField();

    /**
     * Time of last trade; milliseconds since midnight, Eastern time
     */
    private final LastTradeTimeField lastTradeTime = new LastTradeTimeField();

    /**
     * Last trade price; 0 if no trades
     */
    private final LastTradePriceShortField lastTradePriceShort = new LastTradePriceShortField();

    /**
     * Last trade size; 0 if no trades
     */
    private final LastTradeSizeField lastTradeSize = new LastTradeSizeField();

    /**
     * Cumulative volume executed today; 0 if no trades
     */
    private final CumulativeVolumeLongField cumulativeVolumeLong = new CumulativeVolumeLongField();

    /**
     * Halt Status
     */
    private final HaltStatusField haltStatus = new HaltStatusField();

    /**
     * Reg SHO Action
     */
    private final RegShoActionField regShoAction = new RegShoActionField();

    /**
     * Effective 11/02/26. Always 0 for BYX/EDGA.
     */
    private final LastTradeDayIndicatorField lastTradeDayIndicator = new LastTradeDayIndicatorField();

    /**
     * Reserved
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, symbolExtended, bidPriceLong, bidQuantityLong, askPriceLong, askQuantityLong, lastTradeTime, lastTradePriceShort, lastTradeSize, cumulativeVolumeLong, haltStatus, regShoAction, lastTradeDayIndicator, reserved);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time of top of book update; milliseconds since midnight, Eastern time
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Symbol
     *
     * @return the SymbolExtended field
     */
    public SymbolExtendedField symbolExtended() {
        return symbolExtended;
    }

    /**
     * Bid price; 0 if no bids
     *
     * @return the BidPriceLong field
     */
    public BidPriceLongField bidPriceLong() {
        return bidPriceLong;
    }

    /**
     * Bid quantity; 0 if no bids
     *
     * @return the BidQuantityLong field
     */
    public BidQuantityLongField bidQuantityLong() {
        return bidQuantityLong;
    }

    /**
     * Ask price; 0 if no offers
     *
     * @return the AskPriceLong field
     */
    public AskPriceLongField askPriceLong() {
        return askPriceLong;
    }

    /**
     * Ask quantity; 0 if no offers
     *
     * @return the AskQuantityLong field
     */
    public AskQuantityLongField askQuantityLong() {
        return askQuantityLong;
    }

    /**
     * Time of last trade; milliseconds since midnight, Eastern time
     *
     * @return the LastTradeTime field
     */
    public LastTradeTimeField lastTradeTime() {
        return lastTradeTime;
    }

    /**
     * Last trade price; 0 if no trades
     *
     * @return the LastTradePriceShort field
     */
    public LastTradePriceShortField lastTradePriceShort() {
        return lastTradePriceShort;
    }

    /**
     * Last trade size; 0 if no trades
     *
     * @return the LastTradeSize field
     */
    public LastTradeSizeField lastTradeSize() {
        return lastTradeSize;
    }

    /**
     * Cumulative volume executed today; 0 if no trades
     *
     * @return the CumulativeVolumeLong field
     */
    public CumulativeVolumeLongField cumulativeVolumeLong() {
        return cumulativeVolumeLong;
    }

    /**
     * Halt Status
     *
     * @return the HaltStatus field
     */
    public HaltStatusField haltStatus() {
        return haltStatus;
    }

    /**
     * Reg SHO Action
     *
     * @return the RegShoAction field
     */
    public RegShoActionField regShoAction() {
        return regShoAction;
    }

    /**
     * Effective 11/02/26. Always 0 for BYX/EDGA.
     *
     * @return the LastTradeDayIndicator field
     */
    public LastTradeDayIndicatorField lastTradeDayIndicator() {
        return lastTradeDayIndicator;
    }

    /**
     * Reserved
     *
     * @return the Reserved field
     */
    public ReservedField reserved() {
        return reserved;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!symbolExtended.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolExtendedField.BYTE_LENGTH;
        if (!bidPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceLongField.BYTE_LENGTH;
        if (!bidQuantityLong.parse(data, cursor)) {
            return false;
        }
        cursor += BidQuantityLongField.BYTE_LENGTH;
        if (!askPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceLongField.BYTE_LENGTH;
        if (!askQuantityLong.parse(data, cursor)) {
            return false;
        }
        cursor += AskQuantityLongField.BYTE_LENGTH;
        if (!lastTradeTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeTimeField.BYTE_LENGTH;
        if (!lastTradePriceShort.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradePriceShortField.BYTE_LENGTH;
        if (!lastTradeSize.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeSizeField.BYTE_LENGTH;
        if (!cumulativeVolumeLong.parse(data, cursor)) {
            return false;
        }
        cursor += CumulativeVolumeLongField.BYTE_LENGTH;
        if (!haltStatus.parse(data, cursor)) {
            return false;
        }
        cursor += HaltStatusField.BYTE_LENGTH;
        if (!regShoAction.parse(data, cursor)) {
            return false;
        }
        cursor += RegShoActionField.BYTE_LENGTH;
        if (!lastTradeDayIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeDayIndicatorField.BYTE_LENGTH;
        return reserved.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = symbolExtended.encode(data, cursor);
        cursor = bidPriceLong.encode(data, cursor);
        cursor = bidQuantityLong.encode(data, cursor);
        cursor = askPriceLong.encode(data, cursor);
        cursor = askQuantityLong.encode(data, cursor);
        cursor = lastTradeTime.encode(data, cursor);
        cursor = lastTradePriceShort.encode(data, cursor);
        cursor = lastTradeSize.encode(data, cursor);
        cursor = cumulativeVolumeLong.encode(data, cursor);
        cursor = haltStatus.encode(data, cursor);
        cursor = regShoAction.encode(data, cursor);
        cursor = lastTradeDayIndicator.encode(data, cursor);
        cursor = reserved.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "SymbolExtended" -> Optional.of(symbolExtended);
            case "BidPriceLong" -> Optional.of(bidPriceLong);
            case "BidQuantityLong" -> Optional.of(bidQuantityLong);
            case "AskPriceLong" -> Optional.of(askPriceLong);
            case "AskQuantityLong" -> Optional.of(askQuantityLong);
            case "LastTradeTime" -> Optional.of(lastTradeTime);
            case "LastTradePriceShort" -> Optional.of(lastTradePriceShort);
            case "LastTradeSize" -> Optional.of(lastTradeSize);
            case "CumulativeVolumeLong" -> Optional.of(cumulativeVolumeLong);
            case "HaltStatus" -> Optional.of(haltStatus);
            case "RegShoAction" -> Optional.of(regShoAction);
            case "LastTradeDayIndicator" -> Optional.of(lastTradeDayIndicator);
            case "Reserved" -> Optional.of(reserved);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExpandedSpinMessage message)) {
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
        if (!(other instanceof ExpandedSpinMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
