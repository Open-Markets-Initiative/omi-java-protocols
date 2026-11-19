package omi.asx.asxderivatives.t24.itch.v1_13.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.BestAskPriceField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.BestAskQuantityField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.BestBidPriceField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.BestBidQuantityField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.ContractNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.EquilibriumPriceField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.NanosecondsField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.TradeDateField;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Field;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Message;
import omi.asx.asxderivatives.t24.itch.v1_13.types.PrintOptions;

/**
 * Represents the EquilibriumPriceAuctionInfoMessage message from the T24 protocol.
 *
 * <p>ASX Trade24 disseminates equilibrium prices during a price discovery period. As orders are added, modified, cancelled or deleted a message will be reported informing the market the potential opening price.</p>
 */
public final class EquilibriumPriceAuctionInfoMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Z';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 30;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Equilibrium Price Auction Info Message";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Trade Date of event as applicable, if Event Code is “P” or “R”, applies to all active trade dates.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Contract Number Field Element Identifier
     */
    private final ContractNumberField contractNumber = new ContractNumberField();

    /**
     * Price at which matching will occur.
     */
    private final EquilibriumPriceField equilibriumPrice = new EquilibriumPriceField();

    /**
     * Best Bid Price.
     */
    private final BestBidPriceField bestBidPrice = new BestBidPriceField();

    /**
     * Best Ask Price.
     */
    private final BestAskPriceField bestAskPrice = new BestAskPriceField();

    /**
     * Best Bid Volume.
     */
    private final BestBidQuantityField bestBidQuantity = new BestBidQuantityField();

    /**
     * Best Ask Volume.
     */
    private final BestAskQuantityField bestAskQuantity = new BestAskQuantityField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, tradeDate, contractNumber, equilibriumPrice, bestBidPrice, bestAskPrice, bestBidQuantity, bestAskQuantity);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Trade Date of event as applicable, if Event Code is “P” or “R”, applies to all active trade dates.
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Contract Number Field Element Identifier
     *
     * @return the ContractNumber field
     */
    public ContractNumberField contractNumber() {
        return contractNumber;
    }

    /**
     * Price at which matching will occur.
     *
     * @return the EquilibriumPrice field
     */
    public EquilibriumPriceField equilibriumPrice() {
        return equilibriumPrice;
    }

    /**
     * Best Bid Price.
     *
     * @return the BestBidPrice field
     */
    public BestBidPriceField bestBidPrice() {
        return bestBidPrice;
    }

    /**
     * Best Ask Price.
     *
     * @return the BestAskPrice field
     */
    public BestAskPriceField bestAskPrice() {
        return bestAskPrice;
    }

    /**
     * Best Bid Volume.
     *
     * @return the BestBidQuantity field
     */
    public BestBidQuantityField bestBidQuantity() {
        return bestBidQuantity;
    }

    /**
     * Best Ask Volume.
     *
     * @return the BestAskQuantity field
     */
    public BestAskQuantityField bestAskQuantity() {
        return bestAskQuantity;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!contractNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ContractNumberField.BYTE_LENGTH;
        if (!equilibriumPrice.parse(data, cursor)) {
            return false;
        }
        cursor += EquilibriumPriceField.BYTE_LENGTH;
        if (!bestBidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidPriceField.BYTE_LENGTH;
        if (!bestAskPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BestAskPriceField.BYTE_LENGTH;
        if (!bestBidQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidQuantityField.BYTE_LENGTH;
        return bestAskQuantity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = contractNumber.encode(data, cursor);
        cursor = equilibriumPrice.encode(data, cursor);
        cursor = bestBidPrice.encode(data, cursor);
        cursor = bestAskPrice.encode(data, cursor);
        cursor = bestBidQuantity.encode(data, cursor);
        cursor = bestAskQuantity.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "TradeDate" -> Optional.of(tradeDate);
            case "ContractNumber" -> Optional.of(contractNumber);
            case "EquilibriumPrice" -> Optional.of(equilibriumPrice);
            case "BestBidPrice" -> Optional.of(bestBidPrice);
            case "BestAskPrice" -> Optional.of(bestAskPrice);
            case "BestBidQuantity" -> Optional.of(bestBidQuantity);
            case "BestAskQuantity" -> Optional.of(bestAskQuantity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EquilibriumPriceAuctionInfoMessage message)) {
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
        if (!(other instanceof EquilibriumPriceAuctionInfoMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
