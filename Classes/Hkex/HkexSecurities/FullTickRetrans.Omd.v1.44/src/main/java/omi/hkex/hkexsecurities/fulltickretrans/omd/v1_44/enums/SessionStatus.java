package omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.enums;

import java.util.Optional;

/**
 * Status of the session.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SessionStatus {

    /**
     * Session Active
     */
    SESSION_ACTIVE((short) 0, "Session Active"),

    /**
     * Invalid Username Or Ip Address
     */
    INVALID_USERNAME_OR_IP_ADDRESS((short) 5, "Invalid Username Or Ip Address"),

    /**
     * User Already Connected
     */
    USER_ALREADY_CONNECTED((short) 100, "User Already Connected");

    private final short wire;

    private final String description;

    SessionStatus(short wire, String description) {
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
    public static Optional<SessionStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SESSION_ACTIVE);
            case 5 -> Optional.of(INVALID_USERNAME_OR_IP_ADDRESS);
            case 100 -> Optional.of(USER_ALREADY_CONNECTED);
            default -> Optional.empty();
        };
    }
}
