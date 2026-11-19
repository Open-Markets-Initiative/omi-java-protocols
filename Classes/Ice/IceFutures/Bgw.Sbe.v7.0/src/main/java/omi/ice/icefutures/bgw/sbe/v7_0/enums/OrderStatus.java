package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * orderStatus
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderStatus {

    /**
     * New
     */
    NEW((short) 0, "New"),

    /**
     * PartialFill
     */
    PARTIAL_FILL((short) 1, "PartialFill"),

    /**
     * Fill
     */
    FILL((short) 2, "Fill"),

    /**
     * Canceled
     */
    CANCELED((short) 4, "Canceled"),

    /**
     * Replace
     */
    REPLACE((short) 5, "Replace"),

    /**
     * Rejected
     */
    REJECTED((short) 8, "Rejected");

    private final short wire;

    private final String description;

    OrderStatus(short wire, String description) {
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
    public static Optional<OrderStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NEW);
            case 1 -> Optional.of(PARTIAL_FILL);
            case 2 -> Optional.of(FILL);
            case 4 -> Optional.of(CANCELED);
            case 5 -> Optional.of(REPLACE);
            case 8 -> Optional.of(REJECTED);
            default -> Optional.empty();
        };
    }
}
