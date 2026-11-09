package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Indicates the status of the MPID
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MpidStatus {

    /**
     * Active
     */
    ACTIVE((short) 1, "Active"),

    /**
     * Inactive
     */
    INACTIVE((short) 2, "Inactive"),

    /**
     * Prospect
     */
    PROSPECT((short) 3, "Prospect");

    private final short wire;

    private final String description;

    MpidStatus(short wire, String description) {
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
    public static Optional<MpidStatus> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ACTIVE);
            case 2 -> Optional.of(INACTIVE);
            case 3 -> Optional.of(PROSPECT);
            default -> Optional.empty();
        };
    }
}
