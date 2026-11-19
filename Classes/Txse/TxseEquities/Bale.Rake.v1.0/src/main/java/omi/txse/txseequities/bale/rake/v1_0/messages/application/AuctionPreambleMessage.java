package omi.txse.txseequities.bale.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.bale.rake.v1_0.fields.AuctionStartField;
import omi.txse.txseequities.bale.rake.v1_0.fields.AuctionTypeField;
import omi.txse.txseequities.bale.rake.v1_0.fields.ExcessAuctionSideField;
import omi.txse.txseequities.bale.rake.v1_0.fields.MatchedSharesField;
import omi.txse.txseequities.bale.rake.v1_0.fields.ReservedField;
import omi.txse.txseequities.bale.rake.v1_0.fields.SymbolIdField;
import omi.txse.txseequities.bale.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.bale.rake.v1_0.types.Field;
import omi.txse.txseequities.bale.rake.v1_0.types.Message;
import omi.txse.txseequities.bale.rake.v1_0.types.PrintOptions;

/**
 * Represents the AuctionPreambleMessage message from the Bale protocol.
 *
 * <p>Published every 5 seconds during the Accumulation Period to indicate projected auction size. Reports the matched volume and excess side that would result if the auction crossed at that moment, considering only Auction-Only orders; the Continuous Book is excluded. Emitted for OPENING and CLOSING auction types only. Not emitted for HALT or IPO auctions, which proceed directly to the Band Window phase at onset (see AuctionBandWindow).</p>
 */
public final class AuctionPreambleMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'u';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 32;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Preamble Message";

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
     * Scheduled cross time for this auction, expressed as nanoseconds since the Unix epoch (UTC). For Opening and Closing auctions, reflects the Exchange's published session schedule. For Halt and IPO auctions, reflects the cross time announced for this specific event.
     */
    private final AuctionStartField auctionStart = new AuctionStartField();

    /**
     * Projected matched volume among Auction-Only orders.
     */
    private final MatchedSharesField matchedShares = new MatchedSharesField();

    /**
     * Enum ExcessAuctionSide. Side with surplus Auction-Only volume.
     */
    private final ExcessAuctionSideField excessAuctionSide = new ExcessAuctionSideField();

    /**
     * Reserved for future use. Set to 0 by the Exchange; receivers must ignore.
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, symbolId, auctionType, auctionStart, matchedShares, excessAuctionSide, reserved);

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
     * Scheduled cross time for this auction, expressed as nanoseconds since the Unix epoch (UTC). For Opening and Closing auctions, reflects the Exchange's published session schedule. For Halt and IPO auctions, reflects the cross time announced for this specific event.
     *
     * @return the AuctionStart field
     */
    public AuctionStartField auctionStart() {
        return auctionStart;
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
     * Enum ExcessAuctionSide. Side with surplus Auction-Only volume.
     *
     * @return the ExcessAuctionSide field
     */
    public ExcessAuctionSideField excessAuctionSide() {
        return excessAuctionSide;
    }

    /**
     * Reserved for future use. Set to 0 by the Exchange; receivers must ignore.
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
        if (!auctionStart.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionStartField.BYTE_LENGTH;
        if (!matchedShares.parse(data, cursor)) {
            return false;
        }
        cursor += MatchedSharesField.BYTE_LENGTH;
        if (!excessAuctionSide.parse(data, cursor)) {
            return false;
        }
        cursor += ExcessAuctionSideField.BYTE_LENGTH;
        return reserved.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = auctionStart.encode(data, cursor);
        cursor = matchedShares.encode(data, cursor);
        cursor = excessAuctionSide.encode(data, cursor);
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
            case "TransactTime" -> Optional.of(transactTime);
            case "SymbolId" -> Optional.of(symbolId);
            case "AuctionType" -> Optional.of(auctionType);
            case "AuctionStart" -> Optional.of(auctionStart);
            case "MatchedShares" -> Optional.of(matchedShares);
            case "ExcessAuctionSide" -> Optional.of(excessAuctionSide);
            case "Reserved" -> Optional.of(reserved);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AuctionPreambleMessage message)) {
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
        if (!(other instanceof AuctionPreambleMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
