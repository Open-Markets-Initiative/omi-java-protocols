package omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.AuctionEndOffsetField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.AuctionIdField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.AuctionTypeField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.ContractsField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.CustomerIndicatorField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.LongPriceField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.ParticipantIdField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.SideIndicatorField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.SymbolField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.TimeOffsetField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.types.Field;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.types.Message;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.types.PrintOptions;

/**
 * Represents the AuctionNotificationMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>Auction Notification messages are used to disseminate order details of an auction.</p>
 */
public final class AuctionNotificationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 41;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Notification Message";

    /**
     * Nanosecond offset from last unit timestamp
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Symbol right padded with spaces.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Day specific identifier assigned to this auction.
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Auction type value
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * B = Buy Order S = Sell Order
     */
    private final SideIndicatorField sideIndicator = new SideIndicatorField();

    /**
     * The limit order price
     */
    private final LongPriceField longPrice = new LongPriceField();

    /**
     * Number of contracts available in the auction.
     */
    private final ContractsField contracts = new ContractsField();

    /**
     * BZX/EDGX Options Only (space filled on C2 Options and all equities markets). N = Non-Customer C = Customer
     */
    private final CustomerIndicatorField customerIndicator = new CustomerIndicatorField();

    /**
     * Optionally specified. If specified, MPID (equities) or Executing Broker (options) of firm attributed to this quote. Alternatively “RTAL” for retail specified orders (equities). Space filled otherwise.
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * Nanosecond offset from last timestamp
     */
    private final AuctionEndOffsetField auctionEndOffset = new AuctionEndOffsetField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, symbol, auctionId, auctionType, sideIndicator, longPrice, contracts, customerIndicator, participantId, auctionEndOffset);

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
     * Symbol right padded with spaces.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Day specific identifier assigned to this auction.
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * Auction type value
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * B = Buy Order S = Sell Order
     *
     * @return the SideIndicator field
     */
    public SideIndicatorField sideIndicator() {
        return sideIndicator;
    }

    /**
     * The limit order price
     *
     * @return the LongPrice field
     */
    public LongPriceField longPrice() {
        return longPrice;
    }

    /**
     * Number of contracts available in the auction.
     *
     * @return the Contracts field
     */
    public ContractsField contracts() {
        return contracts;
    }

    /**
     * BZX/EDGX Options Only (space filled on C2 Options and all equities markets). N = Non-Customer C = Customer
     *
     * @return the CustomerIndicator field
     */
    public CustomerIndicatorField customerIndicator() {
        return customerIndicator;
    }

    /**
     * Optionally specified. If specified, MPID (equities) or Executing Broker (options) of firm attributed to this quote. Alternatively “RTAL” for retail specified orders (equities). Space filled otherwise.
     *
     * @return the ParticipantId field
     */
    public ParticipantIdField participantId() {
        return participantId;
    }

    /**
     * Nanosecond offset from last timestamp
     *
     * @return the AuctionEndOffset field
     */
    public AuctionEndOffsetField auctionEndOffset() {
        return auctionEndOffset;
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
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!sideIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SideIndicatorField.BYTE_LENGTH;
        if (!longPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LongPriceField.BYTE_LENGTH;
        if (!contracts.parse(data, cursor)) {
            return false;
        }
        cursor += ContractsField.BYTE_LENGTH;
        if (!customerIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CustomerIndicatorField.BYTE_LENGTH;
        if (!participantId.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantIdField.BYTE_LENGTH;
        return auctionEndOffset.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = sideIndicator.encode(data, cursor);
        cursor = longPrice.encode(data, cursor);
        cursor = contracts.encode(data, cursor);
        cursor = customerIndicator.encode(data, cursor);
        cursor = participantId.encode(data, cursor);
        cursor = auctionEndOffset.encode(data, cursor);
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
            case "Symbol" -> Optional.of(symbol);
            case "AuctionId" -> Optional.of(auctionId);
            case "AuctionType" -> Optional.of(auctionType);
            case "SideIndicator" -> Optional.of(sideIndicator);
            case "LongPrice" -> Optional.of(longPrice);
            case "Contracts" -> Optional.of(contracts);
            case "CustomerIndicator" -> Optional.of(customerIndicator);
            case "ParticipantId" -> Optional.of(participantId);
            case "AuctionEndOffset" -> Optional.of(auctionEndOffset);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AuctionNotificationMessage message)) {
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
        if (!(other instanceof AuctionNotificationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
