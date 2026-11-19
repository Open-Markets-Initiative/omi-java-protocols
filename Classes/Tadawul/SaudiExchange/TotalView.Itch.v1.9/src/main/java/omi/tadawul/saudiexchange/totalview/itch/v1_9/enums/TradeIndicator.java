package omi.tadawul.saudiexchange.totalview.itch.v1_9.enums;

import java.util.Optional;

/**
 * Trade Indicators
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeIndicator {

    /**
     * Auto Match
     */
    AUTO_MATCH('A', "Auto Match"),

    /**
     * Auto Match Small Trade
     */
    AUTO_MATCH_SMALL_TRADE('B', "Auto Match Small Trade"),

    /**
     * Non Crossing Off Market Trade
     */
    NON_CROSSING_OFF_MARKET_TRADE('P', "Non Crossing Off Market Trade"),

    /**
     * Crossing Off Market Trade
     */
    CROSSING_OFF_MARKET_TRADE('p', "Crossing Off Market Trade"),

    /**
     * Non Crossing Off Market Small Trade
     */
    NON_CROSSING_OFF_MARKET_SMALL_TRADE('S', "Non Crossing Off Market Small Trade"),

    /**
     * Crossing Off Market Small Trade
     */
    CROSSING_OFF_MARKET_SMALL_TRADE('s', "Crossing Off Market Small Trade"),

    /**
     * Non Crossing On Market Negotiated Deal
     */
    NON_CROSSING_ON_MARKET_NEGOTIATED_DEAL('O', "Non Crossing On Market Negotiated Deal"),

    /**
     * Crossing On Market Negotiated Deal
     */
    CROSSING_ON_MARKET_NEGOTIATED_DEAL('o', "Crossing On Market Negotiated Deal");

    private final char wire;

    private final String description;

    TradeIndicator(char wire, String description) {
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
    public static Optional<TradeIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AUTO_MATCH);
            case 'B' -> Optional.of(AUTO_MATCH_SMALL_TRADE);
            case 'P' -> Optional.of(NON_CROSSING_OFF_MARKET_TRADE);
            case 'p' -> Optional.of(CROSSING_OFF_MARKET_TRADE);
            case 'S' -> Optional.of(NON_CROSSING_OFF_MARKET_SMALL_TRADE);
            case 's' -> Optional.of(CROSSING_OFF_MARKET_SMALL_TRADE);
            case 'O' -> Optional.of(NON_CROSSING_ON_MARKET_NEGOTIATED_DEAL);
            case 'o' -> Optional.of(CROSSING_ON_MARKET_NEGOTIATED_DEAL);
            default -> Optional.empty();
        };
    }
}
