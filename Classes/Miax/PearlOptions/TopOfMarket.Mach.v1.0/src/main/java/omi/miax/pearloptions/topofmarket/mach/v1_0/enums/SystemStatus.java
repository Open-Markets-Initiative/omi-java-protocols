package omi.miax.pearloptions.topofmarket.mach.v1_0.enums;

import java.util.Optional;

/**
 * Current system status:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SystemStatus {

    /**
     * Start Of System Hours
     */
    START_S('S', "Start Of System Hours"),

    /**
     * End Of System Hours
     */
    END_C('C', "End Of System Hours"),

    /**
     * Start Of Test Session Sent Before Tests
     */
    START_1('1', "Start Of Test Session Sent Before Tests"),

    /**
     * End Of Test Session
     */
    END_2('2', "End Of Test Session");

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
            case 'S' -> Optional.of(START_S);
            case 'C' -> Optional.of(END_C);
            case '1' -> Optional.of(START_1);
            case '2' -> Optional.of(END_2);
            default -> Optional.empty();
        };
    }
}
