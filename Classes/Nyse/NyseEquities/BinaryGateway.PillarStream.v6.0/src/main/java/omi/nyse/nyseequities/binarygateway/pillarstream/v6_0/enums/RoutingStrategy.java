package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums;

import java.util.Optional;

/**
 * Routing strategy
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RoutingStrategy {

    /**
     * Midpoint Ping
     */
    MIDPOINT_PING((short) 1, "Midpoint Ping"),

    /**
     * Retail Price Improvement Seeking
     */
    RETAIL_PRICE_IMPROVEMENT_SEEKING((short) 2, "Retail Price Improvement Seeking"),

    /**
     * Retail Midpoint Ping
     */
    RETAIL_MIDPOINT_PING((short) 3, "Retail Midpoint Ping");

    private final short wire;

    private final String description;

    RoutingStrategy(short wire, String description) {
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
    public static Optional<RoutingStrategy> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(MIDPOINT_PING);
            case 2 -> Optional.of(RETAIL_PRICE_IMPROVEMENT_SEEKING);
            case 3 -> Optional.of(RETAIL_MIDPOINT_PING);
            default -> Optional.empty();
        };
    }
}
