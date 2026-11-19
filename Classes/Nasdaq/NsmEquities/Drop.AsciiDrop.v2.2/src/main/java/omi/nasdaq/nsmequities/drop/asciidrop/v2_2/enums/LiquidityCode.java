package omi.nasdaq.nsmequities.drop.asciidrop.v2_2.enums;

import java.util.Optional;

/**
 * For execution messages, the liquidity code value.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LiquidityCode {

    /**
     * A = Added
     */
    ADDED('A', "A = Added"),

    /**
     * R = Removed
     */
    REMOVED('R', "R = Removed"),

    /**
     * X = Routed
     */
    ROUTED('X', "X = Routed"),

    /**
     * D = DOT
     */
    DOT('D', "D = DOT"),

    /**
     * F = Opening Trade (on NYSE)
     */
    OPENING_TRADE_ON_NYSE('F', "F = Opening Trade (on NYSE)"),

    /**
     * G = On-Close order (on NYSE)
     */
    ON_CLOSE_ORDER_ON_NYSE('G', "G = On-Close order (on NYSE)"),

    /**
     * O = Opening Cross
     */
    OPENING_CROSS('O', "O = Opening Cross"),

    /**
     * M = Opening Cross (imbalance-only)
     */
    OPENING_CROSS_IMBALANCE_ONLY('M', "M = Opening Cross (imbalance-only)"),

    /**
     * C = Closing Cross
     */
    CLOSING_CROSS('C', "C = Closing Cross"),

    /**
     * L = Closing Cross (imbalance-only)
     */
    CLOSING_CROSS_IMBALANCE_ONLY('L', "L = Closing Cross (imbalance-only)"),

    /**
     * H = Halt/IPO Cross
     */
    HALT_IPO_CROSS('H', "H = Halt/IPO Cross"),

    /**
     * K = Halt Cross
     */
    HALT_CROSS('K', "K = Halt Cross"),

    /**
     * J = Non-displayed adding liquidity
     */
    NON_DISPLAYED_ADDING_LIQUIDITY('J', "J = Non-displayed adding liquidity"),

    /**
     * Y = Re-Routed by NYSE
     */
    RE_ROUTED_BY_NYSE('Y', "Y = Re-Routed by NYSE"),

    /**
     * S = Odd Lot Execution (on NYSE)
     */
    ODD_LOT_EXECUTION_ON_NYSE('S', "S = Odd Lot Execution (on NYSE)"),

    /**
     * U = Added Liquidity (On NYSE)
     */
    ADDED_LIQUIDITY_ON_NYSE('U', "U = Added Liquidity (On NYSE)"),

    /**
     * B = Routed to BX
     */
    ROUTED_TO_BX('B', "B = Routed to BX"),

    /**
     * E = NYSE Other
     */
    NYSE_OTHER('E', "E = NYSE Other"),

    /**
     * P = Routed to PSX
     */
    ROUTED_TO_PSX('P', "P = Routed to PSX"),

    /**
     * T = Opening Trade (on ARCA)
     */
    OPENING_TRADE_ON_ARCA('T', "T = Opening Trade (on ARCA)"),

    /**
     * Z = On-Close order (on ARCA)
     */
    ON_CLOSE_ORDER_ON_ARCA('Z', "Z = On-Close order (on ARCA)"),

    /**
     * W = Added post-only (not currently available)
     */
    ADDED_POST_ONLY_NOT_CURRENTLY_AVAILABLE('W', "W = Added post-only (not currently available)"),

    /**
     * m = Removed liquidity at a midpoint
     */
    REMOVED_LIQUIDITY_AT_A_MIDPOINT('m', "m = Removed liquidity at a midpoint"),

    /**
     * k = Added liquidity via a midpoint order
     */
    ADDED_LIQUIDITY_VIA_A_MIDPOINT_ORDER('k', "k = Added liquidity via a midpoint order"),

    /**
     * 0 = Supplemental order execution
     */
    SUPPLEMENTAL_ORDER_EXECUTION('0', "0 = Supplemental order execution"),

    /**
     * 7 = Displayed, liquidity-adding order improves the NBBO
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO('7', "7 = Displayed, liquidity-adding order improves the NBBO"),

    /**
     * 8 = Displayed, liquidity-adding order sets the QBBO while joining the NBBO
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_SETS_THE_QBBO_WHILE_JOINING_THE_NBBO('8', "8 = Displayed, liquidity-adding order sets the QBBO while joining the NBBO"),

    /**
     * d = Retail designated execution that removed liquidity (not currently available)
     */
    RETAIL_DESIGNATED_EXECUTION_THAT_REMOVED_LIQUIDITY_NOT_CURRENTLY_AVAILABLE('d', "d = Retail designated execution that removed liquidity (not currently available)"),

    /**
     * e = Retail designated execution that added displayed liquidity
     */
    RETAIL_DESIGNATED_EXECUTION_THAT_ADDED_DISPLAYED_LIQUIDITY('e', "e = Retail designated execution that added displayed liquidity"),

    /**
     * f = Retail designated execution that added non-displayed liquidity (not currently available)
     */
    RETAIL_DESIGNATED_EXECUTION_THAT_ADDED_NON_DISPLAYED_LIQUIDITY_NOT_CURRENTLY_AVAILABLE('f', "f = Retail designated execution that added non-displayed liquidity (not currently available)"),

    /**
     * j = RPI order that provides liquidity
     */
    RPI_ORDER_THAT_PROVIDES_LIQUIDITY('j', "j = RPI order that provides liquidity"),

    /**
     * r = Retail order that removes RPI liquidity
     */
    RETAIL_ORDER_THAT_REMOVES_RPI_LIQUIDITY('r', "r = Retail order that removes RPI liquidity"),

    /**
     * t = Retail order that removes price improving non-displayed liquidity other than RPI liquidity
     */
    RETAIL_ORDER_THAT_REMOVES_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY_OTHER_THAN_RPI_LIQUIDITY('t', "t = Retail order that removes price improving non-displayed liquidity other than RPI liquidity"),

    /**
     * 4 = Added displayed liquidity in a Group A symbol
     */
    ADDED_DISPLAYED_LIQUIDITY_IN_A_GROUP_A_SYMBOL('4', "4 = Added displayed liquidity in a Group A symbol"),

    /**
     * 5 = Added non-displayed liquidity in a Group A symbol
     */
    ADDED_NON_DISPLAYED_LIQUIDITY_IN_A_GROUP_A_SYMBOL('5', "5 = Added non-displayed liquidity in a Group A symbol"),

    /**
     * 6 = Liquidity Removing Order in a Group A symbol
     */
    LIQUIDITY_REMOVING_ORDER_IN_A_GROUP_A_SYMBOL('6', "6 = Liquidity Removing Order in a Group A symbol"),

    /**
     * g = Added non-displayed midpoint liquidity in a Group A symbol
     */
    ADDED_NON_DISPLAYED_MIDPOINT_LIQUIDITY_IN_A_GROUP_A_SYMBOL('g', "g = Added non-displayed midpoint liquidity in a Group A symbol"),

    /**
     * a = Added displayed liquidity in a SCIP Symbol
     */
    ADDED_DISPLAYED_LIQUIDITY_IN_A_SCIP_SYMBOL('a', "a = Added displayed liquidity in a SCIP Symbol"),

    /**
     * x = Displayed, liquidity-adding order improves the NBBO in a SCIP Symbol
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO_IN_A_SCIP_SYMBOL('x', "x = Displayed, liquidity-adding order improves the NBBO in a SCIP Symbol"),

    /**
     * y = Displayed, liquidity-adding order set the QBBO while joining the NBBO in a SCIP Symbol
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_SET_THE_QBBO_WHILE_JOINING_THE_NBBO_IN_A_SCIP_SYMBOL('y', "y = Displayed, liquidity-adding order set the QBBO while joining the NBBO in a SCIP Symbol"),

    /**
     * b = Displayed, liquidity-adding order improves the NBBO in pilot symbol during specified LULD Pricing Pilot timeframe
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO_IN_PILOT_SYMBOL_DURING_SPECIFIED_LULD_PRICING_PILOT_TIMEFRAME('b', "b = Displayed, liquidity-adding order improves the NBBO in pilot symbol during specified LULD Pricing Pilot timeframe"),

    /**
     * c = Added displayed liquidity in a pilot symbol during specified LULD Pricing Pilot timeframe
     */
    ADDED_DISPLAYED_LIQUIDITY_IN_A_PILOT_SYMBOL_DURING_SPECIFIED_LULD_PRICING_PILOT_TIMEFRAME('c', "c = Added displayed liquidity in a pilot symbol during specified LULD Pricing Pilot timeframe"),

    /**
     * h = Removed liquidity in a pilot symbol during specified LULD Pricing Pilot timeframe
     */
    REMOVED_LIQUIDITY_IN_A_PILOT_SYMBOL_DURING_SPECIFIED_LULD_PRICING_PILOT_TIMEFRAME('h', "h = Removed liquidity in a pilot symbol during specified LULD Pricing Pilot timeframe"),

    /**
     * N = Halt Cross, orders entered in pilot symbols during the LULD Trading Pause
     */
    HALT_CROSS_ORDERS_ENTERED_IN_PILOT_SYMBOLS_DURING_THE_LULD_TRADING_PAUSE('N', "N = Halt Cross, orders entered in pilot symbols during the LULD Trading Pause");

    private final char wire;

    private final String description;

    LiquidityCode(char wire, String description) {
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
    public static Optional<LiquidityCode> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADDED);
            case 'R' -> Optional.of(REMOVED);
            case 'X' -> Optional.of(ROUTED);
            case 'D' -> Optional.of(DOT);
            case 'F' -> Optional.of(OPENING_TRADE_ON_NYSE);
            case 'G' -> Optional.of(ON_CLOSE_ORDER_ON_NYSE);
            case 'O' -> Optional.of(OPENING_CROSS);
            case 'M' -> Optional.of(OPENING_CROSS_IMBALANCE_ONLY);
            case 'C' -> Optional.of(CLOSING_CROSS);
            case 'L' -> Optional.of(CLOSING_CROSS_IMBALANCE_ONLY);
            case 'H' -> Optional.of(HALT_IPO_CROSS);
            case 'K' -> Optional.of(HALT_CROSS);
            case 'J' -> Optional.of(NON_DISPLAYED_ADDING_LIQUIDITY);
            case 'Y' -> Optional.of(RE_ROUTED_BY_NYSE);
            case 'S' -> Optional.of(ODD_LOT_EXECUTION_ON_NYSE);
            case 'U' -> Optional.of(ADDED_LIQUIDITY_ON_NYSE);
            case 'B' -> Optional.of(ROUTED_TO_BX);
            case 'E' -> Optional.of(NYSE_OTHER);
            case 'P' -> Optional.of(ROUTED_TO_PSX);
            case 'T' -> Optional.of(OPENING_TRADE_ON_ARCA);
            case 'Z' -> Optional.of(ON_CLOSE_ORDER_ON_ARCA);
            case 'W' -> Optional.of(ADDED_POST_ONLY_NOT_CURRENTLY_AVAILABLE);
            case 'm' -> Optional.of(REMOVED_LIQUIDITY_AT_A_MIDPOINT);
            case 'k' -> Optional.of(ADDED_LIQUIDITY_VIA_A_MIDPOINT_ORDER);
            case '0' -> Optional.of(SUPPLEMENTAL_ORDER_EXECUTION);
            case '7' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO);
            case '8' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_SETS_THE_QBBO_WHILE_JOINING_THE_NBBO);
            case 'd' -> Optional.of(RETAIL_DESIGNATED_EXECUTION_THAT_REMOVED_LIQUIDITY_NOT_CURRENTLY_AVAILABLE);
            case 'e' -> Optional.of(RETAIL_DESIGNATED_EXECUTION_THAT_ADDED_DISPLAYED_LIQUIDITY);
            case 'f' -> Optional.of(RETAIL_DESIGNATED_EXECUTION_THAT_ADDED_NON_DISPLAYED_LIQUIDITY_NOT_CURRENTLY_AVAILABLE);
            case 'j' -> Optional.of(RPI_ORDER_THAT_PROVIDES_LIQUIDITY);
            case 'r' -> Optional.of(RETAIL_ORDER_THAT_REMOVES_RPI_LIQUIDITY);
            case 't' -> Optional.of(RETAIL_ORDER_THAT_REMOVES_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY_OTHER_THAN_RPI_LIQUIDITY);
            case '4' -> Optional.of(ADDED_DISPLAYED_LIQUIDITY_IN_A_GROUP_A_SYMBOL);
            case '5' -> Optional.of(ADDED_NON_DISPLAYED_LIQUIDITY_IN_A_GROUP_A_SYMBOL);
            case '6' -> Optional.of(LIQUIDITY_REMOVING_ORDER_IN_A_GROUP_A_SYMBOL);
            case 'g' -> Optional.of(ADDED_NON_DISPLAYED_MIDPOINT_LIQUIDITY_IN_A_GROUP_A_SYMBOL);
            case 'a' -> Optional.of(ADDED_DISPLAYED_LIQUIDITY_IN_A_SCIP_SYMBOL);
            case 'x' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO_IN_A_SCIP_SYMBOL);
            case 'y' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_SET_THE_QBBO_WHILE_JOINING_THE_NBBO_IN_A_SCIP_SYMBOL);
            case 'b' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO_IN_PILOT_SYMBOL_DURING_SPECIFIED_LULD_PRICING_PILOT_TIMEFRAME);
            case 'c' -> Optional.of(ADDED_DISPLAYED_LIQUIDITY_IN_A_PILOT_SYMBOL_DURING_SPECIFIED_LULD_PRICING_PILOT_TIMEFRAME);
            case 'h' -> Optional.of(REMOVED_LIQUIDITY_IN_A_PILOT_SYMBOL_DURING_SPECIFIED_LULD_PRICING_PILOT_TIMEFRAME);
            case 'N' -> Optional.of(HALT_CROSS_ORDERS_ENTERED_IN_PILOT_SYMBOLS_DURING_THE_LULD_TRADING_PAUSE);
            default -> Optional.empty();
        };
    }
}
