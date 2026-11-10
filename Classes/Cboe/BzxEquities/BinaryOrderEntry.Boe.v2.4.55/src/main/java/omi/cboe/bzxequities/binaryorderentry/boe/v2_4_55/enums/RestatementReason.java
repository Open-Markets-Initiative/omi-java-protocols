package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.enums;

import java.util.Optional;

/**
 * The reason for this Order Restated message.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RestatementReason {

    /**
     * Cboe Market Close Cmc
     */
    CBOE_MARKET_CLOSE_CMC('C', "Cboe Market Close Cmc"),

    /**
     * Reload
     */
    RELOAD('L', "Reload"),

    /**
     * Peg Or Price Sliding Reprice
     */
    PEG_OR_PRICE_SLIDING_REPRICE('P', "Peg Or Price Sliding Reprice"),

    /**
     * Liquidity Updated
     */
    LIQUIDITY_UPDATED('Q', "Liquidity Updated"),

    /**
     * Reroute
     */
    REROUTE('R', "Reroute"),

    /**
     * Reduction Of Order Qty Due To Swp
     */
    REDUCTION_OF_ORDER_QTY_DUE_TO_SWP('S', "Reduction Of Order Qty Due To Swp"),

    /**
     * Wash Or Mtp Decrement
     */
    WASH_OR_MTP_DECREMENT('W', "Wash Or Mtp Decrement");

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
            case 'C' -> Optional.of(CBOE_MARKET_CLOSE_CMC);
            case 'L' -> Optional.of(RELOAD);
            case 'P' -> Optional.of(PEG_OR_PRICE_SLIDING_REPRICE);
            case 'Q' -> Optional.of(LIQUIDITY_UPDATED);
            case 'R' -> Optional.of(REROUTE);
            case 'S' -> Optional.of(REDUCTION_OF_ORDER_QTY_DUE_TO_SWP);
            case 'W' -> Optional.of(WASH_OR_MTP_DECREMENT);
            default -> Optional.empty();
        };
    }
}
