package omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * The reason for this Order Restated message. E=Reduction of OrdQty due to Equity Leg Reject (C1 only) F=Represented on Floor(C1 only) L=Reload P=Price Sliding Reprice Q=Liquidity Updated R=Reroute S=Ship and Post (SWP) W=Wash f=Unsolicited Floor Action(C1 only) Cboe reserves the right to add new values as necessary without prior notice.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RestatementReason {

    /**
     * Reduction of OrdQty due to Equity Leg Reject (C only)
     */
    REDUCTION_OF_ORD_QTY_DUE_TO_EQUITY_LEG_REJECT('E', "Reduction of OrdQty due to Equity Leg Reject (C only)"),

    /**
     * Represented on Floor(C1 only)
     */
    REPRESENTED_ON_FLOOR('F', "Represented on Floor(C1 only)"),

    /**
     * Reload
     */
    RELOAD('L', "Reload"),

    /**
     * Price Sliding Reprice
     */
    PRICE_SLIDING_REPRICE('P', "Price Sliding Reprice"),

    /**
     * Liquidity Updated
     */
    LIQUIDITY_UPDATED('Q', "Liquidity Updated"),

    /**
     * Reroute
     */
    REROUTE('R', "Reroute"),

    /**
     * Ship and Post (SWP)
     */
    SHIP_AND_POST('S', "Ship and Post (SWP)"),

    /**
     * Wash
     */
    WASH('W', "Wash"),

    /**
     * Unsolicited Floor Action(C1 only) Cboe reserves the right to add new values as necessary without prior notice.
     */
    UNSOLICITED_FLOOR_ACTION('f', "Unsolicited Floor Action(C1 only) Cboe reserves the right to add new values as necessary without prior notice.");

    private final char wire;

    private final String description;

    RestatementReason(char wire, String description) {
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
    public static Optional<RestatementReason> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(REDUCTION_OF_ORD_QTY_DUE_TO_EQUITY_LEG_REJECT);
            case 'F' -> Optional.of(REPRESENTED_ON_FLOOR);
            case 'L' -> Optional.of(RELOAD);
            case 'P' -> Optional.of(PRICE_SLIDING_REPRICE);
            case 'Q' -> Optional.of(LIQUIDITY_UPDATED);
            case 'R' -> Optional.of(REROUTE);
            case 'S' -> Optional.of(SHIP_AND_POST);
            case 'W' -> Optional.of(WASH);
            case 'f' -> Optional.of(UNSOLICITED_FLOOR_ACTION);
            default -> Optional.empty();
        };
    }
}
