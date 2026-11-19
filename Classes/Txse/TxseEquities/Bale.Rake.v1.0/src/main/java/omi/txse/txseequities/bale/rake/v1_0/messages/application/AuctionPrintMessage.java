package omi.txse.txseequities.bale.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.bale.rake.v1_0.fields.AuctionPriceField;
import omi.txse.txseequities.bale.rake.v1_0.fields.AuctionTypeField;
import omi.txse.txseequities.bale.rake.v1_0.fields.ExecIdField;
import omi.txse.txseequities.bale.rake.v1_0.fields.MatchedSharesField;
import omi.txse.txseequities.bale.rake.v1_0.fields.SymbolIdField;
import omi.txse.txseequities.bale.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.bale.rake.v1_0.types.Field;
import omi.txse.txseequities.bale.rake.v1_0.types.Message;
import omi.txse.txseequities.bale.rake.v1_0.types.PrintOptions;

/**
 * Represents the AuctionPrintMessage message from the Bale protocol.
 *
 * <p>Summary of an auction cross. Emitted before any per-order auction execution messages for the same cross. Universal lifecycle terminator — emitted for every auction. Encoding: (a) matchedShares &gt; 0 with a valid auctionPrice indicates a normal cross; (b) matchedShares = 0 with a valid auctionPrice indicates a zero-share completion (e.g., halt-into-close default or demand failure); (c) matchedShares = 0 with auctionPrice = CANCELED_SENTINEL indicates a canceled auction. Where the feed publishes per-order auction executions, those executions share this message's execId.</p>
 */
public final class AuctionPrintMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'n';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 31;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Print Message";

    /**
     * Transaction time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Symbol identifier
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Enum AuctionType. Type of auction event.
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Auction clearing price.
     */
    private final AuctionPriceField auctionPrice = new AuctionPriceField();

    /**
     * Projected matched volume among Auction-Only orders.
     */
    private final MatchedSharesField matchedShares = new MatchedSharesField();

    /**
     * Cross execution identifier. Where the feed publishes per-order auction executions, those executions carry this same execId for the cross. Unique per symbol per trading day; not guaranteed unique across symbols or across trading days.
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, symbolId, auctionType, auctionPrice, matchedShares, execId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Transaction time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Symbol identifier
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Enum AuctionType. Type of auction event.
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Auction clearing price.
     *
     * @return the AuctionPrice field
     */
    public AuctionPriceField auctionPrice() {
        return auctionPrice;
    }

    /**
     * Projected matched volume among Auction-Only orders.
     *
     * @return the MatchedShares field
     */
    public MatchedSharesField matchedShares() {
        return matchedShares;
    }

    /**
     * Cross execution identifier. Where the feed publishes per-order auction executions, those executions carry this same execId for the cross. Unique per symbol per trading day; not guaranteed unique across symbols or across trading days.
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
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
        return Optional.ofNullable(transactTime.value());
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
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!auctionPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionPriceField.BYTE_LENGTH;
        if (!matchedShares.parse(data, cursor)) {
            return false;
        }
        cursor += MatchedSharesField.BYTE_LENGTH;
        return execId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = auctionPrice.encode(data, cursor);
        cursor = matchedShares.encode(data, cursor);
        cursor = execId.encode(data, cursor);
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
            case "TransactTime" -> Optional.of(transactTime);
            case "SymbolId" -> Optional.of(symbolId);
            case "AuctionType" -> Optional.of(auctionType);
            case "AuctionPrice" -> Optional.of(auctionPrice);
            case "MatchedShares" -> Optional.of(matchedShares);
            case "ExecId" -> Optional.of(execId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AuctionPrintMessage message)) {
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
        if (!(other instanceof AuctionPrintMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
