package omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.fields.BatsTradeTimingIndicatorField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.fields.CurrencyField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.fields.ExecutionVenueField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.fields.PriceLongField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.fields.SharesExtendedField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.fields.SymbolShortField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.fields.TimeOffsetField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.fields.TradeIdField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.fields.TradeTimestampField;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.structs.ExtendedTradeFlags;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.types.Field;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.types.Message;
import omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.types.PrintOptions;

/**
 * Represents the TradeExtendedMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>Trade — Extended</p>
 */
public final class TradeExtendedMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 66;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Extended Message";

    /**
     * Nanosecond offset from last unit timestamp
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Number of shares executed
     */
    private final SharesExtendedField sharesExtended = new SharesExtendedField();

    /**
     * Symbol right padded with spaces
     */
    private final SymbolShortField symbolShort = new SymbolShortField();

    /**
     * The limit order price
     */
    private final PriceLongField priceLong = new PriceLongField();

    /**
     * Bats generated identifier of this trade. This identifier is guaranteed to be unique for at least 7 calendar days.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Date/Time on which the trade occurred, encoded as the number of nanoseconds since the January 1st 1970 UTC (also known as the Unix epoch).
     */
    private final TradeTimestampField tradeTimestamp = new TradeTimestampField();

    /**
     * The venue on which the trade executed, when applicable. This will contain the MIC representing the venue on which the trade occurred, where applicable. e.g. for Bats NT trades, this shall be BATE or CHIX as applicable. This will contain SINT if the trade occurred on a Systematic Internaliser or XOFF if OTC. Bats LIS trades have the value LISX.
     */
    private final ExecutionVenueField executionVenue = new ExecutionVenueField();

    /**
     * Traded currency.
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * ‘1’ The trade was reported to Bats ‘late’, ‘2’ The trade was reported to Bats out of the Main Session, ‘3’The trade was reported to Bats late and out of the Main Session ‘-’ otherwise. NOTE:2and3are not valid values on the Trade Reporting Facility.
     */
    private final BatsTradeTimingIndicatorField batsTradeTimingIndicator = new BatsTradeTimingIndicatorField();

    /**
     * Extended Trade Flags
     */
    private final ExtendedTradeFlags extendedTradeFlags = new ExtendedTradeFlags();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(timeOffset), List.<Field>of(sharesExtended), List.<Field>of(symbolShort), List.<Field>of(priceLong), List.<Field>of(tradeId), List.<Field>of(tradeTimestamp), List.<Field>of(executionVenue), List.<Field>of(currency), List.<Field>of(batsTradeTimingIndicator), extendedTradeFlags.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Number of shares executed
     *
     * @return the SharesExtended field
     */
    public SharesExtendedField sharesExtended() {
        return sharesExtended;
    }

    /**
     * Symbol right padded with spaces
     *
     * @return the SymbolShort field
     */
    public SymbolShortField symbolShort() {
        return symbolShort;
    }

    /**
     * The limit order price
     *
     * @return the PriceLong field
     */
    public PriceLongField priceLong() {
        return priceLong;
    }

    /**
     * Bats generated identifier of this trade. This identifier is guaranteed to be unique for at least 7 calendar days.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Date/Time on which the trade occurred, encoded as the number of nanoseconds since the January 1st 1970 UTC (also known as the Unix epoch).
     *
     * @return the TradeTimestamp field
     */
    public TradeTimestampField tradeTimestamp() {
        return tradeTimestamp;
    }

    /**
     * The venue on which the trade executed, when applicable. This will contain the MIC representing the venue on which the trade occurred, where applicable. e.g. for Bats NT trades, this shall be BATE or CHIX as applicable. This will contain SINT if the trade occurred on a Systematic Internaliser or XOFF if OTC. Bats LIS trades have the value LISX.
     *
     * @return the ExecutionVenue field
     */
    public ExecutionVenueField executionVenue() {
        return executionVenue;
    }

    /**
     * Traded currency.
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * ‘1’ The trade was reported to Bats ‘late’, ‘2’ The trade was reported to Bats out of the Main Session, ‘3’The trade was reported to Bats late and out of the Main Session ‘-’ otherwise. NOTE:2and3are not valid values on the Trade Reporting Facility.
     *
     * @return the BatsTradeTimingIndicator field
     */
    public BatsTradeTimingIndicatorField batsTradeTimingIndicator() {
        return batsTradeTimingIndicator;
    }

    /**
     * Extended Trade Flags
     *
     * @return the ExtendedTradeFlags record
     */
    public ExtendedTradeFlags extendedTradeFlags() {
        return extendedTradeFlags;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!sharesExtended.parse(data, cursor)) {
            return false;
        }
        cursor += SharesExtendedField.BYTE_LENGTH;
        if (!symbolShort.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolShortField.BYTE_LENGTH;
        if (!priceLong.parse(data, cursor)) {
            return false;
        }
        cursor += PriceLongField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!tradeTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTimestampField.BYTE_LENGTH;
        if (!executionVenue.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionVenueField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!batsTradeTimingIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BatsTradeTimingIndicatorField.BYTE_LENGTH;
        return extendedTradeFlags.parseFrom(data, cursor, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = sharesExtended.encode(data, cursor);
        cursor = symbolShort.encode(data, cursor);
        cursor = priceLong.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = tradeTimestamp.encode(data, cursor);
        cursor = executionVenue.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = batsTradeTimingIndicator.encode(data, cursor);
        cursor = extendedTradeFlags.encode(data, cursor);
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
        extendedTradeFlags.clear();
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "SharesExtended" -> Optional.of(sharesExtended);
            case "SymbolShort" -> Optional.of(symbolShort);
            case "PriceLong" -> Optional.of(priceLong);
            case "TradeId" -> Optional.of(tradeId);
            case "TradeTimestamp" -> Optional.of(tradeTimestamp);
            case "ExecutionVenue" -> Optional.of(executionVenue);
            case "Currency" -> Optional.of(currency);
            case "BatsTradeTimingIndicator" -> Optional.of(batsTradeTimingIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeExtendedMessage message)) {
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
        if (!(other instanceof TradeExtendedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
