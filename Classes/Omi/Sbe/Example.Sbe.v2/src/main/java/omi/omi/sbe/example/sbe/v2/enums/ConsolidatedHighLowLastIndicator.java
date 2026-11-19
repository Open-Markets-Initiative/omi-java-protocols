package omi.omi.sbe.example.sbe.v2.enums;

import java.util.Optional;

/**
 * consolidatedHighLowLastIndicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ConsolidatedHighLowLastIndicator {

    /**
     * NONE
     */
    NONE('A', "NONE"),

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
     * HIGH_LAST
     */
    HIGH_LAST('E', "HIGH_LAST"),

    /**
     * LOW_LAST
     */
    LOW_LAST('F', "LOW_LAST"),

    /**
     * HIGH_LOW_LAST
     */
    HIGH_LOW_LAST('G', "HIGH_LOW_LAST"),

    /**
     * HIGH_LOW
     */
    HIGH_LOW('H', "HIGH_LOW");

    private final char wire;

    private final String description;

    ConsolidatedHighLowLastIndicator(char wire, String description) {
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
    public static Optional<ConsolidatedHighLowLastIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NONE);
            case 'B' -> Optional.of(HIGH);
            case 'C' -> Optional.of(LOW);
            case 'D' -> Optional.of(LAST);
            case 'E' -> Optional.of(HIGH_LAST);
            case 'F' -> Optional.of(LOW_LAST);
            case 'G' -> Optional.of(HIGH_LOW_LAST);
            case 'H' -> Optional.of(HIGH_LOW);
            default -> Optional.empty();
        };
    }
}
