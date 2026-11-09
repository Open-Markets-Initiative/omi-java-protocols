package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.enums;

import java.util.Optional;

/**
 * massActionRejectReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MassActionRejectReason {

    /**
     * MASS_ACTION_NOT_SUPPORTED
     */
    MASS_ACTION_NOT_SUPPORTED((short) 0, "MASS_ACTION_NOT_SUPPORTED"),

    /**
     * INVALID_OR_UNKNOWN_MARKET_SEGMENT
     */
    INVALID_OR_UNKNOWN_MARKET_SEGMENT((short) 8, "INVALID_OR_UNKNOWN_MARKET_SEGMENT"),

    /**
     * OTHER
     */
    OTHER((short) 99, "OTHER"),

    /**
     * massActionRejectReason
     */
    NO_VALUE((short) 255, "massActionRejectReason");

    private final short wire;

    private final String description;

    MassActionRejectReason(short wire, String description) {
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
    public static Optional<MassActionRejectReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(MASS_ACTION_NOT_SUPPORTED);
            case 8 -> Optional.of(INVALID_OR_UNKNOWN_MARKET_SEGMENT);
            case 99 -> Optional.of(OTHER);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
