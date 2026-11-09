package omi.eurex.t7.eti.fbe.v10_0.enums;

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
     * Add Complex Instrument Request TemplateId
     */
    ADD_COMPLEX_INSTRUMENT_REQUEST(10301, "Add Complex Instrument Request TemplateId"),

    /**
     * Add Complex Instrument Response TemplateId
     */
    ADD_COMPLEX_INSTRUMENT_RESPONSE(10302, "Add Complex Instrument Response TemplateId"),

    /**
     * Add Flexible Instrument Request TemplateId
     */
    ADD_FLEXIBLE_INSTRUMENT_REQUEST(10309, "Add Flexible Instrument Request TemplateId"),

    /**
     * Add Flexible Instrument Response TemplateId
     */
    ADD_FLEXIBLE_INSTRUMENT_RESPONSE(10310, "Add Flexible Instrument Response TemplateId"),

    /**
     * Amend Basket Trade Request TemplateId
     */
    AMEND_BASKET_TRADE_REQUEST(10629, "Amend Basket Trade Request TemplateId"),

    /**
     * Approve Basket Trade Request TemplateId
     */
    APPROVE_BASKET_TRADE_REQUEST(10623, "Approve Basket Trade Request TemplateId"),

    /**
     * Approve Reverse Tes Trade Request TemplateId
     */
    APPROVE_REVERSE_TES_TRADE_REQUEST(10631, "Approve Reverse Tes Trade Request TemplateId"),

    /**
     * Approve Tes Trade Request TemplateId
     */
    APPROVE_TES_TRADE_REQUEST(10603, "Approve Tes Trade Request TemplateId"),

    /**
     * Basket Approve Broadcast TemplateId
     */
    BASKET_APPROVE_BROADCAST(10627, "Basket Approve Broadcast TemplateId"),

    /**
     * Basket Broadcast TemplateId
     */
    BASKET_BROADCAST(10625, "Basket Broadcast TemplateId"),

    /**
     * Basket Delete Broadcast TemplateId
     */
    BASKET_DELETE_BROADCAST(10626, "Basket Delete Broadcast TemplateId"),

    /**
     * Basket Execution Broadcast TemplateId
     */
    BASKET_EXECUTION_BROADCAST(10628, "Basket Execution Broadcast TemplateId"),

    /**
     * Basket Response TemplateId
     */
    BASKET_RESPONSE(10624, "Basket Response TemplateId"),

    /**
     * Broadcast Error Notification TemplateId
     */
    BROADCAST_ERROR_NOTIFICATION(10032, "Broadcast Error Notification TemplateId"),

    /**
     * Clip Deletion Notification TemplateId
     */
    CLIP_DELETION_NOTIFICATION(10134, "Clip Deletion Notification TemplateId"),

    /**
     * Clip Execution Notification TemplateId
     */
    CLIP_EXECUTION_NOTIFICATION(10135, "Clip Execution Notification TemplateId"),

    /**
     * Clip Response TemplateId
     */
    CLIP_RESPONSE(10133, "Clip Response TemplateId"),

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
     * Delete Basket Trade Request TemplateId
     */
    DELETE_BASKET_TRADE_REQUEST(10622, "Delete Basket Trade Request TemplateId"),

    /**
     * Delete Clip Request TemplateId
     */
    DELETE_CLIP_REQUEST(10132, "Delete Clip Request TemplateId"),

    /**
     * Delete Order Broadcast TemplateId
     */
    DELETE_ORDER_BROADCAST(10112, "Delete Order Broadcast TemplateId"),

    /**
     * Delete Order Complex Request TemplateId
     */
    DELETE_ORDER_COMPLEX_REQUEST(10123, "Delete Order Complex Request TemplateId"),

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
     * Enter Basket Trade Request TemplateId
     */
    ENTER_BASKET_TRADE_REQUEST(10620, "Enter Basket Trade Request TemplateId"),

    /**
     * Enter Clip Request TemplateId
     */
    ENTER_CLIP_REQUEST(10131, "Enter Clip Request TemplateId"),

    /**
     * Enter Tes Trade Request TemplateId
     */
    ENTER_TES_TRADE_REQUEST(10600, "Enter Tes Trade Request TemplateId"),

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
     * Inquire Mm Parameter Request TemplateId
     */
    INQUIRE_MM_PARAMETER_REQUEST(10305, "Inquire Mm Parameter Request TemplateId"),

    /**
     * Inquire Mm Parameter Response TemplateId
     */
    INQUIRE_MM_PARAMETER_RESPONSE(10306, "Inquire Mm Parameter Response TemplateId"),

    /**
     * Inquire Pre Trade Risk Limits Request TemplateId
     */
    INQUIRE_PRE_TRADE_RISK_LIMITS_REQUEST(10311, "Inquire Pre Trade Risk Limits Request TemplateId"),

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
     * Mm Parameter Definition Request TemplateId
     */
    MM_PARAMETER_DEFINITION_REQUEST(10303, "Mm Parameter Definition Request TemplateId"),

    /**
     * Mm Parameter Definition Response TemplateId
     */
    MM_PARAMETER_DEFINITION_RESPONSE(10304, "Mm Parameter Definition Response TemplateId"),

    /**
     * Mass Quote Request TemplateId
     */
    MASS_QUOTE_REQUEST(10405, "Mass Quote Request TemplateId"),

    /**
     * Mass Quote Response TemplateId
     */
    MASS_QUOTE_RESPONSE(10406, "Mass Quote Response TemplateId"),

    /**
     * Modify Basket Trade Request TemplateId
     */
    MODIFY_BASKET_TRADE_REQUEST(10621, "Modify Basket Trade Request TemplateId"),

    /**
     * Modify Order Complex Request TemplateId
     */
    MODIFY_ORDER_COMPLEX_REQUEST(10114, "Modify Order Complex Request TemplateId"),

    /**
     * Modify Order Complex Short Request TemplateId
     */
    MODIFY_ORDER_COMPLEX_SHORT_REQUEST(10130, "Modify Order Complex Short Request TemplateId"),

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
     * New Order Complex Request TemplateId
     */
    NEW_ORDER_COMPLEX_REQUEST(10113, "New Order Complex Request TemplateId"),

    /**
     * New Order Complex Short Request TemplateId
     */
    NEW_ORDER_COMPLEX_SHORT_REQUEST(10129, "New Order Complex Short Request TemplateId"),

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
     * Ping Request TemplateId
     */
    PING_REQUEST(10320, "Ping Request TemplateId"),

    /**
     * Ping Response TemplateId
     */
    PING_RESPONSE(10321, "Ping Response TemplateId"),

    /**
     * Pre Trade Risk Limit Response TemplateId
     */
    PRE_TRADE_RISK_LIMIT_RESPONSE(10313, "Pre Trade Risk Limit Response TemplateId"),

    /**
     * Pre Trade Risk Limits Definition Request TemplateId
     */
    PRE_TRADE_RISK_LIMITS_DEFINITION_REQUEST(10312, "Pre Trade Risk Limits Definition Request TemplateId"),

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
     * Rfq Request TemplateId
     */
    RFQ_REQUEST(10401, "Rfq Request TemplateId"),

    /**
     * Rfq Response TemplateId
     */
    RFQ_RESPONSE(10402, "Rfq Response TemplateId"),

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
     * Reverse Tes Trade Request TemplateId
     */
    REVERSE_TES_TRADE_REQUEST(10630, "Reverse Tes Trade Request TemplateId"),

    /**
     * Risk Notification Broadcast TemplateId
     */
    RISK_NOTIFICATION_BROADCAST(10033, "Risk Notification Broadcast TemplateId"),

    /**
     * Srqs Create Deal Notification TemplateId
     */
    SRQS_CREATE_DEAL_NOTIFICATION(10708, "Srqs Create Deal Notification TemplateId"),

    /**
     * Srqs Deal Notification TemplateId
     */
    SRQS_DEAL_NOTIFICATION(10709, "Srqs Deal Notification TemplateId"),

    /**
     * Srqs Deal Response TemplateId
     */
    SRQS_DEAL_RESPONSE(10705, "Srqs Deal Response TemplateId"),

    /**
     * Srqs Enter Quote Request TemplateId
     */
    SRQS_ENTER_QUOTE_REQUEST(10702, "Srqs Enter Quote Request TemplateId"),

    /**
     * Srqs Hit Quote Request TemplateId
     */
    SRQS_HIT_QUOTE_REQUEST(10704, "Srqs Hit Quote Request TemplateId"),

    /**
     * Srqs Inquire Smart Respondent Request TemplateId
     */
    SRQS_INQUIRE_SMART_RESPONDENT_REQUEST(10718, "Srqs Inquire Smart Respondent Request TemplateId"),

    /**
     * Srqs Inquire Smart Respondent Response TemplateId
     */
    SRQS_INQUIRE_SMART_RESPONDENT_RESPONSE(10719, "Srqs Inquire Smart Respondent Response TemplateId"),

    /**
     * Srqs Negotiation Notification TemplateId
     */
    SRQS_NEGOTIATION_NOTIFICATION(10713, "Srqs Negotiation Notification TemplateId"),

    /**
     * Srqs Negotiation Requester Notification TemplateId
     */
    SRQS_NEGOTIATION_REQUESTER_NOTIFICATION(10712, "Srqs Negotiation Requester Notification TemplateId"),

    /**
     * Srqs Negotiation Status Notification TemplateId
     */
    SRQS_NEGOTIATION_STATUS_NOTIFICATION(10715, "Srqs Negotiation Status Notification TemplateId"),

    /**
     * Srqs Open Negotiation Notification TemplateId
     */
    SRQS_OPEN_NEGOTIATION_NOTIFICATION(10711, "Srqs Open Negotiation Notification TemplateId"),

    /**
     * Srqs Open Negotiation Request TemplateId
     */
    SRQS_OPEN_NEGOTIATION_REQUEST(10700, "Srqs Open Negotiation Request TemplateId"),

    /**
     * Srqs Open Negotiation Requester Notification TemplateId
     */
    SRQS_OPEN_NEGOTIATION_REQUESTER_NOTIFICATION(10710, "Srqs Open Negotiation Requester Notification TemplateId"),

    /**
     * Srqs Quote Notification TemplateId
     */
    SRQS_QUOTE_NOTIFICATION(10707, "Srqs Quote Notification TemplateId"),

    /**
     * Srqs Quote Response TemplateId
     */
    SRQS_QUOTE_RESPONSE(10703, "Srqs Quote Response TemplateId"),

    /**
     * Srqs Quoting Status Request TemplateId
     */
    SRQS_QUOTING_STATUS_REQUEST(10717, "Srqs Quoting Status Request TemplateId"),

    /**
     * Srqs Status Broadcast TemplateId
     */
    SRQS_STATUS_BROADCAST(10714, "Srqs Status Broadcast TemplateId"),

    /**
     * Srqs Update Deal Status Request TemplateId
     */
    SRQS_UPDATE_DEAL_STATUS_REQUEST(10706, "Srqs Update Deal Status Request TemplateId"),

    /**
     * Srqs Update Negotiation Request TemplateId
     */
    SRQS_UPDATE_NEGOTIATION_REQUEST(10701, "Srqs Update Negotiation Request TemplateId"),

    /**
     * Service Availability Broadcast TemplateId
     */
    SERVICE_AVAILABILITY_BROADCAST(10030, "Service Availability Broadcast TemplateId"),

    /**
     * Service Availability Market Broadcast TemplateId
     */
    SERVICE_AVAILABILITY_MARKET_BROADCAST(10044, "Service Availability Market Broadcast TemplateId"),

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
     * Tes Compression Run Status Broadcast TemplateId
     */
    TES_COMPRESSION_RUN_STATUS_BROADCAST(10618, "Tes Compression Run Status Broadcast TemplateId"),

    /**
     * Tes Compression Run Status Request TemplateId
     */
    TES_COMPRESSION_RUN_STATUS_REQUEST(10616, "Tes Compression Run Status Request TemplateId"),

    /**
     * Tes Compression Run Status Response TemplateId
     */
    TES_COMPRESSION_RUN_STATUS_RESPONSE(10617, "Tes Compression Run Status Response TemplateId"),

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
     * Tes Reversal Broadcast TemplateId
     */
    TES_REVERSAL_BROADCAST(10632, "Tes Reversal Broadcast TemplateId"),

    /**
     * Tes Trade Broadcast TemplateId
     */
    TES_TRADE_BROADCAST(10614, "Tes Trade Broadcast TemplateId"),

    /**
     * Tes Trading Session Status Broadcast TemplateId
     */
    TES_TRADING_SESSION_STATUS_BROADCAST(10615, "Tes Trading Session Status Broadcast TemplateId"),

    /**
     * Tes Upload Broadcast TemplateId
     */
    TES_UPLOAD_BROADCAST(10613, "Tes Upload Broadcast TemplateId"),

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
     * Unsubscribe Request TemplateId
     */
    UNSUBSCRIBE_REQUEST(10006, "Unsubscribe Request TemplateId"),

    /**
     * Unsubscribe Response TemplateId
     */
    UNSUBSCRIBE_RESPONSE(10007, "Unsubscribe Response TemplateId"),

    /**
     * Upload Tes Trade Request TemplateId
     */
    UPLOAD_TES_TRADE_REQUEST(10612, "Upload Tes Trade Request TemplateId"),

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
    USER_LOGOUT_RESPONSE(10024, "User Logout Response TemplateId");

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
            case 10301 -> Optional.of(ADD_COMPLEX_INSTRUMENT_REQUEST);
            case 10302 -> Optional.of(ADD_COMPLEX_INSTRUMENT_RESPONSE);
            case 10309 -> Optional.of(ADD_FLEXIBLE_INSTRUMENT_REQUEST);
            case 10310 -> Optional.of(ADD_FLEXIBLE_INSTRUMENT_RESPONSE);
            case 10629 -> Optional.of(AMEND_BASKET_TRADE_REQUEST);
            case 10623 -> Optional.of(APPROVE_BASKET_TRADE_REQUEST);
            case 10631 -> Optional.of(APPROVE_REVERSE_TES_TRADE_REQUEST);
            case 10603 -> Optional.of(APPROVE_TES_TRADE_REQUEST);
            case 10627 -> Optional.of(BASKET_APPROVE_BROADCAST);
            case 10625 -> Optional.of(BASKET_BROADCAST);
            case 10626 -> Optional.of(BASKET_DELETE_BROADCAST);
            case 10628 -> Optional.of(BASKET_EXECUTION_BROADCAST);
            case 10624 -> Optional.of(BASKET_RESPONSE);
            case 10032 -> Optional.of(BROADCAST_ERROR_NOTIFICATION);
            case 10134 -> Optional.of(CLIP_DELETION_NOTIFICATION);
            case 10135 -> Optional.of(CLIP_EXECUTION_NOTIFICATION);
            case 10133 -> Optional.of(CLIP_RESPONSE);
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
            case 10622 -> Optional.of(DELETE_BASKET_TRADE_REQUEST);
            case 10132 -> Optional.of(DELETE_CLIP_REQUEST);
            case 10112 -> Optional.of(DELETE_ORDER_BROADCAST);
            case 10123 -> Optional.of(DELETE_ORDER_COMPLEX_REQUEST);
            case 10111 -> Optional.of(DELETE_ORDER_NR_RESPONSE);
            case 10110 -> Optional.of(DELETE_ORDER_RESPONSE);
            case 10109 -> Optional.of(DELETE_ORDER_SINGLE_REQUEST);
            case 10602 -> Optional.of(DELETE_TES_TRADE_REQUEST);
            case 10620 -> Optional.of(ENTER_BASKET_TRADE_REQUEST);
            case 10131 -> Optional.of(ENTER_CLIP_REQUEST);
            case 10600 -> Optional.of(ENTER_TES_TRADE_REQUEST);
            case 10012 -> Optional.of(FORCED_LOGOUT_NOTIFICATION);
            case 10043 -> Optional.of(FORCED_USER_LOGOUT_NOTIFICATION);
            case 10011 -> Optional.of(HEARTBEAT);
            case 10023 -> Optional.of(HEARTBEAT_NOTIFICATION);
            case 10040 -> Optional.of(INQUIRE_ENRICHMENT_RULE_ID_LIST_REQUEST);
            case 10041 -> Optional.of(INQUIRE_ENRICHMENT_RULE_ID_LIST_RESPONSE);
            case 10305 -> Optional.of(INQUIRE_MM_PARAMETER_REQUEST);
            case 10306 -> Optional.of(INQUIRE_MM_PARAMETER_RESPONSE);
            case 10311 -> Optional.of(INQUIRE_PRE_TRADE_RISK_LIMITS_REQUEST);
            case 10035 -> Optional.of(INQUIRE_SESSION_LIST_REQUEST);
            case 10036 -> Optional.of(INQUIRE_SESSION_LIST_RESPONSE);
            case 10038 -> Optional.of(INQUIRE_USER_REQUEST);
            case 10039 -> Optional.of(INQUIRE_USER_RESPONSE);
            case 10037 -> Optional.of(LEGAL_NOTIFICATION_BROADCAST);
            case 10000 -> Optional.of(LOGON_REQUEST);
            case 10001 -> Optional.of(LOGON_RESPONSE);
            case 10002 -> Optional.of(LOGOUT_REQUEST);
            case 10003 -> Optional.of(LOGOUT_RESPONSE);
            case 10303 -> Optional.of(MM_PARAMETER_DEFINITION_REQUEST);
            case 10304 -> Optional.of(MM_PARAMETER_DEFINITION_RESPONSE);
            case 10405 -> Optional.of(MASS_QUOTE_REQUEST);
            case 10406 -> Optional.of(MASS_QUOTE_RESPONSE);
            case 10621 -> Optional.of(MODIFY_BASKET_TRADE_REQUEST);
            case 10114 -> Optional.of(MODIFY_ORDER_COMPLEX_REQUEST);
            case 10130 -> Optional.of(MODIFY_ORDER_COMPLEX_SHORT_REQUEST);
            case 10108 -> Optional.of(MODIFY_ORDER_NR_RESPONSE);
            case 10107 -> Optional.of(MODIFY_ORDER_RESPONSE);
            case 10106 -> Optional.of(MODIFY_ORDER_SINGLE_REQUEST);
            case 10126 -> Optional.of(MODIFY_ORDER_SINGLE_SHORT_REQUEST);
            case 10601 -> Optional.of(MODIFY_TES_TRADE_REQUEST);
            case 10113 -> Optional.of(NEW_ORDER_COMPLEX_REQUEST);
            case 10129 -> Optional.of(NEW_ORDER_COMPLEX_SHORT_REQUEST);
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
            case 10320 -> Optional.of(PING_REQUEST);
            case 10321 -> Optional.of(PING_RESPONSE);
            case 10313 -> Optional.of(PRE_TRADE_RISK_LIMIT_RESPONSE);
            case 10312 -> Optional.of(PRE_TRADE_RISK_LIMITS_DEFINITION_REQUEST);
            case 10411 -> Optional.of(QUOTE_ACTIVATION_NOTIFICATION);
            case 10403 -> Optional.of(QUOTE_ACTIVATION_REQUEST);
            case 10404 -> Optional.of(QUOTE_ACTIVATION_RESPONSE);
            case 10407 -> Optional.of(QUOTE_EXECUTION_REPORT);
            case 10401 -> Optional.of(RFQ_REQUEST);
            case 10402 -> Optional.of(RFQ_RESPONSE);
            case 10010 -> Optional.of(REJECT);
            case 10026 -> Optional.of(RETRANSMIT_ME_MESSAGE_REQUEST);
            case 10027 -> Optional.of(RETRANSMIT_ME_MESSAGE_RESPONSE);
            case 10008 -> Optional.of(RETRANSMIT_REQUEST);
            case 10009 -> Optional.of(RETRANSMIT_RESPONSE);
            case 10630 -> Optional.of(REVERSE_TES_TRADE_REQUEST);
            case 10033 -> Optional.of(RISK_NOTIFICATION_BROADCAST);
            case 10708 -> Optional.of(SRQS_CREATE_DEAL_NOTIFICATION);
            case 10709 -> Optional.of(SRQS_DEAL_NOTIFICATION);
            case 10705 -> Optional.of(SRQS_DEAL_RESPONSE);
            case 10702 -> Optional.of(SRQS_ENTER_QUOTE_REQUEST);
            case 10704 -> Optional.of(SRQS_HIT_QUOTE_REQUEST);
            case 10718 -> Optional.of(SRQS_INQUIRE_SMART_RESPONDENT_REQUEST);
            case 10719 -> Optional.of(SRQS_INQUIRE_SMART_RESPONDENT_RESPONSE);
            case 10713 -> Optional.of(SRQS_NEGOTIATION_NOTIFICATION);
            case 10712 -> Optional.of(SRQS_NEGOTIATION_REQUESTER_NOTIFICATION);
            case 10715 -> Optional.of(SRQS_NEGOTIATION_STATUS_NOTIFICATION);
            case 10711 -> Optional.of(SRQS_OPEN_NEGOTIATION_NOTIFICATION);
            case 10700 -> Optional.of(SRQS_OPEN_NEGOTIATION_REQUEST);
            case 10710 -> Optional.of(SRQS_OPEN_NEGOTIATION_REQUESTER_NOTIFICATION);
            case 10707 -> Optional.of(SRQS_QUOTE_NOTIFICATION);
            case 10703 -> Optional.of(SRQS_QUOTE_RESPONSE);
            case 10717 -> Optional.of(SRQS_QUOTING_STATUS_REQUEST);
            case 10714 -> Optional.of(SRQS_STATUS_BROADCAST);
            case 10706 -> Optional.of(SRQS_UPDATE_DEAL_STATUS_REQUEST);
            case 10701 -> Optional.of(SRQS_UPDATE_NEGOTIATION_REQUEST);
            case 10030 -> Optional.of(SERVICE_AVAILABILITY_BROADCAST);
            case 10044 -> Optional.of(SERVICE_AVAILABILITY_MARKET_BROADCAST);
            case 10025 -> Optional.of(SUBSCRIBE_REQUEST);
            case 10005 -> Optional.of(SUBSCRIBE_RESPONSE);
            case 10607 -> Optional.of(TES_APPROVE_BROADCAST);
            case 10604 -> Optional.of(TES_BROADCAST);
            case 10618 -> Optional.of(TES_COMPRESSION_RUN_STATUS_BROADCAST);
            case 10616 -> Optional.of(TES_COMPRESSION_RUN_STATUS_REQUEST);
            case 10617 -> Optional.of(TES_COMPRESSION_RUN_STATUS_RESPONSE);
            case 10606 -> Optional.of(TES_DELETE_BROADCAST);
            case 10610 -> Optional.of(TES_EXECUTION_BROADCAST);
            case 10611 -> Optional.of(TES_RESPONSE);
            case 10632 -> Optional.of(TES_REVERSAL_BROADCAST);
            case 10614 -> Optional.of(TES_TRADE_BROADCAST);
            case 10615 -> Optional.of(TES_TRADING_SESSION_STATUS_BROADCAST);
            case 10613 -> Optional.of(TES_UPLOAD_BROADCAST);
            case 10501 -> Optional.of(TM_TRADING_SESSION_STATUS_BROADCAST);
            case 10028 -> Optional.of(THROTTLE_UPDATE_NOTIFICATION);
            case 10500 -> Optional.of(TRADE_BROADCAST);
            case 10307 -> Optional.of(TRADING_SESSION_STATUS_BROADCAST);
            case 10006 -> Optional.of(UNSUBSCRIBE_REQUEST);
            case 10007 -> Optional.of(UNSUBSCRIBE_RESPONSE);
            case 10612 -> Optional.of(UPLOAD_TES_TRADE_REQUEST);
            case 10018 -> Optional.of(USER_LOGIN_REQUEST);
            case 10019 -> Optional.of(USER_LOGIN_RESPONSE);
            case 10029 -> Optional.of(USER_LOGOUT_REQUEST);
            case 10024 -> Optional.of(USER_LOGOUT_RESPONSE);
            default -> Optional.empty();
        };
    }
}
