package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Whether the order is a pegged order.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum NewOrderOrderSubType {

    /**
     * Order
     */
    ORDER((short) 0, "Order"),

    /**
     * Pegged Order
     */
    PEGGED_ORDER((short) 5, "Pegged Order"),

    /**
     * Random Peak Size
     */
    RANDOM_PEAK_SIZE((short) 51, "Random Peak Size"),

    /**
     * Offset
     */
    OFFSET((short) 55, "Offset");

    private final short wire;

    private final String description;

    NewOrderOrderSubType(short wire, String description) {
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
    public static Optional<NewOrderOrderSubType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ORDER);
            case 5 -> Optional.of(PEGGED_ORDER);
            case 51 -> Optional.of(RANDOM_PEAK_SIZE);
            case 55 -> Optional.of(OFFSET);
            default -> Optional.empty();
        };
    }
}
