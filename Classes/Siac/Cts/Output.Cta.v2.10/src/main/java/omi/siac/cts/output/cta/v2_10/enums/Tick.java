package omi.siac.cts.output.cta.v2_10.enums;

import java.util.Optional;

/**
 * Represents for a Participant the upward, downward or unchanged price movement in a security's trades
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Tick {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * Upward
     */
    UPWARD('1', "Upward"),

    /**
     * Downward
     */
    DOWNWARD('2', "Downward"),

    /**
     * Unchanged Upward
     */
    UNCHANGED_UPWARD('3', "Unchanged Upward"),

    /**
     * Unchanged Downward
     */
    UNCHANGED_DOWNWARD('4', "Unchanged Downward");

    private final char wire;

    private final String description;

    Tick(char wire, String description) {
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
    public static Optional<Tick> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case '1' -> Optional.of(UPWARD);
            case '2' -> Optional.of(DOWNWARD);
            case '3' -> Optional.of(UNCHANGED_UPWARD);
            case '4' -> Optional.of(UNCHANGED_DOWNWARD);
            default -> Optional.empty();
        };
    }
}
