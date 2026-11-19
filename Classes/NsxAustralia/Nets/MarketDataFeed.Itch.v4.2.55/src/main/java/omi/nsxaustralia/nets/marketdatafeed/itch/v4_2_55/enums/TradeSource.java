package omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.enums;

import java.util.Optional;

/**
 * NSX source code (A-Z). Supplied only when TradeIndicator = B.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeSource {

    /**
     * Autotrade
     */
    AUTOTRADE('A', "Autotrade"),

    /**
     * Best Execution
     */
    BEST_EXECUTION('B', "Best Execution"),

    /**
     * Off Market Automatic Crossing
     */
    OFF_MARKET_AUTOMATIC_CROSSING('C', "Off Market Automatic Crossing"),

    /**
     * Directed Reporting Or Off Market Trades Crossing
     */
    DIRECTED_REPORTING_OR_OFF_MARKET_TRADES_CROSSING('D', "Directed Reporting Or Off Market Trades Crossing"),

    /**
     * Special Crossing Less Than A Marketable Parcel
     */
    SPECIAL_CROSSING_LESS_THAN_A_MARKETABLE_PARCEL_E('E', "Special Crossing Less Than A Marketable Parcel"),

    /**
     * Forward Delivery
     */
    FORWARD_DELIVERY('F', "Forward Delivery"),

    /**
     * Approved Index Crossing
     */
    APPROVED_INDEX_CROSSING('I', "Approved Index Crossing"),

    /**
     * Buy Back Sales
     */
    BUY_BACK_SALES('K', "Buy Back Sales"),

    /**
     * Marriage Crossing
     */
    MARRIAGE_CROSSING('M', "Marriage Crossing"),

    /**
     * Trades Including Crossings Outside Of Market Hours
     */
    TRADES_INCLUDING_CROSSINGS_OUTSIDE_OF_MARKET_HOURS('N', "Trades Including Crossings Outside Of Market Hours"),

    /**
     * Foreign Residents Or Recognised Overseas Exchange
     */
    FOREIGN_RESIDENTS_OR_RECOGNISED_OVERSEAS_EXCHANGE('O', "Foreign Residents Or Recognised Overseas Exchange"),

    /**
     * Block Special Crossing Or Loan Securities
     */
    BLOCK_SPECIAL_CROSSING_OR_LOAN_SECURITIES('P', "Block Special Crossing Or Loan Securities"),

    /**
     * Special Crossing Less Than A Marketable Parcel
     */
    SPECIAL_CROSSING_LESS_THAN_A_MARKETABLE_PARCEL_Q('Q', "Special Crossing Less Than A Marketable Parcel"),

    /**
     * Strategy
     */
    STRATEGY('R', "Strategy"),

    /**
     * Short Sales
     */
    SHORT_SALES('S', "Short Sales"),

    /**
     * For Foreign To Foreign Securities
     */
    FOR_FOREIGN_TO_FOREIGN_SECURITIES('U', "For Foreign To Foreign Securities"),

    /**
     * Book Value Switch Sales
     */
    BOOK_VALUE_SWITCH_SALES('V', "Book Value Switch Sales"),

    /**
     * Portfolio Special Crossing
     */
    PORTFOLIO_SPECIAL_CROSSING('X', "Portfolio Special Crossing"),

    /**
     * Special
     */
    SPECIAL('Y', "Special"),

    /**
     * Special Crossing Underwriting Disposal Or Exchange Approval
     */
    SPECIAL_CROSSING_UNDERWRITING_DISPOSAL_OR_EXCHANGE_APPROVAL('Z', "Special Crossing Underwriting Disposal Or Exchange Approval");

    private final char wire;

    private final String description;

    TradeSource(char wire, String description) {
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
    public static Optional<TradeSource> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AUTOTRADE);
            case 'B' -> Optional.of(BEST_EXECUTION);
            case 'C' -> Optional.of(OFF_MARKET_AUTOMATIC_CROSSING);
            case 'D' -> Optional.of(DIRECTED_REPORTING_OR_OFF_MARKET_TRADES_CROSSING);
            case 'E' -> Optional.of(SPECIAL_CROSSING_LESS_THAN_A_MARKETABLE_PARCEL_E);
            case 'F' -> Optional.of(FORWARD_DELIVERY);
            case 'I' -> Optional.of(APPROVED_INDEX_CROSSING);
            case 'K' -> Optional.of(BUY_BACK_SALES);
            case 'M' -> Optional.of(MARRIAGE_CROSSING);
            case 'N' -> Optional.of(TRADES_INCLUDING_CROSSINGS_OUTSIDE_OF_MARKET_HOURS);
            case 'O' -> Optional.of(FOREIGN_RESIDENTS_OR_RECOGNISED_OVERSEAS_EXCHANGE);
            case 'P' -> Optional.of(BLOCK_SPECIAL_CROSSING_OR_LOAN_SECURITIES);
            case 'Q' -> Optional.of(SPECIAL_CROSSING_LESS_THAN_A_MARKETABLE_PARCEL_Q);
            case 'R' -> Optional.of(STRATEGY);
            case 'S' -> Optional.of(SHORT_SALES);
            case 'U' -> Optional.of(FOR_FOREIGN_TO_FOREIGN_SECURITIES);
            case 'V' -> Optional.of(BOOK_VALUE_SWITCH_SALES);
            case 'X' -> Optional.of(PORTFOLIO_SPECIAL_CROSSING);
            case 'Y' -> Optional.of(SPECIAL);
            case 'Z' -> Optional.of(SPECIAL_CROSSING_UNDERWRITING_DISPOSAL_OR_EXCHANGE_APPROVAL);
            default -> Optional.empty();
        };
    }
}
