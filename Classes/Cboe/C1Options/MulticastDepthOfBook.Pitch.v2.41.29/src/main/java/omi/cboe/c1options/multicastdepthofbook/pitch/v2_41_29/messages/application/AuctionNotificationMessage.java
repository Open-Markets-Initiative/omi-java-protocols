package omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.fields.AuctionEndOffsetField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.fields.AuctionIdField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.fields.AuctionNotificationTypeField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.fields.ClientIdField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.fields.ContractsField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.fields.CustomerIndicatorField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.fields.ParticipantIdField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.fields.PriceField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.fields.SideField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.fields.SymbolField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.fields.TimeOffsetField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.types.Field;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.types.Message;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.types.PrintOptions;

/**
 * Represents the AuctionNotificationMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>Auction Notification messages are used to disseminate order details of an auction. Auctions will be available for a defined period of time known as the exposure period.</p>
 */
public final class AuctionNotificationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 45;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Notification Message";

    /**
     * Nanosecond offset from last unit timestamp
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Day specific identifier assigned to this auction.
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Auction Type
     */
    private final AuctionNotificationTypeField auctionNotificationType = new AuctionNotificationTypeField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * The limit order price
     */
    private final PriceField price = new PriceField();

    /**
     * Number of contracts available in the auction.
     */
    private final ContractsField contracts = new ContractsField();

    /**
     * Customer Indicator
     */
    private final CustomerIndicatorField customerIndicator = new CustomerIndicatorField();

    /**
     * Optionally specified. If specified the Executing Broker of firm attributed to this quote.
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * Nanosecond offset from last timestamp
     */
    private final AuctionEndOffsetField auctionEndOffset = new AuctionEndOffsetField();

    /**
     * Optional user specified value attributed to this quote. Space filled otherwise.
     */
    private final ClientIdField clientId = new ClientIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, symbol, auctionId, auctionNotificationType, side, price, contracts, customerIndicator, participantId, auctionEndOffset, clientId);

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
     * Auction Type
     *
     * @return the AuctionNotificationType field
     */
    public AuctionNotificationTypeField auctionNotificationType() {
        return auctionNotificationType;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
     * Number of contracts available in the auction.
     *
     * @return the Contracts field
     */
    public ContractsField contracts() {
        return contracts;
    }

    /**
     * Customer Indicator
     *
     * @return the CustomerIndicator field
     */
    public CustomerIndicatorField customerIndicator() {
        return customerIndicator;
    }

    /**
     * Optionally specified. If specified the Executing Broker of firm attributed to this quote.
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

    /**
     * Optional user specified value attributed to this quote. Space filled otherwise.
     *
     * @return the ClientId field
     */
    public ClientIdField clientId() {
        return clientId;
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
        if (!auctionNotificationType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionNotificationTypeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
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
        if (!auctionEndOffset.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionEndOffsetField.BYTE_LENGTH;
        return clientId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = auctionNotificationType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = contracts.encode(data, cursor);
        cursor = customerIndicator.encode(data, cursor);
        cursor = participantId.encode(data, cursor);
        cursor = auctionEndOffset.encode(data, cursor);
        cursor = clientId.encode(data, cursor);
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
            case "AuctionNotificationType" -> Optional.of(auctionNotificationType);
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "Contracts" -> Optional.of(contracts);
            case "CustomerIndicator" -> Optional.of(customerIndicator);
            case "ParticipantId" -> Optional.of(participantId);
            case "AuctionEndOffset" -> Optional.of(auctionEndOffset);
            case "ClientId" -> Optional.of(clientId);
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
