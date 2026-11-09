package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.enums;

import java.util.Optional;

/**
 * Settlement related conditions. Valid values:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Series {

    /**
     * outright series order/quote trading electronically with a outright series CUBE Exposed order or outright series CUBE Exposed order trading electronically with outright series
     */
    CUBE('a', "outright series order/quote trading electronically with a outright series CUBE Exposed order or outright series CUBE Exposed order trading electronically with outright series"),

    /**
     * trading of a outright series QCC order
     */
    OCC('c', "trading of a outright series QCC order"),

    /**
     * outright series floor trade
     */
    FLOOR_TRADE('e', "outright series floor trade"),

    /**
     * Other outright series
     */
    OTHER_OUTRIGHT_SERIES('I', "Other outright series"),

    /**
     * all outright series trades that are generated as part of an Intermarket Sweep order
     */
    ISO_SWEEP('S', "all outright series trades that are generated as part of an Intermarket Sweep order"),

    /**
     * any of the above published after 90 seconds of occurring
     */
    AFTER_90_SECONDS('D', "any of the above published after 90 seconds of occurring"),

    /**
     * complex order trades that were not part of the following transactions
     */
    OTHER_COMPLEX_ORDERS('f', "complex order trades that were not part of the following transactions"),

    /**
     * complex order trading electronically with a complex CUBE Exposed order or complex CUBE Exposed order trading electronically with Complex CUBE Covered order
     */
    COMPLEX_CUBE('g', "complex order trading electronically with a complex CUBE Exposed order or complex CUBE Exposed order trading electronically with Complex CUBE Covered order"),

    /**
     * trading of a complex QCC order
     */
    COMPLEX_QCC_ORDER('H', "trading of a complex QCC order"),

    /**
     * Complex order to complex order floor trade
     */
    COMPLEX_FLOOR_ORDER('i', "Complex order to complex order floor trade"),

    /**
     * complex order trading electronically with the outright series orders/quotes
     */
    COMPLEX_ORDER_TRADING_WITH_THE_OUTRIGHT_SERIES('j', "complex order trading electronically with the outright series orders/quotes"),

    /**
     * Complex Order To Outright Series Orderfloor Trade
     */
    COMPLEX_ORDER_TO_OUTRIGHT_SERIES_ORDERFLOOR_TRADE('m', "Complex Order To Outright Series Orderfloor Trade"),

    /**
     * Complex Order With Stock To Complex Order With Stock Floor Trade
     */
    COMPLEX_ORDER_WITH_STOCK_TO_COMPLEX_ORDER_WITH_STOCK_FLOOR_TRADE('p', "Complex Order With Stock To Complex Order With Stock Floor Trade"),

    /**
     * Complex Order With Stock To Outright Series Order Floor Trade
     */
    COMPLEX_ORDER_WITH_STOCK_TO_OUTRIGHT_SERIES_ORDER_FLOOR_TRADE('s', "Complex Order With Stock To Outright Series Order Floor Trade");

    private final char wire;

    private final String description;

    Series(char wire, String description) {
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
    public static Optional<Series> fromWire(char wire) {
        return switch (wire) {
            case 'a' -> Optional.of(CUBE);
            case 'c' -> Optional.of(OCC);
            case 'e' -> Optional.of(FLOOR_TRADE);
            case 'I' -> Optional.of(OTHER_OUTRIGHT_SERIES);
            case 'S' -> Optional.of(ISO_SWEEP);
            case 'D' -> Optional.of(AFTER_90_SECONDS);
            case 'f' -> Optional.of(OTHER_COMPLEX_ORDERS);
            case 'g' -> Optional.of(COMPLEX_CUBE);
            case 'H' -> Optional.of(COMPLEX_QCC_ORDER);
            case 'i' -> Optional.of(COMPLEX_FLOOR_ORDER);
            case 'j' -> Optional.of(COMPLEX_ORDER_TRADING_WITH_THE_OUTRIGHT_SERIES);
            case 'm' -> Optional.of(COMPLEX_ORDER_TO_OUTRIGHT_SERIES_ORDERFLOOR_TRADE);
            case 'p' -> Optional.of(COMPLEX_ORDER_WITH_STOCK_TO_COMPLEX_ORDER_WITH_STOCK_FLOOR_TRADE);
            case 's' -> Optional.of(COMPLEX_ORDER_WITH_STOCK_TO_OUTRIGHT_SERIES_ORDER_FLOOR_TRADE);
            default -> Optional.empty();
        };
    }
}
