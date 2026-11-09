package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields;

import java.util.Objects;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.ByteOps;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.FieldKind;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.PrintOptions;

/**
 * BitfieldOrderInstructions is a data structure defining a number of order instructions, attributes, and modifiers.
 *
 * <p>A 8-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class BitfieldOrderInstructionsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This field's declared name.
     */
    public static final String NAME = "BitfieldOrderInstructions";

    /**
     * Whether the container is stored least significant byte first.
     *
     * <p>A bitfield container carries an endianness trait only when the model states one; absent that, the bitfield convention of least significant byte first applies.</p>
     */
    public static final boolean LITTLE_ENDIAN = true;

    private long value;

    /**
     * Returns the whole bitfield container. Prefer the named accessors below.
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

    /**
     * Bits reserved for future use
     *
     * @return bits 0 through 11 of the container
     */
    public int unused() {
        return (int) (value & 0xFFFL);
    }

    /**
     * When populating both MPSubID and SelfTradeType on an order, allows the firm to specify whether the MPSubID should be used or ignored for Self-Trade Prevention (STP) evaluation. See “Self-Trade Prevention” section of this spec for more details.
     *
     * @return bit 12 of the container
     */
    public boolean subIdIndicator() {
        return ((value >>> 12) & 1L) != 0L;
    }

    /**
     * SpecialOrdType
     *
     * @return bits 13 through 16 of the container
     */
    public int specialOrdType() {
        return (int) ((value >>> 13) & 0xFL);
    }

    /**
     * 0 = No LocateReqd
     *
     * @return bit 17 of the container
     */
    public boolean locateReqd() {
        return ((value >>> 17) & 1L) != 0L;
    }

    /**
     * RetailIndicator
     *
     * @return bit 18 of the container
     */
    public boolean retailIndicator() {
        return ((value >>> 18) & 1L) != 0L;
    }

    /**
     * 0 = Not Attributed
     *
     * @return bits 19 through 21 of the container
     */
    public int attributedQuote() {
        return (int) ((value >>> 19) & 0x7L);
    }

    /**
     * OrderCapacity
     *
     * @return bits 22 through 24 of the container
     */
    public int orderCapacity() {
        return (int) ((value >>> 22) & 0x7L);
    }

    /**
     * InterestType
     *
     * @return bits 25 through 27 of the container
     */
    public int interestType() {
        return (int) ((value >>> 25) & 0x7L);
    }

    /**
     * TradingSessionID
     *
     * @return bits 28 through 30 of the container
     */
    public int tradingSessionId() {
        return (int) ((value >>> 28) & 0x7L);
    }

    /**
     * TimeInForce
     *
     * @return bits 31 through 33 of the container
     */
    public int timeInForce() {
        return (int) ((value >>> 31) & 0x7L);
    }

    /**
     * ProactiveIfLocked
     *
     * @return bits 34 through 36 of the container
     */
    public int proactiveIfLocked() {
        return (int) ((value >>> 34) & 0x7L);
    }

    /**
     * SelfTradeType
     *
     * @return bits 37 through 39 of the container
     */
    public int selfTradeType() {
        return (int) ((value >>> 37) & 0x7L);
    }

    /**
     * CancelInsteadOfReprice
     *
     * @return bits 40 through 43 of the container
     */
    public int cancelInsteadOfReprice() {
        return (int) ((value >>> 40) & 0xFL);
    }

    /**
     * RoutingInst
     *
     * @return bits 44 through 47 of the container
     */
    public int routingInst() {
        return (int) ((value >>> 44) & 0xFL);
    }

    /**
     * ExtendedExecInst
     *
     * @return bits 48 through 51 of the container
     */
    public int extendedExecInst() {
        return (int) ((value >>> 48) & 0xFL);
    }

    /**
     * ExecInst
     *
     * @return bits 52 through 55 of the container
     */
    public int execInst() {
        return (int) ((value >>> 52) & 0xFL);
    }

    /**
     * OrdType
     *
     * @return bits 56 through 59 of the container
     */
    public int ordType() {
        return (int) ((value >>> 56) & 0xFL);
    }

    /**
     * Side
     *
     * @return bits 60 through 63 of the container
     */
    public int sideBits() {
        return (int) ((value >>> 60) & 0xFL);
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

        builder.append("0x").append(Long.toHexString(value));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitfieldOrderInstructionsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
