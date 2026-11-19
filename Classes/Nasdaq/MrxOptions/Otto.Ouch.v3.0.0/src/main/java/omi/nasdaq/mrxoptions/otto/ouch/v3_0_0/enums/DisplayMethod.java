package omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * I=Initial, R=Random, N=None
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DisplayMethod {

    /**
     * Initial
     */
    INITIAL('I', "Initial"),

    /**
     * Random
     */
    RANDOM('R', "Random"),

    /**
     * None
     */
    NONE('N', "None");

    private final char wire;

    private final String description;

    DisplayMethod(char wire, String description) {
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
    public static Optional<DisplayMethod> fromWire(char wire) {
        return switch (wire) {
            case 'I' -> Optional.of(INITIAL);
            case 'R' -> Optional.of(RANDOM);
            case 'N' -> Optional.of(NONE);
            default -> Optional.empty();
        };
    }
}
