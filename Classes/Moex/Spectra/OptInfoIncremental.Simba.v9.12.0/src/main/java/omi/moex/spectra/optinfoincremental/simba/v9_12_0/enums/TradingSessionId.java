package omi.moex.spectra.optinfoincremental.simba.v9_12_0.enums;

import java.util.Optional;

/**
 * TradingSessionID
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionId {

    /**
     * Day session
     */
    DAY((short) 1, "Day session"),

    /**
     * Morning session
     */
    MORNING((short) 3, "Morning session"),

    /**
     * Evening session
     */
    EVENING((short) 5, "Evening session"),

    /**
     * Weekend session
     */
    WEEKEND((short) 100, "Weekend session");

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
            case 100 -> Optional.of(WEEKEND);
            default -> Optional.empty();
        };
    }
}
