package omi.eurex.t7.eobi.fbe.v13_0.enums;

import java.util.Optional;

/**
 * Defines the TradingSessionId values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionId {

    /**
     * Day
     */
    DAY((short) 1, "Day"),

    /**
     * Morning
     */
    MORNING((short) 3, "Morning"),

    /**
     * Evening
     */
    EVENING((short) 5, "Evening"),

    /**
     * After Hours
     */
    AFTER_HOURS((short) 6, "After Hours"),

    /**
     * Holiday
     */
    HOLIDAY((short) 7, "Holiday"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    TradingSessionId(short wire, String description) {
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
    public static Optional<TradingSessionId> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(DAY);
            case 3 -> Optional.of(MORNING);
            case 5 -> Optional.of(EVENING);
            case 6 -> Optional.of(AFTER_HOURS);
            case 7 -> Optional.of(HOLIDAY);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
