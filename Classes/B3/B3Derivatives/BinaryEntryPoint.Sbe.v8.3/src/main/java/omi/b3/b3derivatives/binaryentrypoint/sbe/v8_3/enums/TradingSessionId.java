package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.enums;

import java.util.Optional;

/**
 * tradingSessionID
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionId {

    /**
     * REGULAR_DAY_SESSION
     */
    REGULAR_DAY_SESSION((short) 1, "REGULAR_DAY_SESSION"),

    /**
     * NON_REGULAR_SESSION
     */
    NON_REGULAR_SESSION((short) 6, "NON_REGULAR_SESSION"),

    /**
     * tradingSessionID
     */
    NO_VALUE((short) 0, "tradingSessionID");

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
            case 1 -> Optional.of(REGULAR_DAY_SESSION);
            case 6 -> Optional.of(NON_REGULAR_SESSION);
            case 0 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
