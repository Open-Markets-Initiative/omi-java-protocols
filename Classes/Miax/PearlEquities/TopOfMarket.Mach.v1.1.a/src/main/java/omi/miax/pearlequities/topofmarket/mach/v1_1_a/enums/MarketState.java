package omi.miax.pearlequities.topofmarket.mach.v1_1_a.enums;

import java.util.Optional;

/**
 * Market State enum
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MarketState {

    /**
     * Pre Opening
     */
    PRE_OPENING((short) 1, "Pre Opening"),

    /**
     * Early Trading Session Future Implementation
     */
    EARLY_TRADING((short) 2, "Early Trading Session Future Implementation"),

    /**
     * Regular Trading Session
     */
    REGULAR_TRADING((short) 3, "Regular Trading Session"),

    /**
     * After Hours Trading Session Future Implementation
     */
    AFTER_HOURS_TRADING((short) 4, "After Hours Trading Session Future Implementation");

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
            case 2 -> Optional.of(EARLY_TRADING);
            case 3 -> Optional.of(REGULAR_TRADING);
            case 4 -> Optional.of(AFTER_HOURS_TRADING);
            default -> Optional.empty();
        };
    }
}
