package omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.enums;

import java.util.Optional;

/**
 * Indicates if the order is a retail designated order (optional field)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CustomerType {

    /**
     * Retail designated order
     */
    RETAIL_DESIGNATED('R', "Retail designated order"),

    /**
     * Not a retail designated order
     */
    NOT_A_RETAIL_DESIGNATED('N', "Not a retail designated order"),

    /**
     * use the default configured on the port for your firm
     */
    DEFAULT(' ', "use the default configured on the port for your firm");

    private final char wire;

    private final String description;

    CustomerType(char wire, String description) {
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
    public static Optional<CustomerType> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(RETAIL_DESIGNATED);
            case 'N' -> Optional.of(NOT_A_RETAIL_DESIGNATED);
            case ' ' -> Optional.of(DEFAULT);
            default -> Optional.empty();
        };
    }
}
