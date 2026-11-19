package omi.biva.bivaequities.orderentry.ouch.v1_05.enums;

import java.util.Optional;

/**
 * Account type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AccountType {

    /**
     * Client
     */
    CLIENT('C', "Client"),

    /**
     * House
     */
    HOUSE('H', "House"),

    /**
     * Other
     */
    OTHER('O', "Other"),

    /**
     * Strategy
     */
    STRATEGY('Y', "Strategy"),

    /**
     * Market Maker
     */
    MARKET_MAKER('M', "Market Maker"),

    /**
     * Stabilisation
     */
    STABILISATION('S', "Stabilisation");

    private final char wire;

    private final String description;

    AccountType(char wire, String description) {
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
    public static Optional<AccountType> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CLIENT);
            case 'H' -> Optional.of(HOUSE);
            case 'O' -> Optional.of(OTHER);
            case 'Y' -> Optional.of(STRATEGY);
            case 'M' -> Optional.of(MARKET_MAKER);
            case 'S' -> Optional.of(STABILISATION);
            default -> Optional.empty();
        };
    }
}
