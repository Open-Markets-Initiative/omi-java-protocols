package omi.box.boxoptions.solamulticast.hsvf.v1_8.enums;

import java.util.Optional;

/**
 * Indicates the account type for which an order was entered using the clearing house member's account typology.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TypeOfClearingAccount {

    /**
     * Public Customer
     */
    PUBLIC_CUSTOMER('6', "Public Customer"),

    /**
     * Broker Dealer
     */
    BROKER_DEALER('7', "Broker Dealer"),

    /**
     * Market Maker
     */
    MARKET_MAKER('8', "Market Maker"),

    /**
     * Professional Customer
     */
    PROFESSIONAL_CUSTOMER('T', "Professional Customer"),

    /**
     * Broker Dealer Cleared As Customer
     */
    BROKER_DEALER_CLEARED_AS_CUSTOMER('W', "Broker Dealer Cleared As Customer"),

    /**
     * Away Market Maker
     */
    AWAY_MARKET_MAKER('X', "Away Market Maker");

    private final char wire;

    private final String description;

    TypeOfClearingAccount(char wire, String description) {
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
    public static Optional<TypeOfClearingAccount> fromWire(char wire) {
        return switch (wire) {
            case '6' -> Optional.of(PUBLIC_CUSTOMER);
            case '7' -> Optional.of(BROKER_DEALER);
            case '8' -> Optional.of(MARKET_MAKER);
            case 'T' -> Optional.of(PROFESSIONAL_CUSTOMER);
            case 'W' -> Optional.of(BROKER_DEALER_CLEARED_AS_CUSTOMER);
            case 'X' -> Optional.of(AWAY_MARKET_MAKER);
            default -> Optional.empty();
        };
    }
}
