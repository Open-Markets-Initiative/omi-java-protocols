package omi.siac.opra.input.obi.v5_0_i.enums;

import java.util.Optional;

/**
 * Control message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ControlMessageType {

    /**
     * Start Of Day
     */
    START_OF_DAY('C', "Start Of Day"),

    /**
     * Start Of Summary
     */
    START_OF_SUMMARY('E', "Start Of Summary"),

    /**
     * End Of Summary
     */
    END_OF_SUMMARY('F', "End Of Summary"),

    /**
     * End Of Day
     */
    END_OF_DAY('J', "End Of Day"),

    /**
     * Line Integrity
     */
    LINE_INTEGRITY('O', "Line Integrity");

    private final char wire;

    private final String description;

    ControlMessageType(char wire, String description) {
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
    public static Optional<ControlMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(START_OF_DAY);
            case 'E' -> Optional.of(START_OF_SUMMARY);
            case 'F' -> Optional.of(END_OF_SUMMARY);
            case 'J' -> Optional.of(END_OF_DAY);
            case 'O' -> Optional.of(LINE_INTEGRITY);
            default -> Optional.empty();
        };
    }
}
