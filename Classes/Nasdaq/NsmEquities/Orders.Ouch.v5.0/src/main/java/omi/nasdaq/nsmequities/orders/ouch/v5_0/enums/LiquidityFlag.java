package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * Liquidity flag the order would have received.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LiquidityFlag {

    /**
     * Added
     */
    ADDED('A', "Added"),

    /**
     * Closing Cross
     */
    CLOSING('C', "Closing Cross"),

    /**
     * Retail designated execution that added displayed liquidity
     */
    RETAIL_DESIGNATED('e', "Retail designated execution that added displayed liquidity"),

    /**
     * Halt/IPO Cross
     */
    HALT_IPO('H', "Halt/IPO Cross"),

    /**
     * After hours closing cross
     */
    AFTER_HOURS_CLOSING('i', "After hours closing cross"),

    /**
     * Non-displayed adding liquidity
     */
    NONDISPLAYED_ADDING_LIQUIDITY('J', "Non-displayed adding liquidity"),

    /**
     * RPI (Retail Price Improving) order provides liquidity
     */
    RPI_ORDER_PROVIDES_LIQUIDITY('j', "RPI (Retail Price Improving) order provides liquidity"),

    /**
     * Added liquidity via a midpoint order
     */
    ADDED_LIQUIDITY_VIA_A_MIDPOINT_ORDER('k', "Added liquidity via a midpoint order"),

    /**
     * Halt Cross
     */
    HALT_CROSS('K', "Halt Cross"),

    /**
     * Closing Cross (imbalance-only)
     */
    CLOSING_CROSS('L', "Closing Cross (imbalance-only)"),

    /**
     * Opening Cross (imbalance-only)
     */
    OPENING_CROSS('M', "Opening Cross (imbalance-only)"),

    /**
     * Removed liquidity at a midpoint
     */
    REMOVED_LIQUIDITY_AT_A_MIDPOINT('m', "Removed liquidity at a midpoint"),

    /**
     * Passive midpoint execution
     */
    PASSIVE_MIDPOINT_EXECUTION('N', "Passive midpoint execution"),

    /**
     * Midpoint Extended Life Order execution
     */
    MIDPOINT_EXTENDED_LIFE_ORDER_EXECUTION('n', "Midpoint Extended Life Order execution"),

    /**
     * Opening Cross
     */
    OPENING('O', "Opening Cross"),

    /**
     * Removed price improving non-displayed liquidity
     */
    REMOVED_PRICE_IMPROVING_NONDISPLAYED_LIQUIDITY('p', "Removed price improving non-displayed liquidity"),

    /**
     * RMO Retail Order removes non-RPI midpoint liquidity
     */
    RMO_RETAIL_ORDER_REMOVES_NON_RPI_MIDPOINT_LIQUIDITY('q', "RMO Retail Order removes non-RPI midpoint liquidity"),

    /**
     * Removed
     */
    REMOVED('R', "Removed"),

    /**
     * Retail Order removes RPI liquidity
     */
    RETAIL_ORDER_REMOVES_RPI_LIQUIDITY('r', "Retail Order removes RPI liquidity"),

    /**
     * Retail Order removes price improving non-displayed liquidity other than RPI liquidity
     */
    RETAIL_ORDER_REMOVES_PRICE_IMPROVING_NONDISPLAYED_LIQUIDITY_OTHER_THAN_RPI_LIQUIDITY('t', "Retail Order removes price improving non-displayed liquidity other than RPI liquidity"),

    /**
     * Added non-displayed liquidity via a Reserve order
     */
    ADDED_NONDISPLAYED_LIQUIDITY_VIA_A_RESERVE_ORDER('u', "Added non-displayed liquidity via a Reserve order"),

    /**
     * Supplemental order execution
     */
    SUPPLEMENTAL('0', "Supplemental order execution"),

    /**
     * Displayed, liquidity-adding order improves the NBBO
     */
    DISPLAYED_LIQUIDITYADDING_ORDER_IMPROVES_THE_NBBO('7', "Displayed, liquidity-adding order improves the NBBO"),

    /**
     * Displayed, liquidity-adding order sets the QBBO while joining the NBBO
     */
    DISPLAYED_LIQUIDITYADDING_ORDER_SETS_THE_QBBO_WHILE_JOINING_THE_NBBO('8', "Displayed, liquidity-adding order sets the QBBO while joining the NBBO"),

    /**
     * RPI order provides liquidity, No RPII
     */
    RPI_ORDER_PROVIDES_LIQUIDITY_NO_RPII('1', "RPI order provides liquidity, No RPII"),

    /**
     * Added in the pre-market
     */
    ADDED_IN_THE_PREMARKET('2', "Added in the pre-market"),

    /**
     * Removed in the pre-market
     */
    REMOVED_IN_THE_PREMARKET('3', "Removed in the pre-market"),

    /**
     * Displayed, liquidity-adding order improves the NBBO in the pre-market
     */
    DISPLAYED_LIQUIDITYADDING_ORDER_IMPROVES_THE_NBBO_IN_THE_PREMARKET('5', "Displayed, liquidity-adding order improves the NBBO in the pre-market"),

    /**
     * Non-displayed adding liquidity in the pre-market
     */
    NONDISPLAYED_ADDING_LIQUIDITY_IN_THE_PREMARKET('9', "Non-displayed adding liquidity in the pre-market");

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
            case 'C' -> Optional.of(CLOSING);
            case 'e' -> Optional.of(RETAIL_DESIGNATED);
            case 'H' -> Optional.of(HALT_IPO);
            case 'i' -> Optional.of(AFTER_HOURS_CLOSING);
            case 'J' -> Optional.of(NONDISPLAYED_ADDING_LIQUIDITY);
            case 'j' -> Optional.of(RPI_ORDER_PROVIDES_LIQUIDITY);
            case 'k' -> Optional.of(ADDED_LIQUIDITY_VIA_A_MIDPOINT_ORDER);
            case 'K' -> Optional.of(HALT_CROSS);
            case 'L' -> Optional.of(CLOSING_CROSS);
            case 'M' -> Optional.of(OPENING_CROSS);
            case 'm' -> Optional.of(REMOVED_LIQUIDITY_AT_A_MIDPOINT);
            case 'N' -> Optional.of(PASSIVE_MIDPOINT_EXECUTION);
            case 'n' -> Optional.of(MIDPOINT_EXTENDED_LIFE_ORDER_EXECUTION);
            case 'O' -> Optional.of(OPENING);
            case 'p' -> Optional.of(REMOVED_PRICE_IMPROVING_NONDISPLAYED_LIQUIDITY);
            case 'q' -> Optional.of(RMO_RETAIL_ORDER_REMOVES_NON_RPI_MIDPOINT_LIQUIDITY);
            case 'R' -> Optional.of(REMOVED);
            case 'r' -> Optional.of(RETAIL_ORDER_REMOVES_RPI_LIQUIDITY);
            case 't' -> Optional.of(RETAIL_ORDER_REMOVES_PRICE_IMPROVING_NONDISPLAYED_LIQUIDITY_OTHER_THAN_RPI_LIQUIDITY);
            case 'u' -> Optional.of(ADDED_NONDISPLAYED_LIQUIDITY_VIA_A_RESERVE_ORDER);
            case '0' -> Optional.of(SUPPLEMENTAL);
            case '7' -> Optional.of(DISPLAYED_LIQUIDITYADDING_ORDER_IMPROVES_THE_NBBO);
            case '8' -> Optional.of(DISPLAYED_LIQUIDITYADDING_ORDER_SETS_THE_QBBO_WHILE_JOINING_THE_NBBO);
            case '1' -> Optional.of(RPI_ORDER_PROVIDES_LIQUIDITY_NO_RPII);
            case '2' -> Optional.of(ADDED_IN_THE_PREMARKET);
            case '3' -> Optional.of(REMOVED_IN_THE_PREMARKET);
            case '5' -> Optional.of(DISPLAYED_LIQUIDITYADDING_ORDER_IMPROVES_THE_NBBO_IN_THE_PREMARKET);
            case '9' -> Optional.of(NONDISPLAYED_ADDING_LIQUIDITY_IN_THE_PREMARKET);
            default -> Optional.empty();
        };
    }
}
