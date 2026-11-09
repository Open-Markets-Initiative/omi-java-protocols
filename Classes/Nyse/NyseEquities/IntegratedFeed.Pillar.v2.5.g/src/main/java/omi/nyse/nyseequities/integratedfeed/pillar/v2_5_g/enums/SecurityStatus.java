package omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * The new status that this security is transitioning to.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityStatus {

    /**
     * Trading Halt
     */
    TRADING_HALT('4', "Trading Halt"),

    /**
     * Resume
     */
    RESUME('5', "Resume"),

    /**
     * Suspend
     */
    SUSPEND('6', "Suspend"),

    /**
     * Short Sale Restriction Activated Day 1
     */
    SHORT_SALE_RESTRICTION_ACTIVATED_DAY_1('A', "Short Sale Restriction Activated Day 1"),

    /**
     * Short Sale Restriction Continued Day 2
     */
    SHORT_SALE_RESTRICTION_CONTINUED_DAY_2('C', "Short Sale Restriction Continued Day 2"),

    /**
     * Short Sale Restriction Deactivated
     */
    SHORT_SALE_RESTRICTION_DEACTIVATED('D', "Short Sale Restriction Deactivated"),

    /**
     * Pre Opening
     */
    PRE_OPENING('P', "Pre Opening"),

    /**
     * Begin Accepting Orders
     */
    BEGIN_ACCEPTING_ORDERS('B', "Begin Accepting Orders"),

    /**
     * Early Session
     */
    EARLY_SESSION('E', "Early Session"),

    /**
     * Core Session
     */
    CORE_SESSION('O', "Core Session"),

    /**
     * Late Session Non Nyse Only
     */
    LATE_SESSION_NON_NYSE_ONLY('L', "Late Session Non Nyse Only"),

    /**
     * Closed
     */
    CLOSED('X', "Closed"),

    /**
     * Halt Resume Price Indication
     */
    HALT_RESUME_PRICE_INDICATION('I', "Halt Resume Price Indication"),

    /**
     * Pre Opening Price Indication
     */
    PRE_OPENING_PRICE_INDICATION('G', "Pre Opening Price Indication");

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
            case '4' -> Optional.of(TRADING_HALT);
            case '5' -> Optional.of(RESUME);
            case '6' -> Optional.of(SUSPEND);
            case 'A' -> Optional.of(SHORT_SALE_RESTRICTION_ACTIVATED_DAY_1);
            case 'C' -> Optional.of(SHORT_SALE_RESTRICTION_CONTINUED_DAY_2);
            case 'D' -> Optional.of(SHORT_SALE_RESTRICTION_DEACTIVATED);
            case 'P' -> Optional.of(PRE_OPENING);
            case 'B' -> Optional.of(BEGIN_ACCEPTING_ORDERS);
            case 'E' -> Optional.of(EARLY_SESSION);
            case 'O' -> Optional.of(CORE_SESSION);
            case 'L' -> Optional.of(LATE_SESSION_NON_NYSE_ONLY);
            case 'X' -> Optional.of(CLOSED);
            case 'I' -> Optional.of(HALT_RESUME_PRICE_INDICATION);
            case 'G' -> Optional.of(PRE_OPENING_PRICE_INDICATION);
            default -> Optional.empty();
        };
    }
}
