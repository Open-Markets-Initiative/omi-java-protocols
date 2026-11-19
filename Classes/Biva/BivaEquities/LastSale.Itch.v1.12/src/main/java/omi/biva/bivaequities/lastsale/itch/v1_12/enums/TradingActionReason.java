package omi.biva.bivaequities.lastsale.itch.v1_12.enums;

import java.util.Optional;

/**
 * Trading action reason
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingActionReason {

    /**
     * Normal Trading
     */
    NORMAL_TRADING('N', "Normal Trading"),

    /**
     * Volatility Auction
     */
    VOLATILITY_AUCTION('H', "Volatility Auction"),

    /**
     * Continuous Auction Start
     */
    CONTINUOUS_AUCTION_START('A', "Continuous Auction Start"),

    /**
     * Continuous Auction End
     */
    CONTINUOUS_AUCTION_END('B', "Continuous Auction End"),

    /**
     * News Pending
     */
    NEWS_PENDING('Q', "News Pending"),

    /**
     * Static Price Band Breach
     */
    STATIC_PRICE_BAND_BREACH('S', "Static Price Band Breach"),

    /**
     * Market Surveillance Suspension
     */
    MARKET_SURVEILLANCE_SUSPENSION('M', "Market Surveillance Suspension"),

    /**
     * Suspension By Market Of Origin
     */
    SUSPENSION_BY_MARKET_OF_ORIGIN('O', "Suspension By Market Of Origin"),

    /**
     * Non Compliance
     */
    NON_COMPLIANCE('C', "Non Compliance"),

    /**
     * Start Of Indication Of Interest
     */
    START_OF_INDICATION_OF_INTEREST('I', "Start Of Indication Of Interest"),

    /**
     * Expired Security Is Unavailable For Trading
     */
    EXPIRED_SECURITY_IS_UNAVAILABLE_FOR_TRADING('E', "Expired Security Is Unavailable For Trading"),

    /**
     * Not Yet Available For Trading
     */
    NOT_YET_AVAILABLE_FOR_TRADING('L', "Not Yet Available For Trading");

    private final char wire;

    private final String description;

    TradingActionReason(char wire, String description) {
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
    public static Optional<TradingActionReason> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NORMAL_TRADING);
            case 'H' -> Optional.of(VOLATILITY_AUCTION);
            case 'A' -> Optional.of(CONTINUOUS_AUCTION_START);
            case 'B' -> Optional.of(CONTINUOUS_AUCTION_END);
            case 'Q' -> Optional.of(NEWS_PENDING);
            case 'S' -> Optional.of(STATIC_PRICE_BAND_BREACH);
            case 'M' -> Optional.of(MARKET_SURVEILLANCE_SUSPENSION);
            case 'O' -> Optional.of(SUSPENSION_BY_MARKET_OF_ORIGIN);
            case 'C' -> Optional.of(NON_COMPLIANCE);
            case 'I' -> Optional.of(START_OF_INDICATION_OF_INTEREST);
            case 'E' -> Optional.of(EXPIRED_SECURITY_IS_UNAVAILABLE_FOR_TRADING);
            case 'L' -> Optional.of(NOT_YET_AVAILABLE_FOR_TRADING);
            default -> Optional.empty();
        };
    }
}
