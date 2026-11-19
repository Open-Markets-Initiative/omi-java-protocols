package omi.zerocopy.iex.iexequities.deep.iextp.v1_06.enums;

/**
 * Operational halt status identifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OperationalHaltStatus {

    /**
     * Iex Specific Operational Trading Halt
     */
    IEX_SPECIFIC_OPERATIONAL_TRADING_HALT('O'),

    /**
     * Not Operationally Halted On Iex
     */
    NOT_OPERATIONALLY_HALTED_ON_IEX('N');

    private static final OperationalHaltStatus[] BY_WIRE = new OperationalHaltStatus[256];

    static {
        for (OperationalHaltStatus value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    OperationalHaltStatus(char wire) {
        this.wire = wire;
    }

    /**
     * Gets the value as it is sent.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Looks a value up from its wire form, allocating nothing.
     *
     * @param wire the wire value
     * @return the value, or null when the protocol declares none for it
     */
    public static OperationalHaltStatus get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
