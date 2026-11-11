package omi.eurex.t7.eobi.fbe.v13_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eobi.fbe.v13_0.fields.BidOrdTypeField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.BidPxField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.BidSizeField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.OfferOrdTypeField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.OfferPxField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.OfferSizeField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.PotentialSecurityTradingEventField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityIdField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.TransactTimeField;
import omi.eurex.t7.eobi.fbe.v13_0.types.Field;
import omi.eurex.t7.eobi.fbe.v13_0.types.Message;
import omi.eurex.t7.eobi.fbe.v13_0.types.PrintOptions;

/**
 * Represents the AuctionBbo message from the Eobi protocol.
 */
public final class AuctionBbo implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 56;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Bbo";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 51, 5 };

    /**
     * Matching-engine transaction time in nanoseconds since Unix epoch
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Unique instrument identifier
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Bid Px
     */
    private final BidPxField bidPx = new BidPxField();

    /**
     * Offer Px
     */
    private final OfferPxField offerPx = new OfferPxField();

    /**
     * Bid Size
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Offer Size
     */
    private final OfferSizeField offerSize = new OfferSizeField();

    /**
     * Potential Security Trading Event
     */
    private final PotentialSecurityTradingEventField potentialSecurityTradingEvent = new PotentialSecurityTradingEventField();

    /**
     * Bid Ord Type
     */
    private final BidOrdTypeField bidOrdType = new BidOrdTypeField();

    /**
     * Offer Ord Type
     */
    private final OfferOrdTypeField offerOrdType = new OfferOrdTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, securityId, bidPx, offerPx, bidSize, offerSize, potentialSecurityTradingEvent, bidOrdType, offerOrdType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Matching-engine transaction time in nanoseconds since Unix epoch
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Unique instrument identifier
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Bid Px
     *
     * @return the BidPx field
     */
    public BidPxField bidPx() {
        return bidPx;
    }

    /**
     * Offer Px
     *
     * @return the OfferPx field
     */
    public OfferPxField offerPx() {
        return offerPx;
    }

    /**
     * Bid Size
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Offer Size
     *
     * @return the OfferSize field
     */
    public OfferSizeField offerSize() {
        return offerSize;
    }

    /**
     * Potential Security Trading Event
     *
     * @return the PotentialSecurityTradingEvent field
     */
    public PotentialSecurityTradingEventField potentialSecurityTradingEvent() {
        return potentialSecurityTradingEvent;
    }

    /**
     * Bid Ord Type
     *
     * @return the BidOrdType field
     */
    public BidOrdTypeField bidOrdType() {
        return bidOrdType;
    }

    /**
     * Offer Ord Type
     *
     * @return the OfferOrdType field
     */
    public OfferOrdTypeField offerOrdType() {
        return offerOrdType;
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
        return PADDING.clone();
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!bidPx.parse(data, cursor)) {
            return false;
        }
        cursor += BidPxField.BYTE_LENGTH;
        if (!offerPx.parse(data, cursor)) {
            return false;
        }
        cursor += OfferPxField.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!offerSize.parse(data, cursor)) {
            return false;
        }
        cursor += OfferSizeField.BYTE_LENGTH;
        if (!potentialSecurityTradingEvent.parse(data, cursor)) {
            return false;
        }
        cursor += PotentialSecurityTradingEventField.BYTE_LENGTH;
        if (!bidOrdType.parse(data, cursor)) {
            return false;
        }
        cursor += BidOrdTypeField.BYTE_LENGTH;
        if (!offerOrdType.parse(data, cursor)) {
            return false;
        }
        cursor += OfferOrdTypeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = bidPx.encode(data, cursor);
        cursor = offerPx.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = offerSize.encode(data, cursor);
        cursor = potentialSecurityTradingEvent.encode(data, cursor);
        cursor = bidOrdType.encode(data, cursor);
        cursor = offerOrdType.encode(data, cursor);
        if (buffer != null && buffer.length >= 56) {
            System.arraycopy(buffer, 51, data, cursor, 5); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 5, (byte) 0); // padding
        }
        cursor += 5;
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
            case "SecurityId" -> Optional.of(securityId);
            case "BidPx" -> Optional.of(bidPx);
            case "OfferPx" -> Optional.of(offerPx);
            case "BidSize" -> Optional.of(bidSize);
            case "OfferSize" -> Optional.of(offerSize);
            case "PotentialSecurityTradingEvent" -> Optional.of(potentialSecurityTradingEvent);
            case "BidOrdType" -> Optional.of(bidOrdType);
            case "OfferOrdType" -> Optional.of(offerOrdType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AuctionBbo message)) {
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
        if (!(other instanceof AuctionBbo message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
