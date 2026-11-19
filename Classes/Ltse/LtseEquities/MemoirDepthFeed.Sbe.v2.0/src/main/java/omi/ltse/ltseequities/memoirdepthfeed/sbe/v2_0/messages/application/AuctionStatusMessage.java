package omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.fields.AuctionIdField;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.fields.AuctionOnlyPriceField;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.fields.AuctionTypeField;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.fields.IndicativePriceField;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.fields.LowerCollarPriceField;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.fields.NumberOfExtensionsField;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.fields.ReferenceBuyQuantityField;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.fields.ReferencePriceField;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.fields.ReferenceSellQuantityField;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.fields.SecurityIdField;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.fields.TieBreakerPriceField;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.fields.TimestampField;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.fields.UpperCollarPriceField;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.types.Field;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.types.Message;
import omi.ltse.ltseequities.memoirdepthfeed.sbe.v2_0.types.PrintOptions;

/**
 * Represents the AuctionStatusMessage message from the MemoirDepthFeed protocol.
 *
 * <p>AuctionStatusMessage</p>
 */
public final class AuctionStatusMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0013';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 87;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Status Message";

    /**
     * Timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * SecurityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * AuctionID
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * AuctionType
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * TieBreakerPrice
     */
    private final TieBreakerPriceField tieBreakerPrice = new TieBreakerPriceField();

    /**
     * LowerCollarPrice
     */
    private final LowerCollarPriceField lowerCollarPrice = new LowerCollarPriceField();

    /**
     * UpperCollarPrice
     */
    private final UpperCollarPriceField upperCollarPrice = new UpperCollarPriceField();

    /**
     * ReferencePrice
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * ReferenceBuyQuantity
     */
    private final ReferenceBuyQuantityField referenceBuyQuantity = new ReferenceBuyQuantityField();

    /**
     * ReferenceSellQuantity
     */
    private final ReferenceSellQuantityField referenceSellQuantity = new ReferenceSellQuantityField();

    /**
     * IndicativePrice
     */
    private final IndicativePriceField indicativePrice = new IndicativePriceField();

    /**
     * AuctionOnlyPrice
     */
    private final AuctionOnlyPriceField auctionOnlyPrice = new AuctionOnlyPriceField();

    /**
     * NumberOfExtensions
     */
    private final NumberOfExtensionsField numberOfExtensions = new NumberOfExtensionsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, securityId, auctionId, auctionType, tieBreakerPrice, lowerCollarPrice, upperCollarPrice, referencePrice, referenceBuyQuantity, referenceSellQuantity, indicativePrice, auctionOnlyPrice, numberOfExtensions);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Timestamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * SecurityID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * AuctionID
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * AuctionType
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * TieBreakerPrice
     *
     * @return the TieBreakerPrice field
     */
    public TieBreakerPriceField tieBreakerPrice() {
        return tieBreakerPrice;
    }

    /**
     * LowerCollarPrice
     *
     * @return the LowerCollarPrice field
     */
    public LowerCollarPriceField lowerCollarPrice() {
        return lowerCollarPrice;
    }

    /**
     * UpperCollarPrice
     *
     * @return the UpperCollarPrice field
     */
    public UpperCollarPriceField upperCollarPrice() {
        return upperCollarPrice;
    }

    /**
     * ReferencePrice
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * ReferenceBuyQuantity
     *
     * @return the ReferenceBuyQuantity field
     */
    public ReferenceBuyQuantityField referenceBuyQuantity() {
        return referenceBuyQuantity;
    }

    /**
     * ReferenceSellQuantity
     *
     * @return the ReferenceSellQuantity field
     */
    public ReferenceSellQuantityField referenceSellQuantity() {
        return referenceSellQuantity;
    }

    /**
     * IndicativePrice
     *
     * @return the IndicativePrice field
     */
    public IndicativePriceField indicativePrice() {
        return indicativePrice;
    }

    /**
     * AuctionOnlyPrice
     *
     * @return the AuctionOnlyPrice field
     */
    public AuctionOnlyPriceField auctionOnlyPrice() {
        return auctionOnlyPrice;
    }

    /**
     * NumberOfExtensions
     *
     * @return the NumberOfExtensions field
     */
    public NumberOfExtensionsField numberOfExtensions() {
        return numberOfExtensions;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!tieBreakerPrice.parse(data, cursor)) {
            return false;
        }
        cursor += TieBreakerPriceField.BYTE_LENGTH;
        if (!lowerCollarPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowerCollarPriceField.BYTE_LENGTH;
        if (!upperCollarPrice.parse(data, cursor)) {
            return false;
        }
        cursor += UpperCollarPriceField.BYTE_LENGTH;
        if (!referencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceField.BYTE_LENGTH;
        if (!referenceBuyQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ReferenceBuyQuantityField.BYTE_LENGTH;
        if (!referenceSellQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ReferenceSellQuantityField.BYTE_LENGTH;
        if (!indicativePrice.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativePriceField.BYTE_LENGTH;
        if (!auctionOnlyPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionOnlyPriceField.BYTE_LENGTH;
        return numberOfExtensions.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = tieBreakerPrice.encode(data, cursor);
        cursor = lowerCollarPrice.encode(data, cursor);
        cursor = upperCollarPrice.encode(data, cursor);
        cursor = referencePrice.encode(data, cursor);
        cursor = referenceBuyQuantity.encode(data, cursor);
        cursor = referenceSellQuantity.encode(data, cursor);
        cursor = indicativePrice.encode(data, cursor);
        cursor = auctionOnlyPrice.encode(data, cursor);
        cursor = numberOfExtensions.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "SecurityId" -> Optional.of(securityId);
            case "AuctionId" -> Optional.of(auctionId);
            case "AuctionType" -> Optional.of(auctionType);
            case "TieBreakerPrice" -> Optional.of(tieBreakerPrice);
            case "LowerCollarPrice" -> Optional.of(lowerCollarPrice);
            case "UpperCollarPrice" -> Optional.of(upperCollarPrice);
            case "ReferencePrice" -> Optional.of(referencePrice);
            case "ReferenceBuyQuantity" -> Optional.of(referenceBuyQuantity);
            case "ReferenceSellQuantity" -> Optional.of(referenceSellQuantity);
            case "IndicativePrice" -> Optional.of(indicativePrice);
            case "AuctionOnlyPrice" -> Optional.of(auctionOnlyPrice);
            case "NumberOfExtensions" -> Optional.of(numberOfExtensions);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AuctionStatusMessage message)) {
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
        if (!(other instanceof AuctionStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
