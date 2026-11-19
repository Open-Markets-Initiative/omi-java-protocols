package omi.iex.iexoptions.session.sbe.v1_01.enums;

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
    SUBSESSION_LEAVE_RESPONSE_MESSAGE(11, "SubsessionLeaveResponseMessage");

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
            default -> Optional.empty();
        };
    }
}
