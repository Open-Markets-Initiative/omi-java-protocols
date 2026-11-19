package omi.euronext.optiq.dropcopygateway.sbe.v5_35.enums;

import java.util.Optional;

/**
 * marketPhaseFlag
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MarketPhaseFlag {

    /**
     * Continuous_trading_only__default_
     */
    CONTINUOUSTRADINGONLYDEFAULT((short) 1, "Continuous_trading_only__default_"),

    /**
     * Trading_At_Last__TAL__trading_only
     */
    TRADING_AT_LAST_TA_LTRADINGONLY((short) 2, "Trading_At_Last__TAL__trading_only"),

    /**
     * Both
     */
    BOTH((short) 3, "Both"),

    /**
     * marketPhaseFlag
     */
    NO_VALUE((short) 255, "marketPhaseFlag");

    private final short wire;

    private final String description;

    MarketPhaseFlag(short wire, String description) {
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
    public static Optional<MarketPhaseFlag> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CONTINUOUSTRADINGONLYDEFAULT);
            case 2 -> Optional.of(TRADING_AT_LAST_TA_LTRADINGONLY);
            case 3 -> Optional.of(BOTH);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
