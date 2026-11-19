package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.enums;

import java.util.Optional;

/**
 * Defines the AutoMatchPrice values.
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum AutoMatchPrice {

    /**
     * Buy
     */
    BUY(1L, "Buy"),

    /**
     * Sell
     */
    SELL(2L, "Sell");

    private final long wire;

    private final String description;

    AutoMatchPrice(long wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public long wire() {
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
    public static Optional<AutoMatchPrice> fromWire(long wire) {
        if (wire == 1L) {
            return Optional.of(BUY);
        }
        if (wire == 2L) {
            return Optional.of(SELL);
        }
        return Optional.empty();
    }
}
