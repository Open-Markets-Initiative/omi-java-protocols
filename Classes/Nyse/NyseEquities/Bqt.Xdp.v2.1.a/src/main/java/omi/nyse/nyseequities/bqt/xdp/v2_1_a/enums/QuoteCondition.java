package omi.nyse.nyseequities.bqt.xdp.v2_1_a.enums;

import java.util.Optional;

/**
 * Quote Condition value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteCondition {

    /**
     * Closing
     */
    CLOSING('C', "Closing"),

    /**
     * Opening Quote
     */
    OPENING_QUOTE('O', "Opening Quote"),

    /**
     * Regular Quote
     */
    REGULAR_QUOTE('R', "Regular Quote"),

    /**
     * Slow on the Bid and Ask due to a Set Slow List
     */
    SLOW_ON_THE_BID_AND_ASK('W', "Slow on the Bid and Ask due to a Set Slow List"),

    /**
     * NULL (0x00), no BBO available for the given instrument
     */
    EMPTY_QUOTE('0', "NULL (0x00), no BBO available for the given instrument");

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
            case '0' -> Optional.of(EMPTY_QUOTE);
            default -> Optional.empty();
        };
    }
}
