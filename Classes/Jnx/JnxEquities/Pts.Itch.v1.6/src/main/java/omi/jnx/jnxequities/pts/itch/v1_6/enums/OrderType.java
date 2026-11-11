package omi.jnx.jnxequities.pts.itch.v1_6.enums;

import java.util.Optional;

/**
 * Type of the order.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderType {

    /**
     * DLP order
     */
    DLP_ORDER('Q', "DLP order");

    private final char wire;

    private final String description;

    OrderType(char wire, String description) {
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
    public static Optional<OrderType> fromWire(char wire) {
        return wire == 'Q' ? Optional.of(DLP_ORDER) : Optional.empty();
    }
}
