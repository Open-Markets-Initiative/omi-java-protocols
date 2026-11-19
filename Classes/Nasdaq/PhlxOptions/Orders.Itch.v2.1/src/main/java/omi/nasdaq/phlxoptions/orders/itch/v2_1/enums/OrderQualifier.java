package omi.nasdaq.phlxoptions.orders.itch.v2_1.enums;

import java.util.Optional;

/**
 * Order Qualifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderQualifier {

    /**
     * Opening Order
     */
    OPENING_ORDER('O', "Opening Order"),

    /**
     * Implied Order
     */
    IMPLIED_ORDER('I', "Implied Order"),

    /**
     * N/A
     */
    NA(' ', "N/A");

    private final char wire;

    private final String description;

    OrderQualifier(char wire, String description) {
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
    public static Optional<OrderQualifier> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPENING_ORDER);
            case 'I' -> Optional.of(IMPLIED_ORDER);
            case ' ' -> Optional.of(NA);
            default -> Optional.empty();
        };
    }
}
