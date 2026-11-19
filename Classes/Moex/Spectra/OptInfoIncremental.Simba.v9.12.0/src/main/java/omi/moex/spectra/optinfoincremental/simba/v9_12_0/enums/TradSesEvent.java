package omi.moex.spectra.optinfoincremental.simba.v9_12_0.enums;

import java.util.Optional;

/**
 * TradSesEvent
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradSesEvent {

    /**
     * Trading resumed after intraday clearing session
     */
    TRADING_RESUMES((short) 0, "Trading resumed after intraday clearing session"),

    /**
     * Start and end of trading session
     */
    CHANGE_OF_TRADING_SESSION((short) 1, "Start and end of trading session"),

    /**
     * Trading session status change
     */
    CHANGE_OF_TRADING_STATUS((short) 3, "Trading session status change");

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
            case 0 -> Optional.of(TRADING_RESUMES);
            case 1 -> Optional.of(CHANGE_OF_TRADING_SESSION);
            case 3 -> Optional.of(CHANGE_OF_TRADING_STATUS);
            default -> Optional.empty();
        };
    }
}
