package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the OrderCategory values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderCategory {

    /**
     * Order
     */
    ORDER('1', "Order"),

    /**
     * Quote
     */
    QUOTE('2', "Quote");

    private final char wire;

    private final String description;

    OrderCategory(char wire, String description) {
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
    public static Optional<OrderCategory> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(ORDER);
            case '2' -> Optional.of(QUOTE);
            default -> Optional.empty();
        };
    }
}
