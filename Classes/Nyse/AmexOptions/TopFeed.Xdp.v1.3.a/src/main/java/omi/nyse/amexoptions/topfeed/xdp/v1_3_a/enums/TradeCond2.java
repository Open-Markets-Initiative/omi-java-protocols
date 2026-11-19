package omi.nyse.amexoptions.topfeed.xdp.v1_3_a.enums;

import java.util.Optional;

/**
 * Complex indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCond2 {

    /**
     * Complex trade with equity trade
     */
    COMPLEX_TRADE_WITH_EQUITY('P', "Complex trade with equity trade"),

    /**
     * Complex trade
     */
    COMPLEX_TRADE('L', "Complex trade");

    private final char wire;

    private final String description;

    TradeCond2(char wire, String description) {
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
    public static Optional<TradeCond2> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(COMPLEX_TRADE_WITH_EQUITY);
            case 'L' -> Optional.of(COMPLEX_TRADE);
            default -> Optional.empty();
        };
    }
}
