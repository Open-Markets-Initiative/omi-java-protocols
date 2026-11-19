package omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.AtmField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.CallPremiumField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.CallVolatilityField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.DeltaField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.PutPremiumField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.PutVolatilityField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.StrikePriceField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.fields.SurfaceDomainField;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.types.GroupEntry;
import omi.lme.lmeselect.referencepricessnapshot.lmesource.v4_18.types.PrintOptions;

/**
 * One entry of the VolatilityPoints repeating group.
 *
 * <p>One point of the reference volatility curve. The specification's length formula names the repeat NumVolatilityRecords, a field no table of this message declares; RecordCount is the count it gives, as the number of reference volatility points in this message</p>
 */
public final class VolatilityPointsEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 50;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "VolatilityPoints";

    /**
     * Indicates whether the reference volatility was created in Delta or Strike space.
     */
    private final SurfaceDomainField surfaceDomain = new SurfaceDomainField();

    /**
     * Option delta for the volatility point, in implicit six decimal place format.
     */
    private final DeltaField delta = new DeltaField();

    /**
     * Strike price for the volatility point, in implicit six decimal place format.
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Identifies the ATM strike, one, or delta point, zero.
     */
    private final AtmField atm = new AtmField();

    /**
     * Call volatility, in implicit six decimal place format.
     */
    private final CallVolatilityField callVolatility = new CallVolatilityField();

    /**
     * Put volatility, in implicit six decimal place format.
     */
    private final PutVolatilityField putVolatility = new PutVolatilityField();

    /**
     * Call premium, in implicit six decimal place format.
     */
    private final CallPremiumField callPremium = new CallPremiumField();

    /**
     * Put premium, in implicit six decimal place format.
     */
    private final PutPremiumField putPremium = new PutPremiumField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(surfaceDomain, delta, strikePrice, atm, callVolatility, putVolatility, callPremium, putPremium);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Indicates whether the reference volatility was created in Delta or Strike space.
     *
     * @return the SurfaceDomain field
     */
    public SurfaceDomainField surfaceDomain() {
        return surfaceDomain;
    }

    /**
     * Option delta for the volatility point, in implicit six decimal place format.
     *
     * @return the Delta field
     */
    public DeltaField delta() {
        return delta;
    }

    /**
     * Strike price for the volatility point, in implicit six decimal place format.
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Identifies the ATM strike, one, or delta point, zero.
     *
     * @return the Atm field
     */
    public AtmField atm() {
        return atm;
    }

    /**
     * Call volatility, in implicit six decimal place format.
     *
     * @return the CallVolatility field
     */
    public CallVolatilityField callVolatility() {
        return callVolatility;
    }

    /**
     * Put volatility, in implicit six decimal place format.
     *
     * @return the PutVolatility field
     */
    public PutVolatilityField putVolatility() {
        return putVolatility;
    }

    /**
     * Call premium, in implicit six decimal place format.
     *
     * @return the CallPremium field
     */
    public CallPremiumField callPremium() {
        return callPremium;
    }

    /**
     * Put premium, in implicit six decimal place format.
     *
     * @return the PutPremium field
     */
    public PutPremiumField putPremium() {
        return putPremium;
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
        if (!surfaceDomain.parse(data, cursor)) {
            return false;
        }
        cursor += SurfaceDomainField.BYTE_LENGTH;
        if (!delta.parse(data, cursor)) {
            return false;
        }
        cursor += DeltaField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!atm.parse(data, cursor)) {
            return false;
        }
        cursor += AtmField.BYTE_LENGTH;
        if (!callVolatility.parse(data, cursor)) {
            return false;
        }
        cursor += CallVolatilityField.BYTE_LENGTH;
        if (!putVolatility.parse(data, cursor)) {
            return false;
        }
        cursor += PutVolatilityField.BYTE_LENGTH;
        if (!callPremium.parse(data, cursor)) {
            return false;
        }
        cursor += CallPremiumField.BYTE_LENGTH;
        return putPremium.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = surfaceDomain.encode(data, cursor);
        cursor = delta.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = atm.encode(data, cursor);
        cursor = callVolatility.encode(data, cursor);
        cursor = putVolatility.encode(data, cursor);
        cursor = callPremium.encode(data, cursor);
        cursor = putPremium.encode(data, cursor);
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
            case "SurfaceDomain" -> Optional.of(surfaceDomain);
            case "Delta" -> Optional.of(delta);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "Atm" -> Optional.of(atm);
            case "CallVolatility" -> Optional.of(callVolatility);
            case "PutVolatility" -> Optional.of(putVolatility);
            case "CallPremium" -> Optional.of(callPremium);
            case "PutPremium" -> Optional.of(putPremium);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof VolatilityPointsEntry message)) {
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
        if (!(other instanceof VolatilityPointsEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
