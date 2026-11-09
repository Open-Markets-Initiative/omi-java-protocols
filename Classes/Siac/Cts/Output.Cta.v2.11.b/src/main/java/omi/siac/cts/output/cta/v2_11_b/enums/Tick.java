package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Represents for a Participant the upward, downward or unchanged price movement in a security's trades
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Tick {

    /**
     * Tick Not Applicable
     */
    TICK_NOT_APPLICABLE(' ', "Tick Not Applicable"),

    /**
     * Up Tick
     */
    UP_TICK('1', "Up Tick"),

    /**
     * Down Tick
     */
    DOWN_TICK('2', "Down Tick"),

    /**
     * Zero Up Tick
     */
    ZERO_UP_TICK('3', "Zero Up Tick"),

    /**
     * Zero Down Tick
     */
    ZERO_DOWN_TICK('4', "Zero Down Tick");

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
            case ' ' -> Optional.of(TICK_NOT_APPLICABLE);
            case '1' -> Optional.of(UP_TICK);
            case '2' -> Optional.of(DOWN_TICK);
            case '3' -> Optional.of(ZERO_UP_TICK);
            case '4' -> Optional.of(ZERO_DOWN_TICK);
            default -> Optional.empty();
        };
    }
}
