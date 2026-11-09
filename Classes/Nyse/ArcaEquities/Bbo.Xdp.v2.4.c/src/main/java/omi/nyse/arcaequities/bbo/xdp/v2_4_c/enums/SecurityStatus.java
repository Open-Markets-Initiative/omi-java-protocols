package omi.nyse.arcaequities.bbo.xdp.v2_4_c.enums;

import java.util.Optional;

/**
 * The new status that this security is transitioning to.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityStatus {

    /**
     * Opening Delay (NYSE tape A only)
     */
    OPENING_DELAY('3', "Opening Delay (NYSE tape A only)"),

    /**
     * Trading Halt
     */
    TRADING_HALT('4', "Trading Halt"),

    /**
     * Resume
     */
    RESUME('5', "Resume"),

    /**
     * No open/no resume (NYSE tape A only)
     */
    NO_OPENNO_RESUME('6', "No open/no resume (NYSE tape A only)"),

    /**
     * Short Sale Restriction Activated (Day 1)
     */
    SHORT_SALE_RESTRICTION_ACTIVATED_DAY_1('A', "Short Sale Restriction Activated (Day 1)"),

    /**
     * Short Sale Restriction Continued (Day 2)
     */
    SHORT_SALE_RESTRICTION_CONTINUED_DAY_2('C', "Short Sale Restriction Continued (Day 2)"),

    /**
     * Short Sale Restriction Deactivated
     */
    SHORT_SALE_RESTRICTION_DEACTIVATED('D', "Short Sale Restriction Deactivated"),

    /**
     * Pre-opening
     */
    PRE_OPENING('P', "Pre-opening"),

    /**
     * Early session
     */
    EARLY_SESSION('E', "Early session"),

    /**
     * Core session
     */
    CORE_SESSION('O', "Core session"),

    /**
     * Late session (Non-NYSE only)
     */
    LATE_SESSION_NON_NYSE_ONLY('L', "Late session (Non-NYSE only)"),

    /**
     * Closed
     */
    CLOSED('X', "Closed"),

    /**
     * Time
     */
    TIME('T', "Time"),

    /**
     * Price Indication
     */
    PRICE_INDICATION('I', "Price Indication"),

    /**
     * Pre-Opening Price Indication
     */
    PRE_OPENING_PRICE_INDICATION('G', "Pre-Opening Price Indication"),

    /**
     * Rule 15 Indication
     */
    RULE_15_INDICATION('R', "Rule 15 Indication");

    private final char wire;

    private final String description;

    SecurityStatus(char wire, String description) {
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
    public static Optional<SecurityStatus> fromWire(char wire) {
        return switch (wire) {
            case '3' -> Optional.of(OPENING_DELAY);
            case '4' -> Optional.of(TRADING_HALT);
            case '5' -> Optional.of(RESUME);
            case '6' -> Optional.of(NO_OPENNO_RESUME);
            case 'A' -> Optional.of(SHORT_SALE_RESTRICTION_ACTIVATED_DAY_1);
            case 'C' -> Optional.of(SHORT_SALE_RESTRICTION_CONTINUED_DAY_2);
            case 'D' -> Optional.of(SHORT_SALE_RESTRICTION_DEACTIVATED);
            case 'P' -> Optional.of(PRE_OPENING);
            case 'E' -> Optional.of(EARLY_SESSION);
            case 'O' -> Optional.of(CORE_SESSION);
            case 'L' -> Optional.of(LATE_SESSION_NON_NYSE_ONLY);
            case 'X' -> Optional.of(CLOSED);
            case 'T' -> Optional.of(TIME);
            case 'I' -> Optional.of(PRICE_INDICATION);
            case 'G' -> Optional.of(PRE_OPENING_PRICE_INDICATION);
            case 'R' -> Optional.of(RULE_15_INDICATION);
            default -> Optional.empty();
        };
    }
}
