package omi.lme.lmeselect.tradereplaysnapshot.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Sub type of trade.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SubTypeOfTrade {

    /**
     * The Trade Resulted From An Explicit Order
     */
    THE_TRADE_RESULTED_FROM_AN_EXPLICIT_ORDER((short) 1, "The Trade Resulted From An Explicit Order"),

    /**
     * The Trade Resulted From Uncrossing
     */
    THE_TRADE_RESULTED_FROM_UNCROSSING((short) 2, "The Trade Resulted From Uncrossing"),

    /**
     * The Trade Resulted From An Implied Order
     */
    THE_TRADE_RESULTED_FROM_AN_IMPLIED_ORDER((short) 7, "The Trade Resulted From An Implied Order"),

    /**
     * The Trade Resulted From Two Implied Orders Matching
     */
    THE_TRADE_RESULTED_FROM_TWO_IMPLIED_ORDERS_MATCHING((short) 8, "The Trade Resulted From Two Implied Orders Matching"),

    /**
     * The Trade Resulted From An Off Book Cross Trade
     */
    THE_TRADE_RESULTED_FROM_AN_OFF_BOOK_CROSS_TRADE((short) 9, "The Trade Resulted From An Off Book Cross Trade");

    private final short wire;

    private final String description;

    SubTypeOfTrade(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<SubTypeOfTrade> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(THE_TRADE_RESULTED_FROM_AN_EXPLICIT_ORDER);
            case 2 -> Optional.of(THE_TRADE_RESULTED_FROM_UNCROSSING);
            case 7 -> Optional.of(THE_TRADE_RESULTED_FROM_AN_IMPLIED_ORDER);
            case 8 -> Optional.of(THE_TRADE_RESULTED_FROM_TWO_IMPLIED_ORDERS_MATCHING);
            case 9 -> Optional.of(THE_TRADE_RESULTED_FROM_AN_OFF_BOOK_CROSS_TRADE);
            default -> Optional.empty();
        };
    }
}
