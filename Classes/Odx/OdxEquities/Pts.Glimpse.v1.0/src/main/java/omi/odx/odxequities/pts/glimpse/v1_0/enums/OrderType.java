package omi.odx.odxequities.pts.glimpse.v1_0.enums;

import java.util.Optional;

/**
 * Type of the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderType {

    /**
     * Dlp Order
     */
    DLP_ORDER('Q', "Dlp Order");

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
