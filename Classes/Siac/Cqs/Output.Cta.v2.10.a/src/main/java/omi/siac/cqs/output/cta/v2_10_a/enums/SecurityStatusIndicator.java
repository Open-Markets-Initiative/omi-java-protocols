package omi.siac.cqs.output.cta.v2_10_a.enums;

import java.util.Optional;

/**
 * Reports trading suspensions, price indications, trading range indications, LULD Price Bands and Market Wide Circuit Breaker activity
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityStatusIndicator {

    /**
     * Security Status Indicator Not Applicable
     */
    SECURITY_STATUS_INDICATOR_NOT_APPLICABLE(' ', "Security Status Indicator Not Applicable"),

    /**
     * Regulatory
     */
    ADDITIONAL_INFORMATION_REQUESTED('A', "Regulatory"),

    /**
     * Regulatory
     */
    REGULATORY_CONCERN('C', "Regulatory"),

    /**
     * Regulatory
     */
    NEWS_RELEASED('D', "Regulatory"),

    /**
     * Regulatory
     */
    MERGER_EFFECTIVE('E', "Regulatory"),

    /**
     * Regulatory
     */
    ETF_COMPONENT_PRICES_NOT_AVAILABLE('F', "Regulatory"),

    /**
     * Non Regulatory
     */
    TRADING_RANGE_INDICATION('G', "Non Regulatory"),

    /**
     * Regulatory
     */
    ORDER_IMBALANCE('I', "Regulatory"),

    /**
     * Regulatory
     */
    LIMIT_UP_LIMIT_DOWN_TRADING_PAUSE('M', "Regulatory"),

    /**
     * Regulatory
     */
    CORPORATE_ACTION('N', "Regulatory"),

    /**
     * Regulatory
     */
    NEW_SECURITY_OFFERING('O', "Regulatory"),

    /**
     * Regulatory
     */
    NEWS_PENDING('P', "Regulatory"),

    /**
     * Regulatory
     */
    INTRADAY_INDICATIVE_VALUE_NOT_AVAILABLE('V', "Regulatory"),

    /**
     * Trading no longer suspended
     */
    RESUME('T', "Trading no longer suspended"),

    /**
     * Regulatory
     */
    OPERATIONAL('X', "Regulatory"),

    /**
     * Regulatory
     */
    SUP_PENNY_TRADING('Y', "Regulatory"),

    /**
     * Currently not in use
     */
    RESERVED('Z', "Currently not in use"),

    /**
     * Non Regulatory
     */
    LIMIT_UP_LIMIT_DOWN_PRICE_BAND('0', "Non Regulatory"),

    /**
     * Regulatory
     */
    MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_1_BREACHED('1', "Regulatory"),

    /**
     * Regulatory
     */
    MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_2_BREACHED('2', "Regulatory"),

    /**
     * Regulatory
     */
    MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_3_BREACHED('3', "Regulatory"),

    /**
     * Non Regulatory
     */
    REPUBLISHED_LIMIT_UP_LIMIT_DOWN_PRICE_BAND('9', "Non Regulatory");

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
            case ' ' -> Optional.of(SECURITY_STATUS_INDICATOR_NOT_APPLICABLE);
            case 'A' -> Optional.of(ADDITIONAL_INFORMATION_REQUESTED);
            case 'C' -> Optional.of(REGULATORY_CONCERN);
            case 'D' -> Optional.of(NEWS_RELEASED);
            case 'E' -> Optional.of(MERGER_EFFECTIVE);
            case 'F' -> Optional.of(ETF_COMPONENT_PRICES_NOT_AVAILABLE);
            case 'G' -> Optional.of(TRADING_RANGE_INDICATION);
            case 'I' -> Optional.of(ORDER_IMBALANCE);
            case 'M' -> Optional.of(LIMIT_UP_LIMIT_DOWN_TRADING_PAUSE);
            case 'N' -> Optional.of(CORPORATE_ACTION);
            case 'O' -> Optional.of(NEW_SECURITY_OFFERING);
            case 'P' -> Optional.of(NEWS_PENDING);
            case 'V' -> Optional.of(INTRADAY_INDICATIVE_VALUE_NOT_AVAILABLE);
            case 'T' -> Optional.of(RESUME);
            case 'X' -> Optional.of(OPERATIONAL);
            case 'Y' -> Optional.of(SUP_PENNY_TRADING);
            case 'Z' -> Optional.of(RESERVED);
            case '0' -> Optional.of(LIMIT_UP_LIMIT_DOWN_PRICE_BAND);
            case '1' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_1_BREACHED);
            case '2' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_2_BREACHED);
            case '3' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_3_BREACHED);
            case '9' -> Optional.of(REPUBLISHED_LIMIT_UP_LIMIT_DOWN_PRICE_BAND);
            default -> Optional.empty();
        };
    }
}
