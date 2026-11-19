package omi.nse.nsecom.orderentry.nnf.v3_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.BuySellField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.LastActivityReferenceField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.LastModifiedField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.OrderNumberField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.PriceField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.ReferenceField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.TokenNoField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.TraderIdField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.VolumeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.Field;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.Message;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.PrintOptions;

/**
 * Represents the PriceModInMessage message from the OrderEntry protocol.
 *
 * <p>2013 PRICE_MOD 106 I, carried in the PRICE_MOD structure</p>
 */
public final class PriceModInMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 66;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Price Mod In Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 42, 24 };

    /**
     * This is the Token Number of the contract for which this order was originally placed
     */
    private final TokenNoField tokenNo = new TokenNoField();

    /**
     * This field should contain the trader ID
     */
    private final TraderIdField traderId = new TraderIdField();

    /**
     * This field must be sent as blank for the order entry request
     */
    private final OrderNumberField orderNumber = new OrderNumberField();

    /**
     * This field should contain one of the following values to specify whether the order is a buy or sell order. ‘1’ denotes Buy order ‘2’ denotes Sell order Note: - Must follow same rules as mentioned in Order Modification section in this NNF do
     */
    private final BuySellField buySell = new BuySellField();

    /**
     * This field should contain the price at which the order is placed
     */
    private final PriceField price = new PriceField();

    /**
     * This field should contain the order quantity
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Value of the Last modified time stamp as received on last transaction response
     */
    private final LastModifiedField lastModified = new LastModifiedField();

    /**
     * The front-end may use this field at their discretion
     */
    private final ReferenceField reference = new ReferenceField();

    /**
     * In case of order entry response, this field will contain a unique value
     */
    private final LastActivityReferenceField lastActivityReference = new LastActivityReferenceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tokenNo, traderId, orderNumber, buySell, price, volume, lastModified, reference, lastActivityReference);

    private byte[] buffer;

    private boolean decoded;

    /**
     * This is the Token Number of the contract for which this order was originally placed
     *
     * @return the TokenNo field
     */
    public TokenNoField tokenNo() {
        return tokenNo;
    }

    /**
     * This field should contain the trader ID
     *
     * @return the TraderId field
     */
    public TraderIdField traderId() {
        return traderId;
    }

    /**
     * This field must be sent as blank for the order entry request
     *
     * @return the OrderNumber field
     */
    public OrderNumberField orderNumber() {
        return orderNumber;
    }

    /**
     * This field should contain one of the following values to specify whether the order is a buy or sell order. ‘1’ denotes Buy order ‘2’ denotes Sell order Note: - Must follow same rules as mentioned in Order Modification section in this NNF do
     *
     * @return the BuySell field
     */
    public BuySellField buySell() {
        return buySell;
    }

    /**
     * This field should contain the price at which the order is placed
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * This field should contain the order quantity
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Value of the Last modified time stamp as received on last transaction response
     *
     * @return the LastModified field
     */
    public LastModifiedField lastModified() {
        return lastModified;
    }

    /**
     * The front-end may use this field at their discretion
     *
     * @return the Reference field
     */
    public ReferenceField reference() {
        return reference;
    }

    /**
     * In case of order entry response, this field will contain a unique value
     *
     * @return the LastActivityReference field
     */
    public LastActivityReferenceField lastActivityReference() {
        return lastActivityReference;
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
        if (!tokenNo.parse(data, cursor)) {
            return false;
        }
        cursor += TokenNoField.BYTE_LENGTH;
        if (!traderId.parse(data, cursor)) {
            return false;
        }
        cursor += TraderIdField.BYTE_LENGTH;
        if (!orderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderNumberField.BYTE_LENGTH;
        if (!buySell.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!lastModified.parse(data, cursor)) {
            return false;
        }
        cursor += LastModifiedField.BYTE_LENGTH;
        if (!reference.parse(data, cursor)) {
            return false;
        }
        cursor += ReferenceField.BYTE_LENGTH;
        if (!lastActivityReference.parse(data, cursor)) {
            return false;
        }
        cursor += LastActivityReferenceField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tokenNo.encode(data, cursor);
        cursor = traderId.encode(data, cursor);
        cursor = orderNumber.encode(data, cursor);
        cursor = buySell.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = lastModified.encode(data, cursor);
        cursor = reference.encode(data, cursor);
        cursor = lastActivityReference.encode(data, cursor);
        if (buffer != null && buffer.length >= 66) {
            System.arraycopy(buffer, 42, data, cursor, 24); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 24, (byte) 0); // padding
        }
        cursor += 24;
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
            case "TokenNo" -> Optional.of(tokenNo);
            case "TraderId" -> Optional.of(traderId);
            case "OrderNumber" -> Optional.of(orderNumber);
            case "BuySell" -> Optional.of(buySell);
            case "Price" -> Optional.of(price);
            case "Volume" -> Optional.of(volume);
            case "LastModified" -> Optional.of(lastModified);
            case "Reference" -> Optional.of(reference);
            case "LastActivityReference" -> Optional.of(lastActivityReference);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PriceModInMessage message)) {
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
        if (!(other instanceof PriceModInMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
