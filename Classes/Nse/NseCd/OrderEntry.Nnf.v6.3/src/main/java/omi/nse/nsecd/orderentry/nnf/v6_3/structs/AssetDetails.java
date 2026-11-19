package omi.nse.nsecd.orderentry.nnf.v6_3.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.AssetNameField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.ForeignInterestRateField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.MultiplierField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.PrecisionField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.TokenField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.VolatilityField;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Field;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.GroupEntry;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.PrintOptions;

/**
 * The AssetDetails record a message holds.
 *
 * <p>ASSET_DETAILS</p>
 */
public final class AssetDetails implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 26;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "AssetDetails";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 11, 1 };

    /**
     * This field contains the name of the asset
     */
    private final AssetNameField assetName = new AssetNameField();

    /**
     * This field contains the digits after decimal to be allowed for all price related fields for the contracts on this Asset
     */
    private final PrecisionField precision = new PrecisionField();

    /**
     * This field contains value of volatility
     */
    private final VolatilityField volatility = new VolatilityField();

    /**
     * This field contains the token number of the Asset
     */
    private final TokenField token = new TokenField();

    /**
     * This field contains the value by which each lot of the contract over this symbol is multiplied to get actual quantity of the request
     */
    private final MultiplierField multiplier = new MultiplierField();

    /**
     * This field contains value of foreign interest rate
     */
    private final ForeignInterestRateField foreignInterestRate = new ForeignInterestRateField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(assetName, precision, volatility, token, multiplier, foreignInterestRate);

    private byte[] buffer;

    private boolean decoded;

    /**
     * This field contains the name of the asset
     *
     * @return the AssetName field
     */
    public AssetNameField assetName() {
        return assetName;
    }

    /**
     * This field contains the digits after decimal to be allowed for all price related fields for the contracts on this Asset
     *
     * @return the Precision field
     */
    public PrecisionField precision() {
        return precision;
    }

    /**
     * This field contains value of volatility
     *
     * @return the Volatility field
     */
    public VolatilityField volatility() {
        return volatility;
    }

    /**
     * This field contains the token number of the Asset
     *
     * @return the Token field
     */
    public TokenField token() {
        return token;
    }

    /**
     * This field contains the value by which each lot of the contract over this symbol is multiplied to get actual quantity of the request
     *
     * @return the Multiplier field
     */
    public MultiplierField multiplier() {
        return multiplier;
    }

    /**
     * This field contains value of foreign interest rate
     *
     * @return the ForeignInterestRate field
     */
    public ForeignInterestRateField foreignInterestRate() {
        return foreignInterestRate;
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
        return PADDING.clone();
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
        if (!assetName.parse(data, cursor)) {
            return false;
        }
        cursor += AssetNameField.BYTE_LENGTH;
        if (!precision.parse(data, cursor)) {
            return false;
        }
        cursor += PrecisionField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!volatility.parse(data, cursor)) {
            return false;
        }
        cursor += VolatilityField.BYTE_LENGTH;
        if (!token.parse(data, cursor)) {
            return false;
        }
        cursor += TokenField.BYTE_LENGTH;
        if (!multiplier.parse(data, cursor)) {
            return false;
        }
        cursor += MultiplierField.BYTE_LENGTH;
        return foreignInterestRate.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = assetName.encode(data, cursor);
        cursor = precision.encode(data, cursor);
        if (buffer != null && buffer.length >= 12) {
            System.arraycopy(buffer, 11, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = volatility.encode(data, cursor);
        cursor = token.encode(data, cursor);
        cursor = multiplier.encode(data, cursor);
        cursor = foreignInterestRate.encode(data, cursor);
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
            case "AssetName" -> Optional.of(assetName);
            case "Precision" -> Optional.of(precision);
            case "Volatility" -> Optional.of(volatility);
            case "Token" -> Optional.of(token);
            case "Multiplier" -> Optional.of(multiplier);
            case "ForeignInterestRate" -> Optional.of(foreignInterestRate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof AssetDetails message)) {
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
        if (!(other instanceof AssetDetails message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
