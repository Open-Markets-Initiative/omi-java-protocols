package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.enums;

import java.util.Optional;

/**
 * See Section 4.4 - Order Reason Codes
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ModifyRejectReason {

    /**
     * Most rejects due to field validation errors will be reported with a reason of Admin.
     */
    ADMIN('A', "Most rejects due to field validation errors will be reported with a reason of Admin."),

    /**
     * Duplicate ClOrdID detected. Note that Cboe Australia will not detect every possible occurrence of a duplicate by a participant.
     */
    DUPLICATE_IDENTIFIER_EG_CL_ORD_ID('D', "Duplicate ClOrdID detected. Note that Cboe Australia will not detect every possible occurrence of a duplicate by a participant."),

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Message directed to the DR data centre
     */
    INCORRECT_DATA_CENTRE('I', "Message directed to the DR data centre"),

    /**
     * Order Rate Threshold Exceeded
     */
    ORDER_RATE_THRESHOLD_EXCEEDED('K', "Order Rate Threshold Exceeded"),

    /**
     * Order Would Lock Or Cross Nbbo
     */
    ORDER_WOULD_LOCK_OR_CROSS_NBBO('L', "Order Would Lock Or Cross Nbbo"),

    /**
     * Cancel reason for the unexecuted size of an IOC/FOK order.
     */
    RAN_OUT_OF_LIQUIDITY_TO_EXECUTE_AGAINST('N', "Cancel reason for the unexecuted size of an IOC/FOK order."),

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
     * Cancellation of an expired GTD order
     */
    ORDER_EXPIRED('X', "Cancellation of an expired GTD order"),

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
     * Order Received By Cboe Australia During Replay
     */
    ORDER_RECEIVED_BY_CBOE_AUSTRALIA_DURING_REPLAY('y', "Order Received By Cboe Australia During Replay"),

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
            case 'D' -> Optional.of(DUPLICATE_IDENTIFIER_EG_CL_ORD_ID);
            case 'H' -> Optional.of(HALTED);
            case 'I' -> Optional.of(INCORRECT_DATA_CENTRE);
            case 'K' -> Optional.of(ORDER_RATE_THRESHOLD_EXCEEDED);
            case 'L' -> Optional.of(ORDER_WOULD_LOCK_OR_CROSS_NBBO);
            case 'N' -> Optional.of(RAN_OUT_OF_LIQUIDITY_TO_EXECUTE_AGAINST);
            case 'O' -> Optional.of(CL_ORD_ID_DOES_NOT_MATCH_A_KNOWN_ORDER);
            case 'U' -> Optional.of(USER_REQUESTED);
            case 'W' -> Optional.of(ADD_LIQUIDITY_ONLY_ORDER_WOULD_REMOVE);
            case 'X' -> Optional.of(ORDER_EXPIRED);
            case 'Y' -> Optional.of(SYMBOL_NOT_SUPPORTED);
            case 'Z' -> Optional.of(UNFORESEEN_REASON);
            case 'o' -> Optional.of(MAX_OPEN_ORDERS_COUNT_EXCEEDED);
            case 'y' -> Optional.of(ORDER_RECEIVED_BY_CBOE_AUSTRALIA_DURING_REPLAY);
            case 'z' -> Optional.of(SESSION_END);
            default -> Optional.empty();
        };
    }
}
