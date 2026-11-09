package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Defines the TemplateId values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * Negotiate
     */
    NEGOTIATE(500, "Negotiate"),

    /**
     * NegotiationResponse
     */
    NEGOTIATION_RESPONSE(501, "NegotiationResponse"),

    /**
     * NegotiationReject
     */
    NEGOTIATION_REJECT(502, "NegotiationReject"),

    /**
     * Establish
     */
    ESTABLISH(503, "Establish"),

    /**
     * EstablishmentAck
     */
    ESTABLISHMENT_ACK(504, "EstablishmentAck"),

    /**
     * EstablishmentReject
     */
    ESTABLISHMENT_REJECT(505, "EstablishmentReject"),

    /**
     * Sequence
     */
    SEQUENCE(506, "Sequence"),

    /**
     * Terminate
     */
    TERMINATE(507, "Terminate"),

    /**
     * RetransmitRequest
     */
    RETRANSMIT_REQUEST(508, "RetransmitRequest"),

    /**
     * Retransmission
     */
    RETRANSMISSION(509, "Retransmission"),

    /**
     * RetransmitReject
     */
    RETRANSMIT_REJECT(510, "RetransmitReject"),

    /**
     * NotApplied
     */
    NOT_APPLIED(513, "NotApplied"),

    /**
     * NewOrderSingle
     */
    NEW_ORDER_SINGLE(514, "NewOrderSingle"),

    /**
     * OrderCancelReplaceRequest
     */
    ORDER_CANCEL_REPLACE_REQUEST(515, "OrderCancelReplaceRequest"),

    /**
     * OrderCancelRequest
     */
    ORDER_CANCEL_REQUEST(516, "OrderCancelRequest"),

    /**
     * MassQuote
     */
    MASS_QUOTE(517, "MassQuote"),

    /**
     * PartyDetailsDefinitionRequest
     */
    PARTY_DETAILS_DEFINITION_REQUEST(518, "PartyDetailsDefinitionRequest"),

    /**
     * PartyDetailsDefinitionRequestAck
     */
    PARTY_DETAILS_DEFINITION_REQUEST_ACK(519, "PartyDetailsDefinitionRequestAck"),

    /**
     * BusinessReject
     */
    BUSINESS_REJECT(521, "BusinessReject"),

    /**
     * ExecutionReportNew
     */
    EXECUTION_REPORT_NEW(522, "ExecutionReportNew"),

    /**
     * ExecutionReportReject
     */
    EXECUTION_REPORT_REJECT(523, "ExecutionReportReject"),

    /**
     * ExecutionReportElimination
     */
    EXECUTION_REPORT_ELIMINATION(524, "ExecutionReportElimination"),

    /**
     * ExecutionReportTradeOutright
     */
    EXECUTION_REPORT_TRADE_OUTRIGHT(525, "ExecutionReportTradeOutright"),

    /**
     * ExecutionReportTradeSpread
     */
    EXECUTION_REPORT_TRADE_SPREAD(526, "ExecutionReportTradeSpread"),

    /**
     * ExecutionReportTradeSpreadLeg
     */
    EXECUTION_REPORT_TRADE_SPREAD_LEG(527, "ExecutionReportTradeSpreadLeg"),

    /**
     * QuoteCancel
     */
    QUOTE_CANCEL(528, "QuoteCancel"),

    /**
     * OrderMassActionRequest
     */
    ORDER_MASS_ACTION_REQUEST(529, "OrderMassActionRequest"),

    /**
     * OrderMassStatusRequest
     */
    ORDER_MASS_STATUS_REQUEST(530, "OrderMassStatusRequest"),

    /**
     * ExecutionReportModify
     */
    EXECUTION_REPORT_MODIFY(531, "ExecutionReportModify"),

    /**
     * ExecutionReportStatus
     */
    EXECUTION_REPORT_STATUS(532, "ExecutionReportStatus"),

    /**
     * OrderStatusRequest
     */
    ORDER_STATUS_REQUEST(533, "OrderStatusRequest"),

    /**
     * ExecutionReportCancel
     */
    EXECUTION_REPORT_CANCEL(534, "ExecutionReportCancel"),

    /**
     * OrderCancelReject
     */
    ORDER_CANCEL_REJECT(535, "OrderCancelReject"),

    /**
     * OrderCancelReplaceReject
     */
    ORDER_CANCEL_REPLACE_REJECT(536, "OrderCancelReplaceReject"),

    /**
     * PartyDetailsListRequest
     */
    PARTY_DETAILS_LIST_REQUEST(537, "PartyDetailsListRequest"),

    /**
     * PartyDetailsListReport
     */
    PARTY_DETAILS_LIST_REPORT(538, "PartyDetailsListReport"),

    /**
     * ExecutionAck
     */
    EXECUTION_ACK(539, "ExecutionAck"),

    /**
     * RequestForQuote
     */
    REQUEST_FOR_QUOTE(543, "RequestForQuote"),

    /**
     * NewOrderCross
     */
    NEW_ORDER_CROSS(544, "NewOrderCross"),

    /**
     * MassQuoteAck
     */
    MASS_QUOTE_ACK(545, "MassQuoteAck"),

    /**
     * RequestForQuoteAck
     */
    REQUEST_FOR_QUOTE_ACK(546, "RequestForQuoteAck"),

    /**
     * ExecutionReportTradeAddendumOutright
     */
    EXECUTION_REPORT_TRADE_ADDENDUM_OUTRIGHT(548, "ExecutionReportTradeAddendumOutright"),

    /**
     * ExecutionReportTradeAddendumSpread
     */
    EXECUTION_REPORT_TRADE_ADDENDUM_SPREAD(549, "ExecutionReportTradeAddendumSpread"),

    /**
     * ExecutionReportTradeAddendumSpreadLeg
     */
    EXECUTION_REPORT_TRADE_ADDENDUM_SPREAD_LEG(550, "ExecutionReportTradeAddendumSpreadLeg"),

    /**
     * SecurityDefinitionRequest
     */
    SECURITY_DEFINITION_REQUEST(560, "SecurityDefinitionRequest"),

    /**
     * SecurityDefinitionResponse
     */
    SECURITY_DEFINITION_RESPONSE(561, "SecurityDefinitionResponse"),

    /**
     * OrderMassActionReport
     */
    ORDER_MASS_ACTION_REPORT(562, "OrderMassActionReport"),

    /**
     * QuoteCancelAck
     */
    QUOTE_CANCEL_ACK(563, "QuoteCancelAck");

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
            case 500 -> Optional.of(NEGOTIATE);
            case 501 -> Optional.of(NEGOTIATION_RESPONSE);
            case 502 -> Optional.of(NEGOTIATION_REJECT);
            case 503 -> Optional.of(ESTABLISH);
            case 504 -> Optional.of(ESTABLISHMENT_ACK);
            case 505 -> Optional.of(ESTABLISHMENT_REJECT);
            case 506 -> Optional.of(SEQUENCE);
            case 507 -> Optional.of(TERMINATE);
            case 508 -> Optional.of(RETRANSMIT_REQUEST);
            case 509 -> Optional.of(RETRANSMISSION);
            case 510 -> Optional.of(RETRANSMIT_REJECT);
            case 513 -> Optional.of(NOT_APPLIED);
            case 514 -> Optional.of(NEW_ORDER_SINGLE);
            case 515 -> Optional.of(ORDER_CANCEL_REPLACE_REQUEST);
            case 516 -> Optional.of(ORDER_CANCEL_REQUEST);
            case 517 -> Optional.of(MASS_QUOTE);
            case 518 -> Optional.of(PARTY_DETAILS_DEFINITION_REQUEST);
            case 519 -> Optional.of(PARTY_DETAILS_DEFINITION_REQUEST_ACK);
            case 521 -> Optional.of(BUSINESS_REJECT);
            case 522 -> Optional.of(EXECUTION_REPORT_NEW);
            case 523 -> Optional.of(EXECUTION_REPORT_REJECT);
            case 524 -> Optional.of(EXECUTION_REPORT_ELIMINATION);
            case 525 -> Optional.of(EXECUTION_REPORT_TRADE_OUTRIGHT);
            case 526 -> Optional.of(EXECUTION_REPORT_TRADE_SPREAD);
            case 527 -> Optional.of(EXECUTION_REPORT_TRADE_SPREAD_LEG);
            case 528 -> Optional.of(QUOTE_CANCEL);
            case 529 -> Optional.of(ORDER_MASS_ACTION_REQUEST);
            case 530 -> Optional.of(ORDER_MASS_STATUS_REQUEST);
            case 531 -> Optional.of(EXECUTION_REPORT_MODIFY);
            case 532 -> Optional.of(EXECUTION_REPORT_STATUS);
            case 533 -> Optional.of(ORDER_STATUS_REQUEST);
            case 534 -> Optional.of(EXECUTION_REPORT_CANCEL);
            case 535 -> Optional.of(ORDER_CANCEL_REJECT);
            case 536 -> Optional.of(ORDER_CANCEL_REPLACE_REJECT);
            case 537 -> Optional.of(PARTY_DETAILS_LIST_REQUEST);
            case 538 -> Optional.of(PARTY_DETAILS_LIST_REPORT);
            case 539 -> Optional.of(EXECUTION_ACK);
            case 543 -> Optional.of(REQUEST_FOR_QUOTE);
            case 544 -> Optional.of(NEW_ORDER_CROSS);
            case 545 -> Optional.of(MASS_QUOTE_ACK);
            case 546 -> Optional.of(REQUEST_FOR_QUOTE_ACK);
            case 548 -> Optional.of(EXECUTION_REPORT_TRADE_ADDENDUM_OUTRIGHT);
            case 549 -> Optional.of(EXECUTION_REPORT_TRADE_ADDENDUM_SPREAD);
            case 550 -> Optional.of(EXECUTION_REPORT_TRADE_ADDENDUM_SPREAD_LEG);
            case 560 -> Optional.of(SECURITY_DEFINITION_REQUEST);
            case 561 -> Optional.of(SECURITY_DEFINITION_RESPONSE);
            case 562 -> Optional.of(ORDER_MASS_ACTION_REPORT);
            case 563 -> Optional.of(QUOTE_CANCEL_ACK);
            default -> Optional.empty();
        };
    }
}
