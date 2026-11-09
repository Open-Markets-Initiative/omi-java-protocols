package omi.siac.cqs.output.cta.v2_10_a.enums;

import java.util.Optional;

/**
 * Identifies the type of Control message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ControlMessageType {

    /**
     * Start Of Day
     */
    START_OF_DAY('A', "Start Of Day"),

    /**
     * Finra Close
     */
    FINRA_CLOSE('C', "Finra Close"),

    /**
     * Reset Block Sequence Number
     */
    RESET_BLOCK_SEQUENCE_NUMBER('L', "Reset Block Sequence Number"),

    /**
     * Finra Open
     */
    FINRA_OPEN('O', "Finra Open"),

    /**
     * Disaster Recovery Data Center Activation
     */
    DISASTER_RECOVERY_DATA_CENTER_ACTIVATION('P', "Disaster Recovery Data Center Activation"),

    /**
     * Line Integrity
     */
    LINE_INTEGRITY('T', "Line Integrity"),

    /**
     * End Of Day
     */
    END_OF_DAY('Z', "End Of Day");

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
            case 'A' -> Optional.of(START_OF_DAY);
            case 'C' -> Optional.of(FINRA_CLOSE);
            case 'L' -> Optional.of(RESET_BLOCK_SEQUENCE_NUMBER);
            case 'O' -> Optional.of(FINRA_OPEN);
            case 'P' -> Optional.of(DISASTER_RECOVERY_DATA_CENTER_ACTIVATION);
            case 'T' -> Optional.of(LINE_INTEGRITY);
            case 'Z' -> Optional.of(END_OF_DAY);
            default -> Optional.empty();
        };
    }
}
