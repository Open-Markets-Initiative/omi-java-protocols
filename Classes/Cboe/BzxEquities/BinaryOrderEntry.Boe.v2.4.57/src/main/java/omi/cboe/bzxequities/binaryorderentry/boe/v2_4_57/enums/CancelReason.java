package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

import java.util.Optional;

/**
 * Reason for the order cancellation. See Reason Codes for a list of possible reasons.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelReason {

    /**
     * Admin
     */
    ADMIN('A', "Admin"),

    /**
     * Capacity undefined
     */
    CAPACITY_UNDEFINED('C', "Capacity undefined"),

    /**
     * Duplicate identifier (e.g., ClOrdID)
     */
    DUPLICATE_IDENTIFIER('D', "Duplicate identifier (e.g., ClOrdID)"),

    /**
     * Size reduction due to SWP restatement
     */
    SIZE_REDUCTION_DUE_TO_SWP_RESTATEMENT('E', "Size reduction due to SWP restatement"),

    /**
     * Failed to quote
     */
    FAILED_TO_QUOTE('F', "Failed to quote"),

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Incorrect data center
     */
    INCORRECT_DATA_CENTER('I', "Incorrect data center"),

    /**
     * Too late to cancel
     */
    TOO_LATE_TO_CANCEL('J', "Too late to cancel"),

    /**
     * Order rate threshold exceeded
     */
    ORDER_RATE_THRESHOLD_EXCEEDED('K', "Order rate threshold exceeded"),

    /**
     * Order would lock or cross NBBO
     */
    ORDER_WOULD_LOCK_OR_CROSS_NBBO('L', "Order would lock or cross NBBO"),

    /**
     * Order size exceeded
     */
    ORDER_SIZE_EXCEEDED('M', "Order size exceeded"),

    /**
     * Ran out of liquidity to execute against
     */
    RAN_OUT_OF_LIQUIDITY_TO_EXECUTE_AGAINST('N', "Ran out of liquidity to execute against"),

    /**
     * ClOrdID doesn't match a known order
     */
    CL_ORD_ID_DOESNT_MATCH_A_KNOWN_ORDER('O', "ClOrdID doesn't match a known order"),

    /**
     * Can't modify an order that is pending fill
     */
    CANT_MODIFY_AN_ORDER_THAT_IS_PENDING_FILL('P', "Can't modify an order that is pending fill"),

    /**
     * Waiting for first trade
     */
    WAITING_FOR_FIRST_TRADE('Q', "Waiting for first trade"),

    /**
     * Routing Unavailable
     */
    ROUTING_UNAVAILABLE('R', "Routing Unavailable"),

    /**
     * Short sale price violation
     */
    SHORT_SALE_PRICE_VIOLATION('S', "Short sale price violation"),

    /**
     * Fill would trade through the NBBO
     */
    FILL_WOULD_TRADE_THROUGH_THE_NBBO('T', "Fill would trade through the NBBO"),

    /**
     * User requested
     */
    USER_REQUESTED('U', "User requested"),

    /**
     * Would wash
     */
    WOULD_WASH('V', "Would wash"),

    /**
     * Add liquidity only order would remove
     */
    ADD_LIQUIDITY_ONLY_ORDER_WOULD_REMOVE('W', "Add liquidity only order would remove"),

    /**
     * Order expired
     */
    ORDER_EXPIRED('X', "Order expired"),

    /**
     * Symbol not supported
     */
    SYMBOL_NOT_SUPPORTED('Y', "Symbol not supported"),

    /**
     * Unforeseen reason
     */
    UNFORESEEN_REASON('Z', "Unforeseen reason"),

    /**
     * Risk management MPID or RiskGroupID level
     */
    RISK_MANAGEMENT_MPID_OR_RISK_GROUP_ID_LEVEL('f', "Risk management MPID or RiskGroupID level"),

    /**
     * Market access risk limit exceeded
     */
    MARKET_ACCESS_RISK_LIMIT_EXCEEDED('m', "Market access risk limit exceeded"),

    /**
     * Max open orders count exceeded
     */
    MAX_OPEN_ORDERS_COUNT_EXCEEDED('o', "Max open orders count exceeded"),

    /**
     * Reserve reload
     */
    RESERVE_RELOAD('r', "Reserve reload"),

    /**
     * Risk management symbol level
     */
    RISK_MANAGEMENT_SYMBOL_LEVEL('s', "Risk management symbol level"),

    /**
     * Limit Up Limit Down (LULD)
     */
    LIMIT_UP_LIMIT_DOWN('u', "Limit Up Limit Down (LULD)"),

    /**
     * Would remove on unslide
     */
    WOULD_REMOVE_ON_UNSLIDE('w', "Would remove on unslide"),

    /**
     * Crossed market
     */
    CROSSED_MARKET('x', "Crossed market"),

    /**
     * Order received by Cboe during replay
     */
    ORDER_RECEIVED_BY_CBOE_DURING_REPLAY('y', "Order received by Cboe during replay");

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
            case 'C' -> Optional.of(CAPACITY_UNDEFINED);
            case 'D' -> Optional.of(DUPLICATE_IDENTIFIER);
            case 'E' -> Optional.of(SIZE_REDUCTION_DUE_TO_SWP_RESTATEMENT);
            case 'F' -> Optional.of(FAILED_TO_QUOTE);
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
            case 'S' -> Optional.of(SHORT_SALE_PRICE_VIOLATION);
            case 'T' -> Optional.of(FILL_WOULD_TRADE_THROUGH_THE_NBBO);
            case 'U' -> Optional.of(USER_REQUESTED);
            case 'V' -> Optional.of(WOULD_WASH);
            case 'W' -> Optional.of(ADD_LIQUIDITY_ONLY_ORDER_WOULD_REMOVE);
            case 'X' -> Optional.of(ORDER_EXPIRED);
            case 'Y' -> Optional.of(SYMBOL_NOT_SUPPORTED);
            case 'Z' -> Optional.of(UNFORESEEN_REASON);
            case 'f' -> Optional.of(RISK_MANAGEMENT_MPID_OR_RISK_GROUP_ID_LEVEL);
            case 'm' -> Optional.of(MARKET_ACCESS_RISK_LIMIT_EXCEEDED);
            case 'o' -> Optional.of(MAX_OPEN_ORDERS_COUNT_EXCEEDED);
            case 'r' -> Optional.of(RESERVE_RELOAD);
            case 's' -> Optional.of(RISK_MANAGEMENT_SYMBOL_LEVEL);
            case 'u' -> Optional.of(LIMIT_UP_LIMIT_DOWN);
            case 'w' -> Optional.of(WOULD_REMOVE_ON_UNSLIDE);
            case 'x' -> Optional.of(CROSSED_MARKET);
            case 'y' -> Optional.of(ORDER_RECEIVED_BY_CBOE_DURING_REPLAY);
            default -> Optional.empty();
        };
    }
}
