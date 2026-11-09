package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Status for Pending Cancel Request
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PendingCancelStatus {

    /**
     * Pending Cancellation is completed OR Pending State is Not Applicable
     */
    COMPLETED_OR_NOT_APPLICABLE(' ', "Pending Cancellation is completed OR Pending State is Not Applicable"),

    /**
     * Pending Cancellation Request Is Rejected
     */
    PENDING_CANCELLATION_REQUEST_IS_REJECTED('X', "Pending Cancellation Request Is Rejected"),

    /**
     * Cancel Request Was Received But Is Pending
     */
    CANCEL_REQUEST_WAS_RECEIVED_BUT_IS_PENDING('P', "Cancel Request Was Received But Is Pending");

    private final char wire;

    private final String description;

    PendingCancelStatus(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<PendingCancelStatus> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(COMPLETED_OR_NOT_APPLICABLE);
            case 'X' -> Optional.of(PENDING_CANCELLATION_REQUEST_IS_REJECTED);
            case 'P' -> Optional.of(CANCEL_REQUEST_WAS_RECEIVED_BUT_IS_PENDING);
            default -> Optional.empty();
        };
    }
}
