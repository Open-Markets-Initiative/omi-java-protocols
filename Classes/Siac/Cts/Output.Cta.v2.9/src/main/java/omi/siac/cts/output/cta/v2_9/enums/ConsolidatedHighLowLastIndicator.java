package omi.siac.cts.output.cta.v2_9.enums;

import java.util.Optional;

/**
 * Identifies the Consolidated High/Low/Last Price applicable to the trade.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ConsolidatedHighLowLastIndicator {

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
     * High Low Last
     */
    HIGH_LOW_LAST('G', "High Low Last"),

    /**
     * High Low
     */
    HIGH_LOW('H', "High Low");

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
