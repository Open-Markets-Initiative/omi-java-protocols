package omi.miax.onyxfutures.topofmarket.mach.v1_0_b.enums;

import java.util.Optional;

/**
 * Trading Collar Variation Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingCollarVariationType {

    /**
     * Product Dollar Collar Value
     */
    PRODUCT_DOLLAR_COLLAR_VALUE('D', "Product Dollar Collar Value"),

    /**
     * Product Collar Percentage Value
     */
    PRODUCT_COLLAR_PERCENTAGE_VALUE('P', "Product Collar Percentage Value"),

    /**
     * Standard Calendar Spread
     */
    STANDARD_CALENDAR_SPREAD('S', "Standard Calendar Spread"),

    /**
     * Equity Calendar Spread
     */
    EQUITY_CALENDAR_SPREAD('E', "Equity Calendar Spread"),

    /**
     * Butterfly Spread
     */
    BUTTERFLY_SPREAD('B', "Butterfly Spread");

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
            case 'D' -> Optional.of(PRODUCT_DOLLAR_COLLAR_VALUE);
            case 'P' -> Optional.of(PRODUCT_COLLAR_PERCENTAGE_VALUE);
            case 'S' -> Optional.of(STANDARD_CALENDAR_SPREAD);
            case 'E' -> Optional.of(EQUITY_CALENDAR_SPREAD);
            case 'B' -> Optional.of(BUTTERFLY_SPREAD);
            default -> Optional.empty();
        };
    }
}
