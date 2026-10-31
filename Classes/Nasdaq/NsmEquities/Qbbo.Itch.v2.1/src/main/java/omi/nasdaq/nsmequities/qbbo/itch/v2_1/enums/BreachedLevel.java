package omi.nasdaq.nsmequities.qbbo.itch.v2_1.enums;

import java.util.Optional;

/**
 * Denotes the MWCB Level that was breached.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BreachedLevel {

    /**
     * Level 1
     */
    LEVEL_1('1', "Level 1"),

    /**
     * Level 2
     */
    LEVEL_2('2', "Level 2"),

    /**
     * Level 3
     */
    LEVEL_3('3', "Level 3");

    private final char wire;

    private final String description;

    BreachedLevel(char wire, String description) {
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
    public static Optional<BreachedLevel> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(LEVEL_1);
            case '2' -> Optional.of(LEVEL_2);
            case '3' -> Optional.of(LEVEL_3);
            default -> Optional.empty();
        };
    }
}
