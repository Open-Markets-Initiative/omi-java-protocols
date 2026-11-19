package omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.enums;

import java.util.Optional;

/**
 * Defines the QuoteCondition values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteCondition {

    /**
     * Non-firm quote on both bid/ask sides
     */
    NON_FIRM_QUOTE('F', "Non-firm quote on both bid/ask sides"),

    /**
     * Rotational quote
     */
    ROTATIONAL_QUOTE('R', "Rotational quote"),

    /**
     * Ask side not firm, bid side firm
     */
    BID_SIDE_FIRM('X', "Ask side not firm, bid side firm"),

    /**
     * Bid side not firm, ask side firm
     */
    ASK_SIDE_FIRM('Y', "Bid side not firm, ask side firm"),

    /**
     * Regular Quote Autox Eligible
     */
    REGULAR_QUOTE(' ', "Regular Quote Autox Eligible");

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
            case 'F' -> Optional.of(NON_FIRM_QUOTE);
            case 'R' -> Optional.of(ROTATIONAL_QUOTE);
            case 'X' -> Optional.of(BID_SIDE_FIRM);
            case 'Y' -> Optional.of(ASK_SIDE_FIRM);
            case ' ' -> Optional.of(REGULAR_QUOTE);
            default -> Optional.empty();
        };
    }
}
