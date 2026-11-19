package omi.jpx.fseequities.standard.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the flag for identifying the distinction between Start and End.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StartEndFlag {

    /**
     * Start
     */
    START('1', "Start"),

    /**
     * End
     */
    END('2', "End"),

    /**
     * In the case of Control Message (Health Check Control): space.
     */
    HEALTH_CHECK_CONTROL(' ', "In the case of Control Message (Health Check Control): space.");

    private final char wire;

    private final String description;

    StartEndFlag(char wire, String description) {
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
    public static Optional<StartEndFlag> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(START);
            case '2' -> Optional.of(END);
            case ' ' -> Optional.of(HEALTH_CHECK_CONTROL);
            default -> Optional.empty();
        };
    }
}
