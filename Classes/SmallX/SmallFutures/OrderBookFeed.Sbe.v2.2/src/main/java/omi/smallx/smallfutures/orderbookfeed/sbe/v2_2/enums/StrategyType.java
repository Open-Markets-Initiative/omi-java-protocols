package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.enums;

import java.util.Optional;

/**
 * Type of multi-leg strategy
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum StrategyType {

    /**
     * Custom spread/Unrecognized
     */
    CUSTOM((short) 0, "Custom spread/Unrecognized"),

    /**
     * Futures calendar, front minus back month
     */
    FUTURES_CALENDAR((short) 1, "Futures calendar, front minus back month"),

    /**
     * Futures Inter-Commodity Spread, two-legged cross-product futures strategy with up to 5 ratio in legs
     */
    FUTURES_INTER_COMMODITY((short) 2, "Futures Inter-Commodity Spread, two-legged cross-product futures strategy with up to 5 ratio in legs"),

    /**
     * Covered Call
     */
    COVERED((short) 3, "Covered Call"),

    /**
     * OPTION_BUTTERFLY
     */
    OPTION_BUTTERFLY((short) 4, "OPTION_BUTTERFLY"),

    /**
     * OPTION_VERTICAL
     */
    OPTION_VERTICAL((short) 5, "OPTION_VERTICAL"),

    /**
     * OPTION_STRANGLE
     */
    OPTION_STRANGLE((short) 6, "OPTION_STRANGLE"),

    /**
     * OPTION_STRADDLE
     */
    OPTION_STRADDLE((short) 7, "OPTION_STRADDLE"),

    /**
     * OPTION_DIAGONAL
     */
    OPTION_DIAGONAL((short) 8, "OPTION_DIAGONAL"),

    /**
     * OPTION_CALENDAR
     */
    OPTION_CALENDAR((short) 9, "OPTION_CALENDAR"),

    /**
     * OPTION_IRON_CONDOR
     */
    OPTION_IRON_CONDOR((short) 10, "OPTION_IRON_CONDOR"),

    /**
     * PROTECTIVE_PUT
     */
    PROTECTIVE_PUT((short) 11, "PROTECTIVE_PUT");

    private final short wire;

    private final String description;

    StrategyType(short wire, String description) {
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
    public static Optional<StrategyType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(CUSTOM);
            case 1 -> Optional.of(FUTURES_CALENDAR);
            case 2 -> Optional.of(FUTURES_INTER_COMMODITY);
            case 3 -> Optional.of(COVERED);
            case 4 -> Optional.of(OPTION_BUTTERFLY);
            case 5 -> Optional.of(OPTION_VERTICAL);
            case 6 -> Optional.of(OPTION_STRANGLE);
            case 7 -> Optional.of(OPTION_STRADDLE);
            case 8 -> Optional.of(OPTION_DIAGONAL);
            case 9 -> Optional.of(OPTION_CALENDAR);
            case 10 -> Optional.of(OPTION_IRON_CONDOR);
            case 11 -> Optional.of(PROTECTIVE_PUT);
            default -> Optional.empty();
        };
    }
}
