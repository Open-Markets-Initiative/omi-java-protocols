package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Clearing firm filter
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ClearingFirmFilter {

    /**
     * No Filtering By Clearing Firm
     */
    NO_FILTERING_BY_CLEARING_FIRM('A', "No Filtering By Clearing Firm"),

    /**
     * Specified Clearing Firm Optional Field
     */
    SPECIFIED_CLEARING_FIRM_OPTIONAL_FIELD('F', "Specified Clearing Firm Optional Field");

    private final char wire;

    private final String description;

    ClearingFirmFilter(char wire, String description) {
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
    public static Optional<ClearingFirmFilter> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NO_FILTERING_BY_CLEARING_FIRM);
            case 'F' -> Optional.of(SPECIFIED_CLEARING_FIRM_OPTIONAL_FIELD);
            default -> Optional.empty();
        };
    }
}
