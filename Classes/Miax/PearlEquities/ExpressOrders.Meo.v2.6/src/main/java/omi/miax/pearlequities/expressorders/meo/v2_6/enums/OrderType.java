package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Order Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderType {

    /**
     * Limit
     */
    LIMIT('1', "Limit"),

    /**
     * Market
     */
    MARKET('2', "Market"),

    /**
     * Midpoint Peg
     */
    MIDPOINT_PEG('M', "Midpoint Peg"),

    /**
     * Midpoint Peg But Do Not Match When Nbbo Is Locked
     */
    MIDPOINT_PEG_BUT_DO_NOT_MATCH_WHEN_NBBO_IS_LOCKED('m', "Midpoint Peg But Do Not Match When Nbbo Is Locked"),

    /**
     * Primary Peg
     */
    PRIMARY_PEG('R', "Primary Peg"),

    /**
     * Primary Peg But Do Not Match When Nbbo Is Locked
     */
    PRIMARY_PEG_BUT_DO_NOT_MATCH_WHEN_NBBO_IS_LOCKED('r', "Primary Peg But Do Not Match When Nbbo Is Locked");

    private final char wire;

    private final String description;

    OrderType(char wire, String description) {
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
    public static Optional<OrderType> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(LIMIT);
            case '2' -> Optional.of(MARKET);
            case 'M' -> Optional.of(MIDPOINT_PEG);
            case 'm' -> Optional.of(MIDPOINT_PEG_BUT_DO_NOT_MATCH_WHEN_NBBO_IS_LOCKED);
            case 'R' -> Optional.of(PRIMARY_PEG);
            case 'r' -> Optional.of(PRIMARY_PEG_BUT_DO_NOT_MATCH_WHEN_NBBO_IS_LOCKED);
            default -> Optional.empty();
        };
    }
}
