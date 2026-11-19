package omi.nairobi.nairobiequities.realtime.mitch.v1_22.enums;

import java.util.Optional;

/**
 * Reason for the session change.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SessionChangeReason {

    /**
     * Scheduled Transition
     */
    SCHEDULED_TRANSITION((short) 0, "Scheduled Transition"),

    /**
     * Extended By Market Ops
     */
    EXTENDED_BY_MARKET_OPS((short) 1, "Extended By Market Ops"),

    /**
     * Shortened By Market Ops
     */
    SHORTENED_BY_MARKET_OPS((short) 2, "Shortened By Market Ops"),

    /**
     * Market Order Extension
     */
    MARKET_ORDER_EXTENSION((short) 3, "Market Order Extension"),

    /**
     * Price Monitoring Extension
     */
    PRICE_MONITORING_EXTENSION((short) 4, "Price Monitoring Extension"),

    /**
     * Circuit Breaker Tripped
     */
    CIRCUIT_BREAKER_TRIPPED((short) 5, "Circuit Breaker Tripped"),

    /**
     * Unavailable
     */
    UNAVAILABLE((short) 9, "Unavailable");

    private final short wire;

    private final String description;

    SessionChangeReason(short wire, String description) {
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
    public static Optional<SessionChangeReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SCHEDULED_TRANSITION);
            case 1 -> Optional.of(EXTENDED_BY_MARKET_OPS);
            case 2 -> Optional.of(SHORTENED_BY_MARKET_OPS);
            case 3 -> Optional.of(MARKET_ORDER_EXTENSION);
            case 4 -> Optional.of(PRICE_MONITORING_EXTENSION);
            case 5 -> Optional.of(CIRCUIT_BREAKER_TRIPPED);
            case 9 -> Optional.of(UNAVAILABLE);
            default -> Optional.empty();
        };
    }
}
