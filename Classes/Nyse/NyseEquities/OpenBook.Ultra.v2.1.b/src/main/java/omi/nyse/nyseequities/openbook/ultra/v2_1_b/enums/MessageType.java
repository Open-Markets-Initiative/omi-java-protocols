package omi.nyse.nyseequities.openbook.ultra.v2_1_b.enums;

import java.util.Optional;

/**
 * This field identifies the type of message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * This message is sent to reset the Packet Sequence Number.
     */
    SEQUENCE_NUMBER_RESET_MESSAGE(1, "This message is sent to reset the Packet Sequence Number."),

    /**
     * Ultra heartbeat message.
     */
    HEARTBEAT_MESSAGE(2, "Ultra heartbeat message."),

    /**
     * This message will be sent over the Retransmission multicast channels to inform the clients of unavailability of a range of messages for which they have requested a retransmission.
     */
    UNAVAILABLE_MESSAGE(5, "This message will be sent over the Retransmission multicast channels to inform the clients of unavailability of a range of messages for which they have requested a retransmission."),

    /**
     * This message will be sent immediately via TCP/IP in response to the client's request for a retransmission, refresh, or Symbol Index information. The requested information will follow in the appropriate retransmission or refresh channel.
     */
    REQUEST_RESPONSE_MESSAGE(10, "This message will be sent immediately via TCP/IP in response to the client's request for a retransmission, refresh, or Symbol Index information. The requested information will follow in the appropriate retransmission or refresh channel."),

    /**
     * Heartbeat Subscription message.
     */
    HEARTBEAT_SUBSCRIPTION_MESSAGE(19, "Heartbeat Subscription message."),

    /**
     * This message is sent by clients to request a retransmission of missed packets. In response, a Request Response message (type 10) will be sent back over the Request TCP connection, and the retransmitted packets will be delivered over the Retransmission channels.
     */
    RETRANSMISSION_REQUEST_MESSAGE(20, "This message is sent by clients to request a retransmission of missed packets. In response, a Request Response message (type 10) will be sent back over the Request TCP connection, and the retransmitted packets will be delivered over the Retransmission channels."),

    /**
     * This message is sent by clients requesting a full book refresh.
     */
    BOOK_REFRESH_REQUEST_MESSAGE(22, "This message is sent by clients requesting a full book refresh."),

    /**
     * Clients that remain connected to the Request server intraday must respond within 120 seconds to any heartbeat received with a single message of this type in its own packet. This response demonstrates that the TCP connection is still alive and prevents the Request Server from closing the connection.
     */
    HEARTBEAT_RESPONSE_MESSAGE(24, "Clients that remain connected to the Request server intraday must respond within 120 seconds to any heartbeat received with a single message of this type in its own packet. This response demonstrates that the TCP connection is still alive and prevents the Request Server from closing the connection."),

    /**
     * The Extended Book Refresh Request message allows the client to request a refresh by symbol index as opposed to symbol, and to request a refresh of all symbols in a channel.
     */
    EXTENDED_BOOK_REFRESH_REQUEST_MESSAGE(27, "The Extended Book Refresh Request message allows the client to request a refresh by symbol index as opposed to symbol, and to request a refresh of all symbols in a channel."),

    /**
     * This message is sent by clients requesting a refresh of Symbol Index mapping information only.
     */
    SYMBOL_INDEX_MAPPING_REQUEST_MESSAGE(34, "This message is sent by clients requesting a refresh of Symbol Index mapping information only."),

    /**
     * This message is sent by the NYSE in response to a Symbol Index Request. When requesting Symbol Index Mapping, the request must be sent to the symbol's corresponding channel, otherwise it will not be honored.
     */
    SYMBOL_INDEX_MAPPING_RESPONSE_MESSAGE(35, "This message is sent by the NYSE in response to a Symbol Index Request. When requesting Symbol Index Mapping, the request must be sent to the symbol's corresponding channel, otherwise it will not be honored."),

    /**
     * This message contains the complete order book for a single symbol, with all price points, an aggregated quantity at each price point and symbol mapping information.
     */
    FULL_UPDATE_MESSAGE(230, "This message contains the complete order book for a single symbol, with all price points, an aggregated quantity at each price point and symbol mapping information."),

    /**
     * A Delta Update message is published in response to events that occur in the book such as interest being added, executions, cancellations and interest routed to a different market.
     */
    DELTA_UPDATE_MESSAGE(231, "A Delta Update message is published in response to events that occur in the book such as interest being added, executions, cancellations and interest routed to a different market.");

    private final int wire;

    private final String description;

    MessageType(int wire, String description) {
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
    public static Optional<MessageType> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(SEQUENCE_NUMBER_RESET_MESSAGE);
            case 2 -> Optional.of(HEARTBEAT_MESSAGE);
            case 5 -> Optional.of(UNAVAILABLE_MESSAGE);
            case 10 -> Optional.of(REQUEST_RESPONSE_MESSAGE);
            case 19 -> Optional.of(HEARTBEAT_SUBSCRIPTION_MESSAGE);
            case 20 -> Optional.of(RETRANSMISSION_REQUEST_MESSAGE);
            case 22 -> Optional.of(BOOK_REFRESH_REQUEST_MESSAGE);
            case 24 -> Optional.of(HEARTBEAT_RESPONSE_MESSAGE);
            case 27 -> Optional.of(EXTENDED_BOOK_REFRESH_REQUEST_MESSAGE);
            case 34 -> Optional.of(SYMBOL_INDEX_MAPPING_REQUEST_MESSAGE);
            case 35 -> Optional.of(SYMBOL_INDEX_MAPPING_RESPONSE_MESSAGE);
            case 230 -> Optional.of(FULL_UPDATE_MESSAGE);
            case 231 -> Optional.of(DELTA_UPDATE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
