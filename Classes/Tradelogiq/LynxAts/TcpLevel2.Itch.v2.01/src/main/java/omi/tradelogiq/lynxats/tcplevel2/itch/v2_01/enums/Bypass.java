package omi.tradelogiq.lynxats.tcplevel2.itch.v2_01.enums;

import java.util.Optional;

/**
 * Whether the cross bypassed the order book
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Bypass {

    /**
     * Bypass
     */
    BYPASS('Y', "Bypass"),

    /**
     * Non Bypass
     */
    NON_BYPASS('N', "Non Bypass");

    private final char wire;

    private final String description;

    Bypass(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Returns the description the protocol specification gives this value.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Returns the value with the given wire encoding.
     *
     * @param wire the encoding read from the wire
     * @return the matching value, or empty when the protocol declares no value for it
     */
    public static Optional<Bypass> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(BYPASS);
            case 'N' -> Optional.of(NON_BYPASS);
            default -> Optional.empty();
        };
    }
}
