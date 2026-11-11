package omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_29.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_29.fields.AuctionOpeningTypeField;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_29.fields.PriceField;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_29.fields.SharesContractsField;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_29.fields.SymbolLongField;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_29.fields.TimeOffsetField;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_29.types.Field;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_29.types.Message;
import omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_29.types.PrintOptions;

/**
 * Represents the AuctionSummaryMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>Auction Summary messages are used to disseminate the results of an auction of a complex instrument. An Opening or Re-Opening Auction Summary message for each complex instrument is sent at the conclusion of its Opening or Re-Opening auction and represents Cboe opening price.</p>
 */
public final class AuctionSummaryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 25;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Summary Message";

    /**
     * Nanosecond offset from last unit timestamp
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Symbol
     */
    private final SymbolLongField symbolLong = new SymbolLongField();

    /**
     * Auction Opening Type
     */
    private final AuctionOpeningTypeField auctionOpeningType = new AuctionOpeningTypeField();

    /**
     * The limit order price
     */
    private final PriceField price = new PriceField();

    /**
     * Cumulative number of shares/contracts executed during the auction or CMC match
     */
    private final SharesContractsField sharesContracts = new SharesContractsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, symbolLong, auctionOpeningType, price, sharesContracts);

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
     * Symbol
     *
     * @return the SymbolLong field
     */
    public SymbolLongField symbolLong() {
        return symbolLong;
    }

    /**
     * Auction Opening Type
     *
     * @return the AuctionOpeningType field
     */
    public AuctionOpeningTypeField auctionOpeningType() {
        return auctionOpeningType;
    }

    /**
     * The limit order price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Cumulative number of shares/contracts executed during the auction or CMC match
     *
     * @return the SharesContracts field
     */
    public SharesContractsField sharesContracts() {
        return sharesContracts;
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
        if (!symbolLong.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolLongField.BYTE_LENGTH;
        if (!auctionOpeningType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionOpeningTypeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        return sharesContracts.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = symbolLong.encode(data, cursor);
        cursor = auctionOpeningType.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = sharesContracts.encode(data, cursor);
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "SymbolLong" -> Optional.of(symbolLong);
            case "AuctionOpeningType" -> Optional.of(auctionOpeningType);
            case "Price" -> Optional.of(price);
            case "SharesContracts" -> Optional.of(sharesContracts);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AuctionSummaryMessage message)) {
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
        if (!(other instanceof AuctionSummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
