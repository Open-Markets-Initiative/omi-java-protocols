package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.enums;

import java.util.Optional;

/**
 * Additional information about the liquidity of an order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SubLiquidityIndicator {

    /**
     * Added Hidden Liquidity That Was Price Improved
     */
    ADDED_HIDDEN_LIQUIDITY_THAT_WAS_PRICE_IMPROVED('I', "Added Hidden Liquidity That Was Price Improved"),

    /**
     * Added Liquidity Nbbo Joiner
     */
    ADDED_LIQUIDITY_NBBO_JOINER('J', "Added Liquidity Nbbo Joiner"),

    /**
     * Added Liquidity From The Hidden Reserve Portion Of An Iceberg Order
     */
    ADDED_LIQUIDITY_FROM_THE_HIDDEN_RESERVE_PORTION_OF_AN_ICEBERG_ORDER('K', "Added Liquidity From The Hidden Reserve Portion Of An Iceberg Order"),

    /**
     * Added Liquidity Nbbo Setter
     */
    ADDED_LIQUIDITY_NBBO_SETTER('S', "Added Liquidity Nbbo Setter"),

    /**
     * Opening Auction Or Intraday Auction Trade
     */
    OPENING_AUCTION_OR_INTRADAY_AUCTION_TRADE('O', "Opening Auction Or Intraday Auction Trade"),

    /**
     * Closing Auction Trade
     */
    CLOSING_AUCTION_TRADE('e', "Closing Auction Trade"),

    /**
     * Halt Auction Re Opening
     */
    HALT_AUCTION_RE_OPENING('h', "Halt Auction Re Opening"),

    /**
     * NULL (0x00), No Additional Information
     */
    NO_ADDITIONAL_INFORMATION('0', "NULL (0x00), No Additional Information");

    private final char wire;

    private final String description;

    SubLiquidityIndicator(char wire, String description) {
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
    public static Optional<SubLiquidityIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'I' -> Optional.of(ADDED_HIDDEN_LIQUIDITY_THAT_WAS_PRICE_IMPROVED);
            case 'J' -> Optional.of(ADDED_LIQUIDITY_NBBO_JOINER);
            case 'K' -> Optional.of(ADDED_LIQUIDITY_FROM_THE_HIDDEN_RESERVE_PORTION_OF_AN_ICEBERG_ORDER);
            case 'S' -> Optional.of(ADDED_LIQUIDITY_NBBO_SETTER);
            case 'O' -> Optional.of(OPENING_AUCTION_OR_INTRADAY_AUCTION_TRADE);
            case 'e' -> Optional.of(CLOSING_AUCTION_TRADE);
            case 'h' -> Optional.of(HALT_AUCTION_RE_OPENING);
            case '0' -> Optional.of(NO_ADDITIONAL_INFORMATION);
            default -> Optional.empty();
        };
    }
}
