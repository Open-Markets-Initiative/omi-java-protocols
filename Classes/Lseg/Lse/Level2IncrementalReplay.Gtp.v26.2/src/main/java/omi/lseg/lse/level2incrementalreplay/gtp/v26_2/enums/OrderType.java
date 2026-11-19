package omi.lseg.lse.level2incrementalreplay.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Type of the order.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderType {

    /**
     * Limit Order Firm Quote Default
     */
    LIMIT_ORDER_FIRM_QUOTE_DEFAULT((short) 0, "Limit Order Firm Quote Default"),

    /**
     * Market Order
     */
    MARKET_ORDER((short) 1, "Market Order"),

    /**
     * Named Limit
     */
    NAMED_LIMIT((short) 3, "Named Limit"),

    /**
     * Named Market
     */
    NAMED_MARKET((short) 4, "Named Market"),

    /**
     * Executable Quotes
     */
    EXECUTABLE_QUOTES((short) 5, "Executable Quotes");

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
            case 0 -> Optional.of(LIMIT_ORDER_FIRM_QUOTE_DEFAULT);
            case 1 -> Optional.of(MARKET_ORDER);
            case 3 -> Optional.of(NAMED_LIMIT);
            case 4 -> Optional.of(NAMED_MARKET);
            case 5 -> Optional.of(EXECUTABLE_QUOTES);
            default -> Optional.empty();
        };
    }
}
