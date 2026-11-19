package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * Defines the TemplateId values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * SimpleOpenFramingHeaderMessage
     */
    SIMPLE_OPEN_FRAMING_HEADER_MESSAGE(0, "SimpleOpenFramingHeaderMessage"),

    /**
     * LogonRequestMessage
     */
    LOGON_REQUEST_MESSAGE(1, "LogonRequestMessage"),

    /**
     * LogonReportMessage
     */
    LOGON_REPORT_MESSAGE(101, "LogonReportMessage"),

    /**
     * LogoutRequestMessage
     */
    LOGOUT_REQUEST_MESSAGE(13, "LogoutRequestMessage"),

    /**
     * LogoutReportMessage
     */
    LOGOUT_REPORT_MESSAGE(113, "LogoutReportMessage"),

    /**
     * HeartBeatMessage
     */
    HEART_BEAT_MESSAGE(51, "HeartBeatMessage"),

    /**
     * ErrorMessage
     */
    ERROR_MESSAGE(114, "ErrorMessage"),

    /**
     * NewsMessage
     */
    NEWS_MESSAGE(116, "NewsMessage"),

    /**
     * SecurityDefinitionReport_StrategyMessage
     */
    SECURITY_DEFINITION_REPORT_STRATEGY_MESSAGE(112, "SecurityDefinitionReport_StrategyMessage"),

    /**
     * SecurityDefinitionReportMessage
     */
    SECURITY_DEFINITION_REPORT_MESSAGE(115, "SecurityDefinitionReportMessage"),

    /**
     * SecurityDefinitionRejectMessage
     */
    SECURITY_DEFINITION_REJECT_MESSAGE(155, "SecurityDefinitionRejectMessage"),

    /**
     * SecurityDefinitionRequestMessage
     */
    SECURITY_DEFINITION_REQUEST_MESSAGE(15, "SecurityDefinitionRequestMessage"),

    /**
     * SecurityDefinitionReport_ProductMessage
     */
    SECURITY_DEFINITION_REPORT_PRODUCT_MESSAGE(154, "SecurityDefinitionReport_ProductMessage"),

    /**
     * IPRequestMessage
     */
    IP_REQUEST_MESSAGE(2001, "IPRequestMessage"),

    /**
     * IPReportMessage
     */
    IP_REPORT_MESSAGE(2002, "IPReportMessage"),

    /**
     * TraderLogonRequestMessage
     */
    TRADER_LOGON_REQUEST_MESSAGE(2, "TraderLogonRequestMessage"),

    /**
     * TraderLogonReportMessage
     */
    TRADER_LOGON_REPORT_MESSAGE(102, "TraderLogonReportMessage"),

    /**
     * TraderLogoutRequestMessage
     */
    TRADER_LOGOUT_REQUEST_MESSAGE(3, "TraderLogoutRequestMessage"),

    /**
     * TraderLogoutReportMessage
     */
    TRADER_LOGOUT_REPORT_MESSAGE(103, "TraderLogoutReportMessage"),

    /**
     * NewOrderRequestMessage
     */
    NEW_ORDER_REQUEST_MESSAGE(4, "NewOrderRequestMessage"),

    /**
     * CancelReplaceRequestMessage
     */
    CANCEL_REPLACE_REQUEST_MESSAGE(5, "CancelReplaceRequestMessage"),

    /**
     * CancelRequestMessage
     */
    CANCEL_REQUEST_MESSAGE(6, "CancelRequestMessage"),

    /**
     * QuoteRequestMessage
     */
    QUOTE_REQUEST_MESSAGE(7, "QuoteRequestMessage"),

    /**
     * NewOrderCrossRequestMessage
     */
    NEW_ORDER_CROSS_REQUEST_MESSAGE(8, "NewOrderCrossRequestMessage"),

    /**
     * OrderMassCancelRequestMessage
     */
    ORDER_MASS_CANCEL_REQUEST_MESSAGE(9, "OrderMassCancelRequestMessage"),

    /**
     * MassQuoteRequestMessage
     */
    MASS_QUOTE_REQUEST_MESSAGE(10, "MassQuoteRequestMessage"),

    /**
     * QuoteCancelRequestMessage
     */
    QUOTE_CANCEL_REQUEST_MESSAGE(11, "QuoteCancelRequestMessage"),

    /**
     * SecurityDefinitionRequest_CreateStrategyMessage
     */
    SECURITY_DEFINITION_REQUEST_CREATE_STRATEGY_MESSAGE(12, "SecurityDefinitionRequest_CreateStrategyMessage"),

    /**
     * SecurityDefinitionRequest_CreateFlexMessage
     */
    SECURITY_DEFINITION_REQUEST_CREATE_FLEX_MESSAGE(14, "SecurityDefinitionRequest_CreateFlexMessage"),

    /**
     * ExecutionReport_NewMessage
     */
    EXECUTION_REPORT_NEW_MESSAGE(104, "ExecutionReport_NewMessage"),

    /**
     * ExecutionReport_ModifyMessage
     */
    EXECUTION_REPORT_MODIFY_MESSAGE(105, "ExecutionReport_ModifyMessage"),

    /**
     * ExecutionReport_CancelMessage
     */
    EXECUTION_REPORT_CANCEL_MESSAGE(106, "ExecutionReport_CancelMessage"),

    /**
     * ExecutionReport_RejectMessage
     */
    EXECUTION_REPORT_REJECT_MESSAGE(151, "ExecutionReport_RejectMessage"),

    /**
     * ExecutionReport_SnapshotMessage
     */
    EXECUTION_REPORT_SNAPSHOT_MESSAGE(152, "ExecutionReport_SnapshotMessage"),

    /**
     * ExecutionReport_TradeMessage
     */
    EXECUTION_REPORT_TRADE_MESSAGE(153, "ExecutionReport_TradeMessage"),

    /**
     * QuoteReportMessage
     */
    QUOTE_REPORT_MESSAGE(107, "QuoteReportMessage"),

    /**
     * NewOrderCrossReportMessage
     */
    NEW_ORDER_CROSS_REPORT_MESSAGE(108, "NewOrderCrossReportMessage"),

    /**
     * OrderMassCancelReportMessage
     */
    ORDER_MASS_CANCEL_REPORT_MESSAGE(109, "OrderMassCancelReportMessage"),

    /**
     * MassQuoteReportMessage
     */
    MASS_QUOTE_REPORT_MESSAGE(110, "MassQuoteReportMessage"),

    /**
     * ResendRequestMessage
     */
    RESEND_REQUEST_MESSAGE(16, "ResendRequestMessage"),

    /**
     * ResendReportMessage
     */
    RESEND_REPORT_MESSAGE(117, "ResendReportMessage"),

    /**
     * SequenceResetMessage
     */
    SEQUENCE_RESET_MESSAGE(111, "SequenceResetMessage");

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
            case 0 -> Optional.of(SIMPLE_OPEN_FRAMING_HEADER_MESSAGE);
            case 1 -> Optional.of(LOGON_REQUEST_MESSAGE);
            case 101 -> Optional.of(LOGON_REPORT_MESSAGE);
            case 13 -> Optional.of(LOGOUT_REQUEST_MESSAGE);
            case 113 -> Optional.of(LOGOUT_REPORT_MESSAGE);
            case 51 -> Optional.of(HEART_BEAT_MESSAGE);
            case 114 -> Optional.of(ERROR_MESSAGE);
            case 116 -> Optional.of(NEWS_MESSAGE);
            case 112 -> Optional.of(SECURITY_DEFINITION_REPORT_STRATEGY_MESSAGE);
            case 115 -> Optional.of(SECURITY_DEFINITION_REPORT_MESSAGE);
            case 155 -> Optional.of(SECURITY_DEFINITION_REJECT_MESSAGE);
            case 15 -> Optional.of(SECURITY_DEFINITION_REQUEST_MESSAGE);
            case 154 -> Optional.of(SECURITY_DEFINITION_REPORT_PRODUCT_MESSAGE);
            case 2001 -> Optional.of(IP_REQUEST_MESSAGE);
            case 2002 -> Optional.of(IP_REPORT_MESSAGE);
            case 2 -> Optional.of(TRADER_LOGON_REQUEST_MESSAGE);
            case 102 -> Optional.of(TRADER_LOGON_REPORT_MESSAGE);
            case 3 -> Optional.of(TRADER_LOGOUT_REQUEST_MESSAGE);
            case 103 -> Optional.of(TRADER_LOGOUT_REPORT_MESSAGE);
            case 4 -> Optional.of(NEW_ORDER_REQUEST_MESSAGE);
            case 5 -> Optional.of(CANCEL_REPLACE_REQUEST_MESSAGE);
            case 6 -> Optional.of(CANCEL_REQUEST_MESSAGE);
            case 7 -> Optional.of(QUOTE_REQUEST_MESSAGE);
            case 8 -> Optional.of(NEW_ORDER_CROSS_REQUEST_MESSAGE);
            case 9 -> Optional.of(ORDER_MASS_CANCEL_REQUEST_MESSAGE);
            case 10 -> Optional.of(MASS_QUOTE_REQUEST_MESSAGE);
            case 11 -> Optional.of(QUOTE_CANCEL_REQUEST_MESSAGE);
            case 12 -> Optional.of(SECURITY_DEFINITION_REQUEST_CREATE_STRATEGY_MESSAGE);
            case 14 -> Optional.of(SECURITY_DEFINITION_REQUEST_CREATE_FLEX_MESSAGE);
            case 104 -> Optional.of(EXECUTION_REPORT_NEW_MESSAGE);
            case 105 -> Optional.of(EXECUTION_REPORT_MODIFY_MESSAGE);
            case 106 -> Optional.of(EXECUTION_REPORT_CANCEL_MESSAGE);
            case 151 -> Optional.of(EXECUTION_REPORT_REJECT_MESSAGE);
            case 152 -> Optional.of(EXECUTION_REPORT_SNAPSHOT_MESSAGE);
            case 153 -> Optional.of(EXECUTION_REPORT_TRADE_MESSAGE);
            case 107 -> Optional.of(QUOTE_REPORT_MESSAGE);
            case 108 -> Optional.of(NEW_ORDER_CROSS_REPORT_MESSAGE);
            case 109 -> Optional.of(ORDER_MASS_CANCEL_REPORT_MESSAGE);
            case 110 -> Optional.of(MASS_QUOTE_REPORT_MESSAGE);
            case 16 -> Optional.of(RESEND_REQUEST_MESSAGE);
            case 117 -> Optional.of(RESEND_REPORT_MESSAGE);
            case 111 -> Optional.of(SEQUENCE_RESET_MESSAGE);
            default -> Optional.empty();
        };
    }
}
