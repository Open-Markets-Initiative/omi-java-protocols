package omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.enums;

import java.util.Optional;

/**
 * For Order Exposure only.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CustomerIndicator {

    /**
     * Customer
     */
    CUSTOMER('C', "Customer"),

    /**
     * Firm
     */
    FIRM('F', "Firm"),

    /**
     * On-floor Market Maker
     */
    ON_FLOOR('M', "On-floor Market Maker"),

    /**
     * Professional Customer
     */
    PROFESSIONAL('P', "Professional Customer"),

    /**
     * Broker Dealer/ Non-PHLX
     */
    NON_PHLX('B', "Broker Dealer/ Non-PHLX");

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
            case 'C' -> Optional.of(CUSTOMER);
            case 'F' -> Optional.of(FIRM);
            case 'M' -> Optional.of(ON_FLOOR);
            case 'P' -> Optional.of(PROFESSIONAL);
            case 'B' -> Optional.of(NON_PHLX);
            default -> Optional.empty();
        };
    }
}
