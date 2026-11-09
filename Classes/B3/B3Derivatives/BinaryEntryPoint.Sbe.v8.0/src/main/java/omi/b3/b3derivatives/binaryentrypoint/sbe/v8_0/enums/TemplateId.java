package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * Template ID used to encode the message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * NegotiateMessage
     */
    NEGOTIATE_MESSAGE(1, "NegotiateMessage"),

    /**
     * NegotiateResponseMessage
     */
    NEGOTIATE_RESPONSE_MESSAGE(2, "NegotiateResponseMessage"),

    /**
     * NegotiateRejectMessage
     */
    NEGOTIATE_REJECT_MESSAGE(3, "NegotiateRejectMessage"),

    /**
     * EstablishMessage
     */
    ESTABLISH_MESSAGE(4, "EstablishMessage"),

    /**
     * EstablishAckMessage
     */
    ESTABLISH_ACK_MESSAGE(5, "EstablishAckMessage"),

    /**
     * EstablishRejectMessage
     */
    ESTABLISH_REJECT_MESSAGE(6, "EstablishRejectMessage"),

    /**
     * TerminateMessage
     */
    TERMINATE_MESSAGE(7, "TerminateMessage"),

    /**
     * NotAppliedMessage
     */
    NOT_APPLIED_MESSAGE(8, "NotAppliedMessage"),

    /**
     * SequenceMessage
     */
    SEQUENCE_MESSAGE(9, "SequenceMessage"),

    /**
     * RetransmitRequestMessage
     */
    RETRANSMIT_REQUEST_MESSAGE(12, "RetransmitRequestMessage"),

    /**
     * RetransmissionMessage
     */
    RETRANSMISSION_MESSAGE(13, "RetransmissionMessage"),

    /**
     * RetransmitRejectMessage
     */
    RETRANSMIT_REJECT_MESSAGE(14, "RetransmitRejectMessage"),

    /**
     * SimpleNewOrderMessage
     */
    SIMPLE_NEW_ORDER_MESSAGE(100, "SimpleNewOrderMessage"),

    /**
     * SimpleModifyOrderMessage
     */
    SIMPLE_MODIFY_ORDER_MESSAGE(101, "SimpleModifyOrderMessage"),

    /**
     * NewOrderSingleMessage
     */
    NEW_ORDER_SINGLE_MESSAGE(102, "NewOrderSingleMessage"),

    /**
     * OrderCancelReplaceRequestMessage
     */
    ORDER_CANCEL_REPLACE_REQUEST_MESSAGE(104, "OrderCancelReplaceRequestMessage"),

    /**
     * OrderCancelRequestMessage
     */
    ORDER_CANCEL_REQUEST_MESSAGE(105, "OrderCancelRequestMessage"),

    /**
     * NewOrderCrossMessage
     */
    NEW_ORDER_CROSS_MESSAGE(106, "NewOrderCrossMessage"),

    /**
     * ExecutionReport_NewMessage
     */
    EXECUTION_REPORT_NEW_MESSAGE(200, "ExecutionReport_NewMessage"),

    /**
     * ExecutionReport_ModifyMessage
     */
    EXECUTION_REPORT_MODIFY_MESSAGE(201, "ExecutionReport_ModifyMessage"),

    /**
     * ExecutionReport_CancelMessage
     */
    EXECUTION_REPORT_CANCEL_MESSAGE(202, "ExecutionReport_CancelMessage"),

    /**
     * ExecutionReport_TradeMessage
     */
    EXECUTION_REPORT_TRADE_MESSAGE(203, "ExecutionReport_TradeMessage"),

    /**
     * ExecutionReport_RejectMessage
     */
    EXECUTION_REPORT_REJECT_MESSAGE(204, "ExecutionReport_RejectMessage"),

    /**
     * ExecutionReport_ForwardMessage
     */
    EXECUTION_REPORT_FORWARD_MESSAGE(205, "ExecutionReport_ForwardMessage"),

    /**
     * BusinessMessageRejectMessage
     */
    BUSINESS_MESSAGE_REJECT_MESSAGE(206, "BusinessMessageRejectMessage"),

    /**
     * SecurityDefinitionRequestMessage
     */
    SECURITY_DEFINITION_REQUEST_MESSAGE(300, "SecurityDefinitionRequestMessage"),

    /**
     * SecurityDefinitionResponseMessage
     */
    SECURITY_DEFINITION_RESPONSE_MESSAGE(301, "SecurityDefinitionResponseMessage"),

    /**
     * QuoteRequestMessage
     */
    QUOTE_REQUEST_MESSAGE(401, "QuoteRequestMessage"),

    /**
     * QuoteStatusReportMessage
     */
    QUOTE_STATUS_REPORT_MESSAGE(402, "QuoteStatusReportMessage"),

    /**
     * QuoteMessage
     */
    QUOTE_MESSAGE(403, "QuoteMessage"),

    /**
     * QuoteCancelMessage
     */
    QUOTE_CANCEL_MESSAGE(404, "QuoteCancelMessage"),

    /**
     * QuoteRequestRejectMessage
     */
    QUOTE_REQUEST_REJECT_MESSAGE(405, "QuoteRequestRejectMessage"),

    /**
     * PositionMaintenanceCancelRequestMessage
     */
    POSITION_MAINTENANCE_CANCEL_REQUEST_MESSAGE(501, "PositionMaintenanceCancelRequestMessage"),

    /**
     * PositionMaintenanceRequestMessage
     */
    POSITION_MAINTENANCE_REQUEST_MESSAGE(502, "PositionMaintenanceRequestMessage"),

    /**
     * PositionMaintenanceReportMessage
     */
    POSITION_MAINTENANCE_REPORT_MESSAGE(503, "PositionMaintenanceReportMessage"),

    /**
     * AllocationInstructionMessage
     */
    ALLOCATION_INSTRUCTION_MESSAGE(601, "AllocationInstructionMessage"),

    /**
     * AllocationReportMessage
     */
    ALLOCATION_REPORT_MESSAGE(602, "AllocationReportMessage"),

    /**
     * OrderMassActionRequestMessage
     */
    ORDER_MASS_ACTION_REQUEST_MESSAGE(701, "OrderMassActionRequestMessage"),

    /**
     * OrderMassActionReportMessage
     */
    ORDER_MASS_ACTION_REPORT_MESSAGE(702, "OrderMassActionReportMessage");

    private final int wire;

    private final String description;

    TemplateId(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<TemplateId> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(NEGOTIATE_MESSAGE);
            case 2 -> Optional.of(NEGOTIATE_RESPONSE_MESSAGE);
            case 3 -> Optional.of(NEGOTIATE_REJECT_MESSAGE);
            case 4 -> Optional.of(ESTABLISH_MESSAGE);
            case 5 -> Optional.of(ESTABLISH_ACK_MESSAGE);
            case 6 -> Optional.of(ESTABLISH_REJECT_MESSAGE);
            case 7 -> Optional.of(TERMINATE_MESSAGE);
            case 8 -> Optional.of(NOT_APPLIED_MESSAGE);
            case 9 -> Optional.of(SEQUENCE_MESSAGE);
            case 12 -> Optional.of(RETRANSMIT_REQUEST_MESSAGE);
            case 13 -> Optional.of(RETRANSMISSION_MESSAGE);
            case 14 -> Optional.of(RETRANSMIT_REJECT_MESSAGE);
            case 100 -> Optional.of(SIMPLE_NEW_ORDER_MESSAGE);
            case 101 -> Optional.of(SIMPLE_MODIFY_ORDER_MESSAGE);
            case 102 -> Optional.of(NEW_ORDER_SINGLE_MESSAGE);
            case 104 -> Optional.of(ORDER_CANCEL_REPLACE_REQUEST_MESSAGE);
            case 105 -> Optional.of(ORDER_CANCEL_REQUEST_MESSAGE);
            case 106 -> Optional.of(NEW_ORDER_CROSS_MESSAGE);
            case 200 -> Optional.of(EXECUTION_REPORT_NEW_MESSAGE);
            case 201 -> Optional.of(EXECUTION_REPORT_MODIFY_MESSAGE);
            case 202 -> Optional.of(EXECUTION_REPORT_CANCEL_MESSAGE);
            case 203 -> Optional.of(EXECUTION_REPORT_TRADE_MESSAGE);
            case 204 -> Optional.of(EXECUTION_REPORT_REJECT_MESSAGE);
            case 205 -> Optional.of(EXECUTION_REPORT_FORWARD_MESSAGE);
            case 206 -> Optional.of(BUSINESS_MESSAGE_REJECT_MESSAGE);
            case 300 -> Optional.of(SECURITY_DEFINITION_REQUEST_MESSAGE);
            case 301 -> Optional.of(SECURITY_DEFINITION_RESPONSE_MESSAGE);
            case 401 -> Optional.of(QUOTE_REQUEST_MESSAGE);
            case 402 -> Optional.of(QUOTE_STATUS_REPORT_MESSAGE);
            case 403 -> Optional.of(QUOTE_MESSAGE);
            case 404 -> Optional.of(QUOTE_CANCEL_MESSAGE);
            case 405 -> Optional.of(QUOTE_REQUEST_REJECT_MESSAGE);
            case 501 -> Optional.of(POSITION_MAINTENANCE_CANCEL_REQUEST_MESSAGE);
            case 502 -> Optional.of(POSITION_MAINTENANCE_REQUEST_MESSAGE);
            case 503 -> Optional.of(POSITION_MAINTENANCE_REPORT_MESSAGE);
            case 601 -> Optional.of(ALLOCATION_INSTRUCTION_MESSAGE);
            case 602 -> Optional.of(ALLOCATION_REPORT_MESSAGE);
            case 701 -> Optional.of(ORDER_MASS_ACTION_REQUEST_MESSAGE);
            case 702 -> Optional.of(ORDER_MASS_ACTION_REPORT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
