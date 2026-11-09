package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.enums;

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
     * Market Maker
     */
    MARKET_MAKER('M', "Market Maker"),

    /**
     * Firm
     */
    FIRM('F', "Firm"),

    /**
     * Professional Customer
     */
    PROFESSIONAL_CUSTOMER('U', "Professional Customer"),

    /**
     * Non Cboe Market Maker
     */
    NON_CBOE_MARKET_MAKER('N', "Non Cboe Market Maker"),

    /**
     * Broker Dealer
     */
    BROKER_DEALER('B', "Broker Dealer"),

    /**
     * Joint Back Office
     */
    JOINT_BACK_OFFICE('J', "Joint Back Office");

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
            case 'M' -> Optional.of(MARKET_MAKER);
            case 'F' -> Optional.of(FIRM);
            case 'U' -> Optional.of(PROFESSIONAL_CUSTOMER);
            case 'N' -> Optional.of(NON_CBOE_MARKET_MAKER);
            case 'B' -> Optional.of(BROKER_DEALER);
            case 'J' -> Optional.of(JOINT_BACK_OFFICE);
            default -> Optional.empty();
        };
    }
}
