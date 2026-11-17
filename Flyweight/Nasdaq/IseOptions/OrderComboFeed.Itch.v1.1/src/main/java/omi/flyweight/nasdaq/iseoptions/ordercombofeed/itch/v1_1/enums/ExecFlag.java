package omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

/**
 * ‘N’ = None ‘A’ = AON
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecFlag {

    /**
     * None
     */
    NONE('N'),

    /**
     * AON
     */
    AON('A');

    private static final ExecFlag[] BY_WIRE = new ExecFlag[256];

    static {
        for (ExecFlag value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    ExecFlag(char wire) {
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
    public static ExecFlag get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
