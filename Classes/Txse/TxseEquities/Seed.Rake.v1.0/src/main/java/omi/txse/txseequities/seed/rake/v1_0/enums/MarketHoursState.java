package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum MarketHoursState.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum MarketHoursState {

    /**
     * Markets are closed before trading hours.
     */
    CLOSED_BEFORE_HOURS((byte) 0, "Markets are closed before trading hours."),

    /**
     * Early trading session is active (pre-market).
     */
    EARLY_SESSION((byte) 1, "Early trading session is active (pre-market)."),

    /**
     * Regular trading session is active.
     */
    REGULAR_SESSION((byte) 2, "Regular trading session is active."),

    /**
     * After-hours trading session is active (post-market).
     */
    AFTER_HOURS_SESSION((byte) 3, "After-hours trading session is active (post-market)."),

    /**
     * Markets are closed after trading hours.
     */
    CLOSED_AFTER_HOURS((byte) 4, "Markets are closed after trading hours.");

    private final byte wire;

    private final String description;

    MarketHoursState(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<MarketHoursState> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(CLOSED_BEFORE_HOURS);
            case 1 -> Optional.of(EARLY_SESSION);
            case 2 -> Optional.of(REGULAR_SESSION);
            case 3 -> Optional.of(AFTER_HOURS_SESSION);
            case 4 -> Optional.of(CLOSED_AFTER_HOURS);
            default -> Optional.empty();
        };
    }
}
