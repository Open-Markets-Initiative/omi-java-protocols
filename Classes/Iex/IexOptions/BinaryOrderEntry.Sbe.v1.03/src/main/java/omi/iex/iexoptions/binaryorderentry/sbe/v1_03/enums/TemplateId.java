package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.enums;

import java.util.Optional;

/**
 * Template ID used to encode the message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * LoginRequestMessage
     */
    LOGIN_REQUEST_MESSAGE(1, "LoginRequestMessage"),

    /**
     * LoginResponseMessage
     */
    LOGIN_RESPONSE_MESSAGE(2, "LoginResponseMessage"),

    /**
     * GatewayHeartbeatMessage
     */
    GATEWAY_HEARTBEAT_MESSAGE(3, "GatewayHeartbeatMessage"),

    /**
     * ClientHeartbeatMessage
     */
    CLIENT_HEARTBEAT_MESSAGE(4, "ClientHeartbeatMessage"),

    /**
     * LogoutRequestMessage
     */
    LOGOUT_REQUEST_MESSAGE(5, "LogoutRequestMessage"),

    /**
     * TerminateMessage
     */
    TERMINATE_MESSAGE(6, "TerminateMessage"),

    /**
     * SequencedMessageHeaderMessage
     */
    SEQUENCED_MESSAGE_HEADER_MESSAGE(7, "SequencedMessageHeaderMessage"),

    /**
     * SubsessionJoinMessage
     */
    SUBSESSION_JOIN_MESSAGE(8, "SubsessionJoinMessage"),

    /**
     * SubsessionJoinResponseMessage
     */
    SUBSESSION_JOIN_RESPONSE_MESSAGE(9, "SubsessionJoinResponseMessage"),

    /**
     * SubsessionLeaveMessage
     */
    SUBSESSION_LEAVE_MESSAGE(10, "SubsessionLeaveMessage"),

    /**
     * SubsessionLeaveResponseMessage
     */
    SUBSESSION_LEAVE_RESPONSE_MESSAGE(11, "SubsessionLeaveResponseMessage"),

    /**
     * NewOrderSingleMessage
     */
    NEW_ORDER_SINGLE_MESSAGE(1, "NewOrderSingleMessage"),

    /**
     * OrderCancelReplaceRequestMessage
     */
    ORDER_CANCEL_REPLACE_REQUEST_MESSAGE(2, "OrderCancelReplaceRequestMessage"),

    /**
     * OrderCancelRequestMessage
     */
    ORDER_CANCEL_REQUEST_MESSAGE(3, "OrderCancelRequestMessage"),

    /**
     * NewBulkQuoteMessage
     */
    NEW_BULK_QUOTE_MESSAGE(4, "NewBulkQuoteMessage"),

    /**
     * MassCancelRequestMessage
     */
    MASS_CANCEL_REQUEST_MESSAGE(5, "MassCancelRequestMessage"),

    /**
     * PurgeRequestMessage
     */
    PURGE_REQUEST_MESSAGE(6, "PurgeRequestMessage"),

    /**
     * OrderAckMessage
     */
    ORDER_ACK_MESSAGE(101, "OrderAckMessage"),

    /**
     * UnsolicitedModifyAckMessage
     */
    UNSOLICITED_MODIFY_ACK_MESSAGE(102, "UnsolicitedModifyAckMessage"),

    /**
     * OrderCancelAckMessage
     */
    ORDER_CANCEL_ACK_MESSAGE(103, "OrderCancelAckMessage"),

    /**
     * MassCancelAckMessage
     */
    MASS_CANCEL_ACK_MESSAGE(104, "MassCancelAckMessage"),

    /**
     * BulkQuoteAckMessage
     */
    BULK_QUOTE_ACK_MESSAGE(105, "BulkQuoteAckMessage"),

    /**
     * NewIocQuoteAckMessage
     */
    NEW_IOC_QUOTE_ACK_MESSAGE(106, "NewIocQuoteAckMessage"),

    /**
     * QuoteRestatedMessage
     */
    QUOTE_RESTATED_MESSAGE(107, "QuoteRestatedMessage"),

    /**
     * QuoteCanceledMessage
     */
    QUOTE_CANCELED_MESSAGE(108, "QuoteCanceledMessage"),

    /**
     * PurgeAckMessage
     */
    PURGE_ACK_MESSAGE(109, "PurgeAckMessage"),

    /**
     * ExecutionReportMessage
     */
    EXECUTION_REPORT_MESSAGE(110, "ExecutionReportMessage"),

    /**
     * TradeBustCorrectMessage
     */
    TRADE_BUST_CORRECT_MESSAGE(111, "TradeBustCorrectMessage"),

    /**
     * ApplicationLayerRejectMessage
     */
    APPLICATION_LAYER_REJECT_MESSAGE(112, "ApplicationLayerRejectMessage"),

    /**
     * RiskLimitUpdateRequestMessage
     */
    RISK_LIMIT_UPDATE_REQUEST_MESSAGE(51, "RiskLimitUpdateRequestMessage"),

    /**
     * RiskActionRequestMessage
     */
    RISK_ACTION_REQUEST_MESSAGE(52, "RiskActionRequestMessage"),

    /**
     * UnderlyingRefDataMessage
     */
    UNDERLYING_REF_DATA_MESSAGE(151, "UnderlyingRefDataMessage"),

    /**
     * InstrumentRefDataMessage
     */
    INSTRUMENT_REF_DATA_MESSAGE(152, "InstrumentRefDataMessage"),

    /**
     * MPIDConfigurationAcknowledgementMessage
     */
    MPID_CONFIGURATION_ACKNOWLEDGEMENT_MESSAGE(153, "MPIDConfigurationAcknowledgementMessage"),

    /**
     * MarketMakerSymbolAppointmentMessage
     */
    MARKET_MAKER_SYMBOL_APPOINTMENT_MESSAGE(154, "MarketMakerSymbolAppointmentMessage"),

    /**
     * SessionConfigurationAcknowledgementMessage
     */
    SESSION_CONFIGURATION_ACKNOWLEDGEMENT_MESSAGE(155, "SessionConfigurationAcknowledgementMessage"),

    /**
     * RiskControlAcknowledgmentMessage
     */
    RISK_CONTROL_ACKNOWLEDGMENT_MESSAGE(156, "RiskControlAcknowledgmentMessage"),

    /**
     * RiskControlAlertMessage
     */
    RISK_CONTROL_ALERT_MESSAGE(157, "RiskControlAlertMessage");

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
            case 1 -> Optional.of(LOGIN_REQUEST_MESSAGE);
            case 2 -> Optional.of(LOGIN_RESPONSE_MESSAGE);
            case 3 -> Optional.of(GATEWAY_HEARTBEAT_MESSAGE);
            case 4 -> Optional.of(CLIENT_HEARTBEAT_MESSAGE);
            case 5 -> Optional.of(LOGOUT_REQUEST_MESSAGE);
            case 6 -> Optional.of(TERMINATE_MESSAGE);
            case 7 -> Optional.of(SEQUENCED_MESSAGE_HEADER_MESSAGE);
            case 8 -> Optional.of(SUBSESSION_JOIN_MESSAGE);
            case 9 -> Optional.of(SUBSESSION_JOIN_RESPONSE_MESSAGE);
            case 10 -> Optional.of(SUBSESSION_LEAVE_MESSAGE);
            case 11 -> Optional.of(SUBSESSION_LEAVE_RESPONSE_MESSAGE);
            case 101 -> Optional.of(ORDER_ACK_MESSAGE);
            case 102 -> Optional.of(UNSOLICITED_MODIFY_ACK_MESSAGE);
            case 103 -> Optional.of(ORDER_CANCEL_ACK_MESSAGE);
            case 104 -> Optional.of(MASS_CANCEL_ACK_MESSAGE);
            case 105 -> Optional.of(BULK_QUOTE_ACK_MESSAGE);
            case 106 -> Optional.of(NEW_IOC_QUOTE_ACK_MESSAGE);
            case 107 -> Optional.of(QUOTE_RESTATED_MESSAGE);
            case 108 -> Optional.of(QUOTE_CANCELED_MESSAGE);
            case 109 -> Optional.of(PURGE_ACK_MESSAGE);
            case 110 -> Optional.of(EXECUTION_REPORT_MESSAGE);
            case 111 -> Optional.of(TRADE_BUST_CORRECT_MESSAGE);
            case 112 -> Optional.of(APPLICATION_LAYER_REJECT_MESSAGE);
            case 51 -> Optional.of(RISK_LIMIT_UPDATE_REQUEST_MESSAGE);
            case 52 -> Optional.of(RISK_ACTION_REQUEST_MESSAGE);
            case 151 -> Optional.of(UNDERLYING_REF_DATA_MESSAGE);
            case 152 -> Optional.of(INSTRUMENT_REF_DATA_MESSAGE);
            case 153 -> Optional.of(MPID_CONFIGURATION_ACKNOWLEDGEMENT_MESSAGE);
            case 154 -> Optional.of(MARKET_MAKER_SYMBOL_APPOINTMENT_MESSAGE);
            case 155 -> Optional.of(SESSION_CONFIGURATION_ACKNOWLEDGEMENT_MESSAGE);
            case 156 -> Optional.of(RISK_CONTROL_ACKNOWLEDGMENT_MESSAGE);
            case 157 -> Optional.of(RISK_CONTROL_ALERT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
