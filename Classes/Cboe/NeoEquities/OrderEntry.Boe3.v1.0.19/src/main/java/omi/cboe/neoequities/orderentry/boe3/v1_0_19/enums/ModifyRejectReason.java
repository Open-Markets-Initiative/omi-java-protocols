package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * Reason code for the rejection of a Modify Order message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ModifyRejectReason {

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
     * Order Rate Threshold Exceeded
     */
    ORDER_RATE_THRESHOLD_EXCEEDED('K', "Order Rate Threshold Exceeded"),

    /**
     * Order Would Cross Or Lock Nbbo
     */
    ORDER_WOULD_CROSS_OR_LOCK_NBBO('L', "Order Would Cross Or Lock Nbbo"),

    /**
     * Ran Out Of Liquidity
     */
    RAN_OUT_OF_LIQUIDITY('N', "Ran Out Of Liquidity"),

    /**
     * Cl Ord Id Does Not Match A Known Order
     */
    CL_ORD_ID_DOES_NOT_MATCH_A_KNOWN_ORDER('O', "Cl Ord Id Does Not Match A Known Order"),

    /**
     * User Requested
     */
    USER_REQUESTED('U', "User Requested"),

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
     * Max Open Orders Count Exceeded
     */
    MAX_OPEN_ORDERS_COUNT_EXCEEDED('o', "Max Open Orders Count Exceeded"),

    /**
     * Circuit Breaker Threshold Breach Limit Up Down
     */
    CIRCUIT_BREAKER_THRESHOLD_BREACH_LIMIT_UP_DOWN('u', "Circuit Breaker Threshold Breach Limit Up Down"),

    /**
     * Order Received By Cboe Canada During Replay
     */
    ORDER_RECEIVED_BY_CBOE_CANADA_DURING_REPLAY('y', "Order Received By Cboe Canada During Replay"),

    /**
     * Session End
     */
    SESSION_END('z', "Session End");

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
            case 'D' -> Optional.of(DUPLICATE_IDENTIFIER);
            case 'H' -> Optional.of(HALTED);
            case 'I' -> Optional.of(INCORRECT_DATA_CENTER);
            case 'K' -> Optional.of(ORDER_RATE_THRESHOLD_EXCEEDED);
            case 'L' -> Optional.of(ORDER_WOULD_CROSS_OR_LOCK_NBBO);
            case 'N' -> Optional.of(RAN_OUT_OF_LIQUIDITY);
            case 'O' -> Optional.of(CL_ORD_ID_DOES_NOT_MATCH_A_KNOWN_ORDER);
            case 'U' -> Optional.of(USER_REQUESTED);
            case 'W' -> Optional.of(ADD_LIQUIDITY_ONLY_ORDER_WOULD_REMOVE);
            case 'X' -> Optional.of(ORDER_EXPIRED);
            case 'Y' -> Optional.of(SYMBOL_NOT_SUPPORTED);
            case 'Z' -> Optional.of(UNFORESEEN_REASON);
            case 'o' -> Optional.of(MAX_OPEN_ORDERS_COUNT_EXCEEDED);
            case 'u' -> Optional.of(CIRCUIT_BREAKER_THRESHOLD_BREACH_LIMIT_UP_DOWN);
            case 'y' -> Optional.of(ORDER_RECEIVED_BY_CBOE_CANADA_DURING_REPLAY);
            case 'z' -> Optional.of(SESSION_END);
            default -> Optional.empty();
        };
    }
}
