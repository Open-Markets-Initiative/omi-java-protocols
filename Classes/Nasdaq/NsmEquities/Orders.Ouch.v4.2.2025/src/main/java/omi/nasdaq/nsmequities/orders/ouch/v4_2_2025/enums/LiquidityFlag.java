package omi.nasdaq.nsmequities.orders.ouch.v4_2_2025.enums;

import java.util.Optional;

/**
 * Liquidity flag the order would have received
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LiquidityFlag {

    /**
     * Added
     */
    ADDED('A', "Added"),

    /**
     * Removed
     */
    REMOVED('R', "Removed"),

    /**
     * Opening Cross
     */
    OPENING('O', "Opening Cross"),

    /**
     * Opening Cross (imbalance-only)
     */
    OPENING_CROSS('M', "Opening Cross (imbalance-only)"),

    /**
     * Closing Cross
     */
    CLOSING('C', "Closing Cross"),

    /**
     * Closing Cross (imbalance-only)
     */
    CLOSING_CROSS('L', "Closing Cross (imbalance-only)"),

    /**
     * Halt/IPO Cross
     */
    HALT_IPO('H', "Halt/IPO Cross"),

    /**
     * Halt Cross
     */
    HALT('K', "Halt Cross"),

    /**
     * Non-displayed adding liquidity
     */
    NON_DISPLAYED('J', "Non-displayed adding liquidity"),

    /**
     * Passive Midpoint Execution
     */
    PASSIVE_MIDPOINT_EXECUTION('N', "Passive Midpoint Execution"),

    /**
     * Added post-only
     */
    ADDED_POST_ONLY('W', "Added post-only"),

    /**
     * Removed liquidity at a midpoint
     */
    REMOVED_AT_MIDPOINT('m', "Removed liquidity at a midpoint"),

    /**
     * Added liquidity via a midpoint order
     */
    ADDED_VIA_MIDPOINT('k', "Added liquidity via a midpoint order"),

    /**
     * Supplemental Order Execution
     */
    SUPPLEMENTAL('0', "Supplemental Order Execution"),

    /**
     * Displayed, liquidity-adding order improves the NBBO
     */
    IMPROVES_NBBO('7', "Displayed, liquidity-adding order improves the NBBO"),

    /**
     * Displayed, liquidity-adding order sets the QBBO while joining the NBBO
     */
    SETS_QBBO_WHILE_JOINING_NBBO('8', "Displayed, liquidity-adding order sets the QBBO while joining the NBBO"),

    /**
     * Retail designated execution that removed liquidity
     */
    RETAIL_DESIGNATED_REMOVED_LIQUIDITY('d', "Retail designated execution that removed liquidity"),

    /**
     * Retail designated execution that added displayed liquidity
     */
    RETAIL_DESIGNATED_ADDED_DISPLAYED_LIQUIDITY('e', "Retail designated execution that added displayed liquidity"),

    /**
     * Retail designated execution that added non-displayed liquidity
     */
    RETAIL_DESIGNATED_ADDED_NON_DISPLAYED_LIQUIDITY('f', "Retail designated execution that added non-displayed liquidity"),

    /**
     * RPI (Retail Price Improving) order provides liquidity
     */
    RPI_RETAIL_PRICE_IMPROVING('j', "RPI (Retail Price Improving) order provides liquidity"),

    /**
     * Retail Order removes RPI liquidity
     */
    RETAIL_ORDER_REMOVES_RPI_LIQUIDITY('r', "Retail Order removes RPI liquidity"),

    /**
     * Retail Order removes price improving non-displayed liquidity other than RPI liquidity
     */
    RETAIL_ORDER_REMOVES_OTHER_PRICE_IMPROVING_LIQUIDITY('t', "Retail Order removes price improving non-displayed liquidity other than RPI liquidity"),

    /**
     * Added displayed liquidity in a Group A symbol
     */
    ADDED_DISPLAYED_IN_GROUP_A('4', "Added displayed liquidity in a Group A symbol"),

    /**
     * Removed liquidity in a Group A symbol
     */
    REMOVED_IN_GROUP_A('6', "Removed liquidity in a Group A symbol"),

    /**
     * Added non-displayed mid-point liquidity in a Group A symbol
     */
    ADDED_NON_DISPLAYED_MID_POINT_IN_GROUP_A('g', "Added non-displayed mid-point liquidity in a Group A symbol"),

    /**
     * Midpoint Extended Life Order execution
     */
    MIDPOINT('n', "Midpoint Extended Life Order execution"),

    /**
     * Extended Trading Close execution
     */
    EXTENDED_TRADING_CLOSE_EXECUTION('i', "Extended Trading Close execution"),

    /**
     * Added non-displayed liquidity via a Reserve order
     */
    ADDED_NON_DISPLAYED_LIQUIDITY_VIA_A_RESERVE_ORDER('u', "Added non-displayed liquidity via a Reserve order"),

    /**
     * Added in the pre-market
     */
    ADDED_IN_THE_PRE_MARKET('2', "Added in the pre-market"),

    /**
     * Removed in the pre-market
     */
    REMOVED_IN_THE_PRE_MARKET('3', "Removed in the pre-market"),

    /**
     * Displayed, liquidity-adding order improves the NBBO in the pre-market
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO_IN_THE_PRE_MARKET('5', "Displayed, liquidity-adding order improves the NBBO in the pre-market"),

    /**
     * Non-displayed adding liquidity in the pre-market
     */
    NON_DISPLAYED_ADDING_LIQUIDITY_IN_THE_PRE_MARKET('9', "Non-displayed adding liquidity in the pre-market");

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
            case 'A' -> Optional.of(ADDED);
            case 'R' -> Optional.of(REMOVED);
            case 'O' -> Optional.of(OPENING);
            case 'M' -> Optional.of(OPENING_CROSS);
            case 'C' -> Optional.of(CLOSING);
            case 'L' -> Optional.of(CLOSING_CROSS);
            case 'H' -> Optional.of(HALT_IPO);
            case 'K' -> Optional.of(HALT);
            case 'J' -> Optional.of(NON_DISPLAYED);
            case 'N' -> Optional.of(PASSIVE_MIDPOINT_EXECUTION);
            case 'W' -> Optional.of(ADDED_POST_ONLY);
            case 'm' -> Optional.of(REMOVED_AT_MIDPOINT);
            case 'k' -> Optional.of(ADDED_VIA_MIDPOINT);
            case '0' -> Optional.of(SUPPLEMENTAL);
            case '7' -> Optional.of(IMPROVES_NBBO);
            case '8' -> Optional.of(SETS_QBBO_WHILE_JOINING_NBBO);
            case 'd' -> Optional.of(RETAIL_DESIGNATED_REMOVED_LIQUIDITY);
            case 'e' -> Optional.of(RETAIL_DESIGNATED_ADDED_DISPLAYED_LIQUIDITY);
            case 'f' -> Optional.of(RETAIL_DESIGNATED_ADDED_NON_DISPLAYED_LIQUIDITY);
            case 'j' -> Optional.of(RPI_RETAIL_PRICE_IMPROVING);
            case 'r' -> Optional.of(RETAIL_ORDER_REMOVES_RPI_LIQUIDITY);
            case 't' -> Optional.of(RETAIL_ORDER_REMOVES_OTHER_PRICE_IMPROVING_LIQUIDITY);
            case '4' -> Optional.of(ADDED_DISPLAYED_IN_GROUP_A);
            case '6' -> Optional.of(REMOVED_IN_GROUP_A);
            case 'g' -> Optional.of(ADDED_NON_DISPLAYED_MID_POINT_IN_GROUP_A);
            case 'n' -> Optional.of(MIDPOINT);
            case 'i' -> Optional.of(EXTENDED_TRADING_CLOSE_EXECUTION);
            case 'u' -> Optional.of(ADDED_NON_DISPLAYED_LIQUIDITY_VIA_A_RESERVE_ORDER);
            case '2' -> Optional.of(ADDED_IN_THE_PRE_MARKET);
            case '3' -> Optional.of(REMOVED_IN_THE_PRE_MARKET);
            case '5' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO_IN_THE_PRE_MARKET);
            case '9' -> Optional.of(NON_DISPLAYED_ADDING_LIQUIDITY_IN_THE_PRE_MARKET);
            default -> Optional.empty();
        };
    }
}
