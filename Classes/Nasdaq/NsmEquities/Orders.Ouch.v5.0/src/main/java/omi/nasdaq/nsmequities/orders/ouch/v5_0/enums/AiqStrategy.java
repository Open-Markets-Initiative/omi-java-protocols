package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * AIQ strategy used on the cancelled order.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AiqStrategy {

    /**
     * use port default
     */
    USE_PORT_DEFAULT('*', "use port default"),

    /**
     * Disabled
     */
    DISABLED('N', "Disabled"),

    /**
     * Firm Level Decrement Both No Details
     */
    FIRM_LEVEL_DECREMENT_BOTH_NO_DETAILS('Y', "Firm Level Decrement Both No Details"),

    /**
     * Firm Level Decrement Both
     */
    FIRM_LEVEL_DECREMENT_BOTH('D', "Firm Level Decrement Both"),

    /**
     * Firm Level Cancel Oldest
     */
    FIRM_LEVEL_CANCEL_OLDEST('O', "Firm Level Cancel Oldest"),

    /**
     * Firm Level Cancel Newest
     */
    FIRM_LEVEL_CANCEL_NEWEST('W', "Firm Level Cancel Newest"),

    /**
     * Firm Level Use Remover
     */
    FIRM_LEVEL_USE_REMOVER('R', "Firm Level Use Remover"),

    /**
     * Organization Level Decrement Both No Details
     */
    ORGANIZATION_LEVEL_DECREMENT_BOTH_NO_DETAILS('y', "Organization Level Decrement Both No Details"),

    /**
     * Organization Level Decrement Both
     */
    ORGANIZATION_LEVEL_DECREMENT_BOTH('d', "Organization Level Decrement Both"),

    /**
     * Organization Level Cancel Oldest
     */
    ORGANIZATION_LEVEL_CANCEL_OLDEST('o', "Organization Level Cancel Oldest"),

    /**
     * Organization Level Cancel Newest
     */
    ORGANIZATION_LEVEL_CANCEL_NEWEST('w', "Organization Level Cancel Newest"),

    /**
     * Organization Level Use Remover
     */
    ORGANIZATION_LEVEL_USE_REMOVER('r', "Organization Level Use Remover"),

    /**
     * Affiliate Level Decrement Both No Details
     */
    AFFILIATE_LEVEL_DECREMENT_BOTH_NO_DETAILS('Z', "Affiliate Level Decrement Both No Details"),

    /**
     * Affiliate Level Decrement Both
     */
    AFFILIATE_LEVEL_DECREMENT_BOTH('E', "Affiliate Level Decrement Both"),

    /**
     * Affiliate Level Cancel Oldest
     */
    AFFILIATE_LEVEL_CANCEL_OLDEST('P', "Affiliate Level Cancel Oldest"),

    /**
     * Affiliate Level Cancel Newest
     */
    AFFILIATE_LEVEL_CANCEL_NEWEST('X', "Affiliate Level Cancel Newest"),

    /**
     * Affiliate Level Use Remover
     */
    AFFILIATE_LEVEL_USE_REMOVER('S', "Affiliate Level Use Remover"),

    /**
     * Match Any Level Decrement Both No Details
     */
    MATCH_ANY_LEVEL_DECREMENT_BOTH_NO_DETAILS('0', "Match Any Level Decrement Both No Details"),

    /**
     * Match Any Level Decrement Both
     */
    MATCH_ANY_LEVEL_DECREMENT_BOTH('1', "Match Any Level Decrement Both"),

    /**
     * Match Any Level Cancel Oldest
     */
    MATCH_ANY_LEVEL_CANCEL_OLDEST('2', "Match Any Level Cancel Oldest"),

    /**
     * Match Any Level Cancel Newest
     */
    MATCH_ANY_LEVEL_CANCEL_NEWEST('4', "Match Any Level Cancel Newest"),

    /**
     * Match Any Level Use Remover
     */
    MATCH_ANY_LEVEL_USE_REMOVER('5', "Match Any Level Use Remover");

    private final char wire;

    private final String description;

    AiqStrategy(char wire, String description) {
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
    public static Optional<AiqStrategy> fromWire(char wire) {
        return switch (wire) {
            case '*' -> Optional.of(USE_PORT_DEFAULT);
            case 'N' -> Optional.of(DISABLED);
            case 'Y' -> Optional.of(FIRM_LEVEL_DECREMENT_BOTH_NO_DETAILS);
            case 'D' -> Optional.of(FIRM_LEVEL_DECREMENT_BOTH);
            case 'O' -> Optional.of(FIRM_LEVEL_CANCEL_OLDEST);
            case 'W' -> Optional.of(FIRM_LEVEL_CANCEL_NEWEST);
            case 'R' -> Optional.of(FIRM_LEVEL_USE_REMOVER);
            case 'y' -> Optional.of(ORGANIZATION_LEVEL_DECREMENT_BOTH_NO_DETAILS);
            case 'd' -> Optional.of(ORGANIZATION_LEVEL_DECREMENT_BOTH);
            case 'o' -> Optional.of(ORGANIZATION_LEVEL_CANCEL_OLDEST);
            case 'w' -> Optional.of(ORGANIZATION_LEVEL_CANCEL_NEWEST);
            case 'r' -> Optional.of(ORGANIZATION_LEVEL_USE_REMOVER);
            case 'Z' -> Optional.of(AFFILIATE_LEVEL_DECREMENT_BOTH_NO_DETAILS);
            case 'E' -> Optional.of(AFFILIATE_LEVEL_DECREMENT_BOTH);
            case 'P' -> Optional.of(AFFILIATE_LEVEL_CANCEL_OLDEST);
            case 'X' -> Optional.of(AFFILIATE_LEVEL_CANCEL_NEWEST);
            case 'S' -> Optional.of(AFFILIATE_LEVEL_USE_REMOVER);
            case '0' -> Optional.of(MATCH_ANY_LEVEL_DECREMENT_BOTH_NO_DETAILS);
            case '1' -> Optional.of(MATCH_ANY_LEVEL_DECREMENT_BOTH);
            case '2' -> Optional.of(MATCH_ANY_LEVEL_CANCEL_OLDEST);
            case '4' -> Optional.of(MATCH_ANY_LEVEL_CANCEL_NEWEST);
            case '5' -> Optional.of(MATCH_ANY_LEVEL_USE_REMOVER);
            default -> Optional.empty();
        };
    }
}
