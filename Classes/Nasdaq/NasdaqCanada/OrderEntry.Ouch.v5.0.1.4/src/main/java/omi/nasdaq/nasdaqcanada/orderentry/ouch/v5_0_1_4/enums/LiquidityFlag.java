package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * Liquidity flag the order received. See Appendix E
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LiquidityFlag {

    /**
     * Order added liquidity
     */
    ORDER_ADDED_LIQUIDITY('A', "Order added liquidity"),

    /**
     * Order removed liquidity
     */
    ORDER_REMOVED_LIQUIDITY('R', "Order removed liquidity"),

    /**
     * Order added hidden liquidity
     */
    ORDER_ADDED_HIDDEN_LIQUIDITY('a', "Order added hidden liquidity"),

    /**
     * Order removed hidden liquidity
     */
    ORDER_REMOVED_HIDDEN_LIQUIDITY('r', "Order removed hidden liquidity"),

    /**
     * Order added hidden liquidity at-the-touch
     */
    ORDER_ADDED_HIDDEN_LIQUIDITY_AT_THE_TOUCH('d', "Order added hidden liquidity at-the-touch"),

    /**
     * Order removed hidden liquidity at-the-touch
     */
    ORDER_REMOVED_HIDDEN_LIQUIDITY_AT_THE_TOUCH('D', "Order removed hidden liquidity at-the-touch"),

    /**
     * Order added GEF liquidity
     */
    ORDER_ADDED_GEF_LIQUIDITY('g', "Order added GEF liquidity"),

    /**
     * Order removed GEF liquidity
     */
    ORDER_REMOVED_GEF_LIQUIDITY('G', "Order removed GEF liquidity"),

    /**
     * Market On Close
     */
    MARKET_ON_CLOSE('C', "Market On Close"),

    /**
     * Displayed, liquidity-adding order improves the NBBO
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO('S', "Displayed, liquidity-adding order improves the NBBO"),

    /**
     * Opening/Closing Auction
     */
    OPENING_CLOSING_AUCTION('O', "Opening/Closing Auction"),

    /**
     * Last Sale Trading Session (TSX/TSXV)
     */
    LAST_SALE_TRADING_SESSION('E', "Last Sale Trading Session (TSX/TSXV)"),

    /**
     * M-ELO
     */
    M_ELO('L', "M-ELO"),

    /**
     * CXD PureStream rate-based execution
     */
    CXD_PURE_STREAM_RATE_BASED_EXECUTION('P', "CXD PureStream rate-based execution"),

    /**
     * CXD PureStream LS mid-point block removed liquidity
     */
    CXD_PURE_STREAM_LS_MIDPOINT_BLOCK_REMOVED_LIQUIDITY('M', "CXD PureStream LS mid-point block removed liquidity"),

    /**
     * XFT
     */
    XFT('F', "XFT");

    private final char wire;

    private final String description;

    LiquidityFlag(char wire, String description) {
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
    public static Optional<LiquidityFlag> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ORDER_ADDED_LIQUIDITY);
            case 'R' -> Optional.of(ORDER_REMOVED_LIQUIDITY);
            case 'a' -> Optional.of(ORDER_ADDED_HIDDEN_LIQUIDITY);
            case 'r' -> Optional.of(ORDER_REMOVED_HIDDEN_LIQUIDITY);
            case 'd' -> Optional.of(ORDER_ADDED_HIDDEN_LIQUIDITY_AT_THE_TOUCH);
            case 'D' -> Optional.of(ORDER_REMOVED_HIDDEN_LIQUIDITY_AT_THE_TOUCH);
            case 'g' -> Optional.of(ORDER_ADDED_GEF_LIQUIDITY);
            case 'G' -> Optional.of(ORDER_REMOVED_GEF_LIQUIDITY);
            case 'C' -> Optional.of(MARKET_ON_CLOSE);
            case 'S' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO);
            case 'O' -> Optional.of(OPENING_CLOSING_AUCTION);
            case 'E' -> Optional.of(LAST_SALE_TRADING_SESSION);
            case 'L' -> Optional.of(M_ELO);
            case 'P' -> Optional.of(CXD_PURE_STREAM_RATE_BASED_EXECUTION);
            case 'M' -> Optional.of(CXD_PURE_STREAM_LS_MIDPOINT_BLOCK_REMOVED_LIQUIDITY);
            case 'F' -> Optional.of(XFT);
            default -> Optional.empty();
        };
    }
}
