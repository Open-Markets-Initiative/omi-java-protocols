package omi.aix.aixmarket.geniuminet.glimpse.v1_0.enums;

import java.util.Optional;

/**
 * Specify Short Sell status and what Short Sell validation rule that should be used.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ShortSaleRestriction {

    /**
     * No Restrictions
     */
    NO_RESTRICTIONS((short) 0, "No Restrictions"),

    /**
     * Security Is Not Shortable
     */
    SECURITY_IS_NOT_SHORTABLE((short) 1, "Security Is Not Shortable"),

    /**
     * Security Not Shortable At Or Below The Best Bid
     */
    SECURITY_NOT_SHORTABLE_AT_OR_BELOW_THE_BEST_BID((short) 2, "Security Not Shortable At Or Below The Best Bid");

    private final short wire;

    private final String description;

    ShortSaleRestriction(short wire, String description) {
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
    public static Optional<ShortSaleRestriction> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_RESTRICTIONS);
            case 1 -> Optional.of(SECURITY_IS_NOT_SHORTABLE);
            case 2 -> Optional.of(SECURITY_NOT_SHORTABLE_AT_OR_BELOW_THE_BEST_BID);
            default -> Optional.empty();
        };
    }
}
