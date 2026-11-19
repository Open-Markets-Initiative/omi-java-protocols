package omi.siac.cqs.snapshot.cta.v2_1.enums;

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
     * Non-Regulatory
     */
    ORDER_IMBALANCE('I', "Non-Regulatory"),

    /**
     * Regulatory
     */
    LIMIT_UP_LIMIT_DOWN_LULD_TRADING_PAUSE('M', "Regulatory"),

    /**
     * Non-Regulatory
     */
    CORPORATE_ACTION('N', "Non-Regulatory"),

    /**
     * Non-Regulatory
     */
    NEW_SECURITY_OFFERING('O', "Non-Regulatory"),

    /**
     * Regulatory
     */
    NEWS_PENDING('P', "Regulatory"),

    /**
     * Regulatory
     */
    INTRADAY_INDICATIVE_VALUE_NOT_AVAILABLE('V', "Regulatory"),

    /**
     * Non-Regulatory
     */
    OPERATIONAL('X', "Non-Regulatory"),

    /**
     * Non-Regulatory
     */
    SUB_PENNY_TRADING('Y', "Non-Regulatory"),

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
    MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_3_BREACHED('3', "Regulatory");

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
