package omi.siac.cts.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Index message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IndexMessageType {

    /**
     * Index Message
     */
    INDEX_MESSAGE('I', "Index Message"),

    /**
     * Bid And Offer Index Message
     */
    BID_AND_OFFER_INDEX_MESSAGE('Q', "Bid And Offer Index Message");

    private final char wire;

    private final String description;

    IndexMessageType(char wire, String description) {
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
    public static Optional<IndexMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'I' -> Optional.of(INDEX_MESSAGE);
            case 'Q' -> Optional.of(BID_AND_OFFER_INDEX_MESSAGE);
            default -> Optional.empty();
        };
    }
}
