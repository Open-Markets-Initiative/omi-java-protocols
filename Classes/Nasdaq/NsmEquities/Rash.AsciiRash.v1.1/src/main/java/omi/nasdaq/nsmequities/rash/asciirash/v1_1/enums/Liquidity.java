package omi.nasdaq.nsmequities.rash.asciirash.v1_1.enums;

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
     * Non-displayed and added liquidity
     */
    NON_DISPLAYED_AND_ADDED_LIQUIDITY('J', "Non-displayed and added liquidity"),

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
    OPENING_TRADE('F', "Opening Trade (on NYSE)"),

    /**
     * On-Close order (on NYSE)
     */
    ON_CLOSE_ORDER('G', "On-Close order (on NYSE)"),

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
     * Executed in Open, Close, or Re-open on ARCA
     */
    EXECUTED_IN_OPEN_CLOSE_OR_RE_OPEN_ON_ARCA('T', "Executed in Open, Close, or Re-open on ARCA"),

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
     * Retail designated execution that removed liquidity
     */
    RETAIL_DESIGNATED_EXECUTION_THAT_REMOVED_LIQUIDITY('d', "Retail designated execution that removed liquidity"),

    /**
     * Retail designated execution that added displayed liquidity
     */
    RETAIL_DESIGNATED_EXECUTION_THAT_ADDED_DISPLAYED_LIQUIDITY('e', "Retail designated execution that added displayed liquidity"),

    /**
     * Retail designated execution that added non-displayed liquidity
     */
    RETAIL_DESIGNATED_EXECUTION_THAT_ADDED_NON_DISPLAYED_LIQUIDITY('f', "Retail designated execution that added non-displayed liquidity"),

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
     * Added displayed liquidity in a Group A symbol
     */
    ADDED_DISPLAYED_LIQUIDITY_IN_A_GROUP_A_SYMBOL('4', "Added displayed liquidity in a Group A symbol"),

    /**
     * Added non-displayed liquidity in a Group A symbol; Displayed, liquidity-adding order improves the NBBO in the pre-market
     */
    ADDED_NON_DISPLAYED_GROUP_A_OR_PRE_MARKET_IMPROVES_NBBO('5', "Added non-displayed liquidity in a Group A symbol; Displayed, liquidity-adding order improves the NBBO in the pre-market"),

    /**
     * Removed liquidity in a Group A symbol
     */
    REMOVED_LIQUIDITY_IN_A_GROUP_A_SYMBOL('6', "Removed liquidity in a Group A symbol"),

    /**
     * Added non-displayed mid-point liquidity in a Group A symbol
     */
    ADDED_NON_DISPLAYED_MID_POINT_LIQUIDITY_IN_A_GROUP_A_SYMBOL('g', "Added non-displayed mid-point liquidity in a Group A symbol"),

    /**
     * Midpoint Extended Life Order execution
     */
    MIDPOINT_EXTENDED_LIFE_ORDER_EXECUTION('n', "Midpoint Extended Life Order execution"),

    /**
     * MIDP Order executed on away NMS protected market center
     */
    MIDP_ORDER_EXECUTED_ON_AWAY_NMS_PROTECTED_MARKET_CENTER('v', "MIDP Order executed on away NMS protected market center"),

    /**
     * MIDP Order executed on off-exchange venue
     */
    MIDP_ORDER_EXECUTED_ON_OFF_EXCHANGE_VENUE('w', "MIDP Order executed on off-exchange venue"),

    /**
     * Extended Trading Close execution
     */
    EXTENDED_TRADING_CLOSE_EXECUTION('i', "Extended Trading Close execution"),

    /**
     * Contra Midpoint Only
     */
    CONTRA_MIDPOINT_ONLY('o', "Contra Midpoint Only"),

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
     * Non-displayed adding liquidity in the pre-market
     */
    NON_DISPLAYED_ADDING_LIQUIDITY_IN_THE_PRE_MARKET('9', "Non-displayed adding liquidity in the pre-market");

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
            case 'J' -> Optional.of(NON_DISPLAYED_AND_ADDED_LIQUIDITY);
            case 'X' -> Optional.of(ROUTED);
            case 'D' -> Optional.of(DOT);
            case 'F' -> Optional.of(OPENING_TRADE);
            case 'G' -> Optional.of(ON_CLOSE_ORDER);
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
            case 'T' -> Optional.of(EXECUTED_IN_OPEN_CLOSE_OR_RE_OPEN_ON_ARCA);
            case 'N' -> Optional.of(PASSIVE_MIDPOINT_EXECUTION);
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
            case '4' -> Optional.of(ADDED_DISPLAYED_LIQUIDITY_IN_A_GROUP_A_SYMBOL);
            case '5' -> Optional.of(ADDED_NON_DISPLAYED_GROUP_A_OR_PRE_MARKET_IMPROVES_NBBO);
            case '6' -> Optional.of(REMOVED_LIQUIDITY_IN_A_GROUP_A_SYMBOL);
            case 'g' -> Optional.of(ADDED_NON_DISPLAYED_MID_POINT_LIQUIDITY_IN_A_GROUP_A_SYMBOL);
            case 'n' -> Optional.of(MIDPOINT_EXTENDED_LIFE_ORDER_EXECUTION);
            case 'v' -> Optional.of(MIDP_ORDER_EXECUTED_ON_AWAY_NMS_PROTECTED_MARKET_CENTER);
            case 'w' -> Optional.of(MIDP_ORDER_EXECUTED_ON_OFF_EXCHANGE_VENUE);
            case 'i' -> Optional.of(EXTENDED_TRADING_CLOSE_EXECUTION);
            case 'o' -> Optional.of(CONTRA_MIDPOINT_ONLY);
            case 'u' -> Optional.of(ADDED_NON_DISPLAYED_LIQUIDITY_VIA_A_RESERVE_ORDER);
            case '2' -> Optional.of(ADDED_IN_THE_PRE_MARKET);
            case '3' -> Optional.of(REMOVED_IN_THE_PRE_MARKET);
            case '9' -> Optional.of(NON_DISPLAYED_ADDING_LIQUIDITY_IN_THE_PRE_MARKET);
            default -> Optional.empty();
        };
    }
}
