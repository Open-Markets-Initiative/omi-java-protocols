package omi.nasdaq.utdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Consolidated Price Change Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ConsolidatedPriceChangeIndicator {

    /**
     * No prices changed
     */
    NO_PRICES_CHANGED('0', "No prices changed"),

    /**
     * Consolidated Last price changed
     */
    CONSOLIDATED_LAST_PRICE_CHANGED('1', "Consolidated Last price changed"),

    /**
     * Consolidated Low price changed
     */
    CONSOLIDATED_LOW_PRICE_CHANGED('2', "Consolidated Low price changed"),

    /**
     * Consolidated Last and Consolidated Low prices changed
     */
    CONSOLIDATED_LAST_AND_CONSOLIDATED_LOW_PRICES_CHANGED('3', "Consolidated Last and Consolidated Low prices changed"),

    /**
     * Consolidated High price changed
     */
    CONSOLIDATED_HIGH_PRICE_CHANGED('4', "Consolidated High price changed"),

    /**
     * Consolidated Last and Consolidated High prices changed
     */
    CONSOLIDATED_LAST_AND_CONSOLIDATED_HIGH_PRICES_CHANGED('5', "Consolidated Last and Consolidated High prices changed"),

    /**
     * Consolidated High and Consolidated Low prices changed
     */
    CONSOLIDATED_HIGH_AND_CONSOLIDATED_LOW_PRICES_CHANGED('6', "Consolidated High and Consolidated Low prices changed"),

    /**
     * All Consolidated prices changed
     */
    ALL_CONSOLIDATED_PRICES_CHANGED('7', "All Consolidated prices changed");

    private final char wire;

    private final String description;

    ConsolidatedPriceChangeIndicator(char wire, String description) {
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
    public static Optional<ConsolidatedPriceChangeIndicator> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NO_PRICES_CHANGED);
            case '1' -> Optional.of(CONSOLIDATED_LAST_PRICE_CHANGED);
            case '2' -> Optional.of(CONSOLIDATED_LOW_PRICE_CHANGED);
            case '3' -> Optional.of(CONSOLIDATED_LAST_AND_CONSOLIDATED_LOW_PRICES_CHANGED);
            case '4' -> Optional.of(CONSOLIDATED_HIGH_PRICE_CHANGED);
            case '5' -> Optional.of(CONSOLIDATED_LAST_AND_CONSOLIDATED_HIGH_PRICES_CHANGED);
            case '6' -> Optional.of(CONSOLIDATED_HIGH_AND_CONSOLIDATED_LOW_PRICES_CHANGED);
            case '7' -> Optional.of(ALL_CONSOLIDATED_PRICES_CHANGED);
            default -> Optional.empty();
        };
    }
}
