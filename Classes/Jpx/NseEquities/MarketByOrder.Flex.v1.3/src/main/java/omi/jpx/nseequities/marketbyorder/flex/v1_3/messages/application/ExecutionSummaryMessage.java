package omi.jpx.nseequities.marketbyorder.flex.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.fields.BestBidField;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.fields.BestOfferField;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.fields.LastPriceField;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.fields.MatchIdField;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.fields.PriceDirectionField;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.fields.StqReferencePriceField;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.fields.TimeMicrosecondsField;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.fields.TotalInvalidationField;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.fields.TotalVolumeField;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.fields.TriggeredSideField;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.types.Field;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.types.Message;
import omi.jpx.nseequities.marketbyorder.flex.v1_3.types.PrintOptions;

/**
 * Represents the ExecutionSummaryMessage message from the MarketByOrder protocol.
 *
 * <p>Provides summary information about execution. Delivered when an execution occurs.</p>
 */
public final class ExecutionSummaryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'K';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 54;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Summary Message";

    /**
     * Time to the nearest microsecond
     */
    private final TimeMicrosecondsField timeMicroseconds = new TimeMicrosecondsField();

    /**
     * Indicates the side whose order triggered the execution
     */
    private final TriggeredSideField triggeredSide = new TriggeredSideField();

    /**
     * Total volume of executed orders in number of shares
     */
    private final TotalVolumeField totalVolume = new TotalVolumeField();

    /**
     * Total volume of invalidated orders in number of shares
     */
    private final TotalInvalidationField totalInvalidation = new TotalInvalidationField();

    /**
     * Last price at the time the execution was processed
     */
    private final LastPriceField lastPrice = new LastPriceField();

    /**
     * Identifier assigned per issue on an execution basis, unique and sequential each business day
     */
    private final MatchIdField matchId = new MatchIdField();

    /**
     * Best offer at the time the execution processing finishes; set to 0 at market close
     */
    private final BestOfferField bestOffer = new BestOfferField();

    /**
     * Best bid at the time the execution processing finishes; set to 0 at market close
     */
    private final BestBidField bestBid = new BestBidField();

    /**
     * Price change compared to the most recent price
     */
    private final PriceDirectionField priceDirection = new PriceDirectionField();

    /**
     * Reference execution price of Sequential Trade Quote when that execution occurs; otherwise set to 0
     */
    private final StqReferencePriceField stqReferencePrice = new StqReferencePriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeMicroseconds, triggeredSide, totalVolume, totalInvalidation, lastPrice, matchId, bestOffer, bestBid, priceDirection, stqReferencePrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time to the nearest microsecond
     *
     * @return the TimeMicroseconds field
     */
    public TimeMicrosecondsField timeMicroseconds() {
        return timeMicroseconds;
    }

    /**
     * Indicates the side whose order triggered the execution
     *
     * @return the TriggeredSide field
     */
    public TriggeredSideField triggeredSide() {
        return triggeredSide;
    }

    /**
     * Total volume of executed orders in number of shares
     *
     * @return the TotalVolume field
     */
    public TotalVolumeField totalVolume() {
        return totalVolume;
    }

    /**
     * Total volume of invalidated orders in number of shares
     *
     * @return the TotalInvalidation field
     */
    public TotalInvalidationField totalInvalidation() {
        return totalInvalidation;
    }

    /**
     * Last price at the time the execution was processed
     *
     * @return the LastPrice field
     */
    public LastPriceField lastPrice() {
        return lastPrice;
    }

    /**
     * Identifier assigned per issue on an execution basis, unique and sequential each business day
     *
     * @return the MatchId field
     */
    public MatchIdField matchId() {
        return matchId;
    }

    /**
     * Best offer at the time the execution processing finishes; set to 0 at market close
     *
     * @return the BestOffer field
     */
    public BestOfferField bestOffer() {
        return bestOffer;
    }

    /**
     * Best bid at the time the execution processing finishes; set to 0 at market close
     *
     * @return the BestBid field
     */
    public BestBidField bestBid() {
        return bestBid;
    }

    /**
     * Price change compared to the most recent price
     *
     * @return the PriceDirection field
     */
    public PriceDirectionField priceDirection() {
        return priceDirection;
    }

    /**
     * Reference execution price of Sequential Trade Quote when that execution occurs; otherwise set to 0
     *
     * @return the StqReferencePrice field
     */
    public StqReferencePriceField stqReferencePrice() {
        return stqReferencePrice;
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
        if (!timeMicroseconds.parse(data, cursor)) {
            return false;
        }
        cursor += TimeMicrosecondsField.BYTE_LENGTH;
        if (!triggeredSide.parse(data, cursor)) {
            return false;
        }
        cursor += TriggeredSideField.BYTE_LENGTH;
        if (!totalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeField.BYTE_LENGTH;
        if (!totalInvalidation.parse(data, cursor)) {
            return false;
        }
        cursor += TotalInvalidationField.BYTE_LENGTH;
        if (!lastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceField.BYTE_LENGTH;
        if (!matchId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchIdField.BYTE_LENGTH;
        if (!bestOffer.parse(data, cursor)) {
            return false;
        }
        cursor += BestOfferField.BYTE_LENGTH;
        if (!bestBid.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidField.BYTE_LENGTH;
        if (!priceDirection.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDirectionField.BYTE_LENGTH;
        return stqReferencePrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeMicroseconds.encode(data, cursor);
        cursor = triggeredSide.encode(data, cursor);
        cursor = totalVolume.encode(data, cursor);
        cursor = totalInvalidation.encode(data, cursor);
        cursor = lastPrice.encode(data, cursor);
        cursor = matchId.encode(data, cursor);
        cursor = bestOffer.encode(data, cursor);
        cursor = bestBid.encode(data, cursor);
        cursor = priceDirection.encode(data, cursor);
        cursor = stqReferencePrice.encode(data, cursor);
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
            case "TimeMicroseconds" -> Optional.of(timeMicroseconds);
            case "TriggeredSide" -> Optional.of(triggeredSide);
            case "TotalVolume" -> Optional.of(totalVolume);
            case "TotalInvalidation" -> Optional.of(totalInvalidation);
            case "LastPrice" -> Optional.of(lastPrice);
            case "MatchId" -> Optional.of(matchId);
            case "BestOffer" -> Optional.of(bestOffer);
            case "BestBid" -> Optional.of(bestBid);
            case "PriceDirection" -> Optional.of(priceDirection);
            case "StqReferencePrice" -> Optional.of(stqReferencePrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionSummaryMessage message)) {
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
        if (!(other instanceof ExecutionSummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
