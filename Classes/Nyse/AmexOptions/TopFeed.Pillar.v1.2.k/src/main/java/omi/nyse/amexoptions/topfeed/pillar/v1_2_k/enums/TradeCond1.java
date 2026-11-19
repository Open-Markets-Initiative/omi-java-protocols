package omi.nyse.amexoptions.topfeed.pillar.v1_2_k.enums;

import java.util.Optional;

/**
 * Settlement related conditions.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCond1 {

    /**
     * Outright Series Cube Order Trade
     */
    OUTRIGHT_SERIES_CUBE_ORDER_TRADE('a', "Outright Series Cube Order Trade"),

    /**
     * Outright Series Qcc Order Or Customer To Customer Cross Order
     */
    OUTRIGHT_SERIES_QCC_ORDER_OR_CUSTOMER_TO_CUSTOMER_CROSS_ORDER('c', "Outright Series Qcc Order Or Customer To Customer Cross Order"),

    /**
     * Outright Series Floor Trade
     */
    OUTRIGHT_SERIES_FLOOR_TRADE('e', "Outright Series Floor Trade"),

    /**
     * All Outright Series Electronic Trades
     */
    ALL_OUTRIGHT_SERIES_ELECTRONIC_TRADES('I', "All Outright Series Electronic Trades"),

    /**
     * Intermarket Sweep Order
     */
    INTERMARKET_SWEEP_ORDER('S', "Intermarket Sweep Order"),

    /**
     * Complex Order Trades Not Part Of Cubeqc Celectronic With Outright
     */
    COMPLEX_ORDER_TRADES_NOT_PART_OF_CUBEQC_CELECTRONIC_WITH_OUTRIGHT('f', "Complex Order Trades Not Part Of Cubeqc Celectronic With Outright"),

    /**
     * Complex Cube Order Trade
     */
    COMPLEX_CUBE_ORDER_TRADE('g', "Complex Cube Order Trade"),

    /**
     * Complex Qcc Order Or Customer To Customer Cross Order
     */
    COMPLEX_QCC_ORDER_OR_CUSTOMER_TO_CUSTOMER_CROSS_ORDER('h', "Complex Qcc Order Or Customer To Customer Cross Order"),

    /**
     * Complex Order To Complex Order Floor Trade
     */
    COMPLEX_ORDER_TO_COMPLEX_ORDER_FLOOR_TRADE('i', "Complex Order To Complex Order Floor Trade"),

    /**
     * Complex Order Trading Electronically With Outright Series
     */
    COMPLEX_ORDER_TRADING_ELECTRONICALLY_WITH_OUTRIGHT_SERIES('j', "Complex Order Trading Electronically With Outright Series"),

    /**
     * Complex Order To Outright Series Order Floor Trade
     */
    COMPLEX_ORDER_TO_OUTRIGHT_SERIES_ORDER_FLOOR_TRADE('m', "Complex Order To Outright Series Order Floor Trade"),

    /**
     * Complex Order With Stock To Complex Order With Stock Floor Trade
     */
    COMPLEX_ORDER_WITH_STOCK_TO_COMPLEX_ORDER_WITH_STOCK_FLOOR_TRADE('p', "Complex Order With Stock To Complex Order With Stock Floor Trade"),

    /**
     * Complex Order With Stock To Outright Series Order Floor Trade
     */
    COMPLEX_ORDER_WITH_STOCK_TO_OUTRIGHT_SERIES_ORDER_FLOOR_TRADE('s', "Complex Order With Stock To Outright Series Order Floor Trade"),

    /**
     * Extended Hours Trade
     */
    EXTENDED_HOURS_TRADE('v', "Extended Hours Trade"),

    /**
     * Late Report Of Opening Trade Correct Sequence
     */
    LATE_REPORT_OF_OPENING_TRADE_CORRECT_SEQUENCE('H', "Late Report Of Opening Trade Correct Sequence"),

    /**
     * Late Report Of Opening Trade Out Of Sequence
     */
    LATE_REPORT_OF_OPENING_TRADE_OUT_OF_SEQUENCE('F', "Late Report Of Opening Trade Out Of Sequence"),

    /**
     * Transaction Reported Late Correct Sequence
     */
    TRANSACTION_REPORTED_LATE_CORRECT_SEQUENCE('D', "Transaction Reported Late Correct Sequence"),

    /**
     * Transaction Reported Late Out Of Sequence
     */
    TRANSACTION_REPORTED_LATE_OUT_OF_SEQUENCE('B', "Transaction Reported Late Out Of Sequence");

    private final char wire;

    private final String description;

    TradeCond1(char wire, String description) {
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
    public static Optional<TradeCond1> fromWire(char wire) {
        return switch (wire) {
            case 'a' -> Optional.of(OUTRIGHT_SERIES_CUBE_ORDER_TRADE);
            case 'c' -> Optional.of(OUTRIGHT_SERIES_QCC_ORDER_OR_CUSTOMER_TO_CUSTOMER_CROSS_ORDER);
            case 'e' -> Optional.of(OUTRIGHT_SERIES_FLOOR_TRADE);
            case 'I' -> Optional.of(ALL_OUTRIGHT_SERIES_ELECTRONIC_TRADES);
            case 'S' -> Optional.of(INTERMARKET_SWEEP_ORDER);
            case 'f' -> Optional.of(COMPLEX_ORDER_TRADES_NOT_PART_OF_CUBEQC_CELECTRONIC_WITH_OUTRIGHT);
            case 'g' -> Optional.of(COMPLEX_CUBE_ORDER_TRADE);
            case 'h' -> Optional.of(COMPLEX_QCC_ORDER_OR_CUSTOMER_TO_CUSTOMER_CROSS_ORDER);
            case 'i' -> Optional.of(COMPLEX_ORDER_TO_COMPLEX_ORDER_FLOOR_TRADE);
            case 'j' -> Optional.of(COMPLEX_ORDER_TRADING_ELECTRONICALLY_WITH_OUTRIGHT_SERIES);
            case 'm' -> Optional.of(COMPLEX_ORDER_TO_OUTRIGHT_SERIES_ORDER_FLOOR_TRADE);
            case 'p' -> Optional.of(COMPLEX_ORDER_WITH_STOCK_TO_COMPLEX_ORDER_WITH_STOCK_FLOOR_TRADE);
            case 's' -> Optional.of(COMPLEX_ORDER_WITH_STOCK_TO_OUTRIGHT_SERIES_ORDER_FLOOR_TRADE);
            case 'v' -> Optional.of(EXTENDED_HOURS_TRADE);
            case 'H' -> Optional.of(LATE_REPORT_OF_OPENING_TRADE_CORRECT_SEQUENCE);
            case 'F' -> Optional.of(LATE_REPORT_OF_OPENING_TRADE_OUT_OF_SEQUENCE);
            case 'D' -> Optional.of(TRANSACTION_REPORTED_LATE_CORRECT_SEQUENCE);
            case 'B' -> Optional.of(TRANSACTION_REPORTED_LATE_OUT_OF_SEQUENCE);
            default -> Optional.empty();
        };
    }
}
