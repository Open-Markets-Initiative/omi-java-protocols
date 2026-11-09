package omi.siac.cts.output.cta.v2_10.enums;

import java.util.Optional;

/**
 * Summary message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SummaryMessageType {

    /**
     * Consolidated Start Of Day Summary Message
     */
    CONSOLIDATED_START_OF_DAY_SUMMARY_MESSAGE('A', "Consolidated Start Of Day Summary Message"),

    /**
     * Participant Start Of Day Summary Message
     */
    PARTICIPANT_START_OF_DAY_SUMMARY_MESSAGE('B', "Participant Start Of Day Summary Message"),

    /**
     * Consolidated End Of Day Summary Message
     */
    CONSOLIDATED_END_OF_DAY_SUMMARY_MESSAGE('C', "Consolidated End Of Day Summary Message"),

    /**
     * Fractional Consolidated End Of Day Summary Message
     */
    FRACTIONAL_CONSOLIDATED_END_OF_DAY_SUMMARY_MESSAGE('T', "Fractional Consolidated End Of Day Summary Message"),

    /**
     * Participant End Of Day Summary Message
     */
    PARTICIPANT_END_OF_DAY_SUMMARY_MESSAGE('D', "Participant End Of Day Summary Message"),

    /**
     * Fractional Participant End Of Day Summary Message
     */
    FRACTIONAL_PARTICIPANT_END_OF_DAY_SUMMARY_MESSAGE('P', "Fractional Participant End Of Day Summary Message");

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
            case 'A' -> Optional.of(CONSOLIDATED_START_OF_DAY_SUMMARY_MESSAGE);
            case 'B' -> Optional.of(PARTICIPANT_START_OF_DAY_SUMMARY_MESSAGE);
            case 'C' -> Optional.of(CONSOLIDATED_END_OF_DAY_SUMMARY_MESSAGE);
            case 'T' -> Optional.of(FRACTIONAL_CONSOLIDATED_END_OF_DAY_SUMMARY_MESSAGE);
            case 'D' -> Optional.of(PARTICIPANT_END_OF_DAY_SUMMARY_MESSAGE);
            case 'P' -> Optional.of(FRACTIONAL_PARTICIPANT_END_OF_DAY_SUMMARY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
