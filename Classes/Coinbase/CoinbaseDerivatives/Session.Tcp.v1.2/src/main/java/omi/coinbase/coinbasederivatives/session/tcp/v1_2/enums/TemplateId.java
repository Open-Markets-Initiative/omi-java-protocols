package omi.coinbase.coinbasederivatives.session.tcp.v1_2.enums;

import java.util.Optional;

/**
 * Template ID used to encode the message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * LogonMessage
     */
    LOGON_MESSAGE(100, "LogonMessage"),

    /**
     * LogonConfMessage
     */
    LOGON_CONF_MESSAGE(200, "LogonConfMessage"),

    /**
     * LogoutMessage
     */
    LOGOUT_MESSAGE(101, "LogoutMessage"),

    /**
     * LoggedOutMessage
     */
    LOGGED_OUT_MESSAGE(201, "LoggedOutMessage"),

    /**
     * HeartbeatMessage
     */
    HEARTBEAT_MESSAGE(10, "HeartbeatMessage"),

    /**
     * TestRequestMessage
     */
    TEST_REQUEST_MESSAGE(11, "TestRequestMessage"),

    /**
     * ResendRequestMessage
     */
    RESEND_REQUEST_MESSAGE(102, "ResendRequestMessage"),

    /**
     * GapFillMessage
     */
    GAP_FILL_MESSAGE(202, "GapFillMessage"),

    /**
     * RejectMessage
     */
    REJECT_MESSAGE(210, "RejectMessage");

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
            case 100 -> Optional.of(LOGON_MESSAGE);
            case 200 -> Optional.of(LOGON_CONF_MESSAGE);
            case 101 -> Optional.of(LOGOUT_MESSAGE);
            case 201 -> Optional.of(LOGGED_OUT_MESSAGE);
            case 10 -> Optional.of(HEARTBEAT_MESSAGE);
            case 11 -> Optional.of(TEST_REQUEST_MESSAGE);
            case 102 -> Optional.of(RESEND_REQUEST_MESSAGE);
            case 202 -> Optional.of(GAP_FILL_MESSAGE);
            case 210 -> Optional.of(REJECT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
