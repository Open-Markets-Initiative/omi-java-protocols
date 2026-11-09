package omi.eurex.t7.eobi.fbe.v3_0.enums;

import java.util.Optional;

/**
 * Defines the ProductComplex values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ProductComplex {

    /**
     * Futures Spread
     */
    FUTURES_SPREAD((short) 5, "Futures Spread"),

    /**
     * Inter Product Spread
     */
    INTER_PRODUCT_SPREAD((short) 6, "Inter Product Spread"),

    /**
     * Standard Futures Strategy
     */
    STANDARD_FUTURES_STRATEGY((short) 7, "Standard Futures Strategy"),

    /**
     * Pack And Bundle
     */
    PACK_AND_BUNDLE((short) 8, "Pack And Bundle"),

    /**
     * Strip
     */
    STRIP((short) 9, "Strip"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    ProductComplex(short wire, String description) {
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
    public static Optional<ProductComplex> fromWire(short wire) {
        return switch (wire) {
            case 5 -> Optional.of(FUTURES_SPREAD);
            case 6 -> Optional.of(INTER_PRODUCT_SPREAD);
            case 7 -> Optional.of(STANDARD_FUTURES_STRATEGY);
            case 8 -> Optional.of(PACK_AND_BUNDLE);
            case 9 -> Optional.of(STRIP);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
