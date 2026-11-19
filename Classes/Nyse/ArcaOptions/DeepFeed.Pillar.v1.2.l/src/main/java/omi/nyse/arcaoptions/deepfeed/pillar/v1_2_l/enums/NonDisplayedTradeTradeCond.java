package omi.nyse.arcaoptions.deepfeed.pillar.v1_2_l.enums;

import java.util.Optional;

/**
 * Settlement related conditions.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NonDisplayedTradeTradeCond {

    /**
     * Outright Series Orderquote Trading Electronically With A Outright Series Cube Order Or Outright Series Cube Order Trading Electronically With Outright Series Cube Contra Order
     */
    OUTRIGHT_SERIES_ORDERQUOTE_TRADING_ELECTRONICALLY_WITH_A_OUTRIGHT_SERIES_CUBE_ORDER_OR_OUTRIGHT_SERIES_CUBE_ORDER_TRADING_ELECTRONICALLY_WITH_OUTRIGHT_SERIES_CUBE_CONTRA_ORDER('a', "Outright Series Orderquote Trading Electronically With A Outright Series Cube Order Or Outright Series Cube Order Trading Electronically With Outright Series Cube Contra Order"),

    /**
     * Trading Of An Outright Series Qcc Order Or Customer To Customer Cross Order
     */
    TRADING_OF_AN_OUTRIGHT_SERIES_QCC_ORDER_OR_CUSTOMER_TO_CUSTOMER_CROSS_ORDER('c', "Trading Of An Outright Series Qcc Order Or Customer To Customer Cross Order"),

    /**
     * Outright Series Floor Trade
     */
    OUTRIGHT_SERIES_FLOOR_TRADE('e', "Outright Series Floor Trade"),

    /**
     * All Outright Series Electronic Trades Excluding Away Market Executions That Were Not Part Of Certain Transactions
     */
    ALL_OUTRIGHT_SERIES_ELECTRONIC_TRADES_EXCLUDING_AWAY_MARKET_EXECUTIONS_THAT_WERE_NOT_PART_OF_CERTAIN_TRANSACTIONS('I', "All Outright Series Electronic Trades Excluding Away Market Executions That Were Not Part Of Certain Transactions"),

    /**
     * All Outright Series Trades Generated As Part Of An Intermarket Sweep Order
     */
    ALL_OUTRIGHT_SERIES_TRADES_GENERATED_AS_PART_OF_AN_INTERMARKET_SWEEP_ORDER('S', "All Outright Series Trades Generated As Part Of An Intermarket Sweep Order"),

    /**
     * Transaction Is Being Reported Late But Is In The Correct Sequence
     */
    TRANSACTION_IS_BEING_REPORTED_LATE_BUT_IS_IN_THE_CORRECT_SEQUENCE('D', "Transaction Is Being Reported Late But Is In The Correct Sequence"),

    /**
     * Complex Order Trades That Were Not Part Of Certain Transactions
     */
    COMPLEX_ORDER_TRADES_THAT_WERE_NOT_PART_OF_CERTAIN_TRANSACTIONS('f', "Complex Order Trades That Were Not Part Of Certain Transactions"),

    /**
     * Complex Order Trading Electronically With A Complex Cube Order Or Complex Cube Order Trading Electronically With Complex Cube Contra Order
     */
    COMPLEX_ORDER_TRADING_ELECTRONICALLY_WITH_A_COMPLEX_CUBE_ORDER_OR_COMPLEX_CUBE_ORDER_TRADING_ELECTRONICALLY_WITH_COMPLEX_CUBE_CONTRA_ORDER('g', "Complex Order Trading Electronically With A Complex Cube Order Or Complex Cube Order Trading Electronically With Complex Cube Contra Order"),

    /**
     * Trading Of A Complex Qcc Order Or Customer To Customer Cross Order
     */
    TRADING_OF_A_COMPLEX_QCC_ORDER_OR_CUSTOMER_TO_CUSTOMER_CROSS_ORDER('h', "Trading Of A Complex Qcc Order Or Customer To Customer Cross Order"),

    /**
     * Complex Order To Complex Order Floor Trade
     */
    COMPLEX_ORDER_TO_COMPLEX_ORDER_FLOOR_TRADE('i', "Complex Order To Complex Order Floor Trade"),

    /**
     * Complex Order Trading Electronically With The Outright Series Ordersquotes
     */
    COMPLEX_ORDER_TRADING_ELECTRONICALLY_WITH_THE_OUTRIGHT_SERIES_ORDERSQUOTES('j', "Complex Order Trading Electronically With The Outright Series Ordersquotes"),

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
     * Late Report Of The Opening Trade In The Correct Sequence
     */
    LATE_REPORT_OF_THE_OPENING_TRADE_IN_THE_CORRECT_SEQUENCE('H', "Late Report Of The Opening Trade In The Correct Sequence"),

    /**
     * Late Report Of The Opening Trade Out Of Sequence
     */
    LATE_REPORT_OF_THE_OPENING_TRADE_OUT_OF_SEQUENCE('F', "Late Report Of The Opening Trade Out Of Sequence"),

    /**
     * Transaction Is Being Reported Late And Is Out Of Sequence
     */
    TRANSACTION_IS_BEING_REPORTED_LATE_AND_IS_OUT_OF_SEQUENCE('B', "Transaction Is Being Reported Late And Is Out Of Sequence");

    private final char wire;

    private final String description;

    NonDisplayedTradeTradeCond(char wire, String description) {
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
    public static Optional<NonDisplayedTradeTradeCond> fromWire(char wire) {
        return switch (wire) {
            case 'a' -> Optional.of(OUTRIGHT_SERIES_ORDERQUOTE_TRADING_ELECTRONICALLY_WITH_A_OUTRIGHT_SERIES_CUBE_ORDER_OR_OUTRIGHT_SERIES_CUBE_ORDER_TRADING_ELECTRONICALLY_WITH_OUTRIGHT_SERIES_CUBE_CONTRA_ORDER);
            case 'c' -> Optional.of(TRADING_OF_AN_OUTRIGHT_SERIES_QCC_ORDER_OR_CUSTOMER_TO_CUSTOMER_CROSS_ORDER);
            case 'e' -> Optional.of(OUTRIGHT_SERIES_FLOOR_TRADE);
            case 'I' -> Optional.of(ALL_OUTRIGHT_SERIES_ELECTRONIC_TRADES_EXCLUDING_AWAY_MARKET_EXECUTIONS_THAT_WERE_NOT_PART_OF_CERTAIN_TRANSACTIONS);
            case 'S' -> Optional.of(ALL_OUTRIGHT_SERIES_TRADES_GENERATED_AS_PART_OF_AN_INTERMARKET_SWEEP_ORDER);
            case 'D' -> Optional.of(TRANSACTION_IS_BEING_REPORTED_LATE_BUT_IS_IN_THE_CORRECT_SEQUENCE);
            case 'f' -> Optional.of(COMPLEX_ORDER_TRADES_THAT_WERE_NOT_PART_OF_CERTAIN_TRANSACTIONS);
            case 'g' -> Optional.of(COMPLEX_ORDER_TRADING_ELECTRONICALLY_WITH_A_COMPLEX_CUBE_ORDER_OR_COMPLEX_CUBE_ORDER_TRADING_ELECTRONICALLY_WITH_COMPLEX_CUBE_CONTRA_ORDER);
            case 'h' -> Optional.of(TRADING_OF_A_COMPLEX_QCC_ORDER_OR_CUSTOMER_TO_CUSTOMER_CROSS_ORDER);
            case 'i' -> Optional.of(COMPLEX_ORDER_TO_COMPLEX_ORDER_FLOOR_TRADE);
            case 'j' -> Optional.of(COMPLEX_ORDER_TRADING_ELECTRONICALLY_WITH_THE_OUTRIGHT_SERIES_ORDERSQUOTES);
            case 'm' -> Optional.of(COMPLEX_ORDER_TO_OUTRIGHT_SERIES_ORDER_FLOOR_TRADE);
            case 'p' -> Optional.of(COMPLEX_ORDER_WITH_STOCK_TO_COMPLEX_ORDER_WITH_STOCK_FLOOR_TRADE);
            case 's' -> Optional.of(COMPLEX_ORDER_WITH_STOCK_TO_OUTRIGHT_SERIES_ORDER_FLOOR_TRADE);
            case 'H' -> Optional.of(LATE_REPORT_OF_THE_OPENING_TRADE_IN_THE_CORRECT_SEQUENCE);
            case 'F' -> Optional.of(LATE_REPORT_OF_THE_OPENING_TRADE_OUT_OF_SEQUENCE);
            case 'B' -> Optional.of(TRANSACTION_IS_BEING_REPORTED_LATE_AND_IS_OUT_OF_SEQUENCE);
            default -> Optional.empty();
        };
    }
}
