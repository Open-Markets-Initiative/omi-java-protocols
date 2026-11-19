package omi.jpx.osederivatives.geniuminet.glimpse.v2_2.enums;

import java.util.Optional;

/**
 * A product type is set
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum FinancialProduct {

    /**
     * Option
     */
    OPTION((short) 1, "Option"),

    /**
     * Futures
     */
    FUTURES((short) 3, "Futures"),

    /**
     * Combination Series
     */
    COMBINATION_SERIES((short) 11, "Combination Series");

    private final short wire;

    private final String description;

    FinancialProduct(short wire, String description) {
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
    public static Optional<FinancialProduct> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(OPTION);
            case 3 -> Optional.of(FUTURES);
            case 11 -> Optional.of(COMBINATION_SERIES);
            default -> Optional.empty();
        };
    }
}
