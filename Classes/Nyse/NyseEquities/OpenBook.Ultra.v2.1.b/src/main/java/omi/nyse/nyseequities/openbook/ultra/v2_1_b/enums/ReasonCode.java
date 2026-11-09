package omi.nyse.nyseequities.openbook.ultra.v2_1_b.enums;

import java.util.Optional;

/**
 * This field identifies why the volume at the price point was modified.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ReasonCode {

    /**
     * New Orderadditional Interest Added
     */
    NEW_ORDERADDITIONAL_INTEREST_ADDED('O', "New Orderadditional Interest Added"),

    /**
     * Cancel
     */
    CANCEL('C', "Cancel"),

    /**
     * Execution
     */
    EXECUTION('E', "Execution"),

    /**
     * Multiple Events
     */
    MULTIPLE_EVENTS('X', "Multiple Events");

    private final char wire;

    private final String description;

    ReasonCode(char wire, String description) {
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
    public static Optional<ReasonCode> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(NEW_ORDERADDITIONAL_INTEREST_ADDED);
            case 'C' -> Optional.of(CANCEL);
            case 'E' -> Optional.of(EXECUTION);
            case 'X' -> Optional.of(MULTIPLE_EVENTS);
            default -> Optional.empty();
        };
    }
}
