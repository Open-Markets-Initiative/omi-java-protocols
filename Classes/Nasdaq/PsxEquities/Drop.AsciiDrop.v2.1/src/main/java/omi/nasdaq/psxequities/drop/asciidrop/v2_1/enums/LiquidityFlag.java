package omi.nasdaq.psxequities.drop.asciidrop.v2_1.enums;

import java.util.Optional;

/**
 * For execution messages, the liquidity flag value.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LiquidityFlag {

    /**
     * A = Added
     */
    ADDED('A', "A = Added"),

    /**
     * R = Removed
     */
    REMOVED('R', "R = Removed"),

    /**
     * V = Displayed added liquidity with original order size of greater than or equal to 2,000 shares
     */
    DISPLAYED_ADDED_LIQUIDITY_WITH_ORIGINAL_ORDER_SIZE_OF_GREATER_THAN_OR_EQUAL_TO_2000_SHARES('V', "V = Displayed added liquidity with original order size of greater than or equal to 2,000 shares"),

    /**
     * X = Routed
     */
    ROUTED('X', "X = Routed"),

    /**
     * D = DOT
     */
    DOT('D', "D = DOT"),

    /**
     * F = Added or Opening Trade (on NYSE)
     */
    ADDED_OR_OPENING_TRADE_ON_NYSE('F', "F = Added or Opening Trade (on NYSE)"),

    /**
     * G = Odd Lot or On-Close order (on NYSE)
     */
    ODD_LOT_OR_ON_CLOSE_ORDER_ON_NYSE('G', "G = Odd Lot or On-Close order (on NYSE)"),

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
     * J = Non-displayed and added liquidity
     */
    NON_DISPLAYED_AND_ADDED_LIQUIDITY('J', "J = Non-displayed and added liquidity"),

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
     * m = Removed liquidity at a midpoint
     */
    REMOVED_LIQUIDITY_AT_A_MIDPOINT('m', "m = Removed liquidity at a midpoint"),

    /**
     * k = Added liquidity via a midpoint order
     */
    ADDED_LIQUIDITY_VIA_A_MIDPOINT_ORDER('k', "k = Added liquidity via a midpoint order");

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
            case 'V' -> Optional.of(DISPLAYED_ADDED_LIQUIDITY_WITH_ORIGINAL_ORDER_SIZE_OF_GREATER_THAN_OR_EQUAL_TO_2000_SHARES);
            case 'X' -> Optional.of(ROUTED);
            case 'D' -> Optional.of(DOT);
            case 'F' -> Optional.of(ADDED_OR_OPENING_TRADE_ON_NYSE);
            case 'G' -> Optional.of(ODD_LOT_OR_ON_CLOSE_ORDER_ON_NYSE);
            case 'O' -> Optional.of(OPENING_CROSS);
            case 'M' -> Optional.of(OPENING_CROSS_IMBALANCE_ONLY);
            case 'C' -> Optional.of(CLOSING_CROSS);
            case 'L' -> Optional.of(CLOSING_CROSS_IMBALANCE_ONLY);
            case 'H' -> Optional.of(HALT_IPO_CROSS);
            case 'K' -> Optional.of(HALT_CROSS);
            case 'J' -> Optional.of(NON_DISPLAYED_AND_ADDED_LIQUIDITY);
            case 'Y' -> Optional.of(RE_ROUTED_BY_NYSE);
            case 'S' -> Optional.of(ODD_LOT_EXECUTION_ON_NYSE);
            case 'U' -> Optional.of(ADDED_LIQUIDITY_ON_NYSE);
            case 'B' -> Optional.of(ROUTED_TO_BX);
            case 'E' -> Optional.of(NYSE_OTHER);
            case 'P' -> Optional.of(ROUTED_TO_PSX);
            case 'T' -> Optional.of(OPENING_TRADE_ON_ARCA);
            case 'Z' -> Optional.of(ON_CLOSE_ORDER_ON_ARCA);
            case 'm' -> Optional.of(REMOVED_LIQUIDITY_AT_A_MIDPOINT);
            case 'k' -> Optional.of(ADDED_LIQUIDITY_VIA_A_MIDPOINT_ORDER);
            default -> Optional.empty();
        };
    }
}
