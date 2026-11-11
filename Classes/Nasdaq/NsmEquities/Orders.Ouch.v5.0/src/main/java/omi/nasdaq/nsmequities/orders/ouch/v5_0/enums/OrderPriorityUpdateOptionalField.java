package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * Appendage Id
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderPriorityUpdateOptionalField {

    /**
     * Order Priority Update Optional UserRefIdx Enum
     */
    USERREFIDX((short) 28, "Order Priority Update Optional UserRefIdx Enum");

    private final short wire;

    private final String description;

    OrderPriorityUpdateOptionalField(short wire, String description) {
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
    public static Optional<OrderPriorityUpdateOptionalField> fromWire(short wire) {
        return wire == 28 ? Optional.of(USERREFIDX) : Optional.empty();
    }
}
