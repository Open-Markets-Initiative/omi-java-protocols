package omi.eurex.t7.xti.fbe.v8_1.enums;

import java.util.Optional;

/**
 * Defines the TemplateId values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * No Value
     */
    NO_VALUE(65535, "No Value"),

    /**
     * Approve Tes Trade Request TemplateId
     */
    APPROVE_TES_TRADE_REQUEST(10603, "Approve Tes Trade Request TemplateId"),

    /**
     * Best Quote Execution Report TemplateId
     */
    BEST_QUOTE_EXECUTION_REPORT(10414, "Best Quote Execution Report TemplateId"),

    /**
     * Best Quote Response TemplateId
     */
    BEST_QUOTE_RESPONSE(10413, "Best Quote Response TemplateId"),

    /**
     * Broadcast Error Notification TemplateId
     */
    BROADCAST_ERROR_NOTIFICATION(10032, "Broadcast Error Notification TemplateId"),

    /**
     * Cross Request TemplateId
     */
    CROSS_REQUEST(10118, "Cross Request TemplateId"),

    /**
     * Cross Request Response TemplateId
     */
    CROSS_REQUEST_RESPONSE(10119, "Cross Request Response TemplateId"),

    /**
     * Delete All Order Broadcast TemplateId
     */
    DELETE_ALL_ORDER_BROADCAST(10122, "Delete All Order Broadcast TemplateId"),

    /**
     * Delete All Order Nr Response TemplateId
     */
    DELETE_ALL_ORDER_NR_RESPONSE(10124, "Delete All Order Nr Response TemplateId"),

    /**
     * Delete All Order Quote Event Broadcast TemplateId
     */
    DELETE_ALL_ORDER_QUOTE_EVENT_BROADCAST(10308, "Delete All Order Quote Event Broadcast TemplateId"),

    /**
     * Delete All Order Request TemplateId
     */
    DELETE_ALL_ORDER_REQUEST(10120, "Delete All Order Request TemplateId"),

    /**
     * Delete All Order Response TemplateId
     */
    DELETE_ALL_ORDER_RESPONSE(10121, "Delete All Order Response TemplateId"),

    /**
     * Delete All Quote Broadcast TemplateId
     */
    DELETE_ALL_QUOTE_BROADCAST(10410, "Delete All Quote Broadcast TemplateId"),

    /**
     * Delete All Quote Request TemplateId
     */
    DELETE_ALL_QUOTE_REQUEST(10408, "Delete All Quote Request TemplateId"),

    /**
     * Delete All Quote Response TemplateId
     */
    DELETE_ALL_QUOTE_RESPONSE(10409, "Delete All Quote Response TemplateId"),

    /**
     * Delete Order Broadcast TemplateId
     */
    DELETE_ORDER_BROADCAST(10112, "Delete Order Broadcast TemplateId"),

    /**
     * Delete Order Nr Response TemplateId
     */
    DELETE_ORDER_NR_RESPONSE(10111, "Delete Order Nr Response TemplateId"),

    /**
     * Delete Order Response TemplateId
     */
    DELETE_ORDER_RESPONSE(10110, "Delete Order Response TemplateId"),

    /**
     * Delete Order Single Request TemplateId
     */
    DELETE_ORDER_SINGLE_REQUEST(10109, "Delete Order Single Request TemplateId"),

    /**
     * Delete Tes Trade Request TemplateId
     */
    DELETE_TES_TRADE_REQUEST(10602, "Delete Tes Trade Request TemplateId"),

    /**
     * Enter Best Quote Request TemplateId
     */
    ENTER_BEST_QUOTE_REQUEST(10412, "Enter Best Quote Request TemplateId"),

    /**
     * Enter Tes Trade Request TemplateId
     */
    ENTER_TES_TRADE_REQUEST(10600, "Enter Tes Trade Request TemplateId"),

    /**
     * Extended Deletion Report TemplateId
     */
    EXTENDED_DELETION_REPORT(10128, "Extended Deletion Report TemplateId"),

    /**
     * Forced Logout Notification TemplateId
     */
    FORCED_LOGOUT_NOTIFICATION(10012, "Forced Logout Notification TemplateId"),

    /**
     * Forced User Logout Notification TemplateId
     */
    FORCED_USER_LOGOUT_NOTIFICATION(10043, "Forced User Logout Notification TemplateId"),

    /**
     * Heartbeat TemplateId
     */
    HEARTBEAT(10011, "Heartbeat TemplateId"),

    /**
     * Heartbeat Notification TemplateId
     */
    HEARTBEAT_NOTIFICATION(10023, "Heartbeat Notification TemplateId"),

    /**
     * Inquire Enrichment Rule Id List Request TemplateId
     */
    INQUIRE_ENRICHMENT_RULE_ID_LIST_REQUEST(10040, "Inquire Enrichment Rule Id List Request TemplateId"),

    /**
     * Inquire Enrichment Rule Id List Response TemplateId
     */
    INQUIRE_ENRICHMENT_RULE_ID_LIST_RESPONSE(10041, "Inquire Enrichment Rule Id List Response TemplateId"),

    /**
     * Inquire Session List Request TemplateId
     */
    INQUIRE_SESSION_LIST_REQUEST(10035, "Inquire Session List Request TemplateId"),

    /**
     * Inquire Session List Response TemplateId
     */
    INQUIRE_SESSION_LIST_RESPONSE(10036, "Inquire Session List Response TemplateId"),

    /**
     * Inquire User Request TemplateId
     */
    INQUIRE_USER_REQUEST(10038, "Inquire User Request TemplateId"),

    /**
     * Inquire User Response TemplateId
     */
    INQUIRE_USER_RESPONSE(10039, "Inquire User Response TemplateId"),

    /**
     * Issuer Notification TemplateId
     */
    ISSUER_NOTIFICATION(10316, "Issuer Notification TemplateId"),

    /**
     * Issuer Security State Change Request TemplateId
     */
    ISSUER_SECURITY_STATE_CHANGE_REQUEST(10314, "Issuer Security State Change Request TemplateId"),

    /**
     * Issuer Security State Change Response TemplateId
     */
    ISSUER_SECURITY_STATE_CHANGE_RESPONSE(10315, "Issuer Security State Change Response TemplateId"),

    /**
     * Legal Notification Broadcast TemplateId
     */
    LEGAL_NOTIFICATION_BROADCAST(10037, "Legal Notification Broadcast TemplateId"),

    /**
     * Logon Request TemplateId
     */
    LOGON_REQUEST(10000, "Logon Request TemplateId"),

    /**
     * Logon Response TemplateId
     */
    LOGON_RESPONSE(10001, "Logon Response TemplateId"),

    /**
     * Logout Request TemplateId
     */
    LOGOUT_REQUEST(10002, "Logout Request TemplateId"),

    /**
     * Logout Response TemplateId
     */
    LOGOUT_RESPONSE(10003, "Logout Response TemplateId"),

    /**
     * Mass Quote Request TemplateId
     */
    MASS_QUOTE_REQUEST(10405, "Mass Quote Request TemplateId"),

    /**
     * Mass Quote Response TemplateId
     */
    MASS_QUOTE_RESPONSE(10406, "Mass Quote Response TemplateId"),

    /**
     * Modify Order Nr Response TemplateId
     */
    MODIFY_ORDER_NR_RESPONSE(10108, "Modify Order Nr Response TemplateId"),

    /**
     * Modify Order Response TemplateId
     */
    MODIFY_ORDER_RESPONSE(10107, "Modify Order Response TemplateId"),

    /**
     * Modify Order Single Request TemplateId
     */
    MODIFY_ORDER_SINGLE_REQUEST(10106, "Modify Order Single Request TemplateId"),

    /**
     * Modify Order Single Short Request TemplateId
     */
    MODIFY_ORDER_SINGLE_SHORT_REQUEST(10126, "Modify Order Single Short Request TemplateId"),

    /**
     * Modify Tes Trade Request TemplateId
     */
    MODIFY_TES_TRADE_REQUEST(10601, "Modify Tes Trade Request TemplateId"),

    /**
     * New Order Nr Response TemplateId
     */
    NEW_ORDER_NR_RESPONSE(10102, "New Order Nr Response TemplateId"),

    /**
     * New Order Response TemplateId
     */
    NEW_ORDER_RESPONSE(10101, "New Order Response TemplateId"),

    /**
     * New Order Single Request TemplateId
     */
    NEW_ORDER_SINGLE_REQUEST(10100, "New Order Single Request TemplateId"),

    /**
     * New Order Single Short Request TemplateId
     */
    NEW_ORDER_SINGLE_SHORT_REQUEST(10125, "New Order Single Short Request TemplateId"),

    /**
     * News Broadcast TemplateId
     */
    NEWS_BROADCAST(10031, "News Broadcast TemplateId"),

    /**
     * Order Exec Notification TemplateId
     */
    ORDER_EXEC_NOTIFICATION(10104, "Order Exec Notification TemplateId"),

    /**
     * Order Exec Report Broadcast TemplateId
     */
    ORDER_EXEC_REPORT_BROADCAST(10117, "Order Exec Report Broadcast TemplateId"),

    /**
     * Order Exec Response TemplateId
     */
    ORDER_EXEC_RESPONSE(10103, "Order Exec Response TemplateId"),

    /**
     * Party Action Report TemplateId
     */
    PARTY_ACTION_REPORT(10042, "Party Action Report TemplateId"),

    /**
     * Party Entitlements Update Report TemplateId
     */
    PARTY_ENTITLEMENTS_UPDATE_REPORT(10034, "Party Entitlements Update Report TemplateId"),

    /**
     * Quote Activation Notification TemplateId
     */
    QUOTE_ACTIVATION_NOTIFICATION(10411, "Quote Activation Notification TemplateId"),

    /**
     * Quote Activation Request TemplateId
     */
    QUOTE_ACTIVATION_REQUEST(10403, "Quote Activation Request TemplateId"),

    /**
     * Quote Activation Response TemplateId
     */
    QUOTE_ACTIVATION_RESPONSE(10404, "Quote Activation Response TemplateId"),

    /**
     * Quote Execution Report TemplateId
     */
    QUOTE_EXECUTION_REPORT(10407, "Quote Execution Report TemplateId"),

    /**
     * Rfq Broadcast TemplateId
     */
    RFQ_BROADCAST(10415, "Rfq Broadcast TemplateId"),

    /**
     * Rfq Reject Notification TemplateId
     */
    RFQ_REJECT_NOTIFICATION(10420, "Rfq Reject Notification TemplateId"),

    /**
     * Rfq Request TemplateId
     */
    RFQ_REQUEST(10401, "Rfq Request TemplateId"),

    /**
     * Rfq Response TemplateId
     */
    RFQ_RESPONSE(10402, "Rfq Response TemplateId"),

    /**
     * Rfq Specialist Broadcast TemplateId
     */
    RFQ_SPECIALIST_BROADCAST(10419, "Rfq Specialist Broadcast TemplateId"),

    /**
     * Reject TemplateId
     */
    REJECT(10010, "Reject TemplateId"),

    /**
     * Retransmit Me Message Request TemplateId
     */
    RETRANSMIT_ME_MESSAGE_REQUEST(10026, "Retransmit Me Message Request TemplateId"),

    /**
     * Retransmit Me Message Response TemplateId
     */
    RETRANSMIT_ME_MESSAGE_RESPONSE(10027, "Retransmit Me Message Response TemplateId"),

    /**
     * Retransmit Request TemplateId
     */
    RETRANSMIT_REQUEST(10008, "Retransmit Request TemplateId"),

    /**
     * Retransmit Response TemplateId
     */
    RETRANSMIT_RESPONSE(10009, "Retransmit Response TemplateId"),

    /**
     * Service Availability Broadcast TemplateId
     */
    SERVICE_AVAILABILITY_BROADCAST(10030, "Service Availability Broadcast TemplateId"),

    /**
     * Service Availability Market Broadcast TemplateId
     */
    SERVICE_AVAILABILITY_MARKET_BROADCAST(10044, "Service Availability Market Broadcast TemplateId"),

    /**
     * Single Quote Request TemplateId
     */
    SINGLE_QUOTE_REQUEST(10418, "Single Quote Request TemplateId"),

    /**
     * Specialist Delete All Order Broadcast TemplateId
     */
    SPECIALIST_DELETE_ALL_ORDER_BROADCAST(10137, "Specialist Delete All Order Broadcast TemplateId"),

    /**
     * Specialist Instrument Event Notification TemplateId
     */
    SPECIALIST_INSTRUMENT_EVENT_NOTIFICATION(10319, "Specialist Instrument Event Notification TemplateId"),

    /**
     * Specialist Order Book Notification TemplateId
     */
    SPECIALIST_ORDER_BOOK_NOTIFICATION(10136, "Specialist Order Book Notification TemplateId"),

    /**
     * Specialist Rfq Reject Request TemplateId
     */
    SPECIALIST_RFQ_REJECT_REQUEST(10421, "Specialist Rfq Reject Request TemplateId"),

    /**
     * Specialist Rfq Reply Notification TemplateId
     */
    SPECIALIST_RFQ_REPLY_NOTIFICATION(10424, "Specialist Rfq Reply Notification TemplateId"),

    /**
     * Specialist Rfq Reply Request TemplateId
     */
    SPECIALIST_RFQ_REPLY_REQUEST(10422, "Specialist Rfq Reply Request TemplateId"),

    /**
     * Specialist Rfq Reply Response TemplateId
     */
    SPECIALIST_RFQ_REPLY_RESPONSE(10423, "Specialist Rfq Reply Response TemplateId"),

    /**
     * Specialist Security State Change Request TemplateId
     */
    SPECIALIST_SECURITY_STATE_CHANGE_REQUEST(10317, "Specialist Security State Change Request TemplateId"),

    /**
     * Specialist Security State Change Response TemplateId
     */
    SPECIALIST_SECURITY_STATE_CHANGE_RESPONSE(10318, "Specialist Security State Change Response TemplateId"),

    /**
     * Subscribe Request TemplateId
     */
    SUBSCRIBE_REQUEST(10025, "Subscribe Request TemplateId"),

    /**
     * Subscribe Response TemplateId
     */
    SUBSCRIBE_RESPONSE(10005, "Subscribe Response TemplateId"),

    /**
     * Tes Approve Broadcast TemplateId
     */
    TES_APPROVE_BROADCAST(10607, "Tes Approve Broadcast TemplateId"),

    /**
     * Tes Broadcast TemplateId
     */
    TES_BROADCAST(10604, "Tes Broadcast TemplateId"),

    /**
     * Tes Delete Broadcast TemplateId
     */
    TES_DELETE_BROADCAST(10606, "Tes Delete Broadcast TemplateId"),

    /**
     * Tes Execution Broadcast TemplateId
     */
    TES_EXECUTION_BROADCAST(10610, "Tes Execution Broadcast TemplateId"),

    /**
     * Tes Response TemplateId
     */
    TES_RESPONSE(10611, "Tes Response TemplateId"),

    /**
     * Tes Trade Broadcast TemplateId
     */
    TES_TRADE_BROADCAST(10614, "Tes Trade Broadcast TemplateId"),

    /**
     * Tes Trading Session Status Broadcast TemplateId
     */
    TES_TRADING_SESSION_STATUS_BROADCAST(10615, "Tes Trading Session Status Broadcast TemplateId"),

    /**
     * Tm Trading Session Status Broadcast TemplateId
     */
    TM_TRADING_SESSION_STATUS_BROADCAST(10501, "Tm Trading Session Status Broadcast TemplateId"),

    /**
     * Throttle Update Notification TemplateId
     */
    THROTTLE_UPDATE_NOTIFICATION(10028, "Throttle Update Notification TemplateId"),

    /**
     * Trade Broadcast TemplateId
     */
    TRADE_BROADCAST(10500, "Trade Broadcast TemplateId"),

    /**
     * Trading Session Status Broadcast TemplateId
     */
    TRADING_SESSION_STATUS_BROADCAST(10307, "Trading Session Status Broadcast TemplateId"),

    /**
     * Trailing Stop Update Notification TemplateId
     */
    TRAILING_STOP_UPDATE_NOTIFICATION(10127, "Trailing Stop Update Notification TemplateId"),

    /**
     * Unsubscribe Request TemplateId
     */
    UNSUBSCRIBE_REQUEST(10006, "Unsubscribe Request TemplateId"),

    /**
     * Unsubscribe Response TemplateId
     */
    UNSUBSCRIBE_RESPONSE(10007, "Unsubscribe Response TemplateId"),

    /**
     * User Login Request TemplateId
     */
    USER_LOGIN_REQUEST(10018, "User Login Request TemplateId"),

    /**
     * User Login Response TemplateId
     */
    USER_LOGIN_RESPONSE(10019, "User Login Response TemplateId"),

    /**
     * User Logout Request TemplateId
     */
    USER_LOGOUT_REQUEST(10029, "User Logout Request TemplateId"),

    /**
     * User Logout Response TemplateId
     */
    USER_LOGOUT_RESPONSE(10024, "User Logout Response TemplateId"),

    /**
     * Xetra En Light Create Deal Notification TemplateId
     */
    XETRA_EN_LIGHT_CREATE_DEAL_NOTIFICATION(10808, "Xetra En Light Create Deal Notification TemplateId"),

    /**
     * Xetra En Light Deal Response TemplateId
     */
    XETRA_EN_LIGHT_DEAL_RESPONSE(10805, "Xetra En Light Deal Response TemplateId"),

    /**
     * Xetra En Light Enter Quote Request TemplateId
     */
    XETRA_EN_LIGHT_ENTER_QUOTE_REQUEST(10802, "Xetra En Light Enter Quote Request TemplateId"),

    /**
     * Xetra En Light Hit Quote Request TemplateId
     */
    XETRA_EN_LIGHT_HIT_QUOTE_REQUEST(10804, "Xetra En Light Hit Quote Request TemplateId"),

    /**
     * Xetra En Light Negotiation Notification TemplateId
     */
    XETRA_EN_LIGHT_NEGOTIATION_NOTIFICATION(10813, "Xetra En Light Negotiation Notification TemplateId"),

    /**
     * Xetra En Light Negotiation Requester Notification TemplateId
     */
    XETRA_EN_LIGHT_NEGOTIATION_REQUESTER_NOTIFICATION(10812, "Xetra En Light Negotiation Requester Notification TemplateId"),

    /**
     * Xetra En Light Negotiation Status Notification TemplateId
     */
    XETRA_EN_LIGHT_NEGOTIATION_STATUS_NOTIFICATION(10815, "Xetra En Light Negotiation Status Notification TemplateId"),

    /**
     * Xetra En Light Open Negotiation Notification TemplateId
     */
    XETRA_EN_LIGHT_OPEN_NEGOTIATION_NOTIFICATION(10811, "Xetra En Light Open Negotiation Notification TemplateId"),

    /**
     * Xetra En Light Open Negotiation Request TemplateId
     */
    XETRA_EN_LIGHT_OPEN_NEGOTIATION_REQUEST(10800, "Xetra En Light Open Negotiation Request TemplateId"),

    /**
     * Xetra En Light Open Negotiation Requester Notification TemplateId
     */
    XETRA_EN_LIGHT_OPEN_NEGOTIATION_REQUESTER_NOTIFICATION(10810, "Xetra En Light Open Negotiation Requester Notification TemplateId"),

    /**
     * Xetra En Light Quote Notification TemplateId
     */
    XETRA_EN_LIGHT_QUOTE_NOTIFICATION(10807, "Xetra En Light Quote Notification TemplateId"),

    /**
     * Xetra En Light Quote Requester Notification TemplateId
     */
    XETRA_EN_LIGHT_QUOTE_REQUESTER_NOTIFICATION(10816, "Xetra En Light Quote Requester Notification TemplateId"),

    /**
     * Xetra En Light Quote Response TemplateId
     */
    XETRA_EN_LIGHT_QUOTE_RESPONSE(10803, "Xetra En Light Quote Response TemplateId"),

    /**
     * Xetra En Light Quoting Status Request TemplateId
     */
    XETRA_EN_LIGHT_QUOTING_STATUS_REQUEST(10817, "Xetra En Light Quoting Status Request TemplateId"),

    /**
     * Xetra En Light Status Broadcast TemplateId
     */
    XETRA_EN_LIGHT_STATUS_BROADCAST(10814, "Xetra En Light Status Broadcast TemplateId"),

    /**
     * Xetra En Light Update Negotiation Request TemplateId
     */
    XETRA_EN_LIGHT_UPDATE_NEGOTIATION_REQUEST(10801, "Xetra En Light Update Negotiation Request TemplateId");

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
            case 65535 -> Optional.of(NO_VALUE);
            case 10603 -> Optional.of(APPROVE_TES_TRADE_REQUEST);
            case 10414 -> Optional.of(BEST_QUOTE_EXECUTION_REPORT);
            case 10413 -> Optional.of(BEST_QUOTE_RESPONSE);
            case 10032 -> Optional.of(BROADCAST_ERROR_NOTIFICATION);
            case 10118 -> Optional.of(CROSS_REQUEST);
            case 10119 -> Optional.of(CROSS_REQUEST_RESPONSE);
            case 10122 -> Optional.of(DELETE_ALL_ORDER_BROADCAST);
            case 10124 -> Optional.of(DELETE_ALL_ORDER_NR_RESPONSE);
            case 10308 -> Optional.of(DELETE_ALL_ORDER_QUOTE_EVENT_BROADCAST);
            case 10120 -> Optional.of(DELETE_ALL_ORDER_REQUEST);
            case 10121 -> Optional.of(DELETE_ALL_ORDER_RESPONSE);
            case 10410 -> Optional.of(DELETE_ALL_QUOTE_BROADCAST);
            case 10408 -> Optional.of(DELETE_ALL_QUOTE_REQUEST);
            case 10409 -> Optional.of(DELETE_ALL_QUOTE_RESPONSE);
            case 10112 -> Optional.of(DELETE_ORDER_BROADCAST);
            case 10111 -> Optional.of(DELETE_ORDER_NR_RESPONSE);
            case 10110 -> Optional.of(DELETE_ORDER_RESPONSE);
            case 10109 -> Optional.of(DELETE_ORDER_SINGLE_REQUEST);
            case 10602 -> Optional.of(DELETE_TES_TRADE_REQUEST);
            case 10412 -> Optional.of(ENTER_BEST_QUOTE_REQUEST);
            case 10600 -> Optional.of(ENTER_TES_TRADE_REQUEST);
            case 10128 -> Optional.of(EXTENDED_DELETION_REPORT);
            case 10012 -> Optional.of(FORCED_LOGOUT_NOTIFICATION);
            case 10043 -> Optional.of(FORCED_USER_LOGOUT_NOTIFICATION);
            case 10011 -> Optional.of(HEARTBEAT);
            case 10023 -> Optional.of(HEARTBEAT_NOTIFICATION);
            case 10040 -> Optional.of(INQUIRE_ENRICHMENT_RULE_ID_LIST_REQUEST);
            case 10041 -> Optional.of(INQUIRE_ENRICHMENT_RULE_ID_LIST_RESPONSE);
            case 10035 -> Optional.of(INQUIRE_SESSION_LIST_REQUEST);
            case 10036 -> Optional.of(INQUIRE_SESSION_LIST_RESPONSE);
            case 10038 -> Optional.of(INQUIRE_USER_REQUEST);
            case 10039 -> Optional.of(INQUIRE_USER_RESPONSE);
            case 10316 -> Optional.of(ISSUER_NOTIFICATION);
            case 10314 -> Optional.of(ISSUER_SECURITY_STATE_CHANGE_REQUEST);
            case 10315 -> Optional.of(ISSUER_SECURITY_STATE_CHANGE_RESPONSE);
            case 10037 -> Optional.of(LEGAL_NOTIFICATION_BROADCAST);
            case 10000 -> Optional.of(LOGON_REQUEST);
            case 10001 -> Optional.of(LOGON_RESPONSE);
            case 10002 -> Optional.of(LOGOUT_REQUEST);
            case 10003 -> Optional.of(LOGOUT_RESPONSE);
            case 10405 -> Optional.of(MASS_QUOTE_REQUEST);
            case 10406 -> Optional.of(MASS_QUOTE_RESPONSE);
            case 10108 -> Optional.of(MODIFY_ORDER_NR_RESPONSE);
            case 10107 -> Optional.of(MODIFY_ORDER_RESPONSE);
            case 10106 -> Optional.of(MODIFY_ORDER_SINGLE_REQUEST);
            case 10126 -> Optional.of(MODIFY_ORDER_SINGLE_SHORT_REQUEST);
            case 10601 -> Optional.of(MODIFY_TES_TRADE_REQUEST);
            case 10102 -> Optional.of(NEW_ORDER_NR_RESPONSE);
            case 10101 -> Optional.of(NEW_ORDER_RESPONSE);
            case 10100 -> Optional.of(NEW_ORDER_SINGLE_REQUEST);
            case 10125 -> Optional.of(NEW_ORDER_SINGLE_SHORT_REQUEST);
            case 10031 -> Optional.of(NEWS_BROADCAST);
            case 10104 -> Optional.of(ORDER_EXEC_NOTIFICATION);
            case 10117 -> Optional.of(ORDER_EXEC_REPORT_BROADCAST);
            case 10103 -> Optional.of(ORDER_EXEC_RESPONSE);
            case 10042 -> Optional.of(PARTY_ACTION_REPORT);
            case 10034 -> Optional.of(PARTY_ENTITLEMENTS_UPDATE_REPORT);
            case 10411 -> Optional.of(QUOTE_ACTIVATION_NOTIFICATION);
            case 10403 -> Optional.of(QUOTE_ACTIVATION_REQUEST);
            case 10404 -> Optional.of(QUOTE_ACTIVATION_RESPONSE);
            case 10407 -> Optional.of(QUOTE_EXECUTION_REPORT);
            case 10415 -> Optional.of(RFQ_BROADCAST);
            case 10420 -> Optional.of(RFQ_REJECT_NOTIFICATION);
            case 10401 -> Optional.of(RFQ_REQUEST);
            case 10402 -> Optional.of(RFQ_RESPONSE);
            case 10419 -> Optional.of(RFQ_SPECIALIST_BROADCAST);
            case 10010 -> Optional.of(REJECT);
            case 10026 -> Optional.of(RETRANSMIT_ME_MESSAGE_REQUEST);
            case 10027 -> Optional.of(RETRANSMIT_ME_MESSAGE_RESPONSE);
            case 10008 -> Optional.of(RETRANSMIT_REQUEST);
            case 10009 -> Optional.of(RETRANSMIT_RESPONSE);
            case 10030 -> Optional.of(SERVICE_AVAILABILITY_BROADCAST);
            case 10044 -> Optional.of(SERVICE_AVAILABILITY_MARKET_BROADCAST);
            case 10418 -> Optional.of(SINGLE_QUOTE_REQUEST);
            case 10137 -> Optional.of(SPECIALIST_DELETE_ALL_ORDER_BROADCAST);
            case 10319 -> Optional.of(SPECIALIST_INSTRUMENT_EVENT_NOTIFICATION);
            case 10136 -> Optional.of(SPECIALIST_ORDER_BOOK_NOTIFICATION);
            case 10421 -> Optional.of(SPECIALIST_RFQ_REJECT_REQUEST);
            case 10424 -> Optional.of(SPECIALIST_RFQ_REPLY_NOTIFICATION);
            case 10422 -> Optional.of(SPECIALIST_RFQ_REPLY_REQUEST);
            case 10423 -> Optional.of(SPECIALIST_RFQ_REPLY_RESPONSE);
            case 10317 -> Optional.of(SPECIALIST_SECURITY_STATE_CHANGE_REQUEST);
            case 10318 -> Optional.of(SPECIALIST_SECURITY_STATE_CHANGE_RESPONSE);
            case 10025 -> Optional.of(SUBSCRIBE_REQUEST);
            case 10005 -> Optional.of(SUBSCRIBE_RESPONSE);
            case 10607 -> Optional.of(TES_APPROVE_BROADCAST);
            case 10604 -> Optional.of(TES_BROADCAST);
            case 10606 -> Optional.of(TES_DELETE_BROADCAST);
            case 10610 -> Optional.of(TES_EXECUTION_BROADCAST);
            case 10611 -> Optional.of(TES_RESPONSE);
            case 10614 -> Optional.of(TES_TRADE_BROADCAST);
            case 10615 -> Optional.of(TES_TRADING_SESSION_STATUS_BROADCAST);
            case 10501 -> Optional.of(TM_TRADING_SESSION_STATUS_BROADCAST);
            case 10028 -> Optional.of(THROTTLE_UPDATE_NOTIFICATION);
            case 10500 -> Optional.of(TRADE_BROADCAST);
            case 10307 -> Optional.of(TRADING_SESSION_STATUS_BROADCAST);
            case 10127 -> Optional.of(TRAILING_STOP_UPDATE_NOTIFICATION);
            case 10006 -> Optional.of(UNSUBSCRIBE_REQUEST);
            case 10007 -> Optional.of(UNSUBSCRIBE_RESPONSE);
            case 10018 -> Optional.of(USER_LOGIN_REQUEST);
            case 10019 -> Optional.of(USER_LOGIN_RESPONSE);
            case 10029 -> Optional.of(USER_LOGOUT_REQUEST);
            case 10024 -> Optional.of(USER_LOGOUT_RESPONSE);
            case 10808 -> Optional.of(XETRA_EN_LIGHT_CREATE_DEAL_NOTIFICATION);
            case 10805 -> Optional.of(XETRA_EN_LIGHT_DEAL_RESPONSE);
            case 10802 -> Optional.of(XETRA_EN_LIGHT_ENTER_QUOTE_REQUEST);
            case 10804 -> Optional.of(XETRA_EN_LIGHT_HIT_QUOTE_REQUEST);
            case 10813 -> Optional.of(XETRA_EN_LIGHT_NEGOTIATION_NOTIFICATION);
            case 10812 -> Optional.of(XETRA_EN_LIGHT_NEGOTIATION_REQUESTER_NOTIFICATION);
            case 10815 -> Optional.of(XETRA_EN_LIGHT_NEGOTIATION_STATUS_NOTIFICATION);
            case 10811 -> Optional.of(XETRA_EN_LIGHT_OPEN_NEGOTIATION_NOTIFICATION);
            case 10800 -> Optional.of(XETRA_EN_LIGHT_OPEN_NEGOTIATION_REQUEST);
            case 10810 -> Optional.of(XETRA_EN_LIGHT_OPEN_NEGOTIATION_REQUESTER_NOTIFICATION);
            case 10807 -> Optional.of(XETRA_EN_LIGHT_QUOTE_NOTIFICATION);
            case 10816 -> Optional.of(XETRA_EN_LIGHT_QUOTE_REQUESTER_NOTIFICATION);
            case 10803 -> Optional.of(XETRA_EN_LIGHT_QUOTE_RESPONSE);
            case 10817 -> Optional.of(XETRA_EN_LIGHT_QUOTING_STATUS_REQUEST);
            case 10814 -> Optional.of(XETRA_EN_LIGHT_STATUS_BROADCAST);
            case 10801 -> Optional.of(XETRA_EN_LIGHT_UPDATE_NEGOTIATION_REQUEST);
            default -> Optional.empty();
        };
    }
}
