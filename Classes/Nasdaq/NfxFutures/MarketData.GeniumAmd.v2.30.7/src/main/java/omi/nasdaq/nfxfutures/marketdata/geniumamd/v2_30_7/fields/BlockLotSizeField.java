package omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.fields;

import java.util.Objects;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.types.ByteOps;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.types.Field;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.types.FieldKind;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.types.PrintOptions;

/**
 * Indicates the number of securities that represent a block lot for the order book. NOTE: A value of 0 indicates that this lot type is undefined for the order book. The document states no data type for this field. Numeric is taken from the Nasdaq Nordic Equities TotalView Itch specification, which types Round Lot Size as Integer.
 *
 * <p>An unsigned 32-bit big-endian integer, widened to long.</p>
 */
public final class BlockLotSizeField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 4;

    /**
     * This field's declared name.
     */
    public static final String NAME = "BlockLotSize";

    /**
     * Whether the wire value is stored least significant byte first.
     */
    public static final boolean LITTLE_ENDIAN = false;

    private long value;

    /**
     * Returns the decoded value.
     *
     * @return the decoded value, zero when the field has not decoded
     */
    public long value() {
        return value;
    }

    /**
     * Sets the value to encode.
     *
     * @param value the value to encode
     */
    public void value(long value) {
        this.value = value;
        markSet(true);
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public FieldKind kind() {
        return FieldKind.UNSIGNED_INTEGER;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    @Override
    public boolean parse(byte[] data, int offset) {
        if (offset < 0 || offset + BYTE_LENGTH > data.length) {
            return false;
        }

        this.value = ByteOps.unsigned(data, offset, BYTE_LENGTH, LITTLE_ENDIAN);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        ByteOps.put(data, offset, BYTE_LENGTH, value, LITTLE_ENDIAN);
        return offset + BYTE_LENGTH;
    }

    @Override
    public void reset() {
        super.reset();
        this.value = 0L;
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append(value);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockLotSizeField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
