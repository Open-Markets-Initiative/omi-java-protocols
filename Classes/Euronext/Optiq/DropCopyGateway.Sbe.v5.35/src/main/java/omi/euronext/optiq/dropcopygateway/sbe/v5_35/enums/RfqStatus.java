package omi.euronext.optiq.dropcopygateway.sbe.v5_35.enums;

import java.util.Optional;

/**
 * rFQStatus
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RfqStatus {

    /**
     * Alive
     */
    ALIVE((short) 0, "Alive"),

    /**
     * Confirmed
     */
    CONFIRMED((short) 1, "Confirmed"),

    /**
     * Canceled
     */
    CANCELED((short) 2, "Canceled"),

    /**
     * Expired
     */
    EXPIRED((short) 3, "Expired");

    private final short wire;

    private final String description;

    RfqStatus(short wire, String description) {
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
    public static Optional<RfqStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ALIVE);
            case 1 -> Optional.of(CONFIRMED);
            case 2 -> Optional.of(CANCELED);
            case 3 -> Optional.of(EXPIRED);
            default -> Optional.empty();
        };
    }
}
