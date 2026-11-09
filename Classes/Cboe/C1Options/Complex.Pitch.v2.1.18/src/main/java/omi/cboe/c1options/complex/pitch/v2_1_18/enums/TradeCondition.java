package omi.cboe.c1options.complex.pitch.v2_1_18.enums;

import java.util.Optional;

/**
 * Options Only (byte not sent in Equities) (Space): Normal Trade S: Spread trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCondition {

    /**
     * Complex to Complex Electronic Trade
     */
    COMPLEX_TO_COMPLEX_ELECTRONIC_TRADE('f', "Complex to Complex Electronic Trade"),

    /**
     * Complex Auction Trade
     */
    COMPLEX_AUCTION_TRADE('g', "Complex Auction Trade"),

    /**
     * Complex Cross
     */
    COMPLEX_CROSS('h', "Complex Cross"),

    /**
     * Complex Electronic Trade Against Single
     */
    COMPLEX_ELECTRONIC_TRADE_AGAINST_SINGLE('j', "Complex Electronic Trade Against Single"),

    /**
     * Complex with Stock Options Auction Trade
     */
    COMPLEX_WITH_STOCK_OPTIONS_AUCTION_TRADE('k', "Complex with Stock Options Auction Trade"),

    /**
     * Complex with Stock Electronic Trade
     */
    COMPLEX_WITH_STOCK_ELECTRONIC_TRADE('n', "Complex with Stock Electronic Trade"),

    /**
     * Complex with Stock Cross
     */
    COMPLEX_WITH_STOCK_CROSS('o', "Complex with Stock Cross"),

    /**
     * Electronic Trade
     */
    ELECTRONIC_TRADE('I', "Electronic Trade"),

    /**
     * Opening Trade
     */
    OPENING_TRADE('O', "Opening Trade");

    private final char wire;

    private final String description;

    TradeCondition(char wire, String description) {
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
    public static Optional<TradeCondition> fromWire(char wire) {
        return switch (wire) {
            case 'f' -> Optional.of(COMPLEX_TO_COMPLEX_ELECTRONIC_TRADE);
            case 'g' -> Optional.of(COMPLEX_AUCTION_TRADE);
            case 'h' -> Optional.of(COMPLEX_CROSS);
            case 'j' -> Optional.of(COMPLEX_ELECTRONIC_TRADE_AGAINST_SINGLE);
            case 'k' -> Optional.of(COMPLEX_WITH_STOCK_OPTIONS_AUCTION_TRADE);
            case 'n' -> Optional.of(COMPLEX_WITH_STOCK_ELECTRONIC_TRADE);
            case 'o' -> Optional.of(COMPLEX_WITH_STOCK_CROSS);
            case 'I' -> Optional.of(ELECTRONIC_TRADE);
            case 'O' -> Optional.of(OPENING_TRADE);
            default -> Optional.empty();
        };
    }
}
