package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Instrument type filter
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InstrumentTypeFilter {

    /**
     * Both Simple And Complex Orders
     */
    BOTH_SIMPLE_AND_COMPLEX_ORDERS('B', "Both Simple And Complex Orders"),

    /**
     * Simple Orders Only
     */
    SIMPLE_ORDERS_ONLY('S', "Simple Orders Only"),

    /**
     * Spread Orders Only
     */
    SPREAD_ORDERS_ONLY('C', "Spread Orders Only");

    private final char wire;

    private final String description;

    InstrumentTypeFilter(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<InstrumentTypeFilter> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BOTH_SIMPLE_AND_COMPLEX_ORDERS);
            case 'S' -> Optional.of(SIMPLE_ORDERS_ONLY);
            case 'C' -> Optional.of(SPREAD_ORDERS_ONLY);
            default -> Optional.empty();
        };
    }
}
