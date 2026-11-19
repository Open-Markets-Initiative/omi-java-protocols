package omi.bse.bseindia.eobi.fbe.v1_4.enums;

import java.util.Optional;

/**
 * This field qualifies an instrument type on BSE.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ProductComplex {

    /**
     * Futures Spread
     */
    FUTURES_SPREAD((short) 5, "Futures Spread");

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
        return wire == 5 ? Optional.of(FUTURES_SPREAD) : Optional.empty();
    }
}
