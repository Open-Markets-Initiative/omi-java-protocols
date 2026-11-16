package omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

/**
 * StrategyType value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StrategyType {

    /**
     * Vertical Spread
     */
    VERTICAL_SPREAD('V'),

    /**
     * Time Spread
     */
    TIME_SPREAD('T'),

    /**
     * Diagonal Spread
     */
    DIAGONAL_SPREAD('D'),

    /**
     * Straddle
     */
    STRADDLE('S'),

    /**
     * Strangle
     */
    STRANGLE('G'),

    /**
     * Combo
     */
    COMBO('C'),

    /**
     * Risk Reversal
     */
    RISK_REVERSAL('R'),

    /**
     * Ratio Spread
     */
    RATIO_SPREAD('A'),

    /**
     * Custom
     */
    CUSTOM('U');

    private static final StrategyType[] BY_WIRE = new StrategyType[256];

    static {
        for (StrategyType value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    StrategyType(char wire) {
        this.wire = wire;
    }

    /**
     * Gets the value as it is sent.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Looks a value up from its wire form, allocating nothing.
     *
     * @param wire the wire value
     * @return the value, or null when the protocol declares none for it
     */
    public static StrategyType get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
