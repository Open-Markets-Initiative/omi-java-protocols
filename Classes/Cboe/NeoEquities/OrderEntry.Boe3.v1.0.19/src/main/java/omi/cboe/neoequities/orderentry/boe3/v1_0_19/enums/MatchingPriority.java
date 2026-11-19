package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * The type of priority used to match an order in a trade
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MatchingPriority {

    /**
     * None
     */
    NONE((short) 0, "None"),

    /**
     * Broker Preferencing
     */
    BROKER_PREFERENCING((short) 1, "Broker Preferencing"),

    /**
     * Market Maker Preferential Trading
     */
    MARKET_MAKER_PREFERENTIAL_TRADING((short) 100, "Market Maker Preferential Trading");

    private final short wire;

    private final String description;

    MatchingPriority(short wire, String description) {
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
    public static Optional<MatchingPriority> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NONE);
            case 1 -> Optional.of(BROKER_PREFERENCING);
            case 100 -> Optional.of(MARKET_MAKER_PREFERENTIAL_TRADING);
            default -> Optional.empty();
        };
    }
}
