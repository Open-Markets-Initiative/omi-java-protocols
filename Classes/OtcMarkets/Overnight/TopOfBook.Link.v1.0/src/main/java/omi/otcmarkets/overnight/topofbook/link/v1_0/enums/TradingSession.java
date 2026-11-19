package omi.otcmarkets.overnight.topofbook.link.v1_0.enums;

import java.util.Optional;

/**
 * Trading session indicator.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSession {

    /**
     * Order Acceptance (7:00 PM).
     */
    ORDER_ACCEPTANCE((short) 1, "Order Acceptance (7:00 PM)."),

    /**
     * Market Close (7:45 AM).
     */
    MARKET_CLOSE((short) 5, "Market Close (7:45 AM)."),

    /**
     * Overnight (8:00 PM).
     */
    OVERNIGHT((short) 6, "Overnight (8:00 PM).");

    private final short wire;

    private final String description;

    TradingSession(short wire, String description) {
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
    public static Optional<TradingSession> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ORDER_ACCEPTANCE);
            case 5 -> Optional.of(MARKET_CLOSE);
            case 6 -> Optional.of(OVERNIGHT);
            default -> Optional.empty();
        };
    }
}
