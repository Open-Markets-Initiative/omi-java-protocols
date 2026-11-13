package omi.zerocopy.iex.iexequities.tops.iextp.v1_64.enums;

/**
 * Security event identifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityEvent {

    /**
     * Opening Process Complete
     */
    OPENING_PROCESS_COMPLETE('O'),

    /**
     * Closing Process Complete
     */
    CLOSING_PROCESS_COMPLETE('C');

    private static final SecurityEvent[] BY_WIRE = new SecurityEvent[256];

    static {
        for (SecurityEvent value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    SecurityEvent(char wire) {
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
    public static SecurityEvent get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
