package omi.bme.bmeequities.marketandorder.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Code indicating the rejection motive
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SessionRejectReason {

    /**
     * Invalid Msg Type
     */
    INVALID_MSG_TYPE((short) 11, "Invalid Msg Type"),

    /**
     * Wrong Message Size
     */
    WRONG_MESSAGE_SIZE((short) 30, "Wrong Message Size"),

    /**
     * Throttle Limit Exceeded
     */
    THROTTLE_LIMIT_EXCEEDED((short) 31, "Throttle Limit Exceeded"),

    /**
     * Invalid Client Session Status
     */
    INVALID_CLIENT_SESSION_STATUS((short) 33, "Invalid Client Session Status"),

    /**
     * Other
     */
    OTHER((short) 99, "Other");

    private final short wire;

    private final String description;

    SessionRejectReason(short wire, String description) {
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
    public static Optional<SessionRejectReason> fromWire(short wire) {
        return switch (wire) {
            case 11 -> Optional.of(INVALID_MSG_TYPE);
            case 30 -> Optional.of(WRONG_MESSAGE_SIZE);
            case 31 -> Optional.of(THROTTLE_LIMIT_EXCEEDED);
            case 33 -> Optional.of(INVALID_CLIENT_SESSION_STATUS);
            case 99 -> Optional.of(OTHER);
            default -> Optional.empty();
        };
    }
}
