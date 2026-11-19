package omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Session phase
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionSubId {

    /**
     * Pre Trading Not Started
     */
    PRE_TRADING_NOT_STARTED((short) 1, "Pre Trading Not Started"),

    /**
     * Continuous Trading
     */
    CONTINUOUS_TRADING((short) 3, "Continuous Trading"),

    /**
     * Post Trading
     */
    POST_TRADING((short) 5, "Post Trading"),

    /**
     * Not Started
     */
    NOT_STARTED((short) 202, "Not Started"),

    /**
     * Open
     */
    OPEN((short) 203, "Open"),

    /**
     * Closed
     */
    CLOSED((short) 204, "Closed");

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
            case 1 -> Optional.of(PRE_TRADING_NOT_STARTED);
            case 3 -> Optional.of(CONTINUOUS_TRADING);
            case 5 -> Optional.of(POST_TRADING);
            case 202 -> Optional.of(NOT_STARTED);
            case 203 -> Optional.of(OPEN);
            case 204 -> Optional.of(CLOSED);
            default -> Optional.empty();
        };
    }
}
