package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Indicates the status of the execution acknowledgement
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ExecAckStatus {

    /**
     * Accepted
     */
    ACCEPTED((short) 1, "Accepted"),

    /**
     * Rejected
     */
    REJECTED((short) 2, "Rejected");

    private final short wire;

    private final String description;

    ExecAckStatus(short wire, String description) {
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
    public static Optional<ExecAckStatus> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ACCEPTED);
            case 2 -> Optional.of(REJECTED);
            default -> Optional.empty();
        };
    }
}
