package omi.nasdaq.ntxequities.rash.asciirash.v1_1.enums;

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
     * Added or Opening Trade (on NYSE)
     */
    ADDED_OR_OPENING_TRADE('F', "Added or Opening Trade (on NYSE)"),

    /**
     * Odd Lot or On-Close order (on NYSE)
     */
    ODD_LOT_OR_ON_CLOSE_ORDER('G', "Odd Lot or On-Close order (on NYSE)"),

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
    OPENING_TRADE('T', "Opening Trade (on ARCA)"),

    /**
     * On-Close order (on ARCA)
     */
    ON_CLOSE_ORDER('Z', "On-Close order (on ARCA)"),

    /**
     * Routed to Nasdaq
     */
    ROUTED_TO_NASDAQ('Q', "Routed to Nasdaq"),

    /**
     * Removed liquidity at a midpoint
     */
    REMOVED_LIQUIDITY_AT_A_MIDPOINT('m', "Removed liquidity at a midpoint"),

    /**
     * Added liquidity via a midpoint order
     */
    ADDED_LIQUIDITY_VIA_A_MIDPOINT_ORDER('k', "Added liquidity via a midpoint order"),

    /**
     * RPI (Retail Price Improving) order provides liquidity, Retail Price Improvement Indicator (RPII)
     */
    RPI_ORDER_PROVIDES_LIQUIDITY_RETAIL_PRICE_IMPROVEMENT_INDICATOR('j', "RPI (Retail Price Improving) order provides liquidity, Retail Price Improvement Indicator (RPII)"),

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
     * RPI order provides liquidity, executes against RMO order with notional ≥ $10,000
     */
    RPI_ORDER_PROVIDES_LIQUIDITY_EXECUTES_AGAINST_RMO_ORDER_WITH_NOTIONAL_10000('4', "RPI order provides liquidity, executes against RMO order with notional \u2265 $10,000"),

    /**
     * RMO order removes RPI liquidity, notional ≥ $10,000
     */
    RMO_ORDER_REMOVES_RPI_LIQUIDITY_NOTIONAL_10000('6', "RMO order removes RPI liquidity, notional \u2265 $10,000"),

    /**
     * Displayed, liquidity-adding order improves the NBBO
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO('7', "Displayed, liquidity-adding order improves the NBBO"),

    /**
     * Displayed, liquidity-adding order sets the NTXBBO while joining the NBBO
     */
    DISPLAYED_LIQUIDITY_ADDING_ORDER_SETS_THE_NTXBBO_WHILE_JOINING_THE_NBBO('8', "Displayed, liquidity-adding order sets the NTXBBO while joining the NBBO"),

    /**
     * Removed price improving non-displayed liquidity
     */
    REMOVED_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY('p', "Removed price improving non-displayed liquidity"),

    /**
     * Passive Midpoint Execution
     */
    PASSIVE_MIDPOINT_EXECUTION('N', "Passive Midpoint Execution"),

    /**
     * RPI order provides liquidity, No RPII
     */
    RPI_ORDER_PROVIDES_LIQUIDITY_NO_RPII('1', "RPI order provides liquidity, No RPII"),

    /**
     * Added non-displayed liquidity via a Reserve Order
     */
    ADDED_NON_DISPLAYED_LIQUIDITY_VIA_A_RESERVE_ORDER('u', "Added non-displayed liquidity via a Reserve Order");

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
            case 'F' -> Optional.of(ADDED_OR_OPENING_TRADE);
            case 'G' -> Optional.of(ODD_LOT_OR_ON_CLOSE_ORDER);
            case 'Y' -> Optional.of(RE_ROUTED_BY_NYSE);
            case 'S' -> Optional.of(ODD_LOT_EXECUTION);
            case 'U' -> Optional.of(ADDED_LIQUIDITY);
            case 'E' -> Optional.of(NYSE_OTHER);
            case 'P' -> Optional.of(ROUTED_TO_PSX);
            case 'T' -> Optional.of(OPENING_TRADE);
            case 'Z' -> Optional.of(ON_CLOSE_ORDER);
            case 'Q' -> Optional.of(ROUTED_TO_NASDAQ);
            case 'm' -> Optional.of(REMOVED_LIQUIDITY_AT_A_MIDPOINT);
            case 'k' -> Optional.of(ADDED_LIQUIDITY_VIA_A_MIDPOINT_ORDER);
            case 'j' -> Optional.of(RPI_ORDER_PROVIDES_LIQUIDITY_RETAIL_PRICE_IMPROVEMENT_INDICATOR);
            case 'r' -> Optional.of(RMO_RETAIL_ORDER_REMOVES_RPI_LIQUIDITY);
            case 't' -> Optional.of(RMO_RETAIL_ORDER_REMOVES_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY_OTHER_THAN_RPI_LIQUIDITY);
            case 'q' -> Optional.of(RMO_RETAIL_ORDER_REMOVES_NON_RPI_MIDPOINT_LIQUIDITY);
            case '4' -> Optional.of(RPI_ORDER_PROVIDES_LIQUIDITY_EXECUTES_AGAINST_RMO_ORDER_WITH_NOTIONAL_10000);
            case '6' -> Optional.of(RMO_ORDER_REMOVES_RPI_LIQUIDITY_NOTIONAL_10000);
            case '7' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_IMPROVES_THE_NBBO);
            case '8' -> Optional.of(DISPLAYED_LIQUIDITY_ADDING_ORDER_SETS_THE_NTXBBO_WHILE_JOINING_THE_NBBO);
            case 'p' -> Optional.of(REMOVED_PRICE_IMPROVING_NON_DISPLAYED_LIQUIDITY);
            case 'N' -> Optional.of(PASSIVE_MIDPOINT_EXECUTION);
            case '1' -> Optional.of(RPI_ORDER_PROVIDES_LIQUIDITY_NO_RPII);
            case 'u' -> Optional.of(ADDED_NON_DISPLAYED_LIQUIDITY_VIA_A_RESERVE_ORDER);
            default -> Optional.empty();
        };
    }
}
