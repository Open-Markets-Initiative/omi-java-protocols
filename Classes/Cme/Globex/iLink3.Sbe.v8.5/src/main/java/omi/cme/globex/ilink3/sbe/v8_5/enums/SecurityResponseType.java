package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Type of security definition message response.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityResponseType {

    /**
     * Accept Security Proposal as is
     */
    ACCEPT_SECURITY_PROPOSALASIS((short) 1, "Accept Security Proposal as is"),

    /**
     * Accept Security proposal with revisions as indicated in the message
     */
    ACCEPT_SECURITYPROPOSALWITHREVISIONSASINDICATEDINTHEMESSAGE((short) 2, "Accept Security proposal with revisions as indicated in the message"),

    /**
     * Reject Security Proposal
     */
    REJECT_SECURITY_PROPOSAL((short) 5, "Reject Security Proposal");

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
            case 1 -> Optional.of(ACCEPT_SECURITY_PROPOSALASIS);
            case 2 -> Optional.of(ACCEPT_SECURITYPROPOSALWITHREVISIONSASINDICATEDINTHEMESSAGE);
            case 5 -> Optional.of(REJECT_SECURITY_PROPOSAL);
            default -> Optional.empty();
        };
    }
}
