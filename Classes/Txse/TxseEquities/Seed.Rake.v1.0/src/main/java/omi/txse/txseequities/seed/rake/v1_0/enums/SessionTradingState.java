package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum SessionTradingState.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum SessionTradingState {

    /**
     * Market session is closed, outside of trading hours or not yet opened.
     */
    CLOSED((byte) 0, "Market session is closed, outside of trading hours or not yet opened."),

    /**
     * Market session is open and trading is active.
     */
    TRADING((byte) 1, "Market session is open and trading is active."),

    /**
     * Market-wide trading halt.
     */
    HALTED((byte) 2, "Market-wide trading halt.");

    private final byte wire;

    private final String description;

    SessionTradingState(byte wire, String description) {
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
    public static Optional<SessionTradingState> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(CLOSED);
            case 1 -> Optional.of(TRADING);
            case 2 -> Optional.of(HALTED);
            default -> Optional.empty();
        };
    }
}
