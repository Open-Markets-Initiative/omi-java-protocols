package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.enums;

import java.util.Optional;

/**
 * Defines the AccountType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AccountType {

    /**
     * Account is carried on customer side of the books.
     */
    ACCOUNT_IS_CARRIED_ON_CUSTOMER_SIDE_OF_THE_BOOKS('1', "Account is carried on customer side of the books."),

    /**
     * House Trader
     */
    HOUSE_TRADER('3', "House Trader");

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
            case '1' -> Optional.of(ACCOUNT_IS_CARRIED_ON_CUSTOMER_SIDE_OF_THE_BOOKS);
            case '3' -> Optional.of(HOUSE_TRADER);
            default -> Optional.empty();
        };
    }
}
