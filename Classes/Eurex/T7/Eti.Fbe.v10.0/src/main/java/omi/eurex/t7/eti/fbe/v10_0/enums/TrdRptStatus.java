package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the TrdRptStatus values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TrdRptStatus {

    /**
     * Accepted
     */
    ACCEPTED((short) 0, "Accepted"),

    /**
     * Rejected
     */
    REJECTED((short) 1, "Rejected"),

    /**
     * Cancelled
     */
    CANCELLED((short) 2, "Cancelled"),

    /**
     * Pending new
     */
    PENDING_NEW((short) 4, "Pending new"),

    /**
     * Pending Cancel
     */
    PENDING_CANCEL((short) 5, "Pending Cancel"),

    /**
     * Terminated
     */
    TERMINATED((short) 7, "Terminated"),

    /**
     * Deemed verified
     */
    DEEMED_VERIFIED((short) 9, "Deemed verified"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    TrdRptStatus(short wire, String description) {
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
    public static Optional<TrdRptStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ACCEPTED);
            case 1 -> Optional.of(REJECTED);
            case 2 -> Optional.of(CANCELLED);
            case 4 -> Optional.of(PENDING_NEW);
            case 5 -> Optional.of(PENDING_CANCEL);
            case 7 -> Optional.of(TERMINATED);
            case 9 -> Optional.of(DEEMED_VERIFIED);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
