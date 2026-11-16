package omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

/**
 * Option Type:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OptionType {

    /**
     * Call option
     */
    CALL('C'),

    /**
     * Put option
     */
    PUT('P'),

    /**
     * Stock Leg
     */
    STOCK(' ');

    private static final OptionType[] BY_WIRE = new OptionType[256];

    static {
        for (OptionType value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    OptionType(char wire) {
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
    public static OptionType get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
