package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.enums;

import java.util.Optional;

/**
 * Defines the OpenClose values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpenClose {

    /**
     * Open
     */
    OPEN('O', "Open"),

    /**
     * Close
     */
    CLOSE('C', "Close"),

    /**
     * None Orders with AccountType value of 3 (House Trader) are not required to specify OpenClose or may optionally specify a value of “N”. Otherwise, orders with Orders with AccountType value of 1 (Customer Account) must specify OpenClose.
     */
    NONE('N', "None Orders with AccountType value of 3 (House Trader) are not required to specify OpenClose or may optionally specify a value of \u201CN\u201D. Otherwise, orders with Orders with AccountType value of 1 (Customer Account) must specify OpenClose.");

    private final char wire;

    private final String description;

    OpenClose(char wire, String description) {
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
    public static Optional<OpenClose> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPEN);
            case 'C' -> Optional.of(CLOSE);
            case 'N' -> Optional.of(NONE);
            default -> Optional.empty();
        };
    }
}
