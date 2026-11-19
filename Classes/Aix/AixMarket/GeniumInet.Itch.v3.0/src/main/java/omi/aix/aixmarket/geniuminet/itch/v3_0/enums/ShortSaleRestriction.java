package omi.aix.aixmarket.geniuminet.itch.v3_0.enums;

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
     * Short Selling Is Not Allowed
     */
    SHORT_SELLING_IS_NOT_ALLOWED((short) 1, "Short Selling Is Not Allowed"),

    /**
     * Short Selling Is Allowed With Up Tick Rule
     */
    SHORT_SELLING_IS_ALLOWED_WITH_UP_TICK_RULE((short) 2, "Short Selling Is Allowed With Up Tick Rule");

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
            case 1 -> Optional.of(SHORT_SELLING_IS_NOT_ALLOWED);
            case 2 -> Optional.of(SHORT_SELLING_IS_ALLOWED_WITH_UP_TICK_RULE);
            default -> Optional.empty();
        };
    }
}
