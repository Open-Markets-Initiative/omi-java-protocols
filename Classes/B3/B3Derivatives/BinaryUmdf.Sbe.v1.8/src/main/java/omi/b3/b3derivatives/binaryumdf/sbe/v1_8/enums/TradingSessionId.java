package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * tradingSessionID
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionId {

    /**
     * Regular day session.
     */
    REGULAR_TRADING_SESSION((short) 1, "Regular day session."),

    /**
     * Non-Regular Session (after hours).
     */
    NON_REGULAR_TRADING_SESSION((short) 6, "Non-Regular Session (after hours).");

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
            case 1 -> Optional.of(REGULAR_TRADING_SESSION);
            case 6 -> Optional.of(NON_REGULAR_TRADING_SESSION);
            default -> Optional.empty();
        };
    }
}
