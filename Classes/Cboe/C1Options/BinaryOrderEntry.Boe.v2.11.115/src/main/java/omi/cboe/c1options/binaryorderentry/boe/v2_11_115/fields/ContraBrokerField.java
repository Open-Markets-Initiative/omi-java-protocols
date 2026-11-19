package omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields;

import java.util.Objects;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.ByteOps;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.FieldKind;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * Corresponds to ContraBroker (375) in Cboe FIX. Simple Instrument Fills Internally matched simple executions will identify the clearing number of the contra on the execution. This includes leg fill reports (MultilegReportingType=2) that are sent as a result of a complex trade. Executions matched on the C1 trading floor will contain a value of ‘FBKR’ for ContraBroker for the first reporter of a Broker to Broker floor trade otherwise, this will identify the OCC clearing number of the contra (C1 only). Complex Package Fills ContraBroker will be sent and populated on electronic, complex package fills (MultilegReportingType=3) when the contra side is also a complex order. When legging in to the simple books ContraBroker will be blank. ContraBroker will be blank on complex package fills (MultilegReportingType=3) executed on the Cboe Options trading floor (C1 only). Routed Fills All externally matched (routed, BaseLiquidityIndicator = X) executions will identify the away exchange with the following possible values. AMEX = Routed to NYSE American ARCA = Routed to NYSE Arca BATS = Routed to Cboe BZX Options BOX = Routed to BOX CBOE = Routed to Cboe Options CTWO = Routed to C2 Options EDGX = Routed to Cboe EDGX Options EMLD = Routed to MIAX Emerald GMNI = Routed to Nasdaq GEMX IEX = Routed to IEX Options ISE = Routed to Nasdaq ISE MEMX = Routed to MEMX MERC = Routed to Nasdaq MRX MIAX = Routed to MIAX Options Exchange MXTO = Routed to MX2 Options NOMX = Routed to Nasdaq NOBX = Routed to Nasdaq Texas PERL = Routed to MIAX PEARL PHLX = Routed to Nasdaq PHLX SPHR = Routed to MIAX Sapphire
 *
 * <p>A 4-byte ASCII field padded with null characters. Trailing padding is stripped on decode.</p>
 */
public final class ContraBrokerField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 4;

    /**
     * This field's declared name.
     */
    public static final String NAME = "ContraBroker";

    /**
     * The byte this field is right-padded with (null characters).
     */
    public static final byte PADDING = 0;

    private String value = "";

    /**
     * Returns the decoded value.
     *
     * @return the decoded value, empty when the field has not decoded
     */
    public String value() {
        return value;
    }

    /**
     * Sets the value to encode.
     *
     * @param value the value to encode, or null to clear the field
     */
    public void value(String value) {
        this.value = value == null ? "" : value;
        markSet(value != null);
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public FieldKind kind() {
        return FieldKind.STRING;
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

        this.value = ByteOps.ascii(data, offset, BYTE_LENGTH, PADDING);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        ByteOps.putAscii(data, offset, BYTE_LENGTH, value, PADDING);
        return offset + BYTE_LENGTH;
    }

    @Override
    public void reset() {
        super.reset();
        this.value = "";
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append('\'').append(value).append('\'');
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContraBrokerField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && Objects.equals(value, field.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
