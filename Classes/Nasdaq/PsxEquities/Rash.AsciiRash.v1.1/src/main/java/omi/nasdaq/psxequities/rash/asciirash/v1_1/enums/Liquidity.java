package omi.nasdaq.psxequities.rash.asciirash.v1_1.enums;

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
     * Open Cross
     */
    OPEN_CROSS_O('O', "Open Cross"),

    /**
     * Open Cross (imbalance-only)
     */
    OPEN_CROSS_M('M', "Open Cross (imbalance-only)"),

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
     * Displayed added liquidity with original order size of greater than or equal to 2,000 shares. Only applicable to symbols that are set to the pro rata execution algorithm.
     */
    DISPLAYED_ADDED_LIQUIDITY_WITH_ORIGINAL_ORDER_SIZE_OF_GREATER_THAN_OR_EQUAL_TO_2000_SHARES_ONLY_APPLICABLE_TO_SYMBOLS_THAT_ARE_SET_TO_THE_PRO_RATA_EXECUTION_ALGORITHM('V', "Displayed added liquidity with original order size of greater than or equal to 2,000 shares. Only applicable to symbols that are set to the pro rata execution algorithm."),

    /**
     * Added non-displayed liquidity via a Reserve order
     */
    ADDED_NON_DISPLAYED_LIQUIDITY_VIA_A_RESERVE_ORDER('u', "Added non-displayed liquidity via a Reserve order");

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
            case 'O' -> Optional.of(OPEN_CROSS_O);
            case 'M' -> Optional.of(OPEN_CROSS_M);
            case 'C' -> Optional.of(CLOSING_CROSS_C);
            case 'L' -> Optional.of(CLOSING_CROSS_L);
            case 'H' -> Optional.of(HALT_IPO_CROSS);
            case 'K' -> Optional.of(HALT_CROSS);
            case 'Y' -> Optional.of(RE_ROUTED_BY_NYSE);
            case 'S' -> Optional.of(ODD_LOT_EXECUTION);
            case 'U' -> Optional.of(ADDED_LIQUIDITY);
            case 'B' -> Optional.of(ROUTED_TO_BX);
            case 'E' -> Optional.of(NYSE_OTHER);
            case 'T' -> Optional.of(OPENING_TRADE);
            case 'Z' -> Optional.of(ON_CLOSE_ORDER);
            case 'Q' -> Optional.of(ROUTED_TO_NASDAQ);
            case 'm' -> Optional.of(REMOVED_LIQUIDITY_AT_A_MIDPOINT);
            case 'k' -> Optional.of(ADDED_LIQUIDITY_VIA_A_MIDPOINT_ORDER);
            case 'V' -> Optional.of(DISPLAYED_ADDED_LIQUIDITY_WITH_ORIGINAL_ORDER_SIZE_OF_GREATER_THAN_OR_EQUAL_TO_2000_SHARES_ONLY_APPLICABLE_TO_SYMBOLS_THAT_ARE_SET_TO_THE_PRO_RATA_EXECUTION_ALGORITHM);
            case 'u' -> Optional.of(ADDED_NON_DISPLAYED_LIQUIDITY_VIA_A_RESERVE_ORDER);
            default -> Optional.empty();
        };
    }
}
