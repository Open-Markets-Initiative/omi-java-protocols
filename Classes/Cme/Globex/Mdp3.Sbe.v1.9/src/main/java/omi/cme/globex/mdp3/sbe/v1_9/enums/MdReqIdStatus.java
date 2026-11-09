package omi.cme.globex.mdp3.sbe.v1_9.enums;

import java.util.Optional;

/**
 * Status of the request acknowledgement
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MdReqIdStatus {

    /**
     * Requested subscription scope is fully acknowledged
     */
    FULL_ACK((short) 0, "Requested subscription scope is fully acknowledged"),

    /**
     * Requested subscription scope is partially acknowledged
     */
    PARTIAL_ACK((short) 1, "Requested subscription scope is partially acknowledged");

    private final short wire;

    private final String description;

    MdReqIdStatus(short wire, String description) {
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
    public static Optional<MdReqIdStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(FULL_ACK);
            case 1 -> Optional.of(PARTIAL_ACK);
            default -> Optional.empty();
        };
    }
}
