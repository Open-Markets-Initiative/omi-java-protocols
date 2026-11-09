package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the TradSesEvent values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradSesEvent {

    /**
     * Start of Service
     */
    STARTOF_SERVICE((short) 101, "Start of Service"),

    /**
     * Market Reset
     */
    MARKET_RESET((short) 102, "Market Reset"),

    /**
     * End of Restatement
     */
    ENDOF_RESTATEMENT((short) 103, "End of Restatement"),

    /**
     * End of Service
     */
    ENDOF_DAY_SERVICE((short) 104, "End of Service"),

    /**
     * Service Resumed
     */
    SERVICE_RESUMED((short) 105, "Service Resumed"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    TradSesEvent(short wire, String description) {
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
    public static Optional<TradSesEvent> fromWire(short wire) {
        return switch (wire) {
            case 101 -> Optional.of(STARTOF_SERVICE);
            case 102 -> Optional.of(MARKET_RESET);
            case 103 -> Optional.of(ENDOF_RESTATEMENT);
            case 104 -> Optional.of(ENDOF_DAY_SERVICE);
            case 105 -> Optional.of(SERVICE_RESUMED);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
