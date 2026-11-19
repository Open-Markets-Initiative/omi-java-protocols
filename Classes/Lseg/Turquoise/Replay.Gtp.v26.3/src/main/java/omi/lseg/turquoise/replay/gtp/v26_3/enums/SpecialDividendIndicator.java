package omi.lseg.turquoise.replay.gtp.v26_3.enums;

import java.util.Optional;

/**
 * Special Dividend Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SpecialDividendIndicator {

    /**
     * No Special Dividend Trade
     */
    NO_SPECIAL_DIVIDEND_TRADE('-', "No Special Dividend Trade");

    private final char wire;

    private final String description;

    SpecialDividendIndicator(char wire, String description) {
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
    public static Optional<SpecialDividendIndicator> fromWire(char wire) {
        return wire == '-' ? Optional.of(NO_SPECIAL_DIVIDEND_TRADE) : Optional.empty();
    }
}
