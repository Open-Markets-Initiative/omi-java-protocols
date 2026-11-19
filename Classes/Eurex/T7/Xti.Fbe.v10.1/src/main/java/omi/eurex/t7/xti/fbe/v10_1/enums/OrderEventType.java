package omi.eurex.t7.xti.fbe.v10_1.enums;

import java.util.Optional;

/**
 * Defines the OrderEventType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderEventType {

    /**
     * Final order status after locked stock - Pending requests discarded
     */
    PENDINGREQUESTSDISCARDED((short) 100, "Final order status after locked stock - Pending requests discarded"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    OrderEventType(short wire, String description) {
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
    public static Optional<OrderEventType> fromWire(short wire) {
        return switch (wire) {
            case 100 -> Optional.of(PENDINGREQUESTSDISCARDED);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
