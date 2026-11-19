package omi.finra.finraorf.tdds.dfi.v2_1.enums;

import java.util.Optional;

/**
 * The Price Change Indicator field indicates if the high, low, and/or last sale prices were impacted by the current trade transaction.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceChangeIndicator {

    /**
     * No price change
     */
    NO_PRICE_CHANGE('0', "No price change"),

    /**
     * Last price changed
     */
    LAST_PRICE_CHANGED('1', "Last price changed"),

    /**
     * Low price changed
     */
    LOW_PRICE_CHANGED('2', "Low price changed"),

    /**
     * Last and low prices changed
     */
    LAST_AND_LOW_PRICES_CHANGED('3', "Last and low prices changed"),

    /**
     * High price changed
     */
    HIGH_PRICE_CHANGED('4', "High price changed"),

    /**
     * Last and High prices changed
     */
    LAST_AND_HIGH_PRICES_CHANGED('5', "Last and High prices changed"),

    /**
     * High and Low prices changed
     */
    HIGH_AND_LOW_PRICES_CHANGED('6', "High and Low prices changed"),

    /**
     * All prices changed
     */
    ALL_PRICES_CHANGED('7', "All prices changed");

    private final char wire;

    private final String description;

    PriceChangeIndicator(char wire, String description) {
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
    public static Optional<PriceChangeIndicator> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NO_PRICE_CHANGE);
            case '1' -> Optional.of(LAST_PRICE_CHANGED);
            case '2' -> Optional.of(LOW_PRICE_CHANGED);
            case '3' -> Optional.of(LAST_AND_LOW_PRICES_CHANGED);
            case '4' -> Optional.of(HIGH_PRICE_CHANGED);
            case '5' -> Optional.of(LAST_AND_HIGH_PRICES_CHANGED);
            case '6' -> Optional.of(HIGH_AND_LOW_PRICES_CHANGED);
            case '7' -> Optional.of(ALL_PRICES_CHANGED);
            default -> Optional.empty();
        };
    }
}
