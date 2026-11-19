package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Cancel orders on logout/disconnection of session
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AutoCancel {

    /**
     * Do Not Cancel
     */
    DO_NOT_CANCEL((short) 0, "Do Not Cancel"),

    /**
     * Conform To Users Configuration
     */
    CONFORM_TO_USERS_CONFIGURATION((short) 1, "Conform To Users Configuration");

    private final short wire;

    private final String description;

    AutoCancel(short wire, String description) {
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
    public static Optional<AutoCancel> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DO_NOT_CANCEL);
            case 1 -> Optional.of(CONFORM_TO_USERS_CONFIGURATION);
            default -> Optional.empty();
        };
    }
}
