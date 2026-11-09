package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Identifies the type of Summary message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SummaryMessageType {

    /**
     * Consolidated Start Of Day Summary
     */
    CONSOLIDATED_START_OF_DAY_SUMMARY('A', "Consolidated Start Of Day Summary"),

    /**
     * Participant Start Of Day Summary
     */
    PARTICIPANT_START_OF_DAY_SUMMARY('B', "Participant Start Of Day Summary"),

    /**
     * Consolidated End Of Day Summary
     */
    CONSOLIDATED_END_OF_DAY_SUMMARY('C', "Consolidated End Of Day Summary"),

    /**
     * Fractional Consolidated End Of Day Summary
     */
    FRACTIONAL_CONSOLIDATED_END_OF_DAY_SUMMARY('T', "Fractional Consolidated End Of Day Summary"),

    /**
     * Participant End Of Day Summary
     */
    PARTICIPANT_END_OF_DAY_SUMMARY('D', "Participant End Of Day Summary"),

    /**
     * Fractional Participant End Of Day Summary
     */
    FRACTIONAL_PARTICIPANT_END_OF_DAY_SUMMARY('P', "Fractional Participant End Of Day Summary");

    private final char wire;

    private final String description;

    SummaryMessageType(char wire, String description) {
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
    public static Optional<SummaryMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(CONSOLIDATED_START_OF_DAY_SUMMARY);
            case 'B' -> Optional.of(PARTICIPANT_START_OF_DAY_SUMMARY);
            case 'C' -> Optional.of(CONSOLIDATED_END_OF_DAY_SUMMARY);
            case 'T' -> Optional.of(FRACTIONAL_CONSOLIDATED_END_OF_DAY_SUMMARY);
            case 'D' -> Optional.of(PARTICIPANT_END_OF_DAY_SUMMARY);
            case 'P' -> Optional.of(FRACTIONAL_PARTICIPANT_END_OF_DAY_SUMMARY);
            default -> Optional.empty();
        };
    }
}
