package omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_0_10.enums;

import java.util.Optional;

/**
 * Options trade condition code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCondition {

    /**
     * Single Leg Auction Non Iso
     */
    SINGLE_LEG_AUCTION_NON_ISO('a', "Single Leg Auction Non Iso"),

    /**
     * Single Leg Auction Iso
     */
    SINGLE_LEG_AUCTION_ISO('b', "Single Leg Auction Iso"),

    /**
     * Single Leg Cross Non Iso
     */
    SINGLE_LEG_CROSS_NON_ISO('c', "Single Leg Cross Non Iso"),

    /**
     * Single Leg Cross Iso
     */
    SINGLE_LEG_CROSS_ISO('d', "Single Leg Cross Iso"),

    /**
     * Single Leg Floor Trade
     */
    SINGLE_LEG_FLOOR_TRADE('e', "Single Leg Floor Trade"),

    /**
     * Complex To Complex Electronic Trade
     */
    COMPLEX_TO_COMPLEX_ELECTRONIC_TRADE('f', "Complex To Complex Electronic Trade"),

    /**
     * Complex Auction Trade
     */
    COMPLEX_AUCTION_TRADE('g', "Complex Auction Trade"),

    /**
     * Complex Cross
     */
    COMPLEX_CROSS('h', "Complex Cross"),

    /**
     * Complex Floor Trade
     */
    COMPLEX_FLOOR_TRADE('i', "Complex Floor Trade"),

    /**
     * Complex Electronic Trade Against Single Legs
     */
    COMPLEX_ELECTRONIC_TRADE_AGAINST_SINGLE_LEGS('j', "Complex Electronic Trade Against Single Legs"),

    /**
     * Complex With Stock Options Auction Trade
     */
    COMPLEX_WITH_STOCK_OPTIONS_AUCTION_TRADE('k', "Complex With Stock Options Auction Trade"),

    /**
     * Complex Floor Trade Against Single Legs
     */
    COMPLEX_FLOOR_TRADE_AGAINST_SINGLE_LEGS('m', "Complex Floor Trade Against Single Legs"),

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
     * Complex Floor Trade Of Proprietary Products Marked As Combo Order
     */
    COMPLEX_FLOOR_TRADE_OF_PROPRIETARY_PRODUCTS_MARKED_AS_COMBO_ORDER('t', "Complex Floor Trade Of Proprietary Products Marked As Combo Order"),

    /**
     * Multilateral Compression Trade Of Proprietary Products
     */
    MULTILATERAL_COMPRESSION_TRADE_OF_PROPRIETARY_PRODUCTS('u', "Multilateral Compression Trade Of Proprietary Products"),

    /**
     * Extended Hours Trade
     */
    EXTENDED_HOURS_TRADE('v', "Extended Hours Trade"),

    /**
     * Electronic Trade
     */
    ELECTRONIC_TRADE('I', "Electronic Trade"),

    /**
     * Cabinet Order
     */
    CABINET_ORDER('K', "Cabinet Order"),

    /**
     * Opening Trade
     */
    OPENING_TRADE('O', "Opening Trade"),

    /**
     * Iso
     */
    ISO('S', "Iso");

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
            case 'a' -> Optional.of(SINGLE_LEG_AUCTION_NON_ISO);
            case 'b' -> Optional.of(SINGLE_LEG_AUCTION_ISO);
            case 'c' -> Optional.of(SINGLE_LEG_CROSS_NON_ISO);
            case 'd' -> Optional.of(SINGLE_LEG_CROSS_ISO);
            case 'e' -> Optional.of(SINGLE_LEG_FLOOR_TRADE);
            case 'f' -> Optional.of(COMPLEX_TO_COMPLEX_ELECTRONIC_TRADE);
            case 'g' -> Optional.of(COMPLEX_AUCTION_TRADE);
            case 'h' -> Optional.of(COMPLEX_CROSS);
            case 'i' -> Optional.of(COMPLEX_FLOOR_TRADE);
            case 'j' -> Optional.of(COMPLEX_ELECTRONIC_TRADE_AGAINST_SINGLE_LEGS);
            case 'k' -> Optional.of(COMPLEX_WITH_STOCK_OPTIONS_AUCTION_TRADE);
            case 'm' -> Optional.of(COMPLEX_FLOOR_TRADE_AGAINST_SINGLE_LEGS);
            case 'n' -> Optional.of(COMPLEX_WITH_STOCK_ELECTRONIC_TRADE);
            case 'o' -> Optional.of(COMPLEX_WITH_STOCK_CROSS);
            case 'p' -> Optional.of(COMPLEX_WITH_STOCK_FLOOR_TRADE);
            case 't' -> Optional.of(COMPLEX_FLOOR_TRADE_OF_PROPRIETARY_PRODUCTS_MARKED_AS_COMBO_ORDER);
            case 'u' -> Optional.of(MULTILATERAL_COMPRESSION_TRADE_OF_PROPRIETARY_PRODUCTS);
            case 'v' -> Optional.of(EXTENDED_HOURS_TRADE);
            case 'I' -> Optional.of(ELECTRONIC_TRADE);
            case 'K' -> Optional.of(CABINET_ORDER);
            case 'O' -> Optional.of(OPENING_TRADE);
            case 'S' -> Optional.of(ISO);
            default -> Optional.empty();
        };
    }
}
