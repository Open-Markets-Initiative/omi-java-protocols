package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.enums;

import java.util.Optional;

/**
 * Customer or Firm capacity specified with the order. Values include:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Capacity {

    /**
     * Not Specified
     */
    NOT_SPECIFIED(' ', "Not Specified"),

    /**
     * Customer
     */
    CUSTOMER('0', "Customer"),

    /**
     * Firm
     */
    FIRM('1', "Firm"),

    /**
     * Broker Dealer
     */
    BROKER_DEALER('2', "Broker Dealer"),

    /**
     * Market Maker
     */
    MARKET_MAKER('3', "Market Maker"),

    /**
     * Professional Customer
     */
    PROFESSIONAL_CUSTOMER('8', "Professional Customer");

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
            case ' ' -> Optional.of(NOT_SPECIFIED);
            case '0' -> Optional.of(CUSTOMER);
            case '1' -> Optional.of(FIRM);
            case '2' -> Optional.of(BROKER_DEALER);
            case '3' -> Optional.of(MARKET_MAKER);
            case '8' -> Optional.of(PROFESSIONAL_CUSTOMER);
            default -> Optional.empty();
        };
    }
}
