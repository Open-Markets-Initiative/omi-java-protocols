package omi.jse.itac.enhancednativetrading.ntgi.v4_04.enums;

import java.util.Optional;

/**
 * Type of the order
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderType {

    /**
     * Market Order
     */
    MARKET_ORDER((short) 1, "Market Order"),

    /**
     * Limit Order
     */
    LIMIT_ORDER((short) 2, "Limit Order"),

    /**
     * Stop Order
     */
    STOP_ORDER((short) 3, "Stop Order"),

    /**
     * Stop Limit Order
     */
    STOP_LIMIT_ORDER((short) 4, "Stop Limit Order"),

    /**
     * Market To Limit Order
     */
    MARKET_TO_LIMIT_ORDER((short) 5, "Market To Limit Order"),

    /**
     * Market If Touched
     */
    MARKET_IF_TOUCHED((short) 6, "Market If Touched");

    private final short wire;

    private final String description;

    OrderType(short wire, String description) {
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
    public static Optional<OrderType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(MARKET_ORDER);
            case 2 -> Optional.of(LIMIT_ORDER);
            case 3 -> Optional.of(STOP_ORDER);
            case 4 -> Optional.of(STOP_LIMIT_ORDER);
            case 5 -> Optional.of(MARKET_TO_LIMIT_ORDER);
            case 6 -> Optional.of(MARKET_IF_TOUCHED);
            default -> Optional.empty();
        };
    }
}
