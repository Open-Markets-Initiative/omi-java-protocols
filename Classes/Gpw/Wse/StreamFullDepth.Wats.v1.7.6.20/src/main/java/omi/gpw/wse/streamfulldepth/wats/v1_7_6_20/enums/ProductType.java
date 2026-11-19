package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Type of the product
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ProductType {

    /**
     * Equity
     */
    EQUITY((short) 1, "Equity"),

    /**
     * Fixed income
     */
    FIXED_INCOME((short) 2, "Fixed income"),

    /**
     * Derivative Futures
     */
    DERIVATIVE_FUTURES((short) 3, "Derivative Futures"),

    /**
     * Derivative Options
     */
    DERIVATIVE_OPTIONS((short) 4, "Derivative Options"),

    /**
     * Index
     */
    INDEX((short) 5, "Index"),

    /**
     * Currency
     */
    CURRENCY((short) 6, "Currency"),

    /**
     * Structured Product
     */
    STRUCTURED_PRODUCT((short) 7, "Structured Product"),

    /**
     * Tracker
     */
    TRACKER((short) 9, "Tracker");

    private final short wire;

    private final String description;

    ProductType(short wire, String description) {
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
    public static Optional<ProductType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(EQUITY);
            case 2 -> Optional.of(FIXED_INCOME);
            case 3 -> Optional.of(DERIVATIVE_FUTURES);
            case 4 -> Optional.of(DERIVATIVE_OPTIONS);
            case 5 -> Optional.of(INDEX);
            case 6 -> Optional.of(CURRENCY);
            case 7 -> Optional.of(STRUCTURED_PRODUCT);
            case 9 -> Optional.of(TRACKER);
            default -> Optional.empty();
        };
    }
}
