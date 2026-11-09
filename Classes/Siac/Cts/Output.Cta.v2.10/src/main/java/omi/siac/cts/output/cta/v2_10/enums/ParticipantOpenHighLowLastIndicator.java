package omi.siac.cts.output.cta.v2_10.enums;

import java.util.Optional;

/**
 * Identifies the Participant Open/High/Low/Last applicable to the transaction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ParticipantOpenHighLowLastIndicator {

    /**
     * None
     */
    NONE('A', "None"),

    /**
     * High
     */
    HIGH('B', "High"),

    /**
     * Low
     */
    LOW('C', "Low"),

    /**
     * Last
     */
    LAST('D', "Last"),

    /**
     * High Last
     */
    HIGH_LAST('E', "High Last"),

    /**
     * Low Last
     */
    LOW_LAST('F', "Low Last"),

    /**
     * Unused
     */
    UNUSED('G', "Unused"),

    /**
     * Open
     */
    OPEN('H', "Open"),

    /**
     * Open High
     */
    OPEN_HIGH('I', "Open High"),

    /**
     * Open Low
     */
    OPEN_LOW('J', "Open Low"),

    /**
     * Open High Low Last
     */
    OPEN_HIGH_LOW_LAST('K', "Open High Low Last"),

    /**
     * Open Last
     */
    OPEN_LAST('L', "Open Last"),

    /**
     * Open High Low
     */
    OPEN_HIGH_LOW('M', "Open High Low"),

    /**
     * Open High Last
     */
    OPEN_HIGH_LAST('N', "Open High Last"),

    /**
     * Open Low Last
     */
    OPEN_LOW_LAST('O', "Open Low Last"),

    /**
     * High Low
     */
    HIGH_LOW('P', "High Low"),

    /**
     * High Low Last
     */
    HIGH_LOW_LAST('Q', "High Low Last");

    private final char wire;

    private final String description;

    ParticipantOpenHighLowLastIndicator(char wire, String description) {
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
    public static Optional<ParticipantOpenHighLowLastIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NONE);
            case 'B' -> Optional.of(HIGH);
            case 'C' -> Optional.of(LOW);
            case 'D' -> Optional.of(LAST);
            case 'E' -> Optional.of(HIGH_LAST);
            case 'F' -> Optional.of(LOW_LAST);
            case 'G' -> Optional.of(UNUSED);
            case 'H' -> Optional.of(OPEN);
            case 'I' -> Optional.of(OPEN_HIGH);
            case 'J' -> Optional.of(OPEN_LOW);
            case 'K' -> Optional.of(OPEN_HIGH_LOW_LAST);
            case 'L' -> Optional.of(OPEN_LAST);
            case 'M' -> Optional.of(OPEN_HIGH_LOW);
            case 'N' -> Optional.of(OPEN_HIGH_LAST);
            case 'O' -> Optional.of(OPEN_LOW_LAST);
            case 'P' -> Optional.of(HIGH_LOW);
            case 'Q' -> Optional.of(HIGH_LOW_LAST);
            default -> Optional.empty();
        };
    }
}
