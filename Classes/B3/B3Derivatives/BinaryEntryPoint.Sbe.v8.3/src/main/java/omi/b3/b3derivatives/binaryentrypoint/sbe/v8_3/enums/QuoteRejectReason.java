package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.enums;

import java.util.Optional;

/**
 * quoteRejectReason
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteRejectReason {

    /**
     * quoteRejectReason
     */
    NO_VALUE(0x0L, "quoteRejectReason"),

    /**
     * Technical Error Function Not Performed
     */
    TECHNICAL_ERROR_FUNCTION_NOT_PERFORMED(0x270FL, "Technical Error Function Not Performed"),

    /**
     * Exercise Price Not Allowed
     */
    EXERCISE_PRICE_NOT_ALLOWED(0x1F46L, "Exercise Price Not Allowed"),

    /**
     * No Positions Blocked
     */
    NO_POSITIONS_BLOCKED(0x1F47L, "No Positions Blocked"),

    /**
     * Quantity Doesnt Match With The Original Request Quantity On Original Request Quantity On Original Request
     */
    QUANTITY_DOESNT_MATCH_WITH_THE_ORIGINAL_REQUEST_QUANTITY_ON_ORIGINAL_REQUEST_QUANTITY_ON_ORIGINAL_REQUEST(0x1F48L, "Quantity Doesnt Match With The Original Request Quantity On Original Request Quantity On Original Request"),

    /**
     * Exercise Must Be On Maturity Date
     */
    EXERCISE_MUST_BE_ON_MATURITY_DATE(0x1F4BL, "Exercise Must Be On Maturity Date"),

    /**
     * Function Not Available This Time
     */
    FUNCTION_NOT_AVAILABLE_THIS_TIME(0x1F4EL, "Function Not Available This Time"),

    /**
     * Blocking Quantity More Than 999999999
     */
    BLOCKING_QUANTITY_MORE_THAN_999999999(0x1F4FL, "Blocking Quantity More Than 999999999"),

    /**
     * Trade Does Not Belong To The Specified Firm Firm Id Xxx
     */
    TRADE_DOES_NOT_BELONG_TO_THE_SPECIFIED_FIRM_FIRM_ID_XXX(0x1F54L, "Trade Does Not Belong To The Specified Firm Firm Id Xxx"),

    /**
     * Blocking Qty More Than Available Quantity
     */
    BLOCKING_QTY_MORE_THAN_AVAILABLE_QUANTITY(0x1F55L, "Blocking Qty More Than Available Quantity"),

    /**
     * There Arent Positions Available To Exercise
     */
    THERE_ARENT_POSITIONS_AVAILABLE_TO_EXERCISE(0x1F56L, "There Arent Positions Available To Exercise"),

    /**
     * Total Qty Must Be The Sum Of All Alloc Qty
     */
    TOTAL_QTY_MUST_BE_THE_SUM_OF_ALL_ALLOCQTY(0x1F57L, "Total Qty Must Be The Sum Of All Alloc Qty"),

    /**
     * Trade Already Cancelled Or Does Not Exist Trade Id Xxx
     */
    TRADE_ALREADY_CANCELLED_OR_DOES_NOT_EXIST_TRADE_ID_XXX(0x1F58L, "Trade Already Cancelled Or Does Not Exist Trade Id Xxx"),

    /**
     * Available Quantity To Block Is Zero
     */
    AVAILABLE_QUANTITY_TO_BLOCK_IS_ZERO(0x1F5BL, "Available Quantity To Block Is Zero"),

    /**
     * Invalid Operation For Contract Type
     */
    INVALID_OPERATION_FOR_CONTRACT_TYPE(0x1F5CL, "Invalid Operation For Contract Type"),

    /**
     * Function Closed Or Suspended
     */
    FUNCTION_CLOSED_OR_SUSPENDED(0x1F64L, "Function Closed Or Suspended"),

    /**
     * Exercise Price Outside Required Moneyness
     */
    EXERCISE_PRICE_OUTSIDE_REQUIRED_MONEYNESS(0x1F67L, "Exercise Price Outside Required Moneyness"),

    /**
     * Invalid Exercise Request Id To Cancel
     */
    INVALID_EXERCISE_REQUEST_ID_TO_CANCEL(0x1F68L, "Invalid Exercise Request Id To Cancel"),

    /**
     * Invalid Blocking Id To Unblock
     */
    INVALID_BLOCKING_ID_TO_UNBLOCK(0x1F7BL, "Invalid Blocking Id To Unblock"),

    /**
     * Invalid Quantity To Unblock
     */
    INVALID_QUANTITY_TO_UNBLOCK(0x1F7EL, "Invalid Quantity To Unblock"),

    /**
     * On Behalf Operation Not Allowed During Ccr Recovery
     */
    ON_BEHALF_OPERATION_NOT_ALLOWED_DURING_CCR_RECOVERY(0x1F7FL, "On Behalf Operation Not Allowed During Ccr Recovery"),

    /**
     * Problem Parsing Incoming Message
     */
    PROBLEM_PARSING_INCOMING_MESSAGE(0x1F81L, "Problem Parsing Incoming Message"),

    /**
     * Exercise Quantity Should Be Greater Than Zero
     */
    EXERCISE_QUANTITY_SHOULD_BE_GREATER_THAN_ZERO(0x1F82L, "Exercise Quantity Should Be Greater Than Zero"),

    /**
     * Contrary Exercise Already Registered For This Position
     */
    CONTRARY_EXERCISE_ALREADY_REGISTERED_FOR_THIS_POSITION(0x1F85L, "Contrary Exercise Already Registered For This Position"),

    /**
     * In The Money Contract Allows Contrary Exercise To Not Exercise Automatically Only
     */
    INTHEMONEY_CONTRACT_ALLOWS_CONTRARY_EXERCISE_TO_NOT_EXERCISE_AUTOMATICALLY_ONLY(0x1F86L, "In The Money Contract Allows Contrary Exercise To Not Exercise Automatically Only"),

    /**
     * At Out The Money Contract Allows Contrary Exercise To Exercise Automatically Only
     */
    ATOUTTHEMONEY_CONTRACT_ALLOWS_CONTRARY_EXERCISE_TO_EXERCISE_AUTOMATICALLY_ONLY(0x1F87L, "At Out The Money Contract Allows Contrary Exercise To Exercise Automatically Only"),

    /**
     * Dma Is Not Allowed To Request Contrary Exercise
     */
    DMA_IS_NOT_ALLOWED_TO_REQUEST_CONTRARY_EXERCISE(0x1F88L, "Dma Is Not Allowed To Request Contrary Exercise"),

    /**
     * Contrary Exercises Can Only Be Requested By Default Link Or Position Owner With Direct Access On Absence Of Default Link
     */
    CONTRARY_EXERCISES_CAN_ONLY_BE_REQUESTED_BY_DEFAULT_LINK_OR_POSITION_OWNER_WITH_DIRECT_ACCESS_ON_ABSENCE_OF_DEFAULT_LINK(0x1F89L, "Contrary Exercises Can Only Be Requested By Default Link Or Position Owner With Direct Access On Absence Of Default Link"),

    /**
     * Contrary Exercise Invalid Operation
     */
    CONTRARY_EXERCISE_INVALID_OPERATION(0x1F8AL, "Contrary Exercise Invalid Operation"),

    /**
     * Threshold Must Not Be Informed
     */
    THRESHOLD_MUST_NOT_BE_INFORMED(0x1F8BL, "Threshold Must Not Be Informed");

    private final long wire;

    private final String description;

    QuoteRejectReason(long wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public long wire() {
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
    public static Optional<QuoteRejectReason> fromWire(long wire) {
        if (wire == 0L) {
            return Optional.of(NO_VALUE);
        }
        if (wire == 9999L) {
            return Optional.of(TECHNICAL_ERROR_FUNCTION_NOT_PERFORMED);
        }
        if (wire == 8006L) {
            return Optional.of(EXERCISE_PRICE_NOT_ALLOWED);
        }
        if (wire == 8007L) {
            return Optional.of(NO_POSITIONS_BLOCKED);
        }
        if (wire == 8008L) {
            return Optional.of(QUANTITY_DOESNT_MATCH_WITH_THE_ORIGINAL_REQUEST_QUANTITY_ON_ORIGINAL_REQUEST_QUANTITY_ON_ORIGINAL_REQUEST);
        }
        if (wire == 8011L) {
            return Optional.of(EXERCISE_MUST_BE_ON_MATURITY_DATE);
        }
        if (wire == 8014L) {
            return Optional.of(FUNCTION_NOT_AVAILABLE_THIS_TIME);
        }
        if (wire == 8015L) {
            return Optional.of(BLOCKING_QUANTITY_MORE_THAN_999999999);
        }
        if (wire == 8020L) {
            return Optional.of(TRADE_DOES_NOT_BELONG_TO_THE_SPECIFIED_FIRM_FIRM_ID_XXX);
        }
        if (wire == 8021L) {
            return Optional.of(BLOCKING_QTY_MORE_THAN_AVAILABLE_QUANTITY);
        }
        if (wire == 8022L) {
            return Optional.of(THERE_ARENT_POSITIONS_AVAILABLE_TO_EXERCISE);
        }
        if (wire == 8023L) {
            return Optional.of(TOTAL_QTY_MUST_BE_THE_SUM_OF_ALL_ALLOCQTY);
        }
        if (wire == 8024L) {
            return Optional.of(TRADE_ALREADY_CANCELLED_OR_DOES_NOT_EXIST_TRADE_ID_XXX);
        }
        if (wire == 8027L) {
            return Optional.of(AVAILABLE_QUANTITY_TO_BLOCK_IS_ZERO);
        }
        if (wire == 8028L) {
            return Optional.of(INVALID_OPERATION_FOR_CONTRACT_TYPE);
        }
        if (wire == 8036L) {
            return Optional.of(FUNCTION_CLOSED_OR_SUSPENDED);
        }
        if (wire == 8039L) {
            return Optional.of(EXERCISE_PRICE_OUTSIDE_REQUIRED_MONEYNESS);
        }
        if (wire == 8040L) {
            return Optional.of(INVALID_EXERCISE_REQUEST_ID_TO_CANCEL);
        }
        if (wire == 8059L) {
            return Optional.of(INVALID_BLOCKING_ID_TO_UNBLOCK);
        }
        if (wire == 8062L) {
            return Optional.of(INVALID_QUANTITY_TO_UNBLOCK);
        }
        if (wire == 8063L) {
            return Optional.of(ON_BEHALF_OPERATION_NOT_ALLOWED_DURING_CCR_RECOVERY);
        }
        if (wire == 8065L) {
            return Optional.of(PROBLEM_PARSING_INCOMING_MESSAGE);
        }
        if (wire == 8066L) {
            return Optional.of(EXERCISE_QUANTITY_SHOULD_BE_GREATER_THAN_ZERO);
        }
        if (wire == 8069L) {
            return Optional.of(CONTRARY_EXERCISE_ALREADY_REGISTERED_FOR_THIS_POSITION);
        }
        if (wire == 8070L) {
            return Optional.of(INTHEMONEY_CONTRACT_ALLOWS_CONTRARY_EXERCISE_TO_NOT_EXERCISE_AUTOMATICALLY_ONLY);
        }
        if (wire == 8071L) {
            return Optional.of(ATOUTTHEMONEY_CONTRACT_ALLOWS_CONTRARY_EXERCISE_TO_EXERCISE_AUTOMATICALLY_ONLY);
        }
        if (wire == 8072L) {
            return Optional.of(DMA_IS_NOT_ALLOWED_TO_REQUEST_CONTRARY_EXERCISE);
        }
        if (wire == 8073L) {
            return Optional.of(CONTRARY_EXERCISES_CAN_ONLY_BE_REQUESTED_BY_DEFAULT_LINK_OR_POSITION_OWNER_WITH_DIRECT_ACCESS_ON_ABSENCE_OF_DEFAULT_LINK);
        }
        if (wire == 8074L) {
            return Optional.of(CONTRARY_EXERCISE_INVALID_OPERATION);
        }
        if (wire == 8075L) {
            return Optional.of(THRESHOLD_MUST_NOT_BE_INFORMED);
        }
        return Optional.empty();
    }
}
