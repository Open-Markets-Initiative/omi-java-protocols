package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Reason for execution rejection
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DkReason {

    /**
     * Unknown Security
     */
    UNKNOWN_SECURITY('A', "Unknown Security"),

    /**
     * Wrong Side
     */
    WRONG_SIDE('B', "Wrong Side"),

    /**
     * Quantity Exceeds Order
     */
    QUANTITY_EXCEEDS_ORDER('C', "Quantity Exceeds Order"),

    /**
     * No Matching Order
     */
    NO_MATCHING_ORDER('D', "No Matching Order"),

    /**
     * Price Exceeds Limit
     */
    PRICE_EXCEEDS_LIMIT('E', "Price Exceeds Limit"),

    /**
     * Calculation Difference
     */
    CALCULATION_DIFFERENCE('F', "Calculation Difference"),

    /**
     * No Matching Execution Report
     */
    NO_MATCHING_EXECUTION_REPORT('G', "No Matching Execution Report"),

    /**
     * Other
     */
    OTHER('Z', "Other");

    private final char wire;

    private final String description;

    DkReason(char wire, String description) {
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
    public static Optional<DkReason> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(UNKNOWN_SECURITY);
            case 'B' -> Optional.of(WRONG_SIDE);
            case 'C' -> Optional.of(QUANTITY_EXCEEDS_ORDER);
            case 'D' -> Optional.of(NO_MATCHING_ORDER);
            case 'E' -> Optional.of(PRICE_EXCEEDS_LIMIT);
            case 'F' -> Optional.of(CALCULATION_DIFFERENCE);
            case 'G' -> Optional.of(NO_MATCHING_EXECUTION_REPORT);
            case 'Z' -> Optional.of(OTHER);
            default -> Optional.empty();
        };
    }
}
