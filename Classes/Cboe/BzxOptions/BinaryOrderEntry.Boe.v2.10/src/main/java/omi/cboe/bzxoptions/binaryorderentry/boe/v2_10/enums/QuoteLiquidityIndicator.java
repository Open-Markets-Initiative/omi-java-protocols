package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Quote Liquidity Indicator Values
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteLiquidityIndicator {

    /**
     * Normal
     */
    NORMAL('N', "Normal"),

    /**
     * Nbbo Setter
     */
    NBBO_SETTER('S', "Nbbo Setter"),

    /**
     * Nbbo Joiner
     */
    NBBO_JOINER('J', "Nbbo Joiner"),

    /**
     * Market Turner
     */
    MARKET_TURNER('U', "Market Turner"),

    /**
     * No Quote On Book
     */
    NO_QUOTE_ON_BOOK(' ', "No Quote On Book");

    private final char wire;

    private final String description;

    QuoteLiquidityIndicator(char wire, String description) {
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
    public static Optional<QuoteLiquidityIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NORMAL);
            case 'S' -> Optional.of(NBBO_SETTER);
            case 'J' -> Optional.of(NBBO_JOINER);
            case 'U' -> Optional.of(MARKET_TURNER);
            case ' ' -> Optional.of(NO_QUOTE_ON_BOOK);
            default -> Optional.empty();
        };
    }
}
