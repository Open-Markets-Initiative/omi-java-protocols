package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * This indicates if the Sequence message being sent by CME is to warn that one keep alive interval has lapsed without any message received from customer (this can also be sent from customer to CME)
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum KeepAliveIntervalLapsed {

    /**
     * NotLapsed
     */
    NOT_LAPSED((short) 0, "NotLapsed"),

    /**
     * Lapsed
     */
    LAPSED((short) 1, "Lapsed");

    private final short wire;

    private final String description;

    KeepAliveIntervalLapsed(short wire, String description) {
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
    public static Optional<KeepAliveIntervalLapsed> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_LAPSED);
            case 1 -> Optional.of(LAPSED);
            default -> Optional.empty();
        };
    }
}
