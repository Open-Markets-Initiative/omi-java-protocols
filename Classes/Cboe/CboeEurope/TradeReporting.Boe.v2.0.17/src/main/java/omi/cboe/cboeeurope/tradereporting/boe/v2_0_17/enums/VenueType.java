package omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.enums;

import java.util.Optional;

/**
 * Defines the VenueType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum VenueType {

    /**
     * Off Book
     */
    OFF_BOOK('O', "Off Book"),

    /**
     * Central Limit Order Book
     */
    CENTRAL_LIMIT_ORDER_BOOK('B', "Central Limit Order Book"),

    /**
     * Quote Driven Market
     */
    QUOTE_DRIVEN_MARKET('Q', "Quote Driven Market"),

    /**
     * Dark Order Book
     */
    DARK_ORDER_BOOK('D', "Dark Order Book"),

    /**
     * Periodic Auction
     */
    PERIODIC_AUCTION('A', "Periodic Auction"),

    /**
     * Request For Quotes
     */
    REQUEST_FOR_QUOTES('N', "Request For Quotes"),

    /**
     * Hybrid Market
     */
    HYBRID_MARKET('H', "Hybrid Market");

    private final char wire;

    private final String description;

    VenueType(char wire, String description) {
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
    public static Optional<VenueType> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OFF_BOOK);
            case 'B' -> Optional.of(CENTRAL_LIMIT_ORDER_BOOK);
            case 'Q' -> Optional.of(QUOTE_DRIVEN_MARKET);
            case 'D' -> Optional.of(DARK_ORDER_BOOK);
            case 'A' -> Optional.of(PERIODIC_AUCTION);
            case 'N' -> Optional.of(REQUEST_FOR_QUOTES);
            case 'H' -> Optional.of(HYBRID_MARKET);
            default -> Optional.empty();
        };
    }
}
