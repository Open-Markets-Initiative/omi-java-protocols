package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Denotes the reason for the Trading Halt
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum HaltReason {

    /**
     * Halt Reason Not Applicable
     */
    HALT_REASON_NOT_APPLICABLE(' ', "Halt Reason Not Applicable"),

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
     * Order Imbalance
     */
    ORDER_IMBALANCE('I', "Order Imbalance"),

    /**
     * Limit Up Limit Down Luld Trading Pause
     */
    LIMIT_UP_LIMIT_DOWN_LULD_TRADING_PAUSE('M', "Limit Up Limit Down Luld Trading Pause"),

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
     * Operational
     */
    OPERATIONAL('X', "Operational"),

    /**
     * Sub Penny Trading
     */
    SUB_PENNY_TRADING('Y', "Sub Penny Trading"),

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
    MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_3_BREACHED('3', "Market Wide Circuit Breaker Level 3 Breached");

    private final char wire;

    private final String description;

    HaltReason(char wire, String description) {
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
    public static Optional<HaltReason> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(HALT_REASON_NOT_APPLICABLE);
            case 'A' -> Optional.of(ADDITIONAL_INFORMATION_REQUESTED);
            case 'C' -> Optional.of(REGULATORY_CONCERN);
            case 'D' -> Optional.of(NEWS_RELEASED);
            case 'E' -> Optional.of(MERGER_EFFECTIVE);
            case 'F' -> Optional.of(ETF_COMPONENT_PRICES_NOT_AVAILABLE);
            case 'I' -> Optional.of(ORDER_IMBALANCE);
            case 'M' -> Optional.of(LIMIT_UP_LIMIT_DOWN_LULD_TRADING_PAUSE);
            case 'N' -> Optional.of(CORPORATE_ACTION);
            case 'O' -> Optional.of(NEW_SECURITY_OFFERING);
            case 'P' -> Optional.of(NEWS_PENDING);
            case 'V' -> Optional.of(INTRADAY_INDICATIVE_VALUE_NOT_AVAILABLE);
            case 'X' -> Optional.of(OPERATIONAL);
            case 'Y' -> Optional.of(SUB_PENNY_TRADING);
            case '1' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_1_BREACHED);
            case '2' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_2_BREACHED);
            case '3' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_3_BREACHED);
            default -> Optional.empty();
        };
    }
}
