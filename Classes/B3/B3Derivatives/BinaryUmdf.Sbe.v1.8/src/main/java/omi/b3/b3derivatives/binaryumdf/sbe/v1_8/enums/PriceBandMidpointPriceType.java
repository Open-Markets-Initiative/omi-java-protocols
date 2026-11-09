package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * priceBandMidpointPriceType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceBandMidpointPriceType {

    /**
     * Last traded price.
     */
    LAST_TRADED_PRICE((short) 0, "Last traded price."),

    /**
     * Complementary last price.
     */
    COMPLEMENTARY_LAST_PRICE((short) 1, "Complementary last price."),

    /**
     * Theoretical Price.
     */
    THEORETICAL_PRICE((short) 2, "Theoretical Price."),

    /**
     * priceBandMidpointPriceType
     */
    NO_VALUE((short) 255, "priceBandMidpointPriceType");

    private final short wire;

    private final String description;

    PriceBandMidpointPriceType(short wire, String description) {
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
    public static Optional<PriceBandMidpointPriceType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(LAST_TRADED_PRICE);
            case 1 -> Optional.of(COMPLEMENTARY_LAST_PRICE);
            case 2 -> Optional.of(THEORETICAL_PRICE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
