package omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.enums;

import java.util.Optional;

/**
 * Indicates if the order is a retail designated order (optional field).
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CustomerType {

    /**
     * Retail designated order
     */
    RETAIL_DESIGNATED_ORDER('R', "Retail designated order"),

    /**
     * Not a retail designated order
     */
    NOT_A_RETAIL_DESIGNATED_ORDER('N', "Not a retail designated order");

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
            case 'R' -> Optional.of(RETAIL_DESIGNATED_ORDER);
            case 'N' -> Optional.of(NOT_A_RETAIL_DESIGNATED_ORDER);
            default -> Optional.empty();
        };
    }
}
