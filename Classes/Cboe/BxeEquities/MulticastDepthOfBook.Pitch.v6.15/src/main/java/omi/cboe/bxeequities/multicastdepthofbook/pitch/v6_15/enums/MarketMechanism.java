package omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_15.enums;

import java.util.Optional;

/**
 * MMT Level 1
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketMechanism {

    /**
     * Central Limit Order Book
     */
    CENTRAL_LIMIT_ORDER_BOOK('1', "Central Limit Order Book"),

    /**
     * Quote Driven Market
     */
    QUOTE_DRIVEN_MARKET('2', "Quote Driven Market"),

    /**
     * Dark Order Book
     */
    DARK_ORDER_BOOK('3', "Dark Order Book"),

    /**
     * Off Book
     */
    OFF_BOOK('4', "Off Book");

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
            case '1' -> Optional.of(CENTRAL_LIMIT_ORDER_BOOK);
            case '2' -> Optional.of(QUOTE_DRIVEN_MARKET);
            case '3' -> Optional.of(DARK_ORDER_BOOK);
            case '4' -> Optional.of(OFF_BOOK);
            default -> Optional.empty();
        };
    }
}
