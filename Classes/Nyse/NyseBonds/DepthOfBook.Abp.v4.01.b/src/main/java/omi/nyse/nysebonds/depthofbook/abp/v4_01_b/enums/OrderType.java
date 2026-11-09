package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.enums;

import java.util.Optional;

/**
 * Whether the order is All or None, Minimum Quantity, or unspecified.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderType {

    /**
     * Unspecified
     */
    UNSPECIFIED((short) 0, "Unspecified"),

    /**
     * All Or None
     */
    ALL_OR_NONE((short) 1, "All Or None"),

    /**
     * Minimum Quantity
     */
    MINIMUM_QUANTITY((short) 2, "Minimum Quantity");

    private final short wire;

    private final String description;

    OrderType(short wire, String description) {
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
    public static Optional<OrderType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(UNSPECIFIED);
            case 1 -> Optional.of(ALL_OR_NONE);
            case 2 -> Optional.of(MINIMUM_QUANTITY);
            default -> Optional.empty();
        };
    }
}
