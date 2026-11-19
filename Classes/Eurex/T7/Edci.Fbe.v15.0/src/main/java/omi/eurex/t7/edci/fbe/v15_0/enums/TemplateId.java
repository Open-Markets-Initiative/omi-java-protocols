package omi.eurex.t7.edci.fbe.v15_0.enums;

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
     * Cross Request Notification TemplateId
     */
    CROSS_REQUEST_NOTIFICATION(10907, "Cross Request Notification TemplateId"),

    /**
     * Delete Order Broadcast TemplateId
     */
    DELETE_ORDER_BROADCAST(10902, "Delete Order Broadcast TemplateId"),

    /**
     * Enter Clip Request Notification TemplateId
     */
    ENTER_CLIP_REQUEST_NOTIFICATION(10906, "Enter Clip Request Notification TemplateId"),

    /**
     * Forced Logout Notification TemplateId
     */
    FORCED_LOGOUT_NOTIFICATION(10012, "Forced Logout Notification TemplateId"),

    /**
     * Heartbeat TemplateId
     */
    HEARTBEAT(10011, "Heartbeat TemplateId"),

    /**
     * Heartbeat Notification TemplateId
     */
    HEARTBEAT_NOTIFICATION(10023, "Heartbeat Notification TemplateId"),

    /**
     * Legal Notification Broadcast TemplateId
     */
    LEGAL_NOTIFICATION_BROADCAST(10035, "Legal Notification Broadcast TemplateId"),

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
     * Order Exec Report Broadcast TemplateId
     */
    ORDER_EXEC_REPORT_BROADCAST(10901, "Order Exec Report Broadcast TemplateId"),

    /**
     * Order Reject Notification TemplateId
     */
    ORDER_REJECT_NOTIFICATION(10014, "Order Reject Notification TemplateId"),

    /**
     * Partition List Notification TemplateId
     */
    PARTITION_LIST_NOTIFICATION(10037, "Partition List Notification TemplateId"),

    /**
     * Party Action Report TemplateId
     */
    PARTY_ACTION_REPORT(10038, "Party Action Report TemplateId"),

    /**
     * Party Entitlements Update Report TemplateId
     */
    PARTY_ENTITLEMENTS_UPDATE_REPORT(10034, "Party Entitlements Update Report TemplateId"),

    /**
     * Reject TemplateId
     */
    REJECT(10010, "Reject TemplateId"),

    /**
     * Retransmit Request TemplateId
     */
    RETRANSMIT_REQUEST(10008, "Retransmit Request TemplateId"),

    /**
     * Retransmit Response TemplateId
     */
    RETRANSMIT_RESPONSE(10009, "Retransmit Response TemplateId"),

    /**
     * Rfq Notification TemplateId
     */
    RFQ_NOTIFICATION(10905, "Rfq Notification TemplateId"),

    /**
     * Risk Notification Broadcast TemplateId
     */
    RISK_NOTIFICATION_BROADCAST(10033, "Risk Notification Broadcast TemplateId"),

    /**
     * Service Availability Market Broadcast TemplateId
     */
    SERVICE_AVAILABILITY_MARKET_BROADCAST(10044, "Service Availability Market Broadcast TemplateId"),

    /**
     * Session List Notification TemplateId
     */
    SESSION_LIST_NOTIFICATION(10036, "Session List Notification TemplateId"),

    /**
     * Session Status Broadcast TemplateId
     */
    SESSION_STATUS_BROADCAST(10903, "Session Status Broadcast TemplateId"),

    /**
     * Status Broadcast TemplateId
     */
    STATUS_BROADCAST(10045, "Status Broadcast TemplateId"),

    /**
     * Trading Action Request TemplateId
     */
    TRADING_ACTION_REQUEST(10908, "Trading Action Request TemplateId"),

    /**
     * Trading Action Response TemplateId
     */
    TRADING_ACTION_RESPONSE(10909, "Trading Action Response TemplateId"),

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
            case 10907 -> Optional.of(CROSS_REQUEST_NOTIFICATION);
            case 10902 -> Optional.of(DELETE_ORDER_BROADCAST);
            case 10906 -> Optional.of(ENTER_CLIP_REQUEST_NOTIFICATION);
            case 10012 -> Optional.of(FORCED_LOGOUT_NOTIFICATION);
            case 10011 -> Optional.of(HEARTBEAT);
            case 10023 -> Optional.of(HEARTBEAT_NOTIFICATION);
            case 10035 -> Optional.of(LEGAL_NOTIFICATION_BROADCAST);
            case 10000 -> Optional.of(LOGON_REQUEST);
            case 10001 -> Optional.of(LOGON_RESPONSE);
            case 10002 -> Optional.of(LOGOUT_REQUEST);
            case 10003 -> Optional.of(LOGOUT_RESPONSE);
            case 10901 -> Optional.of(ORDER_EXEC_REPORT_BROADCAST);
            case 10014 -> Optional.of(ORDER_REJECT_NOTIFICATION);
            case 10037 -> Optional.of(PARTITION_LIST_NOTIFICATION);
            case 10038 -> Optional.of(PARTY_ACTION_REPORT);
            case 10034 -> Optional.of(PARTY_ENTITLEMENTS_UPDATE_REPORT);
            case 10010 -> Optional.of(REJECT);
            case 10008 -> Optional.of(RETRANSMIT_REQUEST);
            case 10009 -> Optional.of(RETRANSMIT_RESPONSE);
            case 10905 -> Optional.of(RFQ_NOTIFICATION);
            case 10033 -> Optional.of(RISK_NOTIFICATION_BROADCAST);
            case 10044 -> Optional.of(SERVICE_AVAILABILITY_MARKET_BROADCAST);
            case 10036 -> Optional.of(SESSION_LIST_NOTIFICATION);
            case 10903 -> Optional.of(SESSION_STATUS_BROADCAST);
            case 10045 -> Optional.of(STATUS_BROADCAST);
            case 10908 -> Optional.of(TRADING_ACTION_REQUEST);
            case 10909 -> Optional.of(TRADING_ACTION_RESPONSE);
            case 10018 -> Optional.of(USER_LOGIN_REQUEST);
            case 10019 -> Optional.of(USER_LOGIN_RESPONSE);
            case 10029 -> Optional.of(USER_LOGOUT_REQUEST);
            case 10024 -> Optional.of(USER_LOGOUT_RESPONSE);
            default -> Optional.empty();
        };
    }
}
