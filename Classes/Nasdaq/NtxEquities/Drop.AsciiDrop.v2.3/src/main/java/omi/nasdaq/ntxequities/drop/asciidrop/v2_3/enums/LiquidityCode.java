package omi.nasdaq.ntxequities.drop.asciidrop.v2_3.enums;

import java.util.Optional;

/**
 * For execution messages, the liquidity code value.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LiquidityCode {

    /**
     * A = Added Liquidity
     */
    ADDED_LIQUIDITY('A', "A = Added Liquidity"),

    /**
     * R = Reduced Liquidity
     */
    REDUCED_LIQUIDITY('R', "R = Reduced Liquidity"),

    /**
     * J = Non-displayed and Added Liquidity
     */
    NON_DISPLAYED_AND_ADDED_LIQUIDITY('J', "J = Non-displayed and Added Liquidity"),

    /**
     * X = Routed
     */
    ROUTED('X', "X = Routed"),

    /**
     * D = DOT Routed
     */
    DOT_ROUTED('D', "D = DOT Routed"),

    /**
     * F = Opening Trade (on NYSE)
     */
    OPENING_TRADE_ON_NYSE('F', "F = Opening Trade (on NYSE)"),

    /**
     * G = On-Close order (on NYSE)
     */
    ON_CLOSE_ORDER_ON_NYSE('G', "G = On-Close order (on NYSE)"),

    /**
     * Y = Re-Routed by NYSE
     */
    RE_ROUTED_BY_NYSE('Y', "Y = Re-Routed by NYSE"),

    /**
     * S = Odd Lot Executions (on NYSE)
     */
    ODD_LOT_EXECUTIONS_ON_NYSE('S', "S = Odd Lot Executions (on NYSE)"),

    /**
     * U = Added Liquidity (on NYSE)
     */
    ADDED_LIQUIDITY_ON_NYSE('U', "U = Added Liquidity (on NYSE)"),

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
     * Q = Routed to Nasdaq
     */
    ROUTED_TO_NASDAQ('Q', "Q = Routed to Nasdaq"),

    /**
     * m = Removed liquidity at a midpoint
     */
    REMOVED_LIQUIDITY_AT_A_MIDPOINT('m', "m = Removed liquidity at a midpoint"),

    /**
     * k = Added liquidity via a midpoint order
     */
    ADDED_LIQUIDITY_VIA_A_MIDPOINT_ORDER('k', "k = Added liquidity via a midpoint order"),

    /**
     * j = RPI (Retail Price Improving) order provides liquidity
     */
    RPI_RETAIL_PRICE_IMPROVING_ORDER_PROVIDES_LIQUIDITY('j', "j = RPI (Retail Price Improving) order provides liquidity"),

    /**
     * r = RMO Retail Order removes RPI liquidity
     */
    RMO_RETAIL_ORDER_REMOVES_RPI_LIQUIDITY('r', "r = RMO Retail Order removes RPI liquidity"),

    /**
     * t = RMO Retail Order removes price improving non-displayed liquidity other than RPI liquidity
     */
    RMO_RETAIL_ORDER_REMOVES_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY_OTHER_THAN_RPI_LIQUIDITY('t', "t = RMO Retail Order removes price improving non-displayed liquidity other than RPI liquidity"),

    /**
     * q = RMO Retail Order removes non-RPI mid-point liquidity
     */
    RMO_RETAIL_ORDER_REMOVES_NON_RPI_MIDPOINT_LIQUIDITY('q', "q = RMO Retail Order removes non-RPI mid-point liquidity"),

    /**
     * 7 = Displayed, liquidity-adding order improves the NBBO
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO('7', "7 = Displayed, liquidity-adding order improves the NBBO"),

    /**
     * 8 = Displayed, liquidity-adding order sets the NTXBBO while joining the NBBO
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_SETS_THE_NTXBBO_WHILE_JOINING_THE_NBBO('8', "8 = Displayed, liquidity-adding order sets the NTXBBO while joining the NBBO"),

    /**
     * p = Removed price improving non-displayed liquidity
     */
    REMOVED_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY('p', "p = Removed price improving non-displayed liquidity"),

    /**
     * N = Passive Midpoint Execution
     */
    PASSIVE_MIDPOINT_EXECUTION('N', "N = Passive Midpoint Execution");

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
            case 'A' -> Optional.of(ADDED_LIQUIDITY);
            case 'R' -> Optional.of(REDUCED_LIQUIDITY);
            case 'J' -> Optional.of(NON_DISPLAYED_AND_ADDED_LIQUIDITY);
            case 'X' -> Optional.of(ROUTED);
            case 'D' -> Optional.of(DOT_ROUTED);
            case 'F' -> Optional.of(OPENING_TRADE_ON_NYSE);
            case 'G' -> Optional.of(ON_CLOSE_ORDER_ON_NYSE);
            case 'Y' -> Optional.of(RE_ROUTED_BY_NYSE);
            case 'S' -> Optional.of(ODD_LOT_EXECUTIONS_ON_NYSE);
            case 'U' -> Optional.of(ADDED_LIQUIDITY_ON_NYSE);
            case 'E' -> Optional.of(NYSE_OTHER);
            case 'P' -> Optional.of(ROUTED_TO_PSX);
            case 'T' -> Optional.of(OPENING_TRADE_ON_ARCA);
            case 'Z' -> Optional.of(ON_CLOSE_ORDER_ON_ARCA);
            case 'Q' -> Optional.of(ROUTED_TO_NASDAQ);
            case 'm' -> Optional.of(REMOVED_LIQUIDITY_AT_A_MIDPOINT);
            case 'k' -> Optional.of(ADDED_LIQUIDITY_VIA_A_MIDPOINT_ORDER);
            case 'j' -> Optional.of(RPI_RETAIL_PRICE_IMPROVING_ORDER_PROVIDES_LIQUIDITY);
            case 'r' -> Optional.of(RMO_RETAIL_ORDER_REMOVES_RPI_LIQUIDITY);
            case 't' -> Optional.of(RMO_RETAIL_ORDER_REMOVES_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY_OTHER_THAN_RPI_LIQUIDITY);
            case 'q' -> Optional.of(RMO_RETAIL_ORDER_REMOVES_NON_RPI_MIDPOINT_LIQUIDITY);
            case '7' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO);
            case '8' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_SETS_THE_NTXBBO_WHILE_JOINING_THE_NBBO);
            case 'p' -> Optional.of(REMOVED_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY);
            case 'N' -> Optional.of(PASSIVE_MIDPOINT_EXECUTION);
            default -> Optional.empty();
        };
    }
}
