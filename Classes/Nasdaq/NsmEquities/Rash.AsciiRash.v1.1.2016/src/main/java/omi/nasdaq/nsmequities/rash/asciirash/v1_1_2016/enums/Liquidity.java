package omi.nasdaq.nsmequities.rash.asciirash.v1_1_2016.enums;

import java.util.Optional;

/**
 * See Liquidity Flags.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Liquidity {

    /**
     * Added
     */
    ADDED('A', "Added"),

    /**
     * Removed
     */
    REMOVED('R', "Removed"),

    /**
     * Non-displayed adding liquidity
     */
    NON_DISPLAYED_ADDING_LIQUIDITY('J', "Non-displayed adding liquidity"),

    /**
     * Routed
     */
    ROUTED('X', "Routed"),

    /**
     * DOT
     */
    DOT('D', "DOT"),

    /**
     * Opening Trade (on NYSE)
     */
    OPENING_TRADE_F('F', "Opening Trade (on NYSE)"),

    /**
     * On-Close order (on NYSE)
     */
    ON_CLOSE_ORDER_G('G', "On-Close order (on NYSE)"),

    /**
     * Opening Cross
     */
    OPENING_CROSS_O('O', "Opening Cross"),

    /**
     * Opening Cross (imbalance-only)
     */
    OPENING_CROSS_M('M', "Opening Cross (imbalance-only)"),

    /**
     * Closing Cross
     */
    CLOSING_CROSS_C('C', "Closing Cross"),

    /**
     * Closing Cross (imbalance-only)
     */
    CLOSING_CROSS_L('L', "Closing Cross (imbalance-only)"),

    /**
     * Halt/IPO Cross
     */
    HALT_IPO_CROSS('H', "Halt/IPO Cross"),

    /**
     * Halt Cross
     */
    HALT_CROSS('K', "Halt Cross"),

    /**
     * Re-Routed by NYSE
     */
    RE_ROUTED_BY_NYSE('Y', "Re-Routed by NYSE"),

    /**
     * Odd Lot Execution (on NYSE)
     */
    ODD_LOT_EXECUTION('S', "Odd Lot Execution (on NYSE)"),

    /**
     * Added Liquidity (on NYSE)
     */
    ADDED_LIQUIDITY('U', "Added Liquidity (on NYSE)"),

    /**
     * Routed to BX
     */
    ROUTED_TO_BX('B', "Routed to BX"),

    /**
     * NYSE Other
     */
    NYSE_OTHER('E', "NYSE Other"),

    /**
     * Routed to PSX
     */
    ROUTED_TO_PSX('P', "Routed to PSX"),

    /**
     * Opening Trade (on ARCA)
     */
    OPENING_TRADE_T('T', "Opening Trade (on ARCA)"),

    /**
     * On-Close order (on ARCA)
     */
    ON_CLOSE_ORDER_Z('Z', "On-Close order (on ARCA)"),

    /**
     * Added post-only (greyed out, not available)
     */
    ADDED_POST_ONLY('W', "Added post-only (greyed out, not available)"),

    /**
     * Removed liquidity at a midpoint
     */
    REMOVED_LIQUIDITY_AT_A_MIDPOINT('m', "Removed liquidity at a midpoint"),

    /**
     * Added liquidity via a midpoint order
     */
    ADDED_LIQUIDITY_VIA_A_MIDPOINT_ORDER('k', "Added liquidity via a midpoint order"),

    /**
     * Supplemental order execution
     */
    SUPPLEMENTAL_ORDER_EXECUTION('0', "Supplemental order execution"),

    /**
     * Displayed, liquidity-adding order improves the NBBO
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO('7', "Displayed, liquidity-adding order improves the NBBO"),

    /**
     * Displayed, liquidity-adding order sets the QBBO while joining the NBBO
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_SETS_THE_QBBO_WHILE_JOINING_THE_NBBO('8', "Displayed, liquidity-adding order sets the QBBO while joining the NBBO"),

    /**
     * Retail designated execution that removed liquidity (greyed out, not available)
     */
    RETAIL_DESIGNATED_EXECUTION_THAT_REMOVED_LIQUIDITY('d', "Retail designated execution that removed liquidity (greyed out, not available)"),

    /**
     * Retail designated execution that added displayed liquidity
     */
    RETAIL_DESIGNATED_EXECUTION_THAT_ADDED_DISPLAYED_LIQUIDITY('e', "Retail designated execution that added displayed liquidity"),

    /**
     * Retail designated execution that added non-displayed liquidity (greyed out, not available)
     */
    RETAIL_DESIGNATED_EXECUTION_THAT_ADDED_NON_DISPLAYED_LIQUIDITY('f', "Retail designated execution that added non-displayed liquidity (greyed out, not available)"),

    /**
     * RPI (Retail Price Improving) order provides liquidity
     */
    RPI_ORDER_PROVIDES_LIQUIDITY('j', "RPI (Retail Price Improving) order provides liquidity"),

    /**
     * Retail Order removes RPI liquidity
     */
    RETAIL_ORDER_REMOVES_RPI_LIQUIDITY('r', "Retail Order removes RPI liquidity"),

    /**
     * Retail Order removes price improving non-displayed liquidity other than RPI liquidity
     */
    RETAIL_ORDER_REMOVES_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY_OTHER_THAN_RPI_LIQUIDITY('t', "Retail Order removes price improving non-displayed liquidity other than RPI liquidity"),

    /**
     * Added displayed liquidity in a Select Symbol
     */
    ADDED_DISPLAYED_LIQUIDITY_IN_A_SELECT_SYMBOL('4', "Added displayed liquidity in a Select Symbol"),

    /**
     * Added non-displayed liquidity in a Select Symbol
     */
    ADDED_NON_DISPLAYED_LIQUIDITY_IN_A_SELECT_SYMBOL('5', "Added non-displayed liquidity in a Select Symbol"),

    /**
     * Removed liquidity in a Select Symbol
     */
    REMOVED_LIQUIDITY_IN_A_SELECT_SYMBOL('6', "Removed liquidity in a Select Symbol"),

    /**
     * Added non-displayed mid-point liquidity in a Select Symbol
     */
    ADDED_NON_DISPLAYED_MID_POINT_LIQUIDITY_IN_A_SELECT_SYMBOL('g', "Added non-displayed mid-point liquidity in a Select Symbol");

    private final char wire;

    private final String description;

    Liquidity(char wire, String description) {
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
    public static Optional<Liquidity> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADDED);
            case 'R' -> Optional.of(REMOVED);
            case 'J' -> Optional.of(NON_DISPLAYED_ADDING_LIQUIDITY);
            case 'X' -> Optional.of(ROUTED);
            case 'D' -> Optional.of(DOT);
            case 'F' -> Optional.of(OPENING_TRADE_F);
            case 'G' -> Optional.of(ON_CLOSE_ORDER_G);
            case 'O' -> Optional.of(OPENING_CROSS_O);
            case 'M' -> Optional.of(OPENING_CROSS_M);
            case 'C' -> Optional.of(CLOSING_CROSS_C);
            case 'L' -> Optional.of(CLOSING_CROSS_L);
            case 'H' -> Optional.of(HALT_IPO_CROSS);
            case 'K' -> Optional.of(HALT_CROSS);
            case 'Y' -> Optional.of(RE_ROUTED_BY_NYSE);
            case 'S' -> Optional.of(ODD_LOT_EXECUTION);
            case 'U' -> Optional.of(ADDED_LIQUIDITY);
            case 'B' -> Optional.of(ROUTED_TO_BX);
            case 'E' -> Optional.of(NYSE_OTHER);
            case 'P' -> Optional.of(ROUTED_TO_PSX);
            case 'T' -> Optional.of(OPENING_TRADE_T);
            case 'Z' -> Optional.of(ON_CLOSE_ORDER_Z);
            case 'W' -> Optional.of(ADDED_POST_ONLY);
            case 'm' -> Optional.of(REMOVED_LIQUIDITY_AT_A_MIDPOINT);
            case 'k' -> Optional.of(ADDED_LIQUIDITY_VIA_A_MIDPOINT_ORDER);
            case '0' -> Optional.of(SUPPLEMENTAL_ORDER_EXECUTION);
            case '7' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO);
            case '8' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_SETS_THE_QBBO_WHILE_JOINING_THE_NBBO);
            case 'd' -> Optional.of(RETAIL_DESIGNATED_EXECUTION_THAT_REMOVED_LIQUIDITY);
            case 'e' -> Optional.of(RETAIL_DESIGNATED_EXECUTION_THAT_ADDED_DISPLAYED_LIQUIDITY);
            case 'f' -> Optional.of(RETAIL_DESIGNATED_EXECUTION_THAT_ADDED_NON_DISPLAYED_LIQUIDITY);
            case 'j' -> Optional.of(RPI_ORDER_PROVIDES_LIQUIDITY);
            case 'r' -> Optional.of(RETAIL_ORDER_REMOVES_RPI_LIQUIDITY);
            case 't' -> Optional.of(RETAIL_ORDER_REMOVES_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY_OTHER_THAN_RPI_LIQUIDITY);
            case '4' -> Optional.of(ADDED_DISPLAYED_LIQUIDITY_IN_A_SELECT_SYMBOL);
            case '5' -> Optional.of(ADDED_NON_DISPLAYED_LIQUIDITY_IN_A_SELECT_SYMBOL);
            case '6' -> Optional.of(REMOVED_LIQUIDITY_IN_A_SELECT_SYMBOL);
            case 'g' -> Optional.of(ADDED_NON_DISPLAYED_MID_POINT_LIQUIDITY_IN_A_SELECT_SYMBOL);
            default -> Optional.empty();
        };
    }
}
