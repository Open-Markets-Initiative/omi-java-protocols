package omi.biva.bivaequities.lastsale.itch.v1_12.enums;

import java.util.Optional;

/**
 * Indicates type of trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeIndicator {

    /**
     * Intentional Cross Trade
     */
    INTENTIONAL_CROSS_TRADE('C', "Intentional Cross Trade"),

    /**
     * Exceptional Cross Trade At Vwap
     */
    EXCEPTIONAL_CROSS_TRADE_AT_VWAP('E', "Exceptional Cross Trade At Vwap"),

    /**
     * Ipo Cross
     */
    IPO_CROSS('I', "Ipo Cross"),

    /**
     * Regular Trade
     */
    REGULAR_TRADE('R', "Regular Trade"),

    /**
     * Unintentional Self Cross
     */
    UNINTENTIONAL_SELF_CROSS('U', "Unintentional Self Cross");

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
            case 'C' -> Optional.of(INTENTIONAL_CROSS_TRADE);
            case 'E' -> Optional.of(EXCEPTIONAL_CROSS_TRADE_AT_VWAP);
            case 'I' -> Optional.of(IPO_CROSS);
            case 'R' -> Optional.of(REGULAR_TRADE);
            case 'U' -> Optional.of(UNINTENTIONAL_SELF_CROSS);
            default -> Optional.empty();
        };
    }
}
