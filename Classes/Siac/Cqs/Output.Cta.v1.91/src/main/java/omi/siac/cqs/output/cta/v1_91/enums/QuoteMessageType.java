package omi.siac.cqs.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Quote message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteMessageType {

    /**
     * Auction Status Message
     */
    AUCTION_STATUS_MESSAGE('A', "Auction Status Message"),

    /**
     * Long Quote Message
     */
    LONG_QUOTE_MESSAGE('L', "Long Quote Message"),

    /**
     * Short Quote Message
     */
    SHORT_QUOTE_MESSAGE('Q', "Short Quote Message"),

    /**
     * Special Long Quote Message
     */
    SPECIAL_LONG_QUOTE_MESSAGE('S', "Special Long Quote Message");

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
            case 'A' -> Optional.of(AUCTION_STATUS_MESSAGE);
            case 'L' -> Optional.of(LONG_QUOTE_MESSAGE);
            case 'Q' -> Optional.of(SHORT_QUOTE_MESSAGE);
            case 'S' -> Optional.of(SPECIAL_LONG_QUOTE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
