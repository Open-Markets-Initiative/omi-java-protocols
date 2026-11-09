package omi.siac.cqs.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Control message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ControlMessageType {

    /**
     * Start Of Day Message
     */
    START_OF_DAY_MESSAGE('A', "Start Of Day Message"),

    /**
     * Finra Close Message
     */
    FINRA_CLOSE_MESSAGE('C', "Finra Close Message"),

    /**
     * Reset Block Sequence Number Message
     */
    RESET_BLOCK_SEQUENCE_NUMBER_MESSAGE('L', "Reset Block Sequence Number Message"),

    /**
     * Start Of Test Cycle Message
     */
    START_OF_TEST_CYCLE_MESSAGE('M', "Start Of Test Cycle Message"),

    /**
     * End Of Test Cycle Message
     */
    END_OF_TEST_CYCLE_MESSAGE('N', "End Of Test Cycle Message"),

    /**
     * Finra Open Message
     */
    FINRA_OPEN_MESSAGE('O', "Finra Open Message"),

    /**
     * Disaster Recovery Data Center Activation Message
     */
    DISASTER_RECOVERY_DATA_CENTER_ACTIVATION_MESSAGE('P', "Disaster Recovery Data Center Activation Message"),

    /**
     * Line Integrity Message
     */
    LINE_INTEGRITY_MESSAGE('T', "Line Integrity Message"),

    /**
     * End Of Day Message
     */
    END_OF_DAY_MESSAGE('Z', "End Of Day Message");

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
            case 'A' -> Optional.of(START_OF_DAY_MESSAGE);
            case 'C' -> Optional.of(FINRA_CLOSE_MESSAGE);
            case 'L' -> Optional.of(RESET_BLOCK_SEQUENCE_NUMBER_MESSAGE);
            case 'M' -> Optional.of(START_OF_TEST_CYCLE_MESSAGE);
            case 'N' -> Optional.of(END_OF_TEST_CYCLE_MESSAGE);
            case 'O' -> Optional.of(FINRA_OPEN_MESSAGE);
            case 'P' -> Optional.of(DISASTER_RECOVERY_DATA_CENTER_ACTIVATION_MESSAGE);
            case 'T' -> Optional.of(LINE_INTEGRITY_MESSAGE);
            case 'Z' -> Optional.of(END_OF_DAY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
