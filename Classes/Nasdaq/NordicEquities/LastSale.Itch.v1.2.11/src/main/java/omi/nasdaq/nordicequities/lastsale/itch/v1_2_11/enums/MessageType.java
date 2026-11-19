package omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Adjusted closing price disseminated for all active symbols at the start of each trading day
     */
    ADJUSTED_CLOSING_PRICE_MESSAGE('G', "Adjusted closing price disseminated for all active symbols at the start of each trading day"),

    /**
     * Relays on exchange trade transactions executed or deferred to the current business day
     */
    ON_EXCHANGE_TRADE_MESSAGE('T', "Relays on exchange trade transactions executed or deferred to the current business day"),

    /**
     * Relays over the counter and systematic internaliser trade transactions
     */
    OTC_TRADE_MESSAGE('Z', "Relays over the counter and systematic internaliser trade transactions");

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
        return switch (wire) {
            case 'G' -> Optional.of(ADJUSTED_CLOSING_PRICE_MESSAGE);
            case 'T' -> Optional.of(ON_EXCHANGE_TRADE_MESSAGE);
            case 'Z' -> Optional.of(OTC_TRADE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
