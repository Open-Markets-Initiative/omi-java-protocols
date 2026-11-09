package omi.asx.asxderivatives.ntp.itch.v1_05.enums;

import java.util.Optional;

/**
 * Nature of the match
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeType {

    /**
     * an outright to outright trade
     */
    NORMAL_TRADE('T', "an outright to outright trade"),

    /**
     * an outright to outright cross
     */
    NORMAL_CROSS('t', "an outright to outright cross"),

    /**
     * Trade price may be different than price of resting order
     */
    AUCTION_TRADE('L', "Trade price may be different than price of resting order"),

    /**
     * Trade price may be different than price of resting order
     */
    AUCTION_CROSS('l', "Trade price may be different than price of resting order"),

    /**
     * Price is based on the order price of an underlying order book relating to intra-spread, inter-spread, or user defined combination matching with an outright order
     */
    COMBINATION_TO_UNDERLYING_TRADE('S', "Price is based on the order price of an underlying order book relating to intra-spread, inter-spread, or user defined combination matching with an outright order"),

    /**
     * Price is based on the order price of an underlying order book relating to intra-spread, inter-spread, or user defined combination matching with an outright order
     */
    COMBINATION_TO_UNDERLYING_CROSS('s', "Price is based on the order price of an underlying order book relating to intra-spread, inter-spread, or user defined combination matching with an outright order"),

    /**
     * Trade price is based on the current indicative pricing from the underlying order book
     */
    COMBINATION_TO_COMBINATION_TRADE('R', "Trade price is based on the current indicative pricing from the underlying order book"),

    /**
     * Cross price is based on the current indicative pricing from the underlying order book
     */
    COMBINATION_TO_COMBINATION_CROSS('r', "Cross price is based on the current indicative pricing from the underlying order book"),

    /**
     * Indicates an Average Price Type combination order has matched with another Average Price Type combination order
     */
    STRIP_TO_STRIP_TRADE('A', "Indicates an Average Price Type combination order has matched with another Average Price Type combination order"),

    /**
     * Indicates an Average Price Type combination order has matched with another Average Price Type combination order
     */
    STRIP_TO_STRIP_CROSS('a', "Indicates an Average Price Type combination order has matched with another Average Price Type combination order"),

    /**
     * Indicates an Average Price Type combination order has matched with an outright order
     */
    STRIP_TO_OUTRIGHT_TRADE('B', "Indicates an Average Price Type combination order has matched with an outright order"),

    /**
     * Indicates an Average Price Type combination order has matched with an outright order
     */
    STRIP_TO_OUTRIGHT_CROSS('b', "Indicates an Average Price Type combination order has matched with an outright order");

    private final char wire;

    private final String description;

    TradeType(char wire, String description) {
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
    public static Optional<TradeType> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(NORMAL_TRADE);
            case 't' -> Optional.of(NORMAL_CROSS);
            case 'L' -> Optional.of(AUCTION_TRADE);
            case 'l' -> Optional.of(AUCTION_CROSS);
            case 'S' -> Optional.of(COMBINATION_TO_UNDERLYING_TRADE);
            case 's' -> Optional.of(COMBINATION_TO_UNDERLYING_CROSS);
            case 'R' -> Optional.of(COMBINATION_TO_COMBINATION_TRADE);
            case 'r' -> Optional.of(COMBINATION_TO_COMBINATION_CROSS);
            case 'A' -> Optional.of(STRIP_TO_STRIP_TRADE);
            case 'a' -> Optional.of(STRIP_TO_STRIP_CROSS);
            case 'B' -> Optional.of(STRIP_TO_OUTRIGHT_TRADE);
            case 'b' -> Optional.of(STRIP_TO_OUTRIGHT_CROSS);
            default -> Optional.empty();
        };
    }
}
