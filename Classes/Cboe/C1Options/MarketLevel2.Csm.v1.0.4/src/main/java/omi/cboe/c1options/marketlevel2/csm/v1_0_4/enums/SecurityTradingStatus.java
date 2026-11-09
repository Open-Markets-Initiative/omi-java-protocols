package omi.cboe.c1options.marketlevel2.csm.v1_0_4.enums;

import java.util.Optional;

/**
 * Defines the SecurityTradingStatus values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityTradingStatus {

    /**
     * Market Halted
     */
    HALTED((short) 2, "Market Halted"),

    /**
     * Market Open
     */
    OPEN((short) 17, "Market Open"),

    /**
     * Market Closed
     */
    CLOSED((short) 18, "Market Closed"),

    /**
     * Pre Open
     */
    PRE_OPEN((short) 21, "Pre Open"),

    /**
     * Market in Opening Rotation
     */
    OPENING_ROTATION((short) 22, "Market in Opening Rotation"),

    /**
     * Fast Market
     */
    FAST_MARKET((short) 23, "Fast Market"),

    /**
     * Strategy Market in Opening Rotation
     */
    STRATEGY_MARKET_IN_OPENING_ROTATION((short) 24, "Strategy Market in Opening Rotation"),

    /**
     * Strategy Market Quotes Non-Firm
     */
    STRATEGY_MARKET_QUOTES_NON_FIRM((short) 25, "Strategy Market Quotes Non-Firm"),

    /**
     * Market Suspended (Quotes are not firm)
     */
    SUSPENDED((short) 26, "Market Suspended (Quotes are not firm)");

    private final short wire;

    private final String description;

    SecurityTradingStatus(short wire, String description) {
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
    public static Optional<SecurityTradingStatus> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(HALTED);
            case 17 -> Optional.of(OPEN);
            case 18 -> Optional.of(CLOSED);
            case 21 -> Optional.of(PRE_OPEN);
            case 22 -> Optional.of(OPENING_ROTATION);
            case 23 -> Optional.of(FAST_MARKET);
            case 24 -> Optional.of(STRATEGY_MARKET_IN_OPENING_ROTATION);
            case 25 -> Optional.of(STRATEGY_MARKET_QUOTES_NON_FIRM);
            case 26 -> Optional.of(SUSPENDED);
            default -> Optional.empty();
        };
    }
}
