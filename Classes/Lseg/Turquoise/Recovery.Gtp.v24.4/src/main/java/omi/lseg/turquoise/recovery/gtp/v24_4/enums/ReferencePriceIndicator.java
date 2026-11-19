package omi.lseg.turquoise.recovery.gtp.v24_4.enums;

import java.util.Optional;

/**
 * Reference Price Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ReferencePriceIndicator {

    /**
     * Reference Price Trade
     */
    REFERENCE_PRICE_TRADE('S', "Reference Price Trade"),

    /**
     * Market Closing Price Trade
     */
    MARKET_CLOSING_PRICE_TRADE('1', "Market Closing Price Trade"),

    /**
     * Not A Reference Price Trade
     */
    NOT_A_REFERENCE_PRICE_TRADE('-', "Not A Reference Price Trade");

    private final char wire;

    private final String description;

    ReferencePriceIndicator(char wire, String description) {
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
    public static Optional<ReferencePriceIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(REFERENCE_PRICE_TRADE);
            case '1' -> Optional.of(MARKET_CLOSING_PRICE_TRADE);
            case '-' -> Optional.of(NOT_A_REFERENCE_PRICE_TRADE);
            default -> Optional.empty();
        };
    }
}
