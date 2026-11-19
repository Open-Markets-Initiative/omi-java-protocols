package omi.nasdaq.iseoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * I=Immediate, E=Exhaust, N=N/A
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DisplayWhen {

    /**
     * Immediate
     */
    IMMEDIATE('I', "Immediate"),

    /**
     * Exhaust
     */
    EXHAUST('E', "Exhaust"),

    /**
     * N/A
     */
    NOT_APPLICABLE('N', "N/A");

    private final char wire;

    private final String description;

    DisplayWhen(char wire, String description) {
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
    public static Optional<DisplayWhen> fromWire(char wire) {
        return switch (wire) {
            case 'I' -> Optional.of(IMMEDIATE);
            case 'E' -> Optional.of(EXHAUST);
            case 'N' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
