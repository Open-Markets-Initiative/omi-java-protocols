package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * massActionType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MassActionType {

    /**
     * RELEASE_ORDERS_FROM_SUSPENSION
     */
    RELEASE_ORDERS_FROM_SUSPENSION((short) 2, "RELEASE_ORDERS_FROM_SUSPENSION"),

    /**
     * CANCEL_ORDERS
     */
    CANCEL_ORDERS((short) 3, "CANCEL_ORDERS"),

    /**
     * CANCEL_AND_SUSPEND_ORDERS
     */
    CANCEL_AND_SUSPEND_ORDERS((short) 4, "CANCEL_AND_SUSPEND_ORDERS");

    private final short wire;

    private final String description;

    MassActionType(short wire, String description) {
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
    public static Optional<MassActionType> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(RELEASE_ORDERS_FROM_SUSPENSION);
            case 3 -> Optional.of(CANCEL_ORDERS);
            case 4 -> Optional.of(CANCEL_AND_SUSPEND_ORDERS);
            default -> Optional.empty();
        };
    }
}
