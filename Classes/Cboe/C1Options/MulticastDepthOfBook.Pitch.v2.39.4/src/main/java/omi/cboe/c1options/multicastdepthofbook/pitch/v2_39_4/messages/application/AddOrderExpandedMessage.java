package omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.AddFlagsField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.CustomerIndicatorField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.ExpandedSymbolField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.LongPriceField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.LongQuantityField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.OrderIdField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.ParticipantIdField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.SideIndicatorField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.TimeOffsetField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.types.Field;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.types.Message;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.types.PrintOptions;

/**
 * Represents the AddOrderExpandedMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>An Add Order message represents a newly accepted visible order on the Cboe book. Expanded version accommodates larger symbol sizes possible through the ISRA plan.</p>
 */
public final class AddOrderExpandedMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order Expanded Message";

    /**
     * Nanosecond offset from last unit timestamp
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Day-specific identifier assigned to this order
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * B = Buy Order S = Sell Order
     */
    private final SideIndicatorField sideIndicator = new SideIndicatorField();

    /**
     * Number of shares/contracts being added to the book (may be less than the number entered).
     */
    private final LongQuantityField longQuantity = new LongQuantityField();

    /**
     * Symbol right padded with spaces.
     */
    private final ExpandedSymbolField expandedSymbol = new ExpandedSymbolField();

    /**
     * The limit order price
     */
    private final LongPriceField longPrice = new LongPriceField();

    /**
     * Add Flags bitfield struct
     */
    private final AddFlagsField addFlags = new AddFlagsField();

    /**
     * Optionally specified. If specified, MPID (equities) or Executing Broker (options) of firm attributed to this quote. Alternatively “RTAL” for retail specified orders (equities). Space filled otherwise.
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * BZX/EDGX Options Only (space filled on C2 Options and all equities markets). N = Non-Customer C = Customer
     */
    private final CustomerIndicatorField customerIndicator = new CustomerIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, orderId, sideIndicator, longQuantity, expandedSymbol, longPrice, addFlags, participantId, customerIndicator);

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
     * Day-specific identifier assigned to this order
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
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
     * Number of shares/contracts being added to the book (may be less than the number entered).
     *
     * @return the LongQuantity field
     */
    public LongQuantityField longQuantity() {
        return longQuantity;
    }

    /**
     * Symbol right padded with spaces.
     *
     * @return the ExpandedSymbol field
     */
    public ExpandedSymbolField expandedSymbol() {
        return expandedSymbol;
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
     * Add Flags bitfield struct
     *
     * @return the AddFlags field
     */
    public AddFlagsField addFlags() {
        return addFlags;
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
     * BZX/EDGX Options Only (space filled on C2 Options and all equities markets). N = Non-Customer C = Customer
     *
     * @return the CustomerIndicator field
     */
    public CustomerIndicatorField customerIndicator() {
        return customerIndicator;
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
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!sideIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SideIndicatorField.BYTE_LENGTH;
        if (!longQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += LongQuantityField.BYTE_LENGTH;
        if (!expandedSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += ExpandedSymbolField.BYTE_LENGTH;
        if (!longPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LongPriceField.BYTE_LENGTH;
        if (!addFlags.parse(data, cursor)) {
            return false;
        }
        cursor += AddFlagsField.BYTE_LENGTH;
        if (!participantId.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantIdField.BYTE_LENGTH;
        return customerIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = sideIndicator.encode(data, cursor);
        cursor = longQuantity.encode(data, cursor);
        cursor = expandedSymbol.encode(data, cursor);
        cursor = longPrice.encode(data, cursor);
        cursor = addFlags.encode(data, cursor);
        cursor = participantId.encode(data, cursor);
        cursor = customerIndicator.encode(data, cursor);
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
            case "OrderId" -> Optional.of(orderId);
            case "SideIndicator" -> Optional.of(sideIndicator);
            case "LongQuantity" -> Optional.of(longQuantity);
            case "ExpandedSymbol" -> Optional.of(expandedSymbol);
            case "LongPrice" -> Optional.of(longPrice);
            case "AddFlags" -> Optional.of(addFlags);
            case "ParticipantId" -> Optional.of(participantId);
            case "CustomerIndicator" -> Optional.of(customerIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddOrderExpandedMessage message)) {
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
        if (!(other instanceof AddOrderExpandedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
