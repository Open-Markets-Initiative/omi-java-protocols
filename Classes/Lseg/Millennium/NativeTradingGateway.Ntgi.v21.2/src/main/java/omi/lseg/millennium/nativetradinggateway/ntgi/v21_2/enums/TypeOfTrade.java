package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Indicates whether the executed portion of a passive order during continuous trading session is visible or hidden.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TypeOfTrade {

    /**
     * Visible
     */
    VISIBLE((short) 0, "Visible"),

    /**
     * Hidden
     */
    HIDDEN((short) 1, "Hidden"),

    /**
     * Not Specified For Aggressive Side Auction Trades And Rfq Trades
     */
    NOT_SPECIFIED_FOR_AGGRESSIVE_SIDE_AUCTION_TRADES_AND_RFQ_TRADES((short) 2, "Not Specified For Aggressive Side Auction Trades And Rfq Trades");

    private final short wire;

    private final String description;

    TypeOfTrade(short wire, String description) {
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
    public static Optional<TypeOfTrade> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(VISIBLE);
            case 1 -> Optional.of(HIDDEN);
            case 2 -> Optional.of(NOT_SPECIFIED_FOR_AGGRESSIVE_SIDE_AUCTION_TRADES_AND_RFQ_TRADES);
            default -> Optional.empty();
        };
    }
}
