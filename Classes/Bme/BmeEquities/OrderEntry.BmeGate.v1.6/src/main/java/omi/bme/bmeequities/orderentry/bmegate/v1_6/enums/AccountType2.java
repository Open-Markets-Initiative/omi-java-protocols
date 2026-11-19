package omi.bme.bmeequities.orderentry.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Capacity Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AccountType2 {

    /**
     * Retail Service Specialist
     */
    RETAIL_SERVICE_SPECIALIST('9', "Retail Service Specialist"),

    /**
     * On Behalf Of Third Parties
     */
    ON_BEHALF_OF_THIRD_PARTIES('A', "On Behalf Of Third Parties"),

    /**
     * House Trader
     */
    HOUSE_TRADER('P', "House Trader"),

    /**
     * Specialist
     */
    SPECIALIST('E', "Specialist"),

    /**
     * Retail Customer Supported For Compatibility
     */
    RETAIL_CUSTOMER_SUPPORTED_FOR_COMPATIBILITY('8', "Retail Customer Supported For Compatibility");

    private final char wire;

    private final String description;

    AccountType2(char wire, String description) {
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
    public static Optional<AccountType2> fromWire(char wire) {
        return switch (wire) {
            case '9' -> Optional.of(RETAIL_SERVICE_SPECIALIST);
            case 'A' -> Optional.of(ON_BEHALF_OF_THIRD_PARTIES);
            case 'P' -> Optional.of(HOUSE_TRADER);
            case 'E' -> Optional.of(SPECIALIST);
            case '8' -> Optional.of(RETAIL_CUSTOMER_SUPPORTED_FOR_COMPATIBILITY);
            default -> Optional.empty();
        };
    }
}
