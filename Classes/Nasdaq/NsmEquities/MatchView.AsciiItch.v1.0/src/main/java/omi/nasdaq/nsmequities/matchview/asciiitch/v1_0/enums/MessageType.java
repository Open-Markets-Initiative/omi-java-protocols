package omi.nasdaq.nsmequities.matchview.asciiitch.v1_0.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Nasdaq's internal view of the National Best Bid and Offer, used with OUCH to prevent trade-throughs and quote-throughs. For this feed, the only message type is "U".
     */
    BEST_BID_AND_OFFER_MESSAGE('U', "Nasdaq's internal view of the National Best Bid and Offer, used with OUCH to prevent trade-throughs and quote-throughs. For this feed, the only message type is \"U\".");

    private final char wire;

    private final String description;

    MessageType(char wire, String description) {
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
    public static Optional<MessageType> fromWire(char wire) {
        return wire == 'U' ? Optional.of(BEST_BID_AND_OFFER_MESSAGE) : Optional.empty();
    }
}
