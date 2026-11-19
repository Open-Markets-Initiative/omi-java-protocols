package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

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
     * Broadcast Error Notification TemplateId
     */
    BROADCAST_ERROR_NOTIFICATION(10032, "Broadcast Error Notification TemplateId"),

    /**
     * Debt Inquiry Request TemplateId
     */
    DEBT_INQUIRY_REQUEST(10390, "Debt Inquiry Request TemplateId"),

    /**
     * Debt Inquiry Response TemplateId
     */
    DEBT_INQUIRY_RESPONSE(10391, "Debt Inquiry Response TemplateId"),

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
     * Forced Logout Notification TemplateId
     */
    FORCED_LOGOUT_NOTIFICATION(10012, "Forced Logout Notification TemplateId"),

    /**
     * Gateway Request TemplateId
     */
    GATEWAY_REQUEST(10020, "Gateway Request TemplateId"),

    /**
     * Gateway Response TemplateId
     */
    GATEWAY_RESPONSE(10022, "Gateway Response TemplateId"),

    /**
     * Gw Order Acknowledgement TemplateId
     */
    GW_ORDER_ACKNOWLEDGEMENT(10990, "Gw Order Acknowledgement TemplateId"),

    /**
     * Heartbeat TemplateId
     */
    HEARTBEAT(10011, "Heartbeat TemplateId"),

    /**
     * Heartbeat Notification TemplateId
     */
    HEARTBEAT_NOTIFICATION(10023, "Heartbeat Notification TemplateId"),

    /**
     * Inquire Session List Request TemplateId
     */
    INQUIRE_SESSION_LIST_REQUEST(10035, "Inquire Session List Request TemplateId"),

    /**
     * Inquire Session List Response TemplateId
     */
    INQUIRE_SESSION_LIST_RESPONSE(10036, "Inquire Session List Response TemplateId"),

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
     * Modify Order Complex Request TemplateId
     */
    MODIFY_ORDER_COMPLEX_REQUEST(10114, "Modify Order Complex Request TemplateId"),

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
     * Multi Leg Exec Report Broadcast TemplateId
     */
    MULTI_LEG_EXEC_REPORT_BROADCAST(10994, "Multi Leg Exec Report Broadcast TemplateId"),

    /**
     * Multi Leg Exec Response TemplateId
     */
    MULTI_LEG_EXEC_RESPONSE(10993, "Multi Leg Exec Response TemplateId"),

    /**
     * Multi Leg Order Reject TemplateId
     */
    MULTI_LEG_ORDER_REJECT(10992, "Multi Leg Order Reject TemplateId"),

    /**
     * Multi Leg Order Request TemplateId
     */
    MULTI_LEG_ORDER_REQUEST(10991, "Multi Leg Order Request TemplateId"),

    /**
     * New Order Complex Request TemplateId
     */
    NEW_ORDER_COMPLEX_REQUEST(10113, "New Order Complex Request TemplateId"),

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
     * Quote Exec Report Broadcast TemplateId
     */
    QUOTE_EXEC_REPORT_BROADCAST(10412, "Quote Exec Report Broadcast TemplateId"),

    /**
     * Quote Execution Report TemplateId
     */
    QUOTE_EXECUTION_REPORT(10407, "Quote Execution Report TemplateId"),

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
     * Risk Collateral Alert Admin Broadcast TemplateId
     */
    RISK_COLLATERAL_ALERT_ADMIN_BROADCAST(10048, "Risk Collateral Alert Admin Broadcast TemplateId"),

    /**
     * Risk Collateral Alert Broadcast TemplateId
     */
    RISK_COLLATERAL_ALERT_BROADCAST(10049, "Risk Collateral Alert Broadcast TemplateId"),

    /**
     * Risk Notification Broadcast TemplateId
     */
    RISK_NOTIFICATION_BROADCAST(10033, "Risk Notification Broadcast TemplateId"),

    /**
     * Service Availability Broadcast TemplateId
     */
    SERVICE_AVAILABILITY_BROADCAST(10030, "Service Availability Broadcast TemplateId"),

    /**
     * Session Password Change Request TemplateId
     */
    SESSION_PASSWORD_CHANGE_REQUEST(10997, "Session Password Change Request TemplateId"),

    /**
     * Session Password Change Response TemplateId
     */
    SESSION_PASSWORD_CHANGE_RESPONSE(10995, "Session Password Change Response TemplateId"),

    /**
     * Session Registration Request TemplateId
     */
    SESSION_REGISTRATION_REQUEST(10053, "Session Registration Request TemplateId"),

    /**
     * Session Registration Response TemplateId
     */
    SESSION_REGISTRATION_RESPONSE(10054, "Session Registration Response TemplateId"),

    /**
     * Subscribe Request TemplateId
     */
    SUBSCRIBE_REQUEST(10025, "Subscribe Request TemplateId"),

    /**
     * Subscribe Response TemplateId
     */
    SUBSCRIBE_RESPONSE(10005, "Subscribe Response TemplateId"),

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
     * Trade Enhancement Broadcast TemplateId
     */
    TRADE_ENHANCEMENT_BROADCAST(10989, "Trade Enhancement Broadcast TemplateId"),

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
     * User Password Change Request TemplateId
     */
    USER_PASSWORD_CHANGE_REQUEST(10996, "User Password Change Request TemplateId"),

    /**
     * User Password Change Response TemplateId
     */
    USER_PASSWORD_CHANGE_RESPONSE(10043, "User Password Change Response TemplateId");

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
            case 10032 -> Optional.of(BROADCAST_ERROR_NOTIFICATION);
            case 10390 -> Optional.of(DEBT_INQUIRY_REQUEST);
            case 10391 -> Optional.of(DEBT_INQUIRY_RESPONSE);
            case 10122 -> Optional.of(DELETE_ALL_ORDER_BROADCAST);
            case 10124 -> Optional.of(DELETE_ALL_ORDER_NR_RESPONSE);
            case 10308 -> Optional.of(DELETE_ALL_ORDER_QUOTE_EVENT_BROADCAST);
            case 10120 -> Optional.of(DELETE_ALL_ORDER_REQUEST);
            case 10121 -> Optional.of(DELETE_ALL_ORDER_RESPONSE);
            case 10410 -> Optional.of(DELETE_ALL_QUOTE_BROADCAST);
            case 10408 -> Optional.of(DELETE_ALL_QUOTE_REQUEST);
            case 10409 -> Optional.of(DELETE_ALL_QUOTE_RESPONSE);
            case 10112 -> Optional.of(DELETE_ORDER_BROADCAST);
            case 10123 -> Optional.of(DELETE_ORDER_COMPLEX_REQUEST);
            case 10111 -> Optional.of(DELETE_ORDER_NR_RESPONSE);
            case 10110 -> Optional.of(DELETE_ORDER_RESPONSE);
            case 10109 -> Optional.of(DELETE_ORDER_SINGLE_REQUEST);
            case 10012 -> Optional.of(FORCED_LOGOUT_NOTIFICATION);
            case 10020 -> Optional.of(GATEWAY_REQUEST);
            case 10022 -> Optional.of(GATEWAY_RESPONSE);
            case 10990 -> Optional.of(GW_ORDER_ACKNOWLEDGEMENT);
            case 10011 -> Optional.of(HEARTBEAT);
            case 10023 -> Optional.of(HEARTBEAT_NOTIFICATION);
            case 10035 -> Optional.of(INQUIRE_SESSION_LIST_REQUEST);
            case 10036 -> Optional.of(INQUIRE_SESSION_LIST_RESPONSE);
            case 10000 -> Optional.of(LOGON_REQUEST);
            case 10001 -> Optional.of(LOGON_RESPONSE);
            case 10002 -> Optional.of(LOGOUT_REQUEST);
            case 10003 -> Optional.of(LOGOUT_RESPONSE);
            case 10405 -> Optional.of(MASS_QUOTE_REQUEST);
            case 10406 -> Optional.of(MASS_QUOTE_RESPONSE);
            case 10114 -> Optional.of(MODIFY_ORDER_COMPLEX_REQUEST);
            case 10108 -> Optional.of(MODIFY_ORDER_NR_RESPONSE);
            case 10107 -> Optional.of(MODIFY_ORDER_RESPONSE);
            case 10106 -> Optional.of(MODIFY_ORDER_SINGLE_REQUEST);
            case 10126 -> Optional.of(MODIFY_ORDER_SINGLE_SHORT_REQUEST);
            case 10994 -> Optional.of(MULTI_LEG_EXEC_REPORT_BROADCAST);
            case 10993 -> Optional.of(MULTI_LEG_EXEC_RESPONSE);
            case 10992 -> Optional.of(MULTI_LEG_ORDER_REJECT);
            case 10991 -> Optional.of(MULTI_LEG_ORDER_REQUEST);
            case 10113 -> Optional.of(NEW_ORDER_COMPLEX_REQUEST);
            case 10102 -> Optional.of(NEW_ORDER_NR_RESPONSE);
            case 10101 -> Optional.of(NEW_ORDER_RESPONSE);
            case 10100 -> Optional.of(NEW_ORDER_SINGLE_REQUEST);
            case 10125 -> Optional.of(NEW_ORDER_SINGLE_SHORT_REQUEST);
            case 10031 -> Optional.of(NEWS_BROADCAST);
            case 10104 -> Optional.of(ORDER_EXEC_NOTIFICATION);
            case 10117 -> Optional.of(ORDER_EXEC_REPORT_BROADCAST);
            case 10103 -> Optional.of(ORDER_EXEC_RESPONSE);
            case 10412 -> Optional.of(QUOTE_EXEC_REPORT_BROADCAST);
            case 10407 -> Optional.of(QUOTE_EXECUTION_REPORT);
            case 10010 -> Optional.of(REJECT);
            case 10026 -> Optional.of(RETRANSMIT_ME_MESSAGE_REQUEST);
            case 10027 -> Optional.of(RETRANSMIT_ME_MESSAGE_RESPONSE);
            case 10008 -> Optional.of(RETRANSMIT_REQUEST);
            case 10009 -> Optional.of(RETRANSMIT_RESPONSE);
            case 10048 -> Optional.of(RISK_COLLATERAL_ALERT_ADMIN_BROADCAST);
            case 10049 -> Optional.of(RISK_COLLATERAL_ALERT_BROADCAST);
            case 10033 -> Optional.of(RISK_NOTIFICATION_BROADCAST);
            case 10030 -> Optional.of(SERVICE_AVAILABILITY_BROADCAST);
            case 10997 -> Optional.of(SESSION_PASSWORD_CHANGE_REQUEST);
            case 10995 -> Optional.of(SESSION_PASSWORD_CHANGE_RESPONSE);
            case 10053 -> Optional.of(SESSION_REGISTRATION_REQUEST);
            case 10054 -> Optional.of(SESSION_REGISTRATION_RESPONSE);
            case 10025 -> Optional.of(SUBSCRIBE_REQUEST);
            case 10005 -> Optional.of(SUBSCRIBE_RESPONSE);
            case 10501 -> Optional.of(TM_TRADING_SESSION_STATUS_BROADCAST);
            case 10028 -> Optional.of(THROTTLE_UPDATE_NOTIFICATION);
            case 10500 -> Optional.of(TRADE_BROADCAST);
            case 10989 -> Optional.of(TRADE_ENHANCEMENT_BROADCAST);
            case 10307 -> Optional.of(TRADING_SESSION_STATUS_BROADCAST);
            case 10006 -> Optional.of(UNSUBSCRIBE_REQUEST);
            case 10007 -> Optional.of(UNSUBSCRIBE_RESPONSE);
            case 10018 -> Optional.of(USER_LOGIN_REQUEST);
            case 10019 -> Optional.of(USER_LOGIN_RESPONSE);
            case 10029 -> Optional.of(USER_LOGOUT_REQUEST);
            case 10024 -> Optional.of(USER_LOGOUT_RESPONSE);
            case 10996 -> Optional.of(USER_PASSWORD_CHANGE_REQUEST);
            case 10043 -> Optional.of(USER_PASSWORD_CHANGE_RESPONSE);
            default -> Optional.empty();
        };
    }
}
