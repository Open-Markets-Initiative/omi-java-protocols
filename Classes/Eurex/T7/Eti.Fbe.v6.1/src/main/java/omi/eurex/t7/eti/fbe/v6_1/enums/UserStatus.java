package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the UserStatus values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum UserStatus {

    /**
     * Forced user logout by exchange
     */
    USERFORCEDLOGOUT((short) 7, "Forced user logout by exchange"),

    /**
     * Admission to trading suspended
     */
    USERSTOPPED((short) 10, "Admission to trading suspended"),

    /**
     * Suspension revoked
     */
    USERRELEASED((short) 11, "Suspension revoked"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    UserStatus(short wire, String description) {
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
    public static Optional<UserStatus> fromWire(short wire) {
        return switch (wire) {
            case 7 -> Optional.of(USERFORCEDLOGOUT);
            case 10 -> Optional.of(USERSTOPPED);
            case 11 -> Optional.of(USERRELEASED);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
