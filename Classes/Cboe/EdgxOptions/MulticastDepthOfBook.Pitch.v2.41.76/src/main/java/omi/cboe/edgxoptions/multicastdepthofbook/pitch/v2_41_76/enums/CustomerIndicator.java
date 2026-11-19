package omi.cboe.edgxoptions.multicastdepthofbook.pitch.v2_41_76.enums;

import java.util.Optional;

/**
 * BZX/C1/EDGX Options Only (space filled on C2 Options and all equities markets). N = Non-Customer, C = Customer, R = Retail Priority order (EDGX Equities only).
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CustomerIndicator {

    /**
     * Non Customer
     */
    NON_CUSTOMER('N', "Non Customer"),

    /**
     * Customer
     */
    CUSTOMER('C', "Customer"),

    /**
     * Retail Priority Order
     */
    RETAIL_PRIORITY_ORDER('R', "Retail Priority Order");

    private final char wire;

    private final String description;

    CustomerIndicator(char wire, String description) {
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
    public static Optional<CustomerIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NON_CUSTOMER);
            case 'C' -> Optional.of(CUSTOMER);
            case 'R' -> Optional.of(RETAIL_PRIORITY_ORDER);
            default -> Optional.empty();
        };
    }
}
