package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.enums;

import java.util.Optional;

/**
 * Reason for a modify rejection. See ‘Section 8 – Reason Codes’ for a list of possible reasons.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ModifyRejectReason {

    /**
     * Admin
     */
    ADMIN('A', "Admin"),

    /**
     * Unknown maturity date
     */
    UNKNOWN_MATURITY_DATE('B', "Unknown maturity date"),

    /**
     * Unknown product name
     */
    UNKNOWN_PRODUCT_NAME('C', "Unknown product name"),

    /**
     * Duplicate identifier (e.g., ClOrdID)
     */
    DUPLICATE_IDENTIFIER('D', "Duplicate identifier (e.g., ClOrdID)"),

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
     * Liquidity available exceeds order size
     */
    LIQUIDITY_AVAILABLE_EXCEEDS_ORDER_SIZE('M', "Liquidity available exceeds order size"),

    /**
     * Ran out of liquidity to execute against
     */
    RAN_OUT_OF_LIQUIDITY_TO_EXECUTE_AGAINST('N', "Ran out of liquidity to execute against"),

    /**
     * ClOrdID doesn’t match a known order
     */
    CL_ORD_ID_DOESNT_MATCH_A_KNOWN_ORDER('O', "ClOrdID doesn\u2019t match a known order"),

    /**
     * can’t modify an order that is pending
     */
    CANT_MODIFY_AN_ORDER_THAT_IS_PENDING('P', "can\u2019t modify an order that is pending"),

    /**
     * User requested
     */
    USER_REQUESTED('U', "User requested"),

    /**
     * Would wash
     */
    WOULD_WASH('V', "Would wash"),

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
     * Order persisted
     */
    ORDER_PERSISTED('h', "Order persisted"),

    /**
     * Risk management EFID level or custom group ID level
     */
    RISK_MANAGEMENT_EFID_LEVEL_OR_CUSTOM_GROUP_ID_LEVEL('f', "Risk management EFID level or custom group ID level"),

    /**
     * Market access risk limit exceeded
     */
    MARKET_ACCESS_RISK_LIMIT_EXCEEDED('m', "Market access risk limit exceeded"),

    /**
     * Risk management configuration is insufficient
     */
    RISK_MANAGEMENT_CONFIGURATION_IS_INSUFFICIENT('n', "Risk management configuration is insufficient"),

    /**
     * Max open orders count exceeded
     */
    MAX_OPEN_ORDERS_COUNT_EXCEEDED('o', "Max open orders count exceeded"),

    /**
     * Risk management product level
     */
    RISK_MANAGEMENT_PRODUCT_LEVEL('s', "Risk management product level"),

    /**
     * Order received by CFE during replay
     */
    ORDER_RECEIVED_BY_CFE_DURING_REPLAY('y', "Order received by CFE during replay"),

    /**
     * Session end
     */
    SESSION_END('z', "Session end");

    private final char wire;

    private final String description;

    ModifyRejectReason(char wire, String description) {
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
    public static Optional<ModifyRejectReason> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADMIN);
            case 'B' -> Optional.of(UNKNOWN_MATURITY_DATE);
            case 'C' -> Optional.of(UNKNOWN_PRODUCT_NAME);
            case 'D' -> Optional.of(DUPLICATE_IDENTIFIER);
            case 'H' -> Optional.of(HALTED);
            case 'I' -> Optional.of(INCORRECT_DATA_CENTER);
            case 'J' -> Optional.of(TOO_LATE_TO_CANCEL);
            case 'K' -> Optional.of(ORDER_RATE_THRESHOLD_EXCEEDED);
            case 'M' -> Optional.of(LIQUIDITY_AVAILABLE_EXCEEDS_ORDER_SIZE);
            case 'N' -> Optional.of(RAN_OUT_OF_LIQUIDITY_TO_EXECUTE_AGAINST);
            case 'O' -> Optional.of(CL_ORD_ID_DOESNT_MATCH_A_KNOWN_ORDER);
            case 'P' -> Optional.of(CANT_MODIFY_AN_ORDER_THAT_IS_PENDING);
            case 'U' -> Optional.of(USER_REQUESTED);
            case 'V' -> Optional.of(WOULD_WASH);
            case 'X' -> Optional.of(ORDER_EXPIRED);
            case 'Y' -> Optional.of(SYMBOL_NOT_SUPPORTED);
            case 'Z' -> Optional.of(UNFORESEEN_REASON);
            case 'h' -> Optional.of(ORDER_PERSISTED);
            case 'f' -> Optional.of(RISK_MANAGEMENT_EFID_LEVEL_OR_CUSTOM_GROUP_ID_LEVEL);
            case 'm' -> Optional.of(MARKET_ACCESS_RISK_LIMIT_EXCEEDED);
            case 'n' -> Optional.of(RISK_MANAGEMENT_CONFIGURATION_IS_INSUFFICIENT);
            case 'o' -> Optional.of(MAX_OPEN_ORDERS_COUNT_EXCEEDED);
            case 's' -> Optional.of(RISK_MANAGEMENT_PRODUCT_LEVEL);
            case 'y' -> Optional.of(ORDER_RECEIVED_BY_CFE_DURING_REPLAY);
            case 'z' -> Optional.of(SESSION_END);
            default -> Optional.empty();
        };
    }
}
