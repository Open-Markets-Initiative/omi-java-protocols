package omi.miax.pearlequities.depthofmarket.mach.v1_3_d.enums;

import java.util.Optional;

/**
 * Current market state.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MarketState {

    /**
     * Pre Opening
     */
    PRE_OPENING((short) 1, "Pre Opening"),

    /**
     * Early Trading Session
     */
    EARLY_TRADING_SESSION((short) 2, "Early Trading Session"),

    /**
     * Regular Trading Session
     */
    REGULAR_TRADING_SESSION((short) 3, "Regular Trading Session"),

    /**
     * Late Trading Session
     */
    LATE_TRADING_SESSION((short) 4, "Late Trading Session");

    private final short wire;

    private final String description;

    MarketState(short wire, String description) {
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
    public static Optional<MarketState> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(PRE_OPENING);
            case 2 -> Optional.of(EARLY_TRADING_SESSION);
            case 3 -> Optional.of(REGULAR_TRADING_SESSION);
            case 4 -> Optional.of(LATE_TRADING_SESSION);
            default -> Optional.empty();
        };
    }
}
