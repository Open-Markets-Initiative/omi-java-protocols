package omi.nasdaq.ntxequities.orders.ouch.v4_2.enums;

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
    ADDED_A('A', "Added"),

    /**
     * Removed
     */
    REMOVED_R('R', "Removed"),

    /**
     * Non-displayed adding liquidity
     */
    NON_DISPLAYED('J', "Non-displayed adding liquidity"),

    /**
     * Removed liquidity at a midpoint
     */
    REMOVED_M('m', "Removed liquidity at a midpoint"),

    /**
     * Added liquidity via a midpoint order
     */
    ADDED_K('k', "Added liquidity via a midpoint order"),

    /**
     * RPI (Retail Price Improving) order provides liquidity
     */
    RPI('j', "RPI (Retail Price Improving) order provides liquidity"),

    /**
     * RMO Retail Order removes RPI liquidity
     */
    RMO_RETAIL_ORDER_REMOVES_RPI_LIQUIDITY('r', "RMO Retail Order removes RPI liquidity"),

    /**
     * RMO Retail Order removes price improving non-displayed liquidity other than RPI liquidity
     */
    RMO_RETAIL_ORDER_REMOVES_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY_OTHER_THAN_RPI_LIQUIDITY('t', "RMO Retail Order removes price improving non-displayed liquidity other than RPI liquidity"),

    /**
     * RMO Retail Order removes non-RPI midpoint liquidity
     */
    RMO_RETAIL_ORDER_REMOVES_NON_RPI_MIDPOINT_LIQUIDITY('q', "RMO Retail Order removes non-RPI midpoint liquidity"),

    /**
     * Displayed, liquidity-adding order improves the NBBO
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO('7', "Displayed, liquidity-adding order improves the NBBO"),

    /**
     * Displayed, liquidity-adding order sets the BXBBO while joining the NBBO
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_SETS_THE_BXBBO_WHILE_JOINING_THE_NBBO('8', "Displayed, liquidity-adding order sets the BXBBO while joining the NBBO"),

    /**
     * Removed price improving non-displayed liquidity
     */
    REMOVED_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY('p', "Removed price improving non-displayed liquidity"),

    /**
     * Passive Midpoint Execution
     */
    PASSIVE_MIDPOINT_EXECUTION('N', "Passive Midpoint Execution");

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
            case 'A' -> Optional.of(ADDED_A);
            case 'R' -> Optional.of(REMOVED_R);
            case 'J' -> Optional.of(NON_DISPLAYED);
            case 'm' -> Optional.of(REMOVED_M);
            case 'k' -> Optional.of(ADDED_K);
            case 'j' -> Optional.of(RPI);
            case 'r' -> Optional.of(RMO_RETAIL_ORDER_REMOVES_RPI_LIQUIDITY);
            case 't' -> Optional.of(RMO_RETAIL_ORDER_REMOVES_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY_OTHER_THAN_RPI_LIQUIDITY);
            case 'q' -> Optional.of(RMO_RETAIL_ORDER_REMOVES_NON_RPI_MIDPOINT_LIQUIDITY);
            case '7' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO);
            case '8' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_SETS_THE_BXBBO_WHILE_JOINING_THE_NBBO);
            case 'p' -> Optional.of(REMOVED_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY);
            case 'N' -> Optional.of(PASSIVE_MIDPOINT_EXECUTION);
            default -> Optional.empty();
        };
    }
}
