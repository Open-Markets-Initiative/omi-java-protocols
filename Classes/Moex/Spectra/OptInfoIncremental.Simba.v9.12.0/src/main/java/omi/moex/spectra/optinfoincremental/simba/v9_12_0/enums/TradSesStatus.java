package omi.moex.spectra.optinfoincremental.simba.v9_12_0.enums;

import java.util.Optional;

/**
 * TradSesStatus
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradSesStatus {

    /**
     * Session paused
     */
    HALTED((short) 1, "Session paused"),

    /**
     * Session started
     */
    OPEN((short) 2, "Session started"),

    /**
     * Session ended
     */
    CLOSED((short) 3, "Session ended"),

    /**
     * Session initiated
     */
    PRE_OPEN((short) 4, "Session initiated");

    private final short wire;

    private final String description;

    TradSesStatus(short wire, String description) {
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
    public static Optional<TradSesStatus> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(HALTED);
            case 2 -> Optional.of(OPEN);
            case 3 -> Optional.of(CLOSED);
            case 4 -> Optional.of(PRE_OPEN);
            default -> Optional.empty();
        };
    }
}
