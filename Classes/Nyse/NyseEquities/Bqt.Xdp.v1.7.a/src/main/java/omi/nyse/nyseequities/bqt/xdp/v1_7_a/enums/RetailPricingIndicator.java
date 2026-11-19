package omi.nyse.nyseequities.bqt.xdp.v1_7_a.enums;

import java.util.Optional;

/**
 * Retail Pricing Indicator
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RetailPricingIndicator {

    /**
     * No Retail Interest
     */
    NO_RETAIL_INTEREST((short) 0, "No Retail Interest"),

    /**
     * Retail Interest on the Bid side
     */
    RETAIL_INTEREST_ON_THE_BID_SIDE((short) 1, "Retail Interest on the Bid side"),

    /**
     * Retail Interest on the Ask side
     */
    RETAIL_INTEREST_ON_THE_ASK_SIDE((short) 2, "Retail Interest on the Ask side"),

    /**
     * Combination of Retail Interest on Bid and Ask side
     */
    COMBINATION_OF_RETAIL_INTEREST_ON_BID_AND_ASK_SIDE((short) 4, "Combination of Retail Interest on Bid and Ask side");

    private final short wire;

    private final String description;

    RetailPricingIndicator(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<RetailPricingIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_RETAIL_INTEREST);
            case 1 -> Optional.of(RETAIL_INTEREST_ON_THE_BID_SIDE);
            case 2 -> Optional.of(RETAIL_INTEREST_ON_THE_ASK_SIDE);
            case 4 -> Optional.of(COMBINATION_OF_RETAIL_INTEREST_ON_BID_AND_ASK_SIDE);
            default -> Optional.empty();
        };
    }
}
