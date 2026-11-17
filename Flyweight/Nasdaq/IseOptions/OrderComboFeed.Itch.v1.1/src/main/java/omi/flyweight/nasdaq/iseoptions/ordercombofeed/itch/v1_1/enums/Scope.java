package omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

/**
 * Scope value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Scope {

    /**
     * Local
     */
    LOCAL('L'),

    /**
     * National
     */
    NATIONAL('N');

    private static final Scope[] BY_WIRE = new Scope[256];

    static {
        for (Scope value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    Scope(char wire) {
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
    public static Scope get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
