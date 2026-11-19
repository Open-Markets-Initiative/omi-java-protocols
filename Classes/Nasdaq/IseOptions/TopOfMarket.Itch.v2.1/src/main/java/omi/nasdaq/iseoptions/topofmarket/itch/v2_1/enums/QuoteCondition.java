package omi.nasdaq.iseoptions.topofmarket.itch.v2_1.enums;

import java.util.Optional;

/**
 * Quote condition
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteCondition {

    /**
     * Regular Quote/Autox Eligible
     */
    REGULAR_QUOTE_AUTOX_ELIGIBLE(' ', "Regular Quote/Autox Eligible"),

    /**
     * Ask Side Not Firm, Bid Side Firm
     */
    ASK_SIDE_NOT_FIRM_BID_SIDE_FIRM('X', "Ask Side Not Firm, Bid Side Firm"),

    /**
     * Bid Side Not Firm, Ask Side Firm
     */
    BID_SIDE_NOT_FIRM_ASK_SIDE_FIRM('Y', "Bid Side Not Firm, Ask Side Firm");

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
            case ' ' -> Optional.of(REGULAR_QUOTE_AUTOX_ELIGIBLE);
            case 'X' -> Optional.of(ASK_SIDE_NOT_FIRM_BID_SIDE_FIRM);
            case 'Y' -> Optional.of(BID_SIDE_NOT_FIRM_ASK_SIDE_FIRM);
            default -> Optional.empty();
        };
    }
}
