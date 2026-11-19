package omi.miax.onyxfutures.topofmarket.mach.v1_3_a.enums;

import java.util.Optional;

/**
 * Defines the TradingCollarVariationType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingCollarVariationType {

    /**
     * Product
     */
    PRODUCT_D('D', "Product"),

    /**
     * Product
     */
    PRODUCT_P('P', "Product"),

    /**
     * Not
     */
    NOT('N', "Not");

    private final char wire;

    private final String description;

    TradingCollarVariationType(char wire, String description) {
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
    public static Optional<TradingCollarVariationType> fromWire(char wire) {
        return switch (wire) {
            case 'D' -> Optional.of(PRODUCT_D);
            case 'P' -> Optional.of(PRODUCT_P);
            case 'N' -> Optional.of(NOT);
            default -> Optional.empty();
        };
    }
}
