package omi.lseg.tradeecho.mifid2posttradereplay.gtp.v27_2_2.enums;

import java.util.Optional;

/**
 * Special dividend indicator short code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SpecialDividendIndicator {

    /**
     * Special Dividend Trade
     */
    SPECIAL_DIVIDEND_TRADE('E', "Special Dividend Trade"),

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
        return switch (wire) {
            case 'E' -> Optional.of(SPECIAL_DIVIDEND_TRADE);
            case '-' -> Optional.of(NO_SPECIAL_DIVIDEND_TRADE);
            default -> Optional.empty();
        };
    }
}
