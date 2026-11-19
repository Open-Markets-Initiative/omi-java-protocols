package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * M = Midpoint Peg; R = Primary Peg; x = Minimum Price Improvement; S = Seek Price Improvement; L = M-ELO (CXC Only); o = Odd Lot Liquidity Providing (OLP) (CXD Only)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PegType {

    /**
     * Midpoint Peg
     */
    MIDPOINT_PEG('M', "Midpoint Peg"),

    /**
     * Primary Peg
     */
    PRIMARY_PEG('R', "Primary Peg"),

    /**
     * Minimum Price Improvement
     */
    MINIMUM_PRICE_IMPROVEMENT('x', "Minimum Price Improvement"),

    /**
     * Seek Price Improvement
     */
    SEEK_PRICE_IMPROVEMENT('S', "Seek Price Improvement"),

    /**
     * M-ELO (CXC Only)
     */
    M_ELO('L', "M-ELO (CXC Only)"),

    /**
     * Odd Lot Liquidity Providing (OLP) (CXD Only)
     */
    ODD_LOT_LIQUIDITY_PROVIDING('o', "Odd Lot Liquidity Providing (OLP) (CXD Only)");

    private final char wire;

    private final String description;

    PegType(char wire, String description) {
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
    public static Optional<PegType> fromWire(char wire) {
        return switch (wire) {
            case 'M' -> Optional.of(MIDPOINT_PEG);
            case 'R' -> Optional.of(PRIMARY_PEG);
            case 'x' -> Optional.of(MINIMUM_PRICE_IMPROVEMENT);
            case 'S' -> Optional.of(SEEK_PRICE_IMPROVEMENT);
            case 'L' -> Optional.of(M_ELO);
            case 'o' -> Optional.of(ODD_LOT_LIQUIDITY_PROVIDING);
            default -> Optional.empty();
        };
    }
}
