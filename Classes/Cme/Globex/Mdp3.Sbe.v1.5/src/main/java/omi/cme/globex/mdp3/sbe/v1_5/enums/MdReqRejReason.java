package omi.cme.globex.mdp3.sbe.v1_5.enums;

import java.util.Optional;

/**
 * Market Data Request Reject reason code
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MdReqRejReason {

    /**
     * Unknown Security
     */
    UNKNOWN_SECURITY((short) 0, "Unknown Security"),

    /**
     * Unknown or Invalid Message
     */
    UNKNOWN_MESSAGE((short) 1, "Unknown or Invalid Message"),

    /**
     * Unsupported Scope
     */
    UNSUPPORTED_SCOPE((short) 2, "Unsupported Scope"),

    /**
     * Other
     */
    OTHER((short) 3, "Other");

    private final short wire;

    private final String description;

    MdReqRejReason(short wire, String description) {
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
    public static Optional<MdReqRejReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(UNKNOWN_SECURITY);
            case 1 -> Optional.of(UNKNOWN_MESSAGE);
            case 2 -> Optional.of(UNSUPPORTED_SCOPE);
            case 3 -> Optional.of(OTHER);
            default -> Optional.empty();
        };
    }
}
