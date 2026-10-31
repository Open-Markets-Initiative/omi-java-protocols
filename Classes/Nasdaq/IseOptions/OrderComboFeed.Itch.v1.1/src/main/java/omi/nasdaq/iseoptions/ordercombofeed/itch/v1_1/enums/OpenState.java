package omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

import java.util.Optional;

/**
 * Reflects the current eligibility for auto execution of the options security in the options market.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpenState {

    /**
     * Open for auto execution
     */
    OPEN_FOR_AUTO_EXECUTION('Y', "Open for auto execution"),

    /**
     * Closed for auto execution
     */
    CLOSED_FOR_AUTO_EXECUTION('N', "Closed for auto execution");

    private final char wire;

    private final String description;

    OpenState(char wire, String description) {
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
    public static Optional<OpenState> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(OPEN_FOR_AUTO_EXECUTION);
            case 'N' -> Optional.of(CLOSED_FOR_AUTO_EXECUTION);
            default -> Optional.empty();
        };
    }
}
