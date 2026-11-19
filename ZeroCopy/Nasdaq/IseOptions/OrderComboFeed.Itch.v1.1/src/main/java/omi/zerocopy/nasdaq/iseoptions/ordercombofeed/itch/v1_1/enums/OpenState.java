package omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

/**
 * Reflects the current eligibility for auto execution of the options security in the options market.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpenState {

    /**
     * Open for auto execution
     */
    OPEN_FOR_AUTO_EXECUTION('Y'),

    /**
     * Closed for auto execution
     */
    CLOSED_FOR_AUTO_EXECUTION('N');

    private static final OpenState[] BY_WIRE = new OpenState[256];

    static {
        for (OpenState value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    OpenState(char wire) {
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
    public static OpenState get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
