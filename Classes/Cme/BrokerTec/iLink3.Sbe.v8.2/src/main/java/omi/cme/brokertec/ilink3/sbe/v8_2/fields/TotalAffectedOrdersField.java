package omi.cme.brokertec.ilink3.sbe.v8_2.fields;

import java.util.Objects;
import omi.cme.brokertec.ilink3.sbe.v8_2.types.ByteOps;
import omi.cme.brokertec.ilink3.sbe.v8_2.types.Field;
import omi.cme.brokertec.ilink3.sbe.v8_2.types.FieldKind;
import omi.cme.brokertec.ilink3.sbe.v8_2.types.PrintOptions;

/**
 * Total number of orders affected by the Order Mass Action Request. Will be returned as zero for rejects or if request is accepted but no orders could be cancelled. If fragmented then this is the sum of NoAffectedOrders across all messages with the same MassActionReportID. Otherwise will have same value as NoAffectedOrders when one or more orders is cancelled.
 */
public final class TotalAffectedOrdersField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "TotalAffectedOrders";

    private short value;

    /**
     * Returns the decoded value.
     *
     * @return the decoded value, zero when the field has not decoded
     */
    public short value() {
        return value;
    }

    /**
     * Sets the value to encode.
     *
     * @param value the value to encode
     */
    public void value(short value) {
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

        this.value = (short) ByteOps.unsigned(data, offset, BYTE_LENGTH, false);
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
        this.value = (short) 0;
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
        if (!(other instanceof TotalAffectedOrdersField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
