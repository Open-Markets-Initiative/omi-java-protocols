package omi.nyse.arcaequities.bqt.xdp.v2_4_c.enums;

import java.util.Optional;

/**
 * Ask Quote Condition
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AskQuoteCondition {

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
     * Slow On The Bid And Ask Due To Set Slow List
     */
    SLOW_ON_THE_BID_AND_ASK_DUE_TO_SET_SLOW_LIST('W', "Slow On The Bid And Ask Due To Set Slow List");

    private final char wire;

    private final String description;

    AskQuoteCondition(char wire, String description) {
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
    public static Optional<AskQuoteCondition> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CLOSING);
            case 'O' -> Optional.of(OPENING_QUOTE);
            case 'R' -> Optional.of(REGULAR_QUOTE);
            case 'W' -> Optional.of(SLOW_ON_THE_BID_AND_ASK_DUE_TO_SET_SLOW_LIST);
            default -> Optional.empty();
        };
    }
}
