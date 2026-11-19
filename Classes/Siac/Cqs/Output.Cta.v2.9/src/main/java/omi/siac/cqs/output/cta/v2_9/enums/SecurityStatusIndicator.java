package omi.siac.cqs.output.cta.v2_9.enums;

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
     * Additional Information Requested
     */
    ADDITIONAL_INFORMATION_REQUESTED('A', "Additional Information Requested"),

    /**
     * Regulatory Concern
     */
    REGULATORY_CONCERN('C', "Regulatory Concern"),

    /**
     * News Released
     */
    NEWS_RELEASED('D', "News Released"),

    /**
     * Merger Effective
     */
    MERGER_EFFECTIVE('E', "Merger Effective"),

    /**
     * Etf Component Prices Not Available
     */
    ETF_COMPONENT_PRICES_NOT_AVAILABLE('F', "Etf Component Prices Not Available"),

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
     * Corporate Action
     */
    CORPORATE_ACTION('N', "Corporate Action"),

    /**
     * New Security Offering
     */
    NEW_SECURITY_OFFERING('O', "New Security Offering"),

    /**
     * News Pending
     */
    NEWS_PENDING('P', "News Pending"),

    /**
     * Intraday Indicative Value Not Available
     */
    INTRADAY_INDICATIVE_VALUE_NOT_AVAILABLE('V', "Intraday Indicative Value Not Available"),

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
            case 'A' -> Optional.of(ADDITIONAL_INFORMATION_REQUESTED);
            case 'C' -> Optional.of(REGULATORY_CONCERN);
            case 'D' -> Optional.of(NEWS_RELEASED);
            case 'E' -> Optional.of(MERGER_EFFECTIVE);
            case 'F' -> Optional.of(ETF_COMPONENT_PRICES_NOT_AVAILABLE);
            case 'G' -> Optional.of(TRADING_RANGE_INDICATION);
            case 'I' -> Optional.of(ORDER_IMBALANCE);
            case 'M' -> Optional.of(LULD_TRADING_PAUSE);
            case 'N' -> Optional.of(CORPORATE_ACTION);
            case 'O' -> Optional.of(NEW_SECURITY_OFFERING);
            case 'P' -> Optional.of(NEWS_PENDING);
            case 'V' -> Optional.of(INTRADAY_INDICATIVE_VALUE_NOT_AVAILABLE);
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
