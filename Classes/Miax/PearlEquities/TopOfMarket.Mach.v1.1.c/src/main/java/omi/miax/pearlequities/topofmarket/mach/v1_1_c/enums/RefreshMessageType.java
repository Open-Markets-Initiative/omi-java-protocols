package omi.miax.pearlequities.topofmarket.mach.v1_1_c.enums;

import java.util.Optional;

/**
 * Identifies the data set the firm is requesting a refresh of.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RefreshMessageType {

    /**
     * Symbol Update Refresh
     */
    SYMBOL_UPDATE_REFRESH('S', "Symbol Update Refresh"),

    /**
     * Security Trading Status Refresh
     */
    SECURITY_TRADING_STATUS_REFRESH('t', "Security Trading Status Refresh"),

    /**
     * System State Refresh
     */
    SYSTEM_STATE_REFRESH('s', "System State Refresh"),

    /**
     * Top Of Market Refresh
     */
    TOP_OF_MARKET_REFRESH('Q', "Top Of Market Refresh");

    private final char wire;

    private final String description;

    RefreshMessageType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<RefreshMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SYMBOL_UPDATE_REFRESH);
            case 't' -> Optional.of(SECURITY_TRADING_STATUS_REFRESH);
            case 's' -> Optional.of(SYSTEM_STATE_REFRESH);
            case 'Q' -> Optional.of(TOP_OF_MARKET_REFRESH);
            default -> Optional.empty();
        };
    }
}
