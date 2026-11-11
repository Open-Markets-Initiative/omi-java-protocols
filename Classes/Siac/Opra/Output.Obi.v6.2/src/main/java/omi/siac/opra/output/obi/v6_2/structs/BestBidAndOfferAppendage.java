package omi.siac.opra.output.obi.v6_2.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.siac.opra.output.obi.v6_2.fields.BestBidDenominatorCodeField;
import omi.siac.opra.output.obi.v6_2.fields.BestBidParticipantIdField;
import omi.siac.opra.output.obi.v6_2.fields.BestBidPriceField;
import omi.siac.opra.output.obi.v6_2.fields.BestBidSizeField;
import omi.siac.opra.output.obi.v6_2.fields.BestOfferDenominatorCodeField;
import omi.siac.opra.output.obi.v6_2.fields.BestOfferParticipantIdField;
import omi.siac.opra.output.obi.v6_2.fields.BestOfferPriceField;
import omi.siac.opra.output.obi.v6_2.fields.BestOfferSizeField;
import omi.siac.opra.output.obi.v6_2.types.Field;
import omi.siac.opra.output.obi.v6_2.types.GroupEntry;
import omi.siac.opra.output.obi.v6_2.types.PrintOptions;

/**
 * The BestBidAndOfferAppendage record a message holds.
 *
 * <p>Best Bid and Offer Appendage</p>
 */
public final class BestBidAndOfferAppendage implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 20;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "BestBidAndOfferAppendage";

    /**
     * Identifies the participant that entered the Best Bid.
     */
    private final BestBidParticipantIdField bestBidParticipantId = new BestBidParticipantIdField();

    /**
     * The Bed Bid Denominator Code field indicates the position of the floating decimal point within the Best Bid Price field.
     */
    private final BestBidDenominatorCodeField bestBidDenominatorCode = new BestBidDenominatorCodeField();

    /**
     * Represents the best price at which a buyer is willing to buy an option.
     */
    private final BestBidPriceField bestBidPrice = new BestBidPriceField();

    /**
     * The Best Bid Size identifies the number of contracts being bought for an option at the Best Bid price.
     */
    private final BestBidSizeField bestBidSize = new BestBidSizeField();

    /**
     * Identifies the participant that entered the Best Bid.
     */
    private final BestOfferParticipantIdField bestOfferParticipantId = new BestOfferParticipantIdField();

    /**
     * The Bed OFFER Denominator Code field indicates the position of the floating decimal point within the Best Offer Price field.
     */
    private final BestOfferDenominatorCodeField bestOfferDenominatorCode = new BestOfferDenominatorCodeField();

    /**
     * Represents the best price at which a seller is offering to sell an option.
     */
    private final BestOfferPriceField bestOfferPrice = new BestOfferPriceField();

    /**
     * The Best Offer Size identifies the number of contracts being bought for an option at the Best Offer price.
     */
    private final BestOfferSizeField bestOfferSize = new BestOfferSizeField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(bestBidParticipantId, bestBidDenominatorCode, bestBidPrice, bestBidSize, bestOfferParticipantId, bestOfferDenominatorCode, bestOfferPrice, bestOfferSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identifies the participant that entered the Best Bid.
     *
     * @return the BestBidParticipantId field
     */
    public BestBidParticipantIdField bestBidParticipantId() {
        return bestBidParticipantId;
    }

    /**
     * The Bed Bid Denominator Code field indicates the position of the floating decimal point within the Best Bid Price field.
     *
     * @return the BestBidDenominatorCode field
     */
    public BestBidDenominatorCodeField bestBidDenominatorCode() {
        return bestBidDenominatorCode;
    }

    /**
     * Represents the best price at which a buyer is willing to buy an option.
     *
     * @return the BestBidPrice field
     */
    public BestBidPriceField bestBidPrice() {
        return bestBidPrice;
    }

    /**
     * The Best Bid Size identifies the number of contracts being bought for an option at the Best Bid price.
     *
     * @return the BestBidSize field
     */
    public BestBidSizeField bestBidSize() {
        return bestBidSize;
    }

    /**
     * Identifies the participant that entered the Best Bid.
     *
     * @return the BestOfferParticipantId field
     */
    public BestOfferParticipantIdField bestOfferParticipantId() {
        return bestOfferParticipantId;
    }

    /**
     * The Bed OFFER Denominator Code field indicates the position of the floating decimal point within the Best Offer Price field.
     *
     * @return the BestOfferDenominatorCode field
     */
    public BestOfferDenominatorCodeField bestOfferDenominatorCode() {
        return bestOfferDenominatorCode;
    }

    /**
     * Represents the best price at which a seller is offering to sell an option.
     *
     * @return the BestOfferPrice field
     */
    public BestOfferPriceField bestOfferPrice() {
        return bestOfferPrice;
    }

    /**
     * The Best Offer Size identifies the number of contracts being bought for an option at the Best Offer price.
     *
     * @return the BestOfferSize field
     */
    public BestOfferSizeField bestOfferSize() {
        return bestOfferSize;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
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
        if (!bestBidParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidParticipantIdField.BYTE_LENGTH;
        if (!bestBidDenominatorCode.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidDenominatorCodeField.BYTE_LENGTH;
        if (!bestBidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidPriceField.BYTE_LENGTH;
        if (!bestBidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidSizeField.BYTE_LENGTH;
        if (!bestOfferParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += BestOfferParticipantIdField.BYTE_LENGTH;
        if (!bestOfferDenominatorCode.parse(data, cursor)) {
            return false;
        }
        cursor += BestOfferDenominatorCodeField.BYTE_LENGTH;
        if (!bestOfferPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BestOfferPriceField.BYTE_LENGTH;
        return bestOfferSize.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = bestBidParticipantId.encode(data, cursor);
        cursor = bestBidDenominatorCode.encode(data, cursor);
        cursor = bestBidPrice.encode(data, cursor);
        cursor = bestBidSize.encode(data, cursor);
        cursor = bestOfferParticipantId.encode(data, cursor);
        cursor = bestOfferDenominatorCode.encode(data, cursor);
        cursor = bestOfferPrice.encode(data, cursor);
        cursor = bestOfferSize.encode(data, cursor);
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
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
            case "BestBidParticipantId" -> Optional.of(bestBidParticipantId);
            case "BestBidDenominatorCode" -> Optional.of(bestBidDenominatorCode);
            case "BestBidPrice" -> Optional.of(bestBidPrice);
            case "BestBidSize" -> Optional.of(bestBidSize);
            case "BestOfferParticipantId" -> Optional.of(bestOfferParticipantId);
            case "BestOfferDenominatorCode" -> Optional.of(bestOfferDenominatorCode);
            case "BestOfferPrice" -> Optional.of(bestOfferPrice);
            case "BestOfferSize" -> Optional.of(bestOfferSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof BestBidAndOfferAppendage message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof BestBidAndOfferAppendage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
