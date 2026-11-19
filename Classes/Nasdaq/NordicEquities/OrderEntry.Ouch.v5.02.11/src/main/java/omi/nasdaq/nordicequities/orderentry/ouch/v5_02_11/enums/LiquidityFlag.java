package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.enums;

import java.util.Optional;

/**
 * The type of trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LiquidityFlag {

    /**
     * Continuous Market Trade
     */
    CONTINUOUS_MARKET_TRADE('A', "Continuous Market Trade"),

    /**
     * Auction Trade
     */
    AUCTION_TRADE('C', "Auction Trade"),

    /**
     * Auction On Demand Trade
     */
    AUCTION_ON_DEMAND_TRADE('P', "Auction On Demand Trade"),

    /**
     * Trading At Close Price
     */
    TRADING_AT_CLOSE_PRICE('G', "Trading At Close Price"),

    /**
     * Nordic Mid
     */
    NORDIC_MID('M', "Nordic Mid"),

    /**
     * Pure Stream
     */
    PURE_STREAM('S', "Pure Stream"),

    /**
     * Auction Volume Discovery
     */
    AUCTION_VOLUME_DISCOVERY('V', "Auction Volume Discovery");

    private final char wire;

    private final String description;

    LiquidityFlag(char wire, String description) {
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
    public static Optional<LiquidityFlag> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(CONTINUOUS_MARKET_TRADE);
            case 'C' -> Optional.of(AUCTION_TRADE);
            case 'P' -> Optional.of(AUCTION_ON_DEMAND_TRADE);
            case 'G' -> Optional.of(TRADING_AT_CLOSE_PRICE);
            case 'M' -> Optional.of(NORDIC_MID);
            case 'S' -> Optional.of(PURE_STREAM);
            case 'V' -> Optional.of(AUCTION_VOLUME_DISCOVERY);
            default -> Optional.empty();
        };
    }
}
