package omi.otcmarkets.overnight.topofbook.link.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.otcmarkets.overnight.topofbook.link.v1_0.fields.CurrentInsideClosingPriceField;
import omi.otcmarkets.overnight.topofbook.link.v1_0.fields.CurrentInsideImbalanceQuantityField;
import omi.otcmarkets.overnight.topofbook.link.v1_0.fields.CurrentInsideImbalanceSideField;
import omi.otcmarkets.overnight.topofbook.link.v1_0.fields.CurrentInsidePairedSharesField;
import omi.otcmarkets.overnight.topofbook.link.v1_0.fields.FullClosingPriceField;
import omi.otcmarkets.overnight.topofbook.link.v1_0.fields.MocSharesUnmatchedField;
import omi.otcmarkets.overnight.topofbook.link.v1_0.fields.OcioOnlyClosingPriceField;
import omi.otcmarkets.overnight.topofbook.link.v1_0.fields.SymbolField;
import omi.otcmarkets.overnight.topofbook.link.v1_0.fields.TimeField;
import omi.otcmarkets.overnight.topofbook.link.v1_0.types.Field;
import omi.otcmarkets.overnight.topofbook.link.v1_0.types.Message;
import omi.otcmarkets.overnight.topofbook.link.v1_0.types.PrintOptions;

/**
 * Represents the ImbalanceMessage message from the TopOfBook protocol.
 *
 * <p>This message appears on all channels. This message is not available in the Overnight TradingSession.</p>
 */
public final class ImbalanceMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u001C';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 52;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Imbalance Message";

    /**
     * Milliseconds from midnight.
     */
    private final TimeField time = new TimeField();

    /**
     * Ticker symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Number of OC and IO shares that would be matched at the Current Inside Closing Price.
     */
    private final CurrentInsidePairedSharesField currentInsidePairedShares = new CurrentInsidePairedSharesField();

    /**
     * The calculated closing price without Day / extended Day orders, bounded by the inside. The long value represents the price scaled by 1,000,000 (6 decimal places).
     */
    private final CurrentInsideClosingPriceField currentInsideClosingPrice = new CurrentInsideClosingPriceField();

    /**
     * Number of marketable OC and IO shares that would be left unmatched at the Current Inside Closing Price.
     */
    private final CurrentInsideImbalanceQuantityField currentInsideImbalanceQuantity = new CurrentInsideImbalanceQuantityField();

    /**
     * Buy or sell side of the Current Inside Imbalance Quantity.
     */
    private final CurrentInsideImbalanceSideField currentInsideImbalanceSide = new CurrentInsideImbalanceSideField();

    /**
     * The calculated closing price. The long value represents the price scaled by 1,000,000 (6 decimal places).
     */
    private final FullClosingPriceField fullClosingPrice = new FullClosingPriceField();

    /**
     * The calculated closing price without Day / extended Day orders. The long value represents the price scaled by 1,000,000 (6 decimal places).
     */
    private final OcioOnlyClosingPriceField ocioOnlyClosingPrice = new OcioOnlyClosingPriceField();

    /**
     * Indicates if any MOC shares are left unmatched.
     */
    private final MocSharesUnmatchedField mocSharesUnmatched = new MocSharesUnmatchedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(time, symbol, currentInsidePairedShares, currentInsideClosingPrice, currentInsideImbalanceQuantity, currentInsideImbalanceSide, fullClosingPrice, ocioOnlyClosingPrice, mocSharesUnmatched);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Milliseconds from midnight.
     *
     * @return the Time field
     */
    public TimeField time() {
        return time;
    }

    /**
     * Ticker symbol.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Number of OC and IO shares that would be matched at the Current Inside Closing Price.
     *
     * @return the CurrentInsidePairedShares field
     */
    public CurrentInsidePairedSharesField currentInsidePairedShares() {
        return currentInsidePairedShares;
    }

    /**
     * The calculated closing price without Day / extended Day orders, bounded by the inside. The long value represents the price scaled by 1,000,000 (6 decimal places).
     *
     * @return the CurrentInsideClosingPrice field
     */
    public CurrentInsideClosingPriceField currentInsideClosingPrice() {
        return currentInsideClosingPrice;
    }

    /**
     * Number of marketable OC and IO shares that would be left unmatched at the Current Inside Closing Price.
     *
     * @return the CurrentInsideImbalanceQuantity field
     */
    public CurrentInsideImbalanceQuantityField currentInsideImbalanceQuantity() {
        return currentInsideImbalanceQuantity;
    }

    /**
     * Buy or sell side of the Current Inside Imbalance Quantity.
     *
     * @return the CurrentInsideImbalanceSide field
     */
    public CurrentInsideImbalanceSideField currentInsideImbalanceSide() {
        return currentInsideImbalanceSide;
    }

    /**
     * The calculated closing price. The long value represents the price scaled by 1,000,000 (6 decimal places).
     *
     * @return the FullClosingPrice field
     */
    public FullClosingPriceField fullClosingPrice() {
        return fullClosingPrice;
    }

    /**
     * The calculated closing price without Day / extended Day orders. The long value represents the price scaled by 1,000,000 (6 decimal places).
     *
     * @return the OcioOnlyClosingPrice field
     */
    public OcioOnlyClosingPriceField ocioOnlyClosingPrice() {
        return ocioOnlyClosingPrice;
    }

    /**
     * Indicates if any MOC shares are left unmatched.
     *
     * @return the MocSharesUnmatched field
     */
    public MocSharesUnmatchedField mocSharesUnmatched() {
        return mocSharesUnmatched;
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
        if (!time.parse(data, cursor)) {
            return false;
        }
        cursor += TimeField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!currentInsidePairedShares.parse(data, cursor)) {
            return false;
        }
        cursor += CurrentInsidePairedSharesField.BYTE_LENGTH;
        if (!currentInsideClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += CurrentInsideClosingPriceField.BYTE_LENGTH;
        if (!currentInsideImbalanceQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += CurrentInsideImbalanceQuantityField.BYTE_LENGTH;
        if (!currentInsideImbalanceSide.parse(data, cursor)) {
            return false;
        }
        cursor += CurrentInsideImbalanceSideField.BYTE_LENGTH;
        if (!fullClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += FullClosingPriceField.BYTE_LENGTH;
        if (!ocioOnlyClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OcioOnlyClosingPriceField.BYTE_LENGTH;
        return mocSharesUnmatched.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = time.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = currentInsidePairedShares.encode(data, cursor);
        cursor = currentInsideClosingPrice.encode(data, cursor);
        cursor = currentInsideImbalanceQuantity.encode(data, cursor);
        cursor = currentInsideImbalanceSide.encode(data, cursor);
        cursor = fullClosingPrice.encode(data, cursor);
        cursor = ocioOnlyClosingPrice.encode(data, cursor);
        cursor = mocSharesUnmatched.encode(data, cursor);
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
            case "Time" -> Optional.of(time);
            case "Symbol" -> Optional.of(symbol);
            case "CurrentInsidePairedShares" -> Optional.of(currentInsidePairedShares);
            case "CurrentInsideClosingPrice" -> Optional.of(currentInsideClosingPrice);
            case "CurrentInsideImbalanceQuantity" -> Optional.of(currentInsideImbalanceQuantity);
            case "CurrentInsideImbalanceSide" -> Optional.of(currentInsideImbalanceSide);
            case "FullClosingPrice" -> Optional.of(fullClosingPrice);
            case "OcioOnlyClosingPrice" -> Optional.of(ocioOnlyClosingPrice);
            case "MocSharesUnmatched" -> Optional.of(mocSharesUnmatched);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ImbalanceMessage message)) {
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
        if (!(other instanceof ImbalanceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
