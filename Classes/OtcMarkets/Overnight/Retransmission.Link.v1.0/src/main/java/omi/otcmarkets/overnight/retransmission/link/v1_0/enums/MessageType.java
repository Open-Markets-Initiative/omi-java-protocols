package omi.otcmarkets.overnight.retransmission.link.v1_0.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Appears within the TCP spin response cycle (between Spin Response 'S' and 'E') and also on the UDP multicast feeds at the daily spin-out. Indicates the beginning of a spin message cycle.
     */
    START_OF_SPIN_MESSAGE((short) 11, "Appears within the TCP spin response cycle (between Spin Response 'S' and 'E') and also on the UDP multicast feeds at the daily spin-out. Indicates the beginning of a spin message cycle."),

    /**
     * Appears within the TCP spin response cycle (between Spin Response 'S' and 'E') and also on the UDP multicast feeds at the daily spin-out. Indicates the end of a spin message cycle.
     */
    END_OF_SPIN_MESSAGE((short) 12, "Appears within the TCP spin response cycle (between Spin Response 'S' and 'E') and also on the UDP multicast feeds at the daily spin-out. Indicates the end of a spin message cycle."),

    /**
     * Appears in the TCP spin response payload (and on all UDP channels). Sent at the start of each Overnight OTC IDQS trading session: Order Acceptance at 7:00 PM, Market Open at 8:00 PM, Market Close at 7:45 AM.
     */
    TRADING_SESSION_MESSAGE((short) 20, "Appears in the TCP spin response payload (and on all UDP channels). Sent at the start of each Overnight OTC IDQS trading session: Order Acceptance at 7:00 PM, Market Open at 8:00 PM, Market Close at 7:45 AM."),

    /**
     * Appears in the TCP spin response payload (and on all UDP channels). Provides basic security attribute information for all OTC equity securities.
     */
    SECURITY_MESSAGE((short) 9, "Appears in the TCP spin response payload (and on all UDP channels). Provides basic security attribute information for all OTC equity securities."),

    /**
     * Appears in the TCP spin response payload during DOB replay. Indicates a new order added to the book.
     */
    ORDER_ADD_MESSAGE((short) 21, "Appears in the TCP spin response payload during DOB replay. Indicates a new order added to the book."),

    /**
     * Appears in the TCP spin response payload during DOB replay. Indicates an existing order has been modified.
     */
    ORDER_UPDATE_MESSAGE((short) 22, "Appears in the TCP spin response payload during DOB replay. Indicates an existing order has been modified."),

    /**
     * Appears in the TCP spin response payload during DOB replay. Indicates an existing order has been deleted from the book.
     */
    ORDER_DELETE_MESSAGE((short) 23, "Appears in the TCP spin response payload during DOB replay. Indicates an existing order has been deleted from the book."),

    /**
     * Appears in the TCP spin response payload during DOB replay. Published when all or some of the displayed quantity of a previously published order executes at the published price.
     */
    ORDER_EXECUTION_MESSAGE((short) 24, "Appears in the TCP spin response payload during DOB replay. Published when all or some of the displayed quantity of a previously published order executes at the published price."),

    /**
     * Appears in the TCP spin response payload during DOB replay. Published when all or some of the displayed quantity of a previously published order executes at a price different than the published price.
     */
    ORDER_EXECUTION_WITH_PRICE_MESSAGE((short) 25, "Appears in the TCP spin response payload during DOB replay. Published when all or some of the displayed quantity of a previously published order executes at a price different than the published price."),

    /**
     * Appears in the TCP spin response payload during DOB replay. Published when non-displayed quantity of a previously published reserve order executes or when an order executes that is less than Min Quote Size and does not currently have an active Order Add message.
     */
    TRADE_MESSAGE((short) 26, "Appears in the TCP spin response payload during DOB replay. Published when non-displayed quantity of a previously published reserve order executes or when an order executes that is less than Min Quote Size and does not currently have an active Order Add message."),

    /**
     * Appears in the TCP spin response payload during TOB replay. Provides best bid and offer aggregated top-of-book.
     */
    TOP_OF_BOOK_MESSAGE((short) 27, "Appears in the TCP spin response payload during TOB replay. Provides best bid and offer aggregated top-of-book."),

    /**
     * Appears in the TCP spin response payload. Not available in the Overnight TradingSession.
     */
    IMBALANCE_MESSAGE((short) 28, "Appears in the TCP spin response payload. Not available in the Overnight TradingSession."),

    /**
     * System Recovery event. The first event (type 'S') instructs clients to prepare and reset caches; clients must clean all cached state. A second event (type 'B') indicates recovery begins, after which the system performs a spin for all symbols and open orders.
     */
    SYSTEM_RECOVERY_EVENT_MESSAGE((short) 74, "System Recovery event. The first event (type 'S') instructs clients to prepare and reset caches; clients must clean all cached state. A second event (type 'B') indicates recovery begins, after which the system performs a spin for all symbols and open orders."),

    /**
     * "l" (lowercase L). Logon message is the first message required to send to the server once a connection is established. At minimum, the firm and user id should be provided.
     */
    LOGIN_REQUEST_MESSAGE((short) 108, "\"l\" (lowercase L). Logon message is the first message required to send to the server once a connection is established. At minimum, the firm and user id should be provided."),

    /**
     * "a". The Login Response Message is sent to a client's response to a TCP/IP Login Message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the TCP/IP connection will be dropped.
     */
    LOGIN_RESPONSE_MESSAGE((short) 97, "\"a\". The Login Response Message is sent to a client's response to a TCP/IP Login Message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the TCP/IP connection will be dropped."),

    /**
     * "r". Request retransmission of a range of messages.
     */
    RETRANSMISSION_REQUEST_MESSAGE((short) 114, "\"r\". Request retransmission of a range of messages."),

    /**
     * "b". Response to a Retransmission Request. The replay server sends a heartbeat message every second. If the server replay response to a request takes too much time, then it is up to the client to either wait for a few heartbeats, or arbitrary time, then disconnect and send another replay request.
     */
    RETRANSMISSION_RESPONSE_MESSAGE((short) 98, "\"b\". Response to a Retransmission Request. The replay server sends a heartbeat message every second. If the server replay response to a request takes too much time, then it is up to the client to either wait for a few heartbeats, or arbitrary time, then disconnect and send another replay request."),

    /**
     * "s". Request a refresh spin of state from the server.
     */
    SPIN_REQUEST_MESSAGE((short) 115, "\"s\". Request a refresh spin of state from the server."),

    /**
     * "c". The server will send a Spin Response ("c") with status Start of Spin ("S"). It will then transmit Trading Session, Security, Orders or TOB, etc., followed by another Spin Response ("c") with status End of Spin ("E"). Ignore any Heartbeat messages. Spin messages are always returned to the same TCP socket from where they originated.
     */
    SPIN_RESPONSE_MESSAGE((short) 99, "\"c\". The server will send a Spin Response (\"c\") with status Start of Spin (\"S\"). It will then transmit Trading Session, Security, Orders or TOB, etc., followed by another Spin Response (\"c\") with status End of Spin (\"E\"). Ignore any Heartbeat messages. Spin messages are always returned to the same TCP socket from where they originated."),

    /**
     * "t". Request an enhanced spin which includes a last-sequence-number marker for syncing real time data.
     */
    ENHANCED_SPIN_REQUEST_MESSAGE((short) 116, "\"t\". Request an enhanced spin which includes a last-sequence-number marker for syncing real time data."),

    /**
     * "d". The server will send an Enhanced Spin Response ("d") with status Start of Spin ("S"). It will then transmit Trading Session, Security, Orders or TOB, etc., followed by another Enhanced Spin Response ("d") with status End of Spin ("E"). Ignore any Heartbeat messages. Spin messages are always returned to the same TCP socket from where they originated.
     */
    ENHANCED_SPIN_RESPONSE_MESSAGE((short) 100, "\"d\". The server will send an Enhanced Spin Response (\"d\") with status Start of Spin (\"S\"). It will then transmit Trading Session, Security, Orders or TOB, etc., followed by another Enhanced Spin Response (\"d\") with status End of Spin (\"E\"). Ignore any Heartbeat messages. Spin messages are always returned to the same TCP socket from where they originated."),

    /**
     * "h". After login successful, FI will send a client a heartbeat once every 60 seconds. If there is no heartbeat from client for more than 5 minutes, system will disconnect.
     */
    HEARTBEAT_MESSAGE((short) 104, "\"h\". After login successful, FI will send a client a heartbeat once every 60 seconds. If there is no heartbeat from client for more than 5 minutes, system will disconnect.");

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
            case 11 -> Optional.of(START_OF_SPIN_MESSAGE);
            case 12 -> Optional.of(END_OF_SPIN_MESSAGE);
            case 20 -> Optional.of(TRADING_SESSION_MESSAGE);
            case 9 -> Optional.of(SECURITY_MESSAGE);
            case 21 -> Optional.of(ORDER_ADD_MESSAGE);
            case 22 -> Optional.of(ORDER_UPDATE_MESSAGE);
            case 23 -> Optional.of(ORDER_DELETE_MESSAGE);
            case 24 -> Optional.of(ORDER_EXECUTION_MESSAGE);
            case 25 -> Optional.of(ORDER_EXECUTION_WITH_PRICE_MESSAGE);
            case 26 -> Optional.of(TRADE_MESSAGE);
            case 27 -> Optional.of(TOP_OF_BOOK_MESSAGE);
            case 28 -> Optional.of(IMBALANCE_MESSAGE);
            case 74 -> Optional.of(SYSTEM_RECOVERY_EVENT_MESSAGE);
            case 108 -> Optional.of(LOGIN_REQUEST_MESSAGE);
            case 97 -> Optional.of(LOGIN_RESPONSE_MESSAGE);
            case 114 -> Optional.of(RETRANSMISSION_REQUEST_MESSAGE);
            case 98 -> Optional.of(RETRANSMISSION_RESPONSE_MESSAGE);
            case 115 -> Optional.of(SPIN_REQUEST_MESSAGE);
            case 99 -> Optional.of(SPIN_RESPONSE_MESSAGE);
            case 116 -> Optional.of(ENHANCED_SPIN_REQUEST_MESSAGE);
            case 100 -> Optional.of(ENHANCED_SPIN_RESPONSE_MESSAGE);
            case 104 -> Optional.of(HEARTBEAT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
