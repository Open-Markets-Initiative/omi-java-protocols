package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_33.fields;

import java.util.Objects;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_33.types.ByteOps;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_33.types.Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_33.types.FieldKind;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_33.types.PrintOptions;

/**
 * BitSet TradeCaptureReportAcknowledgmentV2 byte 12.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class TradeCaptureReportAcknowledgmentV2Bitfield12Field extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "TradeCaptureReportAcknowledgmentV2Bitfield12";

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
     * Trade Capture Report Acknowledgment V 2 Bitfield 12 Cti Code
     *
     * @return bit 0 of the container
     */
    public boolean tradeCaptureReportAcknowledgmentV2Bitfield12CtiCode() {
        return (value & 1L) != 0L;
    }

    /**
     * Trade Capture Report Acknowledgment V 2 Bitfield 12 Manual Order Indicator
     *
     * @return bit 1 of the container
     */
    public boolean tradeCaptureReportAcknowledgmentV2Bitfield12ManualOrderIndicator() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Trade Capture Report Acknowledgment V 2 Bitfield 12 Operator Id
     *
     * @return bit 2 of the container
     */
    public boolean tradeCaptureReportAcknowledgmentV2Bitfield12OperatorId() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Trade Capture Report Acknowledgment V 2 Bitfield 12 Trade Date
     *
     * @return bit 3 of the container
     */
    public boolean tradeCaptureReportAcknowledgmentV2Bitfield12TradeDate() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Trade Capture Report Acknowledgment V 2 Bitfield 12 Variance Price
     *
     * @return bit 4 of the container
     */
    public boolean tradeCaptureReportAcknowledgmentV2Bitfield12VariancePrice() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Trade Capture Report Acknowledgment V 2 Bitfield 12 Variance Size
     *
     * @return bit 5 of the container
     */
    public boolean tradeCaptureReportAcknowledgmentV2Bitfield12VarianceSize() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Trade Capture Report Acknowledgment V 2 Bitfield 12 Orig Symbol Id
     *
     * @return bit 6 of the container
     */
    public boolean tradeCaptureReportAcknowledgmentV2Bitfield12OrigSymbolId() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Trade Capture Report Acknowledgment V 2 Bitfield 12 Orig Tas Price
     *
     * @return bit 7 of the container
     */
    public boolean tradeCaptureReportAcknowledgmentV2Bitfield12OrigTasPrice() {
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
        if (!(other instanceof TradeCaptureReportAcknowledgmentV2Bitfield12Field field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
