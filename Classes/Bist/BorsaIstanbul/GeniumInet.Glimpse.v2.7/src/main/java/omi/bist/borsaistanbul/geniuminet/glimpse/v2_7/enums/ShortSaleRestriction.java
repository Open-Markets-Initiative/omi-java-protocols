package omi.bist.borsaistanbul.geniuminet.glimpse.v2_7.enums;

import java.util.Optional;

/**
 * Specifies Short Sell status and what Short Sell validation rule should be used
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ShortSaleRestriction {

    /**
     * Short selling is allowed with no price validation
     */
    NO_RESTRICTIONS((short) 0, "Short selling is allowed with no price validation"),

    /**
     * Short Selling Not Allowed
     */
    SHORT_SELLING_NOT_ALLOWED((short) 1, "Short Selling Not Allowed"),

    /**
     * Short Selling Allowed With Up Tick Rule
     */
    SHORT_SELLING_ALLOWED_WITH_UP_TICK_RULE((short) 2, "Short Selling Allowed With Up Tick Rule");

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
            case 1 -> Optional.of(SHORT_SELLING_NOT_ALLOWED);
            case 2 -> Optional.of(SHORT_SELLING_ALLOWED_WITH_UP_TICK_RULE);
            default -> Optional.empty();
        };
    }
}
