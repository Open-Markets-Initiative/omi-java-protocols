package omi.siac.cqs.output.cta.v2_10_a.enums;

import java.util.Optional;

/**
 * Identifies the type of Quote message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteMessageType {

    /**
     * Auction Status
     */
    AUCTION_STATUS('A', "Auction Status"),

    /**
     * Long Quote
     */
    LONG_QUOTE('L', "Long Quote"),

    /**
     * Short Quote
     */
    SHORT_QUOTE('Q', "Short Quote"),

    /**
     * Special Long Quote
     */
    SPECIAL_LONG_QUOTE('S', "Special Long Quote");

    private final char wire;

    private final String description;

    QuoteMessageType(char wire, String description) {
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
    public static Optional<QuoteMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AUCTION_STATUS);
            case 'L' -> Optional.of(LONG_QUOTE);
            case 'Q' -> Optional.of(SHORT_QUOTE);
            case 'S' -> Optional.of(SPECIAL_LONG_QUOTE);
            default -> Optional.empty();
        };
    }
}
