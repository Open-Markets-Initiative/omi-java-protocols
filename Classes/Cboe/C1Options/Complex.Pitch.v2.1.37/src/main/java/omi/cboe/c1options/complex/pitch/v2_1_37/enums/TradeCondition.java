package omi.cboe.c1options.complex.pitch.v2_1_37.enums;

import java.util.Optional;

/**
 * Options Only (byte not sent in Equities) (Space): Normal Trade S: Spread trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCondition {

    /**
     * Complex To Complex Electronic Trade
     */
    COMPLEX_TO_COMPLEX_ELECTRONIC_TRADE('f', "Complex To Complex Electronic Trade"),

    /**
     * Complex Auction Trade
     */
    COMPLEX_AUCTION_TRADE('g', "Complex Auction Trade"),

    /**
     * Complex
     */
    COMPLEX('h', "Complex"),

    /**
     * Complex Electronic Trade Against Single
     */
    COMPLEX_ELECTRONIC_TRADE_AGAINST_SINGLE('j', "Complex Electronic Trade Against Single"),

    /**
     * Complex With Stock Options Auction Trade
     */
    COMPLEX_WITH_STOCK_OPTIONS_AUCTION_TRADE('k', "Complex With Stock Options Auction Trade"),

    /**
     * Complex Floor Trade Against Single Leg
     */
    COMPLEX_FLOOR_TRADE_AGAINST_SINGLE_LEG('m', "Complex Floor Trade Against Single Leg"),

    /**
     * Complex With Stock Electronic Trade
     */
    COMPLEX_WITH_STOCK_ELECTRONIC_TRADE('n', "Complex With Stock Electronic Trade"),

    /**
     * Complex With Stock Cross
     */
    COMPLEX_WITH_STOCK_CROSS('o', "Complex With Stock Cross"),

    /**
     * Complex With Stock Floor Trade
     */
    COMPLEX_WITH_STOCK_FLOOR_TRADE('p', "Complex With Stock Floor Trade"),

    /**
     * complex floor trade of proprietary products marked as combo order
     */
    COMPLEX_COMBO_ORDER_FLOOR_TRADE('t', "complex floor trade of proprietary products marked as combo order"),

    /**
     * Transaction represents a trade executed during the Curb session
     */
    EXTENDED_HOURS_TRADE('v', "Transaction represents a trade executed during the Curb session"),

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
            case 'h' -> Optional.of(COMPLEX);
            case 'j' -> Optional.of(COMPLEX_ELECTRONIC_TRADE_AGAINST_SINGLE);
            case 'k' -> Optional.of(COMPLEX_WITH_STOCK_OPTIONS_AUCTION_TRADE);
            case 'm' -> Optional.of(COMPLEX_FLOOR_TRADE_AGAINST_SINGLE_LEG);
            case 'n' -> Optional.of(COMPLEX_WITH_STOCK_ELECTRONIC_TRADE);
            case 'o' -> Optional.of(COMPLEX_WITH_STOCK_CROSS);
            case 'p' -> Optional.of(COMPLEX_WITH_STOCK_FLOOR_TRADE);
            case 't' -> Optional.of(COMPLEX_COMBO_ORDER_FLOOR_TRADE);
            case 'v' -> Optional.of(EXTENDED_HOURS_TRADE);
            case 'I' -> Optional.of(ELECTRONIC_TRADE);
            case 'O' -> Optional.of(OPENING_TRADE);
            default -> Optional.empty();
        };
    }
}
