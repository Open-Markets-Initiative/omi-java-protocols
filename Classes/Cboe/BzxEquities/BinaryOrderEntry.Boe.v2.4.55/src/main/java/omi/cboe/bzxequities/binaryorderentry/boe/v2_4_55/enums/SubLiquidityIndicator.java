package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.enums;

import java.util.Optional;

/**
 * Cboe may add additional values without notice. Members must gracefully ignore unknown values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SubLiquidityIndicator {

    /**
     * No Additional Information
     */
    NO_ADDITIONAL_INFORMATION(' ', "No Additional Information"),

    /**
     * Trade Added Rpi Liquidity Byx And Edgx
     */
    TRADE_ADDED_RPI_LIQUIDITY_BYX_AND_EDGX('E', "Trade Added Rpi Liquidity Byx And Edgx"),

    /**
     * Trade Added Hidden Liquidity
     */
    TRADE_ADDED_HIDDEN_LIQUIDITY('H', "Trade Added Hidden Liquidity"),

    /**
     * Trade Added Hidden Liquidity That Was Price Improved
     */
    TRADE_ADDED_HIDDEN_LIQUIDITY_THAT_WAS_PRICE_IMPROVED('I', "Trade Added Hidden Liquidity That Was Price Improved"),

    /**
     * Execution From First Order To Join The Nbbo
     */
    EXECUTION_FROM_FIRST_ORDER_TO_JOIN_THE_NBBO('J', "Execution From First Order To Join The Nbbo"),

    /**
     * Periodic Auction Byx Only
     */
    PERIODIC_AUCTION_BYX_ONLY('P', "Periodic Auction Byx Only"),

    /**
     * Nbbo Setter Fee Eligible
     */
    NBBO_SETTER_FEE_ELIGIBLE('S', "Nbbo Setter Fee Eligible"),

    /**
     * Visible Liquidity Add Trade That Was Price Improved
     */
    VISIBLE_LIQUIDITY_ADD_TRADE_THAT_WAS_PRICE_IMPROVED('V', "Visible Liquidity Add Trade That Was Price Improved"),

    /**
     * Midpoint Peg Order
     */
    MIDPOINT_PEG_ORDER('m', "Midpoint Peg Order"),

    /**
     * Order Set The Nbbo But Is Not Fee Eligible
     */
    ORDER_SET_THE_NBBO_BUT_IS_NOT_FEE_ELIGIBLE('s', "Order Set The Nbbo But Is Not Fee Eligible");

    private final char wire;

    private final String description;

    SubLiquidityIndicator(char wire, String description) {
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
    public static Optional<SubLiquidityIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NO_ADDITIONAL_INFORMATION);
            case 'E' -> Optional.of(TRADE_ADDED_RPI_LIQUIDITY_BYX_AND_EDGX);
            case 'H' -> Optional.of(TRADE_ADDED_HIDDEN_LIQUIDITY);
            case 'I' -> Optional.of(TRADE_ADDED_HIDDEN_LIQUIDITY_THAT_WAS_PRICE_IMPROVED);
            case 'J' -> Optional.of(EXECUTION_FROM_FIRST_ORDER_TO_JOIN_THE_NBBO);
            case 'P' -> Optional.of(PERIODIC_AUCTION_BYX_ONLY);
            case 'S' -> Optional.of(NBBO_SETTER_FEE_ELIGIBLE);
            case 'V' -> Optional.of(VISIBLE_LIQUIDITY_ADD_TRADE_THAT_WAS_PRICE_IMPROVED);
            case 'm' -> Optional.of(MIDPOINT_PEG_ORDER);
            case 's' -> Optional.of(ORDER_SET_THE_NBBO_BUT_IS_NOT_FEE_ELIGIBLE);
            default -> Optional.empty();
        };
    }
}
