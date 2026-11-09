package omi.miax.pearlequities.depthofmarket.mach.v1_3_d.enums;

import java.util.Optional;

/**
 * Current state of the system.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SystemStatus {

    /**
     * Start Of System Hours
     */
    START_OF_SYSTEM_HOURS('S', "Start Of System Hours"),

    /**
     * End Of System Hours
     */
    END_OF_SYSTEM_HOURS('C', "End Of System Hours"),

    /**
     * Sent before tests.
     */
    START_OF_TEST_SESSION('1', "Sent before tests."),

    /**
     * End Of Test Session
     */
    END_OF_TEST_SESSION('2', "End Of Test Session");

    private final char wire;

    private final String description;

    SystemStatus(char wire, String description) {
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
    public static Optional<SystemStatus> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(START_OF_SYSTEM_HOURS);
            case 'C' -> Optional.of(END_OF_SYSTEM_HOURS);
            case '1' -> Optional.of(START_OF_TEST_SESSION);
            case '2' -> Optional.of(END_OF_TEST_SESSION);
            default -> Optional.empty();
        };
    }
}
