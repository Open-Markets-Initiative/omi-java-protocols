package omi.moex.spectra.optinforeplay.simba.v9_9_0.enums;

import java.util.Optional;

/**
 * NegativePrices
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum NegativePrices {

    /**
     * Futures prices, price limits and options strikes are limited to be positive only
     */
    NOT_ELIGIBLE((short) 0, "Futures prices, price limits and options strikes are limited to be positive only"),

    /**
     * Futures prices and options strikes are not limited
     */
    ELIGIBLE((short) 1, "Futures prices and options strikes are not limited");

    private final short wire;

    private final String description;

    NegativePrices(short wire, String description) {
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
    public static Optional<NegativePrices> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_ELIGIBLE);
            case 1 -> Optional.of(ELIGIBLE);
            default -> Optional.empty();
        };
    }
}
