package omi.box.boxoptions.solamulticast.hsvf.v1_8.enums;

import java.util.Optional;

/**
 * Type of limit entered
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TypeOfOrder {

    /**
     * Initial Order
     */
    INITIAL_ORDER('A', "Initial Order"),

    /**
     * Exposed Order
     */
    EXPOSED_ORDER('P', "Exposed Order");

    private final char wire;

    private final String description;

    TypeOfOrder(char wire, String description) {
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
    public static Optional<TypeOfOrder> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(INITIAL_ORDER);
            case 'P' -> Optional.of(EXPOSED_ORDER);
            default -> Optional.empty();
        };
    }
}
