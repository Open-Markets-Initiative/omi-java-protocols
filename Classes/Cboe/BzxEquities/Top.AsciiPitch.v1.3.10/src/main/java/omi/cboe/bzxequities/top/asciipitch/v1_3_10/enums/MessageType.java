package omi.cboe.bzxequities.top.asciipitch.v1_3_10.enums;

import java.util.Optional;

/**
 * Single ASCII byte identifying this packet type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Logon Message
     */
    LOGON_MESSAGE('L', "Logon Message"),

    /**
     * Logon Rejected Message
     */
    LOGON_REJECTED_MESSAGE('J', "Logon Rejected Message"),

    /**
     * Sent for every second for which at least one message is being generated.
     */
    SECONDS_MESSAGE('T', "Sent for every second for which at least one message is being generated."),

    /**
     * Sent for every millisecond for which at least one message is being generated.
     */
    MILLISECONDS_MESSAGE('M', "Sent for every millisecond for which at least one message is being generated."),

    /**
     * Logon Accepted Message
     */
    LOGON_ACCEPTED_MESSAGE('C', "Logon Accepted Message"),

    /**
     * Expanded Spin Message
     */
    EXPANDED_SPIN_MESSAGE('s', "Expanded Spin Message"),

    /**
     * Extended Spin Message
     */
    EXTENDED_SPIN_MESSAGE('S', "Extended Spin Message"),

    /**
     * Spin Done Message
     */
    SPIN_DONE_MESSAGE('D', "Spin Done Message"),

    /**
     * Server Heartbeat Message
     */
    SERVER_HEARTBEAT_MESSAGE('H', "Server Heartbeat Message"),

    /**
     * Client Heartbeat Message
     */
    CLIENT_HEARTBEAT_MESSAGE('R', "Client Heartbeat Message"),

    /**
     * The Time Reference message is used to provide a midnight reference point for recipients of the feed. It is sent whenever the system starts up and when the system crosses a midnight boundary. All subsequent Timestamp values will use the last Midnight Reference until another Time Reference message is received. The Timestamp field will contain the offset from the Trade Date of the Time Reference message.
     */
    TIME_REFERENCE_MESSAGE('Z', "The Time Reference message is used to provide a midnight reference point for recipients of the feed. It is sent whenever the system starts up and when the system crosses a midnight boundary. All subsequent Timestamp values will use the last Midnight Reference until another Time Reference message is received. The Timestamp field will contain the offset from the Trade Date of the Time Reference message."),

    /**
     * Expanded Bid Update Message
     */
    EXPANDED_BID_UPDATE_MESSAGE('E', "Expanded Bid Update Message"),

    /**
     * Long Bid Update Message
     */
    LONG_BID_UPDATE_MESSAGE('B', "Long Bid Update Message"),

    /**
     * Short Bid Update Message
     */
    SHORT_BID_UPDATE_MESSAGE('b', "Short Bid Update Message"),

    /**
     * Extended Bid Update Message
     */
    EXTENDED_BID_UPDATE_MESSAGE('N', "Extended Bid Update Message"),

    /**
     * Expanded Ask Update Message
     */
    EXPANDED_ASK_UPDATE_MESSAGE('e', "Expanded Ask Update Message"),

    /**
     * Long Ask Update Message
     */
    LONG_ASK_UPDATE_MESSAGE('A', "Long Ask Update Message"),

    /**
     * Short Ask Update Message
     */
    SHORT_ASK_UPDATE_MESSAGE('a', "Short Ask Update Message"),

    /**
     * Extended Ask Update Message
     */
    EXTENDED_ASK_UPDATE_MESSAGE('n', "Extended Ask Update Message"),

    /**
     * Expanded Two-Sided Update Message
     */
    EXPANDED_TWO_SIDED_UPDATE_MESSAGE('F', "Expanded Two-Sided Update Message"),

    /**
     * Long Two-Sided Update Message
     */
    LONG_TWO_SIDED_UPDATE_MESSAGE('U', "Long Two-Sided Update Message"),

    /**
     * Short Two-Sided Update Message
     */
    SHORT_TWO_SIDED_UPDATE_MESSAGE('u', "Short Two-Sided Update Message"),

    /**
     * Extended Two-Sided Update Message
     */
    EXTENDED_TWO_SIDED_UPDATE_MESSAGE('d', "Extended Two-Sided Update Message"),

    /**
     * Expanded Trade Message
     */
    EXPANDED_TRADE_MESSAGE('f', "Expanded Trade Message"),

    /**
     * Long Trade Message
     */
    LONG_TRADE_MESSAGE('V', "Long Trade Message"),

    /**
     * Short Trade Message
     */
    SHORT_TRADE_MESSAGE('v', "Short Trade Message"),

    /**
     * Extended Trade Message
     */
    EXTENDED_TRADE_MESSAGE('r', "Extended Trade Message"),

    /**
     * The Trading Status Message is used to indicate the current trading status of a security.
     */
    TRADING_STATUS_MESSAGE('t', "The Trading Status Message is used to indicate the current trading status of a security.");

    private final char wire;

    private final String description;

    MessageType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<MessageType> fromWire(char wire) {
        return switch (wire) {
            case 'L' -> Optional.of(LOGON_MESSAGE);
            case 'J' -> Optional.of(LOGON_REJECTED_MESSAGE);
            case 'T' -> Optional.of(SECONDS_MESSAGE);
            case 'M' -> Optional.of(MILLISECONDS_MESSAGE);
            case 'C' -> Optional.of(LOGON_ACCEPTED_MESSAGE);
            case 's' -> Optional.of(EXPANDED_SPIN_MESSAGE);
            case 'S' -> Optional.of(EXTENDED_SPIN_MESSAGE);
            case 'D' -> Optional.of(SPIN_DONE_MESSAGE);
            case 'H' -> Optional.of(SERVER_HEARTBEAT_MESSAGE);
            case 'R' -> Optional.of(CLIENT_HEARTBEAT_MESSAGE);
            case 'Z' -> Optional.of(TIME_REFERENCE_MESSAGE);
            case 'E' -> Optional.of(EXPANDED_BID_UPDATE_MESSAGE);
            case 'B' -> Optional.of(LONG_BID_UPDATE_MESSAGE);
            case 'b' -> Optional.of(SHORT_BID_UPDATE_MESSAGE);
            case 'N' -> Optional.of(EXTENDED_BID_UPDATE_MESSAGE);
            case 'e' -> Optional.of(EXPANDED_ASK_UPDATE_MESSAGE);
            case 'A' -> Optional.of(LONG_ASK_UPDATE_MESSAGE);
            case 'a' -> Optional.of(SHORT_ASK_UPDATE_MESSAGE);
            case 'n' -> Optional.of(EXTENDED_ASK_UPDATE_MESSAGE);
            case 'F' -> Optional.of(EXPANDED_TWO_SIDED_UPDATE_MESSAGE);
            case 'U' -> Optional.of(LONG_TWO_SIDED_UPDATE_MESSAGE);
            case 'u' -> Optional.of(SHORT_TWO_SIDED_UPDATE_MESSAGE);
            case 'd' -> Optional.of(EXTENDED_TWO_SIDED_UPDATE_MESSAGE);
            case 'f' -> Optional.of(EXPANDED_TRADE_MESSAGE);
            case 'V' -> Optional.of(LONG_TRADE_MESSAGE);
            case 'v' -> Optional.of(SHORT_TRADE_MESSAGE);
            case 'r' -> Optional.of(EXTENDED_TRADE_MESSAGE);
            case 't' -> Optional.of(TRADING_STATUS_MESSAGE);
            default -> Optional.empty();
        };
    }
}
