package omi.tadawul.saudiexchange.totalview.itch.v1_9.enums;

import java.util.Optional;

/**
 * Orderbook Price Reasons
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderbookPriceReason {

    /**
     * Reserved For Future Use
     */
    RESERVED_FOR_FUTURE_USE(' ', "Reserved For Future Use");

    private final char wire;

    private final String description;

    OrderbookPriceReason(char wire, String description) {
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
    public static Optional<OrderbookPriceReason> fromWire(char wire) {
        return wire == ' ' ? Optional.of(RESERVED_FOR_FUTURE_USE) : Optional.empty();
    }
}
