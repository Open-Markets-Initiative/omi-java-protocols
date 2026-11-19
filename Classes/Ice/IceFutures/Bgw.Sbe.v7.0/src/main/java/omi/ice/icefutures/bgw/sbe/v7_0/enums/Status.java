package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * status
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Status {

    /**
     * Success
     */
    SUCCESS((short) 0, "Success"),

    /**
     * PartialSuccess
     */
    PARTIAL_SUCCESS((short) 1, "PartialSuccess"),

    /**
     * Failure
     */
    FAILURE((short) 2, "Failure");

    private final short wire;

    private final String description;

    Status(short wire, String description) {
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
    public static Optional<Status> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SUCCESS);
            case 1 -> Optional.of(PARTIAL_SUCCESS);
            case 2 -> Optional.of(FAILURE);
            default -> Optional.empty();
        };
    }
}
