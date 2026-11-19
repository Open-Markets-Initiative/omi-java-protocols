package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * securityResponseType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityResponseType {

    /**
     * AcceptedSecurityAsDefined
     */
    ACCEPTED_SECURITY_AS_DEFINED((short) 1, "AcceptedSecurityAsDefined"),

    /**
     * AcceptedSecurityPerRequest
     */
    ACCEPTED_SECURITY_PER_REQUEST((short) 4, "AcceptedSecurityPerRequest"),

    /**
     * RejectedSecurityPerRequest
     */
    REJECTED_SECURITY_PER_REQUEST((short) 5, "RejectedSecurityPerRequest"),

    /**
     * SecurityAlreadyDefined
     */
    SECURITY_ALREADY_DEFINED((short) 10, "SecurityAlreadyDefined");

    private final short wire;

    private final String description;

    SecurityResponseType(short wire, String description) {
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
    public static Optional<SecurityResponseType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ACCEPTED_SECURITY_AS_DEFINED);
            case 4 -> Optional.of(ACCEPTED_SECURITY_PER_REQUEST);
            case 5 -> Optional.of(REJECTED_SECURITY_PER_REQUEST);
            case 10 -> Optional.of(SECURITY_ALREADY_DEFINED);
            default -> Optional.empty();
        };
    }
}
