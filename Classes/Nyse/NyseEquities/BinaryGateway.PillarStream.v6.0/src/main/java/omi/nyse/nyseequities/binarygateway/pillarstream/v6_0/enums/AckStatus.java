package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums;

import java.util.Optional;

/**
 * Acknowledgement status of the session configuration.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AckStatus {

    /**
     * Unsolicited / Start of Day
     */
    UNSOLICITED((short) 0, "Unsolicited / Start of Day"),

    /**
     * User Request Valid
     */
    USER_REQUEST_VALID((short) 1, "User Request Valid"),

    /**
     * User Request Invalid (Rejected)
     */
    USER_REQUEST_INVALID((short) 2, "User Request Invalid (Rejected)");

    private final short wire;

    private final String description;

    AckStatus(short wire, String description) {
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
    public static Optional<AckStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(UNSOLICITED);
            case 1 -> Optional.of(USER_REQUEST_VALID);
            case 2 -> Optional.of(USER_REQUEST_INVALID);
            default -> Optional.empty();
        };
    }
}
