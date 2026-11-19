package omi.cboe.c1options.flex.pitch.v1_1_30.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.AuctionEndOffsetField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.AuctionIdField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.AuctionTypeField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.ClientIdField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.CustomerIndicatorField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.DacDeltaCountField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.DacReferencePriceField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.FlexInstrumentIdField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.ParticipantIdField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.QuantityLongField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.SideField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.SignedPriceLongField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.TimeOffsetField;
import omi.cboe.c1options.flex.pitch.v1_1_30.groups.DacDeltaEntry;
import omi.cboe.c1options.flex.pitch.v1_1_30.groups.DacDeltaList;
import omi.cboe.c1options.flex.pitch.v1_1_30.types.Field;
import omi.cboe.c1options.flex.pitch.v1_1_30.types.Message;
import omi.cboe.c1options.flex.pitch.v1_1_30.types.PrintOptions;

/**
 * Represents the DacAuctionNotificationMessage message from the Flex protocol.
 *
 * <p>DAC Auction Notification messages are used to disseminate order details of a DAC FLEX Auction.</p>
 */
public final class DacAuctionNotificationMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 54;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Dac Auction Notification Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * FLEX Instrument ID right padded with spaces.
     */
    private final FlexInstrumentIdField flexInstrumentId = new FlexInstrumentIdField();

    /**
     * Day specific identifier assigned to this auction.
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Auction type indicator
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Side indicator
     */
    private final SideField side = new SideField();

    /**
     * Auction price. Price will be zero for Auction Type = B and F. Price will be included for Auction Type = S.
     */
    private final SignedPriceLongField signedPriceLong = new SignedPriceLongField();

    /**
     * Instrument quantity.
     */
    private final QuantityLongField quantityLong = new QuantityLongField();

    /**
     * Customer indicator
     */
    private final CustomerIndicatorField customerIndicator = new CustomerIndicatorField();

    /**
     * Executing Broker (optional) of firm attributed to this auction.
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * Nanosecond offset from last timestamp.
     */
    private final AuctionEndOffsetField auctionEndOffset = new AuctionEndOffsetField();

    /**
     * User defined identifier for quote attribution.
     */
    private final ClientIdField clientId = new ClientIdField();

    /**
     * Value used as the initial reference price for a delta adjust at close auction.
     */
    private final DacReferencePriceField dacReferencePrice = new DacReferencePriceField();

    /**
     * Number of delta values for this auction.
     */
    private final DacDeltaCountField dacDeltaCount = new DacDeltaCountField();

    /**
     * Repeating delta value for DAC auctions. Repeats DAC Delta Count times.
     */
    private final DacDeltaList dacDelta = new DacDeltaList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, flexInstrumentId, auctionId, auctionType, side, signedPriceLong, quantityLong, customerIndicator, participantId, auctionEndOffset, clientId, dacReferencePrice, dacDeltaCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * FLEX Instrument ID right padded with spaces.
     *
     * @return the FlexInstrumentId field
     */
    public FlexInstrumentIdField flexInstrumentId() {
        return flexInstrumentId;
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
     * Auction type indicator
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Side indicator
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Auction price. Price will be zero for Auction Type = B and F. Price will be included for Auction Type = S.
     *
     * @return the SignedPriceLong field
     */
    public SignedPriceLongField signedPriceLong() {
        return signedPriceLong;
    }

    /**
     * Instrument quantity.
     *
     * @return the QuantityLong field
     */
    public QuantityLongField quantityLong() {
        return quantityLong;
    }

    /**
     * Customer indicator
     *
     * @return the CustomerIndicator field
     */
    public CustomerIndicatorField customerIndicator() {
        return customerIndicator;
    }

    /**
     * Executing Broker (optional) of firm attributed to this auction.
     *
     * @return the ParticipantId field
     */
    public ParticipantIdField participantId() {
        return participantId;
    }

    /**
     * Nanosecond offset from last timestamp.
     *
     * @return the AuctionEndOffset field
     */
    public AuctionEndOffsetField auctionEndOffset() {
        return auctionEndOffset;
    }

    /**
     * User defined identifier for quote attribution.
     *
     * @return the ClientId field
     */
    public ClientIdField clientId() {
        return clientId;
    }

    /**
     * Value used as the initial reference price for a delta adjust at close auction.
     *
     * @return the DacReferencePrice field
     */
    public DacReferencePriceField dacReferencePrice() {
        return dacReferencePrice;
    }

    /**
     * Number of delta values for this auction.
     *
     * @return the DacDeltaCount field
     */
    public DacDeltaCountField dacDeltaCount() {
        return dacDeltaCount;
    }

    /**
     * Repeating delta value for DAC auctions. Repeats DAC Delta Count times.
     *
     * <p>Encode writes this list's size to the DacDeltaCount field.</p>
     *
     * @return the DacDelta entries
     */
    public DacDeltaList dacDelta() {
        return dacDelta;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + dacDelta.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!flexInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += FlexInstrumentIdField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!signedPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += SignedPriceLongField.BYTE_LENGTH;
        if (!quantityLong.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityLongField.BYTE_LENGTH;
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
        if (!clientId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientIdField.BYTE_LENGTH;
        if (!dacReferencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += DacReferencePriceField.BYTE_LENGTH;
        if (!dacDeltaCount.parse(data, cursor)) {
            return false;
        }
        cursor += DacDeltaCountField.BYTE_LENGTH;
        if (!dacDelta.parse(data, cursor, end, dacDeltaCount.value())) {
            return false;
        }
        cursor += dacDelta.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (dacDelta.size() > 255) {
            throw new IllegalStateException("dacDelta holds " + dacDelta.size() + " entries, more than its count field can state");
        }
        dacDeltaCount.value((short) dacDelta.size());
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = flexInstrumentId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = signedPriceLong.encode(data, cursor);
        cursor = quantityLong.encode(data, cursor);
        cursor = customerIndicator.encode(data, cursor);
        cursor = participantId.encode(data, cursor);
        cursor = auctionEndOffset.encode(data, cursor);
        cursor = clientId.encode(data, cursor);
        cursor = dacReferencePrice.encode(data, cursor);
        cursor = dacDeltaCount.encode(data, cursor);
        cursor = dacDelta.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        dacDelta.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != dacDeltaCount && !field.isRecognized()) {
                return false;
            }
        }
        return dacDelta.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != dacDeltaCount && !field.isValid()) {
                return false;
            }
        }
        if (!dacDelta.isValid()) {
            return false;
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
        if (!timeOffset.isDecoded()) {
            return Optional.of(timeOffset);
        }
        if (!flexInstrumentId.isDecoded()) {
            return Optional.of(flexInstrumentId);
        }
        if (!auctionId.isDecoded()) {
            return Optional.of(auctionId);
        }
        if (!auctionType.isDecoded()) {
            return Optional.of(auctionType);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!signedPriceLong.isDecoded()) {
            return Optional.of(signedPriceLong);
        }
        if (!quantityLong.isDecoded()) {
            return Optional.of(quantityLong);
        }
        if (!customerIndicator.isDecoded()) {
            return Optional.of(customerIndicator);
        }
        if (!participantId.isDecoded()) {
            return Optional.of(participantId);
        }
        if (!auctionEndOffset.isDecoded()) {
            return Optional.of(auctionEndOffset);
        }
        if (!clientId.isDecoded()) {
            return Optional.of(clientId);
        }
        if (!dacReferencePrice.isDecoded()) {
            return Optional.of(dacReferencePrice);
        }
        if (!dacDeltaCount.isDecoded()) {
            return Optional.of(dacDeltaCount);
        }
        if (!dacDelta.isDecoded()) {
            return Optional.of(dacDelta.failedEntry().flatMap(DacDeltaEntry::failedAt).orElse(dacDeltaCount));
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
            case "FlexInstrumentId" -> Optional.of(flexInstrumentId);
            case "AuctionId" -> Optional.of(auctionId);
            case "AuctionType" -> Optional.of(auctionType);
            case "Side" -> Optional.of(side);
            case "SignedPriceLong" -> Optional.of(signedPriceLong);
            case "QuantityLong" -> Optional.of(quantityLong);
            case "CustomerIndicator" -> Optional.of(customerIndicator);
            case "ParticipantId" -> Optional.of(participantId);
            case "AuctionEndOffset" -> Optional.of(auctionEndOffset);
            case "ClientId" -> Optional.of(clientId);
            case "DacReferencePrice" -> Optional.of(dacReferencePrice);
            case "DacDeltaCount" -> Optional.of(dacDeltaCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DacAuctionNotificationMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(dacDelta.diffFields(message.dacDelta));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            dacDelta.toFormattedString(builder, options);
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
        dacDelta.toFormattedString(builder, nested);
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
        if (!(other instanceof DacAuctionNotificationMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && dacDelta.equals(message.dacDelta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, dacDelta);
    }
}
