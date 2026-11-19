package omi.bme.bmeequities.topofbook5.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Market Mechanism
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketMechanism {

    /**
     * Central Limit Order Book
     */
    CENTRAL_LIMIT_ORDER_BOOK('0', "Central Limit Order Book"),

    /**
     * Dark Order Book
     */
    DARK_ORDER_BOOK('4', "Dark Order Book"),

    /**
     * Off Book Messaging Trading
     */
    OFF_BOOK_MESSAGING_TRADING('1', "Off Book Messaging Trading"),

    /**
     * Periodic Auction
     */
    PERIODIC_AUCTION('5', "Periodic Auction");

    private final char wire;

    private final String description;

    MarketMechanism(char wire, String description) {
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
    public static Optional<MarketMechanism> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(CENTRAL_LIMIT_ORDER_BOOK);
            case '4' -> Optional.of(DARK_ORDER_BOOK);
            case '1' -> Optional.of(OFF_BOOK_MESSAGING_TRADING);
            case '5' -> Optional.of(PERIODIC_AUCTION);
            default -> Optional.empty();
        };
    }
}
