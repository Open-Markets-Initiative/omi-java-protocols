package omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the PriceType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceType {

    /**
     * Fixed cabinet trade price
     */
    FIXED_CABINET_TRADE_PRICE('0', "Fixed cabinet trade price"),

    /**
     * (Default) Price per unit (contract)
     */
    DEFAULT_PRICE_PER_UNIT_CONTRACT('2', "(Default) Price per unit (contract)"),

    /**
     * Fixed amount (cash spread pricing) - only for complex orders routed to the floor
     */
    FIXED_AMOUNT('3', "Fixed amount (cash spread pricing) - only for complex orders routed to the floor");

    private final char wire;

    private final String description;

    PriceType(char wire, String description) {
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
    public static Optional<PriceType> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(FIXED_CABINET_TRADE_PRICE);
            case '2' -> Optional.of(DEFAULT_PRICE_PER_UNIT_CONTRACT);
            case '3' -> Optional.of(FIXED_AMOUNT);
            default -> Optional.empty();
        };
    }
}
