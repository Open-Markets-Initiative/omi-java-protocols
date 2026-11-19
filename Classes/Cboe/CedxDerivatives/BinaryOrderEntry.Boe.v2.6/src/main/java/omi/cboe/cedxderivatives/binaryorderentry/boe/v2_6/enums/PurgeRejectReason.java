package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.enums;

import java.util.Optional;

/**
 * Reason for a purge rejection. See Reason Codes (§ 7.1, p. 172) for a list of possible reasons.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PurgeRejectReason {

    /**
     * Admin
     */
    ADMIN('A', "Admin"),

    /**
     * Duplicate Identifier (e.g., ClOrdID)
     */
    DUPLICATE_IDENTIFIER('D', "Duplicate Identifier (e.g., ClOrdID)"),

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Incorrect Data Center
     */
    INCORRECT_DATA_CENTER('I', "Incorrect Data Center"),

    /**
     * Too late to cancel
     */
    TOO_LATE_TO_CANCEL('J', "Too late to cancel"),

    /**
     * Order Rate Threshold Exceeded
     */
    ORDER_RATE_THRESHOLD_EXCEEDED('K', "Order Rate Threshold Exceeded"),

    /**
     * Price Exceeds Cross Range
     */
    PRICE_EXCEEDS_CROSS_RANGE('L', "Price Exceeds Cross Range"),

    /**
     * Liquidity Available Exceeds Order Size
     */
    LIQUIDITY_AVAILABLE_EXCEEDS_ORDER_SIZE('M', "Liquidity Available Exceeds Order Size"),

    /**
     * Ran Out of Liquidity to Execute Against
     */
    RAN_OUT_OF_LIQUIDITY_TO_EXECUTE_AGAINST('N', "Ran Out of Liquidity to Execute Against"),

    /**
     * ClOrdID Doesn’t Match a Known Order
     */
    CL_ORD_ID_DOESNT_MATCH_A_KNOWN_ORDER('O', "ClOrdID Doesn\u2019t Match a Known Order"),

    /**
     * Can’t Modify an Order That is Pending Fill
     */
    CANT_MODIFY_AN_ORDER_THAT_IS_PENDING_FILL('P', "Can\u2019t Modify an Order That is Pending Fill"),

    /**
     * Waiting For First Trade
     */
    WAITING_FOR_FIRST_TRADE('Q', "Waiting For First Trade"),

    /**
     * User Requested
     */
    USER_REQUESTED('U', "User Requested"),

    /**
     * Would Wash
     */
    WOULD_WASH('V', "Would Wash"),

    /**
     * Add Liquidity Only Order Would Remove
     */
    ADD_LIQUIDITY_ONLY_ORDER_WOULD_REMOVE('W', "Add Liquidity Only Order Would Remove"),

    /**
     * Order Expired
     */
    ORDER_EXPIRED('X', "Order Expired"),

    /**
     * Symbol Not Supported
     */
    SYMBOL_NOT_SUPPORTED('Y', "Symbol Not Supported"),

    /**
     * Unforeseen Reason
     */
    UNFORESEEN_REASON('Z', "Unforeseen Reason"),

    /**
     * Risk Management Trading Firm Level
     */
    RISK_MANAGEMENT_TRADING_FIRM_LEVEL('f', "Risk Management Trading Firm Level"),

    /**
     * Market Access Risk Limit Exceeded
     */
    MARKET_ACCESS_RISK_LIMIT_EXCEEDED('m', "Market Access Risk Limit Exceeded"),

    /**
     * Max Open Orders Count Exceeded
     */
    MAX_OPEN_ORDERS_COUNT_EXCEEDED('o', "Max Open Orders Count Exceeded"),

    /**
     * Reserve Reload
     */
    RESERVE_RELOAD('r', "Reserve Reload"),

    /**
     * Risk Management Symbol Level
     */
    RISK_MANAGEMENT_SYMBOL_LEVEL('s', "Risk Management Symbol Level"),

    /**
     * Crossed Market
     */
    CROSSED_MARKET('x', "Crossed Market"),

    /**
     * Order Received by Cboe During Replay
     */
    ORDER_RECEIVED_BY_CBOE_DURING_REPLAY('y', "Order Received by Cboe During Replay"),

    /**
     * Risk Management Trading Firm Group Level
     */
    RISK_MANAGEMENT_TRADING_FIRM_GROUP_LEVEL('+', "Risk Management Trading Firm Group Level");

    private final char wire;

    private final String description;

    PurgeRejectReason(char wire, String description) {
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
    public static Optional<PurgeRejectReason> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADMIN);
            case 'D' -> Optional.of(DUPLICATE_IDENTIFIER);
            case 'H' -> Optional.of(HALTED);
            case 'I' -> Optional.of(INCORRECT_DATA_CENTER);
            case 'J' -> Optional.of(TOO_LATE_TO_CANCEL);
            case 'K' -> Optional.of(ORDER_RATE_THRESHOLD_EXCEEDED);
            case 'L' -> Optional.of(PRICE_EXCEEDS_CROSS_RANGE);
            case 'M' -> Optional.of(LIQUIDITY_AVAILABLE_EXCEEDS_ORDER_SIZE);
            case 'N' -> Optional.of(RAN_OUT_OF_LIQUIDITY_TO_EXECUTE_AGAINST);
            case 'O' -> Optional.of(CL_ORD_ID_DOESNT_MATCH_A_KNOWN_ORDER);
            case 'P' -> Optional.of(CANT_MODIFY_AN_ORDER_THAT_IS_PENDING_FILL);
            case 'Q' -> Optional.of(WAITING_FOR_FIRST_TRADE);
            case 'U' -> Optional.of(USER_REQUESTED);
            case 'V' -> Optional.of(WOULD_WASH);
            case 'W' -> Optional.of(ADD_LIQUIDITY_ONLY_ORDER_WOULD_REMOVE);
            case 'X' -> Optional.of(ORDER_EXPIRED);
            case 'Y' -> Optional.of(SYMBOL_NOT_SUPPORTED);
            case 'Z' -> Optional.of(UNFORESEEN_REASON);
            case 'f' -> Optional.of(RISK_MANAGEMENT_TRADING_FIRM_LEVEL);
            case 'm' -> Optional.of(MARKET_ACCESS_RISK_LIMIT_EXCEEDED);
            case 'o' -> Optional.of(MAX_OPEN_ORDERS_COUNT_EXCEEDED);
            case 'r' -> Optional.of(RESERVE_RELOAD);
            case 's' -> Optional.of(RISK_MANAGEMENT_SYMBOL_LEVEL);
            case 'x' -> Optional.of(CROSSED_MARKET);
            case 'y' -> Optional.of(ORDER_RECEIVED_BY_CBOE_DURING_REPLAY);
            case '+' -> Optional.of(RISK_MANAGEMENT_TRADING_FIRM_GROUP_LEVEL);
            default -> Optional.empty();
        };
    }
}
