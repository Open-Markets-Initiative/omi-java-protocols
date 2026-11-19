package omi.eurex.t7.edci.fbe.v13_1.enums;

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
     * Delete Order Broadcast TemplateId
     */
    DELETE_ORDER_BROADCAST(10902, "Delete Order Broadcast TemplateId"),

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
     * Partition List Notification TemplateId
     */
    PARTITION_LIST_NOTIFICATION(10037, "Partition List Notification TemplateId"),

    /**
     * Reject TemplateId
     */
    REJECT(10010, "Reject TemplateId"),

    /**
     * Session List Notification TemplateId
     */
    SESSION_LIST_NOTIFICATION(10036, "Session List Notification TemplateId"),

    /**
     * Session Status Broadcast TemplateId
     */
    SESSION_STATUS_BROADCAST(10903, "Session Status Broadcast TemplateId");

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
            case 10902 -> Optional.of(DELETE_ORDER_BROADCAST);
            case 10012 -> Optional.of(FORCED_LOGOUT_NOTIFICATION);
            case 10011 -> Optional.of(HEARTBEAT);
            case 10023 -> Optional.of(HEARTBEAT_NOTIFICATION);
            case 10000 -> Optional.of(LOGON_REQUEST);
            case 10001 -> Optional.of(LOGON_RESPONSE);
            case 10002 -> Optional.of(LOGOUT_REQUEST);
            case 10003 -> Optional.of(LOGOUT_RESPONSE);
            case 10901 -> Optional.of(ORDER_EXEC_REPORT_BROADCAST);
            case 10037 -> Optional.of(PARTITION_LIST_NOTIFICATION);
            case 10010 -> Optional.of(REJECT);
            case 10036 -> Optional.of(SESSION_LIST_NOTIFICATION);
            case 10903 -> Optional.of(SESSION_STATUS_BROADCAST);
            default -> Optional.empty();
        };
    }
}
