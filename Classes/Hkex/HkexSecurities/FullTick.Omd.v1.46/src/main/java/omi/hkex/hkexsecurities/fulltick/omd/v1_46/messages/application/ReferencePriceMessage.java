package omi.hkex.hkexsecurities.fulltick.omd.v1_46.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.hkex.hkexsecurities.fulltick.omd.v1_46.fields.LowerPriceField;
import omi.hkex.hkexsecurities.fulltick.omd.v1_46.fields.ReferencePriceField;
import omi.hkex.hkexsecurities.fulltick.omd.v1_46.fields.SecurityCodeField;
import omi.hkex.hkexsecurities.fulltick.omd.v1_46.fields.UpperPriceField;
import omi.hkex.hkexsecurities.fulltick.omd.v1_46.types.Field;
import omi.hkex.hkexsecurities.fulltick.omd.v1_46.types.Message;
import omi.hkex.hkexsecurities.fulltick.omd.v1_46.types.PrintOptions;

/**
 * Represents the ReferencePriceMessage message from the FullTick protocol.
 *
 * <p>Reference price, lower and upper price limits for order input during an applicable auction session (POS or CAS). Sent again when there is any change.</p>
 */
public final class ReferencePriceMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 16;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Reference Price Message";

    /**
     * Uniquely identifies a security available for trading. 5 digit security codes with possible values 1 to 99999.
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Reference price of the security for order input in POS and CAS. 3 implied decimal places. 0 if the reference price is not available.
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * Lower price limit of at-auction Limit sell order in POS No Cancellation and Random Matching periods, or lower price of the allowed price band in CAS. 3 implied decimal places. 0 means Not available.
     */
    private final LowerPriceField lowerPrice = new LowerPriceField();

    /**
     * Upper price limit of at-auction Limit buy order in POS No Cancellation and Random Matching periods, or upper price of the allowed price band in CAS. 3 implied decimal places. 0 means Not available.
     */
    private final UpperPriceField upperPrice = new UpperPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityCode, referencePrice, lowerPrice, upperPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Uniquely identifies a security available for trading. 5 digit security codes with possible values 1 to 99999.
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Reference price of the security for order input in POS and CAS. 3 implied decimal places. 0 if the reference price is not available.
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * Lower price limit of at-auction Limit sell order in POS No Cancellation and Random Matching periods, or lower price of the allowed price band in CAS. 3 implied decimal places. 0 means Not available.
     *
     * @return the LowerPrice field
     */
    public LowerPriceField lowerPrice() {
        return lowerPrice;
    }

    /**
     * Upper price limit of at-auction Limit buy order in POS No Cancellation and Random Matching periods, or upper price of the allowed price band in CAS. 3 implied decimal places. 0 means Not available.
     *
     * @return the UpperPrice field
     */
    public UpperPriceField upperPrice() {
        return upperPrice;
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
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!referencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceField.BYTE_LENGTH;
        if (!lowerPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowerPriceField.BYTE_LENGTH;
        return upperPrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityCode.encode(data, cursor);
        cursor = referencePrice.encode(data, cursor);
        cursor = lowerPrice.encode(data, cursor);
        cursor = upperPrice.encode(data, cursor);
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
            case "SecurityCode" -> Optional.of(securityCode);
            case "ReferencePrice" -> Optional.of(referencePrice);
            case "LowerPrice" -> Optional.of(lowerPrice);
            case "UpperPrice" -> Optional.of(upperPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ReferencePriceMessage message)) {
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
        if (!(other instanceof ReferencePriceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
