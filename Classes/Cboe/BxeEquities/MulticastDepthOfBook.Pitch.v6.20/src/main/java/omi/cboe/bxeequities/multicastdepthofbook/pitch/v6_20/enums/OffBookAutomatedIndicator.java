package omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.enums;

import java.util.Optional;

/**
 * MMT Level 3.7
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OffBookAutomatedIndicator {

    /**
     * Automated
     */
    AUTOMATED('Q', "Automated"),

    /**
     * Manual
     */
    MANUAL('M', "Manual"),

    /**
     * Not Specified
     */
    NOT_SPECIFIED('-', "Not Specified");

    private final char wire;

    private final String description;

    OffBookAutomatedIndicator(char wire, String description) {
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
    public static Optional<OffBookAutomatedIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'Q' -> Optional.of(AUTOMATED);
            case 'M' -> Optional.of(MANUAL);
            case '-' -> Optional.of(NOT_SPECIFIED);
            default -> Optional.empty();
        };
    }
}
