package omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.enums;

import java.util.Optional;

/**
 * Return message type for which the bitfields are being specified (e.g., 0x30 for a Trade Cap- ture Report Acknowledgment V2 mes- sage)
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Login Request V2 Message.
     */
    LOGIN_REQUEST_V2_MESSAGE((short) 55, "Login Request V2 Message."),

    /**
     * Logout Request Message.
     */
    LOGOUT_REQUEST_MESSAGE((short) 2, "Logout Request Message."),

    /**
     * Client Heartbeat Message.
     */
    CLIENT_HEARTBEAT_MESSAGE((short) 3, "Client Heartbeat Message."),

    /**
     * Login Response V2 Message.
     */
    LOGIN_RESPONSE_V2_MESSAGE((short) 36, "Login Response V2 Message."),

    /**
     * Logout Message.
     */
    LOGOUT_MESSAGE((short) 8, "Logout Message."),

    /**
     * Server Heartbeat Message.
     */
    SERVER_HEARTBEAT_MESSAGE((short) 9, "Server Heartbeat Message."),

    /**
     * Replay Complete Message.
     */
    REPLAY_COMPLETE_MESSAGE((short) 19, "Replay Complete Message."),

    /**
     * Trade Capture Report V2 Message.
     */
    TRADE_CAPTURE_REPORT_V2_MESSAGE((short) 60, "Trade Capture Report V2 Message."),

    /**
     * Quote V2 Message.
     */
    QUOTE_V2_MESSAGE((short) 61, "Quote V2 Message."),

    /**
     * Quote Cancel V2 Message.
     */
    QUOTE_CANCEL_V2_MESSAGE((short) 62, "Quote Cancel V2 Message."),

    /**
     * Trade Capture Report Acknowledgment V2 Message.
     */
    TRADE_CAPTURE_REPORT_ACKNOWLEDGMENT_V2_MESSAGE((short) 48, "Trade Capture Report Acknowledgment V2 Message."),

    /**
     * Trade Capture Report Reject V2 Message.
     */
    TRADE_CAPTURE_REPORT_REJECT_V2_MESSAGE((short) 49, "Trade Capture Report Reject V2 Message."),

    /**
     * Trade Capture Confirm V2 Message.
     */
    TRADE_CAPTURE_CONFIRM_V2_MESSAGE((short) 50, "Trade Capture Confirm V2 Message."),

    /**
     * Trade Capture Report Decline V2 Message.
     */
    TRADE_CAPTURE_REPORT_DECLINE_V2_MESSAGE((short) 51, "Trade Capture Report Decline V2 Message."),

    /**
     * Quote Status V2 Message.
     */
    QUOTE_STATUS_V2_MESSAGE((short) 63, "Quote Status V2 Message."),

    /**
     * Quote Reject V2 Message.
     */
    QUOTE_REJECT_V2_MESSAGE((short) 64, "Quote Reject V2 Message.");

    private final short wire;

    private final String description;

    MessageType(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<MessageType> fromWire(short wire) {
        return switch (wire) {
            case 55 -> Optional.of(LOGIN_REQUEST_V2_MESSAGE);
            case 2 -> Optional.of(LOGOUT_REQUEST_MESSAGE);
            case 3 -> Optional.of(CLIENT_HEARTBEAT_MESSAGE);
            case 36 -> Optional.of(LOGIN_RESPONSE_V2_MESSAGE);
            case 8 -> Optional.of(LOGOUT_MESSAGE);
            case 9 -> Optional.of(SERVER_HEARTBEAT_MESSAGE);
            case 19 -> Optional.of(REPLAY_COMPLETE_MESSAGE);
            case 60 -> Optional.of(TRADE_CAPTURE_REPORT_V2_MESSAGE);
            case 61 -> Optional.of(QUOTE_V2_MESSAGE);
            case 62 -> Optional.of(QUOTE_CANCEL_V2_MESSAGE);
            case 48 -> Optional.of(TRADE_CAPTURE_REPORT_ACKNOWLEDGMENT_V2_MESSAGE);
            case 49 -> Optional.of(TRADE_CAPTURE_REPORT_REJECT_V2_MESSAGE);
            case 50 -> Optional.of(TRADE_CAPTURE_CONFIRM_V2_MESSAGE);
            case 51 -> Optional.of(TRADE_CAPTURE_REPORT_DECLINE_V2_MESSAGE);
            case 63 -> Optional.of(QUOTE_STATUS_V2_MESSAGE);
            case 64 -> Optional.of(QUOTE_REJECT_V2_MESSAGE);
            default -> Optional.empty();
        };
    }
}
