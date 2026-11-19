package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.enums;

import java.util.Optional;

/**
 * Defines the Capacity values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Capacity {

    /**
     * Customer
     */
    CUSTOMER('C', "Customer"),

    /**
     * Firm The Capacity refers to the OCC account type. A value of “C” denotes an account that clears in the Customer range at OCC. A value of “F” denotes an account that clears in the Clearing Firm range at OCC.
     */
    FIRM('F', "Firm The Capacity refers to the OCC account type. A value of \u201CC\u201D denotes an account that clears in the Customer range at OCC. A value of \u201CF\u201D denotes an account that clears in the Clearing Firm range at OCC.");

    private final char wire;

    private final String description;

    Capacity(char wire, String description) {
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
    public static Optional<Capacity> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CUSTOMER);
            case 'F' -> Optional.of(FIRM);
            default -> Optional.empty();
        };
    }
}
