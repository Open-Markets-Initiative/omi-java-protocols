package omi.euronext.optiq.dropcopygateway.sbe.v6_63.enums;

import java.util.Optional;

/**
 * priceLimits
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceLimits {

    /**
     * Price_Limits_Enabled___Normal
     */
    PRICE_LIMITS_ENABLED_NORMAL((short) 1, "Price_Limits_Enabled___Normal"),

    /**
     * Price_Limits_Enabled___Wide
     */
    PRICE_LIMITS_ENABLED_WIDE((short) 2, "Price_Limits_Enabled___Wide"),

    /**
     * Price_Limits_Enabled___Widest
     */
    PRICE_LIMITS_ENABLED_WIDEST((short) 3, "Price_Limits_Enabled___Widest"),

    /**
     * Price_Limits_Disabled
     */
    PRICE_LIMITS_DISABLED((short) 4, "Price_Limits_Disabled"),

    /**
     * priceLimits
     */
    NO_VALUE((short) 255, "priceLimits");

    private final short wire;

    private final String description;

    PriceLimits(short wire, String description) {
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
    public static Optional<PriceLimits> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(PRICE_LIMITS_ENABLED_NORMAL);
            case 2 -> Optional.of(PRICE_LIMITS_ENABLED_WIDE);
            case 3 -> Optional.of(PRICE_LIMITS_ENABLED_WIDEST);
            case 4 -> Optional.of(PRICE_LIMITS_DISABLED);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
