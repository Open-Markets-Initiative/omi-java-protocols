package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.enums;

import java.util.Optional;

/**
 * execRestatementReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MassCancelRestatementReason {

    /**
     * ORDER_MASS_ACTION_FROM_CLIENT_REQUEST
     */
    ORDER_MASS_ACTION_FROM_CLIENT_REQUEST((short) 202, "ORDER_MASS_ACTION_FROM_CLIENT_REQUEST"),

    /**
     * MASS_CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR_REQUEST
     */
    MASS_CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR_REQUEST((short) 207, "MASS_CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR_REQUEST"),

    /**
     * execRestatementReason
     */
    NO_VALUE((short) 0, "execRestatementReason");

    private final short wire;

    private final String description;

    MassCancelRestatementReason(short wire, String description) {
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
    public static Optional<MassCancelRestatementReason> fromWire(short wire) {
        return switch (wire) {
            case 202 -> Optional.of(ORDER_MASS_ACTION_FROM_CLIENT_REQUEST);
            case 207 -> Optional.of(MASS_CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR_REQUEST);
            case 0 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
