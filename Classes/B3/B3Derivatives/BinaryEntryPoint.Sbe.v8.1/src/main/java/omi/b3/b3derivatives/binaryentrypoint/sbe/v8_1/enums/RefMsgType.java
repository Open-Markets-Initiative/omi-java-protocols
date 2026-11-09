package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.enums;

import java.util.Optional;

/**
 * refMsgType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RefMsgType {

    /**
     * Negotiate
     */
    NEGOTIATE((short) 0, "Negotiate"),

    /**
     * NegotiateResponse
     */
    NEGOTIATE_RESPONSE((short) 1, "NegotiateResponse"),

    /**
     * NegotiateReject
     */
    NEGOTIATE_REJECT((short) 2, "NegotiateReject"),

    /**
     * Establish
     */
    ESTABLISH((short) 3, "Establish"),

    /**
     * EstablishAck
     */
    ESTABLISH_ACK((short) 4, "EstablishAck"),

    /**
     * EstablishReject
     */
    ESTABLISH_REJECT((short) 5, "EstablishReject"),

    /**
     * Terminate
     */
    TERMINATE((short) 6, "Terminate"),

    /**
     * NotApplied
     */
    NOT_APPLIED((short) 9, "NotApplied"),

    /**
     * RetransmitRequest
     */
    RETRANSMIT_REQUEST((short) 10, "RetransmitRequest"),

    /**
     * Retransmission
     */
    RETRANSMISSION((short) 11, "Retransmission"),

    /**
     * RetransmitReject
     */
    RETRANSMIT_REJECT((short) 12, "RetransmitReject"),

    /**
     * Sequence
     */
    SEQUENCE((short) 13, "Sequence"),

    /**
     * BusinessMessageReject
     */
    BUSINESS_MESSAGE_REJECT((short) 14, "BusinessMessageReject"),

    /**
     * SimpleNewOrder
     */
    SIMPLE_NEW_ORDER((short) 15, "SimpleNewOrder"),

    /**
     * SimpleModifyOrder
     */
    SIMPLE_MODIFY_ORDER((short) 16, "SimpleModifyOrder"),

    /**
     * NewOrderSingle
     */
    NEW_ORDER_SINGLE((short) 17, "NewOrderSingle"),

    /**
     * OrderCancelReplaceRequest
     */
    ORDER_CANCEL_REPLACE_REQUEST((short) 18, "OrderCancelReplaceRequest"),

    /**
     * OrderCancelRequest
     */
    ORDER_CANCEL_REQUEST((short) 19, "OrderCancelRequest"),

    /**
     * NewOrderCross
     */
    NEW_ORDER_CROSS((short) 20, "NewOrderCross"),

    /**
     * ExecutionReport_New
     */
    EXECUTION_REPORT_NEW((short) 21, "ExecutionReport_New"),

    /**
     * ExecutionReport_Modify
     */
    EXECUTION_REPORT_MODIFY((short) 22, "ExecutionReport_Modify"),

    /**
     * ExecutionReport_Cancel
     */
    EXECUTION_REPORT_CANCEL((short) 23, "ExecutionReport_Cancel"),

    /**
     * ExecutionReport_Trade
     */
    EXECUTION_REPORT_TRADE((short) 24, "ExecutionReport_Trade"),

    /**
     * ExecutionReport_Reject
     */
    EXECUTION_REPORT_REJECT((short) 25, "ExecutionReport_Reject"),

    /**
     * ExecutionReport_Forward
     */
    EXECUTION_REPORT_FORWARD((short) 26, "ExecutionReport_Forward"),

    /**
     * SecurityDefinitionRequest
     */
    SECURITY_DEFINITION_REQUEST((short) 27, "SecurityDefinitionRequest"),

    /**
     * SecurityDefinitionResponse
     */
    SECURITY_DEFINITION_RESPONSE((short) 28, "SecurityDefinitionResponse"),

    /**
     * OrderMassActionRequest
     */
    ORDER_MASS_ACTION_REQUEST((short) 29, "OrderMassActionRequest"),

    /**
     * OrderMassActionReport
     */
    ORDER_MASS_ACTION_REPORT((short) 30, "OrderMassActionReport"),

    /**
     * QuoteRequest
     */
    QUOTE_REQUEST((short) 31, "QuoteRequest"),

    /**
     * QuoteStatusReport
     */
    QUOTE_STATUS_REPORT((short) 32, "QuoteStatusReport"),

    /**
     * Quote
     */
    QUOTE((short) 33, "Quote"),

    /**
     * QuoteCancel
     */
    QUOTE_CANCEL((short) 34, "QuoteCancel"),

    /**
     * QuoteRequestReject
     */
    QUOTE_REQUEST_REJECT((short) 35, "QuoteRequestReject"),

    /**
     * PositionMaintenanceCancelRequest
     */
    POSITION_MAINTENANCE_CANCEL_REQUEST((short) 36, "PositionMaintenanceCancelRequest"),

    /**
     * PositionMaintenanceRequest
     */
    POSITION_MAINTENANCE_REQUEST((short) 37, "PositionMaintenanceRequest"),

    /**
     * PositionMaintenanceReport
     */
    POSITION_MAINTENANCE_REPORT((short) 38, "PositionMaintenanceReport"),

    /**
     * AllocationInstruction
     */
    ALLOCATION_INSTRUCTION((short) 39, "AllocationInstruction"),

    /**
     * AllocationReport
     */
    ALLOCATION_REPORT((short) 40, "AllocationReport");

    private final short wire;

    private final String description;

    RefMsgType(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<RefMsgType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NEGOTIATE);
            case 1 -> Optional.of(NEGOTIATE_RESPONSE);
            case 2 -> Optional.of(NEGOTIATE_REJECT);
            case 3 -> Optional.of(ESTABLISH);
            case 4 -> Optional.of(ESTABLISH_ACK);
            case 5 -> Optional.of(ESTABLISH_REJECT);
            case 6 -> Optional.of(TERMINATE);
            case 9 -> Optional.of(NOT_APPLIED);
            case 10 -> Optional.of(RETRANSMIT_REQUEST);
            case 11 -> Optional.of(RETRANSMISSION);
            case 12 -> Optional.of(RETRANSMIT_REJECT);
            case 13 -> Optional.of(SEQUENCE);
            case 14 -> Optional.of(BUSINESS_MESSAGE_REJECT);
            case 15 -> Optional.of(SIMPLE_NEW_ORDER);
            case 16 -> Optional.of(SIMPLE_MODIFY_ORDER);
            case 17 -> Optional.of(NEW_ORDER_SINGLE);
            case 18 -> Optional.of(ORDER_CANCEL_REPLACE_REQUEST);
            case 19 -> Optional.of(ORDER_CANCEL_REQUEST);
            case 20 -> Optional.of(NEW_ORDER_CROSS);
            case 21 -> Optional.of(EXECUTION_REPORT_NEW);
            case 22 -> Optional.of(EXECUTION_REPORT_MODIFY);
            case 23 -> Optional.of(EXECUTION_REPORT_CANCEL);
            case 24 -> Optional.of(EXECUTION_REPORT_TRADE);
            case 25 -> Optional.of(EXECUTION_REPORT_REJECT);
            case 26 -> Optional.of(EXECUTION_REPORT_FORWARD);
            case 27 -> Optional.of(SECURITY_DEFINITION_REQUEST);
            case 28 -> Optional.of(SECURITY_DEFINITION_RESPONSE);
            case 29 -> Optional.of(ORDER_MASS_ACTION_REQUEST);
            case 30 -> Optional.of(ORDER_MASS_ACTION_REPORT);
            case 31 -> Optional.of(QUOTE_REQUEST);
            case 32 -> Optional.of(QUOTE_STATUS_REPORT);
            case 33 -> Optional.of(QUOTE);
            case 34 -> Optional.of(QUOTE_CANCEL);
            case 35 -> Optional.of(QUOTE_REQUEST_REJECT);
            case 36 -> Optional.of(POSITION_MAINTENANCE_CANCEL_REQUEST);
            case 37 -> Optional.of(POSITION_MAINTENANCE_REQUEST);
            case 38 -> Optional.of(POSITION_MAINTENANCE_REPORT);
            case 39 -> Optional.of(ALLOCATION_INSTRUCTION);
            case 40 -> Optional.of(ALLOCATION_REPORT);
            default -> Optional.empty();
        };
    }
}
