package omi.cme.globex.mdp3.sbe.v1_9.enums;

import java.util.Optional;

/**
 * Error code for reject reason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ErrorCodes {

    /**
     * Failed authentication
     */
    HMAC_REJECT((short) 0, "Failed authentication"),

    /**
     * Failed required field validation
     */
    INVALID_VALUE((short) 1, "Failed required field validation"),

    /**
     * Slow connection
     */
    SLOW_CONNECTION((short) 2, "Slow connection"),

    /**
     * Unexpected request, see Reason field for details
     */
    OTHER((short) 3, "Unexpected request, see Reason field for details");

    private final short wire;

    private final String description;

    ErrorCodes(short wire, String description) {
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
    public static Optional<ErrorCodes> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(HMAC_REJECT);
            case 1 -> Optional.of(INVALID_VALUE);
            case 2 -> Optional.of(SLOW_CONNECTION);
            case 3 -> Optional.of(OTHER);
            default -> Optional.empty();
        };
    }
}
