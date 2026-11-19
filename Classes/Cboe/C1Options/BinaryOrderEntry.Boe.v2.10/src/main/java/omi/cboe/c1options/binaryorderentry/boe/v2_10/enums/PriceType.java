package omi.cboe.c1options.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Defines the PriceType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceType {

    /**
     * Fixed Cabinet Trade Price
     */
    FIXED_CABINET_TRADE_PRICE('0', "Fixed Cabinet Trade Price"),

    /**
     * Percentage
     */
    PERCENTAGE('1', "Percentage"),

    /**
     * Price Per Unit
     */
    PRICE_PER_UNIT('2', "Price Per Unit"),

    /**
     * Fixed Amount
     */
    FIXED_AMOUNT('3', "Fixed Amount");

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
            case '1' -> Optional.of(PERCENTAGE);
            case '2' -> Optional.of(PRICE_PER_UNIT);
            case '3' -> Optional.of(FIXED_AMOUNT);
            default -> Optional.empty();
        };
    }
}
