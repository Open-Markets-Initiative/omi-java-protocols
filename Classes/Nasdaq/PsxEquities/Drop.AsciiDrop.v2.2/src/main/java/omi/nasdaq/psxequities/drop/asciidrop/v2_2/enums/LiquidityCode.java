package omi.nasdaq.psxequities.drop.asciidrop.v2_2.enums;

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
     * O = Opening Cross (billable)
     */
    OPENING_CROSS_BILLABLE('O', "O = Opening Cross (billable)"),

    /**
     * M = Opening Cross (non-billable)
     */
    OPENING_CROSS_NON_BILLABLE('M', "M = Opening Cross (non-billable)"),

    /**
     * C = Closing Cross (billable)
     */
    CLOSING_CROSS_BILLABLE('C', "C = Closing Cross (billable)"),

    /**
     * L = Closing Cross (non-billable)
     */
    CLOSING_CROSS_NON_BILLABLE('L', "L = Closing Cross (non-billable)"),

    /**
     * H = Halt/IPO Cross (billable)
     */
    HALT_IPO_CROSS_BILLABLE('H', "H = Halt/IPO Cross (billable)"),

    /**
     * K = Halt/IPO Cross (non-billable)
     */
    HALT_IPO_CROSS_NON_BILLABLE('K', "K = Halt/IPO Cross (non-billable)"),

    /**
     * I = Intraday and post-market crosses
     */
    INTRADAY_AND_POST_MARKET_CROSSES('I', "I = Intraday and post-market crosses"),

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
     * 9 = Added (displayed) using Minimum Life Order Type
     */
    ADDED_DISPLAYED_USING_MINIMUM_LIFE_ORDER_TYPE('9', "9 = Added (displayed) using Minimum Life Order Type");

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
            case 'V' -> Optional.of(DISPLAYED_ADDED_LIQUIDITY_WITH_ORIGINAL_ORDER_SIZE_OF_GREATER_THAN_OR_EQUAL_TO_2000_SHARES);
            case 'X' -> Optional.of(ROUTED);
            case 'D' -> Optional.of(DOT);
            case 'F' -> Optional.of(ADDED_OR_OPENING_TRADE_ON_NYSE);
            case 'G' -> Optional.of(ODD_LOT_OR_ON_CLOSE_ORDER_ON_NYSE);
            case 'O' -> Optional.of(OPENING_CROSS_BILLABLE);
            case 'M' -> Optional.of(OPENING_CROSS_NON_BILLABLE);
            case 'C' -> Optional.of(CLOSING_CROSS_BILLABLE);
            case 'L' -> Optional.of(CLOSING_CROSS_NON_BILLABLE);
            case 'H' -> Optional.of(HALT_IPO_CROSS_BILLABLE);
            case 'K' -> Optional.of(HALT_IPO_CROSS_NON_BILLABLE);
            case 'I' -> Optional.of(INTRADAY_AND_POST_MARKET_CROSSES);
            case 'J' -> Optional.of(NON_DISPLAYED_AND_ADDED_LIQUIDITY);
            case 'Y' -> Optional.of(RE_ROUTED_BY_NYSE);
            case 'S' -> Optional.of(ODD_LOT_EXECUTION_ON_NYSE);
            case 'U' -> Optional.of(ADDED_LIQUIDITY_ON_NYSE);
            case 'B' -> Optional.of(ROUTED_TO_BX);
            case 'E' -> Optional.of(NYSE_OTHER);
            case 'P' -> Optional.of(ROUTED_TO_PSX);
            case 'T' -> Optional.of(OPENING_TRADE_ON_ARCA);
            case 'Z' -> Optional.of(ON_CLOSE_ORDER_ON_ARCA);
            case '9' -> Optional.of(ADDED_DISPLAYED_USING_MINIMUM_LIFE_ORDER_TYPE);
            default -> Optional.empty();
        };
    }
}
