package omi._24x._24xequities.memoirlastsale.sbe.v2_0.enums;

import java.util.Optional;

/**
 * OriginalSaleCondition2
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OriginalSaleCondition2 {

    /**
     * NotApplicable
     */
    NOT_APPLICABLE(' ', "NotApplicable"),

    /**
     * IntermarketSweep
     */
    INTERMARKET_SWEEP('F', "IntermarketSweep"),

    /**
     * MarketCenterOpeningTrade
     */
    MARKET_CENTER_OPENING_TRADE('O', "MarketCenterOpeningTrade"),

    /**
     * MarketCenterReopeningTrade
     */
    MARKET_CENTER_REOPENING_TRADE('5', "MarketCenterReopeningTrade"),

    /**
     * MarketCenterClosingTrade
     */
    MARKET_CENTER_CLOSING_TRADE('6', "MarketCenterClosingTrade");

    private final char wire;

    private final String description;

    OriginalSaleCondition2(char wire, String description) {
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
    public static Optional<OriginalSaleCondition2> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'F' -> Optional.of(INTERMARKET_SWEEP);
            case 'O' -> Optional.of(MARKET_CENTER_OPENING_TRADE);
            case '5' -> Optional.of(MARKET_CENTER_REOPENING_TRADE);
            case '6' -> Optional.of(MARKET_CENTER_CLOSING_TRADE);
            default -> Optional.empty();
        };
    }
}
