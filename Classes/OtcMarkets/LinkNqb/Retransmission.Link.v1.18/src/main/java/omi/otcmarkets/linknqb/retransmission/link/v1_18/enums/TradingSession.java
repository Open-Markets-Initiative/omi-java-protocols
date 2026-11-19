package omi.otcmarkets.linknqb.retransmission.link.v1_18.enums;

import java.util.Optional;

/**
 * Trading session indicator.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSession {

    /**
     * Order Acceptance (6 AM).
     */
    ORDER_ACCEPTANCE((short) 1, "Order Acceptance (6 AM)."),

    /**
     * Pre-Market Open (8 AM). Extended Day orders become active for publication and trading.
     */
    PRE_MARKET_OPEN((short) 2, "Pre-Market Open (8 AM). Extended Day orders become active for publication and trading."),

    /**
     * Market Open (9:30 AM). Regular Day orders become active for publication and trading.
     */
    MARKET_OPEN((short) 3, "Market Open (9:30 AM). Regular Day orders become active for publication and trading."),

    /**
     * After Hours (4 PM). Regular Day orders expire, Extended Day orders continue to be active.
     */
    AFTER_HOURS((short) 4, "After Hours (4 PM). Regular Day orders expire, Extended Day orders continue to be active."),

    /**
     * Market Close (5 PM). Extended Day orders expire.
     */
    MARKET_CLOSE((short) 5, "Market Close (5 PM). Extended Day orders expire.");

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
            case 2 -> Optional.of(PRE_MARKET_OPEN);
            case 3 -> Optional.of(MARKET_OPEN);
            case 4 -> Optional.of(AFTER_HOURS);
            case 5 -> Optional.of(MARKET_CLOSE);
            default -> Optional.empty();
        };
    }
}
