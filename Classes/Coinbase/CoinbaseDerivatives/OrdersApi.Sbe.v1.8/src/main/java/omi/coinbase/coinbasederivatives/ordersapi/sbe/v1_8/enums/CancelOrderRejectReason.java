package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.enums;

import java.util.Optional;

/**
 * rejectReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CancelOrderRejectReason {

    /**
     * Error occurred during cancel request.
     */
    ERROR((short) 1, "Error occurred during cancel request."),

    /**
     * Unknown order.
     */
    UNKNOWN_ORDER((short) 2, "Unknown order."),

    /**
     * Order already filled
     */
    ORDER_FILLED((short) 3, "Order already filled");

    private final short wire;

    private final String description;

    CancelOrderRejectReason(short wire, String description) {
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
    public static Optional<CancelOrderRejectReason> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ERROR);
            case 2 -> Optional.of(UNKNOWN_ORDER);
            case 3 -> Optional.of(ORDER_FILLED);
            default -> Optional.empty();
        };
    }
}
