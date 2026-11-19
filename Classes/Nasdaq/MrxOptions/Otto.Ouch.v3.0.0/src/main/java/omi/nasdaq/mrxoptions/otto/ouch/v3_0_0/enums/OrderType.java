package omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * L=Limit, M=Market
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderType {

    /**
     * Limit
     */
    LIMIT('L', "Limit"),

    /**
     * Market
     */
    MARKET('M', "Market"),

    /**
     * Not Disclosed (Auction Notification only)
     */
    NOT_DISCLOSED('N', "Not Disclosed (Auction Notification only)");

    private final char wire;

    private final String description;

    OrderType(char wire, String description) {
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
    public static Optional<OrderType> fromWire(char wire) {
        return switch (wire) {
            case 'L' -> Optional.of(LIMIT);
            case 'M' -> Optional.of(MARKET);
            case 'N' -> Optional.of(NOT_DISCLOSED);
            default -> Optional.empty();
        };
    }
}
