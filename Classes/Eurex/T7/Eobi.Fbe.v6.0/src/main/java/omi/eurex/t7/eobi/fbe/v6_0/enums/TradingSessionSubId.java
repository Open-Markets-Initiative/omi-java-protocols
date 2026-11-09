package omi.eurex.t7.eobi.fbe.v6_0.enums;

import java.util.Optional;

/**
 * Defines the TradingSessionSubId values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionSubId {

    /**
     * Pre Trading
     */
    PRE_TRADING((short) 1, "Pre Trading"),

    /**
     * Continuous
     */
    CONTINUOUS((short) 3, "Continuous"),

    /**
     * Closing
     */
    CLOSING((short) 4, "Closing"),

    /**
     * Post Trading
     */
    POST_TRADING((short) 5, "Post Trading"),

    /**
     * Quiescent
     */
    QUIESCENT((short) 7, "Quiescent"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    TradingSessionSubId(short wire, String description) {
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
    public static Optional<TradingSessionSubId> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(PRE_TRADING);
            case 3 -> Optional.of(CONTINUOUS);
            case 4 -> Optional.of(CLOSING);
            case 5 -> Optional.of(POST_TRADING);
            case 7 -> Optional.of(QUIESCENT);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
