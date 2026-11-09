package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Todo
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelReason {

    /**
     * Admin
     */
    ADMIN('A', "Admin"),

    /**
     * Duplicate Identifier
     */
    DUPLICATE_IDENTIFIER('D', "Duplicate Identifier"),

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Incorrect Data Center
     */
    INCORRECT_DATA_CENTER('I', "Incorrect Data Center"),

    /**
     * Too Late To Cancel
     */
    TOO_LATE_TO_CANCEL('J', "Too Late To Cancel"),

    /**
     * Order Rate Threshold Exceeded
     */
    ORDER_RATE_THRESHOLD_EXCEEDED('K', "Order Rate Threshold Exceeded"),

    /**
     * Order Would Lock Or Cross Nbbo
     */
    ORDER_WOULD_LOCK_OR_CROSS_NBBO('L', "Order Would Lock Or Cross Nbbo"),

    /**
     * Order Size Exceeded
     */
    ORDER_SIZE_EXCEEDED('M', "Order Size Exceeded"),

    /**
     * Ran Out Of Liquidity To Execute Against
     */
    RAN_OUT_OF_LIQUIDITY_TO_EXECUTE_AGAINST('N', "Ran Out Of Liquidity To Execute Against"),

    /**
     * Cl Ord Id Doesnt Match A Known Order
     */
    CL_ORD_ID_DOESNT_MATCH_A_KNOWN_ORDER('O', "Cl Ord Id Doesnt Match A Known Order"),

    /**
     * Cant Modify An Order That Is Pending Fill
     */
    CANT_MODIFY_AN_ORDER_THAT_IS_PENDING_FILL('P', "Cant Modify An Order That Is Pending Fill"),

    /**
     * Waiting For First Trade
     */
    WAITING_FOR_FIRST_TRADE('Q', "Waiting For First Trade"),

    /**
     * Routing Unavailable
     */
    ROUTING_UNAVAILABLE('R', "Routing Unavailable"),

    /**
     * Fill Would Trade Through The Nbbo
     */
    FILL_WOULD_TRADE_THROUGH_THE_NBBO('T', "Fill Would Trade Through The Nbbo"),

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
     * Only Close Transactions Accepted
     */
    ONLY_CLOSE_TRANSACTIONS_ACCEPTED('c', "Only Close Transactions Accepted"),

    /**
     * Risk Management Efid Or Custom Group Id Level
     */
    RISK_MANAGEMENT_EFID_OR_CUSTOM_GROUP_ID_LEVEL('f', "Risk Management Efid Or Custom Group Id Level"),

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
     * Risk Management Risk Root Level
     */
    RISK_MANAGEMENT_RISK_ROOT_LEVEL('s', "Risk Management Risk Root Level"),

    /**
     * Would Remove On Unslide
     */
    WOULD_REMOVE_ON_UNSLIDE('w', "Would Remove On Unslide"),

    /**
     * Crossed Market
     */
    CROSSED_MARKET('x', "Crossed Market"),

    /**
     * Order Received By Cboe During Replay
     */
    ORDER_RECEIVED_BY_CBOE_DURING_REPLAY('y', "Order Received By Cboe During Replay"),

    /**
     * Session End
     */
    SESSION_END('z', "Session End"),

    /**
     * Risk Management Efid Group Level
     */
    RISK_MANAGEMENT_EFID_GROUP_LEVEL('+', "Risk Management Efid Group Level");

    private final char wire;

    private final String description;

    CancelReason(char wire, String description) {
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
    public static Optional<CancelReason> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADMIN);
            case 'D' -> Optional.of(DUPLICATE_IDENTIFIER);
            case 'H' -> Optional.of(HALTED);
            case 'I' -> Optional.of(INCORRECT_DATA_CENTER);
            case 'J' -> Optional.of(TOO_LATE_TO_CANCEL);
            case 'K' -> Optional.of(ORDER_RATE_THRESHOLD_EXCEEDED);
            case 'L' -> Optional.of(ORDER_WOULD_LOCK_OR_CROSS_NBBO);
            case 'M' -> Optional.of(ORDER_SIZE_EXCEEDED);
            case 'N' -> Optional.of(RAN_OUT_OF_LIQUIDITY_TO_EXECUTE_AGAINST);
            case 'O' -> Optional.of(CL_ORD_ID_DOESNT_MATCH_A_KNOWN_ORDER);
            case 'P' -> Optional.of(CANT_MODIFY_AN_ORDER_THAT_IS_PENDING_FILL);
            case 'Q' -> Optional.of(WAITING_FOR_FIRST_TRADE);
            case 'R' -> Optional.of(ROUTING_UNAVAILABLE);
            case 'T' -> Optional.of(FILL_WOULD_TRADE_THROUGH_THE_NBBO);
            case 'U' -> Optional.of(USER_REQUESTED);
            case 'V' -> Optional.of(WOULD_WASH);
            case 'W' -> Optional.of(ADD_LIQUIDITY_ONLY_ORDER_WOULD_REMOVE);
            case 'X' -> Optional.of(ORDER_EXPIRED);
            case 'Y' -> Optional.of(SYMBOL_NOT_SUPPORTED);
            case 'Z' -> Optional.of(UNFORESEEN_REASON);
            case 'c' -> Optional.of(ONLY_CLOSE_TRANSACTIONS_ACCEPTED);
            case 'f' -> Optional.of(RISK_MANAGEMENT_EFID_OR_CUSTOM_GROUP_ID_LEVEL);
            case 'm' -> Optional.of(MARKET_ACCESS_RISK_LIMIT_EXCEEDED);
            case 'o' -> Optional.of(MAX_OPEN_ORDERS_COUNT_EXCEEDED);
            case 'r' -> Optional.of(RESERVE_RELOAD);
            case 's' -> Optional.of(RISK_MANAGEMENT_RISK_ROOT_LEVEL);
            case 'w' -> Optional.of(WOULD_REMOVE_ON_UNSLIDE);
            case 'x' -> Optional.of(CROSSED_MARKET);
            case 'y' -> Optional.of(ORDER_RECEIVED_BY_CBOE_DURING_REPLAY);
            case 'z' -> Optional.of(SESSION_END);
            case '+' -> Optional.of(RISK_MANAGEMENT_EFID_GROUP_LEVEL);
            default -> Optional.empty();
        };
    }
}
