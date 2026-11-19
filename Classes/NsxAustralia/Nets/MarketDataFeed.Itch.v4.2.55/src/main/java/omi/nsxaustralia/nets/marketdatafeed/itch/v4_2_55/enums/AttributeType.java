package omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.enums;

import java.util.Optional;

/**
 * Identifies the attribute type being referenced.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AttributeType {

    /**
     * Previous Day Close
     */
    PREVIOUS_DAY_CLOSE('R', "Previous Day Close"),

    /**
     * Close Price
     */
    CLOSE_PRICE('C', "Close Price"),

    /**
     * Etr Upper Limit Percentage
     */
    ETR_UPPER_LIMIT_PERCENTAGE('D', "Etr Upper Limit Percentage"),

    /**
     * Etr Lower Limit Percentage
     */
    ETR_LOWER_LIMIT_PERCENTAGE('d', "Etr Lower Limit Percentage"),

    /**
     * Aot Upper Limit Percentage
     */
    AOT_UPPER_LIMIT_PERCENTAGE('P', "Aot Upper Limit Percentage"),

    /**
     * Aot Lower Limit Percentage
     */
    AOT_LOWER_LIMIT_PERCENTAGE('p', "Aot Lower Limit Percentage"),

    /**
     * Aot Reference Price
     */
    AOT_REFERENCE_PRICE('A', "Aot Reference Price"),

    /**
     * Etr Reference Price
     */
    ETR_REFERENCE_PRICE('B', "Etr Reference Price");

    private final char wire;

    private final String description;

    AttributeType(char wire, String description) {
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
    public static Optional<AttributeType> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(PREVIOUS_DAY_CLOSE);
            case 'C' -> Optional.of(CLOSE_PRICE);
            case 'D' -> Optional.of(ETR_UPPER_LIMIT_PERCENTAGE);
            case 'd' -> Optional.of(ETR_LOWER_LIMIT_PERCENTAGE);
            case 'P' -> Optional.of(AOT_UPPER_LIMIT_PERCENTAGE);
            case 'p' -> Optional.of(AOT_LOWER_LIMIT_PERCENTAGE);
            case 'A' -> Optional.of(AOT_REFERENCE_PRICE);
            case 'B' -> Optional.of(ETR_REFERENCE_PRICE);
            default -> Optional.empty();
        };
    }
}
