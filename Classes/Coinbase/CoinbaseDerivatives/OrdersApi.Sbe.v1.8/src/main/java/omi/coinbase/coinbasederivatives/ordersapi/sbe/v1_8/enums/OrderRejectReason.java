package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.enums;

import java.util.Optional;

/**
 * rejectReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderRejectReason {

    /**
     * Error occurred during submit.
     */
    ERROR((short) 1, "Error occurred during submit."),

    /**
     * InstrumentId is unknown.
     */
    INVALID_INSTRUMENT((short) 2, "InstrumentId is unknown."),

    /**
     * ClientOrderId is already in use for another order.
     */
    CL_ORD_ID_IN_USE((short) 3, "ClientOrderId is already in use for another order."),

    /**
     * Some sort of validation failure.
     */
    VALIDATION_FAILURE((short) 8, "Some sort of validation failure."),

    /**
     * Unknown order.
     */
    UNKNOWN_ORDER((short) 9, "Unknown order.");

    private final short wire;

    private final String description;

    OrderRejectReason(short wire, String description) {
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
    public static Optional<OrderRejectReason> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ERROR);
            case 2 -> Optional.of(INVALID_INSTRUMENT);
            case 3 -> Optional.of(CL_ORD_ID_IN_USE);
            case 8 -> Optional.of(VALIDATION_FAILURE);
            case 9 -> Optional.of(UNKNOWN_ORDER);
            default -> Optional.empty();
        };
    }
}
