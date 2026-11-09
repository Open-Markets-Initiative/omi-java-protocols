package omi.siac.cqs.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * The Security Status Indicator field is used to report trading suspensions in a security, price indications, trading range indications, LULD Price Bands and Market Wide Circuit Breaker activity
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityStatusIndicator {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * News Dissemination
     */
    NEWS_DISSEMINATION('D', "News Dissemination"),

    /**
     * Trading Range Indication
     */
    TRADING_RANGE_INDICATION('G', "Trading Range Indication"),

    /**
     * Order Imbalance
     */
    ORDER_IMBALANCE('I', "Order Imbalance"),

    /**
     * Luld Trading Pause
     */
    LULD_TRADING_PAUSE('M', "Luld Trading Pause"),

    /**
     * News Pending
     */
    NEWS_PENDING('P', "News Pending"),

    /**
     * Resume
     */
    RESUME('T', "Resume"),

    /**
     * Operational
     */
    OPERATIONAL('X', "Operational"),

    /**
     * Sup Penny Trading
     */
    SUP_PENNY_TRADING('Y', "Sup Penny Trading"),

    /**
     * No Open No Resume
     */
    NO_OPEN_NO_RESUME('Z', "No Open No Resume"),

    /**
     * Luld Price Band
     */
    LULD_PRICE_BAND('0', "Luld Price Band"),

    /**
     * Market Wide Circuit Breaker Level 1 Breached
     */
    MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_1_BREACHED('1', "Market Wide Circuit Breaker Level 1 Breached"),

    /**
     * Market Wide Circuit Breaker Level 2 Breached
     */
    MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_2_BREACHED('2', "Market Wide Circuit Breaker Level 2 Breached"),

    /**
     * Market Wide Circuit Breaker Level 3 Breached
     */
    MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_3_BREACHED('3', "Market Wide Circuit Breaker Level 3 Breached"),

    /**
     * Republished Luld Price Band
     */
    REPUBLISHED_LULD_PRICE_BAND('9', "Republished Luld Price Band");

    private final char wire;

    private final String description;

    SecurityStatusIndicator(char wire, String description) {
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
    public static Optional<SecurityStatusIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'D' -> Optional.of(NEWS_DISSEMINATION);
            case 'G' -> Optional.of(TRADING_RANGE_INDICATION);
            case 'I' -> Optional.of(ORDER_IMBALANCE);
            case 'M' -> Optional.of(LULD_TRADING_PAUSE);
            case 'P' -> Optional.of(NEWS_PENDING);
            case 'T' -> Optional.of(RESUME);
            case 'X' -> Optional.of(OPERATIONAL);
            case 'Y' -> Optional.of(SUP_PENNY_TRADING);
            case 'Z' -> Optional.of(NO_OPEN_NO_RESUME);
            case '0' -> Optional.of(LULD_PRICE_BAND);
            case '1' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_1_BREACHED);
            case '2' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_2_BREACHED);
            case '3' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_3_BREACHED);
            case '9' -> Optional.of(REPUBLISHED_LULD_PRICE_BAND);
            default -> Optional.empty();
        };
    }
}
