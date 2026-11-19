package omi.databento.marketdata.normalized.dbn.v2.enums;

import java.util.Optional;

/**
 * Further information about a status update
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TradingEvent {

    /**
     * None
     */
    NONE(0, "None"),

    /**
     * No Cancel
     */
    NO_CANCEL(1, "No Cancel"),

    /**
     * Change Trading Session
     */
    CHANGE_TRADING_SESSION(2, "Change Trading Session"),

    /**
     * Implied Matching On
     */
    IMPLIED_MATCHING_ON(3, "Implied Matching On"),

    /**
     * Implied Matching Off
     */
    IMPLIED_MATCHING_OFF(4, "Implied Matching Off");

    private final int wire;

    private final String description;

    TradingEvent(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<TradingEvent> fromWire(int wire) {
        return switch (wire) {
            case 0 -> Optional.of(NONE);
            case 1 -> Optional.of(NO_CANCEL);
            case 2 -> Optional.of(CHANGE_TRADING_SESSION);
            case 3 -> Optional.of(IMPLIED_MATCHING_ON);
            case 4 -> Optional.of(IMPLIED_MATCHING_OFF);
            default -> Optional.empty();
        };
    }
}
