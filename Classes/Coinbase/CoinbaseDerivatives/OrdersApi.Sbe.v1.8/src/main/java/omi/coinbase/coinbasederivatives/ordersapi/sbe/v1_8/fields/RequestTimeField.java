package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.fields;

import java.time.Instant;
import java.util.Objects;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.types.ByteOps;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.types.Field;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.types.FieldKind;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.types.PrintOptions;

/**
 * requestTime
 *
 * <p>Nanoseconds since the Unix epoch, decoded to an Instant with nanosecond precision.</p>
 */
public final class RequestTimeField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This field's declared name.
     */
    public static final String NAME = "RequestTime";

    /**
     * Whether the wire value is stored least significant byte first.
     */
    public static final boolean LITTLE_ENDIAN = true;

    private Instant value;

    /**
     * The undecoded wire value, retained so the field re-encodes exactly as it arrived.
     */
    private long rawValue;

    /**
     * Returns the decoded timestamp.
     *
     * @return the decoded value, or null when the field has not decoded
     */
    public Instant value() {
        return value;
    }

    /**
     * Sets the timestamp, deriving the wire nanosecond count from it.
     *
     * @param value the timestamp to encode
     */
    public void value(Instant value) {
        this.value = value;
        this.rawValue = value == null ? 0L : Math.addExact(
            Math.multiplyExact(value.getEpochSecond(), 1_000_000_000L), value.getNano());
        markSet(value != null);
    }

    /**
     * Returns the undecoded wire value.
     *
     * @return the value exactly as it appeared on the wire
     */
    public long rawValue() {
        return rawValue;
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public FieldKind kind() {
        return FieldKind.TIMESTAMP;
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

        this.rawValue = ByteOps.signed(data, offset, BYTE_LENGTH, LITTLE_ENDIAN);
        this.value = Instant.ofEpochSecond(
                Math.floorDiv(rawValue, 1_000_000_000L), Math.floorMod(rawValue, 1_000_000_000L));
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        ByteOps.put(data, offset, BYTE_LENGTH, rawValue, LITTLE_ENDIAN);
        return offset + BYTE_LENGTH;
    }

    @Override
    public void reset() {
        super.reset();
        this.value = null;
        this.rawValue = 0L;
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
        if (!(other instanceof RequestTimeField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && rawValue == field.rawValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), rawValue);
    }
}
