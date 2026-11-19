package omi.omi.sbe.example.sbe.v2.enums;

import java.util.Optional;

/**
 * participantOpenHighLowLastIndicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ParticipantOpenHighLowLastIndicator {

    /**
     * NONE
     */
    NONE('0', "NONE"),

    /**
     * OPEN
     */
    OPEN('A', "OPEN"),

    /**
     * HIGH
     */
    HIGH('B', "HIGH"),

    /**
     * LOW
     */
    LOW('C', "LOW"),

    /**
     * LAST
     */
    LAST('D', "LAST"),

    /**
     * OPEN_HIGH
     */
    OPEN_HIGH('E', "OPEN_HIGH"),

    /**
     * OPEN_LOW
     */
    OPEN_LOW('F', "OPEN_LOW"),

    /**
     * OPEN_LAST
     */
    OPEN_LAST('G', "OPEN_LAST"),

    /**
     * HIGH_LAST
     */
    HIGH_LAST('H', "HIGH_LAST"),

    /**
     * LOW_LAST
     */
    LOW_LAST('I', "LOW_LAST"),

    /**
     * HIGH_LOW
     */
    HIGH_LOW('J', "HIGH_LOW"),

    /**
     * OPEN_HIGH_LAST
     */
    OPEN_HIGH_LAST('K', "OPEN_HIGH_LAST"),

    /**
     * OPEN_LOW_LAST
     */
    OPEN_LOW_LAST('L', "OPEN_LOW_LAST"),

    /**
     * OPEN_HIGH_LOW
     */
    OPEN_HIGH_LOW('M', "OPEN_HIGH_LOW"),

    /**
     * HIGH_LOW_LAST
     */
    HIGH_LOW_LAST('N', "HIGH_LOW_LAST"),

    /**
     * OPEN_HIGH_LOW_LAST
     */
    OPEN_HIGH_LOW_LAST('O', "OPEN_HIGH_LOW_LAST");

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
            case '0' -> Optional.of(NONE);
            case 'A' -> Optional.of(OPEN);
            case 'B' -> Optional.of(HIGH);
            case 'C' -> Optional.of(LOW);
            case 'D' -> Optional.of(LAST);
            case 'E' -> Optional.of(OPEN_HIGH);
            case 'F' -> Optional.of(OPEN_LOW);
            case 'G' -> Optional.of(OPEN_LAST);
            case 'H' -> Optional.of(HIGH_LAST);
            case 'I' -> Optional.of(LOW_LAST);
            case 'J' -> Optional.of(HIGH_LOW);
            case 'K' -> Optional.of(OPEN_HIGH_LAST);
            case 'L' -> Optional.of(OPEN_LOW_LAST);
            case 'M' -> Optional.of(OPEN_HIGH_LOW);
            case 'N' -> Optional.of(HIGH_LOW_LAST);
            case 'O' -> Optional.of(OPEN_HIGH_LOW_LAST);
            default -> Optional.empty();
        };
    }
}
