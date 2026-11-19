package omi.cboe.c1options.complextop.spin.v1_1_54.enums;

import java.util.Optional;

/**
 * See Options Trade Condition Codes for details.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCondition {

    /**
     * Complex To Complex Electronic Trade Cboe Auction Type Is Coa
     */
    COMPLEX_TO_COMPLEX_ELECTRONIC_TRADE_CBOE_AUCTION_TYPE_IS_COA('f', "Complex To Complex Electronic Trade Cboe Auction Type Is Coa"),

    /**
     * Complex Auction Trade Cboe Order Types Include C Aim C Sam
     */
    COMPLEX_AUCTION_TRADE_CBOE_ORDER_TYPES_INCLUDE_C_AIM_C_SAM('g', "Complex Auction Trade Cboe Order Types Include C Aim C Sam"),

    /**
     * Complex Cross Cboe Auction Types Include Cust To Cust C Aim C Qcc
     */
    COMPLEX_CROSS_CBOE_AUCTION_TYPES_INCLUDE_CUST_TO_CUST_C_AIM_C_QCC('h', "Complex Cross Cboe Auction Types Include Cust To Cust C Aim C Qcc"),

    /**
     * Complex Electronic Trade Against Single Legs
     */
    COMPLEX_ELECTRONIC_TRADE_AGAINST_SINGLE_LEGS('j', "Complex Electronic Trade Against Single Legs"),

    /**
     * Complex With Stock Options Auction Trade Cboe Auction Types Include C Aim W Stock C Sam W Stock
     */
    COMPLEX_WITH_STOCK_OPTIONS_AUCTION_TRADE_CBOE_AUCTION_TYPES_INCLUDE_C_AIM_W_STOCK_C_SAM_W_STOCK('k', "Complex With Stock Options Auction Trade Cboe Auction Types Include C Aim W Stock C Sam W Stock"),

    /**
     * Complex Floor Trade Against Single Legs All Complex Floor Executions Are Reported As Condition M
     */
    COMPLEX_FLOOR_TRADE_AGAINST_SINGLE_LEGS_ALL_COMPLEX_FLOOR_EXECUTIONS_ARE_REPORTED_AS_CONDITION_M('m', "Complex Floor Trade Against Single Legs All Complex Floor Executions Are Reported As Condition M"),

    /**
     * Complex With Stock Electronic Trade Includes Coa Auctions Done Electronically
     */
    COMPLEX_WITH_STOCK_ELECTRONIC_TRADE_INCLUDES_COA_AUCTIONS_DONE_ELECTRONICALLY('n', "Complex With Stock Electronic Trade Includes Coa Auctions Done Electronically"),

    /**
     * Complex With Stock Cross Cboe Auction Types Include C Qcc W Stock
     */
    COMPLEX_WITH_STOCK_CROSS_CBOE_AUCTION_TYPES_INCLUDE_C_QCC_W_STOCK('o', "Complex With Stock Cross Cboe Auction Types Include C Qcc W Stock"),

    /**
     * Complex With Stock Floor Trade
     */
    COMPLEX_WITH_STOCK_FLOOR_TRADE('p', "Complex With Stock Floor Trade"),

    /**
     * Complex Floor Trade Of Proprietary Products Marked As Combo Order
     */
    COMPLEX_FLOOR_TRADE_OF_PROPRIETARY_PRODUCTS_MARKED_AS_COMBO_ORDER('t', "Complex Floor Trade Of Proprietary Products Marked As Combo Order"),

    /**
     * Extended Hours Trade Transaction Represents A Trade Executed During The Curb Session
     */
    EXTENDED_HOURS_TRADE_TRANSACTION_REPRESENTS_A_TRADE_EXECUTED_DURING_THE_CURB_SESSION('v', "Extended Hours Trade Transaction Represents A Trade Executed During The Curb Session"),

    /**
     * Electronic Trade
     */
    ELECTRONIC_TRADE('I', "Electronic Trade"),

    /**
     * Opening Trade
     */
    OPENING_TRADE('O', "Opening Trade");

    private final char wire;

    private final String description;

    TradeCondition(char wire, String description) {
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
    public static Optional<TradeCondition> fromWire(char wire) {
        return switch (wire) {
            case 'f' -> Optional.of(COMPLEX_TO_COMPLEX_ELECTRONIC_TRADE_CBOE_AUCTION_TYPE_IS_COA);
            case 'g' -> Optional.of(COMPLEX_AUCTION_TRADE_CBOE_ORDER_TYPES_INCLUDE_C_AIM_C_SAM);
            case 'h' -> Optional.of(COMPLEX_CROSS_CBOE_AUCTION_TYPES_INCLUDE_CUST_TO_CUST_C_AIM_C_QCC);
            case 'j' -> Optional.of(COMPLEX_ELECTRONIC_TRADE_AGAINST_SINGLE_LEGS);
            case 'k' -> Optional.of(COMPLEX_WITH_STOCK_OPTIONS_AUCTION_TRADE_CBOE_AUCTION_TYPES_INCLUDE_C_AIM_W_STOCK_C_SAM_W_STOCK);
            case 'm' -> Optional.of(COMPLEX_FLOOR_TRADE_AGAINST_SINGLE_LEGS_ALL_COMPLEX_FLOOR_EXECUTIONS_ARE_REPORTED_AS_CONDITION_M);
            case 'n' -> Optional.of(COMPLEX_WITH_STOCK_ELECTRONIC_TRADE_INCLUDES_COA_AUCTIONS_DONE_ELECTRONICALLY);
            case 'o' -> Optional.of(COMPLEX_WITH_STOCK_CROSS_CBOE_AUCTION_TYPES_INCLUDE_C_QCC_W_STOCK);
            case 'p' -> Optional.of(COMPLEX_WITH_STOCK_FLOOR_TRADE);
            case 't' -> Optional.of(COMPLEX_FLOOR_TRADE_OF_PROPRIETARY_PRODUCTS_MARKED_AS_COMBO_ORDER);
            case 'v' -> Optional.of(EXTENDED_HOURS_TRADE_TRANSACTION_REPRESENTS_A_TRADE_EXECUTED_DURING_THE_CURB_SESSION);
            case 'I' -> Optional.of(ELECTRONIC_TRADE);
            case 'O' -> Optional.of(OPENING_TRADE);
            default -> Optional.empty();
        };
    }
}
