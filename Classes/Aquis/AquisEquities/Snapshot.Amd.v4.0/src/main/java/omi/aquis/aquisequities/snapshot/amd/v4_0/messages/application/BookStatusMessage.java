package omi.aquis.aquisequities.snapshot.amd.v4_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.aquis.aquisequities.snapshot.amd.v4_0.fields.ClosingBuyQtyField;
import omi.aquis.aquisequities.snapshot.amd.v4_0.fields.ClosingSellQtyField;
import omi.aquis.aquisequities.snapshot.amd.v4_0.fields.EntriesField;
import omi.aquis.aquisequities.snapshot.amd.v4_0.fields.IndicativePriceField;
import omi.aquis.aquisequities.snapshot.amd.v4_0.fields.MarketFlagsField;
import omi.aquis.aquisequities.snapshot.amd.v4_0.fields.SecurityIdField;
import omi.aquis.aquisequities.snapshot.amd.v4_0.fields.TradingStatusField;
import omi.aquis.aquisequities.snapshot.amd.v4_0.types.Field;
import omi.aquis.aquisequities.snapshot.amd.v4_0.types.Message;
import omi.aquis.aquisequities.snapshot.amd.v4_0.types.PrintOptions;

/**
 * Represents the BookStatusMessage message from the Snapshot protocol.
 *
 * <p>A Book Status message is published to report the trading and market status of each security and the number of open orders on the order book for the security at the time of the snapshot.</p>
 */
public final class BookStatusMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u000B';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 22;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Book Status Message";

    /**
     * Numeric identifier of the relevant security
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Trading status of the security
     */
    private final TradingStatusField tradingStatus = new TradingStatusField();

    /**
     * Market status flags
     */
    private final MarketFlagsField marketFlags = new MarketFlagsField();

    /**
     * Number of open orders in the book for this security
     */
    private final EntriesField entries = new EntriesField();

    /**
     * Total order quantity on the buy side during the closing market
     */
    private final ClosingBuyQtyField closingBuyQty = new ClosingBuyQtyField();

    /**
     * Total order quantity on the sell side during the closing market
     */
    private final ClosingSellQtyField closingSellQty = new ClosingSellQtyField();

    /**
     * Indicative auction price
     */
    private final IndicativePriceField indicativePrice = new IndicativePriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, tradingStatus, marketFlags, entries, closingBuyQty, closingSellQty, indicativePrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Numeric identifier of the relevant security
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Trading status of the security
     *
     * @return the TradingStatus field
     */
    public TradingStatusField tradingStatus() {
        return tradingStatus;
    }

    /**
     * Market status flags
     *
     * @return the MarketFlags field
     */
    public MarketFlagsField marketFlags() {
        return marketFlags;
    }

    /**
     * Number of open orders in the book for this security
     *
     * @return the Entries field
     */
    public EntriesField entries() {
        return entries;
    }

    /**
     * Total order quantity on the buy side during the closing market
     *
     * @return the ClosingBuyQty field
     */
    public ClosingBuyQtyField closingBuyQty() {
        return closingBuyQty;
    }

    /**
     * Total order quantity on the sell side during the closing market
     *
     * @return the ClosingSellQty field
     */
    public ClosingSellQtyField closingSellQty() {
        return closingSellQty;
    }

    /**
     * Indicative auction price
     *
     * @return the IndicativePrice field
     */
    public IndicativePriceField indicativePrice() {
        return indicativePrice;
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!tradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStatusField.BYTE_LENGTH;
        if (!marketFlags.parse(data, cursor)) {
            return false;
        }
        cursor += MarketFlagsField.BYTE_LENGTH;
        if (!entries.parse(data, cursor)) {
            return false;
        }
        cursor += EntriesField.BYTE_LENGTH;
        if (!closingBuyQty.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingBuyQtyField.BYTE_LENGTH;
        if (!closingSellQty.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingSellQtyField.BYTE_LENGTH;
        return indicativePrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = tradingStatus.encode(data, cursor);
        cursor = marketFlags.encode(data, cursor);
        cursor = entries.encode(data, cursor);
        cursor = closingBuyQty.encode(data, cursor);
        cursor = closingSellQty.encode(data, cursor);
        cursor = indicativePrice.encode(data, cursor);
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
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "MarketFlags" -> Optional.of(marketFlags);
            case "Entries" -> Optional.of(entries);
            case "ClosingBuyQty" -> Optional.of(closingBuyQty);
            case "ClosingSellQty" -> Optional.of(closingSellQty);
            case "IndicativePrice" -> Optional.of(indicativePrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BookStatusMessage message)) {
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
        if (!(other instanceof BookStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
