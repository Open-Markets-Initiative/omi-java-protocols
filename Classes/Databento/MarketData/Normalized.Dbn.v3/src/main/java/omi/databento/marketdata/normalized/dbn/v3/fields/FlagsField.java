package omi.databento.marketdata.normalized.dbn.v3.fields;

import java.util.Objects;
import omi.databento.marketdata.normalized.dbn.v3.types.ByteOps;
import omi.databento.marketdata.normalized.dbn.v3.types.Field;
import omi.databento.marketdata.normalized.dbn.v3.types.FieldKind;
import omi.databento.marketdata.normalized.dbn.v3.types.PrintOptions;

/**
 * A bit field indicating event end, message characteristics, and data quality; declared least significant bit first
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class FlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "Flags";

    private byte value;

    /**
     * Returns the whole bitfield container. Prefer the named accessors below.
     *
     * @return the decoded value, zero when the field has not decoded
     */
    public byte value() {
        return value;
    }

    /**
     * Sets the value to encode.
     *
     * @param value the value to encode
     */
    public void value(byte value) {
        this.value = value;
        markSet(true);
    }

    /**
     * Bit 0, unused
     *
     * @return bit 0 of the container
     */
    public boolean reservedFlag() {
        return (value & 1L) != 0L;
    }

    /**
     * Indicates a publisher-specific event (bit 1)
     *
     * @return bit 1 of the container
     */
    public boolean publisherSpecific() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Indicates an unrecoverable gap was detected in the channel (bit 2)
     *
     * @return bit 2 of the container
     */
    public boolean maybeBadBook() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Indicates the ts_recv value is inaccurate due to clock issues or packet reordering (bit 3)
     *
     * @return bit 3 of the container
     */
    public boolean badTsRecv() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Indicates an aggregated price level message, not an individual order (bit 4)
     *
     * @return bit 4 of the container
     */
    public boolean mbp() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Indicates the message was sourced from a replay, such as a snapshot server (bit 5)
     *
     * @return bit 5 of the container
     */
    public boolean snapshot() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Indicates a top-of-book message, not an individual order (bit 6)
     *
     * @return bit 6 of the container
     */
    public boolean tob() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Marks the last record in a single event for a given instrument_id (bit 7)
     *
     * @return bit 7 of the container
     */
    public boolean last() {
        return ((value >>> 7) & 1L) != 0L;
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public FieldKind kind() {
        return FieldKind.BITFIELD;
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

        this.value = (byte) ByteOps.unsigned(data, offset, BYTE_LENGTH, false);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        ByteOps.put(data, offset, BYTE_LENGTH, value, false);
        return offset + BYTE_LENGTH;
    }

    @Override
    public void reset() {
        super.reset();
        this.value = (byte) 0;
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append("0x").append(Integer.toHexString(value & 0xFF));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
