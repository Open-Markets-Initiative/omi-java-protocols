package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Modification request status
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PendingModifyStatus {

    /**
     * Pending Modification Is Completed Or Pending State Is Not Applicable
     */
    PENDING_MODIFICATION_IS_COMPLETED_OR_PENDING_STATE_IS_NOT_APPLICABLE(' ', "Pending Modification Is Completed Or Pending State Is Not Applicable"),

    /**
     * Modification Request Is Sent To Another Market And Is Pending Completion
     */
    MODIFICATION_REQUEST_IS_SENT_TO_ANOTHER_MARKET_AND_IS_PENDING_COMPLETION('P', "Modification Request Is Sent To Another Market And Is Pending Completion"),

    /**
     * Pending Modification Request Is Rejected
     */
    PENDING_MODIFICATION_REQUEST_IS_REJECTED('X', "Pending Modification Request Is Rejected");

    private final char wire;

    private final String description;

    PendingModifyStatus(char wire, String description) {
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
    public static Optional<PendingModifyStatus> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(PENDING_MODIFICATION_IS_COMPLETED_OR_PENDING_STATE_IS_NOT_APPLICABLE);
            case 'P' -> Optional.of(MODIFICATION_REQUEST_IS_SENT_TO_ANOTHER_MARKET_AND_IS_PENDING_COMPLETION);
            case 'X' -> Optional.of(PENDING_MODIFICATION_REQUEST_IS_REJECTED);
            default -> Optional.empty();
        };
    }
}
