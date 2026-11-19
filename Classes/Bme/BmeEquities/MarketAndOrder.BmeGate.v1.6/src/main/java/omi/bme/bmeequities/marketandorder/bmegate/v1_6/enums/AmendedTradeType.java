package omi.bme.bmeequities.marketandorder.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Trade type of the amended/cancelled trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AmendedTradeType {

    /**
     * Market
     */
    MARKET('M', "Market"),

    /**
     * Cancellation
     */
    CANCELLATION('X', "Cancellation"),

    /**
     * Trade Amendment
     */
    TRADE_AMENDMENT('T', "Trade Amendment"),

    /**
     * Block Trade
     */
    BLOCK_TRADE('H', "Block Trade"),

    /**
     * Communicated Application
     */
    COMMUNICATED_APPLICATION('1', "Communicated Application"),

    /**
     * Authorised Application Trades
     */
    AUTHORISED_APPLICATION_TRADES('2', "Authorised Application Trades"),

    /**
     * Authorised Application Corporate Interest
     */
    AUTHORISED_APPLICATION_CORPORATE_INTEREST('3', "Authorised Application Corporate Interest"),

    /**
     * Authorised Application Execution Of Contracts
     */
    AUTHORISED_APPLICATION_EXECUTION_OF_CONTRACTS('4', "Authorised Application Execution Of Contracts"),

    /**
     * Authorised Application Other Causes
     */
    AUTHORISED_APPLICATION_OTHER_CAUSES('5', "Authorised Application Other Causes"),

    /**
     * Validation Communicated
     */
    VALIDATION_COMMUNICATED('6', "Validation Communicated"),

    /**
     * Authorised validation (trades)
     */
    AUTHORISED_VALIDATION_TRADES('7', "Authorised validation (trades)"),

    /**
     * Authorised validation (corporate interest)
     */
    AUTHORISED_VALIDATION_CORPORATE_INTEREST('8', "Authorised validation (corporate interest)"),

    /**
     * Authorised validation (execution of contracts)
     */
    AUTHORISED_VALIDATION_EXECUTION_OF_CONTRACTS('9', "Authorised validation (execution of contracts)"),

    /**
     * Authorised validation (other causes)
     */
    AUTHORISED_VALIDATION_OTHER_CAUSES('0', "Authorised validation (other causes)"),

    /**
     * Transaction between members (communicated)
     */
    TRANSACTION_BETWEEN_MEMBERS_COMMUNICATED('A', "Transaction between members (communicated)"),

    /**
     * Transaction between members (trades)
     */
    TRANSACTION_BETWEEN_MEMBERS_TRADES('B', "Transaction between members (trades)"),

    /**
     * Transaction between members (corporate interest)
     */
    TRANSACTION_BETWEEN_MEMBERS_CORPORATE_INTEREST('C', "Transaction between members (corporate interest)"),

    /**
     * Transaction between members (execution of contracts)
     */
    TRANSACTION_BETWEEN_MEMBERS_EXECUTION_OF_CONTRACTS('F', "Transaction between members (execution of contracts)"),

    /**
     * Transaction between members (other causes)
     */
    TRANSACTION_BETWEEN_MEMBERS_OTHER_CAUSES('G', "Transaction between members (other causes)"),

    /**
     * Application to cater for a linked position
     */
    APPLICATION_TO_CATER_FOR_A_LINKED_POSITION('I', "Application to cater for a linked position"),

    /**
     * Transaction to cater for a linked position
     */
    TRANSACTION_TO_CATER_FOR_A_LINKED_POSITION('J', "Transaction to cater for a linked position"),

    /**
     * Transaction of exercise of options
     */
    TRANSACTION_OF_EXERCISE_OF_OPTIONS('E', "Transaction of exercise of options"),

    /**
     * Public share bid offer type transaction
     */
    PUBLIC_SHARE_BID_OFFER_TYPE_TRANSACTION('N', "Public share bid offer type transaction"),

    /**
     * Public share Ask offer type transaction
     */
    PUBLIC_SHARE_ASK_OFFER_TYPE_TRANSACTION('O', "Public share Ask offer type transaction"),

    /**
     * Public share subscription offer type transaction
     */
    PUBLIC_SHARE_SUBSCRIPTION_OFFER_TYPE_TRANSACTION('P', "Public share subscription offer type transaction"),

    /**
     * Special trades delta type
     */
    SPECIAL_TRADES_DELTA_TYPE('L', "Special trades delta type"),

    /**
     * Net asset value special trade D+1
     */
    NET_ASSET_VALUE_SPECIAL_TRADE_D_PLUS_1('a', "Net asset value special trade D+1"),

    /**
     * Net asset value special trade D+2
     */
    NET_ASSET_VALUE_SPECIAL_TRADE_D_PLUS_2('b', "Net asset value special trade D+2"),

    /**
     * Net asset value special trade D+3
     */
    NET_ASSET_VALUE_SPECIAL_TRADE_D_PLUS_3('c', "Net asset value special trade D+3"),

    /**
     * Application (without CCP)
     */
    APPLICATION_WITHOUT_CCP('D', "Application (without CCP)"),

    /**
     * Transaction (without CCP)
     */
    TRANSACTION_WITHOUT_CCP('K', "Transaction (without CCP)"),

    /**
     * Investment Fund D + 1
     */
    INVESTMENT_FUND_D_PLUS_1('d', "Investment Fund D + 1"),

    /**
     * Investment Fund D + 2
     */
    INVESTMENT_FUND_D_PLUS_2('e', "Investment Fund D + 2"),

    /**
     * Investment Fund D + 3
     */
    INVESTMENT_FUND_D_PLUS_3('f', "Investment Fund D + 3"),

    /**
     * VWAP
     */
    VWAP('W', "VWAP");

    private final char wire;

    private final String description;

    AmendedTradeType(char wire, String description) {
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
    public static Optional<AmendedTradeType> fromWire(char wire) {
        return switch (wire) {
            case 'M' -> Optional.of(MARKET);
            case 'X' -> Optional.of(CANCELLATION);
            case 'T' -> Optional.of(TRADE_AMENDMENT);
            case 'H' -> Optional.of(BLOCK_TRADE);
            case '1' -> Optional.of(COMMUNICATED_APPLICATION);
            case '2' -> Optional.of(AUTHORISED_APPLICATION_TRADES);
            case '3' -> Optional.of(AUTHORISED_APPLICATION_CORPORATE_INTEREST);
            case '4' -> Optional.of(AUTHORISED_APPLICATION_EXECUTION_OF_CONTRACTS);
            case '5' -> Optional.of(AUTHORISED_APPLICATION_OTHER_CAUSES);
            case '6' -> Optional.of(VALIDATION_COMMUNICATED);
            case '7' -> Optional.of(AUTHORISED_VALIDATION_TRADES);
            case '8' -> Optional.of(AUTHORISED_VALIDATION_CORPORATE_INTEREST);
            case '9' -> Optional.of(AUTHORISED_VALIDATION_EXECUTION_OF_CONTRACTS);
            case '0' -> Optional.of(AUTHORISED_VALIDATION_OTHER_CAUSES);
            case 'A' -> Optional.of(TRANSACTION_BETWEEN_MEMBERS_COMMUNICATED);
            case 'B' -> Optional.of(TRANSACTION_BETWEEN_MEMBERS_TRADES);
            case 'C' -> Optional.of(TRANSACTION_BETWEEN_MEMBERS_CORPORATE_INTEREST);
            case 'F' -> Optional.of(TRANSACTION_BETWEEN_MEMBERS_EXECUTION_OF_CONTRACTS);
            case 'G' -> Optional.of(TRANSACTION_BETWEEN_MEMBERS_OTHER_CAUSES);
            case 'I' -> Optional.of(APPLICATION_TO_CATER_FOR_A_LINKED_POSITION);
            case 'J' -> Optional.of(TRANSACTION_TO_CATER_FOR_A_LINKED_POSITION);
            case 'E' -> Optional.of(TRANSACTION_OF_EXERCISE_OF_OPTIONS);
            case 'N' -> Optional.of(PUBLIC_SHARE_BID_OFFER_TYPE_TRANSACTION);
            case 'O' -> Optional.of(PUBLIC_SHARE_ASK_OFFER_TYPE_TRANSACTION);
            case 'P' -> Optional.of(PUBLIC_SHARE_SUBSCRIPTION_OFFER_TYPE_TRANSACTION);
            case 'L' -> Optional.of(SPECIAL_TRADES_DELTA_TYPE);
            case 'a' -> Optional.of(NET_ASSET_VALUE_SPECIAL_TRADE_D_PLUS_1);
            case 'b' -> Optional.of(NET_ASSET_VALUE_SPECIAL_TRADE_D_PLUS_2);
            case 'c' -> Optional.of(NET_ASSET_VALUE_SPECIAL_TRADE_D_PLUS_3);
            case 'D' -> Optional.of(APPLICATION_WITHOUT_CCP);
            case 'K' -> Optional.of(TRANSACTION_WITHOUT_CCP);
            case 'd' -> Optional.of(INVESTMENT_FUND_D_PLUS_1);
            case 'e' -> Optional.of(INVESTMENT_FUND_D_PLUS_2);
            case 'f' -> Optional.of(INVESTMENT_FUND_D_PLUS_3);
            case 'W' -> Optional.of(VWAP);
            default -> Optional.empty();
        };
    }
}
