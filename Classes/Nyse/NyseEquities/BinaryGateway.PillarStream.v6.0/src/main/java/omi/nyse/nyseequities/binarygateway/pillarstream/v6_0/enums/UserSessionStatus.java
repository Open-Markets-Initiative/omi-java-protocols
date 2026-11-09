package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums;

import java.util.Optional;

/**
 * Indicates the status of the gateway session.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum UserSessionStatus {

    /**
     * Permission to open streams for reading and writing
     */
    ACTIVE((short) 1, "Permission to open streams for reading and writing"),

    /**
     * Permission to open read-only streams
     */
    INACTIVE((short) 2, "Permission to open read-only streams"),

    /**
     * Permission to open read-only streams
     */
    PROSPECT((short) 3, "Permission to open read-only streams");

    private final short wire;

    private final String description;

    UserSessionStatus(short wire, String description) {
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
    public static Optional<UserSessionStatus> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ACTIVE);
            case 2 -> Optional.of(INACTIVE);
            case 3 -> Optional.of(PROSPECT);
            default -> Optional.empty();
        };
    }
}
