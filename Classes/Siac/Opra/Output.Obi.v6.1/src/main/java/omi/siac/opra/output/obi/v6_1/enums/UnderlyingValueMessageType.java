package omi.siac.opra.output.obi.v6_1.enums;

import java.util.Optional;

/**
 * Underlying Value Message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UnderlyingValueMessageType {

    /**
     * Underlying Value Last Sale Message
     */
    UNDERLYING_VALUE_LAST_SALE_MESSAGE(' ', "Underlying Value Last Sale Message"),

    /**
     * Underlying Value Bid And Offer Message
     */
    UNDERLYING_VALUE_BID_AND_OFFER_MESSAGE('I', "Underlying Value Bid And Offer Message");

    private final char wire;

    private final String description;

    UnderlyingValueMessageType(char wire, String description) {
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
    public static Optional<UnderlyingValueMessageType> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(UNDERLYING_VALUE_LAST_SALE_MESSAGE);
            case 'I' -> Optional.of(UNDERLYING_VALUE_BID_AND_OFFER_MESSAGE);
            default -> Optional.empty();
        };
    }
}
