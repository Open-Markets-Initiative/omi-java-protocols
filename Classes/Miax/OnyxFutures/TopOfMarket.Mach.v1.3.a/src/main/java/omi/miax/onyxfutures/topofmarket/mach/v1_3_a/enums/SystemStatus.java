package omi.miax.onyxfutures.topofmarket.mach.v1_3_a.enums;

import java.util.Optional;

/**
 * Defines the SystemStatus values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SystemStatus {

    /**
     * Start Of
     */
    START_OF_S('S', "Start Of"),

    /**
     * End Of
     */
    END_OF_C('C', "End Of"),

    /**
     * Start Of
     */
    START_OF_1('1', "Start Of"),

    /**
     * End Of
     */
    END_OF_2('2', "End Of");

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
            case 'S' -> Optional.of(START_OF_S);
            case 'C' -> Optional.of(END_OF_C);
            case '1' -> Optional.of(START_OF_1);
            case '2' -> Optional.of(END_OF_2);
            default -> Optional.empty();
        };
    }
}
