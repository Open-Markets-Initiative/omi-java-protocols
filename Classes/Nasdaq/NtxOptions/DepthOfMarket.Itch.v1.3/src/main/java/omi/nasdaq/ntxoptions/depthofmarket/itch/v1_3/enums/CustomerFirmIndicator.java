package omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.enums;

import java.util.Optional;

/**
 * For Order Exposure (AuctionType=I) only. Indicates the order capacity:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CustomerFirmIndicator {

    /**
     * Customer
     */
    CUSTOMER('C', "Customer"),

    /**
     * Firm/ Joint Back Office
     */
    FIRM_JOINT('F', "Firm/ Joint Back Office"),

    /**
     * On-floor Market Maker
     */
    ON_FLOOR('M', "On-floor Market Maker"),

    /**
     * Professional Customer
     */
    PROFESSIONAL('P', "Professional Customer"),

    /**
     * Broker Dealer/ Non Registered Market Maker
     */
    BROKER_DEALER_NON_REGISTERED('B', "Broker Dealer/ Non Registered Market Maker");

    private final char wire;

    private final String description;

    CustomerFirmIndicator(char wire, String description) {
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
    public static Optional<CustomerFirmIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CUSTOMER);
            case 'F' -> Optional.of(FIRM_JOINT);
            case 'M' -> Optional.of(ON_FLOOR);
            case 'P' -> Optional.of(PROFESSIONAL);
            case 'B' -> Optional.of(BROKER_DEALER_NON_REGISTERED);
            default -> Optional.empty();
        };
    }
}
