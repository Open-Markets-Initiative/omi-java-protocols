package omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields;

import java.util.Objects;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.enums.ExecutingTrader;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.ByteOps;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.FieldKind;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.PrintOptions;

/**
 * Identifier of the trading member/participant who made the execution decision.
 */
public final class ExecutingTraderField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 4;

    /**
     * This field's declared name.
     */
    public static final String NAME = "ExecutingTrader";

    /**
     * Whether the wire value is stored least significant byte first.
     */
    public static final boolean LITTLE_ENDIAN = true;

    private ExecutingTrader value;

    /**
     * The undecoded wire value, retained so the field re-encodes exactly as it arrived.
     */
    private long rawValue;

    /**
     * Returns the declared value this field decoded to.
     *
     * @return the decoded value, or null when the field has not decoded or holds an undeclared value
     */
    public ExecutingTrader value() {
        return value;
    }

    /**
     * Sets the value, deriving the wire encoding from it.
     *
     * @param value the value to encode, or null to clear the field
     */
    public void value(ExecutingTrader value) {
        this.value = value;
        this.rawValue = value == null ? 0L : value.wire();
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
        return FieldKind.ENUM;
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

        this.rawValue = ByteOps.unsigned(data, offset, BYTE_LENGTH, LITTLE_ENDIAN);
        this.value = ExecutingTrader.fromWire(rawValue).orElse(null);
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

    /**
     * Returns whether the decoded wire value is one the protocol declares.
     *
     * <p>An undeclared value still decodes: the wire encoding is available from {@link #rawValue()} and re-encodes unchanged.</p>
     *
     * @return true when the value is a declared one
     */
    @Override
    public boolean isRecognized() {
        return hasValue() && value != null;
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        if (value == null) {
            builder.append("<undeclared ").append(Long.toUnsignedString(rawValue)).append('>');
        } else {
            builder.append(value.name());
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExecutingTraderField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && rawValue == field.rawValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), rawValue);
    }
}
