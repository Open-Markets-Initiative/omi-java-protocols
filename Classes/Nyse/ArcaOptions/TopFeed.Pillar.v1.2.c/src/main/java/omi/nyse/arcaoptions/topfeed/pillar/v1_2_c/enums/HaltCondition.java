package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.enums;

import java.util.Optional;

/**
 * Halt condition indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum HaltCondition {

    /**
     * Security Not Delayed Or Halted
     */
    SECURITY_NOT_DELAYED_OR_HALTED('~', "Security Not Delayed Or Halted"),

    /**
     * News Released
     */
    NEWS_RELEASED('D', "News Released"),

    /**
     * Order Imbalance
     */
    ORDER_IMBALANCE('I', "Order Imbalance"),

    /**
     * News Pending
     */
    NEWS_PENDING('P', "News Pending"),

    /**
     * Luld Pause
     */
    LULD_PAUSE('M', "Luld Pause"),

    /**
     * Equipment Changeover
     */
    EQUIPMENT_CHANGEOVER('X', "Equipment Changeover"),

    /**
     * Additional Information Requested
     */
    ADDITIONAL_INFORMATION_REQUESTED('A', "Additional Information Requested"),

    /**
     * Regulatory Concern
     */
    REGULATORY_CONCERN('C', "Regulatory Concern"),

    /**
     * Merger Effective
     */
    MERGER_EFFECTIVE('E', "Merger Effective"),

    /**
     * Etf Component Prices Not Available
     */
    ETF_COMPONENT_PRICES_NOT_AVAILABLE('F', "Etf Component Prices Not Available"),

    /**
     * Corporate Action
     */
    CORPORATE_ACTION('N', "Corporate Action"),

    /**
     * New Security Offering
     */
    NEW_SECURITY_OFFERING('O', "New Security Offering"),

    /**
     * Intraday Indicative Value Not Available
     */
    INTRADAY_INDICATIVE_VALUE_NOT_AVAILABLE('V', "Intraday Indicative Value Not Available"),

    /**
     * Market Wide Circuit Breaker Halt Level 1
     */
    MARKET_WIDE_CIRCUIT_BREAKER_HALT_LEVEL_1('1', "Market Wide Circuit Breaker Halt Level 1"),

    /**
     * Market Wide Circuit Breaker Halt Level 2
     */
    MARKET_WIDE_CIRCUIT_BREAKER_HALT_LEVEL_2('2', "Market Wide Circuit Breaker Halt Level 2"),

    /**
     * Market Wide Circuit Breaker Halt Level 3
     */
    MARKET_WIDE_CIRCUIT_BREAKER_HALT_LEVEL_3('3', "Market Wide Circuit Breaker Halt Level 3");

    private final char wire;

    private final String description;

    HaltCondition(char wire, String description) {
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
    public static Optional<HaltCondition> fromWire(char wire) {
        return switch (wire) {
            case '~' -> Optional.of(SECURITY_NOT_DELAYED_OR_HALTED);
            case 'D' -> Optional.of(NEWS_RELEASED);
            case 'I' -> Optional.of(ORDER_IMBALANCE);
            case 'P' -> Optional.of(NEWS_PENDING);
            case 'M' -> Optional.of(LULD_PAUSE);
            case 'X' -> Optional.of(EQUIPMENT_CHANGEOVER);
            case 'A' -> Optional.of(ADDITIONAL_INFORMATION_REQUESTED);
            case 'C' -> Optional.of(REGULATORY_CONCERN);
            case 'E' -> Optional.of(MERGER_EFFECTIVE);
            case 'F' -> Optional.of(ETF_COMPONENT_PRICES_NOT_AVAILABLE);
            case 'N' -> Optional.of(CORPORATE_ACTION);
            case 'O' -> Optional.of(NEW_SECURITY_OFFERING);
            case 'V' -> Optional.of(INTRADAY_INDICATIVE_VALUE_NOT_AVAILABLE);
            case '1' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_HALT_LEVEL_1);
            case '2' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_HALT_LEVEL_2);
            case '3' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_HALT_LEVEL_3);
            default -> Optional.empty();
        };
    }
}
