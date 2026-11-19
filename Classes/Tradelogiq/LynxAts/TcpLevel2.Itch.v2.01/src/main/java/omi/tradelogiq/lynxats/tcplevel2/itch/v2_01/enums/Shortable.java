package omi.tradelogiq.lynxats.tcplevel2.itch.v2_01.enums;

import java.util.Optional;

/**
 * Indicates the short status of a security
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Shortable {

    /**
     * short exempt
     */
    SHORT_EXEMPT('E', "short exempt"),

    /**
     * shortable
     */
    SHORTABLE('S', "shortable"),

    /**
     * not shortable
     */
    NOT_SHORTABLE('N', "not shortable");

    private final char wire;

    private final String description;

    Shortable(char wire, String description) {
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
    public static Optional<Shortable> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(SHORT_EXEMPT);
            case 'S' -> Optional.of(SHORTABLE);
            case 'N' -> Optional.of(NOT_SHORTABLE);
            default -> Optional.empty();
        };
    }
}
