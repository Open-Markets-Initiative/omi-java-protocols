package omi.nyse.arcaoptions.deepfeed.pillar.v1_2_f.enums;

import java.util.Optional;

/**
 * Capacity of the order:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CustIndicator {

    /**
     * Customer
     */
    CUSTOMER('C', "Customer"),

    /**
     * Non Customer
     */
    NON_CUSTOMER('N', "Non Customer"),

    /**
     * Derived
     */
    DERIVED('D', "Derived");

    private final char wire;

    private final String description;

    CustIndicator(char wire, String description) {
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
    public static Optional<CustIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CUSTOMER);
            case 'N' -> Optional.of(NON_CUSTOMER);
            case 'D' -> Optional.of(DERIVED);
            default -> Optional.empty();
        };
    }
}
