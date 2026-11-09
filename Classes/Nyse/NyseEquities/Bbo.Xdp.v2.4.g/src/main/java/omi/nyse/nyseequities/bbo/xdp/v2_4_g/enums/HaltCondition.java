package omi.nyse.nyseequities.bbo.xdp.v2_4_g.enums;

import java.util.Optional;

/**
 * Halt condition indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum HaltCondition {

    /**
     * Security not delayed/halted
     */
    SECURITY_NOT_DELAYEDHALTED('~', "Security not delayed/halted"),

    /**
     * Not delayed/halted (NYSE Tape A only)
     */
    NOT_DELAYEDHALTED_NYSE_TAPE_A_ONLY(' ', "Not delayed/halted (NYSE Tape A only)"),

    /**
     * News dissemination
     */
    NEWS_DISSEMINATION('D', "News dissemination"),

    /**
     * Order imbalance
     */
    ORDER_IMBALANCE('I', "Order imbalance"),

    /**
     * News pending
     */
    NEWS_PENDING('P', "News pending"),

    /**
     * LULD pause
     */
    LULD_PAUSE('M', "LULD pause"),

    /**
     * Related security (not used)
     */
    RELATED_SECURITY_NOT_USED('S', "Related security (not used)"),

    /**
     * Equipment changeover
     */
    EQUIPMENT_CHANGEOVER('X', "Equipment changeover"),

    /**
     * No open/No resume
     */
    NO_OPEN_NO_RESUME('Z', "No open/No resume"),

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
            case '~' -> Optional.of(SECURITY_NOT_DELAYEDHALTED);
            case ' ' -> Optional.of(NOT_DELAYEDHALTED_NYSE_TAPE_A_ONLY);
            case 'D' -> Optional.of(NEWS_DISSEMINATION);
            case 'I' -> Optional.of(ORDER_IMBALANCE);
            case 'P' -> Optional.of(NEWS_PENDING);
            case 'M' -> Optional.of(LULD_PAUSE);
            case 'S' -> Optional.of(RELATED_SECURITY_NOT_USED);
            case 'X' -> Optional.of(EQUIPMENT_CHANGEOVER);
            case 'Z' -> Optional.of(NO_OPEN_NO_RESUME);
            case '1' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_HALT_LEVEL_1);
            case '2' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_HALT_LEVEL_2);
            case '3' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_HALT_LEVEL_3);
            default -> Optional.empty();
        };
    }
}
