package omi.siac.cts.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Denotes the reason for the Opening Delay or Trading Halt
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum HaltReason {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * News Dissemination
     */
    NEWS_DISSEMINATION('D', "News Dissemination"),

    /**
     * Order Imbalance
     */
    ORDER_IMBALANCE('I', "Order Imbalance"),

    /**
     * Limit Up Limit Down Trading Pause
     */
    LIMIT_UP_LIMIT_DOWN_TRADING_PAUSE('M', "Limit Up Limit Down Trading Pause"),

    /**
     * News Pending
     */
    NEWS_PENDING('P', "News Pending"),

    /**
     * Operational
     */
    OPERATIONAL('X', "Operational"),

    /**
     * Subpenny Trading
     */
    SUBPENNY_TRADING('Y', "Subpenny Trading"),

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
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'D' -> Optional.of(NEWS_DISSEMINATION);
            case 'I' -> Optional.of(ORDER_IMBALANCE);
            case 'M' -> Optional.of(LIMIT_UP_LIMIT_DOWN_TRADING_PAUSE);
            case 'P' -> Optional.of(NEWS_PENDING);
            case 'X' -> Optional.of(OPERATIONAL);
            case 'Y' -> Optional.of(SUBPENNY_TRADING);
            case '1' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_1_BREACHED);
            case '2' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_2_BREACHED);
            case '3' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_3_BREACHED);
            default -> Optional.empty();
        };
    }
}
