package omi.nasdaq.nsmequities.orders.ouch.v4_2_2025.enums;

import java.util.Optional;

/**
 * Defines the CrossType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * No cross (continuous market)
     */
    NO_CROSS('N', "No cross (continuous market)"),

    /**
     * Opening cross
     */
    OPENING('O', "Opening cross"),

    /**
     * Closing cross
     */
    CLOSING('C', "Closing cross"),

    /**
     * Halt/IPO cross (Must be market price, refer to Prices in Data Types)
     */
    HALT_IPO_CROSS('H', "Halt/IPO cross (Must be market price, refer to Prices in Data Types)"),

    /**
     * Supplemental Order
     */
    SUPPLEMENTAL('S', "Supplemental Order"),

    /**
     * Extended Life
     */
    EXTENDED('E', "Extended Life"),

    /**
     * Extended Trading Close
     */
    EXTENDED_TRADING_CLOSE('A', "Extended Trading Close");

    private final char wire;

    private final String description;

    CrossType(char wire, String description) {
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
    public static Optional<CrossType> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NO_CROSS);
            case 'O' -> Optional.of(OPENING);
            case 'C' -> Optional.of(CLOSING);
            case 'H' -> Optional.of(HALT_IPO_CROSS);
            case 'S' -> Optional.of(SUPPLEMENTAL);
            case 'E' -> Optional.of(EXTENDED);
            case 'A' -> Optional.of(EXTENDED_TRADING_CLOSE);
            default -> Optional.empty();
        };
    }
}
