package omi.bme.bmeequities.orderentry.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Reason for rejection
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum BusinessRejectReason {

    /**
     * Other
     */
    OTHER((short) 0, "Other"),

    /**
     * Unsupported Message Type
     */
    UNSUPPORTED_MESSAGE_TYPE((short) 3, "Unsupported Message Type"),

    /**
     * Invalid Client Data Id
     */
    INVALID_CLIENT_DATA_ID((short) 30, "Invalid Client Data Id"),

    /**
     * Sponsored Access
     */
    SPONSORED_ACCESS((short) 31, "Sponsored Access"),

    /**
     * Quote Operation Rejected
     */
    QUOTE_OPERATION_REJECTED((short) 32, "Quote Operation Rejected"),

    /**
     * Invalid Security
     */
    INVALID_SECURITY((short) 33, "Invalid Security");

    private final short wire;

    private final String description;

    BusinessRejectReason(short wire, String description) {
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
    public static Optional<BusinessRejectReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(OTHER);
            case 3 -> Optional.of(UNSUPPORTED_MESSAGE_TYPE);
            case 30 -> Optional.of(INVALID_CLIENT_DATA_ID);
            case 31 -> Optional.of(SPONSORED_ACCESS);
            case 32 -> Optional.of(QUOTE_OPERATION_REJECTED);
            case 33 -> Optional.of(INVALID_SECURITY);
            default -> Optional.empty();
        };
    }
}
