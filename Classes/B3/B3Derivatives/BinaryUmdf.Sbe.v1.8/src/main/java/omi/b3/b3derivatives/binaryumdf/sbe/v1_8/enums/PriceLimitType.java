package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * priceLimitType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceLimitType {

    /**
     * Price Unit.
     */
    PRICE_UNIT((short) 0, "Price Unit."),

    /**
     * Ticks.
     */
    TICKS((short) 1, "Ticks."),

    /**
     * Percentage.
     */
    PERCENTAGE((short) 2, "Percentage."),

    /**
     * priceLimitType
     */
    NO_VALUE((short) 255, "priceLimitType");

    private final short wire;

    private final String description;

    PriceLimitType(short wire, String description) {
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
    public static Optional<PriceLimitType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(PRICE_UNIT);
            case 1 -> Optional.of(TICKS);
            case 2 -> Optional.of(PERCENTAGE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
