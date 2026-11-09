package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.enums;

import java.util.Optional;

/**
 * Alpha character indicating the type of message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Sent to indicate a successful login. Carries the current version of the Nyse ArcaBook protocol.
     */
    LOGIN_ACCEPTED_MESSAGE('Q', "Sent to indicate a successful login. Carries the current version of the Nyse ArcaBook protocol."),

    /**
     * Sent when login fails authentication, the client does not log in within 5 seconds, no order data feed was subscribed to, the sequence number was invalid, no connections are available, or a timeout occurred. The socket is closed afterwards.
     */
    LOGIN_REJECTED_MESSAGE('R', "Sent when login fails authentication, the client does not log in within 5 seconds, no order data feed was subscribed to, the sequence number was invalid, no connections are available, or a timeout occurred. The socket is closed afterwards."),

    /**
     * Sent every 60 seconds during periods of client inactivity, so that firewalls do not time the connection out. The client must answer with a Heartbeat Response. There is no message body, and the header length is always zero.
     */
    HEARTBEAT_MESSAGE('H', "Sent every 60 seconds during periods of client inactivity, so that firewalls do not time the connection out. The client must answer with a Heartbeat Response. There is no message body, and the header length is always zero."),

    /**
     * Sent in response to a Test Request, echoing back any text the request carried.
     */
    TEST_RESPONSE_MESSAGE('S', "Sent in response to a Test Request, echoing back any text the request carried."),

    /**
     * Sent for a new open order. The Order Reference Number is unique per order book, while the Sequence Number is unique across all order books.
     */
    ADD_ORDER_MESSAGE('N', "Sent for a new open order. The Order Reference Number is unique per order book, while the Sequence Number is unique across all order books."),

    /**
     * Sent when an order in a Nyse Bonds book is modified: its price or size changes, it is partially filled, or it is routed away with shares remaining. The Order Reference Number refers to the original Add Order.
     */
    MODIFY_ORDER_MESSAGE('C', "Sent when an order in a Nyse Bonds book is modified: its price or size changes, it is partially filled, or it is routed away with shares remaining. The Order Reference Number refers to the original Add Order."),

    /**
     * Sent when an order is taken off the open order book because it was cancelled, expired, routed to an away market, or filled.
     */
    DELETE_ORDER_MESSAGE('K', "Sent when an order is taken off the open order book because it was cancelled, expired, routed to an away market, or filled."),

    /**
     * Sent in response to orders submitted during pending auctions, at the conclusion of the Opening, Market Order and Closing Auctions, and for Halt Auctions. Total and market imbalance volumes are negative for a sell imbalance.
     */
    IMBALANCE_MESSAGE('W', "Sent in response to orders submitted during pending auctions, at the conclusion of the Opening, Market Order and Closing Auctions, and for Halt Auctions. Total and market imbalance volumes are negative for a sell imbalance."),

    /**
     * Sent to indicate a special system event to an order book. The Event Code says what happened and the System Code which book is affected. Also carries the next sequence number subscribers should expect, which is generally the current one plus one but may restart at 1.
     */
    SYSTEM_EVENT_MESSAGE('Y', "Sent to indicate a special system event to an order book. The Event Code says what happened and the System Code which book is affected. Also carries the next sequence number subscribers should expect, which is generally the current one plus one but may restart at 1.");

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
            case 'Q' -> Optional.of(LOGIN_ACCEPTED_MESSAGE);
            case 'R' -> Optional.of(LOGIN_REJECTED_MESSAGE);
            case 'H' -> Optional.of(HEARTBEAT_MESSAGE);
            case 'S' -> Optional.of(TEST_RESPONSE_MESSAGE);
            case 'N' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'C' -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 'K' -> Optional.of(DELETE_ORDER_MESSAGE);
            case 'W' -> Optional.of(IMBALANCE_MESSAGE);
            case 'Y' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
