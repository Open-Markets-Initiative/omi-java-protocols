package omi.nyse.arcaequities.bbo.xdp.v2_4_c.enums;

import java.util.Optional;

/**
 * Quote condition values. For markets other than NYSE, only condition R is applicable.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteCondition {

    /**
     * Closing value
     */
    CLOSING('C', "Closing value"),

    /**
     * Opening quote value
     */
    OPENING_QUOTE('O', "Opening quote value"),

    /**
     * Regular quote value
     */
    REGULAR_QUOTE('R', "Regular quote value"),

    /**
     * Slow on the Bid and Ask (this symbol is on the Set Slow List)
     */
    SLOW_ON_THE_BID_AND_ASK('W', "Slow on the Bid and Ask (this symbol is on the Set Slow List)");

    private final char wire;

    private final String description;

    QuoteCondition(char wire, String description) {
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
    public static Optional<QuoteCondition> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CLOSING);
            case 'O' -> Optional.of(OPENING_QUOTE);
            case 'R' -> Optional.of(REGULAR_QUOTE);
            case 'W' -> Optional.of(SLOW_ON_THE_BID_AND_ASK);
            default -> Optional.empty();
        };
    }
}
