package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Cancel reject reason
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelRejectReason {

    /**
     * Admin
     */
    ADMIN('A', "Admin"),

    /**
     * Unknown Maturity Date
     */
    UNKNOWN_MATURITY_DATE('B', "Unknown Maturity Date"),

    /**
     * Unknown Product Name
     */
    UNKNOWN_PRODUCT_NAME('C', "Unknown Product Name"),

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
     * Order Rate Threshold Exceeded
     */
    ORDER_RATE_THRESHOLD_EXCEEDED('K', "Order Rate Threshold Exceeded"),

    /**
     * Liquidity Available Exceeds Order Size
     */
    LIQUIDITY_AVAILABLE_EXCEEDS_ORDER_SIZE('M', "Liquidity Available Exceeds Order Size"),

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
     * User Requested
     */
    USER_REQUESTED('U', "User Requested"),

    /**
     * Would Wash
     */
    WOULD_WASH('V', "Would Wash"),

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
     * Order Persisted
     */
    ORDER_PERSISTED('h', "Order Persisted"),

    /**
     * Risk Management Mpid Or Custom Group Id Level
     */
    RISK_MANAGEMENT_MPID_OR_CUSTOM_GROUP_ID_LEVEL('f', "Risk Management Mpid Or Custom Group Id Level"),

    /**
     * Market Access Risk Limit Exceeded
     */
    MARKET_ACCESS_RISK_LIMIT_EXCEEDED('m', "Market Access Risk Limit Exceeded"),

    /**
     * Risk Management Configuration Is Insufficient
     */
    RISK_MANAGEMENT_CONFIGURATION_IS_INSUFFICIENT('n', "Risk Management Configuration Is Insufficient"),

    /**
     * Max Open Orders Count Exceeded
     */
    MAX_OPEN_ORDERS_COUNT_EXCEEDED('o', "Max Open Orders Count Exceeded"),

    /**
     * Risk Management Product Level
     */
    RISK_MANAGEMENT_PRODUCT_LEVEL('s', "Risk Management Product Level"),

    /**
     * Order Received By Cfe During Replay
     */
    ORDER_RECEIVED_BY_CFE_DURING_REPLAY('y', "Order Received By Cfe During Replay"),

    /**
     * Session End
     */
    SESSION_END('z', "Session End");

    private final char wire;

    private final String description;

    CancelRejectReason(char wire, String description) {
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
    public static Optional<CancelRejectReason> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADMIN);
            case 'B' -> Optional.of(UNKNOWN_MATURITY_DATE);
            case 'C' -> Optional.of(UNKNOWN_PRODUCT_NAME);
            case 'D' -> Optional.of(DUPLICATE_IDENTIFIER);
            case 'H' -> Optional.of(HALTED);
            case 'I' -> Optional.of(INCORRECT_DATA_CENTER);
            case 'K' -> Optional.of(ORDER_RATE_THRESHOLD_EXCEEDED);
            case 'M' -> Optional.of(LIQUIDITY_AVAILABLE_EXCEEDS_ORDER_SIZE);
            case 'N' -> Optional.of(RAN_OUT_OF_LIQUIDITY_TO_EXECUTE_AGAINST);
            case 'O' -> Optional.of(CL_ORD_ID_DOESNT_MATCH_A_KNOWN_ORDER);
            case 'P' -> Optional.of(CANT_MODIFY_AN_ORDER_THAT_IS_PENDING_FILL);
            case 'U' -> Optional.of(USER_REQUESTED);
            case 'V' -> Optional.of(WOULD_WASH);
            case 'X' -> Optional.of(ORDER_EXPIRED);
            case 'Y' -> Optional.of(SYMBOL_NOT_SUPPORTED);
            case 'Z' -> Optional.of(UNFORESEEN_REASON);
            case 'c' -> Optional.of(ONLY_CLOSE_TRANSACTIONS_ACCEPTED);
            case 'h' -> Optional.of(ORDER_PERSISTED);
            case 'f' -> Optional.of(RISK_MANAGEMENT_MPID_OR_CUSTOM_GROUP_ID_LEVEL);
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
