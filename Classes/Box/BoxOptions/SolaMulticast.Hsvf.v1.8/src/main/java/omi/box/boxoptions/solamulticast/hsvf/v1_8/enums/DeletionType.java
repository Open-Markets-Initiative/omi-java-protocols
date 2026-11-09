package omi.box.boxoptions.solamulticast.hsvf.v1_8.enums;

import java.util.Optional;

/**
 * Deletion Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DeletionType {

    /**
     * Precise Order
     */
    PRECISE_ORDER('1', "Precise Order"),

    /**
     * All Previous Orders In The Specified Side
     */
    ALL_PREVIOUS_ORDERS_IN_THE_SPECIFIED_SIDE('2', "All Previous Orders In The Specified Side"),

    /**
     * All Orders
     */
    ALL_ORDERS('3', "All Orders");

    private final char wire;

    private final String description;

    DeletionType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<DeletionType> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(PRECISE_ORDER);
            case '2' -> Optional.of(ALL_PREVIOUS_ORDERS_IN_THE_SPECIFIED_SIDE);
            case '3' -> Optional.of(ALL_ORDERS);
            default -> Optional.empty();
        };
    }
}
