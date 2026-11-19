package omi.nasdaq.psxequities.orders.ouch.v4_2.enums;

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
     * Opening Cross
     */
    OPENING('O', "Opening Cross"),

    /**
     * Opening Cross (imbalance-only)
     */
    OPENING_CROSS('M', "Opening Cross (imbalance-only)"),

    /**
     * Closing Cross
     */
    CLOSING('C', "Closing Cross"),

    /**
     * Closing Cross (imbalance-only)
     */
    CLOSING_CROSS('L', "Closing Cross (imbalance-only)"),

    /**
     * Halt/IPO Cross
     */
    HALT_IPO('H', "Halt/IPO Cross"),

    /**
     * Halt Cross
     */
    HALT('K', "Halt Cross"),

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
     * Displayed added liquidity with original order size of greater than or equal to 2,000 shares. Only applicable to symbols that are set to the pro rata execution algorithm
     */
    DISPLAYED_ADDED_LIQUIDITY('V', "Displayed added liquidity with original order size of greater than or equal to 2,000 shares. Only applicable to symbols that are set to the pro rata execution algorithm");

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
            case 'O' -> Optional.of(OPENING);
            case 'M' -> Optional.of(OPENING_CROSS);
            case 'C' -> Optional.of(CLOSING);
            case 'L' -> Optional.of(CLOSING_CROSS);
            case 'H' -> Optional.of(HALT_IPO);
            case 'K' -> Optional.of(HALT);
            case 'J' -> Optional.of(NON_DISPLAYED);
            case 'm' -> Optional.of(REMOVED_M);
            case 'k' -> Optional.of(ADDED_K);
            case 'V' -> Optional.of(DISPLAYED_ADDED_LIQUIDITY);
            default -> Optional.empty();
        };
    }
}
